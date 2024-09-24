package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.AlertRuleThresholds;
import com.smartx.tower.model.ClusterWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomizeAlertRuleUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class CustomizeAlertRuleUpdationParamsData {
  public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";
  @SerializedName(SERIALIZED_NAME_THRESHOLDS)
  private List<AlertRuleThresholds> thresholds = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public CustomizeAlertRuleUpdationParamsData() { 
  }

  public CustomizeAlertRuleUpdationParamsData thresholds(List<AlertRuleThresholds> thresholds) {
    
    this.thresholds = thresholds;
    return this;
  }

  public CustomizeAlertRuleUpdationParamsData addThresholdsItem(AlertRuleThresholds thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new ArrayList<AlertRuleThresholds>();
    }
    this.thresholds.add(thresholdsItem);
    return this;
  }

   /**
   * Get thresholds
   * @return thresholds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AlertRuleThresholds> getThresholds() {
    return thresholds;
  }


  public void setThresholds(List<AlertRuleThresholds> thresholds) {
    this.thresholds = thresholds;
  }


  public CustomizeAlertRuleUpdationParamsData disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public CustomizeAlertRuleUpdationParamsData clusters(ClusterWhereInput clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizeAlertRuleUpdationParamsData customizeAlertRuleUpdationParamsData = (CustomizeAlertRuleUpdationParamsData) o;
    return Objects.equals(this.thresholds, customizeAlertRuleUpdationParamsData.thresholds) &&
        Objects.equals(this.disabled, customizeAlertRuleUpdationParamsData.disabled) &&
        Objects.equals(this.clusters, customizeAlertRuleUpdationParamsData.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresholds, disabled, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizeAlertRuleUpdationParamsData {\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

