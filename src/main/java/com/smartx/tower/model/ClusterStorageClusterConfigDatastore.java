package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterStorageClusterConfigDatastore */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class ClusterStorageClusterConfigDatastore
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FREE_BYTES = "free_bytes";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES)
    private Long freeBytes;

    public static final String SERIALIZED_NAME_USED_BYTES = "used_bytes";

    @SerializedName(SERIALIZED_NAME_USED_BYTES)
    private Long usedBytes;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES =
            "datastore_capacity_bytes";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES)
    private Long datastoreCapacityBytes;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StorageProtocol type;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private DatastoreStatus status;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public ClusterStorageClusterConfigDatastore() {}

    public ClusterStorageClusterConfigDatastore freeBytes(Long freeBytes) {

        this.freeBytes = freeBytes;
        return this;
    }

    /**
     * Available capacity in bytes.
     *
     * @return freeBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Available capacity in bytes.")
    public Long getFreeBytes() {
        return freeBytes;
    }

    public void setFreeBytes(Long freeBytes) {
        this.freeBytes = freeBytes;
    }

    public ClusterStorageClusterConfigDatastore freeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES);
        return this;
    }

    public ClusterStorageClusterConfigDatastore freeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES);
        return this;
    }

    public void setFreeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES);
        }
    }

    public boolean getFreeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES);
    }

    public ClusterStorageClusterConfigDatastore usedBytes(Long usedBytes) {

        this.usedBytes = usedBytes;
        return this;
    }

    /**
     * Used capacity in bytes.
     *
     * @return usedBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Used capacity in bytes.")
    public Long getUsedBytes() {
        return usedBytes;
    }

    public void setUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
    }

    public ClusterStorageClusterConfigDatastore usedBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES);
        return this;
    }

    public ClusterStorageClusterConfigDatastore usedBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES);
        return this;
    }

    public void setUsedBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES);
        }
    }

    public boolean getUsedBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES);
    }

    public ClusterStorageClusterConfigDatastore datastoreCapacityBytes(
            Long datastoreCapacityBytes) {

        this.datastoreCapacityBytes = datastoreCapacityBytes;
        return this;
    }

    /**
     * Total physical capacity in bytes.
     *
     * @return datastoreCapacityBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Total physical capacity in bytes.")
    public Long getDatastoreCapacityBytes() {
        return datastoreCapacityBytes;
    }

    public void setDatastoreCapacityBytes(Long datastoreCapacityBytes) {
        this.datastoreCapacityBytes = datastoreCapacityBytes;
    }

    public ClusterStorageClusterConfigDatastore datastoreCapacityBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        return this;
    }

    public ClusterStorageClusterConfigDatastore datastoreCapacityBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        return this;
    }

    public void setDatastoreCapacityBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        }
    }

    public boolean getDatastoreCapacityBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
    }

    public ClusterStorageClusterConfigDatastore type(StorageProtocol type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public StorageProtocol getType() {
        return type;
    }

    public void setType(StorageProtocol type) {
        this.type = type;
    }

    public ClusterStorageClusterConfigDatastore type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ClusterStorageClusterConfigDatastore type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public ClusterStorageClusterConfigDatastore status(DatastoreStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public DatastoreStatus getStatus() {
        return status;
    }

    public void setStatus(DatastoreStatus status) {
        this.status = status;
    }

    public ClusterStorageClusterConfigDatastore status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public ClusterStorageClusterConfigDatastore status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public ClusterStorageClusterConfigDatastore description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClusterStorageClusterConfigDatastore description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ClusterStorageClusterConfigDatastore description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public ClusterStorageClusterConfigDatastore name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterStorageClusterConfigDatastore name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ClusterStorageClusterConfigDatastore name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public ClusterStorageClusterConfigDatastore localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public ClusterStorageClusterConfigDatastore localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterStorageClusterConfigDatastore localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public ClusterStorageClusterConfigDatastore id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterStorageClusterConfigDatastore id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterStorageClusterConfigDatastore id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterStorageClusterConfigDatastore clusterStorageClusterConfigDatastore =
                (ClusterStorageClusterConfigDatastore) o;
        return Objects.equals(this.freeBytes, clusterStorageClusterConfigDatastore.freeBytes)
                && Objects.equals(this.usedBytes, clusterStorageClusterConfigDatastore.usedBytes)
                && Objects.equals(
                        this.datastoreCapacityBytes,
                        clusterStorageClusterConfigDatastore.datastoreCapacityBytes)
                && Objects.equals(this.type, clusterStorageClusterConfigDatastore.type)
                && Objects.equals(this.status, clusterStorageClusterConfigDatastore.status)
                && Objects.equals(
                        this.description, clusterStorageClusterConfigDatastore.description)
                && Objects.equals(this.name, clusterStorageClusterConfigDatastore.name)
                && Objects.equals(this.localId, clusterStorageClusterConfigDatastore.localId)
                && Objects.equals(this.id, clusterStorageClusterConfigDatastore.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                freeBytes,
                usedBytes,
                datastoreCapacityBytes,
                type,
                status,
                description,
                name,
                localId,
                id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterStorageClusterConfigDatastore {\n");
        sb.append("    freeBytes: ").append(toIndentedString(freeBytes)).append("\n");
        sb.append("    usedBytes: ").append(toIndentedString(usedBytes)).append("\n");
        sb.append("    datastoreCapacityBytes: ")
                .append(toIndentedString(datastoreCapacityBytes))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
