package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedCluster;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Witness
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class Witness {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE = "cpu_hz_per_core";
  @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE)
  private Long cpuHzPerCore;

  public static final String SERIALIZED_NAME_DATA_IP = "data_ip";
  @SerializedName(SERIALIZED_NAME_DATA_IP)
  private String dataIp;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_MANAGEMENT_IP = "management_ip";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP)
  private String managementIp;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYSTEM_DATA_CAPACITY = "system_data_capacity";
  @SerializedName(SERIALIZED_NAME_SYSTEM_DATA_CAPACITY)
  private Long systemDataCapacity;

  public static final String SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE = "system_used_data_space";
  @SerializedName(SERIALIZED_NAME_SYSTEM_USED_DATA_SPACE)
  private Long systemUsedDataSpace;

  public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
  private Integer totalCpuCores;

  public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";
  @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
  private Long totalCpuHz;

  public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
  private Long totalMemoryBytes;

  public Witness() { 
  }

  public Witness cluster(NestedCluster cluster) {
    
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


  public Witness cpuHzPerCore(Long cpuHzPerCore) {
    
    this.cpuHzPerCore = cpuHzPerCore;
    return this;
  }

   /**
   * Get cpuHzPerCore
   * @return cpuHzPerCore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getCpuHzPerCore() {
    return cpuHzPerCore;
  }


  public void setCpuHzPerCore(Long cpuHzPerCore) {
    this.cpuHzPerCore = cpuHzPerCore;
  }


  public Witness dataIp(String dataIp) {
    
    this.dataIp = dataIp;
    return this;
  }

   /**
   * Get dataIp
   * @return dataIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDataIp() {
    return dataIp;
  }


  public void setDataIp(String dataIp) {
    this.dataIp = dataIp;
  }


  public Witness id(String id) {
    
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


  public Witness localId(String localId) {
    
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


  public Witness managementIp(String managementIp) {
    
    this.managementIp = managementIp;
    return this;
  }

   /**
   * Get managementIp
   * @return managementIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getManagementIp() {
    return managementIp;
  }


  public void setManagementIp(String managementIp) {
    this.managementIp = managementIp;
  }


  public Witness name(String name) {
    
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


  public Witness systemDataCapacity(Long systemDataCapacity) {
    
    this.systemDataCapacity = systemDataCapacity;
    return this;
  }

   /**
   * Get systemDataCapacity
   * @return systemDataCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSystemDataCapacity() {
    return systemDataCapacity;
  }


  public void setSystemDataCapacity(Long systemDataCapacity) {
    this.systemDataCapacity = systemDataCapacity;
  }


  public Witness systemUsedDataSpace(Long systemUsedDataSpace) {
    
    this.systemUsedDataSpace = systemUsedDataSpace;
    return this;
  }

   /**
   * Get systemUsedDataSpace
   * @return systemUsedDataSpace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSystemUsedDataSpace() {
    return systemUsedDataSpace;
  }


  public void setSystemUsedDataSpace(Long systemUsedDataSpace) {
    this.systemUsedDataSpace = systemUsedDataSpace;
  }


  public Witness totalCpuCores(Integer totalCpuCores) {
    
    this.totalCpuCores = totalCpuCores;
    return this;
  }

   /**
   * Get totalCpuCores
   * @return totalCpuCores
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalCpuCores() {
    return totalCpuCores;
  }


  public void setTotalCpuCores(Integer totalCpuCores) {
    this.totalCpuCores = totalCpuCores;
  }


  public Witness totalCpuHz(Long totalCpuHz) {
    
    this.totalCpuHz = totalCpuHz;
    return this;
  }

   /**
   * Get totalCpuHz
   * @return totalCpuHz
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getTotalCpuHz() {
    return totalCpuHz;
  }


  public void setTotalCpuHz(Long totalCpuHz) {
    this.totalCpuHz = totalCpuHz;
  }


  public Witness totalMemoryBytes(Long totalMemoryBytes) {
    
    this.totalMemoryBytes = totalMemoryBytes;
    return this;
  }

   /**
   * Get totalMemoryBytes
   * @return totalMemoryBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getTotalMemoryBytes() {
    return totalMemoryBytes;
  }


  public void setTotalMemoryBytes(Long totalMemoryBytes) {
    this.totalMemoryBytes = totalMemoryBytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Witness witness = (Witness) o;
    return Objects.equals(this.cluster, witness.cluster) &&
        Objects.equals(this.cpuHzPerCore, witness.cpuHzPerCore) &&
        Objects.equals(this.dataIp, witness.dataIp) &&
        Objects.equals(this.id, witness.id) &&
        Objects.equals(this.localId, witness.localId) &&
        Objects.equals(this.managementIp, witness.managementIp) &&
        Objects.equals(this.name, witness.name) &&
        Objects.equals(this.systemDataCapacity, witness.systemDataCapacity) &&
        Objects.equals(this.systemUsedDataSpace, witness.systemUsedDataSpace) &&
        Objects.equals(this.totalCpuCores, witness.totalCpuCores) &&
        Objects.equals(this.totalCpuHz, witness.totalCpuHz) &&
        Objects.equals(this.totalMemoryBytes, witness.totalMemoryBytes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, cpuHzPerCore, dataIp, id, localId, managementIp, name, systemDataCapacity, systemUsedDataSpace, totalCpuCores, totalCpuHz, totalMemoryBytes);
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
    sb.append("class Witness {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cpuHzPerCore: ").append(toIndentedString(cpuHzPerCore)).append("\n");
    sb.append("    dataIp: ").append(toIndentedString(dataIp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    managementIp: ").append(toIndentedString(managementIp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    systemDataCapacity: ").append(toIndentedString(systemDataCapacity)).append("\n");
    sb.append("    systemUsedDataSpace: ").append(toIndentedString(systemUsedDataSpace)).append("\n");
    sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
    sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
    sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
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

