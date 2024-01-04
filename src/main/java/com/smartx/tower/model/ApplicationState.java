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
 * Gets or Sets ApplicationState
 */
@JsonAdapter(ApplicationState.Adapter.class)
public enum ApplicationState {
  
  DEPLOYED("DEPLOYED"),
  
  DEPLOYING("DEPLOYING"),
  
  DEPLOY_ERROR("DEPLOY_ERROR"),
  
  EDITING("EDITING"),
  
  NOT_DEPLOYED("NOT_DEPLOYED"),
  
  STOPPED("STOPPED"),
  
  STOPPING("STOPPING"),
  
  STOP_ERROR("STOP_ERROR"),
  
  UPGRADING("UPGRADING");

  private String value;

  ApplicationState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationState fromValue(String value) {
    for (ApplicationState b : ApplicationState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ApplicationState> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApplicationState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApplicationState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApplicationState.fromValue(value);
    }
  }
}

