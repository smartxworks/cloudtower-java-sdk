package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VirtualPrivateCloudNetworkPolicyRulePortProtocol;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * VirtualPrivateCloudNetworkPolicyRulePortInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VirtualPrivateCloudNetworkPolicyRulePortInput {
  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private VirtualPrivateCloudNetworkPolicyRulePortProtocol protocol;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public VirtualPrivateCloudNetworkPolicyRulePortInput() { 
  }

  public VirtualPrivateCloudNetworkPolicyRulePortInput protocol(VirtualPrivateCloudNetworkPolicyRulePortProtocol protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public VirtualPrivateCloudNetworkPolicyRulePortProtocol getProtocol() {
    return protocol;
  }


  public void setProtocol(VirtualPrivateCloudNetworkPolicyRulePortProtocol protocol) {
    this.protocol = protocol;
  }


  public VirtualPrivateCloudNetworkPolicyRulePortInput port(String port) {
    
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
    VirtualPrivateCloudNetworkPolicyRulePortInput virtualPrivateCloudNetworkPolicyRulePortInput = (VirtualPrivateCloudNetworkPolicyRulePortInput) o;
    return Objects.equals(this.protocol, virtualPrivateCloudNetworkPolicyRulePortInput.protocol) &&
        Objects.equals(this.port, virtualPrivateCloudNetworkPolicyRulePortInput.port);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, port);
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
    sb.append("class VirtualPrivateCloudNetworkPolicyRulePortInput {\n");
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

