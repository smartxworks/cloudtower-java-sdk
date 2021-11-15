package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NvmfNamespaceWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

public class NvmfNamespaceUpdationParamsData {
  public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
  private Double bpsWrMaxLength;

  public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";
  @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
  private Double bpsWrMax;

  public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
  private Double bpsRdMaxLength;

  public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";
  @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
  private Double bpsRdMax;

  public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";
  @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
  private Double bpsMaxLength;

  public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";
  @SerializedName(SERIALIZED_NAME_BPS_MAX)
  private Double bpsMax;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
  private Double iopsWrMaxLength;

  public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";
  @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
  private Double iopsWrMax;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
  private Double iopsRdMaxLength;

  public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";
  @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
  private Double iopsRdMax;

  public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
  private Double iopsMaxLength;

  public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";
  @SerializedName(SERIALIZED_NAME_IOPS_MAX)
  private Double iopsMax;

  public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";
  @SerializedName(SERIALIZED_NAME_BPS_WR)
  private Double bpsWr;

  public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";
  @SerializedName(SERIALIZED_NAME_BPS_RD)
  private Double bpsRd;

  public static final String SERIALIZED_NAME_BPS = "bps";
  @SerializedName(SERIALIZED_NAME_BPS)
  private Double bps;

  public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";
  @SerializedName(SERIALIZED_NAME_IOPS_WR)
  private Double iopsWr;

  public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";
  @SerializedName(SERIALIZED_NAME_IOPS_RD)
  private Double iopsRd;

  public static final String SERIALIZED_NAME_IOPS = "iops";
  @SerializedName(SERIALIZED_NAME_IOPS)
  private Double iops;

  public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";
  @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
  private String nqnWhitelist;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
  private Double assignedSize;

  public NvmfNamespaceUpdationParamsData bpsWrMaxLength(Double bpsWrMaxLength) {

    this.bpsWrMaxLength = bpsWrMaxLength;
    return this;
  }

