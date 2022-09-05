package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedHost;
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedVds;
import com.smartx.tower.model.NetworkType;
import com.smartx.tower.model.NicDriverState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Nic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class Nic {
  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_DRIVER_STATE = "driver_state";
  @SerializedName(SERIALIZED_NAME_DRIVER_STATE)
  private NicDriverState driverState;

  public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";
  @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
  private String gatewayIp;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private NestedHost host;

  public static final String SERIALIZED_NAME_IBDEV = "ibdev";
  @SerializedName(SERIALIZED_NAME_IBDEV)
  private String ibdev;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_IS_SRIOV = "is_sriov";
  @SerializedName(SERIALIZED_NAME_IS_SRIOV)
  private Boolean isSriov;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_MAX_VF_NUM = "max_vf_num";
  @SerializedName(SERIALIZED_NAME_MAX_VF_NUM)
  private Integer maxVfNum;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NIC_UUID = "nic_uuid";
  @SerializedName(SERIALIZED_NAME_NIC_UUID)
  private String nicUuid;

  public static final String SERIALIZED_NAME_PHYSICAL = "physical";
  @SerializedName(SERIALIZED_NAME_PHYSICAL)
  private Boolean physical;

  public static final String SERIALIZED_NAME_RDMA_ENABLED = "rdma_enabled";
  @SerializedName(SERIALIZED_NAME_RDMA_ENABLED)
  private Boolean rdmaEnabled;

  public static final String SERIALIZED_NAME_RUNNING = "running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Boolean running;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Long speed;

  public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";
  @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
  private String subnetMask;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
  private Integer totalVfNum;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NetworkType type;

  public static final String SERIALIZED_NAME_UP = "up";
  @SerializedName(SERIALIZED_NAME_UP)
  private Boolean up;

  public static final String SERIALIZED_NAME_USED_VF_NUM = "used_vf_num";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM)
  private Integer usedVfNum;

  public static final String SERIALIZED_NAME_VDS = "vds";
  @SerializedName(SERIALIZED_NAME_VDS)
  private NestedVds vds;

  public Nic() { 
  }

  public Nic driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public Nic driverState(NicDriverState driverState) {
    
    this.driverState = driverState;
    return this;
  }

   /**
   * Get driverState
   * @return driverState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicDriverState getDriverState() {
    return driverState;
  }


  public void setDriverState(NicDriverState driverState) {
    this.driverState = driverState;
  }


  public Nic gatewayIp(String gatewayIp) {
    
    this.gatewayIp = gatewayIp;
    return this;
  }

   /**
   * Get gatewayIp
   * @return gatewayIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayIp() {
    return gatewayIp;
  }


  public void setGatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
  }


  public Nic host(NestedHost host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedHost getHost() {
    return host;
  }


  public void setHost(NestedHost host) {
    this.host = host;
  }


  public Nic ibdev(String ibdev) {
    
    this.ibdev = ibdev;
    return this;
  }

   /**
   * Get ibdev
   * @return ibdev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIbdev() {
    return ibdev;
  }


  public void setIbdev(String ibdev) {
    this.ibdev = ibdev;
  }


  public Nic id(String id) {
    
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


  public Nic ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
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


  public Nic isSriov(Boolean isSriov) {
    
    this.isSriov = isSriov;
    return this;
  }

   /**
   * Get isSriov
   * @return isSriov
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSriov() {
    return isSriov;
  }


  public void setIsSriov(Boolean isSriov) {
    this.isSriov = isSriov;
  }


  public Nic labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public Nic addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public Nic localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public Nic macAddress(String macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMacAddress() {
    return macAddress;
  }


  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public Nic maxVfNum(Integer maxVfNum) {
    
    this.maxVfNum = maxVfNum;
    return this;
  }

   /**
   * Get maxVfNum
   * @return maxVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVfNum() {
    return maxVfNum;
  }


  public void setMaxVfNum(Integer maxVfNum) {
    this.maxVfNum = maxVfNum;
  }


  public Nic model(String model) {
    
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


  public Nic mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  public Nic name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Nic nicUuid(String nicUuid) {
    
    this.nicUuid = nicUuid;
    return this;
  }

   /**
   * Get nicUuid
   * @return nicUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNicUuid() {
    return nicUuid;
  }


  public void setNicUuid(String nicUuid) {
    this.nicUuid = nicUuid;
  }


  public Nic physical(Boolean physical) {
    
    this.physical = physical;
    return this;
  }

   /**
   * Get physical
   * @return physical
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPhysical() {
    return physical;
  }


  public void setPhysical(Boolean physical) {
    this.physical = physical;
  }


  public Nic rdmaEnabled(Boolean rdmaEnabled) {
    
    this.rdmaEnabled = rdmaEnabled;
    return this;
  }

   /**
   * Get rdmaEnabled
   * @return rdmaEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRdmaEnabled() {
    return rdmaEnabled;
  }


  public void setRdmaEnabled(Boolean rdmaEnabled) {
    this.rdmaEnabled = rdmaEnabled;
  }


  public Nic running(Boolean running) {
    
    this.running = running;
    return this;
  }

   /**
   * Get running
   * @return running
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRunning() {
    return running;
  }


  public void setRunning(Boolean running) {
    this.running = running;
  }


  public Nic speed(Long speed) {
    
    this.speed = speed;
    return this;
  }

   /**
   * Get speed
   * @return speed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSpeed() {
    return speed;
  }


  public void setSpeed(Long speed) {
    this.speed = speed;
  }


  public Nic subnetMask(String subnetMask) {
    
    this.subnetMask = subnetMask;
    return this;
  }

   /**
   * Get subnetMask
   * @return subnetMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubnetMask() {
    return subnetMask;
  }


  public void setSubnetMask(String subnetMask) {
    this.subnetMask = subnetMask;
  }


  public Nic totalVfNum(Integer totalVfNum) {
    
    this.totalVfNum = totalVfNum;
    return this;
  }

   /**
   * Get totalVfNum
   * @return totalVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNum() {
    return totalVfNum;
  }


  public void setTotalVfNum(Integer totalVfNum) {
    this.totalVfNum = totalVfNum;
  }


  public Nic type(NetworkType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkType getType() {
    return type;
  }


  public void setType(NetworkType type) {
    this.type = type;
  }


  public Nic up(Boolean up) {
    
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getUp() {
    return up;
  }


  public void setUp(Boolean up) {
    this.up = up;
  }


  public Nic usedVfNum(Integer usedVfNum) {
    
    this.usedVfNum = usedVfNum;
    return this;
  }

   /**
   * Get usedVfNum
   * @return usedVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedVfNum() {
    return usedVfNum;
  }


  public void setUsedVfNum(Integer usedVfNum) {
    this.usedVfNum = usedVfNum;
  }


  public Nic vds(NestedVds vds) {
    
    this.vds = vds;
    return this;
  }

   /**
   * Get vds
   * @return vds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedVds getVds() {
    return vds;
  }


  public void setVds(NestedVds vds) {
    this.vds = vds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nic nic = (Nic) o;
    return Objects.equals(this.driver, nic.driver) &&
        Objects.equals(this.driverState, nic.driverState) &&
        Objects.equals(this.gatewayIp, nic.gatewayIp) &&
        Objects.equals(this.host, nic.host) &&
        Objects.equals(this.ibdev, nic.ibdev) &&
        Objects.equals(this.id, nic.id) &&
        Objects.equals(this.ipAddress, nic.ipAddress) &&
        Objects.equals(this.isSriov, nic.isSriov) &&
        Objects.equals(this.labels, nic.labels) &&
        Objects.equals(this.localId, nic.localId) &&
        Objects.equals(this.macAddress, nic.macAddress) &&
        Objects.equals(this.maxVfNum, nic.maxVfNum) &&
        Objects.equals(this.model, nic.model) &&
        Objects.equals(this.mtu, nic.mtu) &&
        Objects.equals(this.name, nic.name) &&
        Objects.equals(this.nicUuid, nic.nicUuid) &&
        Objects.equals(this.physical, nic.physical) &&
        Objects.equals(this.rdmaEnabled, nic.rdmaEnabled) &&
        Objects.equals(this.running, nic.running) &&
        Objects.equals(this.speed, nic.speed) &&
        Objects.equals(this.subnetMask, nic.subnetMask) &&
        Objects.equals(this.totalVfNum, nic.totalVfNum) &&
        Objects.equals(this.type, nic.type) &&
        Objects.equals(this.up, nic.up) &&
        Objects.equals(this.usedVfNum, nic.usedVfNum) &&
        Objects.equals(this.vds, nic.vds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, driverState, gatewayIp, host, ibdev, id, ipAddress, isSriov, labels, localId, macAddress, maxVfNum, model, mtu, name, nicUuid, physical, rdmaEnabled, running, speed, subnetMask, totalVfNum, type, up, usedVfNum, vds);
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
    sb.append("class Nic {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverState: ").append(toIndentedString(driverState)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    ibdev: ").append(toIndentedString(ibdev)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    isSriov: ").append(toIndentedString(isSriov)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    maxVfNum: ").append(toIndentedString(maxVfNum)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nicUuid: ").append(toIndentedString(nicUuid)).append("\n");
    sb.append("    physical: ").append(toIndentedString(physical)).append("\n");
    sb.append("    rdmaEnabled: ").append(toIndentedString(rdmaEnabled)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
    sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    usedVfNum: ").append(toIndentedString(usedVfNum)).append("\n");
    sb.append("    vds: ").append(toIndentedString(vds)).append("\n");
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

