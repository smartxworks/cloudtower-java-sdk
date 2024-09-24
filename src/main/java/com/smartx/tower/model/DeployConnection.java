package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedAggregateDeploy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeployConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class DeployConnection {
  public static final String SERIALIZED_NAME_AGGREGATE = "aggregate";
  @SerializedName(SERIALIZED_NAME_AGGREGATE)
  private NestedAggregateDeploy aggregate;

  public DeployConnection() { 
  }

  public DeployConnection aggregate(NestedAggregateDeploy aggregate) {
    
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Get aggregate
   * @return aggregate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedAggregateDeploy getAggregate() {
    return aggregate;
  }


  public void setAggregate(NestedAggregateDeploy aggregate) {
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
    DeployConnection deployConnection = (DeployConnection) o;
    return Objects.equals(this.aggregate, deployConnection.aggregate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployConnection {\n");
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

