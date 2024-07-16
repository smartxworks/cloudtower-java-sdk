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
 * Gets or Sets SnapshotPlanStatus
 */
@JsonAdapter(SnapshotPlanStatus.Adapter.class)
public enum SnapshotPlanStatus {
  
  NORMAL("NORMAL"),
  
  STOPPED("STOPPED"),
  
  SUSPENDED("SUSPENDED"),
  
  SNAPSHOTPLANSTATUS_UNSUPPORTED_ENUM("SNAPSHOTPLANSTATUS_UNSUPPORTED_ENUM");
  private String value;

  SnapshotPlanStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SnapshotPlanStatus fromValue(String value) {
    for (SnapshotPlanStatus b : SnapshotPlanStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return SnapshotPlanStatus.SNAPSHOTPLANSTATUS_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<SnapshotPlanStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SnapshotPlanStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SnapshotPlanStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SnapshotPlanStatus.fromValue(value);
    }
  }
}

