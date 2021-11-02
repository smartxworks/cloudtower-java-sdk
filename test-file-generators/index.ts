import fs from "fs";
import path from "path";
import ejs from "ejs";
import { parse, ClassBodyDeclarationContext } from "java-ast";
import log from "loglevel";

const mapFunctionOrder = (name: string) => {
  const f3 = name.slice(0, 3);
  const f6 = name.slice(0, 6);

  if (f3 === "get") {
    return -5;
  } else if (f6 === "update") {
    return 0;
  } else if (f6 === "delete") {
    return 10;
  } else if (f6 === "create") {
    return -1;
  }
  return 1;
};

const template = fs.readFileSync("it.okhttp3-gson.template.ejs").toString();

const debug = !!~process.argv.indexOf("--debug");

log.setLevel(debug ? "trace" : "warn");

const apiFolder = path.resolve(
  __dirname,
  `../cloudtower-java-sdk-okhttp-gson/src/main/java/com/smartx/tower/api`
);

const distFolder = debug
  ? path.resolve(__dirname, "target")
  : path.resolve(
      __dirname,
      `../cloudtower-java-sdk-okhttp-gson/src/test/java/com/smartx/tower/integration`
    );

if (!fs.existsSync(distFolder)) {
  fs.mkdirSync(distFolder);
}

for (const file of fs.readdirSync(apiFolder)) {
  log.info(`start to generate ${file} integration test`);
  const name = file.slice(0, -8);
  const targetFile = path.resolve(__dirname, distFolder, `IT${name}.java`);
  if (fs.existsSync(targetFile)) {
    log.warn(`exist file ${name}, skipped`);
    continue;
  }
  const ast = parse(fs.readFileSync(path.resolve(apiFolder, file)).toString());
  // the second last node is api class declaration, ignore its modifier, read its body
  const functions = [];
  if (ast.children && ast.childCount) {
    const body = ast.children[ast.children.length - 2].getChild(1).getChild(2);
    for (let i = 0; i < body.childCount; i++) {
      const node = body.getChild(i);
      if (node instanceof ClassBodyDeclarationContext) {
        // not to check other node
        if (node.childCount === 3) {
          const functionToTest = body
            .getChild(++i)
            .getChild(1)
            .getChild(0);
          log.info(`get function ${functionToTest.getChild(1).text}`);
          const funcArgs = {
            name: functionToTest.getChild(1).text,
            return: functionToTest.getChild(0).text,
            payload: functionToTest
              .getChild(2)
              .getChild(1)
              .getChild(2)
              .getChild(0).text,
            payloadClass: functionToTest
              .getChild(2)
              .getChild(1)
              .getChild(2)
              .getChild(0).text,
          };
          if (/.+<.+>/.test(funcArgs.payload)) {
            funcArgs["payloadClass"] = funcArgs.payload.slice(
              0,
              funcArgs.payload.indexOf("<")
            );
          }
          functions.push(funcArgs);
        }
      }
    }
  } else {
    log.warn(`unsupported file, no ast tree founded`);
  }
  functions.sort((a, b) => {
    return mapFunctionOrder(a.name) - mapFunctionOrder(b.name);
  });
  fs.writeFile(
    targetFile,
    ejs.render(template, {
      api: {
        name,
        seperate: name
          .replace(/[A-Z]/g, (c) => " " + c[0].toLowerCase())
          .slice(1),
      },
      functions,
    }),
    () => {
      log.info(`finished generating ${file} integration test`);
    }
  );
}
