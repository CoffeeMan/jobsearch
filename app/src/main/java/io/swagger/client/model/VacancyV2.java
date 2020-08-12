/*
 * JobSearch API
 * This is a specification for server-client job search communication
 *
 * OpenAPI spec version: 1.1.1-release
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
import io.swagger.client.model.Company;
import io.swagger.client.model.VacancyContactsV2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * VacancyV2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-12T13:09:32.394+03:00[Europe/Moscow]")
public class VacancyV2 {
  @SerializedName("vacancyId")
  private Long vacancyId = null;

  @SerializedName("naturalId")
  private Integer naturalId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("industry")
  private String industry = null;

  @SerializedName("responsibilities")
  private String responsibilities = null;

  @SerializedName("requirements")
  private String requirements = null;

  @SerializedName("skills")
  private String skills = null;

  @SerializedName("publicationDate")
  private OffsetDateTime publicationDate = null;

  @SerializedName("closingDate")
  private OffsetDateTime closingDate = null;

  @SerializedName("salary")
  private Integer salary = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("isRemote")
  private Boolean isRemote = null;

  @SerializedName("isRelocate")
  private Boolean isRelocate = null;

  @SerializedName("optionalRequirements")
  private String optionalRequirements = null;

  @SerializedName("benefits")
  private String benefits = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("views")
  private Integer views = null;

  @SerializedName("responses")
  private Integer responses = null;

  @SerializedName("contacts")
  private VacancyContactsV2 contacts = null;

  @SerializedName("company")
  private Company company = null;

  public VacancyV2 vacancyId(Long vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

   /**
   * Get vacancyId
   * @return vacancyId
  **/
  @Schema(description = "")
  public Long getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(Long vacancyId) {
    this.vacancyId = vacancyId;
  }

  public VacancyV2 naturalId(Integer naturalId) {
    this.naturalId = naturalId;
    return this;
  }

   /**
   * Get naturalId
   * @return naturalId
  **/
  @Schema(description = "")
  public Integer getNaturalId() {
    return naturalId;
  }

  public void setNaturalId(Integer naturalId) {
    this.naturalId = naturalId;
  }

  public VacancyV2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VacancyV2 position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @Schema(required = true, description = "")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public VacancyV2 industry(String industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @Schema(required = true, description = "")
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public VacancyV2 responsibilities(String responsibilities) {
    this.responsibilities = responsibilities;
    return this;
  }

   /**
   * Get responsibilities
   * @return responsibilities
  **/
  @Schema(required = true, description = "")
  public String getResponsibilities() {
    return responsibilities;
  }

  public void setResponsibilities(String responsibilities) {
    this.responsibilities = responsibilities;
  }

  public VacancyV2 requirements(String requirements) {
    this.requirements = requirements;
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @Schema(required = true, description = "")
  public String getRequirements() {
    return requirements;
  }

  public void setRequirements(String requirements) {
    this.requirements = requirements;
  }

  public VacancyV2 skills(String skills) {
    this.skills = skills;
    return this;
  }

   /**
   * Get skills
   * @return skills
  **/
  @Schema(required = true, description = "")
  public String getSkills() {
    return skills;
  }

  public void setSkills(String skills) {
    this.skills = skills;
  }

  public VacancyV2 publicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * Get publicationDate
   * @return publicationDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
  }

  public VacancyV2 closingDate(OffsetDateTime closingDate) {
    this.closingDate = closingDate;
    return this;
  }

   /**
   * Get closingDate
   * @return closingDate
  **/
  @Schema(description = "")
  public OffsetDateTime getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(OffsetDateTime closingDate) {
    this.closingDate = closingDate;
  }

  public VacancyV2 salary(Integer salary) {
    this.salary = salary;
    return this;
  }

   /**
   * Get salary
   * @return salary
  **/
  @Schema(description = "")
  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public VacancyV2 city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public VacancyV2 isRemote(Boolean isRemote) {
    this.isRemote = isRemote;
    return this;
  }

   /**
   * Get isRemote
   * @return isRemote
  **/
  @Schema(description = "")
  public Boolean isIsRemote() {
    return isRemote;
  }

  public void setIsRemote(Boolean isRemote) {
    this.isRemote = isRemote;
  }

  public VacancyV2 isRelocate(Boolean isRelocate) {
    this.isRelocate = isRelocate;
    return this;
  }

   /**
   * Get isRelocate
   * @return isRelocate
  **/
  @Schema(description = "")
  public Boolean isIsRelocate() {
    return isRelocate;
  }

  public void setIsRelocate(Boolean isRelocate) {
    this.isRelocate = isRelocate;
  }

  public VacancyV2 optionalRequirements(String optionalRequirements) {
    this.optionalRequirements = optionalRequirements;
    return this;
  }

   /**
   * Get optionalRequirements
   * @return optionalRequirements
  **/
  @Schema(description = "")
  public String getOptionalRequirements() {
    return optionalRequirements;
  }

  public void setOptionalRequirements(String optionalRequirements) {
    this.optionalRequirements = optionalRequirements;
  }

  public VacancyV2 benefits(String benefits) {
    this.benefits = benefits;
    return this;
  }

   /**
   * Get benefits
   * @return benefits
  **/
  @Schema(description = "")
  public String getBenefits() {
    return benefits;
  }

  public void setBenefits(String benefits) {
    this.benefits = benefits;
  }

  public VacancyV2 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VacancyV2 resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Schema(description = "")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public VacancyV2 views(Integer views) {
    this.views = views;
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @Schema(description = "")
  public Integer getViews() {
    return views;
  }

  public void setViews(Integer views) {
    this.views = views;
  }

  public VacancyV2 responses(Integer responses) {
    this.responses = responses;
    return this;
  }

   /**
   * Get responses
   * @return responses
  **/
  @Schema(description = "")
  public Integer getResponses() {
    return responses;
  }

  public void setResponses(Integer responses) {
    this.responses = responses;
  }

  public VacancyV2 contacts(VacancyContactsV2 contacts) {
    this.contacts = contacts;
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @Schema(description = "")
  public VacancyContactsV2 getContacts() {
    return contacts;
  }

  public void setContacts(VacancyContactsV2 contacts) {
    this.contacts = contacts;
  }

  public VacancyV2 company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @Schema(description = "")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyV2 vacancyV2 = (VacancyV2) o;
    return Objects.equals(this.vacancyId, vacancyV2.vacancyId) &&
        Objects.equals(this.naturalId, vacancyV2.naturalId) &&
        Objects.equals(this.name, vacancyV2.name) &&
        Objects.equals(this.position, vacancyV2.position) &&
        Objects.equals(this.industry, vacancyV2.industry) &&
        Objects.equals(this.responsibilities, vacancyV2.responsibilities) &&
        Objects.equals(this.requirements, vacancyV2.requirements) &&
        Objects.equals(this.skills, vacancyV2.skills) &&
        Objects.equals(this.publicationDate, vacancyV2.publicationDate) &&
        Objects.equals(this.closingDate, vacancyV2.closingDate) &&
        Objects.equals(this.salary, vacancyV2.salary) &&
        Objects.equals(this.city, vacancyV2.city) &&
        Objects.equals(this.isRemote, vacancyV2.isRemote) &&
        Objects.equals(this.isRelocate, vacancyV2.isRelocate) &&
        Objects.equals(this.optionalRequirements, vacancyV2.optionalRequirements) &&
        Objects.equals(this.benefits, vacancyV2.benefits) &&
        Objects.equals(this.description, vacancyV2.description) &&
        Objects.equals(this.resource, vacancyV2.resource) &&
        Objects.equals(this.views, vacancyV2.views) &&
        Objects.equals(this.responses, vacancyV2.responses) &&
        Objects.equals(this.contacts, vacancyV2.contacts) &&
        Objects.equals(this.company, vacancyV2.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vacancyId, naturalId, name, position, industry, responsibilities, requirements, skills, publicationDate, closingDate, salary, city, isRemote, isRelocate, optionalRequirements, benefits, description, resource, views, responses, contacts, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyV2 {\n");
    
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
    sb.append("    naturalId: ").append(toIndentedString(naturalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    responsibilities: ").append(toIndentedString(responsibilities)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    isRemote: ").append(toIndentedString(isRemote)).append("\n");
    sb.append("    isRelocate: ").append(toIndentedString(isRelocate)).append("\n");
    sb.append("    optionalRequirements: ").append(toIndentedString(optionalRequirements)).append("\n");
    sb.append("    benefits: ").append(toIndentedString(benefits)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
