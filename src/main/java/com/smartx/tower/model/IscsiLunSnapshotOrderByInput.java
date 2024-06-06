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
 * Gets or Sets IscsiLunSnapshotOrderByInput
 */
@JsonAdapter(IscsiLunSnapshotOrderByInput.Adapter.class)
public enum IscsiLunSnapshotOrderByInput {
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_CREATED_AT_ASC("local_created_at_ASC"),
  
  LOCAL_CREATED_AT_DESC("local_created_at_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  UNIQUE_SIZE_ASC("unique_size_ASC"),
  
  UNIQUE_SIZE_DESC("unique_size_DESC"),
  
  ISCSILUNSNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM("ISCSILUNSNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  IscsiLunSnapshotOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IscsiLunSnapshotOrderByInput fromValue(String value) {
    for (IscsiLunSnapshotOrderByInput b : IscsiLunSnapshotOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return IscsiLunSnapshotOrderByInput.ISCSILUNSNAPSHOTORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<IscsiLunSnapshotOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final IscsiLunSnapshotOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IscsiLunSnapshotOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IscsiLunSnapshotOrderByInput.fromValue(value);
    }
  }
}

