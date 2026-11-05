package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmTemplateConfigNicWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class VmTemplateConfigNicWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmTemplateConfigNicWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmTemplateConfigNicWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmTemplateConfigNicWhereInput> OR = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT =
            "egress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double egressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT =
            "egress_rate_limit_burst_in_bit_gt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT)
    private Double egressRateLimitBurstInBitGt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE =
            "egress_rate_limit_burst_in_bit_gte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE)
    private Double egressRateLimitBurstInBitGte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN =
            "egress_rate_limit_burst_in_bit_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN)
    private List<Double> egressRateLimitBurstInBitIn = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT =
            "egress_rate_limit_burst_in_bit_lt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT)
    private Double egressRateLimitBurstInBitLt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE =
            "egress_rate_limit_burst_in_bit_lte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE)
    private Double egressRateLimitBurstInBitLte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT =
            "egress_rate_limit_burst_in_bit_not";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT)
    private Double egressRateLimitBurstInBitNot;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN =
            "egress_rate_limit_burst_in_bit_not_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN)
    private List<Double> egressRateLimitBurstInBitNotIn = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED =
            "egress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED)
    private Boolean egressRateLimitEnabled;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT =
            "egress_rate_limit_enabled_not";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT)
    private Boolean egressRateLimitEnabledNot;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "egress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double egressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT =
            "egress_rate_limit_max_rate_in_bitps_gt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT)
    private Double egressRateLimitMaxRateInBitpsGt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE =
            "egress_rate_limit_max_rate_in_bitps_gte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE)
    private Double egressRateLimitMaxRateInBitpsGte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN =
            "egress_rate_limit_max_rate_in_bitps_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN)
    private List<Double> egressRateLimitMaxRateInBitpsIn = null;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT =
            "egress_rate_limit_max_rate_in_bitps_lt";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT)
    private Double egressRateLimitMaxRateInBitpsLt;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE =
            "egress_rate_limit_max_rate_in_bitps_lte";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE)
    private Double egressRateLimitMaxRateInBitpsLte;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT =
            "egress_rate_limit_max_rate_in_bitps_not";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT)
    private Double egressRateLimitMaxRateInBitpsNot;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN =
            "egress_rate_limit_max_rate_in_bitps_not_in";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN)
    private List<Double> egressRateLimitMaxRateInBitpsNotIn = null;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_ENABLED_NOT = "enabled_not";

    @SerializedName(SERIALIZED_NAME_ENABLED_NOT)
    private Boolean enabledNot;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_INDEX_GT = "index_gt";

    @SerializedName(SERIALIZED_NAME_INDEX_GT)
    private Integer indexGt;

    public static final String SERIALIZED_NAME_INDEX_GTE = "index_gte";

    @SerializedName(SERIALIZED_NAME_INDEX_GTE)
    private Integer indexGte;

    public static final String SERIALIZED_NAME_INDEX_IN = "index_in";

    @SerializedName(SERIALIZED_NAME_INDEX_IN)
    private List<Integer> indexIn = null;

    public static final String SERIALIZED_NAME_INDEX_LT = "index_lt";

    @SerializedName(SERIALIZED_NAME_INDEX_LT)
    private Integer indexLt;

    public static final String SERIALIZED_NAME_INDEX_LTE = "index_lte";

    @SerializedName(SERIALIZED_NAME_INDEX_LTE)
    private Integer indexLte;

    public static final String SERIALIZED_NAME_INDEX_NOT = "index_not";

    @SerializedName(SERIALIZED_NAME_INDEX_NOT)
    private Integer indexNot;

    public static final String SERIALIZED_NAME_INDEX_NOT_IN = "index_not_in";

    @SerializedName(SERIALIZED_NAME_INDEX_NOT_IN)
    private List<Integer> indexNotIn = null;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT =
            "ingress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double ingressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT =
            "ingress_rate_limit_burst_in_bit_gt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT)
    private Double ingressRateLimitBurstInBitGt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE =
            "ingress_rate_limit_burst_in_bit_gte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE)
    private Double ingressRateLimitBurstInBitGte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN =
            "ingress_rate_limit_burst_in_bit_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN)
    private List<Double> ingressRateLimitBurstInBitIn = null;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT =
            "ingress_rate_limit_burst_in_bit_lt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT)
    private Double ingressRateLimitBurstInBitLt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE =
            "ingress_rate_limit_burst_in_bit_lte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE)
    private Double ingressRateLimitBurstInBitLte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT =
            "ingress_rate_limit_burst_in_bit_not";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT)
    private Double ingressRateLimitBurstInBitNot;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN =
            "ingress_rate_limit_burst_in_bit_not_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN)
    private List<Double> ingressRateLimitBurstInBitNotIn = null;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED =
            "ingress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED)
    private Boolean ingressRateLimitEnabled;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT =
            "ingress_rate_limit_enabled_not";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT)
    private Boolean ingressRateLimitEnabledNot;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "ingress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double ingressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT =
            "ingress_rate_limit_max_rate_in_bitps_gt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT)
    private Double ingressRateLimitMaxRateInBitpsGt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE =
            "ingress_rate_limit_max_rate_in_bitps_gte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE)
    private Double ingressRateLimitMaxRateInBitpsGte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN =
            "ingress_rate_limit_max_rate_in_bitps_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN)
    private List<Double> ingressRateLimitMaxRateInBitpsIn = null;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT =
            "ingress_rate_limit_max_rate_in_bitps_lt";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT)
    private Double ingressRateLimitMaxRateInBitpsLt;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE =
            "ingress_rate_limit_max_rate_in_bitps_lte";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE)
    private Double ingressRateLimitMaxRateInBitpsLte;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT =
            "ingress_rate_limit_max_rate_in_bitps_not";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT)
    private Double ingressRateLimitMaxRateInBitpsNot;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN =
            "ingress_rate_limit_max_rate_in_bitps_not_in";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN)
    private List<Double> ingressRateLimitMaxRateInBitpsNotIn = null;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_IP_ADDRESS_CONTAINS = "ip_address_contains";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_CONTAINS)
    private String ipAddressContains;

    public static final String SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH = "ip_address_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH)
    private String ipAddressEndsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_GT = "ip_address_gt";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GT)
    private String ipAddressGt;

    public static final String SERIALIZED_NAME_IP_ADDRESS_GTE = "ip_address_gte";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GTE)
    private String ipAddressGte;

    public static final String SERIALIZED_NAME_IP_ADDRESS_IN = "ip_address_in";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_IN)
    private List<String> ipAddressIn = null;

    public static final String SERIALIZED_NAME_IP_ADDRESS_LT = "ip_address_lt";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LT)
    private String ipAddressLt;

    public static final String SERIALIZED_NAME_IP_ADDRESS_LTE = "ip_address_lte";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LTE)
    private String ipAddressLte;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT = "ip_address_not";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT)
    private String ipAddressNot;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS = "ip_address_not_contains";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS)
    private String ipAddressNotContains;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH =
            "ip_address_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH)
    private String ipAddressNotEndsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_IN = "ip_address_not_in";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_IN)
    private List<String> ipAddressNotIn = null;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH =
            "ip_address_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH)
    private String ipAddressNotStartsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH = "ip_address_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH)
    private String ipAddressStartsWith;

    public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
    private String macAddress;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_CONTAINS = "mac_address_contains";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS)
    private String macAddressContains;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH = "mac_address_ends_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH)
    private String macAddressEndsWith;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_GT = "mac_address_gt";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GT)
    private String macAddressGt;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_GTE = "mac_address_gte";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_GTE)
    private String macAddressGte;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_IN = "mac_address_in";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_IN)
    private List<String> macAddressIn = null;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_LT = "mac_address_lt";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LT)
    private String macAddressLt;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_LTE = "mac_address_lte";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_LTE)
    private String macAddressLte;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT = "mac_address_not";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT)
    private String macAddressNot;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS =
            "mac_address_not_contains";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS)
    private String macAddressNotContains;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH =
            "mac_address_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH)
    private String macAddressNotEndsWith;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_IN = "mac_address_not_in";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN)
    private List<String> macAddressNotIn = null;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH =
            "mac_address_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH)
    private String macAddressNotStartsWith;

    public static final String SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH = "mac_address_starts_with";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH)
    private String macAddressStartsWith;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_MIRROR_NOT = "mirror_not";

    @SerializedName(SERIALIZED_NAME_MIRROR_NOT)
    private Boolean mirrorNot;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private VmNicModel model;

    public static final String SERIALIZED_NAME_MODEL_IN = "model_in";

    @SerializedName(SERIALIZED_NAME_MODEL_IN)
    private List<VmNicModel> modelIn = null;

    public static final String SERIALIZED_NAME_MODEL_NOT = "model_not";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT)
    private VmNicModel modelNot;

    public static final String SERIALIZED_NAME_MODEL_NOT_IN = "model_not_in";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_IN)
    private List<VmNicModel> modelNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmNicType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<VmNicType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private VmNicType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<VmNicType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_CONFIG = "vm_template_config";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_CONFIG)
    private VmTemplateConfigWhereInput vmTemplateConfig;

    public VmTemplateConfigNicWhereInput() {}

    public VmTemplateConfigNicWhereInput AND(List<VmTemplateConfigNicWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmTemplateConfigNicWhereInput addANDItem(VmTemplateConfigNicWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmTemplateConfigNicWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmTemplateConfigNicWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmTemplateConfigNicWhereInput> AND) {
        this.AND = AND;
    }

    public VmTemplateConfigNicWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmTemplateConfigNicWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public VmTemplateConfigNicWhereInput NOT(List<VmTemplateConfigNicWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmTemplateConfigNicWhereInput addNOTItem(VmTemplateConfigNicWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmTemplateConfigNicWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmTemplateConfigNicWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmTemplateConfigNicWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmTemplateConfigNicWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmTemplateConfigNicWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public VmTemplateConfigNicWhereInput OR(List<VmTemplateConfigNicWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmTemplateConfigNicWhereInput addORItem(VmTemplateConfigNicWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmTemplateConfigNicWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmTemplateConfigNicWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmTemplateConfigNicWhereInput> OR) {
        this.OR = OR;
    }

    public VmTemplateConfigNicWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmTemplateConfigNicWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBit(
            Double egressRateLimitBurstInBit) {

        this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBit
     *
     * @return egressRateLimitBurstInBit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBit() {
        return egressRateLimitBurstInBit;
    }

    public void setEgressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {
        this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public void setEgressRateLimitBurstInBit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        }
    }

    public boolean getEgressRateLimitBurstInBit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitGt(
            Double egressRateLimitBurstInBitGt) {

        this.egressRateLimitBurstInBitGt = egressRateLimitBurstInBitGt;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitGt
     *
     * @return egressRateLimitBurstInBitGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitGt() {
        return egressRateLimitBurstInBitGt;
    }

    public void setEgressRateLimitBurstInBitGt(Double egressRateLimitBurstInBitGt) {
        this.egressRateLimitBurstInBitGt = egressRateLimitBurstInBitGt;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public void setEgressRateLimitBurstInBitGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        }
    }

    public boolean getEgressRateLimitBurstInBitGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitGte(
            Double egressRateLimitBurstInBitGte) {

        this.egressRateLimitBurstInBitGte = egressRateLimitBurstInBitGte;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitGte
     *
     * @return egressRateLimitBurstInBitGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitGte() {
        return egressRateLimitBurstInBitGte;
    }

    public void setEgressRateLimitBurstInBitGte(Double egressRateLimitBurstInBitGte) {
        this.egressRateLimitBurstInBitGte = egressRateLimitBurstInBitGte;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public void setEgressRateLimitBurstInBitGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        }
    }

    public boolean getEgressRateLimitBurstInBitGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitIn(
            List<Double> egressRateLimitBurstInBitIn) {

        this.egressRateLimitBurstInBitIn = egressRateLimitBurstInBitIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addEgressRateLimitBurstInBitInItem(
            Double egressRateLimitBurstInBitInItem) {
        if (this.egressRateLimitBurstInBitIn == null) {
            this.egressRateLimitBurstInBitIn = new ArrayList<Double>();
        }
        this.egressRateLimitBurstInBitIn.add(egressRateLimitBurstInBitInItem);
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitIn
     *
     * @return egressRateLimitBurstInBitIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitBurstInBitIn() {
        return egressRateLimitBurstInBitIn;
    }

    public void setEgressRateLimitBurstInBitIn(List<Double> egressRateLimitBurstInBitIn) {
        this.egressRateLimitBurstInBitIn = egressRateLimitBurstInBitIn;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public void setEgressRateLimitBurstInBitIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        }
    }

    public boolean getEgressRateLimitBurstInBitIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitLt(
            Double egressRateLimitBurstInBitLt) {

        this.egressRateLimitBurstInBitLt = egressRateLimitBurstInBitLt;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitLt
     *
     * @return egressRateLimitBurstInBitLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitLt() {
        return egressRateLimitBurstInBitLt;
    }

    public void setEgressRateLimitBurstInBitLt(Double egressRateLimitBurstInBitLt) {
        this.egressRateLimitBurstInBitLt = egressRateLimitBurstInBitLt;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public void setEgressRateLimitBurstInBitLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        }
    }

    public boolean getEgressRateLimitBurstInBitLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitLte(
            Double egressRateLimitBurstInBitLte) {

        this.egressRateLimitBurstInBitLte = egressRateLimitBurstInBitLte;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitLte
     *
     * @return egressRateLimitBurstInBitLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitLte() {
        return egressRateLimitBurstInBitLte;
    }

    public void setEgressRateLimitBurstInBitLte(Double egressRateLimitBurstInBitLte) {
        this.egressRateLimitBurstInBitLte = egressRateLimitBurstInBitLte;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public void setEgressRateLimitBurstInBitLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        }
    }

    public boolean getEgressRateLimitBurstInBitLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitNot(
            Double egressRateLimitBurstInBitNot) {

        this.egressRateLimitBurstInBitNot = egressRateLimitBurstInBitNot;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitNot
     *
     * @return egressRateLimitBurstInBitNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBitNot() {
        return egressRateLimitBurstInBitNot;
    }

    public void setEgressRateLimitBurstInBitNot(Double egressRateLimitBurstInBitNot) {
        this.egressRateLimitBurstInBitNot = egressRateLimitBurstInBitNot;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public void setEgressRateLimitBurstInBitNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        }
    }

    public boolean getEgressRateLimitBurstInBitNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitNotIn(
            List<Double> egressRateLimitBurstInBitNotIn) {

        this.egressRateLimitBurstInBitNotIn = egressRateLimitBurstInBitNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addEgressRateLimitBurstInBitNotInItem(
            Double egressRateLimitBurstInBitNotInItem) {
        if (this.egressRateLimitBurstInBitNotIn == null) {
            this.egressRateLimitBurstInBitNotIn = new ArrayList<Double>();
        }
        this.egressRateLimitBurstInBitNotIn.add(egressRateLimitBurstInBitNotInItem);
        return this;
    }

    /**
     * Get egressRateLimitBurstInBitNotIn
     *
     * @return egressRateLimitBurstInBitNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitBurstInBitNotIn() {
        return egressRateLimitBurstInBitNotIn;
    }

    public void setEgressRateLimitBurstInBitNotIn(List<Double> egressRateLimitBurstInBitNotIn) {
        this.egressRateLimitBurstInBitNotIn = egressRateLimitBurstInBitNotIn;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitBurstInBitNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public void setEgressRateLimitBurstInBitNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        }
    }

    public boolean getEgressRateLimitBurstInBitNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitEnabled(Boolean egressRateLimitEnabled) {

        this.egressRateLimitEnabled = egressRateLimitEnabled;
        return this;
    }

    /**
     * Get egressRateLimitEnabled
     *
     * @return egressRateLimitEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEgressRateLimitEnabled() {
        return egressRateLimitEnabled;
    }

    public void setEgressRateLimitEnabled(Boolean egressRateLimitEnabled) {
        this.egressRateLimitEnabled = egressRateLimitEnabled;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public void setEgressRateLimitEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        }
    }

    public boolean getEgressRateLimitEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitEnabledNot(
            Boolean egressRateLimitEnabledNot) {

        this.egressRateLimitEnabledNot = egressRateLimitEnabledNot;
        return this;
    }

    /**
     * Get egressRateLimitEnabledNot
     *
     * @return egressRateLimitEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEgressRateLimitEnabledNot() {
        return egressRateLimitEnabledNot;
    }

    public void setEgressRateLimitEnabledNot(Boolean egressRateLimitEnabledNot) {
        this.egressRateLimitEnabledNot = egressRateLimitEnabledNot;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public void setEgressRateLimitEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
        }
    }

    public boolean getEgressRateLimitEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED_NOT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitps(
            Double egressRateLimitMaxRateInBitps) {

        this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitps
     *
     * @return egressRateLimitMaxRateInBitps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitps() {
        return egressRateLimitMaxRateInBitps;
    }

    public void setEgressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {
        this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsGt(
            Double egressRateLimitMaxRateInBitpsGt) {

        this.egressRateLimitMaxRateInBitpsGt = egressRateLimitMaxRateInBitpsGt;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsGt
     *
     * @return egressRateLimitMaxRateInBitpsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsGt() {
        return egressRateLimitMaxRateInBitpsGt;
    }

    public void setEgressRateLimitMaxRateInBitpsGt(Double egressRateLimitMaxRateInBitpsGt) {
        this.egressRateLimitMaxRateInBitpsGt = egressRateLimitMaxRateInBitpsGt;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsGte(
            Double egressRateLimitMaxRateInBitpsGte) {

        this.egressRateLimitMaxRateInBitpsGte = egressRateLimitMaxRateInBitpsGte;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsGte
     *
     * @return egressRateLimitMaxRateInBitpsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsGte() {
        return egressRateLimitMaxRateInBitpsGte;
    }

    public void setEgressRateLimitMaxRateInBitpsGte(Double egressRateLimitMaxRateInBitpsGte) {
        this.egressRateLimitMaxRateInBitpsGte = egressRateLimitMaxRateInBitpsGte;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsIn(
            List<Double> egressRateLimitMaxRateInBitpsIn) {

        this.egressRateLimitMaxRateInBitpsIn = egressRateLimitMaxRateInBitpsIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addEgressRateLimitMaxRateInBitpsInItem(
            Double egressRateLimitMaxRateInBitpsInItem) {
        if (this.egressRateLimitMaxRateInBitpsIn == null) {
            this.egressRateLimitMaxRateInBitpsIn = new ArrayList<Double>();
        }
        this.egressRateLimitMaxRateInBitpsIn.add(egressRateLimitMaxRateInBitpsInItem);
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsIn
     *
     * @return egressRateLimitMaxRateInBitpsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitMaxRateInBitpsIn() {
        return egressRateLimitMaxRateInBitpsIn;
    }

    public void setEgressRateLimitMaxRateInBitpsIn(List<Double> egressRateLimitMaxRateInBitpsIn) {
        this.egressRateLimitMaxRateInBitpsIn = egressRateLimitMaxRateInBitpsIn;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsLt(
            Double egressRateLimitMaxRateInBitpsLt) {

        this.egressRateLimitMaxRateInBitpsLt = egressRateLimitMaxRateInBitpsLt;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsLt
     *
     * @return egressRateLimitMaxRateInBitpsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsLt() {
        return egressRateLimitMaxRateInBitpsLt;
    }

    public void setEgressRateLimitMaxRateInBitpsLt(Double egressRateLimitMaxRateInBitpsLt) {
        this.egressRateLimitMaxRateInBitpsLt = egressRateLimitMaxRateInBitpsLt;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsLte(
            Double egressRateLimitMaxRateInBitpsLte) {

        this.egressRateLimitMaxRateInBitpsLte = egressRateLimitMaxRateInBitpsLte;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsLte
     *
     * @return egressRateLimitMaxRateInBitpsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsLte() {
        return egressRateLimitMaxRateInBitpsLte;
    }

    public void setEgressRateLimitMaxRateInBitpsLte(Double egressRateLimitMaxRateInBitpsLte) {
        this.egressRateLimitMaxRateInBitpsLte = egressRateLimitMaxRateInBitpsLte;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsNot(
            Double egressRateLimitMaxRateInBitpsNot) {

        this.egressRateLimitMaxRateInBitpsNot = egressRateLimitMaxRateInBitpsNot;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsNot
     *
     * @return egressRateLimitMaxRateInBitpsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitpsNot() {
        return egressRateLimitMaxRateInBitpsNot;
    }

    public void setEgressRateLimitMaxRateInBitpsNot(Double egressRateLimitMaxRateInBitpsNot) {
        this.egressRateLimitMaxRateInBitpsNot = egressRateLimitMaxRateInBitpsNot;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsNotIn(
            List<Double> egressRateLimitMaxRateInBitpsNotIn) {

        this.egressRateLimitMaxRateInBitpsNotIn = egressRateLimitMaxRateInBitpsNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addEgressRateLimitMaxRateInBitpsNotInItem(
            Double egressRateLimitMaxRateInBitpsNotInItem) {
        if (this.egressRateLimitMaxRateInBitpsNotIn == null) {
            this.egressRateLimitMaxRateInBitpsNotIn = new ArrayList<Double>();
        }
        this.egressRateLimitMaxRateInBitpsNotIn.add(egressRateLimitMaxRateInBitpsNotInItem);
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitpsNotIn
     *
     * @return egressRateLimitMaxRateInBitpsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getEgressRateLimitMaxRateInBitpsNotIn() {
        return egressRateLimitMaxRateInBitpsNotIn;
    }

    public void setEgressRateLimitMaxRateInBitpsNotIn(
            List<Double> egressRateLimitMaxRateInBitpsNotIn) {
        this.egressRateLimitMaxRateInBitpsNotIn = egressRateLimitMaxRateInBitpsNotIn;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput egressRateLimitMaxRateInBitpsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public VmTemplateConfigNicWhereInput enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmTemplateConfigNicWhereInput enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public VmTemplateConfigNicWhereInput enabledNot(Boolean enabledNot) {

        this.enabledNot = enabledNot;
        return this;
    }

    /**
     * Get enabledNot
     *
     * @return enabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabledNot() {
        return enabledNot;
    }

    public void setEnabledNot(Boolean enabledNot) {
        this.enabledNot = enabledNot;
    }

    public VmTemplateConfigNicWhereInput enabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput enabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        return this;
    }

    public void setEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED_NOT);
        }
    }

    public boolean getEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED_NOT);
    }

    public VmTemplateConfigNicWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VmTemplateConfigNicWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmTemplateConfigNicWhereInput id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public VmTemplateConfigNicWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public VmTemplateConfigNicWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmTemplateConfigNicWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public VmTemplateConfigNicWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public VmTemplateConfigNicWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public VmTemplateConfigNicWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public VmTemplateConfigNicWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public VmTemplateConfigNicWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public VmTemplateConfigNicWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public VmTemplateConfigNicWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public VmTemplateConfigNicWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public VmTemplateConfigNicWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public VmTemplateConfigNicWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public VmTemplateConfigNicWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public VmTemplateConfigNicWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public VmTemplateConfigNicWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public VmTemplateConfigNicWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public VmTemplateConfigNicWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public VmTemplateConfigNicWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigNicWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public VmTemplateConfigNicWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public VmTemplateConfigNicWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public VmTemplateConfigNicWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public VmTemplateConfigNicWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public VmTemplateConfigNicWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public VmTemplateConfigNicWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public VmTemplateConfigNicWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public VmTemplateConfigNicWhereInput index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public VmTemplateConfigNicWhereInput index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public VmTemplateConfigNicWhereInput index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    public VmTemplateConfigNicWhereInput indexGt(Integer indexGt) {

        this.indexGt = indexGt;
        return this;
    }

    /**
     * Get indexGt
     *
     * @return indexGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexGt() {
        return indexGt;
    }

    public void setIndexGt(Integer indexGt) {
        this.indexGt = indexGt;
    }

    public VmTemplateConfigNicWhereInput indexGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput indexGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_GT);
        return this;
    }

    public void setIndexGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_GT);
        }
    }

    public boolean getIndexGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_GT);
    }

    public VmTemplateConfigNicWhereInput indexGte(Integer indexGte) {

        this.indexGte = indexGte;
        return this;
    }

    /**
     * Get indexGte
     *
     * @return indexGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexGte() {
        return indexGte;
    }

    public void setIndexGte(Integer indexGte) {
        this.indexGte = indexGte;
    }

    public VmTemplateConfigNicWhereInput indexGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput indexGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_GTE);
        return this;
    }

    public void setIndexGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_GTE);
        }
    }

    public boolean getIndexGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_GTE);
    }

    public VmTemplateConfigNicWhereInput indexIn(List<Integer> indexIn) {

        this.indexIn = indexIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIndexInItem(Integer indexInItem) {
        if (this.indexIn == null) {
            this.indexIn = new ArrayList<Integer>();
        }
        this.indexIn.add(indexInItem);
        return this;
    }

    /**
     * Get indexIn
     *
     * @return indexIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIndexIn() {
        return indexIn;
    }

    public void setIndexIn(List<Integer> indexIn) {
        this.indexIn = indexIn;
    }

    public VmTemplateConfigNicWhereInput indexIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput indexIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_IN);
        return this;
    }

    public void setIndexIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_IN);
        }
    }

    public boolean getIndexIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_IN);
    }

    public VmTemplateConfigNicWhereInput indexLt(Integer indexLt) {

        this.indexLt = indexLt;
        return this;
    }

    /**
     * Get indexLt
     *
     * @return indexLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexLt() {
        return indexLt;
    }

    public void setIndexLt(Integer indexLt) {
        this.indexLt = indexLt;
    }

    public VmTemplateConfigNicWhereInput indexLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput indexLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_LT);
        return this;
    }

    public void setIndexLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_LT);
        }
    }

    public boolean getIndexLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_LT);
    }

    public VmTemplateConfigNicWhereInput indexLte(Integer indexLte) {

        this.indexLte = indexLte;
        return this;
    }

    /**
     * Get indexLte
     *
     * @return indexLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexLte() {
        return indexLte;
    }

    public void setIndexLte(Integer indexLte) {
        this.indexLte = indexLte;
    }

    public VmTemplateConfigNicWhereInput indexLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput indexLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_LTE);
        return this;
    }

    public void setIndexLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_LTE);
        }
    }

    public boolean getIndexLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_LTE);
    }

    public VmTemplateConfigNicWhereInput indexNot(Integer indexNot) {

        this.indexNot = indexNot;
        return this;
    }

    /**
     * Get indexNot
     *
     * @return indexNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIndexNot() {
        return indexNot;
    }

    public void setIndexNot(Integer indexNot) {
        this.indexNot = indexNot;
    }

    public VmTemplateConfigNicWhereInput indexNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput indexNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT);
        return this;
    }

    public void setIndexNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT);
        }
    }

    public boolean getIndexNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_NOT);
    }

    public VmTemplateConfigNicWhereInput indexNotIn(List<Integer> indexNotIn) {

        this.indexNotIn = indexNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIndexNotInItem(Integer indexNotInItem) {
        if (this.indexNotIn == null) {
            this.indexNotIn = new ArrayList<Integer>();
        }
        this.indexNotIn.add(indexNotInItem);
        return this;
    }

    /**
     * Get indexNotIn
     *
     * @return indexNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIndexNotIn() {
        return indexNotIn;
    }

    public void setIndexNotIn(List<Integer> indexNotIn) {
        this.indexNotIn = indexNotIn;
    }

    public VmTemplateConfigNicWhereInput indexNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput indexNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT_IN);
        return this;
    }

    public void setIndexNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX_NOT_IN);
        }
    }

    public boolean getIndexNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBit(
            Double ingressRateLimitBurstInBit) {

        this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBit
     *
     * @return ingressRateLimitBurstInBit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBit() {
        return ingressRateLimitBurstInBit;
    }

    public void setIngressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {
        this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public void setIngressRateLimitBurstInBit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        }
    }

    public boolean getIngressRateLimitBurstInBit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitGt(
            Double ingressRateLimitBurstInBitGt) {

        this.ingressRateLimitBurstInBitGt = ingressRateLimitBurstInBitGt;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitGt
     *
     * @return ingressRateLimitBurstInBitGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitGt() {
        return ingressRateLimitBurstInBitGt;
    }

    public void setIngressRateLimitBurstInBitGt(Double ingressRateLimitBurstInBitGt) {
        this.ingressRateLimitBurstInBitGt = ingressRateLimitBurstInBitGt;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        return this;
    }

    public void setIngressRateLimitBurstInBitGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
        }
    }

    public boolean getIngressRateLimitBurstInBitGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitGte(
            Double ingressRateLimitBurstInBitGte) {

        this.ingressRateLimitBurstInBitGte = ingressRateLimitBurstInBitGte;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitGte
     *
     * @return ingressRateLimitBurstInBitGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitGte() {
        return ingressRateLimitBurstInBitGte;
    }

    public void setIngressRateLimitBurstInBitGte(Double ingressRateLimitBurstInBitGte) {
        this.ingressRateLimitBurstInBitGte = ingressRateLimitBurstInBitGte;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        return this;
    }

    public void setIngressRateLimitBurstInBitGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
        }
    }

    public boolean getIngressRateLimitBurstInBitGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_GTE);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitIn(
            List<Double> ingressRateLimitBurstInBitIn) {

        this.ingressRateLimitBurstInBitIn = ingressRateLimitBurstInBitIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIngressRateLimitBurstInBitInItem(
            Double ingressRateLimitBurstInBitInItem) {
        if (this.ingressRateLimitBurstInBitIn == null) {
            this.ingressRateLimitBurstInBitIn = new ArrayList<Double>();
        }
        this.ingressRateLimitBurstInBitIn.add(ingressRateLimitBurstInBitInItem);
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitIn
     *
     * @return ingressRateLimitBurstInBitIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitBurstInBitIn() {
        return ingressRateLimitBurstInBitIn;
    }

    public void setIngressRateLimitBurstInBitIn(List<Double> ingressRateLimitBurstInBitIn) {
        this.ingressRateLimitBurstInBitIn = ingressRateLimitBurstInBitIn;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        return this;
    }

    public void setIngressRateLimitBurstInBitIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
        }
    }

    public boolean getIngressRateLimitBurstInBitIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_IN);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitLt(
            Double ingressRateLimitBurstInBitLt) {

        this.ingressRateLimitBurstInBitLt = ingressRateLimitBurstInBitLt;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitLt
     *
     * @return ingressRateLimitBurstInBitLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitLt() {
        return ingressRateLimitBurstInBitLt;
    }

    public void setIngressRateLimitBurstInBitLt(Double ingressRateLimitBurstInBitLt) {
        this.ingressRateLimitBurstInBitLt = ingressRateLimitBurstInBitLt;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        return this;
    }

    public void setIngressRateLimitBurstInBitLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
        }
    }

    public boolean getIngressRateLimitBurstInBitLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitLte(
            Double ingressRateLimitBurstInBitLte) {

        this.ingressRateLimitBurstInBitLte = ingressRateLimitBurstInBitLte;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitLte
     *
     * @return ingressRateLimitBurstInBitLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitLte() {
        return ingressRateLimitBurstInBitLte;
    }

    public void setIngressRateLimitBurstInBitLte(Double ingressRateLimitBurstInBitLte) {
        this.ingressRateLimitBurstInBitLte = ingressRateLimitBurstInBitLte;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        return this;
    }

    public void setIngressRateLimitBurstInBitLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
        }
    }

    public boolean getIngressRateLimitBurstInBitLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_LTE);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitNot(
            Double ingressRateLimitBurstInBitNot) {

        this.ingressRateLimitBurstInBitNot = ingressRateLimitBurstInBitNot;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitNot
     *
     * @return ingressRateLimitBurstInBitNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBitNot() {
        return ingressRateLimitBurstInBitNot;
    }

    public void setIngressRateLimitBurstInBitNot(Double ingressRateLimitBurstInBitNot) {
        this.ingressRateLimitBurstInBitNot = ingressRateLimitBurstInBitNot;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        return this;
    }

    public void setIngressRateLimitBurstInBitNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
        }
    }

    public boolean getIngressRateLimitBurstInBitNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitNotIn(
            List<Double> ingressRateLimitBurstInBitNotIn) {

        this.ingressRateLimitBurstInBitNotIn = ingressRateLimitBurstInBitNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIngressRateLimitBurstInBitNotInItem(
            Double ingressRateLimitBurstInBitNotInItem) {
        if (this.ingressRateLimitBurstInBitNotIn == null) {
            this.ingressRateLimitBurstInBitNotIn = new ArrayList<Double>();
        }
        this.ingressRateLimitBurstInBitNotIn.add(ingressRateLimitBurstInBitNotInItem);
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBitNotIn
     *
     * @return ingressRateLimitBurstInBitNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitBurstInBitNotIn() {
        return ingressRateLimitBurstInBitNotIn;
    }

    public void setIngressRateLimitBurstInBitNotIn(List<Double> ingressRateLimitBurstInBitNotIn) {
        this.ingressRateLimitBurstInBitNotIn = ingressRateLimitBurstInBitNotIn;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitBurstInBitNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        return this;
    }

    public void setIngressRateLimitBurstInBitNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
        }
    }

    public boolean getIngressRateLimitBurstInBitNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitEnabled(Boolean ingressRateLimitEnabled) {

        this.ingressRateLimitEnabled = ingressRateLimitEnabled;
        return this;
    }

    /**
     * Get ingressRateLimitEnabled
     *
     * @return ingressRateLimitEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIngressRateLimitEnabled() {
        return ingressRateLimitEnabled;
    }

    public void setIngressRateLimitEnabled(Boolean ingressRateLimitEnabled) {
        this.ingressRateLimitEnabled = ingressRateLimitEnabled;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public void setIngressRateLimitEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        }
    }

    public boolean getIngressRateLimitEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitEnabledNot(
            Boolean ingressRateLimitEnabledNot) {

        this.ingressRateLimitEnabledNot = ingressRateLimitEnabledNot;
        return this;
    }

    /**
     * Get ingressRateLimitEnabledNot
     *
     * @return ingressRateLimitEnabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIngressRateLimitEnabledNot() {
        return ingressRateLimitEnabledNot;
    }

    public void setIngressRateLimitEnabledNot(Boolean ingressRateLimitEnabledNot) {
        this.ingressRateLimitEnabledNot = ingressRateLimitEnabledNot;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitEnabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitEnabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        return this;
    }

    public void setIngressRateLimitEnabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
        }
    }

    public boolean getIngressRateLimitEnabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED_NOT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitps(
            Double ingressRateLimitMaxRateInBitps) {

        this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitps
     *
     * @return ingressRateLimitMaxRateInBitps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitps() {
        return ingressRateLimitMaxRateInBitps;
    }

    public void setIngressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {
        this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsGt(
            Double ingressRateLimitMaxRateInBitpsGt) {

        this.ingressRateLimitMaxRateInBitpsGt = ingressRateLimitMaxRateInBitpsGt;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsGt
     *
     * @return ingressRateLimitMaxRateInBitpsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsGt() {
        return ingressRateLimitMaxRateInBitpsGt;
    }

    public void setIngressRateLimitMaxRateInBitpsGt(Double ingressRateLimitMaxRateInBitpsGt) {
        this.ingressRateLimitMaxRateInBitpsGt = ingressRateLimitMaxRateInBitpsGt;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsGte(
            Double ingressRateLimitMaxRateInBitpsGte) {

        this.ingressRateLimitMaxRateInBitpsGte = ingressRateLimitMaxRateInBitpsGte;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsGte
     *
     * @return ingressRateLimitMaxRateInBitpsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsGte() {
        return ingressRateLimitMaxRateInBitpsGte;
    }

    public void setIngressRateLimitMaxRateInBitpsGte(Double ingressRateLimitMaxRateInBitpsGte) {
        this.ingressRateLimitMaxRateInBitpsGte = ingressRateLimitMaxRateInBitpsGte;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_GTE);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsIn(
            List<Double> ingressRateLimitMaxRateInBitpsIn) {

        this.ingressRateLimitMaxRateInBitpsIn = ingressRateLimitMaxRateInBitpsIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIngressRateLimitMaxRateInBitpsInItem(
            Double ingressRateLimitMaxRateInBitpsInItem) {
        if (this.ingressRateLimitMaxRateInBitpsIn == null) {
            this.ingressRateLimitMaxRateInBitpsIn = new ArrayList<Double>();
        }
        this.ingressRateLimitMaxRateInBitpsIn.add(ingressRateLimitMaxRateInBitpsInItem);
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsIn
     *
     * @return ingressRateLimitMaxRateInBitpsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitMaxRateInBitpsIn() {
        return ingressRateLimitMaxRateInBitpsIn;
    }

    public void setIngressRateLimitMaxRateInBitpsIn(List<Double> ingressRateLimitMaxRateInBitpsIn) {
        this.ingressRateLimitMaxRateInBitpsIn = ingressRateLimitMaxRateInBitpsIn;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_IN);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsLt(
            Double ingressRateLimitMaxRateInBitpsLt) {

        this.ingressRateLimitMaxRateInBitpsLt = ingressRateLimitMaxRateInBitpsLt;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsLt
     *
     * @return ingressRateLimitMaxRateInBitpsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsLt() {
        return ingressRateLimitMaxRateInBitpsLt;
    }

    public void setIngressRateLimitMaxRateInBitpsLt(Double ingressRateLimitMaxRateInBitpsLt) {
        this.ingressRateLimitMaxRateInBitpsLt = ingressRateLimitMaxRateInBitpsLt;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsLte(
            Double ingressRateLimitMaxRateInBitpsLte) {

        this.ingressRateLimitMaxRateInBitpsLte = ingressRateLimitMaxRateInBitpsLte;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsLte
     *
     * @return ingressRateLimitMaxRateInBitpsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsLte() {
        return ingressRateLimitMaxRateInBitpsLte;
    }

    public void setIngressRateLimitMaxRateInBitpsLte(Double ingressRateLimitMaxRateInBitpsLte) {
        this.ingressRateLimitMaxRateInBitpsLte = ingressRateLimitMaxRateInBitpsLte;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_LTE);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsNot(
            Double ingressRateLimitMaxRateInBitpsNot) {

        this.ingressRateLimitMaxRateInBitpsNot = ingressRateLimitMaxRateInBitpsNot;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsNot
     *
     * @return ingressRateLimitMaxRateInBitpsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitpsNot() {
        return ingressRateLimitMaxRateInBitpsNot;
    }

    public void setIngressRateLimitMaxRateInBitpsNot(Double ingressRateLimitMaxRateInBitpsNot) {
        this.ingressRateLimitMaxRateInBitpsNot = ingressRateLimitMaxRateInBitpsNot;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT);
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsNotIn(
            List<Double> ingressRateLimitMaxRateInBitpsNotIn) {

        this.ingressRateLimitMaxRateInBitpsNotIn = ingressRateLimitMaxRateInBitpsNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIngressRateLimitMaxRateInBitpsNotInItem(
            Double ingressRateLimitMaxRateInBitpsNotInItem) {
        if (this.ingressRateLimitMaxRateInBitpsNotIn == null) {
            this.ingressRateLimitMaxRateInBitpsNotIn = new ArrayList<Double>();
        }
        this.ingressRateLimitMaxRateInBitpsNotIn.add(ingressRateLimitMaxRateInBitpsNotInItem);
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitpsNotIn
     *
     * @return ingressRateLimitMaxRateInBitpsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getIngressRateLimitMaxRateInBitpsNotIn() {
        return ingressRateLimitMaxRateInBitpsNotIn;
    }

    public void setIngressRateLimitMaxRateInBitpsNotIn(
            List<Double> ingressRateLimitMaxRateInBitpsNotIn) {
        this.ingressRateLimitMaxRateInBitpsNotIn = ingressRateLimitMaxRateInBitpsNotIn;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput ingressRateLimitMaxRateInBitpsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitpsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput ipAddress(String ipAddress) {

        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public VmTemplateConfigNicWhereInput ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public void setIpAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        }
    }

    public boolean getIpAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS);
    }

    public VmTemplateConfigNicWhereInput ipAddressContains(String ipAddressContains) {

        this.ipAddressContains = ipAddressContains;
        return this;
    }

    /**
     * Get ipAddressContains
     *
     * @return ipAddressContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressContains() {
        return ipAddressContains;
    }

    public void setIpAddressContains(String ipAddressContains) {
        this.ipAddressContains = ipAddressContains;
    }

    public VmTemplateConfigNicWhereInput ipAddressContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        return this;
    }

    public void setIpAddressContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        }
    }

    public boolean getIpAddressContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
    }

    public VmTemplateConfigNicWhereInput ipAddressEndsWith(String ipAddressEndsWith) {

        this.ipAddressEndsWith = ipAddressEndsWith;
        return this;
    }

    /**
     * Get ipAddressEndsWith
     *
     * @return ipAddressEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressEndsWith() {
        return ipAddressEndsWith;
    }

    public void setIpAddressEndsWith(String ipAddressEndsWith) {
        this.ipAddressEndsWith = ipAddressEndsWith;
    }

    public VmTemplateConfigNicWhereInput ipAddressEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        return this;
    }

    public void setIpAddressEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        }
    }

    public boolean getIpAddressEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
    }

    public VmTemplateConfigNicWhereInput ipAddressGt(String ipAddressGt) {

        this.ipAddressGt = ipAddressGt;
        return this;
    }

    /**
     * Get ipAddressGt
     *
     * @return ipAddressGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressGt() {
        return ipAddressGt;
    }

    public void setIpAddressGt(String ipAddressGt) {
        this.ipAddressGt = ipAddressGt;
    }

    public VmTemplateConfigNicWhereInput ipAddressGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GT);
        return this;
    }

    public void setIpAddressGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GT);
        }
    }

    public boolean getIpAddressGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_GT);
    }

    public VmTemplateConfigNicWhereInput ipAddressGte(String ipAddressGte) {

        this.ipAddressGte = ipAddressGte;
        return this;
    }

    /**
     * Get ipAddressGte
     *
     * @return ipAddressGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressGte() {
        return ipAddressGte;
    }

    public void setIpAddressGte(String ipAddressGte) {
        this.ipAddressGte = ipAddressGte;
    }

    public VmTemplateConfigNicWhereInput ipAddressGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GTE);
        return this;
    }

    public void setIpAddressGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GTE);
        }
    }

    public boolean getIpAddressGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_GTE);
    }

    public VmTemplateConfigNicWhereInput ipAddressIn(List<String> ipAddressIn) {

        this.ipAddressIn = ipAddressIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIpAddressInItem(String ipAddressInItem) {
        if (this.ipAddressIn == null) {
            this.ipAddressIn = new ArrayList<String>();
        }
        this.ipAddressIn.add(ipAddressInItem);
        return this;
    }

    /**
     * Get ipAddressIn
     *
     * @return ipAddressIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpAddressIn() {
        return ipAddressIn;
    }

    public void setIpAddressIn(List<String> ipAddressIn) {
        this.ipAddressIn = ipAddressIn;
    }

    public VmTemplateConfigNicWhereInput ipAddressIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_IN);
        return this;
    }

    public void setIpAddressIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_IN);
        }
    }

    public boolean getIpAddressIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_IN);
    }

    public VmTemplateConfigNicWhereInput ipAddressLt(String ipAddressLt) {

        this.ipAddressLt = ipAddressLt;
        return this;
    }

    /**
     * Get ipAddressLt
     *
     * @return ipAddressLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressLt() {
        return ipAddressLt;
    }

    public void setIpAddressLt(String ipAddressLt) {
        this.ipAddressLt = ipAddressLt;
    }

    public VmTemplateConfigNicWhereInput ipAddressLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LT);
        return this;
    }

    public void setIpAddressLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LT);
        }
    }

    public boolean getIpAddressLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_LT);
    }

    public VmTemplateConfigNicWhereInput ipAddressLte(String ipAddressLte) {

        this.ipAddressLte = ipAddressLte;
        return this;
    }

    /**
     * Get ipAddressLte
     *
     * @return ipAddressLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressLte() {
        return ipAddressLte;
    }

    public void setIpAddressLte(String ipAddressLte) {
        this.ipAddressLte = ipAddressLte;
    }

    public VmTemplateConfigNicWhereInput ipAddressLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LTE);
        return this;
    }

    public void setIpAddressLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LTE);
        }
    }

    public boolean getIpAddressLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_LTE);
    }

    public VmTemplateConfigNicWhereInput ipAddressNot(String ipAddressNot) {

        this.ipAddressNot = ipAddressNot;
        return this;
    }

    /**
     * Get ipAddressNot
     *
     * @return ipAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNot() {
        return ipAddressNot;
    }

    public void setIpAddressNot(String ipAddressNot) {
        this.ipAddressNot = ipAddressNot;
    }

    public VmTemplateConfigNicWhereInput ipAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT);
        return this;
    }

    public void setIpAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT);
        }
    }

    public boolean getIpAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT);
    }

    public VmTemplateConfigNicWhereInput ipAddressNotContains(String ipAddressNotContains) {

        this.ipAddressNotContains = ipAddressNotContains;
        return this;
    }

    /**
     * Get ipAddressNotContains
     *
     * @return ipAddressNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotContains() {
        return ipAddressNotContains;
    }

    public void setIpAddressNotContains(String ipAddressNotContains) {
        this.ipAddressNotContains = ipAddressNotContains;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public void setIpAddressNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        }
    }

    public boolean getIpAddressNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
    }

    public VmTemplateConfigNicWhereInput ipAddressNotEndsWith(String ipAddressNotEndsWith) {

        this.ipAddressNotEndsWith = ipAddressNotEndsWith;
        return this;
    }

    /**
     * Get ipAddressNotEndsWith
     *
     * @return ipAddressNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotEndsWith() {
        return ipAddressNotEndsWith;
    }

    public void setIpAddressNotEndsWith(String ipAddressNotEndsWith) {
        this.ipAddressNotEndsWith = ipAddressNotEndsWith;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public void setIpAddressNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        }
    }

    public boolean getIpAddressNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
    }

    public VmTemplateConfigNicWhereInput ipAddressNotIn(List<String> ipAddressNotIn) {

        this.ipAddressNotIn = ipAddressNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addIpAddressNotInItem(String ipAddressNotInItem) {
        if (this.ipAddressNotIn == null) {
            this.ipAddressNotIn = new ArrayList<String>();
        }
        this.ipAddressNotIn.add(ipAddressNotInItem);
        return this;
    }

    /**
     * Get ipAddressNotIn
     *
     * @return ipAddressNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpAddressNotIn() {
        return ipAddressNotIn;
    }

    public void setIpAddressNotIn(List<String> ipAddressNotIn) {
        this.ipAddressNotIn = ipAddressNotIn;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        return this;
    }

    public void setIpAddressNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        }
    }

    public boolean getIpAddressNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput ipAddressNotStartsWith(String ipAddressNotStartsWith) {

        this.ipAddressNotStartsWith = ipAddressNotStartsWith;
        return this;
    }

    /**
     * Get ipAddressNotStartsWith
     *
     * @return ipAddressNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotStartsWith() {
        return ipAddressNotStartsWith;
    }

    public void setIpAddressNotStartsWith(String ipAddressNotStartsWith) {
        this.ipAddressNotStartsWith = ipAddressNotStartsWith;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public void setIpAddressNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        }
    }

    public boolean getIpAddressNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
    }

    public VmTemplateConfigNicWhereInput ipAddressStartsWith(String ipAddressStartsWith) {

        this.ipAddressStartsWith = ipAddressStartsWith;
        return this;
    }

    /**
     * Get ipAddressStartsWith
     *
     * @return ipAddressStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressStartsWith() {
        return ipAddressStartsWith;
    }

    public void setIpAddressStartsWith(String ipAddressStartsWith) {
        this.ipAddressStartsWith = ipAddressStartsWith;
    }

    public VmTemplateConfigNicWhereInput ipAddressStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput ipAddressStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        return this;
    }

    public void setIpAddressStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        }
    }

    public boolean getIpAddressStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
    }

    public VmTemplateConfigNicWhereInput macAddress(String macAddress) {

        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get macAddress
     *
     * @return macAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public VmTemplateConfigNicWhereInput macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public void setMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        }
    }

    public boolean getMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS);
    }

    public VmTemplateConfigNicWhereInput macAddressContains(String macAddressContains) {

        this.macAddressContains = macAddressContains;
        return this;
    }

    /**
     * Get macAddressContains
     *
     * @return macAddressContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressContains() {
        return macAddressContains;
    }

    public void setMacAddressContains(String macAddressContains) {
        this.macAddressContains = macAddressContains;
    }

    public VmTemplateConfigNicWhereInput macAddressContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        return this;
    }

    public void setMacAddressContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
        }
    }

    public boolean getMacAddressContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_CONTAINS);
    }

    public VmTemplateConfigNicWhereInput macAddressEndsWith(String macAddressEndsWith) {

        this.macAddressEndsWith = macAddressEndsWith;
        return this;
    }

    /**
     * Get macAddressEndsWith
     *
     * @return macAddressEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressEndsWith() {
        return macAddressEndsWith;
    }

    public void setMacAddressEndsWith(String macAddressEndsWith) {
        this.macAddressEndsWith = macAddressEndsWith;
    }

    public VmTemplateConfigNicWhereInput macAddressEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        return this;
    }

    public void setMacAddressEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
        }
    }

    public boolean getMacAddressEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_ENDS_WITH);
    }

    public VmTemplateConfigNicWhereInput macAddressGt(String macAddressGt) {

        this.macAddressGt = macAddressGt;
        return this;
    }

    /**
     * Get macAddressGt
     *
     * @return macAddressGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressGt() {
        return macAddressGt;
    }

    public void setMacAddressGt(String macAddressGt) {
        this.macAddressGt = macAddressGt;
    }

    public VmTemplateConfigNicWhereInput macAddressGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GT);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GT);
        return this;
    }

    public void setMacAddressGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GT);
        }
    }

    public boolean getMacAddressGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_GT);
    }

    public VmTemplateConfigNicWhereInput macAddressGte(String macAddressGte) {

        this.macAddressGte = macAddressGte;
        return this;
    }

    /**
     * Get macAddressGte
     *
     * @return macAddressGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressGte() {
        return macAddressGte;
    }

    public void setMacAddressGte(String macAddressGte) {
        this.macAddressGte = macAddressGte;
    }

    public VmTemplateConfigNicWhereInput macAddressGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        return this;
    }

    public void setMacAddressGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_GTE);
        }
    }

    public boolean getMacAddressGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_GTE);
    }

    public VmTemplateConfigNicWhereInput macAddressIn(List<String> macAddressIn) {

        this.macAddressIn = macAddressIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addMacAddressInItem(String macAddressInItem) {
        if (this.macAddressIn == null) {
            this.macAddressIn = new ArrayList<String>();
        }
        this.macAddressIn.add(macAddressInItem);
        return this;
    }

    /**
     * Get macAddressIn
     *
     * @return macAddressIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMacAddressIn() {
        return macAddressIn;
    }

    public void setMacAddressIn(List<String> macAddressIn) {
        this.macAddressIn = macAddressIn;
    }

    public VmTemplateConfigNicWhereInput macAddressIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_IN);
        return this;
    }

    public void setMacAddressIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_IN);
        }
    }

    public boolean getMacAddressIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_IN);
    }

    public VmTemplateConfigNicWhereInput macAddressLt(String macAddressLt) {

        this.macAddressLt = macAddressLt;
        return this;
    }

    /**
     * Get macAddressLt
     *
     * @return macAddressLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressLt() {
        return macAddressLt;
    }

    public void setMacAddressLt(String macAddressLt) {
        this.macAddressLt = macAddressLt;
    }

    public VmTemplateConfigNicWhereInput macAddressLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LT);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LT);
        return this;
    }

    public void setMacAddressLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LT);
        }
    }

    public boolean getMacAddressLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_LT);
    }

    public VmTemplateConfigNicWhereInput macAddressLte(String macAddressLte) {

        this.macAddressLte = macAddressLte;
        return this;
    }

    /**
     * Get macAddressLte
     *
     * @return macAddressLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressLte() {
        return macAddressLte;
    }

    public void setMacAddressLte(String macAddressLte) {
        this.macAddressLte = macAddressLte;
    }

    public VmTemplateConfigNicWhereInput macAddressLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        return this;
    }

    public void setMacAddressLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_LTE);
        }
    }

    public boolean getMacAddressLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_LTE);
    }

    public VmTemplateConfigNicWhereInput macAddressNot(String macAddressNot) {

        this.macAddressNot = macAddressNot;
        return this;
    }

    /**
     * Get macAddressNot
     *
     * @return macAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNot() {
        return macAddressNot;
    }

    public void setMacAddressNot(String macAddressNot) {
        this.macAddressNot = macAddressNot;
    }

    public VmTemplateConfigNicWhereInput macAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        return this;
    }

    public void setMacAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT);
        }
    }

    public boolean getMacAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT);
    }

    public VmTemplateConfigNicWhereInput macAddressNotContains(String macAddressNotContains) {

        this.macAddressNotContains = macAddressNotContains;
        return this;
    }

    /**
     * Get macAddressNotContains
     *
     * @return macAddressNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNotContains() {
        return macAddressNotContains;
    }

    public void setMacAddressNotContains(String macAddressNotContains) {
        this.macAddressNotContains = macAddressNotContains;
    }

    public VmTemplateConfigNicWhereInput macAddressNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public void setMacAddressNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
        }
    }

    public boolean getMacAddressNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_CONTAINS);
    }

    public VmTemplateConfigNicWhereInput macAddressNotEndsWith(String macAddressNotEndsWith) {

        this.macAddressNotEndsWith = macAddressNotEndsWith;
        return this;
    }

    /**
     * Get macAddressNotEndsWith
     *
     * @return macAddressNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNotEndsWith() {
        return macAddressNotEndsWith;
    }

    public void setMacAddressNotEndsWith(String macAddressNotEndsWith) {
        this.macAddressNotEndsWith = macAddressNotEndsWith;
    }

    public VmTemplateConfigNicWhereInput macAddressNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public void setMacAddressNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
        }
    }

    public boolean getMacAddressNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_ENDS_WITH);
    }

    public VmTemplateConfigNicWhereInput macAddressNotIn(List<String> macAddressNotIn) {

        this.macAddressNotIn = macAddressNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addMacAddressNotInItem(String macAddressNotInItem) {
        if (this.macAddressNotIn == null) {
            this.macAddressNotIn = new ArrayList<String>();
        }
        this.macAddressNotIn.add(macAddressNotInItem);
        return this;
    }

    /**
     * Get macAddressNotIn
     *
     * @return macAddressNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMacAddressNotIn() {
        return macAddressNotIn;
    }

    public void setMacAddressNotIn(List<String> macAddressNotIn) {
        this.macAddressNotIn = macAddressNotIn;
    }

    public VmTemplateConfigNicWhereInput macAddressNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        return this;
    }

    public void setMacAddressNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
        }
    }

    public boolean getMacAddressNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput macAddressNotStartsWith(String macAddressNotStartsWith) {

        this.macAddressNotStartsWith = macAddressNotStartsWith;
        return this;
    }

    /**
     * Get macAddressNotStartsWith
     *
     * @return macAddressNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressNotStartsWith() {
        return macAddressNotStartsWith;
    }

    public void setMacAddressNotStartsWith(String macAddressNotStartsWith) {
        this.macAddressNotStartsWith = macAddressNotStartsWith;
    }

    public VmTemplateConfigNicWhereInput macAddressNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public void setMacAddressNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
        }
    }

    public boolean getMacAddressNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_NOT_STARTS_WITH);
    }

    public VmTemplateConfigNicWhereInput macAddressStartsWith(String macAddressStartsWith) {

        this.macAddressStartsWith = macAddressStartsWith;
        return this;
    }

    /**
     * Get macAddressStartsWith
     *
     * @return macAddressStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddressStartsWith() {
        return macAddressStartsWith;
    }

    public void setMacAddressStartsWith(String macAddressStartsWith) {
        this.macAddressStartsWith = macAddressStartsWith;
    }

    public VmTemplateConfigNicWhereInput macAddressStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        return this;
    }

    public VmTemplateConfigNicWhereInput macAddressStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        return this;
    }

    public void setMacAddressStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
        }
    }

    public boolean getMacAddressStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS_STARTS_WITH);
    }

    public VmTemplateConfigNicWhereInput mirror(Boolean mirror) {

        this.mirror = mirror;
        return this;
    }

    /**
     * Get mirror
     *
     * @return mirror
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public VmTemplateConfigNicWhereInput mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public VmTemplateConfigNicWhereInput mirror_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public void setMirror_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        }
    }

    public boolean getMirror_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR);
    }

    public VmTemplateConfigNicWhereInput mirrorNot(Boolean mirrorNot) {

        this.mirrorNot = mirrorNot;
        return this;
    }

    /**
     * Get mirrorNot
     *
     * @return mirrorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirrorNot() {
        return mirrorNot;
    }

    public void setMirrorNot(Boolean mirrorNot) {
        this.mirrorNot = mirrorNot;
    }

    public VmTemplateConfigNicWhereInput mirrorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput mirrorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR_NOT);
        return this;
    }

    public void setMirrorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR_NOT);
        }
    }

    public boolean getMirrorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR_NOT);
    }

    public VmTemplateConfigNicWhereInput model(VmNicModel model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicModel getModel() {
        return model;
    }

    public void setModel(VmNicModel model) {
        this.model = model;
    }

    public VmTemplateConfigNicWhereInput model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public VmTemplateConfigNicWhereInput model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public VmTemplateConfigNicWhereInput modelIn(List<VmNicModel> modelIn) {

        this.modelIn = modelIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addModelInItem(VmNicModel modelInItem) {
        if (this.modelIn == null) {
            this.modelIn = new ArrayList<VmNicModel>();
        }
        this.modelIn.add(modelInItem);
        return this;
    }

    /**
     * Get modelIn
     *
     * @return modelIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmNicModel> getModelIn() {
        return modelIn;
    }

    public void setModelIn(List<VmNicModel> modelIn) {
        this.modelIn = modelIn;
    }

    public VmTemplateConfigNicWhereInput modelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput modelIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public void setModelIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        }
    }

    public boolean getModelIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_IN);
    }

    public VmTemplateConfigNicWhereInput modelNot(VmNicModel modelNot) {

        this.modelNot = modelNot;
        return this;
    }

    /**
     * Get modelNot
     *
     * @return modelNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicModel getModelNot() {
        return modelNot;
    }

    public void setModelNot(VmNicModel modelNot) {
        this.modelNot = modelNot;
    }

    public VmTemplateConfigNicWhereInput modelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput modelNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public void setModelNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        }
    }

    public boolean getModelNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT);
    }

    public VmTemplateConfigNicWhereInput modelNotIn(List<VmNicModel> modelNotIn) {

        this.modelNotIn = modelNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addModelNotInItem(VmNicModel modelNotInItem) {
        if (this.modelNotIn == null) {
            this.modelNotIn = new ArrayList<VmNicModel>();
        }
        this.modelNotIn.add(modelNotInItem);
        return this;
    }

    /**
     * Get modelNotIn
     *
     * @return modelNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmNicModel> getModelNotIn() {
        return modelNotIn;
    }

    public void setModelNotIn(List<VmNicModel> modelNotIn) {
        this.modelNotIn = modelNotIn;
    }

    public VmTemplateConfigNicWhereInput modelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput modelNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public void setModelNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        }
    }

    public boolean getModelNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput type(VmNicType type) {

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
    public VmNicType getType() {
        return type;
    }

    public void setType(VmNicType type) {
        this.type = type;
    }

    public VmTemplateConfigNicWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmTemplateConfigNicWhereInput type_ExplictlyNonNull() {
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

    public VmTemplateConfigNicWhereInput typeIn(List<VmNicType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addTypeInItem(VmNicType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<VmNicType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmNicType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<VmNicType> typeIn) {
        this.typeIn = typeIn;
    }

    public VmTemplateConfigNicWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public VmTemplateConfigNicWhereInput typeNot(VmNicType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(VmNicType typeNot) {
        this.typeNot = typeNot;
    }

    public VmTemplateConfigNicWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmTemplateConfigNicWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public VmTemplateConfigNicWhereInput typeNotIn(List<VmNicType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmTemplateConfigNicWhereInput addTypeNotInItem(VmNicType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<VmNicType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmNicType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<VmNicType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VmTemplateConfigNicWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmTemplateConfigNicWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    public VmTemplateConfigNicWhereInput vmTemplateConfig(
            VmTemplateConfigWhereInput vmTemplateConfig) {

        this.vmTemplateConfig = vmTemplateConfig;
        return this;
    }

    /**
     * Get vmTemplateConfig
     *
     * @return vmTemplateConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateConfigWhereInput getVmTemplateConfig() {
        return vmTemplateConfig;
    }

    public void setVmTemplateConfig(VmTemplateConfigWhereInput vmTemplateConfig) {
        this.vmTemplateConfig = vmTemplateConfig;
    }

    public VmTemplateConfigNicWhereInput vmTemplateConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        return this;
    }

    public VmTemplateConfigNicWhereInput vmTemplateConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        return this;
    }

    public void setVmTemplateConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
        }
    }

    public boolean getVmTemplateConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATE_CONFIG);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmTemplateConfigNicWhereInput vmTemplateConfigNicWhereInput =
                (VmTemplateConfigNicWhereInput) o;
        return Objects.equals(this.AND, vmTemplateConfigNicWhereInput.AND)
                && Objects.equals(this.NOT, vmTemplateConfigNicWhereInput.NOT)
                && Objects.equals(this.OR, vmTemplateConfigNicWhereInput.OR)
                && Objects.equals(
                        this.egressRateLimitBurstInBit,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBit)
                && Objects.equals(
                        this.egressRateLimitBurstInBitGt,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBitGt)
                && Objects.equals(
                        this.egressRateLimitBurstInBitGte,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBitGte)
                && Objects.equals(
                        this.egressRateLimitBurstInBitIn,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBitIn)
                && Objects.equals(
                        this.egressRateLimitBurstInBitLt,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBitLt)
                && Objects.equals(
                        this.egressRateLimitBurstInBitLte,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBitLte)
                && Objects.equals(
                        this.egressRateLimitBurstInBitNot,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBitNot)
                && Objects.equals(
                        this.egressRateLimitBurstInBitNotIn,
                        vmTemplateConfigNicWhereInput.egressRateLimitBurstInBitNotIn)
                && Objects.equals(
                        this.egressRateLimitEnabled,
                        vmTemplateConfigNicWhereInput.egressRateLimitEnabled)
                && Objects.equals(
                        this.egressRateLimitEnabledNot,
                        vmTemplateConfigNicWhereInput.egressRateLimitEnabledNot)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitps,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitps)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsGt,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitpsGt)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsGte,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitpsGte)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsIn,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitpsIn)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsLt,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitpsLt)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsLte,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitpsLte)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsNot,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitpsNot)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitpsNotIn,
                        vmTemplateConfigNicWhereInput.egressRateLimitMaxRateInBitpsNotIn)
                && Objects.equals(this.enabled, vmTemplateConfigNicWhereInput.enabled)
                && Objects.equals(this.enabledNot, vmTemplateConfigNicWhereInput.enabledNot)
                && Objects.equals(this.id, vmTemplateConfigNicWhereInput.id)
                && Objects.equals(this.idContains, vmTemplateConfigNicWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmTemplateConfigNicWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmTemplateConfigNicWhereInput.idGt)
                && Objects.equals(this.idGte, vmTemplateConfigNicWhereInput.idGte)
                && Objects.equals(this.idIn, vmTemplateConfigNicWhereInput.idIn)
                && Objects.equals(this.idLt, vmTemplateConfigNicWhereInput.idLt)
                && Objects.equals(this.idLte, vmTemplateConfigNicWhereInput.idLte)
                && Objects.equals(this.idNot, vmTemplateConfigNicWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmTemplateConfigNicWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmTemplateConfigNicWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmTemplateConfigNicWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, vmTemplateConfigNicWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmTemplateConfigNicWhereInput.idStartsWith)
                && Objects.equals(this.index, vmTemplateConfigNicWhereInput.index)
                && Objects.equals(this.indexGt, vmTemplateConfigNicWhereInput.indexGt)
                && Objects.equals(this.indexGte, vmTemplateConfigNicWhereInput.indexGte)
                && Objects.equals(this.indexIn, vmTemplateConfigNicWhereInput.indexIn)
                && Objects.equals(this.indexLt, vmTemplateConfigNicWhereInput.indexLt)
                && Objects.equals(this.indexLte, vmTemplateConfigNicWhereInput.indexLte)
                && Objects.equals(this.indexNot, vmTemplateConfigNicWhereInput.indexNot)
                && Objects.equals(this.indexNotIn, vmTemplateConfigNicWhereInput.indexNotIn)
                && Objects.equals(
                        this.ingressRateLimitBurstInBit,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBit)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitGt,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBitGt)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitGte,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBitGte)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitIn,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBitIn)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitLt,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBitLt)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitLte,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBitLte)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitNot,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBitNot)
                && Objects.equals(
                        this.ingressRateLimitBurstInBitNotIn,
                        vmTemplateConfigNicWhereInput.ingressRateLimitBurstInBitNotIn)
                && Objects.equals(
                        this.ingressRateLimitEnabled,
                        vmTemplateConfigNicWhereInput.ingressRateLimitEnabled)
                && Objects.equals(
                        this.ingressRateLimitEnabledNot,
                        vmTemplateConfigNicWhereInput.ingressRateLimitEnabledNot)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitps,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitps)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsGt,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitpsGt)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsGte,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitpsGte)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsIn,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitpsIn)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsLt,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitpsLt)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsLte,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitpsLte)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsNot,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitpsNot)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitpsNotIn,
                        vmTemplateConfigNicWhereInput.ingressRateLimitMaxRateInBitpsNotIn)
                && Objects.equals(this.ipAddress, vmTemplateConfigNicWhereInput.ipAddress)
                && Objects.equals(
                        this.ipAddressContains, vmTemplateConfigNicWhereInput.ipAddressContains)
                && Objects.equals(
                        this.ipAddressEndsWith, vmTemplateConfigNicWhereInput.ipAddressEndsWith)
                && Objects.equals(this.ipAddressGt, vmTemplateConfigNicWhereInput.ipAddressGt)
                && Objects.equals(this.ipAddressGte, vmTemplateConfigNicWhereInput.ipAddressGte)
                && Objects.equals(this.ipAddressIn, vmTemplateConfigNicWhereInput.ipAddressIn)
                && Objects.equals(this.ipAddressLt, vmTemplateConfigNicWhereInput.ipAddressLt)
                && Objects.equals(this.ipAddressLte, vmTemplateConfigNicWhereInput.ipAddressLte)
                && Objects.equals(this.ipAddressNot, vmTemplateConfigNicWhereInput.ipAddressNot)
                && Objects.equals(
                        this.ipAddressNotContains,
                        vmTemplateConfigNicWhereInput.ipAddressNotContains)
                && Objects.equals(
                        this.ipAddressNotEndsWith,
                        vmTemplateConfigNicWhereInput.ipAddressNotEndsWith)
                && Objects.equals(this.ipAddressNotIn, vmTemplateConfigNicWhereInput.ipAddressNotIn)
                && Objects.equals(
                        this.ipAddressNotStartsWith,
                        vmTemplateConfigNicWhereInput.ipAddressNotStartsWith)
                && Objects.equals(
                        this.ipAddressStartsWith, vmTemplateConfigNicWhereInput.ipAddressStartsWith)
                && Objects.equals(this.macAddress, vmTemplateConfigNicWhereInput.macAddress)
                && Objects.equals(
                        this.macAddressContains, vmTemplateConfigNicWhereInput.macAddressContains)
                && Objects.equals(
                        this.macAddressEndsWith, vmTemplateConfigNicWhereInput.macAddressEndsWith)
                && Objects.equals(this.macAddressGt, vmTemplateConfigNicWhereInput.macAddressGt)
                && Objects.equals(this.macAddressGte, vmTemplateConfigNicWhereInput.macAddressGte)
                && Objects.equals(this.macAddressIn, vmTemplateConfigNicWhereInput.macAddressIn)
                && Objects.equals(this.macAddressLt, vmTemplateConfigNicWhereInput.macAddressLt)
                && Objects.equals(this.macAddressLte, vmTemplateConfigNicWhereInput.macAddressLte)
                && Objects.equals(this.macAddressNot, vmTemplateConfigNicWhereInput.macAddressNot)
                && Objects.equals(
                        this.macAddressNotContains,
                        vmTemplateConfigNicWhereInput.macAddressNotContains)
                && Objects.equals(
                        this.macAddressNotEndsWith,
                        vmTemplateConfigNicWhereInput.macAddressNotEndsWith)
                && Objects.equals(
                        this.macAddressNotIn, vmTemplateConfigNicWhereInput.macAddressNotIn)
                && Objects.equals(
                        this.macAddressNotStartsWith,
                        vmTemplateConfigNicWhereInput.macAddressNotStartsWith)
                && Objects.equals(
                        this.macAddressStartsWith,
                        vmTemplateConfigNicWhereInput.macAddressStartsWith)
                && Objects.equals(this.mirror, vmTemplateConfigNicWhereInput.mirror)
                && Objects.equals(this.mirrorNot, vmTemplateConfigNicWhereInput.mirrorNot)
                && Objects.equals(this.model, vmTemplateConfigNicWhereInput.model)
                && Objects.equals(this.modelIn, vmTemplateConfigNicWhereInput.modelIn)
                && Objects.equals(this.modelNot, vmTemplateConfigNicWhereInput.modelNot)
                && Objects.equals(this.modelNotIn, vmTemplateConfigNicWhereInput.modelNotIn)
                && Objects.equals(this.type, vmTemplateConfigNicWhereInput.type)
                && Objects.equals(this.typeIn, vmTemplateConfigNicWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmTemplateConfigNicWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmTemplateConfigNicWhereInput.typeNotIn)
                && Objects.equals(
                        this.vmTemplateConfig, vmTemplateConfigNicWhereInput.vmTemplateConfig);
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
                AND,
                NOT,
                OR,
                egressRateLimitBurstInBit,
                egressRateLimitBurstInBitGt,
                egressRateLimitBurstInBitGte,
                egressRateLimitBurstInBitIn,
                egressRateLimitBurstInBitLt,
                egressRateLimitBurstInBitLte,
                egressRateLimitBurstInBitNot,
                egressRateLimitBurstInBitNotIn,
                egressRateLimitEnabled,
                egressRateLimitEnabledNot,
                egressRateLimitMaxRateInBitps,
                egressRateLimitMaxRateInBitpsGt,
                egressRateLimitMaxRateInBitpsGte,
                egressRateLimitMaxRateInBitpsIn,
                egressRateLimitMaxRateInBitpsLt,
                egressRateLimitMaxRateInBitpsLte,
                egressRateLimitMaxRateInBitpsNot,
                egressRateLimitMaxRateInBitpsNotIn,
                enabled,
                enabledNot,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                index,
                indexGt,
                indexGte,
                indexIn,
                indexLt,
                indexLte,
                indexNot,
                indexNotIn,
                ingressRateLimitBurstInBit,
                ingressRateLimitBurstInBitGt,
                ingressRateLimitBurstInBitGte,
                ingressRateLimitBurstInBitIn,
                ingressRateLimitBurstInBitLt,
                ingressRateLimitBurstInBitLte,
                ingressRateLimitBurstInBitNot,
                ingressRateLimitBurstInBitNotIn,
                ingressRateLimitEnabled,
                ingressRateLimitEnabledNot,
                ingressRateLimitMaxRateInBitps,
                ingressRateLimitMaxRateInBitpsGt,
                ingressRateLimitMaxRateInBitpsGte,
                ingressRateLimitMaxRateInBitpsIn,
                ingressRateLimitMaxRateInBitpsLt,
                ingressRateLimitMaxRateInBitpsLte,
                ingressRateLimitMaxRateInBitpsNot,
                ingressRateLimitMaxRateInBitpsNotIn,
                ipAddress,
                ipAddressContains,
                ipAddressEndsWith,
                ipAddressGt,
                ipAddressGte,
                ipAddressIn,
                ipAddressLt,
                ipAddressLte,
                ipAddressNot,
                ipAddressNotContains,
                ipAddressNotEndsWith,
                ipAddressNotIn,
                ipAddressNotStartsWith,
                ipAddressStartsWith,
                macAddress,
                macAddressContains,
                macAddressEndsWith,
                macAddressGt,
                macAddressGte,
                macAddressIn,
                macAddressLt,
                macAddressLte,
                macAddressNot,
                macAddressNotContains,
                macAddressNotEndsWith,
                macAddressNotIn,
                macAddressNotStartsWith,
                macAddressStartsWith,
                mirror,
                mirrorNot,
                model,
                modelIn,
                modelNot,
                modelNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vmTemplateConfig);
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
        sb.append("class VmTemplateConfigNicWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    egressRateLimitBurstInBit: ")
                .append(toIndentedString(egressRateLimitBurstInBit))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitGt: ")
                .append(toIndentedString(egressRateLimitBurstInBitGt))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitGte: ")
                .append(toIndentedString(egressRateLimitBurstInBitGte))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitIn: ")
                .append(toIndentedString(egressRateLimitBurstInBitIn))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitLt: ")
                .append(toIndentedString(egressRateLimitBurstInBitLt))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitLte: ")
                .append(toIndentedString(egressRateLimitBurstInBitLte))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitNot: ")
                .append(toIndentedString(egressRateLimitBurstInBitNot))
                .append("\n");
        sb.append("    egressRateLimitBurstInBitNotIn: ")
                .append(toIndentedString(egressRateLimitBurstInBitNotIn))
                .append("\n");
        sb.append("    egressRateLimitEnabled: ")
                .append(toIndentedString(egressRateLimitEnabled))
                .append("\n");
        sb.append("    egressRateLimitEnabledNot: ")
                .append(toIndentedString(egressRateLimitEnabledNot))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsGt: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsGt))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsGte: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsGte))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsIn: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsIn))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsLt: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsLt))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsLte: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsLte))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsNot: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsNot))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitpsNotIn: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitpsNotIn))
                .append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    enabledNot: ").append(toIndentedString(enabledNot)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    indexGt: ").append(toIndentedString(indexGt)).append("\n");
        sb.append("    indexGte: ").append(toIndentedString(indexGte)).append("\n");
        sb.append("    indexIn: ").append(toIndentedString(indexIn)).append("\n");
        sb.append("    indexLt: ").append(toIndentedString(indexLt)).append("\n");
        sb.append("    indexLte: ").append(toIndentedString(indexLte)).append("\n");
        sb.append("    indexNot: ").append(toIndentedString(indexNot)).append("\n");
        sb.append("    indexNotIn: ").append(toIndentedString(indexNotIn)).append("\n");
        sb.append("    ingressRateLimitBurstInBit: ")
                .append(toIndentedString(ingressRateLimitBurstInBit))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitGt: ")
                .append(toIndentedString(ingressRateLimitBurstInBitGt))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitGte: ")
                .append(toIndentedString(ingressRateLimitBurstInBitGte))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitIn: ")
                .append(toIndentedString(ingressRateLimitBurstInBitIn))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitLt: ")
                .append(toIndentedString(ingressRateLimitBurstInBitLt))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitLte: ")
                .append(toIndentedString(ingressRateLimitBurstInBitLte))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitNot: ")
                .append(toIndentedString(ingressRateLimitBurstInBitNot))
                .append("\n");
        sb.append("    ingressRateLimitBurstInBitNotIn: ")
                .append(toIndentedString(ingressRateLimitBurstInBitNotIn))
                .append("\n");
        sb.append("    ingressRateLimitEnabled: ")
                .append(toIndentedString(ingressRateLimitEnabled))
                .append("\n");
        sb.append("    ingressRateLimitEnabledNot: ")
                .append(toIndentedString(ingressRateLimitEnabledNot))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsGt: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsGt))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsGte: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsGte))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsIn: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsIn))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsLt: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsLt))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsLte: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsLte))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsNot: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsNot))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitpsNotIn: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitpsNotIn))
                .append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipAddressContains: ")
                .append(toIndentedString(ipAddressContains))
                .append("\n");
        sb.append("    ipAddressEndsWith: ")
                .append(toIndentedString(ipAddressEndsWith))
                .append("\n");
        sb.append("    ipAddressGt: ").append(toIndentedString(ipAddressGt)).append("\n");
        sb.append("    ipAddressGte: ").append(toIndentedString(ipAddressGte)).append("\n");
        sb.append("    ipAddressIn: ").append(toIndentedString(ipAddressIn)).append("\n");
        sb.append("    ipAddressLt: ").append(toIndentedString(ipAddressLt)).append("\n");
        sb.append("    ipAddressLte: ").append(toIndentedString(ipAddressLte)).append("\n");
        sb.append("    ipAddressNot: ").append(toIndentedString(ipAddressNot)).append("\n");
        sb.append("    ipAddressNotContains: ")
                .append(toIndentedString(ipAddressNotContains))
                .append("\n");
        sb.append("    ipAddressNotEndsWith: ")
                .append(toIndentedString(ipAddressNotEndsWith))
                .append("\n");
        sb.append("    ipAddressNotIn: ").append(toIndentedString(ipAddressNotIn)).append("\n");
        sb.append("    ipAddressNotStartsWith: ")
                .append(toIndentedString(ipAddressNotStartsWith))
                .append("\n");
        sb.append("    ipAddressStartsWith: ")
                .append(toIndentedString(ipAddressStartsWith))
                .append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    macAddressContains: ")
                .append(toIndentedString(macAddressContains))
                .append("\n");
        sb.append("    macAddressEndsWith: ")
                .append(toIndentedString(macAddressEndsWith))
                .append("\n");
        sb.append("    macAddressGt: ").append(toIndentedString(macAddressGt)).append("\n");
        sb.append("    macAddressGte: ").append(toIndentedString(macAddressGte)).append("\n");
        sb.append("    macAddressIn: ").append(toIndentedString(macAddressIn)).append("\n");
        sb.append("    macAddressLt: ").append(toIndentedString(macAddressLt)).append("\n");
        sb.append("    macAddressLte: ").append(toIndentedString(macAddressLte)).append("\n");
        sb.append("    macAddressNot: ").append(toIndentedString(macAddressNot)).append("\n");
        sb.append("    macAddressNotContains: ")
                .append(toIndentedString(macAddressNotContains))
                .append("\n");
        sb.append("    macAddressNotEndsWith: ")
                .append(toIndentedString(macAddressNotEndsWith))
                .append("\n");
        sb.append("    macAddressNotIn: ").append(toIndentedString(macAddressNotIn)).append("\n");
        sb.append("    macAddressNotStartsWith: ")
                .append(toIndentedString(macAddressNotStartsWith))
                .append("\n");
        sb.append("    macAddressStartsWith: ")
                .append(toIndentedString(macAddressStartsWith))
                .append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    mirrorNot: ").append(toIndentedString(mirrorNot)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    modelIn: ").append(toIndentedString(modelIn)).append("\n");
        sb.append("    modelNot: ").append(toIndentedString(modelNot)).append("\n");
        sb.append("    modelNotIn: ").append(toIndentedString(modelNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vmTemplateConfig: ").append(toIndentedString(vmTemplateConfig)).append("\n");
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
