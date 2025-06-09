package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationFailoverTargetExecutionWhereInput */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ReplicationFailoverTargetExecutionWhereInput
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReplicationFailoverTargetExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReplicationFailoverTargetExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReplicationFailoverTargetExecutionWhereInput> OR = null;

    public static final String SERIALIZED_NAME_FAILOVER_EXECUTION = "failover_execution";

    @SerializedName(SERIALIZED_NAME_FAILOVER_EXECUTION)
    private FailoverExecutionWhereInput failoverExecution;

    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_FINISHED_AT_GT = "finished_at_gt";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_GT)
    private String finishedAtGt;

    public static final String SERIALIZED_NAME_FINISHED_AT_GTE = "finished_at_gte";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_GTE)
    private String finishedAtGte;

    public static final String SERIALIZED_NAME_FINISHED_AT_IN = "finished_at_in";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_IN)
    private List<String> finishedAtIn = null;

    public static final String SERIALIZED_NAME_FINISHED_AT_LT = "finished_at_lt";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_LT)
    private String finishedAtLt;

    public static final String SERIALIZED_NAME_FINISHED_AT_LTE = "finished_at_lte";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_LTE)
    private String finishedAtLte;

    public static final String SERIALIZED_NAME_FINISHED_AT_NOT = "finished_at_not";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT)
    private String finishedAtNot;

    public static final String SERIALIZED_NAME_FINISHED_AT_NOT_IN = "finished_at_not_in";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT_IN)
    private List<String> finishedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private BackupJobPhase phase;

    public static final String SERIALIZED_NAME_PHASE_IN = "phase_in";

    @SerializedName(SERIALIZED_NAME_PHASE_IN)
    private List<BackupJobPhase> phaseIn = null;

    public static final String SERIALIZED_NAME_PHASE_NOT = "phase_not";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT)
    private BackupJobPhase phaseNot;

    public static final String SERIALIZED_NAME_PHASE_NOT_IN = "phase_not_in";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT_IN)
    private List<BackupJobPhase> phaseNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resource_version";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
    private Integer resourceVersion;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GT = "resource_version_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GT)
    private Integer resourceVersionGt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GTE = "resource_version_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GTE)
    private Integer resourceVersionGte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_IN = "resource_version_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_IN)
    private List<Integer> resourceVersionIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LT = "resource_version_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LT)
    private Integer resourceVersionLt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LTE = "resource_version_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LTE)
    private Integer resourceVersionLte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT = "resource_version_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT)
    private Integer resourceVersionNot;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN = "resource_version_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN)
    private List<Integer> resourceVersionNotIn = null;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_STARTED_AT_GT = "started_at_gt";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_GT)
    private String startedAtGt;

    public static final String SERIALIZED_NAME_STARTED_AT_GTE = "started_at_gte";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_GTE)
    private String startedAtGte;

    public static final String SERIALIZED_NAME_STARTED_AT_IN = "started_at_in";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_IN)
    private List<String> startedAtIn = null;

    public static final String SERIALIZED_NAME_STARTED_AT_LT = "started_at_lt";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_LT)
    private String startedAtLt;

    public static final String SERIALIZED_NAME_STARTED_AT_LTE = "started_at_lte";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_LTE)
    private String startedAtLte;

    public static final String SERIALIZED_NAME_STARTED_AT_NOT = "started_at_not";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT)
    private String startedAtNot;

    public static final String SERIALIZED_NAME_STARTED_AT_NOT_IN = "started_at_not_in";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT_IN)
    private List<String> startedAtNotIn = null;

    public ReplicationFailoverTargetExecutionWhereInput() {}

    public ReplicationFailoverTargetExecutionWhereInput AND(
            List<ReplicationFailoverTargetExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addANDItem(
            ReplicationFailoverTargetExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReplicationFailoverTargetExecutionWhereInput>();
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
    public List<ReplicationFailoverTargetExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReplicationFailoverTargetExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public ReplicationFailoverTargetExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput AND_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput NOT(
            List<ReplicationFailoverTargetExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addNOTItem(
            ReplicationFailoverTargetExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReplicationFailoverTargetExecutionWhereInput>();
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
    public List<ReplicationFailoverTargetExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReplicationFailoverTargetExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReplicationFailoverTargetExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput OR(
            List<ReplicationFailoverTargetExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addORItem(
            ReplicationFailoverTargetExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReplicationFailoverTargetExecutionWhereInput>();
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
    public List<ReplicationFailoverTargetExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReplicationFailoverTargetExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public ReplicationFailoverTargetExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput OR_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput failoverExecution(
            FailoverExecutionWhereInput failoverExecution) {

        this.failoverExecution = failoverExecution;
        return this;
    }

    /**
     * Get failoverExecution
     *
     * @return failoverExecution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailoverExecutionWhereInput getFailoverExecution() {
        return failoverExecution;
    }

    public void setFailoverExecution(FailoverExecutionWhereInput failoverExecution) {
        this.failoverExecution = failoverExecution;
    }

    public ReplicationFailoverTargetExecutionWhereInput failoverExecution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTION);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput failoverExecution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTION);
        return this;
    }

    public void setFailoverExecution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTION);
        }
    }

    public boolean getFailoverExecution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_EXECUTION);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAt(String finishedAt) {

        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     *
     * @return finishedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public void setFinishedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        }
    }

    public boolean getFinishedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtGt(String finishedAtGt) {

        this.finishedAtGt = finishedAtGt;
        return this;
    }

    /**
     * Get finishedAtGt
     *
     * @return finishedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtGt() {
        return finishedAtGt;
    }

    public void setFinishedAtGt(String finishedAtGt) {
        this.finishedAtGt = finishedAtGt;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public void setFinishedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GT);
        }
    }

    public boolean getFinishedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_GT);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtGte(String finishedAtGte) {

        this.finishedAtGte = finishedAtGte;
        return this;
    }

    /**
     * Get finishedAtGte
     *
     * @return finishedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtGte() {
        return finishedAtGte;
    }

    public void setFinishedAtGte(String finishedAtGte) {
        this.finishedAtGte = finishedAtGte;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public void setFinishedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GTE);
        }
    }

    public boolean getFinishedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_GTE);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addFinishedAtInItem(
            String finishedAtInItem) {
        if (this.finishedAtIn == null) {
            this.finishedAtIn = new ArrayList<String>();
        }
        this.finishedAtIn.add(finishedAtInItem);
        return this;
    }

    /**
     * Get finishedAtIn
     *
     * @return finishedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFinishedAtIn() {
        return finishedAtIn;
    }

    public void setFinishedAtIn(List<String> finishedAtIn) {
        this.finishedAtIn = finishedAtIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public void setFinishedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_IN);
        }
    }

    public boolean getFinishedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_IN);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtLt(String finishedAtLt) {

        this.finishedAtLt = finishedAtLt;
        return this;
    }

    /**
     * Get finishedAtLt
     *
     * @return finishedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtLt() {
        return finishedAtLt;
    }

    public void setFinishedAtLt(String finishedAtLt) {
        this.finishedAtLt = finishedAtLt;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public void setFinishedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LT);
        }
    }

    public boolean getFinishedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_LT);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtLte(String finishedAtLte) {

        this.finishedAtLte = finishedAtLte;
        return this;
    }

    /**
     * Get finishedAtLte
     *
     * @return finishedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtLte() {
        return finishedAtLte;
    }

    public void setFinishedAtLte(String finishedAtLte) {
        this.finishedAtLte = finishedAtLte;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public void setFinishedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LTE);
        }
    }

    public boolean getFinishedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_LTE);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtNot(String finishedAtNot) {

        this.finishedAtNot = finishedAtNot;
        return this;
    }

    /**
     * Get finishedAtNot
     *
     * @return finishedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtNot() {
        return finishedAtNot;
    }

    public void setFinishedAtNot(String finishedAtNot) {
        this.finishedAtNot = finishedAtNot;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public void setFinishedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT);
        }
    }

    public boolean getFinishedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_NOT);
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtNotIn(
            List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addFinishedAtNotInItem(
            String finishedAtNotInItem) {
        if (this.finishedAtNotIn == null) {
            this.finishedAtNotIn = new ArrayList<String>();
        }
        this.finishedAtNotIn.add(finishedAtNotInItem);
        return this;
    }

    /**
     * Get finishedAtNotIn
     *
     * @return finishedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFinishedAtNotIn() {
        return finishedAtNotIn;
    }

    public void setFinishedAtNotIn(List<String> finishedAtNotIn) {
        this.finishedAtNotIn = finishedAtNotIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput finishedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public void setFinishedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        }
    }

    public boolean getFinishedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
    }

    public ReplicationFailoverTargetExecutionWhereInput id(String id) {

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

    public ReplicationFailoverTargetExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput id_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idContains(String idContains) {

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

    public ReplicationFailoverTargetExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idGt(String idGt) {

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

    public ReplicationFailoverTargetExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idGte(String idGte) {

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

    public ReplicationFailoverTargetExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addIdInItem(String idInItem) {
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

    public ReplicationFailoverTargetExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idLt(String idLt) {

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

    public ReplicationFailoverTargetExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idLte(String idLte) {

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

    public ReplicationFailoverTargetExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idNot(String idNot) {

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

    public ReplicationFailoverTargetExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idNotContains(String idNotContains) {

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

    public ReplicationFailoverTargetExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReplicationFailoverTargetExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localId(String localId) {

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

    public ReplicationFailoverTargetExecutionWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localId_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdContains(String localIdContains) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdContains_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdGt(String localIdGt) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdGt_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdGte(String localIdGte) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdGte_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addLocalIdInItem(String localIdInItem) {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdIn_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdLt(String localIdLt) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdLt_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdLte(String localIdLte) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdLte_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdNot(String localIdNot) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdNot_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotContains(
            String localIdNotContains) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotEndsWith(
            String localIdNotEndsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addLocalIdNotInItem(
            String localIdNotInItem) {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotStartsWith(
            String localIdNotStartsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput localIdStartsWith(
            String localIdStartsWith) {

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

    public ReplicationFailoverTargetExecutionWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public ReplicationFailoverTargetExecutionWhereInput phase(BackupJobPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupJobPhase getPhase() {
        return phase;
    }

    public void setPhase(BackupJobPhase phase) {
        this.phase = phase;
    }

    public ReplicationFailoverTargetExecutionWhereInput phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseIn(List<BackupJobPhase> phaseIn) {

        this.phaseIn = phaseIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addPhaseInItem(BackupJobPhase phaseInItem) {
        if (this.phaseIn == null) {
            this.phaseIn = new ArrayList<BackupJobPhase>();
        }
        this.phaseIn.add(phaseInItem);
        return this;
    }

    /**
     * Get phaseIn
     *
     * @return phaseIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupJobPhase> getPhaseIn() {
        return phaseIn;
    }

    public void setPhaseIn(List<BackupJobPhase> phaseIn) {
        this.phaseIn = phaseIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public void setPhaseIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_IN);
        }
    }

    public boolean getPhaseIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_IN);
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseNot(BackupJobPhase phaseNot) {

        this.phaseNot = phaseNot;
        return this;
    }

    /**
     * Get phaseNot
     *
     * @return phaseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupJobPhase getPhaseNot() {
        return phaseNot;
    }

    public void setPhaseNot(BackupJobPhase phaseNot) {
        this.phaseNot = phaseNot;
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public void setPhaseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT);
        }
    }

    public boolean getPhaseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_NOT);
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseNotIn(
            List<BackupJobPhase> phaseNotIn) {

        this.phaseNotIn = phaseNotIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addPhaseNotInItem(
            BackupJobPhase phaseNotInItem) {
        if (this.phaseNotIn == null) {
            this.phaseNotIn = new ArrayList<BackupJobPhase>();
        }
        this.phaseNotIn.add(phaseNotInItem);
        return this;
    }

    /**
     * Get phaseNotIn
     *
     * @return phaseNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupJobPhase> getPhaseNotIn() {
        return phaseNotIn;
    }

    public void setPhaseNotIn(List<BackupJobPhase> phaseNotIn) {
        this.phaseNotIn = phaseNotIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput phaseNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public void setPhaseNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT_IN);
        }
    }

    public boolean getPhaseNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_NOT_IN);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersion(Integer resourceVersion) {

        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * Get resourceVersion
     *
     * @return resourceVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public void setResourceVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        }
    }

    public boolean getResourceVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionGt(
            Integer resourceVersionGt) {

        this.resourceVersionGt = resourceVersionGt;
        return this;
    }

    /**
     * Get resourceVersionGt
     *
     * @return resourceVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGt() {
        return resourceVersionGt;
    }

    public void setResourceVersionGt(Integer resourceVersionGt) {
        this.resourceVersionGt = resourceVersionGt;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public void setResourceVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        }
    }

    public boolean getResourceVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GT);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionGte(
            Integer resourceVersionGte) {

        this.resourceVersionGte = resourceVersionGte;
        return this;
    }

    /**
     * Get resourceVersionGte
     *
     * @return resourceVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGte() {
        return resourceVersionGte;
    }

    public void setResourceVersionGte(Integer resourceVersionGte) {
        this.resourceVersionGte = resourceVersionGte;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public void setResourceVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        }
    }

    public boolean getResourceVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionIn(
            List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addResourceVersionInItem(
            Integer resourceVersionInItem) {
        if (this.resourceVersionIn == null) {
            this.resourceVersionIn = new ArrayList<Integer>();
        }
        this.resourceVersionIn.add(resourceVersionInItem);
        return this;
    }

    /**
     * Get resourceVersionIn
     *
     * @return resourceVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionIn() {
        return resourceVersionIn;
    }

    public void setResourceVersionIn(List<Integer> resourceVersionIn) {
        this.resourceVersionIn = resourceVersionIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public void setResourceVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        }
    }

    public boolean getResourceVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_IN);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionLt(
            Integer resourceVersionLt) {

        this.resourceVersionLt = resourceVersionLt;
        return this;
    }

    /**
     * Get resourceVersionLt
     *
     * @return resourceVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLt() {
        return resourceVersionLt;
    }

    public void setResourceVersionLt(Integer resourceVersionLt) {
        this.resourceVersionLt = resourceVersionLt;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public void setResourceVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        }
    }

    public boolean getResourceVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LT);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionLte(
            Integer resourceVersionLte) {

        this.resourceVersionLte = resourceVersionLte;
        return this;
    }

    /**
     * Get resourceVersionLte
     *
     * @return resourceVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLte() {
        return resourceVersionLte;
    }

    public void setResourceVersionLte(Integer resourceVersionLte) {
        this.resourceVersionLte = resourceVersionLte;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public void setResourceVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        }
    }

    public boolean getResourceVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionNot(
            Integer resourceVersionNot) {

        this.resourceVersionNot = resourceVersionNot;
        return this;
    }

    /**
     * Get resourceVersionNot
     *
     * @return resourceVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionNot() {
        return resourceVersionNot;
    }

    public void setResourceVersionNot(Integer resourceVersionNot) {
        this.resourceVersionNot = resourceVersionNot;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public void setResourceVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        }
    }

    public boolean getResourceVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionNotIn(
            List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addResourceVersionNotInItem(
            Integer resourceVersionNotInItem) {
        if (this.resourceVersionNotIn == null) {
            this.resourceVersionNotIn = new ArrayList<Integer>();
        }
        this.resourceVersionNotIn.add(resourceVersionNotInItem);
        return this;
    }

    /**
     * Get resourceVersionNotIn
     *
     * @return resourceVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionNotIn() {
        return resourceVersionNotIn;
    }

    public void setResourceVersionNotIn(List<Integer> resourceVersionNotIn) {
        this.resourceVersionNotIn = resourceVersionNotIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput resourceVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public void setResourceVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        }
    }

    public boolean getResourceVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAt(String startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     *
     * @return startedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public void setStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        }
    }

    public boolean getStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtGt(String startedAtGt) {

        this.startedAtGt = startedAtGt;
        return this;
    }

    /**
     * Get startedAtGt
     *
     * @return startedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtGt() {
        return startedAtGt;
    }

    public void setStartedAtGt(String startedAtGt) {
        this.startedAtGt = startedAtGt;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public void setStartedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GT);
        }
    }

    public boolean getStartedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_GT);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtGte(String startedAtGte) {

        this.startedAtGte = startedAtGte;
        return this;
    }

    /**
     * Get startedAtGte
     *
     * @return startedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtGte() {
        return startedAtGte;
    }

    public void setStartedAtGte(String startedAtGte) {
        this.startedAtGte = startedAtGte;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public void setStartedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GTE);
        }
    }

    public boolean getStartedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_GTE);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtIn(List<String> startedAtIn) {

        this.startedAtIn = startedAtIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addStartedAtInItem(String startedAtInItem) {
        if (this.startedAtIn == null) {
            this.startedAtIn = new ArrayList<String>();
        }
        this.startedAtIn.add(startedAtInItem);
        return this;
    }

    /**
     * Get startedAtIn
     *
     * @return startedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartedAtIn() {
        return startedAtIn;
    }

    public void setStartedAtIn(List<String> startedAtIn) {
        this.startedAtIn = startedAtIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public void setStartedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_IN);
        }
    }

    public boolean getStartedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_IN);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtLt(String startedAtLt) {

        this.startedAtLt = startedAtLt;
        return this;
    }

    /**
     * Get startedAtLt
     *
     * @return startedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtLt() {
        return startedAtLt;
    }

    public void setStartedAtLt(String startedAtLt) {
        this.startedAtLt = startedAtLt;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public void setStartedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LT);
        }
    }

    public boolean getStartedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_LT);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtLte(String startedAtLte) {

        this.startedAtLte = startedAtLte;
        return this;
    }

    /**
     * Get startedAtLte
     *
     * @return startedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtLte() {
        return startedAtLte;
    }

    public void setStartedAtLte(String startedAtLte) {
        this.startedAtLte = startedAtLte;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public void setStartedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LTE);
        }
    }

    public boolean getStartedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_LTE);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtNot(String startedAtNot) {

        this.startedAtNot = startedAtNot;
        return this;
    }

    /**
     * Get startedAtNot
     *
     * @return startedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtNot() {
        return startedAtNot;
    }

    public void setStartedAtNot(String startedAtNot) {
        this.startedAtNot = startedAtNot;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public void setStartedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT);
        }
    }

    public boolean getStartedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_NOT);
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtNotIn(
            List<String> startedAtNotIn) {

        this.startedAtNotIn = startedAtNotIn;
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput addStartedAtNotInItem(
            String startedAtNotInItem) {
        if (this.startedAtNotIn == null) {
            this.startedAtNotIn = new ArrayList<String>();
        }
        this.startedAtNotIn.add(startedAtNotInItem);
        return this;
    }

    /**
     * Get startedAtNotIn
     *
     * @return startedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartedAtNotIn() {
        return startedAtNotIn;
    }

    public void setStartedAtNotIn(List<String> startedAtNotIn) {
        this.startedAtNotIn = startedAtNotIn;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public ReplicationFailoverTargetExecutionWhereInput startedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public void setStartedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        }
    }

    public boolean getStartedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionWhereInput =
                (ReplicationFailoverTargetExecutionWhereInput) o;
        return Objects.equals(this.AND, replicationFailoverTargetExecutionWhereInput.AND)
                && Objects.equals(this.NOT, replicationFailoverTargetExecutionWhereInput.NOT)
                && Objects.equals(this.OR, replicationFailoverTargetExecutionWhereInput.OR)
                && Objects.equals(
                        this.failoverExecution,
                        replicationFailoverTargetExecutionWhereInput.failoverExecution)
                && Objects.equals(
                        this.finishedAt, replicationFailoverTargetExecutionWhereInput.finishedAt)
                && Objects.equals(
                        this.finishedAtGt,
                        replicationFailoverTargetExecutionWhereInput.finishedAtGt)
                && Objects.equals(
                        this.finishedAtGte,
                        replicationFailoverTargetExecutionWhereInput.finishedAtGte)
                && Objects.equals(
                        this.finishedAtIn,
                        replicationFailoverTargetExecutionWhereInput.finishedAtIn)
                && Objects.equals(
                        this.finishedAtLt,
                        replicationFailoverTargetExecutionWhereInput.finishedAtLt)
                && Objects.equals(
                        this.finishedAtLte,
                        replicationFailoverTargetExecutionWhereInput.finishedAtLte)
                && Objects.equals(
                        this.finishedAtNot,
                        replicationFailoverTargetExecutionWhereInput.finishedAtNot)
                && Objects.equals(
                        this.finishedAtNotIn,
                        replicationFailoverTargetExecutionWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, replicationFailoverTargetExecutionWhereInput.id)
                && Objects.equals(
                        this.idContains, replicationFailoverTargetExecutionWhereInput.idContains)
                && Objects.equals(
                        this.idEndsWith, replicationFailoverTargetExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, replicationFailoverTargetExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, replicationFailoverTargetExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, replicationFailoverTargetExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, replicationFailoverTargetExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, replicationFailoverTargetExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, replicationFailoverTargetExecutionWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains,
                        replicationFailoverTargetExecutionWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith,
                        replicationFailoverTargetExecutionWhereInput.idNotEndsWith)
                && Objects.equals(
                        this.idNotIn, replicationFailoverTargetExecutionWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith,
                        replicationFailoverTargetExecutionWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith,
                        replicationFailoverTargetExecutionWhereInput.idStartsWith)
                && Objects.equals(
                        this.localId, replicationFailoverTargetExecutionWhereInput.localId)
                && Objects.equals(
                        this.localIdContains,
                        replicationFailoverTargetExecutionWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith,
                        replicationFailoverTargetExecutionWhereInput.localIdEndsWith)
                && Objects.equals(
                        this.localIdGt, replicationFailoverTargetExecutionWhereInput.localIdGt)
                && Objects.equals(
                        this.localIdGte, replicationFailoverTargetExecutionWhereInput.localIdGte)
                && Objects.equals(
                        this.localIdIn, replicationFailoverTargetExecutionWhereInput.localIdIn)
                && Objects.equals(
                        this.localIdLt, replicationFailoverTargetExecutionWhereInput.localIdLt)
                && Objects.equals(
                        this.localIdLte, replicationFailoverTargetExecutionWhereInput.localIdLte)
                && Objects.equals(
                        this.localIdNot, replicationFailoverTargetExecutionWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        replicationFailoverTargetExecutionWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        replicationFailoverTargetExecutionWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn,
                        replicationFailoverTargetExecutionWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        replicationFailoverTargetExecutionWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        replicationFailoverTargetExecutionWhereInput.localIdStartsWith)
                && Objects.equals(this.phase, replicationFailoverTargetExecutionWhereInput.phase)
                && Objects.equals(
                        this.phaseIn, replicationFailoverTargetExecutionWhereInput.phaseIn)
                && Objects.equals(
                        this.phaseNot, replicationFailoverTargetExecutionWhereInput.phaseNot)
                && Objects.equals(
                        this.phaseNotIn, replicationFailoverTargetExecutionWhereInput.phaseNotIn)
                && Objects.equals(
                        this.resourceVersion,
                        replicationFailoverTargetExecutionWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt,
                        replicationFailoverTargetExecutionWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte,
                        replicationFailoverTargetExecutionWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn,
                        replicationFailoverTargetExecutionWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt,
                        replicationFailoverTargetExecutionWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte,
                        replicationFailoverTargetExecutionWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot,
                        replicationFailoverTargetExecutionWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn,
                        replicationFailoverTargetExecutionWhereInput.resourceVersionNotIn)
                && Objects.equals(
                        this.startedAt, replicationFailoverTargetExecutionWhereInput.startedAt)
                && Objects.equals(
                        this.startedAtGt, replicationFailoverTargetExecutionWhereInput.startedAtGt)
                && Objects.equals(
                        this.startedAtGte,
                        replicationFailoverTargetExecutionWhereInput.startedAtGte)
                && Objects.equals(
                        this.startedAtIn, replicationFailoverTargetExecutionWhereInput.startedAtIn)
                && Objects.equals(
                        this.startedAtLt, replicationFailoverTargetExecutionWhereInput.startedAtLt)
                && Objects.equals(
                        this.startedAtLte,
                        replicationFailoverTargetExecutionWhereInput.startedAtLte)
                && Objects.equals(
                        this.startedAtNot,
                        replicationFailoverTargetExecutionWhereInput.startedAtNot)
                && Objects.equals(
                        this.startedAtNotIn,
                        replicationFailoverTargetExecutionWhereInput.startedAtNotIn);
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
                failoverExecution,
                finishedAt,
                finishedAtGt,
                finishedAtGte,
                finishedAtIn,
                finishedAtLt,
                finishedAtLte,
                finishedAtNot,
                finishedAtNotIn,
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
                phase,
                phaseIn,
                phaseNot,
                phaseNotIn,
                resourceVersion,
                resourceVersionGt,
                resourceVersionGte,
                resourceVersionIn,
                resourceVersionLt,
                resourceVersionLte,
                resourceVersionNot,
                resourceVersionNotIn,
                startedAt,
                startedAtGt,
                startedAtGte,
                startedAtIn,
                startedAtLt,
                startedAtLte,
                startedAtNot,
                startedAtNotIn);
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
        sb.append("class ReplicationFailoverTargetExecutionWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    failoverExecution: ")
                .append(toIndentedString(failoverExecution))
                .append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    finishedAtGt: ").append(toIndentedString(finishedAtGt)).append("\n");
        sb.append("    finishedAtGte: ").append(toIndentedString(finishedAtGte)).append("\n");
        sb.append("    finishedAtIn: ").append(toIndentedString(finishedAtIn)).append("\n");
        sb.append("    finishedAtLt: ").append(toIndentedString(finishedAtLt)).append("\n");
        sb.append("    finishedAtLte: ").append(toIndentedString(finishedAtLte)).append("\n");
        sb.append("    finishedAtNot: ").append(toIndentedString(finishedAtNot)).append("\n");
        sb.append("    finishedAtNotIn: ").append(toIndentedString(finishedAtNotIn)).append("\n");
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
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
        sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
        sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    resourceVersionGt: ")
                .append(toIndentedString(resourceVersionGt))
                .append("\n");
        sb.append("    resourceVersionGte: ")
                .append(toIndentedString(resourceVersionGte))
                .append("\n");
        sb.append("    resourceVersionIn: ")
                .append(toIndentedString(resourceVersionIn))
                .append("\n");
        sb.append("    resourceVersionLt: ")
                .append(toIndentedString(resourceVersionLt))
                .append("\n");
        sb.append("    resourceVersionLte: ")
                .append(toIndentedString(resourceVersionLte))
                .append("\n");
        sb.append("    resourceVersionNot: ")
                .append(toIndentedString(resourceVersionNot))
                .append("\n");
        sb.append("    resourceVersionNotIn: ")
                .append(toIndentedString(resourceVersionNotIn))
                .append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
        sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
        sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
        sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
        sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
        sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
        sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
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
