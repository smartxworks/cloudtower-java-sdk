package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NtpServiceInfo */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class NtpServiceInfo extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CHECK_DETAIL = "check_detail";

    @SerializedName(SERIALIZED_NAME_CHECK_DETAIL)
    private String checkDetail;

    public static final String SERIALIZED_NAME_CHECK_STATE = "check_state";

    @SerializedName(SERIALIZED_NAME_CHECK_STATE)
    private String checkState;

    public static final String SERIALIZED_NAME_IP_ADDR = "ip_addr";

    @SerializedName(SERIALIZED_NAME_IP_ADDR)
    private String ipAddr;

    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private String source;

    public NtpServiceInfo() {}

    public NtpServiceInfo checkDetail(String checkDetail) {

        this.checkDetail = checkDetail;
        return this;
    }

    /**
     * Get checkDetail
     *
     * @return checkDetail
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCheckDetail() {
        return checkDetail;
    }

    public void setCheckDetail(String checkDetail) {
        this.checkDetail = checkDetail;
    }

    public NtpServiceInfo checkDetail_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHECK_DETAIL);
        return this;
    }

    public NtpServiceInfo checkDetail_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHECK_DETAIL);
        return this;
    }

    public void setCheckDetail_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHECK_DETAIL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHECK_DETAIL);
        }
    }

    public boolean getCheckDetail_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHECK_DETAIL);
    }

    public NtpServiceInfo checkState(String checkState) {

        this.checkState = checkState;
        return this;
    }

    /**
     * Get checkState
     *
     * @return checkState
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public NtpServiceInfo checkState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHECK_STATE);
        return this;
    }

    public NtpServiceInfo checkState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHECK_STATE);
        return this;
    }

    public void setCheckState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHECK_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHECK_STATE);
        }
    }

    public boolean getCheckState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHECK_STATE);
    }

    public NtpServiceInfo ipAddr(String ipAddr) {

        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * Get ipAddr
     *
     * @return ipAddr
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public NtpServiceInfo ipAddr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDR);
        return this;
    }

    public NtpServiceInfo ipAddr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDR);
        return this;
    }

    public void setIpAddr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDR);
        }
    }

    public boolean getIpAddr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDR);
    }

    public NtpServiceInfo source(String source) {

        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public NtpServiceInfo source_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public NtpServiceInfo source_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public void setSource_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        }
    }

    public boolean getSource_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOURCE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NtpServiceInfo ntpServiceInfo = (NtpServiceInfo) o;
        return Objects.equals(this.checkDetail, ntpServiceInfo.checkDetail)
                && Objects.equals(this.checkState, ntpServiceInfo.checkState)
                && Objects.equals(this.ipAddr, ntpServiceInfo.ipAddr)
                && Objects.equals(this.source, ntpServiceInfo.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkDetail, checkState, ipAddr, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NtpServiceInfo {\n");
        sb.append("    checkDetail: ").append(toIndentedString(checkDetail)).append("\n");
        sb.append("    checkState: ").append(toIndentedString(checkState)).append("\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
