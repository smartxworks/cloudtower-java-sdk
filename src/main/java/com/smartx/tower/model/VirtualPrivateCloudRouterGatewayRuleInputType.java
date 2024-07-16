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
 * VirtualPrivateCloudRouterGatewayRuleInputType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudRouterGatewayRuleInputType {
  public static final String SERIALIZED_NAME_DST = "dst";
  @SerializedName(SERIALIZED_NAME_DST)
  private String dst;

  public static final String SERIALIZED_NAME_NEXTHOP = "nexthop";
  @SerializedName(SERIALIZED_NAME_NEXTHOP)
  private String nexthop;

  public VirtualPrivateCloudRouterGatewayRuleInputType() { 
  }

  public VirtualPrivateCloudRouterGatewayRuleInputType dst(String dst) {
    
    this.dst = dst;
    return this;
  }

   /**
   * Get dst
   * @return dst
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDst() {
    return dst;
  }


  public void setDst(String dst) {
    this.dst = dst;
  }


  public VirtualPrivateCloudRouterGatewayRuleInputType nexthop(String nexthop) {
    
    this.nexthop = nexthop;
    return this;
  }

   /**
   * Get nexthop
   * @return nexthop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNexthop() {
    return nexthop;
  }


  public void setNexthop(String nexthop) {
    this.nexthop = nexthop;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudRouterGatewayRuleInputType virtualPrivateCloudRouterGatewayRuleInputType = (VirtualPrivateCloudRouterGatewayRuleInputType) o;
    return Objects.equals(this.dst, virtualPrivateCloudRouterGatewayRuleInputType.dst) &&
        Objects.equals(this.nexthop, virtualPrivateCloudRouterGatewayRuleInputType.nexthop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dst, nexthop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudRouterGatewayRuleInputType {\n");
    sb.append("    dst: ").append(toIndentedString(dst)).append("\n");
    sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
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

