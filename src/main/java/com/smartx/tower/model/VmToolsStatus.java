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
 * Gets or Sets VmToolsStatus
 */
@JsonAdapter(VmToolsStatus.Adapter.class)
public enum VmToolsStatus {
  
  NOT_INSTALLED("NOT_INSTALLED"),
  
  NOT_RUNNING("NOT_RUNNING"),
  
  RESTRICTION("RESTRICTION"),
  
  RUNNING("RUNNING");

  private String value;

  VmToolsStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VmToolsStatus fromValue(String value) {
    for (VmToolsStatus b : VmToolsStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VmToolsStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final VmToolsStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VmToolsStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VmToolsStatus.fromValue(value);
    }
  }
}

