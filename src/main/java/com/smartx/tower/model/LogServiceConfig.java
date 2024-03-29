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
 * LogServiceConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class LogServiceConfig {
  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_SERVICE_LIST = "service_list";
  @SerializedName(SERIALIZED_NAME_SERVICE_LIST)
  private List<String> serviceList = new ArrayList<String>();

  public LogServiceConfig() { 
  }

  public LogServiceConfig groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public LogServiceConfig serviceList(List<String> serviceList) {
    
    this.serviceList = serviceList;
    return this;
  }

  public LogServiceConfig addServiceListItem(String serviceListItem) {
    this.serviceList.add(serviceListItem);
    return this;
  }

   /**
   * Get serviceList
   * @return serviceList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getServiceList() {
    return serviceList;
  }


  public void setServiceList(List<String> serviceList) {
    this.serviceList = serviceList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogServiceConfig logServiceConfig = (LogServiceConfig) o;
    return Objects.equals(this.groupName, logServiceConfig.groupName) &&
        Objects.equals(this.serviceList, logServiceConfig.serviceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, serviceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogServiceConfig {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
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

