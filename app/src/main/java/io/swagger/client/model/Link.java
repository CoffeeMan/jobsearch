/*
 * JobSearch API
 * This is a specification for server-client communication
 *
 * OpenAPI spec version: 1.4.3
 * Contact: stanis.stoyanov@outlook.com
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
/**
 * Link
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-31T20:59:44.254754400+03:00[Europe/Moscow]")
public class Link {
  @SerializedName("href")
  private String href = null;

  @SerializedName("hreflang")
  private String hreflang = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("deprecation")
  private String deprecation = null;

  @SerializedName("profile")
  private String profile = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("templated")
  private Boolean templated = null;

  public Link href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @Schema(description = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link hreflang(String hreflang) {
    this.hreflang = hreflang;
    return this;
  }

   /**
   * Get hreflang
   * @return hreflang
  **/
  @Schema(description = "")
  public String getHreflang() {
    return hreflang;
  }

  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }

  public Link title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Link type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Link deprecation(String deprecation) {
    this.deprecation = deprecation;
    return this;
  }

   /**
   * Get deprecation
   * @return deprecation
  **/
  @Schema(description = "")
  public String getDeprecation() {
    return deprecation;
  }

  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }

  public Link profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @Schema(description = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Link name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Link templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

   /**
   * Get templated
   * @return templated
  **/
  @Schema(description = "")
  public Boolean isTemplated() {
    return templated;
  }

  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.hreflang, link.hreflang) &&
        Objects.equals(this.title, link.title) &&
        Objects.equals(this.type, link.type) &&
        Objects.equals(this.deprecation, link.deprecation) &&
        Objects.equals(this.profile, link.profile) &&
        Objects.equals(this.name, link.name) &&
        Objects.equals(this.templated, link.templated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, hreflang, title, type, deprecation, profile, name, templated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
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
