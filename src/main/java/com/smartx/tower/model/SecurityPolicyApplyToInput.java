package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.SecurityPolicyApplyToInputTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SecurityPolicyApplyToInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class SecurityPolicyApplyToInput {
  public static final String SERIALIZED_NAME_COMMUNICABLE = "communicable";
  @SerializedName(SERIALIZED_NAME_COMMUNICABLE)
  private Boolean communicable;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private SecurityPolicyApplyToInputTarget target;

  public SecurityPolicyApplyToInput() { 
  }

  public SecurityPolicyApplyToInput communicable(Boolean communicable) {
    
    this.communicable = communicable;
    return this;
  }

   /**
   * Get communicable
   * @return communicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCommunicable() {
    return communicable;
  }


  public void setCommunicable(Boolean communicable) {
    this.communicable = communicable;
  }


  public SecurityPolicyApplyToInput target(SecurityPolicyApplyToInputTarget target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SecurityPolicyApplyToInputTarget getTarget() {
    return target;
  }


  public void setTarget(SecurityPolicyApplyToInputTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPolicyApplyToInput securityPolicyApplyToInput = (SecurityPolicyApplyToInput) o;
    return Objects.equals(this.communicable, securityPolicyApplyToInput.communicable) &&
        Objects.equals(this.target, securityPolicyApplyToInput.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicable, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityPolicyApplyToInput {\n");
    sb.append("    communicable: ").append(toIndentedString(communicable)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

