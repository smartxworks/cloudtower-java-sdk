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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedVirtualPrivateCloudExternalSubnet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedVirtualPrivateCloudExternalSubnet {
  public static final String SERIALIZED_NAME_FLOATING_IP_CIDR = "floating_ip_cidr";
  @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR)
  private String floatingIpCidr;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR = "nat_gateway_cidr";
  @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR)
  private String natGatewayCidr;

  public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR = "router_gateway_cidr";
  @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR)
  private String routerGatewayCidr;

  public NestedVirtualPrivateCloudExternalSubnet() { 
  }

  public NestedVirtualPrivateCloudExternalSubnet floatingIpCidr(String floatingIpCidr) {
    
    this.floatingIpCidr = floatingIpCidr;
    return this;
  }

   /**
   * Get floatingIpCidr
   * @return floatingIpCidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFloatingIpCidr() {
    return floatingIpCidr;
  }


  public void setFloatingIpCidr(String floatingIpCidr) {
    this.floatingIpCidr = floatingIpCidr;
  }


  public NestedVirtualPrivateCloudExternalSubnet id(String id) {
    
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


  public NestedVirtualPrivateCloudExternalSubnet name(String name) {
    
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


  public NestedVirtualPrivateCloudExternalSubnet natGatewayCidr(String natGatewayCidr) {
    
    this.natGatewayCidr = natGatewayCidr;
    return this;
  }

   /**
   * Get natGatewayCidr
   * @return natGatewayCidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNatGatewayCidr() {
    return natGatewayCidr;
  }


  public void setNatGatewayCidr(String natGatewayCidr) {
    this.natGatewayCidr = natGatewayCidr;
  }


  public NestedVirtualPrivateCloudExternalSubnet routerGatewayCidr(String routerGatewayCidr) {
    
    this.routerGatewayCidr = routerGatewayCidr;
    return this;
  }

   /**
   * Get routerGatewayCidr
   * @return routerGatewayCidr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRouterGatewayCidr() {
    return routerGatewayCidr;
  }


  public void setRouterGatewayCidr(String routerGatewayCidr) {
    this.routerGatewayCidr = routerGatewayCidr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVirtualPrivateCloudExternalSubnet nestedVirtualPrivateCloudExternalSubnet = (NestedVirtualPrivateCloudExternalSubnet) o;
    return Objects.equals(this.floatingIpCidr, nestedVirtualPrivateCloudExternalSubnet.floatingIpCidr) &&
        Objects.equals(this.id, nestedVirtualPrivateCloudExternalSubnet.id) &&
        Objects.equals(this.name, nestedVirtualPrivateCloudExternalSubnet.name) &&
        Objects.equals(this.natGatewayCidr, nestedVirtualPrivateCloudExternalSubnet.natGatewayCidr) &&
        Objects.equals(this.routerGatewayCidr, nestedVirtualPrivateCloudExternalSubnet.routerGatewayCidr);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(floatingIpCidr, id, name, natGatewayCidr, routerGatewayCidr);
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
    sb.append("class NestedVirtualPrivateCloudExternalSubnet {\n");
    sb.append("    floatingIpCidr: ").append(toIndentedString(floatingIpCidr)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    natGatewayCidr: ").append(toIndentedString(natGatewayCidr)).append("\n");
    sb.append("    routerGatewayCidr: ").append(toIndentedString(routerGatewayCidr)).append("\n");
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

