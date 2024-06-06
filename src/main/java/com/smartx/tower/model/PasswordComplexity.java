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
 * Gets or Sets PasswordComplexity
 */
@JsonAdapter(PasswordComplexity.Adapter.class)
public enum PasswordComplexity {
  
  HIGH("HIGH"),
  
  LOW("LOW"),
  
  MIDDLE("MIDDLE"),
  
  PASSWORDCOMPLEXITY_UNSUPPORTED_ENUM("PASSWORDCOMPLEXITY_UNSUPPORTED_ENUM");
  private String value;

  PasswordComplexity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PasswordComplexity fromValue(String value) {
    for (PasswordComplexity b : PasswordComplexity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return PasswordComplexity.PASSWORDCOMPLEXITY_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<PasswordComplexity> {
    @Override
    public void write(final JsonWriter jsonWriter, final PasswordComplexity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PasswordComplexity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PasswordComplexity.fromValue(value);
    }
  }
}

