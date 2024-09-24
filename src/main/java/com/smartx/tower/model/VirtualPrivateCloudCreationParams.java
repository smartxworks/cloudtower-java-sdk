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
 * VirtualPrivateCloudCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudCreationParams {
  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public static final String SERIALIZED_NAME_VPC_SERVICE_ID = "vpc_service_id";
  @SerializedName(SERIALIZED_NAME_VPC_SERVICE_ID)
  private String vpcServiceId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudCreationParams() { 
  }

  public VirtualPrivateCloudCreationParams mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  public VirtualPrivateCloudCreationParams vpcServiceId(String vpcServiceId) {
    
    this.vpcServiceId = vpcServiceId;
    return this;
  }

   /**
   * Get vpcServiceId
   * @return vpcServiceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVpcServiceId() {
    return vpcServiceId;
  }


  public void setVpcServiceId(String vpcServiceId) {
    this.vpcServiceId = vpcServiceId;
  }


  public VirtualPrivateCloudCreationParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VirtualPrivateCloudCreationParams name(String name) {
    
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
    VirtualPrivateCloudCreationParams virtualPrivateCloudCreationParams = (VirtualPrivateCloudCreationParams) o;
    return Objects.equals(this.mtu, virtualPrivateCloudCreationParams.mtu) &&
        Objects.equals(this.vpcServiceId, virtualPrivateCloudCreationParams.vpcServiceId) &&
        Objects.equals(this.description, virtualPrivateCloudCreationParams.description) &&
        Objects.equals(this.name, virtualPrivateCloudCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mtu, vpcServiceId, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudCreationParams {\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    vpcServiceId: ").append(toIndentedString(vpcServiceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

