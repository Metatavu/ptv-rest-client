/*
 * PTV Open Api version 6
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fi.metatavu.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fi.metatavu.ptv.client.model.V4VmOpenApiFintoItem;
import fi.metatavu.ptv.client.model.V4VmOpenApiLaw;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API V6 - View Model of general description
 */
@ApiModel(description = "OPEN API V6 - View Model of general description")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T11:41:22.679+03:00")
public class V6VmOpenApiGeneralDescription {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("names")
  private List<VmOpenApiLocalizedListItem> names = null;

  @JsonProperty("descriptions")
  private List<VmOpenApiLocalizedListItem> descriptions = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("serviceClasses")
  private List<V4VmOpenApiFintoItem> serviceClasses = null;

  @JsonProperty("ontologyTerms")
  private List<V4VmOpenApiFintoItem> ontologyTerms = null;

  @JsonProperty("targetGroups")
  private List<V4VmOpenApiFintoItem> targetGroups = null;

  @JsonProperty("lifeEvents")
  private List<V4VmOpenApiFintoItem> lifeEvents = null;

  @JsonProperty("industrialClasses")
  private List<V4VmOpenApiFintoItem> industrialClasses = null;

  @JsonProperty("requirements")
  private List<VmOpenApiLanguageItem> requirements = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("legislation")
  private List<V4VmOpenApiLaw> legislation = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("modified")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified = null;

