package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VlanModeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VmNicMetaData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmNicMetaData {
  public static final String SERIALIZED_NAME_VLAN_NAME = "vlan_name";
  @SerializedName(SERIALIZED_NAME_VLAN_NAME)
  private String vlanName;

  public static final String SERIALIZED_NAME_VLAN_MODE_TYPE = "vlan_mode_type";
  @SerializedName(SERIALIZED_NAME_VLAN_MODE_TYPE)
  private VlanModeType vlanModeType;

  public static final String SERIALIZED_NAME_VLAN_LOCAL_ID = "vlan_local_id";
  @SerializedName(SERIALIZED_NAME_VLAN_LOCAL_ID)
  private String vlanLocalId;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private Boolean mirror;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS = "ingress_rate_limit_max_rate_in_bitps";
  @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
  private Double ingressRateLimitMaxRateInBitps;

  public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED = "ingress_rate_limit_enabled";
  @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED)
  private Boolean ingressRateLimitEnabled;

  public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT = "ingress_rate_limit_burst_in_bit";
  @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT)
  private Double ingressRateLimitBurstInBit;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS = "egress_rate_limit_max_rate_in_bitps";
  @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
  private Double egressRateLimitMaxRateInBitps;

  public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED = "egress_rate_limit_enabled";
  @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED)
  private Boolean egressRateLimitEnabled;

  public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT = "egress_rate_limit_burst_in_bit";
  @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT)
  private Double egressRateLimitBurstInBit;

  public VmNicMetaData() { 
  }

  public VmNicMetaData vlanName(String vlanName) {
    
    this.vlanName = vlanName;
    return this;
  }

   /**
   * Get vlanName
   * @return vlanName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVlanName() {
    return vlanName;
  }


  public void setVlanName(String vlanName) {
    this.vlanName = vlanName;
  }


  public VmNicMetaData vlanModeType(VlanModeType vlanModeType) {
    
    this.vlanModeType = vlanModeType;
    return this;
  }

   /**
   * Get vlanModeType
   * @return vlanModeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VlanModeType getVlanModeType() {
    return vlanModeType;
  }


  public void setVlanModeType(VlanModeType vlanModeType) {
    this.vlanModeType = vlanModeType;
  }


  public VmNicMetaData vlanLocalId(String vlanLocalId) {
    
    this.vlanLocalId = vlanLocalId;
    return this;
  }

   /**
   * Get vlanLocalId
   * @return vlanLocalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVlanLocalId() {
    return vlanLocalId;
  }


  public void setVlanLocalId(String vlanLocalId) {
    this.vlanLocalId = vlanLocalId;
  }


  public VmNicMetaData model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public VmNicMetaData mirror(Boolean mirror) {
    
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMirror() {
    return mirror;
  }


  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }


  public VmNicMetaData macAddress(String macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
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


  public VmNicMetaData localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
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


  public VmNicMetaData ingressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {
    
    this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
    return this;
  }

   /**
   * Get ingressRateLimitMaxRateInBitps
   * @return ingressRateLimitMaxRateInBitps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIngressRateLimitMaxRateInBitps() {
    return ingressRateLimitMaxRateInBitps;
  }


  public void setIngressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {
    this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
  }


  public VmNicMetaData ingressRateLimitEnabled(Boolean ingressRateLimitEnabled) {
    
    this.ingressRateLimitEnabled = ingressRateLimitEnabled;
    return this;
  }

   /**
   * Get ingressRateLimitEnabled
   * @return ingressRateLimitEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIngressRateLimitEnabled() {
    return ingressRateLimitEnabled;
  }


  public void setIngressRateLimitEnabled(Boolean ingressRateLimitEnabled) {
    this.ingressRateLimitEnabled = ingressRateLimitEnabled;
  }


  public VmNicMetaData ingressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {
    
    this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
    return this;
  }

   /**
   * Get ingressRateLimitBurstInBit
   * @return ingressRateLimitBurstInBit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIngressRateLimitBurstInBit() {
    return ingressRateLimitBurstInBit;
  }


  public void setIngressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {
    this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
  }


  public VmNicMetaData enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
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


  public VmNicMetaData egressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {
    
    this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
    return this;
  }

   /**
   * Get egressRateLimitMaxRateInBitps
   * @return egressRateLimitMaxRateInBitps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEgressRateLimitMaxRateInBitps() {
    return egressRateLimitMaxRateInBitps;
  }


  public void setEgressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {
    this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
  }


  public VmNicMetaData egressRateLimitEnabled(Boolean egressRateLimitEnabled) {
    
    this.egressRateLimitEnabled = egressRateLimitEnabled;
    return this;
  }

   /**
   * Get egressRateLimitEnabled
   * @return egressRateLimitEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEgressRateLimitEnabled() {
    return egressRateLimitEnabled;
  }


  public void setEgressRateLimitEnabled(Boolean egressRateLimitEnabled) {
    this.egressRateLimitEnabled = egressRateLimitEnabled;
  }


  public VmNicMetaData egressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {
    
    this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
    return this;
  }

   /**
   * Get egressRateLimitBurstInBit
   * @return egressRateLimitBurstInBit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEgressRateLimitBurstInBit() {
    return egressRateLimitBurstInBit;
  }


  public void setEgressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {
    this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmNicMetaData vmNicMetaData = (VmNicMetaData) o;
    return Objects.equals(this.vlanName, vmNicMetaData.vlanName) &&
        Objects.equals(this.vlanModeType, vmNicMetaData.vlanModeType) &&
        Objects.equals(this.vlanLocalId, vmNicMetaData.vlanLocalId) &&
        Objects.equals(this.model, vmNicMetaData.model) &&
        Objects.equals(this.mirror, vmNicMetaData.mirror) &&
        Objects.equals(this.macAddress, vmNicMetaData.macAddress) &&
        Objects.equals(this.localId, vmNicMetaData.localId) &&
        Objects.equals(this.ingressRateLimitMaxRateInBitps, vmNicMetaData.ingressRateLimitMaxRateInBitps) &&
        Objects.equals(this.ingressRateLimitEnabled, vmNicMetaData.ingressRateLimitEnabled) &&
        Objects.equals(this.ingressRateLimitBurstInBit, vmNicMetaData.ingressRateLimitBurstInBit) &&
        Objects.equals(this.enabled, vmNicMetaData.enabled) &&
        Objects.equals(this.egressRateLimitMaxRateInBitps, vmNicMetaData.egressRateLimitMaxRateInBitps) &&
        Objects.equals(this.egressRateLimitEnabled, vmNicMetaData.egressRateLimitEnabled) &&
        Objects.equals(this.egressRateLimitBurstInBit, vmNicMetaData.egressRateLimitBurstInBit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlanName, vlanModeType, vlanLocalId, model, mirror, macAddress, localId, ingressRateLimitMaxRateInBitps, ingressRateLimitEnabled, ingressRateLimitBurstInBit, enabled, egressRateLimitMaxRateInBitps, egressRateLimitEnabled, egressRateLimitBurstInBit);
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
    sb.append("class VmNicMetaData {\n");
    sb.append("    vlanName: ").append(toIndentedString(vlanName)).append("\n");
    sb.append("    vlanModeType: ").append(toIndentedString(vlanModeType)).append("\n");
    sb.append("    vlanLocalId: ").append(toIndentedString(vlanLocalId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    ingressRateLimitMaxRateInBitps: ").append(toIndentedString(ingressRateLimitMaxRateInBitps)).append("\n");
    sb.append("    ingressRateLimitEnabled: ").append(toIndentedString(ingressRateLimitEnabled)).append("\n");
    sb.append("    ingressRateLimitBurstInBit: ").append(toIndentedString(ingressRateLimitBurstInBit)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    egressRateLimitMaxRateInBitps: ").append(toIndentedString(egressRateLimitMaxRateInBitps)).append("\n");
    sb.append("    egressRateLimitEnabled: ").append(toIndentedString(egressRateLimitEnabled)).append("\n");
    sb.append("    egressRateLimitBurstInBit: ").append(toIndentedString(egressRateLimitBurstInBit)).append("\n");
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

