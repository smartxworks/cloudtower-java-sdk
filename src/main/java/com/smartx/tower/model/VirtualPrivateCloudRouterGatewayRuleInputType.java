package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VirtualPrivateCloudRouterGatewayRuleInputType */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudRouterGatewayRuleInputType
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DST = "dst";

    @SerializedName(SERIALIZED_NAME_DST)
    private String dst;

    public static final String SERIALIZED_NAME_NEXTHOP = "nexthop";

    @SerializedName(SERIALIZED_NAME_NEXTHOP)
    private String nexthop;

    public VirtualPrivateCloudRouterGatewayRuleInputType() {}

    public VirtualPrivateCloudRouterGatewayRuleInputType dst(String dst) {

        this.dst = dst;
        return this;
    }

    /**
     * Get dst
     *
     * @return dst
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public VirtualPrivateCloudRouterGatewayRuleInputType dst_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DST);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayRuleInputType dst_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DST);
        return this;
    }

    public void setDst_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DST);
        }
    }

    public boolean getDst_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DST);
    }

    public VirtualPrivateCloudRouterGatewayRuleInputType nexthop(String nexthop) {

        this.nexthop = nexthop;
        return this;
    }

    /**
     * Get nexthop
     *
     * @return nexthop
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }

    public VirtualPrivateCloudRouterGatewayRuleInputType nexthop_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayRuleInputType nexthop_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP);
        return this;
    }

    public void setNexthop_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP);
        }
    }

    public boolean getNexthop_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudRouterGatewayRuleInputType
                virtualPrivateCloudRouterGatewayRuleInputType =
                        (VirtualPrivateCloudRouterGatewayRuleInputType) o;
        return Objects.equals(this.dst, virtualPrivateCloudRouterGatewayRuleInputType.dst)
                && Objects.equals(
                        this.nexthop, virtualPrivateCloudRouterGatewayRuleInputType.nexthop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dst, nexthop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudRouterGatewayRuleInputType {\n");
        sb.append("    dst: ").append(toIndentedString(dst)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
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
