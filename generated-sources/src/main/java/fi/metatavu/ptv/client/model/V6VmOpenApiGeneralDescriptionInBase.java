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
import fi.metatavu.ptv.client.model.V4VmOpenApiLaw;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V6 - View Model of general description for IN api base (PUT)
 */
@ApiModel(description = "OPEN API V6 - View Model of general description for IN api base (PUT)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-19T16:10:06.613+03:00")
public class V6VmOpenApiGeneralDescriptionInBase {
  @JsonProperty("names")
  private List<VmOpenApiLocalizedListItem> names = null;

  @JsonProperty("descriptions")
  private List<VmOpenApiLocalizedListItem> descriptions = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("serviceClasses")
  private List<String> serviceClasses = null;

  @JsonProperty("ontologyTerms")
  private List<String> ontologyTerms = null;

  @JsonProperty("targetGroups")
  private List<String> targetGroups = null;

  @JsonProperty("lifeEvents")
  private List<String> lifeEvents = null;

  @JsonProperty("industrialClasses")
  private List<String> industrialClasses = null;

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

  @JsonProperty("deleteAllLifeEvents")
  private Boolean deleteAllLifeEvents = null;

  @JsonProperty("deleteAllIndustrialClasses")
  private Boolean deleteAllIndustrialClasses = null;

  @JsonProperty("deleteAllLaws")
  private Boolean deleteAllLaws = null;

  @JsonProperty("deleteServiceChargeType")
  private Boolean deleteServiceChargeType = null;

