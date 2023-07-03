package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.PolicyMode;
import com.smartx.tower.model.SecurityPolicyApplyToInput;
import com.smartx.tower.model.SecurityPolicyIngressEgressInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SecurityPolicyUpdateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class SecurityPolicyUpdateParams {
  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<SecurityPolicyIngressEgressInput> ingress = null;

  public static final String SERIALIZED_NAME_EGRESS = "egress";
  @SerializedName(SERIALIZED_NAME_EGRESS)
  private List<SecurityPolicyIngressEgressInput> egress = null;

  public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";
  @SerializedName(SERIALIZED_NAME_APPLY_TO)
  private List<SecurityPolicyApplyToInput> applyTo = null;

  public static final String SERIALIZED_NAME_POLICY_MODE = "policy_mode";
  @SerializedName(SERIALIZED_NAME_POLICY_MODE)
  private PolicyMode policyMode;

  public SecurityPolicyUpdateParams() { 
  }

  public SecurityPolicyUpdateParams ingress(List<SecurityPolicyIngressEgressInput> ingress) {
    
    this.ingress = ingress;
    return this;
  }

  public SecurityPolicyUpdateParams addIngressItem(SecurityPolicyIngressEgressInput ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<SecurityPolicyIngressEgressInput>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

   /**
   * Get ingress
   * @return ingress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SecurityPolicyIngressEgressInput> getIngress() {
    return ingress;
  }


  public void setIngress(List<SecurityPolicyIngressEgressInput> ingress) {
    this.ingress = ingress;
  }


  public SecurityPolicyUpdateParams egress(List<SecurityPolicyIngressEgressInput> egress) {
    
    this.egress = egress;
    return this;
  }

  public SecurityPolicyUpdateParams addEgressItem(SecurityPolicyIngressEgressInput egressItem) {
    if (this.egress == null) {
      this.egress = new ArrayList<SecurityPolicyIngressEgressInput>();
    }
    this.egress.add(egressItem);
    return this;
  }

   /**
   * Get egress
   * @return egress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SecurityPolicyIngressEgressInput> getEgress() {
    return egress;
  }


  public void setEgress(List<SecurityPolicyIngressEgressInput> egress) {
    this.egress = egress;
  }


  public SecurityPolicyUpdateParams applyTo(List<SecurityPolicyApplyToInput> applyTo) {
    
    this.applyTo = applyTo;
    return this;
  }

  public SecurityPolicyUpdateParams addApplyToItem(SecurityPolicyApplyToInput applyToItem) {
    if (this.applyTo == null) {
      this.applyTo = new ArrayList<SecurityPolicyApplyToInput>();
    }
    this.applyTo.add(applyToItem);
    return this;
  }

   /**
   * Get applyTo
   * @return applyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SecurityPolicyApplyToInput> getApplyTo() {
    return applyTo;
  }


  public void setApplyTo(List<SecurityPolicyApplyToInput> applyTo) {
    this.applyTo = applyTo;
  }


  public SecurityPolicyUpdateParams policyMode(PolicyMode policyMode) {
    
    this.policyMode = policyMode;
    return this;
  }

   /**
   * Get policyMode
   * @return policyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PolicyMode getPolicyMode() {
    return policyMode;
  }


  public void setPolicyMode(PolicyMode policyMode) {
    this.policyMode = policyMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPolicyUpdateParams securityPolicyUpdateParams = (SecurityPolicyUpdateParams) o;
    return Objects.equals(this.ingress, securityPolicyUpdateParams.ingress) &&
        Objects.equals(this.egress, securityPolicyUpdateParams.egress) &&
        Objects.equals(this.applyTo, securityPolicyUpdateParams.applyTo) &&
        Objects.equals(this.policyMode, securityPolicyUpdateParams.policyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress, egress, applyTo, policyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityPolicyUpdateParams {\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
    sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
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

