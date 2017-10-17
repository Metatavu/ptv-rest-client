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
import fi.metatavu.ptv.client.model.V4VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.V5VmOpenApiPhoneChannelPhone;
import fi.metatavu.ptv.client.model.VmOpenApiArea;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiWebPageWithOrderNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API V6 - View Model of phone channel
 */
@ApiModel(description = "OPEN API V6 - View Model of phone channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T09:05:02.286+03:00")
public class V6VmOpenApiPhoneChannel {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("serviceChannelType")
  private String serviceChannelType = null;

  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLocalizedListItem> serviceChannelNames = null;

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = null;

  @JsonProperty("areaType")
  private String areaType = null;

  @JsonProperty("areas")
  private List<VmOpenApiArea> areas = null;

  @JsonProperty("phoneNumbers")
  private List<V5VmOpenApiPhoneChannelPhone> phoneNumbers = null;

  @JsonProperty("supportEmails")
  private List<VmOpenApiLanguageItem> supportEmails = null;

  @JsonProperty("languages")
  private List<String> languages = null;

  @JsonProperty("webPages")
  private List<VmOpenApiWebPageWithOrderNumber> webPages = null;

  @JsonProperty("serviceHours")
  private List<V4VmOpenApiServiceHour> serviceHours = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("modified")
  private @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using =  fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified = null;

  public V6VmOpenApiPhoneChannel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * PTV identifier for the service channel.
   * @return id
  **/
  @ApiModelProperty(value = "PTV identifier for the service channel.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public V6VmOpenApiPhoneChannel serviceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
    return this;
  }

   /**
   * Type of the service channel. Channel types: EChannel, WebPage, PrintableForm, Phone or ServiceLocation.
   * @return serviceChannelType
  **/
  @ApiModelProperty(value = "Type of the service channel. Channel types: EChannel, WebPage, PrintableForm, Phone or ServiceLocation.")
  public String getServiceChannelType() {
    return serviceChannelType;
  }

