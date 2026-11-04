package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DatastoreMountState */
@JsonAdapter(DatastoreMountState.Adapter.class)
public enum DatastoreMountState {
    ATTACHING("ATTACHING"),

    DEGRADED("DEGRADED"),

    FORMATTED("FORMATTED"),

    FORMATTING("FORMATTING"),

    MOUNTED("MOUNTED"),

    UNKNOWN("UNKNOWN"),

    DATASTOREMOUNTSTATE_UNSUPPORTED_ENUM("DATASTOREMOUNTSTATE_UNSUPPORTED_ENUM");
    private String value;

    DatastoreMountState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DatastoreMountState fromValue(String value) {
        for (DatastoreMountState b : DatastoreMountState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DatastoreMountState.DATASTOREMOUNTSTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DatastoreMountState> {
        @Override
        public void write(final JsonWriter jsonWriter, final DatastoreMountState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DatastoreMountState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DatastoreMountState.fromValue(value);
        }
    }
}
