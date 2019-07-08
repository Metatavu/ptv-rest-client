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
import fi.metatavu.ptv.client.model.V4VmOpenApiFintoItem;
import fi.metatavu.ptv.client.model.V8VmOpenApiServiceHour;
import fi.metatavu.ptv.client.model.V9VmOpenApiContactDetails;
import fi.metatavu.ptv.client.model.V9VmOpenApiExtraType;
import fi.metatavu.ptv.client.model.VmOpenApiItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API - View Model of Service channel service V9
 */
@ApiModel(description = "OPEN API - View Model of Service channel service V9")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class V9VmOpenApiServiceChannelService {
  @JsonProperty("service")
  private VmOpenApiItem service = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("description")
  private List<VmOpenApiLocalizedListItem> description = null;

  @JsonProperty("extraTypes")
  private List<V9VmOpenApiExtraType> extraTypes = null;

  @JsonProperty("serviceHours")
  private List<V8VmOpenApiServiceHour> serviceHours = null;

  @JsonProperty("contactDetails")
  private V9VmOpenApiContactDetails contactDetails = null;

  @JsonProperty("digitalAuthorizations")
  private List<V4VmOpenApiFintoItem> digitalAuthorizations = null;

  public V9VmOpenApiServiceChannelService service(VmOpenApiItem service) {
    this.service = service;
    return this;
  }

   /**
   * Service channel identifier and name.
   * @return service
  **/
  @ApiModelProperty(value = "Service channel identifier and name.")
  public VmOpenApiItem getService() {
    return service;
  }

  public void setService(VmOpenApiItem service) {
    this.service = service;
  }

  public V9VmOpenApiServiceChannelService serviceChargeType(String serviceChargeType) {
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

  public V9VmOpenApiServiceChannelService description(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
    return this;
  }

  public V9VmOpenApiServiceChannelService addDescriptionItem(VmOpenApiLocalizedListItem descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * List of localized service channel relationship descriptions.
   * @return description
  **/
  @ApiModelProperty(value = "List of localized service channel relationship descriptions.")
  public List<VmOpenApiLocalizedListItem> getDescription() {
    return description;
  }

  public void setDescription(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
  }

  public V9VmOpenApiServiceChannelService extraTypes(List<V9VmOpenApiExtraType> extraTypes) {
    this.extraTypes = extraTypes;
    return this;
  }

  public V9VmOpenApiServiceChannelService addExtraTypesItem(V9VmOpenApiExtraType extraTypesItem) {
    if (this.extraTypes == null) {
      this.extraTypes = new ArrayList<V9VmOpenApiExtraType>();
    }
    this.extraTypes.add(extraTypesItem);
    return this;
  }

   /**
   * The extra types related to service and service channel connection.
   * @return extraTypes
  **/
  @ApiModelProperty(value = "The extra types related to service and service channel connection.")
  public List<V9VmOpenApiExtraType> getExtraTypes() {
    return extraTypes;
  }

  public void setExtraTypes(List<V9VmOpenApiExtraType> extraTypes) {
    this.extraTypes = extraTypes;
  }

  public V9VmOpenApiServiceChannelService serviceHours(List<V8VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public V9VmOpenApiServiceChannelService addServiceHoursItem(V8VmOpenApiServiceHour serviceHoursItem) {
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

  public V9VmOpenApiServiceChannelService contactDetails(V9VmOpenApiContactDetails contactDetails) {
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Contact details for connection.
   * @return contactDetails
  **/
  @ApiModelProperty(value = "Contact details for connection.")
  public V9VmOpenApiContactDetails getContactDetails() {
    return contactDetails;
  }

  public void setContactDetails(V9VmOpenApiContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  public V9VmOpenApiServiceChannelService digitalAuthorizations(List<V4VmOpenApiFintoItem> digitalAuthorizations) {
    this.digitalAuthorizations = digitalAuthorizations;
    return this;
  }

  public V9VmOpenApiServiceChannelService addDigitalAuthorizationsItem(V4VmOpenApiFintoItem digitalAuthorizationsItem) {
    if (this.digitalAuthorizations == null) {
      this.digitalAuthorizations = new ArrayList<V4VmOpenApiFintoItem>();
    }
    this.digitalAuthorizations.add(digitalAuthorizationsItem);
    return this;
  }

   /**
   * List of digital authorizations related to the service.
   * @return digitalAuthorizations
  **/
  @ApiModelProperty(value = "List of digital authorizations related to the service.")
  public List<V4VmOpenApiFintoItem> getDigitalAuthorizations() {
    return digitalAuthorizations;
  }

  public void setDigitalAuthorizations(List<V4VmOpenApiFintoItem> digitalAuthorizations) {
    this.digitalAuthorizations = digitalAuthorizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V9VmOpenApiServiceChannelService v9VmOpenApiServiceChannelService = (V9VmOpenApiServiceChannelService) o;
    return Objects.equals(this.service, v9VmOpenApiServiceChannelService.service) &&
        Objects.equals(this.serviceChargeType, v9VmOpenApiServiceChannelService.serviceChargeType) &&
        Objects.equals(this.description, v9VmOpenApiServiceChannelService.description) &&
        Objects.equals(this.extraTypes, v9VmOpenApiServiceChannelService.extraTypes) &&
        Objects.equals(this.serviceHours, v9VmOpenApiServiceChannelService.serviceHours) &&
        Objects.equals(this.contactDetails, v9VmOpenApiServiceChannelService.contactDetails) &&
        Objects.equals(this.digitalAuthorizations, v9VmOpenApiServiceChannelService.digitalAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, serviceChargeType, description, extraTypes, serviceHours, contactDetails, digitalAuthorizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiServiceChannelService {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extraTypes: ").append(toIndentedString(extraTypes)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    digitalAuthorizations: ").append(toIndentedString(digitalAuthorizations)).append("\n");
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

