package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ApplicationVmSpecPlacementSituation;
import com.smartx.tower.model.ApplicationVmSpecPlacementVerb;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApplicationVmSpecPlacement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class ApplicationVmSpecPlacement {
  public static final String SERIALIZED_NAME_VERB = "verb";
  @SerializedName(SERIALIZED_NAME_VERB)
  private ApplicationVmSpecPlacementVerb verb;

  public static final String SERIALIZED_NAME_SITUATION = "situation";
  @SerializedName(SERIALIZED_NAME_SITUATION)
  private ApplicationVmSpecPlacementSituation situation;

  public ApplicationVmSpecPlacement() { 
  }

  public ApplicationVmSpecPlacement verb(ApplicationVmSpecPlacementVerb verb) {
    
    this.verb = verb;
    return this;
  }

   /**
   * Get verb
   * @return verb
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApplicationVmSpecPlacementVerb getVerb() {
    return verb;
  }


  public void setVerb(ApplicationVmSpecPlacementVerb verb) {
    this.verb = verb;
  }


  public ApplicationVmSpecPlacement situation(ApplicationVmSpecPlacementSituation situation) {
    
    this.situation = situation;
    return this;
  }

   /**
   * Get situation
   * @return situation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApplicationVmSpecPlacementSituation getSituation() {
    return situation;
  }


  public void setSituation(ApplicationVmSpecPlacementSituation situation) {
    this.situation = situation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationVmSpecPlacement applicationVmSpecPlacement = (ApplicationVmSpecPlacement) o;
    return Objects.equals(this.verb, applicationVmSpecPlacement.verb) &&
        Objects.equals(this.situation, applicationVmSpecPlacement.situation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verb, situation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationVmSpecPlacement {\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
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

