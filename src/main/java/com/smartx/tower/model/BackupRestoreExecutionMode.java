/*
 * CloudTower APIs
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 1.9.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
 * Gets or Sets BackupRestoreExecutionMode
 */
@JsonAdapter(BackupRestoreExecutionMode.Adapter.class)
public enum BackupRestoreExecutionMode {
  
  INPLACE("INPLACE"),
  
  REBUILD("REBUILD");

  private String value;

  BackupRestoreExecutionMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BackupRestoreExecutionMode fromValue(String value) {
    for (BackupRestoreExecutionMode b : BackupRestoreExecutionMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BackupRestoreExecutionMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final BackupRestoreExecutionMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BackupRestoreExecutionMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BackupRestoreExecutionMode.fromValue(value);
    }
  }
}
