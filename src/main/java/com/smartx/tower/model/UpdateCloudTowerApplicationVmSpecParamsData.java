package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UpdateCloudTowerApplicationVmSpecParamsData */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class UpdateCloudTowerApplicationVmSpecParamsData
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_SPEC = "vmSpec";

    @SerializedName(SERIALIZED_NAME_VM_SPEC)
    private ApplicationVmSpecDefinition vmSpec;

    public UpdateCloudTowerApplicationVmSpecParamsData() {}

    public UpdateCloudTowerApplicationVmSpecParamsData vmSpec(ApplicationVmSpecDefinition vmSpec) {

        this.vmSpec = vmSpec;
        return this;
    }

    /**
     * Get vmSpec
     *
     * @return vmSpec
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ApplicationVmSpecDefinition getVmSpec() {
        return vmSpec;
    }

    public void setVmSpec(ApplicationVmSpecDefinition vmSpec) {
        this.vmSpec = vmSpec;
    }

    public UpdateCloudTowerApplicationVmSpecParamsData vmSpec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SPEC);
        return this;
    }

    public UpdateCloudTowerApplicationVmSpecParamsData vmSpec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SPEC);
        return this;
    }

    public void setVmSpec_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SPEC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SPEC);
        }
    }

    public boolean getVmSpec_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SPEC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCloudTowerApplicationVmSpecParamsData updateCloudTowerApplicationVmSpecParamsData =
                (UpdateCloudTowerApplicationVmSpecParamsData) o;
        return Objects.equals(this.vmSpec, updateCloudTowerApplicationVmSpecParamsData.vmSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCloudTowerApplicationVmSpecParamsData {\n");
        sb.append("    vmSpec: ").append(toIndentedString(vmSpec)).append("\n");
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
