package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.Architecture;
import com.smartx.tower.model.NestedCloudTowerApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CloudTowerApplicationPackage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class CloudTowerApplicationPackage {
  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<NestedCloudTowerApplication> applications = null;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private Architecture architecture;

  public static final String SERIALIZED_NAME_CONTAINERS = "containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Object containers;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private Object images;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCOS_VERSION = "scosVersion";
  @SerializedName(SERIALIZED_NAME_SCOS_VERSION)
  private String scosVersion;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public CloudTowerApplicationPackage() { 
  }

  public CloudTowerApplicationPackage applications(List<NestedCloudTowerApplication> applications) {
    
    this.applications = applications;
    return this;
  }

  public CloudTowerApplicationPackage addApplicationsItem(NestedCloudTowerApplication applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<NestedCloudTowerApplication>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedCloudTowerApplication> getApplications() {
    return applications;
  }


  public void setApplications(List<NestedCloudTowerApplication> applications) {
    this.applications = applications;
  }


  public CloudTowerApplicationPackage architecture(Architecture architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Architecture getArchitecture() {
    return architecture;
  }


  public void setArchitecture(Architecture architecture) {
    this.architecture = architecture;
  }


  public CloudTowerApplicationPackage containers(Object containers) {
    
    this.containers = containers;
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getContainers() {
    return containers;
  }


  public void setContainers(Object containers) {
    this.containers = containers;
  }


  public CloudTowerApplicationPackage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CloudTowerApplicationPackage images(Object images) {
    
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getImages() {
    return images;
  }


  public void setImages(Object images) {
    this.images = images;
  }


  public CloudTowerApplicationPackage name(String name) {
    
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


  public CloudTowerApplicationPackage scosVersion(String scosVersion) {
    
    this.scosVersion = scosVersion;
    return this;
  }

   /**
   * Get scosVersion
   * @return scosVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getScosVersion() {
    return scosVersion;
  }


  public void setScosVersion(String scosVersion) {
    this.scosVersion = scosVersion;
  }


  public CloudTowerApplicationPackage version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudTowerApplicationPackage cloudTowerApplicationPackage = (CloudTowerApplicationPackage) o;
    return Objects.equals(this.applications, cloudTowerApplicationPackage.applications) &&
        Objects.equals(this.architecture, cloudTowerApplicationPackage.architecture) &&
        Objects.equals(this.containers, cloudTowerApplicationPackage.containers) &&
        Objects.equals(this.id, cloudTowerApplicationPackage.id) &&
        Objects.equals(this.images, cloudTowerApplicationPackage.images) &&
        Objects.equals(this.name, cloudTowerApplicationPackage.name) &&
        Objects.equals(this.scosVersion, cloudTowerApplicationPackage.scosVersion) &&
        Objects.equals(this.version, cloudTowerApplicationPackage.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, architecture, containers, id, images, name, scosVersion, version);
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
    sb.append("class CloudTowerApplicationPackage {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scosVersion: ").append(toIndentedString(scosVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

