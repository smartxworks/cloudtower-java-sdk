package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.LabelWhereInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SecurityGroupUpdateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class SecurityGroupUpdateParams {
  public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";
  @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
  private List<LabelWhereInput> labelGroups = null;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private VmWhereInput vms;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SecurityGroupUpdateParams() { 
  }

  public SecurityGroupUpdateParams labelGroups(List<LabelWhereInput> labelGroups) {
    
    this.labelGroups = labelGroups;
    return this;
  }

  public SecurityGroupUpdateParams addLabelGroupsItem(LabelWhereInput labelGroupsItem) {
    if (this.labelGroups == null) {
      this.labelGroups = new ArrayList<LabelWhereInput>();
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

  public List<LabelWhereInput> getLabelGroups() {
    return labelGroups;
  }


  public void setLabelGroups(List<LabelWhereInput> labelGroups) {
    this.labelGroups = labelGroups;
  }


  public SecurityGroupUpdateParams vms(VmWhereInput vms) {
    
    this.vms = vms;
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVms() {
    return vms;
  }


  public void setVms(VmWhereInput vms) {
    this.vms = vms;
  }


  public SecurityGroupUpdateParams description(String description) {
    
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


  public SecurityGroupUpdateParams name(String name) {
    
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
    SecurityGroupUpdateParams securityGroupUpdateParams = (SecurityGroupUpdateParams) o;
    return Objects.equals(this.labelGroups, securityGroupUpdateParams.labelGroups) &&
        Objects.equals(this.vms, securityGroupUpdateParams.vms) &&
        Objects.equals(this.description, securityGroupUpdateParams.description) &&
        Objects.equals(this.name, securityGroupUpdateParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelGroups, vms, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupUpdateParams {\n");
    sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

