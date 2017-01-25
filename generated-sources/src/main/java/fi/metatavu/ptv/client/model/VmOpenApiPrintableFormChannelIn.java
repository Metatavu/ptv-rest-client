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
import fi.metatavu.ptv.client.model.VmOpenApiAddress;
import fi.metatavu.ptv.client.model.VmOpenApiAttachment;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiSupport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiPrintableFormChannelIn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T15:52:10.525+02:00")
public class VmOpenApiPrintableFormChannelIn   {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("formIdentifier")
  private String formIdentifier = null;

  @JsonProperty("formReceiver")
  private String formReceiver = null;

  @JsonProperty("deliveryAddress")
  private VmOpenApiAddress deliveryAddress = null;

  @JsonProperty("channelUrls")
  private List<VmOpenApiLocalizedListItem> channelUrls = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("deliveryAddressDescriptions")
  private List<VmOpenApiLanguageItem> deliveryAddressDescriptions = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachment> attachments = new ArrayList<VmOpenApiAttachment>();

  @JsonProperty("deleteAllDeliveryAddressDescriptions")
  private Boolean deleteAllDeliveryAddressDescriptions = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("supportContacts")
  private List<VmOpenApiSupport> supportContacts = new ArrayList<VmOpenApiSupport>();

  @JsonProperty("deleteAllSupportContacts")
  private Boolean deleteAllSupportContacts = null;

