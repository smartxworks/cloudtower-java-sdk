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
import com.smartx.tower.model.NestedVirtualPrivateCloudExternalSubnet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudFloatingIp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudFloatingIp {
  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
  private String externalIp;

  public static final String SERIALIZED_NAME_EXTERNAL_SUBNET = "external_subnet";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET)
  private NestedVirtualPrivateCloudExternalSubnet externalSubnet;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_VPC = "vpc";
  @SerializedName(SERIALIZED_NAME_VPC)
  private NestedVirtualPrivateCloud vpc;

  public VirtualPrivateCloudFloatingIp() { 
  }

  public VirtualPrivateCloudFloatingIp entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public VirtualPrivateCloudFloatingIp externalIp(String externalIp) {
    
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


  public VirtualPrivateCloudFloatingIp externalSubnet(NestedVirtualPrivateCloudExternalSubnet externalSubnet) {
    
    this.externalSubnet = externalSubnet;
    return this;
  }

   /**
   * Get externalSubnet
   * @return externalSubnet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVirtualPrivateCloudExternalSubnet getExternalSubnet() {
    return externalSubnet;
  }


  public void setExternalSubnet(NestedVirtualPrivateCloudExternalSubnet externalSubnet) {
    this.externalSubnet = externalSubnet;
  }


  public VirtualPrivateCloudFloatingIp id(String id) {
    
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


  public VirtualPrivateCloudFloatingIp localId(String localId) {
    
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


  public VirtualPrivateCloudFloatingIp vpc(NestedVirtualPrivateCloud vpc) {
    
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
    VirtualPrivateCloudFloatingIp virtualPrivateCloudFloatingIp = (VirtualPrivateCloudFloatingIp) o;
    return Objects.equals(this.entityAsyncStatus, virtualPrivateCloudFloatingIp.entityAsyncStatus) &&
        Objects.equals(this.externalIp, virtualPrivateCloudFloatingIp.externalIp) &&
        Objects.equals(this.externalSubnet, virtualPrivateCloudFloatingIp.externalSubnet) &&
        Objects.equals(this.id, virtualPrivateCloudFloatingIp.id) &&
        Objects.equals(this.localId, virtualPrivateCloudFloatingIp.localId) &&
        Objects.equals(this.vpc, virtualPrivateCloudFloatingIp.vpc);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityAsyncStatus, externalIp, externalSubnet, id, localId, vpc);
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
    sb.append("class VirtualPrivateCloudFloatingIp {\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
    sb.append("    externalSubnet: ").append(toIndentedString(externalSubnet)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
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

