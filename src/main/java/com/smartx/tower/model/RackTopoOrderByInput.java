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
 * Gets or Sets RackTopoOrderByInput
 */
@JsonAdapter(RackTopoOrderByInput.Adapter.class)
public enum RackTopoOrderByInput {
  
  HEIGHT_ASC("height_ASC"),
  
  HEIGHT_DESC("height_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC");

  private String value;

  RackTopoOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RackTopoOrderByInput fromValue(String value) {
    for (RackTopoOrderByInput b : RackTopoOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RackTopoOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final RackTopoOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RackTopoOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RackTopoOrderByInput.fromValue(value);
    }
  }
}

