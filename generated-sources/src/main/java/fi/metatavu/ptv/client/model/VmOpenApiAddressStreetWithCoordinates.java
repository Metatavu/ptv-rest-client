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
import fi.metatavu.ptv.client.model.VmOpenApiMunicipality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V7 - View Model of address with type
 */
@ApiModel(description = "OPEN API V7 - View Model of address with type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class VmOpenApiAddressStreetWithCoordinates {
  @JsonProperty("street")
  private List<VmOpenApiLanguageItem> street = null;

  @JsonProperty("streetNumber")
  private String streetNumber = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("postOffice")
  private List<VmOpenApiLanguageItem> postOffice = null;

  @JsonProperty("municipality")
  private VmOpenApiMunicipality municipality = null;

  @JsonProperty("additionalInformation")
  private List<VmOpenApiLanguageItem> additionalInformation = null;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("coordinateState")
  private String coordinateState = null;

  public VmOpenApiAddressStreetWithCoordinates street(List<VmOpenApiLanguageItem> street) {
    this.street = street;
    return this;
  }

  public VmOpenApiAddressStreetWithCoordinates addStreetItem(VmOpenApiLanguageItem streetItem) {
    if (this.street == null) {
      this.street = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.street.add(streetItem);
    return this;
  }

   /**
   * List of localized street addresses. (Max.Length: 100).
   * @return street
  **/
  @ApiModelProperty(value = "List of localized street addresses. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getStreet() {
    return street;
  }

  public void setStreet(List<VmOpenApiLanguageItem> street) {
    this.street = street;
  }

  public VmOpenApiAddressStreetWithCoordinates streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Street number for street address. (Max.Length: 30).
   * @return streetNumber
  **/
  @ApiModelProperty(value = "Street number for street address. (Max.Length: 30).")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public VmOpenApiAddressStreetWithCoordinates postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code, for example 00100.
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "Postal code, for example 00100.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public VmOpenApiAddressStreetWithCoordinates postOffice(List<VmOpenApiLanguageItem> postOffice) {
    this.postOffice = postOffice;
    return this;
  }

  public VmOpenApiAddressStreetWithCoordinates addPostOfficeItem(VmOpenApiLanguageItem postOfficeItem) {
    if (this.postOffice == null) {
      this.postOffice = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.postOffice.add(postOfficeItem);
    return this;
  }

   /**
   * List of localized Post offices, for example Helsinki, Helsingfors.
   * @return postOffice
  **/
  @ApiModelProperty(value = "List of localized Post offices, for example Helsinki, Helsingfors.")
  public List<VmOpenApiLanguageItem> getPostOffice() {
    return postOffice;
  }

  public void setPostOffice(List<VmOpenApiLanguageItem> postOffice) {
    this.postOffice = postOffice;
  }

  public VmOpenApiAddressStreetWithCoordinates municipality(VmOpenApiMunicipality municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Municipality code (e.g. 091).
   * @return municipality
  **/
  @ApiModelProperty(value = "Municipality code (e.g. 091).")
  public VmOpenApiMunicipality getMunicipality() {
    return municipality;
  }

  public void setMunicipality(VmOpenApiMunicipality municipality) {
    this.municipality = municipality;
  }

  public VmOpenApiAddressStreetWithCoordinates additionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public VmOpenApiAddressStreetWithCoordinates addAdditionalInformationItem(VmOpenApiLanguageItem additionalInformationItem) {
    if (this.additionalInformation == null) {
      this.additionalInformation = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Localized list of additional information about the address. (Max.Length: 150).
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "Localized list of additional information about the address. (Max.Length: 150).")
  public List<VmOpenApiLanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public VmOpenApiAddressStreetWithCoordinates latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Location latitude coordinate.
   * @return latitude
  **/
  @ApiModelProperty(value = "Location latitude coordinate.")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public VmOpenApiAddressStreetWithCoordinates longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Location longitude coordinate.
   * @return longitude
  **/
  @ApiModelProperty(value = "Location longitude coordinate.")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public VmOpenApiAddressStreetWithCoordinates coordinateState(String coordinateState) {
    this.coordinateState = coordinateState;
    return this;
  }

   /**
   * State of coordinates. Coordinates are fetched from a service provided by Maanmittauslaitos (WFS).  Possible values are: Loading, Ok, Failed, NotReceived, EmptyInputReceived, MultipleResultsReceived, WrongFormatReceived or EnteredByUser.
   * @return coordinateState
  **/
  @ApiModelProperty(value = "State of coordinates. Coordinates are fetched from a service provided by Maanmittauslaitos (WFS).  Possible values are: Loading, Ok, Failed, NotReceived, EmptyInputReceived, MultipleResultsReceived, WrongFormatReceived or EnteredByUser.")
  public String getCoordinateState() {
    return coordinateState;
  }

  public void setCoordinateState(String coordinateState) {
    this.coordinateState = coordinateState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiAddressStreetWithCoordinates vmOpenApiAddressStreetWithCoordinates = (VmOpenApiAddressStreetWithCoordinates) o;
    return Objects.equals(this.street, vmOpenApiAddressStreetWithCoordinates.street) &&
        Objects.equals(this.streetNumber, vmOpenApiAddressStreetWithCoordinates.streetNumber) &&
        Objects.equals(this.postalCode, vmOpenApiAddressStreetWithCoordinates.postalCode) &&
        Objects.equals(this.postOffice, vmOpenApiAddressStreetWithCoordinates.postOffice) &&
        Objects.equals(this.municipality, vmOpenApiAddressStreetWithCoordinates.municipality) &&
        Objects.equals(this.additionalInformation, vmOpenApiAddressStreetWithCoordinates.additionalInformation) &&
        Objects.equals(this.latitude, vmOpenApiAddressStreetWithCoordinates.latitude) &&
        Objects.equals(this.longitude, vmOpenApiAddressStreetWithCoordinates.longitude) &&
        Objects.equals(this.coordinateState, vmOpenApiAddressStreetWithCoordinates.coordinateState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, streetNumber, postalCode, postOffice, municipality, additionalInformation, latitude, longitude, coordinateState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiAddressStreetWithCoordinates {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOffice: ").append(toIndentedString(postOffice)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    coordinateState: ").append(toIndentedString(coordinateState)).append("\n");
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

