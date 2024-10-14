package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.BackupPlanWhereInput;
import com.smartx.tower.model.BackupRestorePointWhereInput;
import com.smartx.tower.model.BackupServiceWhereInput;
import com.smartx.tower.model.BackupStoreStatus;
import com.smartx.tower.model.BackupStoreType;
import com.smartx.tower.model.EntityAsyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BackupStoreRepositoryWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class BackupStoreRepositoryWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<BackupStoreRepositoryWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<BackupStoreRepositoryWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<BackupStoreRepositoryWhereInput> OR = null;

  public static final String SERIALIZED_NAME_BACKUP_PLANS_EVERY = "backup_plans_every";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_EVERY)
  private BackupPlanWhereInput backupPlansEvery;

  public static final String SERIALIZED_NAME_BACKUP_PLANS_NONE = "backup_plans_none";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_NONE)
  private BackupPlanWhereInput backupPlansNone;

  public static final String SERIALIZED_NAME_BACKUP_PLANS_SOME = "backup_plans_some";
  @SerializedName(SERIALIZED_NAME_BACKUP_PLANS_SOME)
  private BackupPlanWhereInput backupPlansSome;

  public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY = "backup_restore_points_every";
  @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY)
  private BackupRestorePointWhereInput backupRestorePointsEvery;

  public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE = "backup_restore_points_none";
  @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE)
  private BackupRestorePointWhereInput backupRestorePointsNone;

  public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME = "backup_restore_points_some";
  @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME)
  private BackupRestorePointWhereInput backupRestorePointsSome;

  public static final String SERIALIZED_NAME_BACKUP_SERVICE = "backup_service";
  @SerializedName(SERIALIZED_NAME_BACKUP_SERVICE)
  private BackupServiceWhereInput backupService;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
  private String createdAtGt;

  public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
  private String createdAtGte;

  public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
  private List<String> createdAtIn = null;

  public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
  private String createdAtLt;

  public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
  private String createdAtLte;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
  private String createdAtNot;

  public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
  private List<String> createdAtNotIn = null;

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

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS = "description_not_contains";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
  private String descriptionNotContains;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH = "description_not_ends_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
  private String descriptionNotEndsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
  private List<String> descriptionNotIn = null;

  public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH = "description_not_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
  private String descriptionNotStartsWith;

  public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
  private String descriptionStartsWith;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
  private EntityAsyncStatus entityAsyncStatus;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
  private List<EntityAsyncStatus> entityAsyncStatusIn = null;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
  private EntityAsyncStatus entityAsyncStatusNot;

  public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN = "entityAsyncStatus_not_in";
  @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
  private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_CODE_CONTAINS = "error_code_contains";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_CONTAINS)
  private String errorCodeContains;

  public static final String SERIALIZED_NAME_ERROR_CODE_ENDS_WITH = "error_code_ends_with";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_ENDS_WITH)
  private String errorCodeEndsWith;

  public static final String SERIALIZED_NAME_ERROR_CODE_GT = "error_code_gt";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_GT)
  private String errorCodeGt;

  public static final String SERIALIZED_NAME_ERROR_CODE_GTE = "error_code_gte";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_GTE)
  private String errorCodeGte;

  public static final String SERIALIZED_NAME_ERROR_CODE_IN = "error_code_in";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_IN)
  private List<String> errorCodeIn = null;

  public static final String SERIALIZED_NAME_ERROR_CODE_LT = "error_code_lt";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_LT)
  private String errorCodeLt;

  public static final String SERIALIZED_NAME_ERROR_CODE_LTE = "error_code_lte";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_LTE)
  private String errorCodeLte;

  public static final String SERIALIZED_NAME_ERROR_CODE_NOT = "error_code_not";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT)
  private String errorCodeNot;

  public static final String SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS = "error_code_not_contains";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_CONTAINS)
  private String errorCodeNotContains;

  public static final String SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH = "error_code_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_ENDS_WITH)
  private String errorCodeNotEndsWith;

  public static final String SERIALIZED_NAME_ERROR_CODE_NOT_IN = "error_code_not_in";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_IN)
  private List<String> errorCodeNotIn = null;

  public static final String SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH = "error_code_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_NOT_STARTS_WITH)
  private String errorCodeNotStartsWith;

  public static final String SERIALIZED_NAME_ERROR_CODE_STARTS_WITH = "error_code_starts_with";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE_STARTS_WITH)
  private String errorCodeStartsWith;

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

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME = "iscsi_chap_name";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME)
  private String iscsiChapName;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS = "iscsi_chap_name_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_CONTAINS)
  private String iscsiChapNameContains;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH = "iscsi_chap_name_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_ENDS_WITH)
  private String iscsiChapNameEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_GT = "iscsi_chap_name_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_GT)
  private String iscsiChapNameGt;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE = "iscsi_chap_name_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_GTE)
  private String iscsiChapNameGte;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_IN = "iscsi_chap_name_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_IN)
  private List<String> iscsiChapNameIn = null;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_LT = "iscsi_chap_name_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_LT)
  private String iscsiChapNameLt;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE = "iscsi_chap_name_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_LTE)
  private String iscsiChapNameLte;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT = "iscsi_chap_name_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT)
  private String iscsiChapNameNot;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS = "iscsi_chap_name_not_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_CONTAINS)
  private String iscsiChapNameNotContains;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH = "iscsi_chap_name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_ENDS_WITH)
  private String iscsiChapNameNotEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN = "iscsi_chap_name_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_IN)
  private List<String> iscsiChapNameNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH = "iscsi_chap_name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_NOT_STARTS_WITH)
  private String iscsiChapNameNotStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH = "iscsi_chap_name_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_NAME_STARTS_WITH)
  private String iscsiChapNameStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET = "iscsi_chap_secret";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET)
  private String iscsiChapSecret;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS = "iscsi_chap_secret_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_CONTAINS)
  private String iscsiChapSecretContains;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH = "iscsi_chap_secret_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_ENDS_WITH)
  private String iscsiChapSecretEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT = "iscsi_chap_secret_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GT)
  private String iscsiChapSecretGt;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE = "iscsi_chap_secret_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_GTE)
  private String iscsiChapSecretGte;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN = "iscsi_chap_secret_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_IN)
  private List<String> iscsiChapSecretIn = null;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT = "iscsi_chap_secret_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LT)
  private String iscsiChapSecretLt;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE = "iscsi_chap_secret_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_LTE)
  private String iscsiChapSecretLte;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT = "iscsi_chap_secret_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT)
  private String iscsiChapSecretNot;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS = "iscsi_chap_secret_not_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_CONTAINS)
  private String iscsiChapSecretNotContains;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH = "iscsi_chap_secret_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_ENDS_WITH)
  private String iscsiChapSecretNotEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN = "iscsi_chap_secret_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_IN)
  private List<String> iscsiChapSecretNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH = "iscsi_chap_secret_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_NOT_STARTS_WITH)
  private String iscsiChapSecretNotStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH = "iscsi_chap_secret_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_CHAP_SECRET_STARTS_WITH)
  private String iscsiChapSecretStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_IP = "iscsi_ip";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP)
  private String iscsiIp;

  public static final String SERIALIZED_NAME_ISCSI_IP_CONTAINS = "iscsi_ip_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_CONTAINS)
  private String iscsiIpContains;

  public static final String SERIALIZED_NAME_ISCSI_IP_ENDS_WITH = "iscsi_ip_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_ENDS_WITH)
  private String iscsiIpEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_IP_GT = "iscsi_ip_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_GT)
  private String iscsiIpGt;

  public static final String SERIALIZED_NAME_ISCSI_IP_GTE = "iscsi_ip_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_GTE)
  private String iscsiIpGte;

  public static final String SERIALIZED_NAME_ISCSI_IP_IN = "iscsi_ip_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_IN)
  private List<String> iscsiIpIn = null;

  public static final String SERIALIZED_NAME_ISCSI_IP_LT = "iscsi_ip_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_LT)
  private String iscsiIpLt;

  public static final String SERIALIZED_NAME_ISCSI_IP_LTE = "iscsi_ip_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_LTE)
  private String iscsiIpLte;

  public static final String SERIALIZED_NAME_ISCSI_IP_NOT = "iscsi_ip_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT)
  private String iscsiIpNot;

  public static final String SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS = "iscsi_ip_not_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_CONTAINS)
  private String iscsiIpNotContains;

  public static final String SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH = "iscsi_ip_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_ENDS_WITH)
  private String iscsiIpNotEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_IP_NOT_IN = "iscsi_ip_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_IN)
  private List<String> iscsiIpNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH = "iscsi_ip_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_NOT_STARTS_WITH)
  private String iscsiIpNotStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_IP_STARTS_WITH = "iscsi_ip_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_IP_STARTS_WITH)
  private String iscsiIpStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID = "iscsi_lun_id";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID)
  private String iscsiLunId;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS = "iscsi_lun_id_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_CONTAINS)
  private String iscsiLunIdContains;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH = "iscsi_lun_id_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_ENDS_WITH)
  private String iscsiLunIdEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_GT = "iscsi_lun_id_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_GT)
  private String iscsiLunIdGt;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_GTE = "iscsi_lun_id_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_GTE)
  private String iscsiLunIdGte;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_IN = "iscsi_lun_id_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_IN)
  private List<String> iscsiLunIdIn = null;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_LT = "iscsi_lun_id_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_LT)
  private String iscsiLunIdLt;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_LTE = "iscsi_lun_id_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_LTE)
  private String iscsiLunIdLte;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT = "iscsi_lun_id_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT)
  private String iscsiLunIdNot;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS = "iscsi_lun_id_not_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_CONTAINS)
  private String iscsiLunIdNotContains;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH = "iscsi_lun_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_ENDS_WITH)
  private String iscsiLunIdNotEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN = "iscsi_lun_id_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_IN)
  private List<String> iscsiLunIdNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH = "iscsi_lun_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_NOT_STARTS_WITH)
  private String iscsiLunIdNotStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH = "iscsi_lun_id_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_LUN_ID_STARTS_WITH)
  private String iscsiLunIdStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_PORT = "iscsi_port";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT)
  private Integer iscsiPort;

  public static final String SERIALIZED_NAME_ISCSI_PORT_GT = "iscsi_port_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT_GT)
  private Integer iscsiPortGt;

  public static final String SERIALIZED_NAME_ISCSI_PORT_GTE = "iscsi_port_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT_GTE)
  private Integer iscsiPortGte;

  public static final String SERIALIZED_NAME_ISCSI_PORT_IN = "iscsi_port_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT_IN)
  private List<Integer> iscsiPortIn = null;

  public static final String SERIALIZED_NAME_ISCSI_PORT_LT = "iscsi_port_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT_LT)
  private Integer iscsiPortLt;

  public static final String SERIALIZED_NAME_ISCSI_PORT_LTE = "iscsi_port_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT_LTE)
  private Integer iscsiPortLte;

  public static final String SERIALIZED_NAME_ISCSI_PORT_NOT = "iscsi_port_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT)
  private Integer iscsiPortNot;

  public static final String SERIALIZED_NAME_ISCSI_PORT_NOT_IN = "iscsi_port_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_PORT_NOT_IN)
  private List<Integer> iscsiPortNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN = "iscsi_target_iqn";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN)
  private String iscsiTargetIqn;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS = "iscsi_target_iqn_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_CONTAINS)
  private String iscsiTargetIqnContains;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH = "iscsi_target_iqn_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_ENDS_WITH)
  private String iscsiTargetIqnEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_GT = "iscsi_target_iqn_gt";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_GT)
  private String iscsiTargetIqnGt;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE = "iscsi_target_iqn_gte";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_GTE)
  private String iscsiTargetIqnGte;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_IN = "iscsi_target_iqn_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_IN)
  private List<String> iscsiTargetIqnIn = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_LT = "iscsi_target_iqn_lt";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_LT)
  private String iscsiTargetIqnLt;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE = "iscsi_target_iqn_lte";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_LTE)
  private String iscsiTargetIqnLte;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT = "iscsi_target_iqn_not";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT)
  private String iscsiTargetIqnNot;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS = "iscsi_target_iqn_not_contains";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_CONTAINS)
  private String iscsiTargetIqnNotContains;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH = "iscsi_target_iqn_not_ends_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_ENDS_WITH)
  private String iscsiTargetIqnNotEndsWith;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN = "iscsi_target_iqn_not_in";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_IN)
  private List<String> iscsiTargetIqnNotIn = null;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH = "iscsi_target_iqn_not_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_NOT_STARTS_WITH)
  private String iscsiTargetIqnNotStartsWith;

  public static final String SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH = "iscsi_target_iqn_starts_with";
  @SerializedName(SERIALIZED_NAME_ISCSI_TARGET_IQN_STARTS_WITH)
  private String iscsiTargetIqnStartsWith;

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

  public static final String SERIALIZED_NAME_NFS_PATH = "nfs_path";
  @SerializedName(SERIALIZED_NAME_NFS_PATH)
  private String nfsPath;

  public static final String SERIALIZED_NAME_NFS_PATH_CONTAINS = "nfs_path_contains";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_CONTAINS)
  private String nfsPathContains;

  public static final String SERIALIZED_NAME_NFS_PATH_ENDS_WITH = "nfs_path_ends_with";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_ENDS_WITH)
  private String nfsPathEndsWith;

  public static final String SERIALIZED_NAME_NFS_PATH_GT = "nfs_path_gt";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_GT)
  private String nfsPathGt;

  public static final String SERIALIZED_NAME_NFS_PATH_GTE = "nfs_path_gte";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_GTE)
  private String nfsPathGte;

  public static final String SERIALIZED_NAME_NFS_PATH_IN = "nfs_path_in";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_IN)
  private List<String> nfsPathIn = null;

  public static final String SERIALIZED_NAME_NFS_PATH_LT = "nfs_path_lt";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_LT)
  private String nfsPathLt;

  public static final String SERIALIZED_NAME_NFS_PATH_LTE = "nfs_path_lte";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_LTE)
  private String nfsPathLte;

  public static final String SERIALIZED_NAME_NFS_PATH_NOT = "nfs_path_not";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT)
  private String nfsPathNot;

  public static final String SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS = "nfs_path_not_contains";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_CONTAINS)
  private String nfsPathNotContains;

  public static final String SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH = "nfs_path_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_ENDS_WITH)
  private String nfsPathNotEndsWith;

  public static final String SERIALIZED_NAME_NFS_PATH_NOT_IN = "nfs_path_not_in";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_IN)
  private List<String> nfsPathNotIn = null;

  public static final String SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH = "nfs_path_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_NOT_STARTS_WITH)
  private String nfsPathNotStartsWith;

  public static final String SERIALIZED_NAME_NFS_PATH_STARTS_WITH = "nfs_path_starts_with";
  @SerializedName(SERIALIZED_NAME_NFS_PATH_STARTS_WITH)
  private String nfsPathStartsWith;

  public static final String SERIALIZED_NAME_NFS_SERVER = "nfs_server";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER)
  private String nfsServer;

  public static final String SERIALIZED_NAME_NFS_SERVER_CONTAINS = "nfs_server_contains";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_CONTAINS)
  private String nfsServerContains;

  public static final String SERIALIZED_NAME_NFS_SERVER_ENDS_WITH = "nfs_server_ends_with";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_ENDS_WITH)
  private String nfsServerEndsWith;

  public static final String SERIALIZED_NAME_NFS_SERVER_GT = "nfs_server_gt";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_GT)
  private String nfsServerGt;

  public static final String SERIALIZED_NAME_NFS_SERVER_GTE = "nfs_server_gte";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_GTE)
  private String nfsServerGte;

  public static final String SERIALIZED_NAME_NFS_SERVER_IN = "nfs_server_in";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_IN)
  private List<String> nfsServerIn = null;

  public static final String SERIALIZED_NAME_NFS_SERVER_LT = "nfs_server_lt";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_LT)
  private String nfsServerLt;

  public static final String SERIALIZED_NAME_NFS_SERVER_LTE = "nfs_server_lte";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_LTE)
  private String nfsServerLte;

  public static final String SERIALIZED_NAME_NFS_SERVER_NOT = "nfs_server_not";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT)
  private String nfsServerNot;

  public static final String SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS = "nfs_server_not_contains";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_CONTAINS)
  private String nfsServerNotContains;

  public static final String SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH = "nfs_server_not_ends_with";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_ENDS_WITH)
  private String nfsServerNotEndsWith;

  public static final String SERIALIZED_NAME_NFS_SERVER_NOT_IN = "nfs_server_not_in";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_IN)
  private List<String> nfsServerNotIn = null;

  public static final String SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH = "nfs_server_not_starts_with";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_NOT_STARTS_WITH)
  private String nfsServerNotStartsWith;

  public static final String SERIALIZED_NAME_NFS_SERVER_STARTS_WITH = "nfs_server_starts_with";
  @SerializedName(SERIALIZED_NAME_NFS_SERVER_STARTS_WITH)
  private String nfsServerStartsWith;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BackupStoreStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<BackupStoreStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private BackupStoreStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<BackupStoreStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY = "total_capacity";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY)
  private Long totalCapacity;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY_GT = "total_capacity_gt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_GT)
  private Long totalCapacityGt;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY_GTE = "total_capacity_gte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_GTE)
  private Long totalCapacityGte;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY_IN = "total_capacity_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_IN)
  private List<Long> totalCapacityIn = null;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY_LT = "total_capacity_lt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_LT)
  private Long totalCapacityLt;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY_LTE = "total_capacity_lte";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_LTE)
  private Long totalCapacityLte;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY_NOT = "total_capacity_not";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_NOT)
  private Long totalCapacityNot;

  public static final String SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN = "total_capacity_not_in";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPACITY_NOT_IN)
  private List<Long> totalCapacityNotIn = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BackupStoreType type;

  public static final String SERIALIZED_NAME_TYPE_IN = "type_in";
  @SerializedName(SERIALIZED_NAME_TYPE_IN)
  private List<BackupStoreType> typeIn = null;

  public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT)
  private BackupStoreType typeNot;

  public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
  private List<BackupStoreType> typeNotIn = null;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP = "update_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP)
  private String updateTimestamp;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS = "update_timestamp_contains";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_CONTAINS)
  private String updateTimestampContains;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH = "update_timestamp_ends_with";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_ENDS_WITH)
  private String updateTimestampEndsWith;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_GT = "update_timestamp_gt";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_GT)
  private String updateTimestampGt;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE = "update_timestamp_gte";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_GTE)
  private String updateTimestampGte;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_IN = "update_timestamp_in";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_IN)
  private List<String> updateTimestampIn = null;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_LT = "update_timestamp_lt";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_LT)
  private String updateTimestampLt;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE = "update_timestamp_lte";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_LTE)
  private String updateTimestampLte;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT = "update_timestamp_not";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT)
  private String updateTimestampNot;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS = "update_timestamp_not_contains";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_CONTAINS)
  private String updateTimestampNotContains;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH = "update_timestamp_not_ends_with";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_ENDS_WITH)
  private String updateTimestampNotEndsWith;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN = "update_timestamp_not_in";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_IN)
  private List<String> updateTimestampNotIn = null;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH = "update_timestamp_not_starts_with";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_NOT_STARTS_WITH)
  private String updateTimestampNotStartsWith;

  public static final String SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH = "update_timestamp_starts_with";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIMESTAMP_STARTS_WITH)
  private String updateTimestampStartsWith;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
  private Long usedDataSpace;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_GT = "used_data_space_gt";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GT)
  private Long usedDataSpaceGt;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_GTE = "used_data_space_gte";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_GTE)
  private Long usedDataSpaceGte;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_IN = "used_data_space_in";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_IN)
  private List<Long> usedDataSpaceIn = null;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_LT = "used_data_space_lt";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LT)
  private Long usedDataSpaceLt;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_LTE = "used_data_space_lte";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_LTE)
  private Long usedDataSpaceLte;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT = "used_data_space_not";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT)
  private Long usedDataSpaceNot;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN = "used_data_space_not_in";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_NOT_IN)
  private List<Long> usedDataSpaceNotIn = null;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE = "used_data_space_usage";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE)
  private Double usedDataSpaceUsage;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT = "used_data_space_usage_gt";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GT)
  private Double usedDataSpaceUsageGt;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE = "used_data_space_usage_gte";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_GTE)
  private Double usedDataSpaceUsageGte;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN = "used_data_space_usage_in";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_IN)
  private List<Double> usedDataSpaceUsageIn = null;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT = "used_data_space_usage_lt";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LT)
  private Double usedDataSpaceUsageLt;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE = "used_data_space_usage_lte";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_LTE)
  private Double usedDataSpaceUsageLte;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT = "used_data_space_usage_not";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT)
  private Double usedDataSpaceUsageNot;

  public static final String SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN = "used_data_space_usage_not_in";
  @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE_USAGE_NOT_IN)
  private List<Double> usedDataSpaceUsageNotIn = null;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
  private Long validDataSpace;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GT = "valid_data_space_gt";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GT)
  private Long validDataSpaceGt;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE_GTE = "valid_data_space_gte";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_GTE)
  private Long validDataSpaceGte;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE_IN = "valid_data_space_in";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_IN)
  private List<Long> validDataSpaceIn = null;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LT = "valid_data_space_lt";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LT)
  private Long validDataSpaceLt;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE_LTE = "valid_data_space_lte";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_LTE)
  private Long validDataSpaceLte;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT = "valid_data_space_not";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT)
  private Long validDataSpaceNot;

  public static final String SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN = "valid_data_space_not_in";
  @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE_NOT_IN)
  private List<Long> validDataSpaceNotIn = null;

  public BackupStoreRepositoryWhereInput() { 
  }

  public BackupStoreRepositoryWhereInput AND(List<BackupStoreRepositoryWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public BackupStoreRepositoryWhereInput addANDItem(BackupStoreRepositoryWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<BackupStoreRepositoryWhereInput>();
    }
    this.AND.add(ANDItem);
    return this;
  }

   /**
   * Get AND
   * @return AND
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupStoreRepositoryWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<BackupStoreRepositoryWhereInput> AND) {
    this.AND = AND;
  }


  public BackupStoreRepositoryWhereInput NOT(List<BackupStoreRepositoryWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public BackupStoreRepositoryWhereInput addNOTItem(BackupStoreRepositoryWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<BackupStoreRepositoryWhereInput>();
    }
    this.NOT.add(NOTItem);
    return this;
  }

   /**
   * Get NOT
   * @return NOT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupStoreRepositoryWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<BackupStoreRepositoryWhereInput> NOT) {
    this.NOT = NOT;
  }


  public BackupStoreRepositoryWhereInput OR(List<BackupStoreRepositoryWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public BackupStoreRepositoryWhereInput addORItem(BackupStoreRepositoryWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<BackupStoreRepositoryWhereInput>();
    }
    this.OR.add(ORItem);
    return this;
  }

   /**
   * Get OR
   * @return OR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupStoreRepositoryWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<BackupStoreRepositoryWhereInput> OR) {
    this.OR = OR;
  }


  public BackupStoreRepositoryWhereInput backupPlansEvery(BackupPlanWhereInput backupPlansEvery) {
    
    this.backupPlansEvery = backupPlansEvery;
    return this;
  }

   /**
   * Get backupPlansEvery
   * @return backupPlansEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanWhereInput getBackupPlansEvery() {
    return backupPlansEvery;
  }


  public void setBackupPlansEvery(BackupPlanWhereInput backupPlansEvery) {
    this.backupPlansEvery = backupPlansEvery;
  }


  public BackupStoreRepositoryWhereInput backupPlansNone(BackupPlanWhereInput backupPlansNone) {
    
    this.backupPlansNone = backupPlansNone;
    return this;
  }

   /**
   * Get backupPlansNone
   * @return backupPlansNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanWhereInput getBackupPlansNone() {
    return backupPlansNone;
  }


  public void setBackupPlansNone(BackupPlanWhereInput backupPlansNone) {
    this.backupPlansNone = backupPlansNone;
  }


  public BackupStoreRepositoryWhereInput backupPlansSome(BackupPlanWhereInput backupPlansSome) {
    
    this.backupPlansSome = backupPlansSome;
    return this;
  }

   /**
   * Get backupPlansSome
   * @return backupPlansSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupPlanWhereInput getBackupPlansSome() {
    return backupPlansSome;
  }


  public void setBackupPlansSome(BackupPlanWhereInput backupPlansSome) {
    this.backupPlansSome = backupPlansSome;
  }


  public BackupStoreRepositoryWhereInput backupRestorePointsEvery(BackupRestorePointWhereInput backupRestorePointsEvery) {
    
    this.backupRestorePointsEvery = backupRestorePointsEvery;
    return this;
  }

   /**
   * Get backupRestorePointsEvery
   * @return backupRestorePointsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupRestorePointWhereInput getBackupRestorePointsEvery() {
    return backupRestorePointsEvery;
  }


  public void setBackupRestorePointsEvery(BackupRestorePointWhereInput backupRestorePointsEvery) {
    this.backupRestorePointsEvery = backupRestorePointsEvery;
  }


  public BackupStoreRepositoryWhereInput backupRestorePointsNone(BackupRestorePointWhereInput backupRestorePointsNone) {
    
    this.backupRestorePointsNone = backupRestorePointsNone;
    return this;
  }

   /**
   * Get backupRestorePointsNone
   * @return backupRestorePointsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupRestorePointWhereInput getBackupRestorePointsNone() {
    return backupRestorePointsNone;
  }


  public void setBackupRestorePointsNone(BackupRestorePointWhereInput backupRestorePointsNone) {
    this.backupRestorePointsNone = backupRestorePointsNone;
  }


  public BackupStoreRepositoryWhereInput backupRestorePointsSome(BackupRestorePointWhereInput backupRestorePointsSome) {
    
    this.backupRestorePointsSome = backupRestorePointsSome;
    return this;
  }

   /**
   * Get backupRestorePointsSome
   * @return backupRestorePointsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupRestorePointWhereInput getBackupRestorePointsSome() {
    return backupRestorePointsSome;
  }


  public void setBackupRestorePointsSome(BackupRestorePointWhereInput backupRestorePointsSome) {
    this.backupRestorePointsSome = backupRestorePointsSome;
  }


  public BackupStoreRepositoryWhereInput backupService(BackupServiceWhereInput backupService) {
    
    this.backupService = backupService;
    return this;
  }

   /**
   * Get backupService
   * @return backupService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupServiceWhereInput getBackupService() {
    return backupService;
  }


  public void setBackupService(BackupServiceWhereInput backupService) {
    this.backupService = backupService;
  }


  public BackupStoreRepositoryWhereInput createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public BackupStoreRepositoryWhereInput createdAtGt(String createdAtGt) {
    
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * Get createdAtGt
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGt() {
    return createdAtGt;
  }


  public void setCreatedAtGt(String createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  public BackupStoreRepositoryWhereInput createdAtGte(String createdAtGte) {
    
    this.createdAtGte = createdAtGte;
    return this;
  }

   /**
   * Get createdAtGte
   * @return createdAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtGte() {
    return createdAtGte;
  }


  public void setCreatedAtGte(String createdAtGte) {
    this.createdAtGte = createdAtGte;
  }


  public BackupStoreRepositoryWhereInput createdAtIn(List<String> createdAtIn) {
    
    this.createdAtIn = createdAtIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addCreatedAtInItem(String createdAtInItem) {
    if (this.createdAtIn == null) {
      this.createdAtIn = new ArrayList<String>();
    }
    this.createdAtIn.add(createdAtInItem);
    return this;
  }

   /**
   * Get createdAtIn
   * @return createdAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtIn() {
    return createdAtIn;
  }


  public void setCreatedAtIn(List<String> createdAtIn) {
    this.createdAtIn = createdAtIn;
  }


  public BackupStoreRepositoryWhereInput createdAtLt(String createdAtLt) {
    
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * Get createdAtLt
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLt() {
    return createdAtLt;
  }


  public void setCreatedAtLt(String createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public BackupStoreRepositoryWhereInput createdAtLte(String createdAtLte) {
    
    this.createdAtLte = createdAtLte;
    return this;
  }

   /**
   * Get createdAtLte
   * @return createdAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtLte() {
    return createdAtLte;
  }


  public void setCreatedAtLte(String createdAtLte) {
    this.createdAtLte = createdAtLte;
  }


  public BackupStoreRepositoryWhereInput createdAtNot(String createdAtNot) {
    
    this.createdAtNot = createdAtNot;
    return this;
  }

   /**
   * Get createdAtNot
   * @return createdAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAtNot() {
    return createdAtNot;
  }


  public void setCreatedAtNot(String createdAtNot) {
    this.createdAtNot = createdAtNot;
  }


  public BackupStoreRepositoryWhereInput createdAtNotIn(List<String> createdAtNotIn) {
    
    this.createdAtNotIn = createdAtNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
    if (this.createdAtNotIn == null) {
      this.createdAtNotIn = new ArrayList<String>();
    }
    this.createdAtNotIn.add(createdAtNotInItem);
    return this;
  }

   /**
   * Get createdAtNotIn
   * @return createdAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCreatedAtNotIn() {
    return createdAtNotIn;
  }


  public void setCreatedAtNotIn(List<String> createdAtNotIn) {
    this.createdAtNotIn = createdAtNotIn;
  }


  public BackupStoreRepositoryWhereInput description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BackupStoreRepositoryWhereInput descriptionContains(String descriptionContains) {
    
    this.descriptionContains = descriptionContains;
    return this;
  }

   /**
   * Get descriptionContains
   * @return descriptionContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionContains() {
    return descriptionContains;
  }


  public void setDescriptionContains(String descriptionContains) {
    this.descriptionContains = descriptionContains;
  }


  public BackupStoreRepositoryWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
    this.descriptionEndsWith = descriptionEndsWith;
    return this;
  }

   /**
   * Get descriptionEndsWith
   * @return descriptionEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionEndsWith() {
    return descriptionEndsWith;
  }


  public void setDescriptionEndsWith(String descriptionEndsWith) {
    this.descriptionEndsWith = descriptionEndsWith;
  }


  public BackupStoreRepositoryWhereInput descriptionGt(String descriptionGt) {
    
    this.descriptionGt = descriptionGt;
    return this;
  }

   /**
   * Get descriptionGt
   * @return descriptionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGt() {
    return descriptionGt;
  }


  public void setDescriptionGt(String descriptionGt) {
    this.descriptionGt = descriptionGt;
  }


  public BackupStoreRepositoryWhereInput descriptionGte(String descriptionGte) {
    
    this.descriptionGte = descriptionGte;
    return this;
  }

   /**
   * Get descriptionGte
   * @return descriptionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionGte() {
    return descriptionGte;
  }


  public void setDescriptionGte(String descriptionGte) {
    this.descriptionGte = descriptionGte;
  }


  public BackupStoreRepositoryWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addDescriptionInItem(String descriptionInItem) {
    if (this.descriptionIn == null) {
      this.descriptionIn = new ArrayList<String>();
    }
    this.descriptionIn.add(descriptionInItem);
    return this;
  }

   /**
   * Get descriptionIn
   * @return descriptionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionIn() {
    return descriptionIn;
  }


  public void setDescriptionIn(List<String> descriptionIn) {
    this.descriptionIn = descriptionIn;
  }


  public BackupStoreRepositoryWhereInput descriptionLt(String descriptionLt) {
    
    this.descriptionLt = descriptionLt;
    return this;
  }

   /**
   * Get descriptionLt
   * @return descriptionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLt() {
    return descriptionLt;
  }


  public void setDescriptionLt(String descriptionLt) {
    this.descriptionLt = descriptionLt;
  }


  public BackupStoreRepositoryWhereInput descriptionLte(String descriptionLte) {
    
    this.descriptionLte = descriptionLte;
    return this;
  }

   /**
   * Get descriptionLte
   * @return descriptionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionLte() {
    return descriptionLte;
  }


  public void setDescriptionLte(String descriptionLte) {
    this.descriptionLte = descriptionLte;
  }


  public BackupStoreRepositoryWhereInput descriptionNot(String descriptionNot) {
    
    this.descriptionNot = descriptionNot;
    return this;
  }

   /**
   * Get descriptionNot
   * @return descriptionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNot() {
    return descriptionNot;
  }


  public void setDescriptionNot(String descriptionNot) {
    this.descriptionNot = descriptionNot;
  }


  public BackupStoreRepositoryWhereInput descriptionNotContains(String descriptionNotContains) {
    
    this.descriptionNotContains = descriptionNotContains;
    return this;
  }

   /**
   * Get descriptionNotContains
   * @return descriptionNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotContains() {
    return descriptionNotContains;
  }


  public void setDescriptionNotContains(String descriptionNotContains) {
    this.descriptionNotContains = descriptionNotContains;
  }


  public BackupStoreRepositoryWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
    this.descriptionNotEndsWith = descriptionNotEndsWith;
    return this;
  }

   /**
   * Get descriptionNotEndsWith
   * @return descriptionNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotEndsWith() {
    return descriptionNotEndsWith;
  }


  public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
    this.descriptionNotEndsWith = descriptionNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
    if (this.descriptionNotIn == null) {
      this.descriptionNotIn = new ArrayList<String>();
    }
    this.descriptionNotIn.add(descriptionNotInItem);
    return this;
  }

   /**
   * Get descriptionNotIn
   * @return descriptionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDescriptionNotIn() {
    return descriptionNotIn;
  }


  public void setDescriptionNotIn(List<String> descriptionNotIn) {
    this.descriptionNotIn = descriptionNotIn;
  }


  public BackupStoreRepositoryWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
    this.descriptionNotStartsWith = descriptionNotStartsWith;
    return this;
  }

   /**
   * Get descriptionNotStartsWith
   * @return descriptionNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionNotStartsWith() {
    return descriptionNotStartsWith;
  }


  public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
    this.descriptionNotStartsWith = descriptionNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
    this.descriptionStartsWith = descriptionStartsWith;
    return this;
  }

   /**
   * Get descriptionStartsWith
   * @return descriptionStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptionStartsWith() {
    return descriptionStartsWith;
  }


  public void setDescriptionStartsWith(String descriptionStartsWith) {
    this.descriptionStartsWith = descriptionStartsWith;
  }


  public BackupStoreRepositoryWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
    this.entityAsyncStatus = entityAsyncStatus;
    return this;
  }

   /**
   * Get entityAsyncStatus
   * @return entityAsyncStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatus() {
    return entityAsyncStatus;
  }


  public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    this.entityAsyncStatus = entityAsyncStatus;
  }


  public BackupStoreRepositoryWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
    if (this.entityAsyncStatusIn == null) {
      this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusIn
   * @return entityAsyncStatusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
    return entityAsyncStatusIn;
  }


  public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    this.entityAsyncStatusIn = entityAsyncStatusIn;
  }


  public BackupStoreRepositoryWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
    this.entityAsyncStatusNot = entityAsyncStatusNot;
    return this;
  }

   /**
   * Get entityAsyncStatusNot
   * @return entityAsyncStatusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityAsyncStatus getEntityAsyncStatusNot() {
    return entityAsyncStatusNot;
  }


  public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    this.entityAsyncStatusNot = entityAsyncStatusNot;
  }


  public BackupStoreRepositoryWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
    if (this.entityAsyncStatusNotIn == null) {
      this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
    }
    this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
    return this;
  }

   /**
   * Get entityAsyncStatusNotIn
   * @return entityAsyncStatusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
    return entityAsyncStatusNotIn;
  }


  public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
  }


  public BackupStoreRepositoryWhereInput errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public BackupStoreRepositoryWhereInput errorCodeContains(String errorCodeContains) {
    
    this.errorCodeContains = errorCodeContains;
    return this;
  }

   /**
   * Get errorCodeContains
   * @return errorCodeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeContains() {
    return errorCodeContains;
  }


  public void setErrorCodeContains(String errorCodeContains) {
    this.errorCodeContains = errorCodeContains;
  }


  public BackupStoreRepositoryWhereInput errorCodeEndsWith(String errorCodeEndsWith) {
    
    this.errorCodeEndsWith = errorCodeEndsWith;
    return this;
  }

   /**
   * Get errorCodeEndsWith
   * @return errorCodeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeEndsWith() {
    return errorCodeEndsWith;
  }


  public void setErrorCodeEndsWith(String errorCodeEndsWith) {
    this.errorCodeEndsWith = errorCodeEndsWith;
  }


  public BackupStoreRepositoryWhereInput errorCodeGt(String errorCodeGt) {
    
    this.errorCodeGt = errorCodeGt;
    return this;
  }

   /**
   * Get errorCodeGt
   * @return errorCodeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeGt() {
    return errorCodeGt;
  }


  public void setErrorCodeGt(String errorCodeGt) {
    this.errorCodeGt = errorCodeGt;
  }


  public BackupStoreRepositoryWhereInput errorCodeGte(String errorCodeGte) {
    
    this.errorCodeGte = errorCodeGte;
    return this;
  }

   /**
   * Get errorCodeGte
   * @return errorCodeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeGte() {
    return errorCodeGte;
  }


  public void setErrorCodeGte(String errorCodeGte) {
    this.errorCodeGte = errorCodeGte;
  }


  public BackupStoreRepositoryWhereInput errorCodeIn(List<String> errorCodeIn) {
    
    this.errorCodeIn = errorCodeIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addErrorCodeInItem(String errorCodeInItem) {
    if (this.errorCodeIn == null) {
      this.errorCodeIn = new ArrayList<String>();
    }
    this.errorCodeIn.add(errorCodeInItem);
    return this;
  }

   /**
   * Get errorCodeIn
   * @return errorCodeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getErrorCodeIn() {
    return errorCodeIn;
  }


  public void setErrorCodeIn(List<String> errorCodeIn) {
    this.errorCodeIn = errorCodeIn;
  }


  public BackupStoreRepositoryWhereInput errorCodeLt(String errorCodeLt) {
    
    this.errorCodeLt = errorCodeLt;
    return this;
  }

   /**
   * Get errorCodeLt
   * @return errorCodeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeLt() {
    return errorCodeLt;
  }


  public void setErrorCodeLt(String errorCodeLt) {
    this.errorCodeLt = errorCodeLt;
  }


  public BackupStoreRepositoryWhereInput errorCodeLte(String errorCodeLte) {
    
    this.errorCodeLte = errorCodeLte;
    return this;
  }

   /**
   * Get errorCodeLte
   * @return errorCodeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeLte() {
    return errorCodeLte;
  }


  public void setErrorCodeLte(String errorCodeLte) {
    this.errorCodeLte = errorCodeLte;
  }


  public BackupStoreRepositoryWhereInput errorCodeNot(String errorCodeNot) {
    
    this.errorCodeNot = errorCodeNot;
    return this;
  }

   /**
   * Get errorCodeNot
   * @return errorCodeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeNot() {
    return errorCodeNot;
  }


  public void setErrorCodeNot(String errorCodeNot) {
    this.errorCodeNot = errorCodeNot;
  }


  public BackupStoreRepositoryWhereInput errorCodeNotContains(String errorCodeNotContains) {
    
    this.errorCodeNotContains = errorCodeNotContains;
    return this;
  }

   /**
   * Get errorCodeNotContains
   * @return errorCodeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeNotContains() {
    return errorCodeNotContains;
  }


  public void setErrorCodeNotContains(String errorCodeNotContains) {
    this.errorCodeNotContains = errorCodeNotContains;
  }


  public BackupStoreRepositoryWhereInput errorCodeNotEndsWith(String errorCodeNotEndsWith) {
    
    this.errorCodeNotEndsWith = errorCodeNotEndsWith;
    return this;
  }

   /**
   * Get errorCodeNotEndsWith
   * @return errorCodeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeNotEndsWith() {
    return errorCodeNotEndsWith;
  }


  public void setErrorCodeNotEndsWith(String errorCodeNotEndsWith) {
    this.errorCodeNotEndsWith = errorCodeNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput errorCodeNotIn(List<String> errorCodeNotIn) {
    
    this.errorCodeNotIn = errorCodeNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addErrorCodeNotInItem(String errorCodeNotInItem) {
    if (this.errorCodeNotIn == null) {
      this.errorCodeNotIn = new ArrayList<String>();
    }
    this.errorCodeNotIn.add(errorCodeNotInItem);
    return this;
  }

   /**
   * Get errorCodeNotIn
   * @return errorCodeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getErrorCodeNotIn() {
    return errorCodeNotIn;
  }


  public void setErrorCodeNotIn(List<String> errorCodeNotIn) {
    this.errorCodeNotIn = errorCodeNotIn;
  }


  public BackupStoreRepositoryWhereInput errorCodeNotStartsWith(String errorCodeNotStartsWith) {
    
    this.errorCodeNotStartsWith = errorCodeNotStartsWith;
    return this;
  }

   /**
   * Get errorCodeNotStartsWith
   * @return errorCodeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeNotStartsWith() {
    return errorCodeNotStartsWith;
  }


  public void setErrorCodeNotStartsWith(String errorCodeNotStartsWith) {
    this.errorCodeNotStartsWith = errorCodeNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput errorCodeStartsWith(String errorCodeStartsWith) {
    
    this.errorCodeStartsWith = errorCodeStartsWith;
    return this;
  }

   /**
   * Get errorCodeStartsWith
   * @return errorCodeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorCodeStartsWith() {
    return errorCodeStartsWith;
  }


  public void setErrorCodeStartsWith(String errorCodeStartsWith) {
    this.errorCodeStartsWith = errorCodeStartsWith;
  }


  public BackupStoreRepositoryWhereInput id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BackupStoreRepositoryWhereInput idContains(String idContains) {
    
    this.idContains = idContains;
    return this;
  }

   /**
   * Get idContains
   * @return idContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdContains() {
    return idContains;
  }


  public void setIdContains(String idContains) {
    this.idContains = idContains;
  }


  public BackupStoreRepositoryWhereInput idEndsWith(String idEndsWith) {
    
    this.idEndsWith = idEndsWith;
    return this;
  }

   /**
   * Get idEndsWith
   * @return idEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdEndsWith() {
    return idEndsWith;
  }


  public void setIdEndsWith(String idEndsWith) {
    this.idEndsWith = idEndsWith;
  }


  public BackupStoreRepositoryWhereInput idGt(String idGt) {
    
    this.idGt = idGt;
    return this;
  }

   /**
   * Get idGt
   * @return idGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGt() {
    return idGt;
  }


  public void setIdGt(String idGt) {
    this.idGt = idGt;
  }


  public BackupStoreRepositoryWhereInput idGte(String idGte) {
    
    this.idGte = idGte;
    return this;
  }

   /**
   * Get idGte
   * @return idGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdGte() {
    return idGte;
  }


  public void setIdGte(String idGte) {
    this.idGte = idGte;
  }


  public BackupStoreRepositoryWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIdInItem(String idInItem) {
    if (this.idIn == null) {
      this.idIn = new ArrayList<String>();
    }
    this.idIn.add(idInItem);
    return this;
  }

   /**
   * Get idIn
   * @return idIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdIn() {
    return idIn;
  }


  public void setIdIn(List<String> idIn) {
    this.idIn = idIn;
  }


  public BackupStoreRepositoryWhereInput idLt(String idLt) {
    
    this.idLt = idLt;
    return this;
  }

   /**
   * Get idLt
   * @return idLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLt() {
    return idLt;
  }


  public void setIdLt(String idLt) {
    this.idLt = idLt;
  }


  public BackupStoreRepositoryWhereInput idLte(String idLte) {
    
    this.idLte = idLte;
    return this;
  }

   /**
   * Get idLte
   * @return idLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdLte() {
    return idLte;
  }


  public void setIdLte(String idLte) {
    this.idLte = idLte;
  }


  public BackupStoreRepositoryWhereInput idNot(String idNot) {
    
    this.idNot = idNot;
    return this;
  }

   /**
   * Get idNot
   * @return idNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNot() {
    return idNot;
  }


  public void setIdNot(String idNot) {
    this.idNot = idNot;
  }


  public BackupStoreRepositoryWhereInput idNotContains(String idNotContains) {
    
    this.idNotContains = idNotContains;
    return this;
  }

   /**
   * Get idNotContains
   * @return idNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotContains() {
    return idNotContains;
  }


  public void setIdNotContains(String idNotContains) {
    this.idNotContains = idNotContains;
  }


  public BackupStoreRepositoryWhereInput idNotEndsWith(String idNotEndsWith) {
    
    this.idNotEndsWith = idNotEndsWith;
    return this;
  }

   /**
   * Get idNotEndsWith
   * @return idNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotEndsWith() {
    return idNotEndsWith;
  }


  public void setIdNotEndsWith(String idNotEndsWith) {
    this.idNotEndsWith = idNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIdNotInItem(String idNotInItem) {
    if (this.idNotIn == null) {
      this.idNotIn = new ArrayList<String>();
    }
    this.idNotIn.add(idNotInItem);
    return this;
  }

   /**
   * Get idNotIn
   * @return idNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIdNotIn() {
    return idNotIn;
  }


  public void setIdNotIn(List<String> idNotIn) {
    this.idNotIn = idNotIn;
  }


  public BackupStoreRepositoryWhereInput idNotStartsWith(String idNotStartsWith) {
    
    this.idNotStartsWith = idNotStartsWith;
    return this;
  }

   /**
   * Get idNotStartsWith
   * @return idNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdNotStartsWith() {
    return idNotStartsWith;
  }


  public void setIdNotStartsWith(String idNotStartsWith) {
    this.idNotStartsWith = idNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput idStartsWith(String idStartsWith) {
    
    this.idStartsWith = idStartsWith;
    return this;
  }

   /**
   * Get idStartsWith
   * @return idStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdStartsWith() {
    return idStartsWith;
  }


  public void setIdStartsWith(String idStartsWith) {
    this.idStartsWith = idStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapName(String iscsiChapName) {
    
    this.iscsiChapName = iscsiChapName;
    return this;
  }

   /**
   * Get iscsiChapName
   * @return iscsiChapName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapName() {
    return iscsiChapName;
  }


  public void setIscsiChapName(String iscsiChapName) {
    this.iscsiChapName = iscsiChapName;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameContains(String iscsiChapNameContains) {
    
    this.iscsiChapNameContains = iscsiChapNameContains;
    return this;
  }

   /**
   * Get iscsiChapNameContains
   * @return iscsiChapNameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameContains() {
    return iscsiChapNameContains;
  }


  public void setIscsiChapNameContains(String iscsiChapNameContains) {
    this.iscsiChapNameContains = iscsiChapNameContains;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameEndsWith(String iscsiChapNameEndsWith) {
    
    this.iscsiChapNameEndsWith = iscsiChapNameEndsWith;
    return this;
  }

   /**
   * Get iscsiChapNameEndsWith
   * @return iscsiChapNameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameEndsWith() {
    return iscsiChapNameEndsWith;
  }


  public void setIscsiChapNameEndsWith(String iscsiChapNameEndsWith) {
    this.iscsiChapNameEndsWith = iscsiChapNameEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameGt(String iscsiChapNameGt) {
    
    this.iscsiChapNameGt = iscsiChapNameGt;
    return this;
  }

   /**
   * Get iscsiChapNameGt
   * @return iscsiChapNameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameGt() {
    return iscsiChapNameGt;
  }


  public void setIscsiChapNameGt(String iscsiChapNameGt) {
    this.iscsiChapNameGt = iscsiChapNameGt;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameGte(String iscsiChapNameGte) {
    
    this.iscsiChapNameGte = iscsiChapNameGte;
    return this;
  }

   /**
   * Get iscsiChapNameGte
   * @return iscsiChapNameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameGte() {
    return iscsiChapNameGte;
  }


  public void setIscsiChapNameGte(String iscsiChapNameGte) {
    this.iscsiChapNameGte = iscsiChapNameGte;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameIn(List<String> iscsiChapNameIn) {
    
    this.iscsiChapNameIn = iscsiChapNameIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiChapNameInItem(String iscsiChapNameInItem) {
    if (this.iscsiChapNameIn == null) {
      this.iscsiChapNameIn = new ArrayList<String>();
    }
    this.iscsiChapNameIn.add(iscsiChapNameInItem);
    return this;
  }

   /**
   * Get iscsiChapNameIn
   * @return iscsiChapNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiChapNameIn() {
    return iscsiChapNameIn;
  }


  public void setIscsiChapNameIn(List<String> iscsiChapNameIn) {
    this.iscsiChapNameIn = iscsiChapNameIn;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameLt(String iscsiChapNameLt) {
    
    this.iscsiChapNameLt = iscsiChapNameLt;
    return this;
  }

   /**
   * Get iscsiChapNameLt
   * @return iscsiChapNameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameLt() {
    return iscsiChapNameLt;
  }


  public void setIscsiChapNameLt(String iscsiChapNameLt) {
    this.iscsiChapNameLt = iscsiChapNameLt;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameLte(String iscsiChapNameLte) {
    
    this.iscsiChapNameLte = iscsiChapNameLte;
    return this;
  }

   /**
   * Get iscsiChapNameLte
   * @return iscsiChapNameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameLte() {
    return iscsiChapNameLte;
  }


  public void setIscsiChapNameLte(String iscsiChapNameLte) {
    this.iscsiChapNameLte = iscsiChapNameLte;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameNot(String iscsiChapNameNot) {
    
    this.iscsiChapNameNot = iscsiChapNameNot;
    return this;
  }

   /**
   * Get iscsiChapNameNot
   * @return iscsiChapNameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameNot() {
    return iscsiChapNameNot;
  }


  public void setIscsiChapNameNot(String iscsiChapNameNot) {
    this.iscsiChapNameNot = iscsiChapNameNot;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameNotContains(String iscsiChapNameNotContains) {
    
    this.iscsiChapNameNotContains = iscsiChapNameNotContains;
    return this;
  }

   /**
   * Get iscsiChapNameNotContains
   * @return iscsiChapNameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameNotContains() {
    return iscsiChapNameNotContains;
  }


  public void setIscsiChapNameNotContains(String iscsiChapNameNotContains) {
    this.iscsiChapNameNotContains = iscsiChapNameNotContains;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameNotEndsWith(String iscsiChapNameNotEndsWith) {
    
    this.iscsiChapNameNotEndsWith = iscsiChapNameNotEndsWith;
    return this;
  }

   /**
   * Get iscsiChapNameNotEndsWith
   * @return iscsiChapNameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameNotEndsWith() {
    return iscsiChapNameNotEndsWith;
  }


  public void setIscsiChapNameNotEndsWith(String iscsiChapNameNotEndsWith) {
    this.iscsiChapNameNotEndsWith = iscsiChapNameNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameNotIn(List<String> iscsiChapNameNotIn) {
    
    this.iscsiChapNameNotIn = iscsiChapNameNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiChapNameNotInItem(String iscsiChapNameNotInItem) {
    if (this.iscsiChapNameNotIn == null) {
      this.iscsiChapNameNotIn = new ArrayList<String>();
    }
    this.iscsiChapNameNotIn.add(iscsiChapNameNotInItem);
    return this;
  }

   /**
   * Get iscsiChapNameNotIn
   * @return iscsiChapNameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiChapNameNotIn() {
    return iscsiChapNameNotIn;
  }


  public void setIscsiChapNameNotIn(List<String> iscsiChapNameNotIn) {
    this.iscsiChapNameNotIn = iscsiChapNameNotIn;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameNotStartsWith(String iscsiChapNameNotStartsWith) {
    
    this.iscsiChapNameNotStartsWith = iscsiChapNameNotStartsWith;
    return this;
  }

   /**
   * Get iscsiChapNameNotStartsWith
   * @return iscsiChapNameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameNotStartsWith() {
    return iscsiChapNameNotStartsWith;
  }


  public void setIscsiChapNameNotStartsWith(String iscsiChapNameNotStartsWith) {
    this.iscsiChapNameNotStartsWith = iscsiChapNameNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapNameStartsWith(String iscsiChapNameStartsWith) {
    
    this.iscsiChapNameStartsWith = iscsiChapNameStartsWith;
    return this;
  }

   /**
   * Get iscsiChapNameStartsWith
   * @return iscsiChapNameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapNameStartsWith() {
    return iscsiChapNameStartsWith;
  }


  public void setIscsiChapNameStartsWith(String iscsiChapNameStartsWith) {
    this.iscsiChapNameStartsWith = iscsiChapNameStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecret(String iscsiChapSecret) {
    
    this.iscsiChapSecret = iscsiChapSecret;
    return this;
  }

   /**
   * Get iscsiChapSecret
   * @return iscsiChapSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecret() {
    return iscsiChapSecret;
  }


  public void setIscsiChapSecret(String iscsiChapSecret) {
    this.iscsiChapSecret = iscsiChapSecret;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretContains(String iscsiChapSecretContains) {
    
    this.iscsiChapSecretContains = iscsiChapSecretContains;
    return this;
  }

   /**
   * Get iscsiChapSecretContains
   * @return iscsiChapSecretContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretContains() {
    return iscsiChapSecretContains;
  }


  public void setIscsiChapSecretContains(String iscsiChapSecretContains) {
    this.iscsiChapSecretContains = iscsiChapSecretContains;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretEndsWith(String iscsiChapSecretEndsWith) {
    
    this.iscsiChapSecretEndsWith = iscsiChapSecretEndsWith;
    return this;
  }

   /**
   * Get iscsiChapSecretEndsWith
   * @return iscsiChapSecretEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretEndsWith() {
    return iscsiChapSecretEndsWith;
  }


  public void setIscsiChapSecretEndsWith(String iscsiChapSecretEndsWith) {
    this.iscsiChapSecretEndsWith = iscsiChapSecretEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretGt(String iscsiChapSecretGt) {
    
    this.iscsiChapSecretGt = iscsiChapSecretGt;
    return this;
  }

   /**
   * Get iscsiChapSecretGt
   * @return iscsiChapSecretGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretGt() {
    return iscsiChapSecretGt;
  }


  public void setIscsiChapSecretGt(String iscsiChapSecretGt) {
    this.iscsiChapSecretGt = iscsiChapSecretGt;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretGte(String iscsiChapSecretGte) {
    
    this.iscsiChapSecretGte = iscsiChapSecretGte;
    return this;
  }

   /**
   * Get iscsiChapSecretGte
   * @return iscsiChapSecretGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretGte() {
    return iscsiChapSecretGte;
  }


  public void setIscsiChapSecretGte(String iscsiChapSecretGte) {
    this.iscsiChapSecretGte = iscsiChapSecretGte;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretIn(List<String> iscsiChapSecretIn) {
    
    this.iscsiChapSecretIn = iscsiChapSecretIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiChapSecretInItem(String iscsiChapSecretInItem) {
    if (this.iscsiChapSecretIn == null) {
      this.iscsiChapSecretIn = new ArrayList<String>();
    }
    this.iscsiChapSecretIn.add(iscsiChapSecretInItem);
    return this;
  }

   /**
   * Get iscsiChapSecretIn
   * @return iscsiChapSecretIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiChapSecretIn() {
    return iscsiChapSecretIn;
  }


  public void setIscsiChapSecretIn(List<String> iscsiChapSecretIn) {
    this.iscsiChapSecretIn = iscsiChapSecretIn;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretLt(String iscsiChapSecretLt) {
    
    this.iscsiChapSecretLt = iscsiChapSecretLt;
    return this;
  }

   /**
   * Get iscsiChapSecretLt
   * @return iscsiChapSecretLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretLt() {
    return iscsiChapSecretLt;
  }


  public void setIscsiChapSecretLt(String iscsiChapSecretLt) {
    this.iscsiChapSecretLt = iscsiChapSecretLt;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretLte(String iscsiChapSecretLte) {
    
    this.iscsiChapSecretLte = iscsiChapSecretLte;
    return this;
  }

   /**
   * Get iscsiChapSecretLte
   * @return iscsiChapSecretLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretLte() {
    return iscsiChapSecretLte;
  }


  public void setIscsiChapSecretLte(String iscsiChapSecretLte) {
    this.iscsiChapSecretLte = iscsiChapSecretLte;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretNot(String iscsiChapSecretNot) {
    
    this.iscsiChapSecretNot = iscsiChapSecretNot;
    return this;
  }

   /**
   * Get iscsiChapSecretNot
   * @return iscsiChapSecretNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretNot() {
    return iscsiChapSecretNot;
  }


  public void setIscsiChapSecretNot(String iscsiChapSecretNot) {
    this.iscsiChapSecretNot = iscsiChapSecretNot;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretNotContains(String iscsiChapSecretNotContains) {
    
    this.iscsiChapSecretNotContains = iscsiChapSecretNotContains;
    return this;
  }

   /**
   * Get iscsiChapSecretNotContains
   * @return iscsiChapSecretNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretNotContains() {
    return iscsiChapSecretNotContains;
  }


  public void setIscsiChapSecretNotContains(String iscsiChapSecretNotContains) {
    this.iscsiChapSecretNotContains = iscsiChapSecretNotContains;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretNotEndsWith(String iscsiChapSecretNotEndsWith) {
    
    this.iscsiChapSecretNotEndsWith = iscsiChapSecretNotEndsWith;
    return this;
  }

   /**
   * Get iscsiChapSecretNotEndsWith
   * @return iscsiChapSecretNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretNotEndsWith() {
    return iscsiChapSecretNotEndsWith;
  }


  public void setIscsiChapSecretNotEndsWith(String iscsiChapSecretNotEndsWith) {
    this.iscsiChapSecretNotEndsWith = iscsiChapSecretNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretNotIn(List<String> iscsiChapSecretNotIn) {
    
    this.iscsiChapSecretNotIn = iscsiChapSecretNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiChapSecretNotInItem(String iscsiChapSecretNotInItem) {
    if (this.iscsiChapSecretNotIn == null) {
      this.iscsiChapSecretNotIn = new ArrayList<String>();
    }
    this.iscsiChapSecretNotIn.add(iscsiChapSecretNotInItem);
    return this;
  }

   /**
   * Get iscsiChapSecretNotIn
   * @return iscsiChapSecretNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiChapSecretNotIn() {
    return iscsiChapSecretNotIn;
  }


  public void setIscsiChapSecretNotIn(List<String> iscsiChapSecretNotIn) {
    this.iscsiChapSecretNotIn = iscsiChapSecretNotIn;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretNotStartsWith(String iscsiChapSecretNotStartsWith) {
    
    this.iscsiChapSecretNotStartsWith = iscsiChapSecretNotStartsWith;
    return this;
  }

   /**
   * Get iscsiChapSecretNotStartsWith
   * @return iscsiChapSecretNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretNotStartsWith() {
    return iscsiChapSecretNotStartsWith;
  }


  public void setIscsiChapSecretNotStartsWith(String iscsiChapSecretNotStartsWith) {
    this.iscsiChapSecretNotStartsWith = iscsiChapSecretNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiChapSecretStartsWith(String iscsiChapSecretStartsWith) {
    
    this.iscsiChapSecretStartsWith = iscsiChapSecretStartsWith;
    return this;
  }

   /**
   * Get iscsiChapSecretStartsWith
   * @return iscsiChapSecretStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiChapSecretStartsWith() {
    return iscsiChapSecretStartsWith;
  }


  public void setIscsiChapSecretStartsWith(String iscsiChapSecretStartsWith) {
    this.iscsiChapSecretStartsWith = iscsiChapSecretStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiIp(String iscsiIp) {
    
    this.iscsiIp = iscsiIp;
    return this;
  }

   /**
   * Get iscsiIp
   * @return iscsiIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIp() {
    return iscsiIp;
  }


  public void setIscsiIp(String iscsiIp) {
    this.iscsiIp = iscsiIp;
  }


  public BackupStoreRepositoryWhereInput iscsiIpContains(String iscsiIpContains) {
    
    this.iscsiIpContains = iscsiIpContains;
    return this;
  }

   /**
   * Get iscsiIpContains
   * @return iscsiIpContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpContains() {
    return iscsiIpContains;
  }


  public void setIscsiIpContains(String iscsiIpContains) {
    this.iscsiIpContains = iscsiIpContains;
  }


  public BackupStoreRepositoryWhereInput iscsiIpEndsWith(String iscsiIpEndsWith) {
    
    this.iscsiIpEndsWith = iscsiIpEndsWith;
    return this;
  }

   /**
   * Get iscsiIpEndsWith
   * @return iscsiIpEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpEndsWith() {
    return iscsiIpEndsWith;
  }


  public void setIscsiIpEndsWith(String iscsiIpEndsWith) {
    this.iscsiIpEndsWith = iscsiIpEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiIpGt(String iscsiIpGt) {
    
    this.iscsiIpGt = iscsiIpGt;
    return this;
  }

   /**
   * Get iscsiIpGt
   * @return iscsiIpGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpGt() {
    return iscsiIpGt;
  }


  public void setIscsiIpGt(String iscsiIpGt) {
    this.iscsiIpGt = iscsiIpGt;
  }


  public BackupStoreRepositoryWhereInput iscsiIpGte(String iscsiIpGte) {
    
    this.iscsiIpGte = iscsiIpGte;
    return this;
  }

   /**
   * Get iscsiIpGte
   * @return iscsiIpGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpGte() {
    return iscsiIpGte;
  }


  public void setIscsiIpGte(String iscsiIpGte) {
    this.iscsiIpGte = iscsiIpGte;
  }


  public BackupStoreRepositoryWhereInput iscsiIpIn(List<String> iscsiIpIn) {
    
    this.iscsiIpIn = iscsiIpIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiIpInItem(String iscsiIpInItem) {
    if (this.iscsiIpIn == null) {
      this.iscsiIpIn = new ArrayList<String>();
    }
    this.iscsiIpIn.add(iscsiIpInItem);
    return this;
  }

   /**
   * Get iscsiIpIn
   * @return iscsiIpIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiIpIn() {
    return iscsiIpIn;
  }


  public void setIscsiIpIn(List<String> iscsiIpIn) {
    this.iscsiIpIn = iscsiIpIn;
  }


  public BackupStoreRepositoryWhereInput iscsiIpLt(String iscsiIpLt) {
    
    this.iscsiIpLt = iscsiIpLt;
    return this;
  }

   /**
   * Get iscsiIpLt
   * @return iscsiIpLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpLt() {
    return iscsiIpLt;
  }


  public void setIscsiIpLt(String iscsiIpLt) {
    this.iscsiIpLt = iscsiIpLt;
  }


  public BackupStoreRepositoryWhereInput iscsiIpLte(String iscsiIpLte) {
    
    this.iscsiIpLte = iscsiIpLte;
    return this;
  }

   /**
   * Get iscsiIpLte
   * @return iscsiIpLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpLte() {
    return iscsiIpLte;
  }


  public void setIscsiIpLte(String iscsiIpLte) {
    this.iscsiIpLte = iscsiIpLte;
  }


  public BackupStoreRepositoryWhereInput iscsiIpNot(String iscsiIpNot) {
    
    this.iscsiIpNot = iscsiIpNot;
    return this;
  }

   /**
   * Get iscsiIpNot
   * @return iscsiIpNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpNot() {
    return iscsiIpNot;
  }


  public void setIscsiIpNot(String iscsiIpNot) {
    this.iscsiIpNot = iscsiIpNot;
  }


  public BackupStoreRepositoryWhereInput iscsiIpNotContains(String iscsiIpNotContains) {
    
    this.iscsiIpNotContains = iscsiIpNotContains;
    return this;
  }

   /**
   * Get iscsiIpNotContains
   * @return iscsiIpNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpNotContains() {
    return iscsiIpNotContains;
  }


  public void setIscsiIpNotContains(String iscsiIpNotContains) {
    this.iscsiIpNotContains = iscsiIpNotContains;
  }


  public BackupStoreRepositoryWhereInput iscsiIpNotEndsWith(String iscsiIpNotEndsWith) {
    
    this.iscsiIpNotEndsWith = iscsiIpNotEndsWith;
    return this;
  }

   /**
   * Get iscsiIpNotEndsWith
   * @return iscsiIpNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpNotEndsWith() {
    return iscsiIpNotEndsWith;
  }


  public void setIscsiIpNotEndsWith(String iscsiIpNotEndsWith) {
    this.iscsiIpNotEndsWith = iscsiIpNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiIpNotIn(List<String> iscsiIpNotIn) {
    
    this.iscsiIpNotIn = iscsiIpNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiIpNotInItem(String iscsiIpNotInItem) {
    if (this.iscsiIpNotIn == null) {
      this.iscsiIpNotIn = new ArrayList<String>();
    }
    this.iscsiIpNotIn.add(iscsiIpNotInItem);
    return this;
  }

   /**
   * Get iscsiIpNotIn
   * @return iscsiIpNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiIpNotIn() {
    return iscsiIpNotIn;
  }


  public void setIscsiIpNotIn(List<String> iscsiIpNotIn) {
    this.iscsiIpNotIn = iscsiIpNotIn;
  }


  public BackupStoreRepositoryWhereInput iscsiIpNotStartsWith(String iscsiIpNotStartsWith) {
    
    this.iscsiIpNotStartsWith = iscsiIpNotStartsWith;
    return this;
  }

   /**
   * Get iscsiIpNotStartsWith
   * @return iscsiIpNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpNotStartsWith() {
    return iscsiIpNotStartsWith;
  }


  public void setIscsiIpNotStartsWith(String iscsiIpNotStartsWith) {
    this.iscsiIpNotStartsWith = iscsiIpNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiIpStartsWith(String iscsiIpStartsWith) {
    
    this.iscsiIpStartsWith = iscsiIpStartsWith;
    return this;
  }

   /**
   * Get iscsiIpStartsWith
   * @return iscsiIpStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiIpStartsWith() {
    return iscsiIpStartsWith;
  }


  public void setIscsiIpStartsWith(String iscsiIpStartsWith) {
    this.iscsiIpStartsWith = iscsiIpStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiLunId(String iscsiLunId) {
    
    this.iscsiLunId = iscsiLunId;
    return this;
  }

   /**
   * Get iscsiLunId
   * @return iscsiLunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunId() {
    return iscsiLunId;
  }


  public void setIscsiLunId(String iscsiLunId) {
    this.iscsiLunId = iscsiLunId;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdContains(String iscsiLunIdContains) {
    
    this.iscsiLunIdContains = iscsiLunIdContains;
    return this;
  }

   /**
   * Get iscsiLunIdContains
   * @return iscsiLunIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdContains() {
    return iscsiLunIdContains;
  }


  public void setIscsiLunIdContains(String iscsiLunIdContains) {
    this.iscsiLunIdContains = iscsiLunIdContains;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdEndsWith(String iscsiLunIdEndsWith) {
    
    this.iscsiLunIdEndsWith = iscsiLunIdEndsWith;
    return this;
  }

   /**
   * Get iscsiLunIdEndsWith
   * @return iscsiLunIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdEndsWith() {
    return iscsiLunIdEndsWith;
  }


  public void setIscsiLunIdEndsWith(String iscsiLunIdEndsWith) {
    this.iscsiLunIdEndsWith = iscsiLunIdEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdGt(String iscsiLunIdGt) {
    
    this.iscsiLunIdGt = iscsiLunIdGt;
    return this;
  }

   /**
   * Get iscsiLunIdGt
   * @return iscsiLunIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdGt() {
    return iscsiLunIdGt;
  }


  public void setIscsiLunIdGt(String iscsiLunIdGt) {
    this.iscsiLunIdGt = iscsiLunIdGt;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdGte(String iscsiLunIdGte) {
    
    this.iscsiLunIdGte = iscsiLunIdGte;
    return this;
  }

   /**
   * Get iscsiLunIdGte
   * @return iscsiLunIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdGte() {
    return iscsiLunIdGte;
  }


  public void setIscsiLunIdGte(String iscsiLunIdGte) {
    this.iscsiLunIdGte = iscsiLunIdGte;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdIn(List<String> iscsiLunIdIn) {
    
    this.iscsiLunIdIn = iscsiLunIdIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiLunIdInItem(String iscsiLunIdInItem) {
    if (this.iscsiLunIdIn == null) {
      this.iscsiLunIdIn = new ArrayList<String>();
    }
    this.iscsiLunIdIn.add(iscsiLunIdInItem);
    return this;
  }

   /**
   * Get iscsiLunIdIn
   * @return iscsiLunIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiLunIdIn() {
    return iscsiLunIdIn;
  }


  public void setIscsiLunIdIn(List<String> iscsiLunIdIn) {
    this.iscsiLunIdIn = iscsiLunIdIn;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdLt(String iscsiLunIdLt) {
    
    this.iscsiLunIdLt = iscsiLunIdLt;
    return this;
  }

   /**
   * Get iscsiLunIdLt
   * @return iscsiLunIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdLt() {
    return iscsiLunIdLt;
  }


  public void setIscsiLunIdLt(String iscsiLunIdLt) {
    this.iscsiLunIdLt = iscsiLunIdLt;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdLte(String iscsiLunIdLte) {
    
    this.iscsiLunIdLte = iscsiLunIdLte;
    return this;
  }

   /**
   * Get iscsiLunIdLte
   * @return iscsiLunIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdLte() {
    return iscsiLunIdLte;
  }


  public void setIscsiLunIdLte(String iscsiLunIdLte) {
    this.iscsiLunIdLte = iscsiLunIdLte;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdNot(String iscsiLunIdNot) {
    
    this.iscsiLunIdNot = iscsiLunIdNot;
    return this;
  }

   /**
   * Get iscsiLunIdNot
   * @return iscsiLunIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdNot() {
    return iscsiLunIdNot;
  }


  public void setIscsiLunIdNot(String iscsiLunIdNot) {
    this.iscsiLunIdNot = iscsiLunIdNot;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdNotContains(String iscsiLunIdNotContains) {
    
    this.iscsiLunIdNotContains = iscsiLunIdNotContains;
    return this;
  }

   /**
   * Get iscsiLunIdNotContains
   * @return iscsiLunIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdNotContains() {
    return iscsiLunIdNotContains;
  }


  public void setIscsiLunIdNotContains(String iscsiLunIdNotContains) {
    this.iscsiLunIdNotContains = iscsiLunIdNotContains;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdNotEndsWith(String iscsiLunIdNotEndsWith) {
    
    this.iscsiLunIdNotEndsWith = iscsiLunIdNotEndsWith;
    return this;
  }

   /**
   * Get iscsiLunIdNotEndsWith
   * @return iscsiLunIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdNotEndsWith() {
    return iscsiLunIdNotEndsWith;
  }


  public void setIscsiLunIdNotEndsWith(String iscsiLunIdNotEndsWith) {
    this.iscsiLunIdNotEndsWith = iscsiLunIdNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdNotIn(List<String> iscsiLunIdNotIn) {
    
    this.iscsiLunIdNotIn = iscsiLunIdNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiLunIdNotInItem(String iscsiLunIdNotInItem) {
    if (this.iscsiLunIdNotIn == null) {
      this.iscsiLunIdNotIn = new ArrayList<String>();
    }
    this.iscsiLunIdNotIn.add(iscsiLunIdNotInItem);
    return this;
  }

   /**
   * Get iscsiLunIdNotIn
   * @return iscsiLunIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiLunIdNotIn() {
    return iscsiLunIdNotIn;
  }


  public void setIscsiLunIdNotIn(List<String> iscsiLunIdNotIn) {
    this.iscsiLunIdNotIn = iscsiLunIdNotIn;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdNotStartsWith(String iscsiLunIdNotStartsWith) {
    
    this.iscsiLunIdNotStartsWith = iscsiLunIdNotStartsWith;
    return this;
  }

   /**
   * Get iscsiLunIdNotStartsWith
   * @return iscsiLunIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdNotStartsWith() {
    return iscsiLunIdNotStartsWith;
  }


  public void setIscsiLunIdNotStartsWith(String iscsiLunIdNotStartsWith) {
    this.iscsiLunIdNotStartsWith = iscsiLunIdNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiLunIdStartsWith(String iscsiLunIdStartsWith) {
    
    this.iscsiLunIdStartsWith = iscsiLunIdStartsWith;
    return this;
  }

   /**
   * Get iscsiLunIdStartsWith
   * @return iscsiLunIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiLunIdStartsWith() {
    return iscsiLunIdStartsWith;
  }


  public void setIscsiLunIdStartsWith(String iscsiLunIdStartsWith) {
    this.iscsiLunIdStartsWith = iscsiLunIdStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiPort(Integer iscsiPort) {
    
    this.iscsiPort = iscsiPort;
    return this;
  }

   /**
   * Get iscsiPort
   * @return iscsiPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiPort() {
    return iscsiPort;
  }


  public void setIscsiPort(Integer iscsiPort) {
    this.iscsiPort = iscsiPort;
  }


  public BackupStoreRepositoryWhereInput iscsiPortGt(Integer iscsiPortGt) {
    
    this.iscsiPortGt = iscsiPortGt;
    return this;
  }

   /**
   * Get iscsiPortGt
   * @return iscsiPortGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiPortGt() {
    return iscsiPortGt;
  }


  public void setIscsiPortGt(Integer iscsiPortGt) {
    this.iscsiPortGt = iscsiPortGt;
  }


  public BackupStoreRepositoryWhereInput iscsiPortGte(Integer iscsiPortGte) {
    
    this.iscsiPortGte = iscsiPortGte;
    return this;
  }

   /**
   * Get iscsiPortGte
   * @return iscsiPortGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiPortGte() {
    return iscsiPortGte;
  }


  public void setIscsiPortGte(Integer iscsiPortGte) {
    this.iscsiPortGte = iscsiPortGte;
  }


  public BackupStoreRepositoryWhereInput iscsiPortIn(List<Integer> iscsiPortIn) {
    
    this.iscsiPortIn = iscsiPortIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiPortInItem(Integer iscsiPortInItem) {
    if (this.iscsiPortIn == null) {
      this.iscsiPortIn = new ArrayList<Integer>();
    }
    this.iscsiPortIn.add(iscsiPortInItem);
    return this;
  }

   /**
   * Get iscsiPortIn
   * @return iscsiPortIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiPortIn() {
    return iscsiPortIn;
  }


  public void setIscsiPortIn(List<Integer> iscsiPortIn) {
    this.iscsiPortIn = iscsiPortIn;
  }


  public BackupStoreRepositoryWhereInput iscsiPortLt(Integer iscsiPortLt) {
    
    this.iscsiPortLt = iscsiPortLt;
    return this;
  }

   /**
   * Get iscsiPortLt
   * @return iscsiPortLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiPortLt() {
    return iscsiPortLt;
  }


  public void setIscsiPortLt(Integer iscsiPortLt) {
    this.iscsiPortLt = iscsiPortLt;
  }


  public BackupStoreRepositoryWhereInput iscsiPortLte(Integer iscsiPortLte) {
    
    this.iscsiPortLte = iscsiPortLte;
    return this;
  }

   /**
   * Get iscsiPortLte
   * @return iscsiPortLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiPortLte() {
    return iscsiPortLte;
  }


  public void setIscsiPortLte(Integer iscsiPortLte) {
    this.iscsiPortLte = iscsiPortLte;
  }


  public BackupStoreRepositoryWhereInput iscsiPortNot(Integer iscsiPortNot) {
    
    this.iscsiPortNot = iscsiPortNot;
    return this;
  }

   /**
   * Get iscsiPortNot
   * @return iscsiPortNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIscsiPortNot() {
    return iscsiPortNot;
  }


  public void setIscsiPortNot(Integer iscsiPortNot) {
    this.iscsiPortNot = iscsiPortNot;
  }


  public BackupStoreRepositoryWhereInput iscsiPortNotIn(List<Integer> iscsiPortNotIn) {
    
    this.iscsiPortNotIn = iscsiPortNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiPortNotInItem(Integer iscsiPortNotInItem) {
    if (this.iscsiPortNotIn == null) {
      this.iscsiPortNotIn = new ArrayList<Integer>();
    }
    this.iscsiPortNotIn.add(iscsiPortNotInItem);
    return this;
  }

   /**
   * Get iscsiPortNotIn
   * @return iscsiPortNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getIscsiPortNotIn() {
    return iscsiPortNotIn;
  }


  public void setIscsiPortNotIn(List<Integer> iscsiPortNotIn) {
    this.iscsiPortNotIn = iscsiPortNotIn;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqn(String iscsiTargetIqn) {
    
    this.iscsiTargetIqn = iscsiTargetIqn;
    return this;
  }

   /**
   * Get iscsiTargetIqn
   * @return iscsiTargetIqn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqn() {
    return iscsiTargetIqn;
  }


  public void setIscsiTargetIqn(String iscsiTargetIqn) {
    this.iscsiTargetIqn = iscsiTargetIqn;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnContains(String iscsiTargetIqnContains) {
    
    this.iscsiTargetIqnContains = iscsiTargetIqnContains;
    return this;
  }

   /**
   * Get iscsiTargetIqnContains
   * @return iscsiTargetIqnContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnContains() {
    return iscsiTargetIqnContains;
  }


  public void setIscsiTargetIqnContains(String iscsiTargetIqnContains) {
    this.iscsiTargetIqnContains = iscsiTargetIqnContains;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnEndsWith(String iscsiTargetIqnEndsWith) {
    
    this.iscsiTargetIqnEndsWith = iscsiTargetIqnEndsWith;
    return this;
  }

   /**
   * Get iscsiTargetIqnEndsWith
   * @return iscsiTargetIqnEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnEndsWith() {
    return iscsiTargetIqnEndsWith;
  }


  public void setIscsiTargetIqnEndsWith(String iscsiTargetIqnEndsWith) {
    this.iscsiTargetIqnEndsWith = iscsiTargetIqnEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnGt(String iscsiTargetIqnGt) {
    
    this.iscsiTargetIqnGt = iscsiTargetIqnGt;
    return this;
  }

   /**
   * Get iscsiTargetIqnGt
   * @return iscsiTargetIqnGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnGt() {
    return iscsiTargetIqnGt;
  }


  public void setIscsiTargetIqnGt(String iscsiTargetIqnGt) {
    this.iscsiTargetIqnGt = iscsiTargetIqnGt;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnGte(String iscsiTargetIqnGte) {
    
    this.iscsiTargetIqnGte = iscsiTargetIqnGte;
    return this;
  }

   /**
   * Get iscsiTargetIqnGte
   * @return iscsiTargetIqnGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnGte() {
    return iscsiTargetIqnGte;
  }


  public void setIscsiTargetIqnGte(String iscsiTargetIqnGte) {
    this.iscsiTargetIqnGte = iscsiTargetIqnGte;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnIn(List<String> iscsiTargetIqnIn) {
    
    this.iscsiTargetIqnIn = iscsiTargetIqnIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiTargetIqnInItem(String iscsiTargetIqnInItem) {
    if (this.iscsiTargetIqnIn == null) {
      this.iscsiTargetIqnIn = new ArrayList<String>();
    }
    this.iscsiTargetIqnIn.add(iscsiTargetIqnInItem);
    return this;
  }

   /**
   * Get iscsiTargetIqnIn
   * @return iscsiTargetIqnIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiTargetIqnIn() {
    return iscsiTargetIqnIn;
  }


  public void setIscsiTargetIqnIn(List<String> iscsiTargetIqnIn) {
    this.iscsiTargetIqnIn = iscsiTargetIqnIn;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnLt(String iscsiTargetIqnLt) {
    
    this.iscsiTargetIqnLt = iscsiTargetIqnLt;
    return this;
  }

   /**
   * Get iscsiTargetIqnLt
   * @return iscsiTargetIqnLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnLt() {
    return iscsiTargetIqnLt;
  }


  public void setIscsiTargetIqnLt(String iscsiTargetIqnLt) {
    this.iscsiTargetIqnLt = iscsiTargetIqnLt;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnLte(String iscsiTargetIqnLte) {
    
    this.iscsiTargetIqnLte = iscsiTargetIqnLte;
    return this;
  }

   /**
   * Get iscsiTargetIqnLte
   * @return iscsiTargetIqnLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnLte() {
    return iscsiTargetIqnLte;
  }


  public void setIscsiTargetIqnLte(String iscsiTargetIqnLte) {
    this.iscsiTargetIqnLte = iscsiTargetIqnLte;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnNot(String iscsiTargetIqnNot) {
    
    this.iscsiTargetIqnNot = iscsiTargetIqnNot;
    return this;
  }

   /**
   * Get iscsiTargetIqnNot
   * @return iscsiTargetIqnNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnNot() {
    return iscsiTargetIqnNot;
  }


  public void setIscsiTargetIqnNot(String iscsiTargetIqnNot) {
    this.iscsiTargetIqnNot = iscsiTargetIqnNot;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnNotContains(String iscsiTargetIqnNotContains) {
    
    this.iscsiTargetIqnNotContains = iscsiTargetIqnNotContains;
    return this;
  }

   /**
   * Get iscsiTargetIqnNotContains
   * @return iscsiTargetIqnNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnNotContains() {
    return iscsiTargetIqnNotContains;
  }


  public void setIscsiTargetIqnNotContains(String iscsiTargetIqnNotContains) {
    this.iscsiTargetIqnNotContains = iscsiTargetIqnNotContains;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnNotEndsWith(String iscsiTargetIqnNotEndsWith) {
    
    this.iscsiTargetIqnNotEndsWith = iscsiTargetIqnNotEndsWith;
    return this;
  }

   /**
   * Get iscsiTargetIqnNotEndsWith
   * @return iscsiTargetIqnNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnNotEndsWith() {
    return iscsiTargetIqnNotEndsWith;
  }


  public void setIscsiTargetIqnNotEndsWith(String iscsiTargetIqnNotEndsWith) {
    this.iscsiTargetIqnNotEndsWith = iscsiTargetIqnNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnNotIn(List<String> iscsiTargetIqnNotIn) {
    
    this.iscsiTargetIqnNotIn = iscsiTargetIqnNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addIscsiTargetIqnNotInItem(String iscsiTargetIqnNotInItem) {
    if (this.iscsiTargetIqnNotIn == null) {
      this.iscsiTargetIqnNotIn = new ArrayList<String>();
    }
    this.iscsiTargetIqnNotIn.add(iscsiTargetIqnNotInItem);
    return this;
  }

   /**
   * Get iscsiTargetIqnNotIn
   * @return iscsiTargetIqnNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIscsiTargetIqnNotIn() {
    return iscsiTargetIqnNotIn;
  }


  public void setIscsiTargetIqnNotIn(List<String> iscsiTargetIqnNotIn) {
    this.iscsiTargetIqnNotIn = iscsiTargetIqnNotIn;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnNotStartsWith(String iscsiTargetIqnNotStartsWith) {
    
    this.iscsiTargetIqnNotStartsWith = iscsiTargetIqnNotStartsWith;
    return this;
  }

   /**
   * Get iscsiTargetIqnNotStartsWith
   * @return iscsiTargetIqnNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnNotStartsWith() {
    return iscsiTargetIqnNotStartsWith;
  }


  public void setIscsiTargetIqnNotStartsWith(String iscsiTargetIqnNotStartsWith) {
    this.iscsiTargetIqnNotStartsWith = iscsiTargetIqnNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput iscsiTargetIqnStartsWith(String iscsiTargetIqnStartsWith) {
    
    this.iscsiTargetIqnStartsWith = iscsiTargetIqnStartsWith;
    return this;
  }

   /**
   * Get iscsiTargetIqnStartsWith
   * @return iscsiTargetIqnStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIscsiTargetIqnStartsWith() {
    return iscsiTargetIqnStartsWith;
  }


  public void setIscsiTargetIqnStartsWith(String iscsiTargetIqnStartsWith) {
    this.iscsiTargetIqnStartsWith = iscsiTargetIqnStartsWith;
  }


  public BackupStoreRepositoryWhereInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BackupStoreRepositoryWhereInput nameContains(String nameContains) {
    
    this.nameContains = nameContains;
    return this;
  }

   /**
   * Get nameContains
   * @return nameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameContains() {
    return nameContains;
  }


  public void setNameContains(String nameContains) {
    this.nameContains = nameContains;
  }


  public BackupStoreRepositoryWhereInput nameEndsWith(String nameEndsWith) {
    
    this.nameEndsWith = nameEndsWith;
    return this;
  }

   /**
   * Get nameEndsWith
   * @return nameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameEndsWith() {
    return nameEndsWith;
  }


  public void setNameEndsWith(String nameEndsWith) {
    this.nameEndsWith = nameEndsWith;
  }


  public BackupStoreRepositoryWhereInput nameGt(String nameGt) {
    
    this.nameGt = nameGt;
    return this;
  }

   /**
   * Get nameGt
   * @return nameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGt() {
    return nameGt;
  }


  public void setNameGt(String nameGt) {
    this.nameGt = nameGt;
  }


  public BackupStoreRepositoryWhereInput nameGte(String nameGte) {
    
    this.nameGte = nameGte;
    return this;
  }

   /**
   * Get nameGte
   * @return nameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameGte() {
    return nameGte;
  }


  public void setNameGte(String nameGte) {
    this.nameGte = nameGte;
  }


  public BackupStoreRepositoryWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addNameInItem(String nameInItem) {
    if (this.nameIn == null) {
      this.nameIn = new ArrayList<String>();
    }
    this.nameIn.add(nameInItem);
    return this;
  }

   /**
   * Get nameIn
   * @return nameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameIn() {
    return nameIn;
  }


  public void setNameIn(List<String> nameIn) {
    this.nameIn = nameIn;
  }


  public BackupStoreRepositoryWhereInput nameLt(String nameLt) {
    
    this.nameLt = nameLt;
    return this;
  }

   /**
   * Get nameLt
   * @return nameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLt() {
    return nameLt;
  }


  public void setNameLt(String nameLt) {
    this.nameLt = nameLt;
  }


  public BackupStoreRepositoryWhereInput nameLte(String nameLte) {
    
    this.nameLte = nameLte;
    return this;
  }

   /**
   * Get nameLte
   * @return nameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameLte() {
    return nameLte;
  }


  public void setNameLte(String nameLte) {
    this.nameLte = nameLte;
  }


  public BackupStoreRepositoryWhereInput nameNot(String nameNot) {
    
    this.nameNot = nameNot;
    return this;
  }

   /**
   * Get nameNot
   * @return nameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNot() {
    return nameNot;
  }


  public void setNameNot(String nameNot) {
    this.nameNot = nameNot;
  }


  public BackupStoreRepositoryWhereInput nameNotContains(String nameNotContains) {
    
    this.nameNotContains = nameNotContains;
    return this;
  }

   /**
   * Get nameNotContains
   * @return nameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotContains() {
    return nameNotContains;
  }


  public void setNameNotContains(String nameNotContains) {
    this.nameNotContains = nameNotContains;
  }


  public BackupStoreRepositoryWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
    this.nameNotEndsWith = nameNotEndsWith;
    return this;
  }

   /**
   * Get nameNotEndsWith
   * @return nameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotEndsWith() {
    return nameNotEndsWith;
  }


  public void setNameNotEndsWith(String nameNotEndsWith) {
    this.nameNotEndsWith = nameNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addNameNotInItem(String nameNotInItem) {
    if (this.nameNotIn == null) {
      this.nameNotIn = new ArrayList<String>();
    }
    this.nameNotIn.add(nameNotInItem);
    return this;
  }

   /**
   * Get nameNotIn
   * @return nameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNameNotIn() {
    return nameNotIn;
  }


  public void setNameNotIn(List<String> nameNotIn) {
    this.nameNotIn = nameNotIn;
  }


  public BackupStoreRepositoryWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
    this.nameNotStartsWith = nameNotStartsWith;
    return this;
  }

   /**
   * Get nameNotStartsWith
   * @return nameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameNotStartsWith() {
    return nameNotStartsWith;
  }


  public void setNameNotStartsWith(String nameNotStartsWith) {
    this.nameNotStartsWith = nameNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput nameStartsWith(String nameStartsWith) {
    
    this.nameStartsWith = nameStartsWith;
    return this;
  }

   /**
   * Get nameStartsWith
   * @return nameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNameStartsWith() {
    return nameStartsWith;
  }


  public void setNameStartsWith(String nameStartsWith) {
    this.nameStartsWith = nameStartsWith;
  }


  public BackupStoreRepositoryWhereInput nfsPath(String nfsPath) {
    
    this.nfsPath = nfsPath;
    return this;
  }

   /**
   * Get nfsPath
   * @return nfsPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPath() {
    return nfsPath;
  }


  public void setNfsPath(String nfsPath) {
    this.nfsPath = nfsPath;
  }


  public BackupStoreRepositoryWhereInput nfsPathContains(String nfsPathContains) {
    
    this.nfsPathContains = nfsPathContains;
    return this;
  }

   /**
   * Get nfsPathContains
   * @return nfsPathContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathContains() {
    return nfsPathContains;
  }


  public void setNfsPathContains(String nfsPathContains) {
    this.nfsPathContains = nfsPathContains;
  }


  public BackupStoreRepositoryWhereInput nfsPathEndsWith(String nfsPathEndsWith) {
    
    this.nfsPathEndsWith = nfsPathEndsWith;
    return this;
  }

   /**
   * Get nfsPathEndsWith
   * @return nfsPathEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathEndsWith() {
    return nfsPathEndsWith;
  }


  public void setNfsPathEndsWith(String nfsPathEndsWith) {
    this.nfsPathEndsWith = nfsPathEndsWith;
  }


  public BackupStoreRepositoryWhereInput nfsPathGt(String nfsPathGt) {
    
    this.nfsPathGt = nfsPathGt;
    return this;
  }

   /**
   * Get nfsPathGt
   * @return nfsPathGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathGt() {
    return nfsPathGt;
  }


  public void setNfsPathGt(String nfsPathGt) {
    this.nfsPathGt = nfsPathGt;
  }


  public BackupStoreRepositoryWhereInput nfsPathGte(String nfsPathGte) {
    
    this.nfsPathGte = nfsPathGte;
    return this;
  }

   /**
   * Get nfsPathGte
   * @return nfsPathGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathGte() {
    return nfsPathGte;
  }


  public void setNfsPathGte(String nfsPathGte) {
    this.nfsPathGte = nfsPathGte;
  }


  public BackupStoreRepositoryWhereInput nfsPathIn(List<String> nfsPathIn) {
    
    this.nfsPathIn = nfsPathIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addNfsPathInItem(String nfsPathInItem) {
    if (this.nfsPathIn == null) {
      this.nfsPathIn = new ArrayList<String>();
    }
    this.nfsPathIn.add(nfsPathInItem);
    return this;
  }

   /**
   * Get nfsPathIn
   * @return nfsPathIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNfsPathIn() {
    return nfsPathIn;
  }


  public void setNfsPathIn(List<String> nfsPathIn) {
    this.nfsPathIn = nfsPathIn;
  }


  public BackupStoreRepositoryWhereInput nfsPathLt(String nfsPathLt) {
    
    this.nfsPathLt = nfsPathLt;
    return this;
  }

   /**
   * Get nfsPathLt
   * @return nfsPathLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathLt() {
    return nfsPathLt;
  }


  public void setNfsPathLt(String nfsPathLt) {
    this.nfsPathLt = nfsPathLt;
  }


  public BackupStoreRepositoryWhereInput nfsPathLte(String nfsPathLte) {
    
    this.nfsPathLte = nfsPathLte;
    return this;
  }

   /**
   * Get nfsPathLte
   * @return nfsPathLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathLte() {
    return nfsPathLte;
  }


  public void setNfsPathLte(String nfsPathLte) {
    this.nfsPathLte = nfsPathLte;
  }


  public BackupStoreRepositoryWhereInput nfsPathNot(String nfsPathNot) {
    
    this.nfsPathNot = nfsPathNot;
    return this;
  }

   /**
   * Get nfsPathNot
   * @return nfsPathNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathNot() {
    return nfsPathNot;
  }


  public void setNfsPathNot(String nfsPathNot) {
    this.nfsPathNot = nfsPathNot;
  }


  public BackupStoreRepositoryWhereInput nfsPathNotContains(String nfsPathNotContains) {
    
    this.nfsPathNotContains = nfsPathNotContains;
    return this;
  }

   /**
   * Get nfsPathNotContains
   * @return nfsPathNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathNotContains() {
    return nfsPathNotContains;
  }


  public void setNfsPathNotContains(String nfsPathNotContains) {
    this.nfsPathNotContains = nfsPathNotContains;
  }


  public BackupStoreRepositoryWhereInput nfsPathNotEndsWith(String nfsPathNotEndsWith) {
    
    this.nfsPathNotEndsWith = nfsPathNotEndsWith;
    return this;
  }

   /**
   * Get nfsPathNotEndsWith
   * @return nfsPathNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathNotEndsWith() {
    return nfsPathNotEndsWith;
  }


  public void setNfsPathNotEndsWith(String nfsPathNotEndsWith) {
    this.nfsPathNotEndsWith = nfsPathNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput nfsPathNotIn(List<String> nfsPathNotIn) {
    
    this.nfsPathNotIn = nfsPathNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addNfsPathNotInItem(String nfsPathNotInItem) {
    if (this.nfsPathNotIn == null) {
      this.nfsPathNotIn = new ArrayList<String>();
    }
    this.nfsPathNotIn.add(nfsPathNotInItem);
    return this;
  }

   /**
   * Get nfsPathNotIn
   * @return nfsPathNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNfsPathNotIn() {
    return nfsPathNotIn;
  }


  public void setNfsPathNotIn(List<String> nfsPathNotIn) {
    this.nfsPathNotIn = nfsPathNotIn;
  }


  public BackupStoreRepositoryWhereInput nfsPathNotStartsWith(String nfsPathNotStartsWith) {
    
    this.nfsPathNotStartsWith = nfsPathNotStartsWith;
    return this;
  }

   /**
   * Get nfsPathNotStartsWith
   * @return nfsPathNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathNotStartsWith() {
    return nfsPathNotStartsWith;
  }


  public void setNfsPathNotStartsWith(String nfsPathNotStartsWith) {
    this.nfsPathNotStartsWith = nfsPathNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput nfsPathStartsWith(String nfsPathStartsWith) {
    
    this.nfsPathStartsWith = nfsPathStartsWith;
    return this;
  }

   /**
   * Get nfsPathStartsWith
   * @return nfsPathStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsPathStartsWith() {
    return nfsPathStartsWith;
  }


  public void setNfsPathStartsWith(String nfsPathStartsWith) {
    this.nfsPathStartsWith = nfsPathStartsWith;
  }


  public BackupStoreRepositoryWhereInput nfsServer(String nfsServer) {
    
    this.nfsServer = nfsServer;
    return this;
  }

   /**
   * Get nfsServer
   * @return nfsServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServer() {
    return nfsServer;
  }


  public void setNfsServer(String nfsServer) {
    this.nfsServer = nfsServer;
  }


  public BackupStoreRepositoryWhereInput nfsServerContains(String nfsServerContains) {
    
    this.nfsServerContains = nfsServerContains;
    return this;
  }

   /**
   * Get nfsServerContains
   * @return nfsServerContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerContains() {
    return nfsServerContains;
  }


  public void setNfsServerContains(String nfsServerContains) {
    this.nfsServerContains = nfsServerContains;
  }


  public BackupStoreRepositoryWhereInput nfsServerEndsWith(String nfsServerEndsWith) {
    
    this.nfsServerEndsWith = nfsServerEndsWith;
    return this;
  }

   /**
   * Get nfsServerEndsWith
   * @return nfsServerEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerEndsWith() {
    return nfsServerEndsWith;
  }


  public void setNfsServerEndsWith(String nfsServerEndsWith) {
    this.nfsServerEndsWith = nfsServerEndsWith;
  }


  public BackupStoreRepositoryWhereInput nfsServerGt(String nfsServerGt) {
    
    this.nfsServerGt = nfsServerGt;
    return this;
  }

   /**
   * Get nfsServerGt
   * @return nfsServerGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerGt() {
    return nfsServerGt;
  }


  public void setNfsServerGt(String nfsServerGt) {
    this.nfsServerGt = nfsServerGt;
  }


  public BackupStoreRepositoryWhereInput nfsServerGte(String nfsServerGte) {
    
    this.nfsServerGte = nfsServerGte;
    return this;
  }

   /**
   * Get nfsServerGte
   * @return nfsServerGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerGte() {
    return nfsServerGte;
  }


  public void setNfsServerGte(String nfsServerGte) {
    this.nfsServerGte = nfsServerGte;
  }


  public BackupStoreRepositoryWhereInput nfsServerIn(List<String> nfsServerIn) {
    
    this.nfsServerIn = nfsServerIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addNfsServerInItem(String nfsServerInItem) {
    if (this.nfsServerIn == null) {
      this.nfsServerIn = new ArrayList<String>();
    }
    this.nfsServerIn.add(nfsServerInItem);
    return this;
  }

   /**
   * Get nfsServerIn
   * @return nfsServerIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNfsServerIn() {
    return nfsServerIn;
  }


  public void setNfsServerIn(List<String> nfsServerIn) {
    this.nfsServerIn = nfsServerIn;
  }


  public BackupStoreRepositoryWhereInput nfsServerLt(String nfsServerLt) {
    
    this.nfsServerLt = nfsServerLt;
    return this;
  }

   /**
   * Get nfsServerLt
   * @return nfsServerLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerLt() {
    return nfsServerLt;
  }


  public void setNfsServerLt(String nfsServerLt) {
    this.nfsServerLt = nfsServerLt;
  }


  public BackupStoreRepositoryWhereInput nfsServerLte(String nfsServerLte) {
    
    this.nfsServerLte = nfsServerLte;
    return this;
  }

   /**
   * Get nfsServerLte
   * @return nfsServerLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerLte() {
    return nfsServerLte;
  }


  public void setNfsServerLte(String nfsServerLte) {
    this.nfsServerLte = nfsServerLte;
  }


  public BackupStoreRepositoryWhereInput nfsServerNot(String nfsServerNot) {
    
    this.nfsServerNot = nfsServerNot;
    return this;
  }

   /**
   * Get nfsServerNot
   * @return nfsServerNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerNot() {
    return nfsServerNot;
  }


  public void setNfsServerNot(String nfsServerNot) {
    this.nfsServerNot = nfsServerNot;
  }


  public BackupStoreRepositoryWhereInput nfsServerNotContains(String nfsServerNotContains) {
    
    this.nfsServerNotContains = nfsServerNotContains;
    return this;
  }

   /**
   * Get nfsServerNotContains
   * @return nfsServerNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerNotContains() {
    return nfsServerNotContains;
  }


  public void setNfsServerNotContains(String nfsServerNotContains) {
    this.nfsServerNotContains = nfsServerNotContains;
  }


  public BackupStoreRepositoryWhereInput nfsServerNotEndsWith(String nfsServerNotEndsWith) {
    
    this.nfsServerNotEndsWith = nfsServerNotEndsWith;
    return this;
  }

   /**
   * Get nfsServerNotEndsWith
   * @return nfsServerNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerNotEndsWith() {
    return nfsServerNotEndsWith;
  }


  public void setNfsServerNotEndsWith(String nfsServerNotEndsWith) {
    this.nfsServerNotEndsWith = nfsServerNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput nfsServerNotIn(List<String> nfsServerNotIn) {
    
    this.nfsServerNotIn = nfsServerNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addNfsServerNotInItem(String nfsServerNotInItem) {
    if (this.nfsServerNotIn == null) {
      this.nfsServerNotIn = new ArrayList<String>();
    }
    this.nfsServerNotIn.add(nfsServerNotInItem);
    return this;
  }

   /**
   * Get nfsServerNotIn
   * @return nfsServerNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNfsServerNotIn() {
    return nfsServerNotIn;
  }


  public void setNfsServerNotIn(List<String> nfsServerNotIn) {
    this.nfsServerNotIn = nfsServerNotIn;
  }


  public BackupStoreRepositoryWhereInput nfsServerNotStartsWith(String nfsServerNotStartsWith) {
    
    this.nfsServerNotStartsWith = nfsServerNotStartsWith;
    return this;
  }

   /**
   * Get nfsServerNotStartsWith
   * @return nfsServerNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerNotStartsWith() {
    return nfsServerNotStartsWith;
  }


  public void setNfsServerNotStartsWith(String nfsServerNotStartsWith) {
    this.nfsServerNotStartsWith = nfsServerNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput nfsServerStartsWith(String nfsServerStartsWith) {
    
    this.nfsServerStartsWith = nfsServerStartsWith;
    return this;
  }

   /**
   * Get nfsServerStartsWith
   * @return nfsServerStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNfsServerStartsWith() {
    return nfsServerStartsWith;
  }


  public void setNfsServerStartsWith(String nfsServerStartsWith) {
    this.nfsServerStartsWith = nfsServerStartsWith;
  }


  public BackupStoreRepositoryWhereInput status(BackupStoreStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupStoreStatus getStatus() {
    return status;
  }


  public void setStatus(BackupStoreStatus status) {
    this.status = status;
  }


  public BackupStoreRepositoryWhereInput statusIn(List<BackupStoreStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addStatusInItem(BackupStoreStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<BackupStoreStatus>();
    }
    this.statusIn.add(statusInItem);
    return this;
  }

   /**
   * Get statusIn
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupStoreStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<BackupStoreStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public BackupStoreRepositoryWhereInput statusNot(BackupStoreStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupStoreStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(BackupStoreStatus statusNot) {
    this.statusNot = statusNot;
  }


  public BackupStoreRepositoryWhereInput statusNotIn(List<BackupStoreStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addStatusNotInItem(BackupStoreStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<BackupStoreStatus>();
    }
    this.statusNotIn.add(statusNotInItem);
    return this;
  }

   /**
   * Get statusNotIn
   * @return statusNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupStoreStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<BackupStoreStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public BackupStoreRepositoryWhereInput totalCapacity(Long totalCapacity) {
    
    this.totalCapacity = totalCapacity;
    return this;
  }

   /**
   * Get totalCapacity
   * @return totalCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCapacity() {
    return totalCapacity;
  }


  public void setTotalCapacity(Long totalCapacity) {
    this.totalCapacity = totalCapacity;
  }


  public BackupStoreRepositoryWhereInput totalCapacityGt(Long totalCapacityGt) {
    
    this.totalCapacityGt = totalCapacityGt;
    return this;
  }

   /**
   * Get totalCapacityGt
   * @return totalCapacityGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCapacityGt() {
    return totalCapacityGt;
  }


  public void setTotalCapacityGt(Long totalCapacityGt) {
    this.totalCapacityGt = totalCapacityGt;
  }


  public BackupStoreRepositoryWhereInput totalCapacityGte(Long totalCapacityGte) {
    
    this.totalCapacityGte = totalCapacityGte;
    return this;
  }

   /**
   * Get totalCapacityGte
   * @return totalCapacityGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCapacityGte() {
    return totalCapacityGte;
  }


  public void setTotalCapacityGte(Long totalCapacityGte) {
    this.totalCapacityGte = totalCapacityGte;
  }


  public BackupStoreRepositoryWhereInput totalCapacityIn(List<Long> totalCapacityIn) {
    
    this.totalCapacityIn = totalCapacityIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addTotalCapacityInItem(Long totalCapacityInItem) {
    if (this.totalCapacityIn == null) {
      this.totalCapacityIn = new ArrayList<Long>();
    }
    this.totalCapacityIn.add(totalCapacityInItem);
    return this;
  }

   /**
   * Get totalCapacityIn
   * @return totalCapacityIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalCapacityIn() {
    return totalCapacityIn;
  }


  public void setTotalCapacityIn(List<Long> totalCapacityIn) {
    this.totalCapacityIn = totalCapacityIn;
  }


  public BackupStoreRepositoryWhereInput totalCapacityLt(Long totalCapacityLt) {
    
    this.totalCapacityLt = totalCapacityLt;
    return this;
  }

   /**
   * Get totalCapacityLt
   * @return totalCapacityLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCapacityLt() {
    return totalCapacityLt;
  }


  public void setTotalCapacityLt(Long totalCapacityLt) {
    this.totalCapacityLt = totalCapacityLt;
  }


  public BackupStoreRepositoryWhereInput totalCapacityLte(Long totalCapacityLte) {
    
    this.totalCapacityLte = totalCapacityLte;
    return this;
  }

   /**
   * Get totalCapacityLte
   * @return totalCapacityLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCapacityLte() {
    return totalCapacityLte;
  }


  public void setTotalCapacityLte(Long totalCapacityLte) {
    this.totalCapacityLte = totalCapacityLte;
  }


  public BackupStoreRepositoryWhereInput totalCapacityNot(Long totalCapacityNot) {
    
    this.totalCapacityNot = totalCapacityNot;
    return this;
  }

   /**
   * Get totalCapacityNot
   * @return totalCapacityNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalCapacityNot() {
    return totalCapacityNot;
  }


  public void setTotalCapacityNot(Long totalCapacityNot) {
    this.totalCapacityNot = totalCapacityNot;
  }


  public BackupStoreRepositoryWhereInput totalCapacityNotIn(List<Long> totalCapacityNotIn) {
    
    this.totalCapacityNotIn = totalCapacityNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addTotalCapacityNotInItem(Long totalCapacityNotInItem) {
    if (this.totalCapacityNotIn == null) {
      this.totalCapacityNotIn = new ArrayList<Long>();
    }
    this.totalCapacityNotIn.add(totalCapacityNotInItem);
    return this;
  }

   /**
   * Get totalCapacityNotIn
   * @return totalCapacityNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getTotalCapacityNotIn() {
    return totalCapacityNotIn;
  }


  public void setTotalCapacityNotIn(List<Long> totalCapacityNotIn) {
    this.totalCapacityNotIn = totalCapacityNotIn;
  }


  public BackupStoreRepositoryWhereInput type(BackupStoreType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupStoreType getType() {
    return type;
  }


  public void setType(BackupStoreType type) {
    this.type = type;
  }


  public BackupStoreRepositoryWhereInput typeIn(List<BackupStoreType> typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addTypeInItem(BackupStoreType typeInItem) {
    if (this.typeIn == null) {
      this.typeIn = new ArrayList<BackupStoreType>();
    }
    this.typeIn.add(typeInItem);
    return this;
  }

   /**
   * Get typeIn
   * @return typeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupStoreType> getTypeIn() {
    return typeIn;
  }


  public void setTypeIn(List<BackupStoreType> typeIn) {
    this.typeIn = typeIn;
  }


  public BackupStoreRepositoryWhereInput typeNot(BackupStoreType typeNot) {
    
    this.typeNot = typeNot;
    return this;
  }

   /**
   * Get typeNot
   * @return typeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackupStoreType getTypeNot() {
    return typeNot;
  }


  public void setTypeNot(BackupStoreType typeNot) {
    this.typeNot = typeNot;
  }


  public BackupStoreRepositoryWhereInput typeNotIn(List<BackupStoreType> typeNotIn) {
    
    this.typeNotIn = typeNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addTypeNotInItem(BackupStoreType typeNotInItem) {
    if (this.typeNotIn == null) {
      this.typeNotIn = new ArrayList<BackupStoreType>();
    }
    this.typeNotIn.add(typeNotInItem);
    return this;
  }

   /**
   * Get typeNotIn
   * @return typeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BackupStoreType> getTypeNotIn() {
    return typeNotIn;
  }


  public void setTypeNotIn(List<BackupStoreType> typeNotIn) {
    this.typeNotIn = typeNotIn;
  }


  public BackupStoreRepositoryWhereInput updateTimestamp(String updateTimestamp) {
    
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * Get updateTimestamp
   * @return updateTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestamp() {
    return updateTimestamp;
  }


  public void setUpdateTimestamp(String updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }


  public BackupStoreRepositoryWhereInput updateTimestampContains(String updateTimestampContains) {
    
    this.updateTimestampContains = updateTimestampContains;
    return this;
  }

   /**
   * Get updateTimestampContains
   * @return updateTimestampContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampContains() {
    return updateTimestampContains;
  }


  public void setUpdateTimestampContains(String updateTimestampContains) {
    this.updateTimestampContains = updateTimestampContains;
  }


  public BackupStoreRepositoryWhereInput updateTimestampEndsWith(String updateTimestampEndsWith) {
    
    this.updateTimestampEndsWith = updateTimestampEndsWith;
    return this;
  }

   /**
   * Get updateTimestampEndsWith
   * @return updateTimestampEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampEndsWith() {
    return updateTimestampEndsWith;
  }


  public void setUpdateTimestampEndsWith(String updateTimestampEndsWith) {
    this.updateTimestampEndsWith = updateTimestampEndsWith;
  }


  public BackupStoreRepositoryWhereInput updateTimestampGt(String updateTimestampGt) {
    
    this.updateTimestampGt = updateTimestampGt;
    return this;
  }

   /**
   * Get updateTimestampGt
   * @return updateTimestampGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampGt() {
    return updateTimestampGt;
  }


  public void setUpdateTimestampGt(String updateTimestampGt) {
    this.updateTimestampGt = updateTimestampGt;
  }


  public BackupStoreRepositoryWhereInput updateTimestampGte(String updateTimestampGte) {
    
    this.updateTimestampGte = updateTimestampGte;
    return this;
  }

   /**
   * Get updateTimestampGte
   * @return updateTimestampGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampGte() {
    return updateTimestampGte;
  }


  public void setUpdateTimestampGte(String updateTimestampGte) {
    this.updateTimestampGte = updateTimestampGte;
  }


  public BackupStoreRepositoryWhereInput updateTimestampIn(List<String> updateTimestampIn) {
    
    this.updateTimestampIn = updateTimestampIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addUpdateTimestampInItem(String updateTimestampInItem) {
    if (this.updateTimestampIn == null) {
      this.updateTimestampIn = new ArrayList<String>();
    }
    this.updateTimestampIn.add(updateTimestampInItem);
    return this;
  }

   /**
   * Get updateTimestampIn
   * @return updateTimestampIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUpdateTimestampIn() {
    return updateTimestampIn;
  }


  public void setUpdateTimestampIn(List<String> updateTimestampIn) {
    this.updateTimestampIn = updateTimestampIn;
  }


  public BackupStoreRepositoryWhereInput updateTimestampLt(String updateTimestampLt) {
    
    this.updateTimestampLt = updateTimestampLt;
    return this;
  }

   /**
   * Get updateTimestampLt
   * @return updateTimestampLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampLt() {
    return updateTimestampLt;
  }


  public void setUpdateTimestampLt(String updateTimestampLt) {
    this.updateTimestampLt = updateTimestampLt;
  }


  public BackupStoreRepositoryWhereInput updateTimestampLte(String updateTimestampLte) {
    
    this.updateTimestampLte = updateTimestampLte;
    return this;
  }

   /**
   * Get updateTimestampLte
   * @return updateTimestampLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampLte() {
    return updateTimestampLte;
  }


  public void setUpdateTimestampLte(String updateTimestampLte) {
    this.updateTimestampLte = updateTimestampLte;
  }


  public BackupStoreRepositoryWhereInput updateTimestampNot(String updateTimestampNot) {
    
    this.updateTimestampNot = updateTimestampNot;
    return this;
  }

   /**
   * Get updateTimestampNot
   * @return updateTimestampNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampNot() {
    return updateTimestampNot;
  }


  public void setUpdateTimestampNot(String updateTimestampNot) {
    this.updateTimestampNot = updateTimestampNot;
  }


  public BackupStoreRepositoryWhereInput updateTimestampNotContains(String updateTimestampNotContains) {
    
    this.updateTimestampNotContains = updateTimestampNotContains;
    return this;
  }

   /**
   * Get updateTimestampNotContains
   * @return updateTimestampNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampNotContains() {
    return updateTimestampNotContains;
  }


  public void setUpdateTimestampNotContains(String updateTimestampNotContains) {
    this.updateTimestampNotContains = updateTimestampNotContains;
  }


  public BackupStoreRepositoryWhereInput updateTimestampNotEndsWith(String updateTimestampNotEndsWith) {
    
    this.updateTimestampNotEndsWith = updateTimestampNotEndsWith;
    return this;
  }

   /**
   * Get updateTimestampNotEndsWith
   * @return updateTimestampNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampNotEndsWith() {
    return updateTimestampNotEndsWith;
  }


  public void setUpdateTimestampNotEndsWith(String updateTimestampNotEndsWith) {
    this.updateTimestampNotEndsWith = updateTimestampNotEndsWith;
  }


  public BackupStoreRepositoryWhereInput updateTimestampNotIn(List<String> updateTimestampNotIn) {
    
    this.updateTimestampNotIn = updateTimestampNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addUpdateTimestampNotInItem(String updateTimestampNotInItem) {
    if (this.updateTimestampNotIn == null) {
      this.updateTimestampNotIn = new ArrayList<String>();
    }
    this.updateTimestampNotIn.add(updateTimestampNotInItem);
    return this;
  }

   /**
   * Get updateTimestampNotIn
   * @return updateTimestampNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUpdateTimestampNotIn() {
    return updateTimestampNotIn;
  }


  public void setUpdateTimestampNotIn(List<String> updateTimestampNotIn) {
    this.updateTimestampNotIn = updateTimestampNotIn;
  }


  public BackupStoreRepositoryWhereInput updateTimestampNotStartsWith(String updateTimestampNotStartsWith) {
    
    this.updateTimestampNotStartsWith = updateTimestampNotStartsWith;
    return this;
  }

   /**
   * Get updateTimestampNotStartsWith
   * @return updateTimestampNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampNotStartsWith() {
    return updateTimestampNotStartsWith;
  }


  public void setUpdateTimestampNotStartsWith(String updateTimestampNotStartsWith) {
    this.updateTimestampNotStartsWith = updateTimestampNotStartsWith;
  }


  public BackupStoreRepositoryWhereInput updateTimestampStartsWith(String updateTimestampStartsWith) {
    
    this.updateTimestampStartsWith = updateTimestampStartsWith;
    return this;
  }

   /**
   * Get updateTimestampStartsWith
   * @return updateTimestampStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateTimestampStartsWith() {
    return updateTimestampStartsWith;
  }


  public void setUpdateTimestampStartsWith(String updateTimestampStartsWith) {
    this.updateTimestampStartsWith = updateTimestampStartsWith;
  }


  public BackupStoreRepositoryWhereInput usedDataSpace(Long usedDataSpace) {
    
    this.usedDataSpace = usedDataSpace;
    return this;
  }

   /**
   * Get usedDataSpace
   * @return usedDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpace() {
    return usedDataSpace;
  }


  public void setUsedDataSpace(Long usedDataSpace) {
    this.usedDataSpace = usedDataSpace;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceGt(Long usedDataSpaceGt) {
    
    this.usedDataSpaceGt = usedDataSpaceGt;
    return this;
  }

   /**
   * Get usedDataSpaceGt
   * @return usedDataSpaceGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceGt() {
    return usedDataSpaceGt;
  }


  public void setUsedDataSpaceGt(Long usedDataSpaceGt) {
    this.usedDataSpaceGt = usedDataSpaceGt;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceGte(Long usedDataSpaceGte) {
    
    this.usedDataSpaceGte = usedDataSpaceGte;
    return this;
  }

   /**
   * Get usedDataSpaceGte
   * @return usedDataSpaceGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceGte() {
    return usedDataSpaceGte;
  }


  public void setUsedDataSpaceGte(Long usedDataSpaceGte) {
    this.usedDataSpaceGte = usedDataSpaceGte;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceIn(List<Long> usedDataSpaceIn) {
    
    this.usedDataSpaceIn = usedDataSpaceIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addUsedDataSpaceInItem(Long usedDataSpaceInItem) {
    if (this.usedDataSpaceIn == null) {
      this.usedDataSpaceIn = new ArrayList<Long>();
    }
    this.usedDataSpaceIn.add(usedDataSpaceInItem);
    return this;
  }

   /**
   * Get usedDataSpaceIn
   * @return usedDataSpaceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getUsedDataSpaceIn() {
    return usedDataSpaceIn;
  }


  public void setUsedDataSpaceIn(List<Long> usedDataSpaceIn) {
    this.usedDataSpaceIn = usedDataSpaceIn;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceLt(Long usedDataSpaceLt) {
    
    this.usedDataSpaceLt = usedDataSpaceLt;
    return this;
  }

   /**
   * Get usedDataSpaceLt
   * @return usedDataSpaceLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceLt() {
    return usedDataSpaceLt;
  }


  public void setUsedDataSpaceLt(Long usedDataSpaceLt) {
    this.usedDataSpaceLt = usedDataSpaceLt;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceLte(Long usedDataSpaceLte) {
    
    this.usedDataSpaceLte = usedDataSpaceLte;
    return this;
  }

   /**
   * Get usedDataSpaceLte
   * @return usedDataSpaceLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceLte() {
    return usedDataSpaceLte;
  }


  public void setUsedDataSpaceLte(Long usedDataSpaceLte) {
    this.usedDataSpaceLte = usedDataSpaceLte;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceNot(Long usedDataSpaceNot) {
    
    this.usedDataSpaceNot = usedDataSpaceNot;
    return this;
  }

   /**
   * Get usedDataSpaceNot
   * @return usedDataSpaceNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDataSpaceNot() {
    return usedDataSpaceNot;
  }


  public void setUsedDataSpaceNot(Long usedDataSpaceNot) {
    this.usedDataSpaceNot = usedDataSpaceNot;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
    
    this.usedDataSpaceNotIn = usedDataSpaceNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addUsedDataSpaceNotInItem(Long usedDataSpaceNotInItem) {
    if (this.usedDataSpaceNotIn == null) {
      this.usedDataSpaceNotIn = new ArrayList<Long>();
    }
    this.usedDataSpaceNotIn.add(usedDataSpaceNotInItem);
    return this;
  }

   /**
   * Get usedDataSpaceNotIn
   * @return usedDataSpaceNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getUsedDataSpaceNotIn() {
    return usedDataSpaceNotIn;
  }


  public void setUsedDataSpaceNotIn(List<Long> usedDataSpaceNotIn) {
    this.usedDataSpaceNotIn = usedDataSpaceNotIn;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsage(Double usedDataSpaceUsage) {
    
    this.usedDataSpaceUsage = usedDataSpaceUsage;
    return this;
  }

   /**
   * Get usedDataSpaceUsage
   * @return usedDataSpaceUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedDataSpaceUsage() {
    return usedDataSpaceUsage;
  }


  public void setUsedDataSpaceUsage(Double usedDataSpaceUsage) {
    this.usedDataSpaceUsage = usedDataSpaceUsage;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsageGt(Double usedDataSpaceUsageGt) {
    
    this.usedDataSpaceUsageGt = usedDataSpaceUsageGt;
    return this;
  }

   /**
   * Get usedDataSpaceUsageGt
   * @return usedDataSpaceUsageGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedDataSpaceUsageGt() {
    return usedDataSpaceUsageGt;
  }


  public void setUsedDataSpaceUsageGt(Double usedDataSpaceUsageGt) {
    this.usedDataSpaceUsageGt = usedDataSpaceUsageGt;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsageGte(Double usedDataSpaceUsageGte) {
    
    this.usedDataSpaceUsageGte = usedDataSpaceUsageGte;
    return this;
  }

   /**
   * Get usedDataSpaceUsageGte
   * @return usedDataSpaceUsageGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedDataSpaceUsageGte() {
    return usedDataSpaceUsageGte;
  }


  public void setUsedDataSpaceUsageGte(Double usedDataSpaceUsageGte) {
    this.usedDataSpaceUsageGte = usedDataSpaceUsageGte;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsageIn(List<Double> usedDataSpaceUsageIn) {
    
    this.usedDataSpaceUsageIn = usedDataSpaceUsageIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addUsedDataSpaceUsageInItem(Double usedDataSpaceUsageInItem) {
    if (this.usedDataSpaceUsageIn == null) {
      this.usedDataSpaceUsageIn = new ArrayList<Double>();
    }
    this.usedDataSpaceUsageIn.add(usedDataSpaceUsageInItem);
    return this;
  }

   /**
   * Get usedDataSpaceUsageIn
   * @return usedDataSpaceUsageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUsedDataSpaceUsageIn() {
    return usedDataSpaceUsageIn;
  }


  public void setUsedDataSpaceUsageIn(List<Double> usedDataSpaceUsageIn) {
    this.usedDataSpaceUsageIn = usedDataSpaceUsageIn;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsageLt(Double usedDataSpaceUsageLt) {
    
    this.usedDataSpaceUsageLt = usedDataSpaceUsageLt;
    return this;
  }

   /**
   * Get usedDataSpaceUsageLt
   * @return usedDataSpaceUsageLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedDataSpaceUsageLt() {
    return usedDataSpaceUsageLt;
  }


  public void setUsedDataSpaceUsageLt(Double usedDataSpaceUsageLt) {
    this.usedDataSpaceUsageLt = usedDataSpaceUsageLt;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsageLte(Double usedDataSpaceUsageLte) {
    
    this.usedDataSpaceUsageLte = usedDataSpaceUsageLte;
    return this;
  }

   /**
   * Get usedDataSpaceUsageLte
   * @return usedDataSpaceUsageLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedDataSpaceUsageLte() {
    return usedDataSpaceUsageLte;
  }


  public void setUsedDataSpaceUsageLte(Double usedDataSpaceUsageLte) {
    this.usedDataSpaceUsageLte = usedDataSpaceUsageLte;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsageNot(Double usedDataSpaceUsageNot) {
    
    this.usedDataSpaceUsageNot = usedDataSpaceUsageNot;
    return this;
  }

   /**
   * Get usedDataSpaceUsageNot
   * @return usedDataSpaceUsageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getUsedDataSpaceUsageNot() {
    return usedDataSpaceUsageNot;
  }


  public void setUsedDataSpaceUsageNot(Double usedDataSpaceUsageNot) {
    this.usedDataSpaceUsageNot = usedDataSpaceUsageNot;
  }


  public BackupStoreRepositoryWhereInput usedDataSpaceUsageNotIn(List<Double> usedDataSpaceUsageNotIn) {
    
    this.usedDataSpaceUsageNotIn = usedDataSpaceUsageNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addUsedDataSpaceUsageNotInItem(Double usedDataSpaceUsageNotInItem) {
    if (this.usedDataSpaceUsageNotIn == null) {
      this.usedDataSpaceUsageNotIn = new ArrayList<Double>();
    }
    this.usedDataSpaceUsageNotIn.add(usedDataSpaceUsageNotInItem);
    return this;
  }

   /**
   * Get usedDataSpaceUsageNotIn
   * @return usedDataSpaceUsageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Double> getUsedDataSpaceUsageNotIn() {
    return usedDataSpaceUsageNotIn;
  }


  public void setUsedDataSpaceUsageNotIn(List<Double> usedDataSpaceUsageNotIn) {
    this.usedDataSpaceUsageNotIn = usedDataSpaceUsageNotIn;
  }


  public BackupStoreRepositoryWhereInput validDataSpace(Long validDataSpace) {
    
    this.validDataSpace = validDataSpace;
    return this;
  }

   /**
   * Get validDataSpace
   * @return validDataSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpace() {
    return validDataSpace;
  }


  public void setValidDataSpace(Long validDataSpace) {
    this.validDataSpace = validDataSpace;
  }


  public BackupStoreRepositoryWhereInput validDataSpaceGt(Long validDataSpaceGt) {
    
    this.validDataSpaceGt = validDataSpaceGt;
    return this;
  }

   /**
   * Get validDataSpaceGt
   * @return validDataSpaceGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpaceGt() {
    return validDataSpaceGt;
  }


  public void setValidDataSpaceGt(Long validDataSpaceGt) {
    this.validDataSpaceGt = validDataSpaceGt;
  }


  public BackupStoreRepositoryWhereInput validDataSpaceGte(Long validDataSpaceGte) {
    
    this.validDataSpaceGte = validDataSpaceGte;
    return this;
  }

   /**
   * Get validDataSpaceGte
   * @return validDataSpaceGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpaceGte() {
    return validDataSpaceGte;
  }


  public void setValidDataSpaceGte(Long validDataSpaceGte) {
    this.validDataSpaceGte = validDataSpaceGte;
  }


  public BackupStoreRepositoryWhereInput validDataSpaceIn(List<Long> validDataSpaceIn) {
    
    this.validDataSpaceIn = validDataSpaceIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addValidDataSpaceInItem(Long validDataSpaceInItem) {
    if (this.validDataSpaceIn == null) {
      this.validDataSpaceIn = new ArrayList<Long>();
    }
    this.validDataSpaceIn.add(validDataSpaceInItem);
    return this;
  }

   /**
   * Get validDataSpaceIn
   * @return validDataSpaceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getValidDataSpaceIn() {
    return validDataSpaceIn;
  }


  public void setValidDataSpaceIn(List<Long> validDataSpaceIn) {
    this.validDataSpaceIn = validDataSpaceIn;
  }


  public BackupStoreRepositoryWhereInput validDataSpaceLt(Long validDataSpaceLt) {
    
    this.validDataSpaceLt = validDataSpaceLt;
    return this;
  }

   /**
   * Get validDataSpaceLt
   * @return validDataSpaceLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpaceLt() {
    return validDataSpaceLt;
  }


  public void setValidDataSpaceLt(Long validDataSpaceLt) {
    this.validDataSpaceLt = validDataSpaceLt;
  }


  public BackupStoreRepositoryWhereInput validDataSpaceLte(Long validDataSpaceLte) {
    
    this.validDataSpaceLte = validDataSpaceLte;
    return this;
  }

   /**
   * Get validDataSpaceLte
   * @return validDataSpaceLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpaceLte() {
    return validDataSpaceLte;
  }


  public void setValidDataSpaceLte(Long validDataSpaceLte) {
    this.validDataSpaceLte = validDataSpaceLte;
  }


  public BackupStoreRepositoryWhereInput validDataSpaceNot(Long validDataSpaceNot) {
    
    this.validDataSpaceNot = validDataSpaceNot;
    return this;
  }

   /**
   * Get validDataSpaceNot
   * @return validDataSpaceNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValidDataSpaceNot() {
    return validDataSpaceNot;
  }


  public void setValidDataSpaceNot(Long validDataSpaceNot) {
    this.validDataSpaceNot = validDataSpaceNot;
  }


  public BackupStoreRepositoryWhereInput validDataSpaceNotIn(List<Long> validDataSpaceNotIn) {
    
    this.validDataSpaceNotIn = validDataSpaceNotIn;
    return this;
  }

  public BackupStoreRepositoryWhereInput addValidDataSpaceNotInItem(Long validDataSpaceNotInItem) {
    if (this.validDataSpaceNotIn == null) {
      this.validDataSpaceNotIn = new ArrayList<Long>();
    }
    this.validDataSpaceNotIn.add(validDataSpaceNotInItem);
    return this;
  }

   /**
   * Get validDataSpaceNotIn
   * @return validDataSpaceNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Long> getValidDataSpaceNotIn() {
    return validDataSpaceNotIn;
  }


  public void setValidDataSpaceNotIn(List<Long> validDataSpaceNotIn) {
    this.validDataSpaceNotIn = validDataSpaceNotIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupStoreRepositoryWhereInput backupStoreRepositoryWhereInput = (BackupStoreRepositoryWhereInput) o;
    return Objects.equals(this.AND, backupStoreRepositoryWhereInput.AND) &&
        Objects.equals(this.NOT, backupStoreRepositoryWhereInput.NOT) &&
        Objects.equals(this.OR, backupStoreRepositoryWhereInput.OR) &&
        Objects.equals(this.backupPlansEvery, backupStoreRepositoryWhereInput.backupPlansEvery) &&
        Objects.equals(this.backupPlansNone, backupStoreRepositoryWhereInput.backupPlansNone) &&
        Objects.equals(this.backupPlansSome, backupStoreRepositoryWhereInput.backupPlansSome) &&
        Objects.equals(this.backupRestorePointsEvery, backupStoreRepositoryWhereInput.backupRestorePointsEvery) &&
        Objects.equals(this.backupRestorePointsNone, backupStoreRepositoryWhereInput.backupRestorePointsNone) &&
        Objects.equals(this.backupRestorePointsSome, backupStoreRepositoryWhereInput.backupRestorePointsSome) &&
        Objects.equals(this.backupService, backupStoreRepositoryWhereInput.backupService) &&
        Objects.equals(this.createdAt, backupStoreRepositoryWhereInput.createdAt) &&
        Objects.equals(this.createdAtGt, backupStoreRepositoryWhereInput.createdAtGt) &&
        Objects.equals(this.createdAtGte, backupStoreRepositoryWhereInput.createdAtGte) &&
        Objects.equals(this.createdAtIn, backupStoreRepositoryWhereInput.createdAtIn) &&
        Objects.equals(this.createdAtLt, backupStoreRepositoryWhereInput.createdAtLt) &&
        Objects.equals(this.createdAtLte, backupStoreRepositoryWhereInput.createdAtLte) &&
        Objects.equals(this.createdAtNot, backupStoreRepositoryWhereInput.createdAtNot) &&
        Objects.equals(this.createdAtNotIn, backupStoreRepositoryWhereInput.createdAtNotIn) &&
        Objects.equals(this.description, backupStoreRepositoryWhereInput.description) &&
        Objects.equals(this.descriptionContains, backupStoreRepositoryWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, backupStoreRepositoryWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, backupStoreRepositoryWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, backupStoreRepositoryWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, backupStoreRepositoryWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, backupStoreRepositoryWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, backupStoreRepositoryWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, backupStoreRepositoryWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, backupStoreRepositoryWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, backupStoreRepositoryWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, backupStoreRepositoryWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, backupStoreRepositoryWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, backupStoreRepositoryWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, backupStoreRepositoryWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, backupStoreRepositoryWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, backupStoreRepositoryWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, backupStoreRepositoryWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.errorCode, backupStoreRepositoryWhereInput.errorCode) &&
        Objects.equals(this.errorCodeContains, backupStoreRepositoryWhereInput.errorCodeContains) &&
        Objects.equals(this.errorCodeEndsWith, backupStoreRepositoryWhereInput.errorCodeEndsWith) &&
        Objects.equals(this.errorCodeGt, backupStoreRepositoryWhereInput.errorCodeGt) &&
        Objects.equals(this.errorCodeGte, backupStoreRepositoryWhereInput.errorCodeGte) &&
        Objects.equals(this.errorCodeIn, backupStoreRepositoryWhereInput.errorCodeIn) &&
        Objects.equals(this.errorCodeLt, backupStoreRepositoryWhereInput.errorCodeLt) &&
        Objects.equals(this.errorCodeLte, backupStoreRepositoryWhereInput.errorCodeLte) &&
        Objects.equals(this.errorCodeNot, backupStoreRepositoryWhereInput.errorCodeNot) &&
        Objects.equals(this.errorCodeNotContains, backupStoreRepositoryWhereInput.errorCodeNotContains) &&
        Objects.equals(this.errorCodeNotEndsWith, backupStoreRepositoryWhereInput.errorCodeNotEndsWith) &&
        Objects.equals(this.errorCodeNotIn, backupStoreRepositoryWhereInput.errorCodeNotIn) &&
        Objects.equals(this.errorCodeNotStartsWith, backupStoreRepositoryWhereInput.errorCodeNotStartsWith) &&
        Objects.equals(this.errorCodeStartsWith, backupStoreRepositoryWhereInput.errorCodeStartsWith) &&
        Objects.equals(this.id, backupStoreRepositoryWhereInput.id) &&
        Objects.equals(this.idContains, backupStoreRepositoryWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, backupStoreRepositoryWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, backupStoreRepositoryWhereInput.idGt) &&
        Objects.equals(this.idGte, backupStoreRepositoryWhereInput.idGte) &&
        Objects.equals(this.idIn, backupStoreRepositoryWhereInput.idIn) &&
        Objects.equals(this.idLt, backupStoreRepositoryWhereInput.idLt) &&
        Objects.equals(this.idLte, backupStoreRepositoryWhereInput.idLte) &&
        Objects.equals(this.idNot, backupStoreRepositoryWhereInput.idNot) &&
        Objects.equals(this.idNotContains, backupStoreRepositoryWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, backupStoreRepositoryWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, backupStoreRepositoryWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, backupStoreRepositoryWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, backupStoreRepositoryWhereInput.idStartsWith) &&
        Objects.equals(this.iscsiChapName, backupStoreRepositoryWhereInput.iscsiChapName) &&
        Objects.equals(this.iscsiChapNameContains, backupStoreRepositoryWhereInput.iscsiChapNameContains) &&
        Objects.equals(this.iscsiChapNameEndsWith, backupStoreRepositoryWhereInput.iscsiChapNameEndsWith) &&
        Objects.equals(this.iscsiChapNameGt, backupStoreRepositoryWhereInput.iscsiChapNameGt) &&
        Objects.equals(this.iscsiChapNameGte, backupStoreRepositoryWhereInput.iscsiChapNameGte) &&
        Objects.equals(this.iscsiChapNameIn, backupStoreRepositoryWhereInput.iscsiChapNameIn) &&
        Objects.equals(this.iscsiChapNameLt, backupStoreRepositoryWhereInput.iscsiChapNameLt) &&
        Objects.equals(this.iscsiChapNameLte, backupStoreRepositoryWhereInput.iscsiChapNameLte) &&
        Objects.equals(this.iscsiChapNameNot, backupStoreRepositoryWhereInput.iscsiChapNameNot) &&
        Objects.equals(this.iscsiChapNameNotContains, backupStoreRepositoryWhereInput.iscsiChapNameNotContains) &&
        Objects.equals(this.iscsiChapNameNotEndsWith, backupStoreRepositoryWhereInput.iscsiChapNameNotEndsWith) &&
        Objects.equals(this.iscsiChapNameNotIn, backupStoreRepositoryWhereInput.iscsiChapNameNotIn) &&
        Objects.equals(this.iscsiChapNameNotStartsWith, backupStoreRepositoryWhereInput.iscsiChapNameNotStartsWith) &&
        Objects.equals(this.iscsiChapNameStartsWith, backupStoreRepositoryWhereInput.iscsiChapNameStartsWith) &&
        Objects.equals(this.iscsiChapSecret, backupStoreRepositoryWhereInput.iscsiChapSecret) &&
        Objects.equals(this.iscsiChapSecretContains, backupStoreRepositoryWhereInput.iscsiChapSecretContains) &&
        Objects.equals(this.iscsiChapSecretEndsWith, backupStoreRepositoryWhereInput.iscsiChapSecretEndsWith) &&
        Objects.equals(this.iscsiChapSecretGt, backupStoreRepositoryWhereInput.iscsiChapSecretGt) &&
        Objects.equals(this.iscsiChapSecretGte, backupStoreRepositoryWhereInput.iscsiChapSecretGte) &&
        Objects.equals(this.iscsiChapSecretIn, backupStoreRepositoryWhereInput.iscsiChapSecretIn) &&
        Objects.equals(this.iscsiChapSecretLt, backupStoreRepositoryWhereInput.iscsiChapSecretLt) &&
        Objects.equals(this.iscsiChapSecretLte, backupStoreRepositoryWhereInput.iscsiChapSecretLte) &&
        Objects.equals(this.iscsiChapSecretNot, backupStoreRepositoryWhereInput.iscsiChapSecretNot) &&
        Objects.equals(this.iscsiChapSecretNotContains, backupStoreRepositoryWhereInput.iscsiChapSecretNotContains) &&
        Objects.equals(this.iscsiChapSecretNotEndsWith, backupStoreRepositoryWhereInput.iscsiChapSecretNotEndsWith) &&
        Objects.equals(this.iscsiChapSecretNotIn, backupStoreRepositoryWhereInput.iscsiChapSecretNotIn) &&
        Objects.equals(this.iscsiChapSecretNotStartsWith, backupStoreRepositoryWhereInput.iscsiChapSecretNotStartsWith) &&
        Objects.equals(this.iscsiChapSecretStartsWith, backupStoreRepositoryWhereInput.iscsiChapSecretStartsWith) &&
        Objects.equals(this.iscsiIp, backupStoreRepositoryWhereInput.iscsiIp) &&
        Objects.equals(this.iscsiIpContains, backupStoreRepositoryWhereInput.iscsiIpContains) &&
        Objects.equals(this.iscsiIpEndsWith, backupStoreRepositoryWhereInput.iscsiIpEndsWith) &&
        Objects.equals(this.iscsiIpGt, backupStoreRepositoryWhereInput.iscsiIpGt) &&
        Objects.equals(this.iscsiIpGte, backupStoreRepositoryWhereInput.iscsiIpGte) &&
        Objects.equals(this.iscsiIpIn, backupStoreRepositoryWhereInput.iscsiIpIn) &&
        Objects.equals(this.iscsiIpLt, backupStoreRepositoryWhereInput.iscsiIpLt) &&
        Objects.equals(this.iscsiIpLte, backupStoreRepositoryWhereInput.iscsiIpLte) &&
        Objects.equals(this.iscsiIpNot, backupStoreRepositoryWhereInput.iscsiIpNot) &&
        Objects.equals(this.iscsiIpNotContains, backupStoreRepositoryWhereInput.iscsiIpNotContains) &&
        Objects.equals(this.iscsiIpNotEndsWith, backupStoreRepositoryWhereInput.iscsiIpNotEndsWith) &&
        Objects.equals(this.iscsiIpNotIn, backupStoreRepositoryWhereInput.iscsiIpNotIn) &&
        Objects.equals(this.iscsiIpNotStartsWith, backupStoreRepositoryWhereInput.iscsiIpNotStartsWith) &&
        Objects.equals(this.iscsiIpStartsWith, backupStoreRepositoryWhereInput.iscsiIpStartsWith) &&
        Objects.equals(this.iscsiLunId, backupStoreRepositoryWhereInput.iscsiLunId) &&
        Objects.equals(this.iscsiLunIdContains, backupStoreRepositoryWhereInput.iscsiLunIdContains) &&
        Objects.equals(this.iscsiLunIdEndsWith, backupStoreRepositoryWhereInput.iscsiLunIdEndsWith) &&
        Objects.equals(this.iscsiLunIdGt, backupStoreRepositoryWhereInput.iscsiLunIdGt) &&
        Objects.equals(this.iscsiLunIdGte, backupStoreRepositoryWhereInput.iscsiLunIdGte) &&
        Objects.equals(this.iscsiLunIdIn, backupStoreRepositoryWhereInput.iscsiLunIdIn) &&
        Objects.equals(this.iscsiLunIdLt, backupStoreRepositoryWhereInput.iscsiLunIdLt) &&
        Objects.equals(this.iscsiLunIdLte, backupStoreRepositoryWhereInput.iscsiLunIdLte) &&
        Objects.equals(this.iscsiLunIdNot, backupStoreRepositoryWhereInput.iscsiLunIdNot) &&
        Objects.equals(this.iscsiLunIdNotContains, backupStoreRepositoryWhereInput.iscsiLunIdNotContains) &&
        Objects.equals(this.iscsiLunIdNotEndsWith, backupStoreRepositoryWhereInput.iscsiLunIdNotEndsWith) &&
        Objects.equals(this.iscsiLunIdNotIn, backupStoreRepositoryWhereInput.iscsiLunIdNotIn) &&
        Objects.equals(this.iscsiLunIdNotStartsWith, backupStoreRepositoryWhereInput.iscsiLunIdNotStartsWith) &&
        Objects.equals(this.iscsiLunIdStartsWith, backupStoreRepositoryWhereInput.iscsiLunIdStartsWith) &&
        Objects.equals(this.iscsiPort, backupStoreRepositoryWhereInput.iscsiPort) &&
        Objects.equals(this.iscsiPortGt, backupStoreRepositoryWhereInput.iscsiPortGt) &&
        Objects.equals(this.iscsiPortGte, backupStoreRepositoryWhereInput.iscsiPortGte) &&
        Objects.equals(this.iscsiPortIn, backupStoreRepositoryWhereInput.iscsiPortIn) &&
        Objects.equals(this.iscsiPortLt, backupStoreRepositoryWhereInput.iscsiPortLt) &&
        Objects.equals(this.iscsiPortLte, backupStoreRepositoryWhereInput.iscsiPortLte) &&
        Objects.equals(this.iscsiPortNot, backupStoreRepositoryWhereInput.iscsiPortNot) &&
        Objects.equals(this.iscsiPortNotIn, backupStoreRepositoryWhereInput.iscsiPortNotIn) &&
        Objects.equals(this.iscsiTargetIqn, backupStoreRepositoryWhereInput.iscsiTargetIqn) &&
        Objects.equals(this.iscsiTargetIqnContains, backupStoreRepositoryWhereInput.iscsiTargetIqnContains) &&
        Objects.equals(this.iscsiTargetIqnEndsWith, backupStoreRepositoryWhereInput.iscsiTargetIqnEndsWith) &&
        Objects.equals(this.iscsiTargetIqnGt, backupStoreRepositoryWhereInput.iscsiTargetIqnGt) &&
        Objects.equals(this.iscsiTargetIqnGte, backupStoreRepositoryWhereInput.iscsiTargetIqnGte) &&
        Objects.equals(this.iscsiTargetIqnIn, backupStoreRepositoryWhereInput.iscsiTargetIqnIn) &&
        Objects.equals(this.iscsiTargetIqnLt, backupStoreRepositoryWhereInput.iscsiTargetIqnLt) &&
        Objects.equals(this.iscsiTargetIqnLte, backupStoreRepositoryWhereInput.iscsiTargetIqnLte) &&
        Objects.equals(this.iscsiTargetIqnNot, backupStoreRepositoryWhereInput.iscsiTargetIqnNot) &&
        Objects.equals(this.iscsiTargetIqnNotContains, backupStoreRepositoryWhereInput.iscsiTargetIqnNotContains) &&
        Objects.equals(this.iscsiTargetIqnNotEndsWith, backupStoreRepositoryWhereInput.iscsiTargetIqnNotEndsWith) &&
        Objects.equals(this.iscsiTargetIqnNotIn, backupStoreRepositoryWhereInput.iscsiTargetIqnNotIn) &&
        Objects.equals(this.iscsiTargetIqnNotStartsWith, backupStoreRepositoryWhereInput.iscsiTargetIqnNotStartsWith) &&
        Objects.equals(this.iscsiTargetIqnStartsWith, backupStoreRepositoryWhereInput.iscsiTargetIqnStartsWith) &&
        Objects.equals(this.name, backupStoreRepositoryWhereInput.name) &&
        Objects.equals(this.nameContains, backupStoreRepositoryWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, backupStoreRepositoryWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, backupStoreRepositoryWhereInput.nameGt) &&
        Objects.equals(this.nameGte, backupStoreRepositoryWhereInput.nameGte) &&
        Objects.equals(this.nameIn, backupStoreRepositoryWhereInput.nameIn) &&
        Objects.equals(this.nameLt, backupStoreRepositoryWhereInput.nameLt) &&
        Objects.equals(this.nameLte, backupStoreRepositoryWhereInput.nameLte) &&
        Objects.equals(this.nameNot, backupStoreRepositoryWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, backupStoreRepositoryWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, backupStoreRepositoryWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, backupStoreRepositoryWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, backupStoreRepositoryWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, backupStoreRepositoryWhereInput.nameStartsWith) &&
        Objects.equals(this.nfsPath, backupStoreRepositoryWhereInput.nfsPath) &&
        Objects.equals(this.nfsPathContains, backupStoreRepositoryWhereInput.nfsPathContains) &&
        Objects.equals(this.nfsPathEndsWith, backupStoreRepositoryWhereInput.nfsPathEndsWith) &&
        Objects.equals(this.nfsPathGt, backupStoreRepositoryWhereInput.nfsPathGt) &&
        Objects.equals(this.nfsPathGte, backupStoreRepositoryWhereInput.nfsPathGte) &&
        Objects.equals(this.nfsPathIn, backupStoreRepositoryWhereInput.nfsPathIn) &&
        Objects.equals(this.nfsPathLt, backupStoreRepositoryWhereInput.nfsPathLt) &&
        Objects.equals(this.nfsPathLte, backupStoreRepositoryWhereInput.nfsPathLte) &&
        Objects.equals(this.nfsPathNot, backupStoreRepositoryWhereInput.nfsPathNot) &&
        Objects.equals(this.nfsPathNotContains, backupStoreRepositoryWhereInput.nfsPathNotContains) &&
        Objects.equals(this.nfsPathNotEndsWith, backupStoreRepositoryWhereInput.nfsPathNotEndsWith) &&
        Objects.equals(this.nfsPathNotIn, backupStoreRepositoryWhereInput.nfsPathNotIn) &&
        Objects.equals(this.nfsPathNotStartsWith, backupStoreRepositoryWhereInput.nfsPathNotStartsWith) &&
        Objects.equals(this.nfsPathStartsWith, backupStoreRepositoryWhereInput.nfsPathStartsWith) &&
        Objects.equals(this.nfsServer, backupStoreRepositoryWhereInput.nfsServer) &&
        Objects.equals(this.nfsServerContains, backupStoreRepositoryWhereInput.nfsServerContains) &&
        Objects.equals(this.nfsServerEndsWith, backupStoreRepositoryWhereInput.nfsServerEndsWith) &&
        Objects.equals(this.nfsServerGt, backupStoreRepositoryWhereInput.nfsServerGt) &&
        Objects.equals(this.nfsServerGte, backupStoreRepositoryWhereInput.nfsServerGte) &&
        Objects.equals(this.nfsServerIn, backupStoreRepositoryWhereInput.nfsServerIn) &&
        Objects.equals(this.nfsServerLt, backupStoreRepositoryWhereInput.nfsServerLt) &&
        Objects.equals(this.nfsServerLte, backupStoreRepositoryWhereInput.nfsServerLte) &&
        Objects.equals(this.nfsServerNot, backupStoreRepositoryWhereInput.nfsServerNot) &&
        Objects.equals(this.nfsServerNotContains, backupStoreRepositoryWhereInput.nfsServerNotContains) &&
        Objects.equals(this.nfsServerNotEndsWith, backupStoreRepositoryWhereInput.nfsServerNotEndsWith) &&
        Objects.equals(this.nfsServerNotIn, backupStoreRepositoryWhereInput.nfsServerNotIn) &&
        Objects.equals(this.nfsServerNotStartsWith, backupStoreRepositoryWhereInput.nfsServerNotStartsWith) &&
        Objects.equals(this.nfsServerStartsWith, backupStoreRepositoryWhereInput.nfsServerStartsWith) &&
        Objects.equals(this.status, backupStoreRepositoryWhereInput.status) &&
        Objects.equals(this.statusIn, backupStoreRepositoryWhereInput.statusIn) &&
        Objects.equals(this.statusNot, backupStoreRepositoryWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, backupStoreRepositoryWhereInput.statusNotIn) &&
        Objects.equals(this.totalCapacity, backupStoreRepositoryWhereInput.totalCapacity) &&
        Objects.equals(this.totalCapacityGt, backupStoreRepositoryWhereInput.totalCapacityGt) &&
        Objects.equals(this.totalCapacityGte, backupStoreRepositoryWhereInput.totalCapacityGte) &&
        Objects.equals(this.totalCapacityIn, backupStoreRepositoryWhereInput.totalCapacityIn) &&
        Objects.equals(this.totalCapacityLt, backupStoreRepositoryWhereInput.totalCapacityLt) &&
        Objects.equals(this.totalCapacityLte, backupStoreRepositoryWhereInput.totalCapacityLte) &&
        Objects.equals(this.totalCapacityNot, backupStoreRepositoryWhereInput.totalCapacityNot) &&
        Objects.equals(this.totalCapacityNotIn, backupStoreRepositoryWhereInput.totalCapacityNotIn) &&
        Objects.equals(this.type, backupStoreRepositoryWhereInput.type) &&
        Objects.equals(this.typeIn, backupStoreRepositoryWhereInput.typeIn) &&
        Objects.equals(this.typeNot, backupStoreRepositoryWhereInput.typeNot) &&
        Objects.equals(this.typeNotIn, backupStoreRepositoryWhereInput.typeNotIn) &&
        Objects.equals(this.updateTimestamp, backupStoreRepositoryWhereInput.updateTimestamp) &&
        Objects.equals(this.updateTimestampContains, backupStoreRepositoryWhereInput.updateTimestampContains) &&
        Objects.equals(this.updateTimestampEndsWith, backupStoreRepositoryWhereInput.updateTimestampEndsWith) &&
        Objects.equals(this.updateTimestampGt, backupStoreRepositoryWhereInput.updateTimestampGt) &&
        Objects.equals(this.updateTimestampGte, backupStoreRepositoryWhereInput.updateTimestampGte) &&
        Objects.equals(this.updateTimestampIn, backupStoreRepositoryWhereInput.updateTimestampIn) &&
        Objects.equals(this.updateTimestampLt, backupStoreRepositoryWhereInput.updateTimestampLt) &&
        Objects.equals(this.updateTimestampLte, backupStoreRepositoryWhereInput.updateTimestampLte) &&
        Objects.equals(this.updateTimestampNot, backupStoreRepositoryWhereInput.updateTimestampNot) &&
        Objects.equals(this.updateTimestampNotContains, backupStoreRepositoryWhereInput.updateTimestampNotContains) &&
        Objects.equals(this.updateTimestampNotEndsWith, backupStoreRepositoryWhereInput.updateTimestampNotEndsWith) &&
        Objects.equals(this.updateTimestampNotIn, backupStoreRepositoryWhereInput.updateTimestampNotIn) &&
        Objects.equals(this.updateTimestampNotStartsWith, backupStoreRepositoryWhereInput.updateTimestampNotStartsWith) &&
        Objects.equals(this.updateTimestampStartsWith, backupStoreRepositoryWhereInput.updateTimestampStartsWith) &&
        Objects.equals(this.usedDataSpace, backupStoreRepositoryWhereInput.usedDataSpace) &&
        Objects.equals(this.usedDataSpaceGt, backupStoreRepositoryWhereInput.usedDataSpaceGt) &&
        Objects.equals(this.usedDataSpaceGte, backupStoreRepositoryWhereInput.usedDataSpaceGte) &&
        Objects.equals(this.usedDataSpaceIn, backupStoreRepositoryWhereInput.usedDataSpaceIn) &&
        Objects.equals(this.usedDataSpaceLt, backupStoreRepositoryWhereInput.usedDataSpaceLt) &&
        Objects.equals(this.usedDataSpaceLte, backupStoreRepositoryWhereInput.usedDataSpaceLte) &&
        Objects.equals(this.usedDataSpaceNot, backupStoreRepositoryWhereInput.usedDataSpaceNot) &&
        Objects.equals(this.usedDataSpaceNotIn, backupStoreRepositoryWhereInput.usedDataSpaceNotIn) &&
        Objects.equals(this.usedDataSpaceUsage, backupStoreRepositoryWhereInput.usedDataSpaceUsage) &&
        Objects.equals(this.usedDataSpaceUsageGt, backupStoreRepositoryWhereInput.usedDataSpaceUsageGt) &&
        Objects.equals(this.usedDataSpaceUsageGte, backupStoreRepositoryWhereInput.usedDataSpaceUsageGte) &&
        Objects.equals(this.usedDataSpaceUsageIn, backupStoreRepositoryWhereInput.usedDataSpaceUsageIn) &&
        Objects.equals(this.usedDataSpaceUsageLt, backupStoreRepositoryWhereInput.usedDataSpaceUsageLt) &&
        Objects.equals(this.usedDataSpaceUsageLte, backupStoreRepositoryWhereInput.usedDataSpaceUsageLte) &&
        Objects.equals(this.usedDataSpaceUsageNot, backupStoreRepositoryWhereInput.usedDataSpaceUsageNot) &&
        Objects.equals(this.usedDataSpaceUsageNotIn, backupStoreRepositoryWhereInput.usedDataSpaceUsageNotIn) &&
        Objects.equals(this.validDataSpace, backupStoreRepositoryWhereInput.validDataSpace) &&
        Objects.equals(this.validDataSpaceGt, backupStoreRepositoryWhereInput.validDataSpaceGt) &&
        Objects.equals(this.validDataSpaceGte, backupStoreRepositoryWhereInput.validDataSpaceGte) &&
        Objects.equals(this.validDataSpaceIn, backupStoreRepositoryWhereInput.validDataSpaceIn) &&
        Objects.equals(this.validDataSpaceLt, backupStoreRepositoryWhereInput.validDataSpaceLt) &&
        Objects.equals(this.validDataSpaceLte, backupStoreRepositoryWhereInput.validDataSpaceLte) &&
        Objects.equals(this.validDataSpaceNot, backupStoreRepositoryWhereInput.validDataSpaceNot) &&
        Objects.equals(this.validDataSpaceNotIn, backupStoreRepositoryWhereInput.validDataSpaceNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, backupPlansEvery, backupPlansNone, backupPlansSome, backupRestorePointsEvery, backupRestorePointsNone, backupRestorePointsSome, backupService, createdAt, createdAtGt, createdAtGte, createdAtIn, createdAtLt, createdAtLte, createdAtNot, createdAtNotIn, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, errorCode, errorCodeContains, errorCodeEndsWith, errorCodeGt, errorCodeGte, errorCodeIn, errorCodeLt, errorCodeLte, errorCodeNot, errorCodeNotContains, errorCodeNotEndsWith, errorCodeNotIn, errorCodeNotStartsWith, errorCodeStartsWith, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, iscsiChapName, iscsiChapNameContains, iscsiChapNameEndsWith, iscsiChapNameGt, iscsiChapNameGte, iscsiChapNameIn, iscsiChapNameLt, iscsiChapNameLte, iscsiChapNameNot, iscsiChapNameNotContains, iscsiChapNameNotEndsWith, iscsiChapNameNotIn, iscsiChapNameNotStartsWith, iscsiChapNameStartsWith, iscsiChapSecret, iscsiChapSecretContains, iscsiChapSecretEndsWith, iscsiChapSecretGt, iscsiChapSecretGte, iscsiChapSecretIn, iscsiChapSecretLt, iscsiChapSecretLte, iscsiChapSecretNot, iscsiChapSecretNotContains, iscsiChapSecretNotEndsWith, iscsiChapSecretNotIn, iscsiChapSecretNotStartsWith, iscsiChapSecretStartsWith, iscsiIp, iscsiIpContains, iscsiIpEndsWith, iscsiIpGt, iscsiIpGte, iscsiIpIn, iscsiIpLt, iscsiIpLte, iscsiIpNot, iscsiIpNotContains, iscsiIpNotEndsWith, iscsiIpNotIn, iscsiIpNotStartsWith, iscsiIpStartsWith, iscsiLunId, iscsiLunIdContains, iscsiLunIdEndsWith, iscsiLunIdGt, iscsiLunIdGte, iscsiLunIdIn, iscsiLunIdLt, iscsiLunIdLte, iscsiLunIdNot, iscsiLunIdNotContains, iscsiLunIdNotEndsWith, iscsiLunIdNotIn, iscsiLunIdNotStartsWith, iscsiLunIdStartsWith, iscsiPort, iscsiPortGt, iscsiPortGte, iscsiPortIn, iscsiPortLt, iscsiPortLte, iscsiPortNot, iscsiPortNotIn, iscsiTargetIqn, iscsiTargetIqnContains, iscsiTargetIqnEndsWith, iscsiTargetIqnGt, iscsiTargetIqnGte, iscsiTargetIqnIn, iscsiTargetIqnLt, iscsiTargetIqnLte, iscsiTargetIqnNot, iscsiTargetIqnNotContains, iscsiTargetIqnNotEndsWith, iscsiTargetIqnNotIn, iscsiTargetIqnNotStartsWith, iscsiTargetIqnStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, nfsPath, nfsPathContains, nfsPathEndsWith, nfsPathGt, nfsPathGte, nfsPathIn, nfsPathLt, nfsPathLte, nfsPathNot, nfsPathNotContains, nfsPathNotEndsWith, nfsPathNotIn, nfsPathNotStartsWith, nfsPathStartsWith, nfsServer, nfsServerContains, nfsServerEndsWith, nfsServerGt, nfsServerGte, nfsServerIn, nfsServerLt, nfsServerLte, nfsServerNot, nfsServerNotContains, nfsServerNotEndsWith, nfsServerNotIn, nfsServerNotStartsWith, nfsServerStartsWith, status, statusIn, statusNot, statusNotIn, totalCapacity, totalCapacityGt, totalCapacityGte, totalCapacityIn, totalCapacityLt, totalCapacityLte, totalCapacityNot, totalCapacityNotIn, type, typeIn, typeNot, typeNotIn, updateTimestamp, updateTimestampContains, updateTimestampEndsWith, updateTimestampGt, updateTimestampGte, updateTimestampIn, updateTimestampLt, updateTimestampLte, updateTimestampNot, updateTimestampNotContains, updateTimestampNotEndsWith, updateTimestampNotIn, updateTimestampNotStartsWith, updateTimestampStartsWith, usedDataSpace, usedDataSpaceGt, usedDataSpaceGte, usedDataSpaceIn, usedDataSpaceLt, usedDataSpaceLte, usedDataSpaceNot, usedDataSpaceNotIn, usedDataSpaceUsage, usedDataSpaceUsageGt, usedDataSpaceUsageGte, usedDataSpaceUsageIn, usedDataSpaceUsageLt, usedDataSpaceUsageLte, usedDataSpaceUsageNot, usedDataSpaceUsageNotIn, validDataSpace, validDataSpaceGt, validDataSpaceGte, validDataSpaceIn, validDataSpaceLt, validDataSpaceLte, validDataSpaceNot, validDataSpaceNotIn);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupStoreRepositoryWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    backupPlansEvery: ").append(toIndentedString(backupPlansEvery)).append("\n");
    sb.append("    backupPlansNone: ").append(toIndentedString(backupPlansNone)).append("\n");
    sb.append("    backupPlansSome: ").append(toIndentedString(backupPlansSome)).append("\n");
    sb.append("    backupRestorePointsEvery: ").append(toIndentedString(backupRestorePointsEvery)).append("\n");
    sb.append("    backupRestorePointsNone: ").append(toIndentedString(backupRestorePointsNone)).append("\n");
    sb.append("    backupRestorePointsSome: ").append(toIndentedString(backupRestorePointsSome)).append("\n");
    sb.append("    backupService: ").append(toIndentedString(backupService)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
    sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
    sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
    sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
    sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionContains: ").append(toIndentedString(descriptionContains)).append("\n");
    sb.append("    descriptionEndsWith: ").append(toIndentedString(descriptionEndsWith)).append("\n");
    sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
    sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
    sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
    sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
    sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
    sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
    sb.append("    descriptionNotContains: ").append(toIndentedString(descriptionNotContains)).append("\n");
    sb.append("    descriptionNotEndsWith: ").append(toIndentedString(descriptionNotEndsWith)).append("\n");
    sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
    sb.append("    descriptionNotStartsWith: ").append(toIndentedString(descriptionNotStartsWith)).append("\n");
    sb.append("    descriptionStartsWith: ").append(toIndentedString(descriptionStartsWith)).append("\n");
    sb.append("    entityAsyncStatus: ").append(toIndentedString(entityAsyncStatus)).append("\n");
    sb.append("    entityAsyncStatusIn: ").append(toIndentedString(entityAsyncStatusIn)).append("\n");
    sb.append("    entityAsyncStatusNot: ").append(toIndentedString(entityAsyncStatusNot)).append("\n");
    sb.append("    entityAsyncStatusNotIn: ").append(toIndentedString(entityAsyncStatusNotIn)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorCodeContains: ").append(toIndentedString(errorCodeContains)).append("\n");
    sb.append("    errorCodeEndsWith: ").append(toIndentedString(errorCodeEndsWith)).append("\n");
    sb.append("    errorCodeGt: ").append(toIndentedString(errorCodeGt)).append("\n");
    sb.append("    errorCodeGte: ").append(toIndentedString(errorCodeGte)).append("\n");
    sb.append("    errorCodeIn: ").append(toIndentedString(errorCodeIn)).append("\n");
    sb.append("    errorCodeLt: ").append(toIndentedString(errorCodeLt)).append("\n");
    sb.append("    errorCodeLte: ").append(toIndentedString(errorCodeLte)).append("\n");
    sb.append("    errorCodeNot: ").append(toIndentedString(errorCodeNot)).append("\n");
    sb.append("    errorCodeNotContains: ").append(toIndentedString(errorCodeNotContains)).append("\n");
    sb.append("    errorCodeNotEndsWith: ").append(toIndentedString(errorCodeNotEndsWith)).append("\n");
    sb.append("    errorCodeNotIn: ").append(toIndentedString(errorCodeNotIn)).append("\n");
    sb.append("    errorCodeNotStartsWith: ").append(toIndentedString(errorCodeNotStartsWith)).append("\n");
    sb.append("    errorCodeStartsWith: ").append(toIndentedString(errorCodeStartsWith)).append("\n");
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
    sb.append("    iscsiChapName: ").append(toIndentedString(iscsiChapName)).append("\n");
    sb.append("    iscsiChapNameContains: ").append(toIndentedString(iscsiChapNameContains)).append("\n");
    sb.append("    iscsiChapNameEndsWith: ").append(toIndentedString(iscsiChapNameEndsWith)).append("\n");
    sb.append("    iscsiChapNameGt: ").append(toIndentedString(iscsiChapNameGt)).append("\n");
    sb.append("    iscsiChapNameGte: ").append(toIndentedString(iscsiChapNameGte)).append("\n");
    sb.append("    iscsiChapNameIn: ").append(toIndentedString(iscsiChapNameIn)).append("\n");
    sb.append("    iscsiChapNameLt: ").append(toIndentedString(iscsiChapNameLt)).append("\n");
    sb.append("    iscsiChapNameLte: ").append(toIndentedString(iscsiChapNameLte)).append("\n");
    sb.append("    iscsiChapNameNot: ").append(toIndentedString(iscsiChapNameNot)).append("\n");
    sb.append("    iscsiChapNameNotContains: ").append(toIndentedString(iscsiChapNameNotContains)).append("\n");
    sb.append("    iscsiChapNameNotEndsWith: ").append(toIndentedString(iscsiChapNameNotEndsWith)).append("\n");
    sb.append("    iscsiChapNameNotIn: ").append(toIndentedString(iscsiChapNameNotIn)).append("\n");
    sb.append("    iscsiChapNameNotStartsWith: ").append(toIndentedString(iscsiChapNameNotStartsWith)).append("\n");
    sb.append("    iscsiChapNameStartsWith: ").append(toIndentedString(iscsiChapNameStartsWith)).append("\n");
    sb.append("    iscsiChapSecret: ").append(toIndentedString(iscsiChapSecret)).append("\n");
    sb.append("    iscsiChapSecretContains: ").append(toIndentedString(iscsiChapSecretContains)).append("\n");
    sb.append("    iscsiChapSecretEndsWith: ").append(toIndentedString(iscsiChapSecretEndsWith)).append("\n");
    sb.append("    iscsiChapSecretGt: ").append(toIndentedString(iscsiChapSecretGt)).append("\n");
    sb.append("    iscsiChapSecretGte: ").append(toIndentedString(iscsiChapSecretGte)).append("\n");
    sb.append("    iscsiChapSecretIn: ").append(toIndentedString(iscsiChapSecretIn)).append("\n");
    sb.append("    iscsiChapSecretLt: ").append(toIndentedString(iscsiChapSecretLt)).append("\n");
    sb.append("    iscsiChapSecretLte: ").append(toIndentedString(iscsiChapSecretLte)).append("\n");
    sb.append("    iscsiChapSecretNot: ").append(toIndentedString(iscsiChapSecretNot)).append("\n");
    sb.append("    iscsiChapSecretNotContains: ").append(toIndentedString(iscsiChapSecretNotContains)).append("\n");
    sb.append("    iscsiChapSecretNotEndsWith: ").append(toIndentedString(iscsiChapSecretNotEndsWith)).append("\n");
    sb.append("    iscsiChapSecretNotIn: ").append(toIndentedString(iscsiChapSecretNotIn)).append("\n");
    sb.append("    iscsiChapSecretNotStartsWith: ").append(toIndentedString(iscsiChapSecretNotStartsWith)).append("\n");
    sb.append("    iscsiChapSecretStartsWith: ").append(toIndentedString(iscsiChapSecretStartsWith)).append("\n");
    sb.append("    iscsiIp: ").append(toIndentedString(iscsiIp)).append("\n");
    sb.append("    iscsiIpContains: ").append(toIndentedString(iscsiIpContains)).append("\n");
    sb.append("    iscsiIpEndsWith: ").append(toIndentedString(iscsiIpEndsWith)).append("\n");
    sb.append("    iscsiIpGt: ").append(toIndentedString(iscsiIpGt)).append("\n");
    sb.append("    iscsiIpGte: ").append(toIndentedString(iscsiIpGte)).append("\n");
    sb.append("    iscsiIpIn: ").append(toIndentedString(iscsiIpIn)).append("\n");
    sb.append("    iscsiIpLt: ").append(toIndentedString(iscsiIpLt)).append("\n");
    sb.append("    iscsiIpLte: ").append(toIndentedString(iscsiIpLte)).append("\n");
    sb.append("    iscsiIpNot: ").append(toIndentedString(iscsiIpNot)).append("\n");
    sb.append("    iscsiIpNotContains: ").append(toIndentedString(iscsiIpNotContains)).append("\n");
    sb.append("    iscsiIpNotEndsWith: ").append(toIndentedString(iscsiIpNotEndsWith)).append("\n");
    sb.append("    iscsiIpNotIn: ").append(toIndentedString(iscsiIpNotIn)).append("\n");
    sb.append("    iscsiIpNotStartsWith: ").append(toIndentedString(iscsiIpNotStartsWith)).append("\n");
    sb.append("    iscsiIpStartsWith: ").append(toIndentedString(iscsiIpStartsWith)).append("\n");
    sb.append("    iscsiLunId: ").append(toIndentedString(iscsiLunId)).append("\n");
    sb.append("    iscsiLunIdContains: ").append(toIndentedString(iscsiLunIdContains)).append("\n");
    sb.append("    iscsiLunIdEndsWith: ").append(toIndentedString(iscsiLunIdEndsWith)).append("\n");
    sb.append("    iscsiLunIdGt: ").append(toIndentedString(iscsiLunIdGt)).append("\n");
    sb.append("    iscsiLunIdGte: ").append(toIndentedString(iscsiLunIdGte)).append("\n");
    sb.append("    iscsiLunIdIn: ").append(toIndentedString(iscsiLunIdIn)).append("\n");
    sb.append("    iscsiLunIdLt: ").append(toIndentedString(iscsiLunIdLt)).append("\n");
    sb.append("    iscsiLunIdLte: ").append(toIndentedString(iscsiLunIdLte)).append("\n");
    sb.append("    iscsiLunIdNot: ").append(toIndentedString(iscsiLunIdNot)).append("\n");
    sb.append("    iscsiLunIdNotContains: ").append(toIndentedString(iscsiLunIdNotContains)).append("\n");
    sb.append("    iscsiLunIdNotEndsWith: ").append(toIndentedString(iscsiLunIdNotEndsWith)).append("\n");
    sb.append("    iscsiLunIdNotIn: ").append(toIndentedString(iscsiLunIdNotIn)).append("\n");
    sb.append("    iscsiLunIdNotStartsWith: ").append(toIndentedString(iscsiLunIdNotStartsWith)).append("\n");
    sb.append("    iscsiLunIdStartsWith: ").append(toIndentedString(iscsiLunIdStartsWith)).append("\n");
    sb.append("    iscsiPort: ").append(toIndentedString(iscsiPort)).append("\n");
    sb.append("    iscsiPortGt: ").append(toIndentedString(iscsiPortGt)).append("\n");
    sb.append("    iscsiPortGte: ").append(toIndentedString(iscsiPortGte)).append("\n");
    sb.append("    iscsiPortIn: ").append(toIndentedString(iscsiPortIn)).append("\n");
    sb.append("    iscsiPortLt: ").append(toIndentedString(iscsiPortLt)).append("\n");
    sb.append("    iscsiPortLte: ").append(toIndentedString(iscsiPortLte)).append("\n");
    sb.append("    iscsiPortNot: ").append(toIndentedString(iscsiPortNot)).append("\n");
    sb.append("    iscsiPortNotIn: ").append(toIndentedString(iscsiPortNotIn)).append("\n");
    sb.append("    iscsiTargetIqn: ").append(toIndentedString(iscsiTargetIqn)).append("\n");
    sb.append("    iscsiTargetIqnContains: ").append(toIndentedString(iscsiTargetIqnContains)).append("\n");
    sb.append("    iscsiTargetIqnEndsWith: ").append(toIndentedString(iscsiTargetIqnEndsWith)).append("\n");
    sb.append("    iscsiTargetIqnGt: ").append(toIndentedString(iscsiTargetIqnGt)).append("\n");
    sb.append("    iscsiTargetIqnGte: ").append(toIndentedString(iscsiTargetIqnGte)).append("\n");
    sb.append("    iscsiTargetIqnIn: ").append(toIndentedString(iscsiTargetIqnIn)).append("\n");
    sb.append("    iscsiTargetIqnLt: ").append(toIndentedString(iscsiTargetIqnLt)).append("\n");
    sb.append("    iscsiTargetIqnLte: ").append(toIndentedString(iscsiTargetIqnLte)).append("\n");
    sb.append("    iscsiTargetIqnNot: ").append(toIndentedString(iscsiTargetIqnNot)).append("\n");
    sb.append("    iscsiTargetIqnNotContains: ").append(toIndentedString(iscsiTargetIqnNotContains)).append("\n");
    sb.append("    iscsiTargetIqnNotEndsWith: ").append(toIndentedString(iscsiTargetIqnNotEndsWith)).append("\n");
    sb.append("    iscsiTargetIqnNotIn: ").append(toIndentedString(iscsiTargetIqnNotIn)).append("\n");
    sb.append("    iscsiTargetIqnNotStartsWith: ").append(toIndentedString(iscsiTargetIqnNotStartsWith)).append("\n");
    sb.append("    iscsiTargetIqnStartsWith: ").append(toIndentedString(iscsiTargetIqnStartsWith)).append("\n");
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
    sb.append("    nameNotStartsWith: ").append(toIndentedString(nameNotStartsWith)).append("\n");
    sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
    sb.append("    nfsPath: ").append(toIndentedString(nfsPath)).append("\n");
    sb.append("    nfsPathContains: ").append(toIndentedString(nfsPathContains)).append("\n");
    sb.append("    nfsPathEndsWith: ").append(toIndentedString(nfsPathEndsWith)).append("\n");
    sb.append("    nfsPathGt: ").append(toIndentedString(nfsPathGt)).append("\n");
    sb.append("    nfsPathGte: ").append(toIndentedString(nfsPathGte)).append("\n");
    sb.append("    nfsPathIn: ").append(toIndentedString(nfsPathIn)).append("\n");
    sb.append("    nfsPathLt: ").append(toIndentedString(nfsPathLt)).append("\n");
    sb.append("    nfsPathLte: ").append(toIndentedString(nfsPathLte)).append("\n");
    sb.append("    nfsPathNot: ").append(toIndentedString(nfsPathNot)).append("\n");
    sb.append("    nfsPathNotContains: ").append(toIndentedString(nfsPathNotContains)).append("\n");
    sb.append("    nfsPathNotEndsWith: ").append(toIndentedString(nfsPathNotEndsWith)).append("\n");
    sb.append("    nfsPathNotIn: ").append(toIndentedString(nfsPathNotIn)).append("\n");
    sb.append("    nfsPathNotStartsWith: ").append(toIndentedString(nfsPathNotStartsWith)).append("\n");
    sb.append("    nfsPathStartsWith: ").append(toIndentedString(nfsPathStartsWith)).append("\n");
    sb.append("    nfsServer: ").append(toIndentedString(nfsServer)).append("\n");
    sb.append("    nfsServerContains: ").append(toIndentedString(nfsServerContains)).append("\n");
    sb.append("    nfsServerEndsWith: ").append(toIndentedString(nfsServerEndsWith)).append("\n");
    sb.append("    nfsServerGt: ").append(toIndentedString(nfsServerGt)).append("\n");
    sb.append("    nfsServerGte: ").append(toIndentedString(nfsServerGte)).append("\n");
    sb.append("    nfsServerIn: ").append(toIndentedString(nfsServerIn)).append("\n");
    sb.append("    nfsServerLt: ").append(toIndentedString(nfsServerLt)).append("\n");
    sb.append("    nfsServerLte: ").append(toIndentedString(nfsServerLte)).append("\n");
    sb.append("    nfsServerNot: ").append(toIndentedString(nfsServerNot)).append("\n");
    sb.append("    nfsServerNotContains: ").append(toIndentedString(nfsServerNotContains)).append("\n");
    sb.append("    nfsServerNotEndsWith: ").append(toIndentedString(nfsServerNotEndsWith)).append("\n");
    sb.append("    nfsServerNotIn: ").append(toIndentedString(nfsServerNotIn)).append("\n");
    sb.append("    nfsServerNotStartsWith: ").append(toIndentedString(nfsServerNotStartsWith)).append("\n");
    sb.append("    nfsServerStartsWith: ").append(toIndentedString(nfsServerStartsWith)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
    sb.append("    totalCapacityGt: ").append(toIndentedString(totalCapacityGt)).append("\n");
    sb.append("    totalCapacityGte: ").append(toIndentedString(totalCapacityGte)).append("\n");
    sb.append("    totalCapacityIn: ").append(toIndentedString(totalCapacityIn)).append("\n");
    sb.append("    totalCapacityLt: ").append(toIndentedString(totalCapacityLt)).append("\n");
    sb.append("    totalCapacityLte: ").append(toIndentedString(totalCapacityLte)).append("\n");
    sb.append("    totalCapacityNot: ").append(toIndentedString(totalCapacityNot)).append("\n");
    sb.append("    totalCapacityNotIn: ").append(toIndentedString(totalCapacityNotIn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
    sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
    sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    updateTimestampContains: ").append(toIndentedString(updateTimestampContains)).append("\n");
    sb.append("    updateTimestampEndsWith: ").append(toIndentedString(updateTimestampEndsWith)).append("\n");
    sb.append("    updateTimestampGt: ").append(toIndentedString(updateTimestampGt)).append("\n");
    sb.append("    updateTimestampGte: ").append(toIndentedString(updateTimestampGte)).append("\n");
    sb.append("    updateTimestampIn: ").append(toIndentedString(updateTimestampIn)).append("\n");
    sb.append("    updateTimestampLt: ").append(toIndentedString(updateTimestampLt)).append("\n");
    sb.append("    updateTimestampLte: ").append(toIndentedString(updateTimestampLte)).append("\n");
    sb.append("    updateTimestampNot: ").append(toIndentedString(updateTimestampNot)).append("\n");
    sb.append("    updateTimestampNotContains: ").append(toIndentedString(updateTimestampNotContains)).append("\n");
    sb.append("    updateTimestampNotEndsWith: ").append(toIndentedString(updateTimestampNotEndsWith)).append("\n");
    sb.append("    updateTimestampNotIn: ").append(toIndentedString(updateTimestampNotIn)).append("\n");
    sb.append("    updateTimestampNotStartsWith: ").append(toIndentedString(updateTimestampNotStartsWith)).append("\n");
    sb.append("    updateTimestampStartsWith: ").append(toIndentedString(updateTimestampStartsWith)).append("\n");
    sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
    sb.append("    usedDataSpaceGt: ").append(toIndentedString(usedDataSpaceGt)).append("\n");
    sb.append("    usedDataSpaceGte: ").append(toIndentedString(usedDataSpaceGte)).append("\n");
    sb.append("    usedDataSpaceIn: ").append(toIndentedString(usedDataSpaceIn)).append("\n");
    sb.append("    usedDataSpaceLt: ").append(toIndentedString(usedDataSpaceLt)).append("\n");
    sb.append("    usedDataSpaceLte: ").append(toIndentedString(usedDataSpaceLte)).append("\n");
    sb.append("    usedDataSpaceNot: ").append(toIndentedString(usedDataSpaceNot)).append("\n");
    sb.append("    usedDataSpaceNotIn: ").append(toIndentedString(usedDataSpaceNotIn)).append("\n");
    sb.append("    usedDataSpaceUsage: ").append(toIndentedString(usedDataSpaceUsage)).append("\n");
    sb.append("    usedDataSpaceUsageGt: ").append(toIndentedString(usedDataSpaceUsageGt)).append("\n");
    sb.append("    usedDataSpaceUsageGte: ").append(toIndentedString(usedDataSpaceUsageGte)).append("\n");
    sb.append("    usedDataSpaceUsageIn: ").append(toIndentedString(usedDataSpaceUsageIn)).append("\n");
    sb.append("    usedDataSpaceUsageLt: ").append(toIndentedString(usedDataSpaceUsageLt)).append("\n");
    sb.append("    usedDataSpaceUsageLte: ").append(toIndentedString(usedDataSpaceUsageLte)).append("\n");
    sb.append("    usedDataSpaceUsageNot: ").append(toIndentedString(usedDataSpaceUsageNot)).append("\n");
    sb.append("    usedDataSpaceUsageNotIn: ").append(toIndentedString(usedDataSpaceUsageNotIn)).append("\n");
    sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
    sb.append("    validDataSpaceGt: ").append(toIndentedString(validDataSpaceGt)).append("\n");
    sb.append("    validDataSpaceGte: ").append(toIndentedString(validDataSpaceGte)).append("\n");
    sb.append("    validDataSpaceIn: ").append(toIndentedString(validDataSpaceIn)).append("\n");
    sb.append("    validDataSpaceLt: ").append(toIndentedString(validDataSpaceLt)).append("\n");
    sb.append("    validDataSpaceLte: ").append(toIndentedString(validDataSpaceLte)).append("\n");
    sb.append("    validDataSpaceNot: ").append(toIndentedString(validDataSpaceNot)).append("\n");
    sb.append("    validDataSpaceNotIn: ").append(toIndentedString(validDataSpaceNotIn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