  public VmOpenApiPrintableFormChannelIn sourceId(String sourceId) {
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

  public VmOpenApiPrintableFormChannelIn organizationId(String organizationId) {
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

  public VmOpenApiPrintableFormChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiPrintableFormChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * List of localized service channel names.
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of localized service channel names.")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiPrintableFormChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiPrintableFormChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * List of localized service channel descriptions.
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of localized service channel descriptions.")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public VmOpenApiPrintableFormChannelIn formIdentifier(String formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

   /**
   * Form identifier.
   * @return formIdentifier
  **/
  @ApiModelProperty(example = "null", value = "Form identifier.")
  public String getFormIdentifier() {
    return formIdentifier;
  }

  public void setFormIdentifier(String formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  public VmOpenApiPrintableFormChannelIn formReceiver(String formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

   /**
   * Form receiver.
   * @return formReceiver
  **/
  @ApiModelProperty(example = "null", value = "Form receiver.")
  public String getFormReceiver() {
    return formReceiver;
  }

  public void setFormReceiver(String formReceiver) {
    this.formReceiver = formReceiver;
  }

  public VmOpenApiPrintableFormChannelIn deliveryAddress(VmOpenApiAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Form delivery address.
   * @return deliveryAddress
  **/
  @ApiModelProperty(example = "null", value = "Form delivery address.")
  public VmOpenApiAddress getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(VmOpenApiAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public VmOpenApiPrintableFormChannelIn channelUrls(List<VmOpenApiLocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public VmOpenApiPrintableFormChannelIn addChannelUrlsItem(VmOpenApiLocalizedListItem channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * List of localized urls.
   * @return channelUrls
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of localized urls.")
  public List<VmOpenApiLocalizedListItem> getChannelUrls() {
    return channelUrls;
  }

  public void setChannelUrls(List<VmOpenApiLocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
  }

  public VmOpenApiPrintableFormChannelIn deliveryAddressDescriptions(List<VmOpenApiLanguageItem> deliveryAddressDescriptions) {
    this.deliveryAddressDescriptions = deliveryAddressDescriptions;
    return this;
  }

  public VmOpenApiPrintableFormChannelIn addDeliveryAddressDescriptionsItem(VmOpenApiLanguageItem deliveryAddressDescriptionsItem) {
    this.deliveryAddressDescriptions.add(deliveryAddressDescriptionsItem);
    return this;
  }

   /**
   * Description for delivery address. This property is not used in the API anymore. Do not use.
   * @return deliveryAddressDescriptions
  **/
  @ApiModelProperty(example = "null", value = "Description for delivery address. This property is not used in the API anymore. Do not use.")
  public List<VmOpenApiLanguageItem> getDeliveryAddressDescriptions() {
    return deliveryAddressDescriptions;
  }

  public void setDeliveryAddressDescriptions(List<VmOpenApiLanguageItem> deliveryAddressDescriptions) {
    this.deliveryAddressDescriptions = deliveryAddressDescriptions;
  }

  public VmOpenApiPrintableFormChannelIn attachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public VmOpenApiPrintableFormChannelIn addAttachmentsItem(VmOpenApiAttachment attachmentsItem) {
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

  public VmOpenApiPrintableFormChannelIn deleteAllDeliveryAddressDescriptions(Boolean deleteAllDeliveryAddressDescriptions) {
    this.deleteAllDeliveryAddressDescriptions = deleteAllDeliveryAddressDescriptions;
    return this;
  }

   /**
   * True to delete all existing delivery address descriptions. The DeliveryAddressDescriptions collection should be empty when this property is set to true.              This property is not used in the API anymore. Do not use.
   * @return deleteAllDeliveryAddressDescriptions
  **/
  @ApiModelProperty(example = "null", value = "True to delete all existing delivery address descriptions. The DeliveryAddressDescriptions collection should be empty when this property is set to true.              This property is not used in the API anymore. Do not use.")
  public Boolean getDeleteAllDeliveryAddressDescriptions() {
    return deleteAllDeliveryAddressDescriptions;
  }

  public void setDeleteAllDeliveryAddressDescriptions(Boolean deleteAllDeliveryAddressDescriptions) {
    this.deleteAllDeliveryAddressDescriptions = deleteAllDeliveryAddressDescriptions;
  }

  public VmOpenApiPrintableFormChannelIn publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public VmOpenApiPrintableFormChannelIn supportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public VmOpenApiPrintableFormChannelIn addSupportContactsItem(VmOpenApiSupport supportContactsItem) {
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

  public VmOpenApiPrintableFormChannelIn deleteAllSupportContacts(Boolean deleteAllSupportContacts) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiPrintableFormChannelIn vmOpenApiPrintableFormChannelIn = (VmOpenApiPrintableFormChannelIn) o;
    return Objects.equals(this.sourceId, vmOpenApiPrintableFormChannelIn.sourceId) &&
        Objects.equals(this.organizationId, vmOpenApiPrintableFormChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiPrintableFormChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiPrintableFormChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.formIdentifier, vmOpenApiPrintableFormChannelIn.formIdentifier) &&
        Objects.equals(this.formReceiver, vmOpenApiPrintableFormChannelIn.formReceiver) &&
        Objects.equals(this.deliveryAddress, vmOpenApiPrintableFormChannelIn.deliveryAddress) &&
        Objects.equals(this.channelUrls, vmOpenApiPrintableFormChannelIn.channelUrls) &&
        Objects.equals(this.deliveryAddressDescriptions, vmOpenApiPrintableFormChannelIn.deliveryAddressDescriptions) &&
        Objects.equals(this.attachments, vmOpenApiPrintableFormChannelIn.attachments) &&
        Objects.equals(this.deleteAllDeliveryAddressDescriptions, vmOpenApiPrintableFormChannelIn.deleteAllDeliveryAddressDescriptions) &&
        Objects.equals(this.publishingStatus, vmOpenApiPrintableFormChannelIn.publishingStatus) &&
        Objects.equals(this.supportContacts, vmOpenApiPrintableFormChannelIn.supportContacts) &&
        Objects.equals(this.deleteAllSupportContacts, vmOpenApiPrintableFormChannelIn.deleteAllSupportContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, formIdentifier, formReceiver, deliveryAddress, channelUrls, deliveryAddressDescriptions, attachments, deleteAllDeliveryAddressDescriptions, publishingStatus, supportContacts, deleteAllSupportContacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiPrintableFormChannelIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    formIdentifier: ").append(toIndentedString(formIdentifier)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    deliveryAddressDescriptions: ").append(toIndentedString(deliveryAddressDescriptions)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    deleteAllDeliveryAddressDescriptions: ").append(toIndentedString(deleteAllDeliveryAddressDescriptions)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    deleteAllSupportContacts: ").append(toIndentedString(deleteAllSupportContacts)).append("\n");
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
