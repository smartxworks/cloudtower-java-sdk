package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StorageAdapterStatus */
@JsonAdapter(StorageAdapterStatus.Adapter.class)
public enum StorageAdapterStatus {
    ABNORMAL("ABNORMAL"),

    DEGRADED("DEGRADED"),

    OFFLINE("OFFLINE"),

    ONLINE("ONLINE"),

    STORAGEADAPTERSTATUS_UNSUPPORTED_ENUM("STORAGEADAPTERSTATUS_UNSUPPORTED_ENUM");
    private String value;

    StorageAdapterStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StorageAdapterStatus fromValue(String value) {
        for (StorageAdapterStatus b : StorageAdapterStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StorageAdapterStatus.STORAGEADAPTERSTATUS_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StorageAdapterStatus> {
        @Override
        public void write(final JsonWriter jsonWriter, final StorageAdapterStatus enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StorageAdapterStatus read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StorageAdapterStatus.fromValue(value);
        }
    }
}
