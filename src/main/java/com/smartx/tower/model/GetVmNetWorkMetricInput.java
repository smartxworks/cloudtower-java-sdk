package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VmNicWhereInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetVmNetWorkMetricInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GetVmNetWorkMetricInput {
  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private String range;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = new ArrayList<String>();

  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private VmNicWhereInput nics;

  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private VmWhereInput vms;

  public GetVmNetWorkMetricInput() { 
  }

  public GetVmNetWorkMetricInput range(String range) {
    
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


  public GetVmNetWorkMetricInput metrics(List<String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public GetVmNetWorkMetricInput addMetricsItem(String metricsItem) {
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


  public GetVmNetWorkMetricInput nics(VmNicWhereInput nics) {
    
    this.nics = nics;
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmNicWhereInput getNics() {
    return nics;
  }


  public void setNics(VmNicWhereInput nics) {
    this.nics = nics;
  }


  public GetVmNetWorkMetricInput vms(VmWhereInput vms) {
    
    this.vms = vms;
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VmWhereInput getVms() {
    return vms;
  }


  public void setVms(VmWhereInput vms) {
    this.vms = vms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetVmNetWorkMetricInput getVmNetWorkMetricInput = (GetVmNetWorkMetricInput) o;
    return Objects.equals(this.range, getVmNetWorkMetricInput.range) &&
        Objects.equals(this.metrics, getVmNetWorkMetricInput.metrics) &&
        Objects.equals(this.nics, getVmNetWorkMetricInput.nics) &&
        Objects.equals(this.vms, getVmNetWorkMetricInput.vms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, metrics, nics, vms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetVmNetWorkMetricInput {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

