package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.HostWhereInput;
import com.smartx.tower.model.IscsiLunWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetLunMetricInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GetLunMetricInput {
  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private String range;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private HostWhereInput hosts;

  public static final String SERIALIZED_NAME_LUNS = "luns";
  @SerializedName(SERIALIZED_NAME_LUNS)
  private IscsiLunWhereInput luns;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = new ArrayList<String>();

  public GetLunMetricInput() { 
  }

  public GetLunMetricInput range(String range) {
    
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRange() {
    return range;
  }


  public void setRange(String range) {
    this.range = range;
  }


  public GetLunMetricInput hosts(HostWhereInput hosts) {
    
    this.hosts = hosts;
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHosts() {
    return hosts;
  }


  public void setHosts(HostWhereInput hosts) {
    this.hosts = hosts;
  }


  public GetLunMetricInput luns(IscsiLunWhereInput luns) {
    
    this.luns = luns;
    return this;
  }

   /**
   * Get luns
   * @return luns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IscsiLunWhereInput getLuns() {
    return luns;
  }


  public void setLuns(IscsiLunWhereInput luns) {
    this.luns = luns;
  }


  public GetLunMetricInput metrics(List<String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public GetLunMetricInput addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<String> metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLunMetricInput getLunMetricInput = (GetLunMetricInput) o;
    return Objects.equals(this.range, getLunMetricInput.range) &&
        Objects.equals(this.hosts, getLunMetricInput.hosts) &&
        Objects.equals(this.luns, getLunMetricInput.luns) &&
        Objects.equals(this.metrics, getLunMetricInput.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, hosts, luns, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLunMetricInput {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    luns: ").append(toIndentedString(luns)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

