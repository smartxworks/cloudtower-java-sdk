package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DatastoreMountWhereInput */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class DatastoreMountWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<DatastoreMountWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<DatastoreMountWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<DatastoreMountWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME)
    private String createdTime;

    public static final String SERIALIZED_NAME_CREATED_TIME_GT = "created_time_gt";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_GT)
    private String createdTimeGt;

    public static final String SERIALIZED_NAME_CREATED_TIME_GTE = "created_time_gte";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_GTE)
    private String createdTimeGte;

    public static final String SERIALIZED_NAME_CREATED_TIME_IN = "created_time_in";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_IN)
    private List<String> createdTimeIn = null;

    public static final String SERIALIZED_NAME_CREATED_TIME_LT = "created_time_lt";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_LT)
    private String createdTimeLt;

    public static final String SERIALIZED_NAME_CREATED_TIME_LTE = "created_time_lte";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_LTE)
    private String createdTimeLte;

    public static final String SERIALIZED_NAME_CREATED_TIME_NOT = "created_time_not";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_NOT)
    private String createdTimeNot;

    public static final String SERIALIZED_NAME_CREATED_TIME_NOT_IN = "created_time_not_in";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_NOT_IN)
    private List<String> createdTimeNotIn = null;

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

    public static final String SERIALIZED_NAME_DATASTORE = "datastore";

    @SerializedName(SERIALIZED_NAME_DATASTORE)
    private DatastoreWhereInput datastore;

    public static final String SERIALIZED_NAME_DEVICE_STATE = "device_state";

    @SerializedName(SERIALIZED_NAME_DEVICE_STATE)
    private DatastoreMountDeviceState deviceState;

    public static final String SERIALIZED_NAME_DEVICE_STATE_IN = "device_state_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_STATE_IN)
    private List<DatastoreMountDeviceState> deviceStateIn = null;

    public static final String SERIALIZED_NAME_DEVICE_STATE_NOT = "device_state_not";

    @SerializedName(SERIALIZED_NAME_DEVICE_STATE_NOT)
    private DatastoreMountDeviceState deviceStateNot;

    public static final String SERIALIZED_NAME_DEVICE_STATE_NOT_IN = "device_state_not_in";

    @SerializedName(SERIALIZED_NAME_DEVICE_STATE_NOT_IN)
    private List<DatastoreMountDeviceState> deviceStateNotIn = null;

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

    public static final String SERIALIZED_NAME_IS_FORMAT = "is_format";

    @SerializedName(SERIALIZED_NAME_IS_FORMAT)
    private Boolean isFormat;

    public static final String SERIALIZED_NAME_IS_FORMAT_NOT = "is_format_not";

    @SerializedName(SERIALIZED_NAME_IS_FORMAT_NOT)
    private Boolean isFormatNot;

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

    public static final String SERIALIZED_NAME_MODIFIED_TIME = "modified_time";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME)
    private String modifiedTime;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_GT = "modified_time_gt";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_GT)
    private String modifiedTimeGt;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_GTE = "modified_time_gte";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_GTE)
    private String modifiedTimeGte;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_IN = "modified_time_in";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_IN)
    private List<String> modifiedTimeIn = null;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_LT = "modified_time_lt";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_LT)
    private String modifiedTimeLt;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_LTE = "modified_time_lte";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_LTE)
    private String modifiedTimeLte;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_NOT = "modified_time_not";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_NOT)
    private String modifiedTimeNot;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_NOT_IN = "modified_time_not_in";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN)
    private List<String> modifiedTimeNotIn = null;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private DatastoreMountState state;

    public static final String SERIALIZED_NAME_STATE_IN = "state_in";

    @SerializedName(SERIALIZED_NAME_STATE_IN)
    private List<DatastoreMountState> stateIn = null;

    public static final String SERIALIZED_NAME_STATE_NOT = "state_not";

    @SerializedName(SERIALIZED_NAME_STATE_NOT)
    private DatastoreMountState stateNot;

    public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";

    @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
    private List<DatastoreMountState> stateNotIn = null;

    public DatastoreMountWhereInput() {}

    public DatastoreMountWhereInput AND(List<DatastoreMountWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public DatastoreMountWhereInput addANDItem(DatastoreMountWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<DatastoreMountWhereInput>();
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
    public List<DatastoreMountWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<DatastoreMountWhereInput> AND) {
        this.AND = AND;
    }

    public DatastoreMountWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public DatastoreMountWhereInput AND_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput NOT(List<DatastoreMountWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public DatastoreMountWhereInput addNOTItem(DatastoreMountWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<DatastoreMountWhereInput>();
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
    public List<DatastoreMountWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<DatastoreMountWhereInput> NOT) {
        this.NOT = NOT;
    }

    public DatastoreMountWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public DatastoreMountWhereInput NOT_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput OR(List<DatastoreMountWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public DatastoreMountWhereInput addORItem(DatastoreMountWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<DatastoreMountWhereInput>();
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
    public List<DatastoreMountWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<DatastoreMountWhereInput> OR) {
        this.OR = OR;
    }

    public DatastoreMountWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public DatastoreMountWhereInput OR_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput createdTime(String createdTime) {

        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get createdTime
     *
     * @return createdTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public DatastoreMountWhereInput createdTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public DatastoreMountWhereInput createdTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public void setCreatedTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        }
    }

    public boolean getCreatedTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME);
    }

    public DatastoreMountWhereInput createdTimeGt(String createdTimeGt) {

        this.createdTimeGt = createdTimeGt;
        return this;
    }

    /**
     * Get createdTimeGt
     *
     * @return createdTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeGt() {
        return createdTimeGt;
    }

    public void setCreatedTimeGt(String createdTimeGt) {
        this.createdTimeGt = createdTimeGt;
    }

    public DatastoreMountWhereInput createdTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GT);
        return this;
    }

    public DatastoreMountWhereInput createdTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GT);
        return this;
    }

    public void setCreatedTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GT);
        }
    }

    public boolean getCreatedTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_GT);
    }

    public DatastoreMountWhereInput createdTimeGte(String createdTimeGte) {

        this.createdTimeGte = createdTimeGte;
        return this;
    }

    /**
     * Get createdTimeGte
     *
     * @return createdTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeGte() {
        return createdTimeGte;
    }

    public void setCreatedTimeGte(String createdTimeGte) {
        this.createdTimeGte = createdTimeGte;
    }

    public DatastoreMountWhereInput createdTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GTE);
        return this;
    }

    public DatastoreMountWhereInput createdTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GTE);
        return this;
    }

    public void setCreatedTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GTE);
        }
    }

    public boolean getCreatedTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_GTE);
    }

    public DatastoreMountWhereInput createdTimeIn(List<String> createdTimeIn) {

        this.createdTimeIn = createdTimeIn;
        return this;
    }

    public DatastoreMountWhereInput addCreatedTimeInItem(String createdTimeInItem) {
        if (this.createdTimeIn == null) {
            this.createdTimeIn = new ArrayList<String>();
        }
        this.createdTimeIn.add(createdTimeInItem);
        return this;
    }

    /**
     * Get createdTimeIn
     *
     * @return createdTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedTimeIn() {
        return createdTimeIn;
    }

    public void setCreatedTimeIn(List<String> createdTimeIn) {
        this.createdTimeIn = createdTimeIn;
    }

    public DatastoreMountWhereInput createdTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_IN);
        return this;
    }

    public DatastoreMountWhereInput createdTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_IN);
        return this;
    }

    public void setCreatedTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_IN);
        }
    }

    public boolean getCreatedTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_IN);
    }

    public DatastoreMountWhereInput createdTimeLt(String createdTimeLt) {

        this.createdTimeLt = createdTimeLt;
        return this;
    }

    /**
     * Get createdTimeLt
     *
     * @return createdTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeLt() {
        return createdTimeLt;
    }

    public void setCreatedTimeLt(String createdTimeLt) {
        this.createdTimeLt = createdTimeLt;
    }

    public DatastoreMountWhereInput createdTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LT);
        return this;
    }

    public DatastoreMountWhereInput createdTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LT);
        return this;
    }

    public void setCreatedTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LT);
        }
    }

    public boolean getCreatedTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_LT);
    }

    public DatastoreMountWhereInput createdTimeLte(String createdTimeLte) {

        this.createdTimeLte = createdTimeLte;
        return this;
    }

    /**
     * Get createdTimeLte
     *
     * @return createdTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeLte() {
        return createdTimeLte;
    }

    public void setCreatedTimeLte(String createdTimeLte) {
        this.createdTimeLte = createdTimeLte;
    }

    public DatastoreMountWhereInput createdTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LTE);
        return this;
    }

    public DatastoreMountWhereInput createdTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LTE);
        return this;
    }

    public void setCreatedTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LTE);
        }
    }

    public boolean getCreatedTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_LTE);
    }

    public DatastoreMountWhereInput createdTimeNot(String createdTimeNot) {

        this.createdTimeNot = createdTimeNot;
        return this;
    }

    /**
     * Get createdTimeNot
     *
     * @return createdTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeNot() {
        return createdTimeNot;
    }

    public void setCreatedTimeNot(String createdTimeNot) {
        this.createdTimeNot = createdTimeNot;
    }

    public DatastoreMountWhereInput createdTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT);
        return this;
    }

    public DatastoreMountWhereInput createdTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT);
        return this;
    }

    public void setCreatedTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT);
        }
    }

    public boolean getCreatedTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_NOT);
    }

    public DatastoreMountWhereInput createdTimeNotIn(List<String> createdTimeNotIn) {

        this.createdTimeNotIn = createdTimeNotIn;
        return this;
    }

    public DatastoreMountWhereInput addCreatedTimeNotInItem(String createdTimeNotInItem) {
        if (this.createdTimeNotIn == null) {
            this.createdTimeNotIn = new ArrayList<String>();
        }
        this.createdTimeNotIn.add(createdTimeNotInItem);
        return this;
    }

    /**
     * Get createdTimeNotIn
     *
     * @return createdTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedTimeNotIn() {
        return createdTimeNotIn;
    }

    public void setCreatedTimeNotIn(List<String> createdTimeNotIn) {
        this.createdTimeNotIn = createdTimeNotIn;
    }

    public DatastoreMountWhereInput createdTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput createdTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        return this;
    }

    public void setCreatedTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        }
    }

    public boolean getCreatedTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
    }

    public DatastoreMountWhereInput dataVersion(Integer dataVersion) {

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

    public DatastoreMountWhereInput dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public DatastoreMountWhereInput dataVersion_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput dataVersionGt(Integer dataVersionGt) {

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

    public DatastoreMountWhereInput dataVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public DatastoreMountWhereInput dataVersionGt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput dataVersionGte(Integer dataVersionGte) {

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

    public DatastoreMountWhereInput dataVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public DatastoreMountWhereInput dataVersionGte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput dataVersionIn(List<Integer> dataVersionIn) {

        this.dataVersionIn = dataVersionIn;
        return this;
    }

    public DatastoreMountWhereInput addDataVersionInItem(Integer dataVersionInItem) {
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

    public DatastoreMountWhereInput dataVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public DatastoreMountWhereInput dataVersionIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput dataVersionLt(Integer dataVersionLt) {

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

    public DatastoreMountWhereInput dataVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public DatastoreMountWhereInput dataVersionLt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput dataVersionLte(Integer dataVersionLte) {

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

    public DatastoreMountWhereInput dataVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public DatastoreMountWhereInput dataVersionLte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput dataVersionNot(Integer dataVersionNot) {

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

    public DatastoreMountWhereInput dataVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public DatastoreMountWhereInput dataVersionNot_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput dataVersionNotIn(List<Integer> dataVersionNotIn) {

        this.dataVersionNotIn = dataVersionNotIn;
        return this;
    }

    public DatastoreMountWhereInput addDataVersionNotInItem(Integer dataVersionNotInItem) {
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

    public DatastoreMountWhereInput dataVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput dataVersionNotIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput datastore(DatastoreWhereInput datastore) {

        this.datastore = datastore;
        return this;
    }

    /**
     * Get datastore
     *
     * @return datastore
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreWhereInput getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreWhereInput datastore) {
        this.datastore = datastore;
    }

    public DatastoreMountWhereInput datastore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public DatastoreMountWhereInput datastore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        return this;
    }

    public void setDatastore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE);
        }
    }

    public boolean getDatastore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE);
    }

    public DatastoreMountWhereInput deviceState(DatastoreMountDeviceState deviceState) {

        this.deviceState = deviceState;
        return this;
    }

    /**
     * Get deviceState
     *
     * @return deviceState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreMountDeviceState getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(DatastoreMountDeviceState deviceState) {
        this.deviceState = deviceState;
    }

    public DatastoreMountWhereInput deviceState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE);
        return this;
    }

    public DatastoreMountWhereInput deviceState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE);
        return this;
    }

    public void setDeviceState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE);
        }
    }

    public boolean getDeviceState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_STATE);
    }

    public DatastoreMountWhereInput deviceStateIn(List<DatastoreMountDeviceState> deviceStateIn) {

        this.deviceStateIn = deviceStateIn;
        return this;
    }

    public DatastoreMountWhereInput addDeviceStateInItem(
            DatastoreMountDeviceState deviceStateInItem) {
        if (this.deviceStateIn == null) {
            this.deviceStateIn = new ArrayList<DatastoreMountDeviceState>();
        }
        this.deviceStateIn.add(deviceStateInItem);
        return this;
    }

    /**
     * Get deviceStateIn
     *
     * @return deviceStateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DatastoreMountDeviceState> getDeviceStateIn() {
        return deviceStateIn;
    }

    public void setDeviceStateIn(List<DatastoreMountDeviceState> deviceStateIn) {
        this.deviceStateIn = deviceStateIn;
    }

    public DatastoreMountWhereInput deviceStateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE_IN);
        return this;
    }

    public DatastoreMountWhereInput deviceStateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE_IN);
        return this;
    }

    public void setDeviceStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE_IN);
        }
    }

    public boolean getDeviceStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_STATE_IN);
    }

    public DatastoreMountWhereInput deviceStateNot(DatastoreMountDeviceState deviceStateNot) {

        this.deviceStateNot = deviceStateNot;
        return this;
    }

    /**
     * Get deviceStateNot
     *
     * @return deviceStateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreMountDeviceState getDeviceStateNot() {
        return deviceStateNot;
    }

    public void setDeviceStateNot(DatastoreMountDeviceState deviceStateNot) {
        this.deviceStateNot = deviceStateNot;
    }

    public DatastoreMountWhereInput deviceStateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE_NOT);
        return this;
    }

    public DatastoreMountWhereInput deviceStateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE_NOT);
        return this;
    }

    public void setDeviceStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE_NOT);
        }
    }

    public boolean getDeviceStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_STATE_NOT);
    }

    public DatastoreMountWhereInput deviceStateNotIn(
            List<DatastoreMountDeviceState> deviceStateNotIn) {

        this.deviceStateNotIn = deviceStateNotIn;
        return this;
    }

    public DatastoreMountWhereInput addDeviceStateNotInItem(
            DatastoreMountDeviceState deviceStateNotInItem) {
        if (this.deviceStateNotIn == null) {
            this.deviceStateNotIn = new ArrayList<DatastoreMountDeviceState>();
        }
        this.deviceStateNotIn.add(deviceStateNotInItem);
        return this;
    }

    /**
     * Get deviceStateNotIn
     *
     * @return deviceStateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DatastoreMountDeviceState> getDeviceStateNotIn() {
        return deviceStateNotIn;
    }

    public void setDeviceStateNotIn(List<DatastoreMountDeviceState> deviceStateNotIn) {
        this.deviceStateNotIn = deviceStateNotIn;
    }

    public DatastoreMountWhereInput deviceStateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput deviceStateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE_NOT_IN);
        return this;
    }

    public void setDeviceStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEVICE_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEVICE_STATE_NOT_IN);
        }
    }

    public boolean getDeviceStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEVICE_STATE_NOT_IN);
    }

    public DatastoreMountWhereInput host(HostWhereInput host) {

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

    public DatastoreMountWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public DatastoreMountWhereInput host_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput id(String id) {

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

    public DatastoreMountWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public DatastoreMountWhereInput id_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idContains(String idContains) {

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

    public DatastoreMountWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public DatastoreMountWhereInput idContains_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idEndsWith(String idEndsWith) {

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

    public DatastoreMountWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public DatastoreMountWhereInput idEndsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idGt(String idGt) {

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

    public DatastoreMountWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public DatastoreMountWhereInput idGt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idGte(String idGte) {

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

    public DatastoreMountWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public DatastoreMountWhereInput idGte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public DatastoreMountWhereInput addIdInItem(String idInItem) {
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

    public DatastoreMountWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public DatastoreMountWhereInput idIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idLt(String idLt) {

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

    public DatastoreMountWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public DatastoreMountWhereInput idLt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idLte(String idLte) {

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

    public DatastoreMountWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public DatastoreMountWhereInput idLte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idNot(String idNot) {

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

    public DatastoreMountWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public DatastoreMountWhereInput idNot_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idNotContains(String idNotContains) {

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

    public DatastoreMountWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public DatastoreMountWhereInput idNotContains_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public DatastoreMountWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreMountWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public DatastoreMountWhereInput addIdNotInItem(String idNotInItem) {
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

    public DatastoreMountWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput idNotIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public DatastoreMountWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreMountWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput idStartsWith(String idStartsWith) {

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

    public DatastoreMountWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public DatastoreMountWhereInput idStartsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput isFormat(Boolean isFormat) {

        this.isFormat = isFormat;
        return this;
    }

    /**
     * Get isFormat
     *
     * @return isFormat
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsFormat() {
        return isFormat;
    }

    public void setIsFormat(Boolean isFormat) {
        this.isFormat = isFormat;
    }

    public DatastoreMountWhereInput isFormat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_FORMAT);
        return this;
    }

    public DatastoreMountWhereInput isFormat_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_FORMAT);
        return this;
    }

    public void setIsFormat_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_FORMAT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_FORMAT);
        }
    }

    public boolean getIsFormat_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_FORMAT);
    }

    public DatastoreMountWhereInput isFormatNot(Boolean isFormatNot) {

        this.isFormatNot = isFormatNot;
        return this;
    }

    /**
     * Get isFormatNot
     *
     * @return isFormatNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsFormatNot() {
        return isFormatNot;
    }

    public void setIsFormatNot(Boolean isFormatNot) {
        this.isFormatNot = isFormatNot;
    }

    public DatastoreMountWhereInput isFormatNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_FORMAT_NOT);
        return this;
    }

    public DatastoreMountWhereInput isFormatNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_FORMAT_NOT);
        return this;
    }

    public void setIsFormatNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_FORMAT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_FORMAT_NOT);
        }
    }

    public boolean getIsFormatNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_FORMAT_NOT);
    }

    public DatastoreMountWhereInput localHash(String localHash) {

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

    public DatastoreMountWhereInput localHash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public DatastoreMountWhereInput localHash_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashContains(String localHashContains) {

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

    public DatastoreMountWhereInput localHashContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public DatastoreMountWhereInput localHashContains_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashEndsWith(String localHashEndsWith) {

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

    public DatastoreMountWhereInput localHashEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localHashEndsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashGt(String localHashGt) {

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

    public DatastoreMountWhereInput localHashGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public DatastoreMountWhereInput localHashGt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashGte(String localHashGte) {

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

    public DatastoreMountWhereInput localHashGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public DatastoreMountWhereInput localHashGte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashIn(List<String> localHashIn) {

        this.localHashIn = localHashIn;
        return this;
    }

    public DatastoreMountWhereInput addLocalHashInItem(String localHashInItem) {
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

    public DatastoreMountWhereInput localHashIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public DatastoreMountWhereInput localHashIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashLt(String localHashLt) {

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

    public DatastoreMountWhereInput localHashLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public DatastoreMountWhereInput localHashLt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashLte(String localHashLte) {

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

    public DatastoreMountWhereInput localHashLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public DatastoreMountWhereInput localHashLte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashNot(String localHashNot) {

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

    public DatastoreMountWhereInput localHashNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public DatastoreMountWhereInput localHashNot_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashNotContains(String localHashNotContains) {

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

    public DatastoreMountWhereInput localHashNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public DatastoreMountWhereInput localHashNotContains_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashNotEndsWith(String localHashNotEndsWith) {

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

    public DatastoreMountWhereInput localHashNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localHashNotEndsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashNotIn(List<String> localHashNotIn) {

        this.localHashNotIn = localHashNotIn;
        return this;
    }

    public DatastoreMountWhereInput addLocalHashNotInItem(String localHashNotInItem) {
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

    public DatastoreMountWhereInput localHashNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput localHashNotIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashNotStartsWith(String localHashNotStartsWith) {

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

    public DatastoreMountWhereInput localHashNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localHashNotStartsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localHashStartsWith(String localHashStartsWith) {

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

    public DatastoreMountWhereInput localHashStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localHashStartsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localId(String localId) {

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

    public DatastoreMountWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public DatastoreMountWhereInput localId_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdContains(String localIdContains) {

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

    public DatastoreMountWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public DatastoreMountWhereInput localIdContains_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public DatastoreMountWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdGt(String localIdGt) {

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

    public DatastoreMountWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public DatastoreMountWhereInput localIdGt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdGte(String localIdGte) {

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

    public DatastoreMountWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public DatastoreMountWhereInput localIdGte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public DatastoreMountWhereInput addLocalIdInItem(String localIdInItem) {
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

    public DatastoreMountWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public DatastoreMountWhereInput localIdIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdLt(String localIdLt) {

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

    public DatastoreMountWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public DatastoreMountWhereInput localIdLt_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdLte(String localIdLte) {

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

    public DatastoreMountWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public DatastoreMountWhereInput localIdLte_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdNot(String localIdNot) {

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

    public DatastoreMountWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public DatastoreMountWhereInput localIdNot_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdNotContains(String localIdNotContains) {

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

    public DatastoreMountWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public DatastoreMountWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public DatastoreMountWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public DatastoreMountWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public DatastoreMountWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public DatastoreMountWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public DatastoreMountWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public DatastoreMountWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public DatastoreMountWhereInput modifiedTime(String modifiedTime) {

        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get modifiedTime
     *
     * @return modifiedTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public DatastoreMountWhereInput modifiedTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME);
        return this;
    }

    public DatastoreMountWhereInput modifiedTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME);
        return this;
    }

    public void setModifiedTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME);
        }
    }

    public boolean getModifiedTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME);
    }

    public DatastoreMountWhereInput modifiedTimeGt(String modifiedTimeGt) {

        this.modifiedTimeGt = modifiedTimeGt;
        return this;
    }

    /**
     * Get modifiedTimeGt
     *
     * @return modifiedTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeGt() {
        return modifiedTimeGt;
    }

    public void setModifiedTimeGt(String modifiedTimeGt) {
        this.modifiedTimeGt = modifiedTimeGt;
    }

    public DatastoreMountWhereInput modifiedTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GT);
        return this;
    }

    public DatastoreMountWhereInput modifiedTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GT);
        return this;
    }

    public void setModifiedTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GT);
        }
    }

    public boolean getModifiedTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_GT);
    }

    public DatastoreMountWhereInput modifiedTimeGte(String modifiedTimeGte) {

        this.modifiedTimeGte = modifiedTimeGte;
        return this;
    }

    /**
     * Get modifiedTimeGte
     *
     * @return modifiedTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeGte() {
        return modifiedTimeGte;
    }

    public void setModifiedTimeGte(String modifiedTimeGte) {
        this.modifiedTimeGte = modifiedTimeGte;
    }

    public DatastoreMountWhereInput modifiedTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        return this;
    }

    public DatastoreMountWhereInput modifiedTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        return this;
    }

    public void setModifiedTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        }
    }

    public boolean getModifiedTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_GTE);
    }

    public DatastoreMountWhereInput modifiedTimeIn(List<String> modifiedTimeIn) {

        this.modifiedTimeIn = modifiedTimeIn;
        return this;
    }

    public DatastoreMountWhereInput addModifiedTimeInItem(String modifiedTimeInItem) {
        if (this.modifiedTimeIn == null) {
            this.modifiedTimeIn = new ArrayList<String>();
        }
        this.modifiedTimeIn.add(modifiedTimeInItem);
        return this;
    }

    /**
     * Get modifiedTimeIn
     *
     * @return modifiedTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModifiedTimeIn() {
        return modifiedTimeIn;
    }

    public void setModifiedTimeIn(List<String> modifiedTimeIn) {
        this.modifiedTimeIn = modifiedTimeIn;
    }

    public DatastoreMountWhereInput modifiedTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_IN);
        return this;
    }

    public DatastoreMountWhereInput modifiedTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_IN);
        return this;
    }

    public void setModifiedTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_IN);
        }
    }

    public boolean getModifiedTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_IN);
    }

    public DatastoreMountWhereInput modifiedTimeLt(String modifiedTimeLt) {

        this.modifiedTimeLt = modifiedTimeLt;
        return this;
    }

    /**
     * Get modifiedTimeLt
     *
     * @return modifiedTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeLt() {
        return modifiedTimeLt;
    }

    public void setModifiedTimeLt(String modifiedTimeLt) {
        this.modifiedTimeLt = modifiedTimeLt;
    }

    public DatastoreMountWhereInput modifiedTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LT);
        return this;
    }

    public DatastoreMountWhereInput modifiedTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LT);
        return this;
    }

    public void setModifiedTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LT);
        }
    }

    public boolean getModifiedTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_LT);
    }

    public DatastoreMountWhereInput modifiedTimeLte(String modifiedTimeLte) {

        this.modifiedTimeLte = modifiedTimeLte;
        return this;
    }

    /**
     * Get modifiedTimeLte
     *
     * @return modifiedTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeLte() {
        return modifiedTimeLte;
    }

    public void setModifiedTimeLte(String modifiedTimeLte) {
        this.modifiedTimeLte = modifiedTimeLte;
    }

    public DatastoreMountWhereInput modifiedTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        return this;
    }

    public DatastoreMountWhereInput modifiedTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        return this;
    }

    public void setModifiedTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        }
    }

    public boolean getModifiedTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_LTE);
    }

    public DatastoreMountWhereInput modifiedTimeNot(String modifiedTimeNot) {

        this.modifiedTimeNot = modifiedTimeNot;
        return this;
    }

    /**
     * Get modifiedTimeNot
     *
     * @return modifiedTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeNot() {
        return modifiedTimeNot;
    }

    public void setModifiedTimeNot(String modifiedTimeNot) {
        this.modifiedTimeNot = modifiedTimeNot;
    }

    public DatastoreMountWhereInput modifiedTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        return this;
    }

    public DatastoreMountWhereInput modifiedTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        return this;
    }

    public void setModifiedTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        }
    }

    public boolean getModifiedTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_NOT);
    }

    public DatastoreMountWhereInput modifiedTimeNotIn(List<String> modifiedTimeNotIn) {

        this.modifiedTimeNotIn = modifiedTimeNotIn;
        return this;
    }

    public DatastoreMountWhereInput addModifiedTimeNotInItem(String modifiedTimeNotInItem) {
        if (this.modifiedTimeNotIn == null) {
            this.modifiedTimeNotIn = new ArrayList<String>();
        }
        this.modifiedTimeNotIn.add(modifiedTimeNotInItem);
        return this;
    }

    /**
     * Get modifiedTimeNotIn
     *
     * @return modifiedTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModifiedTimeNotIn() {
        return modifiedTimeNotIn;
    }

    public void setModifiedTimeNotIn(List<String> modifiedTimeNotIn) {
        this.modifiedTimeNotIn = modifiedTimeNotIn;
    }

    public DatastoreMountWhereInput modifiedTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput modifiedTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        return this;
    }

    public void setModifiedTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        }
    }

    public boolean getModifiedTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
    }

    public DatastoreMountWhereInput state(DatastoreMountState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreMountState getState() {
        return state;
    }

    public void setState(DatastoreMountState state) {
        this.state = state;
    }

    public DatastoreMountWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public DatastoreMountWhereInput state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public DatastoreMountWhereInput stateIn(List<DatastoreMountState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public DatastoreMountWhereInput addStateInItem(DatastoreMountState stateInItem) {
        if (this.stateIn == null) {
            this.stateIn = new ArrayList<DatastoreMountState>();
        }
        this.stateIn.add(stateInItem);
        return this;
    }

    /**
     * Get stateIn
     *
     * @return stateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DatastoreMountState> getStateIn() {
        return stateIn;
    }

    public void setStateIn(List<DatastoreMountState> stateIn) {
        this.stateIn = stateIn;
    }

    public DatastoreMountWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public DatastoreMountWhereInput stateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public void setStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        }
    }

    public boolean getStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_IN);
    }

    public DatastoreMountWhereInput stateNot(DatastoreMountState stateNot) {

        this.stateNot = stateNot;
        return this;
    }

    /**
     * Get stateNot
     *
     * @return stateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreMountState getStateNot() {
        return stateNot;
    }

    public void setStateNot(DatastoreMountState stateNot) {
        this.stateNot = stateNot;
    }

    public DatastoreMountWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public DatastoreMountWhereInput stateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public void setStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        }
    }

    public boolean getStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT);
    }

    public DatastoreMountWhereInput stateNotIn(List<DatastoreMountState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public DatastoreMountWhereInput addStateNotInItem(DatastoreMountState stateNotInItem) {
        if (this.stateNotIn == null) {
            this.stateNotIn = new ArrayList<DatastoreMountState>();
        }
        this.stateNotIn.add(stateNotInItem);
        return this;
    }

    /**
     * Get stateNotIn
     *
     * @return stateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DatastoreMountState> getStateNotIn() {
        return stateNotIn;
    }

    public void setStateNotIn(List<DatastoreMountState> stateNotIn) {
        this.stateNotIn = stateNotIn;
    }

    public DatastoreMountWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public DatastoreMountWhereInput stateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public void setStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        }
    }

    public boolean getStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatastoreMountWhereInput datastoreMountWhereInput = (DatastoreMountWhereInput) o;
        return Objects.equals(this.AND, datastoreMountWhereInput.AND)
                && Objects.equals(this.NOT, datastoreMountWhereInput.NOT)
                && Objects.equals(this.OR, datastoreMountWhereInput.OR)
                && Objects.equals(this.createdTime, datastoreMountWhereInput.createdTime)
                && Objects.equals(this.createdTimeGt, datastoreMountWhereInput.createdTimeGt)
                && Objects.equals(this.createdTimeGte, datastoreMountWhereInput.createdTimeGte)
                && Objects.equals(this.createdTimeIn, datastoreMountWhereInput.createdTimeIn)
                && Objects.equals(this.createdTimeLt, datastoreMountWhereInput.createdTimeLt)
                && Objects.equals(this.createdTimeLte, datastoreMountWhereInput.createdTimeLte)
                && Objects.equals(this.createdTimeNot, datastoreMountWhereInput.createdTimeNot)
                && Objects.equals(this.createdTimeNotIn, datastoreMountWhereInput.createdTimeNotIn)
                && Objects.equals(this.dataVersion, datastoreMountWhereInput.dataVersion)
                && Objects.equals(this.dataVersionGt, datastoreMountWhereInput.dataVersionGt)
                && Objects.equals(this.dataVersionGte, datastoreMountWhereInput.dataVersionGte)
                && Objects.equals(this.dataVersionIn, datastoreMountWhereInput.dataVersionIn)
                && Objects.equals(this.dataVersionLt, datastoreMountWhereInput.dataVersionLt)
                && Objects.equals(this.dataVersionLte, datastoreMountWhereInput.dataVersionLte)
                && Objects.equals(this.dataVersionNot, datastoreMountWhereInput.dataVersionNot)
                && Objects.equals(this.dataVersionNotIn, datastoreMountWhereInput.dataVersionNotIn)
                && Objects.equals(this.datastore, datastoreMountWhereInput.datastore)
                && Objects.equals(this.deviceState, datastoreMountWhereInput.deviceState)
                && Objects.equals(this.deviceStateIn, datastoreMountWhereInput.deviceStateIn)
                && Objects.equals(this.deviceStateNot, datastoreMountWhereInput.deviceStateNot)
                && Objects.equals(this.deviceStateNotIn, datastoreMountWhereInput.deviceStateNotIn)
                && Objects.equals(this.host, datastoreMountWhereInput.host)
                && Objects.equals(this.id, datastoreMountWhereInput.id)
                && Objects.equals(this.idContains, datastoreMountWhereInput.idContains)
                && Objects.equals(this.idEndsWith, datastoreMountWhereInput.idEndsWith)
                && Objects.equals(this.idGt, datastoreMountWhereInput.idGt)
                && Objects.equals(this.idGte, datastoreMountWhereInput.idGte)
                && Objects.equals(this.idIn, datastoreMountWhereInput.idIn)
                && Objects.equals(this.idLt, datastoreMountWhereInput.idLt)
                && Objects.equals(this.idLte, datastoreMountWhereInput.idLte)
                && Objects.equals(this.idNot, datastoreMountWhereInput.idNot)
                && Objects.equals(this.idNotContains, datastoreMountWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, datastoreMountWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, datastoreMountWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, datastoreMountWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, datastoreMountWhereInput.idStartsWith)
                && Objects.equals(this.isFormat, datastoreMountWhereInput.isFormat)
                && Objects.equals(this.isFormatNot, datastoreMountWhereInput.isFormatNot)
                && Objects.equals(this.localHash, datastoreMountWhereInput.localHash)
                && Objects.equals(
                        this.localHashContains, datastoreMountWhereInput.localHashContains)
                && Objects.equals(
                        this.localHashEndsWith, datastoreMountWhereInput.localHashEndsWith)
                && Objects.equals(this.localHashGt, datastoreMountWhereInput.localHashGt)
                && Objects.equals(this.localHashGte, datastoreMountWhereInput.localHashGte)
                && Objects.equals(this.localHashIn, datastoreMountWhereInput.localHashIn)
                && Objects.equals(this.localHashLt, datastoreMountWhereInput.localHashLt)
                && Objects.equals(this.localHashLte, datastoreMountWhereInput.localHashLte)
                && Objects.equals(this.localHashNot, datastoreMountWhereInput.localHashNot)
                && Objects.equals(
                        this.localHashNotContains, datastoreMountWhereInput.localHashNotContains)
                && Objects.equals(
                        this.localHashNotEndsWith, datastoreMountWhereInput.localHashNotEndsWith)
                && Objects.equals(this.localHashNotIn, datastoreMountWhereInput.localHashNotIn)
                && Objects.equals(
                        this.localHashNotStartsWith,
                        datastoreMountWhereInput.localHashNotStartsWith)
                && Objects.equals(
                        this.localHashStartsWith, datastoreMountWhereInput.localHashStartsWith)
                && Objects.equals(this.localId, datastoreMountWhereInput.localId)
                && Objects.equals(this.localIdContains, datastoreMountWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, datastoreMountWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, datastoreMountWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, datastoreMountWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, datastoreMountWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, datastoreMountWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, datastoreMountWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, datastoreMountWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, datastoreMountWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, datastoreMountWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, datastoreMountWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, datastoreMountWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, datastoreMountWhereInput.localIdStartsWith)
                && Objects.equals(this.modifiedTime, datastoreMountWhereInput.modifiedTime)
                && Objects.equals(this.modifiedTimeGt, datastoreMountWhereInput.modifiedTimeGt)
                && Objects.equals(this.modifiedTimeGte, datastoreMountWhereInput.modifiedTimeGte)
                && Objects.equals(this.modifiedTimeIn, datastoreMountWhereInput.modifiedTimeIn)
                && Objects.equals(this.modifiedTimeLt, datastoreMountWhereInput.modifiedTimeLt)
                && Objects.equals(this.modifiedTimeLte, datastoreMountWhereInput.modifiedTimeLte)
                && Objects.equals(this.modifiedTimeNot, datastoreMountWhereInput.modifiedTimeNot)
                && Objects.equals(
                        this.modifiedTimeNotIn, datastoreMountWhereInput.modifiedTimeNotIn)
                && Objects.equals(this.state, datastoreMountWhereInput.state)
                && Objects.equals(this.stateIn, datastoreMountWhereInput.stateIn)
                && Objects.equals(this.stateNot, datastoreMountWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, datastoreMountWhereInput.stateNotIn);
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
                createdTime,
                createdTimeGt,
                createdTimeGte,
                createdTimeIn,
                createdTimeLt,
                createdTimeLte,
                createdTimeNot,
                createdTimeNotIn,
                dataVersion,
                dataVersionGt,
                dataVersionGte,
                dataVersionIn,
                dataVersionLt,
                dataVersionLte,
                dataVersionNot,
                dataVersionNotIn,
                datastore,
                deviceState,
                deviceStateIn,
                deviceStateNot,
                deviceStateNotIn,
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
                isFormat,
                isFormatNot,
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
                modifiedTime,
                modifiedTimeGt,
                modifiedTimeGte,
                modifiedTimeIn,
                modifiedTimeLt,
                modifiedTimeLte,
                modifiedTimeNot,
                modifiedTimeNotIn,
                state,
                stateIn,
                stateNot,
                stateNotIn);
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
        sb.append("class DatastoreMountWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    createdTimeGt: ").append(toIndentedString(createdTimeGt)).append("\n");
        sb.append("    createdTimeGte: ").append(toIndentedString(createdTimeGte)).append("\n");
        sb.append("    createdTimeIn: ").append(toIndentedString(createdTimeIn)).append("\n");
        sb.append("    createdTimeLt: ").append(toIndentedString(createdTimeLt)).append("\n");
        sb.append("    createdTimeLte: ").append(toIndentedString(createdTimeLte)).append("\n");
        sb.append("    createdTimeNot: ").append(toIndentedString(createdTimeNot)).append("\n");
        sb.append("    createdTimeNotIn: ").append(toIndentedString(createdTimeNotIn)).append("\n");
        sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
        sb.append("    dataVersionGt: ").append(toIndentedString(dataVersionGt)).append("\n");
        sb.append("    dataVersionGte: ").append(toIndentedString(dataVersionGte)).append("\n");
        sb.append("    dataVersionIn: ").append(toIndentedString(dataVersionIn)).append("\n");
        sb.append("    dataVersionLt: ").append(toIndentedString(dataVersionLt)).append("\n");
        sb.append("    dataVersionLte: ").append(toIndentedString(dataVersionLte)).append("\n");
        sb.append("    dataVersionNot: ").append(toIndentedString(dataVersionNot)).append("\n");
        sb.append("    dataVersionNotIn: ").append(toIndentedString(dataVersionNotIn)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    deviceState: ").append(toIndentedString(deviceState)).append("\n");
        sb.append("    deviceStateIn: ").append(toIndentedString(deviceStateIn)).append("\n");
        sb.append("    deviceStateNot: ").append(toIndentedString(deviceStateNot)).append("\n");
        sb.append("    deviceStateNotIn: ").append(toIndentedString(deviceStateNotIn)).append("\n");
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
        sb.append("    isFormat: ").append(toIndentedString(isFormat)).append("\n");
        sb.append("    isFormatNot: ").append(toIndentedString(isFormatNot)).append("\n");
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
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    modifiedTimeGt: ").append(toIndentedString(modifiedTimeGt)).append("\n");
        sb.append("    modifiedTimeGte: ").append(toIndentedString(modifiedTimeGte)).append("\n");
        sb.append("    modifiedTimeIn: ").append(toIndentedString(modifiedTimeIn)).append("\n");
        sb.append("    modifiedTimeLt: ").append(toIndentedString(modifiedTimeLt)).append("\n");
        sb.append("    modifiedTimeLte: ").append(toIndentedString(modifiedTimeLte)).append("\n");
        sb.append("    modifiedTimeNot: ").append(toIndentedString(modifiedTimeNot)).append("\n");
        sb.append("    modifiedTimeNotIn: ")
                .append(toIndentedString(modifiedTimeNotIn))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
        sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
        sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
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
