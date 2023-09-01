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
 * Gets or Sets BitUnit
 */
@JsonAdapter(BitUnit.Adapter.class)
public enum BitUnit {
  
  BIT("bit"),
  
  KB("Kb"),
  
  MB("Mb"),
  
  GB("Gb"),
  
  TB("Tb"),
  
  PB("Pb");

  private String value;

  BitUnit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BitUnit fromValue(String value) {
    for (BitUnit b : BitUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BitUnit> {
    @Override
    public void write(final JsonWriter jsonWriter, final BitUnit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BitUnit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BitUnit.fromValue(value);
    }
  }
}

