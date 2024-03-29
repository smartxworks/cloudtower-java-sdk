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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ClusterImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterImage {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_META_NAME = "meta_name";
  @SerializedName(SERIALIZED_NAME_META_NAME)
  private String metaName;

  public static final String SERIALIZED_NAME_META_SIZE = "meta_size";
  @SerializedName(SERIALIZED_NAME_META_SIZE)
  private Long metaSize;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_UPGRADE_FROM = "upgrade_from";
  @SerializedName(SERIALIZED_NAME_UPGRADE_FROM)
  private List<String> upgradeFrom = new ArrayList<String>();

  public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION = "upgrade_tool_version";
  @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION)
  private String upgradeToolVersion;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ZBS_VERSION = "zbs_version";
  @SerializedName(SERIALIZED_NAME_ZBS_VERSION)
  private String zbsVersion;

  public ClusterImage() { 
  }

  public ClusterImage cluster(NestedCluster cluster) {
    
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


  public ClusterImage entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public ClusterImage id(String id) {
    
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


  public ClusterImage localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public ClusterImage metaName(String metaName) {
    
    this.metaName = metaName;
    return this;
  }

   /**
   * Get metaName
   * @return metaName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMetaName() {
    return metaName;
  }


  public void setMetaName(String metaName) {
    this.metaName = metaName;
  }


  public ClusterImage metaSize(Long metaSize) {
    
    this.metaSize = metaSize;
    return this;
  }

   /**
   * Get metaSize
   * @return metaSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getMetaSize() {
    return metaSize;
  }


  public void setMetaSize(Long metaSize) {
    this.metaSize = metaSize;
  }


  public ClusterImage name(String name) {
    
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


  public ClusterImage size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public ClusterImage upgradeFrom(List<String> upgradeFrom) {
    
    this.upgradeFrom = upgradeFrom;
    return this;
  }

  public ClusterImage addUpgradeFromItem(String upgradeFromItem) {
    this.upgradeFrom.add(upgradeFromItem);
    return this;
  }

   /**
   * Get upgradeFrom
   * @return upgradeFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getUpgradeFrom() {
    return upgradeFrom;
  }


  public void setUpgradeFrom(List<String> upgradeFrom) {
    this.upgradeFrom = upgradeFrom;
  }


  public ClusterImage upgradeToolVersion(String upgradeToolVersion) {
    
    this.upgradeToolVersion = upgradeToolVersion;
    return this;
  }

   /**
   * Get upgradeToolVersion
   * @return upgradeToolVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpgradeToolVersion() {
    return upgradeToolVersion;
  }


  public void setUpgradeToolVersion(String upgradeToolVersion) {
    this.upgradeToolVersion = upgradeToolVersion;
  }


  public ClusterImage version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ClusterImage zbsVersion(String zbsVersion) {
    
    this.zbsVersion = zbsVersion;
    return this;
  }

   /**
   * Get zbsVersion
   * @return zbsVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZbsVersion() {
    return zbsVersion;
  }


  public void setZbsVersion(String zbsVersion) {
    this.zbsVersion = zbsVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterImage clusterImage = (ClusterImage) o;
    return Objects.equals(this.cluster, clusterImage.cluster) &&
        Objects.equals(this.entityAsyncStatus, clusterImage.entityAsyncStatus) &&
        Objects.equals(this.id, clusterImage.id) &&
        Objects.equals(this.localId, clusterImage.localId) &&
        Objects.equals(this.metaName, clusterImage.metaName) &&
        Objects.equals(this.metaSize, clusterImage.metaSize) &&
        Objects.equals(this.name, clusterImage.name) &&
        Objects.equals(this.size, clusterImage.size) &&
        Objects.equals(this.upgradeFrom, clusterImage.upgradeFrom) &&
        Objects.equals(this.upgradeToolVersion, clusterImage.upgradeToolVersion) &&
        Objects.equals(this.version, clusterImage.version) &&
        Objects.equals(this.zbsVersion, clusterImage.zbsVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, entityAsyncStatus, id, localId, metaName, metaSize, name, size, upgradeFrom, upgradeToolVersion, version, zbsVersion);
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
    sb.append("class ClusterImage {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    metaName: ").append(toIndentedString(metaName)).append("\n");
    sb.append("    metaSize: ").append(toIndentedString(metaSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    upgradeFrom: ").append(toIndentedString(upgradeFrom)).append("\n");
    sb.append("    upgradeToolVersion: ").append(toIndentedString(upgradeToolVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    zbsVersion: ").append(toIndentedString(zbsVersion)).append("\n");
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

