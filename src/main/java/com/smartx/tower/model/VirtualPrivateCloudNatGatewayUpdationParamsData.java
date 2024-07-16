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
 * VirtualPrivateCloudNatGatewayUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudNatGatewayUpdationParamsData {
  public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
  private String externalIp;

  public static final String SERIALIZED_NAME_DNAT_RULES = "dnat_rules";
  @SerializedName(SERIALIZED_NAME_DNAT_RULES)
  private List<VirtualPrivateCloudDnatRuleParams> dnatRules = null;

  public static final String SERIALIZED_NAME_ENABLE_DNAT = "enable_dnat";
  @SerializedName(SERIALIZED_NAME_ENABLE_DNAT)
  private Boolean enableDnat;

  public static final String SERIALIZED_NAME_ENABLE_SNAT = "enable_snat";
  @SerializedName(SERIALIZED_NAME_ENABLE_SNAT)
  private Boolean enableSnat;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudNatGatewayUpdationParamsData() { 
  }

  public VirtualPrivateCloudNatGatewayUpdationParamsData externalIp(String externalIp) {
    
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


  public VirtualPrivateCloudNatGatewayUpdationParamsData dnatRules(List<VirtualPrivateCloudDnatRuleParams> dnatRules) {
    
    this.dnatRules = dnatRules;
    return this;
  }

  public VirtualPrivateCloudNatGatewayUpdationParamsData addDnatRulesItem(VirtualPrivateCloudDnatRuleParams dnatRulesItem) {
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


  public VirtualPrivateCloudNatGatewayUpdationParamsData enableDnat(Boolean enableDnat) {
    
    this.enableDnat = enableDnat;
    return this;
  }

   /**
   * Get enableDnat
   * @return enableDnat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableDnat() {
    return enableDnat;
  }


  public void setEnableDnat(Boolean enableDnat) {
    this.enableDnat = enableDnat;
  }


  public VirtualPrivateCloudNatGatewayUpdationParamsData enableSnat(Boolean enableSnat) {
    
    this.enableSnat = enableSnat;
    return this;
  }

   /**
   * Get enableSnat
   * @return enableSnat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableSnat() {
    return enableSnat;
  }


  public void setEnableSnat(Boolean enableSnat) {
    this.enableSnat = enableSnat;
  }


  public VirtualPrivateCloudNatGatewayUpdationParamsData name(String name) {
    
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
    VirtualPrivateCloudNatGatewayUpdationParamsData virtualPrivateCloudNatGatewayUpdationParamsData = (VirtualPrivateCloudNatGatewayUpdationParamsData) o;
    return Objects.equals(this.externalIp, virtualPrivateCloudNatGatewayUpdationParamsData.externalIp) &&
        Objects.equals(this.dnatRules, virtualPrivateCloudNatGatewayUpdationParamsData.dnatRules) &&
        Objects.equals(this.enableDnat, virtualPrivateCloudNatGatewayUpdationParamsData.enableDnat) &&
        Objects.equals(this.enableSnat, virtualPrivateCloudNatGatewayUpdationParamsData.enableSnat) &&
        Objects.equals(this.name, virtualPrivateCloudNatGatewayUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIp, dnatRules, enableDnat, enableSnat, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudNatGatewayUpdationParamsData {\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
    sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
    sb.append("    enableDnat: ").append(toIndentedString(enableDnat)).append("\n");
    sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
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

