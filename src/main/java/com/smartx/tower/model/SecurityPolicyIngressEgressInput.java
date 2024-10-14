package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NetworkPolicyRulePortInput;
import com.smartx.tower.model.SecurityPolicyFlowControlType;
import com.smartx.tower.model.SecurityPolicyIngressEgressInputTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SecurityPolicyIngressEgressInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class SecurityPolicyIngressEgressInput {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SecurityPolicyFlowControlType type;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<NetworkPolicyRulePortInput> ports = null;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private SecurityPolicyIngressEgressInputTarget target;

  public SecurityPolicyIngressEgressInput() { 
  }

  public SecurityPolicyIngressEgressInput type(SecurityPolicyFlowControlType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SecurityPolicyFlowControlType getType() {
    return type;
  }


  public void setType(SecurityPolicyFlowControlType type) {
    this.type = type;
  }


  public SecurityPolicyIngressEgressInput ports(List<NetworkPolicyRulePortInput> ports) {
    
    this.ports = ports;
    return this;
  }

  public SecurityPolicyIngressEgressInput addPortsItem(NetworkPolicyRulePortInput portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<NetworkPolicyRulePortInput>();
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

  public List<NetworkPolicyRulePortInput> getPorts() {
    return ports;
  }


  public void setPorts(List<NetworkPolicyRulePortInput> ports) {
    this.ports = ports;
  }


  public SecurityPolicyIngressEgressInput target(SecurityPolicyIngressEgressInputTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SecurityPolicyIngressEgressInputTarget getTarget() {
    return target;
  }


  public void setTarget(SecurityPolicyIngressEgressInputTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPolicyIngressEgressInput securityPolicyIngressEgressInput = (SecurityPolicyIngressEgressInput) o;
    return Objects.equals(this.type, securityPolicyIngressEgressInput.type) &&
        Objects.equals(this.ports, securityPolicyIngressEgressInput.ports) &&
        Objects.equals(this.target, securityPolicyIngressEgressInput.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, ports, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityPolicyIngressEgressInput {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

