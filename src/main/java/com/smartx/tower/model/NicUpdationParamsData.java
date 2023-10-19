package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NicUserUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NicUpdationParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NicUpdationParamsData {
  public static final String SERIALIZED_NAME_NIC_USER_USAGE = "nic_user_usage";
  @SerializedName(SERIALIZED_NAME_NIC_USER_USAGE)
  private NicUserUsage nicUserUsage;

  public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
  private Integer totalVfNum;

  public static final String SERIALIZED_NAME_MTU = "mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public NicUpdationParamsData() { 
  }

  public NicUpdationParamsData nicUserUsage(NicUserUsage nicUserUsage) {
    
    this.nicUserUsage = nicUserUsage;
    return this;
  }

   /**
   * Get nicUserUsage
   * @return nicUserUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NicUserUsage getNicUserUsage() {
    return nicUserUsage;
  }


  public void setNicUserUsage(NicUserUsage nicUserUsage) {
    this.nicUserUsage = nicUserUsage;
  }


  public NicUpdationParamsData totalVfNum(Integer totalVfNum) {
    
    this.totalVfNum = totalVfNum;
    return this;
  }

   /**
   * Get totalVfNum
   * @return totalVfNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalVfNum() {
    return totalVfNum;
  }


  public void setTotalVfNum(Integer totalVfNum) {
    this.totalVfNum = totalVfNum;
  }


  public NicUpdationParamsData mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NicUpdationParamsData nicUpdationParamsData = (NicUpdationParamsData) o;
    return Objects.equals(this.nicUserUsage, nicUpdationParamsData.nicUserUsage) &&
        Objects.equals(this.totalVfNum, nicUpdationParamsData.totalVfNum) &&
        Objects.equals(this.mtu, nicUpdationParamsData.mtu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nicUserUsage, totalVfNum, mtu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NicUpdationParamsData {\n");
    sb.append("    nicUserUsage: ").append(toIndentedString(nicUserUsage)).append("\n");
    sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
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

