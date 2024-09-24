package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetZoneMetricInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class GetZoneMetricInput {
  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private String range;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PRIMARY_TO_SECONDARY("primary-to-secondary"),
    
    SECONDARY_TO_PRIMARY("secondary-to-primary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<String> metrics = new ArrayList<String>();

  public GetZoneMetricInput() { 
  }

  public GetZoneMetricInput range(String range) {
    
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


  public GetZoneMetricInput type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GetZoneMetricInput clusters(ClusterWhereInput clusters) {
    
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


  public GetZoneMetricInput metrics(List<String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public GetZoneMetricInput addMetricsItem(String metricsItem) {
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
    GetZoneMetricInput getZoneMetricInput = (GetZoneMetricInput) o;
    return Objects.equals(this.range, getZoneMetricInput.range) &&
        Objects.equals(this.type, getZoneMetricInput.type) &&
        Objects.equals(this.clusters, getZoneMetricInput.clusters) &&
        Objects.equals(this.metrics, getZoneMetricInput.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, type, clusters, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetZoneMetricInput {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

