/**
 * PTV Open Api version 4
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v4
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
import fi.metatavu.ptv.client.model.V4VmOpenApiPhoneWithType;
import fi.metatavu.ptv.client.model.V4VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * OPEN API V4 - View Model of phone channel for IN api
 */
@ApiModel(description = "OPEN API V4 - View Model of phone channel for IN api")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T07:09:28.826+03:00")
public class V4VmOpenApiPhoneChannelIn   {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("phoneNumbers")
  private List<V4VmOpenApiPhoneWithType> phoneNumbers = new ArrayList<V4VmOpenApiPhoneWithType>();

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("supportEmails")
  private List<VmOpenApiLanguageItem> supportEmails = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("serviceHours")
  private List<V4VmOpenApiServiceHour> serviceHours = new ArrayList<V4VmOpenApiServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public V4VmOpenApiPhoneChannelIn sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * External system identifier for this service channel.
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "External system identifier for this service channel.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public V4VmOpenApiPhoneChannelIn organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * PTV organization identifier of organization responsible for this channel.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "PTV organization identifier of organization responsible for this channel.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public V4VmOpenApiPhoneChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V4VmOpenApiPhoneChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Localized list of service channel names.
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", required = true, value = "Localized list of service channel names.")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public V4VmOpenApiPhoneChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V4VmOpenApiPhoneChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * Localized list of service channel descriptions.
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", required = true, value = "Localized list of service channel descriptions.")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public V4VmOpenApiPhoneChannelIn phoneNumbers(List<V4VmOpenApiPhoneWithType> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V4VmOpenApiPhoneChannelIn addPhoneNumbersItem(V4VmOpenApiPhoneWithType phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of phone numbers for the service channel.
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of phone numbers for the service channel.")
  public List<V4VmOpenApiPhoneWithType> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<V4VmOpenApiPhoneWithType> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public V4VmOpenApiPhoneChannelIn urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public V4VmOpenApiPhoneChannelIn addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * List of localized urls.
   * @return urls
  **/
  @ApiModelProperty(example = "null", value = "List of localized urls.")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public V4VmOpenApiPhoneChannelIn supportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public V4VmOpenApiPhoneChannelIn addSupportEmailsItem(VmOpenApiLanguageItem supportEmailsItem) {
    this.supportEmails.add(supportEmailsItem);
    return this;
  }

   /**
   * List of support email addresses for the service channel.
   * @return supportEmails
  **/
  @ApiModelProperty(example = "null", value = "List of support email addresses for the service channel.")
  public List<VmOpenApiLanguageItem> getSupportEmails() {
    return supportEmails;
  }

  public void setSupportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
  }

  public V4VmOpenApiPhoneChannelIn languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public V4VmOpenApiPhoneChannelIn addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of languages the service channel is available in (two letter language code).
   * @return languages
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of languages the service channel is available in (two letter language code).")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public V4VmOpenApiPhoneChannelIn serviceHours(List<V4VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V4VmOpenApiPhoneChannelIn addServiceHoursItem(V4VmOpenApiServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * List of service channel service hours.
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "List of service channel service hours.")
  public List<V4VmOpenApiServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<V4VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public V4VmOpenApiPhoneChannelIn publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Service channel publishing status. Values: Draft or Published.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "Service channel publishing status. Values: Draft or Published.")
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
    V4VmOpenApiPhoneChannelIn v4VmOpenApiPhoneChannelIn = (V4VmOpenApiPhoneChannelIn) o;
    return Objects.equals(this.sourceId, v4VmOpenApiPhoneChannelIn.sourceId) &&
        Objects.equals(this.organizationId, v4VmOpenApiPhoneChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, v4VmOpenApiPhoneChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v4VmOpenApiPhoneChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.phoneNumbers, v4VmOpenApiPhoneChannelIn.phoneNumbers) &&
        Objects.equals(this.urls, v4VmOpenApiPhoneChannelIn.urls) &&
        Objects.equals(this.supportEmails, v4VmOpenApiPhoneChannelIn.supportEmails) &&
        Objects.equals(this.languages, v4VmOpenApiPhoneChannelIn.languages) &&
        Objects.equals(this.serviceHours, v4VmOpenApiPhoneChannelIn.serviceHours) &&
        Objects.equals(this.publishingStatus, v4VmOpenApiPhoneChannelIn.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, phoneNumbers, urls, supportEmails, languages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiPhoneChannelIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
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

