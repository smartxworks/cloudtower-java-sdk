package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.GlobalAlertRuleUpdationParamsData;
import com.smartx.tower.model.GlobalAlertRuleWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GlobalAlertRuleUpdationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GlobalAlertRuleUpdationParams {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private GlobalAlertRuleUpdationParamsData data;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private GlobalAlertRuleWhereInput where;

  public GlobalAlertRuleUpdationParams() { 
  }

  public GlobalAlertRuleUpdationParams data(GlobalAlertRuleUpdationParamsData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GlobalAlertRuleUpdationParamsData getData() {
    return data;
  }


  public void setData(GlobalAlertRuleUpdationParamsData data) {
    this.data = data;
  }


  public GlobalAlertRuleUpdationParams where(GlobalAlertRuleWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GlobalAlertRuleWhereInput getWhere() {
    return where;
  }


  public void setWhere(GlobalAlertRuleWhereInput where) {
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
    GlobalAlertRuleUpdationParams globalAlertRuleUpdationParams = (GlobalAlertRuleUpdationParams) o;
    return Objects.equals(this.data, globalAlertRuleUpdationParams.data) &&
        Objects.equals(this.where, globalAlertRuleUpdationParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalAlertRuleUpdationParams {\n");
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

