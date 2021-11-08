
package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NicWhereInput;
import com.smartx.tower.model.VlanWhereInput;
import com.smartx.tower.model.VmNicModel;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class VmNicParams {
  public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
  private String subnetMask;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_NIC_ID = "nic_id";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;

  public static final String SERIALIZED_NAME_CONNECT_VLAN_ID = "connect_vlan_id";
  @SerializedName(SERIALIZED_NAME_CONNECT_VLAN_ID)
  private String connectVlanId;

  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private String mirror;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private VmNicModel model;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public VmNicParams subnetMask(String subnetMask) {

    this.subnetMask = subnetMask;
    return this;
  }

  /**
   * Get subnetMask
   * 
   * @return subnetMask
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMask() {
    return subnetMask;
  }

  public void setMaxBandwidthPolicy(String subnetMask) {
    this.subnetMask = subnetMask;
  }

  public VmNicParams gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Get gateway
   * 
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

  public VmNicParams ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Get ipAddress
   * 
   * @return ipAddress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public VmNicParams nicId(String nicId) {
    this.nicId = nicId;
    return this;
  }

  /**
   * Get nicId
   * 
   * @return nicId
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "", required = true)
  public String getNicId() {
    return nicId;
  }

  public void setNicId(String nicId) {
    this.nicId = nicId;
  }

  public VmNicParams connectVlanId(String connectVlanId) {
    this.connectVlanId = connectVlanId;
    return this;
  }

  /**
   * Get connectVlanId
   * 
   * @return connectVlanId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getConnectVlanId() {
    return connectVlanId;
  }

  public void setConnectVlanId(String connectVlanId) {
    this.connectVlanId = connectVlanId;
  }

  public VmNicParams mirror(String mirror) {
    this.mirror = mirror;
    return this;
  }

  /**
   * Get mirror
   * 
   * @return mirror
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMirror() {
    return mirror;
  }

  public void setMirror(String mirror) {
    this.mirror = mirror;
  }

  public VmNicParams model(VmNicModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * 
   * @return model
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public VmNicModel getModel() {
    return model;
  }

  public void setModel(VmNicModel model) {
    this.model = model;
  }

  public VmNicParams enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * 
   * @return enabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public VmNicParams macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Get macAddress
   * 
   * @return macAddress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public VmNicParams localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * Get localId
   * 
   * @return localId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }
}