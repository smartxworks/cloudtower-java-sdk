package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets AuthStrategyType */
@JsonAdapter(AuthStrategyType.Adapter.class)
public enum AuthStrategyType {
    BCM("BCM"),

    LDAP("LDAP"),

    OIDC("OIDC"),

    SAML("SAML"),

    AUTHSTRATEGYTYPE_UNSUPPORTED_ENUM("AUTHSTRATEGYTYPE_UNSUPPORTED_ENUM");
    private String value;

    AuthStrategyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AuthStrategyType fromValue(String value) {
        for (AuthStrategyType b : AuthStrategyType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return AuthStrategyType.AUTHSTRATEGYTYPE_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<AuthStrategyType> {
        @Override
        public void write(final JsonWriter jsonWriter, final AuthStrategyType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AuthStrategyType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AuthStrategyType.fromValue(value);
        }
    }
}
