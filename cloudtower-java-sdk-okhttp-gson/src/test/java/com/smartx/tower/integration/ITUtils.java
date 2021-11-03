package com.smartx.tower.integration;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ITUtils {
  public static String readInputStream(InputStream stream) throws IOException {
    return readInputStream(stream, "UTF-8");
  }

  public static String readInputStream(InputStream stream, String charset) throws IOException {
    BufferedInputStream bis = new BufferedInputStream(stream);
    ByteArrayOutputStream buf = new ByteArrayOutputStream();
    for (int result = bis.read(); result != -1; result = bis.read()) {
      buf.write((byte) result);
    }
    return buf.toString(charset);
  }
}
