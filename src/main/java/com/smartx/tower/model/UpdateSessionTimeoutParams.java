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
 * UpdateSessionTimeoutParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class UpdateSessionTimeoutParams {
  public static final String SERIALIZED_NAME_SESSION_MAX_AGE = "session_max_age";
  @SerializedName(SERIALIZED_NAME_SESSION_MAX_AGE)
  private Integer sessionMaxAge;

  public UpdateSessionTimeoutParams() { 
  }

  public UpdateSessionTimeoutParams sessionMaxAge(Integer sessionMaxAge) {
    
    this.sessionMaxAge = sessionMaxAge;
    return this;
  }

   /**
   * Get sessionMaxAge
   * @return sessionMaxAge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSessionMaxAge() {
    return sessionMaxAge;
  }


  public void setSessionMaxAge(Integer sessionMaxAge) {
    this.sessionMaxAge = sessionMaxAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSessionTimeoutParams updateSessionTimeoutParams = (UpdateSessionTimeoutParams) o;
    return Objects.equals(this.sessionMaxAge, updateSessionTimeoutParams.sessionMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionMaxAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSessionTimeoutParams {\n");
    sb.append("    sessionMaxAge: ").append(toIndentedString(sessionMaxAge)).append("\n");
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

