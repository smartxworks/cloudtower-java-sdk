package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VdsCreationWithMigrateVlanParamsAllOfVlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VdsCreationWithMigrateVlanParamsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VdsCreationWithMigrateVlanParamsAllOf {
  public static final String SERIALIZED_NAME_VLAN = "vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private VdsCreationWithMigrateVlanParamsAllOfVlan vlan;

  public VdsCreationWithMigrateVlanParamsAllOf() { 
  }

  public VdsCreationWithMigrateVlanParamsAllOf vlan(VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VdsCreationWithMigrateVlanParamsAllOfVlan getVlan() {
    return vlan;
  }


  public void setVlan(VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {
    this.vlan = vlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VdsCreationWithMigrateVlanParamsAllOf vdsCreationWithMigrateVlanParamsAllOf = (VdsCreationWithMigrateVlanParamsAllOf) o;
    return Objects.equals(this.vlan, vdsCreationWithMigrateVlanParamsAllOf.vlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VdsCreationWithMigrateVlanParamsAllOf {\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

