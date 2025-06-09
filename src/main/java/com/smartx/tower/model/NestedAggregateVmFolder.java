package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedAggregateVmFolder */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedAggregateVmFolder
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COUNT = "count";

    @SerializedName(SERIALIZED_NAME_COUNT)
    private Integer count;

    public NestedAggregateVmFolder() {}

    public NestedAggregateVmFolder count(Integer count) {

        this.count = count;
        return this;
    }

    /**
     * Get count
     *
     * @return count
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public NestedAggregateVmFolder count_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT);
        return this;
    }

    public NestedAggregateVmFolder count_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT);
        return this;
    }

    public void setCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT);
        }
    }

    public boolean getCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedAggregateVmFolder nestedAggregateVmFolder = (NestedAggregateVmFolder) o;
        return Objects.equals(this.count, nestedAggregateVmFolder.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedAggregateVmFolder {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
