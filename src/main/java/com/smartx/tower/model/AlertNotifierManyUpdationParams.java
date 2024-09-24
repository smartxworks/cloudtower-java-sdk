package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.AlertNotifierWhereInput;
import com.smartx.tower.model.NotifierLanguageCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AlertNotifierManyUpdationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class AlertNotifierManyUpdationParams {
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
  private List<NoticeSeveritiesEnum> noticeSeverities = null;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private NotifierLanguageCode languageCode;

  public static final String SERIALIZED_NAME_EMAIL_TOS = "email_tos";
  @SerializedName(SERIALIZED_NAME_EMAIL_TOS)
  private List<String> emailTos = null;

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

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private AlertNotifierWhereInput where;

  public AlertNotifierManyUpdationParams() { 
  }

  public AlertNotifierManyUpdationParams noticeSeverities(List<NoticeSeveritiesEnum> noticeSeverities) {
    
    this.noticeSeverities = noticeSeverities;
    return this;
  }

  public AlertNotifierManyUpdationParams addNoticeSeveritiesItem(NoticeSeveritiesEnum noticeSeveritiesItem) {
    if (this.noticeSeverities == null) {
      this.noticeSeverities = new ArrayList<NoticeSeveritiesEnum>();
    }
    this.noticeSeverities.add(noticeSeveritiesItem);
    return this;
  }

   /**
   * Get noticeSeverities
   * @return noticeSeverities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NoticeSeveritiesEnum> getNoticeSeverities() {
    return noticeSeverities;
  }


  public void setNoticeSeverities(List<NoticeSeveritiesEnum> noticeSeverities) {
    this.noticeSeverities = noticeSeverities;
  }


  public AlertNotifierManyUpdationParams languageCode(NotifierLanguageCode languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Get languageCode
   * @return languageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotifierLanguageCode getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(NotifierLanguageCode languageCode) {
    this.languageCode = languageCode;
  }


  public AlertNotifierManyUpdationParams emailTos(List<String> emailTos) {
    
    this.emailTos = emailTos;
    return this;
  }

  public AlertNotifierManyUpdationParams addEmailTosItem(String emailTosItem) {
    if (this.emailTos == null) {
      this.emailTos = new ArrayList<String>();
    }
    this.emailTos.add(emailTosItem);
    return this;
  }

   /**
   * Get emailTos
   * @return emailTos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEmailTos() {
    return emailTos;
  }


  public void setEmailTos(List<String> emailTos) {
    this.emailTos = emailTos;
  }


  public AlertNotifierManyUpdationParams emailFrom(String emailFrom) {
    
    this.emailFrom = emailFrom;
    return this;
  }

   /**
   * Get emailFrom
   * @return emailFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmailFrom() {
    return emailFrom;
  }


  public void setEmailFrom(String emailFrom) {
    this.emailFrom = emailFrom;
  }


  public AlertNotifierManyUpdationParams disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public AlertNotifierManyUpdationParams smtpServerId(String smtpServerId) {
    
    this.smtpServerId = smtpServerId;
    return this;
  }

   /**
   * Get smtpServerId
   * @return smtpServerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSmtpServerId() {
    return smtpServerId;
  }


  public void setSmtpServerId(String smtpServerId) {
    this.smtpServerId = smtpServerId;
  }


  public AlertNotifierManyUpdationParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AlertNotifierManyUpdationParams where(AlertNotifierWhereInput where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AlertNotifierWhereInput getWhere() {
    return where;
  }


  public void setWhere(AlertNotifierWhereInput where) {
    this.where = where;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotifierManyUpdationParams alertNotifierManyUpdationParams = (AlertNotifierManyUpdationParams) o;
    return Objects.equals(this.noticeSeverities, alertNotifierManyUpdationParams.noticeSeverities) &&
        Objects.equals(this.languageCode, alertNotifierManyUpdationParams.languageCode) &&
        Objects.equals(this.emailTos, alertNotifierManyUpdationParams.emailTos) &&
        Objects.equals(this.emailFrom, alertNotifierManyUpdationParams.emailFrom) &&
        Objects.equals(this.disabled, alertNotifierManyUpdationParams.disabled) &&
        Objects.equals(this.smtpServerId, alertNotifierManyUpdationParams.smtpServerId) &&
        Objects.equals(this.name, alertNotifierManyUpdationParams.name) &&
        Objects.equals(this.where, alertNotifierManyUpdationParams.where);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noticeSeverities, languageCode, emailTos, emailFrom, disabled, smtpServerId, name, where);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertNotifierManyUpdationParams {\n");
    sb.append("    noticeSeverities: ").append(toIndentedString(noticeSeverities)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    emailTos: ").append(toIndentedString(emailTos)).append("\n");
    sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    smtpServerId: ").append(toIndentedString(smtpServerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

