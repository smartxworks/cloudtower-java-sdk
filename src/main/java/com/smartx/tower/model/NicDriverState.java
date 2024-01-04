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
 * Gets or Sets NicDriverState
 */
@JsonAdapter(NicDriverState.Adapter.class)
public enum NicDriverState {
  
  NEED_REBOOT("NEED_REBOOT"),
  
  NOT_READY("NOT_READY"),
  
  NO_DRIVER("NO_DRIVER"),
  
  READY("READY");

  private String value;

  NicDriverState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NicDriverState fromValue(String value) {
    for (NicDriverState b : NicDriverState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<NicDriverState> {
    @Override
    public void write(final JsonWriter jsonWriter, final NicDriverState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NicDriverState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NicDriverState.fromValue(value);
    }
  }
}

