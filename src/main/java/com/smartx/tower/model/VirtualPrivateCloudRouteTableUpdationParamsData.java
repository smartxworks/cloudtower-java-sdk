package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudRouteParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualPrivateCloudRouteTableUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudRouteTableUpdationParamsData {
  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<VirtualPrivateCloudRouteParams> routes = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudRouteTableUpdationParamsData() { 
  }

  public VirtualPrivateCloudRouteTableUpdationParamsData routes(List<VirtualPrivateCloudRouteParams> routes) {
    
    this.routes = routes;
    return this;
  }

  public VirtualPrivateCloudRouteTableUpdationParamsData addRoutesItem(VirtualPrivateCloudRouteParams routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<VirtualPrivateCloudRouteParams>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VirtualPrivateCloudRouteParams> getRoutes() {
    return routes;
  }


  public void setRoutes(List<VirtualPrivateCloudRouteParams> routes) {
    this.routes = routes;
  }


  public VirtualPrivateCloudRouteTableUpdationParamsData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VirtualPrivateCloudRouteTableUpdationParamsData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudRouteTableUpdationParamsData virtualPrivateCloudRouteTableUpdationParamsData = (VirtualPrivateCloudRouteTableUpdationParamsData) o;
    return Objects.equals(this.routes, virtualPrivateCloudRouteTableUpdationParamsData.routes) &&
        Objects.equals(this.description, virtualPrivateCloudRouteTableUpdationParamsData.description) &&
        Objects.equals(this.name, virtualPrivateCloudRouteTableUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routes, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudRouteTableUpdationParamsData {\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

