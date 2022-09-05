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
 * Gets or Sets SnmpProtocol
 */
@JsonAdapter(SnmpProtocol.Adapter.class)
public enum SnmpProtocol {
  
  TCP("TCP"),
  
  UDP("UDP");

  private String value;

  SnmpProtocol(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SnmpProtocol fromValue(String value) {
    for (SnmpProtocol b : SnmpProtocol.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SnmpProtocol> {
    @Override
    public void write(final JsonWriter jsonWriter, final SnmpProtocol enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SnmpProtocol read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SnmpProtocol.fromValue(value);
    }
  }
}

