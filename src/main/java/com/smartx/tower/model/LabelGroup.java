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
 * LabelGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class LabelGroup {
  public static final String SERIALIZED_NAME_LABEL_IDS = "label_ids";
  @SerializedName(SERIALIZED_NAME_LABEL_IDS)
  private List<String> labelIds = new ArrayList<String>();

  public LabelGroup() { 
  }

  public LabelGroup labelIds(List<String> labelIds) {
    
    this.labelIds = labelIds;
    return this;
  }

  public LabelGroup addLabelIdsItem(String labelIdsItem) {
    this.labelIds.add(labelIdsItem);
    return this;
  }

   /**
   * Get labelIds
   * @return labelIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getLabelIds() {
    return labelIds;
  }


  public void setLabelIds(List<String> labelIds) {
    this.labelIds = labelIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelGroup labelGroup = (LabelGroup) o;
    return Objects.equals(this.labelIds, labelGroup.labelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelGroup {\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
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

