package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.ColumnConfig;
import com.smartx.tower.model.TableReporterParamsFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TableReporterParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class TableReporterParams {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private TableReporterParamsFilter filter;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ColumnConfig> columns = new ArrayList<ColumnConfig>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TableReporterParams() { 
  }

  public TableReporterParams filter(TableReporterParamsFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TableReporterParamsFilter getFilter() {
    return filter;
  }


  public void setFilter(TableReporterParamsFilter filter) {
    this.filter = filter;
  }


  public TableReporterParams columns(List<ColumnConfig> columns) {
    
    this.columns = columns;
    return this;
  }

  public TableReporterParams addColumnsItem(ColumnConfig columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ColumnConfig> getColumns() {
    return columns;
  }


  public void setColumns(List<ColumnConfig> columns) {
    this.columns = columns;
  }


  public TableReporterParams name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableReporterParams tableReporterParams = (TableReporterParams) o;
    return Objects.equals(this.filter, tableReporterParams.filter) &&
        Objects.equals(this.columns, tableReporterParams.columns) &&
        Objects.equals(this.name, tableReporterParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, columns, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableReporterParams {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

