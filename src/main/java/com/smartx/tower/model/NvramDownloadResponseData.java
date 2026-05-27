package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NvramDownloadResponseData */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class NvramDownloadResponseData
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RESOURCE_UUID = "resource_uuid";

    @SerializedName(SERIALIZED_NAME_RESOURCE_UUID)
    private String resourceUuid;

    public static final String SERIALIZED_NAME_FD_MTIME = "fd_mtime";

    @SerializedName(SERIALIZED_NAME_FD_MTIME)
    private Double fdMtime;

    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private String data;

    public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME)
    private Double createdTime;

    public NvramDownloadResponseData() {}

    public NvramDownloadResponseData resourceUuid(String resourceUuid) {

        this.resourceUuid = resourceUuid;
        return this;
    }

    /**
     * Get resourceUuid
     *
     * @return resourceUuid
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getResourceUuid() {
        return resourceUuid;
    }

    public void setResourceUuid(String resourceUuid) {
        this.resourceUuid = resourceUuid;
    }

    public NvramDownloadResponseData resourceUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_UUID);
        return this;
    }

    public NvramDownloadResponseData resourceUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_UUID);
        return this;
    }

    public void setResourceUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_UUID);
        }
    }

    public boolean getResourceUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_UUID);
    }

    public NvramDownloadResponseData fdMtime(Double fdMtime) {

        this.fdMtime = fdMtime;
        return this;
    }

    /**
     * Get fdMtime
     *
     * @return fdMtime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getFdMtime() {
        return fdMtime;
    }

    public void setFdMtime(Double fdMtime) {
        this.fdMtime = fdMtime;
    }

    public NvramDownloadResponseData fdMtime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FD_MTIME);
        return this;
    }

    public NvramDownloadResponseData fdMtime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FD_MTIME);
        return this;
    }

    public void setFdMtime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FD_MTIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FD_MTIME);
        }
    }

    public boolean getFdMtime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FD_MTIME);
    }

    public NvramDownloadResponseData data(String data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NvramDownloadResponseData data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public NvramDownloadResponseData data_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA);
        return this;
    }

    public void setData_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA);
        }
    }

    public boolean getData_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA);
    }

    public NvramDownloadResponseData createdTime(Double createdTime) {

        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get createdTime
     *
     * @return createdTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Double createdTime) {
        this.createdTime = createdTime;
    }

    public NvramDownloadResponseData createdTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public NvramDownloadResponseData createdTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public void setCreatedTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        }
    }

    public boolean getCreatedTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvramDownloadResponseData nvramDownloadResponseData = (NvramDownloadResponseData) o;
        return Objects.equals(this.resourceUuid, nvramDownloadResponseData.resourceUuid)
                && Objects.equals(this.fdMtime, nvramDownloadResponseData.fdMtime)
                && Objects.equals(this.data, nvramDownloadResponseData.data)
                && Objects.equals(this.createdTime, nvramDownloadResponseData.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceUuid, fdMtime, data, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvramDownloadResponseData {\n");
        sb.append("    resourceUuid: ").append(toIndentedString(resourceUuid)).append("\n");
        sb.append("    fdMtime: ").append(toIndentedString(fdMtime)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
