/*
 * CloudTower APIs
 * cloudtower operation API and SDK
 *
 * The version of the OpenAPI document: 1.10.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UserLoginInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserLoginInfo {
  /**
   * Gets or Sets typename
   */
  @JsonAdapter(TypenameEnum.Adapter.class)
  public enum TypenameEnum {
    USERLOGININFO("UserLoginInfo");

    private String value;

    TypenameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypenameEnum fromValue(String value) {
      for (TypenameEnum b : TypenameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypenameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypenameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypenameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypenameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPENAME = "__typename";
  @SerializedName(SERIALIZED_NAME_TYPENAME)
  private TypenameEnum typename;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCKED_AT = "locked_at";
  @SerializedName(SERIALIZED_NAME_LOCKED_AT)
  private String lockedAt;

  public static final String SERIALIZED_NAME_MISS_NUM = "miss_num";
  @SerializedName(SERIALIZED_NAME_MISS_NUM)
  private Integer missNum;

  public static final String SERIALIZED_NAME_MISSED_AT = "missed_at";
  @SerializedName(SERIALIZED_NAME_MISSED_AT)
  private String missedAt;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public UserLoginInfo() { 
  }

  public UserLoginInfo typename(TypenameEnum typename) {
    
    this.typename = typename;
    return this;
  }

   /**
   * Get typename
   * @return typename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypenameEnum getTypename() {
    return typename;
  }


  public void setTypename(TypenameEnum typename) {
    this.typename = typename;
  }


  public UserLoginInfo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UserLoginInfo lockedAt(String lockedAt) {
    
    this.lockedAt = lockedAt;
    return this;
  }

   /**
   * Get lockedAt
   * @return lockedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLockedAt() {
    return lockedAt;
  }


  public void setLockedAt(String lockedAt) {
    this.lockedAt = lockedAt;
  }


  public UserLoginInfo missNum(Integer missNum) {
    
    this.missNum = missNum;
    return this;
  }

   /**
   * Get missNum
   * @return missNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMissNum() {
    return missNum;
  }


  public void setMissNum(Integer missNum) {
    this.missNum = missNum;
  }


  public UserLoginInfo missedAt(String missedAt) {
    
    this.missedAt = missedAt;
    return this;
  }

   /**
   * Get missedAt
   * @return missedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMissedAt() {
    return missedAt;
  }


  public void setMissedAt(String missedAt) {
    this.missedAt = missedAt;
  }


  public UserLoginInfo user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLoginInfo userLoginInfo = (UserLoginInfo) o;
    return Objects.equals(this.typename, userLoginInfo.typename) &&
        Objects.equals(this.id, userLoginInfo.id) &&
        Objects.equals(this.lockedAt, userLoginInfo.lockedAt) &&
        Objects.equals(this.missNum, userLoginInfo.missNum) &&
        Objects.equals(this.missedAt, userLoginInfo.missedAt) &&
        Objects.equals(this.user, userLoginInfo.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(typename, id, lockedAt, missNum, missedAt, user);
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
    sb.append("class UserLoginInfo {\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockedAt: ").append(toIndentedString(lockedAt)).append("\n");
    sb.append("    missNum: ").append(toIndentedString(missNum)).append("\n");
    sb.append("    missedAt: ").append(toIndentedString(missedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
