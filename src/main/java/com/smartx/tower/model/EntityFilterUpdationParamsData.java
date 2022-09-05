package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.FilterRuleInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityFilterUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class EntityFilterUpdationParamsData {
  public static final String SERIALIZED_NAME_EXCLUDE_VMS = "exclude_vms";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_VMS)
  private VmWhereInput excludeVms;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public static final String SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS = "apply_to_all_clusters";
  @SerializedName(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS)
  private Boolean applyToAllClusters;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<FilterRuleInput> rules = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public EntityFilterUpdationParamsData() { 
  }

  public EntityFilterUpdationParamsData excludeVms(VmWhereInput excludeVms) {
    
    this.excludeVms = excludeVms;
    return this;
  }

   /**
   * Get excludeVms
   * @return excludeVms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getExcludeVms() {
    return excludeVms;
  }


  public void setExcludeVms(VmWhereInput excludeVms) {
    this.excludeVms = excludeVms;
  }


  public EntityFilterUpdationParamsData clusters(ClusterWhereInput clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  public EntityFilterUpdationParamsData applyToAllClusters(Boolean applyToAllClusters) {
    
    this.applyToAllClusters = applyToAllClusters;
    return this;
  }

   /**
   * Get applyToAllClusters
   * @return applyToAllClusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApplyToAllClusters() {
    return applyToAllClusters;
  }


  public void setApplyToAllClusters(Boolean applyToAllClusters) {
    this.applyToAllClusters = applyToAllClusters;
  }


  public EntityFilterUpdationParamsData rules(List<FilterRuleInput> rules) {
    
    this.rules = rules;
    return this;
  }

  public EntityFilterUpdationParamsData addRulesItem(FilterRuleInput rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<FilterRuleInput>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FilterRuleInput> getRules() {
    return rules;
  }


  public void setRules(List<FilterRuleInput> rules) {
    this.rules = rules;
  }


  public EntityFilterUpdationParamsData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityFilterUpdationParamsData entityFilterUpdationParamsData = (EntityFilterUpdationParamsData) o;
    return Objects.equals(this.excludeVms, entityFilterUpdationParamsData.excludeVms) &&
        Objects.equals(this.clusters, entityFilterUpdationParamsData.clusters) &&
        Objects.equals(this.applyToAllClusters, entityFilterUpdationParamsData.applyToAllClusters) &&
        Objects.equals(this.rules, entityFilterUpdationParamsData.rules) &&
        Objects.equals(this.name, entityFilterUpdationParamsData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeVms, clusters, applyToAllClusters, rules, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityFilterUpdationParamsData {\n");
    sb.append("    excludeVms: ").append(toIndentedString(excludeVms)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    applyToAllClusters: ").append(toIndentedString(applyToAllClusters)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

