package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ApplicationVmSpec;
import com.smartx.tower.model.ApplicationVmSpecAffinityPolicy;
import com.smartx.tower.model.ApplicationVmSpecPlacement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationVmSpecDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ApplicationVmSpecDefinition {
  public static final String SERIALIZED_NAME_VM_AFFINITY = "vmAffinity";
  @SerializedName(SERIALIZED_NAME_VM_AFFINITY)
  private ApplicationVmSpecAffinityPolicy vmAffinity;

  public static final String SERIALIZED_NAME_PLACEMENT = "placement";
  @SerializedName(SERIALIZED_NAME_PLACEMENT)
  private ApplicationVmSpecPlacement placement;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private ApplicationVmSpec template;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<ApplicationVmSpec> instances = null;

  public ApplicationVmSpecDefinition() { 
  }

  public ApplicationVmSpecDefinition vmAffinity(ApplicationVmSpecAffinityPolicy vmAffinity) {
    
    this.vmAffinity = vmAffinity;
    return this;
  }

   /**
   * Get vmAffinity
   * @return vmAffinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationVmSpecAffinityPolicy getVmAffinity() {
    return vmAffinity;
  }


  public void setVmAffinity(ApplicationVmSpecAffinityPolicy vmAffinity) {
    this.vmAffinity = vmAffinity;
  }


  public ApplicationVmSpecDefinition placement(ApplicationVmSpecPlacement placement) {
    
    this.placement = placement;
    return this;
  }

   /**
   * Get placement
   * @return placement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationVmSpecPlacement getPlacement() {
    return placement;
  }


  public void setPlacement(ApplicationVmSpecPlacement placement) {
    this.placement = placement;
  }


  public ApplicationVmSpecDefinition name(String name) {
    
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


  public ApplicationVmSpecDefinition group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public ApplicationVmSpecDefinition template(ApplicationVmSpec template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationVmSpec getTemplate() {
    return template;
  }


  public void setTemplate(ApplicationVmSpec template) {
    this.template = template;
  }


  public ApplicationVmSpecDefinition instances(List<ApplicationVmSpec> instances) {
    
    this.instances = instances;
    return this;
  }

  public ApplicationVmSpecDefinition addInstancesItem(ApplicationVmSpec instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<ApplicationVmSpec>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ApplicationVmSpec> getInstances() {
    return instances;
  }


  public void setInstances(List<ApplicationVmSpec> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVmSpecDefinition applicationVmSpecDefinition = (ApplicationVmSpecDefinition) o;
    return Objects.equals(this.vmAffinity, applicationVmSpecDefinition.vmAffinity) &&
        Objects.equals(this.placement, applicationVmSpecDefinition.placement) &&
        Objects.equals(this.name, applicationVmSpecDefinition.name) &&
        Objects.equals(this.group, applicationVmSpecDefinition.group) &&
        Objects.equals(this.template, applicationVmSpecDefinition.template) &&
        Objects.equals(this.instances, applicationVmSpecDefinition.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmAffinity, placement, name, group, template, instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVmSpecDefinition {\n");
    sb.append("    vmAffinity: ").append(toIndentedString(vmAffinity)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

