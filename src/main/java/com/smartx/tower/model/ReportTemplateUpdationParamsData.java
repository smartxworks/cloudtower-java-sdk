package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ExecutePlan;
import com.smartx.tower.model.ResourceMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportTemplateUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ReportTemplateUpdationParamsData {
  public static final String SERIALIZED_NAME_RESOURCE_META = "resource_meta";
  @SerializedName(SERIALIZED_NAME_RESOURCE_META)
  private List<ResourceMeta> resourceMeta = null;

  public static final String SERIALIZED_NAME_EXECUTE_PLAN = "execute_plan";
  @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN)
  private List<ExecutePlan> executePlan = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ReportTemplateUpdationParamsData() { 
  }

  public ReportTemplateUpdationParamsData resourceMeta(List<ResourceMeta> resourceMeta) {
    
    this.resourceMeta = resourceMeta;
    return this;
  }

  public ReportTemplateUpdationParamsData addResourceMetaItem(ResourceMeta resourceMetaItem) {
    if (this.resourceMeta == null) {
      this.resourceMeta = new ArrayList<ResourceMeta>();
    }
    this.resourceMeta.add(resourceMetaItem);
    return this;
  }

   /**
   * Get resourceMeta
   * @return resourceMeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ResourceMeta> getResourceMeta() {
    return resourceMeta;
  }


  public void setResourceMeta(List<ResourceMeta> resourceMeta) {
    this.resourceMeta = resourceMeta;
  }


  public ReportTemplateUpdationParamsData executePlan(List<ExecutePlan> executePlan) {
    
    this.executePlan = executePlan;
    return this;
  }

  public ReportTemplateUpdationParamsData addExecutePlanItem(ExecutePlan executePlanItem) {
    if (this.executePlan == null) {
      this.executePlan = new ArrayList<ExecutePlan>();
    }
    this.executePlan.add(executePlanItem);
    return this;
  }

   /**
   * Get executePlan
   * @return executePlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExecutePlan> getExecutePlan() {
    return executePlan;
  }


  public void setExecutePlan(List<ExecutePlan> executePlan) {
    this.executePlan = executePlan;
  }


  public ReportTemplateUpdationParamsData description(String description) {
    
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


  public ReportTemplateUpdationParamsData name(String name) {
    
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
    ReportTemplateUpdationParamsData reportTemplateUpdationParamsData = (ReportTemplateUpdationParamsData) o;
    return Objects.equals(this.resourceMeta, reportTemplateUpdationParamsData.resourceMeta) &&
        Objects.equals(this.executePlan, reportTemplateUpdationParamsData.executePlan) &&
        Objects.equals(this.description, reportTemplateUpdationParamsData.description) &&
        Objects.equals(this.name, reportTemplateUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceMeta, executePlan, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTemplateUpdationParamsData {\n");
    sb.append("    resourceMeta: ").append(toIndentedString(resourceMeta)).append("\n");
    sb.append("    executePlan: ").append(toIndentedString(executePlan)).append("\n");
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

