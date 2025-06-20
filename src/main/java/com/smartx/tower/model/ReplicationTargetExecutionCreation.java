package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets ReplicationTargetExecutionCreation */
@JsonAdapter(ReplicationTargetExecutionCreation.Adapter.class)
public enum ReplicationTargetExecutionCreation {
    FAILBACK("FAILBACK"),

    FAILOVER("FAILOVER"),

    REPLICATION("REPLICATION"),

    REPLICATIONTARGETEXECUTIONCREATION_UNSUPPORTED_ENUM(
            "REPLICATIONTARGETEXECUTIONCREATION_UNSUPPORTED_ENUM");
    private String value;

    ReplicationTargetExecutionCreation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplicationTargetExecutionCreation fromValue(String value) {
        for (ReplicationTargetExecutionCreation b : ReplicationTargetExecutionCreation.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return ReplicationTargetExecutionCreation
                .REPLICATIONTARGETEXECUTIONCREATION_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<ReplicationTargetExecutionCreation> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final ReplicationTargetExecutionCreation enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ReplicationTargetExecutionCreation read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return ReplicationTargetExecutionCreation.fromValue(value);
        }
    }
}
