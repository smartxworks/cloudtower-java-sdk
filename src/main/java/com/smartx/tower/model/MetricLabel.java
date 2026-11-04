package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** MetricLabel */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class MetricLabel extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TO_HOSTNAME = "to_hostname";

    @SerializedName(SERIALIZED_NAME_TO_HOSTNAME)
    private String toHostname;

    public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serial_number";

    @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
    private String serialNumber;

    public static final String SERIALIZED_NAME_POOL = "pool";

    @SerializedName(SERIALIZED_NAME_POOL)
    private String pool;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_METRIC_NAME = "metric_name";

    @SerializedName(SERIALIZED_NAME_METRIC_NAME)
    private String metricName;

    public static final String SERIALIZED_NAME_JOB = "job";

    @SerializedName(SERIALIZED_NAME_JOB)
    private String job;

    public static final String SERIALIZED_NAME_INSTANCE = "instance";

    @SerializedName(SERIALIZED_NAME_INSTANCE)
    private String instance;

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    private String identifier;

    public static final String SERIALIZED_NAME_ADAPTER_TYPE = "adapter_type";

    @SerializedName(SERIALIZED_NAME_ADAPTER_TYPE)
    private String adapterType;

    public static final String SERIALIZED_NAME_ZONE = "_zone";

    @SerializedName(SERIALIZED_NAME_ZONE)
    private String zone;

    public static final String SERIALIZED_NAME_WITNESS = "_witness";

    @SerializedName(SERIALIZED_NAME_WITNESS)
    private String witness;

    public static final String SERIALIZED_NAME_VOLUME_ID = "_volume_id";

    @SerializedName(SERIALIZED_NAME_VOLUME_ID)
    private String volumeId;

    public static final String SERIALIZED_NAME_VOLUME = "_volume";

    @SerializedName(SERIALIZED_NAME_VOLUME)
    private String volume;

    public static final String SERIALIZED_NAME_VM = "_vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private String vm;

    public static final String SERIALIZED_NAME_TO_UUID = "_to_uuid";

    @SerializedName(SERIALIZED_NAME_TO_UUID)
    private String toUuid;

    public static final String SERIALIZED_NAME_SERVICE = "_service";

    @SerializedName(SERIALIZED_NAME_SERVICE)
    private String service;

    public static final String SERIALIZED_NAME_SCVM = "_scvm";

    @SerializedName(SERIALIZED_NAME_SCVM)
    private String scvm;

    public static final String SERIALIZED_NAME_NETWORK = "_network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    private String network;

    public static final String SERIALIZED_NAME_MAC = "_mac";

    @SerializedName(SERIALIZED_NAME_MAC)
    private String mac;

    public static final String SERIALIZED_NAME_HOST_ID = "_host_id";

    @SerializedName(SERIALIZED_NAME_HOST_ID)
    private String hostId;

    public static final String SERIALIZED_NAME_HOST = "_host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private String host;

    public static final String SERIALIZED_NAME_ESXI_UUID = "_esxi_uuid";

    @SerializedName(SERIALIZED_NAME_ESXI_UUID)
    private String esxiUuid;

    public static final String SERIALIZED_NAME_DEVICE = "_device";

    @SerializedName(SERIALIZED_NAME_DEVICE)
    private String device;

    public static final String SERIALIZED_NAME_DATASTORE_ID = "_datastore_id";

    @SerializedName(SERIALIZED_NAME_DATASTORE_ID)
    private String datastoreId;

    public static final String SERIALIZED_NAME_CLUSTER = "_cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private String cluster;

    public static final String SERIALIZED_NAME_CID = "_cid";

    @SerializedName(SERIALIZED_NAME_CID)
    private String cid;

    public static final String SERIALIZED_NAME_CHUNK = "_chunk";

    @SerializedName(SERIALIZED_NAME_CHUNK)
    private String chunk;

    public static final String SERIALIZED_NAME_ADAPTER = "_adapter";

    @SerializedName(SERIALIZED_NAME_ADAPTER)
    private String adapter;

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        METRICLABEL("MetricLabel");

        private String value;

        TypenameEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypenameEnum fromValue(String value) {
            for (TypenameEnum b : TypenameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypenameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypenameEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypenameEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypenameEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPENAME = "__typename";

    @SerializedName(SERIALIZED_NAME_TYPENAME)
    private TypenameEnum typename;

    public MetricLabel() {}

    public MetricLabel toHostname(String toHostname) {

        this.toHostname = toHostname;
        return this;
    }

    /**
     * Get toHostname
     *
     * @return toHostname
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getToHostname() {
        return toHostname;
    }

    public void setToHostname(String toHostname) {
        this.toHostname = toHostname;
    }

    public MetricLabel toHostname_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TO_HOSTNAME);
        return this;
    }

    public MetricLabel toHostname_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TO_HOSTNAME);
        return this;
    }

    public void setToHostname_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TO_HOSTNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TO_HOSTNAME);
        }
    }

    public boolean getToHostname_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TO_HOSTNAME);
    }

    public MetricLabel serialNumber(String serialNumber) {

        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get serialNumber
     *
     * @return serialNumber
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public MetricLabel serialNumber_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NUMBER);
        return this;
    }

    public MetricLabel serialNumber_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NUMBER);
        return this;
    }

    public void setSerialNumber_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NUMBER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NUMBER);
        }
    }

    public boolean getSerialNumber_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NUMBER);
    }

    public MetricLabel pool(String pool) {

        this.pool = pool;
        return this;
    }

    /**
     * Get pool
     *
     * @return pool
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public MetricLabel pool_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POOL);
        return this;
    }

    public MetricLabel pool_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POOL);
        return this;
    }

    public void setPool_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POOL);
        }
    }

    public boolean getPool_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POOL);
    }

    public MetricLabel name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetricLabel name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public MetricLabel name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public MetricLabel metricName(String metricName) {

        this.metricName = metricName;
        return this;
    }

    /**
     * Get metricName
     *
     * @return metricName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricLabel metricName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME);
        return this;
    }

    public MetricLabel metricName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME);
        return this;
    }

    public void setMetricName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC_NAME);
        }
    }

    public boolean getMetricName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC_NAME);
    }

    public MetricLabel job(String job) {

        this.job = job;
        return this;
    }

    /**
     * Get job
     *
     * @return job
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public MetricLabel job_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_JOB);
        return this;
    }

    public MetricLabel job_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_JOB);
        return this;
    }

    public void setJob_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_JOB);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_JOB);
        }
    }

    public boolean getJob_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_JOB);
    }

    public MetricLabel instance(String instance) {

        this.instance = instance;
        return this;
    }

    /**
     * Get instance
     *
     * @return instance
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public MetricLabel instance_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCE);
        return this;
    }

    public MetricLabel instance_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INSTANCE);
        return this;
    }

    public void setInstance_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INSTANCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INSTANCE);
        }
    }

    public boolean getInstance_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INSTANCE);
    }

    public MetricLabel identifier(String identifier) {

        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     *
     * @return identifier
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public MetricLabel identifier_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER);
        return this;
    }

    public MetricLabel identifier_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER);
        return this;
    }

    public void setIdentifier_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER);
        }
    }

    public boolean getIdentifier_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER);
    }

    public MetricLabel adapterType(String adapterType) {

        this.adapterType = adapterType;
        return this;
    }

    /**
     * Get adapterType
     *
     * @return adapterType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAdapterType() {
        return adapterType;
    }

    public void setAdapterType(String adapterType) {
        this.adapterType = adapterType;
    }

    public MetricLabel adapterType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ADAPTER_TYPE);
        return this;
    }

    public MetricLabel adapterType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ADAPTER_TYPE);
        return this;
    }

    public void setAdapterType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ADAPTER_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ADAPTER_TYPE);
        }
    }

    public boolean getAdapterType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ADAPTER_TYPE);
    }

    public MetricLabel zone(String zone) {

        this.zone = zone;
        return this;
    }

    /**
     * Get zone
     *
     * @return zone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public MetricLabel zone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONE);
        return this;
    }

    public MetricLabel zone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONE);
        return this;
    }

    public void setZone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONE);
        }
    }

    public boolean getZone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONE);
    }

    public MetricLabel witness(String witness) {

        this.witness = witness;
        return this;
    }

    /**
     * Get witness
     *
     * @return witness
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }

    public MetricLabel witness_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITNESS);
        return this;
    }

    public MetricLabel witness_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITNESS);
        return this;
    }

    public void setWitness_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITNESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITNESS);
        }
    }

    public boolean getWitness_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITNESS);
    }

    public MetricLabel volumeId(String volumeId) {

        this.volumeId = volumeId;
        return this;
    }

    /**
     * Get volumeId
     *
     * @return volumeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public MetricLabel volumeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_ID);
        return this;
    }

    public MetricLabel volumeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_ID);
        return this;
    }

    public void setVolumeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_ID);
        }
    }

    public boolean getVolumeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_ID);
    }

    public MetricLabel volume(String volume) {

        this.volume = volume;
        return this;
    }

    /**
     * Get volume
     *
     * @return volume
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public MetricLabel volume_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME);
        return this;
    }

    public MetricLabel volume_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME);
        return this;
    }

    public void setVolume_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME);
        }
    }

    public boolean getVolume_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME);
    }

    public MetricLabel vm(String vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVm() {
        return vm;
    }

    public void setVm(String vm) {
        this.vm = vm;
    }

    public MetricLabel vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public MetricLabel vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    public MetricLabel toUuid(String toUuid) {

        this.toUuid = toUuid;
        return this;
    }

    /**
     * Get toUuid
     *
     * @return toUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getToUuid() {
        return toUuid;
    }

    public void setToUuid(String toUuid) {
        this.toUuid = toUuid;
    }

    public MetricLabel toUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TO_UUID);
        return this;
    }

    public MetricLabel toUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TO_UUID);
        return this;
    }

    public void setToUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TO_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TO_UUID);
        }
    }

    public boolean getToUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TO_UUID);
    }

    public MetricLabel service(String service) {

        this.service = service;
        return this;
    }

    /**
     * Get service
     *
     * @return service
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public MetricLabel service_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERVICE);
        return this;
    }

    public MetricLabel service_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERVICE);
        return this;
    }

    public void setService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERVICE);
        }
    }

    public boolean getService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERVICE);
    }

    public MetricLabel scvm(String scvm) {

        this.scvm = scvm;
        return this;
    }

    /**
     * Get scvm
     *
     * @return scvm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getScvm() {
        return scvm;
    }

    public void setScvm(String scvm) {
        this.scvm = scvm;
    }

    public MetricLabel scvm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SCVM);
        return this;
    }

    public MetricLabel scvm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SCVM);
        return this;
    }

    public void setScvm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SCVM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SCVM);
        }
    }

    public boolean getScvm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SCVM);
    }

    public MetricLabel network(String network) {

        this.network = network;
        return this;
    }

    /**
     * Get network
     *
     * @return network
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public MetricLabel network_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public MetricLabel network_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public void setNetwork_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        }
    }

    public boolean getNetwork_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK);
    }

    public MetricLabel mac(String mac) {

        this.mac = mac;
        return this;
    }

    /**
     * Get mac
     *
     * @return mac
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public MetricLabel mac_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC);
        return this;
    }

    public MetricLabel mac_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC);
        return this;
    }

    public void setMac_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC);
        }
    }

    public boolean getMac_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC);
    }

    public MetricLabel hostId(String hostId) {

        this.hostId = hostId;
        return this;
    }

    /**
     * Get hostId
     *
     * @return hostId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public MetricLabel hostId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public MetricLabel hostId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public void setHostId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        }
    }

    public boolean getHostId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_ID);
    }

    public MetricLabel host(String host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public MetricLabel host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public MetricLabel host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public MetricLabel esxiUuid(String esxiUuid) {

        this.esxiUuid = esxiUuid;
        return this;
    }

    /**
     * Get esxiUuid
     *
     * @return esxiUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEsxiUuid() {
        return esxiUuid;
    }

    public void setEsxiUuid(String esxiUuid) {
        this.esxiUuid = esxiUuid;
    }

    public MetricLabel esxiUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESXI_UUID);
        return this;
    }

    public MetricLabel esxiUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESXI_UUID);
        return this;
    }

    public void setEsxiUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESXI_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESXI_UUID);
        }
    }

    public boolean getEsxiUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESXI_UUID);
    }

    public MetricLabel device(String device) {

        this.device = device;
        return this;
    }

    /**
     * Get device
     *
     * @return device
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public MetricLabel device_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE);
        return this;
    }

    public MetricLabel device_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE);
        return this;
    }

    public void setDevice_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE);
        }
    }

    public boolean getDevice_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE);
    }

    public MetricLabel datastoreId(String datastoreId) {

        this.datastoreId = datastoreId;
        return this;
    }

    /**
     * Get datastoreId
     *
     * @return datastoreId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatastoreId() {
        return datastoreId;
    }

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    public MetricLabel datastoreId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_ID);
        return this;
    }

    public MetricLabel datastoreId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_ID);
        return this;
    }

    public void setDatastoreId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_ID);
        }
    }

    public boolean getDatastoreId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_ID);
    }

    public MetricLabel cluster(String cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public MetricLabel cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public MetricLabel cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public MetricLabel cid(String cid) {

        this.cid = cid;
        return this;
    }

    /**
     * Get cid
     *
     * @return cid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public MetricLabel cid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CID);
        return this;
    }

    public MetricLabel cid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CID);
        return this;
    }

    public void setCid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CID);
        }
    }

    public boolean getCid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CID);
    }

    public MetricLabel chunk(String chunk) {

        this.chunk = chunk;
        return this;
    }

    /**
     * Get chunk
     *
     * @return chunk
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChunk() {
        return chunk;
    }

    public void setChunk(String chunk) {
        this.chunk = chunk;
    }

    public MetricLabel chunk_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK);
        return this;
    }

    public MetricLabel chunk_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK);
        return this;
    }

    public void setChunk_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK);
        }
    }

    public boolean getChunk_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK);
    }

    public MetricLabel adapter(String adapter) {

        this.adapter = adapter;
        return this;
    }

    /**
     * Get adapter
     *
     * @return adapter
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }

    public MetricLabel adapter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ADAPTER);
        return this;
    }

    public MetricLabel adapter_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ADAPTER);
        return this;
    }

    public void setAdapter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ADAPTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ADAPTER);
        }
    }

    public boolean getAdapter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ADAPTER);
    }

    public MetricLabel typename(TypenameEnum typename) {

        this.typename = typename;
        return this;
    }

    /**
     * Get typename
     *
     * @return typename
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TypenameEnum getTypename() {
        return typename;
    }

    public void setTypename(TypenameEnum typename) {
        this.typename = typename;
    }

    public MetricLabel typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public MetricLabel typename_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public void setTypename_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        }
    }

    public boolean getTypename_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPENAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricLabel metricLabel = (MetricLabel) o;
        return Objects.equals(this.toHostname, metricLabel.toHostname)
                && Objects.equals(this.serialNumber, metricLabel.serialNumber)
                && Objects.equals(this.pool, metricLabel.pool)
                && Objects.equals(this.name, metricLabel.name)
                && Objects.equals(this.metricName, metricLabel.metricName)
                && Objects.equals(this.job, metricLabel.job)
                && Objects.equals(this.instance, metricLabel.instance)
                && Objects.equals(this.identifier, metricLabel.identifier)
                && Objects.equals(this.adapterType, metricLabel.adapterType)
                && Objects.equals(this.zone, metricLabel.zone)
                && Objects.equals(this.witness, metricLabel.witness)
                && Objects.equals(this.volumeId, metricLabel.volumeId)
                && Objects.equals(this.volume, metricLabel.volume)
                && Objects.equals(this.vm, metricLabel.vm)
                && Objects.equals(this.toUuid, metricLabel.toUuid)
                && Objects.equals(this.service, metricLabel.service)
                && Objects.equals(this.scvm, metricLabel.scvm)
                && Objects.equals(this.network, metricLabel.network)
                && Objects.equals(this.mac, metricLabel.mac)
                && Objects.equals(this.hostId, metricLabel.hostId)
                && Objects.equals(this.host, metricLabel.host)
                && Objects.equals(this.esxiUuid, metricLabel.esxiUuid)
                && Objects.equals(this.device, metricLabel.device)
                && Objects.equals(this.datastoreId, metricLabel.datastoreId)
                && Objects.equals(this.cluster, metricLabel.cluster)
                && Objects.equals(this.cid, metricLabel.cid)
                && Objects.equals(this.chunk, metricLabel.chunk)
                && Objects.equals(this.adapter, metricLabel.adapter)
                && Objects.equals(this.typename, metricLabel.typename);
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
        return Objects.hash(
                toHostname,
                serialNumber,
                pool,
                name,
                metricName,
                job,
                instance,
                identifier,
                adapterType,
                zone,
                witness,
                volumeId,
                volume,
                vm,
                toUuid,
                service,
                scvm,
                network,
                mac,
                hostId,
                host,
                esxiUuid,
                device,
                datastoreId,
                cluster,
                cid,
                chunk,
                adapter,
                typename);
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
        sb.append("class MetricLabel {\n");
        sb.append("    toHostname: ").append(toIndentedString(toHostname)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    adapterType: ").append(toIndentedString(adapterType)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
        sb.append("    witness: ").append(toIndentedString(witness)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    toUuid: ").append(toIndentedString(toUuid)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    scvm: ").append(toIndentedString(scvm)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    esxiUuid: ").append(toIndentedString(esxiUuid)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    chunk: ").append(toIndentedString(chunk)).append("\n");
        sb.append("    adapter: ").append(toIndentedString(adapter)).append("\n");
        sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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
