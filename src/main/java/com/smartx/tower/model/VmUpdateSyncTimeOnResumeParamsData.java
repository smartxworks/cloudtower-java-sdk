package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmUpdateSyncTimeOnResumeParamsData */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class VmUpdateSyncTimeOnResumeParamsData
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME = "sync_vm_time_on_resume";

    @SerializedName(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME)
    private Boolean syncVmTimeOnResume;

    public VmUpdateSyncTimeOnResumeParamsData() {}

    public VmUpdateSyncTimeOnResumeParamsData syncVmTimeOnResume(Boolean syncVmTimeOnResume) {

        this.syncVmTimeOnResume = syncVmTimeOnResume;
        return this;
    }

    /**
     * Get syncVmTimeOnResume
     *
     * @return syncVmTimeOnResume
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getSyncVmTimeOnResume() {
        return syncVmTimeOnResume;
    }

    public void setSyncVmTimeOnResume(Boolean syncVmTimeOnResume) {
        this.syncVmTimeOnResume = syncVmTimeOnResume;
    }

    public VmUpdateSyncTimeOnResumeParamsData syncVmTimeOnResume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        return this;
    }

    public VmUpdateSyncTimeOnResumeParamsData syncVmTimeOnResume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        return this;
    }

    public void setSyncVmTimeOnResume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
        }
    }

    public boolean getSyncVmTimeOnResume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_VM_TIME_ON_RESUME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateSyncTimeOnResumeParamsData vmUpdateSyncTimeOnResumeParamsData =
                (VmUpdateSyncTimeOnResumeParamsData) o;
        return Objects.equals(
                this.syncVmTimeOnResume, vmUpdateSyncTimeOnResumeParamsData.syncVmTimeOnResume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncVmTimeOnResume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateSyncTimeOnResumeParamsData {\n");
        sb.append("    syncVmTimeOnResume: ")
                .append(toIndentedString(syncVmTimeOnResume))
                .append("\n");
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
