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
 * LogCollectionServiceGroupParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class LogCollectionServiceGroupParams {
  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<String> services = null;

  public static final String SERIALIZED_NAME_GROUP_NAME = "group_name";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public LogCollectionServiceGroupParams() { 
  }

  public LogCollectionServiceGroupParams services(List<String> services) {
    
    this.services = services;
    return this;
  }

  public LogCollectionServiceGroupParams addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getServices() {
    return services;
  }


  public void setServices(List<String> services) {
    this.services = services;
  }


  public LogCollectionServiceGroupParams groupName(String groupName) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogCollectionServiceGroupParams logCollectionServiceGroupParams = (LogCollectionServiceGroupParams) o;
    return Objects.equals(this.services, logCollectionServiceGroupParams.services) &&
        Objects.equals(this.groupName, logCollectionServiceGroupParams.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogCollectionServiceGroupParams {\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

