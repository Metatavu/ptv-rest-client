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
import fi.metatavu.ptv.client.model.VmOpenApiAttachment;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.VmOpenApiSupport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiElectronicChannelInBase
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T20:15:02.299+02:00")
public class VmOpenApiElectronicChannelInBase   {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("signatureQuantity")
  private String signatureQuantity = null;

  @JsonProperty("requiresSignature")
  private Boolean requiresSignature = null;

  @JsonProperty("requiresAuthentication")
  private Boolean requiresAuthentication = null;

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachment> attachments = new ArrayList<VmOpenApiAttachment>();

  @JsonProperty("serviceHours")
  private List<VmOpenApiServiceHour> serviceHours = new ArrayList<VmOpenApiServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("supportContacts")
  private List<VmOpenApiSupport> supportContacts = new ArrayList<VmOpenApiSupport>();

  @JsonProperty("deleteAllAttachments")
  private Boolean deleteAllAttachments = null;

  @JsonProperty("deleteAllSupportContacts")
  private Boolean deleteAllSupportContacts = null;

  @JsonProperty("deleteAllWebPages")
  private Boolean deleteAllWebPages = null;

  @JsonProperty("deleteAllServiceHours")
  private Boolean deleteAllServiceHours = null;

  public VmOpenApiElectronicChannelInBase sourceId(String sourceId) {
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

  public VmOpenApiElectronicChannelInBase organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * PTV organization identifier for organization responsible for this service channel.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "PTV organization identifier for organization responsible for this service channel.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiElectronicChannelInBase serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiElectronicChannelInBase addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * List of localized service channel descriptions.
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", value = "List of localized service channel descriptions.")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public VmOpenApiElectronicChannelInBase serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiElectronicChannelInBase addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Localized list of service channel names.
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", value = "Localized list of service channel names.")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiElectronicChannelInBase signatureQuantity(String signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

   /**
   * How many signatures are required (number). Required if RequiresSignature is true.
   * @return signatureQuantity
  **/
  @ApiModelProperty(example = "null", value = "How many signatures are required (number). Required if RequiresSignature is true.")
  public String getSignatureQuantity() {
    return signatureQuantity;
  }

  public void setSignatureQuantity(String signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  public VmOpenApiElectronicChannelInBase requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

   /**
   * Signature required.
   * @return requiresSignature
  **/
  @ApiModelProperty(example = "null", value = "Signature required.")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }

  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  public VmOpenApiElectronicChannelInBase requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

   /**
   * Does the service require authentication.
   * @return requiresAuthentication
  **/
  @ApiModelProperty(example = "null", required = true, value = "Does the service require authentication.")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }

  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  public VmOpenApiElectronicChannelInBase urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public VmOpenApiElectronicChannelInBase addUrlsItem(VmOpenApiLanguageItem urlsItem) {
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

  public VmOpenApiElectronicChannelInBase attachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public VmOpenApiElectronicChannelInBase addAttachmentsItem(VmOpenApiAttachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of attachments.
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "List of attachments.")
  public List<VmOpenApiAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
  }

  public VmOpenApiElectronicChannelInBase serviceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public VmOpenApiElectronicChannelInBase addServiceHoursItem(VmOpenApiServiceHour serviceHoursItem) {
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

  public VmOpenApiElectronicChannelInBase publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public VmOpenApiElectronicChannelInBase supportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public VmOpenApiElectronicChannelInBase addSupportContactsItem(VmOpenApiSupport supportContactsItem) {
    this.supportContacts.add(supportContactsItem);
    return this;
  }

   /**
   * List of support contacts for the service channel.
   * @return supportContacts
  **/
  @ApiModelProperty(example = "null", value = "List of support contacts for the service channel.")
  public List<VmOpenApiSupport> getSupportContacts() {
    return supportContacts;
  }

  public void setSupportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
  }

  public VmOpenApiElectronicChannelInBase deleteAllAttachments(Boolean deleteAllAttachments) {
    this.deleteAllAttachments = deleteAllAttachments;
    return this;
  }

