/*
 * JobSearch API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.4-release
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Pageable
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-20T17:46:18.738Z[GMT]")
public class Pageable {
  @SerializedName("size")
  private Integer size = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("sort")
  private List<String> sort = null;

  public Pageable size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * minimum: 1
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Pageable page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * minimum: 0
   * @return page
  **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Pageable sort(List<String> sort) {
    this.sort = sort;
    return this;
  }

  public Pageable addSortItem(String sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<String>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @Schema(description = "")
  public List<String> getSort() {
    return sort;
  }

  public void setSort(List<String> sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pageable pageable = (Pageable) o;
    return Objects.equals(this.size, pageable.size) &&
        Objects.equals(this.page, pageable.page) &&
        Objects.equals(this.sort, pageable.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, page, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pageable {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