  /**
   * Get bpsWrMaxLength
   * 
   * @return bpsWrMaxLength
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWrMaxLength() {
    return bpsWrMaxLength;
  }

  public void setBpsWrMaxLength(Double bpsWrMaxLength) {
    this.bpsWrMaxLength = bpsWrMaxLength;
  }

  public NvmfNamespaceUpdationParamsData bpsWrMax(Double bpsWrMax) {

    this.bpsWrMax = bpsWrMax;
    return this;
  }

  /**
   * Get bpsWrMax
   * 
   * @return bpsWrMax
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWrMax() {
    return bpsWrMax;
  }

  public void setBpsWrMax(Double bpsWrMax) {
    this.bpsWrMax = bpsWrMax;
  }

  public NvmfNamespaceUpdationParamsData bpsRdMaxLength(Double bpsRdMaxLength) {

    this.bpsRdMaxLength = bpsRdMaxLength;
    return this;
  }

  /**
   * Get bpsRdMaxLength
   * 
   * @return bpsRdMaxLength
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRdMaxLength() {
    return bpsRdMaxLength;
  }

  public void setBpsRdMaxLength(Double bpsRdMaxLength) {
    this.bpsRdMaxLength = bpsRdMaxLength;
  }

  public NvmfNamespaceUpdationParamsData bpsRdMax(Double bpsRdMax) {

    this.bpsRdMax = bpsRdMax;
    return this;
  }

  /**
   * Get bpsRdMax
   * 
   * @return bpsRdMax
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRdMax() {
    return bpsRdMax;
  }

  public void setBpsRdMax(Double bpsRdMax) {
    this.bpsRdMax = bpsRdMax;
  }

  public NvmfNamespaceUpdationParamsData bpsMaxLength(Double bpsMaxLength) {

    this.bpsMaxLength = bpsMaxLength;
    return this;
  }

  /**
   * Get bpsMaxLength
   * 
   * @return bpsMaxLength
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsMaxLength() {
    return bpsMaxLength;
  }

  public void setBpsMaxLength(Double bpsMaxLength) {
    this.bpsMaxLength = bpsMaxLength;
  }

  public NvmfNamespaceUpdationParamsData bpsMax(Double bpsMax) {

    this.bpsMax = bpsMax;
    return this;
  }

  /**
   * Get bpsMax
   * 
   * @return bpsMax
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsMax() {
    return bpsMax;
  }

  public void setBpsMax(Double bpsMax) {
    this.bpsMax = bpsMax;
  }

  public NvmfNamespaceUpdationParamsData iopsWrMaxLength(Double iopsWrMaxLength) {

    this.iopsWrMaxLength = iopsWrMaxLength;
    return this;
  }

  /**
   * Get iopsWrMaxLength
   * 
   * @return iopsWrMaxLength
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWrMaxLength() {
    return iopsWrMaxLength;
  }

  public void setIopsWrMaxLength(Double iopsWrMaxLength) {
    this.iopsWrMaxLength = iopsWrMaxLength;
  }

  public NvmfNamespaceUpdationParamsData iopsWrMax(Double iopsWrMax) {

    this.iopsWrMax = iopsWrMax;
    return this;
  }

  /**
   * Get iopsWrMax
   * 
   * @return iopsWrMax
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWrMax() {
    return iopsWrMax;
  }

  public void setIopsWrMax(Double iopsWrMax) {
    this.iopsWrMax = iopsWrMax;
  }

  public NvmfNamespaceUpdationParamsData iopsRdMaxLength(Double iopsRdMaxLength) {

    this.iopsRdMaxLength = iopsRdMaxLength;
    return this;
  }

  /**
   * Get iopsRdMaxLength
   * 
   * @return iopsRdMaxLength
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRdMaxLength() {
    return iopsRdMaxLength;
  }

  public void setIopsRdMaxLength(Double iopsRdMaxLength) {
    this.iopsRdMaxLength = iopsRdMaxLength;
  }

  public NvmfNamespaceUpdationParamsData iopsRdMax(Double iopsRdMax) {

    this.iopsRdMax = iopsRdMax;
    return this;
  }

  /**
   * Get iopsRdMax
   * 
   * @return iopsRdMax
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRdMax() {
    return iopsRdMax;
  }

  public void setIopsRdMax(Double iopsRdMax) {
    this.iopsRdMax = iopsRdMax;
  }

  public NvmfNamespaceUpdationParamsData iopsMaxLength(Double iopsMaxLength) {

    this.iopsMaxLength = iopsMaxLength;
    return this;
  }

  /**
   * Get iopsMaxLength
   * 
   * @return iopsMaxLength
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsMaxLength() {
    return iopsMaxLength;
  }

  public void setIopsMaxLength(Double iopsMaxLength) {
    this.iopsMaxLength = iopsMaxLength;
  }

  public NvmfNamespaceUpdationParamsData iopsMax(Double iopsMax) {

    this.iopsMax = iopsMax;
    return this;
  }

  /**
   * Get iopsMax
   * 
   * @return iopsMax
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsMax() {
    return iopsMax;
  }

  public void setIopsMax(Double iopsMax) {
    this.iopsMax = iopsMax;
  }

  public NvmfNamespaceUpdationParamsData bpsWr(Double bpsWr) {

    this.bpsWr = bpsWr;
    return this;
  }

  /**
   * Get bpsWr
   * 
   * @return bpsWr
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsWr() {
    return bpsWr;
  }

  public void setBpsWr(Double bpsWr) {
    this.bpsWr = bpsWr;
  }

  public NvmfNamespaceUpdationParamsData bpsRd(Double bpsRd) {

    this.bpsRd = bpsRd;
    return this;
  }

  /**
   * Get bpsRd
   * 
   * @return bpsRd
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBpsRd() {
    return bpsRd;
  }

  public void setBpsRd(Double bpsRd) {
    this.bpsRd = bpsRd;
  }

  public NvmfNamespaceUpdationParamsData bps(Double bps) {

    this.bps = bps;
    return this;
  }

  /**
   * Get bps
   * 
   * @return bps
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getBps() {
    return bps;
  }

  public void setBps(Double bps) {
    this.bps = bps;
  }

  public NvmfNamespaceUpdationParamsData iopsWr(Double iopsWr) {

    this.iopsWr = iopsWr;
    return this;
  }

  /**
   * Get iopsWr
   * 
   * @return iopsWr
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsWr() {
    return iopsWr;
  }

  public void setIopsWr(Double iopsWr) {
    this.iopsWr = iopsWr;
  }

  public NvmfNamespaceUpdationParamsData iopsRd(Double iopsRd) {

    this.iopsRd = iopsRd;
    return this;
  }

  /**
   * Get iopsRd
   * 
   * @return iopsRd
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIopsRd() {
    return iopsRd;
  }

  public void setIopsRd(Double iopsRd) {
    this.iopsRd = iopsRd;
  }

  public NvmfNamespaceUpdationParamsData iops(Double iops) {

    this.iops = iops;
    return this;
  }

  /**
   * Get iops
   * 
   * @return iops
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getIops() {
    return iops;
  }

  public void setIops(Double iops) {
    this.iops = iops;
  }

  public NvmfNamespaceUpdationParamsData nqnWhitelist(String nqnWhitelist) {

    this.nqnWhitelist = nqnWhitelist;
    return this;
  }

  /**
   * Get nqnWhitelist
   * 
   * @return nqnWhitelist
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNqnWhitelist() {
    return nqnWhitelist;
  }

  public void setNqnWhitelist(String nqnWhitelist) {
    this.nqnWhitelist = nqnWhitelist;
  }

  public NvmfNamespaceUpdationParamsData name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * 
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

  public NvmfNamespaceUpdationParamsData where(Double assignedSize) {

    this.assignedSize = assignedSize;
    return this;
  }

  /**
   * Get assignedSize
   * 
   * @return assignedSize
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getAssignedSize() {
    return assignedSize;
  }

  public void setAssignedSize(Double assignedSize) {
    this.assignedSize = assignedSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NvmfNamespaceUpdationParamsData NvmfNamespaceUpdationParamsData = (NvmfNamespaceUpdationParamsData) o;
    return Objects.equals(this.bpsWrMaxLength, NvmfNamespaceUpdationParamsData.bpsWrMaxLength)
        && Objects.equals(this.bpsWrMax, NvmfNamespaceUpdationParamsData.bpsWrMax)
        && Objects.equals(this.bpsRdMaxLength, NvmfNamespaceUpdationParamsData.bpsRdMaxLength)
        && Objects.equals(this.bpsRdMax, NvmfNamespaceUpdationParamsData.bpsRdMax)
        && Objects.equals(this.bpsMaxLength, NvmfNamespaceUpdationParamsData.bpsMaxLength)
        && Objects.equals(this.bpsMax, NvmfNamespaceUpdationParamsData.bpsMax)
        && Objects.equals(this.iopsWrMaxLength, NvmfNamespaceUpdationParamsData.iopsWrMaxLength)
        && Objects.equals(this.iopsWrMax, NvmfNamespaceUpdationParamsData.iopsWrMax)
        && Objects.equals(this.iopsRdMaxLength, NvmfNamespaceUpdationParamsData.iopsRdMaxLength)
        && Objects.equals(this.iopsRdMax, NvmfNamespaceUpdationParamsData.iopsRdMax)
        && Objects.equals(this.iopsMaxLength, NvmfNamespaceUpdationParamsData.iopsMaxLength)
        && Objects.equals(this.iopsMax, NvmfNamespaceUpdationParamsData.iopsMax)
        && Objects.equals(this.bpsWr, NvmfNamespaceUpdationParamsData.bpsWr)
        && Objects.equals(this.bpsRd, NvmfNamespaceUpdationParamsData.bpsRd)
        && Objects.equals(this.bps, NvmfNamespaceUpdationParamsData.bps)
        && Objects.equals(this.iopsWr, NvmfNamespaceUpdationParamsData.iopsWr)
        && Objects.equals(this.iopsRd, NvmfNamespaceUpdationParamsData.iopsRd)
        && Objects.equals(this.iops, NvmfNamespaceUpdationParamsData.iops)
        && Objects.equals(this.nqnWhitelist, NvmfNamespaceUpdationParamsData.nqnWhitelist)
        && Objects.equals(this.name, NvmfNamespaceUpdationParamsData.name)
        && Objects.equals(this.assignedSize, NvmfNamespaceUpdationParamsData.assignedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpsWrMaxLength, bpsWrMax, bpsRdMaxLength, bpsRdMax, bpsMaxLength, bpsMax, iopsWrMaxLength,
        iopsWrMax, iopsRdMaxLength, iopsRdMax, iopsMaxLength, iopsMax, bpsWr, bpsRd, bps, iopsWr, iopsRd, iops,
        nqnWhitelist, name, assignedSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NvmfNamespaceUpdationParamsData {\n");
    sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
    sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
    sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
    sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
    sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
    sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
    sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
    sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
    sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
    sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
    sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
    sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
    sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
    sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
    sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
    sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
    sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
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
