package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.MgtIpMapper;
import com.smartx.tower.model.NtpMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterNetworkSettingUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ClusterNetworkSettingUpdationParamsData {
  public static final String SERIALIZED_NAME_MGT_IP_MAPPER = "mgt_ip_mapper";
  @SerializedName(SERIALIZED_NAME_MGT_IP_MAPPER)
  private List<MgtIpMapper> mgtIpMapper = null;

  public static final String SERIALIZED_NAME_MGT_NETMASK = "mgt_netmask";
  @SerializedName(SERIALIZED_NAME_MGT_NETMASK)
  private String mgtNetmask;

  public static final String SERIALIZED_NAME_MGT_GATEWAY = "mgt_gateway";
  @SerializedName(SERIALIZED_NAME_MGT_GATEWAY)
  private String mgtGateway;

  public static final String SERIALIZED_NAME_NTP_MODE = "ntp_mode";
  @SerializedName(SERIALIZED_NAME_NTP_MODE)
  private NtpMode ntpMode;

  public static final String SERIALIZED_NAME_NTP_SERVERS = "ntp_servers";
  @SerializedName(SERIALIZED_NAME_NTP_SERVERS)
  private List<String> ntpServers = null;

  public static final String SERIALIZED_NAME_DNS = "dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  private List<String> dns = null;

  public static final String SERIALIZED_NAME_ISCSI_VIP = "iscsi_vip";
  @SerializedName(SERIALIZED_NAME_ISCSI_VIP)
  private String iscsiVip;

  public static final String SERIALIZED_NAME_MANAGEMENT_VIP = "management_vip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP)
  private String managementVip;

  public ClusterNetworkSettingUpdationParamsData() { 
  }

  public ClusterNetworkSettingUpdationParamsData mgtIpMapper(List<MgtIpMapper> mgtIpMapper) {
    
    this.mgtIpMapper = mgtIpMapper;
    return this;
  }

  public ClusterNetworkSettingUpdationParamsData addMgtIpMapperItem(MgtIpMapper mgtIpMapperItem) {
    if (this.mgtIpMapper == null) {
      this.mgtIpMapper = new ArrayList<MgtIpMapper>();
    }
    this.mgtIpMapper.add(mgtIpMapperItem);
    return this;
  }

   /**
   * Get mgtIpMapper
   * @return mgtIpMapper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MgtIpMapper> getMgtIpMapper() {
    return mgtIpMapper;
  }


  public void setMgtIpMapper(List<MgtIpMapper> mgtIpMapper) {
    this.mgtIpMapper = mgtIpMapper;
  }


  public ClusterNetworkSettingUpdationParamsData mgtNetmask(String mgtNetmask) {
    
    this.mgtNetmask = mgtNetmask;
    return this;
  }

   /**
   * Get mgtNetmask
   * @return mgtNetmask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMgtNetmask() {
    return mgtNetmask;
  }


  public void setMgtNetmask(String mgtNetmask) {
    this.mgtNetmask = mgtNetmask;
  }


  public ClusterNetworkSettingUpdationParamsData mgtGateway(String mgtGateway) {
    
    this.mgtGateway = mgtGateway;
    return this;
  }

   /**
   * Get mgtGateway
   * @return mgtGateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMgtGateway() {
    return mgtGateway;
  }


  public void setMgtGateway(String mgtGateway) {
    this.mgtGateway = mgtGateway;
  }


  public ClusterNetworkSettingUpdationParamsData ntpMode(NtpMode ntpMode) {
    
    this.ntpMode = ntpMode;
    return this;
  }

   /**
   * Get ntpMode
   * @return ntpMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NtpMode getNtpMode() {
    return ntpMode;
  }


  public void setNtpMode(NtpMode ntpMode) {
    this.ntpMode = ntpMode;
  }


  public ClusterNetworkSettingUpdationParamsData ntpServers(List<String> ntpServers) {
    
    this.ntpServers = ntpServers;
    return this;
  }

  public ClusterNetworkSettingUpdationParamsData addNtpServersItem(String ntpServersItem) {
    if (this.ntpServers == null) {
      this.ntpServers = new ArrayList<String>();
    }
    this.ntpServers.add(ntpServersItem);
    return this;
  }

   /**
   * Get ntpServers
   * @return ntpServers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNtpServers() {
    return ntpServers;
  }


  public void setNtpServers(List<String> ntpServers) {
    this.ntpServers = ntpServers;
  }


  public ClusterNetworkSettingUpdationParamsData dns(List<String> dns) {
    
    this.dns = dns;
    return this;
  }

  public ClusterNetworkSettingUpdationParamsData addDnsItem(String dnsItem) {
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


  public ClusterNetworkSettingUpdationParamsData iscsiVip(String iscsiVip) {
    
    this.iscsiVip = iscsiVip;
    return this;
  }

   /**
   * Get iscsiVip
   * @return iscsiVip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiVip() {
    return iscsiVip;
  }


  public void setIscsiVip(String iscsiVip) {
    this.iscsiVip = iscsiVip;
  }


  public ClusterNetworkSettingUpdationParamsData managementVip(String managementVip) {
    
    this.managementVip = managementVip;
    return this;
  }

   /**
   * Get managementVip
   * @return managementVip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementVip() {
    return managementVip;
  }


  public void setManagementVip(String managementVip) {
    this.managementVip = managementVip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNetworkSettingUpdationParamsData clusterNetworkSettingUpdationParamsData = (ClusterNetworkSettingUpdationParamsData) o;
    return Objects.equals(this.mgtIpMapper, clusterNetworkSettingUpdationParamsData.mgtIpMapper) &&
        Objects.equals(this.mgtNetmask, clusterNetworkSettingUpdationParamsData.mgtNetmask) &&
        Objects.equals(this.mgtGateway, clusterNetworkSettingUpdationParamsData.mgtGateway) &&
        Objects.equals(this.ntpMode, clusterNetworkSettingUpdationParamsData.ntpMode) &&
        Objects.equals(this.ntpServers, clusterNetworkSettingUpdationParamsData.ntpServers) &&
        Objects.equals(this.dns, clusterNetworkSettingUpdationParamsData.dns) &&
        Objects.equals(this.iscsiVip, clusterNetworkSettingUpdationParamsData.iscsiVip) &&
        Objects.equals(this.managementVip, clusterNetworkSettingUpdationParamsData.managementVip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mgtIpMapper, mgtNetmask, mgtGateway, ntpMode, ntpServers, dns, iscsiVip, managementVip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNetworkSettingUpdationParamsData {\n");
    sb.append("    mgtIpMapper: ").append(toIndentedString(mgtIpMapper)).append("\n");
    sb.append("    mgtNetmask: ").append(toIndentedString(mgtNetmask)).append("\n");
    sb.append("    mgtGateway: ").append(toIndentedString(mgtGateway)).append("\n");
    sb.append("    ntpMode: ").append(toIndentedString(ntpMode)).append("\n");
    sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    iscsiVip: ").append(toIndentedString(iscsiVip)).append("\n");
    sb.append("    managementVip: ").append(toIndentedString(managementVip)).append("\n");
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

