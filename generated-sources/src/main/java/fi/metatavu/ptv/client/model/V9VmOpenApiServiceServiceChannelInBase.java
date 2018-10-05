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
import fi.metatavu.ptv.client.model.V8VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.V9VmOpenApiContactDetailsInBase;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V9 - View Model of service service channel (PUT).
 */
@ApiModel(description = "OPEN API V9 - View Model of service service channel (PUT).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:38:50.296+03:00")
public class V9VmOpenApiServiceServiceChannelInBase {
  @JsonProperty("serviceChannelId")
  private String serviceChannelId = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("description")
  private List<VmOpenApiLocalizedListItem> description = null;

  @JsonProperty("serviceHours")
  private List<V8VmOpenApiServiceHour> serviceHours = null;

  @JsonProperty("contactDetails")
  private V9VmOpenApiContactDetailsInBase contactDetails = null;

  @JsonProperty("deleteServiceChargeType")
  private Boolean deleteServiceChargeType = null;

  @JsonProperty("deleteAllDescriptions")
  private Boolean deleteAllDescriptions = null;

  @JsonProperty("deleteAllServiceHours")
  private Boolean deleteAllServiceHours = null;

  public V9VmOpenApiServiceServiceChannelInBase serviceChannelId(String serviceChannelId) {
    this.serviceChannelId = serviceChannelId;
    return this;
  }

   /**
   * PTV service channel identifier.
   * @return serviceChannelId
  **/
  @ApiModelProperty(required = true, value = "PTV service channel identifier.")
  public String getServiceChannelId() {
    return serviceChannelId;
  }

  public void setServiceChannelId(String serviceChannelId) {
    this.serviceChannelId = serviceChannelId;
  }

  public V9VmOpenApiServiceServiceChannelInBase serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Chargeable, FreeOfCharge or Other.  In version 7 and older: Charged, Free or Other
   * @return serviceChargeType
  **/
  @ApiModelProperty(value = "Service charge type. Possible values are: Chargeable, FreeOfCharge or Other.  In version 7 and older: Charged, Free or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public V9VmOpenApiServiceServiceChannelInBase description(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
    return this;
  }

  public V9VmOpenApiServiceServiceChannelInBase addDescriptionItem(VmOpenApiLocalizedListItem descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * List of localized service channel relationship descriptions. (Max.Length: 500 Description). (Max.Length: 500 ChargeTypeAdditionalInfo).
   * @return description
  **/
  @ApiModelProperty(value = "List of localized service channel relationship descriptions. (Max.Length: 500 Description). (Max.Length: 500 ChargeTypeAdditionalInfo).")
  public List<VmOpenApiLocalizedListItem> getDescription() {
    return description;
  }

  public void setDescription(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
  }

  public V9VmOpenApiServiceServiceChannelInBase serviceHours(List<V8VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V9VmOpenApiServiceServiceChannelInBase addServiceHoursItem(V8VmOpenApiServiceHour serviceHoursItem) {
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

  public V9VmOpenApiServiceServiceChannelInBase contactDetails(V9VmOpenApiContactDetailsInBase contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * List of connection related service hours.
   * @return contactDetails
  **/
  @ApiModelProperty(value = "List of connection related service hours.")
  public V9VmOpenApiContactDetailsInBase getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(V9VmOpenApiContactDetailsInBase contactDetails) {
    this.contactDetails = contactDetails;
  }

  public V9VmOpenApiServiceServiceChannelInBase deleteServiceChargeType(Boolean deleteServiceChargeType) {
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

  public V9VmOpenApiServiceServiceChannelInBase deleteAllDescriptions(Boolean deleteAllDescriptions) {
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

  public V9VmOpenApiServiceServiceChannelInBase deleteAllServiceHours(Boolean deleteAllServiceHours) {
    this.deleteAllServiceHours = deleteAllServiceHours;
    return this;
  }

   /**
   * Gets or sets a value indicating whether all service hours should be delted.
   * @return deleteAllServiceHours
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether all service hours should be delted.")
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
    V9VmOpenApiServiceServiceChannelInBase v9VmOpenApiServiceServiceChannelInBase = (V9VmOpenApiServiceServiceChannelInBase) o;
    return Objects.equals(this.serviceChannelId, v9VmOpenApiServiceServiceChannelInBase.serviceChannelId) &&
        Objects.equals(this.serviceChargeType, v9VmOpenApiServiceServiceChannelInBase.serviceChargeType) &&
        Objects.equals(this.description, v9VmOpenApiServiceServiceChannelInBase.description) &&
        Objects.equals(this.serviceHours, v9VmOpenApiServiceServiceChannelInBase.serviceHours) &&
        Objects.equals(this.contactDetails, v9VmOpenApiServiceServiceChannelInBase.contactDetails) &&
        Objects.equals(this.deleteServiceChargeType, v9VmOpenApiServiceServiceChannelInBase.deleteServiceChargeType) &&
        Objects.equals(this.deleteAllDescriptions, v9VmOpenApiServiceServiceChannelInBase.deleteAllDescriptions) &&
        Objects.equals(this.deleteAllServiceHours, v9VmOpenApiServiceServiceChannelInBase.deleteAllServiceHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceChannelId, serviceChargeType, description, serviceHours, contactDetails, deleteServiceChargeType, deleteAllDescriptions, deleteAllServiceHours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiServiceServiceChannelInBase {\n");
    
    sb.append("    serviceChannelId: ").append(toIndentedString(serviceChannelId)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    deleteServiceChargeType: ").append(toIndentedString(deleteServiceChargeType)).append("\n");
    sb.append("    deleteAllDescriptions: ").append(toIndentedString(deleteAllDescriptions)).append("\n");
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

