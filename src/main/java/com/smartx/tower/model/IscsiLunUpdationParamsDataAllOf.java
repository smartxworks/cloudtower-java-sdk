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
 * IscsiLunUpdationParamsDataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class IscsiLunUpdationParamsDataAllOf {
  public static final String SERIALIZED_NAME_ASSIGNED_SIZE_UNIT = "assigned_size_unit";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT)
  private ByteUnit assignedSizeUnit;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
  private Long assignedSize;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public IscsiLunUpdationParamsDataAllOf() { 
  }

  public IscsiLunUpdationParamsDataAllOf assignedSizeUnit(ByteUnit assignedSizeUnit) {
    
    this.assignedSizeUnit = assignedSizeUnit;
    return this;
  }

   /**
   * Get assignedSizeUnit
   * @return assignedSizeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ByteUnit getAssignedSizeUnit() {
    return assignedSizeUnit;
  }


  public void setAssignedSizeUnit(ByteUnit assignedSizeUnit) {
    this.assignedSizeUnit = assignedSizeUnit;
  }


  public IscsiLunUpdationParamsDataAllOf assignedSize(Long assignedSize) {
    
    this.assignedSize = assignedSize;
    return this;
  }

   /**
   * Get assignedSize
   * @return assignedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAssignedSize() {
    return assignedSize;
  }


  public void setAssignedSize(Long assignedSize) {
    this.assignedSize = assignedSize;
  }


  public IscsiLunUpdationParamsDataAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IscsiLunUpdationParamsDataAllOf iscsiLunUpdationParamsDataAllOf = (IscsiLunUpdationParamsDataAllOf) o;
    return Objects.equals(this.assignedSizeUnit, iscsiLunUpdationParamsDataAllOf.assignedSizeUnit) &&
        Objects.equals(this.assignedSize, iscsiLunUpdationParamsDataAllOf.assignedSize) &&
        Objects.equals(this.name, iscsiLunUpdationParamsDataAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedSizeUnit, assignedSize, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IscsiLunUpdationParamsDataAllOf {\n");
    sb.append("    assignedSizeUnit: ").append(toIndentedString(assignedSizeUnit)).append("\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

