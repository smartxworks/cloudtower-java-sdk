package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedEverouteCluster;
import com.smartx.tower.model.NestedNetworkPolicyRule;
import com.smartx.tower.model.NestedSecurityPolicyApply;
import com.smartx.tower.model.PolicyMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SecurityPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class SecurityPolicy {
  public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";
  @SerializedName(SERIALIZED_NAME_APPLY_TO)
  private List<NestedSecurityPolicyApply> applyTo = new ArrayList<NestedSecurityPolicyApply>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EGRESS = "egress";
  @SerializedName(SERIALIZED_NAME_EGRESS)
  private List<NestedNetworkPolicyRule> egress = null;

  public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";
  @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
  private NestedEverouteCluster everouteCluster;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<NestedNetworkPolicyRule> ingress = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POLICY_MODE = "policy_mode";
  @SerializedName(SERIALIZED_NAME_POLICY_MODE)
  private PolicyMode policyMode;

  public SecurityPolicy() { 
  }

  public SecurityPolicy applyTo(List<NestedSecurityPolicyApply> applyTo) {
    
    this.applyTo = applyTo;
    return this;
  }

  public SecurityPolicy addApplyToItem(NestedSecurityPolicyApply applyToItem) {
    this.applyTo.add(applyToItem);
    return this;
  }

   /**
   * Get applyTo
   * @return applyTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedSecurityPolicyApply> getApplyTo() {
    return applyTo;
  }


  public void setApplyTo(List<NestedSecurityPolicyApply> applyTo) {
    this.applyTo = applyTo;
  }


  public SecurityPolicy description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SecurityPolicy egress(List<NestedNetworkPolicyRule> egress) {
    
    this.egress = egress;
    return this;
  }

  public SecurityPolicy addEgressItem(NestedNetworkPolicyRule egressItem) {
    if (this.egress == null) {
      this.egress = new ArrayList<NestedNetworkPolicyRule>();
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

  public List<NestedNetworkPolicyRule> getEgress() {
    return egress;
  }


  public void setEgress(List<NestedNetworkPolicyRule> egress) {
    this.egress = egress;
  }


  public SecurityPolicy everouteCluster(NestedEverouteCluster everouteCluster) {
    
    this.everouteCluster = everouteCluster;
    return this;
  }

   /**
   * Get everouteCluster
   * @return everouteCluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedEverouteCluster getEverouteCluster() {
    return everouteCluster;
  }


  public void setEverouteCluster(NestedEverouteCluster everouteCluster) {
    this.everouteCluster = everouteCluster;
  }


  public SecurityPolicy id(String id) {
    
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


  public SecurityPolicy ingress(List<NestedNetworkPolicyRule> ingress) {
    
    this.ingress = ingress;
    return this;
  }

  public SecurityPolicy addIngressItem(NestedNetworkPolicyRule ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<NestedNetworkPolicyRule>();
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

  public List<NestedNetworkPolicyRule> getIngress() {
    return ingress;
  }


  public void setIngress(List<NestedNetworkPolicyRule> ingress) {
    this.ingress = ingress;
  }


  public SecurityPolicy name(String name) {
    
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


  public SecurityPolicy policyMode(PolicyMode policyMode) {
    
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
    SecurityPolicy securityPolicy = (SecurityPolicy) o;
    return Objects.equals(this.applyTo, securityPolicy.applyTo) &&
        Objects.equals(this.description, securityPolicy.description) &&
        Objects.equals(this.egress, securityPolicy.egress) &&
        Objects.equals(this.everouteCluster, securityPolicy.everouteCluster) &&
        Objects.equals(this.id, securityPolicy.id) &&
        Objects.equals(this.ingress, securityPolicy.ingress) &&
        Objects.equals(this.name, securityPolicy.name) &&
        Objects.equals(this.policyMode, securityPolicy.policyMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyTo, description, egress, everouteCluster, id, ingress, name, policyMode);
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
    sb.append("class SecurityPolicy {\n");
    sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

