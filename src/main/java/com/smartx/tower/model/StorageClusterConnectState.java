package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StorageClusterConnectState */
@JsonAdapter(StorageClusterConnectState.Adapter.class)
public enum StorageClusterConnectState {
    CONNECTED("CONNECTED"),

    FAILED_TO_REMOVE("FAILED_TO_REMOVE"),

    INITIALIZING("INITIALIZING"),

    REMOVING("REMOVING"),

    STORAGECLUSTERCONNECTSTATE_UNSUPPORTED_ENUM("STORAGECLUSTERCONNECTSTATE_UNSUPPORTED_ENUM");
    private String value;

    StorageClusterConnectState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StorageClusterConnectState fromValue(String value) {
        for (StorageClusterConnectState b : StorageClusterConnectState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StorageClusterConnectState.STORAGECLUSTERCONNECTSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StorageClusterConnectState> {
        @Override
        public void write(final JsonWriter jsonWriter, final StorageClusterConnectState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StorageClusterConnectState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StorageClusterConnectState.fromValue(value);
        }
    }
}
