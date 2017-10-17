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
import fi.metatavu.ptv.client.model.VmOpenApiAreaIn;
import fi.metatavu.ptv.client.model.VmOpenApiAttachment;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V6 - View Model of electronic channel for IN api
 */
@ApiModel(description = "OPEN API V6 - View Model of electronic channel for IN api")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T09:06:52.024+03:00")
public class V6VmOpenApiElectronicChannelIn {
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

  @JsonProperty("signatureQuantity")
  private String signatureQuantity = null;

  @JsonProperty("requiresSignature")
  private Boolean requiresSignature = null;

  @JsonProperty("requiresAuthentication")
  private Boolean requiresAuthentication = null;

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachment> attachments = null;

  @JsonProperty("supportPhones")
  private List<V4VmOpenApiPhone> supportPhones = null;

  @JsonProperty("supportEmails")
  private List<VmOpenApiLanguageItem> supportEmails = null;

  @JsonProperty("serviceHours")
  private List<V4VmOpenApiServiceHour> serviceHours = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("isVisibleForAll")
  private Boolean isVisibleForAll = null;

  @JsonProperty("services")
  private List<String> services = null;

  public V6VmOpenApiElectronicChannelIn sourceId(String sourceId) {
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

  public V6VmOpenApiElectronicChannelIn organizationId(String organizationId) {
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

  public V6VmOpenApiElectronicChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
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

  public V6VmOpenApiElectronicChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
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

  public V6VmOpenApiElectronicChannelIn areaType(String areaType) {
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

  public V6VmOpenApiElectronicChannelIn areas(List<VmOpenApiAreaIn> areas) {
    this.areas = areas;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addAreasItem(VmOpenApiAreaIn areasItem) {
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

  public V6VmOpenApiElectronicChannelIn signatureQuantity(String signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

   /**
   * How many signatures are required (number). Required if RequiresSignature is true.
   * @return signatureQuantity
  **/
  @ApiModelProperty(value = "How many signatures are required (number). Required if RequiresSignature is true.")
  public String getSignatureQuantity() {
    return signatureQuantity;
  }

  public void setSignatureQuantity(String signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  public V6VmOpenApiElectronicChannelIn requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

   /**
   * Signature required.
   * @return requiresSignature
  **/
  @ApiModelProperty(value = "Signature required.")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }

  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  public V6VmOpenApiElectronicChannelIn requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

   /**
   * Does the service require authentication.
   * @return requiresAuthentication
  **/
  @ApiModelProperty(required = true, value = "Does the service require authentication.")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }

  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  public V6VmOpenApiElectronicChannelIn urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * List of localized urls. (Max.Length: 500).
   * @return urls
  **/
  @ApiModelProperty(required = true, value = "List of localized urls. (Max.Length: 500).")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public V6VmOpenApiElectronicChannelIn attachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addAttachmentsItem(VmOpenApiAttachment attachmentsItem) {
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

  public V6VmOpenApiElectronicChannelIn supportPhones(List<V4VmOpenApiPhone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addSupportPhonesItem(V4VmOpenApiPhone supportPhonesItem) {
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

  public V6VmOpenApiElectronicChannelIn supportEmails(List<VmOpenApiLanguageItem> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addSupportEmailsItem(VmOpenApiLanguageItem supportEmailsItem) {
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

  public V6VmOpenApiElectronicChannelIn serviceHours(List<V4VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addServiceHoursItem(V4VmOpenApiServiceHour serviceHoursItem) {
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

  public V6VmOpenApiElectronicChannelIn publishingStatus(String publishingStatus) {
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

  public V6VmOpenApiElectronicChannelIn isVisibleForAll(Boolean isVisibleForAll) {
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

  public V6VmOpenApiElectronicChannelIn services(List<String> services) {
    this.services = services;
    return this;
  }

  public V6VmOpenApiElectronicChannelIn addServicesItem(String servicesItem) {
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
    V6VmOpenApiElectronicChannelIn v6VmOpenApiElectronicChannelIn = (V6VmOpenApiElectronicChannelIn) o;
    return Objects.equals(this.sourceId, v6VmOpenApiElectronicChannelIn.sourceId) &&
        Objects.equals(this.organizationId, v6VmOpenApiElectronicChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, v6VmOpenApiElectronicChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, v6VmOpenApiElectronicChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.areaType, v6VmOpenApiElectronicChannelIn.areaType) &&
        Objects.equals(this.areas, v6VmOpenApiElectronicChannelIn.areas) &&
        Objects.equals(this.signatureQuantity, v6VmOpenApiElectronicChannelIn.signatureQuantity) &&
        Objects.equals(this.requiresSignature, v6VmOpenApiElectronicChannelIn.requiresSignature) &&
        Objects.equals(this.requiresAuthentication, v6VmOpenApiElectronicChannelIn.requiresAuthentication) &&
        Objects.equals(this.urls, v6VmOpenApiElectronicChannelIn.urls) &&
        Objects.equals(this.attachments, v6VmOpenApiElectronicChannelIn.attachments) &&
        Objects.equals(this.supportPhones, v6VmOpenApiElectronicChannelIn.supportPhones) &&
        Objects.equals(this.supportEmails, v6VmOpenApiElectronicChannelIn.supportEmails) &&
        Objects.equals(this.serviceHours, v6VmOpenApiElectronicChannelIn.serviceHours) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiElectronicChannelIn.publishingStatus) &&
        Objects.equals(this.isVisibleForAll, v6VmOpenApiElectronicChannelIn.isVisibleForAll) &&
        Objects.equals(this.services, v6VmOpenApiElectronicChannelIn.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, areaType, areas, signatureQuantity, requiresSignature, requiresAuthentication, urls, attachments, supportPhones, supportEmails, serviceHours, publishingStatus, isVisibleForAll, services);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiElectronicChannelIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    signatureQuantity: ").append(toIndentedString(signatureQuantity)).append("\n");
    sb.append("    requiresSignature: ").append(toIndentedString(requiresSignature)).append("\n");
    sb.append("    requiresAuthentication: ").append(toIndentedString(requiresAuthentication)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
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

