## 文件上传

CloudTower 的文件上传需要首先创建一个上传任务，然后使用 Api 分片上传文件，分片大小为 8MB，SDK 简化了上传步骤，将上传类资源的分片上传和创建上传任务整合为同一个 api，这里以上传虚拟机工具镜像为例。

```java
package com.smartx.tower;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import com.smartx.tower.api.SvtImageApi;
import com.smartx.tower.model.*;

public class App {

  public static int CHUNK_SIZE = 8 * 1024 * 1024;
  public static String END_POINT = "http://api-test.dev-cloudtower.smartx.com";

  public static void main(String[] args) throws ApiException, IOException {
    ApiClient client = new ApiClient();
    client.setBasePath(String.format("%s/v2/api", END_POINT));
    // client.setBasePath("http://localhost:8090");
    ClientUtil.login("root", "HC!r0cks", client);
    client.setReadTimeout(0).setConnectTimeout(0).setWriteTimeout(0);
    client.setVerifyingSsl(false);
    try {
      uploadSVTImageByOapi(client,
          Path.of("D:\\SMTX_VMTOOLS_2_12_1_20210521153518.iso"),
          "cl3kursoo2pxm0858veopm4qs");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void uploadSVTImageByOapi(ApiClient client, Path path, String clusterId)
      throws IOException, ApiException {
    File file = path.toFile();
    BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file));
    String version = IsoUtil.getSvtIsoVersion(file);
    SvtImageApi api = new SvtImageApi(client);
    byte[] bytes = new byte[CHUNK_SIZE];
    int read = stream.read(bytes, 0, CHUNK_SIZE);
    if (read == -1) {
      stream.close();
      return;
    }
    List<UploadTask> response = api.uploadSvtImage(bytes, clusterId, file.getName(),
        String.valueOf(file.length()), version, "");
    String uploadTaskId = response.get(0).getId();
    bytes = new byte[CHUNK_SIZE];
    read = stream.read(bytes, 0, CHUNK_SIZE);
    while (read != -1) {
      api.uploadSvtImage(bytes, clusterId, file.getName(),
          String.valueOf(file.length()), version, uploadTaskId);
      bytes = new byte[CHUNK_SIZE];
      read = stream.read(bytes, 0, CHUNK_SIZE);
    }
    stream.close();
  }

}
```
