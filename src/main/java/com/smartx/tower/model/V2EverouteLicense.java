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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * V2EverouteLicense
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class V2EverouteLicense {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EXPIRE_DATE = "expire_date";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  private String expireDate;

  public static final String SERIALIZED_NAME_FEATURE_TYPE = "feature_type";
  @SerializedName(SERIALIZED_NAME_FEATURE_TYPE)
  private EverouteFeatureType featureType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MAX_SOCKET_NUM = "max_socket_num";
  @SerializedName(SERIALIZED_NAME_MAX_SOCKET_NUM)
  private Integer maxSocketNum;

  public static final String SERIALIZED_NAME_MAX_VCPU_NUM = "max_vcpu_num";
  @SerializedName(SERIALIZED_NAME_MAX_VCPU_NUM)
  private Integer maxVcpuNum;

  public static final String SERIALIZED_NAME_MAX_VM_NUM = "max_vm_num";
  @SerializedName(SERIALIZED_NAME_MAX_VM_NUM)
  private Integer maxVmNum;

  public static final String SERIALIZED_NAME_MAX_VPC_SOCKET_NUM = "max_vpc_socket_num";
  @SerializedName(SERIALIZED_NAME_MAX_VPC_SOCKET_NUM)
  private Integer maxVpcSocketNum;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  private EverouteLicensePricingType pricingType;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_SIGN_DATE = "sign_date";
  @SerializedName(SERIALIZED_NAME_SIGN_DATE)
  private String signDate;

  public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
  private SoftwareEdition softwareEdition;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private LicenseType type;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public V2EverouteLicense() { 
  }

  public V2EverouteLicense code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public V2EverouteLicense expireDate(String expireDate) {
    
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getExpireDate() {
    return expireDate;
  }


  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }


  public V2EverouteLicense featureType(EverouteFeatureType featureType) {
    
    this.featureType = featureType;
    return this;
  }

   /**
   * Get featureType
   * @return featureType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EverouteFeatureType getFeatureType() {
    return featureType;
  }


  public void setFeatureType(EverouteFeatureType featureType) {
    this.featureType = featureType;
  }


  public V2EverouteLicense id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public V2EverouteLicense maxSocketNum(Integer maxSocketNum) {
    
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


  public V2EverouteLicense maxVcpuNum(Integer maxVcpuNum) {
    
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


  public V2EverouteLicense maxVmNum(Integer maxVmNum) {
    
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


  public V2EverouteLicense maxVpcSocketNum(Integer maxVpcSocketNum) {
    
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


  public V2EverouteLicense pricingType(EverouteLicensePricingType pricingType) {
    
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


  public V2EverouteLicense serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * Get serial
   * @return serial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public V2EverouteLicense signDate(String signDate) {
    
    this.signDate = signDate;
    return this;
  }

   /**
   * Get signDate
   * @return signDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSignDate() {
    return signDate;
  }


  public void setSignDate(String signDate) {
    this.signDate = signDate;
  }


  public V2EverouteLicense softwareEdition(SoftwareEdition softwareEdition) {
    
    this.softwareEdition = softwareEdition;
    return this;
  }

   /**
   * Get softwareEdition
   * @return softwareEdition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SoftwareEdition getSoftwareEdition() {
    return softwareEdition;
  }


  public void setSoftwareEdition(SoftwareEdition softwareEdition) {
    this.softwareEdition = softwareEdition;
  }


  public V2EverouteLicense type(LicenseType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LicenseType getType() {
    return type;
  }


  public void setType(LicenseType type) {
    this.type = type;
  }


  public V2EverouteLicense uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public V2EverouteLicense version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2EverouteLicense v2EverouteLicense = (V2EverouteLicense) o;
    return Objects.equals(this.code, v2EverouteLicense.code) &&
        Objects.equals(this.expireDate, v2EverouteLicense.expireDate) &&
        Objects.equals(this.featureType, v2EverouteLicense.featureType) &&
        Objects.equals(this.id, v2EverouteLicense.id) &&
        Objects.equals(this.maxSocketNum, v2EverouteLicense.maxSocketNum) &&
        Objects.equals(this.maxVcpuNum, v2EverouteLicense.maxVcpuNum) &&
        Objects.equals(this.maxVmNum, v2EverouteLicense.maxVmNum) &&
        Objects.equals(this.maxVpcSocketNum, v2EverouteLicense.maxVpcSocketNum) &&
        Objects.equals(this.pricingType, v2EverouteLicense.pricingType) &&
        Objects.equals(this.serial, v2EverouteLicense.serial) &&
        Objects.equals(this.signDate, v2EverouteLicense.signDate) &&
        Objects.equals(this.softwareEdition, v2EverouteLicense.softwareEdition) &&
        Objects.equals(this.type, v2EverouteLicense.type) &&
        Objects.equals(this.uid, v2EverouteLicense.uid) &&
        Objects.equals(this.version, v2EverouteLicense.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, expireDate, featureType, id, maxSocketNum, maxVcpuNum, maxVmNum, maxVpcSocketNum, pricingType, serial, signDate, softwareEdition, type, uid, version);
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
    sb.append("class V2EverouteLicense {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxSocketNum: ").append(toIndentedString(maxSocketNum)).append("\n");
    sb.append("    maxVcpuNum: ").append(toIndentedString(maxVcpuNum)).append("\n");
    sb.append("    maxVmNum: ").append(toIndentedString(maxVmNum)).append("\n");
    sb.append("    maxVpcSocketNum: ").append(toIndentedString(maxVpcSocketNum)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

