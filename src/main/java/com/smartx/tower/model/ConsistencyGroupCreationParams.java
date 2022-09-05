package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConsistencyGroupCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ConsistencyGroupCreationParams {
  public static final String SERIALIZED_NAME_NAMESPACES_IDS = "namespaces_ids";
  @SerializedName(SERIALIZED_NAME_NAMESPACES_IDS)
  private List<String> namespacesIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ISCSI_LUNS_IDS = "iscsi_luns_ids";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_IDS)
  private List<String> iscsiLunsIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ConsistencyGroupCreationParams() { 
  }

  public ConsistencyGroupCreationParams namespacesIds(List<String> namespacesIds) {
    
    this.namespacesIds = namespacesIds;
    return this;
  }

  public ConsistencyGroupCreationParams addNamespacesIdsItem(String namespacesIdsItem) {
    this.namespacesIds.add(namespacesIdsItem);
    return this;
  }

   /**
   * Get namespacesIds
   * @return namespacesIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getNamespacesIds() {
    return namespacesIds;
  }


  public void setNamespacesIds(List<String> namespacesIds) {
    this.namespacesIds = namespacesIds;
  }


  public ConsistencyGroupCreationParams iscsiLunsIds(List<String> iscsiLunsIds) {
    
    this.iscsiLunsIds = iscsiLunsIds;
    return this;
  }

  public ConsistencyGroupCreationParams addIscsiLunsIdsItem(String iscsiLunsIdsItem) {
    this.iscsiLunsIds.add(iscsiLunsIdsItem);
    return this;
  }

   /**
   * Get iscsiLunsIds
   * @return iscsiLunsIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getIscsiLunsIds() {
    return iscsiLunsIds;
  }


  public void setIscsiLunsIds(List<String> iscsiLunsIds) {
    this.iscsiLunsIds = iscsiLunsIds;
  }


  public ConsistencyGroupCreationParams description(String description) {
    
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


  public ConsistencyGroupCreationParams clusterId(String clusterId) {
    
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


  public ConsistencyGroupCreationParams name(String name) {
    
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
    ConsistencyGroupCreationParams consistencyGroupCreationParams = (ConsistencyGroupCreationParams) o;
    return Objects.equals(this.namespacesIds, consistencyGroupCreationParams.namespacesIds) &&
        Objects.equals(this.iscsiLunsIds, consistencyGroupCreationParams.iscsiLunsIds) &&
        Objects.equals(this.description, consistencyGroupCreationParams.description) &&
        Objects.equals(this.clusterId, consistencyGroupCreationParams.clusterId) &&
        Objects.equals(this.name, consistencyGroupCreationParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespacesIds, iscsiLunsIds, description, clusterId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyGroupCreationParams {\n");
    sb.append("    namespacesIds: ").append(toIndentedString(namespacesIds)).append("\n");
    sb.append("    iscsiLunsIds: ").append(toIndentedString(iscsiLunsIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

