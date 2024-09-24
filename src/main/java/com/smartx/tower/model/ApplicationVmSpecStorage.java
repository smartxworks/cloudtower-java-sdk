package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ByteUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApplicationVmSpecStorage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ApplicationVmSpecStorage {
  public static final String SERIALIZED_NAME_SIZE_UNIT = "size_unit";
  @SerializedName(SERIALIZED_NAME_SIZE_UNIT)
  private ByteUnit sizeUnit;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public ApplicationVmSpecStorage() { 
  }

  public ApplicationVmSpecStorage sizeUnit(ByteUnit sizeUnit) {
    
    this.sizeUnit = sizeUnit;
    return this;
  }

   /**
   * Get sizeUnit
   * @return sizeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getSizeUnit() {
    return sizeUnit;
  }


  public void setSizeUnit(ByteUnit sizeUnit) {
    this.sizeUnit = sizeUnit;
  }


  public ApplicationVmSpecStorage size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVmSpecStorage applicationVmSpecStorage = (ApplicationVmSpecStorage) o;
    return Objects.equals(this.sizeUnit, applicationVmSpecStorage.sizeUnit) &&
        Objects.equals(this.size, applicationVmSpecStorage.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeUnit, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVmSpecStorage {\n");
    sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

