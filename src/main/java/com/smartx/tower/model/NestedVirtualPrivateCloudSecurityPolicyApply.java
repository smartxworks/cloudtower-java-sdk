package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedVirtualPrivateCloudSecurityGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedVirtualPrivateCloudSecurityPolicyApply
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedVirtualPrivateCloudSecurityPolicyApply {
  public static final String SERIALIZED_NAME_COMMUNICABLE = "communicable";
  @SerializedName(SERIALIZED_NAME_COMMUNICABLE)
  private Boolean communicable;

  public static final String SERIALIZED_NAME_SECURITY_GROUP = "security_group";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP)
  private NestedVirtualPrivateCloudSecurityGroup securityGroup;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "security_group_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
  private String securityGroupId;

  public NestedVirtualPrivateCloudSecurityPolicyApply() { 
  }

  public NestedVirtualPrivateCloudSecurityPolicyApply communicable(Boolean communicable) {
    
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


  public NestedVirtualPrivateCloudSecurityPolicyApply securityGroup(NestedVirtualPrivateCloudSecurityGroup securityGroup) {
    
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVirtualPrivateCloudSecurityGroup getSecurityGroup() {
    return securityGroup;
  }


  public void setSecurityGroup(NestedVirtualPrivateCloudSecurityGroup securityGroup) {
    this.securityGroup = securityGroup;
  }


  public NestedVirtualPrivateCloudSecurityPolicyApply securityGroupId(String securityGroupId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVirtualPrivateCloudSecurityPolicyApply nestedVirtualPrivateCloudSecurityPolicyApply = (NestedVirtualPrivateCloudSecurityPolicyApply) o;
    return Objects.equals(this.communicable, nestedVirtualPrivateCloudSecurityPolicyApply.communicable) &&
        Objects.equals(this.securityGroup, nestedVirtualPrivateCloudSecurityPolicyApply.securityGroup) &&
        Objects.equals(this.securityGroupId, nestedVirtualPrivateCloudSecurityPolicyApply.securityGroupId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicable, securityGroup, securityGroupId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedVirtualPrivateCloudSecurityPolicyApply {\n");
    sb.append("    communicable: ").append(toIndentedString(communicable)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
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

