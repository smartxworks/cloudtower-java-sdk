package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedAggregateReportTask;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReportTaskConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ReportTaskConnection {
  public static final String SERIALIZED_NAME_AGGREGATE = "aggregate";
  @SerializedName(SERIALIZED_NAME_AGGREGATE)
  private NestedAggregateReportTask aggregate;

  public ReportTaskConnection() { 
  }

  public ReportTaskConnection aggregate(NestedAggregateReportTask aggregate) {
    
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Get aggregate
   * @return aggregate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedAggregateReportTask getAggregate() {
    return aggregate;
  }


  public void setAggregate(NestedAggregateReportTask aggregate) {
    this.aggregate = aggregate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTaskConnection reportTaskConnection = (ReportTaskConnection) o;
    return Objects.equals(this.aggregate, reportTaskConnection.aggregate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTaskConnection {\n");
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
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

