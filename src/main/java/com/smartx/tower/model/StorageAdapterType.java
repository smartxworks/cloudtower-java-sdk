package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StorageAdapterType */
@JsonAdapter(StorageAdapterType.Adapter.class)
public enum StorageAdapterType {
    FC("FC"),

    ISCSI("ISCSI"),

    ZBS("ZBS"),

    STORAGEADAPTERTYPE_UNSUPPORTED_ENUM("STORAGEADAPTERTYPE_UNSUPPORTED_ENUM");
    private String value;

    StorageAdapterType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StorageAdapterType fromValue(String value) {
        for (StorageAdapterType b : StorageAdapterType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StorageAdapterType.STORAGEADAPTERTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StorageAdapterType> {
        @Override
        public void write(final JsonWriter jsonWriter, final StorageAdapterType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StorageAdapterType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StorageAdapterType.fromValue(value);
        }
    }
}
