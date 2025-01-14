package com.smartx.tower;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class ConditionalNullable {
    private final static String IS_PRESENT = "_isPresent_";

    public static class ConditionalNullablePojo {
        protected Set<String> _isPresent_ = new HashSet<String>();
    }

    public static class ConditionalNullablePojoAdapterFactory implements TypeAdapterFactory {
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            Class<? super T> rawType = type.getRawType();
            if (!ConditionalNullablePojo.class.isAssignableFrom(rawType)) {
                return null;
            }
            Map<String, Field> jsonField = new HashMap<>();
            Field[] fields = rawType.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                if (field.isAnnotationPresent(SerializedName.class)) {
                    jsonField.put(field.getAnnotation(SerializedName.class).value(), field);
                }
            }
            return new TypeAdapter<T>() {
                @Override
                public void write(JsonWriter out, T value)
                        throws java.io.IOException {
                    if (value == null) {
                        out.nullValue();
                        return;
                    }
                    out.beginObject();
                    ConditionalNullablePojo pojo = (ConditionalNullablePojo) value;
                    // TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
                    for (Map.Entry<String, Field> entry : jsonField.entrySet()) {
                        String fieldName = entry.getKey();
                        Field field = entry.getValue();
                        // get the value of the field
                        Object fieldValue;
                        try {
                            // mostly the field is private, so we need to make it accessible
                            if (!field.canAccess(value)) {
                                field.setAccessible(true);
                            }
                            fieldValue = field.get(value);
                        } catch (IllegalArgumentException | IllegalAccessException e) {
                            fieldValue = null;
                        }
                        if (fieldValue == null) {
                            if (pojo._isPresent_.contains(fieldName)) {
                                out.name(fieldName);
                                if (!out.getSerializeNulls()) {
                                    out.setSerializeNulls(true);
                                    out.nullValue();
                                    out.setSerializeNulls(false);
                                } else {
                                    out.nullValue();
                                }
                            }
                        } else {
                            // write the non null field with native adapter
                            out.name(fieldName);
                            @SuppressWarnings("unchecked")
                            TypeAdapter<Object> delegatedAdapter = (TypeAdapter<Object>) gson
                                    .getAdapter(field.getType());
                            if (delegatedAdapter != null && fieldValue != null) {
                                delegatedAdapter.write(out, fieldValue);
                            }
                        }
                    }
                    out.endObject();
                }

                public T read(JsonReader in) throws java.io.IOException {
                    JsonObject jsonObject = gson.getAdapter(JsonElement.class).read(in).getAsJsonObject();
                    T instance = gson.getDelegateAdapter(ConditionalNullablePojoAdapterFactory.this, type)
                            .fromJsonTree(jsonObject);
                    return instance;
                }
            };
        }
    }
}