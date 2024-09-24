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
 * VirtualPrivateCloudFloatingIpCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudFloatingIpCreationParams {
  public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
  private String externalIp;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_ID = "external_subnet_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_ID)
  private String externalSubnetId;

  public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public VirtualPrivateCloudFloatingIpCreationParams() { 
  }

  public VirtualPrivateCloudFloatingIpCreationParams externalIp(String externalIp) {
    
    this.externalIp = externalIp;
    return this;
  }

   /**
   * Get externalIp
   * @return externalIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalIp() {
    return externalIp;
  }


  public void setExternalIp(String externalIp) {
    this.externalIp = externalIp;
  }


  public VirtualPrivateCloudFloatingIpCreationParams externalSubnetId(String externalSubnetId) {
    
    this.externalSubnetId = externalSubnetId;
    return this;
  }

   /**
   * Get externalSubnetId
   * @return externalSubnetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getExternalSubnetId() {
    return externalSubnetId;
  }


  public void setExternalSubnetId(String externalSubnetId) {
    this.externalSubnetId = externalSubnetId;
  }


  public VirtualPrivateCloudFloatingIpCreationParams vpcId(String vpcId) {
    
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVpcId() {
    return vpcId;
  }


  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudFloatingIpCreationParams virtualPrivateCloudFloatingIpCreationParams = (VirtualPrivateCloudFloatingIpCreationParams) o;
    return Objects.equals(this.externalIp, virtualPrivateCloudFloatingIpCreationParams.externalIp) &&
        Objects.equals(this.externalSubnetId, virtualPrivateCloudFloatingIpCreationParams.externalSubnetId) &&
        Objects.equals(this.vpcId, virtualPrivateCloudFloatingIpCreationParams.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIp, externalSubnetId, vpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudFloatingIpCreationParams {\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
    sb.append("    externalSubnetId: ").append(toIndentedString(externalSubnetId)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

