package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ReplicationPlanConnection */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ReplicationPlanConnection
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AGGREGATE = "aggregate";

    @SerializedName(SERIALIZED_NAME_AGGREGATE)
    private NestedAggregateReplicationPlan aggregate;

    public ReplicationPlanConnection() {}

    public ReplicationPlanConnection aggregate(NestedAggregateReplicationPlan aggregate) {

        this.aggregate = aggregate;
        return this;
    }

    /**
     * Get aggregate
     *
     * @return aggregate
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedAggregateReplicationPlan getAggregate() {
        return aggregate;
    }

    public void setAggregate(NestedAggregateReplicationPlan aggregate) {
        this.aggregate = aggregate;
    }

    public ReplicationPlanConnection aggregate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AGGREGATE);
        return this;
    }

    public ReplicationPlanConnection aggregate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AGGREGATE);
        return this;
    }

    public void setAggregate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AGGREGATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AGGREGATE);
        }
    }

    public boolean getAggregate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AGGREGATE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationPlanConnection replicationPlanConnection = (ReplicationPlanConnection) o;
        return Objects.equals(this.aggregate, replicationPlanConnection.aggregate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationPlanConnection {\n");
        sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
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
