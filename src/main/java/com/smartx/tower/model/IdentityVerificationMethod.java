package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets IdentityVerificationMethod */
@JsonAdapter(IdentityVerificationMethod.Adapter.class)
public enum IdentityVerificationMethod {
    BOTHWAY_CHAP("BOTHWAY_CHAP"),

    HERITED("HERITED"),

    NO_CHAP("NO_CHAP"),

    ONEWAY_CHAP("ONEWAY_CHAP"),

    IDENTITYVERIFICATIONMETHOD_UNSUPPORTED_ENUM("IDENTITYVERIFICATIONMETHOD_UNSUPPORTED_ENUM");
    private String value;

    IdentityVerificationMethod(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IdentityVerificationMethod fromValue(String value) {
        for (IdentityVerificationMethod b : IdentityVerificationMethod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return IdentityVerificationMethod.IDENTITYVERIFICATIONMETHOD_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<IdentityVerificationMethod> {
        @Override
        public void write(final JsonWriter jsonWriter, final IdentityVerificationMethod enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public IdentityVerificationMethod read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return IdentityVerificationMethod.fromValue(value);
        }
    }
}
