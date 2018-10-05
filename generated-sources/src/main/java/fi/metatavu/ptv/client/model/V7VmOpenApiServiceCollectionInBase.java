/*
 * PTV Open Api version 9
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v9
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V7 - View Model of service collection IN - base
 */
@ApiModel(description = "OPEN API V7 - View Model of service collection IN - base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class V7VmOpenApiServiceCollectionInBase {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("mainResponsibleOrganization")
  private String mainResponsibleOrganization = null;

  @JsonProperty("serviceCollectionNames")
  private List<VmOpenApiLanguageItem> serviceCollectionNames = null;

  @JsonProperty("serviceCollectionDescriptions")
  private List<VmOpenApiLanguageItem> serviceCollectionDescriptions = null;

  @JsonProperty("services")
  private List<String> services = null;

  @JsonProperty("deleteAllServices")
  private Boolean deleteAllServices = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public V7VmOpenApiServiceCollectionInBase sourceId(String sourceId) {
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

  public V7VmOpenApiServiceCollectionInBase mainResponsibleOrganization(String mainResponsibleOrganization) {
    this.mainResponsibleOrganization = mainResponsibleOrganization;
    return this;
  }

   /**
   * Main responsible organization Id
   * @return mainResponsibleOrganization
  **/
  @ApiModelProperty(value = "Main responsible organization Id")
  public String getMainResponsibleOrganization() {
    return mainResponsibleOrganization;
  }

  public void setMainResponsibleOrganization(String mainResponsibleOrganization) {
    this.mainResponsibleOrganization = mainResponsibleOrganization;
  }

  public V7VmOpenApiServiceCollectionInBase serviceCollectionNames(List<VmOpenApiLanguageItem> serviceCollectionNames) {
    this.serviceCollectionNames = serviceCollectionNames;
    return this;
  }

  public V7VmOpenApiServiceCollectionInBase addServiceCollectionNamesItem(VmOpenApiLanguageItem serviceCollectionNamesItem) {
    if (this.serviceCollectionNames == null) {
      this.serviceCollectionNames = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.serviceCollectionNames.add(serviceCollectionNamesItem);
    return this;
  }

   /**
   * List of localized service collection names. (Max.Length: 100).
   * @return serviceCollectionNames
  **/
  @ApiModelProperty(value = "List of localized service collection names. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getServiceCollectionNames() {
    return serviceCollectionNames;
  }

  public void setServiceCollectionNames(List<VmOpenApiLanguageItem> serviceCollectionNames) {
    this.serviceCollectionNames = serviceCollectionNames;
  }

  public V7VmOpenApiServiceCollectionInBase serviceCollectionDescriptions(List<VmOpenApiLanguageItem> serviceCollectionDescriptions) {
    this.serviceCollectionDescriptions = serviceCollectionDescriptions;
    return this;
  }

  public V7VmOpenApiServiceCollectionInBase addServiceCollectionDescriptionsItem(VmOpenApiLanguageItem serviceCollectionDescriptionsItem) {
    if (this.serviceCollectionDescriptions == null) {
      this.serviceCollectionDescriptions = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.serviceCollectionDescriptions.add(serviceCollectionDescriptionsItem);
    return this;
  }

   /**
   * List of localized service collection descriptions. (Max.Length: 500).
   * @return serviceCollectionDescriptions
  **/
  @ApiModelProperty(value = "List of localized service collection descriptions. (Max.Length: 500).")
  public List<VmOpenApiLanguageItem> getServiceCollectionDescriptions() {
    return serviceCollectionDescriptions;
  }

  public void setServiceCollectionDescriptions(List<VmOpenApiLanguageItem> serviceCollectionDescriptions) {
    this.serviceCollectionDescriptions = serviceCollectionDescriptions;
  }

  public V7VmOpenApiServiceCollectionInBase services(List<String> services) {
    this.services = services;
    return this;
  }

  public V7VmOpenApiServiceCollectionInBase addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<String>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * List of service collection services.
   * @return services
  **/
  @ApiModelProperty(value = "List of service collection services.")
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public V7VmOpenApiServiceCollectionInBase deleteAllServices(Boolean deleteAllServices) {
    this.deleteAllServices = deleteAllServices;
    return this;
  }

   /**
   * Set to true to delete all existing services (the services collection for this object should be empty collection when this option is used).
   * @return deleteAllServices
  **/
  @ApiModelProperty(value = "Set to true to delete all existing services (the services collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllServices() {
    return deleteAllServices;
  }

  public void setDeleteAllServices(Boolean deleteAllServices) {
    this.deleteAllServices = deleteAllServices;
  }

  public V7VmOpenApiServiceCollectionInBase publishingStatus(String publishingStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V7VmOpenApiServiceCollectionInBase v7VmOpenApiServiceCollectionInBase = (V7VmOpenApiServiceCollectionInBase) o;
    return Objects.equals(this.sourceId, v7VmOpenApiServiceCollectionInBase.sourceId) &&
        Objects.equals(this.mainResponsibleOrganization, v7VmOpenApiServiceCollectionInBase.mainResponsibleOrganization) &&
        Objects.equals(this.serviceCollectionNames, v7VmOpenApiServiceCollectionInBase.serviceCollectionNames) &&
        Objects.equals(this.serviceCollectionDescriptions, v7VmOpenApiServiceCollectionInBase.serviceCollectionDescriptions) &&
        Objects.equals(this.services, v7VmOpenApiServiceCollectionInBase.services) &&
        Objects.equals(this.deleteAllServices, v7VmOpenApiServiceCollectionInBase.deleteAllServices) &&
        Objects.equals(this.publishingStatus, v7VmOpenApiServiceCollectionInBase.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, mainResponsibleOrganization, serviceCollectionNames, serviceCollectionDescriptions, services, deleteAllServices, publishingStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V7VmOpenApiServiceCollectionInBase {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    mainResponsibleOrganization: ").append(toIndentedString(mainResponsibleOrganization)).append("\n");
    sb.append("    serviceCollectionNames: ").append(toIndentedString(serviceCollectionNames)).append("\n");
    sb.append("    serviceCollectionDescriptions: ").append(toIndentedString(serviceCollectionDescriptions)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    deleteAllServices: ").append(toIndentedString(deleteAllServices)).append("\n");
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

