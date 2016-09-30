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


package fi.otavanopisto.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.ptv.client.model.VmOpenApiFintoItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceOrganization;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * IVmOpenApiService
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-30T08:22:24.276+03:00")
public class IVmOpenApiService   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("statutoryServiceGeneralDescriptionId")
  private String statutoryServiceGeneralDescriptionId = null;

  @JsonProperty("serviceClasses")
  private List<VmOpenApiFintoItem> serviceClasses = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("ontologyTerms")
  private List<VmOpenApiFintoItem> ontologyTerms = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("targetGroups")
  private List<VmOpenApiFintoItem> targetGroups = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("lifeEvents")
  private List<VmOpenApiFintoItem> lifeEvents = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("serviceChannels")
  private List<String> serviceChannels = new ArrayList<String>();

  @JsonProperty("organizations")
  private List<VmOpenApiServiceOrganization> organizations = new ArrayList<VmOpenApiServiceOrganization>();

  @JsonProperty("serviceNames")
  private List<VmOpenApiLocalizedListItem> serviceNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

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

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public IVmOpenApiService id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IVmOpenApiService statutoryServiceGeneralDescriptionId(String statutoryServiceGeneralDescriptionId) {
    this.statutoryServiceGeneralDescriptionId = statutoryServiceGeneralDescriptionId;
    return this;
  }

   /**
   * Get statutoryServiceGeneralDescriptionId
   * @return statutoryServiceGeneralDescriptionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatutoryServiceGeneralDescriptionId() {
    return statutoryServiceGeneralDescriptionId;
  }

  public void setStatutoryServiceGeneralDescriptionId(String statutoryServiceGeneralDescriptionId) {
    this.statutoryServiceGeneralDescriptionId = statutoryServiceGeneralDescriptionId;
  }

  public IVmOpenApiService serviceClasses(List<VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public IVmOpenApiService addServiceClassesItem(VmOpenApiFintoItem serviceClassesItem) {
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * Get serviceClasses
   * @return serviceClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiFintoItem> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public IVmOpenApiService ontologyTerms(List<VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public IVmOpenApiService addOntologyTermsItem(VmOpenApiFintoItem ontologyTermsItem) {
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * Get ontologyTerms
   * @return ontologyTerms
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiFintoItem> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public IVmOpenApiService targetGroups(List<VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public IVmOpenApiService addTargetGroupsItem(VmOpenApiFintoItem targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * Get targetGroups
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiFintoItem> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public IVmOpenApiService lifeEvents(List<VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public IVmOpenApiService addLifeEventsItem(VmOpenApiFintoItem lifeEventsItem) {
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * Get lifeEvents
   * @return lifeEvents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiFintoItem> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public IVmOpenApiService serviceChannels(List<String> serviceChannels) {
    this.serviceChannels = serviceChannels;
    return this;
  }

  public IVmOpenApiService addServiceChannelsItem(String serviceChannelsItem) {
    this.serviceChannels.add(serviceChannelsItem);
    return this;
  }

   /**
   * Get serviceChannels
   * @return serviceChannels
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceChannels() {
    return serviceChannels;
  }

  public void setServiceChannels(List<String> serviceChannels) {
    this.serviceChannels = serviceChannels;
  }

  public IVmOpenApiService organizations(List<VmOpenApiServiceOrganization> organizations) {
    this.organizations = organizations;
    return this;
  }

  public IVmOpenApiService addOrganizationsItem(VmOpenApiServiceOrganization organizationsItem) {
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Get organizations
   * @return organizations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiServiceOrganization> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<VmOpenApiServiceOrganization> organizations) {
    this.organizations = organizations;
  }

  public IVmOpenApiService serviceNames(List<VmOpenApiLocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
    return this;
  }

  public IVmOpenApiService addServiceNamesItem(VmOpenApiLocalizedListItem serviceNamesItem) {
    this.serviceNames.add(serviceNamesItem);
    return this;
  }

   /**
   * Get serviceNames
   * @return serviceNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getServiceNames() {
    return serviceNames;
  }

  public void setServiceNames(List<VmOpenApiLocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
  }

  public IVmOpenApiService serviceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
    return this;
  }

  public IVmOpenApiService addServiceDescriptionsItem(VmOpenApiLocalizedListItem serviceDescriptionsItem) {
    this.serviceDescriptions.add(serviceDescriptionsItem);
    return this;
  }

   /**
   * Get serviceDescriptions
   * @return serviceDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getServiceDescriptions() {
    return serviceDescriptions;
  }

  public void setServiceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
  }

  public IVmOpenApiService languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public IVmOpenApiService addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public IVmOpenApiService keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public IVmOpenApiService addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public IVmOpenApiService serviceCoverageType(String serviceCoverageType) {
    this.serviceCoverageType = serviceCoverageType;
    return this;
  }

   /**
   * Get serviceCoverageType
   * @return serviceCoverageType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceCoverageType() {
    return serviceCoverageType;
  }

  public void setServiceCoverageType(String serviceCoverageType) {
    this.serviceCoverageType = serviceCoverageType;
  }

  public IVmOpenApiService municipalities(List<String> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  public IVmOpenApiService addMunicipalitiesItem(String municipalitiesItem) {
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * Get municipalities
   * @return municipalities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getMunicipalities() {
    return municipalities;
  }

  public void setMunicipalities(List<String> municipalities) {
    this.municipalities = municipalities;
  }

  public IVmOpenApiService webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public IVmOpenApiService addWebPagesItem(VmOpenApiWebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * Get webPages
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }

  public IVmOpenApiService requirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public IVmOpenApiService addRequirementsItem(VmOpenApiLanguageItem requirementsItem) {
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
  }

  public IVmOpenApiService publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Get publishingStatus
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
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
    IVmOpenApiService iVmOpenApiService = (IVmOpenApiService) o;
    return Objects.equals(this.id, iVmOpenApiService.id) &&
        Objects.equals(this.statutoryServiceGeneralDescriptionId, iVmOpenApiService.statutoryServiceGeneralDescriptionId) &&
        Objects.equals(this.serviceClasses, iVmOpenApiService.serviceClasses) &&
        Objects.equals(this.ontologyTerms, iVmOpenApiService.ontologyTerms) &&
        Objects.equals(this.targetGroups, iVmOpenApiService.targetGroups) &&
        Objects.equals(this.lifeEvents, iVmOpenApiService.lifeEvents) &&
        Objects.equals(this.serviceChannels, iVmOpenApiService.serviceChannels) &&
        Objects.equals(this.organizations, iVmOpenApiService.organizations) &&
        Objects.equals(this.serviceNames, iVmOpenApiService.serviceNames) &&
        Objects.equals(this.serviceDescriptions, iVmOpenApiService.serviceDescriptions) &&
        Objects.equals(this.languages, iVmOpenApiService.languages) &&
        Objects.equals(this.keywords, iVmOpenApiService.keywords) &&
        Objects.equals(this.serviceCoverageType, iVmOpenApiService.serviceCoverageType) &&
        Objects.equals(this.municipalities, iVmOpenApiService.municipalities) &&
        Objects.equals(this.webPages, iVmOpenApiService.webPages) &&
        Objects.equals(this.requirements, iVmOpenApiService.requirements) &&
        Objects.equals(this.publishingStatus, iVmOpenApiService.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statutoryServiceGeneralDescriptionId, serviceClasses, ontologyTerms, targetGroups, lifeEvents, serviceChannels, organizations, serviceNames, serviceDescriptions, languages, keywords, serviceCoverageType, municipalities, webPages, requirements, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IVmOpenApiService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statutoryServiceGeneralDescriptionId: ").append(toIndentedString(statutoryServiceGeneralDescriptionId)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    serviceChannels: ").append(toIndentedString(serviceChannels)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    serviceNames: ").append(toIndentedString(serviceNames)).append("\n");
    sb.append("    serviceDescriptions: ").append(toIndentedString(serviceDescriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    serviceCoverageType: ").append(toIndentedString(serviceCoverageType)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

