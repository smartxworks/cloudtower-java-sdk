package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ApplicationVmSpecNic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationVmSpecNetwork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ApplicationVmSpecNetwork {
  public static final String SERIALIZED_NAME_NICS = "nics";
  @SerializedName(SERIALIZED_NAME_NICS)
  private List<ApplicationVmSpecNic> nics = null;

  public static final String SERIALIZED_NAME_DNS = "dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  private List<String> dns = null;

  public ApplicationVmSpecNetwork() { 
  }

  public ApplicationVmSpecNetwork nics(List<ApplicationVmSpecNic> nics) {
    
    this.nics = nics;
    return this;
  }

  public ApplicationVmSpecNetwork addNicsItem(ApplicationVmSpecNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<ApplicationVmSpecNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ApplicationVmSpecNic> getNics() {
    return nics;
  }


  public void setNics(List<ApplicationVmSpecNic> nics) {
    this.nics = nics;
  }


  public ApplicationVmSpecNetwork dns(List<String> dns) {
    
    this.dns = dns;
    return this;
  }

  public ApplicationVmSpecNetwork addDnsItem(String dnsItem) {
    if (this.dns == null) {
      this.dns = new ArrayList<String>();
    }
    this.dns.add(dnsItem);
    return this;
  }

   /**
   * Get dns
   * @return dns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDns() {
    return dns;
  }


  public void setDns(List<String> dns) {
    this.dns = dns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVmSpecNetwork applicationVmSpecNetwork = (ApplicationVmSpecNetwork) o;
    return Objects.equals(this.nics, applicationVmSpecNetwork.nics) &&
        Objects.equals(this.dns, applicationVmSpecNetwork.dns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nics, dns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVmSpecNetwork {\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
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

