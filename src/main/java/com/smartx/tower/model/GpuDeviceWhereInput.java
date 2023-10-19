package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EntityAsyncStatus;
import com.smartx.tower.model.GpuDeviceStatus;
import com.smartx.tower.model.GpuDeviceUsage;
import com.smartx.tower.model.HostWhereInput;
import com.smartx.tower.model.LabelWhereInput;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GpuDeviceWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class GpuDeviceWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<GpuDeviceWhereInput> AND = null;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM = "assigned_vgpus_num";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM)
  private Integer assignedVgpusNum;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_GT = "assigned_vgpus_num_gt";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_GT)
  private Integer assignedVgpusNumGt;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_GTE = "assigned_vgpus_num_gte";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_GTE)
  private Integer assignedVgpusNumGte;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_IN = "assigned_vgpus_num_in";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_IN)
  private List<Integer> assignedVgpusNumIn = null;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_LT = "assigned_vgpus_num_lt";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_LT)
  private Integer assignedVgpusNumLt;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_LTE = "assigned_vgpus_num_lte";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_LTE)
  private Integer assignedVgpusNumLte;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_NOT = "assigned_vgpus_num_not";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_NOT)
  private Integer assignedVgpusNumNot;

  public static final String SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_NOT_IN = "assigned_vgpus_num_not_in";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_VGPUS_NUM_NOT_IN)
  private List<Integer> assignedVgpusNumNotIn = null;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM = "available_vgpus_num";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM)
  private Integer availableVgpusNum;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_GT = "available_vgpus_num_gt";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_GT)
  private Integer availableVgpusNumGt;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_GTE = "available_vgpus_num_gte";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_GTE)
  private Integer availableVgpusNumGte;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_IN = "available_vgpus_num_in";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_IN)
  private List<Integer> availableVgpusNumIn = null;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_LT = "available_vgpus_num_lt";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_LT)
  private Integer availableVgpusNumLt;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_LTE = "available_vgpus_num_lte";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_LTE)
  private Integer availableVgpusNumLte;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_NOT = "available_vgpus_num_not";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_NOT)
  private Integer availableVgpusNumNot;

  public static final String SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_NOT_IN = "available_vgpus_num_not_in";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_VGPUS_NUM_NOT_IN)
  private List<Integer> availableVgpusNumNotIn = null;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_BRAND_CONTAINS = "brand_contains";
  @SerializedName(SERIALIZED_NAME_BRAND_CONTAINS)
  private String brandContains;

  public static final String SERIALIZED_NAME_BRAND_ENDS_WITH = "brand_ends_with";
  @SerializedName(SERIALIZED_NAME_BRAND_ENDS_WITH)
  private String brandEndsWith;

  public static final String SERIALIZED_NAME_BRAND_GT = "brand_gt";
  @SerializedName(SERIALIZED_NAME_BRAND_GT)
  private String brandGt;

  public static final String SERIALIZED_NAME_BRAND_GTE = "brand_gte";
  @SerializedName(SERIALIZED_NAME_BRAND_GTE)
  private String brandGte;

  public static final String SERIALIZED_NAME_BRAND_IN = "brand_in";
  @SerializedName(SERIALIZED_NAME_BRAND_IN)
  private List<String> brandIn = null;

  public static final String SERIALIZED_NAME_BRAND_LT = "brand_lt";
  @SerializedName(SERIALIZED_NAME_BRAND_LT)
  private String brandLt;

  public static final String SERIALIZED_NAME_BRAND_LTE = "brand_lte";
  @SerializedName(SERIALIZED_NAME_BRAND_LTE)
  private String brandLte;

  public static final String SERIALIZED_NAME_BRAND_NOT = "brand_not";
  @SerializedName(SERIALIZED_NAME_BRAND_NOT)
  private String brandNot;

  public static final String SERIALIZED_NAME_BRAND_NOT_CONTAINS = "brand_not_contains";
  @SerializedName(SERIALIZED_NAME_BRAND_NOT_CONTAINS)
  private String brandNotContains;

  public static final String SERIALIZED_NAME_BRAND_NOT_ENDS_WITH = "brand_not_ends_with";
  @SerializedName(SERIALIZED_NAME_BRAND_NOT_ENDS_WITH)
  private String brandNotEndsWith;

  public static final String SERIALIZED_NAME_BRAND_NOT_IN = "brand_not_in";
  @SerializedName(SERIALIZED_NAME_BRAND_NOT_IN)
  private List<String> brandNotIn = null;

  public static final String SERIALIZED_NAME_BRAND_NOT_STARTS_WITH = "brand_not_starts_with";
  @SerializedName(SERIALIZED_NAME_BRAND_NOT_STARTS_WITH)
  private String brandNotStartsWith;

  public static final String SERIALIZED_NAME_BRAND_STARTS_WITH = "brand_starts_with";
  @SerializedName(SERIALIZED_NAME_BRAND_STARTS_WITH)
  private String brandStartsWith;

  public static final String SERIALIZED_NAME_BUS_LOCATION = "bus_location";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION)
  private String busLocation;

  public static final String SERIALIZED_NAME_BUS_LOCATION_CONTAINS = "bus_location_contains";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_CONTAINS)
  private String busLocationContains;

  public static final String SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH = "bus_location_ends_with";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_ENDS_WITH)
  private String busLocationEndsWith;

  public static final String SERIALIZED_NAME_BUS_LOCATION_GT = "bus_location_gt";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_GT)
  private String busLocationGt;

  public static final String SERIALIZED_NAME_BUS_LOCATION_GTE = "bus_location_gte";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_GTE)
  private String busLocationGte;

  public static final String SERIALIZED_NAME_BUS_LOCATION_IN = "bus_location_in";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_IN)
  private List<String> busLocationIn = null;

  public static final String SERIALIZED_NAME_BUS_LOCATION_LT = "bus_location_lt";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_LT)
  private String busLocationLt;

  public static final String SERIALIZED_NAME_BUS_LOCATION_LTE = "bus_location_lte";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_LTE)
  private String busLocationLte;

  public static final String SERIALIZED_NAME_BUS_LOCATION_NOT = "bus_location_not";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT)
  private String busLocationNot;

  public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS = "bus_location_not_contains";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_CONTAINS)
  private String busLocationNotContains;

  public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH = "bus_location_not_ends_with";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_ENDS_WITH)
  private String busLocationNotEndsWith;

  public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_IN = "bus_location_not_in";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_IN)
  private List<String> busLocationNotIn = null;

  public static final String SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH = "bus_location_not_starts_with";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_NOT_STARTS_WITH)
  private String busLocationNotStartsWith;

  public static final String SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH = "bus_location_starts_with";
  @SerializedName(SERIALIZED_NAME_BUS_LOCATION_STARTS_WITH)
  private String busLocationStartsWith;

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

  public static final String SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY = "is_nvidia_tools_ready";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY)
  private Boolean isNvidiaToolsReady;

  public static final String SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY_NOT = "is_nvidia_tools_ready_not";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_TOOLS_READY_NOT)
  private Boolean isNvidiaToolsReadyNot;

  public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED = "is_nvidia_vfs_enabled";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED)
  private Boolean isNvidiaVfsEnabled;

  public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED_NOT = "is_nvidia_vfs_enabled_not";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_ENABLED_NOT)
  private Boolean isNvidiaVfsEnabledNot;

  public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED = "is_nvidia_vfs_supported";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED)
  private Boolean isNvidiaVfsSupported;

  public static final String SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED_NOT = "is_nvidia_vfs_supported_not";
  @SerializedName(SERIALIZED_NAME_IS_NVIDIA_VFS_SUPPORTED_NOT)
  private Boolean isNvidiaVfsSupportedNot;

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

  public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH = "local_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
  private String localIdNotStartsWith;

  public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
  private String localIdStartsWith;

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

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<GpuDeviceWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<GpuDeviceWhereInput> OR = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GpuDeviceStatus status;

  public static final String SERIALIZED_NAME_STATUS_IN = "status_in";
  @SerializedName(SERIALIZED_NAME_STATUS_IN)
  private List<GpuDeviceStatus> statusIn = null;

  public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT)
  private GpuDeviceStatus statusNot;

  public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";
  @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
  private List<GpuDeviceStatus> statusNotIn = null;

  public static final String SERIALIZED_NAME_USER_USAGE = "user_usage";
  @SerializedName(SERIALIZED_NAME_USER_USAGE)
  private GpuDeviceUsage userUsage;

  public static final String SERIALIZED_NAME_USER_USAGE_IN = "user_usage_in";
  @SerializedName(SERIALIZED_NAME_USER_USAGE_IN)
  private List<GpuDeviceUsage> userUsageIn = null;

  public static final String SERIALIZED_NAME_USER_USAGE_NOT = "user_usage_not";
  @SerializedName(SERIALIZED_NAME_USER_USAGE_NOT)
  private GpuDeviceUsage userUsageNot;

  public static final String SERIALIZED_NAME_USER_USAGE_NOT_IN = "user_usage_not_in";
  @SerializedName(SERIALIZED_NAME_USER_USAGE_NOT_IN)
  private List<GpuDeviceUsage> userUsageNotIn = null;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID = "user_vgpu_type_id";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID)
  private String userVgpuTypeId;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_CONTAINS = "user_vgpu_type_id_contains";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_CONTAINS)
  private String userVgpuTypeIdContains;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_ENDS_WITH = "user_vgpu_type_id_ends_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_ENDS_WITH)
  private String userVgpuTypeIdEndsWith;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_GT = "user_vgpu_type_id_gt";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_GT)
  private String userVgpuTypeIdGt;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_GTE = "user_vgpu_type_id_gte";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_GTE)
  private String userVgpuTypeIdGte;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_IN = "user_vgpu_type_id_in";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_IN)
  private List<String> userVgpuTypeIdIn = null;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_LT = "user_vgpu_type_id_lt";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_LT)
  private String userVgpuTypeIdLt;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_LTE = "user_vgpu_type_id_lte";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_LTE)
  private String userVgpuTypeIdLte;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT = "user_vgpu_type_id_not";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT)
  private String userVgpuTypeIdNot;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_CONTAINS = "user_vgpu_type_id_not_contains";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_CONTAINS)
  private String userVgpuTypeIdNotContains;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_ENDS_WITH = "user_vgpu_type_id_not_ends_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_ENDS_WITH)
  private String userVgpuTypeIdNotEndsWith;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_IN = "user_vgpu_type_id_not_in";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_IN)
  private List<String> userVgpuTypeIdNotIn = null;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_STARTS_WITH = "user_vgpu_type_id_not_starts_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_NOT_STARTS_WITH)
  private String userVgpuTypeIdNotStartsWith;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_ID_STARTS_WITH = "user_vgpu_type_id_starts_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_ID_STARTS_WITH)
  private String userVgpuTypeIdStartsWith;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME = "user_vgpu_type_name";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME)
  private String userVgpuTypeName;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_CONTAINS = "user_vgpu_type_name_contains";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_CONTAINS)
  private String userVgpuTypeNameContains;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_ENDS_WITH = "user_vgpu_type_name_ends_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_ENDS_WITH)
  private String userVgpuTypeNameEndsWith;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_GT = "user_vgpu_type_name_gt";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_GT)
  private String userVgpuTypeNameGt;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_GTE = "user_vgpu_type_name_gte";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_GTE)
  private String userVgpuTypeNameGte;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_IN = "user_vgpu_type_name_in";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_IN)
  private List<String> userVgpuTypeNameIn = null;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_LT = "user_vgpu_type_name_lt";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_LT)
  private String userVgpuTypeNameLt;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_LTE = "user_vgpu_type_name_lte";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_LTE)
  private String userVgpuTypeNameLte;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT = "user_vgpu_type_name_not";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT)
  private String userVgpuTypeNameNot;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_CONTAINS = "user_vgpu_type_name_not_contains";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_CONTAINS)
  private String userVgpuTypeNameNotContains;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_ENDS_WITH = "user_vgpu_type_name_not_ends_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_ENDS_WITH)
  private String userVgpuTypeNameNotEndsWith;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_IN = "user_vgpu_type_name_not_in";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_IN)
  private List<String> userVgpuTypeNameNotIn = null;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_STARTS_WITH = "user_vgpu_type_name_not_starts_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_NOT_STARTS_WITH)
  private String userVgpuTypeNameNotStartsWith;

  public static final String SERIALIZED_NAME_USER_VGPU_TYPE_NAME_STARTS_WITH = "user_vgpu_type_name_starts_with";
  @SerializedName(SERIALIZED_NAME_USER_VGPU_TYPE_NAME_STARTS_WITH)
  private String userVgpuTypeNameStartsWith;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM = "vgpu_instance_num";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM)
  private Integer vgpuInstanceNum;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM_GT = "vgpu_instance_num_gt";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM_GT)
  private Integer vgpuInstanceNumGt;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM_GTE = "vgpu_instance_num_gte";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM_GTE)
  private Integer vgpuInstanceNumGte;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM_IN = "vgpu_instance_num_in";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM_IN)
  private List<Integer> vgpuInstanceNumIn = null;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM_LT = "vgpu_instance_num_lt";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM_LT)
  private Integer vgpuInstanceNumLt;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM_LTE = "vgpu_instance_num_lte";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM_LTE)
  private Integer vgpuInstanceNumLte;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM_NOT = "vgpu_instance_num_not";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM_NOT)
  private Integer vgpuInstanceNumNot;

  public static final String SERIALIZED_NAME_VGPU_INSTANCE_NUM_NOT_IN = "vgpu_instance_num_not_in";
  @SerializedName(SERIALIZED_NAME_VGPU_INSTANCE_NUM_NOT_IN)
  private List<Integer> vgpuInstanceNumNotIn = null;

  public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";
  @SerializedName(SERIALIZED_NAME_VMS_EVERY)
  private VmWhereInput vmsEvery;

  public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";
  @SerializedName(SERIALIZED_NAME_VMS_NONE)
  private VmWhereInput vmsNone;

  public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";
  @SerializedName(SERIALIZED_NAME_VMS_SOME)
  private VmWhereInput vmsSome;

  public GpuDeviceWhereInput() { 
  }

  public GpuDeviceWhereInput AND(List<GpuDeviceWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public GpuDeviceWhereInput addANDItem(GpuDeviceWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<GpuDeviceWhereInput>();
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

  public List<GpuDeviceWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<GpuDeviceWhereInput> AND) {
    this.AND = AND;
  }


  public GpuDeviceWhereInput assignedVgpusNum(Integer assignedVgpusNum) {
    
    this.assignedVgpusNum = assignedVgpusNum;
    return this;
  }

   /**
   * Get assignedVgpusNum
   * @return assignedVgpusNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssignedVgpusNum() {
    return assignedVgpusNum;
  }


  public void setAssignedVgpusNum(Integer assignedVgpusNum) {
    this.assignedVgpusNum = assignedVgpusNum;
  }


  public GpuDeviceWhereInput assignedVgpusNumGt(Integer assignedVgpusNumGt) {
    
    this.assignedVgpusNumGt = assignedVgpusNumGt;
    return this;
  }

   /**
   * Get assignedVgpusNumGt
   * @return assignedVgpusNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssignedVgpusNumGt() {
    return assignedVgpusNumGt;
  }


  public void setAssignedVgpusNumGt(Integer assignedVgpusNumGt) {
    this.assignedVgpusNumGt = assignedVgpusNumGt;
  }


  public GpuDeviceWhereInput assignedVgpusNumGte(Integer assignedVgpusNumGte) {
    
    this.assignedVgpusNumGte = assignedVgpusNumGte;
    return this;
  }

   /**
   * Get assignedVgpusNumGte
   * @return assignedVgpusNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssignedVgpusNumGte() {
    return assignedVgpusNumGte;
  }


  public void setAssignedVgpusNumGte(Integer assignedVgpusNumGte) {
    this.assignedVgpusNumGte = assignedVgpusNumGte;
  }


  public GpuDeviceWhereInput assignedVgpusNumIn(List<Integer> assignedVgpusNumIn) {
    
    this.assignedVgpusNumIn = assignedVgpusNumIn;
    return this;
  }

  public GpuDeviceWhereInput addAssignedVgpusNumInItem(Integer assignedVgpusNumInItem) {
    if (this.assignedVgpusNumIn == null) {
      this.assignedVgpusNumIn = new ArrayList<Integer>();
    }
    this.assignedVgpusNumIn.add(assignedVgpusNumInItem);
    return this;
  }

   /**
   * Get assignedVgpusNumIn
   * @return assignedVgpusNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAssignedVgpusNumIn() {
    return assignedVgpusNumIn;
  }


  public void setAssignedVgpusNumIn(List<Integer> assignedVgpusNumIn) {
    this.assignedVgpusNumIn = assignedVgpusNumIn;
  }


  public GpuDeviceWhereInput assignedVgpusNumLt(Integer assignedVgpusNumLt) {
    
    this.assignedVgpusNumLt = assignedVgpusNumLt;
    return this;
  }

   /**
   * Get assignedVgpusNumLt
   * @return assignedVgpusNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssignedVgpusNumLt() {
    return assignedVgpusNumLt;
  }


  public void setAssignedVgpusNumLt(Integer assignedVgpusNumLt) {
    this.assignedVgpusNumLt = assignedVgpusNumLt;
  }


  public GpuDeviceWhereInput assignedVgpusNumLte(Integer assignedVgpusNumLte) {
    
    this.assignedVgpusNumLte = assignedVgpusNumLte;
    return this;
  }

   /**
   * Get assignedVgpusNumLte
   * @return assignedVgpusNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssignedVgpusNumLte() {
    return assignedVgpusNumLte;
  }


  public void setAssignedVgpusNumLte(Integer assignedVgpusNumLte) {
    this.assignedVgpusNumLte = assignedVgpusNumLte;
  }


  public GpuDeviceWhereInput assignedVgpusNumNot(Integer assignedVgpusNumNot) {
    
    this.assignedVgpusNumNot = assignedVgpusNumNot;
    return this;
  }

   /**
   * Get assignedVgpusNumNot
   * @return assignedVgpusNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssignedVgpusNumNot() {
    return assignedVgpusNumNot;
  }


  public void setAssignedVgpusNumNot(Integer assignedVgpusNumNot) {
    this.assignedVgpusNumNot = assignedVgpusNumNot;
  }


  public GpuDeviceWhereInput assignedVgpusNumNotIn(List<Integer> assignedVgpusNumNotIn) {
    
    this.assignedVgpusNumNotIn = assignedVgpusNumNotIn;
    return this;
  }

  public GpuDeviceWhereInput addAssignedVgpusNumNotInItem(Integer assignedVgpusNumNotInItem) {
    if (this.assignedVgpusNumNotIn == null) {
      this.assignedVgpusNumNotIn = new ArrayList<Integer>();
    }
    this.assignedVgpusNumNotIn.add(assignedVgpusNumNotInItem);
    return this;
  }

   /**
   * Get assignedVgpusNumNotIn
   * @return assignedVgpusNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAssignedVgpusNumNotIn() {
    return assignedVgpusNumNotIn;
  }


  public void setAssignedVgpusNumNotIn(List<Integer> assignedVgpusNumNotIn) {
    this.assignedVgpusNumNotIn = assignedVgpusNumNotIn;
  }


  public GpuDeviceWhereInput availableVgpusNum(Integer availableVgpusNum) {
    
    this.availableVgpusNum = availableVgpusNum;
    return this;
  }

   /**
   * Get availableVgpusNum
   * @return availableVgpusNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableVgpusNum() {
    return availableVgpusNum;
  }


  public void setAvailableVgpusNum(Integer availableVgpusNum) {
    this.availableVgpusNum = availableVgpusNum;
  }


  public GpuDeviceWhereInput availableVgpusNumGt(Integer availableVgpusNumGt) {
    
    this.availableVgpusNumGt = availableVgpusNumGt;
    return this;
  }

   /**
   * Get availableVgpusNumGt
   * @return availableVgpusNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableVgpusNumGt() {
    return availableVgpusNumGt;
  }


  public void setAvailableVgpusNumGt(Integer availableVgpusNumGt) {
    this.availableVgpusNumGt = availableVgpusNumGt;
  }


  public GpuDeviceWhereInput availableVgpusNumGte(Integer availableVgpusNumGte) {
    
    this.availableVgpusNumGte = availableVgpusNumGte;
    return this;
  }

   /**
   * Get availableVgpusNumGte
   * @return availableVgpusNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableVgpusNumGte() {
    return availableVgpusNumGte;
  }


  public void setAvailableVgpusNumGte(Integer availableVgpusNumGte) {
    this.availableVgpusNumGte = availableVgpusNumGte;
  }


  public GpuDeviceWhereInput availableVgpusNumIn(List<Integer> availableVgpusNumIn) {
    
    this.availableVgpusNumIn = availableVgpusNumIn;
    return this;
  }

  public GpuDeviceWhereInput addAvailableVgpusNumInItem(Integer availableVgpusNumInItem) {
    if (this.availableVgpusNumIn == null) {
      this.availableVgpusNumIn = new ArrayList<Integer>();
    }
    this.availableVgpusNumIn.add(availableVgpusNumInItem);
    return this;
  }

   /**
   * Get availableVgpusNumIn
   * @return availableVgpusNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAvailableVgpusNumIn() {
    return availableVgpusNumIn;
  }


  public void setAvailableVgpusNumIn(List<Integer> availableVgpusNumIn) {
    this.availableVgpusNumIn = availableVgpusNumIn;
  }


  public GpuDeviceWhereInput availableVgpusNumLt(Integer availableVgpusNumLt) {
    
    this.availableVgpusNumLt = availableVgpusNumLt;
    return this;
  }

   /**
   * Get availableVgpusNumLt
   * @return availableVgpusNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableVgpusNumLt() {
    return availableVgpusNumLt;
  }


  public void setAvailableVgpusNumLt(Integer availableVgpusNumLt) {
    this.availableVgpusNumLt = availableVgpusNumLt;
  }


  public GpuDeviceWhereInput availableVgpusNumLte(Integer availableVgpusNumLte) {
    
    this.availableVgpusNumLte = availableVgpusNumLte;
    return this;
  }

   /**
   * Get availableVgpusNumLte
   * @return availableVgpusNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableVgpusNumLte() {
    return availableVgpusNumLte;
  }


  public void setAvailableVgpusNumLte(Integer availableVgpusNumLte) {
    this.availableVgpusNumLte = availableVgpusNumLte;
  }


  public GpuDeviceWhereInput availableVgpusNumNot(Integer availableVgpusNumNot) {
    
    this.availableVgpusNumNot = availableVgpusNumNot;
    return this;
  }

   /**
   * Get availableVgpusNumNot
   * @return availableVgpusNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableVgpusNumNot() {
    return availableVgpusNumNot;
  }


  public void setAvailableVgpusNumNot(Integer availableVgpusNumNot) {
    this.availableVgpusNumNot = availableVgpusNumNot;
  }


  public GpuDeviceWhereInput availableVgpusNumNotIn(List<Integer> availableVgpusNumNotIn) {
    
    this.availableVgpusNumNotIn = availableVgpusNumNotIn;
    return this;
  }

  public GpuDeviceWhereInput addAvailableVgpusNumNotInItem(Integer availableVgpusNumNotInItem) {
    if (this.availableVgpusNumNotIn == null) {
      this.availableVgpusNumNotIn = new ArrayList<Integer>();
    }
    this.availableVgpusNumNotIn.add(availableVgpusNumNotInItem);
    return this;
  }

   /**
   * Get availableVgpusNumNotIn
   * @return availableVgpusNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAvailableVgpusNumNotIn() {
    return availableVgpusNumNotIn;
  }


  public void setAvailableVgpusNumNotIn(List<Integer> availableVgpusNumNotIn) {
    this.availableVgpusNumNotIn = availableVgpusNumNotIn;
  }


  public GpuDeviceWhereInput brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public GpuDeviceWhereInput brandContains(String brandContains) {
    
    this.brandContains = brandContains;
    return this;
  }

   /**
   * Get brandContains
   * @return brandContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandContains() {
    return brandContains;
  }


  public void setBrandContains(String brandContains) {
    this.brandContains = brandContains;
  }


  public GpuDeviceWhereInput brandEndsWith(String brandEndsWith) {
    
    this.brandEndsWith = brandEndsWith;
    return this;
  }

   /**
   * Get brandEndsWith
   * @return brandEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandEndsWith() {
    return brandEndsWith;
  }


  public void setBrandEndsWith(String brandEndsWith) {
    this.brandEndsWith = brandEndsWith;
  }


  public GpuDeviceWhereInput brandGt(String brandGt) {
    
    this.brandGt = brandGt;
    return this;
  }

   /**
   * Get brandGt
   * @return brandGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandGt() {
    return brandGt;
  }


  public void setBrandGt(String brandGt) {
    this.brandGt = brandGt;
  }


  public GpuDeviceWhereInput brandGte(String brandGte) {
    
    this.brandGte = brandGte;
    return this;
  }

   /**
   * Get brandGte
   * @return brandGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandGte() {
    return brandGte;
  }


  public void setBrandGte(String brandGte) {
    this.brandGte = brandGte;
  }


  public GpuDeviceWhereInput brandIn(List<String> brandIn) {
    
    this.brandIn = brandIn;
    return this;
  }

  public GpuDeviceWhereInput addBrandInItem(String brandInItem) {
    if (this.brandIn == null) {
      this.brandIn = new ArrayList<String>();
    }
    this.brandIn.add(brandInItem);
    return this;
  }

   /**
   * Get brandIn
   * @return brandIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBrandIn() {
    return brandIn;
  }


  public void setBrandIn(List<String> brandIn) {
    this.brandIn = brandIn;
  }


  public GpuDeviceWhereInput brandLt(String brandLt) {
    
    this.brandLt = brandLt;
    return this;
  }

   /**
   * Get brandLt
   * @return brandLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandLt() {
    return brandLt;
  }


  public void setBrandLt(String brandLt) {
    this.brandLt = brandLt;
  }


  public GpuDeviceWhereInput brandLte(String brandLte) {
    
    this.brandLte = brandLte;
    return this;
  }

   /**
   * Get brandLte
   * @return brandLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandLte() {
    return brandLte;
  }


  public void setBrandLte(String brandLte) {
    this.brandLte = brandLte;
  }


  public GpuDeviceWhereInput brandNot(String brandNot) {
    
    this.brandNot = brandNot;
    return this;
  }

   /**
   * Get brandNot
   * @return brandNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandNot() {
    return brandNot;
  }


  public void setBrandNot(String brandNot) {
    this.brandNot = brandNot;
  }


  public GpuDeviceWhereInput brandNotContains(String brandNotContains) {
    
    this.brandNotContains = brandNotContains;
    return this;
  }

   /**
   * Get brandNotContains
   * @return brandNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandNotContains() {
    return brandNotContains;
  }


  public void setBrandNotContains(String brandNotContains) {
    this.brandNotContains = brandNotContains;
  }


  public GpuDeviceWhereInput brandNotEndsWith(String brandNotEndsWith) {
    
    this.brandNotEndsWith = brandNotEndsWith;
    return this;
  }

   /**
   * Get brandNotEndsWith
   * @return brandNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandNotEndsWith() {
    return brandNotEndsWith;
  }


  public void setBrandNotEndsWith(String brandNotEndsWith) {
    this.brandNotEndsWith = brandNotEndsWith;
  }


  public GpuDeviceWhereInput brandNotIn(List<String> brandNotIn) {
    
    this.brandNotIn = brandNotIn;
    return this;
  }

  public GpuDeviceWhereInput addBrandNotInItem(String brandNotInItem) {
    if (this.brandNotIn == null) {
      this.brandNotIn = new ArrayList<String>();
    }
    this.brandNotIn.add(brandNotInItem);
    return this;
  }

   /**
   * Get brandNotIn
   * @return brandNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBrandNotIn() {
    return brandNotIn;
  }


  public void setBrandNotIn(List<String> brandNotIn) {
    this.brandNotIn = brandNotIn;
  }


  public GpuDeviceWhereInput brandNotStartsWith(String brandNotStartsWith) {
    
    this.brandNotStartsWith = brandNotStartsWith;
    return this;
  }

   /**
   * Get brandNotStartsWith
   * @return brandNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandNotStartsWith() {
    return brandNotStartsWith;
  }


  public void setBrandNotStartsWith(String brandNotStartsWith) {
    this.brandNotStartsWith = brandNotStartsWith;
  }


  public GpuDeviceWhereInput brandStartsWith(String brandStartsWith) {
    
    this.brandStartsWith = brandStartsWith;
    return this;
  }

   /**
   * Get brandStartsWith
   * @return brandStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandStartsWith() {
    return brandStartsWith;
  }


  public void setBrandStartsWith(String brandStartsWith) {
    this.brandStartsWith = brandStartsWith;
  }


  public GpuDeviceWhereInput busLocation(String busLocation) {
    
    this.busLocation = busLocation;
    return this;
  }

   /**
   * Get busLocation
   * @return busLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocation() {
    return busLocation;
  }


  public void setBusLocation(String busLocation) {
    this.busLocation = busLocation;
  }


  public GpuDeviceWhereInput busLocationContains(String busLocationContains) {
    
    this.busLocationContains = busLocationContains;
    return this;
  }

   /**
   * Get busLocationContains
   * @return busLocationContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationContains() {
    return busLocationContains;
  }


  public void setBusLocationContains(String busLocationContains) {
    this.busLocationContains = busLocationContains;
  }


  public GpuDeviceWhereInput busLocationEndsWith(String busLocationEndsWith) {
    
    this.busLocationEndsWith = busLocationEndsWith;
    return this;
  }

   /**
   * Get busLocationEndsWith
   * @return busLocationEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationEndsWith() {
    return busLocationEndsWith;
  }


  public void setBusLocationEndsWith(String busLocationEndsWith) {
    this.busLocationEndsWith = busLocationEndsWith;
  }


  public GpuDeviceWhereInput busLocationGt(String busLocationGt) {
    
    this.busLocationGt = busLocationGt;
    return this;
  }

   /**
   * Get busLocationGt
   * @return busLocationGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationGt() {
    return busLocationGt;
  }


  public void setBusLocationGt(String busLocationGt) {
    this.busLocationGt = busLocationGt;
  }


  public GpuDeviceWhereInput busLocationGte(String busLocationGte) {
    
    this.busLocationGte = busLocationGte;
    return this;
  }

   /**
   * Get busLocationGte
   * @return busLocationGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationGte() {
    return busLocationGte;
  }


  public void setBusLocationGte(String busLocationGte) {
    this.busLocationGte = busLocationGte;
  }


  public GpuDeviceWhereInput busLocationIn(List<String> busLocationIn) {
    
    this.busLocationIn = busLocationIn;
    return this;
  }

  public GpuDeviceWhereInput addBusLocationInItem(String busLocationInItem) {
    if (this.busLocationIn == null) {
      this.busLocationIn = new ArrayList<String>();
    }
    this.busLocationIn.add(busLocationInItem);
    return this;
  }

   /**
   * Get busLocationIn
   * @return busLocationIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBusLocationIn() {
    return busLocationIn;
  }


  public void setBusLocationIn(List<String> busLocationIn) {
    this.busLocationIn = busLocationIn;
  }


  public GpuDeviceWhereInput busLocationLt(String busLocationLt) {
    
    this.busLocationLt = busLocationLt;
    return this;
  }

   /**
   * Get busLocationLt
   * @return busLocationLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationLt() {
    return busLocationLt;
  }


  public void setBusLocationLt(String busLocationLt) {
    this.busLocationLt = busLocationLt;
  }


  public GpuDeviceWhereInput busLocationLte(String busLocationLte) {
    
    this.busLocationLte = busLocationLte;
    return this;
  }

   /**
   * Get busLocationLte
   * @return busLocationLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationLte() {
    return busLocationLte;
  }


  public void setBusLocationLte(String busLocationLte) {
    this.busLocationLte = busLocationLte;
  }


  public GpuDeviceWhereInput busLocationNot(String busLocationNot) {
    
    this.busLocationNot = busLocationNot;
    return this;
  }

   /**
   * Get busLocationNot
   * @return busLocationNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationNot() {
    return busLocationNot;
  }


  public void setBusLocationNot(String busLocationNot) {
    this.busLocationNot = busLocationNot;
  }


  public GpuDeviceWhereInput busLocationNotContains(String busLocationNotContains) {
    
    this.busLocationNotContains = busLocationNotContains;
    return this;
  }

   /**
   * Get busLocationNotContains
   * @return busLocationNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationNotContains() {
    return busLocationNotContains;
  }


  public void setBusLocationNotContains(String busLocationNotContains) {
    this.busLocationNotContains = busLocationNotContains;
  }


  public GpuDeviceWhereInput busLocationNotEndsWith(String busLocationNotEndsWith) {
    
    this.busLocationNotEndsWith = busLocationNotEndsWith;
    return this;
  }

   /**
   * Get busLocationNotEndsWith
   * @return busLocationNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationNotEndsWith() {
    return busLocationNotEndsWith;
  }


  public void setBusLocationNotEndsWith(String busLocationNotEndsWith) {
    this.busLocationNotEndsWith = busLocationNotEndsWith;
  }


  public GpuDeviceWhereInput busLocationNotIn(List<String> busLocationNotIn) {
    
    this.busLocationNotIn = busLocationNotIn;
    return this;
  }

  public GpuDeviceWhereInput addBusLocationNotInItem(String busLocationNotInItem) {
    if (this.busLocationNotIn == null) {
      this.busLocationNotIn = new ArrayList<String>();
    }
    this.busLocationNotIn.add(busLocationNotInItem);
    return this;
  }

   /**
   * Get busLocationNotIn
   * @return busLocationNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBusLocationNotIn() {
    return busLocationNotIn;
  }


  public void setBusLocationNotIn(List<String> busLocationNotIn) {
    this.busLocationNotIn = busLocationNotIn;
  }


  public GpuDeviceWhereInput busLocationNotStartsWith(String busLocationNotStartsWith) {
    
    this.busLocationNotStartsWith = busLocationNotStartsWith;
    return this;
  }

   /**
   * Get busLocationNotStartsWith
   * @return busLocationNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationNotStartsWith() {
    return busLocationNotStartsWith;
  }


  public void setBusLocationNotStartsWith(String busLocationNotStartsWith) {
    this.busLocationNotStartsWith = busLocationNotStartsWith;
  }


  public GpuDeviceWhereInput busLocationStartsWith(String busLocationStartsWith) {
    
    this.busLocationStartsWith = busLocationStartsWith;
    return this;
  }

   /**
   * Get busLocationStartsWith
   * @return busLocationStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBusLocationStartsWith() {
    return busLocationStartsWith;
  }


  public void setBusLocationStartsWith(String busLocationStartsWith) {
    this.busLocationStartsWith = busLocationStartsWith;
  }


  public GpuDeviceWhereInput description(String description) {
    
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


  public GpuDeviceWhereInput descriptionContains(String descriptionContains) {
    
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


  public GpuDeviceWhereInput descriptionEndsWith(String descriptionEndsWith) {
    
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


  public GpuDeviceWhereInput descriptionGt(String descriptionGt) {
    
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


  public GpuDeviceWhereInput descriptionGte(String descriptionGte) {
    
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


  public GpuDeviceWhereInput descriptionIn(List<String> descriptionIn) {
    
    this.descriptionIn = descriptionIn;
    return this;
  }

  public GpuDeviceWhereInput addDescriptionInItem(String descriptionInItem) {
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


  public GpuDeviceWhereInput descriptionLt(String descriptionLt) {
    
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


  public GpuDeviceWhereInput descriptionLte(String descriptionLte) {
    
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


  public GpuDeviceWhereInput descriptionNot(String descriptionNot) {
    
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


  public GpuDeviceWhereInput descriptionNotContains(String descriptionNotContains) {
    
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


  public GpuDeviceWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {
    
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


  public GpuDeviceWhereInput descriptionNotIn(List<String> descriptionNotIn) {
    
    this.descriptionNotIn = descriptionNotIn;
    return this;
  }

  public GpuDeviceWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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


  public GpuDeviceWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {
    
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


  public GpuDeviceWhereInput descriptionStartsWith(String descriptionStartsWith) {
    
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


  public GpuDeviceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
    
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


  public GpuDeviceWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
    
    this.entityAsyncStatusIn = entityAsyncStatusIn;
    return this;
  }

  public GpuDeviceWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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


  public GpuDeviceWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
    
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


  public GpuDeviceWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
    
    this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    return this;
  }

  public GpuDeviceWhereInput addEntityAsyncStatusNotInItem(EntityAsyncStatus entityAsyncStatusNotInItem) {
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


  public GpuDeviceWhereInput host(HostWhereInput host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostWhereInput getHost() {
    return host;
  }


  public void setHost(HostWhereInput host) {
    this.host = host;
  }


  public GpuDeviceWhereInput id(String id) {
    
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


  public GpuDeviceWhereInput idContains(String idContains) {
    
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


  public GpuDeviceWhereInput idEndsWith(String idEndsWith) {
    
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


  public GpuDeviceWhereInput idGt(String idGt) {
    
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


  public GpuDeviceWhereInput idGte(String idGte) {
    
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


  public GpuDeviceWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public GpuDeviceWhereInput addIdInItem(String idInItem) {
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


  public GpuDeviceWhereInput idLt(String idLt) {
    
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


  public GpuDeviceWhereInput idLte(String idLte) {
    
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


  public GpuDeviceWhereInput idNot(String idNot) {
    
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


  public GpuDeviceWhereInput idNotContains(String idNotContains) {
    
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


  public GpuDeviceWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public GpuDeviceWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public GpuDeviceWhereInput addIdNotInItem(String idNotInItem) {
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


  public GpuDeviceWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public GpuDeviceWhereInput idStartsWith(String idStartsWith) {
    
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


  public GpuDeviceWhereInput isNvidiaToolsReady(Boolean isNvidiaToolsReady) {
    
    this.isNvidiaToolsReady = isNvidiaToolsReady;
    return this;
  }

   /**
   * Get isNvidiaToolsReady
   * @return isNvidiaToolsReady
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaToolsReady() {
    return isNvidiaToolsReady;
  }


  public void setIsNvidiaToolsReady(Boolean isNvidiaToolsReady) {
    this.isNvidiaToolsReady = isNvidiaToolsReady;
  }


  public GpuDeviceWhereInput isNvidiaToolsReadyNot(Boolean isNvidiaToolsReadyNot) {
    
    this.isNvidiaToolsReadyNot = isNvidiaToolsReadyNot;
    return this;
  }

   /**
   * Get isNvidiaToolsReadyNot
   * @return isNvidiaToolsReadyNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaToolsReadyNot() {
    return isNvidiaToolsReadyNot;
  }


  public void setIsNvidiaToolsReadyNot(Boolean isNvidiaToolsReadyNot) {
    this.isNvidiaToolsReadyNot = isNvidiaToolsReadyNot;
  }


  public GpuDeviceWhereInput isNvidiaVfsEnabled(Boolean isNvidiaVfsEnabled) {
    
    this.isNvidiaVfsEnabled = isNvidiaVfsEnabled;
    return this;
  }

   /**
   * Get isNvidiaVfsEnabled
   * @return isNvidiaVfsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaVfsEnabled() {
    return isNvidiaVfsEnabled;
  }


  public void setIsNvidiaVfsEnabled(Boolean isNvidiaVfsEnabled) {
    this.isNvidiaVfsEnabled = isNvidiaVfsEnabled;
  }


  public GpuDeviceWhereInput isNvidiaVfsEnabledNot(Boolean isNvidiaVfsEnabledNot) {
    
    this.isNvidiaVfsEnabledNot = isNvidiaVfsEnabledNot;
    return this;
  }

   /**
   * Get isNvidiaVfsEnabledNot
   * @return isNvidiaVfsEnabledNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaVfsEnabledNot() {
    return isNvidiaVfsEnabledNot;
  }


  public void setIsNvidiaVfsEnabledNot(Boolean isNvidiaVfsEnabledNot) {
    this.isNvidiaVfsEnabledNot = isNvidiaVfsEnabledNot;
  }


  public GpuDeviceWhereInput isNvidiaVfsSupported(Boolean isNvidiaVfsSupported) {
    
    this.isNvidiaVfsSupported = isNvidiaVfsSupported;
    return this;
  }

   /**
   * Get isNvidiaVfsSupported
   * @return isNvidiaVfsSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaVfsSupported() {
    return isNvidiaVfsSupported;
  }


  public void setIsNvidiaVfsSupported(Boolean isNvidiaVfsSupported) {
    this.isNvidiaVfsSupported = isNvidiaVfsSupported;
  }


  public GpuDeviceWhereInput isNvidiaVfsSupportedNot(Boolean isNvidiaVfsSupportedNot) {
    
    this.isNvidiaVfsSupportedNot = isNvidiaVfsSupportedNot;
    return this;
  }

   /**
   * Get isNvidiaVfsSupportedNot
   * @return isNvidiaVfsSupportedNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsNvidiaVfsSupportedNot() {
    return isNvidiaVfsSupportedNot;
  }


  public void setIsNvidiaVfsSupportedNot(Boolean isNvidiaVfsSupportedNot) {
    this.isNvidiaVfsSupportedNot = isNvidiaVfsSupportedNot;
  }


  public GpuDeviceWhereInput labelsEvery(LabelWhereInput labelsEvery) {
    
    this.labelsEvery = labelsEvery;
    return this;
  }

   /**
   * Get labelsEvery
   * @return labelsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsEvery() {
    return labelsEvery;
  }


  public void setLabelsEvery(LabelWhereInput labelsEvery) {
    this.labelsEvery = labelsEvery;
  }


  public GpuDeviceWhereInput labelsNone(LabelWhereInput labelsNone) {
    
    this.labelsNone = labelsNone;
    return this;
  }

   /**
   * Get labelsNone
   * @return labelsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsNone() {
    return labelsNone;
  }


  public void setLabelsNone(LabelWhereInput labelsNone) {
    this.labelsNone = labelsNone;
  }


  public GpuDeviceWhereInput labelsSome(LabelWhereInput labelsSome) {
    
    this.labelsSome = labelsSome;
    return this;
  }

   /**
   * Get labelsSome
   * @return labelsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelWhereInput getLabelsSome() {
    return labelsSome;
  }


  public void setLabelsSome(LabelWhereInput labelsSome) {
    this.labelsSome = labelsSome;
  }


  public GpuDeviceWhereInput localCreatedAt(String localCreatedAt) {
    
    this.localCreatedAt = localCreatedAt;
    return this;
  }

   /**
   * Get localCreatedAt
   * @return localCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAt() {
    return localCreatedAt;
  }


  public void setLocalCreatedAt(String localCreatedAt) {
    this.localCreatedAt = localCreatedAt;
  }


  public GpuDeviceWhereInput localCreatedAtGt(String localCreatedAtGt) {
    
    this.localCreatedAtGt = localCreatedAtGt;
    return this;
  }

   /**
   * Get localCreatedAtGt
   * @return localCreatedAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGt() {
    return localCreatedAtGt;
  }


  public void setLocalCreatedAtGt(String localCreatedAtGt) {
    this.localCreatedAtGt = localCreatedAtGt;
  }


  public GpuDeviceWhereInput localCreatedAtGte(String localCreatedAtGte) {
    
    this.localCreatedAtGte = localCreatedAtGte;
    return this;
  }

   /**
   * Get localCreatedAtGte
   * @return localCreatedAtGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtGte() {
    return localCreatedAtGte;
  }


  public void setLocalCreatedAtGte(String localCreatedAtGte) {
    this.localCreatedAtGte = localCreatedAtGte;
  }


  public GpuDeviceWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {
    
    this.localCreatedAtIn = localCreatedAtIn;
    return this;
  }

  public GpuDeviceWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
    if (this.localCreatedAtIn == null) {
      this.localCreatedAtIn = new ArrayList<String>();
    }
    this.localCreatedAtIn.add(localCreatedAtInItem);
    return this;
  }

   /**
   * Get localCreatedAtIn
   * @return localCreatedAtIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtIn() {
    return localCreatedAtIn;
  }


  public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
    this.localCreatedAtIn = localCreatedAtIn;
  }


  public GpuDeviceWhereInput localCreatedAtLt(String localCreatedAtLt) {
    
    this.localCreatedAtLt = localCreatedAtLt;
    return this;
  }

   /**
   * Get localCreatedAtLt
   * @return localCreatedAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLt() {
    return localCreatedAtLt;
  }


  public void setLocalCreatedAtLt(String localCreatedAtLt) {
    this.localCreatedAtLt = localCreatedAtLt;
  }


  public GpuDeviceWhereInput localCreatedAtLte(String localCreatedAtLte) {
    
    this.localCreatedAtLte = localCreatedAtLte;
    return this;
  }

   /**
   * Get localCreatedAtLte
   * @return localCreatedAtLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtLte() {
    return localCreatedAtLte;
  }


  public void setLocalCreatedAtLte(String localCreatedAtLte) {
    this.localCreatedAtLte = localCreatedAtLte;
  }


  public GpuDeviceWhereInput localCreatedAtNot(String localCreatedAtNot) {
    
    this.localCreatedAtNot = localCreatedAtNot;
    return this;
  }

   /**
   * Get localCreatedAtNot
   * @return localCreatedAtNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalCreatedAtNot() {
    return localCreatedAtNot;
  }


  public void setLocalCreatedAtNot(String localCreatedAtNot) {
    this.localCreatedAtNot = localCreatedAtNot;
  }


  public GpuDeviceWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    
    this.localCreatedAtNotIn = localCreatedAtNotIn;
    return this;
  }

  public GpuDeviceWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
    if (this.localCreatedAtNotIn == null) {
      this.localCreatedAtNotIn = new ArrayList<String>();
    }
    this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
    return this;
  }

   /**
   * Get localCreatedAtNotIn
   * @return localCreatedAtNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalCreatedAtNotIn() {
    return localCreatedAtNotIn;
  }


  public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
    this.localCreatedAtNotIn = localCreatedAtNotIn;
  }


  public GpuDeviceWhereInput localId(String localId) {
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    this.localId = localId;
  }


  public GpuDeviceWhereInput localIdContains(String localIdContains) {
    
    this.localIdContains = localIdContains;
    return this;
  }

   /**
   * Get localIdContains
   * @return localIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdContains() {
    return localIdContains;
  }


  public void setLocalIdContains(String localIdContains) {
    this.localIdContains = localIdContains;
  }


  public GpuDeviceWhereInput localIdEndsWith(String localIdEndsWith) {
    
    this.localIdEndsWith = localIdEndsWith;
    return this;
  }

   /**
   * Get localIdEndsWith
   * @return localIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdEndsWith() {
    return localIdEndsWith;
  }


  public void setLocalIdEndsWith(String localIdEndsWith) {
    this.localIdEndsWith = localIdEndsWith;
  }


  public GpuDeviceWhereInput localIdGt(String localIdGt) {
    
    this.localIdGt = localIdGt;
    return this;
  }

   /**
   * Get localIdGt
   * @return localIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGt() {
    return localIdGt;
  }


  public void setLocalIdGt(String localIdGt) {
    this.localIdGt = localIdGt;
  }


  public GpuDeviceWhereInput localIdGte(String localIdGte) {
    
    this.localIdGte = localIdGte;
    return this;
  }

   /**
   * Get localIdGte
   * @return localIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdGte() {
    return localIdGte;
  }


  public void setLocalIdGte(String localIdGte) {
    this.localIdGte = localIdGte;
  }


  public GpuDeviceWhereInput localIdIn(List<String> localIdIn) {
    
    this.localIdIn = localIdIn;
    return this;
  }

  public GpuDeviceWhereInput addLocalIdInItem(String localIdInItem) {
    if (this.localIdIn == null) {
      this.localIdIn = new ArrayList<String>();
    }
    this.localIdIn.add(localIdInItem);
    return this;
  }

   /**
   * Get localIdIn
   * @return localIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdIn() {
    return localIdIn;
  }


  public void setLocalIdIn(List<String> localIdIn) {
    this.localIdIn = localIdIn;
  }


  public GpuDeviceWhereInput localIdLt(String localIdLt) {
    
    this.localIdLt = localIdLt;
    return this;
  }

   /**
   * Get localIdLt
   * @return localIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLt() {
    return localIdLt;
  }


  public void setLocalIdLt(String localIdLt) {
    this.localIdLt = localIdLt;
  }


  public GpuDeviceWhereInput localIdLte(String localIdLte) {
    
    this.localIdLte = localIdLte;
    return this;
  }

   /**
   * Get localIdLte
   * @return localIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdLte() {
    return localIdLte;
  }


  public void setLocalIdLte(String localIdLte) {
    this.localIdLte = localIdLte;
  }


  public GpuDeviceWhereInput localIdNot(String localIdNot) {
    
    this.localIdNot = localIdNot;
    return this;
  }

   /**
   * Get localIdNot
   * @return localIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNot() {
    return localIdNot;
  }


  public void setLocalIdNot(String localIdNot) {
    this.localIdNot = localIdNot;
  }


  public GpuDeviceWhereInput localIdNotContains(String localIdNotContains) {
    
    this.localIdNotContains = localIdNotContains;
    return this;
  }

   /**
   * Get localIdNotContains
   * @return localIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotContains() {
    return localIdNotContains;
  }


  public void setLocalIdNotContains(String localIdNotContains) {
    this.localIdNotContains = localIdNotContains;
  }


  public GpuDeviceWhereInput localIdNotEndsWith(String localIdNotEndsWith) {
    
    this.localIdNotEndsWith = localIdNotEndsWith;
    return this;
  }

   /**
   * Get localIdNotEndsWith
   * @return localIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotEndsWith() {
    return localIdNotEndsWith;
  }


  public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
    this.localIdNotEndsWith = localIdNotEndsWith;
  }


  public GpuDeviceWhereInput localIdNotIn(List<String> localIdNotIn) {
    
    this.localIdNotIn = localIdNotIn;
    return this;
  }

  public GpuDeviceWhereInput addLocalIdNotInItem(String localIdNotInItem) {
    if (this.localIdNotIn == null) {
      this.localIdNotIn = new ArrayList<String>();
    }
    this.localIdNotIn.add(localIdNotInItem);
    return this;
  }

   /**
   * Get localIdNotIn
   * @return localIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLocalIdNotIn() {
    return localIdNotIn;
  }


  public void setLocalIdNotIn(List<String> localIdNotIn) {
    this.localIdNotIn = localIdNotIn;
  }


  public GpuDeviceWhereInput localIdNotStartsWith(String localIdNotStartsWith) {
    
    this.localIdNotStartsWith = localIdNotStartsWith;
    return this;
  }

   /**
   * Get localIdNotStartsWith
   * @return localIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdNotStartsWith() {
    return localIdNotStartsWith;
  }


  public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
    this.localIdNotStartsWith = localIdNotStartsWith;
  }


  public GpuDeviceWhereInput localIdStartsWith(String localIdStartsWith) {
    
    this.localIdStartsWith = localIdStartsWith;
    return this;
  }

   /**
   * Get localIdStartsWith
   * @return localIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalIdStartsWith() {
    return localIdStartsWith;
  }


  public void setLocalIdStartsWith(String localIdStartsWith) {
    this.localIdStartsWith = localIdStartsWith;
  }


  public GpuDeviceWhereInput model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public GpuDeviceWhereInput modelContains(String modelContains) {
    
    this.modelContains = modelContains;
    return this;
  }

   /**
   * Get modelContains
   * @return modelContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelContains() {
    return modelContains;
  }


  public void setModelContains(String modelContains) {
    this.modelContains = modelContains;
  }


  public GpuDeviceWhereInput modelEndsWith(String modelEndsWith) {
    
    this.modelEndsWith = modelEndsWith;
    return this;
  }

   /**
   * Get modelEndsWith
   * @return modelEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelEndsWith() {
    return modelEndsWith;
  }


  public void setModelEndsWith(String modelEndsWith) {
    this.modelEndsWith = modelEndsWith;
  }


  public GpuDeviceWhereInput modelGt(String modelGt) {
    
    this.modelGt = modelGt;
    return this;
  }

   /**
   * Get modelGt
   * @return modelGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelGt() {
    return modelGt;
  }


  public void setModelGt(String modelGt) {
    this.modelGt = modelGt;
  }


  public GpuDeviceWhereInput modelGte(String modelGte) {
    
    this.modelGte = modelGte;
    return this;
  }

   /**
   * Get modelGte
   * @return modelGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelGte() {
    return modelGte;
  }


  public void setModelGte(String modelGte) {
    this.modelGte = modelGte;
  }


  public GpuDeviceWhereInput modelIn(List<String> modelIn) {
    
    this.modelIn = modelIn;
    return this;
  }

  public GpuDeviceWhereInput addModelInItem(String modelInItem) {
    if (this.modelIn == null) {
      this.modelIn = new ArrayList<String>();
    }
    this.modelIn.add(modelInItem);
    return this;
  }

   /**
   * Get modelIn
   * @return modelIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getModelIn() {
    return modelIn;
  }


  public void setModelIn(List<String> modelIn) {
    this.modelIn = modelIn;
  }


  public GpuDeviceWhereInput modelLt(String modelLt) {
    
    this.modelLt = modelLt;
    return this;
  }

   /**
   * Get modelLt
   * @return modelLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelLt() {
    return modelLt;
  }


  public void setModelLt(String modelLt) {
    this.modelLt = modelLt;
  }


  public GpuDeviceWhereInput modelLte(String modelLte) {
    
    this.modelLte = modelLte;
    return this;
  }

   /**
   * Get modelLte
   * @return modelLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelLte() {
    return modelLte;
  }


  public void setModelLte(String modelLte) {
    this.modelLte = modelLte;
  }


  public GpuDeviceWhereInput modelNot(String modelNot) {
    
    this.modelNot = modelNot;
    return this;
  }

   /**
   * Get modelNot
   * @return modelNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNot() {
    return modelNot;
  }


  public void setModelNot(String modelNot) {
    this.modelNot = modelNot;
  }


  public GpuDeviceWhereInput modelNotContains(String modelNotContains) {
    
    this.modelNotContains = modelNotContains;
    return this;
  }

   /**
   * Get modelNotContains
   * @return modelNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotContains() {
    return modelNotContains;
  }


  public void setModelNotContains(String modelNotContains) {
    this.modelNotContains = modelNotContains;
  }


  public GpuDeviceWhereInput modelNotEndsWith(String modelNotEndsWith) {
    
    this.modelNotEndsWith = modelNotEndsWith;
    return this;
  }

   /**
   * Get modelNotEndsWith
   * @return modelNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotEndsWith() {
    return modelNotEndsWith;
  }


  public void setModelNotEndsWith(String modelNotEndsWith) {
    this.modelNotEndsWith = modelNotEndsWith;
  }


  public GpuDeviceWhereInput modelNotIn(List<String> modelNotIn) {
    
    this.modelNotIn = modelNotIn;
    return this;
  }

  public GpuDeviceWhereInput addModelNotInItem(String modelNotInItem) {
    if (this.modelNotIn == null) {
      this.modelNotIn = new ArrayList<String>();
    }
    this.modelNotIn.add(modelNotInItem);
    return this;
  }

   /**
   * Get modelNotIn
   * @return modelNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getModelNotIn() {
    return modelNotIn;
  }


  public void setModelNotIn(List<String> modelNotIn) {
    this.modelNotIn = modelNotIn;
  }


  public GpuDeviceWhereInput modelNotStartsWith(String modelNotStartsWith) {
    
    this.modelNotStartsWith = modelNotStartsWith;
    return this;
  }

   /**
   * Get modelNotStartsWith
   * @return modelNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNotStartsWith() {
    return modelNotStartsWith;
  }


  public void setModelNotStartsWith(String modelNotStartsWith) {
    this.modelNotStartsWith = modelNotStartsWith;
  }


  public GpuDeviceWhereInput modelStartsWith(String modelStartsWith) {
    
    this.modelStartsWith = modelStartsWith;
    return this;
  }

   /**
   * Get modelStartsWith
   * @return modelStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelStartsWith() {
    return modelStartsWith;
  }


  public void setModelStartsWith(String modelStartsWith) {
    this.modelStartsWith = modelStartsWith;
  }


  public GpuDeviceWhereInput name(String name) {
    
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


  public GpuDeviceWhereInput nameContains(String nameContains) {
    
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


  public GpuDeviceWhereInput nameEndsWith(String nameEndsWith) {
    
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


  public GpuDeviceWhereInput nameGt(String nameGt) {
    
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


  public GpuDeviceWhereInput nameGte(String nameGte) {
    
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


  public GpuDeviceWhereInput nameIn(List<String> nameIn) {
    
    this.nameIn = nameIn;
    return this;
  }

  public GpuDeviceWhereInput addNameInItem(String nameInItem) {
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


  public GpuDeviceWhereInput nameLt(String nameLt) {
    
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


  public GpuDeviceWhereInput nameLte(String nameLte) {
    
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


  public GpuDeviceWhereInput nameNot(String nameNot) {
    
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


  public GpuDeviceWhereInput nameNotContains(String nameNotContains) {
    
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


  public GpuDeviceWhereInput nameNotEndsWith(String nameNotEndsWith) {
    
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


  public GpuDeviceWhereInput nameNotIn(List<String> nameNotIn) {
    
    this.nameNotIn = nameNotIn;
    return this;
  }

  public GpuDeviceWhereInput addNameNotInItem(String nameNotInItem) {
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


  public GpuDeviceWhereInput nameNotStartsWith(String nameNotStartsWith) {
    
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


  public GpuDeviceWhereInput nameStartsWith(String nameStartsWith) {
    
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


  public GpuDeviceWhereInput NOT(List<GpuDeviceWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public GpuDeviceWhereInput addNOTItem(GpuDeviceWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<GpuDeviceWhereInput>();
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

  public List<GpuDeviceWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<GpuDeviceWhereInput> NOT) {
    this.NOT = NOT;
  }


  public GpuDeviceWhereInput OR(List<GpuDeviceWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public GpuDeviceWhereInput addORItem(GpuDeviceWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<GpuDeviceWhereInput>();
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

  public List<GpuDeviceWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<GpuDeviceWhereInput> OR) {
    this.OR = OR;
  }


  public GpuDeviceWhereInput status(GpuDeviceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceStatus getStatus() {
    return status;
  }


  public void setStatus(GpuDeviceStatus status) {
    this.status = status;
  }


  public GpuDeviceWhereInput statusIn(List<GpuDeviceStatus> statusIn) {
    
    this.statusIn = statusIn;
    return this;
  }

  public GpuDeviceWhereInput addStatusInItem(GpuDeviceStatus statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<GpuDeviceStatus>();
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

  public List<GpuDeviceStatus> getStatusIn() {
    return statusIn;
  }


  public void setStatusIn(List<GpuDeviceStatus> statusIn) {
    this.statusIn = statusIn;
  }


  public GpuDeviceWhereInput statusNot(GpuDeviceStatus statusNot) {
    
    this.statusNot = statusNot;
    return this;
  }

   /**
   * Get statusNot
   * @return statusNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceStatus getStatusNot() {
    return statusNot;
  }


  public void setStatusNot(GpuDeviceStatus statusNot) {
    this.statusNot = statusNot;
  }


  public GpuDeviceWhereInput statusNotIn(List<GpuDeviceStatus> statusNotIn) {
    
    this.statusNotIn = statusNotIn;
    return this;
  }

  public GpuDeviceWhereInput addStatusNotInItem(GpuDeviceStatus statusNotInItem) {
    if (this.statusNotIn == null) {
      this.statusNotIn = new ArrayList<GpuDeviceStatus>();
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

  public List<GpuDeviceStatus> getStatusNotIn() {
    return statusNotIn;
  }


  public void setStatusNotIn(List<GpuDeviceStatus> statusNotIn) {
    this.statusNotIn = statusNotIn;
  }


  public GpuDeviceWhereInput userUsage(GpuDeviceUsage userUsage) {
    
    this.userUsage = userUsage;
    return this;
  }

   /**
   * Get userUsage
   * @return userUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceUsage getUserUsage() {
    return userUsage;
  }


  public void setUserUsage(GpuDeviceUsage userUsage) {
    this.userUsage = userUsage;
  }


  public GpuDeviceWhereInput userUsageIn(List<GpuDeviceUsage> userUsageIn) {
    
    this.userUsageIn = userUsageIn;
    return this;
  }

  public GpuDeviceWhereInput addUserUsageInItem(GpuDeviceUsage userUsageInItem) {
    if (this.userUsageIn == null) {
      this.userUsageIn = new ArrayList<GpuDeviceUsage>();
    }
    this.userUsageIn.add(userUsageInItem);
    return this;
  }

   /**
   * Get userUsageIn
   * @return userUsageIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GpuDeviceUsage> getUserUsageIn() {
    return userUsageIn;
  }


  public void setUserUsageIn(List<GpuDeviceUsage> userUsageIn) {
    this.userUsageIn = userUsageIn;
  }


  public GpuDeviceWhereInput userUsageNot(GpuDeviceUsage userUsageNot) {
    
    this.userUsageNot = userUsageNot;
    return this;
  }

   /**
   * Get userUsageNot
   * @return userUsageNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GpuDeviceUsage getUserUsageNot() {
    return userUsageNot;
  }


  public void setUserUsageNot(GpuDeviceUsage userUsageNot) {
    this.userUsageNot = userUsageNot;
  }


  public GpuDeviceWhereInput userUsageNotIn(List<GpuDeviceUsage> userUsageNotIn) {
    
    this.userUsageNotIn = userUsageNotIn;
    return this;
  }

  public GpuDeviceWhereInput addUserUsageNotInItem(GpuDeviceUsage userUsageNotInItem) {
    if (this.userUsageNotIn == null) {
      this.userUsageNotIn = new ArrayList<GpuDeviceUsage>();
    }
    this.userUsageNotIn.add(userUsageNotInItem);
    return this;
  }

   /**
   * Get userUsageNotIn
   * @return userUsageNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GpuDeviceUsage> getUserUsageNotIn() {
    return userUsageNotIn;
  }


  public void setUserUsageNotIn(List<GpuDeviceUsage> userUsageNotIn) {
    this.userUsageNotIn = userUsageNotIn;
  }


  public GpuDeviceWhereInput userVgpuTypeId(String userVgpuTypeId) {
    
    this.userVgpuTypeId = userVgpuTypeId;
    return this;
  }

   /**
   * Get userVgpuTypeId
   * @return userVgpuTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeId() {
    return userVgpuTypeId;
  }


  public void setUserVgpuTypeId(String userVgpuTypeId) {
    this.userVgpuTypeId = userVgpuTypeId;
  }


  public GpuDeviceWhereInput userVgpuTypeIdContains(String userVgpuTypeIdContains) {
    
    this.userVgpuTypeIdContains = userVgpuTypeIdContains;
    return this;
  }

   /**
   * Get userVgpuTypeIdContains
   * @return userVgpuTypeIdContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdContains() {
    return userVgpuTypeIdContains;
  }


  public void setUserVgpuTypeIdContains(String userVgpuTypeIdContains) {
    this.userVgpuTypeIdContains = userVgpuTypeIdContains;
  }


  public GpuDeviceWhereInput userVgpuTypeIdEndsWith(String userVgpuTypeIdEndsWith) {
    
    this.userVgpuTypeIdEndsWith = userVgpuTypeIdEndsWith;
    return this;
  }

   /**
   * Get userVgpuTypeIdEndsWith
   * @return userVgpuTypeIdEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdEndsWith() {
    return userVgpuTypeIdEndsWith;
  }


  public void setUserVgpuTypeIdEndsWith(String userVgpuTypeIdEndsWith) {
    this.userVgpuTypeIdEndsWith = userVgpuTypeIdEndsWith;
  }


  public GpuDeviceWhereInput userVgpuTypeIdGt(String userVgpuTypeIdGt) {
    
    this.userVgpuTypeIdGt = userVgpuTypeIdGt;
    return this;
  }

   /**
   * Get userVgpuTypeIdGt
   * @return userVgpuTypeIdGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdGt() {
    return userVgpuTypeIdGt;
  }


  public void setUserVgpuTypeIdGt(String userVgpuTypeIdGt) {
    this.userVgpuTypeIdGt = userVgpuTypeIdGt;
  }


  public GpuDeviceWhereInput userVgpuTypeIdGte(String userVgpuTypeIdGte) {
    
    this.userVgpuTypeIdGte = userVgpuTypeIdGte;
    return this;
  }

   /**
   * Get userVgpuTypeIdGte
   * @return userVgpuTypeIdGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdGte() {
    return userVgpuTypeIdGte;
  }


  public void setUserVgpuTypeIdGte(String userVgpuTypeIdGte) {
    this.userVgpuTypeIdGte = userVgpuTypeIdGte;
  }


  public GpuDeviceWhereInput userVgpuTypeIdIn(List<String> userVgpuTypeIdIn) {
    
    this.userVgpuTypeIdIn = userVgpuTypeIdIn;
    return this;
  }

  public GpuDeviceWhereInput addUserVgpuTypeIdInItem(String userVgpuTypeIdInItem) {
    if (this.userVgpuTypeIdIn == null) {
      this.userVgpuTypeIdIn = new ArrayList<String>();
    }
    this.userVgpuTypeIdIn.add(userVgpuTypeIdInItem);
    return this;
  }

   /**
   * Get userVgpuTypeIdIn
   * @return userVgpuTypeIdIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserVgpuTypeIdIn() {
    return userVgpuTypeIdIn;
  }


  public void setUserVgpuTypeIdIn(List<String> userVgpuTypeIdIn) {
    this.userVgpuTypeIdIn = userVgpuTypeIdIn;
  }


  public GpuDeviceWhereInput userVgpuTypeIdLt(String userVgpuTypeIdLt) {
    
    this.userVgpuTypeIdLt = userVgpuTypeIdLt;
    return this;
  }

   /**
   * Get userVgpuTypeIdLt
   * @return userVgpuTypeIdLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdLt() {
    return userVgpuTypeIdLt;
  }


  public void setUserVgpuTypeIdLt(String userVgpuTypeIdLt) {
    this.userVgpuTypeIdLt = userVgpuTypeIdLt;
  }


  public GpuDeviceWhereInput userVgpuTypeIdLte(String userVgpuTypeIdLte) {
    
    this.userVgpuTypeIdLte = userVgpuTypeIdLte;
    return this;
  }

   /**
   * Get userVgpuTypeIdLte
   * @return userVgpuTypeIdLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdLte() {
    return userVgpuTypeIdLte;
  }


  public void setUserVgpuTypeIdLte(String userVgpuTypeIdLte) {
    this.userVgpuTypeIdLte = userVgpuTypeIdLte;
  }


  public GpuDeviceWhereInput userVgpuTypeIdNot(String userVgpuTypeIdNot) {
    
    this.userVgpuTypeIdNot = userVgpuTypeIdNot;
    return this;
  }

   /**
   * Get userVgpuTypeIdNot
   * @return userVgpuTypeIdNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdNot() {
    return userVgpuTypeIdNot;
  }


  public void setUserVgpuTypeIdNot(String userVgpuTypeIdNot) {
    this.userVgpuTypeIdNot = userVgpuTypeIdNot;
  }


  public GpuDeviceWhereInput userVgpuTypeIdNotContains(String userVgpuTypeIdNotContains) {
    
    this.userVgpuTypeIdNotContains = userVgpuTypeIdNotContains;
    return this;
  }

   /**
   * Get userVgpuTypeIdNotContains
   * @return userVgpuTypeIdNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdNotContains() {
    return userVgpuTypeIdNotContains;
  }


  public void setUserVgpuTypeIdNotContains(String userVgpuTypeIdNotContains) {
    this.userVgpuTypeIdNotContains = userVgpuTypeIdNotContains;
  }


  public GpuDeviceWhereInput userVgpuTypeIdNotEndsWith(String userVgpuTypeIdNotEndsWith) {
    
    this.userVgpuTypeIdNotEndsWith = userVgpuTypeIdNotEndsWith;
    return this;
  }

   /**
   * Get userVgpuTypeIdNotEndsWith
   * @return userVgpuTypeIdNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdNotEndsWith() {
    return userVgpuTypeIdNotEndsWith;
  }


  public void setUserVgpuTypeIdNotEndsWith(String userVgpuTypeIdNotEndsWith) {
    this.userVgpuTypeIdNotEndsWith = userVgpuTypeIdNotEndsWith;
  }


  public GpuDeviceWhereInput userVgpuTypeIdNotIn(List<String> userVgpuTypeIdNotIn) {
    
    this.userVgpuTypeIdNotIn = userVgpuTypeIdNotIn;
    return this;
  }

  public GpuDeviceWhereInput addUserVgpuTypeIdNotInItem(String userVgpuTypeIdNotInItem) {
    if (this.userVgpuTypeIdNotIn == null) {
      this.userVgpuTypeIdNotIn = new ArrayList<String>();
    }
    this.userVgpuTypeIdNotIn.add(userVgpuTypeIdNotInItem);
    return this;
  }

   /**
   * Get userVgpuTypeIdNotIn
   * @return userVgpuTypeIdNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserVgpuTypeIdNotIn() {
    return userVgpuTypeIdNotIn;
  }


  public void setUserVgpuTypeIdNotIn(List<String> userVgpuTypeIdNotIn) {
    this.userVgpuTypeIdNotIn = userVgpuTypeIdNotIn;
  }


  public GpuDeviceWhereInput userVgpuTypeIdNotStartsWith(String userVgpuTypeIdNotStartsWith) {
    
    this.userVgpuTypeIdNotStartsWith = userVgpuTypeIdNotStartsWith;
    return this;
  }

   /**
   * Get userVgpuTypeIdNotStartsWith
   * @return userVgpuTypeIdNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdNotStartsWith() {
    return userVgpuTypeIdNotStartsWith;
  }


  public void setUserVgpuTypeIdNotStartsWith(String userVgpuTypeIdNotStartsWith) {
    this.userVgpuTypeIdNotStartsWith = userVgpuTypeIdNotStartsWith;
  }


  public GpuDeviceWhereInput userVgpuTypeIdStartsWith(String userVgpuTypeIdStartsWith) {
    
    this.userVgpuTypeIdStartsWith = userVgpuTypeIdStartsWith;
    return this;
  }

   /**
   * Get userVgpuTypeIdStartsWith
   * @return userVgpuTypeIdStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeIdStartsWith() {
    return userVgpuTypeIdStartsWith;
  }


  public void setUserVgpuTypeIdStartsWith(String userVgpuTypeIdStartsWith) {
    this.userVgpuTypeIdStartsWith = userVgpuTypeIdStartsWith;
  }


  public GpuDeviceWhereInput userVgpuTypeName(String userVgpuTypeName) {
    
    this.userVgpuTypeName = userVgpuTypeName;
    return this;
  }

   /**
   * Get userVgpuTypeName
   * @return userVgpuTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeName() {
    return userVgpuTypeName;
  }


  public void setUserVgpuTypeName(String userVgpuTypeName) {
    this.userVgpuTypeName = userVgpuTypeName;
  }


  public GpuDeviceWhereInput userVgpuTypeNameContains(String userVgpuTypeNameContains) {
    
    this.userVgpuTypeNameContains = userVgpuTypeNameContains;
    return this;
  }

   /**
   * Get userVgpuTypeNameContains
   * @return userVgpuTypeNameContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameContains() {
    return userVgpuTypeNameContains;
  }


  public void setUserVgpuTypeNameContains(String userVgpuTypeNameContains) {
    this.userVgpuTypeNameContains = userVgpuTypeNameContains;
  }


  public GpuDeviceWhereInput userVgpuTypeNameEndsWith(String userVgpuTypeNameEndsWith) {
    
    this.userVgpuTypeNameEndsWith = userVgpuTypeNameEndsWith;
    return this;
  }

   /**
   * Get userVgpuTypeNameEndsWith
   * @return userVgpuTypeNameEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameEndsWith() {
    return userVgpuTypeNameEndsWith;
  }


  public void setUserVgpuTypeNameEndsWith(String userVgpuTypeNameEndsWith) {
    this.userVgpuTypeNameEndsWith = userVgpuTypeNameEndsWith;
  }


  public GpuDeviceWhereInput userVgpuTypeNameGt(String userVgpuTypeNameGt) {
    
    this.userVgpuTypeNameGt = userVgpuTypeNameGt;
    return this;
  }

   /**
   * Get userVgpuTypeNameGt
   * @return userVgpuTypeNameGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameGt() {
    return userVgpuTypeNameGt;
  }


  public void setUserVgpuTypeNameGt(String userVgpuTypeNameGt) {
    this.userVgpuTypeNameGt = userVgpuTypeNameGt;
  }


  public GpuDeviceWhereInput userVgpuTypeNameGte(String userVgpuTypeNameGte) {
    
    this.userVgpuTypeNameGte = userVgpuTypeNameGte;
    return this;
  }

   /**
   * Get userVgpuTypeNameGte
   * @return userVgpuTypeNameGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameGte() {
    return userVgpuTypeNameGte;
  }


  public void setUserVgpuTypeNameGte(String userVgpuTypeNameGte) {
    this.userVgpuTypeNameGte = userVgpuTypeNameGte;
  }


  public GpuDeviceWhereInput userVgpuTypeNameIn(List<String> userVgpuTypeNameIn) {
    
    this.userVgpuTypeNameIn = userVgpuTypeNameIn;
    return this;
  }

  public GpuDeviceWhereInput addUserVgpuTypeNameInItem(String userVgpuTypeNameInItem) {
    if (this.userVgpuTypeNameIn == null) {
      this.userVgpuTypeNameIn = new ArrayList<String>();
    }
    this.userVgpuTypeNameIn.add(userVgpuTypeNameInItem);
    return this;
  }

   /**
   * Get userVgpuTypeNameIn
   * @return userVgpuTypeNameIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserVgpuTypeNameIn() {
    return userVgpuTypeNameIn;
  }


  public void setUserVgpuTypeNameIn(List<String> userVgpuTypeNameIn) {
    this.userVgpuTypeNameIn = userVgpuTypeNameIn;
  }


  public GpuDeviceWhereInput userVgpuTypeNameLt(String userVgpuTypeNameLt) {
    
    this.userVgpuTypeNameLt = userVgpuTypeNameLt;
    return this;
  }

   /**
   * Get userVgpuTypeNameLt
   * @return userVgpuTypeNameLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameLt() {
    return userVgpuTypeNameLt;
  }


  public void setUserVgpuTypeNameLt(String userVgpuTypeNameLt) {
    this.userVgpuTypeNameLt = userVgpuTypeNameLt;
  }


  public GpuDeviceWhereInput userVgpuTypeNameLte(String userVgpuTypeNameLte) {
    
    this.userVgpuTypeNameLte = userVgpuTypeNameLte;
    return this;
  }

   /**
   * Get userVgpuTypeNameLte
   * @return userVgpuTypeNameLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameLte() {
    return userVgpuTypeNameLte;
  }


  public void setUserVgpuTypeNameLte(String userVgpuTypeNameLte) {
    this.userVgpuTypeNameLte = userVgpuTypeNameLte;
  }


  public GpuDeviceWhereInput userVgpuTypeNameNot(String userVgpuTypeNameNot) {
    
    this.userVgpuTypeNameNot = userVgpuTypeNameNot;
    return this;
  }

   /**
   * Get userVgpuTypeNameNot
   * @return userVgpuTypeNameNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameNot() {
    return userVgpuTypeNameNot;
  }


  public void setUserVgpuTypeNameNot(String userVgpuTypeNameNot) {
    this.userVgpuTypeNameNot = userVgpuTypeNameNot;
  }


  public GpuDeviceWhereInput userVgpuTypeNameNotContains(String userVgpuTypeNameNotContains) {
    
    this.userVgpuTypeNameNotContains = userVgpuTypeNameNotContains;
    return this;
  }

   /**
   * Get userVgpuTypeNameNotContains
   * @return userVgpuTypeNameNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameNotContains() {
    return userVgpuTypeNameNotContains;
  }


  public void setUserVgpuTypeNameNotContains(String userVgpuTypeNameNotContains) {
    this.userVgpuTypeNameNotContains = userVgpuTypeNameNotContains;
  }


  public GpuDeviceWhereInput userVgpuTypeNameNotEndsWith(String userVgpuTypeNameNotEndsWith) {
    
    this.userVgpuTypeNameNotEndsWith = userVgpuTypeNameNotEndsWith;
    return this;
  }

   /**
   * Get userVgpuTypeNameNotEndsWith
   * @return userVgpuTypeNameNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameNotEndsWith() {
    return userVgpuTypeNameNotEndsWith;
  }


  public void setUserVgpuTypeNameNotEndsWith(String userVgpuTypeNameNotEndsWith) {
    this.userVgpuTypeNameNotEndsWith = userVgpuTypeNameNotEndsWith;
  }


  public GpuDeviceWhereInput userVgpuTypeNameNotIn(List<String> userVgpuTypeNameNotIn) {
    
    this.userVgpuTypeNameNotIn = userVgpuTypeNameNotIn;
    return this;
  }

  public GpuDeviceWhereInput addUserVgpuTypeNameNotInItem(String userVgpuTypeNameNotInItem) {
    if (this.userVgpuTypeNameNotIn == null) {
      this.userVgpuTypeNameNotIn = new ArrayList<String>();
    }
    this.userVgpuTypeNameNotIn.add(userVgpuTypeNameNotInItem);
    return this;
  }

   /**
   * Get userVgpuTypeNameNotIn
   * @return userVgpuTypeNameNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUserVgpuTypeNameNotIn() {
    return userVgpuTypeNameNotIn;
  }


  public void setUserVgpuTypeNameNotIn(List<String> userVgpuTypeNameNotIn) {
    this.userVgpuTypeNameNotIn = userVgpuTypeNameNotIn;
  }


  public GpuDeviceWhereInput userVgpuTypeNameNotStartsWith(String userVgpuTypeNameNotStartsWith) {
    
    this.userVgpuTypeNameNotStartsWith = userVgpuTypeNameNotStartsWith;
    return this;
  }

   /**
   * Get userVgpuTypeNameNotStartsWith
   * @return userVgpuTypeNameNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameNotStartsWith() {
    return userVgpuTypeNameNotStartsWith;
  }


  public void setUserVgpuTypeNameNotStartsWith(String userVgpuTypeNameNotStartsWith) {
    this.userVgpuTypeNameNotStartsWith = userVgpuTypeNameNotStartsWith;
  }


  public GpuDeviceWhereInput userVgpuTypeNameStartsWith(String userVgpuTypeNameStartsWith) {
    
    this.userVgpuTypeNameStartsWith = userVgpuTypeNameStartsWith;
    return this;
  }

   /**
   * Get userVgpuTypeNameStartsWith
   * @return userVgpuTypeNameStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserVgpuTypeNameStartsWith() {
    return userVgpuTypeNameStartsWith;
  }


  public void setUserVgpuTypeNameStartsWith(String userVgpuTypeNameStartsWith) {
    this.userVgpuTypeNameStartsWith = userVgpuTypeNameStartsWith;
  }


  public GpuDeviceWhereInput vgpuInstanceNum(Integer vgpuInstanceNum) {
    
    this.vgpuInstanceNum = vgpuInstanceNum;
    return this;
  }

   /**
   * Get vgpuInstanceNum
   * @return vgpuInstanceNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceNum() {
    return vgpuInstanceNum;
  }


  public void setVgpuInstanceNum(Integer vgpuInstanceNum) {
    this.vgpuInstanceNum = vgpuInstanceNum;
  }


  public GpuDeviceWhereInput vgpuInstanceNumGt(Integer vgpuInstanceNumGt) {
    
    this.vgpuInstanceNumGt = vgpuInstanceNumGt;
    return this;
  }

   /**
   * Get vgpuInstanceNumGt
   * @return vgpuInstanceNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceNumGt() {
    return vgpuInstanceNumGt;
  }


  public void setVgpuInstanceNumGt(Integer vgpuInstanceNumGt) {
    this.vgpuInstanceNumGt = vgpuInstanceNumGt;
  }


  public GpuDeviceWhereInput vgpuInstanceNumGte(Integer vgpuInstanceNumGte) {
    
    this.vgpuInstanceNumGte = vgpuInstanceNumGte;
    return this;
  }

   /**
   * Get vgpuInstanceNumGte
   * @return vgpuInstanceNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceNumGte() {
    return vgpuInstanceNumGte;
  }


  public void setVgpuInstanceNumGte(Integer vgpuInstanceNumGte) {
    this.vgpuInstanceNumGte = vgpuInstanceNumGte;
  }


  public GpuDeviceWhereInput vgpuInstanceNumIn(List<Integer> vgpuInstanceNumIn) {
    
    this.vgpuInstanceNumIn = vgpuInstanceNumIn;
    return this;
  }

  public GpuDeviceWhereInput addVgpuInstanceNumInItem(Integer vgpuInstanceNumInItem) {
    if (this.vgpuInstanceNumIn == null) {
      this.vgpuInstanceNumIn = new ArrayList<Integer>();
    }
    this.vgpuInstanceNumIn.add(vgpuInstanceNumInItem);
    return this;
  }

   /**
   * Get vgpuInstanceNumIn
   * @return vgpuInstanceNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVgpuInstanceNumIn() {
    return vgpuInstanceNumIn;
  }


  public void setVgpuInstanceNumIn(List<Integer> vgpuInstanceNumIn) {
    this.vgpuInstanceNumIn = vgpuInstanceNumIn;
  }


  public GpuDeviceWhereInput vgpuInstanceNumLt(Integer vgpuInstanceNumLt) {
    
    this.vgpuInstanceNumLt = vgpuInstanceNumLt;
    return this;
  }

   /**
   * Get vgpuInstanceNumLt
   * @return vgpuInstanceNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceNumLt() {
    return vgpuInstanceNumLt;
  }


  public void setVgpuInstanceNumLt(Integer vgpuInstanceNumLt) {
    this.vgpuInstanceNumLt = vgpuInstanceNumLt;
  }


  public GpuDeviceWhereInput vgpuInstanceNumLte(Integer vgpuInstanceNumLte) {
    
    this.vgpuInstanceNumLte = vgpuInstanceNumLte;
    return this;
  }

   /**
   * Get vgpuInstanceNumLte
   * @return vgpuInstanceNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceNumLte() {
    return vgpuInstanceNumLte;
  }


  public void setVgpuInstanceNumLte(Integer vgpuInstanceNumLte) {
    this.vgpuInstanceNumLte = vgpuInstanceNumLte;
  }


  public GpuDeviceWhereInput vgpuInstanceNumNot(Integer vgpuInstanceNumNot) {
    
    this.vgpuInstanceNumNot = vgpuInstanceNumNot;
    return this;
  }

   /**
   * Get vgpuInstanceNumNot
   * @return vgpuInstanceNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVgpuInstanceNumNot() {
    return vgpuInstanceNumNot;
  }


  public void setVgpuInstanceNumNot(Integer vgpuInstanceNumNot) {
    this.vgpuInstanceNumNot = vgpuInstanceNumNot;
  }


  public GpuDeviceWhereInput vgpuInstanceNumNotIn(List<Integer> vgpuInstanceNumNotIn) {
    
    this.vgpuInstanceNumNotIn = vgpuInstanceNumNotIn;
    return this;
  }

  public GpuDeviceWhereInput addVgpuInstanceNumNotInItem(Integer vgpuInstanceNumNotInItem) {
    if (this.vgpuInstanceNumNotIn == null) {
      this.vgpuInstanceNumNotIn = new ArrayList<Integer>();
    }
    this.vgpuInstanceNumNotIn.add(vgpuInstanceNumNotInItem);
    return this;
  }

   /**
   * Get vgpuInstanceNumNotIn
   * @return vgpuInstanceNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVgpuInstanceNumNotIn() {
    return vgpuInstanceNumNotIn;
  }


  public void setVgpuInstanceNumNotIn(List<Integer> vgpuInstanceNumNotIn) {
    this.vgpuInstanceNumNotIn = vgpuInstanceNumNotIn;
  }


  public GpuDeviceWhereInput vmsEvery(VmWhereInput vmsEvery) {
    
    this.vmsEvery = vmsEvery;
    return this;
  }

   /**
   * Get vmsEvery
   * @return vmsEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsEvery() {
    return vmsEvery;
  }


  public void setVmsEvery(VmWhereInput vmsEvery) {
    this.vmsEvery = vmsEvery;
  }


  public GpuDeviceWhereInput vmsNone(VmWhereInput vmsNone) {
    
    this.vmsNone = vmsNone;
    return this;
  }

   /**
   * Get vmsNone
   * @return vmsNone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsNone() {
    return vmsNone;
  }


  public void setVmsNone(VmWhereInput vmsNone) {
    this.vmsNone = vmsNone;
  }


  public GpuDeviceWhereInput vmsSome(VmWhereInput vmsSome) {
    
    this.vmsSome = vmsSome;
    return this;
  }

   /**
   * Get vmsSome
   * @return vmsSome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VmWhereInput getVmsSome() {
    return vmsSome;
  }


  public void setVmsSome(VmWhereInput vmsSome) {
    this.vmsSome = vmsSome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpuDeviceWhereInput gpuDeviceWhereInput = (GpuDeviceWhereInput) o;
    return Objects.equals(this.AND, gpuDeviceWhereInput.AND) &&
        Objects.equals(this.assignedVgpusNum, gpuDeviceWhereInput.assignedVgpusNum) &&
        Objects.equals(this.assignedVgpusNumGt, gpuDeviceWhereInput.assignedVgpusNumGt) &&
        Objects.equals(this.assignedVgpusNumGte, gpuDeviceWhereInput.assignedVgpusNumGte) &&
        Objects.equals(this.assignedVgpusNumIn, gpuDeviceWhereInput.assignedVgpusNumIn) &&
        Objects.equals(this.assignedVgpusNumLt, gpuDeviceWhereInput.assignedVgpusNumLt) &&
        Objects.equals(this.assignedVgpusNumLte, gpuDeviceWhereInput.assignedVgpusNumLte) &&
        Objects.equals(this.assignedVgpusNumNot, gpuDeviceWhereInput.assignedVgpusNumNot) &&
        Objects.equals(this.assignedVgpusNumNotIn, gpuDeviceWhereInput.assignedVgpusNumNotIn) &&
        Objects.equals(this.availableVgpusNum, gpuDeviceWhereInput.availableVgpusNum) &&
        Objects.equals(this.availableVgpusNumGt, gpuDeviceWhereInput.availableVgpusNumGt) &&
        Objects.equals(this.availableVgpusNumGte, gpuDeviceWhereInput.availableVgpusNumGte) &&
        Objects.equals(this.availableVgpusNumIn, gpuDeviceWhereInput.availableVgpusNumIn) &&
        Objects.equals(this.availableVgpusNumLt, gpuDeviceWhereInput.availableVgpusNumLt) &&
        Objects.equals(this.availableVgpusNumLte, gpuDeviceWhereInput.availableVgpusNumLte) &&
        Objects.equals(this.availableVgpusNumNot, gpuDeviceWhereInput.availableVgpusNumNot) &&
        Objects.equals(this.availableVgpusNumNotIn, gpuDeviceWhereInput.availableVgpusNumNotIn) &&
        Objects.equals(this.brand, gpuDeviceWhereInput.brand) &&
        Objects.equals(this.brandContains, gpuDeviceWhereInput.brandContains) &&
        Objects.equals(this.brandEndsWith, gpuDeviceWhereInput.brandEndsWith) &&
        Objects.equals(this.brandGt, gpuDeviceWhereInput.brandGt) &&
        Objects.equals(this.brandGte, gpuDeviceWhereInput.brandGte) &&
        Objects.equals(this.brandIn, gpuDeviceWhereInput.brandIn) &&
        Objects.equals(this.brandLt, gpuDeviceWhereInput.brandLt) &&
        Objects.equals(this.brandLte, gpuDeviceWhereInput.brandLte) &&
        Objects.equals(this.brandNot, gpuDeviceWhereInput.brandNot) &&
        Objects.equals(this.brandNotContains, gpuDeviceWhereInput.brandNotContains) &&
        Objects.equals(this.brandNotEndsWith, gpuDeviceWhereInput.brandNotEndsWith) &&
        Objects.equals(this.brandNotIn, gpuDeviceWhereInput.brandNotIn) &&
        Objects.equals(this.brandNotStartsWith, gpuDeviceWhereInput.brandNotStartsWith) &&
        Objects.equals(this.brandStartsWith, gpuDeviceWhereInput.brandStartsWith) &&
        Objects.equals(this.busLocation, gpuDeviceWhereInput.busLocation) &&
        Objects.equals(this.busLocationContains, gpuDeviceWhereInput.busLocationContains) &&
        Objects.equals(this.busLocationEndsWith, gpuDeviceWhereInput.busLocationEndsWith) &&
        Objects.equals(this.busLocationGt, gpuDeviceWhereInput.busLocationGt) &&
        Objects.equals(this.busLocationGte, gpuDeviceWhereInput.busLocationGte) &&
        Objects.equals(this.busLocationIn, gpuDeviceWhereInput.busLocationIn) &&
        Objects.equals(this.busLocationLt, gpuDeviceWhereInput.busLocationLt) &&
        Objects.equals(this.busLocationLte, gpuDeviceWhereInput.busLocationLte) &&
        Objects.equals(this.busLocationNot, gpuDeviceWhereInput.busLocationNot) &&
        Objects.equals(this.busLocationNotContains, gpuDeviceWhereInput.busLocationNotContains) &&
        Objects.equals(this.busLocationNotEndsWith, gpuDeviceWhereInput.busLocationNotEndsWith) &&
        Objects.equals(this.busLocationNotIn, gpuDeviceWhereInput.busLocationNotIn) &&
        Objects.equals(this.busLocationNotStartsWith, gpuDeviceWhereInput.busLocationNotStartsWith) &&
        Objects.equals(this.busLocationStartsWith, gpuDeviceWhereInput.busLocationStartsWith) &&
        Objects.equals(this.description, gpuDeviceWhereInput.description) &&
        Objects.equals(this.descriptionContains, gpuDeviceWhereInput.descriptionContains) &&
        Objects.equals(this.descriptionEndsWith, gpuDeviceWhereInput.descriptionEndsWith) &&
        Objects.equals(this.descriptionGt, gpuDeviceWhereInput.descriptionGt) &&
        Objects.equals(this.descriptionGte, gpuDeviceWhereInput.descriptionGte) &&
        Objects.equals(this.descriptionIn, gpuDeviceWhereInput.descriptionIn) &&
        Objects.equals(this.descriptionLt, gpuDeviceWhereInput.descriptionLt) &&
        Objects.equals(this.descriptionLte, gpuDeviceWhereInput.descriptionLte) &&
        Objects.equals(this.descriptionNot, gpuDeviceWhereInput.descriptionNot) &&
        Objects.equals(this.descriptionNotContains, gpuDeviceWhereInput.descriptionNotContains) &&
        Objects.equals(this.descriptionNotEndsWith, gpuDeviceWhereInput.descriptionNotEndsWith) &&
        Objects.equals(this.descriptionNotIn, gpuDeviceWhereInput.descriptionNotIn) &&
        Objects.equals(this.descriptionNotStartsWith, gpuDeviceWhereInput.descriptionNotStartsWith) &&
        Objects.equals(this.descriptionStartsWith, gpuDeviceWhereInput.descriptionStartsWith) &&
        Objects.equals(this.entityAsyncStatus, gpuDeviceWhereInput.entityAsyncStatus) &&
        Objects.equals(this.entityAsyncStatusIn, gpuDeviceWhereInput.entityAsyncStatusIn) &&
        Objects.equals(this.entityAsyncStatusNot, gpuDeviceWhereInput.entityAsyncStatusNot) &&
        Objects.equals(this.entityAsyncStatusNotIn, gpuDeviceWhereInput.entityAsyncStatusNotIn) &&
        Objects.equals(this.host, gpuDeviceWhereInput.host) &&
        Objects.equals(this.id, gpuDeviceWhereInput.id) &&
        Objects.equals(this.idContains, gpuDeviceWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, gpuDeviceWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, gpuDeviceWhereInput.idGt) &&
        Objects.equals(this.idGte, gpuDeviceWhereInput.idGte) &&
        Objects.equals(this.idIn, gpuDeviceWhereInput.idIn) &&
        Objects.equals(this.idLt, gpuDeviceWhereInput.idLt) &&
        Objects.equals(this.idLte, gpuDeviceWhereInput.idLte) &&
        Objects.equals(this.idNot, gpuDeviceWhereInput.idNot) &&
        Objects.equals(this.idNotContains, gpuDeviceWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, gpuDeviceWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, gpuDeviceWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, gpuDeviceWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, gpuDeviceWhereInput.idStartsWith) &&
        Objects.equals(this.isNvidiaToolsReady, gpuDeviceWhereInput.isNvidiaToolsReady) &&
        Objects.equals(this.isNvidiaToolsReadyNot, gpuDeviceWhereInput.isNvidiaToolsReadyNot) &&
        Objects.equals(this.isNvidiaVfsEnabled, gpuDeviceWhereInput.isNvidiaVfsEnabled) &&
        Objects.equals(this.isNvidiaVfsEnabledNot, gpuDeviceWhereInput.isNvidiaVfsEnabledNot) &&
        Objects.equals(this.isNvidiaVfsSupported, gpuDeviceWhereInput.isNvidiaVfsSupported) &&
        Objects.equals(this.isNvidiaVfsSupportedNot, gpuDeviceWhereInput.isNvidiaVfsSupportedNot) &&
        Objects.equals(this.labelsEvery, gpuDeviceWhereInput.labelsEvery) &&
        Objects.equals(this.labelsNone, gpuDeviceWhereInput.labelsNone) &&
        Objects.equals(this.labelsSome, gpuDeviceWhereInput.labelsSome) &&
        Objects.equals(this.localCreatedAt, gpuDeviceWhereInput.localCreatedAt) &&
        Objects.equals(this.localCreatedAtGt, gpuDeviceWhereInput.localCreatedAtGt) &&
        Objects.equals(this.localCreatedAtGte, gpuDeviceWhereInput.localCreatedAtGte) &&
        Objects.equals(this.localCreatedAtIn, gpuDeviceWhereInput.localCreatedAtIn) &&
        Objects.equals(this.localCreatedAtLt, gpuDeviceWhereInput.localCreatedAtLt) &&
        Objects.equals(this.localCreatedAtLte, gpuDeviceWhereInput.localCreatedAtLte) &&
        Objects.equals(this.localCreatedAtNot, gpuDeviceWhereInput.localCreatedAtNot) &&
        Objects.equals(this.localCreatedAtNotIn, gpuDeviceWhereInput.localCreatedAtNotIn) &&
        Objects.equals(this.localId, gpuDeviceWhereInput.localId) &&
        Objects.equals(this.localIdContains, gpuDeviceWhereInput.localIdContains) &&
        Objects.equals(this.localIdEndsWith, gpuDeviceWhereInput.localIdEndsWith) &&
        Objects.equals(this.localIdGt, gpuDeviceWhereInput.localIdGt) &&
        Objects.equals(this.localIdGte, gpuDeviceWhereInput.localIdGte) &&
        Objects.equals(this.localIdIn, gpuDeviceWhereInput.localIdIn) &&
        Objects.equals(this.localIdLt, gpuDeviceWhereInput.localIdLt) &&
        Objects.equals(this.localIdLte, gpuDeviceWhereInput.localIdLte) &&
        Objects.equals(this.localIdNot, gpuDeviceWhereInput.localIdNot) &&
        Objects.equals(this.localIdNotContains, gpuDeviceWhereInput.localIdNotContains) &&
        Objects.equals(this.localIdNotEndsWith, gpuDeviceWhereInput.localIdNotEndsWith) &&
        Objects.equals(this.localIdNotIn, gpuDeviceWhereInput.localIdNotIn) &&
        Objects.equals(this.localIdNotStartsWith, gpuDeviceWhereInput.localIdNotStartsWith) &&
        Objects.equals(this.localIdStartsWith, gpuDeviceWhereInput.localIdStartsWith) &&
        Objects.equals(this.model, gpuDeviceWhereInput.model) &&
        Objects.equals(this.modelContains, gpuDeviceWhereInput.modelContains) &&
        Objects.equals(this.modelEndsWith, gpuDeviceWhereInput.modelEndsWith) &&
        Objects.equals(this.modelGt, gpuDeviceWhereInput.modelGt) &&
        Objects.equals(this.modelGte, gpuDeviceWhereInput.modelGte) &&
        Objects.equals(this.modelIn, gpuDeviceWhereInput.modelIn) &&
        Objects.equals(this.modelLt, gpuDeviceWhereInput.modelLt) &&
        Objects.equals(this.modelLte, gpuDeviceWhereInput.modelLte) &&
        Objects.equals(this.modelNot, gpuDeviceWhereInput.modelNot) &&
        Objects.equals(this.modelNotContains, gpuDeviceWhereInput.modelNotContains) &&
        Objects.equals(this.modelNotEndsWith, gpuDeviceWhereInput.modelNotEndsWith) &&
        Objects.equals(this.modelNotIn, gpuDeviceWhereInput.modelNotIn) &&
        Objects.equals(this.modelNotStartsWith, gpuDeviceWhereInput.modelNotStartsWith) &&
        Objects.equals(this.modelStartsWith, gpuDeviceWhereInput.modelStartsWith) &&
        Objects.equals(this.name, gpuDeviceWhereInput.name) &&
        Objects.equals(this.nameContains, gpuDeviceWhereInput.nameContains) &&
        Objects.equals(this.nameEndsWith, gpuDeviceWhereInput.nameEndsWith) &&
        Objects.equals(this.nameGt, gpuDeviceWhereInput.nameGt) &&
        Objects.equals(this.nameGte, gpuDeviceWhereInput.nameGte) &&
        Objects.equals(this.nameIn, gpuDeviceWhereInput.nameIn) &&
        Objects.equals(this.nameLt, gpuDeviceWhereInput.nameLt) &&
        Objects.equals(this.nameLte, gpuDeviceWhereInput.nameLte) &&
        Objects.equals(this.nameNot, gpuDeviceWhereInput.nameNot) &&
        Objects.equals(this.nameNotContains, gpuDeviceWhereInput.nameNotContains) &&
        Objects.equals(this.nameNotEndsWith, gpuDeviceWhereInput.nameNotEndsWith) &&
        Objects.equals(this.nameNotIn, gpuDeviceWhereInput.nameNotIn) &&
        Objects.equals(this.nameNotStartsWith, gpuDeviceWhereInput.nameNotStartsWith) &&
        Objects.equals(this.nameStartsWith, gpuDeviceWhereInput.nameStartsWith) &&
        Objects.equals(this.NOT, gpuDeviceWhereInput.NOT) &&
        Objects.equals(this.OR, gpuDeviceWhereInput.OR) &&
        Objects.equals(this.status, gpuDeviceWhereInput.status) &&
        Objects.equals(this.statusIn, gpuDeviceWhereInput.statusIn) &&
        Objects.equals(this.statusNot, gpuDeviceWhereInput.statusNot) &&
        Objects.equals(this.statusNotIn, gpuDeviceWhereInput.statusNotIn) &&
        Objects.equals(this.userUsage, gpuDeviceWhereInput.userUsage) &&
        Objects.equals(this.userUsageIn, gpuDeviceWhereInput.userUsageIn) &&
        Objects.equals(this.userUsageNot, gpuDeviceWhereInput.userUsageNot) &&
        Objects.equals(this.userUsageNotIn, gpuDeviceWhereInput.userUsageNotIn) &&
        Objects.equals(this.userVgpuTypeId, gpuDeviceWhereInput.userVgpuTypeId) &&
        Objects.equals(this.userVgpuTypeIdContains, gpuDeviceWhereInput.userVgpuTypeIdContains) &&
        Objects.equals(this.userVgpuTypeIdEndsWith, gpuDeviceWhereInput.userVgpuTypeIdEndsWith) &&
        Objects.equals(this.userVgpuTypeIdGt, gpuDeviceWhereInput.userVgpuTypeIdGt) &&
        Objects.equals(this.userVgpuTypeIdGte, gpuDeviceWhereInput.userVgpuTypeIdGte) &&
        Objects.equals(this.userVgpuTypeIdIn, gpuDeviceWhereInput.userVgpuTypeIdIn) &&
        Objects.equals(this.userVgpuTypeIdLt, gpuDeviceWhereInput.userVgpuTypeIdLt) &&
        Objects.equals(this.userVgpuTypeIdLte, gpuDeviceWhereInput.userVgpuTypeIdLte) &&
        Objects.equals(this.userVgpuTypeIdNot, gpuDeviceWhereInput.userVgpuTypeIdNot) &&
        Objects.equals(this.userVgpuTypeIdNotContains, gpuDeviceWhereInput.userVgpuTypeIdNotContains) &&
        Objects.equals(this.userVgpuTypeIdNotEndsWith, gpuDeviceWhereInput.userVgpuTypeIdNotEndsWith) &&
        Objects.equals(this.userVgpuTypeIdNotIn, gpuDeviceWhereInput.userVgpuTypeIdNotIn) &&
        Objects.equals(this.userVgpuTypeIdNotStartsWith, gpuDeviceWhereInput.userVgpuTypeIdNotStartsWith) &&
        Objects.equals(this.userVgpuTypeIdStartsWith, gpuDeviceWhereInput.userVgpuTypeIdStartsWith) &&
        Objects.equals(this.userVgpuTypeName, gpuDeviceWhereInput.userVgpuTypeName) &&
        Objects.equals(this.userVgpuTypeNameContains, gpuDeviceWhereInput.userVgpuTypeNameContains) &&
        Objects.equals(this.userVgpuTypeNameEndsWith, gpuDeviceWhereInput.userVgpuTypeNameEndsWith) &&
        Objects.equals(this.userVgpuTypeNameGt, gpuDeviceWhereInput.userVgpuTypeNameGt) &&
        Objects.equals(this.userVgpuTypeNameGte, gpuDeviceWhereInput.userVgpuTypeNameGte) &&
        Objects.equals(this.userVgpuTypeNameIn, gpuDeviceWhereInput.userVgpuTypeNameIn) &&
        Objects.equals(this.userVgpuTypeNameLt, gpuDeviceWhereInput.userVgpuTypeNameLt) &&
        Objects.equals(this.userVgpuTypeNameLte, gpuDeviceWhereInput.userVgpuTypeNameLte) &&
        Objects.equals(this.userVgpuTypeNameNot, gpuDeviceWhereInput.userVgpuTypeNameNot) &&
        Objects.equals(this.userVgpuTypeNameNotContains, gpuDeviceWhereInput.userVgpuTypeNameNotContains) &&
        Objects.equals(this.userVgpuTypeNameNotEndsWith, gpuDeviceWhereInput.userVgpuTypeNameNotEndsWith) &&
        Objects.equals(this.userVgpuTypeNameNotIn, gpuDeviceWhereInput.userVgpuTypeNameNotIn) &&
        Objects.equals(this.userVgpuTypeNameNotStartsWith, gpuDeviceWhereInput.userVgpuTypeNameNotStartsWith) &&
        Objects.equals(this.userVgpuTypeNameStartsWith, gpuDeviceWhereInput.userVgpuTypeNameStartsWith) &&
        Objects.equals(this.vgpuInstanceNum, gpuDeviceWhereInput.vgpuInstanceNum) &&
        Objects.equals(this.vgpuInstanceNumGt, gpuDeviceWhereInput.vgpuInstanceNumGt) &&
        Objects.equals(this.vgpuInstanceNumGte, gpuDeviceWhereInput.vgpuInstanceNumGte) &&
        Objects.equals(this.vgpuInstanceNumIn, gpuDeviceWhereInput.vgpuInstanceNumIn) &&
        Objects.equals(this.vgpuInstanceNumLt, gpuDeviceWhereInput.vgpuInstanceNumLt) &&
        Objects.equals(this.vgpuInstanceNumLte, gpuDeviceWhereInput.vgpuInstanceNumLte) &&
        Objects.equals(this.vgpuInstanceNumNot, gpuDeviceWhereInput.vgpuInstanceNumNot) &&
        Objects.equals(this.vgpuInstanceNumNotIn, gpuDeviceWhereInput.vgpuInstanceNumNotIn) &&
        Objects.equals(this.vmsEvery, gpuDeviceWhereInput.vmsEvery) &&
        Objects.equals(this.vmsNone, gpuDeviceWhereInput.vmsNone) &&
        Objects.equals(this.vmsSome, gpuDeviceWhereInput.vmsSome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, assignedVgpusNum, assignedVgpusNumGt, assignedVgpusNumGte, assignedVgpusNumIn, assignedVgpusNumLt, assignedVgpusNumLte, assignedVgpusNumNot, assignedVgpusNumNotIn, availableVgpusNum, availableVgpusNumGt, availableVgpusNumGte, availableVgpusNumIn, availableVgpusNumLt, availableVgpusNumLte, availableVgpusNumNot, availableVgpusNumNotIn, brand, brandContains, brandEndsWith, brandGt, brandGte, brandIn, brandLt, brandLte, brandNot, brandNotContains, brandNotEndsWith, brandNotIn, brandNotStartsWith, brandStartsWith, busLocation, busLocationContains, busLocationEndsWith, busLocationGt, busLocationGte, busLocationIn, busLocationLt, busLocationLte, busLocationNot, busLocationNotContains, busLocationNotEndsWith, busLocationNotIn, busLocationNotStartsWith, busLocationStartsWith, description, descriptionContains, descriptionEndsWith, descriptionGt, descriptionGte, descriptionIn, descriptionLt, descriptionLte, descriptionNot, descriptionNotContains, descriptionNotEndsWith, descriptionNotIn, descriptionNotStartsWith, descriptionStartsWith, entityAsyncStatus, entityAsyncStatusIn, entityAsyncStatusNot, entityAsyncStatusNotIn, host, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, isNvidiaToolsReady, isNvidiaToolsReadyNot, isNvidiaVfsEnabled, isNvidiaVfsEnabledNot, isNvidiaVfsSupported, isNvidiaVfsSupportedNot, labelsEvery, labelsNone, labelsSome, localCreatedAt, localCreatedAtGt, localCreatedAtGte, localCreatedAtIn, localCreatedAtLt, localCreatedAtLte, localCreatedAtNot, localCreatedAtNotIn, localId, localIdContains, localIdEndsWith, localIdGt, localIdGte, localIdIn, localIdLt, localIdLte, localIdNot, localIdNotContains, localIdNotEndsWith, localIdNotIn, localIdNotStartsWith, localIdStartsWith, model, modelContains, modelEndsWith, modelGt, modelGte, modelIn, modelLt, modelLte, modelNot, modelNotContains, modelNotEndsWith, modelNotIn, modelNotStartsWith, modelStartsWith, name, nameContains, nameEndsWith, nameGt, nameGte, nameIn, nameLt, nameLte, nameNot, nameNotContains, nameNotEndsWith, nameNotIn, nameNotStartsWith, nameStartsWith, NOT, OR, status, statusIn, statusNot, statusNotIn, userUsage, userUsageIn, userUsageNot, userUsageNotIn, userVgpuTypeId, userVgpuTypeIdContains, userVgpuTypeIdEndsWith, userVgpuTypeIdGt, userVgpuTypeIdGte, userVgpuTypeIdIn, userVgpuTypeIdLt, userVgpuTypeIdLte, userVgpuTypeIdNot, userVgpuTypeIdNotContains, userVgpuTypeIdNotEndsWith, userVgpuTypeIdNotIn, userVgpuTypeIdNotStartsWith, userVgpuTypeIdStartsWith, userVgpuTypeName, userVgpuTypeNameContains, userVgpuTypeNameEndsWith, userVgpuTypeNameGt, userVgpuTypeNameGte, userVgpuTypeNameIn, userVgpuTypeNameLt, userVgpuTypeNameLte, userVgpuTypeNameNot, userVgpuTypeNameNotContains, userVgpuTypeNameNotEndsWith, userVgpuTypeNameNotIn, userVgpuTypeNameNotStartsWith, userVgpuTypeNameStartsWith, vgpuInstanceNum, vgpuInstanceNumGt, vgpuInstanceNumGte, vgpuInstanceNumIn, vgpuInstanceNumLt, vgpuInstanceNumLte, vgpuInstanceNumNot, vgpuInstanceNumNotIn, vmsEvery, vmsNone, vmsSome);
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
    sb.append("class GpuDeviceWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    assignedVgpusNum: ").append(toIndentedString(assignedVgpusNum)).append("\n");
    sb.append("    assignedVgpusNumGt: ").append(toIndentedString(assignedVgpusNumGt)).append("\n");
    sb.append("    assignedVgpusNumGte: ").append(toIndentedString(assignedVgpusNumGte)).append("\n");
    sb.append("    assignedVgpusNumIn: ").append(toIndentedString(assignedVgpusNumIn)).append("\n");
    sb.append("    assignedVgpusNumLt: ").append(toIndentedString(assignedVgpusNumLt)).append("\n");
    sb.append("    assignedVgpusNumLte: ").append(toIndentedString(assignedVgpusNumLte)).append("\n");
    sb.append("    assignedVgpusNumNot: ").append(toIndentedString(assignedVgpusNumNot)).append("\n");
    sb.append("    assignedVgpusNumNotIn: ").append(toIndentedString(assignedVgpusNumNotIn)).append("\n");
    sb.append("    availableVgpusNum: ").append(toIndentedString(availableVgpusNum)).append("\n");
    sb.append("    availableVgpusNumGt: ").append(toIndentedString(availableVgpusNumGt)).append("\n");
    sb.append("    availableVgpusNumGte: ").append(toIndentedString(availableVgpusNumGte)).append("\n");
    sb.append("    availableVgpusNumIn: ").append(toIndentedString(availableVgpusNumIn)).append("\n");
    sb.append("    availableVgpusNumLt: ").append(toIndentedString(availableVgpusNumLt)).append("\n");
    sb.append("    availableVgpusNumLte: ").append(toIndentedString(availableVgpusNumLte)).append("\n");
    sb.append("    availableVgpusNumNot: ").append(toIndentedString(availableVgpusNumNot)).append("\n");
    sb.append("    availableVgpusNumNotIn: ").append(toIndentedString(availableVgpusNumNotIn)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandContains: ").append(toIndentedString(brandContains)).append("\n");
    sb.append("    brandEndsWith: ").append(toIndentedString(brandEndsWith)).append("\n");
    sb.append("    brandGt: ").append(toIndentedString(brandGt)).append("\n");
    sb.append("    brandGte: ").append(toIndentedString(brandGte)).append("\n");
    sb.append("    brandIn: ").append(toIndentedString(brandIn)).append("\n");
    sb.append("    brandLt: ").append(toIndentedString(brandLt)).append("\n");
    sb.append("    brandLte: ").append(toIndentedString(brandLte)).append("\n");
    sb.append("    brandNot: ").append(toIndentedString(brandNot)).append("\n");
    sb.append("    brandNotContains: ").append(toIndentedString(brandNotContains)).append("\n");
    sb.append("    brandNotEndsWith: ").append(toIndentedString(brandNotEndsWith)).append("\n");
    sb.append("    brandNotIn: ").append(toIndentedString(brandNotIn)).append("\n");
    sb.append("    brandNotStartsWith: ").append(toIndentedString(brandNotStartsWith)).append("\n");
    sb.append("    brandStartsWith: ").append(toIndentedString(brandStartsWith)).append("\n");
    sb.append("    busLocation: ").append(toIndentedString(busLocation)).append("\n");
    sb.append("    busLocationContains: ").append(toIndentedString(busLocationContains)).append("\n");
    sb.append("    busLocationEndsWith: ").append(toIndentedString(busLocationEndsWith)).append("\n");
    sb.append("    busLocationGt: ").append(toIndentedString(busLocationGt)).append("\n");
    sb.append("    busLocationGte: ").append(toIndentedString(busLocationGte)).append("\n");
    sb.append("    busLocationIn: ").append(toIndentedString(busLocationIn)).append("\n");
    sb.append("    busLocationLt: ").append(toIndentedString(busLocationLt)).append("\n");
    sb.append("    busLocationLte: ").append(toIndentedString(busLocationLte)).append("\n");
    sb.append("    busLocationNot: ").append(toIndentedString(busLocationNot)).append("\n");
    sb.append("    busLocationNotContains: ").append(toIndentedString(busLocationNotContains)).append("\n");
    sb.append("    busLocationNotEndsWith: ").append(toIndentedString(busLocationNotEndsWith)).append("\n");
    sb.append("    busLocationNotIn: ").append(toIndentedString(busLocationNotIn)).append("\n");
    sb.append("    busLocationNotStartsWith: ").append(toIndentedString(busLocationNotStartsWith)).append("\n");
    sb.append("    busLocationStartsWith: ").append(toIndentedString(busLocationStartsWith)).append("\n");
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
    sb.append("    isNvidiaToolsReady: ").append(toIndentedString(isNvidiaToolsReady)).append("\n");
    sb.append("    isNvidiaToolsReadyNot: ").append(toIndentedString(isNvidiaToolsReadyNot)).append("\n");
    sb.append("    isNvidiaVfsEnabled: ").append(toIndentedString(isNvidiaVfsEnabled)).append("\n");
    sb.append("    isNvidiaVfsEnabledNot: ").append(toIndentedString(isNvidiaVfsEnabledNot)).append("\n");
    sb.append("    isNvidiaVfsSupported: ").append(toIndentedString(isNvidiaVfsSupported)).append("\n");
    sb.append("    isNvidiaVfsSupportedNot: ").append(toIndentedString(isNvidiaVfsSupportedNot)).append("\n");
    sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
    sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
    sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
    sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
    sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
    sb.append("    localCreatedAtGte: ").append(toIndentedString(localCreatedAtGte)).append("\n");
    sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
    sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
    sb.append("    localCreatedAtLte: ").append(toIndentedString(localCreatedAtLte)).append("\n");
    sb.append("    localCreatedAtNot: ").append(toIndentedString(localCreatedAtNot)).append("\n");
    sb.append("    localCreatedAtNotIn: ").append(toIndentedString(localCreatedAtNotIn)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
    sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
    sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
    sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
    sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
    sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
    sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
    sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
    sb.append("    localIdNotContains: ").append(toIndentedString(localIdNotContains)).append("\n");
    sb.append("    localIdNotEndsWith: ").append(toIndentedString(localIdNotEndsWith)).append("\n");
    sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
    sb.append("    localIdNotStartsWith: ").append(toIndentedString(localIdNotStartsWith)).append("\n");
    sb.append("    localIdStartsWith: ").append(toIndentedString(localIdStartsWith)).append("\n");
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
    sb.append("    modelNotStartsWith: ").append(toIndentedString(modelNotStartsWith)).append("\n");
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
    sb.append("    nameNotStartsWith: ").append(toIndentedString(nameNotStartsWith)).append("\n");
    sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
    sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
    sb.append("    userUsage: ").append(toIndentedString(userUsage)).append("\n");
    sb.append("    userUsageIn: ").append(toIndentedString(userUsageIn)).append("\n");
    sb.append("    userUsageNot: ").append(toIndentedString(userUsageNot)).append("\n");
    sb.append("    userUsageNotIn: ").append(toIndentedString(userUsageNotIn)).append("\n");
    sb.append("    userVgpuTypeId: ").append(toIndentedString(userVgpuTypeId)).append("\n");
    sb.append("    userVgpuTypeIdContains: ").append(toIndentedString(userVgpuTypeIdContains)).append("\n");
    sb.append("    userVgpuTypeIdEndsWith: ").append(toIndentedString(userVgpuTypeIdEndsWith)).append("\n");
    sb.append("    userVgpuTypeIdGt: ").append(toIndentedString(userVgpuTypeIdGt)).append("\n");
    sb.append("    userVgpuTypeIdGte: ").append(toIndentedString(userVgpuTypeIdGte)).append("\n");
    sb.append("    userVgpuTypeIdIn: ").append(toIndentedString(userVgpuTypeIdIn)).append("\n");
    sb.append("    userVgpuTypeIdLt: ").append(toIndentedString(userVgpuTypeIdLt)).append("\n");
    sb.append("    userVgpuTypeIdLte: ").append(toIndentedString(userVgpuTypeIdLte)).append("\n");
    sb.append("    userVgpuTypeIdNot: ").append(toIndentedString(userVgpuTypeIdNot)).append("\n");
    sb.append("    userVgpuTypeIdNotContains: ").append(toIndentedString(userVgpuTypeIdNotContains)).append("\n");
    sb.append("    userVgpuTypeIdNotEndsWith: ").append(toIndentedString(userVgpuTypeIdNotEndsWith)).append("\n");
    sb.append("    userVgpuTypeIdNotIn: ").append(toIndentedString(userVgpuTypeIdNotIn)).append("\n");
    sb.append("    userVgpuTypeIdNotStartsWith: ").append(toIndentedString(userVgpuTypeIdNotStartsWith)).append("\n");
    sb.append("    userVgpuTypeIdStartsWith: ").append(toIndentedString(userVgpuTypeIdStartsWith)).append("\n");
    sb.append("    userVgpuTypeName: ").append(toIndentedString(userVgpuTypeName)).append("\n");
    sb.append("    userVgpuTypeNameContains: ").append(toIndentedString(userVgpuTypeNameContains)).append("\n");
    sb.append("    userVgpuTypeNameEndsWith: ").append(toIndentedString(userVgpuTypeNameEndsWith)).append("\n");
    sb.append("    userVgpuTypeNameGt: ").append(toIndentedString(userVgpuTypeNameGt)).append("\n");
    sb.append("    userVgpuTypeNameGte: ").append(toIndentedString(userVgpuTypeNameGte)).append("\n");
    sb.append("    userVgpuTypeNameIn: ").append(toIndentedString(userVgpuTypeNameIn)).append("\n");
    sb.append("    userVgpuTypeNameLt: ").append(toIndentedString(userVgpuTypeNameLt)).append("\n");
    sb.append("    userVgpuTypeNameLte: ").append(toIndentedString(userVgpuTypeNameLte)).append("\n");
    sb.append("    userVgpuTypeNameNot: ").append(toIndentedString(userVgpuTypeNameNot)).append("\n");
    sb.append("    userVgpuTypeNameNotContains: ").append(toIndentedString(userVgpuTypeNameNotContains)).append("\n");
    sb.append("    userVgpuTypeNameNotEndsWith: ").append(toIndentedString(userVgpuTypeNameNotEndsWith)).append("\n");
    sb.append("    userVgpuTypeNameNotIn: ").append(toIndentedString(userVgpuTypeNameNotIn)).append("\n");
    sb.append("    userVgpuTypeNameNotStartsWith: ").append(toIndentedString(userVgpuTypeNameNotStartsWith)).append("\n");
    sb.append("    userVgpuTypeNameStartsWith: ").append(toIndentedString(userVgpuTypeNameStartsWith)).append("\n");
    sb.append("    vgpuInstanceNum: ").append(toIndentedString(vgpuInstanceNum)).append("\n");
    sb.append("    vgpuInstanceNumGt: ").append(toIndentedString(vgpuInstanceNumGt)).append("\n");
    sb.append("    vgpuInstanceNumGte: ").append(toIndentedString(vgpuInstanceNumGte)).append("\n");
    sb.append("    vgpuInstanceNumIn: ").append(toIndentedString(vgpuInstanceNumIn)).append("\n");
    sb.append("    vgpuInstanceNumLt: ").append(toIndentedString(vgpuInstanceNumLt)).append("\n");
    sb.append("    vgpuInstanceNumLte: ").append(toIndentedString(vgpuInstanceNumLte)).append("\n");
    sb.append("    vgpuInstanceNumNot: ").append(toIndentedString(vgpuInstanceNumNot)).append("\n");
    sb.append("    vgpuInstanceNumNotIn: ").append(toIndentedString(vgpuInstanceNumNotIn)).append("\n");
    sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
    sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
    sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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

