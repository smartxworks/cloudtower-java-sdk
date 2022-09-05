package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.FilterRuleAggregationEnum;
import com.smartx.tower.model.FilterRuleMetricEnum;
import com.smartx.tower.model.FilterRuleOpEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NestedFilterRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedFilterRule {
  public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";
  @SerializedName(SERIALIZED_NAME_AGGREGATION)
  private FilterRuleAggregationEnum aggregation;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private FilterRuleMetricEnum metric;

  public static final String SERIALIZED_NAME_OP = "op";
  @SerializedName(SERIALIZED_NAME_OP)
  private FilterRuleOpEnum op;

  public static final String SERIALIZED_NAME_QUANTILE = "quantile";
  @SerializedName(SERIALIZED_NAME_QUANTILE)
  private Integer quantile;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Double threshold;

  public NestedFilterRule() { 
  }

  public NestedFilterRule aggregation(FilterRuleAggregationEnum aggregation) {
    
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Get aggregation
   * @return aggregation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterRuleAggregationEnum getAggregation() {
    return aggregation;
  }


  public void setAggregation(FilterRuleAggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  public NestedFilterRule duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public NestedFilterRule metric(FilterRuleMetricEnum metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterRuleMetricEnum getMetric() {
    return metric;
  }


  public void setMetric(FilterRuleMetricEnum metric) {
    this.metric = metric;
  }


  public NestedFilterRule op(FilterRuleOpEnum op) {
    
    this.op = op;
    return this;
  }

   /**
   * Get op
   * @return op
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterRuleOpEnum getOp() {
    return op;
  }


  public void setOp(FilterRuleOpEnum op) {
    this.op = op;
  }


  public NestedFilterRule quantile(Integer quantile) {
    
    this.quantile = quantile;
    return this;
  }

   /**
   * Get quantile
   * @return quantile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getQuantile() {
    return quantile;
  }


  public void setQuantile(Integer quantile) {
    this.quantile = quantile;
  }


  public NestedFilterRule threshold(Double threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getThreshold() {
    return threshold;
  }


  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedFilterRule nestedFilterRule = (NestedFilterRule) o;
    return Objects.equals(this.aggregation, nestedFilterRule.aggregation) &&
        Objects.equals(this.duration, nestedFilterRule.duration) &&
        Objects.equals(this.metric, nestedFilterRule.metric) &&
        Objects.equals(this.op, nestedFilterRule.op) &&
        Objects.equals(this.quantile, nestedFilterRule.quantile) &&
        Objects.equals(this.threshold, nestedFilterRule.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregation, duration, metric, op, quantile, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedFilterRule {\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    quantile: ").append(toIndentedString(quantile)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

