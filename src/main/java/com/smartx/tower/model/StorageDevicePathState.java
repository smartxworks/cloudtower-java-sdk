package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StorageDevicePathState */
@JsonAdapter(StorageDevicePathState.Adapter.class)
public enum StorageDevicePathState {
    ACTIVE("ACTIVE"),

    DEAD("DEAD"),

    DISABLED("DISABLED"),

    STANDBY("STANDBY"),

    STORAGEDEVICEPATHSTATE_UNSUPPORTED_ENUM("STORAGEDEVICEPATHSTATE_UNSUPPORTED_ENUM");
    private String value;

    StorageDevicePathState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StorageDevicePathState fromValue(String value) {
        for (StorageDevicePathState b : StorageDevicePathState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StorageDevicePathState.STORAGEDEVICEPATHSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StorageDevicePathState> {
        @Override
        public void write(final JsonWriter jsonWriter, final StorageDevicePathState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StorageDevicePathState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StorageDevicePathState.fromValue(value);
        }
    }
}
