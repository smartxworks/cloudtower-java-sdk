package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedVds;
import com.smartx.tower.model.NestedVirtualPrivateCloudService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudClusterBinding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudClusterBinding {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public static final String SERIALIZED_NAME_VDS = "vds";
  @SerializedName(SERIALIZED_NAME_VDS)
  private NestedVds vds;

  public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";
  @SerializedName(SERIALIZED_NAME_VLAN_ID)
  private Integer vlanId;

  public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";
  @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
  private NestedVirtualPrivateCloudService vpcService;

  public VirtualPrivateCloudClusterBinding() { 
  }

  public VirtualPrivateCloudClusterBinding cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public VirtualPrivateCloudClusterBinding entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudClusterBinding id(String id) {
    
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


  public VirtualPrivateCloudClusterBinding mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  public VirtualPrivateCloudClusterBinding vds(NestedVds vds) {
    
    this.vds = vds;
    return this;
  }

   /**
   * Get vds
   * @return vds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVds getVds() {
    return vds;
  }


  public void setVds(NestedVds vds) {
    this.vds = vds;
  }


  public VirtualPrivateCloudClusterBinding vlanId(Integer vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVlanId() {
    return vlanId;
  }


  public void setVlanId(Integer vlanId) {
    this.vlanId = vlanId;
  }


  public VirtualPrivateCloudClusterBinding vpcService(NestedVirtualPrivateCloudService vpcService) {
    
    this.vpcService = vpcService;
    return this;
  }

   /**
   * Get vpcService
   * @return vpcService
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVirtualPrivateCloudService getVpcService() {
    return vpcService;
  }


  public void setVpcService(NestedVirtualPrivateCloudService vpcService) {
    this.vpcService = vpcService;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudClusterBinding virtualPrivateCloudClusterBinding = (VirtualPrivateCloudClusterBinding) o;
    return Objects.equals(this.cluster, virtualPrivateCloudClusterBinding.cluster) &&
        Objects.equals(this.entityAsyncStatus, virtualPrivateCloudClusterBinding.entityAsyncStatus) &&
        Objects.equals(this.id, virtualPrivateCloudClusterBinding.id) &&
        Objects.equals(this.mtu, virtualPrivateCloudClusterBinding.mtu) &&
        Objects.equals(this.vds, virtualPrivateCloudClusterBinding.vds) &&
        Objects.equals(this.vlanId, virtualPrivateCloudClusterBinding.vlanId) &&
        Objects.equals(this.vpcService, virtualPrivateCloudClusterBinding.vpcService);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, entityAsyncStatus, id, mtu, vds, vlanId, vpcService);
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
    sb.append("class VirtualPrivateCloudClusterBinding {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vpcService: ").append(toIndentedString(vpcService)).append("\n");
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

