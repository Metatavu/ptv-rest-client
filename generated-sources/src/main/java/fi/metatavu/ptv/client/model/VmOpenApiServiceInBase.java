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
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiServiceOrganization;
import fi.metatavu.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiServiceInBase
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T15:52:10.525+02:00")
public class VmOpenApiServiceInBase   {
  @JsonProperty("sourceId")
  private String sourceId = null;

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
  private List<String> serviceClasses = new ArrayList<String>();

  @JsonProperty("ontologyTerms")
  private List<String> ontologyTerms = new ArrayList<String>();

  @JsonProperty("targetGroups")
  private List<String> targetGroups = new ArrayList<String>();

  @JsonProperty("lifeEvents")
  private List<String> lifeEvents = new ArrayList<String>();

  @JsonProperty("industrialClasses")
  private List<String> industrialClasses = new ArrayList<String>();

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

  @JsonProperty("serviceOrganizations")
  private List<VmOpenApiServiceOrganization> serviceOrganizations = new ArrayList<VmOpenApiServiceOrganization>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("deleteAllWebPages")
  private Boolean deleteAllWebPages = null;

  @JsonProperty("deleteAllLifeEvents")
  private Boolean deleteAllLifeEvents = null;

  @JsonProperty("deleteAllIndustrialClasses")
  private Boolean deleteAllIndustrialClasses = null;

  @JsonProperty("deleteAllKeywords")
  private Boolean deleteAllKeywords = null;

  @JsonProperty("deleteAllMunicipalities")
  private Boolean deleteAllMunicipalities = null;

  public VmOpenApiServiceInBase sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * External system identifier for the entity.
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "External system identifier for the entity.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public VmOpenApiServiceInBase id(String id) {
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

  public VmOpenApiServiceInBase type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Service type. Possible values are: Service, Notice, Registration, Permission or PermissionAndObligation.              NOTE! Current PTV database does not anymore support for types Notice, Registration or Permission - they are automatically mapped into PermissionAndObligation type.              POST and PUT methods accepts old types but GET method only can return Service or PermissionAndObligation types.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Service type. Possible values are: Service, Notice, Registration, Permission or PermissionAndObligation.              NOTE! Current PTV database does not anymore support for types Notice, Registration or Permission - they are automatically mapped into PermissionAndObligation type.              POST and PUT methods accepts old types but GET method only can return Service or PermissionAndObligation types.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiServiceInBase statutoryServiceGeneralDescriptionId(String statutoryServiceGeneralDescriptionId) {
    this.statutoryServiceGeneralDescriptionId = statutoryServiceGeneralDescriptionId;
    return this;
  }

   /**
   * Valid PTV statutory service general description identifier that this service will be linked to. List of valid identifiers can be retrieved from the endpoint /api/GeneralDescription
   * @return statutoryServiceGeneralDescriptionId
  **/
  @ApiModelProperty(example = "null", value = "Valid PTV statutory service general description identifier that this service will be linked to. List of valid identifiers can be retrieved from the endpoint /api/GeneralDescription")
  public String getStatutoryServiceGeneralDescriptionId() {
    return statutoryServiceGeneralDescriptionId;
  }

  public void setStatutoryServiceGeneralDescriptionId(String statutoryServiceGeneralDescriptionId) {
    this.statutoryServiceGeneralDescriptionId = statutoryServiceGeneralDescriptionId;
  }

  public VmOpenApiServiceInBase serviceChargeType(String serviceChargeType) {
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

  public VmOpenApiServiceInBase serviceNames(List<VmOpenApiLocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
    return this;
  }

  public VmOpenApiServiceInBase addServiceNamesItem(VmOpenApiLocalizedListItem serviceNamesItem) {
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

  public VmOpenApiServiceInBase serviceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
    return this;
  }

  public VmOpenApiServiceInBase addServiceDescriptionsItem(VmOpenApiLocalizedListItem serviceDescriptionsItem) {
    this.serviceDescriptions.add(serviceDescriptionsItem);
    return this;
  }

   /**
   * List of localized service descriptions. In current PTV version database only accepts 2500 characters.              So Description and ServiceUserInstruction will be cut if more characters are added.
   * @return serviceDescriptions
  **/
  @ApiModelProperty(example = "null", value = "List of localized service descriptions. In current PTV version database only accepts 2500 characters.              So Description and ServiceUserInstruction will be cut if more characters are added.")
  public List<VmOpenApiLocalizedListItem> getServiceDescriptions() {
    return serviceDescriptions;
  }

  public void setServiceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
  }

