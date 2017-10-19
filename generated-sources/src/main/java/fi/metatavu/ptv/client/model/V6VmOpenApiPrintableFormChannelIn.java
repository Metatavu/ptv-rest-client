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
import fi.metatavu.ptv.client.model.V5VmOpenApiAddressIn;
import fi.metatavu.ptv.client.model.VmOpenApiAreaIn;
import fi.metatavu.ptv.client.model.VmOpenApiAttachment;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V6 - View Model of printable from channel for IN api
 */
@ApiModel(description = "OPEN API V6 - View Model of printable from channel for IN api")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-19T16:10:06.613+03:00")
public class V6VmOpenApiPrintableFormChannelIn {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("areaType")
  private String areaType = null;

  @JsonProperty("areas")
  private List<VmOpenApiAreaIn> areas = null;

  @JsonProperty("formIdentifier")
  private List<VmOpenApiLanguageItem> formIdentifier = null;

  @JsonProperty("formReceiver")
  private List<VmOpenApiLanguageItem> formReceiver = null;

  @JsonProperty("deliveryAddress")
  private V5VmOpenApiAddressIn deliveryAddress = null;

  @JsonProperty("channelUrls")
  private List<VmOpenApiLocalizedListItem> channelUrls = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachment> attachments = null;

  @JsonProperty("supportPhones")
  private List<V4VmOpenApiPhone> supportPhones = null;

  @JsonProperty("supportEmails")
  private List<VmOpenApiLanguageItem> supportEmails = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("isVisibleForAll")
  private Boolean isVisibleForAll = null;

  @JsonProperty("services")
  private List<String> services = null;

