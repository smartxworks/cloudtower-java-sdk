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

/**
 * CommonHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class CommonHeader {
  public static final String SERIALIZED_NAME_X_TOWER_REQUEST_ID = "x-tower-request-id";
  @SerializedName(SERIALIZED_NAME_X_TOWER_REQUEST_ID)
  private String xTowerRequestId;

  public CommonHeader() { 
  }

  public CommonHeader xTowerRequestId(String xTowerRequestId) {
    
    this.xTowerRequestId = xTowerRequestId;
    return this;
  }

   /**
   * Get xTowerRequestId
   * @return xTowerRequestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getxTowerRequestId() {
    return xTowerRequestId;
  }


  public void setxTowerRequestId(String xTowerRequestId) {
    this.xTowerRequestId = xTowerRequestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonHeader commonHeader = (CommonHeader) o;
    return Objects.equals(this.xTowerRequestId, commonHeader.xTowerRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xTowerRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonHeader {\n");
    sb.append("    xTowerRequestId: ").append(toIndentedString(xTowerRequestId)).append("\n");
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