   /**
   * Set to true to delete all existing attachments. The attachments collection should be empty when this property is set to true.
   * @return deleteAllAttachments
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing attachments. The attachments collection should be empty when this property is set to true.")
  public Boolean getDeleteAllAttachments() {
    return deleteAllAttachments;
  }

  public void setDeleteAllAttachments(Boolean deleteAllAttachments) {
    this.deleteAllAttachments = deleteAllAttachments;
  }

  public VmOpenApiElectronicChannelInBase deleteAllSupportContacts(Boolean deleteAllSupportContacts) {
    this.deleteAllSupportContacts = deleteAllSupportContacts;
    return this;
  }

   /**
   * Set to true to delete all existing support contacts for the service channel. The SupportContacts collection should be empty when this property is set to true.
   * @return deleteAllSupportContacts
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing support contacts for the service channel. The SupportContacts collection should be empty when this property is set to true.")
  public Boolean getDeleteAllSupportContacts() {
    return deleteAllSupportContacts;
  }

  public void setDeleteAllSupportContacts(Boolean deleteAllSupportContacts) {
    this.deleteAllSupportContacts = deleteAllSupportContacts;
  }

  public VmOpenApiElectronicChannelInBase deleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
    return this;
  }

   /**
   * Set to true to delete all existing web pages for the service channel. The WebPages collection should be empty when this property is set to true.
   * @return deleteAllWebPages
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing web pages for the service channel. The WebPages collection should be empty when this property is set to true.")
  public Boolean getDeleteAllWebPages() {
    return deleteAllWebPages;
  }

  public void setDeleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
  }

  public VmOpenApiElectronicChannelInBase deleteAllServiceHours(Boolean deleteAllServiceHours) {
    this.deleteAllServiceHours = deleteAllServiceHours;
    return this;
  }

   /**
   * Set to true to delete all existing service hours for the service channel. The ServiceHours collection should be empty when this property is set to true.
   * @return deleteAllServiceHours
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing service hours for the service channel. The ServiceHours collection should be empty when this property is set to true.")
  public Boolean getDeleteAllServiceHours() {
    return deleteAllServiceHours;
  }

  public void setDeleteAllServiceHours(Boolean deleteAllServiceHours) {
    this.deleteAllServiceHours = deleteAllServiceHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiElectronicChannelInBase vmOpenApiElectronicChannelInBase = (VmOpenApiElectronicChannelInBase) o;
    return Objects.equals(this.sourceId, vmOpenApiElectronicChannelInBase.sourceId) &&
        Objects.equals(this.organizationId, vmOpenApiElectronicChannelInBase.organizationId) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiElectronicChannelInBase.serviceChannelDescriptions) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiElectronicChannelInBase.serviceChannelNames) &&
        Objects.equals(this.signatureQuantity, vmOpenApiElectronicChannelInBase.signatureQuantity) &&
        Objects.equals(this.requiresSignature, vmOpenApiElectronicChannelInBase.requiresSignature) &&
        Objects.equals(this.requiresAuthentication, vmOpenApiElectronicChannelInBase.requiresAuthentication) &&
        Objects.equals(this.urls, vmOpenApiElectronicChannelInBase.urls) &&
        Objects.equals(this.attachments, vmOpenApiElectronicChannelInBase.attachments) &&
        Objects.equals(this.serviceHours, vmOpenApiElectronicChannelInBase.serviceHours) &&
        Objects.equals(this.publishingStatus, vmOpenApiElectronicChannelInBase.publishingStatus) &&
        Objects.equals(this.supportContacts, vmOpenApiElectronicChannelInBase.supportContacts) &&
        Objects.equals(this.deleteAllAttachments, vmOpenApiElectronicChannelInBase.deleteAllAttachments) &&
        Objects.equals(this.deleteAllSupportContacts, vmOpenApiElectronicChannelInBase.deleteAllSupportContacts) &&
        Objects.equals(this.deleteAllWebPages, vmOpenApiElectronicChannelInBase.deleteAllWebPages) &&
        Objects.equals(this.deleteAllServiceHours, vmOpenApiElectronicChannelInBase.deleteAllServiceHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelDescriptions, serviceChannelNames, signatureQuantity, requiresSignature, requiresAuthentication, urls, attachments, serviceHours, publishingStatus, supportContacts, deleteAllAttachments, deleteAllSupportContacts, deleteAllWebPages, deleteAllServiceHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiElectronicChannelInBase {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    signatureQuantity: ").append(toIndentedString(signatureQuantity)).append("\n");
    sb.append("    requiresSignature: ").append(toIndentedString(requiresSignature)).append("\n");
    sb.append("    requiresAuthentication: ").append(toIndentedString(requiresAuthentication)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    deleteAllAttachments: ").append(toIndentedString(deleteAllAttachments)).append("\n");
    sb.append("    deleteAllSupportContacts: ").append(toIndentedString(deleteAllSupportContacts)).append("\n");
    sb.append("    deleteAllWebPages: ").append(toIndentedString(deleteAllWebPages)).append("\n");
    sb.append("    deleteAllServiceHours: ").append(toIndentedString(deleteAllServiceHours)).append("\n");
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

