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
import fi.metatavu.ptv.client.model.V8VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.V9VmOpenApiContactDetailsInBase;
import fi.metatavu.ptv.client.model.VmOpenApiExtraType;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API - View Model of Service service channel - with external source and external types
 */
@ApiModel(description = "OPEN API - View Model of Service service channel - with external source and external types")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class V9VmOpenApiServiceServiceChannelBySourceAsti {
  @JsonProperty("serviceChannelSourceId")
  private String serviceChannelSourceId = null;

  @JsonProperty("description")
  private List<VmOpenApiLocalizedListItem> description = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("extraTypes")
  private List<VmOpenApiExtraType> extraTypes = null;

  @JsonProperty("serviceHours")
  private List<V8VmOpenApiServiceHour> serviceHours = null;

  @JsonProperty("contactDetails")
  private V9VmOpenApiContactDetailsInBase contactDetails = null;

  @JsonProperty("deleteServiceChargeType")
  private Boolean deleteServiceChargeType = null;

  @JsonProperty("deleteAllDescriptions")
  private Boolean deleteAllDescriptions = null;

  @JsonProperty("deleteAllExtraTypes")
  private Boolean deleteAllExtraTypes = null;

  @JsonProperty("deleteAllServiceHours")
  private Boolean deleteAllServiceHours = null;

  public V9VmOpenApiServiceServiceChannelBySourceAsti serviceChannelSourceId(String serviceChannelSourceId) {
    this.serviceChannelSourceId = serviceChannelSourceId;
    return this;
  }

   /**
   * The external source id for service channel.
   * @return serviceChannelSourceId
  **/
  @ApiModelProperty(required = true, value = "The external source id for service channel.")
  public String getServiceChannelSourceId() {
    return serviceChannelSourceId;
  }

  public void setServiceChannelSourceId(String serviceChannelSourceId) {
    this.serviceChannelSourceId = serviceChannelSourceId;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti description(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
    return this;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti addDescriptionItem(VmOpenApiLocalizedListItem descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * List of localized service channel relationship descriptions. Possible type values are: Description, ChargeTypeAdditionalInfo.
   * @return description
  **/
  @ApiModelProperty(value = "List of localized service channel relationship descriptions. Possible type values are: Description, ChargeTypeAdditionalInfo.")
  public List<VmOpenApiLocalizedListItem> getDescription() {
    return description;
  }

  public void setDescription(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Chargeable, FreeOfCharge or Other
   * @return serviceChargeType
  **/
  @ApiModelProperty(value = "Service charge type. Possible values are: Chargeable, FreeOfCharge or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti extraTypes(List<VmOpenApiExtraType> extraTypes) {
    this.extraTypes = extraTypes;
    return this;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti addExtraTypesItem(VmOpenApiExtraType extraTypesItem) {
    if (this.extraTypes == null) {
      this.extraTypes = new ArrayList<VmOpenApiExtraType>();
    }
    this.extraTypes.add(extraTypesItem);
    return this;
  }

   /**
   * The extra types related to service and service channel connection.
   * @return extraTypes
  **/
  @ApiModelProperty(value = "The extra types related to service and service channel connection.")
  public List<VmOpenApiExtraType> getExtraTypes() {
    return extraTypes;
  }

  public void setExtraTypes(List<VmOpenApiExtraType> extraTypes) {
    this.extraTypes = extraTypes;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti serviceHours(List<V8VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti addServiceHoursItem(V8VmOpenApiServiceHour serviceHoursItem) {
    if (this.serviceHours == null) {
      this.serviceHours = new ArrayList<V8VmOpenApiServiceHour>();
    }
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * List of connection related service hours.
   * @return serviceHours
  **/
  @ApiModelProperty(value = "List of connection related service hours.")
  public List<V8VmOpenApiServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<V8VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti contactDetails(V9VmOpenApiContactDetailsInBase contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * List of connection related contact details.
   * @return contactDetails
  **/
  @ApiModelProperty(value = "List of connection related contact details.")
  public V9VmOpenApiContactDetailsInBase getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(V9VmOpenApiContactDetailsInBase contactDetails) {
    this.contactDetails = contactDetails;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti deleteServiceChargeType(Boolean deleteServiceChargeType) {
    this.deleteServiceChargeType = deleteServiceChargeType;
    return this;
  }

   /**
   * Indicates if value for property ServiceChargeType should be deleted.
   * @return deleteServiceChargeType
  **/
  @ApiModelProperty(value = "Indicates if value for property ServiceChargeType should be deleted.")
  public Boolean getDeleteServiceChargeType() {
    return deleteServiceChargeType;
  }

  public void setDeleteServiceChargeType(Boolean deleteServiceChargeType) {
    this.deleteServiceChargeType = deleteServiceChargeType;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti deleteAllDescriptions(Boolean deleteAllDescriptions) {
    this.deleteAllDescriptions = deleteAllDescriptions;
    return this;
  }

   /**
   * Indicates if all descriptions should be deleted.
   * @return deleteAllDescriptions
  **/
  @ApiModelProperty(value = "Indicates if all descriptions should be deleted.")
  public Boolean getDeleteAllDescriptions() {
    return deleteAllDescriptions;
  }

  public void setDeleteAllDescriptions(Boolean deleteAllDescriptions) {
    this.deleteAllDescriptions = deleteAllDescriptions;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti deleteAllExtraTypes(Boolean deleteAllExtraTypes) {
    this.deleteAllExtraTypes = deleteAllExtraTypes;
    return this;
  }

   /**
   * Indicates if all extra types should be deleted.
   * @return deleteAllExtraTypes
  **/
  @ApiModelProperty(value = "Indicates if all extra types should be deleted.")
  public Boolean getDeleteAllExtraTypes() {
    return deleteAllExtraTypes;
  }

  public void setDeleteAllExtraTypes(Boolean deleteAllExtraTypes) {
    this.deleteAllExtraTypes = deleteAllExtraTypes;
  }

  public V9VmOpenApiServiceServiceChannelBySourceAsti deleteAllServiceHours(Boolean deleteAllServiceHours) {
    this.deleteAllServiceHours = deleteAllServiceHours;
    return this;
  }

   /**
   * Gets or sets a value indicating whether all service hours should be deleted.
   * @return deleteAllServiceHours
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether all service hours should be deleted.")
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
    V9VmOpenApiServiceServiceChannelBySourceAsti v9VmOpenApiServiceServiceChannelBySourceAsti = (V9VmOpenApiServiceServiceChannelBySourceAsti) o;
    return Objects.equals(this.serviceChannelSourceId, v9VmOpenApiServiceServiceChannelBySourceAsti.serviceChannelSourceId) &&
        Objects.equals(this.description, v9VmOpenApiServiceServiceChannelBySourceAsti.description) &&
        Objects.equals(this.serviceChargeType, v9VmOpenApiServiceServiceChannelBySourceAsti.serviceChargeType) &&
        Objects.equals(this.extraTypes, v9VmOpenApiServiceServiceChannelBySourceAsti.extraTypes) &&
        Objects.equals(this.serviceHours, v9VmOpenApiServiceServiceChannelBySourceAsti.serviceHours) &&
        Objects.equals(this.contactDetails, v9VmOpenApiServiceServiceChannelBySourceAsti.contactDetails) &&
        Objects.equals(this.deleteServiceChargeType, v9VmOpenApiServiceServiceChannelBySourceAsti.deleteServiceChargeType) &&
        Objects.equals(this.deleteAllDescriptions, v9VmOpenApiServiceServiceChannelBySourceAsti.deleteAllDescriptions) &&
        Objects.equals(this.deleteAllExtraTypes, v9VmOpenApiServiceServiceChannelBySourceAsti.deleteAllExtraTypes) &&
        Objects.equals(this.deleteAllServiceHours, v9VmOpenApiServiceServiceChannelBySourceAsti.deleteAllServiceHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceChannelSourceId, description, serviceChargeType, extraTypes, serviceHours, contactDetails, deleteServiceChargeType, deleteAllDescriptions, deleteAllExtraTypes, deleteAllServiceHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiServiceServiceChannelBySourceAsti {\n");
    
    sb.append("    serviceChannelSourceId: ").append(toIndentedString(serviceChannelSourceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    extraTypes: ").append(toIndentedString(extraTypes)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    deleteServiceChargeType: ").append(toIndentedString(deleteServiceChargeType)).append("\n");
    sb.append("    deleteAllDescriptions: ").append(toIndentedString(deleteAllDescriptions)).append("\n");
    sb.append("    deleteAllExtraTypes: ").append(toIndentedString(deleteAllExtraTypes)).append("\n");
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

