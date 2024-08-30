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
 * Gets or Sets BackupRestoreExecutionOrderByInput
 */
@JsonAdapter(BackupRestoreExecutionOrderByInput.Adapter.class)
public enum BackupRestoreExecutionOrderByInput {
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  RESOURCE_VERSION_ASC("resource_version_ASC"),
  
  RESOURCE_VERSION_DESC("resource_version_DESC"),
  
  BACKUPRESTOREEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM("BACKUPRESTOREEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  BackupRestoreExecutionOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BackupRestoreExecutionOrderByInput fromValue(String value) {
    for (BackupRestoreExecutionOrderByInput b : BackupRestoreExecutionOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return BackupRestoreExecutionOrderByInput.BACKUPRESTOREEXECUTIONORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<BackupRestoreExecutionOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final BackupRestoreExecutionOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BackupRestoreExecutionOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BackupRestoreExecutionOrderByInput.fromValue(value);
    }
  }
}

