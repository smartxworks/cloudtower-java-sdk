package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudSubnetIpPoolParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualPrivateCloudSubnetUpdateDataParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudSubnetUpdateDataParams {
  public static final String SERIALIZED_NAME_ROUTE_TABLE_ID = "route_table_id";
  @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_ID)
  private String routeTableId;

  public static final String SERIALIZED_NAME_IP_POOLS = "ip_pools";
  @SerializedName(SERIALIZED_NAME_IP_POOLS)
  private List<VirtualPrivateCloudSubnetIpPoolParams> ipPools = null;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private String cidr;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudSubnetUpdateDataParams() { 
  }

  public VirtualPrivateCloudSubnetUpdateDataParams routeTableId(String routeTableId) {
    
    this.routeTableId = routeTableId;
    return this;
  }

   /**
   * Get routeTableId
   * @return routeTableId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouteTableId() {
    return routeTableId;
  }


  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }


  public VirtualPrivateCloudSubnetUpdateDataParams ipPools(List<VirtualPrivateCloudSubnetIpPoolParams> ipPools) {
    
    this.ipPools = ipPools;
    return this;
  }

  public VirtualPrivateCloudSubnetUpdateDataParams addIpPoolsItem(VirtualPrivateCloudSubnetIpPoolParams ipPoolsItem) {
    if (this.ipPools == null) {
      this.ipPools = new ArrayList<VirtualPrivateCloudSubnetIpPoolParams>();
    }
    this.ipPools.add(ipPoolsItem);
    return this;
  }

   /**
   * Get ipPools
   * @return ipPools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualPrivateCloudSubnetIpPoolParams> getIpPools() {
    return ipPools;
  }


  public void setIpPools(List<VirtualPrivateCloudSubnetIpPoolParams> ipPools) {
    this.ipPools = ipPools;
  }


  public VirtualPrivateCloudSubnetUpdateDataParams gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public VirtualPrivateCloudSubnetUpdateDataParams cidr(String cidr) {
    
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCidr() {
    return cidr;
  }


  public void setCidr(String cidr) {
    this.cidr = cidr;
  }


  public VirtualPrivateCloudSubnetUpdateDataParams description(String description) {
    
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


  public VirtualPrivateCloudSubnetUpdateDataParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    VirtualPrivateCloudSubnetUpdateDataParams virtualPrivateCloudSubnetUpdateDataParams = (VirtualPrivateCloudSubnetUpdateDataParams) o;
    return Objects.equals(this.routeTableId, virtualPrivateCloudSubnetUpdateDataParams.routeTableId) &&
        Objects.equals(this.ipPools, virtualPrivateCloudSubnetUpdateDataParams.ipPools) &&
        Objects.equals(this.gateway, virtualPrivateCloudSubnetUpdateDataParams.gateway) &&
        Objects.equals(this.cidr, virtualPrivateCloudSubnetUpdateDataParams.cidr) &&
        Objects.equals(this.description, virtualPrivateCloudSubnetUpdateDataParams.description) &&
        Objects.equals(this.name, virtualPrivateCloudSubnetUpdateDataParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTableId, ipPools, gateway, cidr, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudSubnetUpdateDataParams {\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    ipPools: ").append(toIndentedString(ipPools)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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

