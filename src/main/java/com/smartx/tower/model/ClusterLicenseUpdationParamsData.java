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
 * ClusterLicenseUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ClusterLicenseUpdationParamsData {
  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private String license;

  public ClusterLicenseUpdationParamsData() { 
  }

  public ClusterLicenseUpdationParamsData license(String license) {
    
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLicense() {
    return license;
  }


  public void setLicense(String license) {
    this.license = license;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterLicenseUpdationParamsData clusterLicenseUpdationParamsData = (ClusterLicenseUpdationParamsData) o;
    return Objects.equals(this.license, clusterLicenseUpdationParamsData.license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterLicenseUpdationParamsData {\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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

