package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.Position;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NodeTopoUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NodeTopoUpdationParamsData {
  public static final String SERIALIZED_NAME_CLUSTER_TOPO_ID = "cluster_topo_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_TOPO_ID)
  private String clusterTopoId;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Position position;

  public static final String SERIALIZED_NAME_BRICK_TOPO_ID = "brick_topo_id";
  @SerializedName(SERIALIZED_NAME_BRICK_TOPO_ID)
  private String brickTopoId;

  public NodeTopoUpdationParamsData() { 
  }

  public NodeTopoUpdationParamsData clusterTopoId(String clusterTopoId) {
    
    this.clusterTopoId = clusterTopoId;
    return this;
  }

   /**
   * Get clusterTopoId
   * @return clusterTopoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterTopoId() {
    return clusterTopoId;
  }


  public void setClusterTopoId(String clusterTopoId) {
    this.clusterTopoId = clusterTopoId;
  }


  public NodeTopoUpdationParamsData position(Position position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Position getPosition() {
    return position;
  }


  public void setPosition(Position position) {
    this.position = position;
  }


  public NodeTopoUpdationParamsData brickTopoId(String brickTopoId) {
    
    this.brickTopoId = brickTopoId;
    return this;
  }

   /**
   * Get brickTopoId
   * @return brickTopoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrickTopoId() {
    return brickTopoId;
  }


  public void setBrickTopoId(String brickTopoId) {
    this.brickTopoId = brickTopoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeTopoUpdationParamsData nodeTopoUpdationParamsData = (NodeTopoUpdationParamsData) o;
    return Objects.equals(this.clusterTopoId, nodeTopoUpdationParamsData.clusterTopoId) &&
        Objects.equals(this.position, nodeTopoUpdationParamsData.position) &&
        Objects.equals(this.brickTopoId, nodeTopoUpdationParamsData.brickTopoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterTopoId, position, brickTopoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeTopoUpdationParamsData {\n");
    sb.append("    clusterTopoId: ").append(toIndentedString(clusterTopoId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    brickTopoId: ").append(toIndentedString(brickTopoId)).append("\n");
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

