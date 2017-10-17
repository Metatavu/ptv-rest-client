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
import fi.metatavu.ptv.client.model.V4VmOpenApiPhone;
import fi.metatavu.ptv.client.model.V4VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiWebPageWithOrderNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API V6 - View Model of web page channel
 */
@ApiModel(description = "OPEN API V6 - View Model of web page channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T09:05:02.286+03:00")
public class V6VmOpenApiWebPageChannel {
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

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = null;

  @JsonProperty("supportPhones")
  private List<V4VmOpenApiPhone> supportPhones = null;

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

  public V6VmOpenApiWebPageChannel id(UUID id) {
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

  public V6VmOpenApiWebPageChannel serviceChannelType(String serviceChannelType) {
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

  public V6VmOpenApiWebPageChannel organizationId(UUID organizationId) {
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

  public V6VmOpenApiWebPageChannel serviceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V6VmOpenApiWebPageChannel addServiceChannelNamesItem(VmOpenApiLocalizedListItem serviceChannelNamesItem) {
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

  public V6VmOpenApiWebPageChannel serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V6VmOpenApiWebPageChannel addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
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

  public V6VmOpenApiWebPageChannel urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public V6VmOpenApiWebPageChannel addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * List of localized urls.
   * @return urls
  **/
  @ApiModelProperty(value = "List of localized urls.")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public V6VmOpenApiWebPageChannel supportPhones(List<V4VmOpenApiPhone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public V6VmOpenApiWebPageChannel addSupportPhonesItem(V4VmOpenApiPhone supportPhonesItem) {
    if (this.supportPhones == null) {
      this.supportPhones = new ArrayList<V4VmOpenApiPhone>();
    }
    this.supportPhones.add(supportPhonesItem);
    return this;
  }

   /**
   * List of support phone numbers for the service channel.
   * @return supportPhones
  **/
  @ApiModelProperty(value = "List of support phone numbers for the service channel.")
  public List<V4VmOpenApiPhone> getSupportPhones() {
    return supportPhones;
  }

  public void setSupportPhones(List<V4VmOpenApiPhone> supportPhones) {
    this.supportPhones = supportPhones;
  }

  public V6VmOpenApiWebPageChannel supportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public V6VmOpenApiWebPageChannel addSupportEmailsItem(VmOpenApiLanguageItem supportEmailsItem) {
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

  public V6VmOpenApiWebPageChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V6VmOpenApiWebPageChannel addLanguagesItem(String languagesItem) {
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

  public V6VmOpenApiWebPageChannel webPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V6VmOpenApiWebPageChannel addWebPagesItem(VmOpenApiWebPageWithOrderNumber webPagesItem) {
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

  public V6VmOpenApiWebPageChannel serviceHours(List<V4VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V6VmOpenApiWebPageChannel addServiceHoursItem(V4VmOpenApiServiceHour serviceHoursItem) {
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

  public V6VmOpenApiWebPageChannel publishingStatus(String publishingStatus) {
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

  public V6VmOpenApiWebPageChannel modified(@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using =  fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
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
    V6VmOpenApiWebPageChannel v6VmOpenApiWebPageChannel = (V6VmOpenApiWebPageChannel) o;
    return Objects.equals(this.id, v6VmOpenApiWebPageChannel.id) &&
        Objects.equals(this.serviceChannelType, v6VmOpenApiWebPageChannel.serviceChannelType) &&
        Objects.equals(this.organizationId, v6VmOpenApiWebPageChannel.organizationId) &&
        Objects.equals(this.serviceChannelNames, v6VmOpenApiWebPageChannel.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v6VmOpenApiWebPageChannel.serviceChannelDescriptions) &&
        Objects.equals(this.urls, v6VmOpenApiWebPageChannel.urls) &&
        Objects.equals(this.supportPhones, v6VmOpenApiWebPageChannel.supportPhones) &&
        Objects.equals(this.supportEmails, v6VmOpenApiWebPageChannel.supportEmails) &&
        Objects.equals(this.languages, v6VmOpenApiWebPageChannel.languages) &&
        Objects.equals(this.webPages, v6VmOpenApiWebPageChannel.webPages) &&
        Objects.equals(this.serviceHours, v6VmOpenApiWebPageChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiWebPageChannel.publishingStatus) &&
        Objects.equals(this.modified, v6VmOpenApiWebPageChannel.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, urls, supportPhones, supportEmails, languages, webPages, serviceHours, publishingStatus, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiWebPageChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
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

