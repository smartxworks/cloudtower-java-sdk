package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.NestedConsistencyGroupSnapshot;
import com.smartx.tower.model.NestedIscsiLun;
import com.smartx.tower.model.NestedIscsiTarget;
import com.smartx.tower.model.NestedLabel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IscsiLunSnapshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class IscsiLunSnapshot {
  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT = "consistency_group_snapshot";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT)
  private NestedConsistencyGroupSnapshot consistencyGroupSnapshot;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISCSI_LUN = "iscsi_lun";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN)
  private NestedIscsiLun iscsiLun;

  public static final String SERIALIZED_NAME_ISCSI_TARGET = "iscsi_target";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET)
  private NestedIscsiTarget iscsiTarget;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";
  @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
  private String localCreatedAt;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public IscsiLunSnapshot() { 
  }

  public IscsiLunSnapshot consistencyGroupSnapshot(NestedConsistencyGroupSnapshot consistencyGroupSnapshot) {
    
    this.consistencyGroupSnapshot = consistencyGroupSnapshot;
    return this;
  }

   /**
   * Get consistencyGroupSnapshot
   * @return consistencyGroupSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedConsistencyGroupSnapshot getConsistencyGroupSnapshot() {
    return consistencyGroupSnapshot;
  }


  public void setConsistencyGroupSnapshot(NestedConsistencyGroupSnapshot consistencyGroupSnapshot) {
    this.consistencyGroupSnapshot = consistencyGroupSnapshot;
  }


  public IscsiLunSnapshot entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public IscsiLunSnapshot id(String id) {
    
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


  public IscsiLunSnapshot iscsiLun(NestedIscsiLun iscsiLun) {
    
    this.iscsiLun = iscsiLun;
    return this;
  }

   /**
   * Get iscsiLun
   * @return iscsiLun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedIscsiLun getIscsiLun() {
    return iscsiLun;
  }


  public void setIscsiLun(NestedIscsiLun iscsiLun) {
    this.iscsiLun = iscsiLun;
  }


  public IscsiLunSnapshot iscsiTarget(NestedIscsiTarget iscsiTarget) {
    
    this.iscsiTarget = iscsiTarget;
    return this;
  }

   /**
   * Get iscsiTarget
   * @return iscsiTarget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedIscsiTarget getIscsiTarget() {
    return iscsiTarget;
  }


  public void setIscsiTarget(NestedIscsiTarget iscsiTarget) {
    this.iscsiTarget = iscsiTarget;
  }


  public IscsiLunSnapshot labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public IscsiLunSnapshot addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public IscsiLunSnapshot localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public IscsiLunSnapshot localId(String localId) {
    
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


  public IscsiLunSnapshot name(String name) {
    
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


  public IscsiLunSnapshot uniqueSize(Long uniqueSize) {
    
    this.uniqueSize = uniqueSize;
    return this;
  }

   /**
   * Get uniqueSize
   * @return uniqueSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getUniqueSize() {
    return uniqueSize;
  }


  public void setUniqueSize(Long uniqueSize) {
    this.uniqueSize = uniqueSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunSnapshot iscsiLunSnapshot = (IscsiLunSnapshot) o;
    return Objects.equals(this.consistencyGroupSnapshot, iscsiLunSnapshot.consistencyGroupSnapshot) &&
        Objects.equals(this.entityAsyncStatus, iscsiLunSnapshot.entityAsyncStatus) &&
        Objects.equals(this.id, iscsiLunSnapshot.id) &&
        Objects.equals(this.iscsiLun, iscsiLunSnapshot.iscsiLun) &&
        Objects.equals(this.iscsiTarget, iscsiLunSnapshot.iscsiTarget) &&
        Objects.equals(this.labels, iscsiLunSnapshot.labels) &&
        Objects.equals(this.localCreatedAt, iscsiLunSnapshot.localCreatedAt) &&
        Objects.equals(this.localId, iscsiLunSnapshot.localId) &&
        Objects.equals(this.name, iscsiLunSnapshot.name) &&
        Objects.equals(this.uniqueSize, iscsiLunSnapshot.uniqueSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistencyGroupSnapshot, entityAsyncStatus, id, iscsiLun, iscsiTarget, labels, localCreatedAt, localId, name, uniqueSize);
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
    sb.append("class IscsiLunSnapshot {\n");
    sb.append("    consistencyGroupSnapshot: ").append(toIndentedString(consistencyGroupSnapshot)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iscsiLun: ").append(toIndentedString(iscsiLun)).append("\n");
    sb.append("    iscsiTarget: ").append(toIndentedString(iscsiTarget)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
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

