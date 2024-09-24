package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BackupPlanDeleteStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BackupPlanDeletionParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class BackupPlanDeletionParamsData {
  public static final String SERIALIZED_NAME_DELETE_STRATEGY = "delete_strategy";
  @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY)
  private BackupPlanDeleteStrategy deleteStrategy;

  public BackupPlanDeletionParamsData() { 
  }

  public BackupPlanDeletionParamsData deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {
    
    this.deleteStrategy = deleteStrategy;
    return this;
  }

   /**
   * Get deleteStrategy
   * @return deleteStrategy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BackupPlanDeleteStrategy getDeleteStrategy() {
    return deleteStrategy;
  }


  public void setDeleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {
    this.deleteStrategy = deleteStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupPlanDeletionParamsData backupPlanDeletionParamsData = (BackupPlanDeletionParamsData) o;
    return Objects.equals(this.deleteStrategy, backupPlanDeletionParamsData.deleteStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupPlanDeletionParamsData {\n");
    sb.append("    deleteStrategy: ").append(toIndentedString(deleteStrategy)).append("\n");
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

