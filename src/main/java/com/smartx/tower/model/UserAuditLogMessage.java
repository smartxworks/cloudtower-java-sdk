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
 * UserAuditLogMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class UserAuditLogMessage {
  public static final String SERIALIZED_NAME_EN_U_S = "en-US";
  @SerializedName(SERIALIZED_NAME_EN_U_S)
  private String enUS;

  public static final String SERIALIZED_NAME_ZH_C_N = "zh-CN";
  @SerializedName(SERIALIZED_NAME_ZH_C_N)
  private String zhCN;

  public UserAuditLogMessage() { 
  }

  public UserAuditLogMessage enUS(String enUS) {
    
    this.enUS = enUS;
    return this;
  }

   /**
   * Get enUS
   * @return enUS
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEnUS() {
    return enUS;
  }


  public void setEnUS(String enUS) {
    this.enUS = enUS;
  }


  public UserAuditLogMessage zhCN(String zhCN) {
    
    this.zhCN = zhCN;
    return this;
  }

   /**
   * Get zhCN
   * @return zhCN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getZhCN() {
    return zhCN;
  }


  public void setZhCN(String zhCN) {
    this.zhCN = zhCN;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuditLogMessage userAuditLogMessage = (UserAuditLogMessage) o;
    return Objects.equals(this.enUS, userAuditLogMessage.enUS) &&
        Objects.equals(this.zhCN, userAuditLogMessage.zhCN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enUS, zhCN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuditLogMessage {\n");
    sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
    sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
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

