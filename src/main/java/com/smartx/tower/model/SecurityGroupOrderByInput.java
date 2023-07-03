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
 * Gets or Sets SecurityGroupOrderByInput
 */
@JsonAdapter(SecurityGroupOrderByInput.Adapter.class)
public enum SecurityGroupOrderByInput {
  
  DESCRIPTION_ASC("description_ASC"),
  
  DESCRIPTION_DESC("description_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LABEL_GROUPS_ASC("label_groups_ASC"),
  
  LABEL_GROUPS_DESC("label_groups_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC");

  private String value;

  SecurityGroupOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SecurityGroupOrderByInput fromValue(String value) {
    for (SecurityGroupOrderByInput b : SecurityGroupOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SecurityGroupOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final SecurityGroupOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SecurityGroupOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SecurityGroupOrderByInput.fromValue(value);
    }
  }
}

