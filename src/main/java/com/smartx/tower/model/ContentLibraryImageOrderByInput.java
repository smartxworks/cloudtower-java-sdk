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
 * Gets or Sets ContentLibraryImageOrderByInput
 */
@JsonAdapter(ContentLibraryImageOrderByInput.Adapter.class)
public enum ContentLibraryImageOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  DESCRIPTION_ASC("description_ASC"),
  
  DESCRIPTION_DESC("description_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  PATH_ASC("path_ASC"),
  
  PATH_DESC("path_DESC"),
  
  SIZE_ASC("size_ASC"),
  
  SIZE_DESC("size_DESC");

  private String value;

  ContentLibraryImageOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContentLibraryImageOrderByInput fromValue(String value) {
    for (ContentLibraryImageOrderByInput b : ContentLibraryImageOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ContentLibraryImageOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContentLibraryImageOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ContentLibraryImageOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContentLibraryImageOrderByInput.fromValue(value);
    }
  }
}

