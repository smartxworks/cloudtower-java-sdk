package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudDnatRuleParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualPrivateCloudNatGatewayCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudNatGatewayCreationParams {
  public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
  private String externalIp;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_ID = "external_subnet_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_ID)
  private String externalSubnetId;

  public static final String SERIALIZED_NAME_DNAT_RULES = "dnat_rules";
  @SerializedName(SERIALIZED_NAME_DNAT_RULES)
  private List<VirtualPrivateCloudDnatRuleParams> dnatRules = null;

  public static final String SERIALIZED_NAME_ENABLE_DNAT = "enable_dnat";
  @SerializedName(SERIALIZED_NAME_ENABLE_DNAT)
  private Boolean enableDnat;

  public static final String SERIALIZED_NAME_ENABLE_SNAT = "enable_snat";
  @SerializedName(SERIALIZED_NAME_ENABLE_SNAT)
  private Boolean enableSnat;

  public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudNatGatewayCreationParams() { 
  }

  public VirtualPrivateCloudNatGatewayCreationParams externalIp(String externalIp) {
    
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


  public VirtualPrivateCloudNatGatewayCreationParams externalSubnetId(String externalSubnetId) {
    
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


  public VirtualPrivateCloudNatGatewayCreationParams dnatRules(List<VirtualPrivateCloudDnatRuleParams> dnatRules) {
    
    this.dnatRules = dnatRules;
    return this;
  }

  public VirtualPrivateCloudNatGatewayCreationParams addDnatRulesItem(VirtualPrivateCloudDnatRuleParams dnatRulesItem) {
    if (this.dnatRules == null) {
      this.dnatRules = new ArrayList<VirtualPrivateCloudDnatRuleParams>();
    }
    this.dnatRules.add(dnatRulesItem);
    return this;
  }

   /**
   * Get dnatRules
   * @return dnatRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualPrivateCloudDnatRuleParams> getDnatRules() {
    return dnatRules;
  }


  public void setDnatRules(List<VirtualPrivateCloudDnatRuleParams> dnatRules) {
    this.dnatRules = dnatRules;
  }


  public VirtualPrivateCloudNatGatewayCreationParams enableDnat(Boolean enableDnat) {
    
    this.enableDnat = enableDnat;
    return this;
  }

   /**
   * Get enableDnat
   * @return enableDnat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEnableDnat() {
    return enableDnat;
  }


  public void setEnableDnat(Boolean enableDnat) {
    this.enableDnat = enableDnat;
  }


  public VirtualPrivateCloudNatGatewayCreationParams enableSnat(Boolean enableSnat) {
    
    this.enableSnat = enableSnat;
    return this;
  }

   /**
   * Get enableSnat
   * @return enableSnat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEnableSnat() {
    return enableSnat;
  }


  public void setEnableSnat(Boolean enableSnat) {
    this.enableSnat = enableSnat;
  }


  public VirtualPrivateCloudNatGatewayCreationParams vpcId(String vpcId) {
    
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


  public VirtualPrivateCloudNatGatewayCreationParams name(String name) {
    
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
    VirtualPrivateCloudNatGatewayCreationParams virtualPrivateCloudNatGatewayCreationParams = (VirtualPrivateCloudNatGatewayCreationParams) o;
    return Objects.equals(this.externalIp, virtualPrivateCloudNatGatewayCreationParams.externalIp) &&
        Objects.equals(this.externalSubnetId, virtualPrivateCloudNatGatewayCreationParams.externalSubnetId) &&
        Objects.equals(this.dnatRules, virtualPrivateCloudNatGatewayCreationParams.dnatRules) &&
        Objects.equals(this.enableDnat, virtualPrivateCloudNatGatewayCreationParams.enableDnat) &&
        Objects.equals(this.enableSnat, virtualPrivateCloudNatGatewayCreationParams.enableSnat) &&
        Objects.equals(this.vpcId, virtualPrivateCloudNatGatewayCreationParams.vpcId) &&
        Objects.equals(this.name, virtualPrivateCloudNatGatewayCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIp, externalSubnetId, dnatRules, enableDnat, enableSnat, vpcId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudNatGatewayCreationParams {\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
    sb.append("    externalSubnetId: ").append(toIndentedString(externalSubnetId)).append("\n");
    sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
    sb.append("    enableDnat: ").append(toIndentedString(enableDnat)).append("\n");
    sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

