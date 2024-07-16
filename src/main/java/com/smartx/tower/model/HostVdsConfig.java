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
import java.util.ArrayList;
import java.util.List;

/**
 * HostVdsConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class HostVdsConfig {
  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private List<String> nics = new ArrayList<String>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public HostVdsConfig() { 
  }

  public HostVdsConfig nics(List<String> nics) {
    
    this.nics = nics;
    return this;
  }

  public HostVdsConfig addNicsItem(String nicsItem) {
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getNics() {
    return nics;
  }


  public void setNics(List<String> nics) {
    this.nics = nics;
  }


  public HostVdsConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    HostVdsConfig hostVdsConfig = (HostVdsConfig) o;
    return Objects.equals(this.nics, hostVdsConfig.nics) &&
        Objects.equals(this.name, hostVdsConfig.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nics, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostVdsConfig {\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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

