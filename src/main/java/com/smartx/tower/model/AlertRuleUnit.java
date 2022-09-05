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
 * Gets or Sets AlertRuleUnit
 */
@JsonAdapter(AlertRuleUnit.Adapter.class)
public enum AlertRuleUnit {
  
  BIT("BIT"),
  
  BYTE("BYTE"),
  
  BYTE_PER_SECOND("BYTE_PER_SECOND"),
  
  CELSIUS("CELSIUS"),
  
  HERTZ("HERTZ"),
  
  NANOSECOND("NANOSECOND"),
  
  PERCENT("PERCENT"),
  
  SECOND("SECOND"),
  
  UNIT_UNSPECIFIED("UNIT_UNSPECIFIED");

  private String value;

  AlertRuleUnit(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AlertRuleUnit fromValue(String value) {
    for (AlertRuleUnit b : AlertRuleUnit.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AlertRuleUnit> {
    @Override
    public void write(final JsonWriter jsonWriter, final AlertRuleUnit enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AlertRuleUnit read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AlertRuleUnit.fromValue(value);
    }
  }
}

