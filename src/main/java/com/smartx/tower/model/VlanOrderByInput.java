/*
 * CloudTower APIs
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 1.9.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
 * Gets or Sets VlanOrderByInput
 */
@JsonAdapter(VlanOrderByInput.Adapter.class)
public enum VlanOrderByInput {
  
  CREATEDAT_ASC("createdAt_ASC"),
  
  CREATEDAT_DESC("createdAt_DESC"),
  
  ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),
  
  ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),
  
  GATEWAY_IP_ASC("gateway_ip_ASC"),
  
  GATEWAY_IP_DESC("gateway_ip_DESC"),
  
  GATEWAY_SUBNETMASK_ASC("gateway_subnetmask_ASC"),
  
  GATEWAY_SUBNETMASK_DESC("gateway_subnetmask_DESC"),
  
  ID_ASC("id_ASC"),
  
  ID_DESC("id_DESC"),
  
  LOCAL_ID_ASC("local_id_ASC"),
  
  LOCAL_ID_DESC("local_id_DESC"),
  
  NAME_ASC("name_ASC"),
  
  NAME_DESC("name_DESC"),
  
  SUBNETMASK_ASC("subnetmask_ASC"),
  
  SUBNETMASK_DESC("subnetmask_DESC"),
  
  TYPE_ASC("type_ASC"),
  
  TYPE_DESC("type_DESC"),
  
  UPDATEDAT_ASC("updatedAt_ASC"),
  
  UPDATEDAT_DESC("updatedAt_DESC"),
  
  VLAN_ID_ASC("vlan_id_ASC"),
  
  VLAN_ID_DESC("vlan_id_DESC");

  private String value;

  VlanOrderByInput(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VlanOrderByInput fromValue(String value) {
    for (VlanOrderByInput b : VlanOrderByInput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VlanOrderByInput> {
    @Override
    public void write(final JsonWriter jsonWriter, final VlanOrderByInput enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VlanOrderByInput read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VlanOrderByInput.fromValue(value);
    }
  }
}
