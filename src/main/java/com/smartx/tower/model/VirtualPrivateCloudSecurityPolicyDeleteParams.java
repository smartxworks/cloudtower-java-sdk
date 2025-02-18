package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudSecurityPolicyWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VirtualPrivateCloudSecurityPolicyDeleteParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudSecurityPolicyDeleteParams {
  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private VirtualPrivateCloudSecurityPolicyWhereInput where;

  public VirtualPrivateCloudSecurityPolicyDeleteParams() { 
  }

  public VirtualPrivateCloudSecurityPolicyDeleteParams where(VirtualPrivateCloudSecurityPolicyWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VirtualPrivateCloudSecurityPolicyWhereInput getWhere() {
    return where;
  }


  public void setWhere(VirtualPrivateCloudSecurityPolicyWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualPrivateCloudSecurityPolicyDeleteParams virtualPrivateCloudSecurityPolicyDeleteParams = (VirtualPrivateCloudSecurityPolicyDeleteParams) o;
    return Objects.equals(this.where, virtualPrivateCloudSecurityPolicyDeleteParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualPrivateCloudSecurityPolicyDeleteParams {\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

