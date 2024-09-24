package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ClusterWhereInput;
import com.smartx.tower.model.NotifierLanguageCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AlertNotifierCreationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class AlertNotifierCreationParams {
  /**
   * Gets or Sets noticeSeverities
   */
  @JsonAdapter(NoticeSeveritiesEnum.Adapter.class)
  public enum NoticeSeveritiesEnum {
    CRITICAL("CRITICAL"),
    
    NOTICE("NOTICE"),
    
    INFO("INFO");

    private String value;

    NoticeSeveritiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NoticeSeveritiesEnum fromValue(String value) {
      for (NoticeSeveritiesEnum b : NoticeSeveritiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NoticeSeveritiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NoticeSeveritiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NoticeSeveritiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NoticeSeveritiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTICE_SEVERITIES = "notice_severities";
  @SerializedName(SERIALIZED_NAME_NOTICE_SEVERITIES)
  private List<NoticeSeveritiesEnum> noticeSeverities = new ArrayList<NoticeSeveritiesEnum>();

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private NotifierLanguageCode languageCode;

  public static final String SERIALIZED_NAME_EMAIL_TOS = "email_tos";
  @SerializedName(SERIALIZED_NAME_EMAIL_TOS)
  private List<String> emailTos = new ArrayList<String>();

  public static final String SERIALIZED_NAME_EMAIL_FROM = "email_from";
  @SerializedName(SERIALIZED_NAME_EMAIL_FROM)
  private String emailFrom;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_SMTP_SERVER_ID = "smtp_server_id";
  @SerializedName(SERIALIZED_NAME_SMTP_SERVER_ID)
  private String smtpServerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private ClusterWhereInput clusters;

  public AlertNotifierCreationParams() { 
  }

  public AlertNotifierCreationParams noticeSeverities(List<NoticeSeveritiesEnum> noticeSeverities) {
    
    this.noticeSeverities = noticeSeverities;
    return this;
  }

  public AlertNotifierCreationParams addNoticeSeveritiesItem(NoticeSeveritiesEnum noticeSeveritiesItem) {
    this.noticeSeverities.add(noticeSeveritiesItem);
    return this;
  }

   /**
   * Get noticeSeverities
   * @return noticeSeverities
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NoticeSeveritiesEnum> getNoticeSeverities() {
    return noticeSeverities;
  }


  public void setNoticeSeverities(List<NoticeSeveritiesEnum> noticeSeverities) {
    this.noticeSeverities = noticeSeverities;
  }


  public AlertNotifierCreationParams languageCode(NotifierLanguageCode languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NotifierLanguageCode getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(NotifierLanguageCode languageCode) {
    this.languageCode = languageCode;
  }


  public AlertNotifierCreationParams emailTos(List<String> emailTos) {
    
    this.emailTos = emailTos;
    return this;
  }

  public AlertNotifierCreationParams addEmailTosItem(String emailTosItem) {
    this.emailTos.add(emailTosItem);
    return this;
  }

   /**
   * Get emailTos
   * @return emailTos
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getEmailTos() {
    return emailTos;
  }


  public void setEmailTos(List<String> emailTos) {
    this.emailTos = emailTos;
  }


  public AlertNotifierCreationParams emailFrom(String emailFrom) {
    
    this.emailFrom = emailFrom;
    return this;
  }

   /**
   * Get emailFrom
   * @return emailFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmailFrom() {
    return emailFrom;
  }


  public void setEmailFrom(String emailFrom) {
    this.emailFrom = emailFrom;
  }


  public AlertNotifierCreationParams disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public AlertNotifierCreationParams smtpServerId(String smtpServerId) {
    
    this.smtpServerId = smtpServerId;
    return this;
  }

   /**
   * Get smtpServerId
   * @return smtpServerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSmtpServerId() {
    return smtpServerId;
  }


  public void setSmtpServerId(String smtpServerId) {
    this.smtpServerId = smtpServerId;
  }


  public AlertNotifierCreationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AlertNotifierCreationParams clusters(ClusterWhereInput clusters) {
    
    this.clusters = clusters;
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ClusterWhereInput getClusters() {
    return clusters;
  }


  public void setClusters(ClusterWhereInput clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotifierCreationParams alertNotifierCreationParams = (AlertNotifierCreationParams) o;
    return Objects.equals(this.noticeSeverities, alertNotifierCreationParams.noticeSeverities) &&
        Objects.equals(this.languageCode, alertNotifierCreationParams.languageCode) &&
        Objects.equals(this.emailTos, alertNotifierCreationParams.emailTos) &&
        Objects.equals(this.emailFrom, alertNotifierCreationParams.emailFrom) &&
        Objects.equals(this.disabled, alertNotifierCreationParams.disabled) &&
        Objects.equals(this.smtpServerId, alertNotifierCreationParams.smtpServerId) &&
        Objects.equals(this.name, alertNotifierCreationParams.name) &&
        Objects.equals(this.clusters, alertNotifierCreationParams.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noticeSeverities, languageCode, emailTos, emailFrom, disabled, smtpServerId, name, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertNotifierCreationParams {\n");
    sb.append("    noticeSeverities: ").append(toIndentedString(noticeSeverities)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    emailTos: ").append(toIndentedString(emailTos)).append("\n");
    sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    smtpServerId: ").append(toIndentedString(smtpServerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

