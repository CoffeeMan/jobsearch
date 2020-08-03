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
 * CompanyContacts
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-31T20:59:44.254754400+03:00[Europe/Moscow]")
public class CompanyContacts {
  @SerializedName("email")
  private String email = null;

  @SerializedName("website")
  private String website = null;

  public CompanyContacts email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CompanyContacts website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @Schema(description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyContacts companyContacts = (CompanyContacts) o;
    return Objects.equals(this.email, companyContacts.email) &&
        Objects.equals(this.website, companyContacts.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyContacts {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
