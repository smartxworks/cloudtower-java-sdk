package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SecurityPolicyIngressEgressInput */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class SecurityPolicyIngressEgressInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private SecurityPolicyFlowControlType type;

    public static final String SERIALIZED_NAME_PORTS = "ports";

    @SerializedName(SERIALIZED_NAME_PORTS)
    private List<NetworkPolicyRulePortInput> ports = null;

    public static final String SERIALIZED_NAME_TARGET = "target";

    @SerializedName(SERIALIZED_NAME_TARGET)
    private SecurityPolicyIngressEgressInputTarget target;

    public SecurityPolicyIngressEgressInput() {}

    public SecurityPolicyIngressEgressInput type(SecurityPolicyFlowControlType type) {

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
    public SecurityPolicyFlowControlType getType() {
        return type;
    }

    public void setType(SecurityPolicyFlowControlType type) {
        this.type = type;
    }

    public SecurityPolicyIngressEgressInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public SecurityPolicyIngressEgressInput type_ExplictlyNonNull() {
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

    public SecurityPolicyIngressEgressInput ports(List<NetworkPolicyRulePortInput> ports) {

        this.ports = ports;
        return this;
    }

    public SecurityPolicyIngressEgressInput addPortsItem(NetworkPolicyRulePortInput portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<NetworkPolicyRulePortInput>();
        }
        this.ports.add(portsItem);
        return this;
    }

    /**
     * Get ports
     *
     * @return ports
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NetworkPolicyRulePortInput> getPorts() {
        return ports;
    }

    public void setPorts(List<NetworkPolicyRulePortInput> ports) {
        this.ports = ports;
    }

    public SecurityPolicyIngressEgressInput ports_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORTS);
        return this;
    }

    public SecurityPolicyIngressEgressInput ports_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORTS);
        return this;
    }

    public void setPorts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORTS);
        }
    }

    public boolean getPorts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORTS);
    }

    public SecurityPolicyIngressEgressInput target(SecurityPolicyIngressEgressInputTarget target) {

        this.target = target;
        return this;
    }

    /**
     * Get target
     *
     * @return target
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityPolicyIngressEgressInputTarget getTarget() {
        return target;
    }

    public void setTarget(SecurityPolicyIngressEgressInputTarget target) {
        this.target = target;
    }

    public SecurityPolicyIngressEgressInput target_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET);
        return this;
    }

    public SecurityPolicyIngressEgressInput target_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        return this;
    }

    public void setTarget_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        }
    }

    public boolean getTarget_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityPolicyIngressEgressInput securityPolicyIngressEgressInput =
                (SecurityPolicyIngressEgressInput) o;
        return Objects.equals(this.type, securityPolicyIngressEgressInput.type)
                && Objects.equals(this.ports, securityPolicyIngressEgressInput.ports)
                && Objects.equals(this.target, securityPolicyIngressEgressInput.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ports, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityPolicyIngressEgressInput {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
