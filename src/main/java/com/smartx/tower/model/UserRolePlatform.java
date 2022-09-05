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
 * Gets or Sets UserRolePlatform
 */
@JsonAdapter(UserRolePlatform.Adapter.class)
public enum UserRolePlatform {
  
  MANAGEMENT("MANAGEMENT"),
  
  SELF_SERVICE("SELF_SERVICE");

  private String value;

  UserRolePlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserRolePlatform fromValue(String value) {
    for (UserRolePlatform b : UserRolePlatform.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UserRolePlatform> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserRolePlatform enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserRolePlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserRolePlatform.fromValue(value);
    }
  }
}

