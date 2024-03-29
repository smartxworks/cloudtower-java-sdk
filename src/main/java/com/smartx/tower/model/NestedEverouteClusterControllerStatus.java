package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.NestedEverouteControllerStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedEverouteClusterControllerStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedEverouteClusterControllerStatus {
  public static final String SERIALIZED_NAME_CURRENT_NUMBER = "currentNumber";
  @SerializedName(SERIALIZED_NAME_CURRENT_NUMBER)
  private Integer currentNumber;

  public static final String SERIALIZED_NAME_EXPECT_NUMBER = "expectNumber";
  @SerializedName(SERIALIZED_NAME_EXPECT_NUMBER)
  private Integer expectNumber;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<NestedEverouteControllerStatus> instances = null;

  public static final String SERIALIZED_NAME_NUMBER_HEALTH = "numberHealth";
  @SerializedName(SERIALIZED_NAME_NUMBER_HEALTH)
  private Integer numberHealth;

  public NestedEverouteClusterControllerStatus() { 
  }

  public NestedEverouteClusterControllerStatus currentNumber(Integer currentNumber) {
    
    this.currentNumber = currentNumber;
    return this;
  }

   /**
   * Get currentNumber
   * @return currentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentNumber() {
    return currentNumber;
  }


  public void setCurrentNumber(Integer currentNumber) {
    this.currentNumber = currentNumber;
  }


  public NestedEverouteClusterControllerStatus expectNumber(Integer expectNumber) {
    
    this.expectNumber = expectNumber;
    return this;
  }

   /**
   * Get expectNumber
   * @return expectNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExpectNumber() {
    return expectNumber;
  }


  public void setExpectNumber(Integer expectNumber) {
    this.expectNumber = expectNumber;
  }


  public NestedEverouteClusterControllerStatus instances(List<NestedEverouteControllerStatus> instances) {
    
    this.instances = instances;
    return this;
  }

  public NestedEverouteClusterControllerStatus addInstancesItem(NestedEverouteControllerStatus instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<NestedEverouteControllerStatus>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedEverouteControllerStatus> getInstances() {
    return instances;
  }


  public void setInstances(List<NestedEverouteControllerStatus> instances) {
    this.instances = instances;
  }


  public NestedEverouteClusterControllerStatus numberHealth(Integer numberHealth) {
    
    this.numberHealth = numberHealth;
    return this;
  }

   /**
   * Get numberHealth
   * @return numberHealth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberHealth() {
    return numberHealth;
  }


  public void setNumberHealth(Integer numberHealth) {
    this.numberHealth = numberHealth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedEverouteClusterControllerStatus nestedEverouteClusterControllerStatus = (NestedEverouteClusterControllerStatus) o;
    return Objects.equals(this.currentNumber, nestedEverouteClusterControllerStatus.currentNumber) &&
        Objects.equals(this.expectNumber, nestedEverouteClusterControllerStatus.expectNumber) &&
        Objects.equals(this.instances, nestedEverouteClusterControllerStatus.instances) &&
        Objects.equals(this.numberHealth, nestedEverouteClusterControllerStatus.numberHealth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentNumber, expectNumber, instances, numberHealth);
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
    sb.append("class NestedEverouteClusterControllerStatus {\n");
    sb.append("    currentNumber: ").append(toIndentedString(currentNumber)).append("\n");
    sb.append("    expectNumber: ").append(toIndentedString(expectNumber)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    numberHealth: ").append(toIndentedString(numberHealth)).append("\n");
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

