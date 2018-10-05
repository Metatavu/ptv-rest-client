/*
 * PTV Open Api version 9
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v9
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
import fi.metatavu.ptv.client.model.V9VmOpenApiServiceProducerIn;
import fi.metatavu.ptv.client.model.V9VmOpenApiServiceVoucher;
import fi.metatavu.ptv.client.model.VmOpenApiAreaIn;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API V9 - View Model of service for IN api - base
 */
@ApiModel(description = "OPEN API V9 - View Model of service for IN api - base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class V9VmOpenApiServiceInBase {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("generalDescriptionId")
  private String generalDescriptionId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("subType")
  private String subType = null;

  @JsonProperty("fundingType")
  private String fundingType = null;

  @JsonProperty("serviceNames")
  private List<VmOpenApiLocalizedListItem> serviceNames = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("areaType")
  private String areaType = null;

  @JsonProperty("areas")
  private List<VmOpenApiAreaIn> areas = null;

  @JsonProperty("serviceDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceDescriptions = null;

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

  @JsonProperty("legislation")
  private List<V4VmOpenApiLaw> legislation = null;

  @JsonProperty("keywords")
  private List<VmOpenApiLanguageItem> keywords = null;

  @JsonProperty("requirements")
  private List<VmOpenApiLanguageItem> requirements = null;

  @JsonProperty("otherResponsibleOrganizations")
  private List<UUID> otherResponsibleOrganizations = null;

  @JsonProperty("serviceProducers")
  private List<V9VmOpenApiServiceProducerIn> serviceProducers = null;

  @JsonProperty("serviceVouchersInUse")
  private Boolean serviceVouchersInUse = null;

  @JsonProperty("serviceVouchers")
  private List<V9VmOpenApiServiceVoucher> serviceVouchers = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("deleteAllLifeEvents")
  private Boolean deleteAllLifeEvents = null;

  @JsonProperty("deleteAllIndustrialClasses")
  private Boolean deleteAllIndustrialClasses = null;

  @JsonProperty("deleteAllLaws")
  private Boolean deleteAllLaws = null;

  @JsonProperty("deleteAllKeywords")
  private Boolean deleteAllKeywords = null;

  @JsonProperty("deleteServiceChargeType")
  private Boolean deleteServiceChargeType = null;

  @JsonProperty("deleteGeneralDescriptionId")
  private Boolean deleteGeneralDescriptionId = null;

  @JsonProperty("mainResponsibleOrganization")
  private String mainResponsibleOrganization = null;

  @JsonProperty("validFrom")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo = null;

  public V9VmOpenApiServiceInBase sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * External system identifier for the entity. User needs to be logged in to be able to get/set value.
   * @return sourceId
  **/
  @ApiModelProperty(value = "External system identifier for the entity. User needs to be logged in to be able to get/set value.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public V9VmOpenApiServiceInBase generalDescriptionId(String generalDescriptionId) {
    this.generalDescriptionId = generalDescriptionId;
    return this;
  }

   /**
   * Valid PTV statutory service general description identifier that this service will be linked to. List of valid identifiers can be retrieved from the endpoint /api/GeneralDescription
   * @return generalDescriptionId
  **/
  @ApiModelProperty(value = "Valid PTV statutory service general description identifier that this service will be linked to. List of valid identifiers can be retrieved from the endpoint /api/GeneralDescription")
  public String getGeneralDescriptionId() {
    return generalDescriptionId;
  }

  public void setGeneralDescriptionId(String generalDescriptionId) {
    this.generalDescriptionId = generalDescriptionId;
  }

  public V9VmOpenApiServiceInBase type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Service type. Possible values are: Service, PermitOrObligation or ProfessionalQualification.  NOTE! If service type has been defined within attached statutory service general description, the type for service is ignored.
   * @return type
  **/
  @ApiModelProperty(value = "Service type. Possible values are: Service, PermitOrObligation or ProfessionalQualification.  NOTE! If service type has been defined within attached statutory service general description, the type for service is ignored.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V9VmOpenApiServiceInBase subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Service sub-type. It is used for SOTE and its taken from GeneralDescription type.
   * @return subType
  **/
  @ApiModelProperty(value = "Service sub-type. It is used for SOTE and its taken from GeneralDescription type.")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public V9VmOpenApiServiceInBase fundingType(String fundingType) {
    this.fundingType = fundingType;
    return this;
  }

   /**
   * Service funding type. Possible values are: PubliclyFunded or MarketFunded.
   * @return fundingType
  **/
  @ApiModelProperty(value = "Service funding type. Possible values are: PubliclyFunded or MarketFunded.")
  public String getFundingType() {
    return fundingType;
  }

  public void setFundingType(String fundingType) {
    this.fundingType = fundingType;
  }

  public V9VmOpenApiServiceInBase serviceNames(List<VmOpenApiLocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
    return this;
  }

  public V9VmOpenApiServiceInBase addServiceNamesItem(VmOpenApiLocalizedListItem serviceNamesItem) {
    if (this.serviceNames == null) {
      this.serviceNames = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.serviceNames.add(serviceNamesItem);
    return this;
  }

   /**
   * List of localized service names.
   * @return serviceNames
  **/
  @ApiModelProperty(value = "List of localized service names.")
  public List<VmOpenApiLocalizedListItem> getServiceNames() {
    return serviceNames;
  }

  public void setServiceNames(List<VmOpenApiLocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
  }

  public V9VmOpenApiServiceInBase serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Chargeable or FreeOfCharge.  NOTE! If service charge type has been defined within attached statutory service general description, the charge type for service is ignored.
   * @return serviceChargeType
  **/
  @ApiModelProperty(value = "Service charge type. Possible values are: Chargeable or FreeOfCharge.  NOTE! If service charge type has been defined within attached statutory service general description, the charge type for service is ignored.")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public V9VmOpenApiServiceInBase areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * Area type (Nationwide, NationwideExceptAlandIslands, LimitedType).
   * @return areaType
  **/
  @ApiModelProperty(value = "Area type (Nationwide, NationwideExceptAlandIslands, LimitedType).")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public V9VmOpenApiServiceInBase areas(List<VmOpenApiAreaIn> areas) {
    this.areas = areas;
    return this;
  }

  public V9VmOpenApiServiceInBase addAreasItem(VmOpenApiAreaIn areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<VmOpenApiAreaIn>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * List of areas. List can contain different types of areas.
   * @return areas
  **/
  @ApiModelProperty(value = "List of areas. List can contain different types of areas.")
  public List<VmOpenApiAreaIn> getAreas() {
    return areas;
  }

  public void setAreas(List<VmOpenApiAreaIn> areas) {
    this.areas = areas;
  }

  public V9VmOpenApiServiceInBase serviceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
    return this;
  }

  public V9VmOpenApiServiceInBase addServiceDescriptionsItem(VmOpenApiLocalizedListItem serviceDescriptionsItem) {
    if (this.serviceDescriptions == null) {
      this.serviceDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.serviceDescriptions.add(serviceDescriptionsItem);
    return this;
  }

   /**
   * List of localized service descriptions. (Max.Length: 2500 Description). (Max.Length: 2500 UserInstruction). (Max.Length: 150 Summary). (Max.Length: 500 ProcessingTime). (Max.Length: 500 DeadLine). (Max.Length: 500 ChargeTypeAdditionalInfo). (Max.Length: 500 ValidityTime). (Max.Length: 500 ServiceType).
   * @return serviceDescriptions
  **/
  @ApiModelProperty(value = "List of localized service descriptions. (Max.Length: 2500 Description). (Max.Length: 2500 UserInstruction). (Max.Length: 150 Summary). (Max.Length: 500 ProcessingTime). (Max.Length: 500 DeadLine). (Max.Length: 500 ChargeTypeAdditionalInfo). (Max.Length: 500 ValidityTime). (Max.Length: 500 ServiceType).")
  public List<VmOpenApiLocalizedListItem> getServiceDescriptions() {
    return serviceDescriptions;
  }

  public void setServiceDescriptions(List<VmOpenApiLocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
  }

  public V9VmOpenApiServiceInBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V9VmOpenApiServiceInBase addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of service languages.
   * @return languages
  **/
  @ApiModelProperty(value = "List of service languages.")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public V9VmOpenApiServiceInBase serviceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public V9VmOpenApiServiceInBase addServiceClassesItem(String serviceClassesItem) {
    if (this.serviceClasses == null) {
      this.serviceClasses = new ArrayList<String>();
    }
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v1065.  NOTE! If service class has been defined within attached statutory service general description, the service class is not added for service.
   * @return serviceClasses
  **/
  @ApiModelProperty(value = "List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v1065.  NOTE! If service class has been defined within attached statutory service general description, the service class is not added for service.")
  public List<String> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public V9VmOpenApiServiceInBase ontologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public V9VmOpenApiServiceInBase addOntologyTermsItem(String ontologyTermsItem) {
    if (this.ontologyTerms == null) {
      this.ontologyTerms = new ArrayList<String>();
    }
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435.  NOTE! If ontology term has been defined within attached statutory service general description, the ontology term is not added for service.
   * @return ontologyTerms
  **/
  @ApiModelProperty(value = "List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435.  NOTE! If ontology term has been defined within attached statutory service general description, the ontology term is not added for service.")
  public List<String> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public V9VmOpenApiServiceInBase targetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public V9VmOpenApiServiceInBase addTargetGroupsItem(String targetGroupsItem) {
    if (this.targetGroups == null) {
      this.targetGroups = new ArrayList<String>();
    }
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v2004.  NOTE! If target group has been defined within attached statutory service general description, the target group is not added for service.
   * @return targetGroups
  **/
  @ApiModelProperty(value = "List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v2004.  NOTE! If target group has been defined within attached statutory service general description, the target group is not added for service.")
  public List<String> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public V9VmOpenApiServiceInBase lifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public V9VmOpenApiServiceInBase addLifeEventsItem(String lifeEventsItem) {
    if (this.lifeEvents == null) {
      this.lifeEvents = new ArrayList<String>();
    }
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v3017  NOTE! If life event has been defined within attached statutory service general description, the life event is not added for service.
   * @return lifeEvents
  **/
  @ApiModelProperty(value = "List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:v3017  NOTE! If life event has been defined within attached statutory service general description, the life event is not added for service.")
  public List<String> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public V9VmOpenApiServiceInBase industrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public V9VmOpenApiServiceInBase addIndustrialClassesItem(String industrialClassesItem) {
    if (this.industrialClasses == null) {
      this.industrialClasses = new ArrayList<String>();
    }
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).  NOTE! If industrial class has been defined within attached statutory service general description, the industrial class is not added for service.
   * @return industrialClasses
  **/
  @ApiModelProperty(value = "List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).  NOTE! If industrial class has been defined within attached statutory service general description, the industrial class is not added for service.")
  public List<String> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public V9VmOpenApiServiceInBase legislation(List<V4VmOpenApiLaw> legislation) {
    this.legislation = legislation;
    return this;
  }

  public V9VmOpenApiServiceInBase addLegislationItem(V4VmOpenApiLaw legislationItem) {
    if (this.legislation == null) {
      this.legislation = new ArrayList<V4VmOpenApiLaw>();
    }
    this.legislation.add(legislationItem);
    return this;
  }

   /**
   * List of laws related to the service.
   * @return legislation
  **/
  @ApiModelProperty(value = "List of laws related to the service.")
  public List<V4VmOpenApiLaw> getLegislation() {
    return legislation;
  }

  public void setLegislation(List<V4VmOpenApiLaw> legislation) {
    this.legislation = legislation;
  }

  public V9VmOpenApiServiceInBase keywords(List<VmOpenApiLanguageItem> keywords) {
    this.keywords = keywords;
    return this;
  }

  public V9VmOpenApiServiceInBase addKeywordsItem(VmOpenApiLanguageItem keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * List of localized service keywords. (Max.Length: 150).
   * @return keywords
  **/
  @ApiModelProperty(value = "List of localized service keywords. (Max.Length: 150).")
  public List<VmOpenApiLanguageItem> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<VmOpenApiLanguageItem> keywords) {
    this.keywords = keywords;
  }

  public V9VmOpenApiServiceInBase requirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public V9VmOpenApiServiceInBase addRequirementsItem(VmOpenApiLanguageItem requirementsItem) {
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

  public V9VmOpenApiServiceInBase otherResponsibleOrganizations(List<UUID> otherResponsibleOrganizations) {
    this.otherResponsibleOrganizations = otherResponsibleOrganizations;
    return this;
  }

  public V9VmOpenApiServiceInBase addOtherResponsibleOrganizationsItem(UUID otherResponsibleOrganizationsItem) {
    if (this.otherResponsibleOrganizations == null) {
      this.otherResponsibleOrganizations = new ArrayList<UUID>();
    }
    this.otherResponsibleOrganizations.add(otherResponsibleOrganizationsItem);
    return this;
  }

   /**
   * List of other responsible organizations for the service.
   * @return otherResponsibleOrganizations
  **/
  @ApiModelProperty(value = "List of other responsible organizations for the service.")
  public List<UUID> getOtherResponsibleOrganizations() {
    return otherResponsibleOrganizations;
  }

  public void setOtherResponsibleOrganizations(List<UUID> otherResponsibleOrganizations) {
    this.otherResponsibleOrganizations = otherResponsibleOrganizations;
  }

  public V9VmOpenApiServiceInBase serviceProducers(List<V9VmOpenApiServiceProducerIn> serviceProducers) {
    this.serviceProducers = serviceProducers;
    return this;
  }

  public V9VmOpenApiServiceInBase addServiceProducersItem(V9VmOpenApiServiceProducerIn serviceProducersItem) {
    if (this.serviceProducers == null) {
      this.serviceProducers = new ArrayList<V9VmOpenApiServiceProducerIn>();
    }
    this.serviceProducers.add(serviceProducersItem);
    return this;
  }

   /**
   * List of service producers
   * @return serviceProducers
  **/
  @ApiModelProperty(value = "List of service producers")
  public List<V9VmOpenApiServiceProducerIn> getServiceProducers() {
    return serviceProducers;
  }

  public void setServiceProducers(List<V9VmOpenApiServiceProducerIn> serviceProducers) {
    this.serviceProducers = serviceProducers;
  }

  public V9VmOpenApiServiceInBase serviceVouchersInUse(Boolean serviceVouchersInUse) {
    this.serviceVouchersInUse = serviceVouchersInUse;
    return this;
  }

   /**
   * Indicates if service vouchers are used in the service.
   * @return serviceVouchersInUse
  **/
  @ApiModelProperty(value = "Indicates if service vouchers are used in the service.")
  public Boolean getServiceVouchersInUse() {
    return serviceVouchersInUse;
  }

  public void setServiceVouchersInUse(Boolean serviceVouchersInUse) {
    this.serviceVouchersInUse = serviceVouchersInUse;
  }

  public V9VmOpenApiServiceInBase serviceVouchers(List<V9VmOpenApiServiceVoucher> serviceVouchers) {
    this.serviceVouchers = serviceVouchers;
    return this;
  }

  public V9VmOpenApiServiceInBase addServiceVouchersItem(V9VmOpenApiServiceVoucher serviceVouchersItem) {
    if (this.serviceVouchers == null) {
      this.serviceVouchers = new ArrayList<V9VmOpenApiServiceVoucher>();
    }
    this.serviceVouchers.add(serviceVouchersItem);
    return this;
  }

   /**
   * List of service vouchers.
   * @return serviceVouchers
  **/
  @ApiModelProperty(value = "List of service vouchers.")
  public List<V9VmOpenApiServiceVoucher> getServiceVouchers() {
    return serviceVouchers;
  }

  public void setServiceVouchers(List<V9VmOpenApiServiceVoucher> serviceVouchers) {
    this.serviceVouchers = serviceVouchers;
  }

  public V9VmOpenApiServiceInBase publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status. Possible values are: Draft, Published, Deleted or Modified.
   * @return publishingStatus
  **/
  @ApiModelProperty(required = true, value = "Publishing status. Possible values are: Draft, Published, Deleted or Modified.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V9VmOpenApiServiceInBase deleteAllLifeEvents(Boolean deleteAllLifeEvents) {
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

  public V9VmOpenApiServiceInBase deleteAllIndustrialClasses(Boolean deleteAllIndustrialClasses) {
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

  public V9VmOpenApiServiceInBase deleteAllLaws(Boolean deleteAllLaws) {
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

  public V9VmOpenApiServiceInBase deleteAllKeywords(Boolean deleteAllKeywords) {
    this.deleteAllKeywords = deleteAllKeywords;
    return this;
  }

   /**
   * Set to true to delete all existing keywords (the Keywords collection for this object should be empty collection when this option is used).
   * @return deleteAllKeywords
  **/
  @ApiModelProperty(value = "Set to true to delete all existing keywords (the Keywords collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllKeywords() {
    return deleteAllKeywords;
  }

  public void setDeleteAllKeywords(Boolean deleteAllKeywords) {
    this.deleteAllKeywords = deleteAllKeywords;
  }

  public V9VmOpenApiServiceInBase deleteServiceChargeType(Boolean deleteServiceChargeType) {
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

  public V9VmOpenApiServiceInBase deleteGeneralDescriptionId(Boolean deleteGeneralDescriptionId) {
    this.deleteGeneralDescriptionId = deleteGeneralDescriptionId;
    return this;
  }

   /**
   * Set to true to delete statutory service general description (GeneralDescriptionId property for this object should be empty when this option is used).
   * @return deleteGeneralDescriptionId
  **/
  @ApiModelProperty(value = "Set to true to delete statutory service general description (GeneralDescriptionId property for this object should be empty when this option is used).")
  public Boolean getDeleteGeneralDescriptionId() {
    return deleteGeneralDescriptionId;
  }

  public void setDeleteGeneralDescriptionId(Boolean deleteGeneralDescriptionId) {
    this.deleteGeneralDescriptionId = deleteGeneralDescriptionId;
  }

  public V9VmOpenApiServiceInBase mainResponsibleOrganization(String mainResponsibleOrganization) {
    this.mainResponsibleOrganization = mainResponsibleOrganization;
    return this;
  }

   /**
   * Main responsible organization Id
   * @return mainResponsibleOrganization
  **/
  @ApiModelProperty(value = "Main responsible organization Id")
  public String getMainResponsibleOrganization() {
    return mainResponsibleOrganization;
  }

  public void setMainResponsibleOrganization(String mainResponsibleOrganization) {
    this.mainResponsibleOrganization = mainResponsibleOrganization;
  }

  public V9VmOpenApiServiceInBase validFrom(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Date when item should be published.
   * @return validFrom
  **/
  @ApiModelProperty(value = "Date when item should be published.")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public V9VmOpenApiServiceInBase validTo(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Date when item should be archived.
   * @return validTo
  **/
  @ApiModelProperty(value = "Date when item should be archived.")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V9VmOpenApiServiceInBase v9VmOpenApiServiceInBase = (V9VmOpenApiServiceInBase) o;
    return Objects.equals(this.sourceId, v9VmOpenApiServiceInBase.sourceId) &&
        Objects.equals(this.generalDescriptionId, v9VmOpenApiServiceInBase.generalDescriptionId) &&
        Objects.equals(this.type, v9VmOpenApiServiceInBase.type) &&
        Objects.equals(this.subType, v9VmOpenApiServiceInBase.subType) &&
        Objects.equals(this.fundingType, v9VmOpenApiServiceInBase.fundingType) &&
        Objects.equals(this.serviceNames, v9VmOpenApiServiceInBase.serviceNames) &&
        Objects.equals(this.serviceChargeType, v9VmOpenApiServiceInBase.serviceChargeType) &&
        Objects.equals(this.areaType, v9VmOpenApiServiceInBase.areaType) &&
        Objects.equals(this.areas, v9VmOpenApiServiceInBase.areas) &&
        Objects.equals(this.serviceDescriptions, v9VmOpenApiServiceInBase.serviceDescriptions) &&
        Objects.equals(this.languages, v9VmOpenApiServiceInBase.languages) &&
        Objects.equals(this.serviceClasses, v9VmOpenApiServiceInBase.serviceClasses) &&
        Objects.equals(this.ontologyTerms, v9VmOpenApiServiceInBase.ontologyTerms) &&
        Objects.equals(this.targetGroups, v9VmOpenApiServiceInBase.targetGroups) &&
        Objects.equals(this.lifeEvents, v9VmOpenApiServiceInBase.lifeEvents) &&
        Objects.equals(this.industrialClasses, v9VmOpenApiServiceInBase.industrialClasses) &&
        Objects.equals(this.legislation, v9VmOpenApiServiceInBase.legislation) &&
        Objects.equals(this.keywords, v9VmOpenApiServiceInBase.keywords) &&
        Objects.equals(this.requirements, v9VmOpenApiServiceInBase.requirements) &&
        Objects.equals(this.otherResponsibleOrganizations, v9VmOpenApiServiceInBase.otherResponsibleOrganizations) &&
        Objects.equals(this.serviceProducers, v9VmOpenApiServiceInBase.serviceProducers) &&
        Objects.equals(this.serviceVouchersInUse, v9VmOpenApiServiceInBase.serviceVouchersInUse) &&
        Objects.equals(this.serviceVouchers, v9VmOpenApiServiceInBase.serviceVouchers) &&
        Objects.equals(this.publishingStatus, v9VmOpenApiServiceInBase.publishingStatus) &&
        Objects.equals(this.deleteAllLifeEvents, v9VmOpenApiServiceInBase.deleteAllLifeEvents) &&
        Objects.equals(this.deleteAllIndustrialClasses, v9VmOpenApiServiceInBase.deleteAllIndustrialClasses) &&
        Objects.equals(this.deleteAllLaws, v9VmOpenApiServiceInBase.deleteAllLaws) &&
        Objects.equals(this.deleteAllKeywords, v9VmOpenApiServiceInBase.deleteAllKeywords) &&
        Objects.equals(this.deleteServiceChargeType, v9VmOpenApiServiceInBase.deleteServiceChargeType) &&
        Objects.equals(this.deleteGeneralDescriptionId, v9VmOpenApiServiceInBase.deleteGeneralDescriptionId) &&
        Objects.equals(this.mainResponsibleOrganization, v9VmOpenApiServiceInBase.mainResponsibleOrganization) &&
        Objects.equals(this.validFrom, v9VmOpenApiServiceInBase.validFrom) &&
        Objects.equals(this.validTo, v9VmOpenApiServiceInBase.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, generalDescriptionId, type, subType, fundingType, serviceNames, serviceChargeType, areaType, areas, serviceDescriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, legislation, keywords, requirements, otherResponsibleOrganizations, serviceProducers, serviceVouchersInUse, serviceVouchers, publishingStatus, deleteAllLifeEvents, deleteAllIndustrialClasses, deleteAllLaws, deleteAllKeywords, deleteServiceChargeType, deleteGeneralDescriptionId, mainResponsibleOrganization, validFrom, validTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiServiceInBase {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    generalDescriptionId: ").append(toIndentedString(generalDescriptionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    fundingType: ").append(toIndentedString(fundingType)).append("\n");
    sb.append("    serviceNames: ").append(toIndentedString(serviceNames)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    serviceDescriptions: ").append(toIndentedString(serviceDescriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    otherResponsibleOrganizations: ").append(toIndentedString(otherResponsibleOrganizations)).append("\n");
    sb.append("    serviceProducers: ").append(toIndentedString(serviceProducers)).append("\n");
    sb.append("    serviceVouchersInUse: ").append(toIndentedString(serviceVouchersInUse)).append("\n");
    sb.append("    serviceVouchers: ").append(toIndentedString(serviceVouchers)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    deleteAllLifeEvents: ").append(toIndentedString(deleteAllLifeEvents)).append("\n");
    sb.append("    deleteAllIndustrialClasses: ").append(toIndentedString(deleteAllIndustrialClasses)).append("\n");
    sb.append("    deleteAllLaws: ").append(toIndentedString(deleteAllLaws)).append("\n");
    sb.append("    deleteAllKeywords: ").append(toIndentedString(deleteAllKeywords)).append("\n");
    sb.append("    deleteServiceChargeType: ").append(toIndentedString(deleteServiceChargeType)).append("\n");
    sb.append("    deleteGeneralDescriptionId: ").append(toIndentedString(deleteGeneralDescriptionId)).append("\n");
    sb.append("    mainResponsibleOrganization: ").append(toIndentedString(mainResponsibleOrganization)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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
