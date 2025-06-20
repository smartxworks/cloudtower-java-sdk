package com.smartx.tower.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** Gets or Sets NvmfSubsystemOrderByInput */
@JsonAdapter(NvmfSubsystemOrderByInput.Adapter.class)
public enum NvmfSubsystemOrderByInput {
    BPS_ASC("bps_ASC"),

    BPS_DESC("bps_DESC"),

    BPS_MAX_ASC("bps_max_ASC"),

    BPS_MAX_DESC("bps_max_DESC"),

    BPS_MAX_LENGTH_ASC("bps_max_length_ASC"),

    BPS_MAX_LENGTH_DESC("bps_max_length_DESC"),

    BPS_RD_ASC("bps_rd_ASC"),

    BPS_RD_DESC("bps_rd_DESC"),

    BPS_RD_MAX_ASC("bps_rd_max_ASC"),

    BPS_RD_MAX_DESC("bps_rd_max_DESC"),

    BPS_RD_MAX_LENGTH_ASC("bps_rd_max_length_ASC"),

    BPS_RD_MAX_LENGTH_DESC("bps_rd_max_length_DESC"),

    BPS_WR_ASC("bps_wr_ASC"),

    BPS_WR_DESC("bps_wr_DESC"),

    BPS_WR_MAX_ASC("bps_wr_max_ASC"),

    BPS_WR_MAX_DESC("bps_wr_max_DESC"),

    BPS_WR_MAX_LENGTH_ASC("bps_wr_max_length_ASC"),

    BPS_WR_MAX_LENGTH_DESC("bps_wr_max_length_DESC"),

    DESCRIPTION_ASC("description_ASC"),

    DESCRIPTION_DESC("description_DESC"),

    ENTITYASYNCSTATUS_ASC("entityAsyncStatus_ASC"),

    ENTITYASYNCSTATUS_DESC("entityAsyncStatus_DESC"),

    EXTERNAL_USE_ASC("external_use_ASC"),

    EXTERNAL_USE_DESC("external_use_DESC"),

    ID_ASC("id_ASC"),

    ID_DESC("id_DESC"),

    INTERNAL_ASC("internal_ASC"),

    INTERNAL_DESC("internal_DESC"),

    IO_SIZE_ASC("io_size_ASC"),

    IO_SIZE_DESC("io_size_DESC"),

    IOPS_ASC("iops_ASC"),

    IOPS_DESC("iops_DESC"),

    IOPS_MAX_ASC("iops_max_ASC"),

    IOPS_MAX_DESC("iops_max_DESC"),

    IOPS_MAX_LENGTH_ASC("iops_max_length_ASC"),

    IOPS_MAX_LENGTH_DESC("iops_max_length_DESC"),

    IOPS_RD_ASC("iops_rd_ASC"),

    IOPS_RD_DESC("iops_rd_DESC"),

    IOPS_RD_MAX_ASC("iops_rd_max_ASC"),

    IOPS_RD_MAX_DESC("iops_rd_max_DESC"),

    IOPS_RD_MAX_LENGTH_ASC("iops_rd_max_length_ASC"),

    IOPS_RD_MAX_LENGTH_DESC("iops_rd_max_length_DESC"),

    IOPS_WR_ASC("iops_wr_ASC"),

    IOPS_WR_DESC("iops_wr_DESC"),

    IOPS_WR_MAX_ASC("iops_wr_max_ASC"),

    IOPS_WR_MAX_DESC("iops_wr_max_DESC"),

    IOPS_WR_MAX_LENGTH_ASC("iops_wr_max_length_ASC"),

    IOPS_WR_MAX_LENGTH_DESC("iops_wr_max_length_DESC"),

    IP_WHITELIST_ASC("ip_whitelist_ASC"),

    IP_WHITELIST_DESC("ip_whitelist_DESC"),

    LOCAL_ID_ASC("local_id_ASC"),

    LOCAL_ID_DESC("local_id_DESC"),

    NAME_ASC("name_ASC"),

    NAME_DESC("name_DESC"),

    NQN_NAME_ASC("nqn_name_ASC"),

    NQN_NAME_DESC("nqn_name_DESC"),

    NQN_WHITELIST_ASC("nqn_whitelist_ASC"),

    NQN_WHITELIST_DESC("nqn_whitelist_DESC"),

    POLICY_ASC("policy_ASC"),

    POLICY_DESC("policy_DESC"),

    REPLICA_NUM_ASC("replica_num_ASC"),

    REPLICA_NUM_DESC("replica_num_DESC"),

    STRIPE_NUM_ASC("stripe_num_ASC"),

    STRIPE_NUM_DESC("stripe_num_DESC"),

    STRIPE_SIZE_ASC("stripe_size_ASC"),

    STRIPE_SIZE_DESC("stripe_size_DESC"),

    THIN_PROVISION_ASC("thin_provision_ASC"),

    THIN_PROVISION_DESC("thin_provision_DESC"),

    NVMFSUBSYSTEMORDERBYINPUT_UNSUPPORTED_ENUM("NVMFSUBSYSTEMORDERBYINPUT_UNSUPPORTED_ENUM");
    private String value;

    NvmfSubsystemOrderByInput(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NvmfSubsystemOrderByInput fromValue(String value) {
        for (NvmfSubsystemOrderByInput b : NvmfSubsystemOrderByInput.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return NvmfSubsystemOrderByInput.NVMFSUBSYSTEMORDERBYINPUT_UNSUPPORTED_ENUM;
    }

    public static class Adapter extends TypeAdapter<NvmfSubsystemOrderByInput> {
        @Override
        public void write(final JsonWriter jsonWriter, final NvmfSubsystemOrderByInput enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public NvmfSubsystemOrderByInput read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return NvmfSubsystemOrderByInput.fromValue(value);
        }
    }
}
