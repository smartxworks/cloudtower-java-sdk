package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVirtualPrivateCloudFloatingIp */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedVirtualPrivateCloudFloatingIp
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_EXTERNAL_IPS = "external_ips";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IPS)
    private List<NestedVpcGatewaysCommonExternalIpsType> externalIps = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public NestedVirtualPrivateCloudFloatingIp() {}

    public NestedVirtualPrivateCloudFloatingIp externalIp(String externalIp) {

        this.externalIp = externalIp;
        return this;
    }

    /**
     * Get externalIp
     *
     * @return externalIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp;
    }

    public NestedVirtualPrivateCloudFloatingIp externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public NestedVirtualPrivateCloudFloatingIp externalIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public void setExternalIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        }
    }

    public boolean getExternalIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP);
    }

    public NestedVirtualPrivateCloudFloatingIp externalIps(
            List<NestedVpcGatewaysCommonExternalIpsType> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public NestedVirtualPrivateCloudFloatingIp addExternalIpsItem(
            NestedVpcGatewaysCommonExternalIpsType externalIpsItem) {
        if (this.externalIps == null) {
            this.externalIps = new ArrayList<NestedVpcGatewaysCommonExternalIpsType>();
        }
        this.externalIps.add(externalIpsItem);
        return this;
    }

    /**
     * Get externalIps
     *
     * @return externalIps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVpcGatewaysCommonExternalIpsType> getExternalIps() {
        return externalIps;
    }

    public void setExternalIps(List<NestedVpcGatewaysCommonExternalIpsType> externalIps) {
        this.externalIps = externalIps;
    }

    public NestedVirtualPrivateCloudFloatingIp externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public NestedVirtualPrivateCloudFloatingIp externalIps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public void setExternalIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IPS);
        }
    }

    public boolean getExternalIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IPS);
    }

    public NestedVirtualPrivateCloudFloatingIp id(String id) {

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

    public NestedVirtualPrivateCloudFloatingIp id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVirtualPrivateCloudFloatingIp id_ExplictlyNonNull() {
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
        NestedVirtualPrivateCloudFloatingIp nestedVirtualPrivateCloudFloatingIp =
                (NestedVirtualPrivateCloudFloatingIp) o;
        return Objects.equals(this.externalIp, nestedVirtualPrivateCloudFloatingIp.externalIp)
                && Objects.equals(this.externalIps, nestedVirtualPrivateCloudFloatingIp.externalIps)
                && Objects.equals(this.id, nestedVirtualPrivateCloudFloatingIp.id);
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
        return Objects.hash(externalIp, externalIps, id);
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
        sb.append("class NestedVirtualPrivateCloudFloatingIp {\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
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
