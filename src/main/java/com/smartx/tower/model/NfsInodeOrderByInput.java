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
 * Gets or Sets NfsInodeOrderByInput
 */
@JsonAdapter(NfsInodeOrderByInput.Adapter.class)
public enum NfsInodeOrderByInput {
  
  ASSIGNED_SIZE_ASC("assigned_size_ASC"),
  
  ASSIGNED_SIZE_DESC("assigned_size_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  FILE_ASC("file_ASC"),
  
  FILE_DESC("file_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  LOCAL_UPDATED_AT_ASC("local_updated_at_ASC"),
  
  LOCAL_UPDATED_AT_DESC("local_updated_at_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  PARENT_ID_ASC("parent_id_ASC"),
  
  PARENT_ID_DESC("parent_id_DESC"),
  
  SHARED_SIZE_ASC("shared_size_ASC"),
  
  SHARED_SIZE_DESC("shared_size_DESC"),
  
  SNAPSHOT_NUM_ASC("snapshot_num_ASC"),
  
  SNAPSHOT_NUM_DESC("snapshot_num_DESC"),
  
  UNIQUE_SIZE_ASC("unique_size_ASC"),
  
  UNIQUE_SIZE_DESC("unique_size_DESC"),
  
  NFSINODEORDERBYINPUT_UNSUPPORTED_ENUM("NFSINODEORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  NfsInodeOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NfsInodeOrderByInput fromValue(String value) {
    for (NfsInodeOrderByInput b : NfsInodeOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NfsInodeOrderByInput.NFSINODEORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<NfsInodeOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final NfsInodeOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NfsInodeOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NfsInodeOrderByInput.fromValue(value);
    }
  }
}

