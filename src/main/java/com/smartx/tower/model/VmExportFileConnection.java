package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedAggregateVmExportFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmExportFileConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VmExportFileConnection {
  public static final String SERIALIZED_NAME_AGGREGATE = "aggregate";
  @SerializedName(SERIALIZED_NAME_AGGREGATE)
  private NestedAggregateVmExportFile aggregate;

  public VmExportFileConnection() { 
  }

  public VmExportFileConnection aggregate(NestedAggregateVmExportFile aggregate) {
    
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Get aggregate
   * @return aggregate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedAggregateVmExportFile getAggregate() {
    return aggregate;
  }


  public void setAggregate(NestedAggregateVmExportFile aggregate) {
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
    VmExportFileConnection vmExportFileConnection = (VmExportFileConnection) o;
    return Objects.equals(this.aggregate, vmExportFileConnection.aggregate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmExportFileConnection {\n");
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

