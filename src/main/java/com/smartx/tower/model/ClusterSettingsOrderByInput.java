package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ClusterSettingsOrderByInput
 */
@JsonAdapter(ClusterSettingsOrderByInput.Adapter.class)
public enum ClusterSettingsOrderByInput {
  
  DEFAULT_HA_ASC("default_ha_ASC"),
  
  DEFAULT_HA_DESC("default_ha_DESC"),
  
  DEFAULT_STORAGE_POLICY_ASC("default_storage_policy_ASC"),
  
  DEFAULT_STORAGE_POLICY_DESC("default_storage_policy_DESC"),
  
  ENABLED_ISCSI_ASC("enabled_iscsi_ASC"),
  
  ENABLED_ISCSI_DESC("enabled_iscsi_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  VM_RECYCLE_BIN_ASC("vm_recycle_bin_ASC"),
  
  VM_RECYCLE_BIN_DESC("vm_recycle_bin_DESC"),
  
  CLUSTERSETTINGSORDERBYINPUT_UNSUPPORTED_ENUM("CLUSTERSETTINGSORDERBYINPUT_UNSUPPORTED_ENUM");
  private String value;

  ClusterSettingsOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ClusterSettingsOrderByInput fromValue(String value) {
    for (ClusterSettingsOrderByInput b : ClusterSettingsOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return ClusterSettingsOrderByInput.CLUSTERSETTINGSORDERBYINPUT_UNSUPPORTED_ENUM;
  }

  public static class Adapter extends TypeAdapter<ClusterSettingsOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final ClusterSettingsOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ClusterSettingsOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ClusterSettingsOrderByInput.fromValue(value);
    }
  }
}

