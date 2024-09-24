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

/**
 * VirtualPrivateCloudSecurityPolicyApplyInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VirtualPrivateCloudSecurityPolicyApplyInput {
  public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "security_group_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
  private String securityGroupId;

  public static final String SERIALIZED_NAME_COMMUNICABLE = "communicable";
  @SerializedName(SERIALIZED_NAME_COMMUNICABLE)
  private Boolean communicable;

  public VirtualPrivateCloudSecurityPolicyApplyInput() { 
  }

  public VirtualPrivateCloudSecurityPolicyApplyInput securityGroupId(String securityGroupId) {
    
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * Get securityGroupId
   * @return securityGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSecurityGroupId() {
    return securityGroupId;
  }


  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }


  public VirtualPrivateCloudSecurityPolicyApplyInput communicable(Boolean communicable) {
    
    this.communicable = communicable;
    return this;
  }

   /**
   * Get communicable
   * @return communicable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCommunicable() {
    return communicable;
  }


  public void setCommunicable(Boolean communicable) {
    this.communicable = communicable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudSecurityPolicyApplyInput virtualPrivateCloudSecurityPolicyApplyInput = (VirtualPrivateCloudSecurityPolicyApplyInput) o;
    return Objects.equals(this.securityGroupId, virtualPrivateCloudSecurityPolicyApplyInput.securityGroupId) &&
        Objects.equals(this.communicable, virtualPrivateCloudSecurityPolicyApplyInput.communicable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityGroupId, communicable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudSecurityPolicyApplyInput {\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    communicable: ").append(toIndentedString(communicable)).append("\n");
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

