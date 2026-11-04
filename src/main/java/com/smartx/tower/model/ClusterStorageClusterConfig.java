package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterStorageClusterConfig */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class ClusterStorageClusterConfig
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATASTORE = "datastore";

    @SerializedName(SERIALIZED_NAME_DATASTORE)
    private ClusterStorageClusterConfigDatastore datastore;

    public static final String SERIALIZED_NAME_STORAGE_CLUSTER = "storage_cluster";

    @SerializedName(SERIALIZED_NAME_STORAGE_CLUSTER)
    private ClusterStorageInfo storageCluster;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StorageClusterConfigStorageType type;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public ClusterStorageClusterConfig() {}

    public ClusterStorageClusterConfig datastore(ClusterStorageClusterConfigDatastore datastore) {

        this.datastore = datastore;
        return this;
    }

    /**
     * Get datastore
     *
     * @return datastore
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterStorageClusterConfigDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ClusterStorageClusterConfigDatastore datastore) {
        this.datastore = datastore;
    }

    public ClusterStorageClusterConfig datastore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public ClusterStorageClusterConfig datastore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public void setDatastore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        }
    }

    public boolean getDatastore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE);
    }

    public ClusterStorageClusterConfig storageCluster(ClusterStorageInfo storageCluster) {

        this.storageCluster = storageCluster;
        return this;
    }

    /**
     * Get storageCluster
     *
     * @return storageCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterStorageInfo getStorageCluster() {
        return storageCluster;
    }

    public void setStorageCluster(ClusterStorageInfo storageCluster) {
        this.storageCluster = storageCluster;
    }

    public ClusterStorageClusterConfig storageCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public ClusterStorageClusterConfig storageCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        return this;
    }

    public void setStorageCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_CLUSTER);
        }
    }

    public boolean getStorageCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_CLUSTER);
    }

    public ClusterStorageClusterConfig type(StorageClusterConfigStorageType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageClusterConfigStorageType getType() {
        return type;
    }

    public void setType(StorageClusterConfigStorageType type) {
        this.type = type;
    }

    public ClusterStorageClusterConfig type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ClusterStorageClusterConfig type_ExplictlyNonNull() {
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

    public ClusterStorageClusterConfig localId(String localId) {

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

    public ClusterStorageClusterConfig localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterStorageClusterConfig localId_ExplictlyNonNull() {
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

    public ClusterStorageClusterConfig id(String id) {

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

    public ClusterStorageClusterConfig id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterStorageClusterConfig id_ExplictlyNonNull() {
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
        ClusterStorageClusterConfig clusterStorageClusterConfig = (ClusterStorageClusterConfig) o;
        return Objects.equals(this.datastore, clusterStorageClusterConfig.datastore)
                && Objects.equals(this.storageCluster, clusterStorageClusterConfig.storageCluster)
                && Objects.equals(this.type, clusterStorageClusterConfig.type)
                && Objects.equals(this.localId, clusterStorageClusterConfig.localId)
                && Objects.equals(this.id, clusterStorageClusterConfig.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastore, storageCluster, type, localId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterStorageClusterConfig {\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    storageCluster: ").append(toIndentedString(storageCluster)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
