package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterNtpServicesInfo */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class ClusterNtpServicesInfo
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NTP_SERVICES = "ntp_services";

    @SerializedName(SERIALIZED_NAME_NTP_SERVICES)
    private List<NtpServiceInfo> ntpServices = null;

    public static final String SERIALIZED_NAME_CLUSTER_TIME = "cluster_time";

    @SerializedName(SERIALIZED_NAME_CLUSTER_TIME)
    private Double clusterTime;

    public static final String SERIALIZED_NAME_NTP_SERVICE_TIME = "ntp_service_time";

    @SerializedName(SERIALIZED_NAME_NTP_SERVICE_TIME)
    private Double ntpServiceTime;

    public static final String SERIALIZED_NAME_TIME_ZONE_NAME = "time_zone_name";

    @SerializedName(SERIALIZED_NAME_TIME_ZONE_NAME)
    private String timeZoneName;

    public static final String SERIALIZED_NAME_TIME_ZONE = "time_zone";

    @SerializedName(SERIALIZED_NAME_TIME_ZONE)
    private String timeZone;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public ClusterNtpServicesInfo() {}

    public ClusterNtpServicesInfo ntpServices(List<NtpServiceInfo> ntpServices) {

        this.ntpServices = ntpServices;
        return this;
    }

    public ClusterNtpServicesInfo addNtpServicesItem(NtpServiceInfo ntpServicesItem) {
        if (this.ntpServices == null) {
            this.ntpServices = new ArrayList<NtpServiceInfo>();
        }
        this.ntpServices.add(ntpServicesItem);
        return this;
    }

    /**
     * Get ntpServices
     *
     * @return ntpServices
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NtpServiceInfo> getNtpServices() {
        return ntpServices;
    }

    public void setNtpServices(List<NtpServiceInfo> ntpServices) {
        this.ntpServices = ntpServices;
    }

    public ClusterNtpServicesInfo ntpServices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_SERVICES);
        return this;
    }

    public ClusterNtpServicesInfo ntpServices_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVICES);
        return this;
    }

    public void setNtpServices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_SERVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVICES);
        }
    }

    public boolean getNtpServices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_SERVICES);
    }

    public ClusterNtpServicesInfo clusterTime(Double clusterTime) {

        this.clusterTime = clusterTime;
        return this;
    }

    /**
     * Get clusterTime
     *
     * @return clusterTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getClusterTime() {
        return clusterTime;
    }

    public void setClusterTime(Double clusterTime) {
        this.clusterTime = clusterTime;
    }

    public ClusterNtpServicesInfo clusterTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TIME);
        return this;
    }

    public ClusterNtpServicesInfo clusterTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TIME);
        return this;
    }

    public void setClusterTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TIME);
        }
    }

    public boolean getClusterTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_TIME);
    }

    public ClusterNtpServicesInfo ntpServiceTime(Double ntpServiceTime) {

        this.ntpServiceTime = ntpServiceTime;
        return this;
    }

    /**
     * Get ntpServiceTime
     *
     * @return ntpServiceTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getNtpServiceTime() {
        return ntpServiceTime;
    }

    public void setNtpServiceTime(Double ntpServiceTime) {
        this.ntpServiceTime = ntpServiceTime;
    }

    public ClusterNtpServicesInfo ntpServiceTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_SERVICE_TIME);
        return this;
    }

    public ClusterNtpServicesInfo ntpServiceTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVICE_TIME);
        return this;
    }

    public void setNtpServiceTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_SERVICE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVICE_TIME);
        }
    }

    public boolean getNtpServiceTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_SERVICE_TIME);
    }

    public ClusterNtpServicesInfo timeZoneName(String timeZoneName) {

        this.timeZoneName = timeZoneName;
        return this;
    }

    /**
     * Get timeZoneName
     *
     * @return timeZoneName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public ClusterNtpServicesInfo timeZoneName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_ZONE_NAME);
        return this;
    }

    public ClusterNtpServicesInfo timeZoneName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIME_ZONE_NAME);
        return this;
    }

    public void setTimeZoneName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIME_ZONE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIME_ZONE_NAME);
        }
    }

    public boolean getTimeZoneName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIME_ZONE_NAME);
    }

    public ClusterNtpServicesInfo timeZone(String timeZone) {

        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get timeZone
     *
     * @return timeZone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public ClusterNtpServicesInfo timeZone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_ZONE);
        return this;
    }

    public ClusterNtpServicesInfo timeZone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIME_ZONE);
        return this;
    }

    public void setTimeZone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIME_ZONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIME_ZONE);
        }
    }

    public boolean getTimeZone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIME_ZONE);
    }

    public ClusterNtpServicesInfo clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterNtpServicesInfo clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public ClusterNtpServicesInfo clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterNtpServicesInfo clusterNtpServicesInfo = (ClusterNtpServicesInfo) o;
        return Objects.equals(this.ntpServices, clusterNtpServicesInfo.ntpServices)
                && Objects.equals(this.clusterTime, clusterNtpServicesInfo.clusterTime)
                && Objects.equals(this.ntpServiceTime, clusterNtpServicesInfo.ntpServiceTime)
                && Objects.equals(this.timeZoneName, clusterNtpServicesInfo.timeZoneName)
                && Objects.equals(this.timeZone, clusterNtpServicesInfo.timeZone)
                && Objects.equals(this.clusterId, clusterNtpServicesInfo.clusterId);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ntpServices, clusterTime, ntpServiceTime, timeZoneName, timeZone, clusterId);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNtpServicesInfo {\n");
        sb.append("    ntpServices: ").append(toIndentedString(ntpServices)).append("\n");
        sb.append("    clusterTime: ").append(toIndentedString(clusterTime)).append("\n");
        sb.append("    ntpServiceTime: ").append(toIndentedString(ntpServiceTime)).append("\n");
        sb.append("    timeZoneName: ").append(toIndentedString(timeZoneName)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
