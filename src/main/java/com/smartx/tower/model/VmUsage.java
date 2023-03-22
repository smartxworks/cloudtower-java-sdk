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
 * Gets or Sets VmUsage
 */
@JsonAdapter(VmUsage.Adapter.class)
public enum VmUsage {
  
  ADVANCED_MONITORING("ADVANCED_MONITORING"),
  
  BACKUP_CONTROLLER("BACKUP_CONTROLLER"),
  
  BUNDLE_APPLICATION("BUNDLE_APPLICATION"),
  
  CLOUDTOWER("CLOUDTOWER"),
  
  EVEROUTE_CONTROLLER("EVEROUTE_CONTROLLER"),
  
  REGISTRY("REGISTRY"),
  
  SKS_MANAGEMENT("SKS_MANAGEMENT");

  private String value;

  VmUsage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VmUsage fromValue(String value) {
    for (VmUsage b : VmUsage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VmUsage> {
    @Override
    public void write(final JsonWriter jsonWriter, final VmUsage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VmUsage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VmUsage.fromValue(value);
    }
  }
}

