package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedVirtualPrivateCloudNetworkPolicyRulePort;
import com.smartx.tower.model.NestedVirtualPrivateCloudSecurityGroup;
import com.smartx.tower.model.VirtualPrivateCloudNetworkPolicyRuleType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedVirtualPrivateCloudNetworkPolicyRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedVirtualPrivateCloudNetworkPolicyRule {
  public static final String SERIALIZED_NAME_EXCEPT_IP_BLOCK = "except_ip_block";
  @SerializedName(SERIALIZED_NAME_EXCEPT_IP_BLOCK)
  private List<String> exceptIpBlock = null;

  public static final String SERIALIZED_NAME_IP_BLOCK = "ip_block";
  @SerializedName(SERIALIZED_NAME_IP_BLOCK)
  private String ipBlock;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<NestedVirtualPrivateCloudNetworkPolicyRulePort> ports = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUP = "security_group";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP)
  private NestedVirtualPrivateCloudSecurityGroup securityGroup;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "security_group_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
  private String securityGroupId;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private List<NestedLabel> selector = null;

  public static final String SERIALIZED_NAME_SELECTOR_IDS = "selector_ids";
  @SerializedName(SERIALIZED_NAME_SELECTOR_IDS)
  private List<String> selectorIds = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private VirtualPrivateCloudNetworkPolicyRuleType type;

  public NestedVirtualPrivateCloudNetworkPolicyRule() { 
  }

  public NestedVirtualPrivateCloudNetworkPolicyRule exceptIpBlock(List<String> exceptIpBlock) {
    
    this.exceptIpBlock = exceptIpBlock;
    return this;
  }

  public NestedVirtualPrivateCloudNetworkPolicyRule addExceptIpBlockItem(String exceptIpBlockItem) {
    if (this.exceptIpBlock == null) {
      this.exceptIpBlock = new ArrayList<String>();
    }
    this.exceptIpBlock.add(exceptIpBlockItem);
    return this;
  }

   /**
   * Get exceptIpBlock
   * @return exceptIpBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExceptIpBlock() {
    return exceptIpBlock;
  }


  public void setExceptIpBlock(List<String> exceptIpBlock) {
    this.exceptIpBlock = exceptIpBlock;
  }


  public NestedVirtualPrivateCloudNetworkPolicyRule ipBlock(String ipBlock) {
    
    this.ipBlock = ipBlock;
    return this;
  }

   /**
   * Get ipBlock
   * @return ipBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpBlock() {
    return ipBlock;
  }


  public void setIpBlock(String ipBlock) {
    this.ipBlock = ipBlock;
  }


  public NestedVirtualPrivateCloudNetworkPolicyRule ports(List<NestedVirtualPrivateCloudNetworkPolicyRulePort> ports) {
    
    this.ports = ports;
    return this;
  }

  public NestedVirtualPrivateCloudNetworkPolicyRule addPortsItem(NestedVirtualPrivateCloudNetworkPolicyRulePort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<NestedVirtualPrivateCloudNetworkPolicyRulePort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedVirtualPrivateCloudNetworkPolicyRulePort> getPorts() {
    return ports;
  }


  public void setPorts(List<NestedVirtualPrivateCloudNetworkPolicyRulePort> ports) {
    this.ports = ports;
  }


  public NestedVirtualPrivateCloudNetworkPolicyRule securityGroup(NestedVirtualPrivateCloudSecurityGroup securityGroup) {
    
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVirtualPrivateCloudSecurityGroup getSecurityGroup() {
    return securityGroup;
  }


  public void setSecurityGroup(NestedVirtualPrivateCloudSecurityGroup securityGroup) {
    this.securityGroup = securityGroup;
  }


  public NestedVirtualPrivateCloudNetworkPolicyRule securityGroupId(String securityGroupId) {
    
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecurityGroupId() {
    return securityGroupId;
  }


  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }


  public NestedVirtualPrivateCloudNetworkPolicyRule selector(List<NestedLabel> selector) {
    
    this.selector = selector;
    return this;
  }

  public NestedVirtualPrivateCloudNetworkPolicyRule addSelectorItem(NestedLabel selectorItem) {
    if (this.selector == null) {
      this.selector = new ArrayList<NestedLabel>();
    }
    this.selector.add(selectorItem);
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getSelector() {
    return selector;
  }


  public void setSelector(List<NestedLabel> selector) {
    this.selector = selector;
  }


  public NestedVirtualPrivateCloudNetworkPolicyRule selectorIds(List<String> selectorIds) {
    
    this.selectorIds = selectorIds;
    return this;
  }

  public NestedVirtualPrivateCloudNetworkPolicyRule addSelectorIdsItem(String selectorIdsItem) {
    if (this.selectorIds == null) {
      this.selectorIds = new ArrayList<String>();
    }
    this.selectorIds.add(selectorIdsItem);
    return this;
  }

   /**
   * Get selectorIds
   * @return selectorIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSelectorIds() {
    return selectorIds;
  }


  public void setSelectorIds(List<String> selectorIds) {
    this.selectorIds = selectorIds;
  }


  public NestedVirtualPrivateCloudNetworkPolicyRule type(VirtualPrivateCloudNetworkPolicyRuleType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VirtualPrivateCloudNetworkPolicyRuleType getType() {
    return type;
  }


  public void setType(VirtualPrivateCloudNetworkPolicyRuleType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVirtualPrivateCloudNetworkPolicyRule nestedVirtualPrivateCloudNetworkPolicyRule = (NestedVirtualPrivateCloudNetworkPolicyRule) o;
    return Objects.equals(this.exceptIpBlock, nestedVirtualPrivateCloudNetworkPolicyRule.exceptIpBlock) &&
        Objects.equals(this.ipBlock, nestedVirtualPrivateCloudNetworkPolicyRule.ipBlock) &&
        Objects.equals(this.ports, nestedVirtualPrivateCloudNetworkPolicyRule.ports) &&
        Objects.equals(this.securityGroup, nestedVirtualPrivateCloudNetworkPolicyRule.securityGroup) &&
        Objects.equals(this.securityGroupId, nestedVirtualPrivateCloudNetworkPolicyRule.securityGroupId) &&
        Objects.equals(this.selector, nestedVirtualPrivateCloudNetworkPolicyRule.selector) &&
        Objects.equals(this.selectorIds, nestedVirtualPrivateCloudNetworkPolicyRule.selectorIds) &&
        Objects.equals(this.type, nestedVirtualPrivateCloudNetworkPolicyRule.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptIpBlock, ipBlock, ports, securityGroup, securityGroupId, selector, selectorIds, type);
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
    sb.append("class NestedVirtualPrivateCloudNetworkPolicyRule {\n");
    sb.append("    exceptIpBlock: ").append(toIndentedString(exceptIpBlock)).append("\n");
    sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    selectorIds: ").append(toIndentedString(selectorIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

