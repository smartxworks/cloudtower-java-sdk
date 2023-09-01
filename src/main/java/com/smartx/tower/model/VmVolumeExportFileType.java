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
 * Gets or Sets VmVolumeExportFileType
 */
@JsonAdapter(VmVolumeExportFileType.Adapter.class)
public enum VmVolumeExportFileType {
  
  QCOW2("QCOW2"),
  
  RAW("RAW");

  private String value;

  VmVolumeExportFileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VmVolumeExportFileType fromValue(String value) {
    for (VmVolumeExportFileType b : VmVolumeExportFileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VmVolumeExportFileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VmVolumeExportFileType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VmVolumeExportFileType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VmVolumeExportFileType.fromValue(value);
    }
  }
}

