package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedDatacenter;
import com.smartx.tower.model.NestedHost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Zone
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class Zone {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_DATACENTER = "datacenter";
  @SerializedName(SERIALIZED_NAME_DATACENTER)
  private NestedDatacenter datacenter;

  public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";
  @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
  private Long failureDataSpace;

  public static final String SERIALIZED_NAME_HOST_NUM = "host_num";
  @SerializedName(SERIALIZED_NAME_HOST_NUM)
  private Integer hostNum;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<NestedHost> hosts = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_PREFERRED = "is_preferred";
  @SerializedName(SERIALIZED_NAME_IS_PREFERRED)
  private Boolean isPreferred;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
  private Integer provisionedCpuCores;

  public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM = "provisioned_cpu_cores_for_active_vm";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM)
  private Integer provisionedCpuCoresForActiveVm;

  public static final String SERIALIZED_NAME_PROVISIONED_DATA_SPACE = "provisioned_data_space";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_DATA_SPACE)
  private Long provisionedDataSpace;

  public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES = "provisioned_memory_bytes";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
  private Long provisionedMemoryBytes;

  public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";
  @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
  private Integer runningVmNum;

  public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";
  @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
  private Integer stoppedVmNum;

  public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM = "suspended_vm_num";
  @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM)
  private Integer suspendedVmNum;

  public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
  private Long totalCacheCapacity;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
  private Integer totalCpuCores;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
  private Long totalCpuHz;

  public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
  private Long totalDataCapacity;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
  private Long totalMemoryBytes;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
  private Long usedDataSpace;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
  private Long validDataSpace;

  public static final String SERIALIZED_NAME_VM_NUM = "vm_num";
  @SerializedName(SERIALIZED_NAME_VM_NUM)
  private Integer vmNum;

  public Zone() { 
  }

  public Zone cluster(NestedCluster cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedCluster getCluster() {
    return cluster;
  }


  public void setCluster(NestedCluster cluster) {
    this.cluster = cluster;
  }


  public Zone datacenter(NestedDatacenter datacenter) {
    
    this.datacenter = datacenter;
    return this;
  }

   /**
   * Get datacenter
   * @return datacenter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedDatacenter getDatacenter() {
    return datacenter;
  }


  public void setDatacenter(NestedDatacenter datacenter) {
    this.datacenter = datacenter;
  }


  public Zone failureDataSpace(Long failureDataSpace) {
    
    this.failureDataSpace = failureDataSpace;
    return this;
  }

   /**
   * Get failureDataSpace
   * @return failureDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getFailureDataSpace() {
    return failureDataSpace;
  }


  public void setFailureDataSpace(Long failureDataSpace) {
    this.failureDataSpace = failureDataSpace;
  }


  public Zone hostNum(Integer hostNum) {
    
    this.hostNum = hostNum;
    return this;
  }

   /**
   * Get hostNum
   * @return hostNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHostNum() {
    return hostNum;
  }


  public void setHostNum(Integer hostNum) {
    this.hostNum = hostNum;
  }


  public Zone hosts(List<NestedHost> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public Zone addHostsItem(NestedHost hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<NestedHost>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedHost> getHosts() {
    return hosts;
  }


  public void setHosts(List<NestedHost> hosts) {
    this.hosts = hosts;
  }


  public Zone id(String id) {
    
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


  public Zone isPreferred(Boolean isPreferred) {
    
    this.isPreferred = isPreferred;
    return this;
  }

   /**
   * Get isPreferred
   * @return isPreferred
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsPreferred() {
    return isPreferred;
  }


  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }


  public Zone localId(String localId) {
    
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


  public Zone provisionedCpuCores(Integer provisionedCpuCores) {
    
    this.provisionedCpuCores = provisionedCpuCores;
    return this;
  }

   /**
   * Get provisionedCpuCores
   * @return provisionedCpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCores() {
    return provisionedCpuCores;
  }


  public void setProvisionedCpuCores(Integer provisionedCpuCores) {
    this.provisionedCpuCores = provisionedCpuCores;
  }


  public Zone provisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {
    
    this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
    return this;
  }

   /**
   * Get provisionedCpuCoresForActiveVm
   * @return provisionedCpuCoresForActiveVm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProvisionedCpuCoresForActiveVm() {
    return provisionedCpuCoresForActiveVm;
  }


  public void setProvisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {
    this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
  }


  public Zone provisionedDataSpace(Long provisionedDataSpace) {
    
    this.provisionedDataSpace = provisionedDataSpace;
    return this;
  }

   /**
   * Get provisionedDataSpace
   * @return provisionedDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedDataSpace() {
    return provisionedDataSpace;
  }


  public void setProvisionedDataSpace(Long provisionedDataSpace) {
    this.provisionedDataSpace = provisionedDataSpace;
  }


  public Zone provisionedMemoryBytes(Long provisionedMemoryBytes) {
    
    this.provisionedMemoryBytes = provisionedMemoryBytes;
    return this;
  }

   /**
   * Get provisionedMemoryBytes
   * @return provisionedMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProvisionedMemoryBytes() {
    return provisionedMemoryBytes;
  }


  public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
    this.provisionedMemoryBytes = provisionedMemoryBytes;
  }


  public Zone runningVmNum(Integer runningVmNum) {
    
    this.runningVmNum = runningVmNum;
    return this;
  }

   /**
   * Get runningVmNum
   * @return runningVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRunningVmNum() {
    return runningVmNum;
  }


  public void setRunningVmNum(Integer runningVmNum) {
    this.runningVmNum = runningVmNum;
  }


  public Zone stoppedVmNum(Integer stoppedVmNum) {
    
    this.stoppedVmNum = stoppedVmNum;
    return this;
  }

   /**
   * Get stoppedVmNum
   * @return stoppedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoppedVmNum() {
    return stoppedVmNum;
  }


  public void setStoppedVmNum(Integer stoppedVmNum) {
    this.stoppedVmNum = stoppedVmNum;
  }


  public Zone suspendedVmNum(Integer suspendedVmNum) {
    
    this.suspendedVmNum = suspendedVmNum;
    return this;
  }

   /**
   * Get suspendedVmNum
   * @return suspendedVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuspendedVmNum() {
    return suspendedVmNum;
  }


  public void setSuspendedVmNum(Integer suspendedVmNum) {
    this.suspendedVmNum = suspendedVmNum;
  }


  public Zone totalCacheCapacity(Long totalCacheCapacity) {
    
    this.totalCacheCapacity = totalCacheCapacity;
    return this;
  }

   /**
   * Get totalCacheCapacity
   * @return totalCacheCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCacheCapacity() {
    return totalCacheCapacity;
  }


  public void setTotalCacheCapacity(Long totalCacheCapacity) {
    this.totalCacheCapacity = totalCacheCapacity;
  }


  public Zone totalCpuCores(Integer totalCpuCores) {
    
    this.totalCpuCores = totalCpuCores;
    return this;
  }

   /**
   * Get totalCpuCores
   * @return totalCpuCores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalCpuCores() {
    return totalCpuCores;
  }


  public void setTotalCpuCores(Integer totalCpuCores) {
    this.totalCpuCores = totalCpuCores;
  }


  public Zone totalCpuHz(Long totalCpuHz) {
    
    this.totalCpuHz = totalCpuHz;
    return this;
  }

   /**
   * Get totalCpuHz
   * @return totalCpuHz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCpuHz() {
    return totalCpuHz;
  }


  public void setTotalCpuHz(Long totalCpuHz) {
    this.totalCpuHz = totalCpuHz;
  }


  public Zone totalDataCapacity(Long totalDataCapacity) {
    
    this.totalDataCapacity = totalDataCapacity;
    return this;
  }

   /**
   * Get totalDataCapacity
   * @return totalDataCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalDataCapacity() {
    return totalDataCapacity;
  }


  public void setTotalDataCapacity(Long totalDataCapacity) {
    this.totalDataCapacity = totalDataCapacity;
  }


  public Zone totalMemoryBytes(Long totalMemoryBytes) {
    
    this.totalMemoryBytes = totalMemoryBytes;
    return this;
  }

   /**
   * Get totalMemoryBytes
   * @return totalMemoryBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalMemoryBytes() {
    return totalMemoryBytes;
  }


  public void setTotalMemoryBytes(Long totalMemoryBytes) {
    this.totalMemoryBytes = totalMemoryBytes;
  }


  public Zone usedDataSpace(Long usedDataSpace) {
    
    this.usedDataSpace = usedDataSpace;
    return this;
  }

   /**
   * Get usedDataSpace
   * @return usedDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpace() {
    return usedDataSpace;
  }


  public void setUsedDataSpace(Long usedDataSpace) {
    this.usedDataSpace = usedDataSpace;
  }


  public Zone validDataSpace(Long validDataSpace) {
    
    this.validDataSpace = validDataSpace;
    return this;
  }

   /**
   * Get validDataSpace
   * @return validDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpace() {
    return validDataSpace;
  }


  public void setValidDataSpace(Long validDataSpace) {
    this.validDataSpace = validDataSpace;
  }


  public Zone vmNum(Integer vmNum) {
    
    this.vmNum = vmNum;
    return this;
  }

   /**
   * Get vmNum
   * @return vmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVmNum() {
    return vmNum;
  }


  public void setVmNum(Integer vmNum) {
    this.vmNum = vmNum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zone zone = (Zone) o;
    return Objects.equals(this.cluster, zone.cluster) &&
        Objects.equals(this.datacenter, zone.datacenter) &&
        Objects.equals(this.failureDataSpace, zone.failureDataSpace) &&
        Objects.equals(this.hostNum, zone.hostNum) &&
        Objects.equals(this.hosts, zone.hosts) &&
        Objects.equals(this.id, zone.id) &&
        Objects.equals(this.isPreferred, zone.isPreferred) &&
        Objects.equals(this.localId, zone.localId) &&
        Objects.equals(this.provisionedCpuCores, zone.provisionedCpuCores) &&
        Objects.equals(this.provisionedCpuCoresForActiveVm, zone.provisionedCpuCoresForActiveVm) &&
        Objects.equals(this.provisionedDataSpace, zone.provisionedDataSpace) &&
        Objects.equals(this.provisionedMemoryBytes, zone.provisionedMemoryBytes) &&
        Objects.equals(this.runningVmNum, zone.runningVmNum) &&
        Objects.equals(this.stoppedVmNum, zone.stoppedVmNum) &&
        Objects.equals(this.suspendedVmNum, zone.suspendedVmNum) &&
        Objects.equals(this.totalCacheCapacity, zone.totalCacheCapacity) &&
        Objects.equals(this.totalCpuCores, zone.totalCpuCores) &&
        Objects.equals(this.totalCpuHz, zone.totalCpuHz) &&
        Objects.equals(this.totalDataCapacity, zone.totalDataCapacity) &&
        Objects.equals(this.totalMemoryBytes, zone.totalMemoryBytes) &&
        Objects.equals(this.usedDataSpace, zone.usedDataSpace) &&
        Objects.equals(this.validDataSpace, zone.validDataSpace) &&
        Objects.equals(this.vmNum, zone.vmNum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, datacenter, failureDataSpace, hostNum, hosts, id, isPreferred, localId, provisionedCpuCores, provisionedCpuCoresForActiveVm, provisionedDataSpace, provisionedMemoryBytes, runningVmNum, stoppedVmNum, suspendedVmNum, totalCacheCapacity, totalCpuCores, totalCpuHz, totalDataCapacity, totalMemoryBytes, usedDataSpace, validDataSpace, vmNum);
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
    sb.append("class Zone {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
    sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    provisionedCpuCores: ").append(toIndentedString(provisionedCpuCores)).append("\n");
    sb.append("    provisionedCpuCoresForActiveVm: ").append(toIndentedString(provisionedCpuCoresForActiveVm)).append("\n");
    sb.append("    provisionedDataSpace: ").append(toIndentedString(provisionedDataSpace)).append("\n");
    sb.append("    provisionedMemoryBytes: ").append(toIndentedString(provisionedMemoryBytes)).append("\n");
    sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
    sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
    sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
    sb.append("    totalCacheCapacity: ").append(toIndentedString(totalCacheCapacity)).append("\n");
    sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
    sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
    sb.append("    totalDataCapacity: ").append(toIndentedString(totalDataCapacity)).append("\n");
    sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
    sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
    sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
    sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
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

