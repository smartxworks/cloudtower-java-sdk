package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.DataPoint;
import com.smartx.tower.model.MetricLabel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MetricSample
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class MetricSample {
  public static final String SERIALIZED_NAME_POINT = "point";
  @SerializedName(SERIALIZED_NAME_POINT)
  private DataPoint point;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private MetricLabel labels;

  /**
   * Gets or Sets typename
   */
  @JsonAdapter(TypenameEnum.Adapter.class)
  public enum TypenameEnum {
    METRICSAMPLE("MetricSample");

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

  public MetricSample() { 
  }

  public MetricSample point(DataPoint point) {
    
    this.point = point;
    return this;
  }

   /**
   * Get point
   * @return point
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataPoint getPoint() {
    return point;
  }


  public void setPoint(DataPoint point) {
    this.point = point;
  }


  public MetricSample labels(MetricLabel labels) {
    
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MetricLabel getLabels() {
    return labels;
  }


  public void setLabels(MetricLabel labels) {
    this.labels = labels;
  }


  public MetricSample typename(TypenameEnum typename) {
    
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
    MetricSample metricSample = (MetricSample) o;
    return Objects.equals(this.point, metricSample.point) &&
        Objects.equals(this.labels, metricSample.labels) &&
        Objects.equals(this.typename, metricSample.typename);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, labels, typename);
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
    sb.append("class MetricSample {\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

