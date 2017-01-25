/**
 * PTV Open Api
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.metatavu.ptv.client.model.VmOpenApiFintoItem;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiServiceOrganization;
import fi.metatavu.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiService
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T20:15:02.299+02:00")
public class VmOpenApiService   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("statutoryServiceGeneralDescriptionId")
  private String statutoryServiceGeneralDescriptionId = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("serviceNames")
  private List<VmOpenApiLocalizedListItem> serviceNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("serviceClasses")
  private List<VmOpenApiFintoItem> serviceClasses = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("ontologyTerms")
  private List<VmOpenApiFintoItem> ontologyTerms = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("targetGroups")
  private List<VmOpenApiFintoItem> targetGroups = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("lifeEvents")
  private List<VmOpenApiFintoItem> lifeEvents = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("industrialClasses")
  private List<VmOpenApiFintoItem> industrialClasses = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("keywords")
  private List<String> keywords = new ArrayList<String>();

  @JsonProperty("serviceCoverageType")
  private String serviceCoverageType = null;

  @JsonProperty("municipalities")
  private List<String> municipalities = new ArrayList<String>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("requirements")
  private List<VmOpenApiLanguageItem> requirements = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceAdditionalInformations")
  private List<VmOpenApiLocalizedListItem> serviceAdditionalInformations = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceChannels")
  private List<String> serviceChannels = new ArrayList<String>();

  @JsonProperty("organizations")
  private List<VmOpenApiServiceOrganization> organizations = new ArrayList<VmOpenApiServiceOrganization>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiService id(String id) {
    this.id = id;
    return this;
  }

   /**
   * PTV service identifier.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "PTV service identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VmOpenApiService type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Service type. Possible values are: Service or PermissionAndObligation.              NOTE! Current PTV database does not anymore support for types Notice, Registration or Permission - they are automatically mapped into PermissionAndObligation type when possible.              POST and PUT methods accepts old types but GET method only can return Service or PermissionAndObligation types.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Service type. Possible values are: Service or PermissionAndObligation.              NOTE! Current PTV database does not anymore support for types Notice, Registration or Permission - they are automatically mapped into PermissionAndObligation type when possible.              POST and PUT methods accepts old types but GET method only can return Service or PermissionAndObligation types.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiService statutoryServiceGeneralDescriptionId(String statutoryServiceGeneralDescriptionId) {
    this.statutoryServiceGeneralDescriptionId = statutoryServiceGeneralDescriptionId;
    return this;
  }

   /**
   * PTV identifier for linked general description.
   * @return statutoryServiceGeneralDescriptionId
  **/
  @ApiModelProperty(example = "null", value = "PTV identifier for linked general description.")
  public String getStatutoryServiceGeneralDescriptionId() {
    return statutoryServiceGeneralDescriptionId;
  }

  public void setStatutoryServiceGeneralDescriptionId(String statutoryServiceGeneralDescriptionId) {
    this.statutoryServiceGeneralDescriptionId = statutoryServiceGeneralDescriptionId;
  }

  public VmOpenApiService serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Charged, Free or Other
   * @return serviceChargeType
  **/
  @ApiModelProperty(example = "null", value = "Service charge type. Possible values are: Charged, Free or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public VmOpenApiService serviceNames(List<VmOpenApiLocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
    return this;
  }

  public VmOpenApiService addServiceNamesItem(VmOpenApiLocalizedListItem serviceNamesItem) {
    this.serviceNames.add(serviceNamesItem);
    return this;
  }

   /**
   * List of localized service names.
   * @return serviceNames
  **/
  @ApiModelProperty(example = "null", value = "List of localized service names.")
  public List<VmOpenApiLocalizedListItem> getServiceNames() {
    return serviceNames;
  }

  public void setServiceNames(List<VmOpenApiLocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
  }

  public VmOpenApiService serviceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
    return this;
  }

  public VmOpenApiService addServiceDescriptionsItem(VmOpenApiLocalizedListItem serviceDescriptionsItem) {
    this.serviceDescriptions.add(serviceDescriptionsItem);
    return this;
  }

   /**
   * List of localized service descriptions.
   * @return serviceDescriptions
  **/
  @ApiModelProperty(example = "null", value = "List of localized service descriptions.")
  public List<VmOpenApiLocalizedListItem> getServiceDescriptions() {
    return serviceDescriptions;
  }

  public void setServiceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
  }

  public VmOpenApiService languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiService addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of service languages.
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "List of service languages.")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public VmOpenApiService serviceClasses(List<VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public VmOpenApiService addServiceClassesItem(VmOpenApiFintoItem serviceClassesItem) {
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * List of service classes related to the service.
   * @return serviceClasses
  **/
  @ApiModelProperty(example = "null", value = "List of service classes related to the service.")
  public List<VmOpenApiFintoItem> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public VmOpenApiService ontologyTerms(List<VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public VmOpenApiService addOntologyTermsItem(VmOpenApiFintoItem ontologyTermsItem) {
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * List of ontology terms related to the service.
   * @return ontologyTerms
  **/
  @ApiModelProperty(example = "null", value = "List of ontology terms related to the service.")
  public List<VmOpenApiFintoItem> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public VmOpenApiService targetGroups(List<VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public VmOpenApiService addTargetGroupsItem(VmOpenApiFintoItem targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * List of target groups related to the service.
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", value = "List of target groups related to the service.")
  public List<VmOpenApiFintoItem> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public VmOpenApiService lifeEvents(List<VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public VmOpenApiService addLifeEventsItem(VmOpenApiFintoItem lifeEventsItem) {
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * List of life events  related to the service.
   * @return lifeEvents
  **/
  @ApiModelProperty(example = "null", value = "List of life events  related to the service.")
  public List<VmOpenApiFintoItem> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public VmOpenApiService industrialClasses(List<VmOpenApiFintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public VmOpenApiService addIndustrialClassesItem(VmOpenApiFintoItem industrialClassesItem) {
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * List of industrial classes related to the service.
   * @return industrialClasses
  **/
  @ApiModelProperty(example = "null", value = "List of industrial classes related to the service.")
  public List<VmOpenApiFintoItem> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<VmOpenApiFintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public VmOpenApiService keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public VmOpenApiService addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * List of service keywords.
   * @return keywords
  **/
  @ApiModelProperty(example = "null", value = "List of service keywords.")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public VmOpenApiService serviceCoverageType(String serviceCoverageType) {
    this.serviceCoverageType = serviceCoverageType;
    return this;
  }

   /**
   * Service coverage type. Valid values are: Local or Nationwide.
   * @return serviceCoverageType
  **/
  @ApiModelProperty(example = "null", value = "Service coverage type. Valid values are: Local or Nationwide.")
  public String getServiceCoverageType() {
    return serviceCoverageType;
  }

  public void setServiceCoverageType(String serviceCoverageType) {
    this.serviceCoverageType = serviceCoverageType;
  }

  public VmOpenApiService municipalities(List<String> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  public VmOpenApiService addMunicipalitiesItem(String municipalitiesItem) {
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * List of municipality names that the service is available for. Used in conjunction with service coverage type Local.
   * @return municipalities
  **/
  @ApiModelProperty(example = "null", value = "List of municipality names that the service is available for. Used in conjunction with service coverage type Local.")
  public List<String> getMunicipalities() {
    return municipalities;
  }

  public void setMunicipalities(List<String> municipalities) {
    this.municipalities = municipalities;
  }

  public VmOpenApiService webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiService addWebPagesItem(VmOpenApiWebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of service web pages. This property is not used in the API anymore. Do not use.
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "List of service web pages. This property is not used in the API anymore. Do not use.")
  public List<VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }

  public VmOpenApiService requirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public VmOpenApiService addRequirementsItem(VmOpenApiLanguageItem requirementsItem) {
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Localized service usage requirements (description of requirement).
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "Localized service usage requirements (description of requirement).")
  public List<VmOpenApiLanguageItem> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
  }

  public VmOpenApiService serviceAdditionalInformations(List<VmOpenApiLocalizedListItem> serviceAdditionalInformations) {
    this.serviceAdditionalInformations = serviceAdditionalInformations;
    return this;
  }

  public VmOpenApiService addServiceAdditionalInformationsItem(VmOpenApiLocalizedListItem serviceAdditionalInformationsItem) {
    this.serviceAdditionalInformations.add(serviceAdditionalInformationsItem);
    return this;
  }

   /**
   * Localized service additional information.
   * @return serviceAdditionalInformations
  **/
  @ApiModelProperty(example = "null", value = "Localized service additional information.")
  public List<VmOpenApiLocalizedListItem> getServiceAdditionalInformations() {
    return serviceAdditionalInformations;
  }

  public void setServiceAdditionalInformations(List<VmOpenApiLocalizedListItem> serviceAdditionalInformations) {
    this.serviceAdditionalInformations = serviceAdditionalInformations;
  }

  public VmOpenApiService serviceChannels(List<String> serviceChannels) {
    this.serviceChannels = serviceChannels;
    return this;
  }

  public VmOpenApiService addServiceChannelsItem(String serviceChannelsItem) {
    this.serviceChannels.add(serviceChannelsItem);
    return this;
  }

   /**
   * List of PTV identifiers of linked service channels.
   * @return serviceChannels
  **/
  @ApiModelProperty(example = "null", value = "List of PTV identifiers of linked service channels.")
  public List<String> getServiceChannels() {
    return serviceChannels;
  }

  public void setServiceChannels(List<String> serviceChannels) {
    this.serviceChannels = serviceChannels;
  }

  public VmOpenApiService organizations(List<VmOpenApiServiceOrganization> organizations) {
    this.organizations = organizations;
    return this;
  }

  public VmOpenApiService addOrganizationsItem(VmOpenApiServiceOrganization organizationsItem) {
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * List of organizations, responsible and producer organizations of the service.
   * @return organizations
  **/
  @ApiModelProperty(example = "null", value = "List of organizations, responsible and producer organizations of the service.")
  public List<VmOpenApiServiceOrganization> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<VmOpenApiServiceOrganization> organizations) {
    this.organizations = organizations;
  }

  public VmOpenApiService publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiService vmOpenApiService = (VmOpenApiService) o;
    return Objects.equals(this.id, vmOpenApiService.id) &&
        Objects.equals(this.type, vmOpenApiService.type) &&
        Objects.equals(this.statutoryServiceGeneralDescriptionId, vmOpenApiService.statutoryServiceGeneralDescriptionId) &&
        Objects.equals(this.serviceChargeType, vmOpenApiService.serviceChargeType) &&
        Objects.equals(this.serviceNames, vmOpenApiService.serviceNames) &&
        Objects.equals(this.serviceDescriptions, vmOpenApiService.serviceDescriptions) &&
        Objects.equals(this.languages, vmOpenApiService.languages) &&
        Objects.equals(this.serviceClasses, vmOpenApiService.serviceClasses) &&
        Objects.equals(this.ontologyTerms, vmOpenApiService.ontologyTerms) &&
        Objects.equals(this.targetGroups, vmOpenApiService.targetGroups) &&
        Objects.equals(this.lifeEvents, vmOpenApiService.lifeEvents) &&
        Objects.equals(this.industrialClasses, vmOpenApiService.industrialClasses) &&
        Objects.equals(this.keywords, vmOpenApiService.keywords) &&
        Objects.equals(this.serviceCoverageType, vmOpenApiService.serviceCoverageType) &&
        Objects.equals(this.municipalities, vmOpenApiService.municipalities) &&
        Objects.equals(this.webPages, vmOpenApiService.webPages) &&
        Objects.equals(this.requirements, vmOpenApiService.requirements) &&
        Objects.equals(this.serviceAdditionalInformations, vmOpenApiService.serviceAdditionalInformations) &&
        Objects.equals(this.serviceChannels, vmOpenApiService.serviceChannels) &&
        Objects.equals(this.organizations, vmOpenApiService.organizations) &&
        Objects.equals(this.publishingStatus, vmOpenApiService.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, statutoryServiceGeneralDescriptionId, serviceChargeType, serviceNames, serviceDescriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, keywords, serviceCoverageType, municipalities, webPages, requirements, serviceAdditionalInformations, serviceChannels, organizations, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    statutoryServiceGeneralDescriptionId: ").append(toIndentedString(statutoryServiceGeneralDescriptionId)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    serviceNames: ").append(toIndentedString(serviceNames)).append("\n");
    sb.append("    serviceDescriptions: ").append(toIndentedString(serviceDescriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    serviceCoverageType: ").append(toIndentedString(serviceCoverageType)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    serviceAdditionalInformations: ").append(toIndentedString(serviceAdditionalInformations)).append("\n");
    sb.append("    serviceChannels: ").append(toIndentedString(serviceChannels)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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

