package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IPSecurityPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class IPSecurityPolicy {
  public static final String SERIALIZED_NAME_EXCEPT_IP_BLOCK = "except_ip_block";
  @SerializedName(SERIALIZED_NAME_EXCEPT_IP_BLOCK)
  private List<String> exceptIpBlock = null;

  public static final String SERIALIZED_NAME_IP_BLOCK = "ip_block";
  @SerializedName(SERIALIZED_NAME_IP_BLOCK)
  private String ipBlock;

  public IPSecurityPolicy() { 
  }

  public IPSecurityPolicy exceptIpBlock(List<String> exceptIpBlock) {
    
    this.exceptIpBlock = exceptIpBlock;
    return this;
  }

  public IPSecurityPolicy addExceptIpBlockItem(String exceptIpBlockItem) {
    if (this.exceptIpBlock == null) {
      this.exceptIpBlock = new ArrayList<String>();
    }
    this.exceptIpBlock.add(exceptIpBlockItem);
    return this;
  }

   /**
   * Get exceptIpBlock
   * @return exceptIpBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getExceptIpBlock() {
    return exceptIpBlock;
  }


  public void setExceptIpBlock(List<String> exceptIpBlock) {
    this.exceptIpBlock = exceptIpBlock;
  }


  public IPSecurityPolicy ipBlock(String ipBlock) {
    
    this.ipBlock = ipBlock;
    return this;
  }

   /**
   * Get ipBlock
   * @return ipBlock
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIpBlock() {
    return ipBlock;
  }


  public void setIpBlock(String ipBlock) {
    this.ipBlock = ipBlock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPSecurityPolicy ipSecurityPolicy = (IPSecurityPolicy) o;
    return Objects.equals(this.exceptIpBlock, ipSecurityPolicy.exceptIpBlock) &&
        Objects.equals(this.ipBlock, ipSecurityPolicy.ipBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptIpBlock, ipBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPSecurityPolicy {\n");
    sb.append("    exceptIpBlock: ").append(toIndentedString(exceptIpBlock)).append("\n");
    sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
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