  public V6VmOpenApiGeneralDescriptionInBase names(List<VmOpenApiLocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addNamesItem(VmOpenApiLocalizedListItem namesItem) {
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

  public V6VmOpenApiGeneralDescriptionInBase descriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addDescriptionsItem(VmOpenApiLocalizedListItem descriptionsItem) {
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

  public V6VmOpenApiGeneralDescriptionInBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addLanguagesItem(String languagesItem) {
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

  public V6VmOpenApiGeneralDescriptionInBase serviceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addServiceClassesItem(String serviceClassesItem) {
    if (this.serviceClasses == null) {
      this.serviceClasses = new ArrayList<String>();
    }
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v1065
   * @return serviceClasses
  **/
  @ApiModelProperty(value = "List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v1065")
  public List<String> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public V6VmOpenApiGeneralDescriptionInBase ontologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addOntologyTermsItem(String ontologyTermsItem) {
    if (this.ontologyTerms == null) {
      this.ontologyTerms = new ArrayList<String>();
    }
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435
   * @return ontologyTerms
  **/
  @ApiModelProperty(value = "List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435")
  public List<String> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public V6VmOpenApiGeneralDescriptionInBase targetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addTargetGroupsItem(String targetGroupsItem) {
    if (this.targetGroups == null) {
      this.targetGroups = new ArrayList<String>();
    }
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v2004
   * @return targetGroups
  **/
  @ApiModelProperty(value = "List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v2004")
  public List<String> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public V6VmOpenApiGeneralDescriptionInBase lifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addLifeEventsItem(String lifeEventsItem) {
    if (this.lifeEvents == null) {
      this.lifeEvents = new ArrayList<String>();
    }
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v3017
   * @return lifeEvents
  **/
  @ApiModelProperty(value = "List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v3017")
  public List<String> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public V6VmOpenApiGeneralDescriptionInBase industrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addIndustrialClassesItem(String industrialClassesItem) {
    if (this.industrialClasses == null) {
      this.industrialClasses = new ArrayList<String>();
    }
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).
   * @return industrialClasses
  **/
  @ApiModelProperty(value = "List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).")
  public List<String> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public V6VmOpenApiGeneralDescriptionInBase requirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addRequirementsItem(VmOpenApiLanguageItem requirementsItem) {
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

  public V6VmOpenApiGeneralDescriptionInBase type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Service type. Possible values are: Service, PermissionAndObligation or ProfessionalQualifications.
   * @return type
  **/
  @ApiModelProperty(value = "Service type. Possible values are: Service, PermissionAndObligation or ProfessionalQualifications.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V6VmOpenApiGeneralDescriptionInBase serviceChargeType(String serviceChargeType) {
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

  public V6VmOpenApiGeneralDescriptionInBase legislation(List<V4VmOpenApiLaw> legislation) {
    this.legislation = legislation;
    return this;
  }

  public V6VmOpenApiGeneralDescriptionInBase addLegislationItem(V4VmOpenApiLaw legislationItem) {
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

  public V6VmOpenApiGeneralDescriptionInBase publishingStatus(String publishingStatus) {
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

  public V6VmOpenApiGeneralDescriptionInBase deleteAllLifeEvents(Boolean deleteAllLifeEvents) {
    this.deleteAllLifeEvents = deleteAllLifeEvents;
    return this;
  }

   /**
   * Set to true to delete all existing life events (the LifeEvents collection for this object should be empty collection when this option is used).
   * @return deleteAllLifeEvents
  **/
  @ApiModelProperty(value = "Set to true to delete all existing life events (the LifeEvents collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllLifeEvents() {
    return deleteAllLifeEvents;
  }

  public void setDeleteAllLifeEvents(Boolean deleteAllLifeEvents) {
    this.deleteAllLifeEvents = deleteAllLifeEvents;
  }

  public V6VmOpenApiGeneralDescriptionInBase deleteAllIndustrialClasses(Boolean deleteAllIndustrialClasses) {
    this.deleteAllIndustrialClasses = deleteAllIndustrialClasses;
    return this;
  }

   /**
   * Set to true to delete all existing industrial classes (the IndustrialClasses collection for this object should be empty collection when this option is used).
   * @return deleteAllIndustrialClasses
  **/
  @ApiModelProperty(value = "Set to true to delete all existing industrial classes (the IndustrialClasses collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllIndustrialClasses() {
    return deleteAllIndustrialClasses;
  }

  public void setDeleteAllIndustrialClasses(Boolean deleteAllIndustrialClasses) {
    this.deleteAllIndustrialClasses = deleteAllIndustrialClasses;
  }

  public V6VmOpenApiGeneralDescriptionInBase deleteAllLaws(Boolean deleteAllLaws) {
    this.deleteAllLaws = deleteAllLaws;
    return this;
  }

   /**
   * Set to true to delete all existing laws within legislation (the legislation collection for this object should be empty collection when this option is used).
   * @return deleteAllLaws
  **/
  @ApiModelProperty(value = "Set to true to delete all existing laws within legislation (the legislation collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllLaws() {
    return deleteAllLaws;
  }

  public void setDeleteAllLaws(Boolean deleteAllLaws) {
    this.deleteAllLaws = deleteAllLaws;
  }

  public V6VmOpenApiGeneralDescriptionInBase deleteServiceChargeType(Boolean deleteServiceChargeType) {
    this.deleteServiceChargeType = deleteServiceChargeType;
    return this;
  }

   /**
   * Set to true to delete service charge type (ServiceChargeType property for this object should be empty when this option is used).
   * @return deleteServiceChargeType
  **/
  @ApiModelProperty(value = "Set to true to delete service charge type (ServiceChargeType property for this object should be empty when this option is used).")
  public Boolean getDeleteServiceChargeType() {
    return deleteServiceChargeType;
  }

  public void setDeleteServiceChargeType(Boolean deleteServiceChargeType) {
    this.deleteServiceChargeType = deleteServiceChargeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V6VmOpenApiGeneralDescriptionInBase v6VmOpenApiGeneralDescriptionInBase = (V6VmOpenApiGeneralDescriptionInBase) o;
    return Objects.equals(this.names, v6VmOpenApiGeneralDescriptionInBase.names) &&
        Objects.equals(this.descriptions, v6VmOpenApiGeneralDescriptionInBase.descriptions) &&
        Objects.equals(this.languages, v6VmOpenApiGeneralDescriptionInBase.languages) &&
        Objects.equals(this.serviceClasses, v6VmOpenApiGeneralDescriptionInBase.serviceClasses) &&
        Objects.equals(this.ontologyTerms, v6VmOpenApiGeneralDescriptionInBase.ontologyTerms) &&
        Objects.equals(this.targetGroups, v6VmOpenApiGeneralDescriptionInBase.targetGroups) &&
        Objects.equals(this.lifeEvents, v6VmOpenApiGeneralDescriptionInBase.lifeEvents) &&
        Objects.equals(this.industrialClasses, v6VmOpenApiGeneralDescriptionInBase.industrialClasses) &&
        Objects.equals(this.requirements, v6VmOpenApiGeneralDescriptionInBase.requirements) &&
        Objects.equals(this.type, v6VmOpenApiGeneralDescriptionInBase.type) &&
        Objects.equals(this.serviceChargeType, v6VmOpenApiGeneralDescriptionInBase.serviceChargeType) &&
        Objects.equals(this.legislation, v6VmOpenApiGeneralDescriptionInBase.legislation) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiGeneralDescriptionInBase.publishingStatus) &&
        Objects.equals(this.deleteAllLifeEvents, v6VmOpenApiGeneralDescriptionInBase.deleteAllLifeEvents) &&
        Objects.equals(this.deleteAllIndustrialClasses, v6VmOpenApiGeneralDescriptionInBase.deleteAllIndustrialClasses) &&
        Objects.equals(this.deleteAllLaws, v6VmOpenApiGeneralDescriptionInBase.deleteAllLaws) &&
        Objects.equals(this.deleteServiceChargeType, v6VmOpenApiGeneralDescriptionInBase.deleteServiceChargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, descriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, requirements, type, serviceChargeType, legislation, publishingStatus, deleteAllLifeEvents, deleteAllIndustrialClasses, deleteAllLaws, deleteServiceChargeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiGeneralDescriptionInBase {\n");
    
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
    sb.append("    deleteAllLifeEvents: ").append(toIndentedString(deleteAllLifeEvents)).append("\n");
    sb.append("    deleteAllIndustrialClasses: ").append(toIndentedString(deleteAllIndustrialClasses)).append("\n");
    sb.append("    deleteAllLaws: ").append(toIndentedString(deleteAllLaws)).append("\n");
    sb.append("    deleteServiceChargeType: ").append(toIndentedString(deleteServiceChargeType)).append("\n");
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

