package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.MetricSample;
import com.smartx.tower.model.MetricStream;
import com.smartx.tower.model.MetricUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Metric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class Metric {
  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private MetricUnit unit;

  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private Integer step;

  public static final String SERIALIZED_NAME_SAMPLES = "samples";
  @SerializedName(SERIALIZED_NAME_SAMPLES)
  private List<MetricSample> samples = null;

  public static final String SERIALIZED_NAME_SAMPLE_STREAMS = "sample_streams";
  @SerializedName(SERIALIZED_NAME_SAMPLE_STREAMS)
  private List<MetricStream> sampleStreams = null;

  public static final String SERIALIZED_NAME_DROPPED = "dropped";
  @SerializedName(SERIALIZED_NAME_DROPPED)
  private Boolean dropped;

  /**
   * Gets or Sets typename
   */
  @JsonAdapter(TypenameEnum.Adapter.class)
  public enum TypenameEnum {
    METRIC("Metric");

    private String value;

    TypenameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypenameEnum fromValue(String value) {
      for (TypenameEnum b : TypenameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypenameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypenameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypenameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypenameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPENAME = "__typename";
  @SerializedName(SERIALIZED_NAME_TYPENAME)
  private TypenameEnum typename;

  public Metric() { 
  }

  public Metric unit(MetricUnit unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MetricUnit getUnit() {
    return unit;
  }


  public void setUnit(MetricUnit unit) {
    this.unit = unit;
  }


  public Metric step(Integer step) {
    
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStep() {
    return step;
  }


  public void setStep(Integer step) {
    this.step = step;
  }


  public Metric samples(List<MetricSample> samples) {
    
    this.samples = samples;
    return this;
  }

  public Metric addSamplesItem(MetricSample samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<MetricSample>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MetricSample> getSamples() {
    return samples;
  }


  public void setSamples(List<MetricSample> samples) {
    this.samples = samples;
  }


  public Metric sampleStreams(List<MetricStream> sampleStreams) {
    
    this.sampleStreams = sampleStreams;
    return this;
  }

  public Metric addSampleStreamsItem(MetricStream sampleStreamsItem) {
    if (this.sampleStreams == null) {
      this.sampleStreams = new ArrayList<MetricStream>();
    }
    this.sampleStreams.add(sampleStreamsItem);
    return this;
  }

   /**
   * Get sampleStreams
   * @return sampleStreams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MetricStream> getSampleStreams() {
    return sampleStreams;
  }


  public void setSampleStreams(List<MetricStream> sampleStreams) {
    this.sampleStreams = sampleStreams;
  }


  public Metric dropped(Boolean dropped) {
    
    this.dropped = dropped;
    return this;
  }

   /**
   * Get dropped
   * @return dropped
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDropped() {
    return dropped;
  }


  public void setDropped(Boolean dropped) {
    this.dropped = dropped;
  }


  public Metric typename(TypenameEnum typename) {
    
    this.typename = typename;
    return this;
  }

   /**
   * Get typename
   * @return typename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypenameEnum getTypename() {
    return typename;
  }


  public void setTypename(TypenameEnum typename) {
    this.typename = typename;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return Objects.equals(this.unit, metric.unit) &&
        Objects.equals(this.step, metric.step) &&
        Objects.equals(this.samples, metric.samples) &&
        Objects.equals(this.sampleStreams, metric.sampleStreams) &&
        Objects.equals(this.dropped, metric.dropped) &&
        Objects.equals(this.typename, metric.typename);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, step, samples, sampleStreams, dropped, typename);
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
    sb.append("class Metric {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    sampleStreams: ").append(toIndentedString(sampleStreams)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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

