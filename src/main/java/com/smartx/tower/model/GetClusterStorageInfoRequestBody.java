package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.GetClusterStorageInfoEffect;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetClusterStorageInfoRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GetClusterStorageInfoRequestBody {
  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private GetClusterStorageInfoEffect effect;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private ClusterWhereInput where;

  public GetClusterStorageInfoRequestBody() { 
  }

  public GetClusterStorageInfoRequestBody effect(GetClusterStorageInfoEffect effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetClusterStorageInfoEffect getEffect() {
    return effect;
  }


  public void setEffect(GetClusterStorageInfoEffect effect) {
    this.effect = effect;
  }


  public GetClusterStorageInfoRequestBody where(ClusterWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ClusterWhereInput getWhere() {
    return where;
  }


  public void setWhere(ClusterWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClusterStorageInfoRequestBody getClusterStorageInfoRequestBody = (GetClusterStorageInfoRequestBody) o;
    return Objects.equals(this.effect, getClusterStorageInfoRequestBody.effect) &&
        Objects.equals(this.where, getClusterStorageInfoRequestBody.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClusterStorageInfoRequestBody {\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

