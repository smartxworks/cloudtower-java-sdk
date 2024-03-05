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
 * From T, pick a set of properties whose keys are in the union K
 */
@ApiModel(description = "From T, pick a set of properties whose keys are in the union K")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class PickFooExcludeKeyofFooBaz {
  public static final String SERIALIZED_NAME_BAR = "bar";
  @SerializedName(SERIALIZED_NAME_BAR)
  private String bar;

  public PickFooExcludeKeyofFooBaz() { 
  }

  public PickFooExcludeKeyofFooBaz bar(String bar) {
    
    this.bar = bar;
    return this;
  }

   /**
   * Get bar
   * @return bar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBar() {
    return bar;
  }


  public void setBar(String bar) {
    this.bar = bar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickFooExcludeKeyofFooBaz pickFooExcludeKeyofFooBaz = (PickFooExcludeKeyofFooBaz) o;
    return Objects.equals(this.bar, pickFooExcludeKeyofFooBaz.bar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickFooExcludeKeyofFooBaz {\n");
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
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

