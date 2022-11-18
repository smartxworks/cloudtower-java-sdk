package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.CloudTowerApplicationPackageOrderByInput;
import com.smartx.tower.model.CloudTowerApplicationPackageWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GetCloudTowerApplicationPackagesConnectionRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GetCloudTowerApplicationPackagesConnectionRequestBody {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private String before;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Integer first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Integer last;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private CloudTowerApplicationPackageOrderByInput orderBy;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Integer skip;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private CloudTowerApplicationPackageWhereInput where;

  public GetCloudTowerApplicationPackagesConnectionRequestBody() { 
  }

  public GetCloudTowerApplicationPackagesConnectionRequestBody after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public GetCloudTowerApplicationPackagesConnectionRequestBody before(String before) {
    
    this.before = before;
    return this;
  }

   /**
   * Get before
   * @return before
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBefore() {
    return before;
  }


  public void setBefore(String before) {
    this.before = before;
  }


  public GetCloudTowerApplicationPackagesConnectionRequestBody first(Integer first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFirst() {
    return first;
  }


  public void setFirst(Integer first) {
    this.first = first;
  }


  public GetCloudTowerApplicationPackagesConnectionRequestBody last(Integer last) {
    
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLast() {
    return last;
  }


  public void setLast(Integer last) {
    this.last = last;
  }


  public GetCloudTowerApplicationPackagesConnectionRequestBody orderBy(CloudTowerApplicationPackageOrderByInput orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CloudTowerApplicationPackageOrderByInput getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(CloudTowerApplicationPackageOrderByInput orderBy) {
    this.orderBy = orderBy;
  }


  public GetCloudTowerApplicationPackagesConnectionRequestBody skip(Integer skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSkip() {
    return skip;
  }


  public void setSkip(Integer skip) {
    this.skip = skip;
  }


  public GetCloudTowerApplicationPackagesConnectionRequestBody where(CloudTowerApplicationPackageWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CloudTowerApplicationPackageWhereInput getWhere() {
    return where;
  }


  public void setWhere(CloudTowerApplicationPackageWhereInput where) {
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
    GetCloudTowerApplicationPackagesConnectionRequestBody getCloudTowerApplicationPackagesConnectionRequestBody = (GetCloudTowerApplicationPackagesConnectionRequestBody) o;
    return Objects.equals(this.after, getCloudTowerApplicationPackagesConnectionRequestBody.after) &&
        Objects.equals(this.before, getCloudTowerApplicationPackagesConnectionRequestBody.before) &&
        Objects.equals(this.first, getCloudTowerApplicationPackagesConnectionRequestBody.first) &&
        Objects.equals(this.last, getCloudTowerApplicationPackagesConnectionRequestBody.last) &&
        Objects.equals(this.orderBy, getCloudTowerApplicationPackagesConnectionRequestBody.orderBy) &&
        Objects.equals(this.skip, getCloudTowerApplicationPackagesConnectionRequestBody.skip) &&
        Objects.equals(this.where, getCloudTowerApplicationPackagesConnectionRequestBody.where);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, first, last, orderBy, skip, where);
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
    sb.append("class GetCloudTowerApplicationPackagesConnectionRequestBody {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
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

