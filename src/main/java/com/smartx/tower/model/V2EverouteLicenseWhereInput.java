package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.EverouteFeatureType;
import com.smartx.tower.model.EverouteLicensePricingType;
import com.smartx.tower.model.LicenseType;
import com.smartx.tower.model.SoftwareEdition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * V2EverouteLicenseWhereInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class V2EverouteLicenseWhereInput {
  public static final String SERIALIZED_NAME_A_N_D = "AND";
  @SerializedName(SERIALIZED_NAME_A_N_D)
  private List<V2EverouteLicenseWhereInput> AND = null;

  public static final String SERIALIZED_NAME_N_O_T = "NOT";
  @SerializedName(SERIALIZED_NAME_N_O_T)
  private List<V2EverouteLicenseWhereInput> NOT = null;

  public static final String SERIALIZED_NAME_O_R = "OR";
  @SerializedName(SERIALIZED_NAME_O_R)
  private List<V2EverouteLicenseWhereInput> OR = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CODE_CONTAINS = "code_contains";
  @SerializedName(SERIALIZED_NAME_CODE_CONTAINS)
  private String codeContains;

  public static final String SERIALIZED_NAME_CODE_ENDS_WITH = "code_ends_with";
  @SerializedName(SERIALIZED_NAME_CODE_ENDS_WITH)
  private String codeEndsWith;

  public static final String SERIALIZED_NAME_CODE_GT = "code_gt";
  @SerializedName(SERIALIZED_NAME_CODE_GT)
  private String codeGt;

  public static final String SERIALIZED_NAME_CODE_GTE = "code_gte";
  @SerializedName(SERIALIZED_NAME_CODE_GTE)
  private String codeGte;

  public static final String SERIALIZED_NAME_CODE_IN = "code_in";
  @SerializedName(SERIALIZED_NAME_CODE_IN)
  private List<String> codeIn = null;

  public static final String SERIALIZED_NAME_CODE_LT = "code_lt";
  @SerializedName(SERIALIZED_NAME_CODE_LT)
  private String codeLt;

  public static final String SERIALIZED_NAME_CODE_LTE = "code_lte";
  @SerializedName(SERIALIZED_NAME_CODE_LTE)
  private String codeLte;

  public static final String SERIALIZED_NAME_CODE_NOT = "code_not";
  @SerializedName(SERIALIZED_NAME_CODE_NOT)
  private String codeNot;

  public static final String SERIALIZED_NAME_CODE_NOT_CONTAINS = "code_not_contains";
  @SerializedName(SERIALIZED_NAME_CODE_NOT_CONTAINS)
  private String codeNotContains;

  public static final String SERIALIZED_NAME_CODE_NOT_ENDS_WITH = "code_not_ends_with";
  @SerializedName(SERIALIZED_NAME_CODE_NOT_ENDS_WITH)
  private String codeNotEndsWith;

  public static final String SERIALIZED_NAME_CODE_NOT_IN = "code_not_in";
  @SerializedName(SERIALIZED_NAME_CODE_NOT_IN)
  private List<String> codeNotIn = null;

  public static final String SERIALIZED_NAME_CODE_NOT_STARTS_WITH = "code_not_starts_with";
  @SerializedName(SERIALIZED_NAME_CODE_NOT_STARTS_WITH)
  private String codeNotStartsWith;

  public static final String SERIALIZED_NAME_CODE_STARTS_WITH = "code_starts_with";
  @SerializedName(SERIALIZED_NAME_CODE_STARTS_WITH)
  private String codeStartsWith;

  public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  private String expireDate;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_GT = "expire_date_gt";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GT)
  private String expireDateGt;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_GTE = "expire_date_gte";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_GTE)
  private String expireDateGte;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_IN = "expire_date_in";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_IN)
  private List<String> expireDateIn = null;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_LT = "expire_date_lt";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LT)
  private String expireDateLt;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_LTE = "expire_date_lte";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_LTE)
  private String expireDateLte;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT = "expire_date_not";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT)
  private String expireDateNot;

  public static final String SERIALIZED_NAME_EXPIRE_DATE_NOT_IN = "expire_date_not_in";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE_NOT_IN)
  private List<String> expireDateNotIn = null;

  public static final String SERIALIZED_NAME_FEATURE_TYPE = "feature_type";
  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE)
  private EverouteFeatureType featureType;

  public static final String SERIALIZED_NAME_FEATURE_TYPE_IN = "feature_type_in";
  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE_IN)
  private List<EverouteFeatureType> featureTypeIn = null;

  public static final String SERIALIZED_NAME_FEATURE_TYPE_NOT = "feature_type_not";
  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE_NOT)
  private EverouteFeatureType featureTypeNot;

  public static final String SERIALIZED_NAME_FEATURE_TYPE_NOT_IN = "feature_type_not_in";
  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE_NOT_IN)
  private List<EverouteFeatureType> featureTypeNotIn = null;

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

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM = "max_socket_num";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM)
  private Integer maxSocketNum;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_GT = "max_socket_num_gt";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_GT)
  private Integer maxSocketNumGt;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_GTE = "max_socket_num_gte";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_GTE)
  private Integer maxSocketNumGte;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_IN = "max_socket_num_in";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_IN)
  private List<Integer> maxSocketNumIn = null;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_LT = "max_socket_num_lt";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_LT)
  private Integer maxSocketNumLt;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_LTE = "max_socket_num_lte";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_LTE)
  private Integer maxSocketNumLte;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_NOT = "max_socket_num_not";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT)
  private Integer maxSocketNumNot;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN = "max_socket_num_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM_NOT_IN)
  private List<Integer> maxSocketNumNotIn = null;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM = "max_vcpu_num";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM)
  private Integer maxVcpuNum;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM_GT = "max_vcpu_num_gt";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM_GT)
  private Integer maxVcpuNumGt;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM_GTE = "max_vcpu_num_gte";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM_GTE)
  private Integer maxVcpuNumGte;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM_IN = "max_vcpu_num_in";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM_IN)
  private List<Integer> maxVcpuNumIn = null;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM_LT = "max_vcpu_num_lt";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM_LT)
  private Integer maxVcpuNumLt;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM_LTE = "max_vcpu_num_lte";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM_LTE)
  private Integer maxVcpuNumLte;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM_NOT = "max_vcpu_num_not";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM_NOT)
  private Integer maxVcpuNumNot;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM_NOT_IN = "max_vcpu_num_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM_NOT_IN)
  private List<Integer> maxVcpuNumNotIn = null;

  public static final String SERIALIZED_NAME_MAX_VM_NUM = "max_vm_num";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM)
  private Integer maxVmNum;

  public static final String SERIALIZED_NAME_MAX_VM_NUM_GT = "max_vm_num_gt";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM_GT)
  private Integer maxVmNumGt;

  public static final String SERIALIZED_NAME_MAX_VM_NUM_GTE = "max_vm_num_gte";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM_GTE)
  private Integer maxVmNumGte;

  public static final String SERIALIZED_NAME_MAX_VM_NUM_IN = "max_vm_num_in";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM_IN)
  private List<Integer> maxVmNumIn = null;

  public static final String SERIALIZED_NAME_MAX_VM_NUM_LT = "max_vm_num_lt";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM_LT)
  private Integer maxVmNumLt;

  public static final String SERIALIZED_NAME_MAX_VM_NUM_LTE = "max_vm_num_lte";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM_LTE)
  private Integer maxVmNumLte;

  public static final String SERIALIZED_NAME_MAX_VM_NUM_NOT = "max_vm_num_not";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM_NOT)
  private Integer maxVmNumNot;

  public static final String SERIALIZED_NAME_MAX_VM_NUM_NOT_IN = "max_vm_num_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM_NOT_IN)
  private List<Integer> maxVmNumNotIn = null;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM = "max_vpc_socket_num";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM)
  private Integer maxVpcSocketNum;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_GT = "max_vpc_socket_num_gt";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_GT)
  private Integer maxVpcSocketNumGt;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_GTE = "max_vpc_socket_num_gte";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_GTE)
  private Integer maxVpcSocketNumGte;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_IN = "max_vpc_socket_num_in";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_IN)
  private List<Integer> maxVpcSocketNumIn = null;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_LT = "max_vpc_socket_num_lt";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_LT)
  private Integer maxVpcSocketNumLt;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_LTE = "max_vpc_socket_num_lte";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_LTE)
  private Integer maxVpcSocketNumLte;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_NOT = "max_vpc_socket_num_not";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_NOT)
  private Integer maxVpcSocketNumNot;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_NOT_IN = "max_vpc_socket_num_not_in";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM_NOT_IN)
  private List<Integer> maxVpcSocketNumNotIn = null;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  private EverouteLicensePricingType pricingType;

  public static final String SERIALIZED_NAME_PRICING_TYPE_IN = "pricing_type_in";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE_IN)
  private List<EverouteLicensePricingType> pricingTypeIn = null;

  public static final String SERIALIZED_NAME_PRICING_TYPE_NOT = "pricing_type_not";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE_NOT)
  private EverouteLicensePricingType pricingTypeNot;

  public static final String SERIALIZED_NAME_PRICING_TYPE_NOT_IN = "pricing_type_not_in";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE_NOT_IN)
  private List<EverouteLicensePricingType> pricingTypeNotIn = null;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SERIAL_CONTAINS = "serial_contains";
  @SerializedName(SERIALIZED_NAME_SERIAL_CONTAINS)
  private String serialContains;

  public static final String SERIALIZED_NAME_SERIAL_ENDS_WITH = "serial_ends_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_ENDS_WITH)
  private String serialEndsWith;

  public static final String SERIALIZED_NAME_SERIAL_GT = "serial_gt";
  @SerializedName(SERIALIZED_NAME_SERIAL_GT)
  private String serialGt;

  public static final String SERIALIZED_NAME_SERIAL_GTE = "serial_gte";
  @SerializedName(SERIALIZED_NAME_SERIAL_GTE)
  private String serialGte;

  public static final String SERIALIZED_NAME_SERIAL_IN = "serial_in";
  @SerializedName(SERIALIZED_NAME_SERIAL_IN)
  private List<String> serialIn = null;

  public static final String SERIALIZED_NAME_SERIAL_LT = "serial_lt";
  @SerializedName(SERIALIZED_NAME_SERIAL_LT)
  private String serialLt;

  public static final String SERIALIZED_NAME_SERIAL_LTE = "serial_lte";
  @SerializedName(SERIALIZED_NAME_SERIAL_LTE)
  private String serialLte;

  public static final String SERIALIZED_NAME_SERIAL_NOT = "serial_not";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT)
  private String serialNot;

  public static final String SERIALIZED_NAME_SERIAL_NOT_CONTAINS = "serial_not_contains";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_CONTAINS)
  private String serialNotContains;

  public static final String SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH = "serial_not_ends_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH)
  private String serialNotEndsWith;

  public static final String SERIALIZED_NAME_SERIAL_NOT_IN = "serial_not_in";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_IN)
  private List<String> serialNotIn = null;

  public static final String SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH = "serial_not_starts_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH)
  private String serialNotStartsWith;

  public static final String SERIALIZED_NAME_SERIAL_STARTS_WITH = "serial_starts_with";
  @SerializedName(SERIALIZED_NAME_SERIAL_STARTS_WITH)
  private String serialStartsWith;

  public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE)
  private String signDate;

  public static final String SERIALIZED_NAME_SIGN_DATE_GT = "sign_date_gt";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE_GT)
  private String signDateGt;

  public static final String SERIALIZED_NAME_SIGN_DATE_GTE = "sign_date_gte";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE_GTE)
  private String signDateGte;

  public static final String SERIALIZED_NAME_SIGN_DATE_IN = "sign_date_in";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE_IN)
  private List<String> signDateIn = null;

  public static final String SERIALIZED_NAME_SIGN_DATE_LT = "sign_date_lt";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE_LT)
  private String signDateLt;

  public static final String SERIALIZED_NAME_SIGN_DATE_LTE = "sign_date_lte";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE_LTE)
  private String signDateLte;

  public static final String SERIALIZED_NAME_SIGN_DATE_NOT = "sign_date_not";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT)
  private String signDateNot;

  public static final String SERIALIZED_NAME_SIGN_DATE_NOT_IN = "sign_date_not_in";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE_NOT_IN)
  private List<String> signDateNotIn = null;

  public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
  private SoftwareEdition softwareEdition;

  public static final String SERIALIZED_NAME_SOFTWARE_EDITION_IN = "software_edition_in";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_IN)
  private List<SoftwareEdition> softwareEditionIn = null;

  public static final String SERIALIZED_NAME_SOFTWARE_EDITION_NOT = "software_edition_not";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_NOT)
  private SoftwareEdition softwareEditionNot;

  public static final String SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN = "software_edition_not_in";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION_NOT_IN)
  private List<SoftwareEdition> softwareEditionNotIn = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LicenseType type;

  public static final String SERIALIZED_NAME_TYPE_IN = "type_in";
  @SerializedName(SERIALIZED_NAME_TYPE_IN)
  private List<LicenseType> typeIn = null;

  public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT)
  private LicenseType typeNot;

  public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";
  @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
  private List<LicenseType> typeNotIn = null;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_UID_CONTAINS = "uid_contains";
  @SerializedName(SERIALIZED_NAME_UID_CONTAINS)
  private String uidContains;

  public static final String SERIALIZED_NAME_UID_ENDS_WITH = "uid_ends_with";
  @SerializedName(SERIALIZED_NAME_UID_ENDS_WITH)
  private String uidEndsWith;

  public static final String SERIALIZED_NAME_UID_GT = "uid_gt";
  @SerializedName(SERIALIZED_NAME_UID_GT)
  private String uidGt;

  public static final String SERIALIZED_NAME_UID_GTE = "uid_gte";
  @SerializedName(SERIALIZED_NAME_UID_GTE)
  private String uidGte;

  public static final String SERIALIZED_NAME_UID_IN = "uid_in";
  @SerializedName(SERIALIZED_NAME_UID_IN)
  private List<String> uidIn = null;

  public static final String SERIALIZED_NAME_UID_LT = "uid_lt";
  @SerializedName(SERIALIZED_NAME_UID_LT)
  private String uidLt;

  public static final String SERIALIZED_NAME_UID_LTE = "uid_lte";
  @SerializedName(SERIALIZED_NAME_UID_LTE)
  private String uidLte;

  public static final String SERIALIZED_NAME_UID_NOT = "uid_not";
  @SerializedName(SERIALIZED_NAME_UID_NOT)
  private String uidNot;

  public static final String SERIALIZED_NAME_UID_NOT_CONTAINS = "uid_not_contains";
  @SerializedName(SERIALIZED_NAME_UID_NOT_CONTAINS)
  private String uidNotContains;

  public static final String SERIALIZED_NAME_UID_NOT_ENDS_WITH = "uid_not_ends_with";
  @SerializedName(SERIALIZED_NAME_UID_NOT_ENDS_WITH)
  private String uidNotEndsWith;

  public static final String SERIALIZED_NAME_UID_NOT_IN = "uid_not_in";
  @SerializedName(SERIALIZED_NAME_UID_NOT_IN)
  private List<String> uidNotIn = null;

  public static final String SERIALIZED_NAME_UID_NOT_STARTS_WITH = "uid_not_starts_with";
  @SerializedName(SERIALIZED_NAME_UID_NOT_STARTS_WITH)
  private String uidNotStartsWith;

  public static final String SERIALIZED_NAME_UID_STARTS_WITH = "uid_starts_with";
  @SerializedName(SERIALIZED_NAME_UID_STARTS_WITH)
  private String uidStartsWith;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";
  @SerializedName(SERIALIZED_NAME_VERSION_GT)
  private Integer versionGt;

  public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";
  @SerializedName(SERIALIZED_NAME_VERSION_GTE)
  private Integer versionGte;

  public static final String SERIALIZED_NAME_VERSION_IN = "version_in";
  @SerializedName(SERIALIZED_NAME_VERSION_IN)
  private List<Integer> versionIn = null;

  public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";
  @SerializedName(SERIALIZED_NAME_VERSION_LT)
  private Integer versionLt;

  public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";
  @SerializedName(SERIALIZED_NAME_VERSION_LTE)
  private Integer versionLte;

  public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT)
  private Integer versionNot;

  public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";
  @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
  private List<Integer> versionNotIn = null;

  public V2EverouteLicenseWhereInput() { 
  }

  public V2EverouteLicenseWhereInput AND(List<V2EverouteLicenseWhereInput> AND) {
    
    this.AND = AND;
    return this;
  }

  public V2EverouteLicenseWhereInput addANDItem(V2EverouteLicenseWhereInput ANDItem) {
    if (this.AND == null) {
      this.AND = new ArrayList<V2EverouteLicenseWhereInput>();
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

  public List<V2EverouteLicenseWhereInput> getAND() {
    return AND;
  }


  public void setAND(List<V2EverouteLicenseWhereInput> AND) {
    this.AND = AND;
  }


  public V2EverouteLicenseWhereInput NOT(List<V2EverouteLicenseWhereInput> NOT) {
    
    this.NOT = NOT;
    return this;
  }

  public V2EverouteLicenseWhereInput addNOTItem(V2EverouteLicenseWhereInput NOTItem) {
    if (this.NOT == null) {
      this.NOT = new ArrayList<V2EverouteLicenseWhereInput>();
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

  public List<V2EverouteLicenseWhereInput> getNOT() {
    return NOT;
  }


  public void setNOT(List<V2EverouteLicenseWhereInput> NOT) {
    this.NOT = NOT;
  }


  public V2EverouteLicenseWhereInput OR(List<V2EverouteLicenseWhereInput> OR) {
    
    this.OR = OR;
    return this;
  }

  public V2EverouteLicenseWhereInput addORItem(V2EverouteLicenseWhereInput ORItem) {
    if (this.OR == null) {
      this.OR = new ArrayList<V2EverouteLicenseWhereInput>();
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

  public List<V2EverouteLicenseWhereInput> getOR() {
    return OR;
  }


  public void setOR(List<V2EverouteLicenseWhereInput> OR) {
    this.OR = OR;
  }


  public V2EverouteLicenseWhereInput code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public V2EverouteLicenseWhereInput codeContains(String codeContains) {
    
    this.codeContains = codeContains;
    return this;
  }

   /**
   * Get codeContains
   * @return codeContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeContains() {
    return codeContains;
  }


  public void setCodeContains(String codeContains) {
    this.codeContains = codeContains;
  }


  public V2EverouteLicenseWhereInput codeEndsWith(String codeEndsWith) {
    
    this.codeEndsWith = codeEndsWith;
    return this;
  }

   /**
   * Get codeEndsWith
   * @return codeEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeEndsWith() {
    return codeEndsWith;
  }


  public void setCodeEndsWith(String codeEndsWith) {
    this.codeEndsWith = codeEndsWith;
  }


  public V2EverouteLicenseWhereInput codeGt(String codeGt) {
    
    this.codeGt = codeGt;
    return this;
  }

   /**
   * Get codeGt
   * @return codeGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeGt() {
    return codeGt;
  }


  public void setCodeGt(String codeGt) {
    this.codeGt = codeGt;
  }


  public V2EverouteLicenseWhereInput codeGte(String codeGte) {
    
    this.codeGte = codeGte;
    return this;
  }

   /**
   * Get codeGte
   * @return codeGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeGte() {
    return codeGte;
  }


  public void setCodeGte(String codeGte) {
    this.codeGte = codeGte;
  }


  public V2EverouteLicenseWhereInput codeIn(List<String> codeIn) {
    
    this.codeIn = codeIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addCodeInItem(String codeInItem) {
    if (this.codeIn == null) {
      this.codeIn = new ArrayList<String>();
    }
    this.codeIn.add(codeInItem);
    return this;
  }

   /**
   * Get codeIn
   * @return codeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCodeIn() {
    return codeIn;
  }


  public void setCodeIn(List<String> codeIn) {
    this.codeIn = codeIn;
  }


  public V2EverouteLicenseWhereInput codeLt(String codeLt) {
    
    this.codeLt = codeLt;
    return this;
  }

   /**
   * Get codeLt
   * @return codeLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeLt() {
    return codeLt;
  }


  public void setCodeLt(String codeLt) {
    this.codeLt = codeLt;
  }


  public V2EverouteLicenseWhereInput codeLte(String codeLte) {
    
    this.codeLte = codeLte;
    return this;
  }

   /**
   * Get codeLte
   * @return codeLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeLte() {
    return codeLte;
  }


  public void setCodeLte(String codeLte) {
    this.codeLte = codeLte;
  }


  public V2EverouteLicenseWhereInput codeNot(String codeNot) {
    
    this.codeNot = codeNot;
    return this;
  }

   /**
   * Get codeNot
   * @return codeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeNot() {
    return codeNot;
  }


  public void setCodeNot(String codeNot) {
    this.codeNot = codeNot;
  }


  public V2EverouteLicenseWhereInput codeNotContains(String codeNotContains) {
    
    this.codeNotContains = codeNotContains;
    return this;
  }

   /**
   * Get codeNotContains
   * @return codeNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeNotContains() {
    return codeNotContains;
  }


  public void setCodeNotContains(String codeNotContains) {
    this.codeNotContains = codeNotContains;
  }


  public V2EverouteLicenseWhereInput codeNotEndsWith(String codeNotEndsWith) {
    
    this.codeNotEndsWith = codeNotEndsWith;
    return this;
  }

   /**
   * Get codeNotEndsWith
   * @return codeNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeNotEndsWith() {
    return codeNotEndsWith;
  }


  public void setCodeNotEndsWith(String codeNotEndsWith) {
    this.codeNotEndsWith = codeNotEndsWith;
  }


  public V2EverouteLicenseWhereInput codeNotIn(List<String> codeNotIn) {
    
    this.codeNotIn = codeNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addCodeNotInItem(String codeNotInItem) {
    if (this.codeNotIn == null) {
      this.codeNotIn = new ArrayList<String>();
    }
    this.codeNotIn.add(codeNotInItem);
    return this;
  }

   /**
   * Get codeNotIn
   * @return codeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCodeNotIn() {
    return codeNotIn;
  }


  public void setCodeNotIn(List<String> codeNotIn) {
    this.codeNotIn = codeNotIn;
  }


  public V2EverouteLicenseWhereInput codeNotStartsWith(String codeNotStartsWith) {
    
    this.codeNotStartsWith = codeNotStartsWith;
    return this;
  }

   /**
   * Get codeNotStartsWith
   * @return codeNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeNotStartsWith() {
    return codeNotStartsWith;
  }


  public void setCodeNotStartsWith(String codeNotStartsWith) {
    this.codeNotStartsWith = codeNotStartsWith;
  }


  public V2EverouteLicenseWhereInput codeStartsWith(String codeStartsWith) {
    
    this.codeStartsWith = codeStartsWith;
    return this;
  }

   /**
   * Get codeStartsWith
   * @return codeStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeStartsWith() {
    return codeStartsWith;
  }


  public void setCodeStartsWith(String codeStartsWith) {
    this.codeStartsWith = codeStartsWith;
  }


  public V2EverouteLicenseWhereInput expireDate(String expireDate) {
    
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpireDate() {
    return expireDate;
  }


  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }


  public V2EverouteLicenseWhereInput expireDateGt(String expireDateGt) {
    
    this.expireDateGt = expireDateGt;
    return this;
  }

   /**
   * Get expireDateGt
   * @return expireDateGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpireDateGt() {
    return expireDateGt;
  }


  public void setExpireDateGt(String expireDateGt) {
    this.expireDateGt = expireDateGt;
  }


  public V2EverouteLicenseWhereInput expireDateGte(String expireDateGte) {
    
    this.expireDateGte = expireDateGte;
    return this;
  }

   /**
   * Get expireDateGte
   * @return expireDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpireDateGte() {
    return expireDateGte;
  }


  public void setExpireDateGte(String expireDateGte) {
    this.expireDateGte = expireDateGte;
  }


  public V2EverouteLicenseWhereInput expireDateIn(List<String> expireDateIn) {
    
    this.expireDateIn = expireDateIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addExpireDateInItem(String expireDateInItem) {
    if (this.expireDateIn == null) {
      this.expireDateIn = new ArrayList<String>();
    }
    this.expireDateIn.add(expireDateInItem);
    return this;
  }

   /**
   * Get expireDateIn
   * @return expireDateIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExpireDateIn() {
    return expireDateIn;
  }


  public void setExpireDateIn(List<String> expireDateIn) {
    this.expireDateIn = expireDateIn;
  }


  public V2EverouteLicenseWhereInput expireDateLt(String expireDateLt) {
    
    this.expireDateLt = expireDateLt;
    return this;
  }

   /**
   * Get expireDateLt
   * @return expireDateLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpireDateLt() {
    return expireDateLt;
  }


  public void setExpireDateLt(String expireDateLt) {
    this.expireDateLt = expireDateLt;
  }


  public V2EverouteLicenseWhereInput expireDateLte(String expireDateLte) {
    
    this.expireDateLte = expireDateLte;
    return this;
  }

   /**
   * Get expireDateLte
   * @return expireDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpireDateLte() {
    return expireDateLte;
  }


  public void setExpireDateLte(String expireDateLte) {
    this.expireDateLte = expireDateLte;
  }


  public V2EverouteLicenseWhereInput expireDateNot(String expireDateNot) {
    
    this.expireDateNot = expireDateNot;
    return this;
  }

   /**
   * Get expireDateNot
   * @return expireDateNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpireDateNot() {
    return expireDateNot;
  }


  public void setExpireDateNot(String expireDateNot) {
    this.expireDateNot = expireDateNot;
  }


  public V2EverouteLicenseWhereInput expireDateNotIn(List<String> expireDateNotIn) {
    
    this.expireDateNotIn = expireDateNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addExpireDateNotInItem(String expireDateNotInItem) {
    if (this.expireDateNotIn == null) {
      this.expireDateNotIn = new ArrayList<String>();
    }
    this.expireDateNotIn.add(expireDateNotInItem);
    return this;
  }

   /**
   * Get expireDateNotIn
   * @return expireDateNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExpireDateNotIn() {
    return expireDateNotIn;
  }


  public void setExpireDateNotIn(List<String> expireDateNotIn) {
    this.expireDateNotIn = expireDateNotIn;
  }


  public V2EverouteLicenseWhereInput featureType(EverouteFeatureType featureType) {
    
    this.featureType = featureType;
    return this;
  }

   /**
   * Get featureType
   * @return featureType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteFeatureType getFeatureType() {
    return featureType;
  }


  public void setFeatureType(EverouteFeatureType featureType) {
    this.featureType = featureType;
  }


  public V2EverouteLicenseWhereInput featureTypeIn(List<EverouteFeatureType> featureTypeIn) {
    
    this.featureTypeIn = featureTypeIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addFeatureTypeInItem(EverouteFeatureType featureTypeInItem) {
    if (this.featureTypeIn == null) {
      this.featureTypeIn = new ArrayList<EverouteFeatureType>();
    }
    this.featureTypeIn.add(featureTypeInItem);
    return this;
  }

   /**
   * Get featureTypeIn
   * @return featureTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteFeatureType> getFeatureTypeIn() {
    return featureTypeIn;
  }


  public void setFeatureTypeIn(List<EverouteFeatureType> featureTypeIn) {
    this.featureTypeIn = featureTypeIn;
  }


  public V2EverouteLicenseWhereInput featureTypeNot(EverouteFeatureType featureTypeNot) {
    
    this.featureTypeNot = featureTypeNot;
    return this;
  }

   /**
   * Get featureTypeNot
   * @return featureTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteFeatureType getFeatureTypeNot() {
    return featureTypeNot;
  }


  public void setFeatureTypeNot(EverouteFeatureType featureTypeNot) {
    this.featureTypeNot = featureTypeNot;
  }


  public V2EverouteLicenseWhereInput featureTypeNotIn(List<EverouteFeatureType> featureTypeNotIn) {
    
    this.featureTypeNotIn = featureTypeNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addFeatureTypeNotInItem(EverouteFeatureType featureTypeNotInItem) {
    if (this.featureTypeNotIn == null) {
      this.featureTypeNotIn = new ArrayList<EverouteFeatureType>();
    }
    this.featureTypeNotIn.add(featureTypeNotInItem);
    return this;
  }

   /**
   * Get featureTypeNotIn
   * @return featureTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteFeatureType> getFeatureTypeNotIn() {
    return featureTypeNotIn;
  }


  public void setFeatureTypeNotIn(List<EverouteFeatureType> featureTypeNotIn) {
    this.featureTypeNotIn = featureTypeNotIn;
  }


  public V2EverouteLicenseWhereInput id(String id) {
    
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


  public V2EverouteLicenseWhereInput idContains(String idContains) {
    
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


  public V2EverouteLicenseWhereInput idEndsWith(String idEndsWith) {
    
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


  public V2EverouteLicenseWhereInput idGt(String idGt) {
    
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


  public V2EverouteLicenseWhereInput idGte(String idGte) {
    
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


  public V2EverouteLicenseWhereInput idIn(List<String> idIn) {
    
    this.idIn = idIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addIdInItem(String idInItem) {
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


  public V2EverouteLicenseWhereInput idLt(String idLt) {
    
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


  public V2EverouteLicenseWhereInput idLte(String idLte) {
    
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


  public V2EverouteLicenseWhereInput idNot(String idNot) {
    
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


  public V2EverouteLicenseWhereInput idNotContains(String idNotContains) {
    
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


  public V2EverouteLicenseWhereInput idNotEndsWith(String idNotEndsWith) {
    
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


  public V2EverouteLicenseWhereInput idNotIn(List<String> idNotIn) {
    
    this.idNotIn = idNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addIdNotInItem(String idNotInItem) {
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


  public V2EverouteLicenseWhereInput idNotStartsWith(String idNotStartsWith) {
    
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


  public V2EverouteLicenseWhereInput idStartsWith(String idStartsWith) {
    
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


  public V2EverouteLicenseWhereInput maxSocketNum(Integer maxSocketNum) {
    
    this.maxSocketNum = maxSocketNum;
    return this;
  }

   /**
   * Get maxSocketNum
   * @return maxSocketNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxSocketNum() {
    return maxSocketNum;
  }


  public void setMaxSocketNum(Integer maxSocketNum) {
    this.maxSocketNum = maxSocketNum;
  }


  public V2EverouteLicenseWhereInput maxSocketNumGt(Integer maxSocketNumGt) {
    
    this.maxSocketNumGt = maxSocketNumGt;
    return this;
  }

   /**
   * Get maxSocketNumGt
   * @return maxSocketNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxSocketNumGt() {
    return maxSocketNumGt;
  }


  public void setMaxSocketNumGt(Integer maxSocketNumGt) {
    this.maxSocketNumGt = maxSocketNumGt;
  }


  public V2EverouteLicenseWhereInput maxSocketNumGte(Integer maxSocketNumGte) {
    
    this.maxSocketNumGte = maxSocketNumGte;
    return this;
  }

   /**
   * Get maxSocketNumGte
   * @return maxSocketNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxSocketNumGte() {
    return maxSocketNumGte;
  }


  public void setMaxSocketNumGte(Integer maxSocketNumGte) {
    this.maxSocketNumGte = maxSocketNumGte;
  }


  public V2EverouteLicenseWhereInput maxSocketNumIn(List<Integer> maxSocketNumIn) {
    
    this.maxSocketNumIn = maxSocketNumIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxSocketNumInItem(Integer maxSocketNumInItem) {
    if (this.maxSocketNumIn == null) {
      this.maxSocketNumIn = new ArrayList<Integer>();
    }
    this.maxSocketNumIn.add(maxSocketNumInItem);
    return this;
  }

   /**
   * Get maxSocketNumIn
   * @return maxSocketNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxSocketNumIn() {
    return maxSocketNumIn;
  }


  public void setMaxSocketNumIn(List<Integer> maxSocketNumIn) {
    this.maxSocketNumIn = maxSocketNumIn;
  }


  public V2EverouteLicenseWhereInput maxSocketNumLt(Integer maxSocketNumLt) {
    
    this.maxSocketNumLt = maxSocketNumLt;
    return this;
  }

   /**
   * Get maxSocketNumLt
   * @return maxSocketNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxSocketNumLt() {
    return maxSocketNumLt;
  }


  public void setMaxSocketNumLt(Integer maxSocketNumLt) {
    this.maxSocketNumLt = maxSocketNumLt;
  }


  public V2EverouteLicenseWhereInput maxSocketNumLte(Integer maxSocketNumLte) {
    
    this.maxSocketNumLte = maxSocketNumLte;
    return this;
  }

   /**
   * Get maxSocketNumLte
   * @return maxSocketNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxSocketNumLte() {
    return maxSocketNumLte;
  }


  public void setMaxSocketNumLte(Integer maxSocketNumLte) {
    this.maxSocketNumLte = maxSocketNumLte;
  }


  public V2EverouteLicenseWhereInput maxSocketNumNot(Integer maxSocketNumNot) {
    
    this.maxSocketNumNot = maxSocketNumNot;
    return this;
  }

   /**
   * Get maxSocketNumNot
   * @return maxSocketNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxSocketNumNot() {
    return maxSocketNumNot;
  }


  public void setMaxSocketNumNot(Integer maxSocketNumNot) {
    this.maxSocketNumNot = maxSocketNumNot;
  }


  public V2EverouteLicenseWhereInput maxSocketNumNotIn(List<Integer> maxSocketNumNotIn) {
    
    this.maxSocketNumNotIn = maxSocketNumNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxSocketNumNotInItem(Integer maxSocketNumNotInItem) {
    if (this.maxSocketNumNotIn == null) {
      this.maxSocketNumNotIn = new ArrayList<Integer>();
    }
    this.maxSocketNumNotIn.add(maxSocketNumNotInItem);
    return this;
  }

   /**
   * Get maxSocketNumNotIn
   * @return maxSocketNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxSocketNumNotIn() {
    return maxSocketNumNotIn;
  }


  public void setMaxSocketNumNotIn(List<Integer> maxSocketNumNotIn) {
    this.maxSocketNumNotIn = maxSocketNumNotIn;
  }


  public V2EverouteLicenseWhereInput maxVcpuNum(Integer maxVcpuNum) {
    
    this.maxVcpuNum = maxVcpuNum;
    return this;
  }

   /**
   * Get maxVcpuNum
   * @return maxVcpuNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVcpuNum() {
    return maxVcpuNum;
  }


  public void setMaxVcpuNum(Integer maxVcpuNum) {
    this.maxVcpuNum = maxVcpuNum;
  }


  public V2EverouteLicenseWhereInput maxVcpuNumGt(Integer maxVcpuNumGt) {
    
    this.maxVcpuNumGt = maxVcpuNumGt;
    return this;
  }

   /**
   * Get maxVcpuNumGt
   * @return maxVcpuNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVcpuNumGt() {
    return maxVcpuNumGt;
  }


  public void setMaxVcpuNumGt(Integer maxVcpuNumGt) {
    this.maxVcpuNumGt = maxVcpuNumGt;
  }


  public V2EverouteLicenseWhereInput maxVcpuNumGte(Integer maxVcpuNumGte) {
    
    this.maxVcpuNumGte = maxVcpuNumGte;
    return this;
  }

   /**
   * Get maxVcpuNumGte
   * @return maxVcpuNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVcpuNumGte() {
    return maxVcpuNumGte;
  }


  public void setMaxVcpuNumGte(Integer maxVcpuNumGte) {
    this.maxVcpuNumGte = maxVcpuNumGte;
  }


  public V2EverouteLicenseWhereInput maxVcpuNumIn(List<Integer> maxVcpuNumIn) {
    
    this.maxVcpuNumIn = maxVcpuNumIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxVcpuNumInItem(Integer maxVcpuNumInItem) {
    if (this.maxVcpuNumIn == null) {
      this.maxVcpuNumIn = new ArrayList<Integer>();
    }
    this.maxVcpuNumIn.add(maxVcpuNumInItem);
    return this;
  }

   /**
   * Get maxVcpuNumIn
   * @return maxVcpuNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVcpuNumIn() {
    return maxVcpuNumIn;
  }


  public void setMaxVcpuNumIn(List<Integer> maxVcpuNumIn) {
    this.maxVcpuNumIn = maxVcpuNumIn;
  }


  public V2EverouteLicenseWhereInput maxVcpuNumLt(Integer maxVcpuNumLt) {
    
    this.maxVcpuNumLt = maxVcpuNumLt;
    return this;
  }

   /**
   * Get maxVcpuNumLt
   * @return maxVcpuNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVcpuNumLt() {
    return maxVcpuNumLt;
  }


  public void setMaxVcpuNumLt(Integer maxVcpuNumLt) {
    this.maxVcpuNumLt = maxVcpuNumLt;
  }


  public V2EverouteLicenseWhereInput maxVcpuNumLte(Integer maxVcpuNumLte) {
    
    this.maxVcpuNumLte = maxVcpuNumLte;
    return this;
  }

   /**
   * Get maxVcpuNumLte
   * @return maxVcpuNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVcpuNumLte() {
    return maxVcpuNumLte;
  }


  public void setMaxVcpuNumLte(Integer maxVcpuNumLte) {
    this.maxVcpuNumLte = maxVcpuNumLte;
  }


  public V2EverouteLicenseWhereInput maxVcpuNumNot(Integer maxVcpuNumNot) {
    
    this.maxVcpuNumNot = maxVcpuNumNot;
    return this;
  }

   /**
   * Get maxVcpuNumNot
   * @return maxVcpuNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVcpuNumNot() {
    return maxVcpuNumNot;
  }


  public void setMaxVcpuNumNot(Integer maxVcpuNumNot) {
    this.maxVcpuNumNot = maxVcpuNumNot;
  }


  public V2EverouteLicenseWhereInput maxVcpuNumNotIn(List<Integer> maxVcpuNumNotIn) {
    
    this.maxVcpuNumNotIn = maxVcpuNumNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxVcpuNumNotInItem(Integer maxVcpuNumNotInItem) {
    if (this.maxVcpuNumNotIn == null) {
      this.maxVcpuNumNotIn = new ArrayList<Integer>();
    }
    this.maxVcpuNumNotIn.add(maxVcpuNumNotInItem);
    return this;
  }

   /**
   * Get maxVcpuNumNotIn
   * @return maxVcpuNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVcpuNumNotIn() {
    return maxVcpuNumNotIn;
  }


  public void setMaxVcpuNumNotIn(List<Integer> maxVcpuNumNotIn) {
    this.maxVcpuNumNotIn = maxVcpuNumNotIn;
  }


  public V2EverouteLicenseWhereInput maxVmNum(Integer maxVmNum) {
    
    this.maxVmNum = maxVmNum;
    return this;
  }

   /**
   * Get maxVmNum
   * @return maxVmNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVmNum() {
    return maxVmNum;
  }


  public void setMaxVmNum(Integer maxVmNum) {
    this.maxVmNum = maxVmNum;
  }


  public V2EverouteLicenseWhereInput maxVmNumGt(Integer maxVmNumGt) {
    
    this.maxVmNumGt = maxVmNumGt;
    return this;
  }

   /**
   * Get maxVmNumGt
   * @return maxVmNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVmNumGt() {
    return maxVmNumGt;
  }


  public void setMaxVmNumGt(Integer maxVmNumGt) {
    this.maxVmNumGt = maxVmNumGt;
  }


  public V2EverouteLicenseWhereInput maxVmNumGte(Integer maxVmNumGte) {
    
    this.maxVmNumGte = maxVmNumGte;
    return this;
  }

   /**
   * Get maxVmNumGte
   * @return maxVmNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVmNumGte() {
    return maxVmNumGte;
  }


  public void setMaxVmNumGte(Integer maxVmNumGte) {
    this.maxVmNumGte = maxVmNumGte;
  }


  public V2EverouteLicenseWhereInput maxVmNumIn(List<Integer> maxVmNumIn) {
    
    this.maxVmNumIn = maxVmNumIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxVmNumInItem(Integer maxVmNumInItem) {
    if (this.maxVmNumIn == null) {
      this.maxVmNumIn = new ArrayList<Integer>();
    }
    this.maxVmNumIn.add(maxVmNumInItem);
    return this;
  }

   /**
   * Get maxVmNumIn
   * @return maxVmNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVmNumIn() {
    return maxVmNumIn;
  }


  public void setMaxVmNumIn(List<Integer> maxVmNumIn) {
    this.maxVmNumIn = maxVmNumIn;
  }


  public V2EverouteLicenseWhereInput maxVmNumLt(Integer maxVmNumLt) {
    
    this.maxVmNumLt = maxVmNumLt;
    return this;
  }

   /**
   * Get maxVmNumLt
   * @return maxVmNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVmNumLt() {
    return maxVmNumLt;
  }


  public void setMaxVmNumLt(Integer maxVmNumLt) {
    this.maxVmNumLt = maxVmNumLt;
  }


  public V2EverouteLicenseWhereInput maxVmNumLte(Integer maxVmNumLte) {
    
    this.maxVmNumLte = maxVmNumLte;
    return this;
  }

   /**
   * Get maxVmNumLte
   * @return maxVmNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVmNumLte() {
    return maxVmNumLte;
  }


  public void setMaxVmNumLte(Integer maxVmNumLte) {
    this.maxVmNumLte = maxVmNumLte;
  }


  public V2EverouteLicenseWhereInput maxVmNumNot(Integer maxVmNumNot) {
    
    this.maxVmNumNot = maxVmNumNot;
    return this;
  }

   /**
   * Get maxVmNumNot
   * @return maxVmNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVmNumNot() {
    return maxVmNumNot;
  }


  public void setMaxVmNumNot(Integer maxVmNumNot) {
    this.maxVmNumNot = maxVmNumNot;
  }


  public V2EverouteLicenseWhereInput maxVmNumNotIn(List<Integer> maxVmNumNotIn) {
    
    this.maxVmNumNotIn = maxVmNumNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxVmNumNotInItem(Integer maxVmNumNotInItem) {
    if (this.maxVmNumNotIn == null) {
      this.maxVmNumNotIn = new ArrayList<Integer>();
    }
    this.maxVmNumNotIn.add(maxVmNumNotInItem);
    return this;
  }

   /**
   * Get maxVmNumNotIn
   * @return maxVmNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVmNumNotIn() {
    return maxVmNumNotIn;
  }


  public void setMaxVmNumNotIn(List<Integer> maxVmNumNotIn) {
    this.maxVmNumNotIn = maxVmNumNotIn;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNum(Integer maxVpcSocketNum) {
    
    this.maxVpcSocketNum = maxVpcSocketNum;
    return this;
  }

   /**
   * Get maxVpcSocketNum
   * @return maxVpcSocketNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVpcSocketNum() {
    return maxVpcSocketNum;
  }


  public void setMaxVpcSocketNum(Integer maxVpcSocketNum) {
    this.maxVpcSocketNum = maxVpcSocketNum;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNumGt(Integer maxVpcSocketNumGt) {
    
    this.maxVpcSocketNumGt = maxVpcSocketNumGt;
    return this;
  }

   /**
   * Get maxVpcSocketNumGt
   * @return maxVpcSocketNumGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVpcSocketNumGt() {
    return maxVpcSocketNumGt;
  }


  public void setMaxVpcSocketNumGt(Integer maxVpcSocketNumGt) {
    this.maxVpcSocketNumGt = maxVpcSocketNumGt;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNumGte(Integer maxVpcSocketNumGte) {
    
    this.maxVpcSocketNumGte = maxVpcSocketNumGte;
    return this;
  }

   /**
   * Get maxVpcSocketNumGte
   * @return maxVpcSocketNumGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVpcSocketNumGte() {
    return maxVpcSocketNumGte;
  }


  public void setMaxVpcSocketNumGte(Integer maxVpcSocketNumGte) {
    this.maxVpcSocketNumGte = maxVpcSocketNumGte;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNumIn(List<Integer> maxVpcSocketNumIn) {
    
    this.maxVpcSocketNumIn = maxVpcSocketNumIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxVpcSocketNumInItem(Integer maxVpcSocketNumInItem) {
    if (this.maxVpcSocketNumIn == null) {
      this.maxVpcSocketNumIn = new ArrayList<Integer>();
    }
    this.maxVpcSocketNumIn.add(maxVpcSocketNumInItem);
    return this;
  }

   /**
   * Get maxVpcSocketNumIn
   * @return maxVpcSocketNumIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVpcSocketNumIn() {
    return maxVpcSocketNumIn;
  }


  public void setMaxVpcSocketNumIn(List<Integer> maxVpcSocketNumIn) {
    this.maxVpcSocketNumIn = maxVpcSocketNumIn;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNumLt(Integer maxVpcSocketNumLt) {
    
    this.maxVpcSocketNumLt = maxVpcSocketNumLt;
    return this;
  }

   /**
   * Get maxVpcSocketNumLt
   * @return maxVpcSocketNumLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVpcSocketNumLt() {
    return maxVpcSocketNumLt;
  }


  public void setMaxVpcSocketNumLt(Integer maxVpcSocketNumLt) {
    this.maxVpcSocketNumLt = maxVpcSocketNumLt;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNumLte(Integer maxVpcSocketNumLte) {
    
    this.maxVpcSocketNumLte = maxVpcSocketNumLte;
    return this;
  }

   /**
   * Get maxVpcSocketNumLte
   * @return maxVpcSocketNumLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVpcSocketNumLte() {
    return maxVpcSocketNumLte;
  }


  public void setMaxVpcSocketNumLte(Integer maxVpcSocketNumLte) {
    this.maxVpcSocketNumLte = maxVpcSocketNumLte;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNumNot(Integer maxVpcSocketNumNot) {
    
    this.maxVpcSocketNumNot = maxVpcSocketNumNot;
    return this;
  }

   /**
   * Get maxVpcSocketNumNot
   * @return maxVpcSocketNumNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxVpcSocketNumNot() {
    return maxVpcSocketNumNot;
  }


  public void setMaxVpcSocketNumNot(Integer maxVpcSocketNumNot) {
    this.maxVpcSocketNumNot = maxVpcSocketNumNot;
  }


  public V2EverouteLicenseWhereInput maxVpcSocketNumNotIn(List<Integer> maxVpcSocketNumNotIn) {
    
    this.maxVpcSocketNumNotIn = maxVpcSocketNumNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addMaxVpcSocketNumNotInItem(Integer maxVpcSocketNumNotInItem) {
    if (this.maxVpcSocketNumNotIn == null) {
      this.maxVpcSocketNumNotIn = new ArrayList<Integer>();
    }
    this.maxVpcSocketNumNotIn.add(maxVpcSocketNumNotInItem);
    return this;
  }

   /**
   * Get maxVpcSocketNumNotIn
   * @return maxVpcSocketNumNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMaxVpcSocketNumNotIn() {
    return maxVpcSocketNumNotIn;
  }


  public void setMaxVpcSocketNumNotIn(List<Integer> maxVpcSocketNumNotIn) {
    this.maxVpcSocketNumNotIn = maxVpcSocketNumNotIn;
  }


  public V2EverouteLicenseWhereInput pricingType(EverouteLicensePricingType pricingType) {
    
    this.pricingType = pricingType;
    return this;
  }

   /**
   * Get pricingType
   * @return pricingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteLicensePricingType getPricingType() {
    return pricingType;
  }


  public void setPricingType(EverouteLicensePricingType pricingType) {
    this.pricingType = pricingType;
  }


  public V2EverouteLicenseWhereInput pricingTypeIn(List<EverouteLicensePricingType> pricingTypeIn) {
    
    this.pricingTypeIn = pricingTypeIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addPricingTypeInItem(EverouteLicensePricingType pricingTypeInItem) {
    if (this.pricingTypeIn == null) {
      this.pricingTypeIn = new ArrayList<EverouteLicensePricingType>();
    }
    this.pricingTypeIn.add(pricingTypeInItem);
    return this;
  }

   /**
   * Get pricingTypeIn
   * @return pricingTypeIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteLicensePricingType> getPricingTypeIn() {
    return pricingTypeIn;
  }


  public void setPricingTypeIn(List<EverouteLicensePricingType> pricingTypeIn) {
    this.pricingTypeIn = pricingTypeIn;
  }


  public V2EverouteLicenseWhereInput pricingTypeNot(EverouteLicensePricingType pricingTypeNot) {
    
    this.pricingTypeNot = pricingTypeNot;
    return this;
  }

   /**
   * Get pricingTypeNot
   * @return pricingTypeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EverouteLicensePricingType getPricingTypeNot() {
    return pricingTypeNot;
  }


  public void setPricingTypeNot(EverouteLicensePricingType pricingTypeNot) {
    this.pricingTypeNot = pricingTypeNot;
  }


  public V2EverouteLicenseWhereInput pricingTypeNotIn(List<EverouteLicensePricingType> pricingTypeNotIn) {
    
    this.pricingTypeNotIn = pricingTypeNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addPricingTypeNotInItem(EverouteLicensePricingType pricingTypeNotInItem) {
    if (this.pricingTypeNotIn == null) {
      this.pricingTypeNotIn = new ArrayList<EverouteLicensePricingType>();
    }
    this.pricingTypeNotIn.add(pricingTypeNotInItem);
    return this;
  }

   /**
   * Get pricingTypeNotIn
   * @return pricingTypeNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EverouteLicensePricingType> getPricingTypeNotIn() {
    return pricingTypeNotIn;
  }


  public void setPricingTypeNotIn(List<EverouteLicensePricingType> pricingTypeNotIn) {
    this.pricingTypeNotIn = pricingTypeNotIn;
  }


  public V2EverouteLicenseWhereInput serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public V2EverouteLicenseWhereInput serialContains(String serialContains) {
    
    this.serialContains = serialContains;
    return this;
  }

   /**
   * Get serialContains
   * @return serialContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialContains() {
    return serialContains;
  }


  public void setSerialContains(String serialContains) {
    this.serialContains = serialContains;
  }


  public V2EverouteLicenseWhereInput serialEndsWith(String serialEndsWith) {
    
    this.serialEndsWith = serialEndsWith;
    return this;
  }

   /**
   * Get serialEndsWith
   * @return serialEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialEndsWith() {
    return serialEndsWith;
  }


  public void setSerialEndsWith(String serialEndsWith) {
    this.serialEndsWith = serialEndsWith;
  }


  public V2EverouteLicenseWhereInput serialGt(String serialGt) {
    
    this.serialGt = serialGt;
    return this;
  }

   /**
   * Get serialGt
   * @return serialGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialGt() {
    return serialGt;
  }


  public void setSerialGt(String serialGt) {
    this.serialGt = serialGt;
  }


  public V2EverouteLicenseWhereInput serialGte(String serialGte) {
    
    this.serialGte = serialGte;
    return this;
  }

   /**
   * Get serialGte
   * @return serialGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialGte() {
    return serialGte;
  }


  public void setSerialGte(String serialGte) {
    this.serialGte = serialGte;
  }


  public V2EverouteLicenseWhereInput serialIn(List<String> serialIn) {
    
    this.serialIn = serialIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addSerialInItem(String serialInItem) {
    if (this.serialIn == null) {
      this.serialIn = new ArrayList<String>();
    }
    this.serialIn.add(serialInItem);
    return this;
  }

   /**
   * Get serialIn
   * @return serialIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSerialIn() {
    return serialIn;
  }


  public void setSerialIn(List<String> serialIn) {
    this.serialIn = serialIn;
  }


  public V2EverouteLicenseWhereInput serialLt(String serialLt) {
    
    this.serialLt = serialLt;
    return this;
  }

   /**
   * Get serialLt
   * @return serialLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialLt() {
    return serialLt;
  }


  public void setSerialLt(String serialLt) {
    this.serialLt = serialLt;
  }


  public V2EverouteLicenseWhereInput serialLte(String serialLte) {
    
    this.serialLte = serialLte;
    return this;
  }

   /**
   * Get serialLte
   * @return serialLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialLte() {
    return serialLte;
  }


  public void setSerialLte(String serialLte) {
    this.serialLte = serialLte;
  }


  public V2EverouteLicenseWhereInput serialNot(String serialNot) {
    
    this.serialNot = serialNot;
    return this;
  }

   /**
   * Get serialNot
   * @return serialNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNot() {
    return serialNot;
  }


  public void setSerialNot(String serialNot) {
    this.serialNot = serialNot;
  }


  public V2EverouteLicenseWhereInput serialNotContains(String serialNotContains) {
    
    this.serialNotContains = serialNotContains;
    return this;
  }

   /**
   * Get serialNotContains
   * @return serialNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNotContains() {
    return serialNotContains;
  }


  public void setSerialNotContains(String serialNotContains) {
    this.serialNotContains = serialNotContains;
  }


  public V2EverouteLicenseWhereInput serialNotEndsWith(String serialNotEndsWith) {
    
    this.serialNotEndsWith = serialNotEndsWith;
    return this;
  }

   /**
   * Get serialNotEndsWith
   * @return serialNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNotEndsWith() {
    return serialNotEndsWith;
  }


  public void setSerialNotEndsWith(String serialNotEndsWith) {
    this.serialNotEndsWith = serialNotEndsWith;
  }


  public V2EverouteLicenseWhereInput serialNotIn(List<String> serialNotIn) {
    
    this.serialNotIn = serialNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addSerialNotInItem(String serialNotInItem) {
    if (this.serialNotIn == null) {
      this.serialNotIn = new ArrayList<String>();
    }
    this.serialNotIn.add(serialNotInItem);
    return this;
  }

   /**
   * Get serialNotIn
   * @return serialNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSerialNotIn() {
    return serialNotIn;
  }


  public void setSerialNotIn(List<String> serialNotIn) {
    this.serialNotIn = serialNotIn;
  }


  public V2EverouteLicenseWhereInput serialNotStartsWith(String serialNotStartsWith) {
    
    this.serialNotStartsWith = serialNotStartsWith;
    return this;
  }

   /**
   * Get serialNotStartsWith
   * @return serialNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNotStartsWith() {
    return serialNotStartsWith;
  }


  public void setSerialNotStartsWith(String serialNotStartsWith) {
    this.serialNotStartsWith = serialNotStartsWith;
  }


  public V2EverouteLicenseWhereInput serialStartsWith(String serialStartsWith) {
    
    this.serialStartsWith = serialStartsWith;
    return this;
  }

   /**
   * Get serialStartsWith
   * @return serialStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialStartsWith() {
    return serialStartsWith;
  }


  public void setSerialStartsWith(String serialStartsWith) {
    this.serialStartsWith = serialStartsWith;
  }


  public V2EverouteLicenseWhereInput signDate(String signDate) {
    
    this.signDate = signDate;
    return this;
  }

   /**
   * Get signDate
   * @return signDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignDate() {
    return signDate;
  }


  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }


  public V2EverouteLicenseWhereInput signDateGt(String signDateGt) {
    
    this.signDateGt = signDateGt;
    return this;
  }

   /**
   * Get signDateGt
   * @return signDateGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignDateGt() {
    return signDateGt;
  }


  public void setSignDateGt(String signDateGt) {
    this.signDateGt = signDateGt;
  }


  public V2EverouteLicenseWhereInput signDateGte(String signDateGte) {
    
    this.signDateGte = signDateGte;
    return this;
  }

   /**
   * Get signDateGte
   * @return signDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignDateGte() {
    return signDateGte;
  }


  public void setSignDateGte(String signDateGte) {
    this.signDateGte = signDateGte;
  }


  public V2EverouteLicenseWhereInput signDateIn(List<String> signDateIn) {
    
    this.signDateIn = signDateIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addSignDateInItem(String signDateInItem) {
    if (this.signDateIn == null) {
      this.signDateIn = new ArrayList<String>();
    }
    this.signDateIn.add(signDateInItem);
    return this;
  }

   /**
   * Get signDateIn
   * @return signDateIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSignDateIn() {
    return signDateIn;
  }


  public void setSignDateIn(List<String> signDateIn) {
    this.signDateIn = signDateIn;
  }


  public V2EverouteLicenseWhereInput signDateLt(String signDateLt) {
    
    this.signDateLt = signDateLt;
    return this;
  }

   /**
   * Get signDateLt
   * @return signDateLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignDateLt() {
    return signDateLt;
  }


  public void setSignDateLt(String signDateLt) {
    this.signDateLt = signDateLt;
  }


  public V2EverouteLicenseWhereInput signDateLte(String signDateLte) {
    
    this.signDateLte = signDateLte;
    return this;
  }

   /**
   * Get signDateLte
   * @return signDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignDateLte() {
    return signDateLte;
  }


  public void setSignDateLte(String signDateLte) {
    this.signDateLte = signDateLte;
  }


  public V2EverouteLicenseWhereInput signDateNot(String signDateNot) {
    
    this.signDateNot = signDateNot;
    return this;
  }

   /**
   * Get signDateNot
   * @return signDateNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignDateNot() {
    return signDateNot;
  }


  public void setSignDateNot(String signDateNot) {
    this.signDateNot = signDateNot;
  }


  public V2EverouteLicenseWhereInput signDateNotIn(List<String> signDateNotIn) {
    
    this.signDateNotIn = signDateNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addSignDateNotInItem(String signDateNotInItem) {
    if (this.signDateNotIn == null) {
      this.signDateNotIn = new ArrayList<String>();
    }
    this.signDateNotIn.add(signDateNotInItem);
    return this;
  }

   /**
   * Get signDateNotIn
   * @return signDateNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSignDateNotIn() {
    return signDateNotIn;
  }


  public void setSignDateNotIn(List<String> signDateNotIn) {
    this.signDateNotIn = signDateNotIn;
  }


  public V2EverouteLicenseWhereInput softwareEdition(SoftwareEdition softwareEdition) {
    
    this.softwareEdition = softwareEdition;
    return this;
  }

   /**
   * Get softwareEdition
   * @return softwareEdition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoftwareEdition getSoftwareEdition() {
    return softwareEdition;
  }


  public void setSoftwareEdition(SoftwareEdition softwareEdition) {
    this.softwareEdition = softwareEdition;
  }


  public V2EverouteLicenseWhereInput softwareEditionIn(List<SoftwareEdition> softwareEditionIn) {
    
    this.softwareEditionIn = softwareEditionIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addSoftwareEditionInItem(SoftwareEdition softwareEditionInItem) {
    if (this.softwareEditionIn == null) {
      this.softwareEditionIn = new ArrayList<SoftwareEdition>();
    }
    this.softwareEditionIn.add(softwareEditionInItem);
    return this;
  }

   /**
   * Get softwareEditionIn
   * @return softwareEditionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SoftwareEdition> getSoftwareEditionIn() {
    return softwareEditionIn;
  }


  public void setSoftwareEditionIn(List<SoftwareEdition> softwareEditionIn) {
    this.softwareEditionIn = softwareEditionIn;
  }


  public V2EverouteLicenseWhereInput softwareEditionNot(SoftwareEdition softwareEditionNot) {
    
    this.softwareEditionNot = softwareEditionNot;
    return this;
  }

   /**
   * Get softwareEditionNot
   * @return softwareEditionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SoftwareEdition getSoftwareEditionNot() {
    return softwareEditionNot;
  }


  public void setSoftwareEditionNot(SoftwareEdition softwareEditionNot) {
    this.softwareEditionNot = softwareEditionNot;
  }


  public V2EverouteLicenseWhereInput softwareEditionNotIn(List<SoftwareEdition> softwareEditionNotIn) {
    
    this.softwareEditionNotIn = softwareEditionNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addSoftwareEditionNotInItem(SoftwareEdition softwareEditionNotInItem) {
    if (this.softwareEditionNotIn == null) {
      this.softwareEditionNotIn = new ArrayList<SoftwareEdition>();
    }
    this.softwareEditionNotIn.add(softwareEditionNotInItem);
    return this;
  }

   /**
   * Get softwareEditionNotIn
   * @return softwareEditionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SoftwareEdition> getSoftwareEditionNotIn() {
    return softwareEditionNotIn;
  }


  public void setSoftwareEditionNotIn(List<SoftwareEdition> softwareEditionNotIn) {
    this.softwareEditionNotIn = softwareEditionNotIn;
  }


  public V2EverouteLicenseWhereInput type(LicenseType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LicenseType getType() {
    return type;
  }


  public void setType(LicenseType type) {
    this.type = type;
  }


  public V2EverouteLicenseWhereInput typeIn(List<LicenseType> typeIn) {
    
    this.typeIn = typeIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addTypeInItem(LicenseType typeInItem) {
    if (this.typeIn == null) {
      this.typeIn = new ArrayList<LicenseType>();
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

  public List<LicenseType> getTypeIn() {
    return typeIn;
  }


  public void setTypeIn(List<LicenseType> typeIn) {
    this.typeIn = typeIn;
  }


  public V2EverouteLicenseWhereInput typeNot(LicenseType typeNot) {
    
    this.typeNot = typeNot;
    return this;
  }

   /**
   * Get typeNot
   * @return typeNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LicenseType getTypeNot() {
    return typeNot;
  }


  public void setTypeNot(LicenseType typeNot) {
    this.typeNot = typeNot;
  }


  public V2EverouteLicenseWhereInput typeNotIn(List<LicenseType> typeNotIn) {
    
    this.typeNotIn = typeNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addTypeNotInItem(LicenseType typeNotInItem) {
    if (this.typeNotIn == null) {
      this.typeNotIn = new ArrayList<LicenseType>();
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

  public List<LicenseType> getTypeNotIn() {
    return typeNotIn;
  }


  public void setTypeNotIn(List<LicenseType> typeNotIn) {
    this.typeNotIn = typeNotIn;
  }


  public V2EverouteLicenseWhereInput uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public V2EverouteLicenseWhereInput uidContains(String uidContains) {
    
    this.uidContains = uidContains;
    return this;
  }

   /**
   * Get uidContains
   * @return uidContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidContains() {
    return uidContains;
  }


  public void setUidContains(String uidContains) {
    this.uidContains = uidContains;
  }


  public V2EverouteLicenseWhereInput uidEndsWith(String uidEndsWith) {
    
    this.uidEndsWith = uidEndsWith;
    return this;
  }

   /**
   * Get uidEndsWith
   * @return uidEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidEndsWith() {
    return uidEndsWith;
  }


  public void setUidEndsWith(String uidEndsWith) {
    this.uidEndsWith = uidEndsWith;
  }


  public V2EverouteLicenseWhereInput uidGt(String uidGt) {
    
    this.uidGt = uidGt;
    return this;
  }

   /**
   * Get uidGt
   * @return uidGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidGt() {
    return uidGt;
  }


  public void setUidGt(String uidGt) {
    this.uidGt = uidGt;
  }


  public V2EverouteLicenseWhereInput uidGte(String uidGte) {
    
    this.uidGte = uidGte;
    return this;
  }

   /**
   * Get uidGte
   * @return uidGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidGte() {
    return uidGte;
  }


  public void setUidGte(String uidGte) {
    this.uidGte = uidGte;
  }


  public V2EverouteLicenseWhereInput uidIn(List<String> uidIn) {
    
    this.uidIn = uidIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addUidInItem(String uidInItem) {
    if (this.uidIn == null) {
      this.uidIn = new ArrayList<String>();
    }
    this.uidIn.add(uidInItem);
    return this;
  }

   /**
   * Get uidIn
   * @return uidIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUidIn() {
    return uidIn;
  }


  public void setUidIn(List<String> uidIn) {
    this.uidIn = uidIn;
  }


  public V2EverouteLicenseWhereInput uidLt(String uidLt) {
    
    this.uidLt = uidLt;
    return this;
  }

   /**
   * Get uidLt
   * @return uidLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidLt() {
    return uidLt;
  }


  public void setUidLt(String uidLt) {
    this.uidLt = uidLt;
  }


  public V2EverouteLicenseWhereInput uidLte(String uidLte) {
    
    this.uidLte = uidLte;
    return this;
  }

   /**
   * Get uidLte
   * @return uidLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidLte() {
    return uidLte;
  }


  public void setUidLte(String uidLte) {
    this.uidLte = uidLte;
  }


  public V2EverouteLicenseWhereInput uidNot(String uidNot) {
    
    this.uidNot = uidNot;
    return this;
  }

   /**
   * Get uidNot
   * @return uidNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidNot() {
    return uidNot;
  }


  public void setUidNot(String uidNot) {
    this.uidNot = uidNot;
  }


  public V2EverouteLicenseWhereInput uidNotContains(String uidNotContains) {
    
    this.uidNotContains = uidNotContains;
    return this;
  }

   /**
   * Get uidNotContains
   * @return uidNotContains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidNotContains() {
    return uidNotContains;
  }


  public void setUidNotContains(String uidNotContains) {
    this.uidNotContains = uidNotContains;
  }


  public V2EverouteLicenseWhereInput uidNotEndsWith(String uidNotEndsWith) {
    
    this.uidNotEndsWith = uidNotEndsWith;
    return this;
  }

   /**
   * Get uidNotEndsWith
   * @return uidNotEndsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidNotEndsWith() {
    return uidNotEndsWith;
  }


  public void setUidNotEndsWith(String uidNotEndsWith) {
    this.uidNotEndsWith = uidNotEndsWith;
  }


  public V2EverouteLicenseWhereInput uidNotIn(List<String> uidNotIn) {
    
    this.uidNotIn = uidNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addUidNotInItem(String uidNotInItem) {
    if (this.uidNotIn == null) {
      this.uidNotIn = new ArrayList<String>();
    }
    this.uidNotIn.add(uidNotInItem);
    return this;
  }

   /**
   * Get uidNotIn
   * @return uidNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUidNotIn() {
    return uidNotIn;
  }


  public void setUidNotIn(List<String> uidNotIn) {
    this.uidNotIn = uidNotIn;
  }


  public V2EverouteLicenseWhereInput uidNotStartsWith(String uidNotStartsWith) {
    
    this.uidNotStartsWith = uidNotStartsWith;
    return this;
  }

   /**
   * Get uidNotStartsWith
   * @return uidNotStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidNotStartsWith() {
    return uidNotStartsWith;
  }


  public void setUidNotStartsWith(String uidNotStartsWith) {
    this.uidNotStartsWith = uidNotStartsWith;
  }


  public V2EverouteLicenseWhereInput uidStartsWith(String uidStartsWith) {
    
    this.uidStartsWith = uidStartsWith;
    return this;
  }

   /**
   * Get uidStartsWith
   * @return uidStartsWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUidStartsWith() {
    return uidStartsWith;
  }


  public void setUidStartsWith(String uidStartsWith) {
    this.uidStartsWith = uidStartsWith;
  }


  public V2EverouteLicenseWhereInput version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public V2EverouteLicenseWhereInput versionGt(Integer versionGt) {
    
    this.versionGt = versionGt;
    return this;
  }

   /**
   * Get versionGt
   * @return versionGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionGt() {
    return versionGt;
  }


  public void setVersionGt(Integer versionGt) {
    this.versionGt = versionGt;
  }


  public V2EverouteLicenseWhereInput versionGte(Integer versionGte) {
    
    this.versionGte = versionGte;
    return this;
  }

   /**
   * Get versionGte
   * @return versionGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionGte() {
    return versionGte;
  }


  public void setVersionGte(Integer versionGte) {
    this.versionGte = versionGte;
  }


  public V2EverouteLicenseWhereInput versionIn(List<Integer> versionIn) {
    
    this.versionIn = versionIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addVersionInItem(Integer versionInItem) {
    if (this.versionIn == null) {
      this.versionIn = new ArrayList<Integer>();
    }
    this.versionIn.add(versionInItem);
    return this;
  }

   /**
   * Get versionIn
   * @return versionIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVersionIn() {
    return versionIn;
  }


  public void setVersionIn(List<Integer> versionIn) {
    this.versionIn = versionIn;
  }


  public V2EverouteLicenseWhereInput versionLt(Integer versionLt) {
    
    this.versionLt = versionLt;
    return this;
  }

   /**
   * Get versionLt
   * @return versionLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionLt() {
    return versionLt;
  }


  public void setVersionLt(Integer versionLt) {
    this.versionLt = versionLt;
  }


  public V2EverouteLicenseWhereInput versionLte(Integer versionLte) {
    
    this.versionLte = versionLte;
    return this;
  }

   /**
   * Get versionLte
   * @return versionLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionLte() {
    return versionLte;
  }


  public void setVersionLte(Integer versionLte) {
    this.versionLte = versionLte;
  }


  public V2EverouteLicenseWhereInput versionNot(Integer versionNot) {
    
    this.versionNot = versionNot;
    return this;
  }

   /**
   * Get versionNot
   * @return versionNot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionNot() {
    return versionNot;
  }


  public void setVersionNot(Integer versionNot) {
    this.versionNot = versionNot;
  }


  public V2EverouteLicenseWhereInput versionNotIn(List<Integer> versionNotIn) {
    
    this.versionNotIn = versionNotIn;
    return this;
  }

  public V2EverouteLicenseWhereInput addVersionNotInItem(Integer versionNotInItem) {
    if (this.versionNotIn == null) {
      this.versionNotIn = new ArrayList<Integer>();
    }
    this.versionNotIn.add(versionNotInItem);
    return this;
  }

   /**
   * Get versionNotIn
   * @return versionNotIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getVersionNotIn() {
    return versionNotIn;
  }


  public void setVersionNotIn(List<Integer> versionNotIn) {
    this.versionNotIn = versionNotIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2EverouteLicenseWhereInput v2EverouteLicenseWhereInput = (V2EverouteLicenseWhereInput) o;
    return Objects.equals(this.AND, v2EverouteLicenseWhereInput.AND) &&
        Objects.equals(this.NOT, v2EverouteLicenseWhereInput.NOT) &&
        Objects.equals(this.OR, v2EverouteLicenseWhereInput.OR) &&
        Objects.equals(this.code, v2EverouteLicenseWhereInput.code) &&
        Objects.equals(this.codeContains, v2EverouteLicenseWhereInput.codeContains) &&
        Objects.equals(this.codeEndsWith, v2EverouteLicenseWhereInput.codeEndsWith) &&
        Objects.equals(this.codeGt, v2EverouteLicenseWhereInput.codeGt) &&
        Objects.equals(this.codeGte, v2EverouteLicenseWhereInput.codeGte) &&
        Objects.equals(this.codeIn, v2EverouteLicenseWhereInput.codeIn) &&
        Objects.equals(this.codeLt, v2EverouteLicenseWhereInput.codeLt) &&
        Objects.equals(this.codeLte, v2EverouteLicenseWhereInput.codeLte) &&
        Objects.equals(this.codeNot, v2EverouteLicenseWhereInput.codeNot) &&
        Objects.equals(this.codeNotContains, v2EverouteLicenseWhereInput.codeNotContains) &&
        Objects.equals(this.codeNotEndsWith, v2EverouteLicenseWhereInput.codeNotEndsWith) &&
        Objects.equals(this.codeNotIn, v2EverouteLicenseWhereInput.codeNotIn) &&
        Objects.equals(this.codeNotStartsWith, v2EverouteLicenseWhereInput.codeNotStartsWith) &&
        Objects.equals(this.codeStartsWith, v2EverouteLicenseWhereInput.codeStartsWith) &&
        Objects.equals(this.expireDate, v2EverouteLicenseWhereInput.expireDate) &&
        Objects.equals(this.expireDateGt, v2EverouteLicenseWhereInput.expireDateGt) &&
        Objects.equals(this.expireDateGte, v2EverouteLicenseWhereInput.expireDateGte) &&
        Objects.equals(this.expireDateIn, v2EverouteLicenseWhereInput.expireDateIn) &&
        Objects.equals(this.expireDateLt, v2EverouteLicenseWhereInput.expireDateLt) &&
        Objects.equals(this.expireDateLte, v2EverouteLicenseWhereInput.expireDateLte) &&
        Objects.equals(this.expireDateNot, v2EverouteLicenseWhereInput.expireDateNot) &&
        Objects.equals(this.expireDateNotIn, v2EverouteLicenseWhereInput.expireDateNotIn) &&
        Objects.equals(this.featureType, v2EverouteLicenseWhereInput.featureType) &&
        Objects.equals(this.featureTypeIn, v2EverouteLicenseWhereInput.featureTypeIn) &&
        Objects.equals(this.featureTypeNot, v2EverouteLicenseWhereInput.featureTypeNot) &&
        Objects.equals(this.featureTypeNotIn, v2EverouteLicenseWhereInput.featureTypeNotIn) &&
        Objects.equals(this.id, v2EverouteLicenseWhereInput.id) &&
        Objects.equals(this.idContains, v2EverouteLicenseWhereInput.idContains) &&
        Objects.equals(this.idEndsWith, v2EverouteLicenseWhereInput.idEndsWith) &&
        Objects.equals(this.idGt, v2EverouteLicenseWhereInput.idGt) &&
        Objects.equals(this.idGte, v2EverouteLicenseWhereInput.idGte) &&
        Objects.equals(this.idIn, v2EverouteLicenseWhereInput.idIn) &&
        Objects.equals(this.idLt, v2EverouteLicenseWhereInput.idLt) &&
        Objects.equals(this.idLte, v2EverouteLicenseWhereInput.idLte) &&
        Objects.equals(this.idNot, v2EverouteLicenseWhereInput.idNot) &&
        Objects.equals(this.idNotContains, v2EverouteLicenseWhereInput.idNotContains) &&
        Objects.equals(this.idNotEndsWith, v2EverouteLicenseWhereInput.idNotEndsWith) &&
        Objects.equals(this.idNotIn, v2EverouteLicenseWhereInput.idNotIn) &&
        Objects.equals(this.idNotStartsWith, v2EverouteLicenseWhereInput.idNotStartsWith) &&
        Objects.equals(this.idStartsWith, v2EverouteLicenseWhereInput.idStartsWith) &&
        Objects.equals(this.maxSocketNum, v2EverouteLicenseWhereInput.maxSocketNum) &&
        Objects.equals(this.maxSocketNumGt, v2EverouteLicenseWhereInput.maxSocketNumGt) &&
        Objects.equals(this.maxSocketNumGte, v2EverouteLicenseWhereInput.maxSocketNumGte) &&
        Objects.equals(this.maxSocketNumIn, v2EverouteLicenseWhereInput.maxSocketNumIn) &&
        Objects.equals(this.maxSocketNumLt, v2EverouteLicenseWhereInput.maxSocketNumLt) &&
        Objects.equals(this.maxSocketNumLte, v2EverouteLicenseWhereInput.maxSocketNumLte) &&
        Objects.equals(this.maxSocketNumNot, v2EverouteLicenseWhereInput.maxSocketNumNot) &&
        Objects.equals(this.maxSocketNumNotIn, v2EverouteLicenseWhereInput.maxSocketNumNotIn) &&
        Objects.equals(this.maxVcpuNum, v2EverouteLicenseWhereInput.maxVcpuNum) &&
        Objects.equals(this.maxVcpuNumGt, v2EverouteLicenseWhereInput.maxVcpuNumGt) &&
        Objects.equals(this.maxVcpuNumGte, v2EverouteLicenseWhereInput.maxVcpuNumGte) &&
        Objects.equals(this.maxVcpuNumIn, v2EverouteLicenseWhereInput.maxVcpuNumIn) &&
        Objects.equals(this.maxVcpuNumLt, v2EverouteLicenseWhereInput.maxVcpuNumLt) &&
        Objects.equals(this.maxVcpuNumLte, v2EverouteLicenseWhereInput.maxVcpuNumLte) &&
        Objects.equals(this.maxVcpuNumNot, v2EverouteLicenseWhereInput.maxVcpuNumNot) &&
        Objects.equals(this.maxVcpuNumNotIn, v2EverouteLicenseWhereInput.maxVcpuNumNotIn) &&
        Objects.equals(this.maxVmNum, v2EverouteLicenseWhereInput.maxVmNum) &&
        Objects.equals(this.maxVmNumGt, v2EverouteLicenseWhereInput.maxVmNumGt) &&
        Objects.equals(this.maxVmNumGte, v2EverouteLicenseWhereInput.maxVmNumGte) &&
        Objects.equals(this.maxVmNumIn, v2EverouteLicenseWhereInput.maxVmNumIn) &&
        Objects.equals(this.maxVmNumLt, v2EverouteLicenseWhereInput.maxVmNumLt) &&
        Objects.equals(this.maxVmNumLte, v2EverouteLicenseWhereInput.maxVmNumLte) &&
        Objects.equals(this.maxVmNumNot, v2EverouteLicenseWhereInput.maxVmNumNot) &&
        Objects.equals(this.maxVmNumNotIn, v2EverouteLicenseWhereInput.maxVmNumNotIn) &&
        Objects.equals(this.maxVpcSocketNum, v2EverouteLicenseWhereInput.maxVpcSocketNum) &&
        Objects.equals(this.maxVpcSocketNumGt, v2EverouteLicenseWhereInput.maxVpcSocketNumGt) &&
        Objects.equals(this.maxVpcSocketNumGte, v2EverouteLicenseWhereInput.maxVpcSocketNumGte) &&
        Objects.equals(this.maxVpcSocketNumIn, v2EverouteLicenseWhereInput.maxVpcSocketNumIn) &&
        Objects.equals(this.maxVpcSocketNumLt, v2EverouteLicenseWhereInput.maxVpcSocketNumLt) &&
        Objects.equals(this.maxVpcSocketNumLte, v2EverouteLicenseWhereInput.maxVpcSocketNumLte) &&
        Objects.equals(this.maxVpcSocketNumNot, v2EverouteLicenseWhereInput.maxVpcSocketNumNot) &&
        Objects.equals(this.maxVpcSocketNumNotIn, v2EverouteLicenseWhereInput.maxVpcSocketNumNotIn) &&
        Objects.equals(this.pricingType, v2EverouteLicenseWhereInput.pricingType) &&
        Objects.equals(this.pricingTypeIn, v2EverouteLicenseWhereInput.pricingTypeIn) &&
        Objects.equals(this.pricingTypeNot, v2EverouteLicenseWhereInput.pricingTypeNot) &&
        Objects.equals(this.pricingTypeNotIn, v2EverouteLicenseWhereInput.pricingTypeNotIn) &&
        Objects.equals(this.serial, v2EverouteLicenseWhereInput.serial) &&
        Objects.equals(this.serialContains, v2EverouteLicenseWhereInput.serialContains) &&
        Objects.equals(this.serialEndsWith, v2EverouteLicenseWhereInput.serialEndsWith) &&
        Objects.equals(this.serialGt, v2EverouteLicenseWhereInput.serialGt) &&
        Objects.equals(this.serialGte, v2EverouteLicenseWhereInput.serialGte) &&
        Objects.equals(this.serialIn, v2EverouteLicenseWhereInput.serialIn) &&
        Objects.equals(this.serialLt, v2EverouteLicenseWhereInput.serialLt) &&
        Objects.equals(this.serialLte, v2EverouteLicenseWhereInput.serialLte) &&
        Objects.equals(this.serialNot, v2EverouteLicenseWhereInput.serialNot) &&
        Objects.equals(this.serialNotContains, v2EverouteLicenseWhereInput.serialNotContains) &&
        Objects.equals(this.serialNotEndsWith, v2EverouteLicenseWhereInput.serialNotEndsWith) &&
        Objects.equals(this.serialNotIn, v2EverouteLicenseWhereInput.serialNotIn) &&
        Objects.equals(this.serialNotStartsWith, v2EverouteLicenseWhereInput.serialNotStartsWith) &&
        Objects.equals(this.serialStartsWith, v2EverouteLicenseWhereInput.serialStartsWith) &&
        Objects.equals(this.signDate, v2EverouteLicenseWhereInput.signDate) &&
        Objects.equals(this.signDateGt, v2EverouteLicenseWhereInput.signDateGt) &&
        Objects.equals(this.signDateGte, v2EverouteLicenseWhereInput.signDateGte) &&
        Objects.equals(this.signDateIn, v2EverouteLicenseWhereInput.signDateIn) &&
        Objects.equals(this.signDateLt, v2EverouteLicenseWhereInput.signDateLt) &&
        Objects.equals(this.signDateLte, v2EverouteLicenseWhereInput.signDateLte) &&
        Objects.equals(this.signDateNot, v2EverouteLicenseWhereInput.signDateNot) &&
        Objects.equals(this.signDateNotIn, v2EverouteLicenseWhereInput.signDateNotIn) &&
        Objects.equals(this.softwareEdition, v2EverouteLicenseWhereInput.softwareEdition) &&
        Objects.equals(this.softwareEditionIn, v2EverouteLicenseWhereInput.softwareEditionIn) &&
        Objects.equals(this.softwareEditionNot, v2EverouteLicenseWhereInput.softwareEditionNot) &&
        Objects.equals(this.softwareEditionNotIn, v2EverouteLicenseWhereInput.softwareEditionNotIn) &&
        Objects.equals(this.type, v2EverouteLicenseWhereInput.type) &&
        Objects.equals(this.typeIn, v2EverouteLicenseWhereInput.typeIn) &&
        Objects.equals(this.typeNot, v2EverouteLicenseWhereInput.typeNot) &&
        Objects.equals(this.typeNotIn, v2EverouteLicenseWhereInput.typeNotIn) &&
        Objects.equals(this.uid, v2EverouteLicenseWhereInput.uid) &&
        Objects.equals(this.uidContains, v2EverouteLicenseWhereInput.uidContains) &&
        Objects.equals(this.uidEndsWith, v2EverouteLicenseWhereInput.uidEndsWith) &&
        Objects.equals(this.uidGt, v2EverouteLicenseWhereInput.uidGt) &&
        Objects.equals(this.uidGte, v2EverouteLicenseWhereInput.uidGte) &&
        Objects.equals(this.uidIn, v2EverouteLicenseWhereInput.uidIn) &&
        Objects.equals(this.uidLt, v2EverouteLicenseWhereInput.uidLt) &&
        Objects.equals(this.uidLte, v2EverouteLicenseWhereInput.uidLte) &&
        Objects.equals(this.uidNot, v2EverouteLicenseWhereInput.uidNot) &&
        Objects.equals(this.uidNotContains, v2EverouteLicenseWhereInput.uidNotContains) &&
        Objects.equals(this.uidNotEndsWith, v2EverouteLicenseWhereInput.uidNotEndsWith) &&
        Objects.equals(this.uidNotIn, v2EverouteLicenseWhereInput.uidNotIn) &&
        Objects.equals(this.uidNotStartsWith, v2EverouteLicenseWhereInput.uidNotStartsWith) &&
        Objects.equals(this.uidStartsWith, v2EverouteLicenseWhereInput.uidStartsWith) &&
        Objects.equals(this.version, v2EverouteLicenseWhereInput.version) &&
        Objects.equals(this.versionGt, v2EverouteLicenseWhereInput.versionGt) &&
        Objects.equals(this.versionGte, v2EverouteLicenseWhereInput.versionGte) &&
        Objects.equals(this.versionIn, v2EverouteLicenseWhereInput.versionIn) &&
        Objects.equals(this.versionLt, v2EverouteLicenseWhereInput.versionLt) &&
        Objects.equals(this.versionLte, v2EverouteLicenseWhereInput.versionLte) &&
        Objects.equals(this.versionNot, v2EverouteLicenseWhereInput.versionNot) &&
        Objects.equals(this.versionNotIn, v2EverouteLicenseWhereInput.versionNotIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(AND, NOT, OR, code, codeContains, codeEndsWith, codeGt, codeGte, codeIn, codeLt, codeLte, codeNot, codeNotContains, codeNotEndsWith, codeNotIn, codeNotStartsWith, codeStartsWith, expireDate, expireDateGt, expireDateGte, expireDateIn, expireDateLt, expireDateLte, expireDateNot, expireDateNotIn, featureType, featureTypeIn, featureTypeNot, featureTypeNotIn, id, idContains, idEndsWith, idGt, idGte, idIn, idLt, idLte, idNot, idNotContains, idNotEndsWith, idNotIn, idNotStartsWith, idStartsWith, maxSocketNum, maxSocketNumGt, maxSocketNumGte, maxSocketNumIn, maxSocketNumLt, maxSocketNumLte, maxSocketNumNot, maxSocketNumNotIn, maxVcpuNum, maxVcpuNumGt, maxVcpuNumGte, maxVcpuNumIn, maxVcpuNumLt, maxVcpuNumLte, maxVcpuNumNot, maxVcpuNumNotIn, maxVmNum, maxVmNumGt, maxVmNumGte, maxVmNumIn, maxVmNumLt, maxVmNumLte, maxVmNumNot, maxVmNumNotIn, maxVpcSocketNum, maxVpcSocketNumGt, maxVpcSocketNumGte, maxVpcSocketNumIn, maxVpcSocketNumLt, maxVpcSocketNumLte, maxVpcSocketNumNot, maxVpcSocketNumNotIn, pricingType, pricingTypeIn, pricingTypeNot, pricingTypeNotIn, serial, serialContains, serialEndsWith, serialGt, serialGte, serialIn, serialLt, serialLte, serialNot, serialNotContains, serialNotEndsWith, serialNotIn, serialNotStartsWith, serialStartsWith, signDate, signDateGt, signDateGte, signDateIn, signDateLt, signDateLte, signDateNot, signDateNotIn, softwareEdition, softwareEditionIn, softwareEditionNot, softwareEditionNotIn, type, typeIn, typeNot, typeNotIn, uid, uidContains, uidEndsWith, uidGt, uidGte, uidIn, uidLt, uidLte, uidNot, uidNotContains, uidNotEndsWith, uidNotIn, uidNotStartsWith, uidStartsWith, version, versionGt, versionGte, versionIn, versionLt, versionLte, versionNot, versionNotIn);
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
    sb.append("class V2EverouteLicenseWhereInput {\n");
    sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
    sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
    sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeContains: ").append(toIndentedString(codeContains)).append("\n");
    sb.append("    codeEndsWith: ").append(toIndentedString(codeEndsWith)).append("\n");
    sb.append("    codeGt: ").append(toIndentedString(codeGt)).append("\n");
    sb.append("    codeGte: ").append(toIndentedString(codeGte)).append("\n");
    sb.append("    codeIn: ").append(toIndentedString(codeIn)).append("\n");
    sb.append("    codeLt: ").append(toIndentedString(codeLt)).append("\n");
    sb.append("    codeLte: ").append(toIndentedString(codeLte)).append("\n");
    sb.append("    codeNot: ").append(toIndentedString(codeNot)).append("\n");
    sb.append("    codeNotContains: ").append(toIndentedString(codeNotContains)).append("\n");
    sb.append("    codeNotEndsWith: ").append(toIndentedString(codeNotEndsWith)).append("\n");
    sb.append("    codeNotIn: ").append(toIndentedString(codeNotIn)).append("\n");
    sb.append("    codeNotStartsWith: ").append(toIndentedString(codeNotStartsWith)).append("\n");
    sb.append("    codeStartsWith: ").append(toIndentedString(codeStartsWith)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    expireDateGt: ").append(toIndentedString(expireDateGt)).append("\n");
    sb.append("    expireDateGte: ").append(toIndentedString(expireDateGte)).append("\n");
    sb.append("    expireDateIn: ").append(toIndentedString(expireDateIn)).append("\n");
    sb.append("    expireDateLt: ").append(toIndentedString(expireDateLt)).append("\n");
    sb.append("    expireDateLte: ").append(toIndentedString(expireDateLte)).append("\n");
    sb.append("    expireDateNot: ").append(toIndentedString(expireDateNot)).append("\n");
    sb.append("    expireDateNotIn: ").append(toIndentedString(expireDateNotIn)).append("\n");
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    featureTypeIn: ").append(toIndentedString(featureTypeIn)).append("\n");
    sb.append("    featureTypeNot: ").append(toIndentedString(featureTypeNot)).append("\n");
    sb.append("    featureTypeNotIn: ").append(toIndentedString(featureTypeNotIn)).append("\n");
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
    sb.append("    maxSocketNum: ").append(toIndentedString(maxSocketNum)).append("\n");
    sb.append("    maxSocketNumGt: ").append(toIndentedString(maxSocketNumGt)).append("\n");
    sb.append("    maxSocketNumGte: ").append(toIndentedString(maxSocketNumGte)).append("\n");
    sb.append("    maxSocketNumIn: ").append(toIndentedString(maxSocketNumIn)).append("\n");
    sb.append("    maxSocketNumLt: ").append(toIndentedString(maxSocketNumLt)).append("\n");
    sb.append("    maxSocketNumLte: ").append(toIndentedString(maxSocketNumLte)).append("\n");
    sb.append("    maxSocketNumNot: ").append(toIndentedString(maxSocketNumNot)).append("\n");
    sb.append("    maxSocketNumNotIn: ").append(toIndentedString(maxSocketNumNotIn)).append("\n");
    sb.append("    maxVcpuNum: ").append(toIndentedString(maxVcpuNum)).append("\n");
    sb.append("    maxVcpuNumGt: ").append(toIndentedString(maxVcpuNumGt)).append("\n");
    sb.append("    maxVcpuNumGte: ").append(toIndentedString(maxVcpuNumGte)).append("\n");
    sb.append("    maxVcpuNumIn: ").append(toIndentedString(maxVcpuNumIn)).append("\n");
    sb.append("    maxVcpuNumLt: ").append(toIndentedString(maxVcpuNumLt)).append("\n");
    sb.append("    maxVcpuNumLte: ").append(toIndentedString(maxVcpuNumLte)).append("\n");
    sb.append("    maxVcpuNumNot: ").append(toIndentedString(maxVcpuNumNot)).append("\n");
    sb.append("    maxVcpuNumNotIn: ").append(toIndentedString(maxVcpuNumNotIn)).append("\n");
    sb.append("    maxVmNum: ").append(toIndentedString(maxVmNum)).append("\n");
    sb.append("    maxVmNumGt: ").append(toIndentedString(maxVmNumGt)).append("\n");
    sb.append("    maxVmNumGte: ").append(toIndentedString(maxVmNumGte)).append("\n");
    sb.append("    maxVmNumIn: ").append(toIndentedString(maxVmNumIn)).append("\n");
    sb.append("    maxVmNumLt: ").append(toIndentedString(maxVmNumLt)).append("\n");
    sb.append("    maxVmNumLte: ").append(toIndentedString(maxVmNumLte)).append("\n");
    sb.append("    maxVmNumNot: ").append(toIndentedString(maxVmNumNot)).append("\n");
    sb.append("    maxVmNumNotIn: ").append(toIndentedString(maxVmNumNotIn)).append("\n");
    sb.append("    maxVpcSocketNum: ").append(toIndentedString(maxVpcSocketNum)).append("\n");
    sb.append("    maxVpcSocketNumGt: ").append(toIndentedString(maxVpcSocketNumGt)).append("\n");
    sb.append("    maxVpcSocketNumGte: ").append(toIndentedString(maxVpcSocketNumGte)).append("\n");
    sb.append("    maxVpcSocketNumIn: ").append(toIndentedString(maxVpcSocketNumIn)).append("\n");
    sb.append("    maxVpcSocketNumLt: ").append(toIndentedString(maxVpcSocketNumLt)).append("\n");
    sb.append("    maxVpcSocketNumLte: ").append(toIndentedString(maxVpcSocketNumLte)).append("\n");
    sb.append("    maxVpcSocketNumNot: ").append(toIndentedString(maxVpcSocketNumNot)).append("\n");
    sb.append("    maxVpcSocketNumNotIn: ").append(toIndentedString(maxVpcSocketNumNotIn)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    pricingTypeIn: ").append(toIndentedString(pricingTypeIn)).append("\n");
    sb.append("    pricingTypeNot: ").append(toIndentedString(pricingTypeNot)).append("\n");
    sb.append("    pricingTypeNotIn: ").append(toIndentedString(pricingTypeNotIn)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    serialContains: ").append(toIndentedString(serialContains)).append("\n");
    sb.append("    serialEndsWith: ").append(toIndentedString(serialEndsWith)).append("\n");
    sb.append("    serialGt: ").append(toIndentedString(serialGt)).append("\n");
    sb.append("    serialGte: ").append(toIndentedString(serialGte)).append("\n");
    sb.append("    serialIn: ").append(toIndentedString(serialIn)).append("\n");
    sb.append("    serialLt: ").append(toIndentedString(serialLt)).append("\n");
    sb.append("    serialLte: ").append(toIndentedString(serialLte)).append("\n");
    sb.append("    serialNot: ").append(toIndentedString(serialNot)).append("\n");
    sb.append("    serialNotContains: ").append(toIndentedString(serialNotContains)).append("\n");
    sb.append("    serialNotEndsWith: ").append(toIndentedString(serialNotEndsWith)).append("\n");
    sb.append("    serialNotIn: ").append(toIndentedString(serialNotIn)).append("\n");
    sb.append("    serialNotStartsWith: ").append(toIndentedString(serialNotStartsWith)).append("\n");
    sb.append("    serialStartsWith: ").append(toIndentedString(serialStartsWith)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    signDateGt: ").append(toIndentedString(signDateGt)).append("\n");
    sb.append("    signDateGte: ").append(toIndentedString(signDateGte)).append("\n");
    sb.append("    signDateIn: ").append(toIndentedString(signDateIn)).append("\n");
    sb.append("    signDateLt: ").append(toIndentedString(signDateLt)).append("\n");
    sb.append("    signDateLte: ").append(toIndentedString(signDateLte)).append("\n");
    sb.append("    signDateNot: ").append(toIndentedString(signDateNot)).append("\n");
    sb.append("    signDateNotIn: ").append(toIndentedString(signDateNotIn)).append("\n");
    sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
    sb.append("    softwareEditionIn: ").append(toIndentedString(softwareEditionIn)).append("\n");
    sb.append("    softwareEditionNot: ").append(toIndentedString(softwareEditionNot)).append("\n");
    sb.append("    softwareEditionNotIn: ").append(toIndentedString(softwareEditionNotIn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
    sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
    sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    uidContains: ").append(toIndentedString(uidContains)).append("\n");
    sb.append("    uidEndsWith: ").append(toIndentedString(uidEndsWith)).append("\n");
    sb.append("    uidGt: ").append(toIndentedString(uidGt)).append("\n");
    sb.append("    uidGte: ").append(toIndentedString(uidGte)).append("\n");
    sb.append("    uidIn: ").append(toIndentedString(uidIn)).append("\n");
    sb.append("    uidLt: ").append(toIndentedString(uidLt)).append("\n");
    sb.append("    uidLte: ").append(toIndentedString(uidLte)).append("\n");
    sb.append("    uidNot: ").append(toIndentedString(uidNot)).append("\n");
    sb.append("    uidNotContains: ").append(toIndentedString(uidNotContains)).append("\n");
    sb.append("    uidNotEndsWith: ").append(toIndentedString(uidNotEndsWith)).append("\n");
    sb.append("    uidNotIn: ").append(toIndentedString(uidNotIn)).append("\n");
    sb.append("    uidNotStartsWith: ").append(toIndentedString(uidNotStartsWith)).append("\n");
    sb.append("    uidStartsWith: ").append(toIndentedString(uidStartsWith)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
    sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
    sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
    sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
    sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
    sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
    sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
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

