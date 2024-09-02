package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BackupRestorePointRestoreInPlaceParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupRestorePointRestoreInPlaceParamsData {
  public static final String SERIALIZED_NAME_STARTUP_AFTER_RESTORE = "startup_after_restore";
  @SerializedName(SERIALIZED_NAME_STARTUP_AFTER_RESTORE)
  private Boolean startupAfterRestore;

  public BackupRestorePointRestoreInPlaceParamsData() { 
  }

  public BackupRestorePointRestoreInPlaceParamsData startupAfterRestore(Boolean startupAfterRestore) {
    
    this.startupAfterRestore = startupAfterRestore;
    return this;
  }

   /**
   * Get startupAfterRestore
   * @return startupAfterRestore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getStartupAfterRestore() {
    return startupAfterRestore;
  }


  public void setStartupAfterRestore(Boolean startupAfterRestore) {
    this.startupAfterRestore = startupAfterRestore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRestorePointRestoreInPlaceParamsData backupRestorePointRestoreInPlaceParamsData = (BackupRestorePointRestoreInPlaceParamsData) o;
    return Objects.equals(this.startupAfterRestore, backupRestorePointRestoreInPlaceParamsData.startupAfterRestore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startupAfterRestore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupRestorePointRestoreInPlaceParamsData {\n");
    sb.append("    startupAfterRestore: ").append(toIndentedString(startupAfterRestore)).append("\n");
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

