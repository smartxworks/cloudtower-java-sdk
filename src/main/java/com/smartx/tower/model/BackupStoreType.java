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
 * Gets or Sets BackupStoreType
 */
@JsonAdapter(BackupStoreType.Adapter.class)
public enum BackupStoreType {
  
  ISCSI("ISCSI"),
  
  NFS3("NFS3"),
  
  NFS4("NFS4");

  private String value;

  BackupStoreType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BackupStoreType fromValue(String value) {
    for (BackupStoreType b : BackupStoreType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BackupStoreType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BackupStoreType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BackupStoreType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BackupStoreType.fromValue(value);
    }
  }
}
