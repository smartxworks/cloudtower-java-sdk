package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.LabelWhereInput;
import com.smartx.tower.model.SecurityGroupWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SecurityPolicyApplyToInputTarget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class SecurityPolicyApplyToInputTarget {
  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "security_groups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private SecurityGroupWhereInput securityGroups;

  public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";
  @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
  private List<LabelWhereInput> labelGroups = null;

  public SecurityPolicyApplyToInputTarget() { 
  }

  public SecurityPolicyApplyToInputTarget securityGroups(SecurityGroupWhereInput securityGroups) {
    
    this.securityGroups = securityGroups;
    return this;
  }

   /**
   * Get securityGroups
   * @return securityGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SecurityGroupWhereInput getSecurityGroups() {
    return securityGroups;
  }


  public void setSecurityGroups(SecurityGroupWhereInput securityGroups) {
    this.securityGroups = securityGroups;
  }


  public SecurityPolicyApplyToInputTarget labelGroups(List<LabelWhereInput> labelGroups) {
    
    this.labelGroups = labelGroups;
    return this;
  }

  public SecurityPolicyApplyToInputTarget addLabelGroupsItem(LabelWhereInput labelGroupsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPolicyApplyToInputTarget securityPolicyApplyToInputTarget = (SecurityPolicyApplyToInputTarget) o;
    return Objects.equals(this.securityGroups, securityPolicyApplyToInputTarget.securityGroups) &&
        Objects.equals(this.labelGroups, securityPolicyApplyToInputTarget.labelGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityGroups, labelGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityPolicyApplyToInputTarget {\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
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

