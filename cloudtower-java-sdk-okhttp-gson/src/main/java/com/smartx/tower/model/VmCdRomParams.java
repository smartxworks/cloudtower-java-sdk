package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NicWhereInput;
import com.smartx.tower.model.VlanWhereInput;
import com.smartx.tower.model.VmNicModel;
import com.smartx.tower.model.VmWhereInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class VmCdRomParams {
  public static final String SERIALIZED_NAME_ELF_IMAGE_ID = "elf_image_id";
  @SerializedName(SERIALIZED_NAME_ELF_IMAGE_ID)
  private String elfImageId;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private Integer key;

  public static final String SERIALIZED_NAME_BOOT = "boot";
  @SerializedName(SERIALIZED_NAME_BOOT)
  private Integer nicId;

  public VmCdRomParams elfImageId(String elfImageId) {

    this.elfImageId = elfImageId;
    return this;
  }

  /**
   * Get elfImageId
   * 
   * @return elfImageId
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "")

  public String getElfImageId() {
    return elfImageId;
  }

  public void setVmDisks(String elfImageId) {
    this.elfImageId = elfImageId;
  }

  public VmCdRomParams index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * 
   * @return index
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "", required = true)
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public VmCdRomParams key(Integer key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * 
   * @return key
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public Integer getKey() {
    return key;
  }

  public void setKey(Integer key) {
    this.key = key;
  }

  public VmCdRomParams boot(Integer nicId) {
    this.nicId = nicId;
    return this;
  }

  /**
   * Get boot
   * 
   * @return boot
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(value = "", required = true)
  public Integer getBoot() {
    return nicId;
  }

  public void setBoot(Integer nicId) {
    this.nicId = nicId;
  }

}
