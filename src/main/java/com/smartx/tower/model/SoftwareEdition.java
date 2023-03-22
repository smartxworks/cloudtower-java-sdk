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
 * Gets or Sets SoftwareEdition
 */
@JsonAdapter(SoftwareEdition.Adapter.class)
public enum SoftwareEdition {
  
  COMMUNITY("COMMUNITY"),
  
  ENTERPRISE("ENTERPRISE"),
  
  ENTERPRISE_PLUS("ENTERPRISE_PLUS"),
  
  ESSENTIAL("ESSENTIAL"),
  
  EXPRESS("EXPRESS"),
  
  STANDARD("STANDARD"),
  
  TRIAL("TRIAL");

  private String value;

  SoftwareEdition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SoftwareEdition fromValue(String value) {
    for (SoftwareEdition b : SoftwareEdition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SoftwareEdition> {
    @Override
    public void write(final JsonWriter jsonWriter, final SoftwareEdition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SoftwareEdition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SoftwareEdition.fromValue(value);
    }
  }
}

