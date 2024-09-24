package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.AccessMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateAccessRestrictionParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class UpdateAccessRestrictionParams {
  public static final String SERIALIZED_NAME_ACCESS_LIST = "access_list";
  @SerializedName(SERIALIZED_NAME_ACCESS_LIST)
  private List<String> accessList = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ACCESS_MODE = "access_mode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private AccessMode accessMode;

  public UpdateAccessRestrictionParams() { 
  }

  public UpdateAccessRestrictionParams accessList(List<String> accessList) {
    
    this.accessList = accessList;
    return this;
  }

  public UpdateAccessRestrictionParams addAccessListItem(String accessListItem) {
    this.accessList.add(accessListItem);
    return this;
  }

   /**
   * Get accessList
   * @return accessList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAccessList() {
    return accessList;
  }


  public void setAccessList(List<String> accessList) {
    this.accessList = accessList;
  }


  public UpdateAccessRestrictionParams accessMode(AccessMode accessMode) {
    
    this.accessMode = accessMode;
    return this;
  }

   /**
   * Get accessMode
   * @return accessMode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccessMode getAccessMode() {
    return accessMode;
  }


  public void setAccessMode(AccessMode accessMode) {
    this.accessMode = accessMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAccessRestrictionParams updateAccessRestrictionParams = (UpdateAccessRestrictionParams) o;
    return Objects.equals(this.accessList, updateAccessRestrictionParams.accessList) &&
        Objects.equals(this.accessMode, updateAccessRestrictionParams.accessMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessList, accessMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAccessRestrictionParams {\n");
    sb.append("    accessList: ").append(toIndentedString(accessList)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
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

