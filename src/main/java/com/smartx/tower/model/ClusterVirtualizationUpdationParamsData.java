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
 * ClusterVirtualizationUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ClusterVirtualizationUpdationParamsData {
  public static final String SERIALIZED_NAME_AUTO_CONVERGE = "auto_converge";
  @SerializedName(SERIALIZED_NAME_AUTO_CONVERGE)
  private Boolean autoConverge;

  public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL = "current_cpu_model";
  @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL)
  private String currentCpuModel;

  public ClusterVirtualizationUpdationParamsData() { 
  }

  public ClusterVirtualizationUpdationParamsData autoConverge(Boolean autoConverge) {
    
    this.autoConverge = autoConverge;
    return this;
  }

   /**
   * Get autoConverge
   * @return autoConverge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoConverge() {
    return autoConverge;
  }


  public void setAutoConverge(Boolean autoConverge) {
    this.autoConverge = autoConverge;
  }


  public ClusterVirtualizationUpdationParamsData currentCpuModel(String currentCpuModel) {
    
    this.currentCpuModel = currentCpuModel;
    return this;
  }

   /**
   * Get currentCpuModel
   * @return currentCpuModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentCpuModel() {
    return currentCpuModel;
  }


  public void setCurrentCpuModel(String currentCpuModel) {
    this.currentCpuModel = currentCpuModel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVirtualizationUpdationParamsData clusterVirtualizationUpdationParamsData = (ClusterVirtualizationUpdationParamsData) o;
    return Objects.equals(this.autoConverge, clusterVirtualizationUpdationParamsData.autoConverge) &&
        Objects.equals(this.currentCpuModel, clusterVirtualizationUpdationParamsData.currentCpuModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoConverge, currentCpuModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVirtualizationUpdationParamsData {\n");
    sb.append("    autoConverge: ").append(toIndentedString(autoConverge)).append("\n");
    sb.append("    currentCpuModel: ").append(toIndentedString(currentCpuModel)).append("\n");
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

