package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets EcpLicenseOrderByInput */
@JsonAdapter(EcpLicenseOrderByInput.Adapter.class)
public enum EcpLicenseOrderByInput {
    ASYNC_REPLICATION_ASC("async_replication_ASC"),

    ASYNC_REPLICATION_DESC("async_replication_DESC"),

    BACKUP_ASC("backup_ASC"),

    BACKUP_DESC("backup_DESC"),

    BRAND_ASC("brand_ASC"),

    BRAND_DESC("brand_DESC"),

    CLUSTER_LOCAL_ID_ASC("cluster_local_id_ASC"),

    CLUSTER_LOCAL_ID_DESC("cluster_local_id_DESC"),

    DFW_ASC("dfw_ASC"),

    DFW_DESC("dfw_DESC"),

    ECP_EDITION_ASC("ecp_edition_ASC"),

    ECP_EDITION_DESC("ecp_edition_DESC"),

    EXPIRE_DATE_ASC("expire_date_ASC"),

    EXPIRE_DATE_DESC("expire_date_DESC"),

    EXTERNAL_STORAGE_ASC("external_storage_ASC"),

    EXTERNAL_STORAGE_DESC("external_storage_DESC"),

    FILE_STORAGE_ASC("file_storage_ASC"),

    FILE_STORAGE_DESC("file_storage_DESC"),

    HAS_METROX_ASC("has_metrox_ASC"),

    HAS_METROX_DESC("has_metrox_DESC"),

    HAS_REMOTE_BACKUP_ASC("has_remote_backup_ASC"),

    HAS_REMOTE_BACKUP_DESC("has_remote_backup_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    K8S_BARE_METAL_ASC("k8s_bare_metal_ASC"),

    K8S_BARE_METAL_DESC("k8s_bare_metal_DESC"),

    K8S_SERVICE_ASC("k8s_service_ASC"),

    K8S_SERVICE_DESC("k8s_service_DESC"),

    LB_ASC("lb_ASC"),

    LB_DESC("lb_DESC"),

    LICENSE_PAYLOAD_ASC("license_payload_ASC"),

    LICENSE_PAYLOAD_DESC("license_payload_DESC"),

    LICENSE_SIGNATURE_ASC("license_signature_ASC"),

    LICENSE_SIGNATURE_DESC("license_signature_DESC"),

    LICENSE_TYPE_ASC("license_type_ASC"),

    LICENSE_TYPE_DESC("license_type_DESC"),

    MAX_CORE_NUM_ASC("max_core_num_ASC"),

    MAX_CORE_NUM_DESC("max_core_num_DESC"),

    MAX_PHYSICAL_DATA_CAPACITY_ASC("max_physical_data_capacity_ASC"),

    MAX_PHYSICAL_DATA_CAPACITY_DESC("max_physical_data_capacity_DESC"),

    ORIGINAL_CODE_ASC("original_code_ASC"),

    ORIGINAL_CODE_DESC("original_code_DESC"),

    PRODUCT_NAME_ASC("product_name_ASC"),

    PRODUCT_NAME_DESC("product_name_DESC"),

    SERIAL_ASC("serial_ASC"),

    SERIAL_DESC("serial_DESC"),

    SIGN_DATE_ASC("sign_date_ASC"),

    SIGN_DATE_DESC("sign_date_DESC"),

    SUBSCRIPTION_EXPIRE_DATE_ASC("subscription_expire_date_ASC"),

    SUBSCRIPTION_EXPIRE_DATE_DESC("subscription_expire_date_DESC"),

    SUBSCRIPTION_START_DATE_ASC("subscription_start_date_ASC"),

    SUBSCRIPTION_START_DATE_DESC("subscription_start_date_DESC"),

    SYNC_REPLICATION_ASC("sync_replication_ASC"),

    SYNC_REPLICATION_DESC("sync_replication_DESC"),

    TRAFFIC_VISUALIZATION_ASC("traffic_visualization_ASC"),

    TRAFFIC_VISUALIZATION_DESC("traffic_visualization_DESC"),

    VENDOR_ASC("vendor_ASC"),

    VENDOR_DESC("vendor_DESC"),

    VERSION_ASC("version_ASC"),

    VERSION_DESC("version_DESC"),

    VPC_ASC("vpc_ASC"),

    VPC_DESC("vpc_DESC"),

    ECPLICENSEORDERBYINPUT_UNSUPPORTED_ENUM("ECPLICENSEORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    EcpLicenseOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EcpLicenseOrderByInput fromValue(String value) {
        for (EcpLicenseOrderByInput b : EcpLicenseOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return EcpLicenseOrderByInput.ECPLICENSEORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<EcpLicenseOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final EcpLicenseOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EcpLicenseOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EcpLicenseOrderByInput.fromValue(value);
        }
    }
}
