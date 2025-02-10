package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.IommuStatus;
import com.smartx.tower.model.NestedHost;
import com.smartx.tower.model.PciDeviceMdevState;
import com.smartx.tower.model.PciDevicePartitionState;
import com.smartx.tower.model.PciDeviceSriovState;
import com.smartx.tower.model.PciDeviceType;
import com.smartx.tower.model.PciDeviceUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PciDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class PciDevice {
  public static final String SERIALIZED_NAME_BUS = "bus";
  @SerializedName(SERIALIZED_NAME_BUS)
  private String bus;

  public static final String SERIALIZED_NAME_BUS_LOCATION = "bus_location";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION)
  private String busLocation;

  public static final String SERIALIZED_NAME_CLASS_CODE = "class_code";
  @SerializedName(SERIALIZED_NAME_CLASS_CODE)
  private String classCode;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private String deviceType;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_FUNCTION_NUM = "function_num";
  @SerializedName(SERIALIZED_NAME_FUNCTION_NUM)
  private String functionNum;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private NestedHost host;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IOMMU_STATUS = "iommu_status";
  @SerializedName(SERIALIZED_NAME_IOMMU_STATUS)
  private IommuStatus iommuStatus;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_MDEV_STATE = "mdev_state";
  @SerializedName(SERIALIZED_NAME_MDEV_STATE)
  private PciDeviceMdevState mdevState;

  public static final String SERIALIZED_NAME_MDEV_TYPE_ID = "mdev_type_id";
  @SerializedName(SERIALIZED_NAME_MDEV_TYPE_ID)
  private String mdevTypeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARTITIONING_STATE = "partitioning_state";
  @SerializedName(SERIALIZED_NAME_PARTITIONING_STATE)
  private PciDevicePartitionState partitioningState;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_SLOT = "slot";
  @SerializedName(SERIALIZED_NAME_SLOT)
  private String slot;

  public static final String SERIALIZED_NAME_SRIOV_STATE = "sriov_state";
  @SerializedName(SERIALIZED_NAME_SRIOV_STATE)
  private PciDeviceSriovState sriovState;

  public static final String SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID = "subsystem_product_id";
  @SerializedName(SERIALIZED_NAME_SUBSYSTEM_PRODUCT_ID)
  private String subsystemProductId;

  public static final String SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID = "subsystem_vendor_id";
  @SerializedName(SERIALIZED_NAME_SUBSYSTEM_VENDOR_ID)
  private String subsystemVendorId;

  public static final String SERIALIZED_NAME_TOTAL_MDEV_NUM = "total_mdev_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_MDEV_NUM)
  private Integer totalMdevNum;

  public static final String SERIALIZED_NAME_TOTAL_PARTITIONING_NUM = "total_partitioning_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_PARTITIONING_NUM)
  private Integer totalPartitioningNum;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
  private Integer totalVfNum;

  public static final String SERIALIZED_NAME_USAGE_TYPE = "usage_type";
  @SerializedName(SERIALIZED_NAME_USAGE_TYPE)
  private PciDeviceType usageType;

  public static final String SERIALIZED_NAME_USED_MDEV_NUM = "used_mdev_num";
  @SerializedName(SERIALIZED_NAME_USED_MDEV_NUM)
  private Integer usedMdevNum;

  public static final String SERIALIZED_NAME_USED_PARTITIONING_NUM = "used_partitioning_num";
  @SerializedName(SERIALIZED_NAME_USED_PARTITIONING_NUM)
  private Integer usedPartitioningNum;

  public static final String SERIALIZED_NAME_USED_VF_NUM = "used_vf_num";
  @SerializedName(SERIALIZED_NAME_USED_VF_NUM)
  private Integer usedVfNum;

  public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";
  @SerializedName(SERIALIZED_NAME_USER_USAGE)
  private PciDeviceUsage userUsage;

  public static final String SERIALIZED_NAME_VENDOR_ID = "vendor_id";
  @SerializedName(SERIALIZED_NAME_VENDOR_ID)
  private String vendorId;

  public static final String SERIALIZED_NAME_VERDOR_NAME = "verdor_name";
  @SerializedName(SERIALIZED_NAME_VERDOR_NAME)
  private String verdorName;

  public PciDevice() { 
  }

  public PciDevice bus(String bus) {
    
    this.bus = bus;
    return this;
  }

   /**
   * Get bus
   * @return bus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBus() {
    return bus;
  }


  public void setBus(String bus) {
    this.bus = bus;
  }


  public PciDevice busLocation(String busLocation) {
    
    this.busLocation = busLocation;
    return this;
  }

   /**
   * Get busLocation
   * @return busLocation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBusLocation() {
    return busLocation;
  }


  public void setBusLocation(String busLocation) {
    this.busLocation = busLocation;
  }


  public PciDevice classCode(String classCode) {
    
    this.classCode = classCode;
    return this;
  }

   /**
   * Get classCode
   * @return classCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClassCode() {
    return classCode;
  }


  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }


  public PciDevice deviceType(String deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  public PciDevice entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public PciDevice functionNum(String functionNum) {
    
    this.functionNum = functionNum;
    return this;
  }

   /**
   * Get functionNum
   * @return functionNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFunctionNum() {
    return functionNum;
  }


  public void setFunctionNum(String functionNum) {
    this.functionNum = functionNum;
  }


  public PciDevice host(NestedHost host) {
    
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


  public PciDevice id(String id) {
    
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


  public PciDevice iommuStatus(IommuStatus iommuStatus) {
    
    this.iommuStatus = iommuStatus;
    return this;
  }

   /**
   * Get iommuStatus
   * @return iommuStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IommuStatus getIommuStatus() {
    return iommuStatus;
  }


  public void setIommuStatus(IommuStatus iommuStatus) {
    this.iommuStatus = iommuStatus;
  }


  public PciDevice localId(String localId) {
    
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


  public PciDevice mdevState(PciDeviceMdevState mdevState) {
    
    this.mdevState = mdevState;
    return this;
  }

   /**
   * Get mdevState
   * @return mdevState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciDeviceMdevState getMdevState() {
    return mdevState;
  }


  public void setMdevState(PciDeviceMdevState mdevState) {
    this.mdevState = mdevState;
  }


  public PciDevice mdevTypeId(String mdevTypeId) {
    
    this.mdevTypeId = mdevTypeId;
    return this;
  }

   /**
   * Get mdevTypeId
   * @return mdevTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMdevTypeId() {
    return mdevTypeId;
  }


  public void setMdevTypeId(String mdevTypeId) {
    this.mdevTypeId = mdevTypeId;
  }


  public PciDevice name(String name) {
    
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


  public PciDevice partitioningState(PciDevicePartitionState partitioningState) {
    
    this.partitioningState = partitioningState;
    return this;
  }

   /**
   * Get partitioningState
   * @return partitioningState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciDevicePartitionState getPartitioningState() {
    return partitioningState;
  }


  public void setPartitioningState(PciDevicePartitionState partitioningState) {
    this.partitioningState = partitioningState;
  }


  public PciDevice productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public PciDevice slot(String slot) {
    
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * @return slot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSlot() {
    return slot;
  }


  public void setSlot(String slot) {
    this.slot = slot;
  }


  public PciDevice sriovState(PciDeviceSriovState sriovState) {
    
    this.sriovState = sriovState;
    return this;
  }

   /**
   * Get sriovState
   * @return sriovState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciDeviceSriovState getSriovState() {
    return sriovState;
  }


  public void setSriovState(PciDeviceSriovState sriovState) {
    this.sriovState = sriovState;
  }


  public PciDevice subsystemProductId(String subsystemProductId) {
    
    this.subsystemProductId = subsystemProductId;
    return this;
  }

   /**
   * Get subsystemProductId
   * @return subsystemProductId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubsystemProductId() {
    return subsystemProductId;
  }


  public void setSubsystemProductId(String subsystemProductId) {
    this.subsystemProductId = subsystemProductId;
  }


  public PciDevice subsystemVendorId(String subsystemVendorId) {
    
    this.subsystemVendorId = subsystemVendorId;
    return this;
  }

   /**
   * Get subsystemVendorId
   * @return subsystemVendorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubsystemVendorId() {
    return subsystemVendorId;
  }


  public void setSubsystemVendorId(String subsystemVendorId) {
    this.subsystemVendorId = subsystemVendorId;
  }


  public PciDevice totalMdevNum(Integer totalMdevNum) {
    
    this.totalMdevNum = totalMdevNum;
    return this;
  }

   /**
   * Get totalMdevNum
   * @return totalMdevNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalMdevNum() {
    return totalMdevNum;
  }


  public void setTotalMdevNum(Integer totalMdevNum) {
    this.totalMdevNum = totalMdevNum;
  }


  public PciDevice totalPartitioningNum(Integer totalPartitioningNum) {
    
    this.totalPartitioningNum = totalPartitioningNum;
    return this;
  }

   /**
   * Get totalPartitioningNum
   * @return totalPartitioningNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPartitioningNum() {
    return totalPartitioningNum;
  }


  public void setTotalPartitioningNum(Integer totalPartitioningNum) {
    this.totalPartitioningNum = totalPartitioningNum;
  }


  public PciDevice totalVfNum(Integer totalVfNum) {
    
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


  public PciDevice usageType(PciDeviceType usageType) {
    
    this.usageType = usageType;
    return this;
  }

   /**
   * Get usageType
   * @return usageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciDeviceType getUsageType() {
    return usageType;
  }


  public void setUsageType(PciDeviceType usageType) {
    this.usageType = usageType;
  }


  public PciDevice usedMdevNum(Integer usedMdevNum) {
    
    this.usedMdevNum = usedMdevNum;
    return this;
  }

   /**
   * Get usedMdevNum
   * @return usedMdevNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedMdevNum() {
    return usedMdevNum;
  }


  public void setUsedMdevNum(Integer usedMdevNum) {
    this.usedMdevNum = usedMdevNum;
  }


  public PciDevice usedPartitioningNum(Integer usedPartitioningNum) {
    
    this.usedPartitioningNum = usedPartitioningNum;
    return this;
  }

   /**
   * Get usedPartitioningNum
   * @return usedPartitioningNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUsedPartitioningNum() {
    return usedPartitioningNum;
  }


  public void setUsedPartitioningNum(Integer usedPartitioningNum) {
    this.usedPartitioningNum = usedPartitioningNum;
  }


  public PciDevice usedVfNum(Integer usedVfNum) {
    
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


  public PciDevice userUsage(PciDeviceUsage userUsage) {
    
    this.userUsage = userUsage;
    return this;
  }

   /**
   * Get userUsage
   * @return userUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PciDeviceUsage getUserUsage() {
    return userUsage;
  }


  public void setUserUsage(PciDeviceUsage userUsage) {
    this.userUsage = userUsage;
  }


  public PciDevice vendorId(String vendorId) {
    
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVendorId() {
    return vendorId;
  }


  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  public PciDevice verdorName(String verdorName) {
    
    this.verdorName = verdorName;
    return this;
  }

   /**
   * Get verdorName
   * @return verdorName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVerdorName() {
    return verdorName;
  }


  public void setVerdorName(String verdorName) {
    this.verdorName = verdorName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PciDevice pciDevice = (PciDevice) o;
    return Objects.equals(this.bus, pciDevice.bus) &&
        Objects.equals(this.busLocation, pciDevice.busLocation) &&
        Objects.equals(this.classCode, pciDevice.classCode) &&
        Objects.equals(this.deviceType, pciDevice.deviceType) &&
        Objects.equals(this.entityAsyncStatus, pciDevice.entityAsyncStatus) &&
        Objects.equals(this.functionNum, pciDevice.functionNum) &&
        Objects.equals(this.host, pciDevice.host) &&
        Objects.equals(this.id, pciDevice.id) &&
        Objects.equals(this.iommuStatus, pciDevice.iommuStatus) &&
        Objects.equals(this.localId, pciDevice.localId) &&
        Objects.equals(this.mdevState, pciDevice.mdevState) &&
        Objects.equals(this.mdevTypeId, pciDevice.mdevTypeId) &&
        Objects.equals(this.name, pciDevice.name) &&
        Objects.equals(this.partitioningState, pciDevice.partitioningState) &&
        Objects.equals(this.productId, pciDevice.productId) &&
        Objects.equals(this.slot, pciDevice.slot) &&
        Objects.equals(this.sriovState, pciDevice.sriovState) &&
        Objects.equals(this.subsystemProductId, pciDevice.subsystemProductId) &&
        Objects.equals(this.subsystemVendorId, pciDevice.subsystemVendorId) &&
        Objects.equals(this.totalMdevNum, pciDevice.totalMdevNum) &&
        Objects.equals(this.totalPartitioningNum, pciDevice.totalPartitioningNum) &&
        Objects.equals(this.totalVfNum, pciDevice.totalVfNum) &&
        Objects.equals(this.usageType, pciDevice.usageType) &&
        Objects.equals(this.usedMdevNum, pciDevice.usedMdevNum) &&
        Objects.equals(this.usedPartitioningNum, pciDevice.usedPartitioningNum) &&
        Objects.equals(this.usedVfNum, pciDevice.usedVfNum) &&
        Objects.equals(this.userUsage, pciDevice.userUsage) &&
        Objects.equals(this.vendorId, pciDevice.vendorId) &&
        Objects.equals(this.verdorName, pciDevice.verdorName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bus, busLocation, classCode, deviceType, entityAsyncStatus, functionNum, host, id, iommuStatus, localId, mdevState, mdevTypeId, name, partitioningState, productId, slot, sriovState, subsystemProductId, subsystemVendorId, totalMdevNum, totalPartitioningNum, totalVfNum, usageType, usedMdevNum, usedPartitioningNum, usedVfNum, userUsage, vendorId, verdorName);
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
    sb.append("class PciDevice {\n");
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    busLocation: ").append(toIndentedString(busLocation)).append("\n");
    sb.append("    classCode: ").append(toIndentedString(classCode)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    functionNum: ").append(toIndentedString(functionNum)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iommuStatus: ").append(toIndentedString(iommuStatus)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    mdevState: ").append(toIndentedString(mdevState)).append("\n");
    sb.append("    mdevTypeId: ").append(toIndentedString(mdevTypeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partitioningState: ").append(toIndentedString(partitioningState)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    sriovState: ").append(toIndentedString(sriovState)).append("\n");
    sb.append("    subsystemProductId: ").append(toIndentedString(subsystemProductId)).append("\n");
    sb.append("    subsystemVendorId: ").append(toIndentedString(subsystemVendorId)).append("\n");
    sb.append("    totalMdevNum: ").append(toIndentedString(totalMdevNum)).append("\n");
    sb.append("    totalPartitioningNum: ").append(toIndentedString(totalPartitioningNum)).append("\n");
    sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    usedMdevNum: ").append(toIndentedString(usedMdevNum)).append("\n");
    sb.append("    usedPartitioningNum: ").append(toIndentedString(usedPartitioningNum)).append("\n");
    sb.append("    usedVfNum: ").append(toIndentedString(usedVfNum)).append("\n");
    sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    verdorName: ").append(toIndentedString(verdorName)).append("\n");
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

