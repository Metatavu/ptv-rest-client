/*
 * PTV Open Api version 7
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v7
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
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V6 - View Model of web page channel for IN api - base
 */
@ApiModel(description = "OPEN API V6 - View Model of web page channel for IN api - base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class V6VmOpenApiWebPageChannelInBase {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = null;

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

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("isVisibleForAll")
  private Boolean isVisibleForAll = null;

  @JsonProperty("deleteAllSupportEmails")
  private Boolean deleteAllSupportEmails = null;

  @JsonProperty("deleteAllSupportPhones")
  private Boolean deleteAllSupportPhones = null;

  public V6VmOpenApiWebPageChannelInBase sourceId(String sourceId) {
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

  public V6VmOpenApiWebPageChannelInBase organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * PTV organization identifier for organization responsible for this service channel.
   * @return organizationId
  **/
  @ApiModelProperty(value = "PTV organization identifier for organization responsible for this service channel.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public V6VmOpenApiWebPageChannelInBase serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V6VmOpenApiWebPageChannelInBase addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    if (this.serviceChannelNames == null) {
      this.serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Localized list of service channel names. (Max.Length: 100).
   * @return serviceChannelNames
  **/
  @ApiModelProperty(value = "Localized list of service channel names. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public V6VmOpenApiWebPageChannelInBase serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V6VmOpenApiWebPageChannelInBase addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
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

  public V6VmOpenApiWebPageChannelInBase urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public V6VmOpenApiWebPageChannelInBase addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * List of localized urls. (Max.Length: 500).
   * @return urls
  **/
  @ApiModelProperty(value = "List of localized urls. (Max.Length: 500).")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public V6VmOpenApiWebPageChannelInBase supportPhones(List<V4VmOpenApiPhone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public V6VmOpenApiWebPageChannelInBase addSupportPhonesItem(V4VmOpenApiPhone supportPhonesItem) {
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

  public V6VmOpenApiWebPageChannelInBase supportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public V6VmOpenApiWebPageChannelInBase addSupportEmailsItem(VmOpenApiLanguageItem supportEmailsItem) {
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

  public V6VmOpenApiWebPageChannelInBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V6VmOpenApiWebPageChannelInBase addLanguagesItem(String languagesItem) {
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

  public V6VmOpenApiWebPageChannelInBase publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Service channel publishing status. Values: Draft, Published, Deleted or Modified.
   * @return publishingStatus
  **/
  @ApiModelProperty(required = true, value = "Service channel publishing status. Values: Draft, Published, Deleted or Modified.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V6VmOpenApiWebPageChannelInBase isVisibleForAll(Boolean isVisibleForAll) {
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

  public V6VmOpenApiWebPageChannelInBase deleteAllSupportEmails(Boolean deleteAllSupportEmails) {
    this.deleteAllSupportEmails = deleteAllSupportEmails;
    return this;
  }

   /**
   * Set to true to delete all existing support email addresses for the service channel. The SupportEmails collection should be empty when this property is set to true.
   * @return deleteAllSupportEmails
  **/
  @ApiModelProperty(value = "Set to true to delete all existing support email addresses for the service channel. The SupportEmails collection should be empty when this property is set to true.")
  public Boolean getDeleteAllSupportEmails() {
    return deleteAllSupportEmails;
  }

  public void setDeleteAllSupportEmails(Boolean deleteAllSupportEmails) {
    this.deleteAllSupportEmails = deleteAllSupportEmails;
  }

  public V6VmOpenApiWebPageChannelInBase deleteAllSupportPhones(Boolean deleteAllSupportPhones) {
    this.deleteAllSupportPhones = deleteAllSupportPhones;
    return this;
  }

   /**
   * Set to true to delete all existing support phone numbers for the service channel. The SupportPhones collection should be empty when this property is set to true.
   * @return deleteAllSupportPhones
  **/
  @ApiModelProperty(value = "Set to true to delete all existing support phone numbers for the service channel. The SupportPhones collection should be empty when this property is set to true.")
  public Boolean getDeleteAllSupportPhones() {
    return deleteAllSupportPhones;
  }

  public void setDeleteAllSupportPhones(Boolean deleteAllSupportPhones) {
    this.deleteAllSupportPhones = deleteAllSupportPhones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V6VmOpenApiWebPageChannelInBase v6VmOpenApiWebPageChannelInBase = (V6VmOpenApiWebPageChannelInBase) o;
    return Objects.equals(this.sourceId, v6VmOpenApiWebPageChannelInBase.sourceId) &&
        Objects.equals(this.organizationId, v6VmOpenApiWebPageChannelInBase.organizationId) &&
        Objects.equals(this.serviceChannelNames, v6VmOpenApiWebPageChannelInBase.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v6VmOpenApiWebPageChannelInBase.serviceChannelDescriptions) &&
        Objects.equals(this.urls, v6VmOpenApiWebPageChannelInBase.urls) &&
        Objects.equals(this.supportPhones, v6VmOpenApiWebPageChannelInBase.supportPhones) &&
        Objects.equals(this.supportEmails, v6VmOpenApiWebPageChannelInBase.supportEmails) &&
        Objects.equals(this.languages, v6VmOpenApiWebPageChannelInBase.languages) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiWebPageChannelInBase.publishingStatus) &&
        Objects.equals(this.isVisibleForAll, v6VmOpenApiWebPageChannelInBase.isVisibleForAll) &&
        Objects.equals(this.deleteAllSupportEmails, v6VmOpenApiWebPageChannelInBase.deleteAllSupportEmails) &&
        Objects.equals(this.deleteAllSupportPhones, v6VmOpenApiWebPageChannelInBase.deleteAllSupportPhones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, urls, supportPhones, supportEmails, languages, publishingStatus, isVisibleForAll, deleteAllSupportEmails, deleteAllSupportPhones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiWebPageChannelInBase {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    isVisibleForAll: ").append(toIndentedString(isVisibleForAll)).append("\n");
    sb.append("    deleteAllSupportEmails: ").append(toIndentedString(deleteAllSupportEmails)).append("\n");
    sb.append("    deleteAllSupportPhones: ").append(toIndentedString(deleteAllSupportPhones)).append("\n");
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

