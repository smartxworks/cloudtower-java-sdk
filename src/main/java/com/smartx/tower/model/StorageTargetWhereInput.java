package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** StorageTargetWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class StorageTargetWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<StorageTargetWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<StorageTargetWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<StorageTargetWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CHAP_IS_HERITED = "chap_is_herited";

    @SerializedName(SERIALIZED_NAME_CHAP_IS_HERITED)
    private Boolean chapIsHerited;

    public static final String SERIALIZED_NAME_CHAP_IS_HERITED_NOT = "chap_is_herited_not";

    @SerializedName(SERIALIZED_NAME_CHAP_IS_HERITED_NOT)
    private Boolean chapIsHeritedNot;

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

    public static final String SERIALIZED_NAME_DISCOVERED_BY = "discovered_by";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY)
    private String discoveredBy;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_CONTAINS = "discovered_by_contains";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_CONTAINS)
    private String discoveredByContains;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_ENDS_WITH = "discovered_by_ends_with";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_ENDS_WITH)
    private String discoveredByEndsWith;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_GT = "discovered_by_gt";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_GT)
    private String discoveredByGt;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_GTE = "discovered_by_gte";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_GTE)
    private String discoveredByGte;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_IN = "discovered_by_in";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_IN)
    private List<String> discoveredByIn = null;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_LT = "discovered_by_lt";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_LT)
    private String discoveredByLt;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_LTE = "discovered_by_lte";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_LTE)
    private String discoveredByLte;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_NOT = "discovered_by_not";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_NOT)
    private String discoveredByNot;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_NOT_CONTAINS =
            "discovered_by_not_contains";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_NOT_CONTAINS)
    private String discoveredByNotContains;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_NOT_ENDS_WITH =
            "discovered_by_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_NOT_ENDS_WITH)
    private String discoveredByNotEndsWith;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_NOT_IN = "discovered_by_not_in";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_NOT_IN)
    private List<String> discoveredByNotIn = null;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_NOT_STARTS_WITH =
            "discovered_by_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_NOT_STARTS_WITH)
    private String discoveredByNotStartsWith;

    public static final String SERIALIZED_NAME_DISCOVERED_BY_STARTS_WITH =
            "discovered_by_starts_with";

    @SerializedName(SERIALIZED_NAME_DISCOVERED_BY_STARTS_WITH)
    private String discoveredByStartsWith;

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

    public static final String SERIALIZED_NAME_STORAGE_ADAPTER = "storage_adapter";

    @SerializedName(SERIALIZED_NAME_STORAGE_ADAPTER)
    private StorageAdapterWhereInput storageAdapter;

    public static final String SERIALIZED_NAME_TARGET_IP = "target_ip";

    @SerializedName(SERIALIZED_NAME_TARGET_IP)
    private String targetIp;

    public static final String SERIALIZED_NAME_TARGET_IP_CONTAINS = "target_ip_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_CONTAINS)
    private String targetIpContains;

    public static final String SERIALIZED_NAME_TARGET_IP_ENDS_WITH = "target_ip_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_ENDS_WITH)
    private String targetIpEndsWith;

    public static final String SERIALIZED_NAME_TARGET_IP_GT = "target_ip_gt";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_GT)
    private String targetIpGt;

    public static final String SERIALIZED_NAME_TARGET_IP_GTE = "target_ip_gte";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_GTE)
    private String targetIpGte;

    public static final String SERIALIZED_NAME_TARGET_IP_IN = "target_ip_in";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_IN)
    private List<String> targetIpIn = null;

    public static final String SERIALIZED_NAME_TARGET_IP_LT = "target_ip_lt";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_LT)
    private String targetIpLt;

    public static final String SERIALIZED_NAME_TARGET_IP_LTE = "target_ip_lte";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_LTE)
    private String targetIpLte;

    public static final String SERIALIZED_NAME_TARGET_IP_NOT = "target_ip_not";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_NOT)
    private String targetIpNot;

    public static final String SERIALIZED_NAME_TARGET_IP_NOT_CONTAINS = "target_ip_not_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_NOT_CONTAINS)
    private String targetIpNotContains;

    public static final String SERIALIZED_NAME_TARGET_IP_NOT_ENDS_WITH = "target_ip_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_NOT_ENDS_WITH)
    private String targetIpNotEndsWith;

    public static final String SERIALIZED_NAME_TARGET_IP_NOT_IN = "target_ip_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_NOT_IN)
    private List<String> targetIpNotIn = null;

    public static final String SERIALIZED_NAME_TARGET_IP_NOT_STARTS_WITH =
            "target_ip_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_NOT_STARTS_WITH)
    private String targetIpNotStartsWith;

    public static final String SERIALIZED_NAME_TARGET_IP_STARTS_WITH = "target_ip_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IP_STARTS_WITH)
    private String targetIpStartsWith;

    public static final String SERIALIZED_NAME_TARGET_IQN = "target_iqn";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN)
    private String targetIqn;

    public static final String SERIALIZED_NAME_TARGET_IQN_CONTAINS = "target_iqn_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_CONTAINS)
    private String targetIqnContains;

    public static final String SERIALIZED_NAME_TARGET_IQN_ENDS_WITH = "target_iqn_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_ENDS_WITH)
    private String targetIqnEndsWith;

    public static final String SERIALIZED_NAME_TARGET_IQN_GT = "target_iqn_gt";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_GT)
    private String targetIqnGt;

    public static final String SERIALIZED_NAME_TARGET_IQN_GTE = "target_iqn_gte";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_GTE)
    private String targetIqnGte;

    public static final String SERIALIZED_NAME_TARGET_IQN_IN = "target_iqn_in";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_IN)
    private List<String> targetIqnIn = null;

    public static final String SERIALIZED_NAME_TARGET_IQN_LT = "target_iqn_lt";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_LT)
    private String targetIqnLt;

    public static final String SERIALIZED_NAME_TARGET_IQN_LTE = "target_iqn_lte";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_LTE)
    private String targetIqnLte;

    public static final String SERIALIZED_NAME_TARGET_IQN_NOT = "target_iqn_not";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_NOT)
    private String targetIqnNot;

    public static final String SERIALIZED_NAME_TARGET_IQN_NOT_CONTAINS = "target_iqn_not_contains";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_NOT_CONTAINS)
    private String targetIqnNotContains;

    public static final String SERIALIZED_NAME_TARGET_IQN_NOT_ENDS_WITH =
            "target_iqn_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_NOT_ENDS_WITH)
    private String targetIqnNotEndsWith;

    public static final String SERIALIZED_NAME_TARGET_IQN_NOT_IN = "target_iqn_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_NOT_IN)
    private List<String> targetIqnNotIn = null;

    public static final String SERIALIZED_NAME_TARGET_IQN_NOT_STARTS_WITH =
            "target_iqn_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_NOT_STARTS_WITH)
    private String targetIqnNotStartsWith;

    public static final String SERIALIZED_NAME_TARGET_IQN_STARTS_WITH = "target_iqn_starts_with";

    @SerializedName(SERIALIZED_NAME_TARGET_IQN_STARTS_WITH)
    private String targetIqnStartsWith;

    public static final String SERIALIZED_NAME_TARGET_PORT = "target_port";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT)
    private Integer targetPort;

    public static final String SERIALIZED_NAME_TARGET_PORT_GT = "target_port_gt";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT_GT)
    private Integer targetPortGt;

    public static final String SERIALIZED_NAME_TARGET_PORT_GTE = "target_port_gte";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT_GTE)
    private Integer targetPortGte;

    public static final String SERIALIZED_NAME_TARGET_PORT_IN = "target_port_in";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT_IN)
    private List<Integer> targetPortIn = null;

    public static final String SERIALIZED_NAME_TARGET_PORT_LT = "target_port_lt";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT_LT)
    private Integer targetPortLt;

    public static final String SERIALIZED_NAME_TARGET_PORT_LTE = "target_port_lte";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT_LTE)
    private Integer targetPortLte;

    public static final String SERIALIZED_NAME_TARGET_PORT_NOT = "target_port_not";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT_NOT)
    private Integer targetPortNot;

    public static final String SERIALIZED_NAME_TARGET_PORT_NOT_IN = "target_port_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT_NOT_IN)
    private List<Integer> targetPortNotIn = null;

    public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";

    @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
    private StorageTargetType targetType;

    public static final String SERIALIZED_NAME_TARGET_TYPE_IN = "target_type_in";

    @SerializedName(SERIALIZED_NAME_TARGET_TYPE_IN)
    private List<StorageTargetType> targetTypeIn = null;

    public static final String SERIALIZED_NAME_TARGET_TYPE_NOT = "target_type_not";

    @SerializedName(SERIALIZED_NAME_TARGET_TYPE_NOT)
    private StorageTargetType targetTypeNot;

    public static final String SERIALIZED_NAME_TARGET_TYPE_NOT_IN = "target_type_not_in";

    @SerializedName(SERIALIZED_NAME_TARGET_TYPE_NOT_IN)
    private List<StorageTargetType> targetTypeNotIn = null;

    public StorageTargetWhereInput() {}

    public StorageTargetWhereInput AND(List<StorageTargetWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public StorageTargetWhereInput addANDItem(StorageTargetWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<StorageTargetWhereInput>();
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
    public List<StorageTargetWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<StorageTargetWhereInput> AND) {
        this.AND = AND;
    }

    public StorageTargetWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public StorageTargetWhereInput AND_ExplictlyNonNull() {
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

    public StorageTargetWhereInput NOT(List<StorageTargetWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public StorageTargetWhereInput addNOTItem(StorageTargetWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<StorageTargetWhereInput>();
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
    public List<StorageTargetWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<StorageTargetWhereInput> NOT) {
        this.NOT = NOT;
    }

    public StorageTargetWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public StorageTargetWhereInput NOT_ExplictlyNonNull() {
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

    public StorageTargetWhereInput OR(List<StorageTargetWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public StorageTargetWhereInput addORItem(StorageTargetWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<StorageTargetWhereInput>();
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
    public List<StorageTargetWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<StorageTargetWhereInput> OR) {
        this.OR = OR;
    }

    public StorageTargetWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public StorageTargetWhereInput OR_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapIsHerited(Boolean chapIsHerited) {

        this.chapIsHerited = chapIsHerited;
        return this;
    }

    /**
     * Get chapIsHerited
     *
     * @return chapIsHerited
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChapIsHerited() {
        return chapIsHerited;
    }

    public void setChapIsHerited(Boolean chapIsHerited) {
        this.chapIsHerited = chapIsHerited;
    }

    public StorageTargetWhereInput chapIsHerited_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_IS_HERITED);
        return this;
    }

    public StorageTargetWhereInput chapIsHerited_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_IS_HERITED);
        return this;
    }

    public void setChapIsHerited_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_IS_HERITED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_IS_HERITED);
        }
    }

    public boolean getChapIsHerited_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_IS_HERITED);
    }

    public StorageTargetWhereInput chapIsHeritedNot(Boolean chapIsHeritedNot) {

        this.chapIsHeritedNot = chapIsHeritedNot;
        return this;
    }

    /**
     * Get chapIsHeritedNot
     *
     * @return chapIsHeritedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getChapIsHeritedNot() {
        return chapIsHeritedNot;
    }

    public void setChapIsHeritedNot(Boolean chapIsHeritedNot) {
        this.chapIsHeritedNot = chapIsHeritedNot;
    }

    public StorageTargetWhereInput chapIsHeritedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_IS_HERITED_NOT);
        return this;
    }

    public StorageTargetWhereInput chapIsHeritedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHAP_IS_HERITED_NOT);
        return this;
    }

    public void setChapIsHeritedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHAP_IS_HERITED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHAP_IS_HERITED_NOT);
        }
    }

    public boolean getChapIsHeritedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHAP_IS_HERITED_NOT);
    }

    public StorageTargetWhereInput chapPassword(String chapPassword) {

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

    public StorageTargetWhereInput chapPassword_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD);
        return this;
    }

    public StorageTargetWhereInput chapPassword_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordContains(String chapPasswordContains) {

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

    public StorageTargetWhereInput chapPasswordContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapPasswordContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordEndsWith(String chapPasswordEndsWith) {

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

    public StorageTargetWhereInput chapPasswordEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordGt(String chapPasswordGt) {

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

    public StorageTargetWhereInput chapPasswordGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_GT);
        return this;
    }

    public StorageTargetWhereInput chapPasswordGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordGte(String chapPasswordGte) {

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

    public StorageTargetWhereInput chapPasswordGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_GTE);
        return this;
    }

    public StorageTargetWhereInput chapPasswordGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordIn(List<String> chapPasswordIn) {

        this.chapPasswordIn = chapPasswordIn;
        return this;
    }

    public StorageTargetWhereInput addChapPasswordInItem(String chapPasswordInItem) {
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

    public StorageTargetWhereInput chapPasswordIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_IN);
        return this;
    }

    public StorageTargetWhereInput chapPasswordIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInput(String chapPasswordInput) {

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

    public StorageTargetWhereInput chapPasswordInput_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInput_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputContains(String chapPasswordInputContains) {

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

    public StorageTargetWhereInput chapPasswordInputContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputEndsWith(String chapPasswordInputEndsWith) {

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

    public StorageTargetWhereInput chapPasswordInputEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputGt(String chapPasswordInputGt) {

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

    public StorageTargetWhereInput chapPasswordInputGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GT);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputGte(String chapPasswordInputGte) {

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

    public StorageTargetWhereInput chapPasswordInputGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_GTE);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputIn(List<String> chapPasswordInputIn) {

        this.chapPasswordInputIn = chapPasswordInputIn;
        return this;
    }

    public StorageTargetWhereInput addChapPasswordInputInItem(String chapPasswordInputInItem) {
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

    public StorageTargetWhereInput chapPasswordInputIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_IN);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputLt(String chapPasswordInputLt) {

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

    public StorageTargetWhereInput chapPasswordInputLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LT);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputLte(String chapPasswordInputLte) {

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

    public StorageTargetWhereInput chapPasswordInputLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_LTE);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputNot(String chapPasswordInputNot) {

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

    public StorageTargetWhereInput chapPasswordInputNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputNotContains(
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

    public StorageTargetWhereInput chapPasswordInputNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputNotContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputNotEndsWith(
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

    public StorageTargetWhereInput chapPasswordInputNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputNotEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputNotIn(List<String> chapPasswordInputNotIn) {

        this.chapPasswordInputNotIn = chapPasswordInputNotIn;
        return this;
    }

    public StorageTargetWhereInput addChapPasswordInputNotInItem(
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

    public StorageTargetWhereInput chapPasswordInputNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputNotStartsWith(
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

    public StorageTargetWhereInput chapPasswordInputNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputNotStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordInputStartsWith(String chapPasswordInputStartsWith) {

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

    public StorageTargetWhereInput chapPasswordInputStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_INPUT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordInputStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordLt(String chapPasswordLt) {

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

    public StorageTargetWhereInput chapPasswordLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_LT);
        return this;
    }

    public StorageTargetWhereInput chapPasswordLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordLte(String chapPasswordLte) {

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

    public StorageTargetWhereInput chapPasswordLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_LTE);
        return this;
    }

    public StorageTargetWhereInput chapPasswordLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordNot(String chapPasswordNot) {

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

    public StorageTargetWhereInput chapPasswordNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT);
        return this;
    }

    public StorageTargetWhereInput chapPasswordNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordNotContains(String chapPasswordNotContains) {

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

    public StorageTargetWhereInput chapPasswordNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapPasswordNotContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordNotEndsWith(String chapPasswordNotEndsWith) {

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

    public StorageTargetWhereInput chapPasswordNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordNotEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordNotIn(List<String> chapPasswordNotIn) {

        this.chapPasswordNotIn = chapPasswordNotIn;
        return this;
    }

    public StorageTargetWhereInput addChapPasswordNotInItem(String chapPasswordNotInItem) {
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

    public StorageTargetWhereInput chapPasswordNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput chapPasswordNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordNotStartsWith(String chapPasswordNotStartsWith) {

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

    public StorageTargetWhereInput chapPasswordNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordNotStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapPasswordStartsWith(String chapPasswordStartsWith) {

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

    public StorageTargetWhereInput chapPasswordStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_PASSWORD_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapPasswordStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsername(String chapUsername) {

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

    public StorageTargetWhereInput chapUsername_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME);
        return this;
    }

    public StorageTargetWhereInput chapUsername_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameContains(String chapUsernameContains) {

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

    public StorageTargetWhereInput chapUsernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapUsernameContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameEndsWith(String chapUsernameEndsWith) {

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

    public StorageTargetWhereInput chapUsernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameGt(String chapUsernameGt) {

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

    public StorageTargetWhereInput chapUsernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_GT);
        return this;
    }

    public StorageTargetWhereInput chapUsernameGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameGte(String chapUsernameGte) {

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

    public StorageTargetWhereInput chapUsernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_GTE);
        return this;
    }

    public StorageTargetWhereInput chapUsernameGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameIn(List<String> chapUsernameIn) {

        this.chapUsernameIn = chapUsernameIn;
        return this;
    }

    public StorageTargetWhereInput addChapUsernameInItem(String chapUsernameInItem) {
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

    public StorageTargetWhereInput chapUsernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_IN);
        return this;
    }

    public StorageTargetWhereInput chapUsernameIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInput(String chapUsernameInput) {

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

    public StorageTargetWhereInput chapUsernameInput_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInput_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputContains(String chapUsernameInputContains) {

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

    public StorageTargetWhereInput chapUsernameInputContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputEndsWith(String chapUsernameInputEndsWith) {

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

    public StorageTargetWhereInput chapUsernameInputEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputGt(String chapUsernameInputGt) {

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

    public StorageTargetWhereInput chapUsernameInputGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GT);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputGte(String chapUsernameInputGte) {

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

    public StorageTargetWhereInput chapUsernameInputGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_GTE);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputIn(List<String> chapUsernameInputIn) {

        this.chapUsernameInputIn = chapUsernameInputIn;
        return this;
    }

    public StorageTargetWhereInput addChapUsernameInputInItem(String chapUsernameInputInItem) {
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

    public StorageTargetWhereInput chapUsernameInputIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_IN);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputLt(String chapUsernameInputLt) {

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

    public StorageTargetWhereInput chapUsernameInputLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LT);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputLte(String chapUsernameInputLte) {

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

    public StorageTargetWhereInput chapUsernameInputLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_LTE);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputNot(String chapUsernameInputNot) {

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

    public StorageTargetWhereInput chapUsernameInputNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputNotContains(
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

    public StorageTargetWhereInput chapUsernameInputNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputNotContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputNotEndsWith(
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

    public StorageTargetWhereInput chapUsernameInputNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputNotEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputNotIn(List<String> chapUsernameInputNotIn) {

        this.chapUsernameInputNotIn = chapUsernameInputNotIn;
        return this;
    }

    public StorageTargetWhereInput addChapUsernameInputNotInItem(
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

    public StorageTargetWhereInput chapUsernameInputNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputNotStartsWith(
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

    public StorageTargetWhereInput chapUsernameInputNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputNotStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameInputStartsWith(String chapUsernameInputStartsWith) {

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

    public StorageTargetWhereInput chapUsernameInputStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_INPUT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameInputStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameLt(String chapUsernameLt) {

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

    public StorageTargetWhereInput chapUsernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_LT);
        return this;
    }

    public StorageTargetWhereInput chapUsernameLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameLte(String chapUsernameLte) {

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

    public StorageTargetWhereInput chapUsernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_LTE);
        return this;
    }

    public StorageTargetWhereInput chapUsernameLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameNot(String chapUsernameNot) {

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

    public StorageTargetWhereInput chapUsernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT);
        return this;
    }

    public StorageTargetWhereInput chapUsernameNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameNotContains(String chapUsernameNotContains) {

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

    public StorageTargetWhereInput chapUsernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput chapUsernameNotContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameNotEndsWith(String chapUsernameNotEndsWith) {

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

    public StorageTargetWhereInput chapUsernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameNotEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameNotIn(List<String> chapUsernameNotIn) {

        this.chapUsernameNotIn = chapUsernameNotIn;
        return this;
    }

    public StorageTargetWhereInput addChapUsernameNotInItem(String chapUsernameNotInItem) {
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

    public StorageTargetWhereInput chapUsernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput chapUsernameNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameNotStartsWith(String chapUsernameNotStartsWith) {

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

    public StorageTargetWhereInput chapUsernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameNotStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput chapUsernameStartsWith(String chapUsernameStartsWith) {

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

    public StorageTargetWhereInput chapUsernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHAP_USERNAME_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput chapUsernameStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersion(Integer dataVersion) {

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

    public StorageTargetWhereInput dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public StorageTargetWhereInput dataVersion_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersionGt(Integer dataVersionGt) {

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

    public StorageTargetWhereInput dataVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public StorageTargetWhereInput dataVersionGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersionGte(Integer dataVersionGte) {

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

    public StorageTargetWhereInput dataVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public StorageTargetWhereInput dataVersionGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersionIn(List<Integer> dataVersionIn) {

        this.dataVersionIn = dataVersionIn;
        return this;
    }

    public StorageTargetWhereInput addDataVersionInItem(Integer dataVersionInItem) {
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

    public StorageTargetWhereInput dataVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public StorageTargetWhereInput dataVersionIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersionLt(Integer dataVersionLt) {

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

    public StorageTargetWhereInput dataVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public StorageTargetWhereInput dataVersionLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersionLte(Integer dataVersionLte) {

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

    public StorageTargetWhereInput dataVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public StorageTargetWhereInput dataVersionLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersionNot(Integer dataVersionNot) {

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

    public StorageTargetWhereInput dataVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public StorageTargetWhereInput dataVersionNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput dataVersionNotIn(List<Integer> dataVersionNotIn) {

        this.dataVersionNotIn = dataVersionNotIn;
        return this;
    }

    public StorageTargetWhereInput addDataVersionNotInItem(Integer dataVersionNotInItem) {
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

    public StorageTargetWhereInput dataVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput dataVersionNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput discoveredBy(String discoveredBy) {

        this.discoveredBy = discoveredBy;
        return this;
    }

    /**
     * Get discoveredBy
     *
     * @return discoveredBy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredBy() {
        return discoveredBy;
    }

    public void setDiscoveredBy(String discoveredBy) {
        this.discoveredBy = discoveredBy;
    }

    public StorageTargetWhereInput discoveredBy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY);
        return this;
    }

    public StorageTargetWhereInput discoveredBy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY);
        return this;
    }

    public void setDiscoveredBy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY);
        }
    }

    public boolean getDiscoveredBy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY);
    }

    public StorageTargetWhereInput discoveredByContains(String discoveredByContains) {

        this.discoveredByContains = discoveredByContains;
        return this;
    }

    /**
     * Get discoveredByContains
     *
     * @return discoveredByContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByContains() {
        return discoveredByContains;
    }

    public void setDiscoveredByContains(String discoveredByContains) {
        this.discoveredByContains = discoveredByContains;
    }

    public StorageTargetWhereInput discoveredByContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput discoveredByContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_CONTAINS);
        return this;
    }

    public void setDiscoveredByContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_CONTAINS);
        }
    }

    public boolean getDiscoveredByContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_CONTAINS);
    }

    public StorageTargetWhereInput discoveredByEndsWith(String discoveredByEndsWith) {

        this.discoveredByEndsWith = discoveredByEndsWith;
        return this;
    }

    /**
     * Get discoveredByEndsWith
     *
     * @return discoveredByEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByEndsWith() {
        return discoveredByEndsWith;
    }

    public void setDiscoveredByEndsWith(String discoveredByEndsWith) {
        this.discoveredByEndsWith = discoveredByEndsWith;
    }

    public StorageTargetWhereInput discoveredByEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput discoveredByEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_ENDS_WITH);
        return this;
    }

    public void setDiscoveredByEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_ENDS_WITH);
        }
    }

    public boolean getDiscoveredByEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_ENDS_WITH);
    }

    public StorageTargetWhereInput discoveredByGt(String discoveredByGt) {

        this.discoveredByGt = discoveredByGt;
        return this;
    }

    /**
     * Get discoveredByGt
     *
     * @return discoveredByGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByGt() {
        return discoveredByGt;
    }

    public void setDiscoveredByGt(String discoveredByGt) {
        this.discoveredByGt = discoveredByGt;
    }

    public StorageTargetWhereInput discoveredByGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_GT);
        return this;
    }

    public StorageTargetWhereInput discoveredByGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_GT);
        return this;
    }

    public void setDiscoveredByGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_GT);
        }
    }

    public boolean getDiscoveredByGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_GT);
    }

    public StorageTargetWhereInput discoveredByGte(String discoveredByGte) {

        this.discoveredByGte = discoveredByGte;
        return this;
    }

    /**
     * Get discoveredByGte
     *
     * @return discoveredByGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByGte() {
        return discoveredByGte;
    }

    public void setDiscoveredByGte(String discoveredByGte) {
        this.discoveredByGte = discoveredByGte;
    }

    public StorageTargetWhereInput discoveredByGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_GTE);
        return this;
    }

    public StorageTargetWhereInput discoveredByGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_GTE);
        return this;
    }

    public void setDiscoveredByGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_GTE);
        }
    }

    public boolean getDiscoveredByGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_GTE);
    }

    public StorageTargetWhereInput discoveredByIn(List<String> discoveredByIn) {

        this.discoveredByIn = discoveredByIn;
        return this;
    }

    public StorageTargetWhereInput addDiscoveredByInItem(String discoveredByInItem) {
        if (this.discoveredByIn == null) {
            this.discoveredByIn = new ArrayList<String>();
        }
        this.discoveredByIn.add(discoveredByInItem);
        return this;
    }

    /**
     * Get discoveredByIn
     *
     * @return discoveredByIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDiscoveredByIn() {
        return discoveredByIn;
    }

    public void setDiscoveredByIn(List<String> discoveredByIn) {
        this.discoveredByIn = discoveredByIn;
    }

    public StorageTargetWhereInput discoveredByIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_IN);
        return this;
    }

    public StorageTargetWhereInput discoveredByIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_IN);
        return this;
    }

    public void setDiscoveredByIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_IN);
        }
    }

    public boolean getDiscoveredByIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_IN);
    }

    public StorageTargetWhereInput discoveredByLt(String discoveredByLt) {

        this.discoveredByLt = discoveredByLt;
        return this;
    }

    /**
     * Get discoveredByLt
     *
     * @return discoveredByLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByLt() {
        return discoveredByLt;
    }

    public void setDiscoveredByLt(String discoveredByLt) {
        this.discoveredByLt = discoveredByLt;
    }

    public StorageTargetWhereInput discoveredByLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_LT);
        return this;
    }

    public StorageTargetWhereInput discoveredByLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_LT);
        return this;
    }

    public void setDiscoveredByLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_LT);
        }
    }

    public boolean getDiscoveredByLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_LT);
    }

    public StorageTargetWhereInput discoveredByLte(String discoveredByLte) {

        this.discoveredByLte = discoveredByLte;
        return this;
    }

    /**
     * Get discoveredByLte
     *
     * @return discoveredByLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByLte() {
        return discoveredByLte;
    }

    public void setDiscoveredByLte(String discoveredByLte) {
        this.discoveredByLte = discoveredByLte;
    }

    public StorageTargetWhereInput discoveredByLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_LTE);
        return this;
    }

    public StorageTargetWhereInput discoveredByLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_LTE);
        return this;
    }

    public void setDiscoveredByLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_LTE);
        }
    }

    public boolean getDiscoveredByLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_LTE);
    }

    public StorageTargetWhereInput discoveredByNot(String discoveredByNot) {

        this.discoveredByNot = discoveredByNot;
        return this;
    }

    /**
     * Get discoveredByNot
     *
     * @return discoveredByNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByNot() {
        return discoveredByNot;
    }

    public void setDiscoveredByNot(String discoveredByNot) {
        this.discoveredByNot = discoveredByNot;
    }

    public StorageTargetWhereInput discoveredByNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT);
        return this;
    }

    public StorageTargetWhereInput discoveredByNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT);
        return this;
    }

    public void setDiscoveredByNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT);
        }
    }

    public boolean getDiscoveredByNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_NOT);
    }

    public StorageTargetWhereInput discoveredByNotContains(String discoveredByNotContains) {

        this.discoveredByNotContains = discoveredByNotContains;
        return this;
    }

    /**
     * Get discoveredByNotContains
     *
     * @return discoveredByNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByNotContains() {
        return discoveredByNotContains;
    }

    public void setDiscoveredByNotContains(String discoveredByNotContains) {
        this.discoveredByNotContains = discoveredByNotContains;
    }

    public StorageTargetWhereInput discoveredByNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput discoveredByNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_CONTAINS);
        return this;
    }

    public void setDiscoveredByNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_CONTAINS);
        }
    }

    public boolean getDiscoveredByNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_NOT_CONTAINS);
    }

    public StorageTargetWhereInput discoveredByNotEndsWith(String discoveredByNotEndsWith) {

        this.discoveredByNotEndsWith = discoveredByNotEndsWith;
        return this;
    }

    /**
     * Get discoveredByNotEndsWith
     *
     * @return discoveredByNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByNotEndsWith() {
        return discoveredByNotEndsWith;
    }

    public void setDiscoveredByNotEndsWith(String discoveredByNotEndsWith) {
        this.discoveredByNotEndsWith = discoveredByNotEndsWith;
    }

    public StorageTargetWhereInput discoveredByNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput discoveredByNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_ENDS_WITH);
        return this;
    }

    public void setDiscoveredByNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_ENDS_WITH);
        }
    }

    public boolean getDiscoveredByNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_NOT_ENDS_WITH);
    }

    public StorageTargetWhereInput discoveredByNotIn(List<String> discoveredByNotIn) {

        this.discoveredByNotIn = discoveredByNotIn;
        return this;
    }

    public StorageTargetWhereInput addDiscoveredByNotInItem(String discoveredByNotInItem) {
        if (this.discoveredByNotIn == null) {
            this.discoveredByNotIn = new ArrayList<String>();
        }
        this.discoveredByNotIn.add(discoveredByNotInItem);
        return this;
    }

    /**
     * Get discoveredByNotIn
     *
     * @return discoveredByNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDiscoveredByNotIn() {
        return discoveredByNotIn;
    }

    public void setDiscoveredByNotIn(List<String> discoveredByNotIn) {
        this.discoveredByNotIn = discoveredByNotIn;
    }

    public StorageTargetWhereInput discoveredByNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput discoveredByNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_IN);
        return this;
    }

    public void setDiscoveredByNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_IN);
        }
    }

    public boolean getDiscoveredByNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_NOT_IN);
    }

    public StorageTargetWhereInput discoveredByNotStartsWith(String discoveredByNotStartsWith) {

        this.discoveredByNotStartsWith = discoveredByNotStartsWith;
        return this;
    }

    /**
     * Get discoveredByNotStartsWith
     *
     * @return discoveredByNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByNotStartsWith() {
        return discoveredByNotStartsWith;
    }

    public void setDiscoveredByNotStartsWith(String discoveredByNotStartsWith) {
        this.discoveredByNotStartsWith = discoveredByNotStartsWith;
    }

    public StorageTargetWhereInput discoveredByNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput discoveredByNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_STARTS_WITH);
        return this;
    }

    public void setDiscoveredByNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_NOT_STARTS_WITH);
        }
    }

    public boolean getDiscoveredByNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_NOT_STARTS_WITH);
    }

    public StorageTargetWhereInput discoveredByStartsWith(String discoveredByStartsWith) {

        this.discoveredByStartsWith = discoveredByStartsWith;
        return this;
    }

    /**
     * Get discoveredByStartsWith
     *
     * @return discoveredByStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDiscoveredByStartsWith() {
        return discoveredByStartsWith;
    }

    public void setDiscoveredByStartsWith(String discoveredByStartsWith) {
        this.discoveredByStartsWith = discoveredByStartsWith;
    }

    public StorageTargetWhereInput discoveredByStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput discoveredByStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_STARTS_WITH);
        return this;
    }

    public void setDiscoveredByStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCOVERED_BY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCOVERED_BY_STARTS_WITH);
        }
    }

    public boolean getDiscoveredByStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCOVERED_BY_STARTS_WITH);
    }

    public StorageTargetWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public StorageTargetWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public StorageTargetWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public StorageTargetWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public StorageTargetWhereInput addEntityAsyncStatusInItem(
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

    public StorageTargetWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public StorageTargetWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public StorageTargetWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public StorageTargetWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public StorageTargetWhereInput addEntityAsyncStatusNotInItem(
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

    public StorageTargetWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput id(String id) {

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

    public StorageTargetWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public StorageTargetWhereInput id_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idContains(String idContains) {

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

    public StorageTargetWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput idContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idEndsWith(String idEndsWith) {

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

    public StorageTargetWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput idEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idGt(String idGt) {

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

    public StorageTargetWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public StorageTargetWhereInput idGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idGte(String idGte) {

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

    public StorageTargetWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public StorageTargetWhereInput idGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public StorageTargetWhereInput addIdInItem(String idInItem) {
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

    public StorageTargetWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public StorageTargetWhereInput idIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idLt(String idLt) {

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

    public StorageTargetWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public StorageTargetWhereInput idLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idLte(String idLte) {

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

    public StorageTargetWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public StorageTargetWhereInput idLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idNot(String idNot) {

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

    public StorageTargetWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public StorageTargetWhereInput idNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idNotContains(String idNotContains) {

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

    public StorageTargetWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput idNotContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public StorageTargetWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public StorageTargetWhereInput addIdNotInItem(String idNotInItem) {
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

    public StorageTargetWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput idNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public StorageTargetWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput idStartsWith(String idStartsWith) {

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

    public StorageTargetWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput idStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput identityVerificationMethod(
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

    public StorageTargetWhereInput identityVerificationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD);
        return this;
    }

    public StorageTargetWhereInput identityVerificationMethod_ExplictlyNonNull() {
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

    public StorageTargetWhereInput identityVerificationMethodIn(
            List<IdentityVerificationMethod> identityVerificationMethodIn) {

        this.identityVerificationMethodIn = identityVerificationMethodIn;
        return this;
    }

    public StorageTargetWhereInput addIdentityVerificationMethodInItem(
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

    public StorageTargetWhereInput identityVerificationMethodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_IN);
        return this;
    }

    public StorageTargetWhereInput identityVerificationMethodIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput identityVerificationMethodNot(
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

    public StorageTargetWhereInput identityVerificationMethodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT);
        return this;
    }

    public StorageTargetWhereInput identityVerificationMethodNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput identityVerificationMethodNotIn(
            List<IdentityVerificationMethod> identityVerificationMethodNotIn) {

        this.identityVerificationMethodNotIn = identityVerificationMethodNotIn;
        return this;
    }

    public StorageTargetWhereInput addIdentityVerificationMethodNotInItem(
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

    public StorageTargetWhereInput identityVerificationMethodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDENTITY_VERIFICATION_METHOD_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput identityVerificationMethodNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHash(String localHash) {

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

    public StorageTargetWhereInput localHash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public StorageTargetWhereInput localHash_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashContains(String localHashContains) {

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

    public StorageTargetWhereInput localHashContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput localHashContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashEndsWith(String localHashEndsWith) {

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

    public StorageTargetWhereInput localHashEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput localHashEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashGt(String localHashGt) {

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

    public StorageTargetWhereInput localHashGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public StorageTargetWhereInput localHashGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashGte(String localHashGte) {

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

    public StorageTargetWhereInput localHashGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public StorageTargetWhereInput localHashGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashIn(List<String> localHashIn) {

        this.localHashIn = localHashIn;
        return this;
    }

    public StorageTargetWhereInput addLocalHashInItem(String localHashInItem) {
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

    public StorageTargetWhereInput localHashIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public StorageTargetWhereInput localHashIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashLt(String localHashLt) {

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

    public StorageTargetWhereInput localHashLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public StorageTargetWhereInput localHashLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashLte(String localHashLte) {

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

    public StorageTargetWhereInput localHashLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public StorageTargetWhereInput localHashLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashNot(String localHashNot) {

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

    public StorageTargetWhereInput localHashNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public StorageTargetWhereInput localHashNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashNotContains(String localHashNotContains) {

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

    public StorageTargetWhereInput localHashNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput localHashNotContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashNotEndsWith(String localHashNotEndsWith) {

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

    public StorageTargetWhereInput localHashNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput localHashNotEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashNotIn(List<String> localHashNotIn) {

        this.localHashNotIn = localHashNotIn;
        return this;
    }

    public StorageTargetWhereInput addLocalHashNotInItem(String localHashNotInItem) {
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

    public StorageTargetWhereInput localHashNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput localHashNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashNotStartsWith(String localHashNotStartsWith) {

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

    public StorageTargetWhereInput localHashNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput localHashNotStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localHashStartsWith(String localHashStartsWith) {

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

    public StorageTargetWhereInput localHashStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput localHashStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localId(String localId) {

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

    public StorageTargetWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public StorageTargetWhereInput localId_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdContains(String localIdContains) {

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

    public StorageTargetWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput localIdContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public StorageTargetWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdGt(String localIdGt) {

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

    public StorageTargetWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public StorageTargetWhereInput localIdGt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdGte(String localIdGte) {

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

    public StorageTargetWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public StorageTargetWhereInput localIdGte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public StorageTargetWhereInput addLocalIdInItem(String localIdInItem) {
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

    public StorageTargetWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public StorageTargetWhereInput localIdIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdLt(String localIdLt) {

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

    public StorageTargetWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public StorageTargetWhereInput localIdLt_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdLte(String localIdLte) {

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

    public StorageTargetWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public StorageTargetWhereInput localIdLte_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdNot(String localIdNot) {

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

    public StorageTargetWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public StorageTargetWhereInput localIdNot_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdNotContains(String localIdNotContains) {

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

    public StorageTargetWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public StorageTargetWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public StorageTargetWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public StorageTargetWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public StorageTargetWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public StorageTargetWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public StorageTargetWhereInput storageAdapter(StorageAdapterWhereInput storageAdapter) {

        this.storageAdapter = storageAdapter;
        return this;
    }

    /**
     * Get storageAdapter
     *
     * @return storageAdapter
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageAdapterWhereInput getStorageAdapter() {
        return storageAdapter;
    }

    public void setStorageAdapter(StorageAdapterWhereInput storageAdapter) {
        this.storageAdapter = storageAdapter;
    }

    public StorageTargetWhereInput storageAdapter_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ADAPTER);
        return this;
    }

    public StorageTargetWhereInput storageAdapter_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ADAPTER);
        return this;
    }

    public void setStorageAdapter_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ADAPTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ADAPTER);
        }
    }

    public boolean getStorageAdapter_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ADAPTER);
    }

    public StorageTargetWhereInput targetIp(String targetIp) {

        this.targetIp = targetIp;
        return this;
    }

    /**
     * Get targetIp
     *
     * @return targetIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    public StorageTargetWhereInput targetIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP);
        return this;
    }

    public StorageTargetWhereInput targetIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP);
        return this;
    }

    public void setTargetIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP);
        }
    }

    public boolean getTargetIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP);
    }

    public StorageTargetWhereInput targetIpContains(String targetIpContains) {

        this.targetIpContains = targetIpContains;
        return this;
    }

    /**
     * Get targetIpContains
     *
     * @return targetIpContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpContains() {
        return targetIpContains;
    }

    public void setTargetIpContains(String targetIpContains) {
        this.targetIpContains = targetIpContains;
    }

    public StorageTargetWhereInput targetIpContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput targetIpContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_CONTAINS);
        return this;
    }

    public void setTargetIpContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_CONTAINS);
        }
    }

    public boolean getTargetIpContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_CONTAINS);
    }

    public StorageTargetWhereInput targetIpEndsWith(String targetIpEndsWith) {

        this.targetIpEndsWith = targetIpEndsWith;
        return this;
    }

    /**
     * Get targetIpEndsWith
     *
     * @return targetIpEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpEndsWith() {
        return targetIpEndsWith;
    }

    public void setTargetIpEndsWith(String targetIpEndsWith) {
        this.targetIpEndsWith = targetIpEndsWith;
    }

    public StorageTargetWhereInput targetIpEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIpEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_ENDS_WITH);
        return this;
    }

    public void setTargetIpEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_ENDS_WITH);
        }
    }

    public boolean getTargetIpEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_ENDS_WITH);
    }

    public StorageTargetWhereInput targetIpGt(String targetIpGt) {

        this.targetIpGt = targetIpGt;
        return this;
    }

    /**
     * Get targetIpGt
     *
     * @return targetIpGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpGt() {
        return targetIpGt;
    }

    public void setTargetIpGt(String targetIpGt) {
        this.targetIpGt = targetIpGt;
    }

    public StorageTargetWhereInput targetIpGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_GT);
        return this;
    }

    public StorageTargetWhereInput targetIpGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_GT);
        return this;
    }

    public void setTargetIpGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_GT);
        }
    }

    public boolean getTargetIpGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_GT);
    }

    public StorageTargetWhereInput targetIpGte(String targetIpGte) {

        this.targetIpGte = targetIpGte;
        return this;
    }

    /**
     * Get targetIpGte
     *
     * @return targetIpGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpGte() {
        return targetIpGte;
    }

    public void setTargetIpGte(String targetIpGte) {
        this.targetIpGte = targetIpGte;
    }

    public StorageTargetWhereInput targetIpGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_GTE);
        return this;
    }

    public StorageTargetWhereInput targetIpGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_GTE);
        return this;
    }

    public void setTargetIpGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_GTE);
        }
    }

    public boolean getTargetIpGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_GTE);
    }

    public StorageTargetWhereInput targetIpIn(List<String> targetIpIn) {

        this.targetIpIn = targetIpIn;
        return this;
    }

    public StorageTargetWhereInput addTargetIpInItem(String targetIpInItem) {
        if (this.targetIpIn == null) {
            this.targetIpIn = new ArrayList<String>();
        }
        this.targetIpIn.add(targetIpInItem);
        return this;
    }

    /**
     * Get targetIpIn
     *
     * @return targetIpIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetIpIn() {
        return targetIpIn;
    }

    public void setTargetIpIn(List<String> targetIpIn) {
        this.targetIpIn = targetIpIn;
    }

    public StorageTargetWhereInput targetIpIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_IN);
        return this;
    }

    public StorageTargetWhereInput targetIpIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_IN);
        return this;
    }

    public void setTargetIpIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_IN);
        }
    }

    public boolean getTargetIpIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_IN);
    }

    public StorageTargetWhereInput targetIpLt(String targetIpLt) {

        this.targetIpLt = targetIpLt;
        return this;
    }

    /**
     * Get targetIpLt
     *
     * @return targetIpLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpLt() {
        return targetIpLt;
    }

    public void setTargetIpLt(String targetIpLt) {
        this.targetIpLt = targetIpLt;
    }

    public StorageTargetWhereInput targetIpLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_LT);
        return this;
    }

    public StorageTargetWhereInput targetIpLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_LT);
        return this;
    }

    public void setTargetIpLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_LT);
        }
    }

    public boolean getTargetIpLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_LT);
    }

    public StorageTargetWhereInput targetIpLte(String targetIpLte) {

        this.targetIpLte = targetIpLte;
        return this;
    }

    /**
     * Get targetIpLte
     *
     * @return targetIpLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpLte() {
        return targetIpLte;
    }

    public void setTargetIpLte(String targetIpLte) {
        this.targetIpLte = targetIpLte;
    }

    public StorageTargetWhereInput targetIpLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_LTE);
        return this;
    }

    public StorageTargetWhereInput targetIpLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_LTE);
        return this;
    }

    public void setTargetIpLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_LTE);
        }
    }

    public boolean getTargetIpLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_LTE);
    }

    public StorageTargetWhereInput targetIpNot(String targetIpNot) {

        this.targetIpNot = targetIpNot;
        return this;
    }

    /**
     * Get targetIpNot
     *
     * @return targetIpNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpNot() {
        return targetIpNot;
    }

    public void setTargetIpNot(String targetIpNot) {
        this.targetIpNot = targetIpNot;
    }

    public StorageTargetWhereInput targetIpNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT);
        return this;
    }

    public StorageTargetWhereInput targetIpNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT);
        return this;
    }

    public void setTargetIpNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT);
        }
    }

    public boolean getTargetIpNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_NOT);
    }

    public StorageTargetWhereInput targetIpNotContains(String targetIpNotContains) {

        this.targetIpNotContains = targetIpNotContains;
        return this;
    }

    /**
     * Get targetIpNotContains
     *
     * @return targetIpNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpNotContains() {
        return targetIpNotContains;
    }

    public void setTargetIpNotContains(String targetIpNotContains) {
        this.targetIpNotContains = targetIpNotContains;
    }

    public StorageTargetWhereInput targetIpNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput targetIpNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_CONTAINS);
        return this;
    }

    public void setTargetIpNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_CONTAINS);
        }
    }

    public boolean getTargetIpNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_NOT_CONTAINS);
    }

    public StorageTargetWhereInput targetIpNotEndsWith(String targetIpNotEndsWith) {

        this.targetIpNotEndsWith = targetIpNotEndsWith;
        return this;
    }

    /**
     * Get targetIpNotEndsWith
     *
     * @return targetIpNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpNotEndsWith() {
        return targetIpNotEndsWith;
    }

    public void setTargetIpNotEndsWith(String targetIpNotEndsWith) {
        this.targetIpNotEndsWith = targetIpNotEndsWith;
    }

    public StorageTargetWhereInput targetIpNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIpNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_ENDS_WITH);
        return this;
    }

    public void setTargetIpNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_ENDS_WITH);
        }
    }

    public boolean getTargetIpNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_NOT_ENDS_WITH);
    }

    public StorageTargetWhereInput targetIpNotIn(List<String> targetIpNotIn) {

        this.targetIpNotIn = targetIpNotIn;
        return this;
    }

    public StorageTargetWhereInput addTargetIpNotInItem(String targetIpNotInItem) {
        if (this.targetIpNotIn == null) {
            this.targetIpNotIn = new ArrayList<String>();
        }
        this.targetIpNotIn.add(targetIpNotInItem);
        return this;
    }

    /**
     * Get targetIpNotIn
     *
     * @return targetIpNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetIpNotIn() {
        return targetIpNotIn;
    }

    public void setTargetIpNotIn(List<String> targetIpNotIn) {
        this.targetIpNotIn = targetIpNotIn;
    }

    public StorageTargetWhereInput targetIpNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput targetIpNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_IN);
        return this;
    }

    public void setTargetIpNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_IN);
        }
    }

    public boolean getTargetIpNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_NOT_IN);
    }

    public StorageTargetWhereInput targetIpNotStartsWith(String targetIpNotStartsWith) {

        this.targetIpNotStartsWith = targetIpNotStartsWith;
        return this;
    }

    /**
     * Get targetIpNotStartsWith
     *
     * @return targetIpNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpNotStartsWith() {
        return targetIpNotStartsWith;
    }

    public void setTargetIpNotStartsWith(String targetIpNotStartsWith) {
        this.targetIpNotStartsWith = targetIpNotStartsWith;
    }

    public StorageTargetWhereInput targetIpNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIpNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_STARTS_WITH);
        return this;
    }

    public void setTargetIpNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_NOT_STARTS_WITH);
        }
    }

    public boolean getTargetIpNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_NOT_STARTS_WITH);
    }

    public StorageTargetWhereInput targetIpStartsWith(String targetIpStartsWith) {

        this.targetIpStartsWith = targetIpStartsWith;
        return this;
    }

    /**
     * Get targetIpStartsWith
     *
     * @return targetIpStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIpStartsWith() {
        return targetIpStartsWith;
    }

    public void setTargetIpStartsWith(String targetIpStartsWith) {
        this.targetIpStartsWith = targetIpStartsWith;
    }

    public StorageTargetWhereInput targetIpStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIpStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_STARTS_WITH);
        return this;
    }

    public void setTargetIpStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP_STARTS_WITH);
        }
    }

    public boolean getTargetIpStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP_STARTS_WITH);
    }

    public StorageTargetWhereInput targetIqn(String targetIqn) {

        this.targetIqn = targetIqn;
        return this;
    }

    /**
     * Get targetIqn
     *
     * @return targetIqn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqn() {
        return targetIqn;
    }

    public void setTargetIqn(String targetIqn) {
        this.targetIqn = targetIqn;
    }

    public StorageTargetWhereInput targetIqn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN);
        return this;
    }

    public StorageTargetWhereInput targetIqn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN);
        return this;
    }

    public void setTargetIqn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN);
        }
    }

    public boolean getTargetIqn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN);
    }

    public StorageTargetWhereInput targetIqnContains(String targetIqnContains) {

        this.targetIqnContains = targetIqnContains;
        return this;
    }

    /**
     * Get targetIqnContains
     *
     * @return targetIqnContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnContains() {
        return targetIqnContains;
    }

    public void setTargetIqnContains(String targetIqnContains) {
        this.targetIqnContains = targetIqnContains;
    }

    public StorageTargetWhereInput targetIqnContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput targetIqnContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_CONTAINS);
        return this;
    }

    public void setTargetIqnContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_CONTAINS);
        }
    }

    public boolean getTargetIqnContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_CONTAINS);
    }

    public StorageTargetWhereInput targetIqnEndsWith(String targetIqnEndsWith) {

        this.targetIqnEndsWith = targetIqnEndsWith;
        return this;
    }

    /**
     * Get targetIqnEndsWith
     *
     * @return targetIqnEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnEndsWith() {
        return targetIqnEndsWith;
    }

    public void setTargetIqnEndsWith(String targetIqnEndsWith) {
        this.targetIqnEndsWith = targetIqnEndsWith;
    }

    public StorageTargetWhereInput targetIqnEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIqnEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_ENDS_WITH);
        return this;
    }

    public void setTargetIqnEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_ENDS_WITH);
        }
    }

    public boolean getTargetIqnEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_ENDS_WITH);
    }

    public StorageTargetWhereInput targetIqnGt(String targetIqnGt) {

        this.targetIqnGt = targetIqnGt;
        return this;
    }

    /**
     * Get targetIqnGt
     *
     * @return targetIqnGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnGt() {
        return targetIqnGt;
    }

    public void setTargetIqnGt(String targetIqnGt) {
        this.targetIqnGt = targetIqnGt;
    }

    public StorageTargetWhereInput targetIqnGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_GT);
        return this;
    }

    public StorageTargetWhereInput targetIqnGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_GT);
        return this;
    }

    public void setTargetIqnGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_GT);
        }
    }

    public boolean getTargetIqnGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_GT);
    }

    public StorageTargetWhereInput targetIqnGte(String targetIqnGte) {

        this.targetIqnGte = targetIqnGte;
        return this;
    }

    /**
     * Get targetIqnGte
     *
     * @return targetIqnGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnGte() {
        return targetIqnGte;
    }

    public void setTargetIqnGte(String targetIqnGte) {
        this.targetIqnGte = targetIqnGte;
    }

    public StorageTargetWhereInput targetIqnGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_GTE);
        return this;
    }

    public StorageTargetWhereInput targetIqnGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_GTE);
        return this;
    }

    public void setTargetIqnGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_GTE);
        }
    }

    public boolean getTargetIqnGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_GTE);
    }

    public StorageTargetWhereInput targetIqnIn(List<String> targetIqnIn) {

        this.targetIqnIn = targetIqnIn;
        return this;
    }

    public StorageTargetWhereInput addTargetIqnInItem(String targetIqnInItem) {
        if (this.targetIqnIn == null) {
            this.targetIqnIn = new ArrayList<String>();
        }
        this.targetIqnIn.add(targetIqnInItem);
        return this;
    }

    /**
     * Get targetIqnIn
     *
     * @return targetIqnIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetIqnIn() {
        return targetIqnIn;
    }

    public void setTargetIqnIn(List<String> targetIqnIn) {
        this.targetIqnIn = targetIqnIn;
    }

    public StorageTargetWhereInput targetIqnIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_IN);
        return this;
    }

    public StorageTargetWhereInput targetIqnIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_IN);
        return this;
    }

    public void setTargetIqnIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_IN);
        }
    }

    public boolean getTargetIqnIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_IN);
    }

    public StorageTargetWhereInput targetIqnLt(String targetIqnLt) {

        this.targetIqnLt = targetIqnLt;
        return this;
    }

    /**
     * Get targetIqnLt
     *
     * @return targetIqnLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnLt() {
        return targetIqnLt;
    }

    public void setTargetIqnLt(String targetIqnLt) {
        this.targetIqnLt = targetIqnLt;
    }

    public StorageTargetWhereInput targetIqnLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_LT);
        return this;
    }

    public StorageTargetWhereInput targetIqnLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_LT);
        return this;
    }

    public void setTargetIqnLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_LT);
        }
    }

    public boolean getTargetIqnLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_LT);
    }

    public StorageTargetWhereInput targetIqnLte(String targetIqnLte) {

        this.targetIqnLte = targetIqnLte;
        return this;
    }

    /**
     * Get targetIqnLte
     *
     * @return targetIqnLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnLte() {
        return targetIqnLte;
    }

    public void setTargetIqnLte(String targetIqnLte) {
        this.targetIqnLte = targetIqnLte;
    }

    public StorageTargetWhereInput targetIqnLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_LTE);
        return this;
    }

    public StorageTargetWhereInput targetIqnLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_LTE);
        return this;
    }

    public void setTargetIqnLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_LTE);
        }
    }

    public boolean getTargetIqnLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_LTE);
    }

    public StorageTargetWhereInput targetIqnNot(String targetIqnNot) {

        this.targetIqnNot = targetIqnNot;
        return this;
    }

    /**
     * Get targetIqnNot
     *
     * @return targetIqnNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnNot() {
        return targetIqnNot;
    }

    public void setTargetIqnNot(String targetIqnNot) {
        this.targetIqnNot = targetIqnNot;
    }

    public StorageTargetWhereInput targetIqnNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT);
        return this;
    }

    public StorageTargetWhereInput targetIqnNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT);
        return this;
    }

    public void setTargetIqnNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT);
        }
    }

    public boolean getTargetIqnNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_NOT);
    }

    public StorageTargetWhereInput targetIqnNotContains(String targetIqnNotContains) {

        this.targetIqnNotContains = targetIqnNotContains;
        return this;
    }

    /**
     * Get targetIqnNotContains
     *
     * @return targetIqnNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnNotContains() {
        return targetIqnNotContains;
    }

    public void setTargetIqnNotContains(String targetIqnNotContains) {
        this.targetIqnNotContains = targetIqnNotContains;
    }

    public StorageTargetWhereInput targetIqnNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_CONTAINS);
        return this;
    }

    public StorageTargetWhereInput targetIqnNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_CONTAINS);
        return this;
    }

    public void setTargetIqnNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_CONTAINS);
        }
    }

    public boolean getTargetIqnNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_NOT_CONTAINS);
    }

    public StorageTargetWhereInput targetIqnNotEndsWith(String targetIqnNotEndsWith) {

        this.targetIqnNotEndsWith = targetIqnNotEndsWith;
        return this;
    }

    /**
     * Get targetIqnNotEndsWith
     *
     * @return targetIqnNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnNotEndsWith() {
        return targetIqnNotEndsWith;
    }

    public void setTargetIqnNotEndsWith(String targetIqnNotEndsWith) {
        this.targetIqnNotEndsWith = targetIqnNotEndsWith;
    }

    public StorageTargetWhereInput targetIqnNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_ENDS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIqnNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_ENDS_WITH);
        return this;
    }

    public void setTargetIqnNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_ENDS_WITH);
        }
    }

    public boolean getTargetIqnNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_NOT_ENDS_WITH);
    }

    public StorageTargetWhereInput targetIqnNotIn(List<String> targetIqnNotIn) {

        this.targetIqnNotIn = targetIqnNotIn;
        return this;
    }

    public StorageTargetWhereInput addTargetIqnNotInItem(String targetIqnNotInItem) {
        if (this.targetIqnNotIn == null) {
            this.targetIqnNotIn = new ArrayList<String>();
        }
        this.targetIqnNotIn.add(targetIqnNotInItem);
        return this;
    }

    /**
     * Get targetIqnNotIn
     *
     * @return targetIqnNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTargetIqnNotIn() {
        return targetIqnNotIn;
    }

    public void setTargetIqnNotIn(List<String> targetIqnNotIn) {
        this.targetIqnNotIn = targetIqnNotIn;
    }

    public StorageTargetWhereInput targetIqnNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput targetIqnNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_IN);
        return this;
    }

    public void setTargetIqnNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_IN);
        }
    }

    public boolean getTargetIqnNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_NOT_IN);
    }

    public StorageTargetWhereInput targetIqnNotStartsWith(String targetIqnNotStartsWith) {

        this.targetIqnNotStartsWith = targetIqnNotStartsWith;
        return this;
    }

    /**
     * Get targetIqnNotStartsWith
     *
     * @return targetIqnNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnNotStartsWith() {
        return targetIqnNotStartsWith;
    }

    public void setTargetIqnNotStartsWith(String targetIqnNotStartsWith) {
        this.targetIqnNotStartsWith = targetIqnNotStartsWith;
    }

    public StorageTargetWhereInput targetIqnNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIqnNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_STARTS_WITH);
        return this;
    }

    public void setTargetIqnNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_NOT_STARTS_WITH);
        }
    }

    public boolean getTargetIqnNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_NOT_STARTS_WITH);
    }

    public StorageTargetWhereInput targetIqnStartsWith(String targetIqnStartsWith) {

        this.targetIqnStartsWith = targetIqnStartsWith;
        return this;
    }

    /**
     * Get targetIqnStartsWith
     *
     * @return targetIqnStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetIqnStartsWith() {
        return targetIqnStartsWith;
    }

    public void setTargetIqnStartsWith(String targetIqnStartsWith) {
        this.targetIqnStartsWith = targetIqnStartsWith;
    }

    public StorageTargetWhereInput targetIqnStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_STARTS_WITH);
        return this;
    }

    public StorageTargetWhereInput targetIqnStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_STARTS_WITH);
        return this;
    }

    public void setTargetIqnStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IQN_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IQN_STARTS_WITH);
        }
    }

    public boolean getTargetIqnStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IQN_STARTS_WITH);
    }

    public StorageTargetWhereInput targetPort(Integer targetPort) {

        this.targetPort = targetPort;
        return this;
    }

    /**
     * Get targetPort
     *
     * @return targetPort
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
    }

    public StorageTargetWhereInput targetPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT);
        return this;
    }

    public StorageTargetWhereInput targetPort_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT);
        return this;
    }

    public void setTargetPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT);
        }
    }

    public boolean getTargetPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT);
    }

    public StorageTargetWhereInput targetPortGt(Integer targetPortGt) {

        this.targetPortGt = targetPortGt;
        return this;
    }

    /**
     * Get targetPortGt
     *
     * @return targetPortGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetPortGt() {
        return targetPortGt;
    }

    public void setTargetPortGt(Integer targetPortGt) {
        this.targetPortGt = targetPortGt;
    }

    public StorageTargetWhereInput targetPortGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_GT);
        return this;
    }

    public StorageTargetWhereInput targetPortGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_GT);
        return this;
    }

    public void setTargetPortGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_GT);
        }
    }

    public boolean getTargetPortGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT_GT);
    }

    public StorageTargetWhereInput targetPortGte(Integer targetPortGte) {

        this.targetPortGte = targetPortGte;
        return this;
    }

    /**
     * Get targetPortGte
     *
     * @return targetPortGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetPortGte() {
        return targetPortGte;
    }

    public void setTargetPortGte(Integer targetPortGte) {
        this.targetPortGte = targetPortGte;
    }

    public StorageTargetWhereInput targetPortGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_GTE);
        return this;
    }

    public StorageTargetWhereInput targetPortGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_GTE);
        return this;
    }

    public void setTargetPortGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_GTE);
        }
    }

    public boolean getTargetPortGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT_GTE);
    }

    public StorageTargetWhereInput targetPortIn(List<Integer> targetPortIn) {

        this.targetPortIn = targetPortIn;
        return this;
    }

    public StorageTargetWhereInput addTargetPortInItem(Integer targetPortInItem) {
        if (this.targetPortIn == null) {
            this.targetPortIn = new ArrayList<Integer>();
        }
        this.targetPortIn.add(targetPortInItem);
        return this;
    }

    /**
     * Get targetPortIn
     *
     * @return targetPortIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTargetPortIn() {
        return targetPortIn;
    }

    public void setTargetPortIn(List<Integer> targetPortIn) {
        this.targetPortIn = targetPortIn;
    }

    public StorageTargetWhereInput targetPortIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_IN);
        return this;
    }

    public StorageTargetWhereInput targetPortIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_IN);
        return this;
    }

    public void setTargetPortIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_IN);
        }
    }

    public boolean getTargetPortIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT_IN);
    }

    public StorageTargetWhereInput targetPortLt(Integer targetPortLt) {

        this.targetPortLt = targetPortLt;
        return this;
    }

    /**
     * Get targetPortLt
     *
     * @return targetPortLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetPortLt() {
        return targetPortLt;
    }

    public void setTargetPortLt(Integer targetPortLt) {
        this.targetPortLt = targetPortLt;
    }

    public StorageTargetWhereInput targetPortLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_LT);
        return this;
    }

    public StorageTargetWhereInput targetPortLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_LT);
        return this;
    }

    public void setTargetPortLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_LT);
        }
    }

    public boolean getTargetPortLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT_LT);
    }

    public StorageTargetWhereInput targetPortLte(Integer targetPortLte) {

        this.targetPortLte = targetPortLte;
        return this;
    }

    /**
     * Get targetPortLte
     *
     * @return targetPortLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetPortLte() {
        return targetPortLte;
    }

    public void setTargetPortLte(Integer targetPortLte) {
        this.targetPortLte = targetPortLte;
    }

    public StorageTargetWhereInput targetPortLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_LTE);
        return this;
    }

    public StorageTargetWhereInput targetPortLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_LTE);
        return this;
    }

    public void setTargetPortLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_LTE);
        }
    }

    public boolean getTargetPortLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT_LTE);
    }

    public StorageTargetWhereInput targetPortNot(Integer targetPortNot) {

        this.targetPortNot = targetPortNot;
        return this;
    }

    /**
     * Get targetPortNot
     *
     * @return targetPortNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTargetPortNot() {
        return targetPortNot;
    }

    public void setTargetPortNot(Integer targetPortNot) {
        this.targetPortNot = targetPortNot;
    }

    public StorageTargetWhereInput targetPortNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_NOT);
        return this;
    }

    public StorageTargetWhereInput targetPortNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_NOT);
        return this;
    }

    public void setTargetPortNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_NOT);
        }
    }

    public boolean getTargetPortNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT_NOT);
    }

    public StorageTargetWhereInput targetPortNotIn(List<Integer> targetPortNotIn) {

        this.targetPortNotIn = targetPortNotIn;
        return this;
    }

    public StorageTargetWhereInput addTargetPortNotInItem(Integer targetPortNotInItem) {
        if (this.targetPortNotIn == null) {
            this.targetPortNotIn = new ArrayList<Integer>();
        }
        this.targetPortNotIn.add(targetPortNotInItem);
        return this;
    }

    /**
     * Get targetPortNotIn
     *
     * @return targetPortNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTargetPortNotIn() {
        return targetPortNotIn;
    }

    public void setTargetPortNotIn(List<Integer> targetPortNotIn) {
        this.targetPortNotIn = targetPortNotIn;
    }

    public StorageTargetWhereInput targetPortNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput targetPortNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_NOT_IN);
        return this;
    }

    public void setTargetPortNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT_NOT_IN);
        }
    }

    public boolean getTargetPortNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT_NOT_IN);
    }

    public StorageTargetWhereInput targetType(StorageTargetType targetType) {

        this.targetType = targetType;
        return this;
    }

    /**
     * Get targetType
     *
     * @return targetType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageTargetType getTargetType() {
        return targetType;
    }

    public void setTargetType(StorageTargetType targetType) {
        this.targetType = targetType;
    }

    public StorageTargetWhereInput targetType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE);
        return this;
    }

    public StorageTargetWhereInput targetType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE);
        return this;
    }

    public void setTargetType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE);
        }
    }

    public boolean getTargetType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_TYPE);
    }

    public StorageTargetWhereInput targetTypeIn(List<StorageTargetType> targetTypeIn) {

        this.targetTypeIn = targetTypeIn;
        return this;
    }

    public StorageTargetWhereInput addTargetTypeInItem(StorageTargetType targetTypeInItem) {
        if (this.targetTypeIn == null) {
            this.targetTypeIn = new ArrayList<StorageTargetType>();
        }
        this.targetTypeIn.add(targetTypeInItem);
        return this;
    }

    /**
     * Get targetTypeIn
     *
     * @return targetTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageTargetType> getTargetTypeIn() {
        return targetTypeIn;
    }

    public void setTargetTypeIn(List<StorageTargetType> targetTypeIn) {
        this.targetTypeIn = targetTypeIn;
    }

    public StorageTargetWhereInput targetTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE_IN);
        return this;
    }

    public StorageTargetWhereInput targetTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE_IN);
        return this;
    }

    public void setTargetTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE_IN);
        }
    }

    public boolean getTargetTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_TYPE_IN);
    }

    public StorageTargetWhereInput targetTypeNot(StorageTargetType targetTypeNot) {

        this.targetTypeNot = targetTypeNot;
        return this;
    }

    /**
     * Get targetTypeNot
     *
     * @return targetTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public StorageTargetType getTargetTypeNot() {
        return targetTypeNot;
    }

    public void setTargetTypeNot(StorageTargetType targetTypeNot) {
        this.targetTypeNot = targetTypeNot;
    }

    public StorageTargetWhereInput targetTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE_NOT);
        return this;
    }

    public StorageTargetWhereInput targetTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE_NOT);
        return this;
    }

    public void setTargetTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE_NOT);
        }
    }

    public boolean getTargetTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_TYPE_NOT);
    }

    public StorageTargetWhereInput targetTypeNotIn(List<StorageTargetType> targetTypeNotIn) {

        this.targetTypeNotIn = targetTypeNotIn;
        return this;
    }

    public StorageTargetWhereInput addTargetTypeNotInItem(StorageTargetType targetTypeNotInItem) {
        if (this.targetTypeNotIn == null) {
            this.targetTypeNotIn = new ArrayList<StorageTargetType>();
        }
        this.targetTypeNotIn.add(targetTypeNotInItem);
        return this;
    }

    /**
     * Get targetTypeNotIn
     *
     * @return targetTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<StorageTargetType> getTargetTypeNotIn() {
        return targetTypeNotIn;
    }

    public void setTargetTypeNotIn(List<StorageTargetType> targetTypeNotIn) {
        this.targetTypeNotIn = targetTypeNotIn;
    }

    public StorageTargetWhereInput targetTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE_NOT_IN);
        return this;
    }

    public StorageTargetWhereInput targetTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE_NOT_IN);
        return this;
    }

    public void setTargetTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_TYPE_NOT_IN);
        }
    }

    public boolean getTargetTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_TYPE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageTargetWhereInput storageTargetWhereInput = (StorageTargetWhereInput) o;
        return Objects.equals(this.AND, storageTargetWhereInput.AND)
                && Objects.equals(this.NOT, storageTargetWhereInput.NOT)
                && Objects.equals(this.OR, storageTargetWhereInput.OR)
                && Objects.equals(this.chapIsHerited, storageTargetWhereInput.chapIsHerited)
                && Objects.equals(this.chapIsHeritedNot, storageTargetWhereInput.chapIsHeritedNot)
                && Objects.equals(this.chapPassword, storageTargetWhereInput.chapPassword)
                && Objects.equals(
                        this.chapPasswordContains, storageTargetWhereInput.chapPasswordContains)
                && Objects.equals(
                        this.chapPasswordEndsWith, storageTargetWhereInput.chapPasswordEndsWith)
                && Objects.equals(this.chapPasswordGt, storageTargetWhereInput.chapPasswordGt)
                && Objects.equals(this.chapPasswordGte, storageTargetWhereInput.chapPasswordGte)
                && Objects.equals(this.chapPasswordIn, storageTargetWhereInput.chapPasswordIn)
                && Objects.equals(this.chapPasswordInput, storageTargetWhereInput.chapPasswordInput)
                && Objects.equals(
                        this.chapPasswordInputContains,
                        storageTargetWhereInput.chapPasswordInputContains)
                && Objects.equals(
                        this.chapPasswordInputEndsWith,
                        storageTargetWhereInput.chapPasswordInputEndsWith)
                && Objects.equals(
                        this.chapPasswordInputGt, storageTargetWhereInput.chapPasswordInputGt)
                && Objects.equals(
                        this.chapPasswordInputGte, storageTargetWhereInput.chapPasswordInputGte)
                && Objects.equals(
                        this.chapPasswordInputIn, storageTargetWhereInput.chapPasswordInputIn)
                && Objects.equals(
                        this.chapPasswordInputLt, storageTargetWhereInput.chapPasswordInputLt)
                && Objects.equals(
                        this.chapPasswordInputLte, storageTargetWhereInput.chapPasswordInputLte)
                && Objects.equals(
                        this.chapPasswordInputNot, storageTargetWhereInput.chapPasswordInputNot)
                && Objects.equals(
                        this.chapPasswordInputNotContains,
                        storageTargetWhereInput.chapPasswordInputNotContains)
                && Objects.equals(
                        this.chapPasswordInputNotEndsWith,
                        storageTargetWhereInput.chapPasswordInputNotEndsWith)
                && Objects.equals(
                        this.chapPasswordInputNotIn, storageTargetWhereInput.chapPasswordInputNotIn)
                && Objects.equals(
                        this.chapPasswordInputNotStartsWith,
                        storageTargetWhereInput.chapPasswordInputNotStartsWith)
                && Objects.equals(
                        this.chapPasswordInputStartsWith,
                        storageTargetWhereInput.chapPasswordInputStartsWith)
                && Objects.equals(this.chapPasswordLt, storageTargetWhereInput.chapPasswordLt)
                && Objects.equals(this.chapPasswordLte, storageTargetWhereInput.chapPasswordLte)
                && Objects.equals(this.chapPasswordNot, storageTargetWhereInput.chapPasswordNot)
                && Objects.equals(
                        this.chapPasswordNotContains,
                        storageTargetWhereInput.chapPasswordNotContains)
                && Objects.equals(
                        this.chapPasswordNotEndsWith,
                        storageTargetWhereInput.chapPasswordNotEndsWith)
                && Objects.equals(this.chapPasswordNotIn, storageTargetWhereInput.chapPasswordNotIn)
                && Objects.equals(
                        this.chapPasswordNotStartsWith,
                        storageTargetWhereInput.chapPasswordNotStartsWith)
                && Objects.equals(
                        this.chapPasswordStartsWith, storageTargetWhereInput.chapPasswordStartsWith)
                && Objects.equals(this.chapUsername, storageTargetWhereInput.chapUsername)
                && Objects.equals(
                        this.chapUsernameContains, storageTargetWhereInput.chapUsernameContains)
                && Objects.equals(
                        this.chapUsernameEndsWith, storageTargetWhereInput.chapUsernameEndsWith)
                && Objects.equals(this.chapUsernameGt, storageTargetWhereInput.chapUsernameGt)
                && Objects.equals(this.chapUsernameGte, storageTargetWhereInput.chapUsernameGte)
                && Objects.equals(this.chapUsernameIn, storageTargetWhereInput.chapUsernameIn)
                && Objects.equals(this.chapUsernameInput, storageTargetWhereInput.chapUsernameInput)
                && Objects.equals(
                        this.chapUsernameInputContains,
                        storageTargetWhereInput.chapUsernameInputContains)
                && Objects.equals(
                        this.chapUsernameInputEndsWith,
                        storageTargetWhereInput.chapUsernameInputEndsWith)
                && Objects.equals(
                        this.chapUsernameInputGt, storageTargetWhereInput.chapUsernameInputGt)
                && Objects.equals(
                        this.chapUsernameInputGte, storageTargetWhereInput.chapUsernameInputGte)
                && Objects.equals(
                        this.chapUsernameInputIn, storageTargetWhereInput.chapUsernameInputIn)
                && Objects.equals(
                        this.chapUsernameInputLt, storageTargetWhereInput.chapUsernameInputLt)
                && Objects.equals(
                        this.chapUsernameInputLte, storageTargetWhereInput.chapUsernameInputLte)
                && Objects.equals(
                        this.chapUsernameInputNot, storageTargetWhereInput.chapUsernameInputNot)
                && Objects.equals(
                        this.chapUsernameInputNotContains,
                        storageTargetWhereInput.chapUsernameInputNotContains)
                && Objects.equals(
                        this.chapUsernameInputNotEndsWith,
                        storageTargetWhereInput.chapUsernameInputNotEndsWith)
                && Objects.equals(
                        this.chapUsernameInputNotIn, storageTargetWhereInput.chapUsernameInputNotIn)
                && Objects.equals(
                        this.chapUsernameInputNotStartsWith,
                        storageTargetWhereInput.chapUsernameInputNotStartsWith)
                && Objects.equals(
                        this.chapUsernameInputStartsWith,
                        storageTargetWhereInput.chapUsernameInputStartsWith)
                && Objects.equals(this.chapUsernameLt, storageTargetWhereInput.chapUsernameLt)
                && Objects.equals(this.chapUsernameLte, storageTargetWhereInput.chapUsernameLte)
                && Objects.equals(this.chapUsernameNot, storageTargetWhereInput.chapUsernameNot)
                && Objects.equals(
                        this.chapUsernameNotContains,
                        storageTargetWhereInput.chapUsernameNotContains)
                && Objects.equals(
                        this.chapUsernameNotEndsWith,
                        storageTargetWhereInput.chapUsernameNotEndsWith)
                && Objects.equals(this.chapUsernameNotIn, storageTargetWhereInput.chapUsernameNotIn)
                && Objects.equals(
                        this.chapUsernameNotStartsWith,
                        storageTargetWhereInput.chapUsernameNotStartsWith)
                && Objects.equals(
                        this.chapUsernameStartsWith, storageTargetWhereInput.chapUsernameStartsWith)
                && Objects.equals(this.dataVersion, storageTargetWhereInput.dataVersion)
                && Objects.equals(this.dataVersionGt, storageTargetWhereInput.dataVersionGt)
                && Objects.equals(this.dataVersionGte, storageTargetWhereInput.dataVersionGte)
                && Objects.equals(this.dataVersionIn, storageTargetWhereInput.dataVersionIn)
                && Objects.equals(this.dataVersionLt, storageTargetWhereInput.dataVersionLt)
                && Objects.equals(this.dataVersionLte, storageTargetWhereInput.dataVersionLte)
                && Objects.equals(this.dataVersionNot, storageTargetWhereInput.dataVersionNot)
                && Objects.equals(this.dataVersionNotIn, storageTargetWhereInput.dataVersionNotIn)
                && Objects.equals(this.discoveredBy, storageTargetWhereInput.discoveredBy)
                && Objects.equals(
                        this.discoveredByContains, storageTargetWhereInput.discoveredByContains)
                && Objects.equals(
                        this.discoveredByEndsWith, storageTargetWhereInput.discoveredByEndsWith)
                && Objects.equals(this.discoveredByGt, storageTargetWhereInput.discoveredByGt)
                && Objects.equals(this.discoveredByGte, storageTargetWhereInput.discoveredByGte)
                && Objects.equals(this.discoveredByIn, storageTargetWhereInput.discoveredByIn)
                && Objects.equals(this.discoveredByLt, storageTargetWhereInput.discoveredByLt)
                && Objects.equals(this.discoveredByLte, storageTargetWhereInput.discoveredByLte)
                && Objects.equals(this.discoveredByNot, storageTargetWhereInput.discoveredByNot)
                && Objects.equals(
                        this.discoveredByNotContains,
                        storageTargetWhereInput.discoveredByNotContains)
                && Objects.equals(
                        this.discoveredByNotEndsWith,
                        storageTargetWhereInput.discoveredByNotEndsWith)
                && Objects.equals(this.discoveredByNotIn, storageTargetWhereInput.discoveredByNotIn)
                && Objects.equals(
                        this.discoveredByNotStartsWith,
                        storageTargetWhereInput.discoveredByNotStartsWith)
                && Objects.equals(
                        this.discoveredByStartsWith, storageTargetWhereInput.discoveredByStartsWith)
                && Objects.equals(this.entityAsyncStatus, storageTargetWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, storageTargetWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, storageTargetWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, storageTargetWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, storageTargetWhereInput.id)
                && Objects.equals(this.idContains, storageTargetWhereInput.idContains)
                && Objects.equals(this.idEndsWith, storageTargetWhereInput.idEndsWith)
                && Objects.equals(this.idGt, storageTargetWhereInput.idGt)
                && Objects.equals(this.idGte, storageTargetWhereInput.idGte)
                && Objects.equals(this.idIn, storageTargetWhereInput.idIn)
                && Objects.equals(this.idLt, storageTargetWhereInput.idLt)
                && Objects.equals(this.idLte, storageTargetWhereInput.idLte)
                && Objects.equals(this.idNot, storageTargetWhereInput.idNot)
                && Objects.equals(this.idNotContains, storageTargetWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, storageTargetWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, storageTargetWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, storageTargetWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, storageTargetWhereInput.idStartsWith)
                && Objects.equals(
                        this.identityVerificationMethod,
                        storageTargetWhereInput.identityVerificationMethod)
                && Objects.equals(
                        this.identityVerificationMethodIn,
                        storageTargetWhereInput.identityVerificationMethodIn)
                && Objects.equals(
                        this.identityVerificationMethodNot,
                        storageTargetWhereInput.identityVerificationMethodNot)
                && Objects.equals(
                        this.identityVerificationMethodNotIn,
                        storageTargetWhereInput.identityVerificationMethodNotIn)
                && Objects.equals(this.localHash, storageTargetWhereInput.localHash)
                && Objects.equals(this.localHashContains, storageTargetWhereInput.localHashContains)
                && Objects.equals(this.localHashEndsWith, storageTargetWhereInput.localHashEndsWith)
                && Objects.equals(this.localHashGt, storageTargetWhereInput.localHashGt)
                && Objects.equals(this.localHashGte, storageTargetWhereInput.localHashGte)
                && Objects.equals(this.localHashIn, storageTargetWhereInput.localHashIn)
                && Objects.equals(this.localHashLt, storageTargetWhereInput.localHashLt)
                && Objects.equals(this.localHashLte, storageTargetWhereInput.localHashLte)
                && Objects.equals(this.localHashNot, storageTargetWhereInput.localHashNot)
                && Objects.equals(
                        this.localHashNotContains, storageTargetWhereInput.localHashNotContains)
                && Objects.equals(
                        this.localHashNotEndsWith, storageTargetWhereInput.localHashNotEndsWith)
                && Objects.equals(this.localHashNotIn, storageTargetWhereInput.localHashNotIn)
                && Objects.equals(
                        this.localHashNotStartsWith, storageTargetWhereInput.localHashNotStartsWith)
                && Objects.equals(
                        this.localHashStartsWith, storageTargetWhereInput.localHashStartsWith)
                && Objects.equals(this.localId, storageTargetWhereInput.localId)
                && Objects.equals(this.localIdContains, storageTargetWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, storageTargetWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, storageTargetWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, storageTargetWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, storageTargetWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, storageTargetWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, storageTargetWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, storageTargetWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, storageTargetWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, storageTargetWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, storageTargetWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, storageTargetWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, storageTargetWhereInput.localIdStartsWith)
                && Objects.equals(this.storageAdapter, storageTargetWhereInput.storageAdapter)
                && Objects.equals(this.targetIp, storageTargetWhereInput.targetIp)
                && Objects.equals(this.targetIpContains, storageTargetWhereInput.targetIpContains)
                && Objects.equals(this.targetIpEndsWith, storageTargetWhereInput.targetIpEndsWith)
                && Objects.equals(this.targetIpGt, storageTargetWhereInput.targetIpGt)
                && Objects.equals(this.targetIpGte, storageTargetWhereInput.targetIpGte)
                && Objects.equals(this.targetIpIn, storageTargetWhereInput.targetIpIn)
                && Objects.equals(this.targetIpLt, storageTargetWhereInput.targetIpLt)
                && Objects.equals(this.targetIpLte, storageTargetWhereInput.targetIpLte)
                && Objects.equals(this.targetIpNot, storageTargetWhereInput.targetIpNot)
                && Objects.equals(
                        this.targetIpNotContains, storageTargetWhereInput.targetIpNotContains)
                && Objects.equals(
                        this.targetIpNotEndsWith, storageTargetWhereInput.targetIpNotEndsWith)
                && Objects.equals(this.targetIpNotIn, storageTargetWhereInput.targetIpNotIn)
                && Objects.equals(
                        this.targetIpNotStartsWith, storageTargetWhereInput.targetIpNotStartsWith)
                && Objects.equals(
                        this.targetIpStartsWith, storageTargetWhereInput.targetIpStartsWith)
                && Objects.equals(this.targetIqn, storageTargetWhereInput.targetIqn)
                && Objects.equals(this.targetIqnContains, storageTargetWhereInput.targetIqnContains)
                && Objects.equals(this.targetIqnEndsWith, storageTargetWhereInput.targetIqnEndsWith)
                && Objects.equals(this.targetIqnGt, storageTargetWhereInput.targetIqnGt)
                && Objects.equals(this.targetIqnGte, storageTargetWhereInput.targetIqnGte)
                && Objects.equals(this.targetIqnIn, storageTargetWhereInput.targetIqnIn)
                && Objects.equals(this.targetIqnLt, storageTargetWhereInput.targetIqnLt)
                && Objects.equals(this.targetIqnLte, storageTargetWhereInput.targetIqnLte)
                && Objects.equals(this.targetIqnNot, storageTargetWhereInput.targetIqnNot)
                && Objects.equals(
                        this.targetIqnNotContains, storageTargetWhereInput.targetIqnNotContains)
                && Objects.equals(
                        this.targetIqnNotEndsWith, storageTargetWhereInput.targetIqnNotEndsWith)
                && Objects.equals(this.targetIqnNotIn, storageTargetWhereInput.targetIqnNotIn)
                && Objects.equals(
                        this.targetIqnNotStartsWith, storageTargetWhereInput.targetIqnNotStartsWith)
                && Objects.equals(
                        this.targetIqnStartsWith, storageTargetWhereInput.targetIqnStartsWith)
                && Objects.equals(this.targetPort, storageTargetWhereInput.targetPort)
                && Objects.equals(this.targetPortGt, storageTargetWhereInput.targetPortGt)
                && Objects.equals(this.targetPortGte, storageTargetWhereInput.targetPortGte)
                && Objects.equals(this.targetPortIn, storageTargetWhereInput.targetPortIn)
                && Objects.equals(this.targetPortLt, storageTargetWhereInput.targetPortLt)
                && Objects.equals(this.targetPortLte, storageTargetWhereInput.targetPortLte)
                && Objects.equals(this.targetPortNot, storageTargetWhereInput.targetPortNot)
                && Objects.equals(this.targetPortNotIn, storageTargetWhereInput.targetPortNotIn)
                && Objects.equals(this.targetType, storageTargetWhereInput.targetType)
                && Objects.equals(this.targetTypeIn, storageTargetWhereInput.targetTypeIn)
                && Objects.equals(this.targetTypeNot, storageTargetWhereInput.targetTypeNot)
                && Objects.equals(this.targetTypeNotIn, storageTargetWhereInput.targetTypeNotIn);
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
                chapIsHerited,
                chapIsHeritedNot,
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
                discoveredBy,
                discoveredByContains,
                discoveredByEndsWith,
                discoveredByGt,
                discoveredByGte,
                discoveredByIn,
                discoveredByLt,
                discoveredByLte,
                discoveredByNot,
                discoveredByNotContains,
                discoveredByNotEndsWith,
                discoveredByNotIn,
                discoveredByNotStartsWith,
                discoveredByStartsWith,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
                identityVerificationMethod,
                identityVerificationMethodIn,
                identityVerificationMethodNot,
                identityVerificationMethodNotIn,
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
                storageAdapter,
                targetIp,
                targetIpContains,
                targetIpEndsWith,
                targetIpGt,
                targetIpGte,
                targetIpIn,
                targetIpLt,
                targetIpLte,
                targetIpNot,
                targetIpNotContains,
                targetIpNotEndsWith,
                targetIpNotIn,
                targetIpNotStartsWith,
                targetIpStartsWith,
                targetIqn,
                targetIqnContains,
                targetIqnEndsWith,
                targetIqnGt,
                targetIqnGte,
                targetIqnIn,
                targetIqnLt,
                targetIqnLte,
                targetIqnNot,
                targetIqnNotContains,
                targetIqnNotEndsWith,
                targetIqnNotIn,
                targetIqnNotStartsWith,
                targetIqnStartsWith,
                targetPort,
                targetPortGt,
                targetPortGte,
                targetPortIn,
                targetPortLt,
                targetPortLte,
                targetPortNot,
                targetPortNotIn,
                targetType,
                targetTypeIn,
                targetTypeNot,
                targetTypeNotIn);
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
        sb.append("class StorageTargetWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    chapIsHerited: ").append(toIndentedString(chapIsHerited)).append("\n");
        sb.append("    chapIsHeritedNot: ").append(toIndentedString(chapIsHeritedNot)).append("\n");
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
        sb.append("    discoveredBy: ").append(toIndentedString(discoveredBy)).append("\n");
        sb.append("    discoveredByContains: ")
                .append(toIndentedString(discoveredByContains))
                .append("\n");
        sb.append("    discoveredByEndsWith: ")
                .append(toIndentedString(discoveredByEndsWith))
                .append("\n");
        sb.append("    discoveredByGt: ").append(toIndentedString(discoveredByGt)).append("\n");
        sb.append("    discoveredByGte: ").append(toIndentedString(discoveredByGte)).append("\n");
        sb.append("    discoveredByIn: ").append(toIndentedString(discoveredByIn)).append("\n");
        sb.append("    discoveredByLt: ").append(toIndentedString(discoveredByLt)).append("\n");
        sb.append("    discoveredByLte: ").append(toIndentedString(discoveredByLte)).append("\n");
        sb.append("    discoveredByNot: ").append(toIndentedString(discoveredByNot)).append("\n");
        sb.append("    discoveredByNotContains: ")
                .append(toIndentedString(discoveredByNotContains))
                .append("\n");
        sb.append("    discoveredByNotEndsWith: ")
                .append(toIndentedString(discoveredByNotEndsWith))
                .append("\n");
        sb.append("    discoveredByNotIn: ")
                .append(toIndentedString(discoveredByNotIn))
                .append("\n");
        sb.append("    discoveredByNotStartsWith: ")
                .append(toIndentedString(discoveredByNotStartsWith))
                .append("\n");
        sb.append("    discoveredByStartsWith: ")
                .append(toIndentedString(discoveredByStartsWith))
                .append("\n");
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
        sb.append("    storageAdapter: ").append(toIndentedString(storageAdapter)).append("\n");
        sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
        sb.append("    targetIpContains: ").append(toIndentedString(targetIpContains)).append("\n");
        sb.append("    targetIpEndsWith: ").append(toIndentedString(targetIpEndsWith)).append("\n");
        sb.append("    targetIpGt: ").append(toIndentedString(targetIpGt)).append("\n");
        sb.append("    targetIpGte: ").append(toIndentedString(targetIpGte)).append("\n");
        sb.append("    targetIpIn: ").append(toIndentedString(targetIpIn)).append("\n");
        sb.append("    targetIpLt: ").append(toIndentedString(targetIpLt)).append("\n");
        sb.append("    targetIpLte: ").append(toIndentedString(targetIpLte)).append("\n");
        sb.append("    targetIpNot: ").append(toIndentedString(targetIpNot)).append("\n");
        sb.append("    targetIpNotContains: ")
                .append(toIndentedString(targetIpNotContains))
                .append("\n");
        sb.append("    targetIpNotEndsWith: ")
                .append(toIndentedString(targetIpNotEndsWith))
                .append("\n");
        sb.append("    targetIpNotIn: ").append(toIndentedString(targetIpNotIn)).append("\n");
        sb.append("    targetIpNotStartsWith: ")
                .append(toIndentedString(targetIpNotStartsWith))
                .append("\n");
        sb.append("    targetIpStartsWith: ")
                .append(toIndentedString(targetIpStartsWith))
                .append("\n");
        sb.append("    targetIqn: ").append(toIndentedString(targetIqn)).append("\n");
        sb.append("    targetIqnContains: ")
                .append(toIndentedString(targetIqnContains))
                .append("\n");
        sb.append("    targetIqnEndsWith: ")
                .append(toIndentedString(targetIqnEndsWith))
                .append("\n");
        sb.append("    targetIqnGt: ").append(toIndentedString(targetIqnGt)).append("\n");
        sb.append("    targetIqnGte: ").append(toIndentedString(targetIqnGte)).append("\n");
        sb.append("    targetIqnIn: ").append(toIndentedString(targetIqnIn)).append("\n");
        sb.append("    targetIqnLt: ").append(toIndentedString(targetIqnLt)).append("\n");
        sb.append("    targetIqnLte: ").append(toIndentedString(targetIqnLte)).append("\n");
        sb.append("    targetIqnNot: ").append(toIndentedString(targetIqnNot)).append("\n");
        sb.append("    targetIqnNotContains: ")
                .append(toIndentedString(targetIqnNotContains))
                .append("\n");
        sb.append("    targetIqnNotEndsWith: ")
                .append(toIndentedString(targetIqnNotEndsWith))
                .append("\n");
        sb.append("    targetIqnNotIn: ").append(toIndentedString(targetIqnNotIn)).append("\n");
        sb.append("    targetIqnNotStartsWith: ")
                .append(toIndentedString(targetIqnNotStartsWith))
                .append("\n");
        sb.append("    targetIqnStartsWith: ")
                .append(toIndentedString(targetIqnStartsWith))
                .append("\n");
        sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
        sb.append("    targetPortGt: ").append(toIndentedString(targetPortGt)).append("\n");
        sb.append("    targetPortGte: ").append(toIndentedString(targetPortGte)).append("\n");
        sb.append("    targetPortIn: ").append(toIndentedString(targetPortIn)).append("\n");
        sb.append("    targetPortLt: ").append(toIndentedString(targetPortLt)).append("\n");
        sb.append("    targetPortLte: ").append(toIndentedString(targetPortLte)).append("\n");
        sb.append("    targetPortNot: ").append(toIndentedString(targetPortNot)).append("\n");
        sb.append("    targetPortNotIn: ").append(toIndentedString(targetPortNotIn)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetTypeIn: ").append(toIndentedString(targetTypeIn)).append("\n");
        sb.append("    targetTypeNot: ").append(toIndentedString(targetTypeNot)).append("\n");
        sb.append("    targetTypeNotIn: ").append(toIndentedString(targetTypeNotIn)).append("\n");
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
