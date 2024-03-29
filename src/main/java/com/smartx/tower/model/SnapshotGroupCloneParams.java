package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.SnapshotGroupCloneParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SnapshotGroupCloneParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class SnapshotGroupCloneParams {
  public static final String SERIALIZED_NAME_CLONE = "clone";
  @SerializedName(SERIALIZED_NAME_CLONE)
  private List<SnapshotGroupCloneParam> clone = new ArrayList<SnapshotGroupCloneParam>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public SnapshotGroupCloneParams() { 
  }

  public SnapshotGroupCloneParams clone(List<SnapshotGroupCloneParam> clone) {
    
    this.clone = clone;
    return this;
  }

  public SnapshotGroupCloneParams addCloneItem(SnapshotGroupCloneParam cloneItem) {
    this.clone.add(cloneItem);
    return this;
  }

   /**
   * Get clone
   * @return clone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SnapshotGroupCloneParam> getClone() {
    return clone;
  }


  public void setClone(List<SnapshotGroupCloneParam> clone) {
    this.clone = clone;
  }


  public SnapshotGroupCloneParams id(String id) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotGroupCloneParams snapshotGroupCloneParams = (SnapshotGroupCloneParams) o;
    return Objects.equals(this.clone, snapshotGroupCloneParams.clone) &&
        Objects.equals(this.id, snapshotGroupCloneParams.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clone, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotGroupCloneParams {\n");
    sb.append("    clone: ").append(toIndentedString(clone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

