package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NetworkPolicyRuleAlgProtocol;
import com.smartx.tower.model.NetworkPolicyRulePortProtocol;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedNetworkPolicyRulePort
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class NestedNetworkPolicyRulePort {
  public static final String SERIALIZED_NAME_ALG_PROTOCOL = "alg_protocol";
  @SerializedName(SERIALIZED_NAME_ALG_PROTOCOL)
  private NetworkPolicyRuleAlgProtocol algProtocol;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private NetworkPolicyRulePortProtocol protocol;

  public NestedNetworkPolicyRulePort() { 
  }

  public NestedNetworkPolicyRulePort algProtocol(NetworkPolicyRuleAlgProtocol algProtocol) {
    
    this.algProtocol = algProtocol;
    return this;
  }

   /**
   * Get algProtocol
   * @return algProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkPolicyRuleAlgProtocol getAlgProtocol() {
    return algProtocol;
  }


  public void setAlgProtocol(NetworkPolicyRuleAlgProtocol algProtocol) {
    this.algProtocol = algProtocol;
  }


  public NestedNetworkPolicyRulePort port(String port) {
    
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


  public NestedNetworkPolicyRulePort protocol(NetworkPolicyRulePortProtocol protocol) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedNetworkPolicyRulePort nestedNetworkPolicyRulePort = (NestedNetworkPolicyRulePort) o;
    return Objects.equals(this.algProtocol, nestedNetworkPolicyRulePort.algProtocol) &&
        Objects.equals(this.port, nestedNetworkPolicyRulePort.port) &&
        Objects.equals(this.protocol, nestedNetworkPolicyRulePort.protocol);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(algProtocol, port, protocol);
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
    sb.append("class NestedNetworkPolicyRulePort {\n");
    sb.append("    algProtocol: ").append(toIndentedString(algProtocol)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

