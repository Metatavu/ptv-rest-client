/*
 * PTV Open Api version 8
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v8
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
import fi.metatavu.ptv.client.model.VmOpenApiItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V6 - View Model of service channel
 */
@ApiModel(description = "OPEN API V6 - View Model of service channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T13:25:17.639+03:00")
public class V6VmOpenApiServiceServiceChannel {
  @JsonProperty("serviceChannel")
  private VmOpenApiItem serviceChannel = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("description")
  private List<VmOpenApiLocalizedListItem> description = null;

  @JsonProperty("digitalAuthorizations")
  private List<V4VmOpenApiFintoItem> digitalAuthorizations = null;

  public V6VmOpenApiServiceServiceChannel serviceChannel(VmOpenApiItem serviceChannel) {
    this.serviceChannel = serviceChannel;
    return this;
  }

   /**
   * Service channel identifier and name.
   * @return serviceChannel
  **/
  @ApiModelProperty(value = "Service channel identifier and name.")
  public VmOpenApiItem getServiceChannel() {
    return serviceChannel;
  }

  public void setServiceChannel(VmOpenApiItem serviceChannel) {
    this.serviceChannel = serviceChannel;
  }

  public V6VmOpenApiServiceServiceChannel serviceChargeType(String serviceChargeType) {
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

  public V6VmOpenApiServiceServiceChannel description(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
    return this;
  }

  public V6VmOpenApiServiceServiceChannel addDescriptionItem(VmOpenApiLocalizedListItem descriptionItem) {
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

  public V6VmOpenApiServiceServiceChannel digitalAuthorizations(List<V4VmOpenApiFintoItem> digitalAuthorizations) {
    this.digitalAuthorizations = digitalAuthorizations;
    return this;
  }

  public V6VmOpenApiServiceServiceChannel addDigitalAuthorizationsItem(V4VmOpenApiFintoItem digitalAuthorizationsItem) {
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
    V6VmOpenApiServiceServiceChannel v6VmOpenApiServiceServiceChannel = (V6VmOpenApiServiceServiceChannel) o;
    return Objects.equals(this.serviceChannel, v6VmOpenApiServiceServiceChannel.serviceChannel) &&
        Objects.equals(this.serviceChargeType, v6VmOpenApiServiceServiceChannel.serviceChargeType) &&
        Objects.equals(this.description, v6VmOpenApiServiceServiceChannel.description) &&
        Objects.equals(this.digitalAuthorizations, v6VmOpenApiServiceServiceChannel.digitalAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceChannel, serviceChargeType, description, digitalAuthorizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiServiceServiceChannel {\n");
    
    sb.append("    serviceChannel: ").append(toIndentedString(serviceChannel)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

