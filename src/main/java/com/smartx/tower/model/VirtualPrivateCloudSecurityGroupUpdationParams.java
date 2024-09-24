package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudSecurityGroupUpdationParamsData;
import com.smartx.tower.model.VirtualPrivateCloudSecurityGroupWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VirtualPrivateCloudSecurityGroupUpdationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudSecurityGroupUpdationParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VirtualPrivateCloudSecurityGroupUpdationParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VirtualPrivateCloudSecurityGroupWhereInput where;

  public VirtualPrivateCloudSecurityGroupUpdationParams() { 
  }

  public VirtualPrivateCloudSecurityGroupUpdationParams data(VirtualPrivateCloudSecurityGroupUpdationParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VirtualPrivateCloudSecurityGroupUpdationParamsData getData() {
    return data;
  }


  public void setData(VirtualPrivateCloudSecurityGroupUpdationParamsData data) {
    this.data = data;
  }


  public VirtualPrivateCloudSecurityGroupUpdationParams where(VirtualPrivateCloudSecurityGroupWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VirtualPrivateCloudSecurityGroupWhereInput getWhere() {
    return where;
  }


  public void setWhere(VirtualPrivateCloudSecurityGroupWhereInput where) {
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
    VirtualPrivateCloudSecurityGroupUpdationParams virtualPrivateCloudSecurityGroupUpdationParams = (VirtualPrivateCloudSecurityGroupUpdationParams) o;
    return Objects.equals(this.data, virtualPrivateCloudSecurityGroupUpdationParams.data) &&
        Objects.equals(this.where, virtualPrivateCloudSecurityGroupUpdationParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudSecurityGroupUpdationParams {\n");
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