  public V6VmOpenApiPrintableFormChannelIn sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * External system identifier for this service channel.
   * @return sourceId
  **/
  @ApiModelProperty(value = "External system identifier for this service channel.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public V6VmOpenApiPrintableFormChannelIn organizationId(String organizationId) {
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

  public V6VmOpenApiPrintableFormChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * List of localized service channel names. (Max.Length: 100).
   * @return serviceChannelNames
  **/
  @ApiModelProperty(required = true, value = "List of localized service channel names. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public V6VmOpenApiPrintableFormChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * List of localized service channel descriptions. (Max.Length: 150 ShortDescription). (Max.Length: 2500 Description).
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(required = true, value = "List of localized service channel descriptions. (Max.Length: 150 ShortDescription). (Max.Length: 2500 Description).")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public V6VmOpenApiPrintableFormChannelIn areaType(String areaType) {
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

  public V6VmOpenApiPrintableFormChannelIn areas(List<VmOpenApiAreaIn> areas) {
    this.areas = areas;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addAreasItem(VmOpenApiAreaIn areasItem) {
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

  public V6VmOpenApiPrintableFormChannelIn formIdentifier(List<VmOpenApiLanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addFormIdentifierItem(VmOpenApiLanguageItem formIdentifierItem) {
    if (this.formIdentifier == null) {
      this.formIdentifier = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.formIdentifier.add(formIdentifierItem);
    return this;
  }

   /**
   * List of localized form identifiers. One per language. (Max.Length: 100).
   * @return formIdentifier
  **/
  @ApiModelProperty(value = "List of localized form identifiers. One per language. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getFormIdentifier() {
    return formIdentifier;
  }

  public void setFormIdentifier(List<VmOpenApiLanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  public V6VmOpenApiPrintableFormChannelIn formReceiver(List<VmOpenApiLanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addFormReceiverItem(VmOpenApiLanguageItem formReceiverItem) {
    if (this.formReceiver == null) {
      this.formReceiver = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.formReceiver.add(formReceiverItem);
    return this;
  }

   /**
   * List of localized form receivers. One per language. (Max.Length: 100).
   * @return formReceiver
  **/
  @ApiModelProperty(value = "List of localized form receivers. One per language. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getFormReceiver() {
    return formReceiver;
  }

  public void setFormReceiver(List<VmOpenApiLanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
  }

  public V6VmOpenApiPrintableFormChannelIn deliveryAddress(V5VmOpenApiAddressIn deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Form delivery address.
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "Form delivery address.")
  public V5VmOpenApiAddressIn getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(V5VmOpenApiAddressIn deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public V6VmOpenApiPrintableFormChannelIn channelUrls(List<VmOpenApiLocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addChannelUrlsItem(VmOpenApiLocalizedListItem channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * List of localized urls. (Max.Length: 500).
   * @return channelUrls
  **/
  @ApiModelProperty(required = true, value = "List of localized urls. (Max.Length: 500).")
  public List<VmOpenApiLocalizedListItem> getChannelUrls() {
    return channelUrls;
  }

  public void setChannelUrls(List<VmOpenApiLocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
  }

  public V6VmOpenApiPrintableFormChannelIn attachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addAttachmentsItem(VmOpenApiAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<VmOpenApiAttachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of attachments.
   * @return attachments
  **/
  @ApiModelProperty(value = "List of attachments.")
  public List<VmOpenApiAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
  }

  public V6VmOpenApiPrintableFormChannelIn supportPhones(List<V4VmOpenApiPhone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addSupportPhonesItem(V4VmOpenApiPhone supportPhonesItem) {
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

  public V6VmOpenApiPrintableFormChannelIn supportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addSupportEmailsItem(VmOpenApiLanguageItem supportEmailsItem) {
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

  public V6VmOpenApiPrintableFormChannelIn publishingStatus(String publishingStatus) {
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

  public V6VmOpenApiPrintableFormChannelIn isVisibleForAll(Boolean isVisibleForAll) {
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

  public V6VmOpenApiPrintableFormChannelIn services(List<String> services) {
    this.services = services;
    return this;
  }

  public V6VmOpenApiPrintableFormChannelIn addServicesItem(String servicesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V6VmOpenApiPrintableFormChannelIn v6VmOpenApiPrintableFormChannelIn = (V6VmOpenApiPrintableFormChannelIn) o;
    return Objects.equals(this.sourceId, v6VmOpenApiPrintableFormChannelIn.sourceId) &&
        Objects.equals(this.organizationId, v6VmOpenApiPrintableFormChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, v6VmOpenApiPrintableFormChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v6VmOpenApiPrintableFormChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.areaType, v6VmOpenApiPrintableFormChannelIn.areaType) &&
        Objects.equals(this.areas, v6VmOpenApiPrintableFormChannelIn.areas) &&
        Objects.equals(this.formIdentifier, v6VmOpenApiPrintableFormChannelIn.formIdentifier) &&
        Objects.equals(this.formReceiver, v6VmOpenApiPrintableFormChannelIn.formReceiver) &&
        Objects.equals(this.deliveryAddress, v6VmOpenApiPrintableFormChannelIn.deliveryAddress) &&
        Objects.equals(this.channelUrls, v6VmOpenApiPrintableFormChannelIn.channelUrls) &&
        Objects.equals(this.attachments, v6VmOpenApiPrintableFormChannelIn.attachments) &&
        Objects.equals(this.supportPhones, v6VmOpenApiPrintableFormChannelIn.supportPhones) &&
        Objects.equals(this.supportEmails, v6VmOpenApiPrintableFormChannelIn.supportEmails) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiPrintableFormChannelIn.publishingStatus) &&
        Objects.equals(this.isVisibleForAll, v6VmOpenApiPrintableFormChannelIn.isVisibleForAll) &&
        Objects.equals(this.services, v6VmOpenApiPrintableFormChannelIn.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, areaType, areas, formIdentifier, formReceiver, deliveryAddress, channelUrls, attachments, supportPhones, supportEmails, publishingStatus, isVisibleForAll, services);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiPrintableFormChannelIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    formIdentifier: ").append(toIndentedString(formIdentifier)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    isVisibleForAll: ").append(toIndentedString(isVisibleForAll)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

