package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ApplicationVmSpecDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeployCloudTowerApplicationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class DeployCloudTowerApplicationParams {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_PACKAGE = "targetPackage";
  @SerializedName(SERIALIZED_NAME_TARGET_PACKAGE)
  private String targetPackage;

  public static final String SERIALIZED_NAME_VM_SPEC = "vmSpec";
  @SerializedName(SERIALIZED_NAME_VM_SPEC)
  private ApplicationVmSpecDefinition vmSpec;

  public DeployCloudTowerApplicationParams() { 
  }

  public DeployCloudTowerApplicationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DeployCloudTowerApplicationParams targetPackage(String targetPackage) {
    
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


  public DeployCloudTowerApplicationParams vmSpec(ApplicationVmSpecDefinition vmSpec) {
    
    this.vmSpec = vmSpec;
    return this;
  }

   /**
   * Get vmSpec
   * @return vmSpec
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApplicationVmSpecDefinition getVmSpec() {
    return vmSpec;
  }


  public void setVmSpec(ApplicationVmSpecDefinition vmSpec) {
    this.vmSpec = vmSpec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployCloudTowerApplicationParams deployCloudTowerApplicationParams = (DeployCloudTowerApplicationParams) o;
    return Objects.equals(this.name, deployCloudTowerApplicationParams.name) &&
        Objects.equals(this.targetPackage, deployCloudTowerApplicationParams.targetPackage) &&
        Objects.equals(this.vmSpec, deployCloudTowerApplicationParams.vmSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, targetPackage, vmSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployCloudTowerApplicationParams {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetPackage: ").append(toIndentedString(targetPackage)).append("\n");
    sb.append("    vmSpec: ").append(toIndentedString(vmSpec)).append("\n");
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

