/*
 * PTV Open Api version 10
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v10
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
import fi.metatavu.ptv.client.model.V4VmOpenApiPhone;
import fi.metatavu.ptv.client.model.V4VmOpenApiPhoneSimple;
import fi.metatavu.ptv.client.model.V8VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.V9VmOpenApiAddressLocationIn;
import fi.metatavu.ptv.client.model.V9VmOpenApiWebPage;
import fi.metatavu.ptv.client.model.VmOpenApiAreaIn;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiNameTypeByLanguage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V9 - View Model of service location channel for IN api
 */
@ApiModel(description = "OPEN API V9 - View Model of service location channel for IN api")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class V9VmOpenApiServiceLocationChannelIn {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("oid")
  private String oid = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLocalizedListItem> serviceChannelNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("displayNameType")
  private List<VmOpenApiNameTypeByLanguage> displayNameType = new ArrayList<VmOpenApiNameTypeByLanguage>();

  @JsonProperty("areaType")
  private String areaType = null;

  @JsonProperty("areas")
  private List<VmOpenApiAreaIn> areas = null;

  @JsonProperty("emails")
  private List<VmOpenApiLanguageItem> emails = null;

  @JsonProperty("faxNumbers")
  private List<V4VmOpenApiPhoneSimple> faxNumbers = null;

  @JsonProperty("phoneNumbers")
  private List<V4VmOpenApiPhone> phoneNumbers = null;

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("webPages")
  private List<V9VmOpenApiWebPage> webPages = null;

  @JsonProperty("addresses")
  private List<V9VmOpenApiAddressLocationIn> addresses = new ArrayList<V9VmOpenApiAddressLocationIn>();

  @JsonProperty("serviceHours")
  private List<V8VmOpenApiServiceHour> serviceHours = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("isVisibleForAll")
  private Boolean isVisibleForAll = null;

  @JsonProperty("services")
  private List<String> services = null;

  @JsonProperty("validFrom")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo = null;

  public V9VmOpenApiServiceLocationChannelIn sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * External system identifier for this service channel. User needs to be logged in to be able to get/set value.
   * @return sourceId
  **/
  @ApiModelProperty(value = "External system identifier for this service channel. User needs to be logged in to be able to get/set value.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public V9VmOpenApiServiceLocationChannelIn oid(String oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Service channel OID. Must match the regex @\&quot;^[A-Za-z0-9.-]*$\&quot;.
   * @return oid
  **/
  @ApiModelProperty(value = "Service channel OID. Must match the regex @\"^[A-Za-z0-9.-]*$\".")
  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public V9VmOpenApiServiceLocationChannelIn organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * PTV organization identifier of organization responsible for this channel.
   * @return organizationId
  **/
  @ApiModelProperty(required = true, value = "PTV organization identifier of organization responsible for this channel.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public V9VmOpenApiServiceLocationChannelIn serviceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addServiceChannelNamesItem(VmOpenApiLocalizedListItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * List of localized service channel names. Possible type values are: Name, AlternativeName.
   * @return serviceChannelNames
  **/
  @ApiModelProperty(required = true, value = "List of localized service channel names. Possible type values are: Name, AlternativeName.")
  public List<VmOpenApiLocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public V9VmOpenApiServiceLocationChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * List of localized service channel descriptions. Possible type values are: Description, Summary.
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(required = true, value = "List of localized service channel descriptions. Possible type values are: Description, Summary.")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public V9VmOpenApiServiceLocationChannelIn displayNameType(List<VmOpenApiNameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addDisplayNameTypeItem(VmOpenApiNameTypeByLanguage displayNameTypeItem) {
    this.displayNameType.add(displayNameTypeItem);
    return this;
  }

   /**
   * List of Display name types (Name or AlternativeName) for each language version of ServiceChannelNames.  Is only available for PUT operations, since user cannot add alternative anmes through in api (PTV-4340).
   * @return displayNameType
  **/
  @ApiModelProperty(required = true, value = "List of Display name types (Name or AlternativeName) for each language version of ServiceChannelNames.  Is only available for PUT operations, since user cannot add alternative anmes through in api (PTV-4340).")
  public List<VmOpenApiNameTypeByLanguage> getDisplayNameType() {
    return displayNameType;
  }

  public void setDisplayNameType(List<VmOpenApiNameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
  }

  public V9VmOpenApiServiceLocationChannelIn areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * Area type. Possible values are: Nationwide, NationwideExceptAlandIslands or LimitedType.
   * @return areaType
  **/
  @ApiModelProperty(value = "Area type. Possible values are: Nationwide, NationwideExceptAlandIslands or LimitedType.")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public V9VmOpenApiServiceLocationChannelIn areas(List<VmOpenApiAreaIn> areas) {
    this.areas = areas;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addAreasItem(VmOpenApiAreaIn areasItem) {
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

  public V9VmOpenApiServiceLocationChannelIn emails(List<VmOpenApiLanguageItem> emails) {
    this.emails = emails;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addEmailsItem(VmOpenApiLanguageItem emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * List email addresses for the service channel.
   * @return emails
  **/
  @ApiModelProperty(value = "List email addresses for the service channel.")
  public List<VmOpenApiLanguageItem> getEmails() {
    return emails;
  }

  public void setEmails(List<VmOpenApiLanguageItem> emails) {
    this.emails = emails;
  }

  public V9VmOpenApiServiceLocationChannelIn faxNumbers(List<V4VmOpenApiPhoneSimple> faxNumbers) {
    this.faxNumbers = faxNumbers;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addFaxNumbersItem(V4VmOpenApiPhoneSimple faxNumbersItem) {
    if (this.faxNumbers == null) {
      this.faxNumbers = new ArrayList<V4VmOpenApiPhoneSimple>();
    }
    this.faxNumbers.add(faxNumbersItem);
    return this;
  }

   /**
   * Service location contact fax numbers.
   * @return faxNumbers
  **/
  @ApiModelProperty(value = "Service location contact fax numbers.")
  public List<V4VmOpenApiPhoneSimple> getFaxNumbers() {
    return faxNumbers;
  }

  public void setFaxNumbers(List<V4VmOpenApiPhoneSimple> faxNumbers) {
    this.faxNumbers = faxNumbers;
  }

  public V9VmOpenApiServiceLocationChannelIn phoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addPhoneNumbersItem(V4VmOpenApiPhone phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<V4VmOpenApiPhone>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of support phone numbers for the service channel.
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "List of support phone numbers for the service channel.")
  public List<V4VmOpenApiPhone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public V9VmOpenApiServiceLocationChannelIn languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of languages the service channel is available in (two letter language code).
   * @return languages
  **/
  @ApiModelProperty(required = true, value = "List of languages the service channel is available in (two letter language code).")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public V9VmOpenApiServiceLocationChannelIn webPages(List<V9VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addWebPagesItem(V9VmOpenApiWebPage webPagesItem) {
    if (this.webPages == null) {
      this.webPages = new ArrayList<V9VmOpenApiWebPage>();
    }
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of service channel web pages.
   * @return webPages
  **/
  @ApiModelProperty(value = "List of service channel web pages.")
  public List<V9VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<V9VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }

  public V9VmOpenApiServiceLocationChannelIn addresses(List<V9VmOpenApiAddressLocationIn> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addAddressesItem(V9VmOpenApiAddressLocationIn addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of visiting addresses.
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "List of visiting addresses.")
  public List<V9VmOpenApiAddressLocationIn> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V9VmOpenApiAddressLocationIn> addresses) {
    this.addresses = addresses;
  }

  public V9VmOpenApiServiceLocationChannelIn serviceHours(List<V8VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addServiceHoursItem(V8VmOpenApiServiceHour serviceHoursItem) {
    if (this.serviceHours == null) {
      this.serviceHours = new ArrayList<V8VmOpenApiServiceHour>();
    }
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * List of service channel service hours.
   * @return serviceHours
  **/
  @ApiModelProperty(value = "List of service channel service hours.")
  public List<V8VmOpenApiServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<V8VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public V9VmOpenApiServiceLocationChannelIn publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Service channel publishing status. Values: Draft or Published.
   * @return publishingStatus
  **/
  @ApiModelProperty(required = true, value = "Service channel publishing status. Values: Draft or Published.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V9VmOpenApiServiceLocationChannelIn isVisibleForAll(Boolean isVisibleForAll) {
    this.isVisibleForAll = isVisibleForAll;
    return this;
  }

   /**
   * Indicates if channel can be used (referenced within services) by other users from other organizations.
   * @return isVisibleForAll
  **/
  @ApiModelProperty(value = "Indicates if channel can be used (referenced within services) by other users from other organizations.")
  public Boolean getIsVisibleForAll() {
    return isVisibleForAll;
  }

  public void setIsVisibleForAll(Boolean isVisibleForAll) {
    this.isVisibleForAll = isVisibleForAll;
  }

  public V9VmOpenApiServiceLocationChannelIn services(List<String> services) {
    this.services = services;
    return this;
  }

  public V9VmOpenApiServiceLocationChannelIn addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * List of related services (GUID).
   * @return services
  **/
  @ApiModelProperty(value = "List of related services (GUID).")
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public V9VmOpenApiServiceLocationChannelIn validFrom(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom) {
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

  public V9VmOpenApiServiceLocationChannelIn validTo(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo) {
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
    V9VmOpenApiServiceLocationChannelIn v9VmOpenApiServiceLocationChannelIn = (V9VmOpenApiServiceLocationChannelIn) o;
    return Objects.equals(this.sourceId, v9VmOpenApiServiceLocationChannelIn.sourceId) &&
        Objects.equals(this.oid, v9VmOpenApiServiceLocationChannelIn.oid) &&
        Objects.equals(this.organizationId, v9VmOpenApiServiceLocationChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, v9VmOpenApiServiceLocationChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v9VmOpenApiServiceLocationChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.displayNameType, v9VmOpenApiServiceLocationChannelIn.displayNameType) &&
        Objects.equals(this.areaType, v9VmOpenApiServiceLocationChannelIn.areaType) &&
        Objects.equals(this.areas, v9VmOpenApiServiceLocationChannelIn.areas) &&
        Objects.equals(this.emails, v9VmOpenApiServiceLocationChannelIn.emails) &&
        Objects.equals(this.faxNumbers, v9VmOpenApiServiceLocationChannelIn.faxNumbers) &&
        Objects.equals(this.phoneNumbers, v9VmOpenApiServiceLocationChannelIn.phoneNumbers) &&
        Objects.equals(this.languages, v9VmOpenApiServiceLocationChannelIn.languages) &&
        Objects.equals(this.webPages, v9VmOpenApiServiceLocationChannelIn.webPages) &&
        Objects.equals(this.addresses, v9VmOpenApiServiceLocationChannelIn.addresses) &&
        Objects.equals(this.serviceHours, v9VmOpenApiServiceLocationChannelIn.serviceHours) &&
        Objects.equals(this.publishingStatus, v9VmOpenApiServiceLocationChannelIn.publishingStatus) &&
        Objects.equals(this.isVisibleForAll, v9VmOpenApiServiceLocationChannelIn.isVisibleForAll) &&
        Objects.equals(this.services, v9VmOpenApiServiceLocationChannelIn.services) &&
        Objects.equals(this.validFrom, v9VmOpenApiServiceLocationChannelIn.validFrom) &&
        Objects.equals(this.validTo, v9VmOpenApiServiceLocationChannelIn.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, oid, organizationId, serviceChannelNames, serviceChannelDescriptions, displayNameType, areaType, areas, emails, faxNumbers, phoneNumbers, languages, webPages, addresses, serviceHours, publishingStatus, isVisibleForAll, services, validFrom, validTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiServiceLocationChannelIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    displayNameType: ").append(toIndentedString(displayNameType)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    faxNumbers: ").append(toIndentedString(faxNumbers)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    isVisibleForAll: ").append(toIndentedString(isVisibleForAll)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

