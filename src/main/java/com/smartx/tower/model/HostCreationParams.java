package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.HostAuthInfo;
import com.smartx.tower.model.HostCreationParamsData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HostCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class HostCreationParams {
  public static final String SERIALIZED_NAME_AUTH_INFO = "auth_info";
  @SerializedName(SERIALIZED_NAME_AUTH_INFO)
  private HostAuthInfo authInfo;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<HostCreationParamsData> data = new ArrayList<HostCreationParamsData>();

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public HostCreationParams() { 
  }

  public HostCreationParams authInfo(HostAuthInfo authInfo) {
    
    this.authInfo = authInfo;
    return this;
  }

   /**
   * Get authInfo
   * @return authInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostAuthInfo getAuthInfo() {
    return authInfo;
  }


  public void setAuthInfo(HostAuthInfo authInfo) {
    this.authInfo = authInfo;
  }


  public HostCreationParams data(List<HostCreationParamsData> data) {
    
    this.data = data;
    return this;
  }

  public HostCreationParams addDataItem(HostCreationParamsData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<HostCreationParamsData> getData() {
    return data;
  }


  public void setData(List<HostCreationParamsData> data) {
    this.data = data;
  }


  public HostCreationParams clusterId(String clusterId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostCreationParams hostCreationParams = (HostCreationParams) o;
    return Objects.equals(this.authInfo, hostCreationParams.authInfo) &&
        Objects.equals(this.data, hostCreationParams.data) &&
        Objects.equals(this.clusterId, hostCreationParams.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authInfo, data, clusterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostCreationParams {\n");
    sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

