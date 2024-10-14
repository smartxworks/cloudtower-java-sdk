package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.VmCreateVmFromContentLibraryTemplateBatchVmParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VmCreateVmFromContentLibraryTemplateBatchParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class VmCreateVmFromContentLibraryTemplateBatchParams {
  public static final String SERIALIZED_NAME_VMS = "vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<VmCreateVmFromContentLibraryTemplateBatchVmParams> vms = new ArrayList<VmCreateVmFromContentLibraryTemplateBatchVmParams>();

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public VmCreateVmFromContentLibraryTemplateBatchParams() { 
  }

  public VmCreateVmFromContentLibraryTemplateBatchParams vms(List<VmCreateVmFromContentLibraryTemplateBatchVmParams> vms) {
    
    this.vms = vms;
    return this;
  }

  public VmCreateVmFromContentLibraryTemplateBatchParams addVmsItem(VmCreateVmFromContentLibraryTemplateBatchVmParams vmsItem) {
    this.vms.add(vmsItem);
    return this;
  }

   /**
   * Get vms
   * @return vms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<VmCreateVmFromContentLibraryTemplateBatchVmParams> getVms() {
    return vms;
  }


  public void setVms(List<VmCreateVmFromContentLibraryTemplateBatchVmParams> vms) {
    this.vms = vms;
  }


  public VmCreateVmFromContentLibraryTemplateBatchParams templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmCreateVmFromContentLibraryTemplateBatchParams vmCreateVmFromContentLibraryTemplateBatchParams = (VmCreateVmFromContentLibraryTemplateBatchParams) o;
    return Objects.equals(this.vms, vmCreateVmFromContentLibraryTemplateBatchParams.vms) &&
        Objects.equals(this.templateId, vmCreateVmFromContentLibraryTemplateBatchParams.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vms, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmCreateVmFromContentLibraryTemplateBatchParams {\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

