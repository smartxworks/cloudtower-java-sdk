package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.HostWhereInput;
import com.smartx.tower.model.LogCollectionServiceGroupParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * LogCollectionCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class LogCollectionCreationParams {
  public static final String SERIALIZED_NAME_WITNESS_ID = "witness_id";
  @SerializedName(SERIALIZED_NAME_WITNESS_ID)
  private String witnessId;

  public static final String SERIALIZED_NAME_SERVICE_GROUPS = "service_groups";
  @SerializedName(SERIALIZED_NAME_SERVICE_GROUPS)
  private List<LogCollectionServiceGroupParams> serviceGroups = null;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT = "log_ended_at";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT)
  private OffsetDateTime logEndedAt;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT = "log_started_at";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT)
  private OffsetDateTime logStartedAt;

  public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";
  @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
  private String clusterId;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private HostWhereInput hosts;

  public LogCollectionCreationParams() { 
  }

  public LogCollectionCreationParams witnessId(String witnessId) {
    
    this.witnessId = witnessId;
    return this;
  }

   /**
   * Get witnessId
   * @return witnessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWitnessId() {
    return witnessId;
  }


  public void setWitnessId(String witnessId) {
    this.witnessId = witnessId;
  }


  public LogCollectionCreationParams serviceGroups(List<LogCollectionServiceGroupParams> serviceGroups) {
    
    this.serviceGroups = serviceGroups;
    return this;
  }

  public LogCollectionCreationParams addServiceGroupsItem(LogCollectionServiceGroupParams serviceGroupsItem) {
    if (this.serviceGroups == null) {
      this.serviceGroups = new ArrayList<LogCollectionServiceGroupParams>();
    }
    this.serviceGroups.add(serviceGroupsItem);
    return this;
  }

   /**
   * Get serviceGroups
   * @return serviceGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LogCollectionServiceGroupParams> getServiceGroups() {
    return serviceGroups;
  }


  public void setServiceGroups(List<LogCollectionServiceGroupParams> serviceGroups) {
    this.serviceGroups = serviceGroups;
  }


  public LogCollectionCreationParams logEndedAt(OffsetDateTime logEndedAt) {
    
    this.logEndedAt = logEndedAt;
    return this;
  }

   /**
   * Get logEndedAt
   * @return logEndedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getLogEndedAt() {
    return logEndedAt;
  }


  public void setLogEndedAt(OffsetDateTime logEndedAt) {
    this.logEndedAt = logEndedAt;
  }


  public LogCollectionCreationParams logStartedAt(OffsetDateTime logStartedAt) {
    
    this.logStartedAt = logStartedAt;
    return this;
  }

   /**
   * Get logStartedAt
   * @return logStartedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getLogStartedAt() {
    return logStartedAt;
  }


  public void setLogStartedAt(OffsetDateTime logStartedAt) {
    this.logStartedAt = logStartedAt;
  }


  public LogCollectionCreationParams clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getClusterId() {
    return clusterId;
  }


  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public LogCollectionCreationParams hosts(HostWhereInput hosts) {
    
    this.hosts = hosts;
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public HostWhereInput getHosts() {
    return hosts;
  }


  public void setHosts(HostWhereInput hosts) {
    this.hosts = hosts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogCollectionCreationParams logCollectionCreationParams = (LogCollectionCreationParams) o;
    return Objects.equals(this.witnessId, logCollectionCreationParams.witnessId) &&
        Objects.equals(this.serviceGroups, logCollectionCreationParams.serviceGroups) &&
        Objects.equals(this.logEndedAt, logCollectionCreationParams.logEndedAt) &&
        Objects.equals(this.logStartedAt, logCollectionCreationParams.logStartedAt) &&
        Objects.equals(this.clusterId, logCollectionCreationParams.clusterId) &&
        Objects.equals(this.hosts, logCollectionCreationParams.hosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(witnessId, serviceGroups, logEndedAt, logStartedAt, clusterId, hosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogCollectionCreationParams {\n");
    sb.append("    witnessId: ").append(toIndentedString(witnessId)).append("\n");
    sb.append("    serviceGroups: ").append(toIndentedString(serviceGroups)).append("\n");
    sb.append("    logEndedAt: ").append(toIndentedString(logEndedAt)).append("\n");
    sb.append("    logStartedAt: ").append(toIndentedString(logStartedAt)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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

