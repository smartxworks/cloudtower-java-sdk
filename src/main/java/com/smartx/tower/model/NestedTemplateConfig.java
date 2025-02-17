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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedTemplateConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedTemplateConfig {
  public static final String SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED = "cpu_exclusive_expected_enabled";
  @SerializedName(SERIALIZED_NAME_CPU_EXCLUSIVE_EXPECTED_ENABLED)
  private Boolean cpuExclusiveExpectedEnabled;

  public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";
  @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
  private String guestOsType;

  public static final String SERIALIZED_NAME_MINIMUM_REPLICA = "minimum_replica";
  @SerializedName(SERIALIZED_NAME_MINIMUM_REPLICA)
  private Boolean minimumReplica;

  public static final String SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME = "sync_vm_time_on_resume";
  @SerializedName(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME)
  private Boolean syncVmTimeOnResume;

  public NestedTemplateConfig() { 
  }

  public NestedTemplateConfig cpuExclusiveExpectedEnabled(Boolean cpuExclusiveExpectedEnabled) {
    
    this.cpuExclusiveExpectedEnabled = cpuExclusiveExpectedEnabled;
    return this;
  }

   /**
   * Get cpuExclusiveExpectedEnabled
   * @return cpuExclusiveExpectedEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCpuExclusiveExpectedEnabled() {
    return cpuExclusiveExpectedEnabled;
  }


  public void setCpuExclusiveExpectedEnabled(Boolean cpuExclusiveExpectedEnabled) {
    this.cpuExclusiveExpectedEnabled = cpuExclusiveExpectedEnabled;
  }


  public NestedTemplateConfig guestOsType(String guestOsType) {
    
    this.guestOsType = guestOsType;
    return this;
  }

   /**
   * Get guestOsType
   * @return guestOsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestOsType() {
    return guestOsType;
  }


  public void setGuestOsType(String guestOsType) {
    this.guestOsType = guestOsType;
  }


  public NestedTemplateConfig minimumReplica(Boolean minimumReplica) {
    
    this.minimumReplica = minimumReplica;
    return this;
  }

   /**
   * Get minimumReplica
   * @return minimumReplica
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMinimumReplica() {
    return minimumReplica;
  }


  public void setMinimumReplica(Boolean minimumReplica) {
    this.minimumReplica = minimumReplica;
  }


  public NestedTemplateConfig syncVmTimeOnResume(Boolean syncVmTimeOnResume) {
    
    this.syncVmTimeOnResume = syncVmTimeOnResume;
    return this;
  }

   /**
   * Get syncVmTimeOnResume
   * @return syncVmTimeOnResume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSyncVmTimeOnResume() {
    return syncVmTimeOnResume;
  }


  public void setSyncVmTimeOnResume(Boolean syncVmTimeOnResume) {
    this.syncVmTimeOnResume = syncVmTimeOnResume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedTemplateConfig nestedTemplateConfig = (NestedTemplateConfig) o;
    return Objects.equals(this.cpuExclusiveExpectedEnabled, nestedTemplateConfig.cpuExclusiveExpectedEnabled) &&
        Objects.equals(this.guestOsType, nestedTemplateConfig.guestOsType) &&
        Objects.equals(this.minimumReplica, nestedTemplateConfig.minimumReplica) &&
        Objects.equals(this.syncVmTimeOnResume, nestedTemplateConfig.syncVmTimeOnResume);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuExclusiveExpectedEnabled, guestOsType, minimumReplica, syncVmTimeOnResume);
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
    sb.append("class NestedTemplateConfig {\n");
    sb.append("    cpuExclusiveExpectedEnabled: ").append(toIndentedString(cpuExclusiveExpectedEnabled)).append("\n");
    sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
    sb.append("    minimumReplica: ").append(toIndentedString(minimumReplica)).append("\n");
    sb.append("    syncVmTimeOnResume: ").append(toIndentedString(syncVmTimeOnResume)).append("\n");
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

