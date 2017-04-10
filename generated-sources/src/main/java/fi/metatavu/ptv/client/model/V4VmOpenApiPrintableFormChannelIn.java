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
import fi.metatavu.ptv.client.model.V4VmOpenApiAddressIn;
import fi.metatavu.ptv.client.model.V4VmOpenApiPhone;
import fi.metatavu.ptv.client.model.VmOpenApiAttachment;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * OPEN API V4 - View Model of printable from channel for IN api
 */
@ApiModel(description = "OPEN API V4 - View Model of printable from channel for IN api")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T07:12:40.139+03:00")
public class V4VmOpenApiPrintableFormChannelIn   {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("formIdentifier")
  private List<VmOpenApiLanguageItem> formIdentifier = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("formReceiver")
  private List<VmOpenApiLanguageItem> formReceiver = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("deliveryAddress")
  private V4VmOpenApiAddressIn deliveryAddress = null;

  @JsonProperty("channelUrls")
  private List<VmOpenApiLocalizedListItem> channelUrls = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachment> attachments = new ArrayList<VmOpenApiAttachment>();

  @JsonProperty("supportPhones")
  private List<V4VmOpenApiPhone> supportPhones = new ArrayList<V4VmOpenApiPhone>();

  @JsonProperty("supportEmails")
  private List<VmOpenApiLanguageItem> supportEmails = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public V4VmOpenApiPrintableFormChannelIn sourceId(String sourceId) {
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

  public V4VmOpenApiPrintableFormChannelIn organizationId(String organizationId) {
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

  public V4VmOpenApiPrintableFormChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
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

  public V4VmOpenApiPrintableFormChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
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

  public V4VmOpenApiPrintableFormChannelIn formIdentifier(List<VmOpenApiLanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addFormIdentifierItem(VmOpenApiLanguageItem formIdentifierItem) {
    this.formIdentifier.add(formIdentifierItem);
    return this;
  }

   /**
   * List of localized form identifiers. One per language.
   * @return formIdentifier
  **/
  @ApiModelProperty(example = "null", value = "List of localized form identifiers. One per language.")
  public List<VmOpenApiLanguageItem> getFormIdentifier() {
    return formIdentifier;
  }

  public void setFormIdentifier(List<VmOpenApiLanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  public V4VmOpenApiPrintableFormChannelIn formReceiver(List<VmOpenApiLanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addFormReceiverItem(VmOpenApiLanguageItem formReceiverItem) {
    this.formReceiver.add(formReceiverItem);
    return this;
  }

   /**
   * List of localized form receivers. One per language.
   * @return formReceiver
  **/
  @ApiModelProperty(example = "null", value = "List of localized form receivers. One per language.")
  public List<VmOpenApiLanguageItem> getFormReceiver() {
    return formReceiver;
  }

  public void setFormReceiver(List<VmOpenApiLanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
  }

  public V4VmOpenApiPrintableFormChannelIn deliveryAddress(V4VmOpenApiAddressIn deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Form delivery address.
   * @return deliveryAddress
  **/
  @ApiModelProperty(example = "null", value = "Form delivery address.")
  public V4VmOpenApiAddressIn getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(V4VmOpenApiAddressIn deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public V4VmOpenApiPrintableFormChannelIn channelUrls(List<VmOpenApiLocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addChannelUrlsItem(VmOpenApiLocalizedListItem channelUrlsItem) {
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

  public V4VmOpenApiPrintableFormChannelIn attachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addAttachmentsItem(VmOpenApiAttachment attachmentsItem) {
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

  public V4VmOpenApiPrintableFormChannelIn supportPhones(List<V4VmOpenApiPhone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addSupportPhonesItem(V4VmOpenApiPhone supportPhonesItem) {
    this.supportPhones.add(supportPhonesItem);
    return this;
  }

   /**
   * List of support phone numbers for the service channel.
   * @return supportPhones
  **/
  @ApiModelProperty(example = "null", value = "List of support phone numbers for the service channel.")
  public List<V4VmOpenApiPhone> getSupportPhones() {
    return supportPhones;
  }

  public void setSupportPhones(List<V4VmOpenApiPhone> supportPhones) {
    this.supportPhones = supportPhones;
  }

  public V4VmOpenApiPrintableFormChannelIn supportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public V4VmOpenApiPrintableFormChannelIn addSupportEmailsItem(VmOpenApiLanguageItem supportEmailsItem) {
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

  public V4VmOpenApiPrintableFormChannelIn publishingStatus(String publishingStatus) {
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
    V4VmOpenApiPrintableFormChannelIn v4VmOpenApiPrintableFormChannelIn = (V4VmOpenApiPrintableFormChannelIn) o;
    return Objects.equals(this.sourceId, v4VmOpenApiPrintableFormChannelIn.sourceId) &&
        Objects.equals(this.organizationId, v4VmOpenApiPrintableFormChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, v4VmOpenApiPrintableFormChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v4VmOpenApiPrintableFormChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.formIdentifier, v4VmOpenApiPrintableFormChannelIn.formIdentifier) &&
        Objects.equals(this.formReceiver, v4VmOpenApiPrintableFormChannelIn.formReceiver) &&
        Objects.equals(this.deliveryAddress, v4VmOpenApiPrintableFormChannelIn.deliveryAddress) &&
        Objects.equals(this.channelUrls, v4VmOpenApiPrintableFormChannelIn.channelUrls) &&
        Objects.equals(this.attachments, v4VmOpenApiPrintableFormChannelIn.attachments) &&
        Objects.equals(this.supportPhones, v4VmOpenApiPrintableFormChannelIn.supportPhones) &&
        Objects.equals(this.supportEmails, v4VmOpenApiPrintableFormChannelIn.supportEmails) &&
        Objects.equals(this.publishingStatus, v4VmOpenApiPrintableFormChannelIn.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, formIdentifier, formReceiver, deliveryAddress, channelUrls, attachments, supportPhones, supportEmails, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiPrintableFormChannelIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    formIdentifier: ").append(toIndentedString(formIdentifier)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
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

