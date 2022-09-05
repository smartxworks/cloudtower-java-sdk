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
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedNvmfNamespace;
import com.smartx.tower.model.NestedNvmfSubsystem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NvmfNamespaceSnapshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NvmfNamespaceSnapshot {
  public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT = "consistency_group_snapshot";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT)
  private NestedConsistencyGroupSnapshot consistencyGroupSnapshot;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

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

  public static final String SERIALIZED_NAME_NVMF_NAMESPACE = "nvmf_namespace";
  @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE)
  private NestedNvmfNamespace nvmfNamespace;

  public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";
  @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
  private NestedNvmfSubsystem nvmfSubsystem;

  public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";
  @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
  private Long uniqueSize;

  public NvmfNamespaceSnapshot() { 
  }

  public NvmfNamespaceSnapshot consistencyGroupSnapshot(NestedConsistencyGroupSnapshot consistencyGroupSnapshot) {
    
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


  public NvmfNamespaceSnapshot entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public NvmfNamespaceSnapshot id(String id) {
    
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


  public NvmfNamespaceSnapshot labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public NvmfNamespaceSnapshot addLabelsItem(NestedLabel labelsItem) {
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


  public NvmfNamespaceSnapshot localCreatedAt(String localCreatedAt) {
    
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


  public NvmfNamespaceSnapshot localId(String localId) {
    
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


  public NvmfNamespaceSnapshot name(String name) {
    
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


  public NvmfNamespaceSnapshot nvmfNamespace(NestedNvmfNamespace nvmfNamespace) {
    
    this.nvmfNamespace = nvmfNamespace;
    return this;
  }

   /**
   * Get nvmfNamespace
   * @return nvmfNamespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedNvmfNamespace getNvmfNamespace() {
    return nvmfNamespace;
  }


  public void setNvmfNamespace(NestedNvmfNamespace nvmfNamespace) {
    this.nvmfNamespace = nvmfNamespace;
  }


  public NvmfNamespaceSnapshot nvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
    
    this.nvmfSubsystem = nvmfSubsystem;
    return this;
  }

   /**
   * Get nvmfSubsystem
   * @return nvmfSubsystem
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedNvmfSubsystem getNvmfSubsystem() {
    return nvmfSubsystem;
  }


  public void setNvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
    this.nvmfSubsystem = nvmfSubsystem;
  }


  public NvmfNamespaceSnapshot uniqueSize(Long uniqueSize) {
    
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
    NvmfNamespaceSnapshot nvmfNamespaceSnapshot = (NvmfNamespaceSnapshot) o;
    return Objects.equals(this.consistencyGroupSnapshot, nvmfNamespaceSnapshot.consistencyGroupSnapshot) &&
        Objects.equals(this.entityAsyncStatus, nvmfNamespaceSnapshot.entityAsyncStatus) &&
        Objects.equals(this.id, nvmfNamespaceSnapshot.id) &&
        Objects.equals(this.labels, nvmfNamespaceSnapshot.labels) &&
        Objects.equals(this.localCreatedAt, nvmfNamespaceSnapshot.localCreatedAt) &&
        Objects.equals(this.localId, nvmfNamespaceSnapshot.localId) &&
        Objects.equals(this.name, nvmfNamespaceSnapshot.name) &&
        Objects.equals(this.nvmfNamespace, nvmfNamespaceSnapshot.nvmfNamespace) &&
        Objects.equals(this.nvmfSubsystem, nvmfNamespaceSnapshot.nvmfSubsystem) &&
        Objects.equals(this.uniqueSize, nvmfNamespaceSnapshot.uniqueSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistencyGroupSnapshot, entityAsyncStatus, id, labels, localCreatedAt, localId, name, nvmfNamespace, nvmfSubsystem, uniqueSize);
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
    sb.append("class NvmfNamespaceSnapshot {\n");
    sb.append("    consistencyGroupSnapshot: ").append(toIndentedString(consistencyGroupSnapshot)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nvmfNamespace: ").append(toIndentedString(nvmfNamespace)).append("\n");
    sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
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

