package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VdsCreationWithMigrateVlanParamsAllOfVlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VdsCreationWithMigrateVlanParamsAllOfVlan {
  public static final String SERIALIZED_NAME_EXTRA_IP = "extra_ip";
  @SerializedName(SERIALIZED_NAME_EXTRA_IP)
  private List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> extraIp = new ArrayList<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp>();

  public static final String SERIALIZED_NAME_SUBNETMASK = "subnetmask";
  @SerializedName(SERIALIZED_NAME_SUBNETMASK)
  private String subnetmask;

  public static final String SERIALIZED_NAME_GATEWAY_SUBNETMASK = "gateway_subnetmask";
  @SerializedName(SERIALIZED_NAME_GATEWAY_SUBNETMASK)
  private String gatewaySubnetmask;

  public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
  private String gatewayIp;

  public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";
  @SerializedName(SERIALIZED_NAME_VLAN_ID)
  private Integer vlanId;

  public VdsCreationWithMigrateVlanParamsAllOfVlan() { 
  }

  public VdsCreationWithMigrateVlanParamsAllOfVlan extraIp(List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> extraIp) {
    
    this.extraIp = extraIp;
    return this;
  }

  public VdsCreationWithMigrateVlanParamsAllOfVlan addExtraIpItem(VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp extraIpItem) {
    this.extraIp.add(extraIpItem);
    return this;
  }

   /**
   * Get extraIp
   * @return extraIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> getExtraIp() {
    return extraIp;
  }


  public void setExtraIp(List<VdsCreationWithMigrateVlanParamsAllOfVlanExtraIp> extraIp) {
    this.extraIp = extraIp;
  }


  public VdsCreationWithMigrateVlanParamsAllOfVlan subnetmask(String subnetmask) {
    
    this.subnetmask = subnetmask;
    return this;
  }

   /**
   * Get subnetmask
   * @return subnetmask
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubnetmask() {
    return subnetmask;
  }


  public void setSubnetmask(String subnetmask) {
    this.subnetmask = subnetmask;
  }


  public VdsCreationWithMigrateVlanParamsAllOfVlan gatewaySubnetmask(String gatewaySubnetmask) {
    
    this.gatewaySubnetmask = gatewaySubnetmask;
    return this;
  }

   /**
   * Get gatewaySubnetmask
   * @return gatewaySubnetmask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewaySubnetmask() {
    return gatewaySubnetmask;
  }


  public void setGatewaySubnetmask(String gatewaySubnetmask) {
    this.gatewaySubnetmask = gatewaySubnetmask;
  }


  public VdsCreationWithMigrateVlanParamsAllOfVlan gatewayIp(String gatewayIp) {
    
    this.gatewayIp = gatewayIp;
    return this;
  }

   /**
   * Get gatewayIp
   * @return gatewayIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIp() {
    return gatewayIp;
  }


  public void setGatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
  }


  public VdsCreationWithMigrateVlanParamsAllOfVlan vlanId(Integer vlanId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdsCreationWithMigrateVlanParamsAllOfVlan vdsCreationWithMigrateVlanParamsAllOfVlan = (VdsCreationWithMigrateVlanParamsAllOfVlan) o;
    return Objects.equals(this.extraIp, vdsCreationWithMigrateVlanParamsAllOfVlan.extraIp) &&
        Objects.equals(this.subnetmask, vdsCreationWithMigrateVlanParamsAllOfVlan.subnetmask) &&
        Objects.equals(this.gatewaySubnetmask, vdsCreationWithMigrateVlanParamsAllOfVlan.gatewaySubnetmask) &&
        Objects.equals(this.gatewayIp, vdsCreationWithMigrateVlanParamsAllOfVlan.gatewayIp) &&
        Objects.equals(this.vlanId, vdsCreationWithMigrateVlanParamsAllOfVlan.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraIp, subnetmask, gatewaySubnetmask, gatewayIp, vlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdsCreationWithMigrateVlanParamsAllOfVlan {\n");
    sb.append("    extraIp: ").append(toIndentedString(extraIp)).append("\n");
    sb.append("    subnetmask: ").append(toIndentedString(subnetmask)).append("\n");
    sb.append("    gatewaySubnetmask: ").append(toIndentedString(gatewaySubnetmask)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