  public V6VmOpenApiGeneralDescription id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Entity Guid identifier.
   * @return id
  **/
  @ApiModelProperty(value = "Entity Guid identifier.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public V6VmOpenApiGeneralDescription names(List<VmOpenApiLocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public V6VmOpenApiGeneralDescription addNamesItem(VmOpenApiLocalizedListItem namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * List of localized names. (Max.Length: 100).
   * @return names
  **/
  @ApiModelProperty(value = "List of localized names. (Max.Length: 100).")
  public List<VmOpenApiLocalizedListItem> getNames() {
    return names;
  }

  public void setNames(List<VmOpenApiLocalizedListItem> names) {
    this.names = names;
  }

  public V6VmOpenApiGeneralDescription descriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public V6VmOpenApiGeneralDescription addDescriptionsItem(VmOpenApiLocalizedListItem descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * List of localized descriptions. (Max.Length: 150 ShortDescription). (Max.Length: 2500 Description). (Max.Length: 2500 ServiceUserInstruction). (Max.Length: 2500 BackgroundDescription).
   * @return descriptions
  **/
  @ApiModelProperty(value = "List of localized descriptions. (Max.Length: 150 ShortDescription). (Max.Length: 2500 Description). (Max.Length: 2500 ServiceUserInstruction). (Max.Length: 2500 BackgroundDescription).")
  public List<VmOpenApiLocalizedListItem> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  public V6VmOpenApiGeneralDescription languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V6VmOpenApiGeneralDescription addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of statutory service general description languages.
   * @return languages
  **/
  @ApiModelProperty(value = "List of statutory service general description languages.")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public V6VmOpenApiGeneralDescription serviceClasses(List<V4VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public V6VmOpenApiGeneralDescription addServiceClassesItem(V4VmOpenApiFintoItem serviceClassesItem) {
    if (this.serviceClasses == null) {
      this.serviceClasses = new ArrayList<V4VmOpenApiFintoItem>();
    }
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * List of service classes.
   * @return serviceClasses
  **/
  @ApiModelProperty(value = "List of service classes.")
  public List<V4VmOpenApiFintoItem> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<V4VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public V6VmOpenApiGeneralDescription ontologyTerms(List<V4VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public V6VmOpenApiGeneralDescription addOntologyTermsItem(V4VmOpenApiFintoItem ontologyTermsItem) {
    if (this.ontologyTerms == null) {
      this.ontologyTerms = new ArrayList<V4VmOpenApiFintoItem>();
    }
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * List of ontology terms.
   * @return ontologyTerms
  **/
  @ApiModelProperty(value = "List of ontology terms.")
  public List<V4VmOpenApiFintoItem> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<V4VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public V6VmOpenApiGeneralDescription targetGroups(List<V4VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public V6VmOpenApiGeneralDescription addTargetGroupsItem(V4VmOpenApiFintoItem targetGroupsItem) {
    if (this.targetGroups == null) {
      this.targetGroups = new ArrayList<V4VmOpenApiFintoItem>();
    }
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * List of target groups.
   * @return targetGroups
  **/
  @ApiModelProperty(value = "List of target groups.")
  public List<V4VmOpenApiFintoItem> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<V4VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public V6VmOpenApiGeneralDescription lifeEvents(List<V4VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public V6VmOpenApiGeneralDescription addLifeEventsItem(V4VmOpenApiFintoItem lifeEventsItem) {
    if (this.lifeEvents == null) {
      this.lifeEvents = new ArrayList<V4VmOpenApiFintoItem>();
    }
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * List of life events.
   * @return lifeEvents
  **/
  @ApiModelProperty(value = "List of life events.")
  public List<V4VmOpenApiFintoItem> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<V4VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public V6VmOpenApiGeneralDescription industrialClasses(List<V4VmOpenApiFintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public V6VmOpenApiGeneralDescription addIndustrialClassesItem(V4VmOpenApiFintoItem industrialClassesItem) {
    if (this.industrialClasses == null) {
      this.industrialClasses = new ArrayList<V4VmOpenApiFintoItem>();
    }
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * List of industrial classes.
   * @return industrialClasses
  **/
  @ApiModelProperty(value = "List of industrial classes.")
  public List<V4VmOpenApiFintoItem> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<V4VmOpenApiFintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public V6VmOpenApiGeneralDescription requirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public V6VmOpenApiGeneralDescription addRequirementsItem(VmOpenApiLanguageItem requirementsItem) {
    if (this.requirements == null) {
      this.requirements = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Localized service usage requirements (description of requirement). (Max.Length: 2500).
   * @return requirements
  **/
  @ApiModelProperty(value = "Localized service usage requirements (description of requirement). (Max.Length: 2500).")
  public List<VmOpenApiLanguageItem> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
  }

  public V6VmOpenApiGeneralDescription type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Service type. Possible values are: Service or PermissionAndObligation. In version 6 (and newer) also ProfessionalQualifications.
   * @return type
  **/
  @ApiModelProperty(value = "Service type. Possible values are: Service or PermissionAndObligation. In version 6 (and newer) also ProfessionalQualifications.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V6VmOpenApiGeneralDescription serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Charged, Free or Other
   * @return serviceChargeType
  **/
  @ApiModelProperty(value = "Service charge type. Possible values are: Charged, Free or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public V6VmOpenApiGeneralDescription legislation(List<V4VmOpenApiLaw> legislation) {
    this.legislation = legislation;
    return this;
  }

  public V6VmOpenApiGeneralDescription addLegislationItem(V4VmOpenApiLaw legislationItem) {
    if (this.legislation == null) {
      this.legislation = new ArrayList<V4VmOpenApiLaw>();
    }
    this.legislation.add(legislationItem);
    return this;
  }

   /**
   * Laws that a general description is based on.
   * @return legislation
  **/
  @ApiModelProperty(value = "Laws that a general description is based on.")
  public List<V4VmOpenApiLaw> getLegislation() {
    return legislation;
  }

  public void setLegislation(List<V4VmOpenApiLaw> legislation) {
    this.legislation = legislation;
  }

  public V6VmOpenApiGeneralDescription publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status. Possible values are: Draft, Published, Deleted or Modified.
   * @return publishingStatus
  **/
  @ApiModelProperty(value = "Publishing status. Possible values are: Draft, Published, Deleted or Modified.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V6VmOpenApiGeneralDescription modified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Date when item was modified/created (UTC).
   * @return modified
  **/
  @ApiModelProperty(value = "Date when item was modified/created (UTC).")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V6VmOpenApiGeneralDescription v6VmOpenApiGeneralDescription = (V6VmOpenApiGeneralDescription) o;
    return Objects.equals(this.id, v6VmOpenApiGeneralDescription.id) &&
        Objects.equals(this.names, v6VmOpenApiGeneralDescription.names) &&
        Objects.equals(this.descriptions, v6VmOpenApiGeneralDescription.descriptions) &&
        Objects.equals(this.languages, v6VmOpenApiGeneralDescription.languages) &&
        Objects.equals(this.serviceClasses, v6VmOpenApiGeneralDescription.serviceClasses) &&
        Objects.equals(this.ontologyTerms, v6VmOpenApiGeneralDescription.ontologyTerms) &&
        Objects.equals(this.targetGroups, v6VmOpenApiGeneralDescription.targetGroups) &&
        Objects.equals(this.lifeEvents, v6VmOpenApiGeneralDescription.lifeEvents) &&
        Objects.equals(this.industrialClasses, v6VmOpenApiGeneralDescription.industrialClasses) &&
        Objects.equals(this.requirements, v6VmOpenApiGeneralDescription.requirements) &&
        Objects.equals(this.type, v6VmOpenApiGeneralDescription.type) &&
        Objects.equals(this.serviceChargeType, v6VmOpenApiGeneralDescription.serviceChargeType) &&
        Objects.equals(this.legislation, v6VmOpenApiGeneralDescription.legislation) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiGeneralDescription.publishingStatus) &&
        Objects.equals(this.modified, v6VmOpenApiGeneralDescription.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, names, descriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, requirements, type, serviceChargeType, legislation, publishingStatus, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiGeneralDescription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

