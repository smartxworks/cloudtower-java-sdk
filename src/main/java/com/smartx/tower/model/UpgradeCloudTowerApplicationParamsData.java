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
 * UpgradeCloudTowerApplicationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UpgradeCloudTowerApplicationParamsData {
  public static final String SERIALIZED_NAME_TARGET_PACKAGE = "targetPackage";
  @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE)
  private String targetPackage;

  public UpgradeCloudTowerApplicationParamsData() { 
  }

  public UpgradeCloudTowerApplicationParamsData targetPackage(String targetPackage) {
    
    this.targetPackage = targetPackage;
    return this;
  }

   /**
   * Get targetPackage
   * @return targetPackage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTargetPackage() {
    return targetPackage;
  }


  public void setTargetPackage(String targetPackage) {
    this.targetPackage = targetPackage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeCloudTowerApplicationParamsData upgradeCloudTowerApplicationParamsData = (UpgradeCloudTowerApplicationParamsData) o;
    return Objects.equals(this.targetPackage, upgradeCloudTowerApplicationParamsData.targetPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPackage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeCloudTowerApplicationParamsData {\n");
    sb.append("    targetPackage: ").append(toIndentedString(targetPackage)).append("\n");
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

