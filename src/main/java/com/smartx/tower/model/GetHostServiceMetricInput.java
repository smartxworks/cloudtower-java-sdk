package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetHostServiceMetricInput */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GetHostServiceMetricInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RANGE = "range";

    @SerializedName(SERIALIZED_NAME_RANGE)
    private String range;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private HostWhereInput hosts;

    public static final String SERIALIZED_NAME_SERVICES = "services";

    @SerializedName(SERIALIZED_NAME_SERVICES)
    private List<String> services = new ArrayList<String>();

    public static final String SERIALIZED_NAME_METRICS = "metrics";

    @SerializedName(SERIALIZED_NAME_METRICS)
    private List<String> metrics = new ArrayList<String>();

    public GetHostServiceMetricInput() {}

    public GetHostServiceMetricInput range(String range) {

        this.range = range;
        return this;
    }

    /**
     * Get range
     *
     * @return range
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public GetHostServiceMetricInput range_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RANGE);
        return this;
    }

    public GetHostServiceMetricInput range_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RANGE);
        return this;
    }

    public void setRange_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RANGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RANGE);
        }
    }

    public boolean getRange_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RANGE);
    }

    public GetHostServiceMetricInput hosts(HostWhereInput hosts) {

        this.hosts = hosts;
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public HostWhereInput getHosts() {
        return hosts;
    }

    public void setHosts(HostWhereInput hosts) {
        this.hosts = hosts;
    }

    public GetHostServiceMetricInput hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public GetHostServiceMetricInput hosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public void setHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        }
    }

    public boolean getHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS);
    }

    public GetHostServiceMetricInput services(List<String> services) {

        this.services = services;
        return this;
    }

    public GetHostServiceMetricInput addServicesItem(String servicesItem) {
        this.services.add(servicesItem);
        return this;
    }

    /**
     * Get services
     *
     * @return services
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public GetHostServiceMetricInput services_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICES);
        return this;
    }

    public GetHostServiceMetricInput services_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICES);
        return this;
    }

    public void setServices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICES);
        }
    }

    public boolean getServices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICES);
    }

    public GetHostServiceMetricInput metrics(List<String> metrics) {

        this.metrics = metrics;
        return this;
    }

    public GetHostServiceMetricInput addMetricsItem(String metricsItem) {
        this.metrics.add(metricsItem);
        return this;
    }

    /**
     * Get metrics
     *
     * @return metrics
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public GetHostServiceMetricInput metrics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRICS);
        return this;
    }

    public GetHostServiceMetricInput metrics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRICS);
        return this;
    }

    public void setMetrics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRICS);
        }
    }

    public boolean getMetrics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRICS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetHostServiceMetricInput getHostServiceMetricInput = (GetHostServiceMetricInput) o;
        return Objects.equals(this.range, getHostServiceMetricInput.range)
                && Objects.equals(this.hosts, getHostServiceMetricInput.hosts)
                && Objects.equals(this.services, getHostServiceMetricInput.services)
                && Objects.equals(this.metrics, getHostServiceMetricInput.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, hosts, services, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHostServiceMetricInput {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
