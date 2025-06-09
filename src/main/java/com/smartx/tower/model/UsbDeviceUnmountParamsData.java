package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UsbDeviceUnmountParamsData */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UsbDeviceUnmountParamsData
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private VmWhereInput vms;

    public UsbDeviceUnmountParamsData() {}

    public UsbDeviceUnmountParamsData vms(VmWhereInput vms) {

        this.vms = vms;
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmWhereInput getVms() {
        return vms;
    }

    public void setVms(VmWhereInput vms) {
        this.vms = vms;
    }

    public UsbDeviceUnmountParamsData vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public UsbDeviceUnmountParamsData vms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS);
        return this;
    }

    public void setVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS);
        }
    }

    public boolean getVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsbDeviceUnmountParamsData usbDeviceUnmountParamsData = (UsbDeviceUnmountParamsData) o;
        return Objects.equals(this.vms, usbDeviceUnmountParamsData.vms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsbDeviceUnmountParamsData {\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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
