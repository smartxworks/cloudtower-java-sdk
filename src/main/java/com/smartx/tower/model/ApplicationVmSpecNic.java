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
 * ApplicationVmSpecNic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ApplicationVmSpecNic {
  public static final String SERIALIZED_NAME_VLAN_ID = "vlanId";
  @SerializedName(SERIALIZED_NAME_VLAN_ID)
  private String vlanId;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_DHCP = "dhcp";
  @SerializedName(SERIALIZED_NAME_DHCP)
  private Boolean dhcp;

  public ApplicationVmSpecNic() { 
  }

  public ApplicationVmSpecNic vlanId(String vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVlanId() {
    return vlanId;
  }


  public void setVlanId(String vlanId) {
    this.vlanId = vlanId;
  }


  public ApplicationVmSpecNic mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public ApplicationVmSpecNic ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public ApplicationVmSpecNic gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public ApplicationVmSpecNic dhcp(Boolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Get dhcp
   * @return dhcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDhcp() {
    return dhcp;
  }


  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVmSpecNic applicationVmSpecNic = (ApplicationVmSpecNic) o;
    return Objects.equals(this.vlanId, applicationVmSpecNic.vlanId) &&
        Objects.equals(this.mask, applicationVmSpecNic.mask) &&
        Objects.equals(this.ip, applicationVmSpecNic.ip) &&
        Objects.equals(this.gateway, applicationVmSpecNic.gateway) &&
        Objects.equals(this.dhcp, applicationVmSpecNic.dhcp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlanId, mask, ip, gateway, dhcp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVmSpecNic {\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
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

