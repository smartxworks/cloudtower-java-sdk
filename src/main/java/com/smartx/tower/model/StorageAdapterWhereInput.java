package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** StorageAdapterWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class StorageAdapterWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<StorageAdapterWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<StorageAdapterWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<StorageAdapterWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ALIAS_NAME = "alias_name";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME)
    private String aliasName;

    public static final String SERIALIZED_NAME_ALIAS_NAME_CONTAINS = "alias_name_contains";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_CONTAINS)
    private String aliasNameContains;

    public static final String SERIALIZED_NAME_ALIAS_NAME_ENDS_WITH = "alias_name_ends_with";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_ENDS_WITH)
    private String aliasNameEndsWith;

    public static final String SERIALIZED_NAME_ALIAS_NAME_GT = "alias_name_gt";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_GT)
    private String aliasNameGt;

    public static final String SERIALIZED_NAME_ALIAS_NAME_GTE = "alias_name_gte";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_GTE)
    private String aliasNameGte;

    public static final String SERIALIZED_NAME_ALIAS_NAME_IN = "alias_name_in";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_IN)
    private List<String> aliasNameIn = null;

    public static final String SERIALIZED_NAME_ALIAS_NAME_LT = "alias_name_lt";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_LT)
    private String aliasNameLt;

    public static final String SERIALIZED_NAME_ALIAS_NAME_LTE = "alias_name_lte";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_LTE)
    private String aliasNameLte;

    public static final String SERIALIZED_NAME_ALIAS_NAME_NOT = "alias_name_not";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_NOT)
    private String aliasNameNot;

    public static final String SERIALIZED_NAME_ALIAS_NAME_NOT_CONTAINS = "alias_name_not_contains";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_NOT_CONTAINS)
    private String aliasNameNotContains;

    public static final String SERIALIZED_NAME_ALIAS_NAME_NOT_ENDS_WITH =
            "alias_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_NOT_ENDS_WITH)
    private String aliasNameNotEndsWith;

    public static final String SERIALIZED_NAME_ALIAS_NAME_NOT_IN = "alias_name_not_in";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_NOT_IN)
    private List<String> aliasNameNotIn = null;

    public static final String SERIALIZED_NAME_ALIAS_NAME_NOT_STARTS_WITH =
            "alias_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_NOT_STARTS_WITH)
    private String aliasNameNotStartsWith;

    public static final String SERIALIZED_NAME_ALIAS_NAME_STARTS_WITH = "alias_name_starts_with";

    @SerializedName(SERIALIZED_NAME_ALIAS_NAME_STARTS_WITH)
    private String aliasNameStartsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD = "chap_password";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD)
    private String chapPassword;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS = "chap_password_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS)
    private String chapPasswordContains;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH = "chap_password_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH)
    private String chapPasswordEndsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_GT = "chap_password_gt";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_GT)
    private String chapPasswordGt;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_GTE = "chap_password_gte";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_GTE)
    private String chapPasswordGte;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_IN = "chap_password_in";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_IN)
    private List<String> chapPasswordIn = null;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT = "chap_password_input";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT)
    private String chapPasswordInput;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS =
            "chap_password_input_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS)
    private String chapPasswordInputContains;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH =
            "chap_password_input_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH)
    private String chapPasswordInputEndsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT = "chap_password_input_gt";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT)
    private String chapPasswordInputGt;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE = "chap_password_input_gte";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE)
    private String chapPasswordInputGte;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN = "chap_password_input_in";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN)
    private List<String> chapPasswordInputIn = null;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT = "chap_password_input_lt";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT)
    private String chapPasswordInputLt;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE = "chap_password_input_lte";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE)
    private String chapPasswordInputLte;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT = "chap_password_input_not";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT)
    private String chapPasswordInputNot;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS =
            "chap_password_input_not_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS)
    private String chapPasswordInputNotContains;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH =
            "chap_password_input_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH)
    private String chapPasswordInputNotEndsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN =
            "chap_password_input_not_in";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN)
    private List<String> chapPasswordInputNotIn = null;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH =
            "chap_password_input_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH)
    private String chapPasswordInputNotStartsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH =
            "chap_password_input_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH)
    private String chapPasswordInputStartsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_LT = "chap_password_lt";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_LT)
    private String chapPasswordLt;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_LTE = "chap_password_lte";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_LTE)
    private String chapPasswordLte;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_NOT = "chap_password_not";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_NOT)
    private String chapPasswordNot;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS =
            "chap_password_not_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS)
    private String chapPasswordNotContains;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH =
            "chap_password_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH)
    private String chapPasswordNotEndsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN = "chap_password_not_in";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN)
    private List<String> chapPasswordNotIn = null;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH =
            "chap_password_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH)
    private String chapPasswordNotStartsWith;

    public static final String SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH =
            "chap_password_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH)
    private String chapPasswordStartsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME = "chap_username";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME)
    private String chapUsername;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_CONTAINS = "chap_username_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_CONTAINS)
    private String chapUsernameContains;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH = "chap_username_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH)
    private String chapUsernameEndsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_GT = "chap_username_gt";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_GT)
    private String chapUsernameGt;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_GTE = "chap_username_gte";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_GTE)
    private String chapUsernameGte;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_IN = "chap_username_in";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_IN)
    private List<String> chapUsernameIn = null;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT = "chap_username_input";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT)
    private String chapUsernameInput;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS =
            "chap_username_input_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS)
    private String chapUsernameInputContains;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH =
            "chap_username_input_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH)
    private String chapUsernameInputEndsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT = "chap_username_input_gt";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT)
    private String chapUsernameInputGt;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE = "chap_username_input_gte";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE)
    private String chapUsernameInputGte;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN = "chap_username_input_in";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN)
    private List<String> chapUsernameInputIn = null;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT = "chap_username_input_lt";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT)
    private String chapUsernameInputLt;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE = "chap_username_input_lte";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE)
    private String chapUsernameInputLte;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT = "chap_username_input_not";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT)
    private String chapUsernameInputNot;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS =
            "chap_username_input_not_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS)
    private String chapUsernameInputNotContains;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH =
            "chap_username_input_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH)
    private String chapUsernameInputNotEndsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN =
            "chap_username_input_not_in";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN)
    private List<String> chapUsernameInputNotIn = null;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH =
            "chap_username_input_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH)
    private String chapUsernameInputNotStartsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH =
            "chap_username_input_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH)
    private String chapUsernameInputStartsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_LT = "chap_username_lt";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_LT)
    private String chapUsernameLt;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_LTE = "chap_username_lte";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_LTE)
    private String chapUsernameLte;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_NOT = "chap_username_not";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_NOT)
    private String chapUsernameNot;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS =
            "chap_username_not_contains";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS)
    private String chapUsernameNotContains;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH =
            "chap_username_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH)
    private String chapUsernameNotEndsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_NOT_IN = "chap_username_not_in";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_NOT_IN)
    private List<String> chapUsernameNotIn = null;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH =
            "chap_username_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH)
    private String chapUsernameNotStartsWith;

    public static final String SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH =
            "chap_username_starts_with";

    @SerializedName(SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH)
    private String chapUsernameStartsWith;

    public static final String SERIALIZED_NAME_DATA_VERSION = "data_version";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION)
    private Integer dataVersion;

    public static final String SERIALIZED_NAME_DATA_VERSION_GT = "data_version_gt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GT)
    private Integer dataVersionGt;

    public static final String SERIALIZED_NAME_DATA_VERSION_GTE = "data_version_gte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GTE)
    private Integer dataVersionGte;

    public static final String SERIALIZED_NAME_DATA_VERSION_IN = "data_version_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_IN)
    private List<Integer> dataVersionIn = null;

    public static final String SERIALIZED_NAME_DATA_VERSION_LT = "data_version_lt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LT)
    private Integer dataVersionLt;

    public static final String SERIALIZED_NAME_DATA_VERSION_LTE = "data_version_lte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LTE)
    private Integer dataVersionLte;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT = "data_version_not";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT)
    private Integer dataVersionNot;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT_IN = "data_version_not_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT_IN)
    private List<Integer> dataVersionNotIn = null;

    public static final String SERIALIZED_NAME_DEVICE_NUM = "device_num";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM)
    private Integer deviceNum;

    public static final String SERIALIZED_NAME_DEVICE_NUM_GT = "device_num_gt";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM_GT)
    private Integer deviceNumGt;

    public static final String SERIALIZED_NAME_DEVICE_NUM_GTE = "device_num_gte";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM_GTE)
    private Integer deviceNumGte;

    public static final String SERIALIZED_NAME_DEVICE_NUM_IN = "device_num_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM_IN)
    private List<Integer> deviceNumIn = null;

    public static final String SERIALIZED_NAME_DEVICE_NUM_LT = "device_num_lt";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM_LT)
    private Integer deviceNumLt;

    public static final String SERIALIZED_NAME_DEVICE_NUM_LTE = "device_num_lte";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM_LTE)
    private Integer deviceNumLte;

    public static final String SERIALIZED_NAME_DEVICE_NUM_NOT = "device_num_not";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM_NOT)
    private Integer deviceNumNot;

    public static final String SERIALIZED_NAME_DEVICE_NUM_NOT_IN = "device_num_not_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUM_NOT_IN)
    private List<Integer> deviceNumNotIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION = "firmware_version";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION)
    private String firmwareVersion;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_CONTAINS =
            "firmware_version_contains";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_CONTAINS)
    private String firmwareVersionContains;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_ENDS_WITH =
            "firmware_version_ends_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_ENDS_WITH)
    private String firmwareVersionEndsWith;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_GT = "firmware_version_gt";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_GT)
    private String firmwareVersionGt;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_GTE = "firmware_version_gte";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_GTE)
    private String firmwareVersionGte;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_IN = "firmware_version_in";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_IN)
    private List<String> firmwareVersionIn = null;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_LT = "firmware_version_lt";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_LT)
    private String firmwareVersionLt;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_LTE = "firmware_version_lte";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_LTE)
    private String firmwareVersionLte;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_NOT = "firmware_version_not";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_NOT)
    private String firmwareVersionNot;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_NOT_CONTAINS =
            "firmware_version_not_contains";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_CONTAINS)
    private String firmwareVersionNotContains;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_NOT_ENDS_WITH =
            "firmware_version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_ENDS_WITH)
    private String firmwareVersionNotEndsWith;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_NOT_IN = "firmware_version_not_in";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_IN)
    private List<String> firmwareVersionNotIn = null;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_NOT_STARTS_WITH =
            "firmware_version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_STARTS_WITH)
    private String firmwareVersionNotStartsWith;

    public static final String SERIALIZED_NAME_FIRMWARE_VERSION_STARTS_WITH =
            "firmware_version_starts_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION_STARTS_WITH)
    private String firmwareVersionStartsWith;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private HostWhereInput host;

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

    public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER)
    private String identifier;

    public static final String SERIALIZED_NAME_IDENTIFIER_CONTAINS = "identifier_contains";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_CONTAINS)
    private String identifierContains;

    public static final String SERIALIZED_NAME_IDENTIFIER_ENDS_WITH = "identifier_ends_with";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_ENDS_WITH)
    private String identifierEndsWith;

    public static final String SERIALIZED_NAME_IDENTIFIER_GT = "identifier_gt";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_GT)
    private String identifierGt;

    public static final String SERIALIZED_NAME_IDENTIFIER_GTE = "identifier_gte";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_GTE)
    private String identifierGte;

    public static final String SERIALIZED_NAME_IDENTIFIER_IN = "identifier_in";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_IN)
    private List<String> identifierIn = null;

    public static final String SERIALIZED_NAME_IDENTIFIER_LT = "identifier_lt";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_LT)
    private String identifierLt;

    public static final String SERIALIZED_NAME_IDENTIFIER_LTE = "identifier_lte";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_LTE)
    private String identifierLte;

    public static final String SERIALIZED_NAME_IDENTIFIER_NOT = "identifier_not";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_NOT)
    private String identifierNot;

    public static final String SERIALIZED_NAME_IDENTIFIER_NOT_CONTAINS = "identifier_not_contains";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_NOT_CONTAINS)
    private String identifierNotContains;

    public static final String SERIALIZED_NAME_IDENTIFIER_NOT_ENDS_WITH =
            "identifier_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_NOT_ENDS_WITH)
    private String identifierNotEndsWith;

    public static final String SERIALIZED_NAME_IDENTIFIER_NOT_IN = "identifier_not_in";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_NOT_IN)
    private List<String> identifierNotIn = null;

    public static final String SERIALIZED_NAME_IDENTIFIER_NOT_STARTS_WITH =
            "identifier_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_NOT_STARTS_WITH)
    private String identifierNotStartsWith;

    public static final String SERIALIZED_NAME_IDENTIFIER_STARTS_WITH = "identifier_starts_with";

    @SerializedName(SERIALIZED_NAME_IDENTIFIER_STARTS_WITH)
    private String identifierStartsWith;

    public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD =
            "identity_verification_method";

    @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD)
    private IdentityVerificationMethod identityVerificationMethod;

    public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN =
            "identity_verification_method_in";

    @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN)
    private List<IdentityVerificationMethod> identityVerificationMethodIn = null;

    public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT =
            "identity_verification_method_not";

    @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT)
    private IdentityVerificationMethod identityVerificationMethodNot;

    public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN =
            "identity_verification_method_not_in";

    @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN)
    private List<IdentityVerificationMethod> identityVerificationMethodNotIn = null;

    public static final String SERIALIZED_NAME_INITIATOR_NAME = "initiator_name";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME)
    private String initiatorName;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_CONTAINS = "initiator_name_contains";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_CONTAINS)
    private String initiatorNameContains;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_ENDS_WITH =
            "initiator_name_ends_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_ENDS_WITH)
    private String initiatorNameEndsWith;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_GT = "initiator_name_gt";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_GT)
    private String initiatorNameGt;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_GTE = "initiator_name_gte";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_GTE)
    private String initiatorNameGte;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_IN = "initiator_name_in";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_IN)
    private List<String> initiatorNameIn = null;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_LT = "initiator_name_lt";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_LT)
    private String initiatorNameLt;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_LTE = "initiator_name_lte";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_LTE)
    private String initiatorNameLte;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_NOT = "initiator_name_not";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_NOT)
    private String initiatorNameNot;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_NOT_CONTAINS =
            "initiator_name_not_contains";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_NOT_CONTAINS)
    private String initiatorNameNotContains;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_NOT_ENDS_WITH =
            "initiator_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_NOT_ENDS_WITH)
    private String initiatorNameNotEndsWith;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_NOT_IN = "initiator_name_not_in";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_NOT_IN)
    private List<String> initiatorNameNotIn = null;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_NOT_STARTS_WITH =
            "initiator_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_NOT_STARTS_WITH)
    private String initiatorNameNotStartsWith;

    public static final String SERIALIZED_NAME_INITIATOR_NAME_STARTS_WITH =
            "initiator_name_starts_with";

    @SerializedName(SERIALIZED_NAME_INITIATOR_NAME_STARTS_WITH)
    private String initiatorNameStartsWith;

    public static final String SERIALIZED_NAME_IS_SOFTWARE = "is_software";

    @SerializedName(SERIALIZED_NAME_IS_SOFTWARE)
    private Boolean isSoftware;

    public static final String SERIALIZED_NAME_IS_SOFTWARE_NOT = "is_software_not";

    @SerializedName(SERIALIZED_NAME_IS_SOFTWARE_NOT)
    private Boolean isSoftwareNot;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
    private String localCreatedAtGt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
    private String localCreatedAtGte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
    private List<String> localCreatedAtIn = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
    private String localCreatedAtLt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
    private String localCreatedAtLte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
    private String localCreatedAtNot;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
    private List<String> localCreatedAtNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_HASH = "local_hash";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH)
    private String localHash;

    public static final String SERIALIZED_NAME_LOCAL_HASH_CONTAINS = "local_hash_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_CONTAINS)
    private String localHashContains;

    public static final String SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH = "local_hash_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH)
    private String localHashEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_GT = "local_hash_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_GT)
    private String localHashGt;

    public static final String SERIALIZED_NAME_LOCAL_HASH_GTE = "local_hash_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_GTE)
    private String localHashGte;

    public static final String SERIALIZED_NAME_LOCAL_HASH_IN = "local_hash_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_IN)
    private List<String> localHashIn = null;

    public static final String SERIALIZED_NAME_LOCAL_HASH_LT = "local_hash_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_LT)
    private String localHashLt;

    public static final String SERIALIZED_NAME_LOCAL_HASH_LTE = "local_hash_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_LTE)
    private String localHashLte;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT = "local_hash_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT)
    private String localHashNot;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS = "local_hash_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS)
    private String localHashNotContains;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH =
            "local_hash_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH)
    private String localHashNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_IN = "local_hash_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_IN)
    private List<String> localHashNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH =
            "local_hash_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH)
    private String localHashNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH = "local_hash_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH)
    private String localHashStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT = "local_updated_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT)
    private String localUpdatedAt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_GT = "local_updated_at_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT)
    private String localUpdatedAtGt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE = "local_updated_at_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE)
    private String localUpdatedAtGte;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_IN = "local_updated_at_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN)
    private List<String> localUpdatedAtIn = null;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_LT = "local_updated_at_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT)
    private String localUpdatedAtLt;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE = "local_updated_at_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE)
    private String localUpdatedAtLte;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT = "local_updated_at_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT)
    private String localUpdatedAtNot;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN = "local_updated_at_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN)
    private List<String> localUpdatedAtNotIn = null;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_MODEL_CONTAINS = "model_contains";

    @SerializedName(SERIALIZED_NAME_MODEL_CONTAINS)
    private String modelContains;

    public static final String SERIALIZED_NAME_MODEL_ENDS_WITH = "model_ends_with";

    @SerializedName(SERIALIZED_NAME_MODEL_ENDS_WITH)
    private String modelEndsWith;

    public static final String SERIALIZED_NAME_MODEL_GT = "model_gt";

    @SerializedName(SERIALIZED_NAME_MODEL_GT)
    private String modelGt;

    public static final String SERIALIZED_NAME_MODEL_GTE = "model_gte";

    @SerializedName(SERIALIZED_NAME_MODEL_GTE)
    private String modelGte;

    public static final String SERIALIZED_NAME_MODEL_IN = "model_in";

    @SerializedName(SERIALIZED_NAME_MODEL_IN)
    private List<String> modelIn = null;

    public static final String SERIALIZED_NAME_MODEL_LT = "model_lt";

    @SerializedName(SERIALIZED_NAME_MODEL_LT)
    private String modelLt;

    public static final String SERIALIZED_NAME_MODEL_LTE = "model_lte";

    @SerializedName(SERIALIZED_NAME_MODEL_LTE)
    private String modelLte;

    public static final String SERIALIZED_NAME_MODEL_NOT = "model_not";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT)
    private String modelNot;

    public static final String SERIALIZED_NAME_MODEL_NOT_CONTAINS = "model_not_contains";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_CONTAINS)
    private String modelNotContains;

    public static final String SERIALIZED_NAME_MODEL_NOT_ENDS_WITH = "model_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH)
    private String modelNotEndsWith;

    public static final String SERIALIZED_NAME_MODEL_NOT_IN = "model_not_in";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_IN)
    private List<String> modelNotIn = null;

    public static final String SERIALIZED_NAME_MODEL_NOT_STARTS_WITH = "model_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH)
    private String modelNotStartsWith;

    public static final String SERIALIZED_NAME_MODEL_STARTS_WITH = "model_starts_with";

    @SerializedName(SERIALIZED_NAME_MODEL_STARTS_WITH)
    private String modelStartsWith;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_PATH_NUM = "path_num";

    @SerializedName(SERIALIZED_NAME_PATH_NUM)
    private Integer pathNum;

    public static final String SERIALIZED_NAME_PATH_NUM_GT = "path_num_gt";

    @SerializedName(SERIALIZED_NAME_PATH_NUM_GT)
    private Integer pathNumGt;

    public static final String SERIALIZED_NAME_PATH_NUM_GTE = "path_num_gte";

    @SerializedName(SERIALIZED_NAME_PATH_NUM_GTE)
    private Integer pathNumGte;

    public static final String SERIALIZED_NAME_PATH_NUM_IN = "path_num_in";

    @SerializedName(SERIALIZED_NAME_PATH_NUM_IN)
    private List<Integer> pathNumIn = null;

    public static final String SERIALIZED_NAME_PATH_NUM_LT = "path_num_lt";

    @SerializedName(SERIALIZED_NAME_PATH_NUM_LT)
    private Integer pathNumLt;

    public static final String SERIALIZED_NAME_PATH_NUM_LTE = "path_num_lte";

    @SerializedName(SERIALIZED_NAME_PATH_NUM_LTE)
    private Integer pathNumLte;

    public static final String SERIALIZED_NAME_PATH_NUM_NOT = "path_num_not";

    @SerializedName(SERIALIZED_NAME_PATH_NUM_NOT)
    private Integer pathNumNot;

    public static final String SERIALIZED_NAME_PATH_NUM_NOT_IN = "path_num_not_in";

    @SerializedName(SERIALIZED_NAME_PATH_NUM_NOT_IN)
    private List<Integer> pathNumNotIn = null;

    public static final String SERIALIZED_NAME_SPEED = "speed";

    @SerializedName(SERIALIZED_NAME_SPEED)
    private String speed;

    public static final String SERIALIZED_NAME_SPEED_CONTAINS = "speed_contains";

    @SerializedName(SERIALIZED_NAME_SPEED_CONTAINS)
    private String speedContains;

    public static final String SERIALIZED_NAME_SPEED_ENDS_WITH = "speed_ends_with";

    @SerializedName(SERIALIZED_NAME_SPEED_ENDS_WITH)
    private String speedEndsWith;

    public static final String SERIALIZED_NAME_SPEED_GT = "speed_gt";

    @SerializedName(SERIALIZED_NAME_SPEED_GT)
    private String speedGt;

    public static final String SERIALIZED_NAME_SPEED_GTE = "speed_gte";

    @SerializedName(SERIALIZED_NAME_SPEED_GTE)
    private String speedGte;

    public static final String SERIALIZED_NAME_SPEED_IN = "speed_in";

    @SerializedName(SERIALIZED_NAME_SPEED_IN)
    private List<String> speedIn = null;

    public static final String SERIALIZED_NAME_SPEED_LT = "speed_lt";

    @SerializedName(SERIALIZED_NAME_SPEED_LT)
    private String speedLt;

    public static final String SERIALIZED_NAME_SPEED_LTE = "speed_lte";

    @SerializedName(SERIALIZED_NAME_SPEED_LTE)
    private String speedLte;

    public static final String SERIALIZED_NAME_SPEED_NOT = "speed_not";

    @SerializedName(SERIALIZED_NAME_SPEED_NOT)
    private String speedNot;

    public static final String SERIALIZED_NAME_SPEED_NOT_CONTAINS = "speed_not_contains";

    @SerializedName(SERIALIZED_NAME_SPEED_NOT_CONTAINS)
    private String speedNotContains;

    public static final String SERIALIZED_NAME_SPEED_NOT_ENDS_WITH = "speed_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SPEED_NOT_ENDS_WITH)
    private String speedNotEndsWith;

    public static final String SERIALIZED_NAME_SPEED_NOT_IN = "speed_not_in";

    @SerializedName(SERIALIZED_NAME_SPEED_NOT_IN)
    private List<String> speedNotIn = null;

    public static final String SERIALIZED_NAME_SPEED_NOT_STARTS_WITH = "speed_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SPEED_NOT_STARTS_WITH)
    private String speedNotStartsWith;

    public static final String SERIALIZED_NAME_SPEED_STARTS_WITH = "speed_starts_with";

    @SerializedName(SERIALIZED_NAME_SPEED_STARTS_WITH)
    private String speedStartsWith;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private StorageAdapterStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<StorageAdapterStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private StorageAdapterStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<StorageAdapterStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY =
            "storage_device_paths_every";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY)
    private StorageDevicePathWhereInput storageDevicePathsEvery;

    public static final String SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE =
            "storage_device_paths_none";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE)
    private StorageDevicePathWhereInput storageDevicePathsNone;

    public static final String SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME =
            "storage_device_paths_some";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME)
    private StorageDevicePathWhereInput storageDevicePathsSome;

    public static final String SERIALIZED_NAME_STORAGE_DEVICES_EVERY = "storage_devices_every";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICES_EVERY)
    private StorageDeviceWhereInput storageDevicesEvery;

    public static final String SERIALIZED_NAME_STORAGE_DEVICES_NONE = "storage_devices_none";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICES_NONE)
    private StorageDeviceWhereInput storageDevicesNone;

    public static final String SERIALIZED_NAME_STORAGE_DEVICES_SOME = "storage_devices_some";

    @SerializedName(SERIALIZED_NAME_STORAGE_DEVICES_SOME)
    private StorageDeviceWhereInput storageDevicesSome;

    public static final String SERIALIZED_NAME_STORAGE_TARGETS_EVERY = "storage_targets_every";

    @SerializedName(SERIALIZED_NAME_STORAGE_TARGETS_EVERY)
    private StorageTargetWhereInput storageTargetsEvery;

    public static final String SERIALIZED_NAME_STORAGE_TARGETS_NONE = "storage_targets_none";

    @SerializedName(SERIALIZED_NAME_STORAGE_TARGETS_NONE)
    private StorageTargetWhereInput storageTargetsNone;

    public static final String SERIALIZED_NAME_STORAGE_TARGETS_SOME = "storage_targets_some";

    @SerializedName(SERIALIZED_NAME_STORAGE_TARGETS_SOME)
    private StorageTargetWhereInput storageTargetsSome;

    public static final String SERIALIZED_NAME_TARGET_NUM = "target_num";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM)
    private Integer targetNum;

    public static final String SERIALIZED_NAME_TARGET_NUM_GT = "target_num_gt";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_GT)
    private Integer targetNumGt;

    public static final String SERIALIZED_NAME_TARGET_NUM_GTE = "target_num_gte";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_GTE)
    private Integer targetNumGte;

    public static final String SERIALIZED_NAME_TARGET_NUM_IN = "target_num_in";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_IN)
    private List<Integer> targetNumIn = null;

    public static final String SERIALIZED_NAME_TARGET_NUM_LT = "target_num_lt";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_LT)
    private Integer targetNumLt;

    public static final String SERIALIZED_NAME_TARGET_NUM_LTE = "target_num_lte";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_LTE)
    private Integer targetNumLte;

    public static final String SERIALIZED_NAME_TARGET_NUM_NOT = "target_num_not";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_NOT)
    private Integer targetNumNot;

    public static final String SERIALIZED_NAME_TARGET_NUM_NOT_IN = "target_num_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_NUM_NOT_IN)
    private List<Integer> targetNumNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StorageAdapterType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<StorageAdapterType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private StorageAdapterType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<StorageAdapterType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VLANS_EVERY = "vlans_every";

    @SerializedName(SERIALIZED_NAME_VLANS_EVERY)
    private VlanWhereInput vlansEvery;

    public static final String SERIALIZED_NAME_VLANS_NONE = "vlans_none";

    @SerializedName(SERIALIZED_NAME_VLANS_NONE)
    private VlanWhereInput vlansNone;

    public static final String SERIALIZED_NAME_VLANS_SOME = "vlans_some";

    @SerializedName(SERIALIZED_NAME_VLANS_SOME)
    private VlanWhereInput vlansSome;

    public static final String SERIALIZED_NAME_WWNN = "wwnn";

    @SerializedName(SERIALIZED_NAME_WWNN)
    private String wwnn;

    public static final String SERIALIZED_NAME_WWNN_CONTAINS = "wwnn_contains";

    @SerializedName(SERIALIZED_NAME_WWNN_CONTAINS)
    private String wwnnContains;

    public static final String SERIALIZED_NAME_WWNN_ENDS_WITH = "wwnn_ends_with";

    @SerializedName(SERIALIZED_NAME_WWNN_ENDS_WITH)
    private String wwnnEndsWith;

    public static final String SERIALIZED_NAME_WWNN_GT = "wwnn_gt";

    @SerializedName(SERIALIZED_NAME_WWNN_GT)
    private String wwnnGt;

    public static final String SERIALIZED_NAME_WWNN_GTE = "wwnn_gte";

    @SerializedName(SERIALIZED_NAME_WWNN_GTE)
    private String wwnnGte;

    public static final String SERIALIZED_NAME_WWNN_IN = "wwnn_in";

    @SerializedName(SERIALIZED_NAME_WWNN_IN)
    private List<String> wwnnIn = null;

    public static final String SERIALIZED_NAME_WWNN_LT = "wwnn_lt";

    @SerializedName(SERIALIZED_NAME_WWNN_LT)
    private String wwnnLt;

    public static final String SERIALIZED_NAME_WWNN_LTE = "wwnn_lte";

    @SerializedName(SERIALIZED_NAME_WWNN_LTE)
    private String wwnnLte;

    public static final String SERIALIZED_NAME_WWNN_NOT = "wwnn_not";

    @SerializedName(SERIALIZED_NAME_WWNN_NOT)
    private String wwnnNot;

    public static final String SERIALIZED_NAME_WWNN_NOT_CONTAINS = "wwnn_not_contains";

    @SerializedName(SERIALIZED_NAME_WWNN_NOT_CONTAINS)
    private String wwnnNotContains;

    public static final String SERIALIZED_NAME_WWNN_NOT_ENDS_WITH = "wwnn_not_ends_with";

    @SerializedName(SERIALIZED_NAME_WWNN_NOT_ENDS_WITH)
    private String wwnnNotEndsWith;

    public static final String SERIALIZED_NAME_WWNN_NOT_IN = "wwnn_not_in";

    @SerializedName(SERIALIZED_NAME_WWNN_NOT_IN)
    private List<String> wwnnNotIn = null;

    public static final String SERIALIZED_NAME_WWNN_NOT_STARTS_WITH = "wwnn_not_starts_with";

    @SerializedName(SERIALIZED_NAME_WWNN_NOT_STARTS_WITH)
    private String wwnnNotStartsWith;

    public static final String SERIALIZED_NAME_WWNN_STARTS_WITH = "wwnn_starts_with";

    @SerializedName(SERIALIZED_NAME_WWNN_STARTS_WITH)
    private String wwnnStartsWith;

    public static final String SERIALIZED_NAME_WWPN = "wwpn";

    @SerializedName(SERIALIZED_NAME_WWPN)
    private String wwpn;

    public static final String SERIALIZED_NAME_WWPN_CONTAINS = "wwpn_contains";

    @SerializedName(SERIALIZED_NAME_WWPN_CONTAINS)
    private String wwpnContains;

    public static final String SERIALIZED_NAME_WWPN_ENDS_WITH = "wwpn_ends_with";

    @SerializedName(SERIALIZED_NAME_WWPN_ENDS_WITH)
    private String wwpnEndsWith;

    public static final String SERIALIZED_NAME_WWPN_GT = "wwpn_gt";

    @SerializedName(SERIALIZED_NAME_WWPN_GT)
    private String wwpnGt;

    public static final String SERIALIZED_NAME_WWPN_GTE = "wwpn_gte";

    @SerializedName(SERIALIZED_NAME_WWPN_GTE)
    private String wwpnGte;

    public static final String SERIALIZED_NAME_WWPN_IN = "wwpn_in";

    @SerializedName(SERIALIZED_NAME_WWPN_IN)
    private List<String> wwpnIn = null;

    public static final String SERIALIZED_NAME_WWPN_LT = "wwpn_lt";

    @SerializedName(SERIALIZED_NAME_WWPN_LT)
    private String wwpnLt;

    public static final String SERIALIZED_NAME_WWPN_LTE = "wwpn_lte";

    @SerializedName(SERIALIZED_NAME_WWPN_LTE)
    private String wwpnLte;

    public static final String SERIALIZED_NAME_WWPN_NOT = "wwpn_not";

    @SerializedName(SERIALIZED_NAME_WWPN_NOT)
    private String wwpnNot;

    public static final String SERIALIZED_NAME_WWPN_NOT_CONTAINS = "wwpn_not_contains";

    @SerializedName(SERIALIZED_NAME_WWPN_NOT_CONTAINS)
    private String wwpnNotContains;

    public static final String SERIALIZED_NAME_WWPN_NOT_ENDS_WITH = "wwpn_not_ends_with";

    @SerializedName(SERIALIZED_NAME_WWPN_NOT_ENDS_WITH)
    private String wwpnNotEndsWith;

    public static final String SERIALIZED_NAME_WWPN_NOT_IN = "wwpn_not_in";

    @SerializedName(SERIALIZED_NAME_WWPN_NOT_IN)
    private List<String> wwpnNotIn = null;

    public static final String SERIALIZED_NAME_WWPN_NOT_STARTS_WITH = "wwpn_not_starts_with";

    @SerializedName(SERIALIZED_NAME_WWPN_NOT_STARTS_WITH)
    private String wwpnNotStartsWith;

    public static final String SERIALIZED_NAME_WWPN_STARTS_WITH = "wwpn_starts_with";

    @SerializedName(SERIALIZED_NAME_WWPN_STARTS_WITH)
    private String wwpnStartsWith;

    public StorageAdapterWhereInput() {}

    public StorageAdapterWhereInput AND(List<StorageAdapterWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public StorageAdapterWhereInput addANDItem(StorageAdapterWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<StorageAdapterWhereInput>();
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
    public List<StorageAdapterWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<StorageAdapterWhereInput> AND) {
        this.AND = AND;
    }

    public StorageAdapterWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public StorageAdapterWhereInput AND_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput NOT(List<StorageAdapterWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public StorageAdapterWhereInput addNOTItem(StorageAdapterWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<StorageAdapterWhereInput>();
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
    public List<StorageAdapterWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<StorageAdapterWhereInput> NOT) {
        this.NOT = NOT;
    }

    public StorageAdapterWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public StorageAdapterWhereInput NOT_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput OR(List<StorageAdapterWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public StorageAdapterWhereInput addORItem(StorageAdapterWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<StorageAdapterWhereInput>();
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
    public List<StorageAdapterWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<StorageAdapterWhereInput> OR) {
        this.OR = OR;
    }

    public StorageAdapterWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public StorageAdapterWhereInput OR_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput aliasName(String aliasName) {

        this.aliasName = aliasName;
        return this;
    }

    /**
     * Get aliasName
     *
     * @return aliasName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public StorageAdapterWhereInput aliasName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME);
        return this;
    }

    public StorageAdapterWhereInput aliasName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME);
        return this;
    }

    public void setAliasName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME);
        }
    }

    public boolean getAliasName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME);
    }

    public StorageAdapterWhereInput aliasNameContains(String aliasNameContains) {

        this.aliasNameContains = aliasNameContains;
        return this;
    }

    /**
     * Get aliasNameContains
     *
     * @return aliasNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameContains() {
        return aliasNameContains;
    }

    public void setAliasNameContains(String aliasNameContains) {
        this.aliasNameContains = aliasNameContains;
    }

    public StorageAdapterWhereInput aliasNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput aliasNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_CONTAINS);
        return this;
    }

    public void setAliasNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_CONTAINS);
        }
    }

    public boolean getAliasNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_CONTAINS);
    }

    public StorageAdapterWhereInput aliasNameEndsWith(String aliasNameEndsWith) {

        this.aliasNameEndsWith = aliasNameEndsWith;
        return this;
    }

    /**
     * Get aliasNameEndsWith
     *
     * @return aliasNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameEndsWith() {
        return aliasNameEndsWith;
    }

    public void setAliasNameEndsWith(String aliasNameEndsWith) {
        this.aliasNameEndsWith = aliasNameEndsWith;
    }

    public StorageAdapterWhereInput aliasNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput aliasNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_ENDS_WITH);
        return this;
    }

    public void setAliasNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_ENDS_WITH);
        }
    }

    public boolean getAliasNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_ENDS_WITH);
    }

    public StorageAdapterWhereInput aliasNameGt(String aliasNameGt) {

        this.aliasNameGt = aliasNameGt;
        return this;
    }

    /**
     * Get aliasNameGt
     *
     * @return aliasNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameGt() {
        return aliasNameGt;
    }

    public void setAliasNameGt(String aliasNameGt) {
        this.aliasNameGt = aliasNameGt;
    }

    public StorageAdapterWhereInput aliasNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_GT);
        return this;
    }

    public StorageAdapterWhereInput aliasNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_GT);
        return this;
    }

    public void setAliasNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_GT);
        }
    }

    public boolean getAliasNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_GT);
    }

    public StorageAdapterWhereInput aliasNameGte(String aliasNameGte) {

        this.aliasNameGte = aliasNameGte;
        return this;
    }

    /**
     * Get aliasNameGte
     *
     * @return aliasNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameGte() {
        return aliasNameGte;
    }

    public void setAliasNameGte(String aliasNameGte) {
        this.aliasNameGte = aliasNameGte;
    }

    public StorageAdapterWhereInput aliasNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_GTE);
        return this;
    }

    public StorageAdapterWhereInput aliasNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_GTE);
        return this;
    }

    public void setAliasNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_GTE);
        }
    }

    public boolean getAliasNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_GTE);
    }

    public StorageAdapterWhereInput aliasNameIn(List<String> aliasNameIn) {

        this.aliasNameIn = aliasNameIn;
        return this;
    }

    public StorageAdapterWhereInput addAliasNameInItem(String aliasNameInItem) {
        if (this.aliasNameIn == null) {
            this.aliasNameIn = new ArrayList<String>();
        }
        this.aliasNameIn.add(aliasNameInItem);
        return this;
    }

    /**
     * Get aliasNameIn
     *
     * @return aliasNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAliasNameIn() {
        return aliasNameIn;
    }

    public void setAliasNameIn(List<String> aliasNameIn) {
        this.aliasNameIn = aliasNameIn;
    }

    public StorageAdapterWhereInput aliasNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_IN);
        return this;
    }

    public StorageAdapterWhereInput aliasNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_IN);
        return this;
    }

    public void setAliasNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_IN);
        }
    }

    public boolean getAliasNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_IN);
    }

    public StorageAdapterWhereInput aliasNameLt(String aliasNameLt) {

        this.aliasNameLt = aliasNameLt;
        return this;
    }

    /**
     * Get aliasNameLt
     *
     * @return aliasNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameLt() {
        return aliasNameLt;
    }

    public void setAliasNameLt(String aliasNameLt) {
        this.aliasNameLt = aliasNameLt;
    }

    public StorageAdapterWhereInput aliasNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_LT);
        return this;
    }

    public StorageAdapterWhereInput aliasNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_LT);
        return this;
    }

    public void setAliasNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_LT);
        }
    }

    public boolean getAliasNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_LT);
    }

    public StorageAdapterWhereInput aliasNameLte(String aliasNameLte) {

        this.aliasNameLte = aliasNameLte;
        return this;
    }

    /**
     * Get aliasNameLte
     *
     * @return aliasNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameLte() {
        return aliasNameLte;
    }

    public void setAliasNameLte(String aliasNameLte) {
        this.aliasNameLte = aliasNameLte;
    }

    public StorageAdapterWhereInput aliasNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_LTE);
        return this;
    }

    public StorageAdapterWhereInput aliasNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_LTE);
        return this;
    }

    public void setAliasNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_LTE);
        }
    }

    public boolean getAliasNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_LTE);
    }

    public StorageAdapterWhereInput aliasNameNot(String aliasNameNot) {

        this.aliasNameNot = aliasNameNot;
        return this;
    }

    /**
     * Get aliasNameNot
     *
     * @return aliasNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameNot() {
        return aliasNameNot;
    }

    public void setAliasNameNot(String aliasNameNot) {
        this.aliasNameNot = aliasNameNot;
    }

    public StorageAdapterWhereInput aliasNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT);
        return this;
    }

    public StorageAdapterWhereInput aliasNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT);
        return this;
    }

    public void setAliasNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT);
        }
    }

    public boolean getAliasNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_NOT);
    }

    public StorageAdapterWhereInput aliasNameNotContains(String aliasNameNotContains) {

        this.aliasNameNotContains = aliasNameNotContains;
        return this;
    }

    /**
     * Get aliasNameNotContains
     *
     * @return aliasNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameNotContains() {
        return aliasNameNotContains;
    }

    public void setAliasNameNotContains(String aliasNameNotContains) {
        this.aliasNameNotContains = aliasNameNotContains;
    }

    public StorageAdapterWhereInput aliasNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput aliasNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_CONTAINS);
        return this;
    }

    public void setAliasNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_CONTAINS);
        }
    }

    public boolean getAliasNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput aliasNameNotEndsWith(String aliasNameNotEndsWith) {

        this.aliasNameNotEndsWith = aliasNameNotEndsWith;
        return this;
    }

    /**
     * Get aliasNameNotEndsWith
     *
     * @return aliasNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameNotEndsWith() {
        return aliasNameNotEndsWith;
    }

    public void setAliasNameNotEndsWith(String aliasNameNotEndsWith) {
        this.aliasNameNotEndsWith = aliasNameNotEndsWith;
    }

    public StorageAdapterWhereInput aliasNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput aliasNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setAliasNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getAliasNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput aliasNameNotIn(List<String> aliasNameNotIn) {

        this.aliasNameNotIn = aliasNameNotIn;
        return this;
    }

    public StorageAdapterWhereInput addAliasNameNotInItem(String aliasNameNotInItem) {
        if (this.aliasNameNotIn == null) {
            this.aliasNameNotIn = new ArrayList<String>();
        }
        this.aliasNameNotIn.add(aliasNameNotInItem);
        return this;
    }

    /**
     * Get aliasNameNotIn
     *
     * @return aliasNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAliasNameNotIn() {
        return aliasNameNotIn;
    }

    public void setAliasNameNotIn(List<String> aliasNameNotIn) {
        this.aliasNameNotIn = aliasNameNotIn;
    }

    public StorageAdapterWhereInput aliasNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput aliasNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_IN);
        return this;
    }

    public void setAliasNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_IN);
        }
    }

    public boolean getAliasNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_NOT_IN);
    }

    public StorageAdapterWhereInput aliasNameNotStartsWith(String aliasNameNotStartsWith) {

        this.aliasNameNotStartsWith = aliasNameNotStartsWith;
        return this;
    }

    /**
     * Get aliasNameNotStartsWith
     *
     * @return aliasNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameNotStartsWith() {
        return aliasNameNotStartsWith;
    }

    public void setAliasNameNotStartsWith(String aliasNameNotStartsWith) {
        this.aliasNameNotStartsWith = aliasNameNotStartsWith;
    }

    public StorageAdapterWhereInput aliasNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput aliasNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setAliasNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getAliasNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput aliasNameStartsWith(String aliasNameStartsWith) {

        this.aliasNameStartsWith = aliasNameStartsWith;
        return this;
    }

    /**
     * Get aliasNameStartsWith
     *
     * @return aliasNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAliasNameStartsWith() {
        return aliasNameStartsWith;
    }

    public void setAliasNameStartsWith(String aliasNameStartsWith) {
        this.aliasNameStartsWith = aliasNameStartsWith;
    }

    public StorageAdapterWhereInput aliasNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput aliasNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_STARTS_WITH);
        return this;
    }

    public void setAliasNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALIAS_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALIAS_NAME_STARTS_WITH);
        }
    }

    public boolean getAliasNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALIAS_NAME_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapPassword(String chapPassword) {

        this.chapPassword = chapPassword;
        return this;
    }

    /**
     * Get chapPassword
     *
     * @return chapPassword
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPassword() {
        return chapPassword;
    }

    public void setChapPassword(String chapPassword) {
        this.chapPassword = chapPassword;
    }

    public StorageAdapterWhereInput chapPassword_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD);
        return this;
    }

    public StorageAdapterWhereInput chapPassword_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD);
        return this;
    }

    public void setChapPassword_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD);
        }
    }

    public boolean getChapPassword_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD);
    }

    public StorageAdapterWhereInput chapPasswordContains(String chapPasswordContains) {

        this.chapPasswordContains = chapPasswordContains;
        return this;
    }

    /**
     * Get chapPasswordContains
     *
     * @return chapPasswordContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordContains() {
        return chapPasswordContains;
    }

    public void setChapPasswordContains(String chapPasswordContains) {
        this.chapPasswordContains = chapPasswordContains;
    }

    public StorageAdapterWhereInput chapPasswordContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS);
        return this;
    }

    public void setChapPasswordContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS);
        }
    }

    public boolean getChapPasswordContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS);
    }

    public StorageAdapterWhereInput chapPasswordEndsWith(String chapPasswordEndsWith) {

        this.chapPasswordEndsWith = chapPasswordEndsWith;
        return this;
    }

    /**
     * Get chapPasswordEndsWith
     *
     * @return chapPasswordEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordEndsWith() {
        return chapPasswordEndsWith;
    }

    public void setChapPasswordEndsWith(String chapPasswordEndsWith) {
        this.chapPasswordEndsWith = chapPasswordEndsWith;
    }

    public StorageAdapterWhereInput chapPasswordEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH);
        return this;
    }

    public void setChapPasswordEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH);
        }
    }

    public boolean getChapPasswordEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapPasswordGt(String chapPasswordGt) {

        this.chapPasswordGt = chapPasswordGt;
        return this;
    }

    /**
     * Get chapPasswordGt
     *
     * @return chapPasswordGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordGt() {
        return chapPasswordGt;
    }

    public void setChapPasswordGt(String chapPasswordGt) {
        this.chapPasswordGt = chapPasswordGt;
    }

    public StorageAdapterWhereInput chapPasswordGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_GT);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_GT);
        return this;
    }

    public void setChapPasswordGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_GT);
        }
    }

    public boolean getChapPasswordGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_GT);
    }

    public StorageAdapterWhereInput chapPasswordGte(String chapPasswordGte) {

        this.chapPasswordGte = chapPasswordGte;
        return this;
    }

    /**
     * Get chapPasswordGte
     *
     * @return chapPasswordGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordGte() {
        return chapPasswordGte;
    }

    public void setChapPasswordGte(String chapPasswordGte) {
        this.chapPasswordGte = chapPasswordGte;
    }

    public StorageAdapterWhereInput chapPasswordGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_GTE);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_GTE);
        return this;
    }

    public void setChapPasswordGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_GTE);
        }
    }

    public boolean getChapPasswordGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_GTE);
    }

    public StorageAdapterWhereInput chapPasswordIn(List<String> chapPasswordIn) {

        this.chapPasswordIn = chapPasswordIn;
        return this;
    }

    public StorageAdapterWhereInput addChapPasswordInItem(String chapPasswordInItem) {
        if (this.chapPasswordIn == null) {
            this.chapPasswordIn = new ArrayList<String>();
        }
        this.chapPasswordIn.add(chapPasswordInItem);
        return this;
    }

    /**
     * Get chapPasswordIn
     *
     * @return chapPasswordIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapPasswordIn() {
        return chapPasswordIn;
    }

    public void setChapPasswordIn(List<String> chapPasswordIn) {
        this.chapPasswordIn = chapPasswordIn;
    }

    public StorageAdapterWhereInput chapPasswordIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_IN);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_IN);
        return this;
    }

    public void setChapPasswordIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_IN);
        }
    }

    public boolean getChapPasswordIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_IN);
    }

    public StorageAdapterWhereInput chapPasswordInput(String chapPasswordInput) {

        this.chapPasswordInput = chapPasswordInput;
        return this;
    }

    /**
     * Get chapPasswordInput
     *
     * @return chapPasswordInput
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInput() {
        return chapPasswordInput;
    }

    public void setChapPasswordInput(String chapPasswordInput) {
        this.chapPasswordInput = chapPasswordInput;
    }

    public StorageAdapterWhereInput chapPasswordInput_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInput_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT);
        return this;
    }

    public void setChapPasswordInput_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT);
        }
    }

    public boolean getChapPasswordInput_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT);
    }

    public StorageAdapterWhereInput chapPasswordInputContains(String chapPasswordInputContains) {

        this.chapPasswordInputContains = chapPasswordInputContains;
        return this;
    }

    /**
     * Get chapPasswordInputContains
     *
     * @return chapPasswordInputContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputContains() {
        return chapPasswordInputContains;
    }

    public void setChapPasswordInputContains(String chapPasswordInputContains) {
        this.chapPasswordInputContains = chapPasswordInputContains;
    }

    public StorageAdapterWhereInput chapPasswordInputContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS);
        return this;
    }

    public void setChapPasswordInputContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS);
        }
    }

    public boolean getChapPasswordInputContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS);
    }

    public StorageAdapterWhereInput chapPasswordInputEndsWith(String chapPasswordInputEndsWith) {

        this.chapPasswordInputEndsWith = chapPasswordInputEndsWith;
        return this;
    }

    /**
     * Get chapPasswordInputEndsWith
     *
     * @return chapPasswordInputEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputEndsWith() {
        return chapPasswordInputEndsWith;
    }

    public void setChapPasswordInputEndsWith(String chapPasswordInputEndsWith) {
        this.chapPasswordInputEndsWith = chapPasswordInputEndsWith;
    }

    public StorageAdapterWhereInput chapPasswordInputEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH);
        return this;
    }

    public void setChapPasswordInputEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH);
        }
    }

    public boolean getChapPasswordInputEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapPasswordInputGt(String chapPasswordInputGt) {

        this.chapPasswordInputGt = chapPasswordInputGt;
        return this;
    }

    /**
     * Get chapPasswordInputGt
     *
     * @return chapPasswordInputGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputGt() {
        return chapPasswordInputGt;
    }

    public void setChapPasswordInputGt(String chapPasswordInputGt) {
        this.chapPasswordInputGt = chapPasswordInputGt;
    }

    public StorageAdapterWhereInput chapPasswordInputGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT);
        return this;
    }

    public void setChapPasswordInputGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT);
        }
    }

    public boolean getChapPasswordInputGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT);
    }

    public StorageAdapterWhereInput chapPasswordInputGte(String chapPasswordInputGte) {

        this.chapPasswordInputGte = chapPasswordInputGte;
        return this;
    }

    /**
     * Get chapPasswordInputGte
     *
     * @return chapPasswordInputGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputGte() {
        return chapPasswordInputGte;
    }

    public void setChapPasswordInputGte(String chapPasswordInputGte) {
        this.chapPasswordInputGte = chapPasswordInputGte;
    }

    public StorageAdapterWhereInput chapPasswordInputGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE);
        return this;
    }

    public void setChapPasswordInputGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE);
        }
    }

    public boolean getChapPasswordInputGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE);
    }

    public StorageAdapterWhereInput chapPasswordInputIn(List<String> chapPasswordInputIn) {

        this.chapPasswordInputIn = chapPasswordInputIn;
        return this;
    }

    public StorageAdapterWhereInput addChapPasswordInputInItem(String chapPasswordInputInItem) {
        if (this.chapPasswordInputIn == null) {
            this.chapPasswordInputIn = new ArrayList<String>();
        }
        this.chapPasswordInputIn.add(chapPasswordInputInItem);
        return this;
    }

    /**
     * Get chapPasswordInputIn
     *
     * @return chapPasswordInputIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapPasswordInputIn() {
        return chapPasswordInputIn;
    }

    public void setChapPasswordInputIn(List<String> chapPasswordInputIn) {
        this.chapPasswordInputIn = chapPasswordInputIn;
    }

    public StorageAdapterWhereInput chapPasswordInputIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN);
        return this;
    }

    public void setChapPasswordInputIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN);
        }
    }

    public boolean getChapPasswordInputIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN);
    }

    public StorageAdapterWhereInput chapPasswordInputLt(String chapPasswordInputLt) {

        this.chapPasswordInputLt = chapPasswordInputLt;
        return this;
    }

    /**
     * Get chapPasswordInputLt
     *
     * @return chapPasswordInputLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputLt() {
        return chapPasswordInputLt;
    }

    public void setChapPasswordInputLt(String chapPasswordInputLt) {
        this.chapPasswordInputLt = chapPasswordInputLt;
    }

    public StorageAdapterWhereInput chapPasswordInputLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT);
        return this;
    }

    public void setChapPasswordInputLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT);
        }
    }

    public boolean getChapPasswordInputLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT);
    }

    public StorageAdapterWhereInput chapPasswordInputLte(String chapPasswordInputLte) {

        this.chapPasswordInputLte = chapPasswordInputLte;
        return this;
    }

    /**
     * Get chapPasswordInputLte
     *
     * @return chapPasswordInputLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputLte() {
        return chapPasswordInputLte;
    }

    public void setChapPasswordInputLte(String chapPasswordInputLte) {
        this.chapPasswordInputLte = chapPasswordInputLte;
    }

    public StorageAdapterWhereInput chapPasswordInputLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE);
        return this;
    }

    public void setChapPasswordInputLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE);
        }
    }

    public boolean getChapPasswordInputLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE);
    }

    public StorageAdapterWhereInput chapPasswordInputNot(String chapPasswordInputNot) {

        this.chapPasswordInputNot = chapPasswordInputNot;
        return this;
    }

    /**
     * Get chapPasswordInputNot
     *
     * @return chapPasswordInputNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputNot() {
        return chapPasswordInputNot;
    }

    public void setChapPasswordInputNot(String chapPasswordInputNot) {
        this.chapPasswordInputNot = chapPasswordInputNot;
    }

    public StorageAdapterWhereInput chapPasswordInputNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT);
        return this;
    }

    public void setChapPasswordInputNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT);
        }
    }

    public boolean getChapPasswordInputNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT);
    }

    public StorageAdapterWhereInput chapPasswordInputNotContains(
            String chapPasswordInputNotContains) {

        this.chapPasswordInputNotContains = chapPasswordInputNotContains;
        return this;
    }

    /**
     * Get chapPasswordInputNotContains
     *
     * @return chapPasswordInputNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputNotContains() {
        return chapPasswordInputNotContains;
    }

    public void setChapPasswordInputNotContains(String chapPasswordInputNotContains) {
        this.chapPasswordInputNotContains = chapPasswordInputNotContains;
    }

    public StorageAdapterWhereInput chapPasswordInputNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS);
        return this;
    }

    public void setChapPasswordInputNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS);
        }
    }

    public boolean getChapPasswordInputNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput chapPasswordInputNotEndsWith(
            String chapPasswordInputNotEndsWith) {

        this.chapPasswordInputNotEndsWith = chapPasswordInputNotEndsWith;
        return this;
    }

    /**
     * Get chapPasswordInputNotEndsWith
     *
     * @return chapPasswordInputNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputNotEndsWith() {
        return chapPasswordInputNotEndsWith;
    }

    public void setChapPasswordInputNotEndsWith(String chapPasswordInputNotEndsWith) {
        this.chapPasswordInputNotEndsWith = chapPasswordInputNotEndsWith;
    }

    public StorageAdapterWhereInput chapPasswordInputNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH);
        return this;
    }

    public void setChapPasswordInputNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH);
        }
    }

    public boolean getChapPasswordInputNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapPasswordInputNotIn(List<String> chapPasswordInputNotIn) {

        this.chapPasswordInputNotIn = chapPasswordInputNotIn;
        return this;
    }

    public StorageAdapterWhereInput addChapPasswordInputNotInItem(
            String chapPasswordInputNotInItem) {
        if (this.chapPasswordInputNotIn == null) {
            this.chapPasswordInputNotIn = new ArrayList<String>();
        }
        this.chapPasswordInputNotIn.add(chapPasswordInputNotInItem);
        return this;
    }

    /**
     * Get chapPasswordInputNotIn
     *
     * @return chapPasswordInputNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapPasswordInputNotIn() {
        return chapPasswordInputNotIn;
    }

    public void setChapPasswordInputNotIn(List<String> chapPasswordInputNotIn) {
        this.chapPasswordInputNotIn = chapPasswordInputNotIn;
    }

    public StorageAdapterWhereInput chapPasswordInputNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN);
        return this;
    }

    public void setChapPasswordInputNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN);
        }
    }

    public boolean getChapPasswordInputNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN);
    }

    public StorageAdapterWhereInput chapPasswordInputNotStartsWith(
            String chapPasswordInputNotStartsWith) {

        this.chapPasswordInputNotStartsWith = chapPasswordInputNotStartsWith;
        return this;
    }

    /**
     * Get chapPasswordInputNotStartsWith
     *
     * @return chapPasswordInputNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputNotStartsWith() {
        return chapPasswordInputNotStartsWith;
    }

    public void setChapPasswordInputNotStartsWith(String chapPasswordInputNotStartsWith) {
        this.chapPasswordInputNotStartsWith = chapPasswordInputNotStartsWith;
    }

    public StorageAdapterWhereInput chapPasswordInputNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH);
        return this;
    }

    public void setChapPasswordInputNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH);
        }
    }

    public boolean getChapPasswordInputNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapPasswordInputStartsWith(
            String chapPasswordInputStartsWith) {

        this.chapPasswordInputStartsWith = chapPasswordInputStartsWith;
        return this;
    }

    /**
     * Get chapPasswordInputStartsWith
     *
     * @return chapPasswordInputStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordInputStartsWith() {
        return chapPasswordInputStartsWith;
    }

    public void setChapPasswordInputStartsWith(String chapPasswordInputStartsWith) {
        this.chapPasswordInputStartsWith = chapPasswordInputStartsWith;
    }

    public StorageAdapterWhereInput chapPasswordInputStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordInputStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH);
        return this;
    }

    public void setChapPasswordInputStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH);
        }
    }

    public boolean getChapPasswordInputStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapPasswordLt(String chapPasswordLt) {

        this.chapPasswordLt = chapPasswordLt;
        return this;
    }

    /**
     * Get chapPasswordLt
     *
     * @return chapPasswordLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordLt() {
        return chapPasswordLt;
    }

    public void setChapPasswordLt(String chapPasswordLt) {
        this.chapPasswordLt = chapPasswordLt;
    }

    public StorageAdapterWhereInput chapPasswordLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_LT);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_LT);
        return this;
    }

    public void setChapPasswordLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_LT);
        }
    }

    public boolean getChapPasswordLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_LT);
    }

    public StorageAdapterWhereInput chapPasswordLte(String chapPasswordLte) {

        this.chapPasswordLte = chapPasswordLte;
        return this;
    }

    /**
     * Get chapPasswordLte
     *
     * @return chapPasswordLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordLte() {
        return chapPasswordLte;
    }

    public void setChapPasswordLte(String chapPasswordLte) {
        this.chapPasswordLte = chapPasswordLte;
    }

    public StorageAdapterWhereInput chapPasswordLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_LTE);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_LTE);
        return this;
    }

    public void setChapPasswordLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_LTE);
        }
    }

    public boolean getChapPasswordLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_LTE);
    }

    public StorageAdapterWhereInput chapPasswordNot(String chapPasswordNot) {

        this.chapPasswordNot = chapPasswordNot;
        return this;
    }

    /**
     * Get chapPasswordNot
     *
     * @return chapPasswordNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordNot() {
        return chapPasswordNot;
    }

    public void setChapPasswordNot(String chapPasswordNot) {
        this.chapPasswordNot = chapPasswordNot;
    }

    public StorageAdapterWhereInput chapPasswordNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT);
        return this;
    }

    public void setChapPasswordNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT);
        }
    }

    public boolean getChapPasswordNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_NOT);
    }

    public StorageAdapterWhereInput chapPasswordNotContains(String chapPasswordNotContains) {

        this.chapPasswordNotContains = chapPasswordNotContains;
        return this;
    }

    /**
     * Get chapPasswordNotContains
     *
     * @return chapPasswordNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordNotContains() {
        return chapPasswordNotContains;
    }

    public void setChapPasswordNotContains(String chapPasswordNotContains) {
        this.chapPasswordNotContains = chapPasswordNotContains;
    }

    public StorageAdapterWhereInput chapPasswordNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS);
        return this;
    }

    public void setChapPasswordNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS);
        }
    }

    public boolean getChapPasswordNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput chapPasswordNotEndsWith(String chapPasswordNotEndsWith) {

        this.chapPasswordNotEndsWith = chapPasswordNotEndsWith;
        return this;
    }

    /**
     * Get chapPasswordNotEndsWith
     *
     * @return chapPasswordNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordNotEndsWith() {
        return chapPasswordNotEndsWith;
    }

    public void setChapPasswordNotEndsWith(String chapPasswordNotEndsWith) {
        this.chapPasswordNotEndsWith = chapPasswordNotEndsWith;
    }

    public StorageAdapterWhereInput chapPasswordNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH);
        return this;
    }

    public void setChapPasswordNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH);
        }
    }

    public boolean getChapPasswordNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapPasswordNotIn(List<String> chapPasswordNotIn) {

        this.chapPasswordNotIn = chapPasswordNotIn;
        return this;
    }

    public StorageAdapterWhereInput addChapPasswordNotInItem(String chapPasswordNotInItem) {
        if (this.chapPasswordNotIn == null) {
            this.chapPasswordNotIn = new ArrayList<String>();
        }
        this.chapPasswordNotIn.add(chapPasswordNotInItem);
        return this;
    }

    /**
     * Get chapPasswordNotIn
     *
     * @return chapPasswordNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapPasswordNotIn() {
        return chapPasswordNotIn;
    }

    public void setChapPasswordNotIn(List<String> chapPasswordNotIn) {
        this.chapPasswordNotIn = chapPasswordNotIn;
    }

    public StorageAdapterWhereInput chapPasswordNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN);
        return this;
    }

    public void setChapPasswordNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN);
        }
    }

    public boolean getChapPasswordNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN);
    }

    public StorageAdapterWhereInput chapPasswordNotStartsWith(String chapPasswordNotStartsWith) {

        this.chapPasswordNotStartsWith = chapPasswordNotStartsWith;
        return this;
    }

    /**
     * Get chapPasswordNotStartsWith
     *
     * @return chapPasswordNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordNotStartsWith() {
        return chapPasswordNotStartsWith;
    }

    public void setChapPasswordNotStartsWith(String chapPasswordNotStartsWith) {
        this.chapPasswordNotStartsWith = chapPasswordNotStartsWith;
    }

    public StorageAdapterWhereInput chapPasswordNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH);
        return this;
    }

    public void setChapPasswordNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH);
        }
    }

    public boolean getChapPasswordNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapPasswordStartsWith(String chapPasswordStartsWith) {

        this.chapPasswordStartsWith = chapPasswordStartsWith;
        return this;
    }

    /**
     * Get chapPasswordStartsWith
     *
     * @return chapPasswordStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapPasswordStartsWith() {
        return chapPasswordStartsWith;
    }

    public void setChapPasswordStartsWith(String chapPasswordStartsWith) {
        this.chapPasswordStartsWith = chapPasswordStartsWith;
    }

    public StorageAdapterWhereInput chapPasswordStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapPasswordStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH);
        return this;
    }

    public void setChapPasswordStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH);
        }
    }

    public boolean getChapPasswordStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapUsername(String chapUsername) {

        this.chapUsername = chapUsername;
        return this;
    }

    /**
     * Get chapUsername
     *
     * @return chapUsername
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsername() {
        return chapUsername;
    }

    public void setChapUsername(String chapUsername) {
        this.chapUsername = chapUsername;
    }

    public StorageAdapterWhereInput chapUsername_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME);
        return this;
    }

    public StorageAdapterWhereInput chapUsername_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME);
        return this;
    }

    public void setChapUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME);
        }
    }

    public boolean getChapUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME);
    }

    public StorageAdapterWhereInput chapUsernameContains(String chapUsernameContains) {

        this.chapUsernameContains = chapUsernameContains;
        return this;
    }

    /**
     * Get chapUsernameContains
     *
     * @return chapUsernameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameContains() {
        return chapUsernameContains;
    }

    public void setChapUsernameContains(String chapUsernameContains) {
        this.chapUsernameContains = chapUsernameContains;
    }

    public StorageAdapterWhereInput chapUsernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_CONTAINS);
        return this;
    }

    public void setChapUsernameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_CONTAINS);
        }
    }

    public boolean getChapUsernameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_CONTAINS);
    }

    public StorageAdapterWhereInput chapUsernameEndsWith(String chapUsernameEndsWith) {

        this.chapUsernameEndsWith = chapUsernameEndsWith;
        return this;
    }

    /**
     * Get chapUsernameEndsWith
     *
     * @return chapUsernameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameEndsWith() {
        return chapUsernameEndsWith;
    }

    public void setChapUsernameEndsWith(String chapUsernameEndsWith) {
        this.chapUsernameEndsWith = chapUsernameEndsWith;
    }

    public StorageAdapterWhereInput chapUsernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH);
        return this;
    }

    public void setChapUsernameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH);
        }
    }

    public boolean getChapUsernameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapUsernameGt(String chapUsernameGt) {

        this.chapUsernameGt = chapUsernameGt;
        return this;
    }

    /**
     * Get chapUsernameGt
     *
     * @return chapUsernameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameGt() {
        return chapUsernameGt;
    }

    public void setChapUsernameGt(String chapUsernameGt) {
        this.chapUsernameGt = chapUsernameGt;
    }

    public StorageAdapterWhereInput chapUsernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_GT);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_GT);
        return this;
    }

    public void setChapUsernameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_GT);
        }
    }

    public boolean getChapUsernameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_GT);
    }

    public StorageAdapterWhereInput chapUsernameGte(String chapUsernameGte) {

        this.chapUsernameGte = chapUsernameGte;
        return this;
    }

    /**
     * Get chapUsernameGte
     *
     * @return chapUsernameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameGte() {
        return chapUsernameGte;
    }

    public void setChapUsernameGte(String chapUsernameGte) {
        this.chapUsernameGte = chapUsernameGte;
    }

    public StorageAdapterWhereInput chapUsernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_GTE);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_GTE);
        return this;
    }

    public void setChapUsernameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_GTE);
        }
    }

    public boolean getChapUsernameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_GTE);
    }

    public StorageAdapterWhereInput chapUsernameIn(List<String> chapUsernameIn) {

        this.chapUsernameIn = chapUsernameIn;
        return this;
    }

    public StorageAdapterWhereInput addChapUsernameInItem(String chapUsernameInItem) {
        if (this.chapUsernameIn == null) {
            this.chapUsernameIn = new ArrayList<String>();
        }
        this.chapUsernameIn.add(chapUsernameInItem);
        return this;
    }

    /**
     * Get chapUsernameIn
     *
     * @return chapUsernameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapUsernameIn() {
        return chapUsernameIn;
    }

    public void setChapUsernameIn(List<String> chapUsernameIn) {
        this.chapUsernameIn = chapUsernameIn;
    }

    public StorageAdapterWhereInput chapUsernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_IN);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_IN);
        return this;
    }

    public void setChapUsernameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_IN);
        }
    }

    public boolean getChapUsernameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_IN);
    }

    public StorageAdapterWhereInput chapUsernameInput(String chapUsernameInput) {

        this.chapUsernameInput = chapUsernameInput;
        return this;
    }

    /**
     * Get chapUsernameInput
     *
     * @return chapUsernameInput
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInput() {
        return chapUsernameInput;
    }

    public void setChapUsernameInput(String chapUsernameInput) {
        this.chapUsernameInput = chapUsernameInput;
    }

    public StorageAdapterWhereInput chapUsernameInput_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInput_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT);
        return this;
    }

    public void setChapUsernameInput_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT);
        }
    }

    public boolean getChapUsernameInput_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT);
    }

    public StorageAdapterWhereInput chapUsernameInputContains(String chapUsernameInputContains) {

        this.chapUsernameInputContains = chapUsernameInputContains;
        return this;
    }

    /**
     * Get chapUsernameInputContains
     *
     * @return chapUsernameInputContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputContains() {
        return chapUsernameInputContains;
    }

    public void setChapUsernameInputContains(String chapUsernameInputContains) {
        this.chapUsernameInputContains = chapUsernameInputContains;
    }

    public StorageAdapterWhereInput chapUsernameInputContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS);
        return this;
    }

    public void setChapUsernameInputContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS);
        }
    }

    public boolean getChapUsernameInputContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS);
    }

    public StorageAdapterWhereInput chapUsernameInputEndsWith(String chapUsernameInputEndsWith) {

        this.chapUsernameInputEndsWith = chapUsernameInputEndsWith;
        return this;
    }

    /**
     * Get chapUsernameInputEndsWith
     *
     * @return chapUsernameInputEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputEndsWith() {
        return chapUsernameInputEndsWith;
    }

    public void setChapUsernameInputEndsWith(String chapUsernameInputEndsWith) {
        this.chapUsernameInputEndsWith = chapUsernameInputEndsWith;
    }

    public StorageAdapterWhereInput chapUsernameInputEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH);
        return this;
    }

    public void setChapUsernameInputEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH);
        }
    }

    public boolean getChapUsernameInputEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapUsernameInputGt(String chapUsernameInputGt) {

        this.chapUsernameInputGt = chapUsernameInputGt;
        return this;
    }

    /**
     * Get chapUsernameInputGt
     *
     * @return chapUsernameInputGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputGt() {
        return chapUsernameInputGt;
    }

    public void setChapUsernameInputGt(String chapUsernameInputGt) {
        this.chapUsernameInputGt = chapUsernameInputGt;
    }

    public StorageAdapterWhereInput chapUsernameInputGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT);
        return this;
    }

    public void setChapUsernameInputGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT);
        }
    }

    public boolean getChapUsernameInputGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT);
    }

    public StorageAdapterWhereInput chapUsernameInputGte(String chapUsernameInputGte) {

        this.chapUsernameInputGte = chapUsernameInputGte;
        return this;
    }

    /**
     * Get chapUsernameInputGte
     *
     * @return chapUsernameInputGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputGte() {
        return chapUsernameInputGte;
    }

    public void setChapUsernameInputGte(String chapUsernameInputGte) {
        this.chapUsernameInputGte = chapUsernameInputGte;
    }

    public StorageAdapterWhereInput chapUsernameInputGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE);
        return this;
    }

    public void setChapUsernameInputGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE);
        }
    }

    public boolean getChapUsernameInputGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE);
    }

    public StorageAdapterWhereInput chapUsernameInputIn(List<String> chapUsernameInputIn) {

        this.chapUsernameInputIn = chapUsernameInputIn;
        return this;
    }

    public StorageAdapterWhereInput addChapUsernameInputInItem(String chapUsernameInputInItem) {
        if (this.chapUsernameInputIn == null) {
            this.chapUsernameInputIn = new ArrayList<String>();
        }
        this.chapUsernameInputIn.add(chapUsernameInputInItem);
        return this;
    }

    /**
     * Get chapUsernameInputIn
     *
     * @return chapUsernameInputIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapUsernameInputIn() {
        return chapUsernameInputIn;
    }

    public void setChapUsernameInputIn(List<String> chapUsernameInputIn) {
        this.chapUsernameInputIn = chapUsernameInputIn;
    }

    public StorageAdapterWhereInput chapUsernameInputIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN);
        return this;
    }

    public void setChapUsernameInputIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN);
        }
    }

    public boolean getChapUsernameInputIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN);
    }

    public StorageAdapterWhereInput chapUsernameInputLt(String chapUsernameInputLt) {

        this.chapUsernameInputLt = chapUsernameInputLt;
        return this;
    }

    /**
     * Get chapUsernameInputLt
     *
     * @return chapUsernameInputLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputLt() {
        return chapUsernameInputLt;
    }

    public void setChapUsernameInputLt(String chapUsernameInputLt) {
        this.chapUsernameInputLt = chapUsernameInputLt;
    }

    public StorageAdapterWhereInput chapUsernameInputLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT);
        return this;
    }

    public void setChapUsernameInputLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT);
        }
    }

    public boolean getChapUsernameInputLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT);
    }

    public StorageAdapterWhereInput chapUsernameInputLte(String chapUsernameInputLte) {

        this.chapUsernameInputLte = chapUsernameInputLte;
        return this;
    }

    /**
     * Get chapUsernameInputLte
     *
     * @return chapUsernameInputLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputLte() {
        return chapUsernameInputLte;
    }

    public void setChapUsernameInputLte(String chapUsernameInputLte) {
        this.chapUsernameInputLte = chapUsernameInputLte;
    }

    public StorageAdapterWhereInput chapUsernameInputLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE);
        return this;
    }

    public void setChapUsernameInputLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE);
        }
    }

    public boolean getChapUsernameInputLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE);
    }

    public StorageAdapterWhereInput chapUsernameInputNot(String chapUsernameInputNot) {

        this.chapUsernameInputNot = chapUsernameInputNot;
        return this;
    }

    /**
     * Get chapUsernameInputNot
     *
     * @return chapUsernameInputNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputNot() {
        return chapUsernameInputNot;
    }

    public void setChapUsernameInputNot(String chapUsernameInputNot) {
        this.chapUsernameInputNot = chapUsernameInputNot;
    }

    public StorageAdapterWhereInput chapUsernameInputNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT);
        return this;
    }

    public void setChapUsernameInputNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT);
        }
    }

    public boolean getChapUsernameInputNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT);
    }

    public StorageAdapterWhereInput chapUsernameInputNotContains(
            String chapUsernameInputNotContains) {

        this.chapUsernameInputNotContains = chapUsernameInputNotContains;
        return this;
    }

    /**
     * Get chapUsernameInputNotContains
     *
     * @return chapUsernameInputNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputNotContains() {
        return chapUsernameInputNotContains;
    }

    public void setChapUsernameInputNotContains(String chapUsernameInputNotContains) {
        this.chapUsernameInputNotContains = chapUsernameInputNotContains;
    }

    public StorageAdapterWhereInput chapUsernameInputNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS);
        return this;
    }

    public void setChapUsernameInputNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS);
        }
    }

    public boolean getChapUsernameInputNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput chapUsernameInputNotEndsWith(
            String chapUsernameInputNotEndsWith) {

        this.chapUsernameInputNotEndsWith = chapUsernameInputNotEndsWith;
        return this;
    }

    /**
     * Get chapUsernameInputNotEndsWith
     *
     * @return chapUsernameInputNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputNotEndsWith() {
        return chapUsernameInputNotEndsWith;
    }

    public void setChapUsernameInputNotEndsWith(String chapUsernameInputNotEndsWith) {
        this.chapUsernameInputNotEndsWith = chapUsernameInputNotEndsWith;
    }

    public StorageAdapterWhereInput chapUsernameInputNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH);
        return this;
    }

    public void setChapUsernameInputNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH);
        }
    }

    public boolean getChapUsernameInputNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapUsernameInputNotIn(List<String> chapUsernameInputNotIn) {

        this.chapUsernameInputNotIn = chapUsernameInputNotIn;
        return this;
    }

    public StorageAdapterWhereInput addChapUsernameInputNotInItem(
            String chapUsernameInputNotInItem) {
        if (this.chapUsernameInputNotIn == null) {
            this.chapUsernameInputNotIn = new ArrayList<String>();
        }
        this.chapUsernameInputNotIn.add(chapUsernameInputNotInItem);
        return this;
    }

    /**
     * Get chapUsernameInputNotIn
     *
     * @return chapUsernameInputNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapUsernameInputNotIn() {
        return chapUsernameInputNotIn;
    }

    public void setChapUsernameInputNotIn(List<String> chapUsernameInputNotIn) {
        this.chapUsernameInputNotIn = chapUsernameInputNotIn;
    }

    public StorageAdapterWhereInput chapUsernameInputNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN);
        return this;
    }

    public void setChapUsernameInputNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN);
        }
    }

    public boolean getChapUsernameInputNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN);
    }

    public StorageAdapterWhereInput chapUsernameInputNotStartsWith(
            String chapUsernameInputNotStartsWith) {

        this.chapUsernameInputNotStartsWith = chapUsernameInputNotStartsWith;
        return this;
    }

    /**
     * Get chapUsernameInputNotStartsWith
     *
     * @return chapUsernameInputNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputNotStartsWith() {
        return chapUsernameInputNotStartsWith;
    }

    public void setChapUsernameInputNotStartsWith(String chapUsernameInputNotStartsWith) {
        this.chapUsernameInputNotStartsWith = chapUsernameInputNotStartsWith;
    }

    public StorageAdapterWhereInput chapUsernameInputNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH);
        return this;
    }

    public void setChapUsernameInputNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH);
        }
    }

    public boolean getChapUsernameInputNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapUsernameInputStartsWith(
            String chapUsernameInputStartsWith) {

        this.chapUsernameInputStartsWith = chapUsernameInputStartsWith;
        return this;
    }

    /**
     * Get chapUsernameInputStartsWith
     *
     * @return chapUsernameInputStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameInputStartsWith() {
        return chapUsernameInputStartsWith;
    }

    public void setChapUsernameInputStartsWith(String chapUsernameInputStartsWith) {
        this.chapUsernameInputStartsWith = chapUsernameInputStartsWith;
    }

    public StorageAdapterWhereInput chapUsernameInputStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameInputStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH);
        return this;
    }

    public void setChapUsernameInputStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH);
        }
    }

    public boolean getChapUsernameInputStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapUsernameLt(String chapUsernameLt) {

        this.chapUsernameLt = chapUsernameLt;
        return this;
    }

    /**
     * Get chapUsernameLt
     *
     * @return chapUsernameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameLt() {
        return chapUsernameLt;
    }

    public void setChapUsernameLt(String chapUsernameLt) {
        this.chapUsernameLt = chapUsernameLt;
    }

    public StorageAdapterWhereInput chapUsernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_LT);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_LT);
        return this;
    }

    public void setChapUsernameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_LT);
        }
    }

    public boolean getChapUsernameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_LT);
    }

    public StorageAdapterWhereInput chapUsernameLte(String chapUsernameLte) {

        this.chapUsernameLte = chapUsernameLte;
        return this;
    }

    /**
     * Get chapUsernameLte
     *
     * @return chapUsernameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameLte() {
        return chapUsernameLte;
    }

    public void setChapUsernameLte(String chapUsernameLte) {
        this.chapUsernameLte = chapUsernameLte;
    }

    public StorageAdapterWhereInput chapUsernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_LTE);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_LTE);
        return this;
    }

    public void setChapUsernameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_LTE);
        }
    }

    public boolean getChapUsernameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_LTE);
    }

    public StorageAdapterWhereInput chapUsernameNot(String chapUsernameNot) {

        this.chapUsernameNot = chapUsernameNot;
        return this;
    }

    /**
     * Get chapUsernameNot
     *
     * @return chapUsernameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameNot() {
        return chapUsernameNot;
    }

    public void setChapUsernameNot(String chapUsernameNot) {
        this.chapUsernameNot = chapUsernameNot;
    }

    public StorageAdapterWhereInput chapUsernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT);
        return this;
    }

    public void setChapUsernameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT);
        }
    }

    public boolean getChapUsernameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_NOT);
    }

    public StorageAdapterWhereInput chapUsernameNotContains(String chapUsernameNotContains) {

        this.chapUsernameNotContains = chapUsernameNotContains;
        return this;
    }

    /**
     * Get chapUsernameNotContains
     *
     * @return chapUsernameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameNotContains() {
        return chapUsernameNotContains;
    }

    public void setChapUsernameNotContains(String chapUsernameNotContains) {
        this.chapUsernameNotContains = chapUsernameNotContains;
    }

    public StorageAdapterWhereInput chapUsernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS);
        return this;
    }

    public void setChapUsernameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS);
        }
    }

    public boolean getChapUsernameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput chapUsernameNotEndsWith(String chapUsernameNotEndsWith) {

        this.chapUsernameNotEndsWith = chapUsernameNotEndsWith;
        return this;
    }

    /**
     * Get chapUsernameNotEndsWith
     *
     * @return chapUsernameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameNotEndsWith() {
        return chapUsernameNotEndsWith;
    }

    public void setChapUsernameNotEndsWith(String chapUsernameNotEndsWith) {
        this.chapUsernameNotEndsWith = chapUsernameNotEndsWith;
    }

    public StorageAdapterWhereInput chapUsernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setChapUsernameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getChapUsernameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput chapUsernameNotIn(List<String> chapUsernameNotIn) {

        this.chapUsernameNotIn = chapUsernameNotIn;
        return this;
    }

    public StorageAdapterWhereInput addChapUsernameNotInItem(String chapUsernameNotInItem) {
        if (this.chapUsernameNotIn == null) {
            this.chapUsernameNotIn = new ArrayList<String>();
        }
        this.chapUsernameNotIn.add(chapUsernameNotInItem);
        return this;
    }

    /**
     * Get chapUsernameNotIn
     *
     * @return chapUsernameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getChapUsernameNotIn() {
        return chapUsernameNotIn;
    }

    public void setChapUsernameNotIn(List<String> chapUsernameNotIn) {
        this.chapUsernameNotIn = chapUsernameNotIn;
    }

    public StorageAdapterWhereInput chapUsernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_IN);
        return this;
    }

    public void setChapUsernameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_IN);
        }
    }

    public boolean getChapUsernameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_NOT_IN);
    }

    public StorageAdapterWhereInput chapUsernameNotStartsWith(String chapUsernameNotStartsWith) {

        this.chapUsernameNotStartsWith = chapUsernameNotStartsWith;
        return this;
    }

    /**
     * Get chapUsernameNotStartsWith
     *
     * @return chapUsernameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameNotStartsWith() {
        return chapUsernameNotStartsWith;
    }

    public void setChapUsernameNotStartsWith(String chapUsernameNotStartsWith) {
        this.chapUsernameNotStartsWith = chapUsernameNotStartsWith;
    }

    public StorageAdapterWhereInput chapUsernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setChapUsernameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getChapUsernameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput chapUsernameStartsWith(String chapUsernameStartsWith) {

        this.chapUsernameStartsWith = chapUsernameStartsWith;
        return this;
    }

    /**
     * Get chapUsernameStartsWith
     *
     * @return chapUsernameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getChapUsernameStartsWith() {
        return chapUsernameStartsWith;
    }

    public void setChapUsernameStartsWith(String chapUsernameStartsWith) {
        this.chapUsernameStartsWith = chapUsernameStartsWith;
    }

    public StorageAdapterWhereInput chapUsernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput chapUsernameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH);
        return this;
    }

    public void setChapUsernameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH);
        }
    }

    public boolean getChapUsernameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH);
    }

    public StorageAdapterWhereInput dataVersion(Integer dataVersion) {

        this.dataVersion = dataVersion;
        return this;
    }

    /**
     * Get dataVersion
     *
     * @return dataVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public StorageAdapterWhereInput dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public StorageAdapterWhereInput dataVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public void setDataVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        }
    }

    public boolean getDataVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION);
    }

    public StorageAdapterWhereInput dataVersionGt(Integer dataVersionGt) {

        this.dataVersionGt = dataVersionGt;
        return this;
    }

    /**
     * Get dataVersionGt
     *
     * @return dataVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGt() {
        return dataVersionGt;
    }

    public void setDataVersionGt(Integer dataVersionGt) {
        this.dataVersionGt = dataVersionGt;
    }

    public StorageAdapterWhereInput dataVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public StorageAdapterWhereInput dataVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public void setDataVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        }
    }

    public boolean getDataVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GT);
    }

    public StorageAdapterWhereInput dataVersionGte(Integer dataVersionGte) {

        this.dataVersionGte = dataVersionGte;
        return this;
    }

    /**
     * Get dataVersionGte
     *
     * @return dataVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGte() {
        return dataVersionGte;
    }

    public void setDataVersionGte(Integer dataVersionGte) {
        this.dataVersionGte = dataVersionGte;
    }

    public StorageAdapterWhereInput dataVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public StorageAdapterWhereInput dataVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public void setDataVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        }
    }

    public boolean getDataVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GTE);
    }

    public StorageAdapterWhereInput dataVersionIn(List<Integer> dataVersionIn) {

        this.dataVersionIn = dataVersionIn;
        return this;
    }

    public StorageAdapterWhereInput addDataVersionInItem(Integer dataVersionInItem) {
        if (this.dataVersionIn == null) {
            this.dataVersionIn = new ArrayList<Integer>();
        }
        this.dataVersionIn.add(dataVersionInItem);
        return this;
    }

    /**
     * Get dataVersionIn
     *
     * @return dataVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionIn() {
        return dataVersionIn;
    }

    public void setDataVersionIn(List<Integer> dataVersionIn) {
        this.dataVersionIn = dataVersionIn;
    }

    public StorageAdapterWhereInput dataVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public StorageAdapterWhereInput dataVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public void setDataVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        }
    }

    public boolean getDataVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_IN);
    }

    public StorageAdapterWhereInput dataVersionLt(Integer dataVersionLt) {

        this.dataVersionLt = dataVersionLt;
        return this;
    }

    /**
     * Get dataVersionLt
     *
     * @return dataVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLt() {
        return dataVersionLt;
    }

    public void setDataVersionLt(Integer dataVersionLt) {
        this.dataVersionLt = dataVersionLt;
    }

    public StorageAdapterWhereInput dataVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public StorageAdapterWhereInput dataVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public void setDataVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        }
    }

    public boolean getDataVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LT);
    }

    public StorageAdapterWhereInput dataVersionLte(Integer dataVersionLte) {

        this.dataVersionLte = dataVersionLte;
        return this;
    }

    /**
     * Get dataVersionLte
     *
     * @return dataVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLte() {
        return dataVersionLte;
    }

    public void setDataVersionLte(Integer dataVersionLte) {
        this.dataVersionLte = dataVersionLte;
    }

    public StorageAdapterWhereInput dataVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public StorageAdapterWhereInput dataVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public void setDataVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        }
    }

    public boolean getDataVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LTE);
    }

    public StorageAdapterWhereInput dataVersionNot(Integer dataVersionNot) {

        this.dataVersionNot = dataVersionNot;
        return this;
    }

    /**
     * Get dataVersionNot
     *
     * @return dataVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionNot() {
        return dataVersionNot;
    }

    public void setDataVersionNot(Integer dataVersionNot) {
        this.dataVersionNot = dataVersionNot;
    }

    public StorageAdapterWhereInput dataVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public StorageAdapterWhereInput dataVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public void setDataVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        }
    }

    public boolean getDataVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT);
    }

    public StorageAdapterWhereInput dataVersionNotIn(List<Integer> dataVersionNotIn) {

        this.dataVersionNotIn = dataVersionNotIn;
        return this;
    }

    public StorageAdapterWhereInput addDataVersionNotInItem(Integer dataVersionNotInItem) {
        if (this.dataVersionNotIn == null) {
            this.dataVersionNotIn = new ArrayList<Integer>();
        }
        this.dataVersionNotIn.add(dataVersionNotInItem);
        return this;
    }

    /**
     * Get dataVersionNotIn
     *
     * @return dataVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionNotIn() {
        return dataVersionNotIn;
    }

    public void setDataVersionNotIn(List<Integer> dataVersionNotIn) {
        this.dataVersionNotIn = dataVersionNotIn;
    }

    public StorageAdapterWhereInput dataVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput dataVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public void setDataVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        }
    }

    public boolean getDataVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
    }

    public StorageAdapterWhereInput deviceNum(Integer deviceNum) {

        this.deviceNum = deviceNum;
        return this;
    }

    /**
     * Get deviceNum
     *
     * @return deviceNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }

    public StorageAdapterWhereInput deviceNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM);
        return this;
    }

    public StorageAdapterWhereInput deviceNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM);
        return this;
    }

    public void setDeviceNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM);
        }
    }

    public boolean getDeviceNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM);
    }

    public StorageAdapterWhereInput deviceNumGt(Integer deviceNumGt) {

        this.deviceNumGt = deviceNumGt;
        return this;
    }

    /**
     * Get deviceNumGt
     *
     * @return deviceNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDeviceNumGt() {
        return deviceNumGt;
    }

    public void setDeviceNumGt(Integer deviceNumGt) {
        this.deviceNumGt = deviceNumGt;
    }

    public StorageAdapterWhereInput deviceNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_GT);
        return this;
    }

    public StorageAdapterWhereInput deviceNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_GT);
        return this;
    }

    public void setDeviceNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_GT);
        }
    }

    public boolean getDeviceNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM_GT);
    }

    public StorageAdapterWhereInput deviceNumGte(Integer deviceNumGte) {

        this.deviceNumGte = deviceNumGte;
        return this;
    }

    /**
     * Get deviceNumGte
     *
     * @return deviceNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDeviceNumGte() {
        return deviceNumGte;
    }

    public void setDeviceNumGte(Integer deviceNumGte) {
        this.deviceNumGte = deviceNumGte;
    }

    public StorageAdapterWhereInput deviceNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_GTE);
        return this;
    }

    public StorageAdapterWhereInput deviceNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_GTE);
        return this;
    }

    public void setDeviceNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_GTE);
        }
    }

    public boolean getDeviceNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM_GTE);
    }

    public StorageAdapterWhereInput deviceNumIn(List<Integer> deviceNumIn) {

        this.deviceNumIn = deviceNumIn;
        return this;
    }

    public StorageAdapterWhereInput addDeviceNumInItem(Integer deviceNumInItem) {
        if (this.deviceNumIn == null) {
            this.deviceNumIn = new ArrayList<Integer>();
        }
        this.deviceNumIn.add(deviceNumInItem);
        return this;
    }

    /**
     * Get deviceNumIn
     *
     * @return deviceNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDeviceNumIn() {
        return deviceNumIn;
    }

    public void setDeviceNumIn(List<Integer> deviceNumIn) {
        this.deviceNumIn = deviceNumIn;
    }

    public StorageAdapterWhereInput deviceNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_IN);
        return this;
    }

    public StorageAdapterWhereInput deviceNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_IN);
        return this;
    }

    public void setDeviceNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_IN);
        }
    }

    public boolean getDeviceNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM_IN);
    }

    public StorageAdapterWhereInput deviceNumLt(Integer deviceNumLt) {

        this.deviceNumLt = deviceNumLt;
        return this;
    }

    /**
     * Get deviceNumLt
     *
     * @return deviceNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDeviceNumLt() {
        return deviceNumLt;
    }

    public void setDeviceNumLt(Integer deviceNumLt) {
        this.deviceNumLt = deviceNumLt;
    }

    public StorageAdapterWhereInput deviceNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_LT);
        return this;
    }

    public StorageAdapterWhereInput deviceNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_LT);
        return this;
    }

    public void setDeviceNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_LT);
        }
    }

    public boolean getDeviceNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM_LT);
    }

    public StorageAdapterWhereInput deviceNumLte(Integer deviceNumLte) {

        this.deviceNumLte = deviceNumLte;
        return this;
    }

    /**
     * Get deviceNumLte
     *
     * @return deviceNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDeviceNumLte() {
        return deviceNumLte;
    }

    public void setDeviceNumLte(Integer deviceNumLte) {
        this.deviceNumLte = deviceNumLte;
    }

    public StorageAdapterWhereInput deviceNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_LTE);
        return this;
    }

    public StorageAdapterWhereInput deviceNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_LTE);
        return this;
    }

    public void setDeviceNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_LTE);
        }
    }

    public boolean getDeviceNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM_LTE);
    }

    public StorageAdapterWhereInput deviceNumNot(Integer deviceNumNot) {

        this.deviceNumNot = deviceNumNot;
        return this;
    }

    /**
     * Get deviceNumNot
     *
     * @return deviceNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDeviceNumNot() {
        return deviceNumNot;
    }

    public void setDeviceNumNot(Integer deviceNumNot) {
        this.deviceNumNot = deviceNumNot;
    }

    public StorageAdapterWhereInput deviceNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_NOT);
        return this;
    }

    public StorageAdapterWhereInput deviceNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_NOT);
        return this;
    }

    public void setDeviceNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_NOT);
        }
    }

    public boolean getDeviceNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM_NOT);
    }

    public StorageAdapterWhereInput deviceNumNotIn(List<Integer> deviceNumNotIn) {

        this.deviceNumNotIn = deviceNumNotIn;
        return this;
    }

    public StorageAdapterWhereInput addDeviceNumNotInItem(Integer deviceNumNotInItem) {
        if (this.deviceNumNotIn == null) {
            this.deviceNumNotIn = new ArrayList<Integer>();
        }
        this.deviceNumNotIn.add(deviceNumNotInItem);
        return this;
    }

    /**
     * Get deviceNumNotIn
     *
     * @return deviceNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDeviceNumNotIn() {
        return deviceNumNotIn;
    }

    public void setDeviceNumNotIn(List<Integer> deviceNumNotIn) {
        this.deviceNumNotIn = deviceNumNotIn;
    }

    public StorageAdapterWhereInput deviceNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput deviceNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_NOT_IN);
        return this;
    }

    public void setDeviceNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_NUM_NOT_IN);
        }
    }

    public boolean getDeviceNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_NUM_NOT_IN);
    }

    public StorageAdapterWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public StorageAdapterWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public StorageAdapterWhereInput entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public StorageAdapterWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public StorageAdapterWhereInput addEntityAsyncStatusInItem(
            EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public StorageAdapterWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public StorageAdapterWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public StorageAdapterWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public StorageAdapterWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public StorageAdapterWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public StorageAdapterWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public StorageAdapterWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public StorageAdapterWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public StorageAdapterWhereInput firmwareVersion(String firmwareVersion) {

        this.firmwareVersion = firmwareVersion;
        return this;
    }

    /**
     * Get firmwareVersion
     *
     * @return firmwareVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public StorageAdapterWhereInput firmwareVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION);
        return this;
    }

    public void setFirmwareVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION);
        }
    }

    public boolean getFirmwareVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION);
    }

    public StorageAdapterWhereInput firmwareVersionContains(String firmwareVersionContains) {

        this.firmwareVersionContains = firmwareVersionContains;
        return this;
    }

    /**
     * Get firmwareVersionContains
     *
     * @return firmwareVersionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionContains() {
        return firmwareVersionContains;
    }

    public void setFirmwareVersionContains(String firmwareVersionContains) {
        this.firmwareVersionContains = firmwareVersionContains;
    }

    public StorageAdapterWhereInput firmwareVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_CONTAINS);
        return this;
    }

    public void setFirmwareVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_CONTAINS);
        }
    }

    public boolean getFirmwareVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_CONTAINS);
    }

    public StorageAdapterWhereInput firmwareVersionEndsWith(String firmwareVersionEndsWith) {

        this.firmwareVersionEndsWith = firmwareVersionEndsWith;
        return this;
    }

    /**
     * Get firmwareVersionEndsWith
     *
     * @return firmwareVersionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionEndsWith() {
        return firmwareVersionEndsWith;
    }

    public void setFirmwareVersionEndsWith(String firmwareVersionEndsWith) {
        this.firmwareVersionEndsWith = firmwareVersionEndsWith;
    }

    public StorageAdapterWhereInput firmwareVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_ENDS_WITH);
        return this;
    }

    public void setFirmwareVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_ENDS_WITH);
        }
    }

    public boolean getFirmwareVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_ENDS_WITH);
    }

    public StorageAdapterWhereInput firmwareVersionGt(String firmwareVersionGt) {

        this.firmwareVersionGt = firmwareVersionGt;
        return this;
    }

    /**
     * Get firmwareVersionGt
     *
     * @return firmwareVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionGt() {
        return firmwareVersionGt;
    }

    public void setFirmwareVersionGt(String firmwareVersionGt) {
        this.firmwareVersionGt = firmwareVersionGt;
    }

    public StorageAdapterWhereInput firmwareVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_GT);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_GT);
        return this;
    }

    public void setFirmwareVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_GT);
        }
    }

    public boolean getFirmwareVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_GT);
    }

    public StorageAdapterWhereInput firmwareVersionGte(String firmwareVersionGte) {

        this.firmwareVersionGte = firmwareVersionGte;
        return this;
    }

    /**
     * Get firmwareVersionGte
     *
     * @return firmwareVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionGte() {
        return firmwareVersionGte;
    }

    public void setFirmwareVersionGte(String firmwareVersionGte) {
        this.firmwareVersionGte = firmwareVersionGte;
    }

    public StorageAdapterWhereInput firmwareVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_GTE);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_GTE);
        return this;
    }

    public void setFirmwareVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_GTE);
        }
    }

    public boolean getFirmwareVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_GTE);
    }

    public StorageAdapterWhereInput firmwareVersionIn(List<String> firmwareVersionIn) {

        this.firmwareVersionIn = firmwareVersionIn;
        return this;
    }

    public StorageAdapterWhereInput addFirmwareVersionInItem(String firmwareVersionInItem) {
        if (this.firmwareVersionIn == null) {
            this.firmwareVersionIn = new ArrayList<String>();
        }
        this.firmwareVersionIn.add(firmwareVersionInItem);
        return this;
    }

    /**
     * Get firmwareVersionIn
     *
     * @return firmwareVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFirmwareVersionIn() {
        return firmwareVersionIn;
    }

    public void setFirmwareVersionIn(List<String> firmwareVersionIn) {
        this.firmwareVersionIn = firmwareVersionIn;
    }

    public StorageAdapterWhereInput firmwareVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_IN);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_IN);
        return this;
    }

    public void setFirmwareVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_IN);
        }
    }

    public boolean getFirmwareVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_IN);
    }

    public StorageAdapterWhereInput firmwareVersionLt(String firmwareVersionLt) {

        this.firmwareVersionLt = firmwareVersionLt;
        return this;
    }

    /**
     * Get firmwareVersionLt
     *
     * @return firmwareVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionLt() {
        return firmwareVersionLt;
    }

    public void setFirmwareVersionLt(String firmwareVersionLt) {
        this.firmwareVersionLt = firmwareVersionLt;
    }

    public StorageAdapterWhereInput firmwareVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_LT);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_LT);
        return this;
    }

    public void setFirmwareVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_LT);
        }
    }

    public boolean getFirmwareVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_LT);
    }

    public StorageAdapterWhereInput firmwareVersionLte(String firmwareVersionLte) {

        this.firmwareVersionLte = firmwareVersionLte;
        return this;
    }

    /**
     * Get firmwareVersionLte
     *
     * @return firmwareVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionLte() {
        return firmwareVersionLte;
    }

    public void setFirmwareVersionLte(String firmwareVersionLte) {
        this.firmwareVersionLte = firmwareVersionLte;
    }

    public StorageAdapterWhereInput firmwareVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_LTE);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_LTE);
        return this;
    }

    public void setFirmwareVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_LTE);
        }
    }

    public boolean getFirmwareVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_LTE);
    }

    public StorageAdapterWhereInput firmwareVersionNot(String firmwareVersionNot) {

        this.firmwareVersionNot = firmwareVersionNot;
        return this;
    }

    /**
     * Get firmwareVersionNot
     *
     * @return firmwareVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionNot() {
        return firmwareVersionNot;
    }

    public void setFirmwareVersionNot(String firmwareVersionNot) {
        this.firmwareVersionNot = firmwareVersionNot;
    }

    public StorageAdapterWhereInput firmwareVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT);
        return this;
    }

    public void setFirmwareVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT);
        }
    }

    public boolean getFirmwareVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_NOT);
    }

    public StorageAdapterWhereInput firmwareVersionNotContains(String firmwareVersionNotContains) {

        this.firmwareVersionNotContains = firmwareVersionNotContains;
        return this;
    }

    /**
     * Get firmwareVersionNotContains
     *
     * @return firmwareVersionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionNotContains() {
        return firmwareVersionNotContains;
    }

    public void setFirmwareVersionNotContains(String firmwareVersionNotContains) {
        this.firmwareVersionNotContains = firmwareVersionNotContains;
    }

    public StorageAdapterWhereInput firmwareVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setFirmwareVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getFirmwareVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput firmwareVersionNotEndsWith(String firmwareVersionNotEndsWith) {

        this.firmwareVersionNotEndsWith = firmwareVersionNotEndsWith;
        return this;
    }

    /**
     * Get firmwareVersionNotEndsWith
     *
     * @return firmwareVersionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionNotEndsWith() {
        return firmwareVersionNotEndsWith;
    }

    public void setFirmwareVersionNotEndsWith(String firmwareVersionNotEndsWith) {
        this.firmwareVersionNotEndsWith = firmwareVersionNotEndsWith;
    }

    public StorageAdapterWhereInput firmwareVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setFirmwareVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getFirmwareVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput firmwareVersionNotIn(List<String> firmwareVersionNotIn) {

        this.firmwareVersionNotIn = firmwareVersionNotIn;
        return this;
    }

    public StorageAdapterWhereInput addFirmwareVersionNotInItem(String firmwareVersionNotInItem) {
        if (this.firmwareVersionNotIn == null) {
            this.firmwareVersionNotIn = new ArrayList<String>();
        }
        this.firmwareVersionNotIn.add(firmwareVersionNotInItem);
        return this;
    }

    /**
     * Get firmwareVersionNotIn
     *
     * @return firmwareVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFirmwareVersionNotIn() {
        return firmwareVersionNotIn;
    }

    public void setFirmwareVersionNotIn(List<String> firmwareVersionNotIn) {
        this.firmwareVersionNotIn = firmwareVersionNotIn;
    }

    public StorageAdapterWhereInput firmwareVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_IN);
        return this;
    }

    public void setFirmwareVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_IN);
        }
    }

    public boolean getFirmwareVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_IN);
    }

    public StorageAdapterWhereInput firmwareVersionNotStartsWith(
            String firmwareVersionNotStartsWith) {

        this.firmwareVersionNotStartsWith = firmwareVersionNotStartsWith;
        return this;
    }

    /**
     * Get firmwareVersionNotStartsWith
     *
     * @return firmwareVersionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionNotStartsWith() {
        return firmwareVersionNotStartsWith;
    }

    public void setFirmwareVersionNotStartsWith(String firmwareVersionNotStartsWith) {
        this.firmwareVersionNotStartsWith = firmwareVersionNotStartsWith;
    }

    public StorageAdapterWhereInput firmwareVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setFirmwareVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getFirmwareVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput firmwareVersionStartsWith(String firmwareVersionStartsWith) {

        this.firmwareVersionStartsWith = firmwareVersionStartsWith;
        return this;
    }

    /**
     * Get firmwareVersionStartsWith
     *
     * @return firmwareVersionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareVersionStartsWith() {
        return firmwareVersionStartsWith;
    }

    public void setFirmwareVersionStartsWith(String firmwareVersionStartsWith) {
        this.firmwareVersionStartsWith = firmwareVersionStartsWith;
    }

    public StorageAdapterWhereInput firmwareVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput firmwareVersionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_STARTS_WITH);
        return this;
    }

    public void setFirmwareVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_VERSION_STARTS_WITH);
        }
    }

    public boolean getFirmwareVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_VERSION_STARTS_WITH);
    }

    public StorageAdapterWhereInput host(HostWhereInput host) {

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
    public HostWhereInput getHost() {
        return host;
    }

    public void setHost(HostWhereInput host) {
        this.host = host;
    }

    public StorageAdapterWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public StorageAdapterWhereInput host_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput id(String id) {

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

    public StorageAdapterWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public StorageAdapterWhereInput id_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idContains(String idContains) {

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

    public StorageAdapterWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput idContains_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idEndsWith(String idEndsWith) {

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

    public StorageAdapterWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput idEndsWith_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idGt(String idGt) {

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

    public StorageAdapterWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public StorageAdapterWhereInput idGt_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idGte(String idGte) {

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

    public StorageAdapterWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public StorageAdapterWhereInput idGte_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public StorageAdapterWhereInput addIdInItem(String idInItem) {
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

    public StorageAdapterWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public StorageAdapterWhereInput idIn_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idLt(String idLt) {

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

    public StorageAdapterWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public StorageAdapterWhereInput idLt_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idLte(String idLte) {

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

    public StorageAdapterWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public StorageAdapterWhereInput idLte_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idNot(String idNot) {

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

    public StorageAdapterWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public StorageAdapterWhereInput idNot_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idNotContains(String idNotContains) {

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

    public StorageAdapterWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput idNotContains_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public StorageAdapterWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public StorageAdapterWhereInput addIdNotInItem(String idNotInItem) {
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

    public StorageAdapterWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput idNotIn_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public StorageAdapterWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput idStartsWith(String idStartsWith) {

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

    public StorageAdapterWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput idStartsWith_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput identifier(String identifier) {

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

    public StorageAdapterWhereInput identifier_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER);
        return this;
    }

    public StorageAdapterWhereInput identifier_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput identifierContains(String identifierContains) {

        this.identifierContains = identifierContains;
        return this;
    }

    /**
     * Get identifierContains
     *
     * @return identifierContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierContains() {
        return identifierContains;
    }

    public void setIdentifierContains(String identifierContains) {
        this.identifierContains = identifierContains;
    }

    public StorageAdapterWhereInput identifierContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput identifierContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_CONTAINS);
        return this;
    }

    public void setIdentifierContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_CONTAINS);
        }
    }

    public boolean getIdentifierContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_CONTAINS);
    }

    public StorageAdapterWhereInput identifierEndsWith(String identifierEndsWith) {

        this.identifierEndsWith = identifierEndsWith;
        return this;
    }

    /**
     * Get identifierEndsWith
     *
     * @return identifierEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierEndsWith() {
        return identifierEndsWith;
    }

    public void setIdentifierEndsWith(String identifierEndsWith) {
        this.identifierEndsWith = identifierEndsWith;
    }

    public StorageAdapterWhereInput identifierEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput identifierEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_ENDS_WITH);
        return this;
    }

    public void setIdentifierEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_ENDS_WITH);
        }
    }

    public boolean getIdentifierEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_ENDS_WITH);
    }

    public StorageAdapterWhereInput identifierGt(String identifierGt) {

        this.identifierGt = identifierGt;
        return this;
    }

    /**
     * Get identifierGt
     *
     * @return identifierGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierGt() {
        return identifierGt;
    }

    public void setIdentifierGt(String identifierGt) {
        this.identifierGt = identifierGt;
    }

    public StorageAdapterWhereInput identifierGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_GT);
        return this;
    }

    public StorageAdapterWhereInput identifierGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_GT);
        return this;
    }

    public void setIdentifierGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_GT);
        }
    }

    public boolean getIdentifierGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_GT);
    }

    public StorageAdapterWhereInput identifierGte(String identifierGte) {

        this.identifierGte = identifierGte;
        return this;
    }

    /**
     * Get identifierGte
     *
     * @return identifierGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierGte() {
        return identifierGte;
    }

    public void setIdentifierGte(String identifierGte) {
        this.identifierGte = identifierGte;
    }

    public StorageAdapterWhereInput identifierGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_GTE);
        return this;
    }

    public StorageAdapterWhereInput identifierGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_GTE);
        return this;
    }

    public void setIdentifierGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_GTE);
        }
    }

    public boolean getIdentifierGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_GTE);
    }

    public StorageAdapterWhereInput identifierIn(List<String> identifierIn) {

        this.identifierIn = identifierIn;
        return this;
    }

    public StorageAdapterWhereInput addIdentifierInItem(String identifierInItem) {
        if (this.identifierIn == null) {
            this.identifierIn = new ArrayList<String>();
        }
        this.identifierIn.add(identifierInItem);
        return this;
    }

    /**
     * Get identifierIn
     *
     * @return identifierIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdentifierIn() {
        return identifierIn;
    }

    public void setIdentifierIn(List<String> identifierIn) {
        this.identifierIn = identifierIn;
    }

    public StorageAdapterWhereInput identifierIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_IN);
        return this;
    }

    public StorageAdapterWhereInput identifierIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_IN);
        return this;
    }

    public void setIdentifierIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_IN);
        }
    }

    public boolean getIdentifierIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_IN);
    }

    public StorageAdapterWhereInput identifierLt(String identifierLt) {

        this.identifierLt = identifierLt;
        return this;
    }

    /**
     * Get identifierLt
     *
     * @return identifierLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierLt() {
        return identifierLt;
    }

    public void setIdentifierLt(String identifierLt) {
        this.identifierLt = identifierLt;
    }

    public StorageAdapterWhereInput identifierLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_LT);
        return this;
    }

    public StorageAdapterWhereInput identifierLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_LT);
        return this;
    }

    public void setIdentifierLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_LT);
        }
    }

    public boolean getIdentifierLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_LT);
    }

    public StorageAdapterWhereInput identifierLte(String identifierLte) {

        this.identifierLte = identifierLte;
        return this;
    }

    /**
     * Get identifierLte
     *
     * @return identifierLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierLte() {
        return identifierLte;
    }

    public void setIdentifierLte(String identifierLte) {
        this.identifierLte = identifierLte;
    }

    public StorageAdapterWhereInput identifierLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_LTE);
        return this;
    }

    public StorageAdapterWhereInput identifierLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_LTE);
        return this;
    }

    public void setIdentifierLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_LTE);
        }
    }

    public boolean getIdentifierLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_LTE);
    }

    public StorageAdapterWhereInput identifierNot(String identifierNot) {

        this.identifierNot = identifierNot;
        return this;
    }

    /**
     * Get identifierNot
     *
     * @return identifierNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierNot() {
        return identifierNot;
    }

    public void setIdentifierNot(String identifierNot) {
        this.identifierNot = identifierNot;
    }

    public StorageAdapterWhereInput identifierNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT);
        return this;
    }

    public StorageAdapterWhereInput identifierNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT);
        return this;
    }

    public void setIdentifierNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT);
        }
    }

    public boolean getIdentifierNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_NOT);
    }

    public StorageAdapterWhereInput identifierNotContains(String identifierNotContains) {

        this.identifierNotContains = identifierNotContains;
        return this;
    }

    /**
     * Get identifierNotContains
     *
     * @return identifierNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierNotContains() {
        return identifierNotContains;
    }

    public void setIdentifierNotContains(String identifierNotContains) {
        this.identifierNotContains = identifierNotContains;
    }

    public StorageAdapterWhereInput identifierNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput identifierNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_CONTAINS);
        return this;
    }

    public void setIdentifierNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_CONTAINS);
        }
    }

    public boolean getIdentifierNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput identifierNotEndsWith(String identifierNotEndsWith) {

        this.identifierNotEndsWith = identifierNotEndsWith;
        return this;
    }

    /**
     * Get identifierNotEndsWith
     *
     * @return identifierNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierNotEndsWith() {
        return identifierNotEndsWith;
    }

    public void setIdentifierNotEndsWith(String identifierNotEndsWith) {
        this.identifierNotEndsWith = identifierNotEndsWith;
    }

    public StorageAdapterWhereInput identifierNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput identifierNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_ENDS_WITH);
        return this;
    }

    public void setIdentifierNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_ENDS_WITH);
        }
    }

    public boolean getIdentifierNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput identifierNotIn(List<String> identifierNotIn) {

        this.identifierNotIn = identifierNotIn;
        return this;
    }

    public StorageAdapterWhereInput addIdentifierNotInItem(String identifierNotInItem) {
        if (this.identifierNotIn == null) {
            this.identifierNotIn = new ArrayList<String>();
        }
        this.identifierNotIn.add(identifierNotInItem);
        return this;
    }

    /**
     * Get identifierNotIn
     *
     * @return identifierNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdentifierNotIn() {
        return identifierNotIn;
    }

    public void setIdentifierNotIn(List<String> identifierNotIn) {
        this.identifierNotIn = identifierNotIn;
    }

    public StorageAdapterWhereInput identifierNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput identifierNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_IN);
        return this;
    }

    public void setIdentifierNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_IN);
        }
    }

    public boolean getIdentifierNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_NOT_IN);
    }

    public StorageAdapterWhereInput identifierNotStartsWith(String identifierNotStartsWith) {

        this.identifierNotStartsWith = identifierNotStartsWith;
        return this;
    }

    /**
     * Get identifierNotStartsWith
     *
     * @return identifierNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierNotStartsWith() {
        return identifierNotStartsWith;
    }

    public void setIdentifierNotStartsWith(String identifierNotStartsWith) {
        this.identifierNotStartsWith = identifierNotStartsWith;
    }

    public StorageAdapterWhereInput identifierNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput identifierNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_STARTS_WITH);
        return this;
    }

    public void setIdentifierNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_NOT_STARTS_WITH);
        }
    }

    public boolean getIdentifierNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput identifierStartsWith(String identifierStartsWith) {

        this.identifierStartsWith = identifierStartsWith;
        return this;
    }

    /**
     * Get identifierStartsWith
     *
     * @return identifierStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdentifierStartsWith() {
        return identifierStartsWith;
    }

    public void setIdentifierStartsWith(String identifierStartsWith) {
        this.identifierStartsWith = identifierStartsWith;
    }

    public StorageAdapterWhereInput identifierStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput identifierStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_STARTS_WITH);
        return this;
    }

    public void setIdentifierStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTIFIER_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTIFIER_STARTS_WITH);
        }
    }

    public boolean getIdentifierStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTIFIER_STARTS_WITH);
    }

    public StorageAdapterWhereInput identityVerificationMethod(
            IdentityVerificationMethod identityVerificationMethod) {

        this.identityVerificationMethod = identityVerificationMethod;
        return this;
    }

    /**
     * Get identityVerificationMethod
     *
     * @return identityVerificationMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IdentityVerificationMethod getIdentityVerificationMethod() {
        return identityVerificationMethod;
    }

    public void setIdentityVerificationMethod(
            IdentityVerificationMethod identityVerificationMethod) {
        this.identityVerificationMethod = identityVerificationMethod;
    }

    public StorageAdapterWhereInput identityVerificationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD);
        return this;
    }

    public StorageAdapterWhereInput identityVerificationMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD);
        return this;
    }

    public void setIdentityVerificationMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD);
        }
    }

    public boolean getIdentityVerificationMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD);
    }

    public StorageAdapterWhereInput identityVerificationMethodIn(
            List<IdentityVerificationMethod> identityVerificationMethodIn) {

        this.identityVerificationMethodIn = identityVerificationMethodIn;
        return this;
    }

    public StorageAdapterWhereInput addIdentityVerificationMethodInItem(
            IdentityVerificationMethod identityVerificationMethodInItem) {
        if (this.identityVerificationMethodIn == null) {
            this.identityVerificationMethodIn = new ArrayList<IdentityVerificationMethod>();
        }
        this.identityVerificationMethodIn.add(identityVerificationMethodInItem);
        return this;
    }

    /**
     * Get identityVerificationMethodIn
     *
     * @return identityVerificationMethodIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IdentityVerificationMethod> getIdentityVerificationMethodIn() {
        return identityVerificationMethodIn;
    }

    public void setIdentityVerificationMethodIn(
            List<IdentityVerificationMethod> identityVerificationMethodIn) {
        this.identityVerificationMethodIn = identityVerificationMethodIn;
    }

    public StorageAdapterWhereInput identityVerificationMethodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN);
        return this;
    }

    public StorageAdapterWhereInput identityVerificationMethodIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN);
        return this;
    }

    public void setIdentityVerificationMethodIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN);
        }
    }

    public boolean getIdentityVerificationMethodIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN);
    }

    public StorageAdapterWhereInput identityVerificationMethodNot(
            IdentityVerificationMethod identityVerificationMethodNot) {

        this.identityVerificationMethodNot = identityVerificationMethodNot;
        return this;
    }

    /**
     * Get identityVerificationMethodNot
     *
     * @return identityVerificationMethodNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IdentityVerificationMethod getIdentityVerificationMethodNot() {
        return identityVerificationMethodNot;
    }

    public void setIdentityVerificationMethodNot(
            IdentityVerificationMethod identityVerificationMethodNot) {
        this.identityVerificationMethodNot = identityVerificationMethodNot;
    }

    public StorageAdapterWhereInput identityVerificationMethodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT);
        return this;
    }

    public StorageAdapterWhereInput identityVerificationMethodNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT);
        return this;
    }

    public void setIdentityVerificationMethodNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT);
        }
    }

    public boolean getIdentityVerificationMethodNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT);
    }

    public StorageAdapterWhereInput identityVerificationMethodNotIn(
            List<IdentityVerificationMethod> identityVerificationMethodNotIn) {

        this.identityVerificationMethodNotIn = identityVerificationMethodNotIn;
        return this;
    }

    public StorageAdapterWhereInput addIdentityVerificationMethodNotInItem(
            IdentityVerificationMethod identityVerificationMethodNotInItem) {
        if (this.identityVerificationMethodNotIn == null) {
            this.identityVerificationMethodNotIn = new ArrayList<IdentityVerificationMethod>();
        }
        this.identityVerificationMethodNotIn.add(identityVerificationMethodNotInItem);
        return this;
    }

    /**
     * Get identityVerificationMethodNotIn
     *
     * @return identityVerificationMethodNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IdentityVerificationMethod> getIdentityVerificationMethodNotIn() {
        return identityVerificationMethodNotIn;
    }

    public void setIdentityVerificationMethodNotIn(
            List<IdentityVerificationMethod> identityVerificationMethodNotIn) {
        this.identityVerificationMethodNotIn = identityVerificationMethodNotIn;
    }

    public StorageAdapterWhereInput identityVerificationMethodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput identityVerificationMethodNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN);
        return this;
    }

    public void setIdentityVerificationMethodNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN);
        }
    }

    public boolean getIdentityVerificationMethodNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN);
    }

    public StorageAdapterWhereInput initiatorName(String initiatorName) {

        this.initiatorName = initiatorName;
        return this;
    }

    /**
     * Get initiatorName
     *
     * @return initiatorName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorName() {
        return initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }

    public StorageAdapterWhereInput initiatorName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME);
        return this;
    }

    public StorageAdapterWhereInput initiatorName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME);
        return this;
    }

    public void setInitiatorName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME);
        }
    }

    public boolean getInitiatorName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME);
    }

    public StorageAdapterWhereInput initiatorNameContains(String initiatorNameContains) {

        this.initiatorNameContains = initiatorNameContains;
        return this;
    }

    /**
     * Get initiatorNameContains
     *
     * @return initiatorNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameContains() {
        return initiatorNameContains;
    }

    public void setInitiatorNameContains(String initiatorNameContains) {
        this.initiatorNameContains = initiatorNameContains;
    }

    public StorageAdapterWhereInput initiatorNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_CONTAINS);
        return this;
    }

    public void setInitiatorNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_CONTAINS);
        }
    }

    public boolean getInitiatorNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_CONTAINS);
    }

    public StorageAdapterWhereInput initiatorNameEndsWith(String initiatorNameEndsWith) {

        this.initiatorNameEndsWith = initiatorNameEndsWith;
        return this;
    }

    /**
     * Get initiatorNameEndsWith
     *
     * @return initiatorNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameEndsWith() {
        return initiatorNameEndsWith;
    }

    public void setInitiatorNameEndsWith(String initiatorNameEndsWith) {
        this.initiatorNameEndsWith = initiatorNameEndsWith;
    }

    public StorageAdapterWhereInput initiatorNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_ENDS_WITH);
        return this;
    }

    public void setInitiatorNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_ENDS_WITH);
        }
    }

    public boolean getInitiatorNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_ENDS_WITH);
    }

    public StorageAdapterWhereInput initiatorNameGt(String initiatorNameGt) {

        this.initiatorNameGt = initiatorNameGt;
        return this;
    }

    /**
     * Get initiatorNameGt
     *
     * @return initiatorNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameGt() {
        return initiatorNameGt;
    }

    public void setInitiatorNameGt(String initiatorNameGt) {
        this.initiatorNameGt = initiatorNameGt;
    }

    public StorageAdapterWhereInput initiatorNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_GT);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_GT);
        return this;
    }

    public void setInitiatorNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_GT);
        }
    }

    public boolean getInitiatorNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_GT);
    }

    public StorageAdapterWhereInput initiatorNameGte(String initiatorNameGte) {

        this.initiatorNameGte = initiatorNameGte;
        return this;
    }

    /**
     * Get initiatorNameGte
     *
     * @return initiatorNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameGte() {
        return initiatorNameGte;
    }

    public void setInitiatorNameGte(String initiatorNameGte) {
        this.initiatorNameGte = initiatorNameGte;
    }

    public StorageAdapterWhereInput initiatorNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_GTE);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_GTE);
        return this;
    }

    public void setInitiatorNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_GTE);
        }
    }

    public boolean getInitiatorNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_GTE);
    }

    public StorageAdapterWhereInput initiatorNameIn(List<String> initiatorNameIn) {

        this.initiatorNameIn = initiatorNameIn;
        return this;
    }

    public StorageAdapterWhereInput addInitiatorNameInItem(String initiatorNameInItem) {
        if (this.initiatorNameIn == null) {
            this.initiatorNameIn = new ArrayList<String>();
        }
        this.initiatorNameIn.add(initiatorNameInItem);
        return this;
    }

    /**
     * Get initiatorNameIn
     *
     * @return initiatorNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInitiatorNameIn() {
        return initiatorNameIn;
    }

    public void setInitiatorNameIn(List<String> initiatorNameIn) {
        this.initiatorNameIn = initiatorNameIn;
    }

    public StorageAdapterWhereInput initiatorNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_IN);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_IN);
        return this;
    }

    public void setInitiatorNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_IN);
        }
    }

    public boolean getInitiatorNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_IN);
    }

    public StorageAdapterWhereInput initiatorNameLt(String initiatorNameLt) {

        this.initiatorNameLt = initiatorNameLt;
        return this;
    }

    /**
     * Get initiatorNameLt
     *
     * @return initiatorNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameLt() {
        return initiatorNameLt;
    }

    public void setInitiatorNameLt(String initiatorNameLt) {
        this.initiatorNameLt = initiatorNameLt;
    }

    public StorageAdapterWhereInput initiatorNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_LT);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_LT);
        return this;
    }

    public void setInitiatorNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_LT);
        }
    }

    public boolean getInitiatorNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_LT);
    }

    public StorageAdapterWhereInput initiatorNameLte(String initiatorNameLte) {

        this.initiatorNameLte = initiatorNameLte;
        return this;
    }

    /**
     * Get initiatorNameLte
     *
     * @return initiatorNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameLte() {
        return initiatorNameLte;
    }

    public void setInitiatorNameLte(String initiatorNameLte) {
        this.initiatorNameLte = initiatorNameLte;
    }

    public StorageAdapterWhereInput initiatorNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_LTE);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_LTE);
        return this;
    }

    public void setInitiatorNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_LTE);
        }
    }

    public boolean getInitiatorNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_LTE);
    }

    public StorageAdapterWhereInput initiatorNameNot(String initiatorNameNot) {

        this.initiatorNameNot = initiatorNameNot;
        return this;
    }

    /**
     * Get initiatorNameNot
     *
     * @return initiatorNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameNot() {
        return initiatorNameNot;
    }

    public void setInitiatorNameNot(String initiatorNameNot) {
        this.initiatorNameNot = initiatorNameNot;
    }

    public StorageAdapterWhereInput initiatorNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT);
        return this;
    }

    public void setInitiatorNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT);
        }
    }

    public boolean getInitiatorNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_NOT);
    }

    public StorageAdapterWhereInput initiatorNameNotContains(String initiatorNameNotContains) {

        this.initiatorNameNotContains = initiatorNameNotContains;
        return this;
    }

    /**
     * Get initiatorNameNotContains
     *
     * @return initiatorNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameNotContains() {
        return initiatorNameNotContains;
    }

    public void setInitiatorNameNotContains(String initiatorNameNotContains) {
        this.initiatorNameNotContains = initiatorNameNotContains;
    }

    public StorageAdapterWhereInput initiatorNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_CONTAINS);
        return this;
    }

    public void setInitiatorNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_CONTAINS);
        }
    }

    public boolean getInitiatorNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput initiatorNameNotEndsWith(String initiatorNameNotEndsWith) {

        this.initiatorNameNotEndsWith = initiatorNameNotEndsWith;
        return this;
    }

    /**
     * Get initiatorNameNotEndsWith
     *
     * @return initiatorNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameNotEndsWith() {
        return initiatorNameNotEndsWith;
    }

    public void setInitiatorNameNotEndsWith(String initiatorNameNotEndsWith) {
        this.initiatorNameNotEndsWith = initiatorNameNotEndsWith;
    }

    public StorageAdapterWhereInput initiatorNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setInitiatorNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getInitiatorNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput initiatorNameNotIn(List<String> initiatorNameNotIn) {

        this.initiatorNameNotIn = initiatorNameNotIn;
        return this;
    }

    public StorageAdapterWhereInput addInitiatorNameNotInItem(String initiatorNameNotInItem) {
        if (this.initiatorNameNotIn == null) {
            this.initiatorNameNotIn = new ArrayList<String>();
        }
        this.initiatorNameNotIn.add(initiatorNameNotInItem);
        return this;
    }

    /**
     * Get initiatorNameNotIn
     *
     * @return initiatorNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInitiatorNameNotIn() {
        return initiatorNameNotIn;
    }

    public void setInitiatorNameNotIn(List<String> initiatorNameNotIn) {
        this.initiatorNameNotIn = initiatorNameNotIn;
    }

    public StorageAdapterWhereInput initiatorNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_IN);
        return this;
    }

    public void setInitiatorNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_IN);
        }
    }

    public boolean getInitiatorNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_NOT_IN);
    }

    public StorageAdapterWhereInput initiatorNameNotStartsWith(String initiatorNameNotStartsWith) {

        this.initiatorNameNotStartsWith = initiatorNameNotStartsWith;
        return this;
    }

    /**
     * Get initiatorNameNotStartsWith
     *
     * @return initiatorNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameNotStartsWith() {
        return initiatorNameNotStartsWith;
    }

    public void setInitiatorNameNotStartsWith(String initiatorNameNotStartsWith) {
        this.initiatorNameNotStartsWith = initiatorNameNotStartsWith;
    }

    public StorageAdapterWhereInput initiatorNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setInitiatorNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getInitiatorNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput initiatorNameStartsWith(String initiatorNameStartsWith) {

        this.initiatorNameStartsWith = initiatorNameStartsWith;
        return this;
    }

    /**
     * Get initiatorNameStartsWith
     *
     * @return initiatorNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitiatorNameStartsWith() {
        return initiatorNameStartsWith;
    }

    public void setInitiatorNameStartsWith(String initiatorNameStartsWith) {
        this.initiatorNameStartsWith = initiatorNameStartsWith;
    }

    public StorageAdapterWhereInput initiatorNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput initiatorNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_STARTS_WITH);
        return this;
    }

    public void setInitiatorNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATOR_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATOR_NAME_STARTS_WITH);
        }
    }

    public boolean getInitiatorNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATOR_NAME_STARTS_WITH);
    }

    public StorageAdapterWhereInput isSoftware(Boolean isSoftware) {

        this.isSoftware = isSoftware;
        return this;
    }

    /**
     * Get isSoftware
     *
     * @return isSoftware
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsSoftware() {
        return isSoftware;
    }

    public void setIsSoftware(Boolean isSoftware) {
        this.isSoftware = isSoftware;
    }

    public StorageAdapterWhereInput isSoftware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SOFTWARE);
        return this;
    }

    public StorageAdapterWhereInput isSoftware_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_SOFTWARE);
        return this;
    }

    public void setIsSoftware_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_SOFTWARE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_SOFTWARE);
        }
    }

    public boolean getIsSoftware_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_SOFTWARE);
    }

    public StorageAdapterWhereInput isSoftwareNot(Boolean isSoftwareNot) {

        this.isSoftwareNot = isSoftwareNot;
        return this;
    }

    /**
     * Get isSoftwareNot
     *
     * @return isSoftwareNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsSoftwareNot() {
        return isSoftwareNot;
    }

    public void setIsSoftwareNot(Boolean isSoftwareNot) {
        this.isSoftwareNot = isSoftwareNot;
    }

    public StorageAdapterWhereInput isSoftwareNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SOFTWARE_NOT);
        return this;
    }

    public StorageAdapterWhereInput isSoftwareNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_SOFTWARE_NOT);
        return this;
    }

    public void setIsSoftwareNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_SOFTWARE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_SOFTWARE_NOT);
        }
    }

    public boolean getIsSoftwareNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_SOFTWARE_NOT);
    }

    public StorageAdapterWhereInput localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public StorageAdapterWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public StorageAdapterWhereInput localCreatedAtGt(String localCreatedAtGt) {

        this.localCreatedAtGt = localCreatedAtGt;
        return this;
    }

    /**
     * Get localCreatedAtGt
     *
     * @return localCreatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGt() {
        return localCreatedAtGt;
    }

    public void setLocalCreatedAtGt(String localCreatedAtGt) {
        this.localCreatedAtGt = localCreatedAtGt;
    }

    public StorageAdapterWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public void setLocalCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        }
    }

    public boolean getLocalCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
    }

    public StorageAdapterWhereInput localCreatedAtGte(String localCreatedAtGte) {

        this.localCreatedAtGte = localCreatedAtGte;
        return this;
    }

    /**
     * Get localCreatedAtGte
     *
     * @return localCreatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGte() {
        return localCreatedAtGte;
    }

    public void setLocalCreatedAtGte(String localCreatedAtGte) {
        this.localCreatedAtGte = localCreatedAtGte;
    }

    public StorageAdapterWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public void setLocalCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        }
    }

    public boolean getLocalCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
    }

    public StorageAdapterWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
        if (this.localCreatedAtIn == null) {
            this.localCreatedAtIn = new ArrayList<String>();
        }
        this.localCreatedAtIn.add(localCreatedAtInItem);
        return this;
    }

    /**
     * Get localCreatedAtIn
     *
     * @return localCreatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtIn() {
        return localCreatedAtIn;
    }

    public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
        this.localCreatedAtIn = localCreatedAtIn;
    }

    public StorageAdapterWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public void setLocalCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        }
    }

    public boolean getLocalCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
    }

    public StorageAdapterWhereInput localCreatedAtLt(String localCreatedAtLt) {

        this.localCreatedAtLt = localCreatedAtLt;
        return this;
    }

    /**
     * Get localCreatedAtLt
     *
     * @return localCreatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLt() {
        return localCreatedAtLt;
    }

    public void setLocalCreatedAtLt(String localCreatedAtLt) {
        this.localCreatedAtLt = localCreatedAtLt;
    }

    public StorageAdapterWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public void setLocalCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        }
    }

    public boolean getLocalCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
    }

    public StorageAdapterWhereInput localCreatedAtLte(String localCreatedAtLte) {

        this.localCreatedAtLte = localCreatedAtLte;
        return this;
    }

    /**
     * Get localCreatedAtLte
     *
     * @return localCreatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLte() {
        return localCreatedAtLte;
    }

    public void setLocalCreatedAtLte(String localCreatedAtLte) {
        this.localCreatedAtLte = localCreatedAtLte;
    }

    public StorageAdapterWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public void setLocalCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        }
    }

    public boolean getLocalCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
    }

    public StorageAdapterWhereInput localCreatedAtNot(String localCreatedAtNot) {

        this.localCreatedAtNot = localCreatedAtNot;
        return this;
    }

    /**
     * Get localCreatedAtNot
     *
     * @return localCreatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtNot() {
        return localCreatedAtNot;
    }

    public void setLocalCreatedAtNot(String localCreatedAtNot) {
        this.localCreatedAtNot = localCreatedAtNot;
    }

    public StorageAdapterWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public void setLocalCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        }
    }

    public boolean getLocalCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
    }

    public StorageAdapterWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
        if (this.localCreatedAtNotIn == null) {
            this.localCreatedAtNotIn = new ArrayList<String>();
        }
        this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
        return this;
    }

    /**
     * Get localCreatedAtNotIn
     *
     * @return localCreatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtNotIn() {
        return localCreatedAtNotIn;
    }

    public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
        this.localCreatedAtNotIn = localCreatedAtNotIn;
    }

    public StorageAdapterWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public void setLocalCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        }
    }

    public boolean getLocalCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
    }

    public StorageAdapterWhereInput localHash(String localHash) {

        this.localHash = localHash;
        return this;
    }

    /**
     * Get localHash
     *
     * @return localHash
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHash() {
        return localHash;
    }

    public void setLocalHash(String localHash) {
        this.localHash = localHash;
    }

    public StorageAdapterWhereInput localHash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public StorageAdapterWhereInput localHash_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public void setLocalHash_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH);
        }
    }

    public boolean getLocalHash_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH);
    }

    public StorageAdapterWhereInput localHashContains(String localHashContains) {

        this.localHashContains = localHashContains;
        return this;
    }

    /**
     * Get localHashContains
     *
     * @return localHashContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashContains() {
        return localHashContains;
    }

    public void setLocalHashContains(String localHashContains) {
        this.localHashContains = localHashContains;
    }

    public StorageAdapterWhereInput localHashContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput localHashContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public void setLocalHashContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        }
    }

    public boolean getLocalHashContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
    }

    public StorageAdapterWhereInput localHashEndsWith(String localHashEndsWith) {

        this.localHashEndsWith = localHashEndsWith;
        return this;
    }

    /**
     * Get localHashEndsWith
     *
     * @return localHashEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashEndsWith() {
        return localHashEndsWith;
    }

    public void setLocalHashEndsWith(String localHashEndsWith) {
        this.localHashEndsWith = localHashEndsWith;
    }

    public StorageAdapterWhereInput localHashEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localHashEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public void setLocalHashEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        }
    }

    public boolean getLocalHashEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
    }

    public StorageAdapterWhereInput localHashGt(String localHashGt) {

        this.localHashGt = localHashGt;
        return this;
    }

    /**
     * Get localHashGt
     *
     * @return localHashGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashGt() {
        return localHashGt;
    }

    public void setLocalHashGt(String localHashGt) {
        this.localHashGt = localHashGt;
    }

    public StorageAdapterWhereInput localHashGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public StorageAdapterWhereInput localHashGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public void setLocalHashGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GT);
        }
    }

    public boolean getLocalHashGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_GT);
    }

    public StorageAdapterWhereInput localHashGte(String localHashGte) {

        this.localHashGte = localHashGte;
        return this;
    }

    /**
     * Get localHashGte
     *
     * @return localHashGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashGte() {
        return localHashGte;
    }

    public void setLocalHashGte(String localHashGte) {
        this.localHashGte = localHashGte;
    }

    public StorageAdapterWhereInput localHashGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public StorageAdapterWhereInput localHashGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public void setLocalHashGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GTE);
        }
    }

    public boolean getLocalHashGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_GTE);
    }

    public StorageAdapterWhereInput localHashIn(List<String> localHashIn) {

        this.localHashIn = localHashIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalHashInItem(String localHashInItem) {
        if (this.localHashIn == null) {
            this.localHashIn = new ArrayList<String>();
        }
        this.localHashIn.add(localHashInItem);
        return this;
    }

    /**
     * Get localHashIn
     *
     * @return localHashIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalHashIn() {
        return localHashIn;
    }

    public void setLocalHashIn(List<String> localHashIn) {
        this.localHashIn = localHashIn;
    }

    public StorageAdapterWhereInput localHashIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public StorageAdapterWhereInput localHashIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public void setLocalHashIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_IN);
        }
    }

    public boolean getLocalHashIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_IN);
    }

    public StorageAdapterWhereInput localHashLt(String localHashLt) {

        this.localHashLt = localHashLt;
        return this;
    }

    /**
     * Get localHashLt
     *
     * @return localHashLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashLt() {
        return localHashLt;
    }

    public void setLocalHashLt(String localHashLt) {
        this.localHashLt = localHashLt;
    }

    public StorageAdapterWhereInput localHashLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public StorageAdapterWhereInput localHashLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public void setLocalHashLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LT);
        }
    }

    public boolean getLocalHashLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_LT);
    }

    public StorageAdapterWhereInput localHashLte(String localHashLte) {

        this.localHashLte = localHashLte;
        return this;
    }

    /**
     * Get localHashLte
     *
     * @return localHashLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashLte() {
        return localHashLte;
    }

    public void setLocalHashLte(String localHashLte) {
        this.localHashLte = localHashLte;
    }

    public StorageAdapterWhereInput localHashLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public StorageAdapterWhereInput localHashLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public void setLocalHashLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LTE);
        }
    }

    public boolean getLocalHashLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_LTE);
    }

    public StorageAdapterWhereInput localHashNot(String localHashNot) {

        this.localHashNot = localHashNot;
        return this;
    }

    /**
     * Get localHashNot
     *
     * @return localHashNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNot() {
        return localHashNot;
    }

    public void setLocalHashNot(String localHashNot) {
        this.localHashNot = localHashNot;
    }

    public StorageAdapterWhereInput localHashNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public StorageAdapterWhereInput localHashNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public void setLocalHashNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT);
        }
    }

    public boolean getLocalHashNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT);
    }

    public StorageAdapterWhereInput localHashNotContains(String localHashNotContains) {

        this.localHashNotContains = localHashNotContains;
        return this;
    }

    /**
     * Get localHashNotContains
     *
     * @return localHashNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotContains() {
        return localHashNotContains;
    }

    public void setLocalHashNotContains(String localHashNotContains) {
        this.localHashNotContains = localHashNotContains;
    }

    public StorageAdapterWhereInput localHashNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput localHashNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public void setLocalHashNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        }
    }

    public boolean getLocalHashNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput localHashNotEndsWith(String localHashNotEndsWith) {

        this.localHashNotEndsWith = localHashNotEndsWith;
        return this;
    }

    /**
     * Get localHashNotEndsWith
     *
     * @return localHashNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotEndsWith() {
        return localHashNotEndsWith;
    }

    public void setLocalHashNotEndsWith(String localHashNotEndsWith) {
        this.localHashNotEndsWith = localHashNotEndsWith;
    }

    public StorageAdapterWhereInput localHashNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localHashNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalHashNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalHashNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput localHashNotIn(List<String> localHashNotIn) {

        this.localHashNotIn = localHashNotIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalHashNotInItem(String localHashNotInItem) {
        if (this.localHashNotIn == null) {
            this.localHashNotIn = new ArrayList<String>();
        }
        this.localHashNotIn.add(localHashNotInItem);
        return this;
    }

    /**
     * Get localHashNotIn
     *
     * @return localHashNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalHashNotIn() {
        return localHashNotIn;
    }

    public void setLocalHashNotIn(List<String> localHashNotIn) {
        this.localHashNotIn = localHashNotIn;
    }

    public StorageAdapterWhereInput localHashNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput localHashNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public void setLocalHashNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        }
    }

    public boolean getLocalHashNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
    }

    public StorageAdapterWhereInput localHashNotStartsWith(String localHashNotStartsWith) {

        this.localHashNotStartsWith = localHashNotStartsWith;
        return this;
    }

    /**
     * Get localHashNotStartsWith
     *
     * @return localHashNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotStartsWith() {
        return localHashNotStartsWith;
    }

    public void setLocalHashNotStartsWith(String localHashNotStartsWith) {
        this.localHashNotStartsWith = localHashNotStartsWith;
    }

    public StorageAdapterWhereInput localHashNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localHashNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalHashNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalHashNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput localHashStartsWith(String localHashStartsWith) {

        this.localHashStartsWith = localHashStartsWith;
        return this;
    }

    /**
     * Get localHashStartsWith
     *
     * @return localHashStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashStartsWith() {
        return localHashStartsWith;
    }

    public void setLocalHashStartsWith(String localHashStartsWith) {
        this.localHashStartsWith = localHashStartsWith;
    }

    public StorageAdapterWhereInput localHashStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localHashStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public void setLocalHashStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        }
    }

    public boolean getLocalHashStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
    }

    public StorageAdapterWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public StorageAdapterWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public StorageAdapterWhereInput localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public StorageAdapterWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public StorageAdapterWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public StorageAdapterWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public StorageAdapterWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public StorageAdapterWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public StorageAdapterWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public StorageAdapterWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public StorageAdapterWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public StorageAdapterWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public StorageAdapterWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public StorageAdapterWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public StorageAdapterWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public StorageAdapterWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public StorageAdapterWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public StorageAdapterWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public StorageAdapterWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public StorageAdapterWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public StorageAdapterWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public StorageAdapterWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public StorageAdapterWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public StorageAdapterWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public StorageAdapterWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public StorageAdapterWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public StorageAdapterWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public StorageAdapterWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public StorageAdapterWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public StorageAdapterWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public StorageAdapterWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public StorageAdapterWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public StorageAdapterWhereInput localUpdatedAt(String localUpdatedAt) {

        this.localUpdatedAt = localUpdatedAt;
        return this;
    }

    /**
     * Get localUpdatedAt
     *
     * @return localUpdatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAt() {
        return localUpdatedAt;
    }

    public void setLocalUpdatedAt(String localUpdatedAt) {
        this.localUpdatedAt = localUpdatedAt;
    }

    public StorageAdapterWhereInput localUpdatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public void setLocalUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        }
    }

    public boolean getLocalUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT);
    }

    public StorageAdapterWhereInput localUpdatedAtGt(String localUpdatedAtGt) {

        this.localUpdatedAtGt = localUpdatedAtGt;
        return this;
    }

    /**
     * Get localUpdatedAtGt
     *
     * @return localUpdatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtGt() {
        return localUpdatedAtGt;
    }

    public void setLocalUpdatedAtGt(String localUpdatedAtGt) {
        this.localUpdatedAtGt = localUpdatedAtGt;
    }

    public StorageAdapterWhereInput localUpdatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        return this;
    }

    public void setLocalUpdatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
        }
    }

    public boolean getLocalUpdatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_GT);
    }

    public StorageAdapterWhereInput localUpdatedAtGte(String localUpdatedAtGte) {

        this.localUpdatedAtGte = localUpdatedAtGte;
        return this;
    }

    /**
     * Get localUpdatedAtGte
     *
     * @return localUpdatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtGte() {
        return localUpdatedAtGte;
    }

    public void setLocalUpdatedAtGte(String localUpdatedAtGte) {
        this.localUpdatedAtGte = localUpdatedAtGte;
    }

    public StorageAdapterWhereInput localUpdatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        return this;
    }

    public void setLocalUpdatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
        }
    }

    public boolean getLocalUpdatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_GTE);
    }

    public StorageAdapterWhereInput localUpdatedAtIn(List<String> localUpdatedAtIn) {

        this.localUpdatedAtIn = localUpdatedAtIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalUpdatedAtInItem(String localUpdatedAtInItem) {
        if (this.localUpdatedAtIn == null) {
            this.localUpdatedAtIn = new ArrayList<String>();
        }
        this.localUpdatedAtIn.add(localUpdatedAtInItem);
        return this;
    }

    /**
     * Get localUpdatedAtIn
     *
     * @return localUpdatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalUpdatedAtIn() {
        return localUpdatedAtIn;
    }

    public void setLocalUpdatedAtIn(List<String> localUpdatedAtIn) {
        this.localUpdatedAtIn = localUpdatedAtIn;
    }

    public StorageAdapterWhereInput localUpdatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        return this;
    }

    public void setLocalUpdatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
        }
    }

    public boolean getLocalUpdatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_IN);
    }

    public StorageAdapterWhereInput localUpdatedAtLt(String localUpdatedAtLt) {

        this.localUpdatedAtLt = localUpdatedAtLt;
        return this;
    }

    /**
     * Get localUpdatedAtLt
     *
     * @return localUpdatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtLt() {
        return localUpdatedAtLt;
    }

    public void setLocalUpdatedAtLt(String localUpdatedAtLt) {
        this.localUpdatedAtLt = localUpdatedAtLt;
    }

    public StorageAdapterWhereInput localUpdatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        return this;
    }

    public void setLocalUpdatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
        }
    }

    public boolean getLocalUpdatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_LT);
    }

    public StorageAdapterWhereInput localUpdatedAtLte(String localUpdatedAtLte) {

        this.localUpdatedAtLte = localUpdatedAtLte;
        return this;
    }

    /**
     * Get localUpdatedAtLte
     *
     * @return localUpdatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtLte() {
        return localUpdatedAtLte;
    }

    public void setLocalUpdatedAtLte(String localUpdatedAtLte) {
        this.localUpdatedAtLte = localUpdatedAtLte;
    }

    public StorageAdapterWhereInput localUpdatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        return this;
    }

    public void setLocalUpdatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
        }
    }

    public boolean getLocalUpdatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_LTE);
    }

    public StorageAdapterWhereInput localUpdatedAtNot(String localUpdatedAtNot) {

        this.localUpdatedAtNot = localUpdatedAtNot;
        return this;
    }

    /**
     * Get localUpdatedAtNot
     *
     * @return localUpdatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalUpdatedAtNot() {
        return localUpdatedAtNot;
    }

    public void setLocalUpdatedAtNot(String localUpdatedAtNot) {
        this.localUpdatedAtNot = localUpdatedAtNot;
    }

    public StorageAdapterWhereInput localUpdatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        return this;
    }

    public void setLocalUpdatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
        }
    }

    public boolean getLocalUpdatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT);
    }

    public StorageAdapterWhereInput localUpdatedAtNotIn(List<String> localUpdatedAtNotIn) {

        this.localUpdatedAtNotIn = localUpdatedAtNotIn;
        return this;
    }

    public StorageAdapterWhereInput addLocalUpdatedAtNotInItem(String localUpdatedAtNotInItem) {
        if (this.localUpdatedAtNotIn == null) {
            this.localUpdatedAtNotIn = new ArrayList<String>();
        }
        this.localUpdatedAtNotIn.add(localUpdatedAtNotInItem);
        return this;
    }

    /**
     * Get localUpdatedAtNotIn
     *
     * @return localUpdatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalUpdatedAtNotIn() {
        return localUpdatedAtNotIn;
    }

    public void setLocalUpdatedAtNotIn(List<String> localUpdatedAtNotIn) {
        this.localUpdatedAtNotIn = localUpdatedAtNotIn;
    }

    public StorageAdapterWhereInput localUpdatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput localUpdatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        return this;
    }

    public void setLocalUpdatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
        }
    }

    public boolean getLocalUpdatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT_NOT_IN);
    }

    public StorageAdapterWhereInput model(String model) {

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
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public StorageAdapterWhereInput model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public StorageAdapterWhereInput model_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput modelContains(String modelContains) {

        this.modelContains = modelContains;
        return this;
    }

    /**
     * Get modelContains
     *
     * @return modelContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelContains() {
        return modelContains;
    }

    public void setModelContains(String modelContains) {
        this.modelContains = modelContains;
    }

    public StorageAdapterWhereInput modelContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput modelContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_CONTAINS);
        return this;
    }

    public void setModelContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_CONTAINS);
        }
    }

    public boolean getModelContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_CONTAINS);
    }

    public StorageAdapterWhereInput modelEndsWith(String modelEndsWith) {

        this.modelEndsWith = modelEndsWith;
        return this;
    }

    /**
     * Get modelEndsWith
     *
     * @return modelEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelEndsWith() {
        return modelEndsWith;
    }

    public void setModelEndsWith(String modelEndsWith) {
        this.modelEndsWith = modelEndsWith;
    }

    public StorageAdapterWhereInput modelEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput modelEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_ENDS_WITH);
        return this;
    }

    public void setModelEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_ENDS_WITH);
        }
    }

    public boolean getModelEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_ENDS_WITH);
    }

    public StorageAdapterWhereInput modelGt(String modelGt) {

        this.modelGt = modelGt;
        return this;
    }

    /**
     * Get modelGt
     *
     * @return modelGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelGt() {
        return modelGt;
    }

    public void setModelGt(String modelGt) {
        this.modelGt = modelGt;
    }

    public StorageAdapterWhereInput modelGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_GT);
        return this;
    }

    public StorageAdapterWhereInput modelGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_GT);
        return this;
    }

    public void setModelGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_GT);
        }
    }

    public boolean getModelGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_GT);
    }

    public StorageAdapterWhereInput modelGte(String modelGte) {

        this.modelGte = modelGte;
        return this;
    }

    /**
     * Get modelGte
     *
     * @return modelGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelGte() {
        return modelGte;
    }

    public void setModelGte(String modelGte) {
        this.modelGte = modelGte;
    }

    public StorageAdapterWhereInput modelGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_GTE);
        return this;
    }

    public StorageAdapterWhereInput modelGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_GTE);
        return this;
    }

    public void setModelGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_GTE);
        }
    }

    public boolean getModelGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_GTE);
    }

    public StorageAdapterWhereInput modelIn(List<String> modelIn) {

        this.modelIn = modelIn;
        return this;
    }

    public StorageAdapterWhereInput addModelInItem(String modelInItem) {
        if (this.modelIn == null) {
            this.modelIn = new ArrayList<String>();
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
    public List<String> getModelIn() {
        return modelIn;
    }

    public void setModelIn(List<String> modelIn) {
        this.modelIn = modelIn;
    }

    public StorageAdapterWhereInput modelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public StorageAdapterWhereInput modelIn_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput modelLt(String modelLt) {

        this.modelLt = modelLt;
        return this;
    }

    /**
     * Get modelLt
     *
     * @return modelLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelLt() {
        return modelLt;
    }

    public void setModelLt(String modelLt) {
        this.modelLt = modelLt;
    }

    public StorageAdapterWhereInput modelLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_LT);
        return this;
    }

    public StorageAdapterWhereInput modelLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_LT);
        return this;
    }

    public void setModelLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_LT);
        }
    }

    public boolean getModelLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_LT);
    }

    public StorageAdapterWhereInput modelLte(String modelLte) {

        this.modelLte = modelLte;
        return this;
    }

    /**
     * Get modelLte
     *
     * @return modelLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelLte() {
        return modelLte;
    }

    public void setModelLte(String modelLte) {
        this.modelLte = modelLte;
    }

    public StorageAdapterWhereInput modelLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_LTE);
        return this;
    }

    public StorageAdapterWhereInput modelLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_LTE);
        return this;
    }

    public void setModelLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_LTE);
        }
    }

    public boolean getModelLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_LTE);
    }

    public StorageAdapterWhereInput modelNot(String modelNot) {

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
    public String getModelNot() {
        return modelNot;
    }

    public void setModelNot(String modelNot) {
        this.modelNot = modelNot;
    }

    public StorageAdapterWhereInput modelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public StorageAdapterWhereInput modelNot_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput modelNotContains(String modelNotContains) {

        this.modelNotContains = modelNotContains;
        return this;
    }

    /**
     * Get modelNotContains
     *
     * @return modelNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotContains() {
        return modelNotContains;
    }

    public void setModelNotContains(String modelNotContains) {
        this.modelNotContains = modelNotContains;
    }

    public StorageAdapterWhereInput modelNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput modelNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        return this;
    }

    public void setModelNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        }
    }

    public boolean getModelNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput modelNotEndsWith(String modelNotEndsWith) {

        this.modelNotEndsWith = modelNotEndsWith;
        return this;
    }

    /**
     * Get modelNotEndsWith
     *
     * @return modelNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotEndsWith() {
        return modelNotEndsWith;
    }

    public void setModelNotEndsWith(String modelNotEndsWith) {
        this.modelNotEndsWith = modelNotEndsWith;
    }

    public StorageAdapterWhereInput modelNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput modelNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public void setModelNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        }
    }

    public boolean getModelNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput modelNotIn(List<String> modelNotIn) {

        this.modelNotIn = modelNotIn;
        return this;
    }

    public StorageAdapterWhereInput addModelNotInItem(String modelNotInItem) {
        if (this.modelNotIn == null) {
            this.modelNotIn = new ArrayList<String>();
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
    public List<String> getModelNotIn() {
        return modelNotIn;
    }

    public void setModelNotIn(List<String> modelNotIn) {
        this.modelNotIn = modelNotIn;
    }

    public StorageAdapterWhereInput modelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput modelNotIn_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput modelNotStartsWith(String modelNotStartsWith) {

        this.modelNotStartsWith = modelNotStartsWith;
        return this;
    }

    /**
     * Get modelNotStartsWith
     *
     * @return modelNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotStartsWith() {
        return modelNotStartsWith;
    }

    public void setModelNotStartsWith(String modelNotStartsWith) {
        this.modelNotStartsWith = modelNotStartsWith;
    }

    public StorageAdapterWhereInput modelNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput modelNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public void setModelNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        }
    }

    public boolean getModelNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput modelStartsWith(String modelStartsWith) {

        this.modelStartsWith = modelStartsWith;
        return this;
    }

    /**
     * Get modelStartsWith
     *
     * @return modelStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelStartsWith() {
        return modelStartsWith;
    }

    public void setModelStartsWith(String modelStartsWith) {
        this.modelStartsWith = modelStartsWith;
    }

    public StorageAdapterWhereInput modelStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput modelStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_STARTS_WITH);
        return this;
    }

    public void setModelStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_STARTS_WITH);
        }
    }

    public boolean getModelStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_STARTS_WITH);
    }

    public StorageAdapterWhereInput name(String name) {

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

    public StorageAdapterWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public StorageAdapterWhereInput name_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public StorageAdapterWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public StorageAdapterWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public StorageAdapterWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public StorageAdapterWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public StorageAdapterWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public StorageAdapterWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public StorageAdapterWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public StorageAdapterWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public StorageAdapterWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public StorageAdapterWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public StorageAdapterWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public StorageAdapterWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public StorageAdapterWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public StorageAdapterWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public StorageAdapterWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public StorageAdapterWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public StorageAdapterWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public StorageAdapterWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public StorageAdapterWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public StorageAdapterWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public StorageAdapterWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public StorageAdapterWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public StorageAdapterWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public StorageAdapterWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public StorageAdapterWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public StorageAdapterWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public StorageAdapterWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public StorageAdapterWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public StorageAdapterWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public StorageAdapterWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public StorageAdapterWhereInput pathNum(Integer pathNum) {

        this.pathNum = pathNum;
        return this;
    }

    /**
     * Get pathNum
     *
     * @return pathNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPathNum() {
        return pathNum;
    }

    public void setPathNum(Integer pathNum) {
        this.pathNum = pathNum;
    }

    public StorageAdapterWhereInput pathNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM);
        return this;
    }

    public StorageAdapterWhereInput pathNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM);
        return this;
    }

    public void setPathNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM);
        }
    }

    public boolean getPathNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM);
    }

    public StorageAdapterWhereInput pathNumGt(Integer pathNumGt) {

        this.pathNumGt = pathNumGt;
        return this;
    }

    /**
     * Get pathNumGt
     *
     * @return pathNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPathNumGt() {
        return pathNumGt;
    }

    public void setPathNumGt(Integer pathNumGt) {
        this.pathNumGt = pathNumGt;
    }

    public StorageAdapterWhereInput pathNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_GT);
        return this;
    }

    public StorageAdapterWhereInput pathNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_GT);
        return this;
    }

    public void setPathNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_GT);
        }
    }

    public boolean getPathNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM_GT);
    }

    public StorageAdapterWhereInput pathNumGte(Integer pathNumGte) {

        this.pathNumGte = pathNumGte;
        return this;
    }

    /**
     * Get pathNumGte
     *
     * @return pathNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPathNumGte() {
        return pathNumGte;
    }

    public void setPathNumGte(Integer pathNumGte) {
        this.pathNumGte = pathNumGte;
    }

    public StorageAdapterWhereInput pathNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_GTE);
        return this;
    }

    public StorageAdapterWhereInput pathNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_GTE);
        return this;
    }

    public void setPathNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_GTE);
        }
    }

    public boolean getPathNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM_GTE);
    }

    public StorageAdapterWhereInput pathNumIn(List<Integer> pathNumIn) {

        this.pathNumIn = pathNumIn;
        return this;
    }

    public StorageAdapterWhereInput addPathNumInItem(Integer pathNumInItem) {
        if (this.pathNumIn == null) {
            this.pathNumIn = new ArrayList<Integer>();
        }
        this.pathNumIn.add(pathNumInItem);
        return this;
    }

    /**
     * Get pathNumIn
     *
     * @return pathNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPathNumIn() {
        return pathNumIn;
    }

    public void setPathNumIn(List<Integer> pathNumIn) {
        this.pathNumIn = pathNumIn;
    }

    public StorageAdapterWhereInput pathNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_IN);
        return this;
    }

    public StorageAdapterWhereInput pathNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_IN);
        return this;
    }

    public void setPathNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_IN);
        }
    }

    public boolean getPathNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM_IN);
    }

    public StorageAdapterWhereInput pathNumLt(Integer pathNumLt) {

        this.pathNumLt = pathNumLt;
        return this;
    }

    /**
     * Get pathNumLt
     *
     * @return pathNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPathNumLt() {
        return pathNumLt;
    }

    public void setPathNumLt(Integer pathNumLt) {
        this.pathNumLt = pathNumLt;
    }

    public StorageAdapterWhereInput pathNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_LT);
        return this;
    }

    public StorageAdapterWhereInput pathNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_LT);
        return this;
    }

    public void setPathNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_LT);
        }
    }

    public boolean getPathNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM_LT);
    }

    public StorageAdapterWhereInput pathNumLte(Integer pathNumLte) {

        this.pathNumLte = pathNumLte;
        return this;
    }

    /**
     * Get pathNumLte
     *
     * @return pathNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPathNumLte() {
        return pathNumLte;
    }

    public void setPathNumLte(Integer pathNumLte) {
        this.pathNumLte = pathNumLte;
    }

    public StorageAdapterWhereInput pathNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_LTE);
        return this;
    }

    public StorageAdapterWhereInput pathNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_LTE);
        return this;
    }

    public void setPathNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_LTE);
        }
    }

    public boolean getPathNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM_LTE);
    }

    public StorageAdapterWhereInput pathNumNot(Integer pathNumNot) {

        this.pathNumNot = pathNumNot;
        return this;
    }

    /**
     * Get pathNumNot
     *
     * @return pathNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPathNumNot() {
        return pathNumNot;
    }

    public void setPathNumNot(Integer pathNumNot) {
        this.pathNumNot = pathNumNot;
    }

    public StorageAdapterWhereInput pathNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_NOT);
        return this;
    }

    public StorageAdapterWhereInput pathNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_NOT);
        return this;
    }

    public void setPathNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_NOT);
        }
    }

    public boolean getPathNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM_NOT);
    }

    public StorageAdapterWhereInput pathNumNotIn(List<Integer> pathNumNotIn) {

        this.pathNumNotIn = pathNumNotIn;
        return this;
    }

    public StorageAdapterWhereInput addPathNumNotInItem(Integer pathNumNotInItem) {
        if (this.pathNumNotIn == null) {
            this.pathNumNotIn = new ArrayList<Integer>();
        }
        this.pathNumNotIn.add(pathNumNotInItem);
        return this;
    }

    /**
     * Get pathNumNotIn
     *
     * @return pathNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPathNumNotIn() {
        return pathNumNotIn;
    }

    public void setPathNumNotIn(List<Integer> pathNumNotIn) {
        this.pathNumNotIn = pathNumNotIn;
    }

    public StorageAdapterWhereInput pathNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput pathNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_NOT_IN);
        return this;
    }

    public void setPathNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NUM_NOT_IN);
        }
    }

    public boolean getPathNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NUM_NOT_IN);
    }

    public StorageAdapterWhereInput speed(String speed) {

        this.speed = speed;
        return this;
    }

    /**
     * Get speed
     *
     * @return speed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public StorageAdapterWhereInput speed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED);
        return this;
    }

    public StorageAdapterWhereInput speed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED);
        return this;
    }

    public void setSpeed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED);
        }
    }

    public boolean getSpeed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED);
    }

    public StorageAdapterWhereInput speedContains(String speedContains) {

        this.speedContains = speedContains;
        return this;
    }

    /**
     * Get speedContains
     *
     * @return speedContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedContains() {
        return speedContains;
    }

    public void setSpeedContains(String speedContains) {
        this.speedContains = speedContains;
    }

    public StorageAdapterWhereInput speedContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput speedContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_CONTAINS);
        return this;
    }

    public void setSpeedContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_CONTAINS);
        }
    }

    public boolean getSpeedContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_CONTAINS);
    }

    public StorageAdapterWhereInput speedEndsWith(String speedEndsWith) {

        this.speedEndsWith = speedEndsWith;
        return this;
    }

    /**
     * Get speedEndsWith
     *
     * @return speedEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedEndsWith() {
        return speedEndsWith;
    }

    public void setSpeedEndsWith(String speedEndsWith) {
        this.speedEndsWith = speedEndsWith;
    }

    public StorageAdapterWhereInput speedEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput speedEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_ENDS_WITH);
        return this;
    }

    public void setSpeedEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_ENDS_WITH);
        }
    }

    public boolean getSpeedEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_ENDS_WITH);
    }

    public StorageAdapterWhereInput speedGt(String speedGt) {

        this.speedGt = speedGt;
        return this;
    }

    /**
     * Get speedGt
     *
     * @return speedGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedGt() {
        return speedGt;
    }

    public void setSpeedGt(String speedGt) {
        this.speedGt = speedGt;
    }

    public StorageAdapterWhereInput speedGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_GT);
        return this;
    }

    public StorageAdapterWhereInput speedGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_GT);
        return this;
    }

    public void setSpeedGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_GT);
        }
    }

    public boolean getSpeedGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_GT);
    }

    public StorageAdapterWhereInput speedGte(String speedGte) {

        this.speedGte = speedGte;
        return this;
    }

    /**
     * Get speedGte
     *
     * @return speedGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedGte() {
        return speedGte;
    }

    public void setSpeedGte(String speedGte) {
        this.speedGte = speedGte;
    }

    public StorageAdapterWhereInput speedGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_GTE);
        return this;
    }

    public StorageAdapterWhereInput speedGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_GTE);
        return this;
    }

    public void setSpeedGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_GTE);
        }
    }

    public boolean getSpeedGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_GTE);
    }

    public StorageAdapterWhereInput speedIn(List<String> speedIn) {

        this.speedIn = speedIn;
        return this;
    }

    public StorageAdapterWhereInput addSpeedInItem(String speedInItem) {
        if (this.speedIn == null) {
            this.speedIn = new ArrayList<String>();
        }
        this.speedIn.add(speedInItem);
        return this;
    }

    /**
     * Get speedIn
     *
     * @return speedIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSpeedIn() {
        return speedIn;
    }

    public void setSpeedIn(List<String> speedIn) {
        this.speedIn = speedIn;
    }

    public StorageAdapterWhereInput speedIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_IN);
        return this;
    }

    public StorageAdapterWhereInput speedIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_IN);
        return this;
    }

    public void setSpeedIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_IN);
        }
    }

    public boolean getSpeedIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_IN);
    }

    public StorageAdapterWhereInput speedLt(String speedLt) {

        this.speedLt = speedLt;
        return this;
    }

    /**
     * Get speedLt
     *
     * @return speedLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedLt() {
        return speedLt;
    }

    public void setSpeedLt(String speedLt) {
        this.speedLt = speedLt;
    }

    public StorageAdapterWhereInput speedLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_LT);
        return this;
    }

    public StorageAdapterWhereInput speedLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_LT);
        return this;
    }

    public void setSpeedLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_LT);
        }
    }

    public boolean getSpeedLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_LT);
    }

    public StorageAdapterWhereInput speedLte(String speedLte) {

        this.speedLte = speedLte;
        return this;
    }

    /**
     * Get speedLte
     *
     * @return speedLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedLte() {
        return speedLte;
    }

    public void setSpeedLte(String speedLte) {
        this.speedLte = speedLte;
    }

    public StorageAdapterWhereInput speedLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_LTE);
        return this;
    }

    public StorageAdapterWhereInput speedLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_LTE);
        return this;
    }

    public void setSpeedLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_LTE);
        }
    }

    public boolean getSpeedLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_LTE);
    }

    public StorageAdapterWhereInput speedNot(String speedNot) {

        this.speedNot = speedNot;
        return this;
    }

    /**
     * Get speedNot
     *
     * @return speedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedNot() {
        return speedNot;
    }

    public void setSpeedNot(String speedNot) {
        this.speedNot = speedNot;
    }

    public StorageAdapterWhereInput speedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT);
        return this;
    }

    public StorageAdapterWhereInput speedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT);
        return this;
    }

    public void setSpeedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT);
        }
    }

    public boolean getSpeedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_NOT);
    }

    public StorageAdapterWhereInput speedNotContains(String speedNotContains) {

        this.speedNotContains = speedNotContains;
        return this;
    }

    /**
     * Get speedNotContains
     *
     * @return speedNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedNotContains() {
        return speedNotContains;
    }

    public void setSpeedNotContains(String speedNotContains) {
        this.speedNotContains = speedNotContains;
    }

    public StorageAdapterWhereInput speedNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput speedNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_CONTAINS);
        return this;
    }

    public void setSpeedNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_CONTAINS);
        }
    }

    public boolean getSpeedNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput speedNotEndsWith(String speedNotEndsWith) {

        this.speedNotEndsWith = speedNotEndsWith;
        return this;
    }

    /**
     * Get speedNotEndsWith
     *
     * @return speedNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedNotEndsWith() {
        return speedNotEndsWith;
    }

    public void setSpeedNotEndsWith(String speedNotEndsWith) {
        this.speedNotEndsWith = speedNotEndsWith;
    }

    public StorageAdapterWhereInput speedNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput speedNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_ENDS_WITH);
        return this;
    }

    public void setSpeedNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_ENDS_WITH);
        }
    }

    public boolean getSpeedNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput speedNotIn(List<String> speedNotIn) {

        this.speedNotIn = speedNotIn;
        return this;
    }

    public StorageAdapterWhereInput addSpeedNotInItem(String speedNotInItem) {
        if (this.speedNotIn == null) {
            this.speedNotIn = new ArrayList<String>();
        }
        this.speedNotIn.add(speedNotInItem);
        return this;
    }

    /**
     * Get speedNotIn
     *
     * @return speedNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSpeedNotIn() {
        return speedNotIn;
    }

    public void setSpeedNotIn(List<String> speedNotIn) {
        this.speedNotIn = speedNotIn;
    }

    public StorageAdapterWhereInput speedNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput speedNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_IN);
        return this;
    }

    public void setSpeedNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_IN);
        }
    }

    public boolean getSpeedNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_NOT_IN);
    }

    public StorageAdapterWhereInput speedNotStartsWith(String speedNotStartsWith) {

        this.speedNotStartsWith = speedNotStartsWith;
        return this;
    }

    /**
     * Get speedNotStartsWith
     *
     * @return speedNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedNotStartsWith() {
        return speedNotStartsWith;
    }

    public void setSpeedNotStartsWith(String speedNotStartsWith) {
        this.speedNotStartsWith = speedNotStartsWith;
    }

    public StorageAdapterWhereInput speedNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput speedNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_STARTS_WITH);
        return this;
    }

    public void setSpeedNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_NOT_STARTS_WITH);
        }
    }

    public boolean getSpeedNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput speedStartsWith(String speedStartsWith) {

        this.speedStartsWith = speedStartsWith;
        return this;
    }

    /**
     * Get speedStartsWith
     *
     * @return speedStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSpeedStartsWith() {
        return speedStartsWith;
    }

    public void setSpeedStartsWith(String speedStartsWith) {
        this.speedStartsWith = speedStartsWith;
    }

    public StorageAdapterWhereInput speedStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SPEED_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput speedStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SPEED_STARTS_WITH);
        return this;
    }

    public void setSpeedStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SPEED_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SPEED_STARTS_WITH);
        }
    }

    public boolean getSpeedStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SPEED_STARTS_WITH);
    }

    public StorageAdapterWhereInput status(StorageAdapterStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageAdapterStatus getStatus() {
        return status;
    }

    public void setStatus(StorageAdapterStatus status) {
        this.status = status;
    }

    public StorageAdapterWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public StorageAdapterWhereInput status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public StorageAdapterWhereInput statusIn(List<StorageAdapterStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public StorageAdapterWhereInput addStatusInItem(StorageAdapterStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<StorageAdapterStatus>();
        }
        this.statusIn.add(statusInItem);
        return this;
    }

    /**
     * Get statusIn
     *
     * @return statusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageAdapterStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<StorageAdapterStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public StorageAdapterWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public StorageAdapterWhereInput statusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public void setStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        }
    }

    public boolean getStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_IN);
    }

    public StorageAdapterWhereInput statusNot(StorageAdapterStatus statusNot) {

        this.statusNot = statusNot;
        return this;
    }

    /**
     * Get statusNot
     *
     * @return statusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageAdapterStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(StorageAdapterStatus statusNot) {
        this.statusNot = statusNot;
    }

    public StorageAdapterWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public StorageAdapterWhereInput statusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public void setStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        }
    }

    public boolean getStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT);
    }

    public StorageAdapterWhereInput statusNotIn(List<StorageAdapterStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public StorageAdapterWhereInput addStatusNotInItem(StorageAdapterStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<StorageAdapterStatus>();
        }
        this.statusNotIn.add(statusNotInItem);
        return this;
    }

    /**
     * Get statusNotIn
     *
     * @return statusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageAdapterStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<StorageAdapterStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public StorageAdapterWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput statusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public void setStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        }
    }

    public boolean getStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT_IN);
    }

    public StorageAdapterWhereInput storageDevicePathsEvery(
            StorageDevicePathWhereInput storageDevicePathsEvery) {

        this.storageDevicePathsEvery = storageDevicePathsEvery;
        return this;
    }

    /**
     * Get storageDevicePathsEvery
     *
     * @return storageDevicePathsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathWhereInput getStorageDevicePathsEvery() {
        return storageDevicePathsEvery;
    }

    public void setStorageDevicePathsEvery(StorageDevicePathWhereInput storageDevicePathsEvery) {
        this.storageDevicePathsEvery = storageDevicePathsEvery;
    }

    public StorageAdapterWhereInput storageDevicePathsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        return this;
    }

    public StorageAdapterWhereInput storageDevicePathsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        return this;
    }

    public void setStorageDevicePathsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
        }
    }

    public boolean getStorageDevicePathsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_EVERY);
    }

    public StorageAdapterWhereInput storageDevicePathsNone(
            StorageDevicePathWhereInput storageDevicePathsNone) {

        this.storageDevicePathsNone = storageDevicePathsNone;
        return this;
    }

    /**
     * Get storageDevicePathsNone
     *
     * @return storageDevicePathsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathWhereInput getStorageDevicePathsNone() {
        return storageDevicePathsNone;
    }

    public void setStorageDevicePathsNone(StorageDevicePathWhereInput storageDevicePathsNone) {
        this.storageDevicePathsNone = storageDevicePathsNone;
    }

    public StorageAdapterWhereInput storageDevicePathsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        return this;
    }

    public StorageAdapterWhereInput storageDevicePathsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        return this;
    }

    public void setStorageDevicePathsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
        }
    }

    public boolean getStorageDevicePathsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_NONE);
    }

    public StorageAdapterWhereInput storageDevicePathsSome(
            StorageDevicePathWhereInput storageDevicePathsSome) {

        this.storageDevicePathsSome = storageDevicePathsSome;
        return this;
    }

    /**
     * Get storageDevicePathsSome
     *
     * @return storageDevicePathsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDevicePathWhereInput getStorageDevicePathsSome() {
        return storageDevicePathsSome;
    }

    public void setStorageDevicePathsSome(StorageDevicePathWhereInput storageDevicePathsSome) {
        this.storageDevicePathsSome = storageDevicePathsSome;
    }

    public StorageAdapterWhereInput storageDevicePathsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        return this;
    }

    public StorageAdapterWhereInput storageDevicePathsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        return this;
    }

    public void setStorageDevicePathsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
        }
    }

    public boolean getStorageDevicePathsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICE_PATHS_SOME);
    }

    public StorageAdapterWhereInput storageDevicesEvery(
            StorageDeviceWhereInput storageDevicesEvery) {

        this.storageDevicesEvery = storageDevicesEvery;
        return this;
    }

    /**
     * Get storageDevicesEvery
     *
     * @return storageDevicesEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceWhereInput getStorageDevicesEvery() {
        return storageDevicesEvery;
    }

    public void setStorageDevicesEvery(StorageDeviceWhereInput storageDevicesEvery) {
        this.storageDevicesEvery = storageDevicesEvery;
    }

    public StorageAdapterWhereInput storageDevicesEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICES_EVERY);
        return this;
    }

    public StorageAdapterWhereInput storageDevicesEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICES_EVERY);
        return this;
    }

    public void setStorageDevicesEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICES_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICES_EVERY);
        }
    }

    public boolean getStorageDevicesEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICES_EVERY);
    }

    public StorageAdapterWhereInput storageDevicesNone(StorageDeviceWhereInput storageDevicesNone) {

        this.storageDevicesNone = storageDevicesNone;
        return this;
    }

    /**
     * Get storageDevicesNone
     *
     * @return storageDevicesNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceWhereInput getStorageDevicesNone() {
        return storageDevicesNone;
    }

    public void setStorageDevicesNone(StorageDeviceWhereInput storageDevicesNone) {
        this.storageDevicesNone = storageDevicesNone;
    }

    public StorageAdapterWhereInput storageDevicesNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICES_NONE);
        return this;
    }

    public StorageAdapterWhereInput storageDevicesNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICES_NONE);
        return this;
    }

    public void setStorageDevicesNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICES_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICES_NONE);
        }
    }

    public boolean getStorageDevicesNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICES_NONE);
    }

    public StorageAdapterWhereInput storageDevicesSome(StorageDeviceWhereInput storageDevicesSome) {

        this.storageDevicesSome = storageDevicesSome;
        return this;
    }

    /**
     * Get storageDevicesSome
     *
     * @return storageDevicesSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageDeviceWhereInput getStorageDevicesSome() {
        return storageDevicesSome;
    }

    public void setStorageDevicesSome(StorageDeviceWhereInput storageDevicesSome) {
        this.storageDevicesSome = storageDevicesSome;
    }

    public StorageAdapterWhereInput storageDevicesSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICES_SOME);
        return this;
    }

    public StorageAdapterWhereInput storageDevicesSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICES_SOME);
        return this;
    }

    public void setStorageDevicesSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_DEVICES_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_DEVICES_SOME);
        }
    }

    public boolean getStorageDevicesSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_DEVICES_SOME);
    }

    public StorageAdapterWhereInput storageTargetsEvery(
            StorageTargetWhereInput storageTargetsEvery) {

        this.storageTargetsEvery = storageTargetsEvery;
        return this;
    }

    /**
     * Get storageTargetsEvery
     *
     * @return storageTargetsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageTargetWhereInput getStorageTargetsEvery() {
        return storageTargetsEvery;
    }

    public void setStorageTargetsEvery(StorageTargetWhereInput storageTargetsEvery) {
        this.storageTargetsEvery = storageTargetsEvery;
    }

    public StorageAdapterWhereInput storageTargetsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_TARGETS_EVERY);
        return this;
    }

    public StorageAdapterWhereInput storageTargetsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_TARGETS_EVERY);
        return this;
    }

    public void setStorageTargetsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_TARGETS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_TARGETS_EVERY);
        }
    }

    public boolean getStorageTargetsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_TARGETS_EVERY);
    }

    public StorageAdapterWhereInput storageTargetsNone(StorageTargetWhereInput storageTargetsNone) {

        this.storageTargetsNone = storageTargetsNone;
        return this;
    }

    /**
     * Get storageTargetsNone
     *
     * @return storageTargetsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageTargetWhereInput getStorageTargetsNone() {
        return storageTargetsNone;
    }

    public void setStorageTargetsNone(StorageTargetWhereInput storageTargetsNone) {
        this.storageTargetsNone = storageTargetsNone;
    }

    public StorageAdapterWhereInput storageTargetsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_TARGETS_NONE);
        return this;
    }

    public StorageAdapterWhereInput storageTargetsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_TARGETS_NONE);
        return this;
    }

    public void setStorageTargetsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_TARGETS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_TARGETS_NONE);
        }
    }

    public boolean getStorageTargetsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_TARGETS_NONE);
    }

    public StorageAdapterWhereInput storageTargetsSome(StorageTargetWhereInput storageTargetsSome) {

        this.storageTargetsSome = storageTargetsSome;
        return this;
    }

    /**
     * Get storageTargetsSome
     *
     * @return storageTargetsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageTargetWhereInput getStorageTargetsSome() {
        return storageTargetsSome;
    }

    public void setStorageTargetsSome(StorageTargetWhereInput storageTargetsSome) {
        this.storageTargetsSome = storageTargetsSome;
    }

    public StorageAdapterWhereInput storageTargetsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_TARGETS_SOME);
        return this;
    }

    public StorageAdapterWhereInput storageTargetsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_TARGETS_SOME);
        return this;
    }

    public void setStorageTargetsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_TARGETS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_TARGETS_SOME);
        }
    }

    public boolean getStorageTargetsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_TARGETS_SOME);
    }

    public StorageAdapterWhereInput targetNum(Integer targetNum) {

        this.targetNum = targetNum;
        return this;
    }

    /**
     * Get targetNum
     *
     * @return targetNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNum() {
        return targetNum;
    }

    public void setTargetNum(Integer targetNum) {
        this.targetNum = targetNum;
    }

    public StorageAdapterWhereInput targetNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM);
        return this;
    }

    public StorageAdapterWhereInput targetNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM);
        return this;
    }

    public void setTargetNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM);
        }
    }

    public boolean getTargetNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM);
    }

    public StorageAdapterWhereInput targetNumGt(Integer targetNumGt) {

        this.targetNumGt = targetNumGt;
        return this;
    }

    /**
     * Get targetNumGt
     *
     * @return targetNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumGt() {
        return targetNumGt;
    }

    public void setTargetNumGt(Integer targetNumGt) {
        this.targetNumGt = targetNumGt;
    }

    public StorageAdapterWhereInput targetNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GT);
        return this;
    }

    public StorageAdapterWhereInput targetNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GT);
        return this;
    }

    public void setTargetNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GT);
        }
    }

    public boolean getTargetNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_GT);
    }

    public StorageAdapterWhereInput targetNumGte(Integer targetNumGte) {

        this.targetNumGte = targetNumGte;
        return this;
    }

    /**
     * Get targetNumGte
     *
     * @return targetNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumGte() {
        return targetNumGte;
    }

    public void setTargetNumGte(Integer targetNumGte) {
        this.targetNumGte = targetNumGte;
    }

    public StorageAdapterWhereInput targetNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GTE);
        return this;
    }

    public StorageAdapterWhereInput targetNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GTE);
        return this;
    }

    public void setTargetNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_GTE);
        }
    }

    public boolean getTargetNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_GTE);
    }

    public StorageAdapterWhereInput targetNumIn(List<Integer> targetNumIn) {

        this.targetNumIn = targetNumIn;
        return this;
    }

    public StorageAdapterWhereInput addTargetNumInItem(Integer targetNumInItem) {
        if (this.targetNumIn == null) {
            this.targetNumIn = new ArrayList<Integer>();
        }
        this.targetNumIn.add(targetNumInItem);
        return this;
    }

    /**
     * Get targetNumIn
     *
     * @return targetNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTargetNumIn() {
        return targetNumIn;
    }

    public void setTargetNumIn(List<Integer> targetNumIn) {
        this.targetNumIn = targetNumIn;
    }

    public StorageAdapterWhereInput targetNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_IN);
        return this;
    }

    public StorageAdapterWhereInput targetNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_IN);
        return this;
    }

    public void setTargetNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_IN);
        }
    }

    public boolean getTargetNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_IN);
    }

    public StorageAdapterWhereInput targetNumLt(Integer targetNumLt) {

        this.targetNumLt = targetNumLt;
        return this;
    }

    /**
     * Get targetNumLt
     *
     * @return targetNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumLt() {
        return targetNumLt;
    }

    public void setTargetNumLt(Integer targetNumLt) {
        this.targetNumLt = targetNumLt;
    }

    public StorageAdapterWhereInput targetNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LT);
        return this;
    }

    public StorageAdapterWhereInput targetNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LT);
        return this;
    }

    public void setTargetNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LT);
        }
    }

    public boolean getTargetNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_LT);
    }

    public StorageAdapterWhereInput targetNumLte(Integer targetNumLte) {

        this.targetNumLte = targetNumLte;
        return this;
    }

    /**
     * Get targetNumLte
     *
     * @return targetNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumLte() {
        return targetNumLte;
    }

    public void setTargetNumLte(Integer targetNumLte) {
        this.targetNumLte = targetNumLte;
    }

    public StorageAdapterWhereInput targetNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LTE);
        return this;
    }

    public StorageAdapterWhereInput targetNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LTE);
        return this;
    }

    public void setTargetNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_LTE);
        }
    }

    public boolean getTargetNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_LTE);
    }

    public StorageAdapterWhereInput targetNumNot(Integer targetNumNot) {

        this.targetNumNot = targetNumNot;
        return this;
    }

    /**
     * Get targetNumNot
     *
     * @return targetNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetNumNot() {
        return targetNumNot;
    }

    public void setTargetNumNot(Integer targetNumNot) {
        this.targetNumNot = targetNumNot;
    }

    public StorageAdapterWhereInput targetNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT);
        return this;
    }

    public StorageAdapterWhereInput targetNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT);
        return this;
    }

    public void setTargetNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT);
        }
    }

    public boolean getTargetNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_NOT);
    }

    public StorageAdapterWhereInput targetNumNotIn(List<Integer> targetNumNotIn) {

        this.targetNumNotIn = targetNumNotIn;
        return this;
    }

    public StorageAdapterWhereInput addTargetNumNotInItem(Integer targetNumNotInItem) {
        if (this.targetNumNotIn == null) {
            this.targetNumNotIn = new ArrayList<Integer>();
        }
        this.targetNumNotIn.add(targetNumNotInItem);
        return this;
    }

    /**
     * Get targetNumNotIn
     *
     * @return targetNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTargetNumNotIn() {
        return targetNumNotIn;
    }

    public void setTargetNumNotIn(List<Integer> targetNumNotIn) {
        this.targetNumNotIn = targetNumNotIn;
    }

    public StorageAdapterWhereInput targetNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput targetNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        return this;
    }

    public void setTargetNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
        }
    }

    public boolean getTargetNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_NUM_NOT_IN);
    }

    public StorageAdapterWhereInput type(StorageAdapterType type) {

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
    public StorageAdapterType getType() {
        return type;
    }

    public void setType(StorageAdapterType type) {
        this.type = type;
    }

    public StorageAdapterWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public StorageAdapterWhereInput type_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput typeIn(List<StorageAdapterType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public StorageAdapterWhereInput addTypeInItem(StorageAdapterType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<StorageAdapterType>();
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
    public List<StorageAdapterType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<StorageAdapterType> typeIn) {
        this.typeIn = typeIn;
    }

    public StorageAdapterWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public StorageAdapterWhereInput typeIn_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput typeNot(StorageAdapterType typeNot) {

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
    public StorageAdapterType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(StorageAdapterType typeNot) {
        this.typeNot = typeNot;
    }

    public StorageAdapterWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public StorageAdapterWhereInput typeNot_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput typeNotIn(List<StorageAdapterType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public StorageAdapterWhereInput addTypeNotInItem(StorageAdapterType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<StorageAdapterType>();
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
    public List<StorageAdapterType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<StorageAdapterType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public StorageAdapterWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput typeNotIn_ExplictlyNonNull() {
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

    public StorageAdapterWhereInput vlansEvery(VlanWhereInput vlansEvery) {

        this.vlansEvery = vlansEvery;
        return this;
    }

    /**
     * Get vlansEvery
     *
     * @return vlansEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansEvery() {
        return vlansEvery;
    }

    public void setVlansEvery(VlanWhereInput vlansEvery) {
        this.vlansEvery = vlansEvery;
    }

    public StorageAdapterWhereInput vlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_EVERY);
        return this;
    }

    public StorageAdapterWhereInput vlansEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_EVERY);
        return this;
    }

    public void setVlansEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_EVERY);
        }
    }

    public boolean getVlansEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_EVERY);
    }

    public StorageAdapterWhereInput vlansNone(VlanWhereInput vlansNone) {

        this.vlansNone = vlansNone;
        return this;
    }

    /**
     * Get vlansNone
     *
     * @return vlansNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansNone() {
        return vlansNone;
    }

    public void setVlansNone(VlanWhereInput vlansNone) {
        this.vlansNone = vlansNone;
    }

    public StorageAdapterWhereInput vlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_NONE);
        return this;
    }

    public StorageAdapterWhereInput vlansNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_NONE);
        return this;
    }

    public void setVlansNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_NONE);
        }
    }

    public boolean getVlansNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_NONE);
    }

    public StorageAdapterWhereInput vlansSome(VlanWhereInput vlansSome) {

        this.vlansSome = vlansSome;
        return this;
    }

    /**
     * Get vlansSome
     *
     * @return vlansSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlansSome() {
        return vlansSome;
    }

    public void setVlansSome(VlanWhereInput vlansSome) {
        this.vlansSome = vlansSome;
    }

    public StorageAdapterWhereInput vlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS_SOME);
        return this;
    }

    public StorageAdapterWhereInput vlansSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS_SOME);
        return this;
    }

    public void setVlansSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS_SOME);
        }
    }

    public boolean getVlansSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS_SOME);
    }

    public StorageAdapterWhereInput wwnn(String wwnn) {

        this.wwnn = wwnn;
        return this;
    }

    /**
     * Get wwnn
     *
     * @return wwnn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnn() {
        return wwnn;
    }

    public void setWwnn(String wwnn) {
        this.wwnn = wwnn;
    }

    public StorageAdapterWhereInput wwnn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN);
        return this;
    }

    public StorageAdapterWhereInput wwnn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN);
        return this;
    }

    public void setWwnn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN);
        }
    }

    public boolean getWwnn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN);
    }

    public StorageAdapterWhereInput wwnnContains(String wwnnContains) {

        this.wwnnContains = wwnnContains;
        return this;
    }

    /**
     * Get wwnnContains
     *
     * @return wwnnContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnContains() {
        return wwnnContains;
    }

    public void setWwnnContains(String wwnnContains) {
        this.wwnnContains = wwnnContains;
    }

    public StorageAdapterWhereInput wwnnContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput wwnnContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_CONTAINS);
        return this;
    }

    public void setWwnnContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_CONTAINS);
        }
    }

    public boolean getWwnnContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_CONTAINS);
    }

    public StorageAdapterWhereInput wwnnEndsWith(String wwnnEndsWith) {

        this.wwnnEndsWith = wwnnEndsWith;
        return this;
    }

    /**
     * Get wwnnEndsWith
     *
     * @return wwnnEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnEndsWith() {
        return wwnnEndsWith;
    }

    public void setWwnnEndsWith(String wwnnEndsWith) {
        this.wwnnEndsWith = wwnnEndsWith;
    }

    public StorageAdapterWhereInput wwnnEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwnnEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_ENDS_WITH);
        return this;
    }

    public void setWwnnEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_ENDS_WITH);
        }
    }

    public boolean getWwnnEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_ENDS_WITH);
    }

    public StorageAdapterWhereInput wwnnGt(String wwnnGt) {

        this.wwnnGt = wwnnGt;
        return this;
    }

    /**
     * Get wwnnGt
     *
     * @return wwnnGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnGt() {
        return wwnnGt;
    }

    public void setWwnnGt(String wwnnGt) {
        this.wwnnGt = wwnnGt;
    }

    public StorageAdapterWhereInput wwnnGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_GT);
        return this;
    }

    public StorageAdapterWhereInput wwnnGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_GT);
        return this;
    }

    public void setWwnnGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_GT);
        }
    }

    public boolean getWwnnGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_GT);
    }

    public StorageAdapterWhereInput wwnnGte(String wwnnGte) {

        this.wwnnGte = wwnnGte;
        return this;
    }

    /**
     * Get wwnnGte
     *
     * @return wwnnGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnGte() {
        return wwnnGte;
    }

    public void setWwnnGte(String wwnnGte) {
        this.wwnnGte = wwnnGte;
    }

    public StorageAdapterWhereInput wwnnGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_GTE);
        return this;
    }

    public StorageAdapterWhereInput wwnnGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_GTE);
        return this;
    }

    public void setWwnnGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_GTE);
        }
    }

    public boolean getWwnnGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_GTE);
    }

    public StorageAdapterWhereInput wwnnIn(List<String> wwnnIn) {

        this.wwnnIn = wwnnIn;
        return this;
    }

    public StorageAdapterWhereInput addWwnnInItem(String wwnnInItem) {
        if (this.wwnnIn == null) {
            this.wwnnIn = new ArrayList<String>();
        }
        this.wwnnIn.add(wwnnInItem);
        return this;
    }

    /**
     * Get wwnnIn
     *
     * @return wwnnIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWwnnIn() {
        return wwnnIn;
    }

    public void setWwnnIn(List<String> wwnnIn) {
        this.wwnnIn = wwnnIn;
    }

    public StorageAdapterWhereInput wwnnIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_IN);
        return this;
    }

    public StorageAdapterWhereInput wwnnIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_IN);
        return this;
    }

    public void setWwnnIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_IN);
        }
    }

    public boolean getWwnnIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_IN);
    }

    public StorageAdapterWhereInput wwnnLt(String wwnnLt) {

        this.wwnnLt = wwnnLt;
        return this;
    }

    /**
     * Get wwnnLt
     *
     * @return wwnnLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnLt() {
        return wwnnLt;
    }

    public void setWwnnLt(String wwnnLt) {
        this.wwnnLt = wwnnLt;
    }

    public StorageAdapterWhereInput wwnnLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_LT);
        return this;
    }

    public StorageAdapterWhereInput wwnnLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_LT);
        return this;
    }

    public void setWwnnLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_LT);
        }
    }

    public boolean getWwnnLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_LT);
    }

    public StorageAdapterWhereInput wwnnLte(String wwnnLte) {

        this.wwnnLte = wwnnLte;
        return this;
    }

    /**
     * Get wwnnLte
     *
     * @return wwnnLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnLte() {
        return wwnnLte;
    }

    public void setWwnnLte(String wwnnLte) {
        this.wwnnLte = wwnnLte;
    }

    public StorageAdapterWhereInput wwnnLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_LTE);
        return this;
    }

    public StorageAdapterWhereInput wwnnLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_LTE);
        return this;
    }

    public void setWwnnLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_LTE);
        }
    }

    public boolean getWwnnLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_LTE);
    }

    public StorageAdapterWhereInput wwnnNot(String wwnnNot) {

        this.wwnnNot = wwnnNot;
        return this;
    }

    /**
     * Get wwnnNot
     *
     * @return wwnnNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnNot() {
        return wwnnNot;
    }

    public void setWwnnNot(String wwnnNot) {
        this.wwnnNot = wwnnNot;
    }

    public StorageAdapterWhereInput wwnnNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT);
        return this;
    }

    public StorageAdapterWhereInput wwnnNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT);
        return this;
    }

    public void setWwnnNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT);
        }
    }

    public boolean getWwnnNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_NOT);
    }

    public StorageAdapterWhereInput wwnnNotContains(String wwnnNotContains) {

        this.wwnnNotContains = wwnnNotContains;
        return this;
    }

    /**
     * Get wwnnNotContains
     *
     * @return wwnnNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnNotContains() {
        return wwnnNotContains;
    }

    public void setWwnnNotContains(String wwnnNotContains) {
        this.wwnnNotContains = wwnnNotContains;
    }

    public StorageAdapterWhereInput wwnnNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput wwnnNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_CONTAINS);
        return this;
    }

    public void setWwnnNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_CONTAINS);
        }
    }

    public boolean getWwnnNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput wwnnNotEndsWith(String wwnnNotEndsWith) {

        this.wwnnNotEndsWith = wwnnNotEndsWith;
        return this;
    }

    /**
     * Get wwnnNotEndsWith
     *
     * @return wwnnNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnNotEndsWith() {
        return wwnnNotEndsWith;
    }

    public void setWwnnNotEndsWith(String wwnnNotEndsWith) {
        this.wwnnNotEndsWith = wwnnNotEndsWith;
    }

    public StorageAdapterWhereInput wwnnNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwnnNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_ENDS_WITH);
        return this;
    }

    public void setWwnnNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_ENDS_WITH);
        }
    }

    public boolean getWwnnNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput wwnnNotIn(List<String> wwnnNotIn) {

        this.wwnnNotIn = wwnnNotIn;
        return this;
    }

    public StorageAdapterWhereInput addWwnnNotInItem(String wwnnNotInItem) {
        if (this.wwnnNotIn == null) {
            this.wwnnNotIn = new ArrayList<String>();
        }
        this.wwnnNotIn.add(wwnnNotInItem);
        return this;
    }

    /**
     * Get wwnnNotIn
     *
     * @return wwnnNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWwnnNotIn() {
        return wwnnNotIn;
    }

    public void setWwnnNotIn(List<String> wwnnNotIn) {
        this.wwnnNotIn = wwnnNotIn;
    }

    public StorageAdapterWhereInput wwnnNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput wwnnNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_IN);
        return this;
    }

    public void setWwnnNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_IN);
        }
    }

    public boolean getWwnnNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_NOT_IN);
    }

    public StorageAdapterWhereInput wwnnNotStartsWith(String wwnnNotStartsWith) {

        this.wwnnNotStartsWith = wwnnNotStartsWith;
        return this;
    }

    /**
     * Get wwnnNotStartsWith
     *
     * @return wwnnNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnNotStartsWith() {
        return wwnnNotStartsWith;
    }

    public void setWwnnNotStartsWith(String wwnnNotStartsWith) {
        this.wwnnNotStartsWith = wwnnNotStartsWith;
    }

    public StorageAdapterWhereInput wwnnNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwnnNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_STARTS_WITH);
        return this;
    }

    public void setWwnnNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_NOT_STARTS_WITH);
        }
    }

    public boolean getWwnnNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput wwnnStartsWith(String wwnnStartsWith) {

        this.wwnnStartsWith = wwnnStartsWith;
        return this;
    }

    /**
     * Get wwnnStartsWith
     *
     * @return wwnnStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwnnStartsWith() {
        return wwnnStartsWith;
    }

    public void setWwnnStartsWith(String wwnnStartsWith) {
        this.wwnnStartsWith = wwnnStartsWith;
    }

    public StorageAdapterWhereInput wwnnStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWNN_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwnnStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWNN_STARTS_WITH);
        return this;
    }

    public void setWwnnStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWNN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWNN_STARTS_WITH);
        }
    }

    public boolean getWwnnStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWNN_STARTS_WITH);
    }

    public StorageAdapterWhereInput wwpn(String wwpn) {

        this.wwpn = wwpn;
        return this;
    }

    /**
     * Get wwpn
     *
     * @return wwpn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpn() {
        return wwpn;
    }

    public void setWwpn(String wwpn) {
        this.wwpn = wwpn;
    }

    public StorageAdapterWhereInput wwpn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN);
        return this;
    }

    public StorageAdapterWhereInput wwpn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN);
        return this;
    }

    public void setWwpn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN);
        }
    }

    public boolean getWwpn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN);
    }

    public StorageAdapterWhereInput wwpnContains(String wwpnContains) {

        this.wwpnContains = wwpnContains;
        return this;
    }

    /**
     * Get wwpnContains
     *
     * @return wwpnContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnContains() {
        return wwpnContains;
    }

    public void setWwpnContains(String wwpnContains) {
        this.wwpnContains = wwpnContains;
    }

    public StorageAdapterWhereInput wwpnContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput wwpnContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_CONTAINS);
        return this;
    }

    public void setWwpnContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_CONTAINS);
        }
    }

    public boolean getWwpnContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_CONTAINS);
    }

    public StorageAdapterWhereInput wwpnEndsWith(String wwpnEndsWith) {

        this.wwpnEndsWith = wwpnEndsWith;
        return this;
    }

    /**
     * Get wwpnEndsWith
     *
     * @return wwpnEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnEndsWith() {
        return wwpnEndsWith;
    }

    public void setWwpnEndsWith(String wwpnEndsWith) {
        this.wwpnEndsWith = wwpnEndsWith;
    }

    public StorageAdapterWhereInput wwpnEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwpnEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_ENDS_WITH);
        return this;
    }

    public void setWwpnEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_ENDS_WITH);
        }
    }

    public boolean getWwpnEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_ENDS_WITH);
    }

    public StorageAdapterWhereInput wwpnGt(String wwpnGt) {

        this.wwpnGt = wwpnGt;
        return this;
    }

    /**
     * Get wwpnGt
     *
     * @return wwpnGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnGt() {
        return wwpnGt;
    }

    public void setWwpnGt(String wwpnGt) {
        this.wwpnGt = wwpnGt;
    }

    public StorageAdapterWhereInput wwpnGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_GT);
        return this;
    }

    public StorageAdapterWhereInput wwpnGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_GT);
        return this;
    }

    public void setWwpnGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_GT);
        }
    }

    public boolean getWwpnGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_GT);
    }

    public StorageAdapterWhereInput wwpnGte(String wwpnGte) {

        this.wwpnGte = wwpnGte;
        return this;
    }

    /**
     * Get wwpnGte
     *
     * @return wwpnGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnGte() {
        return wwpnGte;
    }

    public void setWwpnGte(String wwpnGte) {
        this.wwpnGte = wwpnGte;
    }

    public StorageAdapterWhereInput wwpnGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_GTE);
        return this;
    }

    public StorageAdapterWhereInput wwpnGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_GTE);
        return this;
    }

    public void setWwpnGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_GTE);
        }
    }

    public boolean getWwpnGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_GTE);
    }

    public StorageAdapterWhereInput wwpnIn(List<String> wwpnIn) {

        this.wwpnIn = wwpnIn;
        return this;
    }

    public StorageAdapterWhereInput addWwpnInItem(String wwpnInItem) {
        if (this.wwpnIn == null) {
            this.wwpnIn = new ArrayList<String>();
        }
        this.wwpnIn.add(wwpnInItem);
        return this;
    }

    /**
     * Get wwpnIn
     *
     * @return wwpnIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWwpnIn() {
        return wwpnIn;
    }

    public void setWwpnIn(List<String> wwpnIn) {
        this.wwpnIn = wwpnIn;
    }

    public StorageAdapterWhereInput wwpnIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_IN);
        return this;
    }

    public StorageAdapterWhereInput wwpnIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_IN);
        return this;
    }

    public void setWwpnIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_IN);
        }
    }

    public boolean getWwpnIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_IN);
    }

    public StorageAdapterWhereInput wwpnLt(String wwpnLt) {

        this.wwpnLt = wwpnLt;
        return this;
    }

    /**
     * Get wwpnLt
     *
     * @return wwpnLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnLt() {
        return wwpnLt;
    }

    public void setWwpnLt(String wwpnLt) {
        this.wwpnLt = wwpnLt;
    }

    public StorageAdapterWhereInput wwpnLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_LT);
        return this;
    }

    public StorageAdapterWhereInput wwpnLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_LT);
        return this;
    }

    public void setWwpnLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_LT);
        }
    }

    public boolean getWwpnLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_LT);
    }

    public StorageAdapterWhereInput wwpnLte(String wwpnLte) {

        this.wwpnLte = wwpnLte;
        return this;
    }

    /**
     * Get wwpnLte
     *
     * @return wwpnLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnLte() {
        return wwpnLte;
    }

    public void setWwpnLte(String wwpnLte) {
        this.wwpnLte = wwpnLte;
    }

    public StorageAdapterWhereInput wwpnLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_LTE);
        return this;
    }

    public StorageAdapterWhereInput wwpnLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_LTE);
        return this;
    }

    public void setWwpnLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_LTE);
        }
    }

    public boolean getWwpnLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_LTE);
    }

    public StorageAdapterWhereInput wwpnNot(String wwpnNot) {

        this.wwpnNot = wwpnNot;
        return this;
    }

    /**
     * Get wwpnNot
     *
     * @return wwpnNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnNot() {
        return wwpnNot;
    }

    public void setWwpnNot(String wwpnNot) {
        this.wwpnNot = wwpnNot;
    }

    public StorageAdapterWhereInput wwpnNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT);
        return this;
    }

    public StorageAdapterWhereInput wwpnNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT);
        return this;
    }

    public void setWwpnNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT);
        }
    }

    public boolean getWwpnNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_NOT);
    }

    public StorageAdapterWhereInput wwpnNotContains(String wwpnNotContains) {

        this.wwpnNotContains = wwpnNotContains;
        return this;
    }

    /**
     * Get wwpnNotContains
     *
     * @return wwpnNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnNotContains() {
        return wwpnNotContains;
    }

    public void setWwpnNotContains(String wwpnNotContains) {
        this.wwpnNotContains = wwpnNotContains;
    }

    public StorageAdapterWhereInput wwpnNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_CONTAINS);
        return this;
    }

    public StorageAdapterWhereInput wwpnNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_CONTAINS);
        return this;
    }

    public void setWwpnNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_CONTAINS);
        }
    }

    public boolean getWwpnNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_NOT_CONTAINS);
    }

    public StorageAdapterWhereInput wwpnNotEndsWith(String wwpnNotEndsWith) {

        this.wwpnNotEndsWith = wwpnNotEndsWith;
        return this;
    }

    /**
     * Get wwpnNotEndsWith
     *
     * @return wwpnNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnNotEndsWith() {
        return wwpnNotEndsWith;
    }

    public void setWwpnNotEndsWith(String wwpnNotEndsWith) {
        this.wwpnNotEndsWith = wwpnNotEndsWith;
    }

    public StorageAdapterWhereInput wwpnNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_ENDS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwpnNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_ENDS_WITH);
        return this;
    }

    public void setWwpnNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_ENDS_WITH);
        }
    }

    public boolean getWwpnNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_NOT_ENDS_WITH);
    }

    public StorageAdapterWhereInput wwpnNotIn(List<String> wwpnNotIn) {

        this.wwpnNotIn = wwpnNotIn;
        return this;
    }

    public StorageAdapterWhereInput addWwpnNotInItem(String wwpnNotInItem) {
        if (this.wwpnNotIn == null) {
            this.wwpnNotIn = new ArrayList<String>();
        }
        this.wwpnNotIn.add(wwpnNotInItem);
        return this;
    }

    /**
     * Get wwpnNotIn
     *
     * @return wwpnNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWwpnNotIn() {
        return wwpnNotIn;
    }

    public void setWwpnNotIn(List<String> wwpnNotIn) {
        this.wwpnNotIn = wwpnNotIn;
    }

    public StorageAdapterWhereInput wwpnNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_IN);
        return this;
    }

    public StorageAdapterWhereInput wwpnNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_IN);
        return this;
    }

    public void setWwpnNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_IN);
        }
    }

    public boolean getWwpnNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_NOT_IN);
    }

    public StorageAdapterWhereInput wwpnNotStartsWith(String wwpnNotStartsWith) {

        this.wwpnNotStartsWith = wwpnNotStartsWith;
        return this;
    }

    /**
     * Get wwpnNotStartsWith
     *
     * @return wwpnNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnNotStartsWith() {
        return wwpnNotStartsWith;
    }

    public void setWwpnNotStartsWith(String wwpnNotStartsWith) {
        this.wwpnNotStartsWith = wwpnNotStartsWith;
    }

    public StorageAdapterWhereInput wwpnNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwpnNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_STARTS_WITH);
        return this;
    }

    public void setWwpnNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_NOT_STARTS_WITH);
        }
    }

    public boolean getWwpnNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_NOT_STARTS_WITH);
    }

    public StorageAdapterWhereInput wwpnStartsWith(String wwpnStartsWith) {

        this.wwpnStartsWith = wwpnStartsWith;
        return this;
    }

    /**
     * Get wwpnStartsWith
     *
     * @return wwpnStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWwpnStartsWith() {
        return wwpnStartsWith;
    }

    public void setWwpnStartsWith(String wwpnStartsWith) {
        this.wwpnStartsWith = wwpnStartsWith;
    }

    public StorageAdapterWhereInput wwpnStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WWPN_STARTS_WITH);
        return this;
    }

    public StorageAdapterWhereInput wwpnStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WWPN_STARTS_WITH);
        return this;
    }

    public void setWwpnStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WWPN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WWPN_STARTS_WITH);
        }
    }

    public boolean getWwpnStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WWPN_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageAdapterWhereInput storageAdapterWhereInput = (StorageAdapterWhereInput) o;
        return Objects.equals(this.AND, storageAdapterWhereInput.AND)
                && Objects.equals(this.NOT, storageAdapterWhereInput.NOT)
                && Objects.equals(this.OR, storageAdapterWhereInput.OR)
                && Objects.equals(this.aliasName, storageAdapterWhereInput.aliasName)
                && Objects.equals(
                        this.aliasNameContains, storageAdapterWhereInput.aliasNameContains)
                && Objects.equals(
                        this.aliasNameEndsWith, storageAdapterWhereInput.aliasNameEndsWith)
                && Objects.equals(this.aliasNameGt, storageAdapterWhereInput.aliasNameGt)
                && Objects.equals(this.aliasNameGte, storageAdapterWhereInput.aliasNameGte)
                && Objects.equals(this.aliasNameIn, storageAdapterWhereInput.aliasNameIn)
                && Objects.equals(this.aliasNameLt, storageAdapterWhereInput.aliasNameLt)
                && Objects.equals(this.aliasNameLte, storageAdapterWhereInput.aliasNameLte)
                && Objects.equals(this.aliasNameNot, storageAdapterWhereInput.aliasNameNot)
                && Objects.equals(
                        this.aliasNameNotContains, storageAdapterWhereInput.aliasNameNotContains)
                && Objects.equals(
                        this.aliasNameNotEndsWith, storageAdapterWhereInput.aliasNameNotEndsWith)
                && Objects.equals(this.aliasNameNotIn, storageAdapterWhereInput.aliasNameNotIn)
                && Objects.equals(
                        this.aliasNameNotStartsWith,
                        storageAdapterWhereInput.aliasNameNotStartsWith)
                && Objects.equals(
                        this.aliasNameStartsWith, storageAdapterWhereInput.aliasNameStartsWith)
                && Objects.equals(this.chapPassword, storageAdapterWhereInput.chapPassword)
                && Objects.equals(
                        this.chapPasswordContains, storageAdapterWhereInput.chapPasswordContains)
                && Objects.equals(
                        this.chapPasswordEndsWith, storageAdapterWhereInput.chapPasswordEndsWith)
                && Objects.equals(this.chapPasswordGt, storageAdapterWhereInput.chapPasswordGt)
                && Objects.equals(this.chapPasswordGte, storageAdapterWhereInput.chapPasswordGte)
                && Objects.equals(this.chapPasswordIn, storageAdapterWhereInput.chapPasswordIn)
                && Objects.equals(
                        this.chapPasswordInput, storageAdapterWhereInput.chapPasswordInput)
                && Objects.equals(
                        this.chapPasswordInputContains,
                        storageAdapterWhereInput.chapPasswordInputContains)
                && Objects.equals(
                        this.chapPasswordInputEndsWith,
                        storageAdapterWhereInput.chapPasswordInputEndsWith)
                && Objects.equals(
                        this.chapPasswordInputGt, storageAdapterWhereInput.chapPasswordInputGt)
                && Objects.equals(
                        this.chapPasswordInputGte, storageAdapterWhereInput.chapPasswordInputGte)
                && Objects.equals(
                        this.chapPasswordInputIn, storageAdapterWhereInput.chapPasswordInputIn)
                && Objects.equals(
                        this.chapPasswordInputLt, storageAdapterWhereInput.chapPasswordInputLt)
                && Objects.equals(
                        this.chapPasswordInputLte, storageAdapterWhereInput.chapPasswordInputLte)
                && Objects.equals(
                        this.chapPasswordInputNot, storageAdapterWhereInput.chapPasswordInputNot)
                && Objects.equals(
                        this.chapPasswordInputNotContains,
                        storageAdapterWhereInput.chapPasswordInputNotContains)
                && Objects.equals(
                        this.chapPasswordInputNotEndsWith,
                        storageAdapterWhereInput.chapPasswordInputNotEndsWith)
                && Objects.equals(
                        this.chapPasswordInputNotIn,
                        storageAdapterWhereInput.chapPasswordInputNotIn)
                && Objects.equals(
                        this.chapPasswordInputNotStartsWith,
                        storageAdapterWhereInput.chapPasswordInputNotStartsWith)
                && Objects.equals(
                        this.chapPasswordInputStartsWith,
                        storageAdapterWhereInput.chapPasswordInputStartsWith)
                && Objects.equals(this.chapPasswordLt, storageAdapterWhereInput.chapPasswordLt)
                && Objects.equals(this.chapPasswordLte, storageAdapterWhereInput.chapPasswordLte)
                && Objects.equals(this.chapPasswordNot, storageAdapterWhereInput.chapPasswordNot)
                && Objects.equals(
                        this.chapPasswordNotContains,
                        storageAdapterWhereInput.chapPasswordNotContains)
                && Objects.equals(
                        this.chapPasswordNotEndsWith,
                        storageAdapterWhereInput.chapPasswordNotEndsWith)
                && Objects.equals(
                        this.chapPasswordNotIn, storageAdapterWhereInput.chapPasswordNotIn)
                && Objects.equals(
                        this.chapPasswordNotStartsWith,
                        storageAdapterWhereInput.chapPasswordNotStartsWith)
                && Objects.equals(
                        this.chapPasswordStartsWith,
                        storageAdapterWhereInput.chapPasswordStartsWith)
                && Objects.equals(this.chapUsername, storageAdapterWhereInput.chapUsername)
                && Objects.equals(
                        this.chapUsernameContains, storageAdapterWhereInput.chapUsernameContains)
                && Objects.equals(
                        this.chapUsernameEndsWith, storageAdapterWhereInput.chapUsernameEndsWith)
                && Objects.equals(this.chapUsernameGt, storageAdapterWhereInput.chapUsernameGt)
                && Objects.equals(this.chapUsernameGte, storageAdapterWhereInput.chapUsernameGte)
                && Objects.equals(this.chapUsernameIn, storageAdapterWhereInput.chapUsernameIn)
                && Objects.equals(
                        this.chapUsernameInput, storageAdapterWhereInput.chapUsernameInput)
                && Objects.equals(
                        this.chapUsernameInputContains,
                        storageAdapterWhereInput.chapUsernameInputContains)
                && Objects.equals(
                        this.chapUsernameInputEndsWith,
                        storageAdapterWhereInput.chapUsernameInputEndsWith)
                && Objects.equals(
                        this.chapUsernameInputGt, storageAdapterWhereInput.chapUsernameInputGt)
                && Objects.equals(
                        this.chapUsernameInputGte, storageAdapterWhereInput.chapUsernameInputGte)
                && Objects.equals(
                        this.chapUsernameInputIn, storageAdapterWhereInput.chapUsernameInputIn)
                && Objects.equals(
                        this.chapUsernameInputLt, storageAdapterWhereInput.chapUsernameInputLt)
                && Objects.equals(
                        this.chapUsernameInputLte, storageAdapterWhereInput.chapUsernameInputLte)
                && Objects.equals(
                        this.chapUsernameInputNot, storageAdapterWhereInput.chapUsernameInputNot)
                && Objects.equals(
                        this.chapUsernameInputNotContains,
                        storageAdapterWhereInput.chapUsernameInputNotContains)
                && Objects.equals(
                        this.chapUsernameInputNotEndsWith,
                        storageAdapterWhereInput.chapUsernameInputNotEndsWith)
                && Objects.equals(
                        this.chapUsernameInputNotIn,
                        storageAdapterWhereInput.chapUsernameInputNotIn)
                && Objects.equals(
                        this.chapUsernameInputNotStartsWith,
                        storageAdapterWhereInput.chapUsernameInputNotStartsWith)
                && Objects.equals(
                        this.chapUsernameInputStartsWith,
                        storageAdapterWhereInput.chapUsernameInputStartsWith)
                && Objects.equals(this.chapUsernameLt, storageAdapterWhereInput.chapUsernameLt)
                && Objects.equals(this.chapUsernameLte, storageAdapterWhereInput.chapUsernameLte)
                && Objects.equals(this.chapUsernameNot, storageAdapterWhereInput.chapUsernameNot)
                && Objects.equals(
                        this.chapUsernameNotContains,
                        storageAdapterWhereInput.chapUsernameNotContains)
                && Objects.equals(
                        this.chapUsernameNotEndsWith,
                        storageAdapterWhereInput.chapUsernameNotEndsWith)
                && Objects.equals(
                        this.chapUsernameNotIn, storageAdapterWhereInput.chapUsernameNotIn)
                && Objects.equals(
                        this.chapUsernameNotStartsWith,
                        storageAdapterWhereInput.chapUsernameNotStartsWith)
                && Objects.equals(
                        this.chapUsernameStartsWith,
                        storageAdapterWhereInput.chapUsernameStartsWith)
                && Objects.equals(this.dataVersion, storageAdapterWhereInput.dataVersion)
                && Objects.equals(this.dataVersionGt, storageAdapterWhereInput.dataVersionGt)
                && Objects.equals(this.dataVersionGte, storageAdapterWhereInput.dataVersionGte)
                && Objects.equals(this.dataVersionIn, storageAdapterWhereInput.dataVersionIn)
                && Objects.equals(this.dataVersionLt, storageAdapterWhereInput.dataVersionLt)
                && Objects.equals(this.dataVersionLte, storageAdapterWhereInput.dataVersionLte)
                && Objects.equals(this.dataVersionNot, storageAdapterWhereInput.dataVersionNot)
                && Objects.equals(this.dataVersionNotIn, storageAdapterWhereInput.dataVersionNotIn)
                && Objects.equals(this.deviceNum, storageAdapterWhereInput.deviceNum)
                && Objects.equals(this.deviceNumGt, storageAdapterWhereInput.deviceNumGt)
                && Objects.equals(this.deviceNumGte, storageAdapterWhereInput.deviceNumGte)
                && Objects.equals(this.deviceNumIn, storageAdapterWhereInput.deviceNumIn)
                && Objects.equals(this.deviceNumLt, storageAdapterWhereInput.deviceNumLt)
                && Objects.equals(this.deviceNumLte, storageAdapterWhereInput.deviceNumLte)
                && Objects.equals(this.deviceNumNot, storageAdapterWhereInput.deviceNumNot)
                && Objects.equals(this.deviceNumNotIn, storageAdapterWhereInput.deviceNumNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, storageAdapterWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, storageAdapterWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, storageAdapterWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        storageAdapterWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.firmwareVersion, storageAdapterWhereInput.firmwareVersion)
                && Objects.equals(
                        this.firmwareVersionContains,
                        storageAdapterWhereInput.firmwareVersionContains)
                && Objects.equals(
                        this.firmwareVersionEndsWith,
                        storageAdapterWhereInput.firmwareVersionEndsWith)
                && Objects.equals(
                        this.firmwareVersionGt, storageAdapterWhereInput.firmwareVersionGt)
                && Objects.equals(
                        this.firmwareVersionGte, storageAdapterWhereInput.firmwareVersionGte)
                && Objects.equals(
                        this.firmwareVersionIn, storageAdapterWhereInput.firmwareVersionIn)
                && Objects.equals(
                        this.firmwareVersionLt, storageAdapterWhereInput.firmwareVersionLt)
                && Objects.equals(
                        this.firmwareVersionLte, storageAdapterWhereInput.firmwareVersionLte)
                && Objects.equals(
                        this.firmwareVersionNot, storageAdapterWhereInput.firmwareVersionNot)
                && Objects.equals(
                        this.firmwareVersionNotContains,
                        storageAdapterWhereInput.firmwareVersionNotContains)
                && Objects.equals(
                        this.firmwareVersionNotEndsWith,
                        storageAdapterWhereInput.firmwareVersionNotEndsWith)
                && Objects.equals(
                        this.firmwareVersionNotIn, storageAdapterWhereInput.firmwareVersionNotIn)
                && Objects.equals(
                        this.firmwareVersionNotStartsWith,
                        storageAdapterWhereInput.firmwareVersionNotStartsWith)
                && Objects.equals(
                        this.firmwareVersionStartsWith,
                        storageAdapterWhereInput.firmwareVersionStartsWith)
                && Objects.equals(this.host, storageAdapterWhereInput.host)
                && Objects.equals(this.id, storageAdapterWhereInput.id)
                && Objects.equals(this.idContains, storageAdapterWhereInput.idContains)
                && Objects.equals(this.idEndsWith, storageAdapterWhereInput.idEndsWith)
                && Objects.equals(this.idGt, storageAdapterWhereInput.idGt)
                && Objects.equals(this.idGte, storageAdapterWhereInput.idGte)
                && Objects.equals(this.idIn, storageAdapterWhereInput.idIn)
                && Objects.equals(this.idLt, storageAdapterWhereInput.idLt)
                && Objects.equals(this.idLte, storageAdapterWhereInput.idLte)
                && Objects.equals(this.idNot, storageAdapterWhereInput.idNot)
                && Objects.equals(this.idNotContains, storageAdapterWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, storageAdapterWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, storageAdapterWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, storageAdapterWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, storageAdapterWhereInput.idStartsWith)
                && Objects.equals(this.identifier, storageAdapterWhereInput.identifier)
                && Objects.equals(
                        this.identifierContains, storageAdapterWhereInput.identifierContains)
                && Objects.equals(
                        this.identifierEndsWith, storageAdapterWhereInput.identifierEndsWith)
                && Objects.equals(this.identifierGt, storageAdapterWhereInput.identifierGt)
                && Objects.equals(this.identifierGte, storageAdapterWhereInput.identifierGte)
                && Objects.equals(this.identifierIn, storageAdapterWhereInput.identifierIn)
                && Objects.equals(this.identifierLt, storageAdapterWhereInput.identifierLt)
                && Objects.equals(this.identifierLte, storageAdapterWhereInput.identifierLte)
                && Objects.equals(this.identifierNot, storageAdapterWhereInput.identifierNot)
                && Objects.equals(
                        this.identifierNotContains, storageAdapterWhereInput.identifierNotContains)
                && Objects.equals(
                        this.identifierNotEndsWith, storageAdapterWhereInput.identifierNotEndsWith)
                && Objects.equals(this.identifierNotIn, storageAdapterWhereInput.identifierNotIn)
                && Objects.equals(
                        this.identifierNotStartsWith,
                        storageAdapterWhereInput.identifierNotStartsWith)
                && Objects.equals(
                        this.identifierStartsWith, storageAdapterWhereInput.identifierStartsWith)
                && Objects.equals(
                        this.identityVerificationMethod,
                        storageAdapterWhereInput.identityVerificationMethod)
                && Objects.equals(
                        this.identityVerificationMethodIn,
                        storageAdapterWhereInput.identityVerificationMethodIn)
                && Objects.equals(
                        this.identityVerificationMethodNot,
                        storageAdapterWhereInput.identityVerificationMethodNot)
                && Objects.equals(
                        this.identityVerificationMethodNotIn,
                        storageAdapterWhereInput.identityVerificationMethodNotIn)
                && Objects.equals(this.initiatorName, storageAdapterWhereInput.initiatorName)
                && Objects.equals(
                        this.initiatorNameContains, storageAdapterWhereInput.initiatorNameContains)
                && Objects.equals(
                        this.initiatorNameEndsWith, storageAdapterWhereInput.initiatorNameEndsWith)
                && Objects.equals(this.initiatorNameGt, storageAdapterWhereInput.initiatorNameGt)
                && Objects.equals(this.initiatorNameGte, storageAdapterWhereInput.initiatorNameGte)
                && Objects.equals(this.initiatorNameIn, storageAdapterWhereInput.initiatorNameIn)
                && Objects.equals(this.initiatorNameLt, storageAdapterWhereInput.initiatorNameLt)
                && Objects.equals(this.initiatorNameLte, storageAdapterWhereInput.initiatorNameLte)
                && Objects.equals(this.initiatorNameNot, storageAdapterWhereInput.initiatorNameNot)
                && Objects.equals(
                        this.initiatorNameNotContains,
                        storageAdapterWhereInput.initiatorNameNotContains)
                && Objects.equals(
                        this.initiatorNameNotEndsWith,
                        storageAdapterWhereInput.initiatorNameNotEndsWith)
                && Objects.equals(
                        this.initiatorNameNotIn, storageAdapterWhereInput.initiatorNameNotIn)
                && Objects.equals(
                        this.initiatorNameNotStartsWith,
                        storageAdapterWhereInput.initiatorNameNotStartsWith)
                && Objects.equals(
                        this.initiatorNameStartsWith,
                        storageAdapterWhereInput.initiatorNameStartsWith)
                && Objects.equals(this.isSoftware, storageAdapterWhereInput.isSoftware)
                && Objects.equals(this.isSoftwareNot, storageAdapterWhereInput.isSoftwareNot)
                && Objects.equals(this.localCreatedAt, storageAdapterWhereInput.localCreatedAt)
                && Objects.equals(this.localCreatedAtGt, storageAdapterWhereInput.localCreatedAtGt)
                && Objects.equals(
                        this.localCreatedAtGte, storageAdapterWhereInput.localCreatedAtGte)
                && Objects.equals(this.localCreatedAtIn, storageAdapterWhereInput.localCreatedAtIn)
                && Objects.equals(this.localCreatedAtLt, storageAdapterWhereInput.localCreatedAtLt)
                && Objects.equals(
                        this.localCreatedAtLte, storageAdapterWhereInput.localCreatedAtLte)
                && Objects.equals(
                        this.localCreatedAtNot, storageAdapterWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn, storageAdapterWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localHash, storageAdapterWhereInput.localHash)
                && Objects.equals(
                        this.localHashContains, storageAdapterWhereInput.localHashContains)
                && Objects.equals(
                        this.localHashEndsWith, storageAdapterWhereInput.localHashEndsWith)
                && Objects.equals(this.localHashGt, storageAdapterWhereInput.localHashGt)
                && Objects.equals(this.localHashGte, storageAdapterWhereInput.localHashGte)
                && Objects.equals(this.localHashIn, storageAdapterWhereInput.localHashIn)
                && Objects.equals(this.localHashLt, storageAdapterWhereInput.localHashLt)
                && Objects.equals(this.localHashLte, storageAdapterWhereInput.localHashLte)
                && Objects.equals(this.localHashNot, storageAdapterWhereInput.localHashNot)
                && Objects.equals(
                        this.localHashNotContains, storageAdapterWhereInput.localHashNotContains)
                && Objects.equals(
                        this.localHashNotEndsWith, storageAdapterWhereInput.localHashNotEndsWith)
                && Objects.equals(this.localHashNotIn, storageAdapterWhereInput.localHashNotIn)
                && Objects.equals(
                        this.localHashNotStartsWith,
                        storageAdapterWhereInput.localHashNotStartsWith)
                && Objects.equals(
                        this.localHashStartsWith, storageAdapterWhereInput.localHashStartsWith)
                && Objects.equals(this.localId, storageAdapterWhereInput.localId)
                && Objects.equals(this.localIdContains, storageAdapterWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, storageAdapterWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, storageAdapterWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, storageAdapterWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, storageAdapterWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, storageAdapterWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, storageAdapterWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, storageAdapterWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, storageAdapterWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, storageAdapterWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, storageAdapterWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, storageAdapterWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, storageAdapterWhereInput.localIdStartsWith)
                && Objects.equals(this.localUpdatedAt, storageAdapterWhereInput.localUpdatedAt)
                && Objects.equals(this.localUpdatedAtGt, storageAdapterWhereInput.localUpdatedAtGt)
                && Objects.equals(
                        this.localUpdatedAtGte, storageAdapterWhereInput.localUpdatedAtGte)
                && Objects.equals(this.localUpdatedAtIn, storageAdapterWhereInput.localUpdatedAtIn)
                && Objects.equals(this.localUpdatedAtLt, storageAdapterWhereInput.localUpdatedAtLt)
                && Objects.equals(
                        this.localUpdatedAtLte, storageAdapterWhereInput.localUpdatedAtLte)
                && Objects.equals(
                        this.localUpdatedAtNot, storageAdapterWhereInput.localUpdatedAtNot)
                && Objects.equals(
                        this.localUpdatedAtNotIn, storageAdapterWhereInput.localUpdatedAtNotIn)
                && Objects.equals(this.model, storageAdapterWhereInput.model)
                && Objects.equals(this.modelContains, storageAdapterWhereInput.modelContains)
                && Objects.equals(this.modelEndsWith, storageAdapterWhereInput.modelEndsWith)
                && Objects.equals(this.modelGt, storageAdapterWhereInput.modelGt)
                && Objects.equals(this.modelGte, storageAdapterWhereInput.modelGte)
                && Objects.equals(this.modelIn, storageAdapterWhereInput.modelIn)
                && Objects.equals(this.modelLt, storageAdapterWhereInput.modelLt)
                && Objects.equals(this.modelLte, storageAdapterWhereInput.modelLte)
                && Objects.equals(this.modelNot, storageAdapterWhereInput.modelNot)
                && Objects.equals(this.modelNotContains, storageAdapterWhereInput.modelNotContains)
                && Objects.equals(this.modelNotEndsWith, storageAdapterWhereInput.modelNotEndsWith)
                && Objects.equals(this.modelNotIn, storageAdapterWhereInput.modelNotIn)
                && Objects.equals(
                        this.modelNotStartsWith, storageAdapterWhereInput.modelNotStartsWith)
                && Objects.equals(this.modelStartsWith, storageAdapterWhereInput.modelStartsWith)
                && Objects.equals(this.name, storageAdapterWhereInput.name)
                && Objects.equals(this.nameContains, storageAdapterWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, storageAdapterWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, storageAdapterWhereInput.nameGt)
                && Objects.equals(this.nameGte, storageAdapterWhereInput.nameGte)
                && Objects.equals(this.nameIn, storageAdapterWhereInput.nameIn)
                && Objects.equals(this.nameLt, storageAdapterWhereInput.nameLt)
                && Objects.equals(this.nameLte, storageAdapterWhereInput.nameLte)
                && Objects.equals(this.nameNot, storageAdapterWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, storageAdapterWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, storageAdapterWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, storageAdapterWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, storageAdapterWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, storageAdapterWhereInput.nameStartsWith)
                && Objects.equals(this.pathNum, storageAdapterWhereInput.pathNum)
                && Objects.equals(this.pathNumGt, storageAdapterWhereInput.pathNumGt)
                && Objects.equals(this.pathNumGte, storageAdapterWhereInput.pathNumGte)
                && Objects.equals(this.pathNumIn, storageAdapterWhereInput.pathNumIn)
                && Objects.equals(this.pathNumLt, storageAdapterWhereInput.pathNumLt)
                && Objects.equals(this.pathNumLte, storageAdapterWhereInput.pathNumLte)
                && Objects.equals(this.pathNumNot, storageAdapterWhereInput.pathNumNot)
                && Objects.equals(this.pathNumNotIn, storageAdapterWhereInput.pathNumNotIn)
                && Objects.equals(this.speed, storageAdapterWhereInput.speed)
                && Objects.equals(this.speedContains, storageAdapterWhereInput.speedContains)
                && Objects.equals(this.speedEndsWith, storageAdapterWhereInput.speedEndsWith)
                && Objects.equals(this.speedGt, storageAdapterWhereInput.speedGt)
                && Objects.equals(this.speedGte, storageAdapterWhereInput.speedGte)
                && Objects.equals(this.speedIn, storageAdapterWhereInput.speedIn)
                && Objects.equals(this.speedLt, storageAdapterWhereInput.speedLt)
                && Objects.equals(this.speedLte, storageAdapterWhereInput.speedLte)
                && Objects.equals(this.speedNot, storageAdapterWhereInput.speedNot)
                && Objects.equals(this.speedNotContains, storageAdapterWhereInput.speedNotContains)
                && Objects.equals(this.speedNotEndsWith, storageAdapterWhereInput.speedNotEndsWith)
                && Objects.equals(this.speedNotIn, storageAdapterWhereInput.speedNotIn)
                && Objects.equals(
                        this.speedNotStartsWith, storageAdapterWhereInput.speedNotStartsWith)
                && Objects.equals(this.speedStartsWith, storageAdapterWhereInput.speedStartsWith)
                && Objects.equals(this.status, storageAdapterWhereInput.status)
                && Objects.equals(this.statusIn, storageAdapterWhereInput.statusIn)
                && Objects.equals(this.statusNot, storageAdapterWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, storageAdapterWhereInput.statusNotIn)
                && Objects.equals(
                        this.storageDevicePathsEvery,
                        storageAdapterWhereInput.storageDevicePathsEvery)
                && Objects.equals(
                        this.storageDevicePathsNone,
                        storageAdapterWhereInput.storageDevicePathsNone)
                && Objects.equals(
                        this.storageDevicePathsSome,
                        storageAdapterWhereInput.storageDevicePathsSome)
                && Objects.equals(
                        this.storageDevicesEvery, storageAdapterWhereInput.storageDevicesEvery)
                && Objects.equals(
                        this.storageDevicesNone, storageAdapterWhereInput.storageDevicesNone)
                && Objects.equals(
                        this.storageDevicesSome, storageAdapterWhereInput.storageDevicesSome)
                && Objects.equals(
                        this.storageTargetsEvery, storageAdapterWhereInput.storageTargetsEvery)
                && Objects.equals(
                        this.storageTargetsNone, storageAdapterWhereInput.storageTargetsNone)
                && Objects.equals(
                        this.storageTargetsSome, storageAdapterWhereInput.storageTargetsSome)
                && Objects.equals(this.targetNum, storageAdapterWhereInput.targetNum)
                && Objects.equals(this.targetNumGt, storageAdapterWhereInput.targetNumGt)
                && Objects.equals(this.targetNumGte, storageAdapterWhereInput.targetNumGte)
                && Objects.equals(this.targetNumIn, storageAdapterWhereInput.targetNumIn)
                && Objects.equals(this.targetNumLt, storageAdapterWhereInput.targetNumLt)
                && Objects.equals(this.targetNumLte, storageAdapterWhereInput.targetNumLte)
                && Objects.equals(this.targetNumNot, storageAdapterWhereInput.targetNumNot)
                && Objects.equals(this.targetNumNotIn, storageAdapterWhereInput.targetNumNotIn)
                && Objects.equals(this.type, storageAdapterWhereInput.type)
                && Objects.equals(this.typeIn, storageAdapterWhereInput.typeIn)
                && Objects.equals(this.typeNot, storageAdapterWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, storageAdapterWhereInput.typeNotIn)
                && Objects.equals(this.vlansEvery, storageAdapterWhereInput.vlansEvery)
                && Objects.equals(this.vlansNone, storageAdapterWhereInput.vlansNone)
                && Objects.equals(this.vlansSome, storageAdapterWhereInput.vlansSome)
                && Objects.equals(this.wwnn, storageAdapterWhereInput.wwnn)
                && Objects.equals(this.wwnnContains, storageAdapterWhereInput.wwnnContains)
                && Objects.equals(this.wwnnEndsWith, storageAdapterWhereInput.wwnnEndsWith)
                && Objects.equals(this.wwnnGt, storageAdapterWhereInput.wwnnGt)
                && Objects.equals(this.wwnnGte, storageAdapterWhereInput.wwnnGte)
                && Objects.equals(this.wwnnIn, storageAdapterWhereInput.wwnnIn)
                && Objects.equals(this.wwnnLt, storageAdapterWhereInput.wwnnLt)
                && Objects.equals(this.wwnnLte, storageAdapterWhereInput.wwnnLte)
                && Objects.equals(this.wwnnNot, storageAdapterWhereInput.wwnnNot)
                && Objects.equals(this.wwnnNotContains, storageAdapterWhereInput.wwnnNotContains)
                && Objects.equals(this.wwnnNotEndsWith, storageAdapterWhereInput.wwnnNotEndsWith)
                && Objects.equals(this.wwnnNotIn, storageAdapterWhereInput.wwnnNotIn)
                && Objects.equals(
                        this.wwnnNotStartsWith, storageAdapterWhereInput.wwnnNotStartsWith)
                && Objects.equals(this.wwnnStartsWith, storageAdapterWhereInput.wwnnStartsWith)
                && Objects.equals(this.wwpn, storageAdapterWhereInput.wwpn)
                && Objects.equals(this.wwpnContains, storageAdapterWhereInput.wwpnContains)
                && Objects.equals(this.wwpnEndsWith, storageAdapterWhereInput.wwpnEndsWith)
                && Objects.equals(this.wwpnGt, storageAdapterWhereInput.wwpnGt)
                && Objects.equals(this.wwpnGte, storageAdapterWhereInput.wwpnGte)
                && Objects.equals(this.wwpnIn, storageAdapterWhereInput.wwpnIn)
                && Objects.equals(this.wwpnLt, storageAdapterWhereInput.wwpnLt)
                && Objects.equals(this.wwpnLte, storageAdapterWhereInput.wwpnLte)
                && Objects.equals(this.wwpnNot, storageAdapterWhereInput.wwpnNot)
                && Objects.equals(this.wwpnNotContains, storageAdapterWhereInput.wwpnNotContains)
                && Objects.equals(this.wwpnNotEndsWith, storageAdapterWhereInput.wwpnNotEndsWith)
                && Objects.equals(this.wwpnNotIn, storageAdapterWhereInput.wwpnNotIn)
                && Objects.equals(
                        this.wwpnNotStartsWith, storageAdapterWhereInput.wwpnNotStartsWith)
                && Objects.equals(this.wwpnStartsWith, storageAdapterWhereInput.wwpnStartsWith);
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
                aliasName,
                aliasNameContains,
                aliasNameEndsWith,
                aliasNameGt,
                aliasNameGte,
                aliasNameIn,
                aliasNameLt,
                aliasNameLte,
                aliasNameNot,
                aliasNameNotContains,
                aliasNameNotEndsWith,
                aliasNameNotIn,
                aliasNameNotStartsWith,
                aliasNameStartsWith,
                chapPassword,
                chapPasswordContains,
                chapPasswordEndsWith,
                chapPasswordGt,
                chapPasswordGte,
                chapPasswordIn,
                chapPasswordInput,
                chapPasswordInputContains,
                chapPasswordInputEndsWith,
                chapPasswordInputGt,
                chapPasswordInputGte,
                chapPasswordInputIn,
                chapPasswordInputLt,
                chapPasswordInputLte,
                chapPasswordInputNot,
                chapPasswordInputNotContains,
                chapPasswordInputNotEndsWith,
                chapPasswordInputNotIn,
                chapPasswordInputNotStartsWith,
                chapPasswordInputStartsWith,
                chapPasswordLt,
                chapPasswordLte,
                chapPasswordNot,
                chapPasswordNotContains,
                chapPasswordNotEndsWith,
                chapPasswordNotIn,
                chapPasswordNotStartsWith,
                chapPasswordStartsWith,
                chapUsername,
                chapUsernameContains,
                chapUsernameEndsWith,
                chapUsernameGt,
                chapUsernameGte,
                chapUsernameIn,
                chapUsernameInput,
                chapUsernameInputContains,
                chapUsernameInputEndsWith,
                chapUsernameInputGt,
                chapUsernameInputGte,
                chapUsernameInputIn,
                chapUsernameInputLt,
                chapUsernameInputLte,
                chapUsernameInputNot,
                chapUsernameInputNotContains,
                chapUsernameInputNotEndsWith,
                chapUsernameInputNotIn,
                chapUsernameInputNotStartsWith,
                chapUsernameInputStartsWith,
                chapUsernameLt,
                chapUsernameLte,
                chapUsernameNot,
                chapUsernameNotContains,
                chapUsernameNotEndsWith,
                chapUsernameNotIn,
                chapUsernameNotStartsWith,
                chapUsernameStartsWith,
                dataVersion,
                dataVersionGt,
                dataVersionGte,
                dataVersionIn,
                dataVersionLt,
                dataVersionLte,
                dataVersionNot,
                dataVersionNotIn,
                deviceNum,
                deviceNumGt,
                deviceNumGte,
                deviceNumIn,
                deviceNumLt,
                deviceNumLte,
                deviceNumNot,
                deviceNumNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                firmwareVersion,
                firmwareVersionContains,
                firmwareVersionEndsWith,
                firmwareVersionGt,
                firmwareVersionGte,
                firmwareVersionIn,
                firmwareVersionLt,
                firmwareVersionLte,
                firmwareVersionNot,
                firmwareVersionNotContains,
                firmwareVersionNotEndsWith,
                firmwareVersionNotIn,
                firmwareVersionNotStartsWith,
                firmwareVersionStartsWith,
                host,
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
                identifier,
                identifierContains,
                identifierEndsWith,
                identifierGt,
                identifierGte,
                identifierIn,
                identifierLt,
                identifierLte,
                identifierNot,
                identifierNotContains,
                identifierNotEndsWith,
                identifierNotIn,
                identifierNotStartsWith,
                identifierStartsWith,
                identityVerificationMethod,
                identityVerificationMethodIn,
                identityVerificationMethodNot,
                identityVerificationMethodNotIn,
                initiatorName,
                initiatorNameContains,
                initiatorNameEndsWith,
                initiatorNameGt,
                initiatorNameGte,
                initiatorNameIn,
                initiatorNameLt,
                initiatorNameLte,
                initiatorNameNot,
                initiatorNameNotContains,
                initiatorNameNotEndsWith,
                initiatorNameNotIn,
                initiatorNameNotStartsWith,
                initiatorNameStartsWith,
                isSoftware,
                isSoftwareNot,
                localCreatedAt,
                localCreatedAtGt,
                localCreatedAtGte,
                localCreatedAtIn,
                localCreatedAtLt,
                localCreatedAtLte,
                localCreatedAtNot,
                localCreatedAtNotIn,
                localHash,
                localHashContains,
                localHashEndsWith,
                localHashGt,
                localHashGte,
                localHashIn,
                localHashLt,
                localHashLte,
                localHashNot,
                localHashNotContains,
                localHashNotEndsWith,
                localHashNotIn,
                localHashNotStartsWith,
                localHashStartsWith,
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                localUpdatedAt,
                localUpdatedAtGt,
                localUpdatedAtGte,
                localUpdatedAtIn,
                localUpdatedAtLt,
                localUpdatedAtLte,
                localUpdatedAtNot,
                localUpdatedAtNotIn,
                model,
                modelContains,
                modelEndsWith,
                modelGt,
                modelGte,
                modelIn,
                modelLt,
                modelLte,
                modelNot,
                modelNotContains,
                modelNotEndsWith,
                modelNotIn,
                modelNotStartsWith,
                modelStartsWith,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                pathNum,
                pathNumGt,
                pathNumGte,
                pathNumIn,
                pathNumLt,
                pathNumLte,
                pathNumNot,
                pathNumNotIn,
                speed,
                speedContains,
                speedEndsWith,
                speedGt,
                speedGte,
                speedIn,
                speedLt,
                speedLte,
                speedNot,
                speedNotContains,
                speedNotEndsWith,
                speedNotIn,
                speedNotStartsWith,
                speedStartsWith,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                storageDevicePathsEvery,
                storageDevicePathsNone,
                storageDevicePathsSome,
                storageDevicesEvery,
                storageDevicesNone,
                storageDevicesSome,
                storageTargetsEvery,
                storageTargetsNone,
                storageTargetsSome,
                targetNum,
                targetNumGt,
                targetNumGte,
                targetNumIn,
                targetNumLt,
                targetNumLte,
                targetNumNot,
                targetNumNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vlansEvery,
                vlansNone,
                vlansSome,
                wwnn,
                wwnnContains,
                wwnnEndsWith,
                wwnnGt,
                wwnnGte,
                wwnnIn,
                wwnnLt,
                wwnnLte,
                wwnnNot,
                wwnnNotContains,
                wwnnNotEndsWith,
                wwnnNotIn,
                wwnnNotStartsWith,
                wwnnStartsWith,
                wwpn,
                wwpnContains,
                wwpnEndsWith,
                wwpnGt,
                wwpnGte,
                wwpnIn,
                wwpnLt,
                wwpnLte,
                wwpnNot,
                wwpnNotContains,
                wwpnNotEndsWith,
                wwpnNotIn,
                wwpnNotStartsWith,
                wwpnStartsWith);
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
        sb.append("class StorageAdapterWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    aliasNameContains: ")
                .append(toIndentedString(aliasNameContains))
                .append("\n");
        sb.append("    aliasNameEndsWith: ")
                .append(toIndentedString(aliasNameEndsWith))
                .append("\n");
        sb.append("    aliasNameGt: ").append(toIndentedString(aliasNameGt)).append("\n");
        sb.append("    aliasNameGte: ").append(toIndentedString(aliasNameGte)).append("\n");
        sb.append("    aliasNameIn: ").append(toIndentedString(aliasNameIn)).append("\n");
        sb.append("    aliasNameLt: ").append(toIndentedString(aliasNameLt)).append("\n");
        sb.append("    aliasNameLte: ").append(toIndentedString(aliasNameLte)).append("\n");
        sb.append("    aliasNameNot: ").append(toIndentedString(aliasNameNot)).append("\n");
        sb.append("    aliasNameNotContains: ")
                .append(toIndentedString(aliasNameNotContains))
                .append("\n");
        sb.append("    aliasNameNotEndsWith: ")
                .append(toIndentedString(aliasNameNotEndsWith))
                .append("\n");
        sb.append("    aliasNameNotIn: ").append(toIndentedString(aliasNameNotIn)).append("\n");
        sb.append("    aliasNameNotStartsWith: ")
                .append(toIndentedString(aliasNameNotStartsWith))
                .append("\n");
        sb.append("    aliasNameStartsWith: ")
                .append(toIndentedString(aliasNameStartsWith))
                .append("\n");
        sb.append("    chapPassword: ").append(toIndentedString(chapPassword)).append("\n");
        sb.append("    chapPasswordContains: ")
                .append(toIndentedString(chapPasswordContains))
                .append("\n");
        sb.append("    chapPasswordEndsWith: ")
                .append(toIndentedString(chapPasswordEndsWith))
                .append("\n");
        sb.append("    chapPasswordGt: ").append(toIndentedString(chapPasswordGt)).append("\n");
        sb.append("    chapPasswordGte: ").append(toIndentedString(chapPasswordGte)).append("\n");
        sb.append("    chapPasswordIn: ").append(toIndentedString(chapPasswordIn)).append("\n");
        sb.append("    chapPasswordInput: ")
                .append(toIndentedString(chapPasswordInput))
                .append("\n");
        sb.append("    chapPasswordInputContains: ")
                .append(toIndentedString(chapPasswordInputContains))
                .append("\n");
        sb.append("    chapPasswordInputEndsWith: ")
                .append(toIndentedString(chapPasswordInputEndsWith))
                .append("\n");
        sb.append("    chapPasswordInputGt: ")
                .append(toIndentedString(chapPasswordInputGt))
                .append("\n");
        sb.append("    chapPasswordInputGte: ")
                .append(toIndentedString(chapPasswordInputGte))
                .append("\n");
        sb.append("    chapPasswordInputIn: ")
                .append(toIndentedString(chapPasswordInputIn))
                .append("\n");
        sb.append("    chapPasswordInputLt: ")
                .append(toIndentedString(chapPasswordInputLt))
                .append("\n");
        sb.append("    chapPasswordInputLte: ")
                .append(toIndentedString(chapPasswordInputLte))
                .append("\n");
        sb.append("    chapPasswordInputNot: ")
                .append(toIndentedString(chapPasswordInputNot))
                .append("\n");
        sb.append("    chapPasswordInputNotContains: ")
                .append(toIndentedString(chapPasswordInputNotContains))
                .append("\n");
        sb.append("    chapPasswordInputNotEndsWith: ")
                .append(toIndentedString(chapPasswordInputNotEndsWith))
                .append("\n");
        sb.append("    chapPasswordInputNotIn: ")
                .append(toIndentedString(chapPasswordInputNotIn))
                .append("\n");
        sb.append("    chapPasswordInputNotStartsWith: ")
                .append(toIndentedString(chapPasswordInputNotStartsWith))
                .append("\n");
        sb.append("    chapPasswordInputStartsWith: ")
                .append(toIndentedString(chapPasswordInputStartsWith))
                .append("\n");
        sb.append("    chapPasswordLt: ").append(toIndentedString(chapPasswordLt)).append("\n");
        sb.append("    chapPasswordLte: ").append(toIndentedString(chapPasswordLte)).append("\n");
        sb.append("    chapPasswordNot: ").append(toIndentedString(chapPasswordNot)).append("\n");
        sb.append("    chapPasswordNotContains: ")
                .append(toIndentedString(chapPasswordNotContains))
                .append("\n");
        sb.append("    chapPasswordNotEndsWith: ")
                .append(toIndentedString(chapPasswordNotEndsWith))
                .append("\n");
        sb.append("    chapPasswordNotIn: ")
                .append(toIndentedString(chapPasswordNotIn))
                .append("\n");
        sb.append("    chapPasswordNotStartsWith: ")
                .append(toIndentedString(chapPasswordNotStartsWith))
                .append("\n");
        sb.append("    chapPasswordStartsWith: ")
                .append(toIndentedString(chapPasswordStartsWith))
                .append("\n");
        sb.append("    chapUsername: ").append(toIndentedString(chapUsername)).append("\n");
        sb.append("    chapUsernameContains: ")
                .append(toIndentedString(chapUsernameContains))
                .append("\n");
        sb.append("    chapUsernameEndsWith: ")
                .append(toIndentedString(chapUsernameEndsWith))
                .append("\n");
        sb.append("    chapUsernameGt: ").append(toIndentedString(chapUsernameGt)).append("\n");
        sb.append("    chapUsernameGte: ").append(toIndentedString(chapUsernameGte)).append("\n");
        sb.append("    chapUsernameIn: ").append(toIndentedString(chapUsernameIn)).append("\n");
        sb.append("    chapUsernameInput: ")
                .append(toIndentedString(chapUsernameInput))
                .append("\n");
        sb.append("    chapUsernameInputContains: ")
                .append(toIndentedString(chapUsernameInputContains))
                .append("\n");
        sb.append("    chapUsernameInputEndsWith: ")
                .append(toIndentedString(chapUsernameInputEndsWith))
                .append("\n");
        sb.append("    chapUsernameInputGt: ")
                .append(toIndentedString(chapUsernameInputGt))
                .append("\n");
        sb.append("    chapUsernameInputGte: ")
                .append(toIndentedString(chapUsernameInputGte))
                .append("\n");
        sb.append("    chapUsernameInputIn: ")
                .append(toIndentedString(chapUsernameInputIn))
                .append("\n");
        sb.append("    chapUsernameInputLt: ")
                .append(toIndentedString(chapUsernameInputLt))
                .append("\n");
        sb.append("    chapUsernameInputLte: ")
                .append(toIndentedString(chapUsernameInputLte))
                .append("\n");
        sb.append("    chapUsernameInputNot: ")
                .append(toIndentedString(chapUsernameInputNot))
                .append("\n");
        sb.append("    chapUsernameInputNotContains: ")
                .append(toIndentedString(chapUsernameInputNotContains))
                .append("\n");
        sb.append("    chapUsernameInputNotEndsWith: ")
                .append(toIndentedString(chapUsernameInputNotEndsWith))
                .append("\n");
        sb.append("    chapUsernameInputNotIn: ")
                .append(toIndentedString(chapUsernameInputNotIn))
                .append("\n");
        sb.append("    chapUsernameInputNotStartsWith: ")
                .append(toIndentedString(chapUsernameInputNotStartsWith))
                .append("\n");
        sb.append("    chapUsernameInputStartsWith: ")
                .append(toIndentedString(chapUsernameInputStartsWith))
                .append("\n");
        sb.append("    chapUsernameLt: ").append(toIndentedString(chapUsernameLt)).append("\n");
        sb.append("    chapUsernameLte: ").append(toIndentedString(chapUsernameLte)).append("\n");
        sb.append("    chapUsernameNot: ").append(toIndentedString(chapUsernameNot)).append("\n");
        sb.append("    chapUsernameNotContains: ")
                .append(toIndentedString(chapUsernameNotContains))
                .append("\n");
        sb.append("    chapUsernameNotEndsWith: ")
                .append(toIndentedString(chapUsernameNotEndsWith))
                .append("\n");
        sb.append("    chapUsernameNotIn: ")
                .append(toIndentedString(chapUsernameNotIn))
                .append("\n");
        sb.append("    chapUsernameNotStartsWith: ")
                .append(toIndentedString(chapUsernameNotStartsWith))
                .append("\n");
        sb.append("    chapUsernameStartsWith: ")
                .append(toIndentedString(chapUsernameStartsWith))
                .append("\n");
        sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
        sb.append("    dataVersionGt: ").append(toIndentedString(dataVersionGt)).append("\n");
        sb.append("    dataVersionGte: ").append(toIndentedString(dataVersionGte)).append("\n");
        sb.append("    dataVersionIn: ").append(toIndentedString(dataVersionIn)).append("\n");
        sb.append("    dataVersionLt: ").append(toIndentedString(dataVersionLt)).append("\n");
        sb.append("    dataVersionLte: ").append(toIndentedString(dataVersionLte)).append("\n");
        sb.append("    dataVersionNot: ").append(toIndentedString(dataVersionNot)).append("\n");
        sb.append("    dataVersionNotIn: ").append(toIndentedString(dataVersionNotIn)).append("\n");
        sb.append("    deviceNum: ").append(toIndentedString(deviceNum)).append("\n");
        sb.append("    deviceNumGt: ").append(toIndentedString(deviceNumGt)).append("\n");
        sb.append("    deviceNumGte: ").append(toIndentedString(deviceNumGte)).append("\n");
        sb.append("    deviceNumIn: ").append(toIndentedString(deviceNumIn)).append("\n");
        sb.append("    deviceNumLt: ").append(toIndentedString(deviceNumLt)).append("\n");
        sb.append("    deviceNumLte: ").append(toIndentedString(deviceNumLte)).append("\n");
        sb.append("    deviceNumNot: ").append(toIndentedString(deviceNumNot)).append("\n");
        sb.append("    deviceNumNotIn: ").append(toIndentedString(deviceNumNotIn)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
                .append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
        sb.append("    firmwareVersionContains: ")
                .append(toIndentedString(firmwareVersionContains))
                .append("\n");
        sb.append("    firmwareVersionEndsWith: ")
                .append(toIndentedString(firmwareVersionEndsWith))
                .append("\n");
        sb.append("    firmwareVersionGt: ")
                .append(toIndentedString(firmwareVersionGt))
                .append("\n");
        sb.append("    firmwareVersionGte: ")
                .append(toIndentedString(firmwareVersionGte))
                .append("\n");
        sb.append("    firmwareVersionIn: ")
                .append(toIndentedString(firmwareVersionIn))
                .append("\n");
        sb.append("    firmwareVersionLt: ")
                .append(toIndentedString(firmwareVersionLt))
                .append("\n");
        sb.append("    firmwareVersionLte: ")
                .append(toIndentedString(firmwareVersionLte))
                .append("\n");
        sb.append("    firmwareVersionNot: ")
                .append(toIndentedString(firmwareVersionNot))
                .append("\n");
        sb.append("    firmwareVersionNotContains: ")
                .append(toIndentedString(firmwareVersionNotContains))
                .append("\n");
        sb.append("    firmwareVersionNotEndsWith: ")
                .append(toIndentedString(firmwareVersionNotEndsWith))
                .append("\n");
        sb.append("    firmwareVersionNotIn: ")
                .append(toIndentedString(firmwareVersionNotIn))
                .append("\n");
        sb.append("    firmwareVersionNotStartsWith: ")
                .append(toIndentedString(firmwareVersionNotStartsWith))
                .append("\n");
        sb.append("    firmwareVersionStartsWith: ")
                .append(toIndentedString(firmwareVersionStartsWith))
                .append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    identifierContains: ")
                .append(toIndentedString(identifierContains))
                .append("\n");
        sb.append("    identifierEndsWith: ")
                .append(toIndentedString(identifierEndsWith))
                .append("\n");
        sb.append("    identifierGt: ").append(toIndentedString(identifierGt)).append("\n");
        sb.append("    identifierGte: ").append(toIndentedString(identifierGte)).append("\n");
        sb.append("    identifierIn: ").append(toIndentedString(identifierIn)).append("\n");
        sb.append("    identifierLt: ").append(toIndentedString(identifierLt)).append("\n");
        sb.append("    identifierLte: ").append(toIndentedString(identifierLte)).append("\n");
        sb.append("    identifierNot: ").append(toIndentedString(identifierNot)).append("\n");
        sb.append("    identifierNotContains: ")
                .append(toIndentedString(identifierNotContains))
                .append("\n");
        sb.append("    identifierNotEndsWith: ")
                .append(toIndentedString(identifierNotEndsWith))
                .append("\n");
        sb.append("    identifierNotIn: ").append(toIndentedString(identifierNotIn)).append("\n");
        sb.append("    identifierNotStartsWith: ")
                .append(toIndentedString(identifierNotStartsWith))
                .append("\n");
        sb.append("    identifierStartsWith: ")
                .append(toIndentedString(identifierStartsWith))
                .append("\n");
        sb.append("    identityVerificationMethod: ")
                .append(toIndentedString(identityVerificationMethod))
                .append("\n");
        sb.append("    identityVerificationMethodIn: ")
                .append(toIndentedString(identityVerificationMethodIn))
                .append("\n");
        sb.append("    identityVerificationMethodNot: ")
                .append(toIndentedString(identityVerificationMethodNot))
                .append("\n");
        sb.append("    identityVerificationMethodNotIn: ")
                .append(toIndentedString(identityVerificationMethodNotIn))
                .append("\n");
        sb.append("    initiatorName: ").append(toIndentedString(initiatorName)).append("\n");
        sb.append("    initiatorNameContains: ")
                .append(toIndentedString(initiatorNameContains))
                .append("\n");
        sb.append("    initiatorNameEndsWith: ")
                .append(toIndentedString(initiatorNameEndsWith))
                .append("\n");
        sb.append("    initiatorNameGt: ").append(toIndentedString(initiatorNameGt)).append("\n");
        sb.append("    initiatorNameGte: ").append(toIndentedString(initiatorNameGte)).append("\n");
        sb.append("    initiatorNameIn: ").append(toIndentedString(initiatorNameIn)).append("\n");
        sb.append("    initiatorNameLt: ").append(toIndentedString(initiatorNameLt)).append("\n");
        sb.append("    initiatorNameLte: ").append(toIndentedString(initiatorNameLte)).append("\n");
        sb.append("    initiatorNameNot: ").append(toIndentedString(initiatorNameNot)).append("\n");
        sb.append("    initiatorNameNotContains: ")
                .append(toIndentedString(initiatorNameNotContains))
                .append("\n");
        sb.append("    initiatorNameNotEndsWith: ")
                .append(toIndentedString(initiatorNameNotEndsWith))
                .append("\n");
        sb.append("    initiatorNameNotIn: ")
                .append(toIndentedString(initiatorNameNotIn))
                .append("\n");
        sb.append("    initiatorNameNotStartsWith: ")
                .append(toIndentedString(initiatorNameNotStartsWith))
                .append("\n");
        sb.append("    initiatorNameStartsWith: ")
                .append(toIndentedString(initiatorNameStartsWith))
                .append("\n");
        sb.append("    isSoftware: ").append(toIndentedString(isSoftware)).append("\n");
        sb.append("    isSoftwareNot: ").append(toIndentedString(isSoftwareNot)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
        sb.append("    localCreatedAtGte: ")
                .append(toIndentedString(localCreatedAtGte))
                .append("\n");
        sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
        sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
        sb.append("    localCreatedAtLte: ")
                .append(toIndentedString(localCreatedAtLte))
                .append("\n");
        sb.append("    localCreatedAtNot: ")
                .append(toIndentedString(localCreatedAtNot))
                .append("\n");
        sb.append("    localCreatedAtNotIn: ")
                .append(toIndentedString(localCreatedAtNotIn))
                .append("\n");
        sb.append("    localHash: ").append(toIndentedString(localHash)).append("\n");
        sb.append("    localHashContains: ")
                .append(toIndentedString(localHashContains))
                .append("\n");
        sb.append("    localHashEndsWith: ")
                .append(toIndentedString(localHashEndsWith))
                .append("\n");
        sb.append("    localHashGt: ").append(toIndentedString(localHashGt)).append("\n");
        sb.append("    localHashGte: ").append(toIndentedString(localHashGte)).append("\n");
        sb.append("    localHashIn: ").append(toIndentedString(localHashIn)).append("\n");
        sb.append("    localHashLt: ").append(toIndentedString(localHashLt)).append("\n");
        sb.append("    localHashLte: ").append(toIndentedString(localHashLte)).append("\n");
        sb.append("    localHashNot: ").append(toIndentedString(localHashNot)).append("\n");
        sb.append("    localHashNotContains: ")
                .append(toIndentedString(localHashNotContains))
                .append("\n");
        sb.append("    localHashNotEndsWith: ")
                .append(toIndentedString(localHashNotEndsWith))
                .append("\n");
        sb.append("    localHashNotIn: ").append(toIndentedString(localHashNotIn)).append("\n");
        sb.append("    localHashNotStartsWith: ")
                .append(toIndentedString(localHashNotStartsWith))
                .append("\n");
        sb.append("    localHashStartsWith: ")
                .append(toIndentedString(localHashStartsWith))
                .append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
        sb.append("    localUpdatedAtGt: ").append(toIndentedString(localUpdatedAtGt)).append("\n");
        sb.append("    localUpdatedAtGte: ")
                .append(toIndentedString(localUpdatedAtGte))
                .append("\n");
        sb.append("    localUpdatedAtIn: ").append(toIndentedString(localUpdatedAtIn)).append("\n");
        sb.append("    localUpdatedAtLt: ").append(toIndentedString(localUpdatedAtLt)).append("\n");
        sb.append("    localUpdatedAtLte: ")
                .append(toIndentedString(localUpdatedAtLte))
                .append("\n");
        sb.append("    localUpdatedAtNot: ")
                .append(toIndentedString(localUpdatedAtNot))
                .append("\n");
        sb.append("    localUpdatedAtNotIn: ")
                .append(toIndentedString(localUpdatedAtNotIn))
                .append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    modelContains: ").append(toIndentedString(modelContains)).append("\n");
        sb.append("    modelEndsWith: ").append(toIndentedString(modelEndsWith)).append("\n");
        sb.append("    modelGt: ").append(toIndentedString(modelGt)).append("\n");
        sb.append("    modelGte: ").append(toIndentedString(modelGte)).append("\n");
        sb.append("    modelIn: ").append(toIndentedString(modelIn)).append("\n");
        sb.append("    modelLt: ").append(toIndentedString(modelLt)).append("\n");
        sb.append("    modelLte: ").append(toIndentedString(modelLte)).append("\n");
        sb.append("    modelNot: ").append(toIndentedString(modelNot)).append("\n");
        sb.append("    modelNotContains: ").append(toIndentedString(modelNotContains)).append("\n");
        sb.append("    modelNotEndsWith: ").append(toIndentedString(modelNotEndsWith)).append("\n");
        sb.append("    modelNotIn: ").append(toIndentedString(modelNotIn)).append("\n");
        sb.append("    modelNotStartsWith: ")
                .append(toIndentedString(modelNotStartsWith))
                .append("\n");
        sb.append("    modelStartsWith: ").append(toIndentedString(modelStartsWith)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    pathNum: ").append(toIndentedString(pathNum)).append("\n");
        sb.append("    pathNumGt: ").append(toIndentedString(pathNumGt)).append("\n");
        sb.append("    pathNumGte: ").append(toIndentedString(pathNumGte)).append("\n");
        sb.append("    pathNumIn: ").append(toIndentedString(pathNumIn)).append("\n");
        sb.append("    pathNumLt: ").append(toIndentedString(pathNumLt)).append("\n");
        sb.append("    pathNumLte: ").append(toIndentedString(pathNumLte)).append("\n");
        sb.append("    pathNumNot: ").append(toIndentedString(pathNumNot)).append("\n");
        sb.append("    pathNumNotIn: ").append(toIndentedString(pathNumNotIn)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    speedContains: ").append(toIndentedString(speedContains)).append("\n");
        sb.append("    speedEndsWith: ").append(toIndentedString(speedEndsWith)).append("\n");
        sb.append("    speedGt: ").append(toIndentedString(speedGt)).append("\n");
        sb.append("    speedGte: ").append(toIndentedString(speedGte)).append("\n");
        sb.append("    speedIn: ").append(toIndentedString(speedIn)).append("\n");
        sb.append("    speedLt: ").append(toIndentedString(speedLt)).append("\n");
        sb.append("    speedLte: ").append(toIndentedString(speedLte)).append("\n");
        sb.append("    speedNot: ").append(toIndentedString(speedNot)).append("\n");
        sb.append("    speedNotContains: ").append(toIndentedString(speedNotContains)).append("\n");
        sb.append("    speedNotEndsWith: ").append(toIndentedString(speedNotEndsWith)).append("\n");
        sb.append("    speedNotIn: ").append(toIndentedString(speedNotIn)).append("\n");
        sb.append("    speedNotStartsWith: ")
                .append(toIndentedString(speedNotStartsWith))
                .append("\n");
        sb.append("    speedStartsWith: ").append(toIndentedString(speedStartsWith)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    storageDevicePathsEvery: ")
                .append(toIndentedString(storageDevicePathsEvery))
                .append("\n");
        sb.append("    storageDevicePathsNone: ")
                .append(toIndentedString(storageDevicePathsNone))
                .append("\n");
        sb.append("    storageDevicePathsSome: ")
                .append(toIndentedString(storageDevicePathsSome))
                .append("\n");
        sb.append("    storageDevicesEvery: ")
                .append(toIndentedString(storageDevicesEvery))
                .append("\n");
        sb.append("    storageDevicesNone: ")
                .append(toIndentedString(storageDevicesNone))
                .append("\n");
        sb.append("    storageDevicesSome: ")
                .append(toIndentedString(storageDevicesSome))
                .append("\n");
        sb.append("    storageTargetsEvery: ")
                .append(toIndentedString(storageTargetsEvery))
                .append("\n");
        sb.append("    storageTargetsNone: ")
                .append(toIndentedString(storageTargetsNone))
                .append("\n");
        sb.append("    storageTargetsSome: ")
                .append(toIndentedString(storageTargetsSome))
                .append("\n");
        sb.append("    targetNum: ").append(toIndentedString(targetNum)).append("\n");
        sb.append("    targetNumGt: ").append(toIndentedString(targetNumGt)).append("\n");
        sb.append("    targetNumGte: ").append(toIndentedString(targetNumGte)).append("\n");
        sb.append("    targetNumIn: ").append(toIndentedString(targetNumIn)).append("\n");
        sb.append("    targetNumLt: ").append(toIndentedString(targetNumLt)).append("\n");
        sb.append("    targetNumLte: ").append(toIndentedString(targetNumLte)).append("\n");
        sb.append("    targetNumNot: ").append(toIndentedString(targetNumNot)).append("\n");
        sb.append("    targetNumNotIn: ").append(toIndentedString(targetNumNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vlansEvery: ").append(toIndentedString(vlansEvery)).append("\n");
        sb.append("    vlansNone: ").append(toIndentedString(vlansNone)).append("\n");
        sb.append("    vlansSome: ").append(toIndentedString(vlansSome)).append("\n");
        sb.append("    wwnn: ").append(toIndentedString(wwnn)).append("\n");
        sb.append("    wwnnContains: ").append(toIndentedString(wwnnContains)).append("\n");
        sb.append("    wwnnEndsWith: ").append(toIndentedString(wwnnEndsWith)).append("\n");
        sb.append("    wwnnGt: ").append(toIndentedString(wwnnGt)).append("\n");
        sb.append("    wwnnGte: ").append(toIndentedString(wwnnGte)).append("\n");
        sb.append("    wwnnIn: ").append(toIndentedString(wwnnIn)).append("\n");
        sb.append("    wwnnLt: ").append(toIndentedString(wwnnLt)).append("\n");
        sb.append("    wwnnLte: ").append(toIndentedString(wwnnLte)).append("\n");
        sb.append("    wwnnNot: ").append(toIndentedString(wwnnNot)).append("\n");
        sb.append("    wwnnNotContains: ").append(toIndentedString(wwnnNotContains)).append("\n");
        sb.append("    wwnnNotEndsWith: ").append(toIndentedString(wwnnNotEndsWith)).append("\n");
        sb.append("    wwnnNotIn: ").append(toIndentedString(wwnnNotIn)).append("\n");
        sb.append("    wwnnNotStartsWith: ")
                .append(toIndentedString(wwnnNotStartsWith))
                .append("\n");
        sb.append("    wwnnStartsWith: ").append(toIndentedString(wwnnStartsWith)).append("\n");
        sb.append("    wwpn: ").append(toIndentedString(wwpn)).append("\n");
        sb.append("    wwpnContains: ").append(toIndentedString(wwpnContains)).append("\n");
        sb.append("    wwpnEndsWith: ").append(toIndentedString(wwpnEndsWith)).append("\n");
        sb.append("    wwpnGt: ").append(toIndentedString(wwpnGt)).append("\n");
        sb.append("    wwpnGte: ").append(toIndentedString(wwpnGte)).append("\n");
        sb.append("    wwpnIn: ").append(toIndentedString(wwpnIn)).append("\n");
        sb.append("    wwpnLt: ").append(toIndentedString(wwpnLt)).append("\n");
        sb.append("    wwpnLte: ").append(toIndentedString(wwpnLte)).append("\n");
        sb.append("    wwpnNot: ").append(toIndentedString(wwpnNot)).append("\n");
        sb.append("    wwpnNotContains: ").append(toIndentedString(wwpnNotContains)).append("\n");
        sb.append("    wwpnNotEndsWith: ").append(toIndentedString(wwpnNotEndsWith)).append("\n");
        sb.append("    wwpnNotIn: ").append(toIndentedString(wwpnNotIn)).append("\n");
        sb.append("    wwpnNotStartsWith: ")
                .append(toIndentedString(wwpnNotStartsWith))
                .append("\n");
        sb.append("    wwpnStartsWith: ").append(toIndentedString(wwpnStartsWith)).append("\n");
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
