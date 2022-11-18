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
 * UpdateCloudTowerApplicationVmSpecParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UpdateCloudTowerApplicationVmSpecParamsData {
  public static final String SERIALIZED_NAME_VM_SPEC = "vmSpec";
  @SerializedName(SERIALIZED_NAME_VM_SPEC)
  private ApplicationVmSpecDefinition vmSpec;

  public UpdateCloudTowerApplicationVmSpecParamsData() { 
  }

  public UpdateCloudTowerApplicationVmSpecParamsData vmSpec(ApplicationVmSpecDefinition vmSpec) {
    
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
    UpdateCloudTowerApplicationVmSpecParamsData updateCloudTowerApplicationVmSpecParamsData = (UpdateCloudTowerApplicationVmSpecParamsData) o;
    return Objects.equals(this.vmSpec, updateCloudTowerApplicationVmSpecParamsData.vmSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vmSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCloudTowerApplicationVmSpecParamsData {\n");
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

