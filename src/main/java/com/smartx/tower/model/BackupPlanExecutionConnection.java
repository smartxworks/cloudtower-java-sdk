package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedAggregateBackupPlanExecution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BackupPlanExecutionConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class BackupPlanExecutionConnection {
  public static final String SERIALIZED_NAME_AGGREGATE = "aggregate";
  @SerializedName(SERIALIZED_NAME_AGGREGATE)
  private NestedAggregateBackupPlanExecution aggregate;

  public BackupPlanExecutionConnection() { 
  }

  public BackupPlanExecutionConnection aggregate(NestedAggregateBackupPlanExecution aggregate) {
    
    this.aggregate = aggregate;
    return this;
  }

   /**
   * Get aggregate
   * @return aggregate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedAggregateBackupPlanExecution getAggregate() {
    return aggregate;
  }


  public void setAggregate(NestedAggregateBackupPlanExecution aggregate) {
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
    BackupPlanExecutionConnection backupPlanExecutionConnection = (BackupPlanExecutionConnection) o;
    return Objects.equals(this.aggregate, backupPlanExecutionConnection.aggregate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupPlanExecutionConnection {\n");
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

