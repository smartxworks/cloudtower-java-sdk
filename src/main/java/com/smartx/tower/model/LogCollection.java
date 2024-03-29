package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.LogCollectionStatus;
import com.smartx.tower.model.NestedCluster;
import com.smartx.tower.model.NestedHost;
import com.smartx.tower.model.NestedWitness;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LogCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class LogCollection {
  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private NestedCluster cluster;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = new ArrayList<String>();

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<NestedHost> hosts = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_LOG_ENDED_AT = "log_ended_at";
  @SerializedName(SERIALIZED_NAME_LOG_ENDED_AT)
  private String logEndedAt;

  public static final String SERIALIZED_NAME_LOG_STARTED_AT = "log_started_at";
  @SerializedName(SERIALIZED_NAME_LOG_STARTED_AT)
  private String logStartedAt;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Double progress;

  public static final String SERIALIZED_NAME_SERVICE_GROUPS = "service_groups";
  @SerializedName(SERIALIZED_NAME_SERVICE_GROUPS)
  private Object serviceGroups;

  public static final String SERIALIZED_NAME_SERVICES = "services";
  @SerializedName(SERIALIZED_NAME_SERVICES)
  private List<String> services = new ArrayList<String>();

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LogCollectionStatus status;

  public static final String SERIALIZED_NAME_WITNESS = "witness";
  @SerializedName(SERIALIZED_NAME_WITNESS)
  private NestedWitness witness;

  public LogCollection() { 
  }

  public LogCollection cluster(NestedCluster cluster) {
    
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


  public LogCollection groups(List<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public LogCollection addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public LogCollection hosts(List<NestedHost> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public LogCollection addHostsItem(NestedHost hostsItem) {
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


  public LogCollection id(String id) {
    
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


  public LogCollection localId(String localId) {
    
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


  public LogCollection logEndedAt(String logEndedAt) {
    
    this.logEndedAt = logEndedAt;
    return this;
  }

   /**
   * Get logEndedAt
   * @return logEndedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLogEndedAt() {
    return logEndedAt;
  }


  public void setLogEndedAt(String logEndedAt) {
    this.logEndedAt = logEndedAt;
  }


  public LogCollection logStartedAt(String logStartedAt) {
    
    this.logStartedAt = logStartedAt;
    return this;
  }

   /**
   * Get logStartedAt
   * @return logStartedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLogStartedAt() {
    return logStartedAt;
  }


  public void setLogStartedAt(String logStartedAt) {
    this.logStartedAt = logStartedAt;
  }


  public LogCollection owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public LogCollection path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public LogCollection progress(Double progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getProgress() {
    return progress;
  }


  public void setProgress(Double progress) {
    this.progress = progress;
  }


  public LogCollection serviceGroups(Object serviceGroups) {
    
    this.serviceGroups = serviceGroups;
    return this;
  }

   /**
   * Get serviceGroups
   * @return serviceGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getServiceGroups() {
    return serviceGroups;
  }


  public void setServiceGroups(Object serviceGroups) {
    this.serviceGroups = serviceGroups;
  }


  public LogCollection services(List<String> services) {
    
    this.services = services;
    return this;
  }

  public LogCollection addServicesItem(String servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getServices() {
    return services;
  }


  public void setServices(List<String> services) {
    this.services = services;
  }


  public LogCollection size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public LogCollection startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public LogCollection status(LogCollectionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LogCollectionStatus getStatus() {
    return status;
  }


  public void setStatus(LogCollectionStatus status) {
    this.status = status;
  }


  public LogCollection witness(NestedWitness witness) {
    
    this.witness = witness;
    return this;
  }

   /**
   * Get witness
   * @return witness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NestedWitness getWitness() {
    return witness;
  }


  public void setWitness(NestedWitness witness) {
    this.witness = witness;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogCollection logCollection = (LogCollection) o;
    return Objects.equals(this.cluster, logCollection.cluster) &&
        Objects.equals(this.groups, logCollection.groups) &&
        Objects.equals(this.hosts, logCollection.hosts) &&
        Objects.equals(this.id, logCollection.id) &&
        Objects.equals(this.localId, logCollection.localId) &&
        Objects.equals(this.logEndedAt, logCollection.logEndedAt) &&
        Objects.equals(this.logStartedAt, logCollection.logStartedAt) &&
        Objects.equals(this.owner, logCollection.owner) &&
        Objects.equals(this.path, logCollection.path) &&
        Objects.equals(this.progress, logCollection.progress) &&
        Objects.equals(this.serviceGroups, logCollection.serviceGroups) &&
        Objects.equals(this.services, logCollection.services) &&
        Objects.equals(this.size, logCollection.size) &&
        Objects.equals(this.startedAt, logCollection.startedAt) &&
        Objects.equals(this.status, logCollection.status) &&
        Objects.equals(this.witness, logCollection.witness);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, groups, hosts, id, localId, logEndedAt, logStartedAt, owner, path, progress, serviceGroups, services, size, startedAt, status, witness);
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
    sb.append("class LogCollection {\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    logEndedAt: ").append(toIndentedString(logEndedAt)).append("\n");
    sb.append("    logStartedAt: ").append(toIndentedString(logStartedAt)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    serviceGroups: ").append(toIndentedString(serviceGroups)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    witness: ").append(toIndentedString(witness)).append("\n");
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

