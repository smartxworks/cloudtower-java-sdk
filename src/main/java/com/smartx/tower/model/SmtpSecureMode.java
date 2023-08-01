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
 * Gets or Sets SmtpSecureMode
 */
@JsonAdapter(SmtpSecureMode.Adapter.class)
public enum SmtpSecureMode {
  
  SSL("SSL"),
  
  STARTTLS("STARTTLS"),
  
  UNSPECIFIED("UNSPECIFIED");

  private String value;

  SmtpSecureMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SmtpSecureMode fromValue(String value) {
    for (SmtpSecureMode b : SmtpSecureMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SmtpSecureMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final SmtpSecureMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SmtpSecureMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SmtpSecureMode.fromValue(value);
    }
  }
}

