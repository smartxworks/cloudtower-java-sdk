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
 * Gets or Sets BackupPlanDeleteStrategy
 */
@JsonAdapter(BackupPlanDeleteStrategy.Adapter.class)
public enum BackupPlanDeleteStrategy {
  
  DELETE_RESTORE_POINT("DELETE_RESTORE_POINT"),
  
  KEEP_RESTORE_POINT("KEEP_RESTORE_POINT");

  private String value;

  BackupPlanDeleteStrategy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BackupPlanDeleteStrategy fromValue(String value) {
    for (BackupPlanDeleteStrategy b : BackupPlanDeleteStrategy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BackupPlanDeleteStrategy> {
    @Override
    public void write(final JsonWriter jsonWriter, final BackupPlanDeleteStrategy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BackupPlanDeleteStrategy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BackupPlanDeleteStrategy.fromValue(value);
    }
  }
}
