package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.DiskFunction;
import com.smartx.tower.model.DiskType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * HostBatchCreateDiskInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class HostBatchCreateDiskInput {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private DiskType type;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Double size;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private DiskFunction function;

  public static final String SERIALIZED_NAME_DRIVE = "drive";
  @SerializedName(SERIALIZED_NAME_DRIVE)
  private String drive;

  public HostBatchCreateDiskInput() { 
  }

  public HostBatchCreateDiskInput type(DiskType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskType getType() {
    return type;
  }


  public void setType(DiskType type) {
    this.type = type;
  }


  public HostBatchCreateDiskInput size(Double size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSize() {
    return size;
  }


  public void setSize(Double size) {
    this.size = size;
  }


  public HostBatchCreateDiskInput function(DiskFunction function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiskFunction getFunction() {
    return function;
  }


  public void setFunction(DiskFunction function) {
    this.function = function;
  }


  public HostBatchCreateDiskInput drive(String drive) {
    
    this.drive = drive;
    return this;
  }

   /**
   * Get drive
   * @return drive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDrive() {
    return drive;
  }


  public void setDrive(String drive) {
    this.drive = drive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostBatchCreateDiskInput hostBatchCreateDiskInput = (HostBatchCreateDiskInput) o;
    return Objects.equals(this.type, hostBatchCreateDiskInput.type) &&
        Objects.equals(this.size, hostBatchCreateDiskInput.size) &&
        Objects.equals(this.function, hostBatchCreateDiskInput.function) &&
        Objects.equals(this.drive, hostBatchCreateDiskInput.drive);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, size, function, drive);
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
    sb.append("class HostBatchCreateDiskInput {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    drive: ").append(toIndentedString(drive)).append("\n");
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

