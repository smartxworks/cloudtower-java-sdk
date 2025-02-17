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
 * NtpServiceUrl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NtpServiceUrl {
  public static final String SERIALIZED_NAME_NTP_SERVICE_URL = "ntp_service_url";
  @SerializedName(SERIALIZED_NAME_NTP_SERVICE_URL)
  private String ntpServiceUrl;

  public NtpServiceUrl() { 
  }

  public NtpServiceUrl ntpServiceUrl(String ntpServiceUrl) {
    
    this.ntpServiceUrl = ntpServiceUrl;
    return this;
  }

   /**
   * Get ntpServiceUrl
   * @return ntpServiceUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNtpServiceUrl() {
    return ntpServiceUrl;
  }


  public void setNtpServiceUrl(String ntpServiceUrl) {
    this.ntpServiceUrl = ntpServiceUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NtpServiceUrl ntpServiceUrl = (NtpServiceUrl) o;
    return Objects.equals(this.ntpServiceUrl, ntpServiceUrl.ntpServiceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ntpServiceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NtpServiceUrl {\n");
    sb.append("    ntpServiceUrl: ").append(toIndentedString(ntpServiceUrl)).append("\n");
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

