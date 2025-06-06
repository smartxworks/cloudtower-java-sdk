package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVpcRouterGatewayRuleType */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedVpcRouterGatewayRuleType
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DST = "dst";

    @SerializedName(SERIALIZED_NAME_DST)
    private String dst;

    public static final String SERIALIZED_NAME_NEXTHOP = "nexthop";

    @SerializedName(SERIALIZED_NAME_NEXTHOP)
    private String nexthop;

    public NestedVpcRouterGatewayRuleType() {}

    public NestedVpcRouterGatewayRuleType dst(String dst) {

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

    public NestedVpcRouterGatewayRuleType dst_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DST);
        return this;
    }

    public NestedVpcRouterGatewayRuleType dst_ExplictlyNonNull() {
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

    public NestedVpcRouterGatewayRuleType nexthop(String nexthop) {

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

    public NestedVpcRouterGatewayRuleType nexthop_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP);
        return this;
    }

    public NestedVpcRouterGatewayRuleType nexthop_ExplictlyNonNull() {
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
        NestedVpcRouterGatewayRuleType nestedVpcRouterGatewayRuleType =
                (NestedVpcRouterGatewayRuleType) o;
        return Objects.equals(this.dst, nestedVpcRouterGatewayRuleType.dst)
                && Objects.equals(this.nexthop, nestedVpcRouterGatewayRuleType.nexthop);
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
        return Objects.hash(dst, nexthop);
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
        sb.append("class NestedVpcRouterGatewayRuleType {\n");
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
