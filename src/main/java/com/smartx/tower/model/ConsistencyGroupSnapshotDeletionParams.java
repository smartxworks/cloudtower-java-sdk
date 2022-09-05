package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ConsistencyGroupSnapshotDeletionParamsData;
import com.smartx.tower.model.ConsistencyGroupSnapshotWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConsistencyGroupSnapshotDeletionParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ConsistencyGroupSnapshotDeletionParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ConsistencyGroupSnapshotDeletionParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private ConsistencyGroupSnapshotWhereInput where;

  public ConsistencyGroupSnapshotDeletionParams() { 
  }

  public ConsistencyGroupSnapshotDeletionParams data(ConsistencyGroupSnapshotDeletionParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConsistencyGroupSnapshotDeletionParamsData getData() {
    return data;
  }


  public void setData(ConsistencyGroupSnapshotDeletionParamsData data) {
    this.data = data;
  }


  public ConsistencyGroupSnapshotDeletionParams where(ConsistencyGroupSnapshotWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConsistencyGroupSnapshotWhereInput getWhere() {
    return where;
  }


  public void setWhere(ConsistencyGroupSnapshotWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams = (ConsistencyGroupSnapshotDeletionParams) o;
    return Objects.equals(this.data, consistencyGroupSnapshotDeletionParams.data) &&
        Objects.equals(this.where, consistencyGroupSnapshotDeletionParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistencyGroupSnapshotDeletionParams {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

