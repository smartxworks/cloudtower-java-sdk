package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.AddClustersToDatacenterParamsData;
import com.smartx.tower.model.DatacenterWhereUniqueInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RemoveClustersFromDatacenterParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class RemoveClustersFromDatacenterParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AddClustersToDatacenterParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private DatacenterWhereUniqueInput where;

  public RemoveClustersFromDatacenterParams() { 
  }

  public RemoveClustersFromDatacenterParams data(AddClustersToDatacenterParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddClustersToDatacenterParamsData getData() {
    return data;
  }


  public void setData(AddClustersToDatacenterParamsData data) {
    this.data = data;
  }


  public RemoveClustersFromDatacenterParams where(DatacenterWhereUniqueInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DatacenterWhereUniqueInput getWhere() {
    return where;
  }


  public void setWhere(DatacenterWhereUniqueInput where) {
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
    RemoveClustersFromDatacenterParams removeClustersFromDatacenterParams = (RemoveClustersFromDatacenterParams) o;
    return Objects.equals(this.data, removeClustersFromDatacenterParams.data) &&
        Objects.equals(this.where, removeClustersFromDatacenterParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveClustersFromDatacenterParams {\n");
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

