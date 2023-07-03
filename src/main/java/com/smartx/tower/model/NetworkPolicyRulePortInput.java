package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NetworkPolicyRulePortProtocol;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NetworkPolicyRulePortInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NetworkPolicyRulePortInput {
  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private NetworkPolicyRulePortProtocol protocol;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public NetworkPolicyRulePortInput() { 
  }

  public NetworkPolicyRulePortInput protocol(NetworkPolicyRulePortProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NetworkPolicyRulePortProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(NetworkPolicyRulePortProtocol protocol) {
    this.protocol = protocol;
  }


  public NetworkPolicyRulePortInput port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkPolicyRulePortInput networkPolicyRulePortInput = (NetworkPolicyRulePortInput) o;
    return Objects.equals(this.protocol, networkPolicyRulePortInput.protocol) &&
        Objects.equals(this.port, networkPolicyRulePortInput.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkPolicyRulePortInput {\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

