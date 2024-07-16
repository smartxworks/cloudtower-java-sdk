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
 * Gets or Sets Direction
 */
@JsonAdapter(Direction.Adapter.class)
public enum Direction {
  
  HORIZONTAL("HORIZONTAL"),
  
  VERTICAL("VERTICAL"),
  
  DIRECTION_UNSUPPORTED_ENUM("DIRECTION_UNSUPPORTED_ENUM");
  private String value;

  Direction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Direction fromValue(String value) {
    for (Direction b : Direction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return Direction.DIRECTION_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<Direction> {
    @Override
    public void write(final JsonWriter jsonWriter, final Direction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Direction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Direction.fromValue(value);
    }
  }
}

