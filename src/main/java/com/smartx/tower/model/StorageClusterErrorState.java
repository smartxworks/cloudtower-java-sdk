package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StorageClusterErrorState */
@JsonAdapter(StorageClusterErrorState.Adapter.class)
public enum StorageClusterErrorState {
    SERVICE_ERROR("SERVICE_ERROR"),

    STORAGECLUSTERERRORSTATE_UNSUPPORTED_ENUM("STORAGECLUSTERERRORSTATE_UNSUPPORTED_ENUM");
    private String value;

    StorageClusterErrorState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StorageClusterErrorState fromValue(String value) {
        for (StorageClusterErrorState b : StorageClusterErrorState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StorageClusterErrorState.STORAGECLUSTERERRORSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StorageClusterErrorState> {
        @Override
        public void write(final JsonWriter jsonWriter, final StorageClusterErrorState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StorageClusterErrorState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StorageClusterErrorState.fromValue(value);
        }
    }
}
