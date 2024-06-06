package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ContentLanguage
 */
@JsonAdapter(ContentLanguage.Adapter.class)
public enum ContentLanguage {
  
  ZH_CN("zh-CN"),
  
  EN_US("en-US"),
  
  CONTENTLANGUAGE_UNSUPPORTED_ENUM("CONTENTLANGUAGE_UNSUPPORTED_ENUM");
  private String value;

  ContentLanguage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContentLanguage fromValue(String value) {
    for (ContentLanguage b : ContentLanguage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return ContentLanguage.CONTENTLANGUAGE_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<ContentLanguage> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContentLanguage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ContentLanguage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContentLanguage.fromValue(value);
    }
  }
}

