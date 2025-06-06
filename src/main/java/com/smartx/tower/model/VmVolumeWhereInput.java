package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmVolumeWhereInput */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmVolumeWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmVolumeWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmVolumeWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmVolumeWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
    private String descriptionContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
    private String descriptionEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
    private String descriptionGt;

    public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
    private String descriptionGte;

    public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
    private List<String> descriptionIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
    private String descriptionLt;

    public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
    private String descriptionLte;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
    private String descriptionNot;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfStoragePolicy;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_IN = "elf_storage_policy_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN)
    private List<VmVolumeElfStoragePolicyType> elfStoragePolicyIn = null;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT = "elf_storage_policy_not";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT)
    private VmVolumeElfStoragePolicyType elfStoragePolicyNot;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN =
            "elf_storage_policy_not_in";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN)
    private List<VmVolumeElfStoragePolicyType> elfStoragePolicyNotIn = null;

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

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE = "guest_size_usage";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE)
    private Double guestSizeUsage;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_GT = "guest_size_usage_gt";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_GT)
    private Double guestSizeUsageGt;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE = "guest_size_usage_gte";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE)
    private Double guestSizeUsageGte;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_IN = "guest_size_usage_in";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_IN)
    private List<Double> guestSizeUsageIn = null;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_LT = "guest_size_usage_lt";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_LT)
    private Double guestSizeUsageLt;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE = "guest_size_usage_lte";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE)
    private Double guestSizeUsageLte;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT = "guest_size_usage_not";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT)
    private Double guestSizeUsageNot;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN = "guest_size_usage_not_in";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN)
    private List<Double> guestSizeUsageNotIn = null;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE = "guest_used_size";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE)
    private Long guestUsedSize;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE_GT = "guest_used_size_gt";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_GT)
    private Long guestUsedSizeGt;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE_GTE = "guest_used_size_gte";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_GTE)
    private Long guestUsedSizeGte;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE_IN = "guest_used_size_in";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_IN)
    private List<Long> guestUsedSizeIn = null;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE_LT = "guest_used_size_lt";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_LT)
    private Long guestUsedSizeLt;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE_LTE = "guest_used_size_lte";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_LTE)
    private Long guestUsedSizeLte;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE_NOT = "guest_used_size_not";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_NOT)
    private Long guestUsedSizeNot;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN = "guest_used_size_not_in";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN)
    private List<Long> guestUsedSizeNotIn = null;

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

    public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";

    @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
    private LabelWhereInput labelsEvery;

    public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";

    @SerializedName(SERIALIZED_NAME_LABELS_NONE)
    private LabelWhereInput labelsNone;

    public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";

    @SerializedName(SERIALIZED_NAME_LABELS_SOME)
    private LabelWhereInput labelsSome;

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

    public static final String SERIALIZED_NAME_LUN = "lun";

    @SerializedName(SERIALIZED_NAME_LUN)
    private IscsiLunWhereInput lun;

    public static final String SERIALIZED_NAME_MOUNTING = "mounting";

    @SerializedName(SERIALIZED_NAME_MOUNTING)
    private Boolean mounting;

    public static final String SERIALIZED_NAME_MOUNTING_NOT = "mounting_not";

    @SerializedName(SERIALIZED_NAME_MOUNTING_NOT)
    private Boolean mountingNot;

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

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_PATH_CONTAINS = "path_contains";

    @SerializedName(SERIALIZED_NAME_PATH_CONTAINS)
    private String pathContains;

    public static final String SERIALIZED_NAME_PATH_ENDS_WITH = "path_ends_with";

    @SerializedName(SERIALIZED_NAME_PATH_ENDS_WITH)
    private String pathEndsWith;

    public static final String SERIALIZED_NAME_PATH_GT = "path_gt";

    @SerializedName(SERIALIZED_NAME_PATH_GT)
    private String pathGt;

    public static final String SERIALIZED_NAME_PATH_GTE = "path_gte";

    @SerializedName(SERIALIZED_NAME_PATH_GTE)
    private String pathGte;

    public static final String SERIALIZED_NAME_PATH_IN = "path_in";

    @SerializedName(SERIALIZED_NAME_PATH_IN)
    private List<String> pathIn = null;

    public static final String SERIALIZED_NAME_PATH_LT = "path_lt";

    @SerializedName(SERIALIZED_NAME_PATH_LT)
    private String pathLt;

    public static final String SERIALIZED_NAME_PATH_LTE = "path_lte";

    @SerializedName(SERIALIZED_NAME_PATH_LTE)
    private String pathLte;

    public static final String SERIALIZED_NAME_PATH_NOT = "path_not";

    @SerializedName(SERIALIZED_NAME_PATH_NOT)
    private String pathNot;

    public static final String SERIALIZED_NAME_PATH_NOT_CONTAINS = "path_not_contains";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_CONTAINS)
    private String pathNotContains;

    public static final String SERIALIZED_NAME_PATH_NOT_ENDS_WITH = "path_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_ENDS_WITH)
    private String pathNotEndsWith;

    public static final String SERIALIZED_NAME_PATH_NOT_IN = "path_not_in";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_IN)
    private List<String> pathNotIn = null;

    public static final String SERIALIZED_NAME_PATH_NOT_STARTS_WITH = "path_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_STARTS_WITH)
    private String pathNotStartsWith;

    public static final String SERIALIZED_NAME_PATH_STARTS_WITH = "path_starts_with";

    @SerializedName(SERIALIZED_NAME_PATH_STARTS_WITH)
    private String pathStartsWith;

    public static final String SERIALIZED_NAME_SHARING = "sharing";

    @SerializedName(SERIALIZED_NAME_SHARING)
    private Boolean sharing;

    public static final String SERIALIZED_NAME_SHARING_NOT = "sharing_not";

    @SerializedName(SERIALIZED_NAME_SHARING_NOT)
    private Boolean sharingNot;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";

    @SerializedName(SERIALIZED_NAME_SIZE_GT)
    private Long sizeGt;

    public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";

    @SerializedName(SERIALIZED_NAME_SIZE_GTE)
    private Long sizeGte;

    public static final String SERIALIZED_NAME_SIZE_IN = "size_in";

    @SerializedName(SERIALIZED_NAME_SIZE_IN)
    private List<Long> sizeIn = null;

    public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";

    @SerializedName(SERIALIZED_NAME_SIZE_LT)
    private Long sizeLt;

    public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";

    @SerializedName(SERIALIZED_NAME_SIZE_LTE)
    private Long sizeLte;

    public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT)
    private Long sizeNot;

    public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
    private List<Long> sizeNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmVolumeType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<VmVolumeType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private VmVolumeType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<VmVolumeType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
    private Double uniqueLogicalSize;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT = "unique_logical_size_gt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT)
    private Double uniqueLogicalSizeGt;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE = "unique_logical_size_gte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE)
    private Double uniqueLogicalSizeGte;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN = "unique_logical_size_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN)
    private List<Double> uniqueLogicalSizeIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT = "unique_logical_size_lt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT)
    private Double uniqueLogicalSizeLt;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE = "unique_logical_size_lte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE)
    private Double uniqueLogicalSizeLte;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT = "unique_logical_size_not";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT)
    private Double uniqueLogicalSizeNot;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN =
            "unique_logical_size_not_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN)
    private List<Double> uniqueLogicalSizeNotIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GT = "unique_size_gt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GT)
    private Long uniqueSizeGt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_GTE = "unique_size_gte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_GTE)
    private Long uniqueSizeGte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_IN = "unique_size_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_IN)
    private List<Long> uniqueSizeIn = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LT = "unique_size_lt";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LT)
    private Long uniqueSizeLt;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_LTE = "unique_size_lte";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_LTE)
    private Long uniqueSizeLte;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT = "unique_size_not";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT)
    private Long uniqueSizeNot;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN = "unique_size_not_in";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN)
    private List<Long> uniqueSizeNotIn = null;

    public static final String SERIALIZED_NAME_VM_DISKS_EVERY = "vm_disks_every";

    @SerializedName(SERIALIZED_NAME_VM_DISKS_EVERY)
    private VmDiskWhereInput vmDisksEvery;

    public static final String SERIALIZED_NAME_VM_DISKS_NONE = "vm_disks_none";

    @SerializedName(SERIALIZED_NAME_VM_DISKS_NONE)
    private VmDiskWhereInput vmDisksNone;

    public static final String SERIALIZED_NAME_VM_DISKS_SOME = "vm_disks_some";

    @SerializedName(SERIALIZED_NAME_VM_DISKS_SOME)
    private VmDiskWhereInput vmDisksSome;

    public VmVolumeWhereInput() {}

    public VmVolumeWhereInput AND(List<VmVolumeWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmVolumeWhereInput addANDItem(VmVolumeWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmVolumeWhereInput>();
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
    public List<VmVolumeWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmVolumeWhereInput> AND) {
        this.AND = AND;
    }

    public VmVolumeWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmVolumeWhereInput AND_ExplictlyNonNull() {
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

    public VmVolumeWhereInput NOT(List<VmVolumeWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmVolumeWhereInput addNOTItem(VmVolumeWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmVolumeWhereInput>();
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
    public List<VmVolumeWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmVolumeWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmVolumeWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmVolumeWhereInput NOT_ExplictlyNonNull() {
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

    public VmVolumeWhereInput OR(List<VmVolumeWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmVolumeWhereInput addORItem(VmVolumeWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmVolumeWhereInput>();
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
    public List<VmVolumeWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmVolumeWhereInput> OR) {
        this.OR = OR;
    }

    public VmVolumeWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmVolumeWhereInput OR_ExplictlyNonNull() {
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

    public VmVolumeWhereInput cluster(ClusterWhereInput cluster) {

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
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public VmVolumeWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmVolumeWhereInput cluster_ExplictlyNonNull() {
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

    public VmVolumeWhereInput description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VmVolumeWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmVolumeWhereInput description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public VmVolumeWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public VmVolumeWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public VmVolumeWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public VmVolumeWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public VmVolumeWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public VmVolumeWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VmVolumeWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public VmVolumeWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public VmVolumeWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VmVolumeWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public VmVolumeWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VmVolumeWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public VmVolumeWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VmVolumeWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public VmVolumeWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public VmVolumeWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VmVolumeWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public VmVolumeWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public VmVolumeWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VmVolumeWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public VmVolumeWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public VmVolumeWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VmVolumeWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public VmVolumeWhereInput descriptionNotContains(String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public VmVolumeWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public VmVolumeWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public VmVolumeWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public VmVolumeWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VmVolumeWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public VmVolumeWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public VmVolumeWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public VmVolumeWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public VmVolumeWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public VmVolumeWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public VmVolumeWhereInput elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {

        this.elfStoragePolicy = elfStoragePolicy;
        return this;
    }

    /**
     * Get elfStoragePolicy
     *
     * @return elfStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
        return elfStoragePolicy;
    }

    public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
        this.elfStoragePolicy = elfStoragePolicy;
    }

    public VmVolumeWhereInput elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public VmVolumeWhereInput elfStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public void setElfStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        }
    }

    public boolean getElfStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY);
    }

    public VmVolumeWhereInput elfStoragePolicyIn(
            List<VmVolumeElfStoragePolicyType> elfStoragePolicyIn) {

        this.elfStoragePolicyIn = elfStoragePolicyIn;
        return this;
    }

    public VmVolumeWhereInput addElfStoragePolicyInItem(
            VmVolumeElfStoragePolicyType elfStoragePolicyInItem) {
        if (this.elfStoragePolicyIn == null) {
            this.elfStoragePolicyIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.elfStoragePolicyIn.add(elfStoragePolicyInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyIn
     *
     * @return elfStoragePolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getElfStoragePolicyIn() {
        return elfStoragePolicyIn;
    }

    public void setElfStoragePolicyIn(List<VmVolumeElfStoragePolicyType> elfStoragePolicyIn) {
        this.elfStoragePolicyIn = elfStoragePolicyIn;
    }

    public VmVolumeWhereInput elfStoragePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        return this;
    }

    public VmVolumeWhereInput elfStoragePolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        return this;
    }

    public void setElfStoragePolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
        }
    }

    public boolean getElfStoragePolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_IN);
    }

    public VmVolumeWhereInput elfStoragePolicyNot(
            VmVolumeElfStoragePolicyType elfStoragePolicyNot) {

        this.elfStoragePolicyNot = elfStoragePolicyNot;
        return this;
    }

    /**
     * Get elfStoragePolicyNot
     *
     * @return elfStoragePolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicyNot() {
        return elfStoragePolicyNot;
    }

    public void setElfStoragePolicyNot(VmVolumeElfStoragePolicyType elfStoragePolicyNot) {
        this.elfStoragePolicyNot = elfStoragePolicyNot;
    }

    public VmVolumeWhereInput elfStoragePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        return this;
    }

    public VmVolumeWhereInput elfStoragePolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        return this;
    }

    public void setElfStoragePolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
        }
    }

    public boolean getElfStoragePolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT);
    }

    public VmVolumeWhereInput elfStoragePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> elfStoragePolicyNotIn) {

        this.elfStoragePolicyNotIn = elfStoragePolicyNotIn;
        return this;
    }

    public VmVolumeWhereInput addElfStoragePolicyNotInItem(
            VmVolumeElfStoragePolicyType elfStoragePolicyNotInItem) {
        if (this.elfStoragePolicyNotIn == null) {
            this.elfStoragePolicyNotIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.elfStoragePolicyNotIn.add(elfStoragePolicyNotInItem);
        return this;
    }

    /**
     * Get elfStoragePolicyNotIn
     *
     * @return elfStoragePolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getElfStoragePolicyNotIn() {
        return elfStoragePolicyNotIn;
    }

    public void setElfStoragePolicyNotIn(List<VmVolumeElfStoragePolicyType> elfStoragePolicyNotIn) {
        this.elfStoragePolicyNotIn = elfStoragePolicyNotIn;
    }

    public VmVolumeWhereInput elfStoragePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput elfStoragePolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public void setElfStoragePolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
        }
    }

    public boolean getElfStoragePolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY_NOT_IN);
    }

    public VmVolumeWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmVolumeWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmVolumeWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VmVolumeWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VmVolumeWhereInput addEntityAsyncStatusInItem(
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

    public VmVolumeWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VmVolumeWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VmVolumeWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VmVolumeWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VmVolumeWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VmVolumeWhereInput addEntityAsyncStatusNotInItem(
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

    public VmVolumeWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput guestSizeUsage(Double guestSizeUsage) {

        this.guestSizeUsage = guestSizeUsage;
        return this;
    }

    /**
     * Get guestSizeUsage
     *
     * @return guestSizeUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsage() {
        return guestSizeUsage;
    }

    public void setGuestSizeUsage(Double guestSizeUsage) {
        this.guestSizeUsage = guestSizeUsage;
    }

    public VmVolumeWhereInput guestSizeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        return this;
    }

    public void setGuestSizeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        }
    }

    public boolean getGuestSizeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE);
    }

    public VmVolumeWhereInput guestSizeUsageGt(Double guestSizeUsageGt) {

        this.guestSizeUsageGt = guestSizeUsageGt;
        return this;
    }

    /**
     * Get guestSizeUsageGt
     *
     * @return guestSizeUsageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsageGt() {
        return guestSizeUsageGt;
    }

    public void setGuestSizeUsageGt(Double guestSizeUsageGt) {
        this.guestSizeUsageGt = guestSizeUsageGt;
    }

    public VmVolumeWhereInput guestSizeUsageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_GT);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_GT);
        return this;
    }

    public void setGuestSizeUsageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_GT);
        }
    }

    public boolean getGuestSizeUsageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE_GT);
    }

    public VmVolumeWhereInput guestSizeUsageGte(Double guestSizeUsageGte) {

        this.guestSizeUsageGte = guestSizeUsageGte;
        return this;
    }

    /**
     * Get guestSizeUsageGte
     *
     * @return guestSizeUsageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsageGte() {
        return guestSizeUsageGte;
    }

    public void setGuestSizeUsageGte(Double guestSizeUsageGte) {
        this.guestSizeUsageGte = guestSizeUsageGte;
    }

    public VmVolumeWhereInput guestSizeUsageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE);
        return this;
    }

    public void setGuestSizeUsageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE);
        }
    }

    public boolean getGuestSizeUsageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE_GTE);
    }

    public VmVolumeWhereInput guestSizeUsageIn(List<Double> guestSizeUsageIn) {

        this.guestSizeUsageIn = guestSizeUsageIn;
        return this;
    }

    public VmVolumeWhereInput addGuestSizeUsageInItem(Double guestSizeUsageInItem) {
        if (this.guestSizeUsageIn == null) {
            this.guestSizeUsageIn = new ArrayList<Double>();
        }
        this.guestSizeUsageIn.add(guestSizeUsageInItem);
        return this;
    }

    /**
     * Get guestSizeUsageIn
     *
     * @return guestSizeUsageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getGuestSizeUsageIn() {
        return guestSizeUsageIn;
    }

    public void setGuestSizeUsageIn(List<Double> guestSizeUsageIn) {
        this.guestSizeUsageIn = guestSizeUsageIn;
    }

    public VmVolumeWhereInput guestSizeUsageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_IN);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_IN);
        return this;
    }

    public void setGuestSizeUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_IN);
        }
    }

    public boolean getGuestSizeUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE_IN);
    }

    public VmVolumeWhereInput guestSizeUsageLt(Double guestSizeUsageLt) {

        this.guestSizeUsageLt = guestSizeUsageLt;
        return this;
    }

    /**
     * Get guestSizeUsageLt
     *
     * @return guestSizeUsageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsageLt() {
        return guestSizeUsageLt;
    }

    public void setGuestSizeUsageLt(Double guestSizeUsageLt) {
        this.guestSizeUsageLt = guestSizeUsageLt;
    }

    public VmVolumeWhereInput guestSizeUsageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_LT);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_LT);
        return this;
    }

    public void setGuestSizeUsageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_LT);
        }
    }

    public boolean getGuestSizeUsageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE_LT);
    }

    public VmVolumeWhereInput guestSizeUsageLte(Double guestSizeUsageLte) {

        this.guestSizeUsageLte = guestSizeUsageLte;
        return this;
    }

    /**
     * Get guestSizeUsageLte
     *
     * @return guestSizeUsageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsageLte() {
        return guestSizeUsageLte;
    }

    public void setGuestSizeUsageLte(Double guestSizeUsageLte) {
        this.guestSizeUsageLte = guestSizeUsageLte;
    }

    public VmVolumeWhereInput guestSizeUsageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE);
        return this;
    }

    public void setGuestSizeUsageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE);
        }
    }

    public boolean getGuestSizeUsageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE_LTE);
    }

    public VmVolumeWhereInput guestSizeUsageNot(Double guestSizeUsageNot) {

        this.guestSizeUsageNot = guestSizeUsageNot;
        return this;
    }

    /**
     * Get guestSizeUsageNot
     *
     * @return guestSizeUsageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsageNot() {
        return guestSizeUsageNot;
    }

    public void setGuestSizeUsageNot(Double guestSizeUsageNot) {
        this.guestSizeUsageNot = guestSizeUsageNot;
    }

    public VmVolumeWhereInput guestSizeUsageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT);
        return this;
    }

    public void setGuestSizeUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT);
        }
    }

    public boolean getGuestSizeUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT);
    }

    public VmVolumeWhereInput guestSizeUsageNotIn(List<Double> guestSizeUsageNotIn) {

        this.guestSizeUsageNotIn = guestSizeUsageNotIn;
        return this;
    }

    public VmVolumeWhereInput addGuestSizeUsageNotInItem(Double guestSizeUsageNotInItem) {
        if (this.guestSizeUsageNotIn == null) {
            this.guestSizeUsageNotIn = new ArrayList<Double>();
        }
        this.guestSizeUsageNotIn.add(guestSizeUsageNotInItem);
        return this;
    }

    /**
     * Get guestSizeUsageNotIn
     *
     * @return guestSizeUsageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getGuestSizeUsageNotIn() {
        return guestSizeUsageNotIn;
    }

    public void setGuestSizeUsageNotIn(List<Double> guestSizeUsageNotIn) {
        this.guestSizeUsageNotIn = guestSizeUsageNotIn;
    }

    public VmVolumeWhereInput guestSizeUsageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput guestSizeUsageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN);
        return this;
    }

    public void setGuestSizeUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN);
        }
    }

    public boolean getGuestSizeUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE_NOT_IN);
    }

    public VmVolumeWhereInput guestUsedSize(Long guestUsedSize) {

        this.guestUsedSize = guestUsedSize;
        return this;
    }

    /**
     * Get guestUsedSize
     *
     * @return guestUsedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSize() {
        return guestUsedSize;
    }

    public void setGuestUsedSize(Long guestUsedSize) {
        this.guestUsedSize = guestUsedSize;
    }

    public VmVolumeWhereInput guestUsedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE);
        return this;
    }

    public VmVolumeWhereInput guestUsedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE);
        return this;
    }

    public void setGuestUsedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE);
        }
    }

    public boolean getGuestUsedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE);
    }

    public VmVolumeWhereInput guestUsedSizeGt(Long guestUsedSizeGt) {

        this.guestUsedSizeGt = guestUsedSizeGt;
        return this;
    }

    /**
     * Get guestUsedSizeGt
     *
     * @return guestUsedSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSizeGt() {
        return guestUsedSizeGt;
    }

    public void setGuestUsedSizeGt(Long guestUsedSizeGt) {
        this.guestUsedSizeGt = guestUsedSizeGt;
    }

    public VmVolumeWhereInput guestUsedSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_GT);
        return this;
    }

    public VmVolumeWhereInput guestUsedSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_GT);
        return this;
    }

    public void setGuestUsedSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_GT);
        }
    }

    public boolean getGuestUsedSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE_GT);
    }

    public VmVolumeWhereInput guestUsedSizeGte(Long guestUsedSizeGte) {

        this.guestUsedSizeGte = guestUsedSizeGte;
        return this;
    }

    /**
     * Get guestUsedSizeGte
     *
     * @return guestUsedSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSizeGte() {
        return guestUsedSizeGte;
    }

    public void setGuestUsedSizeGte(Long guestUsedSizeGte) {
        this.guestUsedSizeGte = guestUsedSizeGte;
    }

    public VmVolumeWhereInput guestUsedSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_GTE);
        return this;
    }

    public VmVolumeWhereInput guestUsedSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_GTE);
        return this;
    }

    public void setGuestUsedSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_GTE);
        }
    }

    public boolean getGuestUsedSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE_GTE);
    }

    public VmVolumeWhereInput guestUsedSizeIn(List<Long> guestUsedSizeIn) {

        this.guestUsedSizeIn = guestUsedSizeIn;
        return this;
    }

    public VmVolumeWhereInput addGuestUsedSizeInItem(Long guestUsedSizeInItem) {
        if (this.guestUsedSizeIn == null) {
            this.guestUsedSizeIn = new ArrayList<Long>();
        }
        this.guestUsedSizeIn.add(guestUsedSizeInItem);
        return this;
    }

    /**
     * Get guestUsedSizeIn
     *
     * @return guestUsedSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getGuestUsedSizeIn() {
        return guestUsedSizeIn;
    }

    public void setGuestUsedSizeIn(List<Long> guestUsedSizeIn) {
        this.guestUsedSizeIn = guestUsedSizeIn;
    }

    public VmVolumeWhereInput guestUsedSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_IN);
        return this;
    }

    public VmVolumeWhereInput guestUsedSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_IN);
        return this;
    }

    public void setGuestUsedSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_IN);
        }
    }

    public boolean getGuestUsedSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE_IN);
    }

    public VmVolumeWhereInput guestUsedSizeLt(Long guestUsedSizeLt) {

        this.guestUsedSizeLt = guestUsedSizeLt;
        return this;
    }

    /**
     * Get guestUsedSizeLt
     *
     * @return guestUsedSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSizeLt() {
        return guestUsedSizeLt;
    }

    public void setGuestUsedSizeLt(Long guestUsedSizeLt) {
        this.guestUsedSizeLt = guestUsedSizeLt;
    }

    public VmVolumeWhereInput guestUsedSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_LT);
        return this;
    }

    public VmVolumeWhereInput guestUsedSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_LT);
        return this;
    }

    public void setGuestUsedSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_LT);
        }
    }

    public boolean getGuestUsedSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE_LT);
    }

    public VmVolumeWhereInput guestUsedSizeLte(Long guestUsedSizeLte) {

        this.guestUsedSizeLte = guestUsedSizeLte;
        return this;
    }

    /**
     * Get guestUsedSizeLte
     *
     * @return guestUsedSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSizeLte() {
        return guestUsedSizeLte;
    }

    public void setGuestUsedSizeLte(Long guestUsedSizeLte) {
        this.guestUsedSizeLte = guestUsedSizeLte;
    }

    public VmVolumeWhereInput guestUsedSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_LTE);
        return this;
    }

    public VmVolumeWhereInput guestUsedSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_LTE);
        return this;
    }

    public void setGuestUsedSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_LTE);
        }
    }

    public boolean getGuestUsedSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE_LTE);
    }

    public VmVolumeWhereInput guestUsedSizeNot(Long guestUsedSizeNot) {

        this.guestUsedSizeNot = guestUsedSizeNot;
        return this;
    }

    /**
     * Get guestUsedSizeNot
     *
     * @return guestUsedSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSizeNot() {
        return guestUsedSizeNot;
    }

    public void setGuestUsedSizeNot(Long guestUsedSizeNot) {
        this.guestUsedSizeNot = guestUsedSizeNot;
    }

    public VmVolumeWhereInput guestUsedSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_NOT);
        return this;
    }

    public VmVolumeWhereInput guestUsedSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_NOT);
        return this;
    }

    public void setGuestUsedSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_NOT);
        }
    }

    public boolean getGuestUsedSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE_NOT);
    }

    public VmVolumeWhereInput guestUsedSizeNotIn(List<Long> guestUsedSizeNotIn) {

        this.guestUsedSizeNotIn = guestUsedSizeNotIn;
        return this;
    }

    public VmVolumeWhereInput addGuestUsedSizeNotInItem(Long guestUsedSizeNotInItem) {
        if (this.guestUsedSizeNotIn == null) {
            this.guestUsedSizeNotIn = new ArrayList<Long>();
        }
        this.guestUsedSizeNotIn.add(guestUsedSizeNotInItem);
        return this;
    }

    /**
     * Get guestUsedSizeNotIn
     *
     * @return guestUsedSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getGuestUsedSizeNotIn() {
        return guestUsedSizeNotIn;
    }

    public void setGuestUsedSizeNotIn(List<Long> guestUsedSizeNotIn) {
        this.guestUsedSizeNotIn = guestUsedSizeNotIn;
    }

    public VmVolumeWhereInput guestUsedSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput guestUsedSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN);
        return this;
    }

    public void setGuestUsedSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN);
        }
    }

    public boolean getGuestUsedSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE_NOT_IN);
    }

    public VmVolumeWhereInput id(String id) {

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

    public VmVolumeWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmVolumeWhereInput id_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idContains(String idContains) {

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

    public VmVolumeWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput idContains_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idEndsWith(String idEndsWith) {

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

    public VmVolumeWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idGt(String idGt) {

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

    public VmVolumeWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmVolumeWhereInput idGt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idGte(String idGte) {

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

    public VmVolumeWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmVolumeWhereInput idGte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmVolumeWhereInput addIdInItem(String idInItem) {
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

    public VmVolumeWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmVolumeWhereInput idIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idLt(String idLt) {

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

    public VmVolumeWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmVolumeWhereInput idLt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idLte(String idLte) {

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

    public VmVolumeWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmVolumeWhereInput idLte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idNot(String idNot) {

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

    public VmVolumeWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmVolumeWhereInput idNot_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idNotContains(String idNotContains) {

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

    public VmVolumeWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmVolumeWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmVolumeWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmVolumeWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmVolumeWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput idStartsWith(String idStartsWith) {

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

    public VmVolumeWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput labelsEvery(LabelWhereInput labelsEvery) {

        this.labelsEvery = labelsEvery;
        return this;
    }

    /**
     * Get labelsEvery
     *
     * @return labelsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsEvery() {
        return labelsEvery;
    }

    public void setLabelsEvery(LabelWhereInput labelsEvery) {
        this.labelsEvery = labelsEvery;
    }

    public VmVolumeWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public VmVolumeWhereInput labelsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public void setLabelsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        }
    }

    public boolean getLabelsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_EVERY);
    }

    public VmVolumeWhereInput labelsNone(LabelWhereInput labelsNone) {

        this.labelsNone = labelsNone;
        return this;
    }

    /**
     * Get labelsNone
     *
     * @return labelsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsNone() {
        return labelsNone;
    }

    public void setLabelsNone(LabelWhereInput labelsNone) {
        this.labelsNone = labelsNone;
    }

    public VmVolumeWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public VmVolumeWhereInput labelsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public void setLabelsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        }
    }

    public boolean getLabelsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_NONE);
    }

    public VmVolumeWhereInput labelsSome(LabelWhereInput labelsSome) {

        this.labelsSome = labelsSome;
        return this;
    }

    /**
     * Get labelsSome
     *
     * @return labelsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsSome() {
        return labelsSome;
    }

    public void setLabelsSome(LabelWhereInput labelsSome) {
        this.labelsSome = labelsSome;
    }

    public VmVolumeWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public VmVolumeWhereInput labelsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public void setLabelsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        }
    }

    public boolean getLabelsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_SOME);
    }

    public VmVolumeWhereInput localCreatedAt(String localCreatedAt) {

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

    public VmVolumeWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmVolumeWhereInput localCreatedAt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localCreatedAtGt(String localCreatedAtGt) {

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

    public VmVolumeWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public VmVolumeWhereInput localCreatedAtGt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localCreatedAtGte(String localCreatedAtGte) {

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

    public VmVolumeWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public VmVolumeWhereInput localCreatedAtGte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public VmVolumeWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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

    public VmVolumeWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public VmVolumeWhereInput localCreatedAtIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localCreatedAtLt(String localCreatedAtLt) {

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

    public VmVolumeWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public VmVolumeWhereInput localCreatedAtLt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localCreatedAtLte(String localCreatedAtLte) {

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

    public VmVolumeWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public VmVolumeWhereInput localCreatedAtLte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localCreatedAtNot(String localCreatedAtNot) {

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

    public VmVolumeWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public VmVolumeWhereInput localCreatedAtNot_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public VmVolumeWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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

    public VmVolumeWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localId(String localId) {

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

    public VmVolumeWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmVolumeWhereInput localId_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdContains(String localIdContains) {

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

    public VmVolumeWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput localIdContains_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VmVolumeWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdGt(String localIdGt) {

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

    public VmVolumeWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VmVolumeWhereInput localIdGt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdGte(String localIdGte) {

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

    public VmVolumeWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VmVolumeWhereInput localIdGte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VmVolumeWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VmVolumeWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VmVolumeWhereInput localIdIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdLt(String localIdLt) {

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

    public VmVolumeWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VmVolumeWhereInput localIdLt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdLte(String localIdLte) {

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

    public VmVolumeWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VmVolumeWhereInput localIdLte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdNot(String localIdNot) {

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

    public VmVolumeWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VmVolumeWhereInput localIdNot_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdNotContains(String localIdNotContains) {

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

    public VmVolumeWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VmVolumeWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VmVolumeWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VmVolumeWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VmVolumeWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VmVolumeWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput lun(IscsiLunWhereInput lun) {

        this.lun = lun;
        return this;
    }

    /**
     * Get lun
     *
     * @return lun
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getLun() {
        return lun;
    }

    public void setLun(IscsiLunWhereInput lun) {
        this.lun = lun;
    }

    public VmVolumeWhereInput lun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUN);
        return this;
    }

    public VmVolumeWhereInput lun_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUN);
        return this;
    }

    public void setLun_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUN);
        }
    }

    public boolean getLun_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUN);
    }

    public VmVolumeWhereInput mounting(Boolean mounting) {

        this.mounting = mounting;
        return this;
    }

    /**
     * Get mounting
     *
     * @return mounting
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMounting() {
        return mounting;
    }

    public void setMounting(Boolean mounting) {
        this.mounting = mounting;
    }

    public VmVolumeWhereInput mounting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNTING);
        return this;
    }

    public VmVolumeWhereInput mounting_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNTING);
        return this;
    }

    public void setMounting_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNTING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNTING);
        }
    }

    public boolean getMounting_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNTING);
    }

    public VmVolumeWhereInput mountingNot(Boolean mountingNot) {

        this.mountingNot = mountingNot;
        return this;
    }

    /**
     * Get mountingNot
     *
     * @return mountingNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMountingNot() {
        return mountingNot;
    }

    public void setMountingNot(Boolean mountingNot) {
        this.mountingNot = mountingNot;
    }

    public VmVolumeWhereInput mountingNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNTING_NOT);
        return this;
    }

    public VmVolumeWhereInput mountingNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNTING_NOT);
        return this;
    }

    public void setMountingNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNTING_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNTING_NOT);
        }
    }

    public boolean getMountingNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNTING_NOT);
    }

    public VmVolumeWhereInput name(String name) {

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

    public VmVolumeWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVolumeWhereInput name_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameContains(String nameContains) {

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

    public VmVolumeWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput nameContains_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameEndsWith(String nameEndsWith) {

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

    public VmVolumeWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameGt(String nameGt) {

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

    public VmVolumeWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VmVolumeWhereInput nameGt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameGte(String nameGte) {

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

    public VmVolumeWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VmVolumeWhereInput nameGte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VmVolumeWhereInput addNameInItem(String nameInItem) {
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

    public VmVolumeWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VmVolumeWhereInput nameIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameLt(String nameLt) {

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

    public VmVolumeWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VmVolumeWhereInput nameLt_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameLte(String nameLte) {

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

    public VmVolumeWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VmVolumeWhereInput nameLte_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameNot(String nameNot) {

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

    public VmVolumeWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VmVolumeWhereInput nameNot_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameNotContains(String nameNotContains) {

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

    public VmVolumeWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VmVolumeWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VmVolumeWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VmVolumeWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VmVolumeWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput nameStartsWith(String nameStartsWith) {

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

    public VmVolumeWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VmVolumeWhereInput path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public VmVolumeWhereInput path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public VmVolumeWhereInput path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public VmVolumeWhereInput pathContains(String pathContains) {

        this.pathContains = pathContains;
        return this;
    }

    /**
     * Get pathContains
     *
     * @return pathContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathContains() {
        return pathContains;
    }

    public void setPathContains(String pathContains) {
        this.pathContains = pathContains;
    }

    public VmVolumeWhereInput pathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput pathContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public void setPathContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_CONTAINS);
        }
    }

    public boolean getPathContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_CONTAINS);
    }

    public VmVolumeWhereInput pathEndsWith(String pathEndsWith) {

        this.pathEndsWith = pathEndsWith;
        return this;
    }

    /**
     * Get pathEndsWith
     *
     * @return pathEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathEndsWith() {
        return pathEndsWith;
    }

    public void setPathEndsWith(String pathEndsWith) {
        this.pathEndsWith = pathEndsWith;
    }

    public VmVolumeWhereInput pathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput pathEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public void setPathEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_ENDS_WITH);
        }
    }

    public boolean getPathEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_ENDS_WITH);
    }

    public VmVolumeWhereInput pathGt(String pathGt) {

        this.pathGt = pathGt;
        return this;
    }

    /**
     * Get pathGt
     *
     * @return pathGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathGt() {
        return pathGt;
    }

    public void setPathGt(String pathGt) {
        this.pathGt = pathGt;
    }

    public VmVolumeWhereInput pathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public VmVolumeWhereInput pathGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public void setPathGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_GT);
        }
    }

    public boolean getPathGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_GT);
    }

    public VmVolumeWhereInput pathGte(String pathGte) {

        this.pathGte = pathGte;
        return this;
    }

    /**
     * Get pathGte
     *
     * @return pathGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathGte() {
        return pathGte;
    }

    public void setPathGte(String pathGte) {
        this.pathGte = pathGte;
    }

    public VmVolumeWhereInput pathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public VmVolumeWhereInput pathGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public void setPathGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_GTE);
        }
    }

    public boolean getPathGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_GTE);
    }

    public VmVolumeWhereInput pathIn(List<String> pathIn) {

        this.pathIn = pathIn;
        return this;
    }

    public VmVolumeWhereInput addPathInItem(String pathInItem) {
        if (this.pathIn == null) {
            this.pathIn = new ArrayList<String>();
        }
        this.pathIn.add(pathInItem);
        return this;
    }

    /**
     * Get pathIn
     *
     * @return pathIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPathIn() {
        return pathIn;
    }

    public void setPathIn(List<String> pathIn) {
        this.pathIn = pathIn;
    }

    public VmVolumeWhereInput pathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public VmVolumeWhereInput pathIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public void setPathIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_IN);
        }
    }

    public boolean getPathIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_IN);
    }

    public VmVolumeWhereInput pathLt(String pathLt) {

        this.pathLt = pathLt;
        return this;
    }

    /**
     * Get pathLt
     *
     * @return pathLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathLt() {
        return pathLt;
    }

    public void setPathLt(String pathLt) {
        this.pathLt = pathLt;
    }

    public VmVolumeWhereInput pathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public VmVolumeWhereInput pathLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public void setPathLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_LT);
        }
    }

    public boolean getPathLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_LT);
    }

    public VmVolumeWhereInput pathLte(String pathLte) {

        this.pathLte = pathLte;
        return this;
    }

    /**
     * Get pathLte
     *
     * @return pathLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathLte() {
        return pathLte;
    }

    public void setPathLte(String pathLte) {
        this.pathLte = pathLte;
    }

    public VmVolumeWhereInput pathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public VmVolumeWhereInput pathLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public void setPathLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_LTE);
        }
    }

    public boolean getPathLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_LTE);
    }

    public VmVolumeWhereInput pathNot(String pathNot) {

        this.pathNot = pathNot;
        return this;
    }

    /**
     * Get pathNot
     *
     * @return pathNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNot() {
        return pathNot;
    }

    public void setPathNot(String pathNot) {
        this.pathNot = pathNot;
    }

    public VmVolumeWhereInput pathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public VmVolumeWhereInput pathNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public void setPathNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT);
        }
    }

    public boolean getPathNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT);
    }

    public VmVolumeWhereInput pathNotContains(String pathNotContains) {

        this.pathNotContains = pathNotContains;
        return this;
    }

    /**
     * Get pathNotContains
     *
     * @return pathNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotContains() {
        return pathNotContains;
    }

    public void setPathNotContains(String pathNotContains) {
        this.pathNotContains = pathNotContains;
    }

    public VmVolumeWhereInput pathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public VmVolumeWhereInput pathNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public void setPathNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        }
    }

    public boolean getPathNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_CONTAINS);
    }

    public VmVolumeWhereInput pathNotEndsWith(String pathNotEndsWith) {

        this.pathNotEndsWith = pathNotEndsWith;
        return this;
    }

    /**
     * Get pathNotEndsWith
     *
     * @return pathNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotEndsWith() {
        return pathNotEndsWith;
    }

    public void setPathNotEndsWith(String pathNotEndsWith) {
        this.pathNotEndsWith = pathNotEndsWith;
    }

    public VmVolumeWhereInput pathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public VmVolumeWhereInput pathNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public void setPathNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        }
    }

    public boolean getPathNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
    }

    public VmVolumeWhereInput pathNotIn(List<String> pathNotIn) {

        this.pathNotIn = pathNotIn;
        return this;
    }

    public VmVolumeWhereInput addPathNotInItem(String pathNotInItem) {
        if (this.pathNotIn == null) {
            this.pathNotIn = new ArrayList<String>();
        }
        this.pathNotIn.add(pathNotInItem);
        return this;
    }

    /**
     * Get pathNotIn
     *
     * @return pathNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPathNotIn() {
        return pathNotIn;
    }

    public void setPathNotIn(List<String> pathNotIn) {
        this.pathNotIn = pathNotIn;
    }

    public VmVolumeWhereInput pathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput pathNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public void setPathNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_IN);
        }
    }

    public boolean getPathNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_IN);
    }

    public VmVolumeWhereInput pathNotStartsWith(String pathNotStartsWith) {

        this.pathNotStartsWith = pathNotStartsWith;
        return this;
    }

    /**
     * Get pathNotStartsWith
     *
     * @return pathNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotStartsWith() {
        return pathNotStartsWith;
    }

    public void setPathNotStartsWith(String pathNotStartsWith) {
        this.pathNotStartsWith = pathNotStartsWith;
    }

    public VmVolumeWhereInput pathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput pathNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public void setPathNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        }
    }

    public boolean getPathNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
    }

    public VmVolumeWhereInput pathStartsWith(String pathStartsWith) {

        this.pathStartsWith = pathStartsWith;
        return this;
    }

    /**
     * Get pathStartsWith
     *
     * @return pathStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathStartsWith() {
        return pathStartsWith;
    }

    public void setPathStartsWith(String pathStartsWith) {
        this.pathStartsWith = pathStartsWith;
    }

    public VmVolumeWhereInput pathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public VmVolumeWhereInput pathStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public void setPathStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_STARTS_WITH);
        }
    }

    public boolean getPathStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_STARTS_WITH);
    }

    public VmVolumeWhereInput sharing(Boolean sharing) {

        this.sharing = sharing;
        return this;
    }

    /**
     * Get sharing
     *
     * @return sharing
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSharing() {
        return sharing;
    }

    public void setSharing(Boolean sharing) {
        this.sharing = sharing;
    }

    public VmVolumeWhereInput sharing_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARING);
        return this;
    }

    public VmVolumeWhereInput sharing_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARING);
        return this;
    }

    public void setSharing_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARING);
        }
    }

    public boolean getSharing_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARING);
    }

    public VmVolumeWhereInput sharingNot(Boolean sharingNot) {

        this.sharingNot = sharingNot;
        return this;
    }

    /**
     * Get sharingNot
     *
     * @return sharingNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getSharingNot() {
        return sharingNot;
    }

    public void setSharingNot(Boolean sharingNot) {
        this.sharingNot = sharingNot;
    }

    public VmVolumeWhereInput sharingNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARING_NOT);
        return this;
    }

    public VmVolumeWhereInput sharingNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARING_NOT);
        return this;
    }

    public void setSharingNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARING_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARING_NOT);
        }
    }

    public boolean getSharingNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARING_NOT);
    }

    public VmVolumeWhereInput size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public VmVolumeWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmVolumeWhereInput size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public VmVolumeWhereInput sizeGt(Long sizeGt) {

        this.sizeGt = sizeGt;
        return this;
    }

    /**
     * Get sizeGt
     *
     * @return sizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeGt() {
        return sizeGt;
    }

    public void setSizeGt(Long sizeGt) {
        this.sizeGt = sizeGt;
    }

    public VmVolumeWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public VmVolumeWhereInput sizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public void setSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        }
    }

    public boolean getSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GT);
    }

    public VmVolumeWhereInput sizeGte(Long sizeGte) {

        this.sizeGte = sizeGte;
        return this;
    }

    /**
     * Get sizeGte
     *
     * @return sizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeGte() {
        return sizeGte;
    }

    public void setSizeGte(Long sizeGte) {
        this.sizeGte = sizeGte;
    }

    public VmVolumeWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public VmVolumeWhereInput sizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public void setSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        }
    }

    public boolean getSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GTE);
    }

    public VmVolumeWhereInput sizeIn(List<Long> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public VmVolumeWhereInput addSizeInItem(Long sizeInItem) {
        if (this.sizeIn == null) {
            this.sizeIn = new ArrayList<Long>();
        }
        this.sizeIn.add(sizeInItem);
        return this;
    }

    /**
     * Get sizeIn
     *
     * @return sizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSizeIn() {
        return sizeIn;
    }

    public void setSizeIn(List<Long> sizeIn) {
        this.sizeIn = sizeIn;
    }

    public VmVolumeWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public VmVolumeWhereInput sizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public void setSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        }
    }

    public boolean getSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_IN);
    }

    public VmVolumeWhereInput sizeLt(Long sizeLt) {

        this.sizeLt = sizeLt;
        return this;
    }

    /**
     * Get sizeLt
     *
     * @return sizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeLt() {
        return sizeLt;
    }

    public void setSizeLt(Long sizeLt) {
        this.sizeLt = sizeLt;
    }

    public VmVolumeWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public VmVolumeWhereInput sizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public void setSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        }
    }

    public boolean getSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LT);
    }

    public VmVolumeWhereInput sizeLte(Long sizeLte) {

        this.sizeLte = sizeLte;
        return this;
    }

    /**
     * Get sizeLte
     *
     * @return sizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeLte() {
        return sizeLte;
    }

    public void setSizeLte(Long sizeLte) {
        this.sizeLte = sizeLte;
    }

    public VmVolumeWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public VmVolumeWhereInput sizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public void setSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        }
    }

    public boolean getSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LTE);
    }

    public VmVolumeWhereInput sizeNot(Long sizeNot) {

        this.sizeNot = sizeNot;
        return this;
    }

    /**
     * Get sizeNot
     *
     * @return sizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeNot() {
        return sizeNot;
    }

    public void setSizeNot(Long sizeNot) {
        this.sizeNot = sizeNot;
    }

    public VmVolumeWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public VmVolumeWhereInput sizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public void setSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        }
    }

    public boolean getSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT);
    }

    public VmVolumeWhereInput sizeNotIn(List<Long> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public VmVolumeWhereInput addSizeNotInItem(Long sizeNotInItem) {
        if (this.sizeNotIn == null) {
            this.sizeNotIn = new ArrayList<Long>();
        }
        this.sizeNotIn.add(sizeNotInItem);
        return this;
    }

    /**
     * Get sizeNotIn
     *
     * @return sizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSizeNotIn() {
        return sizeNotIn;
    }

    public void setSizeNotIn(List<Long> sizeNotIn) {
        this.sizeNotIn = sizeNotIn;
    }

    public VmVolumeWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput sizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public void setSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        }
    }

    public boolean getSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT_IN);
    }

    public VmVolumeWhereInput type(VmVolumeType type) {

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
    public VmVolumeType getType() {
        return type;
    }

    public void setType(VmVolumeType type) {
        this.type = type;
    }

    public VmVolumeWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmVolumeWhereInput type_ExplictlyNonNull() {
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

    public VmVolumeWhereInput typeIn(List<VmVolumeType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public VmVolumeWhereInput addTypeInItem(VmVolumeType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<VmVolumeType>();
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
    public List<VmVolumeType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<VmVolumeType> typeIn) {
        this.typeIn = typeIn;
    }

    public VmVolumeWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public VmVolumeWhereInput typeIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput typeNot(VmVolumeType typeNot) {

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
    public VmVolumeType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(VmVolumeType typeNot) {
        this.typeNot = typeNot;
    }

    public VmVolumeWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public VmVolumeWhereInput typeNot_ExplictlyNonNull() {
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

    public VmVolumeWhereInput typeNotIn(List<VmVolumeType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public VmVolumeWhereInput addTypeNotInItem(VmVolumeType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<VmVolumeType>();
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
    public List<VmVolumeType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<VmVolumeType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public VmVolumeWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput typeNotIn_ExplictlyNonNull() {
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

    public VmVolumeWhereInput uniqueLogicalSize(Double uniqueLogicalSize) {

        this.uniqueLogicalSize = uniqueLogicalSize;
        return this;
    }

    /**
     * Get uniqueLogicalSize
     *
     * @return uniqueLogicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSize() {
        return uniqueLogicalSize;
    }

    public void setUniqueLogicalSize(Double uniqueLogicalSize) {
        this.uniqueLogicalSize = uniqueLogicalSize;
    }

    public VmVolumeWhereInput uniqueLogicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public void setUniqueLogicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        }
    }

    public boolean getUniqueLogicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
    }

    public VmVolumeWhereInput uniqueLogicalSizeGt(Double uniqueLogicalSizeGt) {

        this.uniqueLogicalSizeGt = uniqueLogicalSizeGt;
        return this;
    }

    /**
     * Get uniqueLogicalSizeGt
     *
     * @return uniqueLogicalSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeGt() {
        return uniqueLogicalSizeGt;
    }

    public void setUniqueLogicalSizeGt(Double uniqueLogicalSizeGt) {
        this.uniqueLogicalSizeGt = uniqueLogicalSizeGt;
    }

    public VmVolumeWhereInput uniqueLogicalSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        return this;
    }

    public void setUniqueLogicalSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
        }
    }

    public boolean getUniqueLogicalSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GT);
    }

    public VmVolumeWhereInput uniqueLogicalSizeGte(Double uniqueLogicalSizeGte) {

        this.uniqueLogicalSizeGte = uniqueLogicalSizeGte;
        return this;
    }

    /**
     * Get uniqueLogicalSizeGte
     *
     * @return uniqueLogicalSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeGte() {
        return uniqueLogicalSizeGte;
    }

    public void setUniqueLogicalSizeGte(Double uniqueLogicalSizeGte) {
        this.uniqueLogicalSizeGte = uniqueLogicalSizeGte;
    }

    public VmVolumeWhereInput uniqueLogicalSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        return this;
    }

    public void setUniqueLogicalSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
        }
    }

    public boolean getUniqueLogicalSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_GTE);
    }

    public VmVolumeWhereInput uniqueLogicalSizeIn(List<Double> uniqueLogicalSizeIn) {

        this.uniqueLogicalSizeIn = uniqueLogicalSizeIn;
        return this;
    }

    public VmVolumeWhereInput addUniqueLogicalSizeInItem(Double uniqueLogicalSizeInItem) {
        if (this.uniqueLogicalSizeIn == null) {
            this.uniqueLogicalSizeIn = new ArrayList<Double>();
        }
        this.uniqueLogicalSizeIn.add(uniqueLogicalSizeInItem);
        return this;
    }

    /**
     * Get uniqueLogicalSizeIn
     *
     * @return uniqueLogicalSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUniqueLogicalSizeIn() {
        return uniqueLogicalSizeIn;
    }

    public void setUniqueLogicalSizeIn(List<Double> uniqueLogicalSizeIn) {
        this.uniqueLogicalSizeIn = uniqueLogicalSizeIn;
    }

    public VmVolumeWhereInput uniqueLogicalSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        return this;
    }

    public void setUniqueLogicalSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
        }
    }

    public boolean getUniqueLogicalSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_IN);
    }

    public VmVolumeWhereInput uniqueLogicalSizeLt(Double uniqueLogicalSizeLt) {

        this.uniqueLogicalSizeLt = uniqueLogicalSizeLt;
        return this;
    }

    /**
     * Get uniqueLogicalSizeLt
     *
     * @return uniqueLogicalSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeLt() {
        return uniqueLogicalSizeLt;
    }

    public void setUniqueLogicalSizeLt(Double uniqueLogicalSizeLt) {
        this.uniqueLogicalSizeLt = uniqueLogicalSizeLt;
    }

    public VmVolumeWhereInput uniqueLogicalSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        return this;
    }

    public void setUniqueLogicalSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
        }
    }

    public boolean getUniqueLogicalSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LT);
    }

    public VmVolumeWhereInput uniqueLogicalSizeLte(Double uniqueLogicalSizeLte) {

        this.uniqueLogicalSizeLte = uniqueLogicalSizeLte;
        return this;
    }

    /**
     * Get uniqueLogicalSizeLte
     *
     * @return uniqueLogicalSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeLte() {
        return uniqueLogicalSizeLte;
    }

    public void setUniqueLogicalSizeLte(Double uniqueLogicalSizeLte) {
        this.uniqueLogicalSizeLte = uniqueLogicalSizeLte;
    }

    public VmVolumeWhereInput uniqueLogicalSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        return this;
    }

    public void setUniqueLogicalSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
        }
    }

    public boolean getUniqueLogicalSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_LTE);
    }

    public VmVolumeWhereInput uniqueLogicalSizeNot(Double uniqueLogicalSizeNot) {

        this.uniqueLogicalSizeNot = uniqueLogicalSizeNot;
        return this;
    }

    /**
     * Get uniqueLogicalSizeNot
     *
     * @return uniqueLogicalSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSizeNot() {
        return uniqueLogicalSizeNot;
    }

    public void setUniqueLogicalSizeNot(Double uniqueLogicalSizeNot) {
        this.uniqueLogicalSizeNot = uniqueLogicalSizeNot;
    }

    public VmVolumeWhereInput uniqueLogicalSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        return this;
    }

    public void setUniqueLogicalSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
        }
    }

    public boolean getUniqueLogicalSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT);
    }

    public VmVolumeWhereInput uniqueLogicalSizeNotIn(List<Double> uniqueLogicalSizeNotIn) {

        this.uniqueLogicalSizeNotIn = uniqueLogicalSizeNotIn;
        return this;
    }

    public VmVolumeWhereInput addUniqueLogicalSizeNotInItem(Double uniqueLogicalSizeNotInItem) {
        if (this.uniqueLogicalSizeNotIn == null) {
            this.uniqueLogicalSizeNotIn = new ArrayList<Double>();
        }
        this.uniqueLogicalSizeNotIn.add(uniqueLogicalSizeNotInItem);
        return this;
    }

    /**
     * Get uniqueLogicalSizeNotIn
     *
     * @return uniqueLogicalSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getUniqueLogicalSizeNotIn() {
        return uniqueLogicalSizeNotIn;
    }

    public void setUniqueLogicalSizeNotIn(List<Double> uniqueLogicalSizeNotIn) {
        this.uniqueLogicalSizeNotIn = uniqueLogicalSizeNotIn;
    }

    public VmVolumeWhereInput uniqueLogicalSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput uniqueLogicalSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public void setUniqueLogicalSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
        }
    }

    public boolean getUniqueLogicalSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE_NOT_IN);
    }

    public VmVolumeWhereInput uniqueSize(Long uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public VmVolumeWhereInput uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public VmVolumeWhereInput uniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public void setUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        }
    }

    public boolean getUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE);
    }

    public VmVolumeWhereInput uniqueSizeGt(Long uniqueSizeGt) {

        this.uniqueSizeGt = uniqueSizeGt;
        return this;
    }

    /**
     * Get uniqueSizeGt
     *
     * @return uniqueSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeGt() {
        return uniqueSizeGt;
    }

    public void setUniqueSizeGt(Long uniqueSizeGt) {
        this.uniqueSizeGt = uniqueSizeGt;
    }

    public VmVolumeWhereInput uniqueSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        return this;
    }

    public VmVolumeWhereInput uniqueSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        return this;
    }

    public void setUniqueSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GT);
        }
    }

    public boolean getUniqueSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_GT);
    }

    public VmVolumeWhereInput uniqueSizeGte(Long uniqueSizeGte) {

        this.uniqueSizeGte = uniqueSizeGte;
        return this;
    }

    /**
     * Get uniqueSizeGte
     *
     * @return uniqueSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeGte() {
        return uniqueSizeGte;
    }

    public void setUniqueSizeGte(Long uniqueSizeGte) {
        this.uniqueSizeGte = uniqueSizeGte;
    }

    public VmVolumeWhereInput uniqueSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        return this;
    }

    public VmVolumeWhereInput uniqueSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        return this;
    }

    public void setUniqueSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
        }
    }

    public boolean getUniqueSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_GTE);
    }

    public VmVolumeWhereInput uniqueSizeIn(List<Long> uniqueSizeIn) {

        this.uniqueSizeIn = uniqueSizeIn;
        return this;
    }

    public VmVolumeWhereInput addUniqueSizeInItem(Long uniqueSizeInItem) {
        if (this.uniqueSizeIn == null) {
            this.uniqueSizeIn = new ArrayList<Long>();
        }
        this.uniqueSizeIn.add(uniqueSizeInItem);
        return this;
    }

    /**
     * Get uniqueSizeIn
     *
     * @return uniqueSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUniqueSizeIn() {
        return uniqueSizeIn;
    }

    public void setUniqueSizeIn(List<Long> uniqueSizeIn) {
        this.uniqueSizeIn = uniqueSizeIn;
    }

    public VmVolumeWhereInput uniqueSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        return this;
    }

    public VmVolumeWhereInput uniqueSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        return this;
    }

    public void setUniqueSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_IN);
        }
    }

    public boolean getUniqueSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_IN);
    }

    public VmVolumeWhereInput uniqueSizeLt(Long uniqueSizeLt) {

        this.uniqueSizeLt = uniqueSizeLt;
        return this;
    }

    /**
     * Get uniqueSizeLt
     *
     * @return uniqueSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeLt() {
        return uniqueSizeLt;
    }

    public void setUniqueSizeLt(Long uniqueSizeLt) {
        this.uniqueSizeLt = uniqueSizeLt;
    }

    public VmVolumeWhereInput uniqueSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        return this;
    }

    public VmVolumeWhereInput uniqueSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        return this;
    }

    public void setUniqueSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LT);
        }
    }

    public boolean getUniqueSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_LT);
    }

    public VmVolumeWhereInput uniqueSizeLte(Long uniqueSizeLte) {

        this.uniqueSizeLte = uniqueSizeLte;
        return this;
    }

    /**
     * Get uniqueSizeLte
     *
     * @return uniqueSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeLte() {
        return uniqueSizeLte;
    }

    public void setUniqueSizeLte(Long uniqueSizeLte) {
        this.uniqueSizeLte = uniqueSizeLte;
    }

    public VmVolumeWhereInput uniqueSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        return this;
    }

    public VmVolumeWhereInput uniqueSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        return this;
    }

    public void setUniqueSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
        }
    }

    public boolean getUniqueSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_LTE);
    }

    public VmVolumeWhereInput uniqueSizeNot(Long uniqueSizeNot) {

        this.uniqueSizeNot = uniqueSizeNot;
        return this;
    }

    /**
     * Get uniqueSizeNot
     *
     * @return uniqueSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSizeNot() {
        return uniqueSizeNot;
    }

    public void setUniqueSizeNot(Long uniqueSizeNot) {
        this.uniqueSizeNot = uniqueSizeNot;
    }

    public VmVolumeWhereInput uniqueSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        return this;
    }

    public VmVolumeWhereInput uniqueSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        return this;
    }

    public void setUniqueSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
        }
    }

    public boolean getUniqueSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_NOT);
    }

    public VmVolumeWhereInput uniqueSizeNotIn(List<Long> uniqueSizeNotIn) {

        this.uniqueSizeNotIn = uniqueSizeNotIn;
        return this;
    }

    public VmVolumeWhereInput addUniqueSizeNotInItem(Long uniqueSizeNotInItem) {
        if (this.uniqueSizeNotIn == null) {
            this.uniqueSizeNotIn = new ArrayList<Long>();
        }
        this.uniqueSizeNotIn.add(uniqueSizeNotInItem);
        return this;
    }

    /**
     * Get uniqueSizeNotIn
     *
     * @return uniqueSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUniqueSizeNotIn() {
        return uniqueSizeNotIn;
    }

    public void setUniqueSizeNotIn(List<Long> uniqueSizeNotIn) {
        this.uniqueSizeNotIn = uniqueSizeNotIn;
    }

    public VmVolumeWhereInput uniqueSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        return this;
    }

    public VmVolumeWhereInput uniqueSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        return this;
    }

    public void setUniqueSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
        }
    }

    public boolean getUniqueSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE_NOT_IN);
    }

    public VmVolumeWhereInput vmDisksEvery(VmDiskWhereInput vmDisksEvery) {

        this.vmDisksEvery = vmDisksEvery;
        return this;
    }

    /**
     * Get vmDisksEvery
     *
     * @return vmDisksEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskWhereInput getVmDisksEvery() {
        return vmDisksEvery;
    }

    public void setVmDisksEvery(VmDiskWhereInput vmDisksEvery) {
        this.vmDisksEvery = vmDisksEvery;
    }

    public VmVolumeWhereInput vmDisksEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS_EVERY);
        return this;
    }

    public VmVolumeWhereInput vmDisksEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS_EVERY);
        return this;
    }

    public void setVmDisksEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS_EVERY);
        }
    }

    public boolean getVmDisksEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS_EVERY);
    }

    public VmVolumeWhereInput vmDisksNone(VmDiskWhereInput vmDisksNone) {

        this.vmDisksNone = vmDisksNone;
        return this;
    }

    /**
     * Get vmDisksNone
     *
     * @return vmDisksNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskWhereInput getVmDisksNone() {
        return vmDisksNone;
    }

    public void setVmDisksNone(VmDiskWhereInput vmDisksNone) {
        this.vmDisksNone = vmDisksNone;
    }

    public VmVolumeWhereInput vmDisksNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS_NONE);
        return this;
    }

    public VmVolumeWhereInput vmDisksNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS_NONE);
        return this;
    }

    public void setVmDisksNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS_NONE);
        }
    }

    public boolean getVmDisksNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS_NONE);
    }

    public VmVolumeWhereInput vmDisksSome(VmDiskWhereInput vmDisksSome) {

        this.vmDisksSome = vmDisksSome;
        return this;
    }

    /**
     * Get vmDisksSome
     *
     * @return vmDisksSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskWhereInput getVmDisksSome() {
        return vmDisksSome;
    }

    public void setVmDisksSome(VmDiskWhereInput vmDisksSome) {
        this.vmDisksSome = vmDisksSome;
    }

    public VmVolumeWhereInput vmDisksSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS_SOME);
        return this;
    }

    public VmVolumeWhereInput vmDisksSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS_SOME);
        return this;
    }

    public void setVmDisksSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS_SOME);
        }
    }

    public boolean getVmDisksSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmVolumeWhereInput vmVolumeWhereInput = (VmVolumeWhereInput) o;
        return Objects.equals(this.AND, vmVolumeWhereInput.AND)
                && Objects.equals(this.NOT, vmVolumeWhereInput.NOT)
                && Objects.equals(this.OR, vmVolumeWhereInput.OR)
                && Objects.equals(this.cluster, vmVolumeWhereInput.cluster)
                && Objects.equals(this.description, vmVolumeWhereInput.description)
                && Objects.equals(this.descriptionContains, vmVolumeWhereInput.descriptionContains)
                && Objects.equals(this.descriptionEndsWith, vmVolumeWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, vmVolumeWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, vmVolumeWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, vmVolumeWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, vmVolumeWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, vmVolumeWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, vmVolumeWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, vmVolumeWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, vmVolumeWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, vmVolumeWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith, vmVolumeWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, vmVolumeWhereInput.descriptionStartsWith)
                && Objects.equals(this.elfStoragePolicy, vmVolumeWhereInput.elfStoragePolicy)
                && Objects.equals(this.elfStoragePolicyIn, vmVolumeWhereInput.elfStoragePolicyIn)
                && Objects.equals(this.elfStoragePolicyNot, vmVolumeWhereInput.elfStoragePolicyNot)
                && Objects.equals(
                        this.elfStoragePolicyNotIn, vmVolumeWhereInput.elfStoragePolicyNotIn)
                && Objects.equals(this.entityAsyncStatus, vmVolumeWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, vmVolumeWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, vmVolumeWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, vmVolumeWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.guestSizeUsage, vmVolumeWhereInput.guestSizeUsage)
                && Objects.equals(this.guestSizeUsageGt, vmVolumeWhereInput.guestSizeUsageGt)
                && Objects.equals(this.guestSizeUsageGte, vmVolumeWhereInput.guestSizeUsageGte)
                && Objects.equals(this.guestSizeUsageIn, vmVolumeWhereInput.guestSizeUsageIn)
                && Objects.equals(this.guestSizeUsageLt, vmVolumeWhereInput.guestSizeUsageLt)
                && Objects.equals(this.guestSizeUsageLte, vmVolumeWhereInput.guestSizeUsageLte)
                && Objects.equals(this.guestSizeUsageNot, vmVolumeWhereInput.guestSizeUsageNot)
                && Objects.equals(this.guestSizeUsageNotIn, vmVolumeWhereInput.guestSizeUsageNotIn)
                && Objects.equals(this.guestUsedSize, vmVolumeWhereInput.guestUsedSize)
                && Objects.equals(this.guestUsedSizeGt, vmVolumeWhereInput.guestUsedSizeGt)
                && Objects.equals(this.guestUsedSizeGte, vmVolumeWhereInput.guestUsedSizeGte)
                && Objects.equals(this.guestUsedSizeIn, vmVolumeWhereInput.guestUsedSizeIn)
                && Objects.equals(this.guestUsedSizeLt, vmVolumeWhereInput.guestUsedSizeLt)
                && Objects.equals(this.guestUsedSizeLte, vmVolumeWhereInput.guestUsedSizeLte)
                && Objects.equals(this.guestUsedSizeNot, vmVolumeWhereInput.guestUsedSizeNot)
                && Objects.equals(this.guestUsedSizeNotIn, vmVolumeWhereInput.guestUsedSizeNotIn)
                && Objects.equals(this.id, vmVolumeWhereInput.id)
                && Objects.equals(this.idContains, vmVolumeWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmVolumeWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmVolumeWhereInput.idGt)
                && Objects.equals(this.idGte, vmVolumeWhereInput.idGte)
                && Objects.equals(this.idIn, vmVolumeWhereInput.idIn)
                && Objects.equals(this.idLt, vmVolumeWhereInput.idLt)
                && Objects.equals(this.idLte, vmVolumeWhereInput.idLte)
                && Objects.equals(this.idNot, vmVolumeWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmVolumeWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmVolumeWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmVolumeWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmVolumeWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmVolumeWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, vmVolumeWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, vmVolumeWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, vmVolumeWhereInput.labelsSome)
                && Objects.equals(this.localCreatedAt, vmVolumeWhereInput.localCreatedAt)
                && Objects.equals(this.localCreatedAtGt, vmVolumeWhereInput.localCreatedAtGt)
                && Objects.equals(this.localCreatedAtGte, vmVolumeWhereInput.localCreatedAtGte)
                && Objects.equals(this.localCreatedAtIn, vmVolumeWhereInput.localCreatedAtIn)
                && Objects.equals(this.localCreatedAtLt, vmVolumeWhereInput.localCreatedAtLt)
                && Objects.equals(this.localCreatedAtLte, vmVolumeWhereInput.localCreatedAtLte)
                && Objects.equals(this.localCreatedAtNot, vmVolumeWhereInput.localCreatedAtNot)
                && Objects.equals(this.localCreatedAtNotIn, vmVolumeWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, vmVolumeWhereInput.localId)
                && Objects.equals(this.localIdContains, vmVolumeWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vmVolumeWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vmVolumeWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vmVolumeWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vmVolumeWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vmVolumeWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vmVolumeWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vmVolumeWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, vmVolumeWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, vmVolumeWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vmVolumeWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, vmVolumeWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, vmVolumeWhereInput.localIdStartsWith)
                && Objects.equals(this.lun, vmVolumeWhereInput.lun)
                && Objects.equals(this.mounting, vmVolumeWhereInput.mounting)
                && Objects.equals(this.mountingNot, vmVolumeWhereInput.mountingNot)
                && Objects.equals(this.name, vmVolumeWhereInput.name)
                && Objects.equals(this.nameContains, vmVolumeWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vmVolumeWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vmVolumeWhereInput.nameGt)
                && Objects.equals(this.nameGte, vmVolumeWhereInput.nameGte)
                && Objects.equals(this.nameIn, vmVolumeWhereInput.nameIn)
                && Objects.equals(this.nameLt, vmVolumeWhereInput.nameLt)
                && Objects.equals(this.nameLte, vmVolumeWhereInput.nameLte)
                && Objects.equals(this.nameNot, vmVolumeWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vmVolumeWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vmVolumeWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vmVolumeWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, vmVolumeWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vmVolumeWhereInput.nameStartsWith)
                && Objects.equals(this.path, vmVolumeWhereInput.path)
                && Objects.equals(this.pathContains, vmVolumeWhereInput.pathContains)
                && Objects.equals(this.pathEndsWith, vmVolumeWhereInput.pathEndsWith)
                && Objects.equals(this.pathGt, vmVolumeWhereInput.pathGt)
                && Objects.equals(this.pathGte, vmVolumeWhereInput.pathGte)
                && Objects.equals(this.pathIn, vmVolumeWhereInput.pathIn)
                && Objects.equals(this.pathLt, vmVolumeWhereInput.pathLt)
                && Objects.equals(this.pathLte, vmVolumeWhereInput.pathLte)
                && Objects.equals(this.pathNot, vmVolumeWhereInput.pathNot)
                && Objects.equals(this.pathNotContains, vmVolumeWhereInput.pathNotContains)
                && Objects.equals(this.pathNotEndsWith, vmVolumeWhereInput.pathNotEndsWith)
                && Objects.equals(this.pathNotIn, vmVolumeWhereInput.pathNotIn)
                && Objects.equals(this.pathNotStartsWith, vmVolumeWhereInput.pathNotStartsWith)
                && Objects.equals(this.pathStartsWith, vmVolumeWhereInput.pathStartsWith)
                && Objects.equals(this.sharing, vmVolumeWhereInput.sharing)
                && Objects.equals(this.sharingNot, vmVolumeWhereInput.sharingNot)
                && Objects.equals(this.size, vmVolumeWhereInput.size)
                && Objects.equals(this.sizeGt, vmVolumeWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, vmVolumeWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, vmVolumeWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, vmVolumeWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, vmVolumeWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, vmVolumeWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, vmVolumeWhereInput.sizeNotIn)
                && Objects.equals(this.type, vmVolumeWhereInput.type)
                && Objects.equals(this.typeIn, vmVolumeWhereInput.typeIn)
                && Objects.equals(this.typeNot, vmVolumeWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, vmVolumeWhereInput.typeNotIn)
                && Objects.equals(this.uniqueLogicalSize, vmVolumeWhereInput.uniqueLogicalSize)
                && Objects.equals(this.uniqueLogicalSizeGt, vmVolumeWhereInput.uniqueLogicalSizeGt)
                && Objects.equals(
                        this.uniqueLogicalSizeGte, vmVolumeWhereInput.uniqueLogicalSizeGte)
                && Objects.equals(this.uniqueLogicalSizeIn, vmVolumeWhereInput.uniqueLogicalSizeIn)
                && Objects.equals(this.uniqueLogicalSizeLt, vmVolumeWhereInput.uniqueLogicalSizeLt)
                && Objects.equals(
                        this.uniqueLogicalSizeLte, vmVolumeWhereInput.uniqueLogicalSizeLte)
                && Objects.equals(
                        this.uniqueLogicalSizeNot, vmVolumeWhereInput.uniqueLogicalSizeNot)
                && Objects.equals(
                        this.uniqueLogicalSizeNotIn, vmVolumeWhereInput.uniqueLogicalSizeNotIn)
                && Objects.equals(this.uniqueSize, vmVolumeWhereInput.uniqueSize)
                && Objects.equals(this.uniqueSizeGt, vmVolumeWhereInput.uniqueSizeGt)
                && Objects.equals(this.uniqueSizeGte, vmVolumeWhereInput.uniqueSizeGte)
                && Objects.equals(this.uniqueSizeIn, vmVolumeWhereInput.uniqueSizeIn)
                && Objects.equals(this.uniqueSizeLt, vmVolumeWhereInput.uniqueSizeLt)
                && Objects.equals(this.uniqueSizeLte, vmVolumeWhereInput.uniqueSizeLte)
                && Objects.equals(this.uniqueSizeNot, vmVolumeWhereInput.uniqueSizeNot)
                && Objects.equals(this.uniqueSizeNotIn, vmVolumeWhereInput.uniqueSizeNotIn)
                && Objects.equals(this.vmDisksEvery, vmVolumeWhereInput.vmDisksEvery)
                && Objects.equals(this.vmDisksNone, vmVolumeWhereInput.vmDisksNone)
                && Objects.equals(this.vmDisksSome, vmVolumeWhereInput.vmDisksSome);
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
                cluster,
                description,
                descriptionContains,
                descriptionEndsWith,
                descriptionGt,
                descriptionGte,
                descriptionIn,
                descriptionLt,
                descriptionLte,
                descriptionNot,
                descriptionNotContains,
                descriptionNotEndsWith,
                descriptionNotIn,
                descriptionNotStartsWith,
                descriptionStartsWith,
                elfStoragePolicy,
                elfStoragePolicyIn,
                elfStoragePolicyNot,
                elfStoragePolicyNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                guestSizeUsage,
                guestSizeUsageGt,
                guestSizeUsageGte,
                guestSizeUsageIn,
                guestSizeUsageLt,
                guestSizeUsageLte,
                guestSizeUsageNot,
                guestSizeUsageNotIn,
                guestUsedSize,
                guestUsedSizeGt,
                guestUsedSizeGte,
                guestUsedSizeIn,
                guestUsedSizeLt,
                guestUsedSizeLte,
                guestUsedSizeNot,
                guestUsedSizeNotIn,
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
                labelsEvery,
                labelsNone,
                labelsSome,
                localCreatedAt,
                localCreatedAtGt,
                localCreatedAtGte,
                localCreatedAtIn,
                localCreatedAtLt,
                localCreatedAtLte,
                localCreatedAtNot,
                localCreatedAtNotIn,
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
                lun,
                mounting,
                mountingNot,
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
                path,
                pathContains,
                pathEndsWith,
                pathGt,
                pathGte,
                pathIn,
                pathLt,
                pathLte,
                pathNot,
                pathNotContains,
                pathNotEndsWith,
                pathNotIn,
                pathNotStartsWith,
                pathStartsWith,
                sharing,
                sharingNot,
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                uniqueLogicalSize,
                uniqueLogicalSizeGt,
                uniqueLogicalSizeGte,
                uniqueLogicalSizeIn,
                uniqueLogicalSizeLt,
                uniqueLogicalSizeLte,
                uniqueLogicalSizeNot,
                uniqueLogicalSizeNotIn,
                uniqueSize,
                uniqueSizeGt,
                uniqueSizeGte,
                uniqueSizeIn,
                uniqueSizeLt,
                uniqueSizeLte,
                uniqueSizeNot,
                uniqueSizeNotIn,
                vmDisksEvery,
                vmDisksNone,
                vmDisksSome);
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
        sb.append("class VmVolumeWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
        sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
        sb.append("    elfStoragePolicyIn: ")
                .append(toIndentedString(elfStoragePolicyIn))
                .append("\n");
        sb.append("    elfStoragePolicyNot: ")
                .append(toIndentedString(elfStoragePolicyNot))
                .append("\n");
        sb.append("    elfStoragePolicyNotIn: ")
                .append(toIndentedString(elfStoragePolicyNotIn))
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
        sb.append("    guestSizeUsage: ").append(toIndentedString(guestSizeUsage)).append("\n");
        sb.append("    guestSizeUsageGt: ").append(toIndentedString(guestSizeUsageGt)).append("\n");
        sb.append("    guestSizeUsageGte: ")
                .append(toIndentedString(guestSizeUsageGte))
                .append("\n");
        sb.append("    guestSizeUsageIn: ").append(toIndentedString(guestSizeUsageIn)).append("\n");
        sb.append("    guestSizeUsageLt: ").append(toIndentedString(guestSizeUsageLt)).append("\n");
        sb.append("    guestSizeUsageLte: ")
                .append(toIndentedString(guestSizeUsageLte))
                .append("\n");
        sb.append("    guestSizeUsageNot: ")
                .append(toIndentedString(guestSizeUsageNot))
                .append("\n");
        sb.append("    guestSizeUsageNotIn: ")
                .append(toIndentedString(guestSizeUsageNotIn))
                .append("\n");
        sb.append("    guestUsedSize: ").append(toIndentedString(guestUsedSize)).append("\n");
        sb.append("    guestUsedSizeGt: ").append(toIndentedString(guestUsedSizeGt)).append("\n");
        sb.append("    guestUsedSizeGte: ").append(toIndentedString(guestUsedSizeGte)).append("\n");
        sb.append("    guestUsedSizeIn: ").append(toIndentedString(guestUsedSizeIn)).append("\n");
        sb.append("    guestUsedSizeLt: ").append(toIndentedString(guestUsedSizeLt)).append("\n");
        sb.append("    guestUsedSizeLte: ").append(toIndentedString(guestUsedSizeLte)).append("\n");
        sb.append("    guestUsedSizeNot: ").append(toIndentedString(guestUsedSizeNot)).append("\n");
        sb.append("    guestUsedSizeNotIn: ")
                .append(toIndentedString(guestUsedSizeNotIn))
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
        sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
        sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
        sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
        sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
        sb.append("    mounting: ").append(toIndentedString(mounting)).append("\n");
        sb.append("    mountingNot: ").append(toIndentedString(mountingNot)).append("\n");
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
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathContains: ").append(toIndentedString(pathContains)).append("\n");
        sb.append("    pathEndsWith: ").append(toIndentedString(pathEndsWith)).append("\n");
        sb.append("    pathGt: ").append(toIndentedString(pathGt)).append("\n");
        sb.append("    pathGte: ").append(toIndentedString(pathGte)).append("\n");
        sb.append("    pathIn: ").append(toIndentedString(pathIn)).append("\n");
        sb.append("    pathLt: ").append(toIndentedString(pathLt)).append("\n");
        sb.append("    pathLte: ").append(toIndentedString(pathLte)).append("\n");
        sb.append("    pathNot: ").append(toIndentedString(pathNot)).append("\n");
        sb.append("    pathNotContains: ").append(toIndentedString(pathNotContains)).append("\n");
        sb.append("    pathNotEndsWith: ").append(toIndentedString(pathNotEndsWith)).append("\n");
        sb.append("    pathNotIn: ").append(toIndentedString(pathNotIn)).append("\n");
        sb.append("    pathNotStartsWith: ")
                .append(toIndentedString(pathNotStartsWith))
                .append("\n");
        sb.append("    pathStartsWith: ").append(toIndentedString(pathStartsWith)).append("\n");
        sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
        sb.append("    sharingNot: ").append(toIndentedString(sharingNot)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    uniqueLogicalSize: ")
                .append(toIndentedString(uniqueLogicalSize))
                .append("\n");
        sb.append("    uniqueLogicalSizeGt: ")
                .append(toIndentedString(uniqueLogicalSizeGt))
                .append("\n");
        sb.append("    uniqueLogicalSizeGte: ")
                .append(toIndentedString(uniqueLogicalSizeGte))
                .append("\n");
        sb.append("    uniqueLogicalSizeIn: ")
                .append(toIndentedString(uniqueLogicalSizeIn))
                .append("\n");
        sb.append("    uniqueLogicalSizeLt: ")
                .append(toIndentedString(uniqueLogicalSizeLt))
                .append("\n");
        sb.append("    uniqueLogicalSizeLte: ")
                .append(toIndentedString(uniqueLogicalSizeLte))
                .append("\n");
        sb.append("    uniqueLogicalSizeNot: ")
                .append(toIndentedString(uniqueLogicalSizeNot))
                .append("\n");
        sb.append("    uniqueLogicalSizeNotIn: ")
                .append(toIndentedString(uniqueLogicalSizeNotIn))
                .append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    uniqueSizeGt: ").append(toIndentedString(uniqueSizeGt)).append("\n");
        sb.append("    uniqueSizeGte: ").append(toIndentedString(uniqueSizeGte)).append("\n");
        sb.append("    uniqueSizeIn: ").append(toIndentedString(uniqueSizeIn)).append("\n");
        sb.append("    uniqueSizeLt: ").append(toIndentedString(uniqueSizeLt)).append("\n");
        sb.append("    uniqueSizeLte: ").append(toIndentedString(uniqueSizeLte)).append("\n");
        sb.append("    uniqueSizeNot: ").append(toIndentedString(uniqueSizeNot)).append("\n");
        sb.append("    uniqueSizeNotIn: ").append(toIndentedString(uniqueSizeNotIn)).append("\n");
        sb.append("    vmDisksEvery: ").append(toIndentedString(vmDisksEvery)).append("\n");
        sb.append("    vmDisksNone: ").append(toIndentedString(vmDisksNone)).append("\n");
        sb.append("    vmDisksSome: ").append(toIndentedString(vmDisksSome)).append("\n");
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
