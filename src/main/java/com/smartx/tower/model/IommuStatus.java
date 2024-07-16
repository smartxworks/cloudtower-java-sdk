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
 * Gets or Sets IommuStatus
 */
@JsonAdapter(IommuStatus.Adapter.class)
public enum IommuStatus {
  
  DISABLE("DISABLE"),
  
  ENABLE("ENABLE"),
  
  NEED_REBOOT("NEED_REBOOT"),
  
  IOMMUSTATUS_UNSUPPORTED_ENUM("IOMMUSTATUS_UNSUPPORTED_ENUM");
  private String value;

  IommuStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IommuStatus fromValue(String value) {
    for (IommuStatus b : IommuStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return IommuStatus.IOMMUSTATUS_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<IommuStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final IommuStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IommuStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IommuStatus.fromValue(value);
    }
  }
}

