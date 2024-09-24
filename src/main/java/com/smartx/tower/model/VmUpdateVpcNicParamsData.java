package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.UpdateVpcNicPayloads;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VmUpdateVpcNicParamsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class VmUpdateVpcNicParamsData {
  public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";
  @SerializedName(SERIALIZED_NAME_VPC_NIC)
  private UpdateVpcNicPayloads vpcNic;

  public VmUpdateVpcNicParamsData() { 
  }

  public VmUpdateVpcNicParamsData vpcNic(UpdateVpcNicPayloads vpcNic) {
    
    this.vpcNic = vpcNic;
    return this;
  }

   /**
   * Get vpcNic
   * @return vpcNic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UpdateVpcNicPayloads getVpcNic() {
    return vpcNic;
  }


  public void setVpcNic(UpdateVpcNicPayloads vpcNic) {
    this.vpcNic = vpcNic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmUpdateVpcNicParamsData vmUpdateVpcNicParamsData = (VmUpdateVpcNicParamsData) o;
    return Objects.equals(this.vpcNic, vmUpdateVpcNicParamsData.vpcNic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcNic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmUpdateVpcNicParamsData {\n");
    sb.append("    vpcNic: ").append(toIndentedString(vpcNic)).append("\n");
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

