package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedVirtualPrivateCloudServiceTepIpPool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NestedVirtualPrivateCloudService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedVirtualPrivateCloudService {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTERNAL_CIDR = "internal_cidr";
  @SerializedName(SERIALIZED_NAME_INTERNAL_CIDR)
  private String internalCidr;

  public static final String SERIALIZED_NAME_TEP_IP_POOLS = "tep_ip_pools";
  @SerializedName(SERIALIZED_NAME_TEP_IP_POOLS)
  private List<NestedVirtualPrivateCloudServiceTepIpPool> tepIpPools = new ArrayList<NestedVirtualPrivateCloudServiceTepIpPool>();

  public NestedVirtualPrivateCloudService() { 
  }

  public NestedVirtualPrivateCloudService id(String id) {
    
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


  public NestedVirtualPrivateCloudService internalCidr(String internalCidr) {
    
    this.internalCidr = internalCidr;
    return this;
  }

   /**
   * Get internalCidr
   * @return internalCidr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getInternalCidr() {
    return internalCidr;
  }


  public void setInternalCidr(String internalCidr) {
    this.internalCidr = internalCidr;
  }


  public NestedVirtualPrivateCloudService tepIpPools(List<NestedVirtualPrivateCloudServiceTepIpPool> tepIpPools) {
    
    this.tepIpPools = tepIpPools;
    return this;
  }

  public NestedVirtualPrivateCloudService addTepIpPoolsItem(NestedVirtualPrivateCloudServiceTepIpPool tepIpPoolsItem) {
    this.tepIpPools.add(tepIpPoolsItem);
    return this;
  }

   /**
   * Get tepIpPools
   * @return tepIpPools
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedVirtualPrivateCloudServiceTepIpPool> getTepIpPools() {
    return tepIpPools;
  }


  public void setTepIpPools(List<NestedVirtualPrivateCloudServiceTepIpPool> tepIpPools) {
    this.tepIpPools = tepIpPools;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVirtualPrivateCloudService nestedVirtualPrivateCloudService = (NestedVirtualPrivateCloudService) o;
    return Objects.equals(this.id, nestedVirtualPrivateCloudService.id) &&
        Objects.equals(this.internalCidr, nestedVirtualPrivateCloudService.internalCidr) &&
        Objects.equals(this.tepIpPools, nestedVirtualPrivateCloudService.tepIpPools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, internalCidr, tepIpPools);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedVirtualPrivateCloudService {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalCidr: ").append(toIndentedString(internalCidr)).append("\n");
    sb.append("    tepIpPools: ").append(toIndentedString(tepIpPools)).append("\n");
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

