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
 * VirtualPrivateCloudRouterGatewayUpdateDataParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudRouterGatewayUpdateDataParams {
  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<VirtualPrivateCloudRouterGatewayRuleInputType> rules = null;

  public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS = "associated_subnets_ids";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS)
  private List<String> associatedSubnetsIds = null;

  public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
  private String externalIp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudRouterGatewayUpdateDataParams() { 
  }

  public VirtualPrivateCloudRouterGatewayUpdateDataParams rules(List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {
    
    this.rules = rules;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayUpdateDataParams addRulesItem(VirtualPrivateCloudRouterGatewayRuleInputType rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<VirtualPrivateCloudRouterGatewayRuleInputType>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualPrivateCloudRouterGatewayRuleInputType> getRules() {
    return rules;
  }


  public void setRules(List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {
    this.rules = rules;
  }


  public VirtualPrivateCloudRouterGatewayUpdateDataParams associatedSubnetsIds(List<String> associatedSubnetsIds) {
    
    this.associatedSubnetsIds = associatedSubnetsIds;
    return this;
  }

  public VirtualPrivateCloudRouterGatewayUpdateDataParams addAssociatedSubnetsIdsItem(String associatedSubnetsIdsItem) {
    if (this.associatedSubnetsIds == null) {
      this.associatedSubnetsIds = new ArrayList<String>();
    }
    this.associatedSubnetsIds.add(associatedSubnetsIdsItem);
    return this;
  }

   /**
   * Get associatedSubnetsIds
   * @return associatedSubnetsIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAssociatedSubnetsIds() {
    return associatedSubnetsIds;
  }


  public void setAssociatedSubnetsIds(List<String> associatedSubnetsIds) {
    this.associatedSubnetsIds = associatedSubnetsIds;
  }


  public VirtualPrivateCloudRouterGatewayUpdateDataParams externalIp(String externalIp) {
    
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


  public VirtualPrivateCloudRouterGatewayUpdateDataParams name(String name) {
    
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
    VirtualPrivateCloudRouterGatewayUpdateDataParams virtualPrivateCloudRouterGatewayUpdateDataParams = (VirtualPrivateCloudRouterGatewayUpdateDataParams) o;
    return Objects.equals(this.rules, virtualPrivateCloudRouterGatewayUpdateDataParams.rules) &&
        Objects.equals(this.associatedSubnetsIds, virtualPrivateCloudRouterGatewayUpdateDataParams.associatedSubnetsIds) &&
        Objects.equals(this.externalIp, virtualPrivateCloudRouterGatewayUpdateDataParams.externalIp) &&
        Objects.equals(this.name, virtualPrivateCloudRouterGatewayUpdateDataParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, associatedSubnetsIds, externalIp, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudRouterGatewayUpdateDataParams {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    associatedSubnetsIds: ").append(toIndentedString(associatedSubnetsIds)).append("\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
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

