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

/**
 * NestedVpcDnatRuleType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedVpcDnatRuleType {
  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_TARGET_IP = "target_ip";
  @SerializedName(SERIALIZED_NAME_TARGET_IP)
  private String targetIp;

  public static final String SERIALIZED_NAME_TARGET_PORT = "target_port";
  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private Integer targetPort;

  public NestedVpcDnatRuleType() { 
  }

  public NestedVpcDnatRuleType port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public NestedVpcDnatRuleType targetIp(String targetIp) {
    
    this.targetIp = targetIp;
    return this;
  }

   /**
   * Get targetIp
   * @return targetIp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTargetIp() {
    return targetIp;
  }


  public void setTargetIp(String targetIp) {
    this.targetIp = targetIp;
  }


  public NestedVpcDnatRuleType targetPort(Integer targetPort) {
    
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Get targetPort
   * @return targetPort
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTargetPort() {
    return targetPort;
  }


  public void setTargetPort(Integer targetPort) {
    this.targetPort = targetPort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedVpcDnatRuleType nestedVpcDnatRuleType = (NestedVpcDnatRuleType) o;
    return Objects.equals(this.port, nestedVpcDnatRuleType.port) &&
        Objects.equals(this.targetIp, nestedVpcDnatRuleType.targetIp) &&
        Objects.equals(this.targetPort, nestedVpcDnatRuleType.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, targetIp, targetPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedVpcDnatRuleType {\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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

