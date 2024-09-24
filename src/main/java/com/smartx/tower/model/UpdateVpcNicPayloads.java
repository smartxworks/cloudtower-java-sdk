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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UpdateVpcNicPayloads
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class UpdateVpcNicPayloads {
  public static final String SERIALIZED_NAME_FLOATING_IP_ID = "floating_ip_id";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_ID)
  private String floatingIpId;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses = null;

  public static final String SERIALIZED_NAME_VPC_SUBNET_ID = "vpc_subnet_id";
  @SerializedName(SERIALIZED_NAME_VPC_SUBNET_ID)
  private String vpcSubnetId;

  public UpdateVpcNicPayloads() { 
  }

  public UpdateVpcNicPayloads floatingIpId(String floatingIpId) {
    
    this.floatingIpId = floatingIpId;
    return this;
  }

   /**
   * Get floatingIpId
   * @return floatingIpId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpId() {
    return floatingIpId;
  }


  public void setFloatingIpId(String floatingIpId) {
    this.floatingIpId = floatingIpId;
  }


  public UpdateVpcNicPayloads ipAddresses(List<String> ipAddresses) {
    
    this.ipAddresses = ipAddresses;
    return this;
  }

  public UpdateVpcNicPayloads addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<String>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIpAddresses() {
    return ipAddresses;
  }


  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public UpdateVpcNicPayloads vpcSubnetId(String vpcSubnetId) {
    
    this.vpcSubnetId = vpcSubnetId;
    return this;
  }

   /**
   * Get vpcSubnetId
   * @return vpcSubnetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVpcSubnetId() {
    return vpcSubnetId;
  }


  public void setVpcSubnetId(String vpcSubnetId) {
    this.vpcSubnetId = vpcSubnetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVpcNicPayloads updateVpcNicPayloads = (UpdateVpcNicPayloads) o;
    return Objects.equals(this.floatingIpId, updateVpcNicPayloads.floatingIpId) &&
        Objects.equals(this.ipAddresses, updateVpcNicPayloads.ipAddresses) &&
        Objects.equals(this.vpcSubnetId, updateVpcNicPayloads.vpcSubnetId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(floatingIpId, ipAddresses, vpcSubnetId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVpcNicPayloads {\n");
    sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    vpcSubnetId: ").append(toIndentedString(vpcSubnetId)).append("\n");
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

