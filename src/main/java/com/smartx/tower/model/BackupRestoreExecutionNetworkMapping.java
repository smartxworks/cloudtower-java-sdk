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
 * BackupRestoreExecutionNetworkMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class BackupRestoreExecutionNetworkMapping {
  public static final String SERIALIZED_NAME_SRC_VLAN_ID = "src_vlan_id";
  @SerializedName(SERIALIZED_NAME_SRC_VLAN_ID)
  private String srcVlanId;

  public static final String SERIALIZED_NAME_DST_VLAN_ID = "dst_vlan_id";
  @SerializedName(SERIALIZED_NAME_DST_VLAN_ID)
  private String dstVlanId;

  /**
   * Gets or Sets typename
   */
  @JsonAdapter(TypenameEnum.Adapter.class)
  public enum TypenameEnum {
    BACKUPRESTOREEXECUTIONNETWORKMAPPING("BackupRestoreExecutionNetworkMapping");

    private String value;

    TypenameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypenameEnum fromValue(String value) {
      for (TypenameEnum b : TypenameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypenameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypenameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypenameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypenameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPENAME = "__typename";
  @SerializedName(SERIALIZED_NAME_TYPENAME)
  private TypenameEnum typename;

  public BackupRestoreExecutionNetworkMapping() { 
  }

  public BackupRestoreExecutionNetworkMapping srcVlanId(String srcVlanId) {
    
    this.srcVlanId = srcVlanId;
    return this;
  }

   /**
   * Get srcVlanId
   * @return srcVlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSrcVlanId() {
    return srcVlanId;
  }


  public void setSrcVlanId(String srcVlanId) {
    this.srcVlanId = srcVlanId;
  }


  public BackupRestoreExecutionNetworkMapping dstVlanId(String dstVlanId) {
    
    this.dstVlanId = dstVlanId;
    return this;
  }

   /**
   * Get dstVlanId
   * @return dstVlanId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDstVlanId() {
    return dstVlanId;
  }


  public void setDstVlanId(String dstVlanId) {
    this.dstVlanId = dstVlanId;
  }


  public BackupRestoreExecutionNetworkMapping typename(TypenameEnum typename) {
    
    this.typename = typename;
    return this;
  }

   /**
   * Get typename
   * @return typename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypenameEnum getTypename() {
    return typename;
  }


  public void setTypename(TypenameEnum typename) {
    this.typename = typename;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupRestoreExecutionNetworkMapping backupRestoreExecutionNetworkMapping = (BackupRestoreExecutionNetworkMapping) o;
    return Objects.equals(this.srcVlanId, backupRestoreExecutionNetworkMapping.srcVlanId) &&
        Objects.equals(this.dstVlanId, backupRestoreExecutionNetworkMapping.dstVlanId) &&
        Objects.equals(this.typename, backupRestoreExecutionNetworkMapping.typename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcVlanId, dstVlanId, typename);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupRestoreExecutionNetworkMapping {\n");
    sb.append("    srcVlanId: ").append(toIndentedString(srcVlanId)).append("\n");
    sb.append("    dstVlanId: ").append(toIndentedString(dstVlanId)).append("\n");
    sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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

