package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudRouterGatewayRuleInputType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualPrivateCloudRouterGatewayCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudRouterGatewayCreationParams {
  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<VirtualPrivateCloudRouterGatewayRuleInputType> rules = new ArrayList<VirtualPrivateCloudRouterGatewayRuleInputType>();

  public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS = "associated_subnets_ids";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS)
  private List<String> associatedSubnetsIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
  private String externalIp;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_ID = "external_subnet_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_ID)
  private String externalSubnetId;

  public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";
  @SerializedName(SERIALIZED_NAME_VPC_ID)
  private String vpcId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudRouterGatewayCreationParams() { 
  }

  public VirtualPrivateCloudRouterGatewayCreationParams rules(List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {
    
    this.rules = rules;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayCreationParams addRulesItem(VirtualPrivateCloudRouterGatewayRuleInputType rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VirtualPrivateCloudRouterGatewayRuleInputType> getRules() {
    return rules;
  }


  public void setRules(List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {
    this.rules = rules;
  }


  public VirtualPrivateCloudRouterGatewayCreationParams associatedSubnetsIds(List<String> associatedSubnetsIds) {
    
    this.associatedSubnetsIds = associatedSubnetsIds;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayCreationParams addAssociatedSubnetsIdsItem(String associatedSubnetsIdsItem) {
    this.associatedSubnetsIds.add(associatedSubnetsIdsItem);
    return this;
  }

   /**
   * Get associatedSubnetsIds
   * @return associatedSubnetsIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAssociatedSubnetsIds() {
    return associatedSubnetsIds;
  }


  public void setAssociatedSubnetsIds(List<String> associatedSubnetsIds) {
    this.associatedSubnetsIds = associatedSubnetsIds;
  }


  public VirtualPrivateCloudRouterGatewayCreationParams externalIp(String externalIp) {
    
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


  public VirtualPrivateCloudRouterGatewayCreationParams externalSubnetId(String externalSubnetId) {
    
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


  public VirtualPrivateCloudRouterGatewayCreationParams vpcId(String vpcId) {
    
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


  public VirtualPrivateCloudRouterGatewayCreationParams name(String name) {
    
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
    VirtualPrivateCloudRouterGatewayCreationParams virtualPrivateCloudRouterGatewayCreationParams = (VirtualPrivateCloudRouterGatewayCreationParams) o;
    return Objects.equals(this.rules, virtualPrivateCloudRouterGatewayCreationParams.rules) &&
        Objects.equals(this.associatedSubnetsIds, virtualPrivateCloudRouterGatewayCreationParams.associatedSubnetsIds) &&
        Objects.equals(this.externalIp, virtualPrivateCloudRouterGatewayCreationParams.externalIp) &&
        Objects.equals(this.externalSubnetId, virtualPrivateCloudRouterGatewayCreationParams.externalSubnetId) &&
        Objects.equals(this.vpcId, virtualPrivateCloudRouterGatewayCreationParams.vpcId) &&
        Objects.equals(this.name, virtualPrivateCloudRouterGatewayCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, associatedSubnetsIds, externalIp, externalSubnetId, vpcId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudRouterGatewayCreationParams {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    associatedSubnetsIds: ").append(toIndentedString(associatedSubnetsIds)).append("\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
    sb.append("    externalSubnetId: ").append(toIndentedString(externalSubnetId)).append("\n");
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

