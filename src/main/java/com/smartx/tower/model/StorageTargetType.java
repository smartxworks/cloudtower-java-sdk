package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets StorageTargetType */
@JsonAdapter(StorageTargetType.Adapter.class)
public enum StorageTargetType {
    DYNAMIC("DYNAMIC"),

    STATIC("STATIC"),

    STORAGETARGETTYPE_UNSUPPORTED_ENUM("STORAGETARGETTYPE_UNSUPPORTED_ENUM");
    private String value;

    StorageTargetType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StorageTargetType fromValue(String value) {
        for (StorageTargetType b : StorageTargetType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return StorageTargetType.STORAGETARGETTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<StorageTargetType> {
        @Override
        public void write(final JsonWriter jsonWriter, final StorageTargetType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public StorageTargetType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return StorageTargetType.fromValue(value);
        }
    }
}
