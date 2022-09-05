package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NvmfSubsystemPolicyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NvmfSubsystemCreationParamsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NvmfSubsystemCreationParamsAllOf {
  public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";
  @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
  private Integer replicaNum;

  public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";
  @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
  private Boolean thinProvision;

  public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";
  @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
  private Long stripeSize;

  public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";
  @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
  private Integer stripeNum;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private NvmfSubsystemPolicyType policy;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public NvmfSubsystemCreationParamsAllOf() { 
  }

  public NvmfSubsystemCreationParamsAllOf replicaNum(Integer replicaNum) {
    
    this.replicaNum = replicaNum;
    return this;
  }

   /**
   * Get replicaNum
   * @return replicaNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getReplicaNum() {
    return replicaNum;
  }


  public void setReplicaNum(Integer replicaNum) {
    this.replicaNum = replicaNum;
  }


  public NvmfSubsystemCreationParamsAllOf thinProvision(Boolean thinProvision) {
    
    this.thinProvision = thinProvision;
    return this;
  }

   /**
   * Get thinProvision
   * @return thinProvision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getThinProvision() {
    return thinProvision;
  }


  public void setThinProvision(Boolean thinProvision) {
    this.thinProvision = thinProvision;
  }


  public NvmfSubsystemCreationParamsAllOf stripeSize(Long stripeSize) {
    
    this.stripeSize = stripeSize;
    return this;
  }

   /**
   * Get stripeSize
   * @return stripeSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getStripeSize() {
    return stripeSize;
  }


  public void setStripeSize(Long stripeSize) {
    this.stripeSize = stripeSize;
  }


  public NvmfSubsystemCreationParamsAllOf stripeNum(Integer stripeNum) {
    
    this.stripeNum = stripeNum;
    return this;
  }

   /**
   * Get stripeNum
   * @return stripeNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStripeNum() {
    return stripeNum;
  }


  public void setStripeNum(Integer stripeNum) {
    this.stripeNum = stripeNum;
  }


  public NvmfSubsystemCreationParamsAllOf policy(NvmfSubsystemPolicyType policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NvmfSubsystemPolicyType getPolicy() {
    return policy;
  }


  public void setPolicy(NvmfSubsystemPolicyType policy) {
    this.policy = policy;
  }


  public NvmfSubsystemCreationParamsAllOf clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public NvmfSubsystemCreationParamsAllOf name(String name) {
    
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
    NvmfSubsystemCreationParamsAllOf nvmfSubsystemCreationParamsAllOf = (NvmfSubsystemCreationParamsAllOf) o;
    return Objects.equals(this.replicaNum, nvmfSubsystemCreationParamsAllOf.replicaNum) &&
        Objects.equals(this.thinProvision, nvmfSubsystemCreationParamsAllOf.thinProvision) &&
        Objects.equals(this.stripeSize, nvmfSubsystemCreationParamsAllOf.stripeSize) &&
        Objects.equals(this.stripeNum, nvmfSubsystemCreationParamsAllOf.stripeNum) &&
        Objects.equals(this.policy, nvmfSubsystemCreationParamsAllOf.policy) &&
        Objects.equals(this.clusterId, nvmfSubsystemCreationParamsAllOf.clusterId) &&
        Objects.equals(this.name, nvmfSubsystemCreationParamsAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicaNum, thinProvision, stripeSize, stripeNum, policy, clusterId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NvmfSubsystemCreationParamsAllOf {\n");
    sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
    sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
    sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
    sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

