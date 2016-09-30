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
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceHour;
import fi.otavanopisto.ptv.client.model.VmOpenApiSupport;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiPhoneChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-30T08:33:13.270+03:00")
public class VmOpenApiPhoneChannel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("serviceChannelType")
  private String serviceChannelType = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLocalizedListItem> serviceChannelNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("phoneType")
  private String phoneType = null;

  @JsonProperty("serviceChargeTypes")
  private List<String> serviceChargeTypes = new ArrayList<String>();

  @JsonProperty("supportContacts")
  private List<VmOpenApiSupport> supportContacts = new ArrayList<VmOpenApiSupport>();

  @JsonProperty("phoneNumbers")
  private List<VmOpenApiLanguageItem> phoneNumbers = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("phoneChargeDescriptions")
  private List<VmOpenApiLanguageItem> phoneChargeDescriptions = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("serviceHours")
  private List<VmOpenApiServiceHour> serviceHours = new ArrayList<VmOpenApiServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiPhoneChannel id(String id) {
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

  public VmOpenApiPhoneChannel serviceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
    return this;
  }

   /**
   * Get serviceChannelType
   * @return serviceChannelType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChannelType() {
    return serviceChannelType;
  }

  public void setServiceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
  }

  public VmOpenApiPhoneChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiPhoneChannel serviceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiPhoneChannel addServiceChannelNamesItem(VmOpenApiLocalizedListItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Get serviceChannelNames
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiPhoneChannel serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiPhoneChannel addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * Get serviceChannelDescriptions
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public VmOpenApiPhoneChannel phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  public VmOpenApiPhoneChannel serviceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
    return this;
  }

  public VmOpenApiPhoneChannel addServiceChargeTypesItem(String serviceChargeTypesItem) {
    this.serviceChargeTypes.add(serviceChargeTypesItem);
    return this;
  }

   /**
   * Get serviceChargeTypes
   * @return serviceChargeTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceChargeTypes() {
    return serviceChargeTypes;
  }

  public void setServiceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
  }

  public VmOpenApiPhoneChannel supportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public VmOpenApiPhoneChannel addSupportContactsItem(VmOpenApiSupport supportContactsItem) {
    this.supportContacts.add(supportContactsItem);
    return this;
  }

   /**
   * Get supportContacts
   * @return supportContacts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiSupport> getSupportContacts() {
    return supportContacts;
  }

  public void setSupportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
  }

  public VmOpenApiPhoneChannel phoneNumbers(List<VmOpenApiLanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public VmOpenApiPhoneChannel addPhoneNumbersItem(VmOpenApiLanguageItem phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<VmOpenApiLanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public VmOpenApiPhoneChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiPhoneChannel addLanguagesItem(String languagesItem) {
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

  public VmOpenApiPhoneChannel phoneChargeDescriptions(List<VmOpenApiLanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  public VmOpenApiPhoneChannel addPhoneChargeDescriptionsItem(VmOpenApiLanguageItem phoneChargeDescriptionsItem) {
    this.phoneChargeDescriptions.add(phoneChargeDescriptionsItem);
    return this;
  }

   /**
   * Get phoneChargeDescriptions
   * @return phoneChargeDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getPhoneChargeDescriptions() {
    return phoneChargeDescriptions;
  }

  public void setPhoneChargeDescriptions(List<VmOpenApiLanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
  }

  public VmOpenApiPhoneChannel webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiPhoneChannel addWebPagesItem(VmOpenApiWebPage webPagesItem) {
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

  public VmOpenApiPhoneChannel serviceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public VmOpenApiPhoneChannel addServiceHoursItem(VmOpenApiServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * Get serviceHours
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public VmOpenApiPhoneChannel publishingStatus(String publishingStatus) {
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
    VmOpenApiPhoneChannel vmOpenApiPhoneChannel = (VmOpenApiPhoneChannel) o;
    return Objects.equals(this.id, vmOpenApiPhoneChannel.id) &&
        Objects.equals(this.serviceChannelType, vmOpenApiPhoneChannel.serviceChannelType) &&
        Objects.equals(this.organizationId, vmOpenApiPhoneChannel.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiPhoneChannel.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiPhoneChannel.serviceChannelDescriptions) &&
        Objects.equals(this.phoneType, vmOpenApiPhoneChannel.phoneType) &&
        Objects.equals(this.serviceChargeTypes, vmOpenApiPhoneChannel.serviceChargeTypes) &&
        Objects.equals(this.supportContacts, vmOpenApiPhoneChannel.supportContacts) &&
        Objects.equals(this.phoneNumbers, vmOpenApiPhoneChannel.phoneNumbers) &&
        Objects.equals(this.languages, vmOpenApiPhoneChannel.languages) &&
        Objects.equals(this.phoneChargeDescriptions, vmOpenApiPhoneChannel.phoneChargeDescriptions) &&
        Objects.equals(this.webPages, vmOpenApiPhoneChannel.webPages) &&
        Objects.equals(this.serviceHours, vmOpenApiPhoneChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, vmOpenApiPhoneChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, phoneType, serviceChargeTypes, supportContacts, phoneNumbers, languages, phoneChargeDescriptions, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiPhoneChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    serviceChargeTypes: ").append(toIndentedString(serviceChargeTypes)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    phoneChargeDescriptions: ").append(toIndentedString(phoneChargeDescriptions)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
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

