package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedVirtualPrivateCloud;
import com.smartx.tower.model.NestedVirtualPrivateCloudRouteTable;
import com.smartx.tower.model.NestedVpcSubnetIpPooType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudSubnet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudSubnet {
  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private String cidr;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IP_POOLS = "ip_pools";
  @SerializedName(SERIALIZED_NAME_IP_POOLS)
  private List<NestedVpcSubnetIpPooType> ipPools = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROUTE_TABLE = "route_table";
  @SerializedName(SERIALIZED_NAME_ROUTE_TABLE)
  private NestedVirtualPrivateCloudRouteTable routeTable;

  public static final String SERIALIZED_NAME_TOTAL_IP_COUNT = "total_ip_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT)
  private Integer totalIpCount;

  public static final String SERIALIZED_NAME_UNUSED_IP_COUNT = "unused_ip_count";
  @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT)
  private Integer unusedIpCount;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private NestedVirtualPrivateCloud vpc;

  public VirtualPrivateCloudSubnet() { 
  }

  public VirtualPrivateCloudSubnet cidr(String cidr) {
    
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCidr() {
    return cidr;
  }


  public void setCidr(String cidr) {
    this.cidr = cidr;
  }


  public VirtualPrivateCloudSubnet description(String description) {
    
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


  public VirtualPrivateCloudSubnet entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public VirtualPrivateCloudSubnet gateway(String gateway) {
    
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


  public VirtualPrivateCloudSubnet id(String id) {
    
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


  public VirtualPrivateCloudSubnet ipPools(List<NestedVpcSubnetIpPooType> ipPools) {
    
    this.ipPools = ipPools;
    return this;
  }

  public VirtualPrivateCloudSubnet addIpPoolsItem(NestedVpcSubnetIpPooType ipPoolsItem) {
    if (this.ipPools == null) {
      this.ipPools = new ArrayList<NestedVpcSubnetIpPooType>();
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

  public List<NestedVpcSubnetIpPooType> getIpPools() {
    return ipPools;
  }


  public void setIpPools(List<NestedVpcSubnetIpPooType> ipPools) {
    this.ipPools = ipPools;
  }


  public VirtualPrivateCloudSubnet localId(String localId) {
    
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


  public VirtualPrivateCloudSubnet name(String name) {
    
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


  public VirtualPrivateCloudSubnet routeTable(NestedVirtualPrivateCloudRouteTable routeTable) {
    
    this.routeTable = routeTable;
    return this;
  }

   /**
   * Get routeTable
   * @return routeTable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVirtualPrivateCloudRouteTable getRouteTable() {
    return routeTable;
  }


  public void setRouteTable(NestedVirtualPrivateCloudRouteTable routeTable) {
    this.routeTable = routeTable;
  }


  public VirtualPrivateCloudSubnet totalIpCount(Integer totalIpCount) {
    
    this.totalIpCount = totalIpCount;
    return this;
  }

   /**
   * Get totalIpCount
   * @return totalIpCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalIpCount() {
    return totalIpCount;
  }


  public void setTotalIpCount(Integer totalIpCount) {
    this.totalIpCount = totalIpCount;
  }


  public VirtualPrivateCloudSubnet unusedIpCount(Integer unusedIpCount) {
    
    this.unusedIpCount = unusedIpCount;
    return this;
  }

   /**
   * Get unusedIpCount
   * @return unusedIpCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUnusedIpCount() {
    return unusedIpCount;
  }


  public void setUnusedIpCount(Integer unusedIpCount) {
    this.unusedIpCount = unusedIpCount;
  }


  public VirtualPrivateCloudSubnet vpc(NestedVirtualPrivateCloud vpc) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudSubnet virtualPrivateCloudSubnet = (VirtualPrivateCloudSubnet) o;
    return Objects.equals(this.cidr, virtualPrivateCloudSubnet.cidr) &&
        Objects.equals(this.description, virtualPrivateCloudSubnet.description) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudSubnet.entityAsyncStatus) &&
        Objects.equals(this.gateway, virtualPrivateCloudSubnet.gateway) &&
        Objects.equals(this.id, virtualPrivateCloudSubnet.id) &&
        Objects.equals(this.ipPools, virtualPrivateCloudSubnet.ipPools) &&
        Objects.equals(this.localId, virtualPrivateCloudSubnet.localId) &&
        Objects.equals(this.name, virtualPrivateCloudSubnet.name) &&
        Objects.equals(this.routeTable, virtualPrivateCloudSubnet.routeTable) &&
        Objects.equals(this.totalIpCount, virtualPrivateCloudSubnet.totalIpCount) &&
        Objects.equals(this.unusedIpCount, virtualPrivateCloudSubnet.unusedIpCount) &&
        Objects.equals(this.vpc, virtualPrivateCloudSubnet.vpc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidr, description, entityAsyncStatus, gateway, id, ipPools, localId, name, routeTable, totalIpCount, unusedIpCount, vpc);
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
    sb.append("class VirtualPrivateCloudSubnet {\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipPools: ").append(toIndentedString(ipPools)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
    sb.append("    totalIpCount: ").append(toIndentedString(totalIpCount)).append("\n");
    sb.append("    unusedIpCount: ").append(toIndentedString(unusedIpCount)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