  public VmOpenApiServiceInBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiServiceInBase addLanguagesItem(String languagesItem) {
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

  public VmOpenApiServiceInBase serviceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public VmOpenApiServiceInBase addServiceClassesItem(String serviceClassesItem) {
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:P6.5
   * @return serviceClasses
  **/
  @ApiModelProperty(example = "null", value = "List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:P6.5")
  public List<String> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public VmOpenApiServiceInBase ontologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public VmOpenApiServiceInBase addOntologyTermsItem(String ontologyTermsItem) {
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435
   * @return ontologyTerms
  **/
  @ApiModelProperty(example = "null", value = "List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435")
  public List<String> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public VmOpenApiServiceInBase targetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public VmOpenApiServiceInBase addTargetGroupsItem(String targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KR1.3
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", value = "List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KR1.3")
  public List<String> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public VmOpenApiServiceInBase lifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public VmOpenApiServiceInBase addLifeEventsItem(String lifeEventsItem) {
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KE7
   * @return lifeEvents
  **/
  @ApiModelProperty(example = "null", value = "List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KE7")
  public List<String> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public VmOpenApiServiceInBase industrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public VmOpenApiServiceInBase addIndustrialClassesItem(String industrialClassesItem) {
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).
   * @return industrialClasses
  **/
  @ApiModelProperty(example = "null", value = "List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).")
  public List<String> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public VmOpenApiServiceInBase keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public VmOpenApiServiceInBase addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * List of localized service keywords.
   * @return keywords
  **/
  @ApiModelProperty(example = "null", value = "List of localized service keywords.")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public VmOpenApiServiceInBase serviceCoverageType(String serviceCoverageType) {
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

  public VmOpenApiServiceInBase municipalities(List<String> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  public VmOpenApiServiceInBase addMunicipalitiesItem(String municipalitiesItem) {
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * List of municipality codes that the service is available for. Used in conjunction with service coverage type Local.
   * @return municipalities
  **/
  @ApiModelProperty(example = "null", value = "List of municipality codes that the service is available for. Used in conjunction with service coverage type Local.")
  public List<String> getMunicipalities() {
    return municipalities;
  }

  public void setMunicipalities(List<String> municipalities) {
    this.municipalities = municipalities;
  }

  public VmOpenApiServiceInBase webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiServiceInBase addWebPagesItem(VmOpenApiWebPage webPagesItem) {
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

  public VmOpenApiServiceInBase requirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public VmOpenApiServiceInBase addRequirementsItem(VmOpenApiLanguageItem requirementsItem) {
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Localized service usage requirements (description of requirement). In current PTV version database only accepts 2500 characters.              So requirements will be cut if more characters are added.
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "Localized service usage requirements (description of requirement). In current PTV version database only accepts 2500 characters.              So requirements will be cut if more characters are added.")
  public List<VmOpenApiLanguageItem> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
  }

  public VmOpenApiServiceInBase serviceAdditionalInformations(List<VmOpenApiLocalizedListItem> serviceAdditionalInformations) {
    this.serviceAdditionalInformations = serviceAdditionalInformations;
    return this;
  }

  public VmOpenApiServiceInBase addServiceAdditionalInformationsItem(VmOpenApiLocalizedListItem serviceAdditionalInformationsItem) {
    this.serviceAdditionalInformations.add(serviceAdditionalInformationsItem);
    return this;
  }

   /**
   * Localized service additional information. This property is not used in the API anymore. Do not use.
   * @return serviceAdditionalInformations
  **/
  @ApiModelProperty(example = "null", value = "Localized service additional information. This property is not used in the API anymore. Do not use.")
  public List<VmOpenApiLocalizedListItem> getServiceAdditionalInformations() {
    return serviceAdditionalInformations;
  }

  public void setServiceAdditionalInformations(List<VmOpenApiLocalizedListItem> serviceAdditionalInformations) {
    this.serviceAdditionalInformations = serviceAdditionalInformations;
  }

  public VmOpenApiServiceInBase serviceOrganizations(List<VmOpenApiServiceOrganization> serviceOrganizations) {
    this.serviceOrganizations = serviceOrganizations;
    return this;
  }

  public VmOpenApiServiceInBase addServiceOrganizationsItem(VmOpenApiServiceOrganization serviceOrganizationsItem) {
    this.serviceOrganizations.add(serviceOrganizationsItem);
    return this;
  }

   /**
   * List of organizations responsible or producing the service.
   * @return serviceOrganizations
  **/
  @ApiModelProperty(example = "null", value = "List of organizations responsible or producing the service.")
  public List<VmOpenApiServiceOrganization> getServiceOrganizations() {
    return serviceOrganizations;
  }

  public void setServiceOrganizations(List<VmOpenApiServiceOrganization> serviceOrganizations) {
    this.serviceOrganizations = serviceOrganizations;
  }

  public VmOpenApiServiceInBase publishingStatus(String publishingStatus) {
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

  public VmOpenApiServiceInBase deleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
    return this;
  }

   /**
   * Set to true to delete all existing web pages (the WebPages collection for this object should be empty collection when this option is used).              This property is not used in the API anymore. Do not use.
   * @return deleteAllWebPages
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing web pages (the WebPages collection for this object should be empty collection when this option is used).              This property is not used in the API anymore. Do not use.")
  public Boolean getDeleteAllWebPages() {
    return deleteAllWebPages;
  }

  public void setDeleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
  }

  public VmOpenApiServiceInBase deleteAllLifeEvents(Boolean deleteAllLifeEvents) {
    this.deleteAllLifeEvents = deleteAllLifeEvents;
    return this;
  }

   /**
   * Set to true to delete all existing life events (the LifeEvents collection for this object should be empty collection when this option is used).
   * @return deleteAllLifeEvents
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing life events (the LifeEvents collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllLifeEvents() {
    return deleteAllLifeEvents;
  }

  public void setDeleteAllLifeEvents(Boolean deleteAllLifeEvents) {
    this.deleteAllLifeEvents = deleteAllLifeEvents;
  }

  public VmOpenApiServiceInBase deleteAllIndustrialClasses(Boolean deleteAllIndustrialClasses) {
    this.deleteAllIndustrialClasses = deleteAllIndustrialClasses;
    return this;
  }

   /**
   * Set to true to delete all existing industrial classes (the IndustrialClasses collection for this object should be empty collection when this option is used).
   * @return deleteAllIndustrialClasses
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing industrial classes (the IndustrialClasses collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllIndustrialClasses() {
    return deleteAllIndustrialClasses;
  }

  public void setDeleteAllIndustrialClasses(Boolean deleteAllIndustrialClasses) {
    this.deleteAllIndustrialClasses = deleteAllIndustrialClasses;
  }

  public VmOpenApiServiceInBase deleteAllKeywords(Boolean deleteAllKeywords) {
    this.deleteAllKeywords = deleteAllKeywords;
    return this;
  }

   /**
   * Set to true to delete all existing keywords (the Keywords collection for this object should be empty collection when this option is used).
   * @return deleteAllKeywords
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing keywords (the Keywords collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllKeywords() {
    return deleteAllKeywords;
  }

  public void setDeleteAllKeywords(Boolean deleteAllKeywords) {
    this.deleteAllKeywords = deleteAllKeywords;
  }

  public VmOpenApiServiceInBase deleteAllMunicipalities(Boolean deleteAllMunicipalities) {
    this.deleteAllMunicipalities = deleteAllMunicipalities;
    return this;
  }

   /**
   * Set to true to delete all existing municipalities (the Municipalities collection for this object should be empty collection when this option is used).
   * @return deleteAllMunicipalities
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing municipalities (the Municipalities collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllMunicipalities() {
    return deleteAllMunicipalities;
  }

  public void setDeleteAllMunicipalities(Boolean deleteAllMunicipalities) {
    this.deleteAllMunicipalities = deleteAllMunicipalities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiServiceInBase vmOpenApiServiceInBase = (VmOpenApiServiceInBase) o;
    return Objects.equals(this.sourceId, vmOpenApiServiceInBase.sourceId) &&
        Objects.equals(this.id, vmOpenApiServiceInBase.id) &&
        Objects.equals(this.type, vmOpenApiServiceInBase.type) &&
        Objects.equals(this.statutoryServiceGeneralDescriptionId, vmOpenApiServiceInBase.statutoryServiceGeneralDescriptionId) &&
        Objects.equals(this.serviceChargeType, vmOpenApiServiceInBase.serviceChargeType) &&
        Objects.equals(this.serviceNames, vmOpenApiServiceInBase.serviceNames) &&
        Objects.equals(this.serviceDescriptions, vmOpenApiServiceInBase.serviceDescriptions) &&
        Objects.equals(this.languages, vmOpenApiServiceInBase.languages) &&
        Objects.equals(this.serviceClasses, vmOpenApiServiceInBase.serviceClasses) &&
        Objects.equals(this.ontologyTerms, vmOpenApiServiceInBase.ontologyTerms) &&
        Objects.equals(this.targetGroups, vmOpenApiServiceInBase.targetGroups) &&
        Objects.equals(this.lifeEvents, vmOpenApiServiceInBase.lifeEvents) &&
        Objects.equals(this.industrialClasses, vmOpenApiServiceInBase.industrialClasses) &&
        Objects.equals(this.keywords, vmOpenApiServiceInBase.keywords) &&
        Objects.equals(this.serviceCoverageType, vmOpenApiServiceInBase.serviceCoverageType) &&
        Objects.equals(this.municipalities, vmOpenApiServiceInBase.municipalities) &&
        Objects.equals(this.webPages, vmOpenApiServiceInBase.webPages) &&
        Objects.equals(this.requirements, vmOpenApiServiceInBase.requirements) &&
        Objects.equals(this.serviceAdditionalInformations, vmOpenApiServiceInBase.serviceAdditionalInformations) &&
        Objects.equals(this.serviceOrganizations, vmOpenApiServiceInBase.serviceOrganizations) &&
        Objects.equals(this.publishingStatus, vmOpenApiServiceInBase.publishingStatus) &&
        Objects.equals(this.deleteAllWebPages, vmOpenApiServiceInBase.deleteAllWebPages) &&
        Objects.equals(this.deleteAllLifeEvents, vmOpenApiServiceInBase.deleteAllLifeEvents) &&
        Objects.equals(this.deleteAllIndustrialClasses, vmOpenApiServiceInBase.deleteAllIndustrialClasses) &&
        Objects.equals(this.deleteAllKeywords, vmOpenApiServiceInBase.deleteAllKeywords) &&
        Objects.equals(this.deleteAllMunicipalities, vmOpenApiServiceInBase.deleteAllMunicipalities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, id, type, statutoryServiceGeneralDescriptionId, serviceChargeType, serviceNames, serviceDescriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, keywords, serviceCoverageType, municipalities, webPages, requirements, serviceAdditionalInformations, serviceOrganizations, publishingStatus, deleteAllWebPages, deleteAllLifeEvents, deleteAllIndustrialClasses, deleteAllKeywords, deleteAllMunicipalities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiServiceInBase {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
    sb.append("    serviceOrganizations: ").append(toIndentedString(serviceOrganizations)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    deleteAllWebPages: ").append(toIndentedString(deleteAllWebPages)).append("\n");
    sb.append("    deleteAllLifeEvents: ").append(toIndentedString(deleteAllLifeEvents)).append("\n");
    sb.append("    deleteAllIndustrialClasses: ").append(toIndentedString(deleteAllIndustrialClasses)).append("\n");
    sb.append("    deleteAllKeywords: ").append(toIndentedString(deleteAllKeywords)).append("\n");
    sb.append("    deleteAllMunicipalities: ").append(toIndentedString(deleteAllMunicipalities)).append("\n");
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

