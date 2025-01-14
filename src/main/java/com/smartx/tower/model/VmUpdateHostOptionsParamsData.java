package com.smartx.tower.model;

import java.util.Objects;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.ConditionalNullable.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * VmUpdateHostOptionsParamsData
 */
// @JsonAdapter(VmUpdateHostOptionsParamsData.Serializer.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmUpdateHostOptionsParamsData extends ConditionalNullablePojo {
  public static final String SERIALIZED_NAME_NTP_SERVERS = "ntp_servers";
  @SerializedName(SERIALIZED_NAME_NTP_SERVERS)
  private List<String> ntpServers = null;

  public static final String SERIALIZED_NAME_DNS_SERVERS = "dns_servers";
  @SerializedName(SERIALIZED_NAME_DNS_SERVERS)
  private List<String> dnsServers = null;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public VmUpdateHostOptionsParamsData() {
  }

  public VmUpdateHostOptionsParamsData ntpServers(List<String> ntpServers) {

    this.ntpServers = ntpServers;
    return this;
  }

  public VmUpdateHostOptionsParamsData presentNtpServers() {
    _isPresent_.add(SERIALIZED_NAME_NTP_SERVERS);
    return this;
  }

  public VmUpdateHostOptionsParamsData absentNtpServers() {
    _isPresent_.remove(SERIALIZED_NAME_NTP_SERVERS);
    return this;
  }

  public VmUpdateHostOptionsParamsData addNtpServersItem(String ntpServersItem) {
    if (this.ntpServers == null) {
      this.ntpServers = new ArrayList<String>();
    }
    this.ntpServers.add(ntpServersItem);
    return this;
  }

  /**
   * Get ntpServers
   * 
   * @return ntpServers
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNtpServers() {
    return ntpServers;
  }

  public void setPresentNtpServers(boolean present) {
    if (present) {
      _isPresent_.add(SERIALIZED_NAME_NTP_SERVERS);
    } else {
      _isPresent_.remove(SERIALIZED_NAME_NTP_SERVERS);
    }
  }

  public void setNtpServers(List<String> ntpServers) {
    this.ntpServers = ntpServers;
  }

  public VmUpdateHostOptionsParamsData dnsServers(List<String> dnsServers) {

    this.dnsServers = dnsServers;
    return this;
  }

  public VmUpdateHostOptionsParamsData presentDnsServers() {
    _isPresent_.add(SERIALIZED_NAME_DNS_SERVERS);
    return this;
  }

  public VmUpdateHostOptionsParamsData absentDnsServers() {
    _isPresent_.remove(SERIALIZED_NAME_DNS_SERVERS);
    return this;
  }

  public VmUpdateHostOptionsParamsData addDnsServersItem(String dnsServersItem) {
    if (this.dnsServers == null) {
      this.dnsServers = new ArrayList<String>();
    }
    this.dnsServers.add(dnsServersItem);
    return this;
  }

  /**
   * Get dnsServers
   * 
   * @return dnsServers
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDnsServers() {
    return dnsServers;
  }

  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }

  public void setPresentDnsServers(boolean present) {
    if (present) {
      _isPresent_.add(SERIALIZED_NAME_DNS_SERVERS);
    } else {
      _isPresent_.remove(SERIALIZED_NAME_DNS_SERVERS);
    }
  }

  public VmUpdateHostOptionsParamsData hostname(String hostname) {

    this.hostname = hostname;
    return this;
  }

  public VmUpdateHostOptionsParamsData presentHostname() {
    _isPresent_.add(SERIALIZED_NAME_HOSTNAME);
    return this;
  }

  public VmUpdateHostOptionsParamsData absentHostname() {
    _isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
    return this;
  }

  /**
   * Get hostname
   * 
   * @return hostname
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public void setPresentHostname(boolean present) {
    if (present) {
      _isPresent_.add(SERIALIZED_NAME_HOSTNAME);
    } else {
      _isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateHostOptionsParamsData vmUpdateHostOptionsParamsData = (VmUpdateHostOptionsParamsData) o;
    return Objects.equals(this.ntpServers, vmUpdateHostOptionsParamsData.ntpServers) &&
        Objects.equals(this.dnsServers, vmUpdateHostOptionsParamsData.dnsServers) &&
        Objects.equals(this.hostname, vmUpdateHostOptionsParamsData.hostname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ntpServers, dnsServers, hostname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateHostOptionsParamsData {\n");
    sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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
