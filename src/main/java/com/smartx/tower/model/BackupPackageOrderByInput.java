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
 * Gets or Sets BackupPackageOrderByInput
 */
@JsonAdapter(BackupPackageOrderByInput.Adapter.class)
public enum BackupPackageOrderByInput {
  
  ARCH_ASC("arch_ASC"),
  
  ARCH_DESC("arch_DESC"),
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  DESCRIPTION_ASC("description_ASC"),
  
  DESCRIPTION_DESC("description_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_CREATED_AT_ASC("local_created_at_ASC"),
  
  LOCAL_CREATED_AT_DESC("local_created_at_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  PACKAGE_INFO_ASC("package_info_ASC"),
  
  PACKAGE_INFO_DESC("package_info_DESC"),
  
  SIZE_ASC("size_ASC"),
  
  SIZE_DESC("size_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC"),
  
  VERSION_ASC("version_ASC"),
  
  VERSION_DESC("version_DESC");

  private String value;

  BackupPackageOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BackupPackageOrderByInput fromValue(String value) {
    for (BackupPackageOrderByInput b : BackupPackageOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BackupPackageOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final BackupPackageOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BackupPackageOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BackupPackageOrderByInput.fromValue(value);
    }
  }
}
