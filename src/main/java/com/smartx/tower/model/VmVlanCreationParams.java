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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmVlanCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmVlanCreationParams {
  public static final String SERIALIZED_NAME_VDS_ID = "vds_id";
  @SerializedName(SERIALIZED_NAME_VDS_ID)
  private String vdsId;

  public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";
  @SerializedName(SERIALIZED_NAME_VLAN_ID)
  private Integer vlanId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VmVlanCreationParams() { 
  }

  public VmVlanCreationParams vdsId(String vdsId) {
    
    this.vdsId = vdsId;
    return this;
  }

   /**
   * Get vdsId
   * @return vdsId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVdsId() {
    return vdsId;
  }


  public void setVdsId(String vdsId) {
    this.vdsId = vdsId;
  }


  public VmVlanCreationParams vlanId(Integer vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVlanId() {
    return vlanId;
  }


  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  public VmVlanCreationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmVlanCreationParams vmVlanCreationParams = (VmVlanCreationParams) o;
    return Objects.equals(this.vdsId, vmVlanCreationParams.vdsId) &&
        Objects.equals(this.vlanId, vmVlanCreationParams.vlanId) &&
        Objects.equals(this.name, vmVlanCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vdsId, vlanId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmVlanCreationParams {\n");
    sb.append("    vdsId: ").append(toIndentedString(vdsId)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
