package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedGlobalAlertRule;
import com.smartx.tower.model.NestedThresholds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AlertRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class AlertRule {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_CUSTOMIZED = "customized";
  @SerializedName(SERIALIZED_NAME_CUSTOMIZED)
  private Boolean customized;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_GLOBAL_ALERT_RULE = "global_alert_rule";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ALERT_RULE)
  private NestedGlobalAlertRule globalAlertRule;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";
  @SerializedName(SERIALIZED_NAME_THRESHOLDS)
  private List<NestedThresholds> thresholds = new ArrayList<NestedThresholds>();

  public AlertRule() { 
  }

  public AlertRule cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public AlertRule customized(Boolean customized) {
    
    this.customized = customized;
    return this;
  }

   /**
   * Get customized
   * @return customized
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCustomized() {
    return customized;
  }


  public void setCustomized(Boolean customized) {
    this.customized = customized;
  }


  public AlertRule disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public AlertRule globalAlertRule(NestedGlobalAlertRule globalAlertRule) {
    
    this.globalAlertRule = globalAlertRule;
    return this;
  }

   /**
   * Get globalAlertRule
   * @return globalAlertRule
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedGlobalAlertRule getGlobalAlertRule() {
    return globalAlertRule;
  }


  public void setGlobalAlertRule(NestedGlobalAlertRule globalAlertRule) {
    this.globalAlertRule = globalAlertRule;
  }


  public AlertRule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AlertRule localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public AlertRule thresholds(List<NestedThresholds> thresholds) {
    
    this.thresholds = thresholds;
    return this;
  }

  public AlertRule addThresholdsItem(NestedThresholds thresholdsItem) {
    this.thresholds.add(thresholdsItem);
    return this;
  }

   /**
   * Get thresholds
   * @return thresholds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NestedThresholds> getThresholds() {
    return thresholds;
  }


  public void setThresholds(List<NestedThresholds> thresholds) {
    this.thresholds = thresholds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRule alertRule = (AlertRule) o;
    return Objects.equals(this.cluster, alertRule.cluster) &&
        Objects.equals(this.customized, alertRule.customized) &&
        Objects.equals(this.disabled, alertRule.disabled) &&
        Objects.equals(this.globalAlertRule, alertRule.globalAlertRule) &&
        Objects.equals(this.id, alertRule.id) &&
        Objects.equals(this.localId, alertRule.localId) &&
        Objects.equals(this.thresholds, alertRule.thresholds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, customized, disabled, globalAlertRule, id, localId, thresholds);
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
    sb.append("class AlertRule {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    customized: ").append(toIndentedString(customized)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    globalAlertRule: ").append(toIndentedString(globalAlertRule)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
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

