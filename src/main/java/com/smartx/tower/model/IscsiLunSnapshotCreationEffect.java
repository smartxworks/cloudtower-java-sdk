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
 * IscsiLunSnapshotCreationEffect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class IscsiLunSnapshotCreationEffect {
  public static final String SERIALIZED_NAME_SYNC = "sync";
  @SerializedName(SERIALIZED_NAME_SYNC)
  private Boolean sync;

  public IscsiLunSnapshotCreationEffect() { 
  }

  public IscsiLunSnapshotCreationEffect sync(Boolean sync) {
    
    this.sync = sync;
    return this;
  }

   /**
   * Get sync
   * @return sync
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSync() {
    return sync;
  }


  public void setSync(Boolean sync) {
    this.sync = sync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunSnapshotCreationEffect iscsiLunSnapshotCreationEffect = (IscsiLunSnapshotCreationEffect) o;
    return Objects.equals(this.sync, iscsiLunSnapshotCreationEffect.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sync);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiLunSnapshotCreationEffect {\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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

