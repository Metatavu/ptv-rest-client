/*
 * PTV Open Api version 10
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v10
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
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiServiceCollectionService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API V7 - View Model of service collection
 */
@ApiModel(description = "OPEN API V7 - View Model of service collection")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class V7VmOpenApiServiceCollection {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("mainResponsibleOrganization")
  private UUID mainResponsibleOrganization = null;

  @JsonProperty("serviceCollectionNames")
  private List<VmOpenApiLanguageItem> serviceCollectionNames = null;

  @JsonProperty("serviceCollectionDescriptions")
  private List<VmOpenApiLanguageItem> serviceCollectionDescriptions = null;

  @JsonProperty("services")
  private List<VmOpenApiServiceCollectionService> services = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("modified")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified = null;

  public V7VmOpenApiServiceCollection id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * PTV service identifier.
   * @return id
  **/
  @ApiModelProperty(value = "PTV service identifier.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public V7VmOpenApiServiceCollection sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * External system identifier for the entity. User needs to be logged in to be able to get/set value.
   * @return sourceId
  **/
  @ApiModelProperty(value = "External system identifier for the entity. User needs to be logged in to be able to get/set value.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public V7VmOpenApiServiceCollection mainResponsibleOrganization(UUID mainResponsibleOrganization) {
    this.mainResponsibleOrganization = mainResponsibleOrganization;
    return this;
  }

   /**
   * Main responsible organization Id
   * @return mainResponsibleOrganization
  **/
  @ApiModelProperty(value = "Main responsible organization Id")
  public UUID getMainResponsibleOrganization() {
    return mainResponsibleOrganization;
  }

  public void setMainResponsibleOrganization(UUID mainResponsibleOrganization) {
    this.mainResponsibleOrganization = mainResponsibleOrganization;
  }

  public V7VmOpenApiServiceCollection serviceCollectionNames(List<VmOpenApiLanguageItem> serviceCollectionNames) {
    this.serviceCollectionNames = serviceCollectionNames;
    return this;
  }

  public V7VmOpenApiServiceCollection addServiceCollectionNamesItem(VmOpenApiLanguageItem serviceCollectionNamesItem) {
    if (this.serviceCollectionNames == null) {
      this.serviceCollectionNames = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.serviceCollectionNames.add(serviceCollectionNamesItem);
    return this;
  }

   /**
   * List of localized service collection names.
   * @return serviceCollectionNames
  **/
  @ApiModelProperty(value = "List of localized service collection names.")
  public List<VmOpenApiLanguageItem> getServiceCollectionNames() {
    return serviceCollectionNames;
  }

  public void setServiceCollectionNames(List<VmOpenApiLanguageItem> serviceCollectionNames) {
    this.serviceCollectionNames = serviceCollectionNames;
  }

  public V7VmOpenApiServiceCollection serviceCollectionDescriptions(List<VmOpenApiLanguageItem> serviceCollectionDescriptions) {
    this.serviceCollectionDescriptions = serviceCollectionDescriptions;
    return this;
  }

  public V7VmOpenApiServiceCollection addServiceCollectionDescriptionsItem(VmOpenApiLanguageItem serviceCollectionDescriptionsItem) {
    if (this.serviceCollectionDescriptions == null) {
      this.serviceCollectionDescriptions = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.serviceCollectionDescriptions.add(serviceCollectionDescriptionsItem);
    return this;
  }

   /**
   * List of localized service collection descriptions.
   * @return serviceCollectionDescriptions
  **/
  @ApiModelProperty(value = "List of localized service collection descriptions.")
  public List<VmOpenApiLanguageItem> getServiceCollectionDescriptions() {
    return serviceCollectionDescriptions;
  }

  public void setServiceCollectionDescriptions(List<VmOpenApiLanguageItem> serviceCollectionDescriptions) {
    this.serviceCollectionDescriptions = serviceCollectionDescriptions;
  }

  public V7VmOpenApiServiceCollection services(List<VmOpenApiServiceCollectionService> services) {
    this.services = services;
    return this;
  }

  public V7VmOpenApiServiceCollection addServicesItem(VmOpenApiServiceCollectionService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<VmOpenApiServiceCollectionService>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * List of service collection services.
   * @return services
  **/
  @ApiModelProperty(value = "List of service collection services.")
  public List<VmOpenApiServiceCollectionService> getServices() {
    return services;
  }

  public void setServices(List<VmOpenApiServiceCollectionService> services) {
    this.services = services;
  }

  public V7VmOpenApiServiceCollection publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status. Possible values are: Draft, Published, Deleted or Modified.
   * @return publishingStatus
  **/
  @ApiModelProperty(required = true, value = "Publishing status. Possible values are: Draft, Published, Deleted or Modified.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V7VmOpenApiServiceCollection modified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Date when item was modified/created (UTC).
   * @return modified
  **/
  @ApiModelProperty(value = "Date when item was modified/created (UTC).")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
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
    V7VmOpenApiServiceCollection v7VmOpenApiServiceCollection = (V7VmOpenApiServiceCollection) o;
    return Objects.equals(this.id, v7VmOpenApiServiceCollection.id) &&
        Objects.equals(this.sourceId, v7VmOpenApiServiceCollection.sourceId) &&
        Objects.equals(this.mainResponsibleOrganization, v7VmOpenApiServiceCollection.mainResponsibleOrganization) &&
        Objects.equals(this.serviceCollectionNames, v7VmOpenApiServiceCollection.serviceCollectionNames) &&
        Objects.equals(this.serviceCollectionDescriptions, v7VmOpenApiServiceCollection.serviceCollectionDescriptions) &&
        Objects.equals(this.services, v7VmOpenApiServiceCollection.services) &&
        Objects.equals(this.publishingStatus, v7VmOpenApiServiceCollection.publishingStatus) &&
        Objects.equals(this.modified, v7VmOpenApiServiceCollection.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceId, mainResponsibleOrganization, serviceCollectionNames, serviceCollectionDescriptions, services, publishingStatus, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V7VmOpenApiServiceCollection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    mainResponsibleOrganization: ").append(toIndentedString(mainResponsibleOrganization)).append("\n");
    sb.append("    serviceCollectionNames: ").append(toIndentedString(serviceCollectionNames)).append("\n");
    sb.append("    serviceCollectionDescriptions: ").append(toIndentedString(serviceCollectionDescriptions)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

