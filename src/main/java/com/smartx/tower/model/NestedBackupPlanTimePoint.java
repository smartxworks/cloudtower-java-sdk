package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.WeekdayTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NestedBackupPlanTimePoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class NestedBackupPlanTimePoint {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Integer date;

  public static final String SERIALIZED_NAME_DATE_POSITION = "date_position";
  @SerializedName(SERIALIZED_NAME_DATE_POSITION)
  private List<Integer> datePosition = null;

  public static final String SERIALIZED_NAME_HOUR = "hour";
  @SerializedName(SERIALIZED_NAME_HOUR)
  private Integer hour;

  public static final String SERIALIZED_NAME_MINUTE = "minute";
  @SerializedName(SERIALIZED_NAME_MINUTE)
  private Integer minute;

  public static final String SERIALIZED_NAME_WEEKDAY = "weekday";
  @SerializedName(SERIALIZED_NAME_WEEKDAY)
  private WeekdayTypeEnum weekday;

  public NestedBackupPlanTimePoint() { 
  }

  public NestedBackupPlanTimePoint date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    this.date = date;
  }


  public NestedBackupPlanTimePoint datePosition(List<Integer> datePosition) {
    
    this.datePosition = datePosition;
    return this;
  }

  public NestedBackupPlanTimePoint addDatePositionItem(Integer datePositionItem) {
    if (this.datePosition == null) {
      this.datePosition = new ArrayList<Integer>();
    }
    this.datePosition.add(datePositionItem);
    return this;
  }

   /**
   * Get datePosition
   * @return datePosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDatePosition() {
    return datePosition;
  }


  public void setDatePosition(List<Integer> datePosition) {
    this.datePosition = datePosition;
  }


  public NestedBackupPlanTimePoint hour(Integer hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getHour() {
    return hour;
  }


  public void setHour(Integer hour) {
    this.hour = hour;
  }


  public NestedBackupPlanTimePoint minute(Integer minute) {
    
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMinute() {
    return minute;
  }


  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  public NestedBackupPlanTimePoint weekday(WeekdayTypeEnum weekday) {
    
    this.weekday = weekday;
    return this;
  }

   /**
   * Get weekday
   * @return weekday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WeekdayTypeEnum getWeekday() {
    return weekday;
  }


  public void setWeekday(WeekdayTypeEnum weekday) {
    this.weekday = weekday;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedBackupPlanTimePoint nestedBackupPlanTimePoint = (NestedBackupPlanTimePoint) o;
    return Objects.equals(this.date, nestedBackupPlanTimePoint.date) &&
        Objects.equals(this.datePosition, nestedBackupPlanTimePoint.datePosition) &&
        Objects.equals(this.hour, nestedBackupPlanTimePoint.hour) &&
        Objects.equals(this.minute, nestedBackupPlanTimePoint.minute) &&
        Objects.equals(this.weekday, nestedBackupPlanTimePoint.weekday);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, datePosition, hour, minute, weekday);
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
    sb.append("class NestedBackupPlanTimePoint {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    datePosition: ").append(toIndentedString(datePosition)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
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

