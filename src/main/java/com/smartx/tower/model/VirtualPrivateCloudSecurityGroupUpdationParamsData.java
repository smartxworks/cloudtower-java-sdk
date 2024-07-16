package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.LabelGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualPrivateCloudSecurityGroupUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudSecurityGroupUpdationParamsData {
  public static final String SERIALIZED_NAME_VM_IDS = "vm_ids";
  @SerializedName(SERIALIZED_NAME_VM_IDS)
  private List<String> vmIds = null;

  public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";
  @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
  private List<LabelGroup> labelGroups = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public VirtualPrivateCloudSecurityGroupUpdationParamsData() { 
  }

  public VirtualPrivateCloudSecurityGroupUpdationParamsData vmIds(List<String> vmIds) {
    
    this.vmIds = vmIds;
    return this;
  }

  public VirtualPrivateCloudSecurityGroupUpdationParamsData addVmIdsItem(String vmIdsItem) {
    if (this.vmIds == null) {
      this.vmIds = new ArrayList<String>();
    }
    this.vmIds.add(vmIdsItem);
    return this;
  }

   /**
   * Get vmIds
   * @return vmIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVmIds() {
    return vmIds;
  }


  public void setVmIds(List<String> vmIds) {
    this.vmIds = vmIds;
  }


  public VirtualPrivateCloudSecurityGroupUpdationParamsData labelGroups(List<LabelGroup> labelGroups) {
    
    this.labelGroups = labelGroups;
    return this;
  }

  public VirtualPrivateCloudSecurityGroupUpdationParamsData addLabelGroupsItem(LabelGroup labelGroupsItem) {
    if (this.labelGroups == null) {
      this.labelGroups = new ArrayList<LabelGroup>();
    }
    this.labelGroups.add(labelGroupsItem);
    return this;
  }

   /**
   * Get labelGroups
   * @return labelGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LabelGroup> getLabelGroups() {
    return labelGroups;
  }


  public void setLabelGroups(List<LabelGroup> labelGroups) {
    this.labelGroups = labelGroups;
  }


  public VirtualPrivateCloudSecurityGroupUpdationParamsData description(String description) {
    
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


  public VirtualPrivateCloudSecurityGroupUpdationParamsData name(String name) {
    
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
    VirtualPrivateCloudSecurityGroupUpdationParamsData virtualPrivateCloudSecurityGroupUpdationParamsData = (VirtualPrivateCloudSecurityGroupUpdationParamsData) o;
    return Objects.equals(this.vmIds, virtualPrivateCloudSecurityGroupUpdationParamsData.vmIds) &&
        Objects.equals(this.labelGroups, virtualPrivateCloudSecurityGroupUpdationParamsData.labelGroups) &&
        Objects.equals(this.description, virtualPrivateCloudSecurityGroupUpdationParamsData.description) &&
        Objects.equals(this.name, virtualPrivateCloudSecurityGroupUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmIds, labelGroups, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudSecurityGroupUpdationParamsData {\n");
    sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
    sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
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

