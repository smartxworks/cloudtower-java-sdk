package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedVirtualPrivateCloud;
import com.smartx.tower.model.NestedVirtualPrivateCloudFloatingIp;
import com.smartx.tower.model.NestedVirtualPrivateCloudSubnet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedVirtualPrivateCloudNic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedVirtualPrivateCloudNic {
  public static final String SERIALIZED_NAME_FLOATING_IP = "floating_ip";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP)
  private NestedVirtualPrivateCloudFloatingIp floatingIp;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  private List<String> ipAddresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private NestedVirtualPrivateCloud vpc;

  public static final String SERIALIZED_NAME_VPC_SUBNET = "vpc_subnet";
  @SerializedName(SERIALIZED_NAME_VPC_SUBNET)
  private NestedVirtualPrivateCloudSubnet vpcSubnet;

  public NestedVirtualPrivateCloudNic() { 
  }

  public NestedVirtualPrivateCloudNic floatingIp(NestedVirtualPrivateCloudFloatingIp floatingIp) {
    
    this.floatingIp = floatingIp;
    return this;
  }

   /**
   * Get floatingIp
   * @return floatingIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVirtualPrivateCloudFloatingIp getFloatingIp() {
    return floatingIp;
  }


  public void setFloatingIp(NestedVirtualPrivateCloudFloatingIp floatingIp) {
    this.floatingIp = floatingIp;
  }


  public NestedVirtualPrivateCloudNic id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NestedVirtualPrivateCloudNic ipAddresses(List<String> ipAddresses) {
    
    this.ipAddresses = ipAddresses;
    return this;
  }

  public NestedVirtualPrivateCloudNic addIpAddressesItem(String ipAddressesItem) {
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Get ipAddresses
   * @return ipAddresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getIpAddresses() {
    return ipAddresses;
  }


  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public NestedVirtualPrivateCloudNic localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public NestedVirtualPrivateCloudNic vpc(NestedVirtualPrivateCloud vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * Get vpc
   * @return vpc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVirtualPrivateCloud getVpc() {
    return vpc;
  }


  public void setVpc(NestedVirtualPrivateCloud vpc) {
    this.vpc = vpc;
  }


  public NestedVirtualPrivateCloudNic vpcSubnet(NestedVirtualPrivateCloudSubnet vpcSubnet) {
    
    this.vpcSubnet = vpcSubnet;
    return this;
  }

   /**
   * Get vpcSubnet
   * @return vpcSubnet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVirtualPrivateCloudSubnet getVpcSubnet() {
    return vpcSubnet;
  }


  public void setVpcSubnet(NestedVirtualPrivateCloudSubnet vpcSubnet) {
    this.vpcSubnet = vpcSubnet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVirtualPrivateCloudNic nestedVirtualPrivateCloudNic = (NestedVirtualPrivateCloudNic) o;
    return Objects.equals(this.floatingIp, nestedVirtualPrivateCloudNic.floatingIp) &&
        Objects.equals(this.id, nestedVirtualPrivateCloudNic.id) &&
        Objects.equals(this.ipAddresses, nestedVirtualPrivateCloudNic.ipAddresses) &&
        Objects.equals(this.localId, nestedVirtualPrivateCloudNic.localId) &&
        Objects.equals(this.vpc, nestedVirtualPrivateCloudNic.vpc) &&
        Objects.equals(this.vpcSubnet, nestedVirtualPrivateCloudNic.vpcSubnet);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(floatingIp, id, ipAddresses, localId, vpc, vpcSubnet);
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
    sb.append("class NestedVirtualPrivateCloudNic {\n");
    sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    vpcSubnet: ").append(toIndentedString(vpcSubnet)).append("\n");
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