  public void setServiceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
  }

  public V6VmOpenApiPhoneChannel organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * PTV organization identifier responsible for the channel.
   * @return organizationId
  **/
  @ApiModelProperty(value = "PTV organization identifier responsible for the channel.")
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  public V6VmOpenApiPhoneChannel serviceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V6VmOpenApiPhoneChannel addServiceChannelNamesItem(VmOpenApiLocalizedListItem serviceChannelNamesItem) {
    if (this.serviceChannelNames == null) {
      this.serviceChannelNames = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Localized list of service channel names.
   * @return serviceChannelNames
  **/
  @ApiModelProperty(value = "Localized list of service channel names.")
  public List<VmOpenApiLocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public V6VmOpenApiPhoneChannel serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V6VmOpenApiPhoneChannel addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    if (this.serviceChannelDescriptions == null) {
      this.serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * List of localized service channel descriptions. (Max.Length: 150 ShortDescription). (Max.Length: 2500 Description).
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(value = "List of localized service channel descriptions. (Max.Length: 150 ShortDescription). (Max.Length: 2500 Description).")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public V6VmOpenApiPhoneChannel areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).
   * @return areaType
  **/
  @ApiModelProperty(value = "Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public V6VmOpenApiPhoneChannel areas(List<VmOpenApiArea> areas) {
    this.areas = areas;
    return this;
  }

  public V6VmOpenApiPhoneChannel addAreasItem(VmOpenApiArea areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<VmOpenApiArea>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * List of service channel areas.
   * @return areas
  **/
  @ApiModelProperty(value = "List of service channel areas.")
  public List<VmOpenApiArea> getAreas() {
    return areas;
  }

  public void setAreas(List<VmOpenApiArea> areas) {
    this.areas = areas;
  }

  public V6VmOpenApiPhoneChannel phoneNumbers(List<V5VmOpenApiPhoneChannelPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V6VmOpenApiPhoneChannel addPhoneNumbersItem(V5VmOpenApiPhoneChannelPhone phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<V5VmOpenApiPhoneChannelPhone>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of phone numbers for the service channel.
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "List of phone numbers for the service channel.")
  public List<V5VmOpenApiPhoneChannelPhone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<V5VmOpenApiPhoneChannelPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public V6VmOpenApiPhoneChannel supportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public V6VmOpenApiPhoneChannel addSupportEmailsItem(VmOpenApiLanguageItem supportEmailsItem) {
    if (this.supportEmails == null) {
      this.supportEmails = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.supportEmails.add(supportEmailsItem);
    return this;
  }

   /**
   * List of support email addresses for the service channel. (Max.Length: 100).
   * @return supportEmails
  **/
  @ApiModelProperty(value = "List of support email addresses for the service channel. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getSupportEmails() {
    return supportEmails;
  }

  public void setSupportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
  }

  public V6VmOpenApiPhoneChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V6VmOpenApiPhoneChannel addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of languages the service channel is available in (two letter language code).
   * @return languages
  **/
  @ApiModelProperty(value = "List of languages the service channel is available in (two letter language code).")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public V6VmOpenApiPhoneChannel webPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V6VmOpenApiPhoneChannel addWebPagesItem(VmOpenApiWebPageWithOrderNumber webPagesItem) {
    if (this.webPages == null) {
      this.webPages = new ArrayList<VmOpenApiWebPageWithOrderNumber>();
    }
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of service channel web pages.
   * @return webPages
  **/
  @ApiModelProperty(value = "List of service channel web pages.")
  public List<VmOpenApiWebPageWithOrderNumber> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
  }

  public V6VmOpenApiPhoneChannel serviceHours(List<V4VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V6VmOpenApiPhoneChannel addServiceHoursItem(V4VmOpenApiServiceHour serviceHoursItem) {
    if (this.serviceHours == null) {
      this.serviceHours = new ArrayList<V4VmOpenApiServiceHour>();
    }
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * List of service channel service hours.
   * @return serviceHours
  **/
  @ApiModelProperty(value = "List of service channel service hours.")
  public List<V4VmOpenApiServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<V4VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public V6VmOpenApiPhoneChannel publishingStatus(String publishingStatus) {
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

  public V6VmOpenApiPhoneChannel modified(@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using =  fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Date when item was modified/created (UTC).
   * @return modified
  **/
  @ApiModelProperty(value = "Date when item was modified/created (UTC).")
  public @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using =  fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using =  fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
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
    V6VmOpenApiPhoneChannel v6VmOpenApiPhoneChannel = (V6VmOpenApiPhoneChannel) o;
    return Objects.equals(this.id, v6VmOpenApiPhoneChannel.id) &&
        Objects.equals(this.serviceChannelType, v6VmOpenApiPhoneChannel.serviceChannelType) &&
        Objects.equals(this.organizationId, v6VmOpenApiPhoneChannel.organizationId) &&
        Objects.equals(this.serviceChannelNames, v6VmOpenApiPhoneChannel.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v6VmOpenApiPhoneChannel.serviceChannelDescriptions) &&
        Objects.equals(this.areaType, v6VmOpenApiPhoneChannel.areaType) &&
        Objects.equals(this.areas, v6VmOpenApiPhoneChannel.areas) &&
        Objects.equals(this.phoneNumbers, v6VmOpenApiPhoneChannel.phoneNumbers) &&
        Objects.equals(this.supportEmails, v6VmOpenApiPhoneChannel.supportEmails) &&
        Objects.equals(this.languages, v6VmOpenApiPhoneChannel.languages) &&
        Objects.equals(this.webPages, v6VmOpenApiPhoneChannel.webPages) &&
        Objects.equals(this.serviceHours, v6VmOpenApiPhoneChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiPhoneChannel.publishingStatus) &&
        Objects.equals(this.modified, v6VmOpenApiPhoneChannel.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, areaType, areas, phoneNumbers, supportEmails, languages, webPages, serviceHours, publishingStatus, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiPhoneChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
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

