package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NvmfNamespaceCreationParamsAllOf */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NvmfNamespaceCreationParamsAllOf
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
    private Integer namespaceId;

    public static final String SERIALIZED_NAME_GROUP_ID = "group_id";

    @SerializedName(SERIALIZED_NAME_GROUP_ID)
    private String groupId;

    public static final String SERIALIZED_NAME_IS_SHARED = "is_shared";

    @SerializedName(SERIALIZED_NAME_IS_SHARED)
    private Boolean isShared;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE_UNIT = "assigned_size_unit";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT)
    private ByteUnit assignedSizeUnit;

    public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
    private Long assignedSize;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_ID = "nvmf_subsystem_id";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID)
    private String nvmfSubsystemId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public NvmfNamespaceCreationParamsAllOf() {}

    public NvmfNamespaceCreationParamsAllOf namespaceId(Integer namespaceId) {

        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * Get namespaceId
     *
     * @return namespaceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public NvmfNamespaceCreationParamsAllOf namespaceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_ID);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf namespaceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_ID);
        return this;
    }

    public void setNamespaceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_ID);
        }
    }

    public boolean getNamespaceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_ID);
    }

    public NvmfNamespaceCreationParamsAllOf groupId(String groupId) {

        this.groupId = groupId;
        return this;
    }

    /**
     * Get groupId
     *
     * @return groupId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public NvmfNamespaceCreationParamsAllOf groupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GROUP_ID);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf groupId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GROUP_ID);
        return this;
    }

    public void setGroupId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GROUP_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GROUP_ID);
        }
    }

    public boolean getGroupId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GROUP_ID);
    }

    public NvmfNamespaceCreationParamsAllOf isShared(Boolean isShared) {

        this.isShared = isShared;
        return this;
    }

    /**
     * Get isShared
     *
     * @return isShared
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsShared() {
        return isShared;
    }

    public void setIsShared(Boolean isShared) {
        this.isShared = isShared;
    }

    public NvmfNamespaceCreationParamsAllOf isShared_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SHARED);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf isShared_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_SHARED);
        return this;
    }

    public void setIsShared_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_SHARED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_SHARED);
        }
    }

    public boolean getIsShared_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_SHARED);
    }

    public NvmfNamespaceCreationParamsAllOf assignedSizeUnit(ByteUnit assignedSizeUnit) {

        this.assignedSizeUnit = assignedSizeUnit;
        return this;
    }

    /**
     * Get assignedSizeUnit
     *
     * @return assignedSizeUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getAssignedSizeUnit() {
        return assignedSizeUnit;
    }

    public void setAssignedSizeUnit(ByteUnit assignedSizeUnit) {
        this.assignedSizeUnit = assignedSizeUnit;
    }

    public NvmfNamespaceCreationParamsAllOf assignedSizeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf assignedSizeUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        return this;
    }

    public void setAssignedSizeUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
        }
    }

    public boolean getAssignedSizeUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE_UNIT);
    }

    public NvmfNamespaceCreationParamsAllOf assignedSize(Long assignedSize) {

        this.assignedSize = assignedSize;
        return this;
    }

    /**
     * Get assignedSize
     *
     * @return assignedSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getAssignedSize() {
        return assignedSize;
    }

    public void setAssignedSize(Long assignedSize) {
        this.assignedSize = assignedSize;
    }

    public NvmfNamespaceCreationParamsAllOf assignedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf assignedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public void setAssignedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        }
    }

    public boolean getAssignedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE);
    }

    public NvmfNamespaceCreationParamsAllOf replicaNum(Integer replicaNum) {

        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * Get replicaNum
     *
     * @return replicaNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public NvmfNamespaceCreationParamsAllOf replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf replicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public void setReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        }
    }

    public boolean getReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM);
    }

    public NvmfNamespaceCreationParamsAllOf nvmfSubsystemId(String nvmfSubsystemId) {

        this.nvmfSubsystemId = nvmfSubsystemId;
        return this;
    }

    /**
     * Get nvmfSubsystemId
     *
     * @return nvmfSubsystemId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNvmfSubsystemId() {
        return nvmfSubsystemId;
    }

    public void setNvmfSubsystemId(String nvmfSubsystemId) {
        this.nvmfSubsystemId = nvmfSubsystemId;
    }

    public NvmfNamespaceCreationParamsAllOf nvmfSubsystemId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf nvmfSubsystemId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        return this;
    }

    public void setNvmfSubsystemId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        }
    }

    public boolean getNvmfSubsystemId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
    }

    public NvmfNamespaceCreationParamsAllOf name(String name) {

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

    public NvmfNamespaceCreationParamsAllOf name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfNamespaceCreationParamsAllOf name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvmfNamespaceCreationParamsAllOf nvmfNamespaceCreationParamsAllOf =
                (NvmfNamespaceCreationParamsAllOf) o;
        return Objects.equals(this.namespaceId, nvmfNamespaceCreationParamsAllOf.namespaceId)
                && Objects.equals(this.groupId, nvmfNamespaceCreationParamsAllOf.groupId)
                && Objects.equals(this.isShared, nvmfNamespaceCreationParamsAllOf.isShared)
                && Objects.equals(
                        this.assignedSizeUnit, nvmfNamespaceCreationParamsAllOf.assignedSizeUnit)
                && Objects.equals(this.assignedSize, nvmfNamespaceCreationParamsAllOf.assignedSize)
                && Objects.equals(this.replicaNum, nvmfNamespaceCreationParamsAllOf.replicaNum)
                && Objects.equals(
                        this.nvmfSubsystemId, nvmfNamespaceCreationParamsAllOf.nvmfSubsystemId)
                && Objects.equals(this.name, nvmfNamespaceCreationParamsAllOf.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                namespaceId,
                groupId,
                isShared,
                assignedSizeUnit,
                assignedSize,
                replicaNum,
                nvmfSubsystemId,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvmfNamespaceCreationParamsAllOf {\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
        sb.append("    assignedSizeUnit: ").append(toIndentedString(assignedSizeUnit)).append("\n");
        sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    nvmfSubsystemId: ").append(toIndentedString(nvmfSubsystemId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
