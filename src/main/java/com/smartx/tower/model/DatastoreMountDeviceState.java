package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets DatastoreMountDeviceState */
@JsonAdapter(DatastoreMountDeviceState.Adapter.class)
public enum DatastoreMountDeviceState {
    ACTIVE("ACTIVE"),

    ERROR("ERROR"),

    UNKNOWN("UNKNOWN"),

    DATASTOREMOUNTDEVICESTATE_UNSUPPORTED_ENUM("DATASTOREMOUNTDEVICESTATE_UNSUPPORTED_ENUM");
    private String value;

    DatastoreMountDeviceState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DatastoreMountDeviceState fromValue(String value) {
        for (DatastoreMountDeviceState b : DatastoreMountDeviceState.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return DatastoreMountDeviceState.DATASTOREMOUNTDEVICESTATE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<DatastoreMountDeviceState> {
        @Override
        public void write(final JsonWriter jsonWriter, final DatastoreMountDeviceState enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DatastoreMountDeviceState read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DatastoreMountDeviceState.fromValue(value);
        }
    }
}
