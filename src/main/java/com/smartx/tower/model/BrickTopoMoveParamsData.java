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
 * BrickTopoMoveParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class BrickTopoMoveParamsData {
  public static final String SERIALIZED_NAME_RACK_TOPO_ID = "rack_topo_id";
  @SerializedName(SERIALIZED_NAME_RACK_TOPO_ID)
  private String rackTopoId;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public BrickTopoMoveParamsData() { 
  }

  public BrickTopoMoveParamsData rackTopoId(String rackTopoId) {
    
    this.rackTopoId = rackTopoId;
    return this;
  }

   /**
   * Get rackTopoId
   * @return rackTopoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRackTopoId() {
    return rackTopoId;
  }


  public void setRackTopoId(String rackTopoId) {
    this.rackTopoId = rackTopoId;
  }


  public BrickTopoMoveParamsData position(Integer position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPosition() {
    return position;
  }


  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrickTopoMoveParamsData brickTopoMoveParamsData = (BrickTopoMoveParamsData) o;
    return Objects.equals(this.rackTopoId, brickTopoMoveParamsData.rackTopoId) &&
        Objects.equals(this.position, brickTopoMoveParamsData.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rackTopoId, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrickTopoMoveParamsData {\n");
    sb.append("    rackTopoId: ").append(toIndentedString(rackTopoId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

