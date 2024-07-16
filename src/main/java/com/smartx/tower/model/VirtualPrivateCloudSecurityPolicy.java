package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedVirtualPrivateCloud;
import com.smartx.tower.model.NestedVirtualPrivateCloudNetworkPolicyRule;
import com.smartx.tower.model.NestedVirtualPrivateCloudSecurityPolicyApply;
import com.smartx.tower.model.VirtualPrivateCloudSecurityPolicyMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudSecurityPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudSecurityPolicy {
  public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";
  @SerializedName(SERIALIZED_NAME_APPLY_TO)
  private List<NestedVirtualPrivateCloudSecurityPolicyApply> applyTo = new ArrayList<NestedVirtualPrivateCloudSecurityPolicyApply>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EGRESS = "egress";
  @SerializedName(SERIALIZED_NAME_EGRESS)
  private List<NestedVirtualPrivateCloudNetworkPolicyRule> egress = null;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<NestedVirtualPrivateCloudNetworkPolicyRule> ingress = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POLICY_MODE = "policy_mode";
  @SerializedName(SERIALIZED_NAME_POLICY_MODE)
  private VirtualPrivateCloudSecurityPolicyMode policyMode;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private NestedVirtualPrivateCloud vpc;

  public VirtualPrivateCloudSecurityPolicy() { 
  }

  public VirtualPrivateCloudSecurityPolicy applyTo(List<NestedVirtualPrivateCloudSecurityPolicyApply> applyTo) {
    
    this.applyTo = applyTo;
    return this;
  }

  public VirtualPrivateCloudSecurityPolicy addApplyToItem(NestedVirtualPrivateCloudSecurityPolicyApply applyToItem) {
    this.applyTo.add(applyToItem);
    return this;
  }

   /**
   * Get applyTo
   * @return applyTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedVirtualPrivateCloudSecurityPolicyApply> getApplyTo() {
    return applyTo;
  }


  public void setApplyTo(List<NestedVirtualPrivateCloudSecurityPolicyApply> applyTo) {
    this.applyTo = applyTo;
  }


  public VirtualPrivateCloudSecurityPolicy description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VirtualPrivateCloudSecurityPolicy egress(List<NestedVirtualPrivateCloudNetworkPolicyRule> egress) {
    
    this.egress = egress;
    return this;
  }

  public VirtualPrivateCloudSecurityPolicy addEgressItem(NestedVirtualPrivateCloudNetworkPolicyRule egressItem) {
    if (this.egress == null) {
      this.egress = new ArrayList<NestedVirtualPrivateCloudNetworkPolicyRule>();
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

  public List<NestedVirtualPrivateCloudNetworkPolicyRule> getEgress() {
    return egress;
  }


  public void setEgress(List<NestedVirtualPrivateCloudNetworkPolicyRule> egress) {
    this.egress = egress;
  }


  public VirtualPrivateCloudSecurityPolicy entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public VirtualPrivateCloudSecurityPolicy id(String id) {
    
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


  public VirtualPrivateCloudSecurityPolicy ingress(List<NestedVirtualPrivateCloudNetworkPolicyRule> ingress) {
    
    this.ingress = ingress;
    return this;
  }

  public VirtualPrivateCloudSecurityPolicy addIngressItem(NestedVirtualPrivateCloudNetworkPolicyRule ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<NestedVirtualPrivateCloudNetworkPolicyRule>();
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

  public List<NestedVirtualPrivateCloudNetworkPolicyRule> getIngress() {
    return ingress;
  }


  public void setIngress(List<NestedVirtualPrivateCloudNetworkPolicyRule> ingress) {
    this.ingress = ingress;
  }


  public VirtualPrivateCloudSecurityPolicy localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public VirtualPrivateCloudSecurityPolicy name(String name) {
    
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


  public VirtualPrivateCloudSecurityPolicy policyMode(VirtualPrivateCloudSecurityPolicyMode policyMode) {
    
    this.policyMode = policyMode;
    return this;
  }

   /**
   * Get policyMode
   * @return policyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VirtualPrivateCloudSecurityPolicyMode getPolicyMode() {
    return policyMode;
  }


  public void setPolicyMode(VirtualPrivateCloudSecurityPolicyMode policyMode) {
    this.policyMode = policyMode;
  }


  public VirtualPrivateCloudSecurityPolicy vpc(NestedVirtualPrivateCloud vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * Get vpc
   * @return vpc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVirtualPrivateCloud getVpc() {
    return vpc;
  }


  public void setVpc(NestedVirtualPrivateCloud vpc) {
    this.vpc = vpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudSecurityPolicy virtualPrivateCloudSecurityPolicy = (VirtualPrivateCloudSecurityPolicy) o;
    return Objects.equals(this.applyTo, virtualPrivateCloudSecurityPolicy.applyTo) &&
        Objects.equals(this.description, virtualPrivateCloudSecurityPolicy.description) &&
        Objects.equals(this.egress, virtualPrivateCloudSecurityPolicy.egress) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudSecurityPolicy.entityAsyncStatus) &&
        Objects.equals(this.id, virtualPrivateCloudSecurityPolicy.id) &&
        Objects.equals(this.ingress, virtualPrivateCloudSecurityPolicy.ingress) &&
        Objects.equals(this.localId, virtualPrivateCloudSecurityPolicy.localId) &&
        Objects.equals(this.name, virtualPrivateCloudSecurityPolicy.name) &&
        Objects.equals(this.policyMode, virtualPrivateCloudSecurityPolicy.policyMode) &&
        Objects.equals(this.vpc, virtualPrivateCloudSecurityPolicy.vpc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyTo, description, egress, entityAsyncStatus, id, ingress, localId, name, policyMode, vpc);
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
    sb.append("class VirtualPrivateCloudSecurityPolicy {\n");
    sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

