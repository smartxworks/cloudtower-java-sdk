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
 * Gets or Sets UserRolePreset
 */
@JsonAdapter(UserRolePreset.Adapter.class)
public enum UserRolePreset {
  
  ADMIN("ADMIN"),
  
  AUDITOR("AUDITOR"),
  
  READ_ONLY("READ_ONLY"),
  
  ROOT("ROOT"),
  
  USER_ADMIN("USER_ADMIN"),
  
  VM_USER("VM_USER");

  private String value;

  UserRolePreset(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserRolePreset fromValue(String value) {
    for (UserRolePreset b : UserRolePreset.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UserRolePreset> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserRolePreset enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserRolePreset read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserRolePreset.fromValue(value);
    }
  }
}

