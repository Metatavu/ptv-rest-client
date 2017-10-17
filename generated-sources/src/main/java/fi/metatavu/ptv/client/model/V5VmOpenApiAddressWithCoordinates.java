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
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiMunicipality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V5 - View Model of address with coordinates
 */
@ApiModel(description = "OPEN API V5 - View Model of address with coordinates")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T09:06:52.024+03:00")
public class V5VmOpenApiAddressWithCoordinates {
  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("coordinateState")
  private String coordinateState = null;

  @JsonProperty("postOfficeBox")
  private List<VmOpenApiLanguageItem> postOfficeBox = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("postOffice")
  private List<VmOpenApiLanguageItem> postOffice = null;

  @JsonProperty("streetAddress")
  private List<VmOpenApiLanguageItem> streetAddress = null;

  @JsonProperty("streetNumber")
  private String streetNumber = null;

  @JsonProperty("municipality")
  private VmOpenApiMunicipality municipality = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("additionalInformations")
  private List<VmOpenApiLanguageItem> additionalInformations = null;

  public V5VmOpenApiAddressWithCoordinates latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Service location latitude coordinate.
   * @return latitude
  **/
  @ApiModelProperty(value = "Service location latitude coordinate.")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public V5VmOpenApiAddressWithCoordinates longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Service location longitude coordinate.
   * @return longitude
  **/
  @ApiModelProperty(value = "Service location longitude coordinate.")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public V5VmOpenApiAddressWithCoordinates coordinateState(String coordinateState) {
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

  public V5VmOpenApiAddressWithCoordinates postOfficeBox(List<VmOpenApiLanguageItem> postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

  public V5VmOpenApiAddressWithCoordinates addPostOfficeBoxItem(VmOpenApiLanguageItem postOfficeBoxItem) {
    if (this.postOfficeBox == null) {
      this.postOfficeBox = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.postOfficeBox.add(postOfficeBoxItem);
    return this;
  }

   /**
   * Post office box like PL 310
   * @return postOfficeBox
  **/
  @ApiModelProperty(value = "Post office box like PL 310")
  public List<VmOpenApiLanguageItem> getPostOfficeBox() {
    return postOfficeBox;
  }

  public void setPostOfficeBox(List<VmOpenApiLanguageItem> postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }

  public V5VmOpenApiAddressWithCoordinates postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code, for example 00010.
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "Postal code, for example 00010.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public V5VmOpenApiAddressWithCoordinates postOffice(List<VmOpenApiLanguageItem> postOffice) {
    this.postOffice = postOffice;
    return this;
  }

  public V5VmOpenApiAddressWithCoordinates addPostOfficeItem(VmOpenApiLanguageItem postOfficeItem) {
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

  public V5VmOpenApiAddressWithCoordinates streetAddress(List<VmOpenApiLanguageItem> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  public V5VmOpenApiAddressWithCoordinates addStreetAddressItem(VmOpenApiLanguageItem streetAddressItem) {
    if (this.streetAddress == null) {
      this.streetAddress = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.streetAddress.add(streetAddressItem);
    return this;
  }

   /**
   * List of localized street addresses.
   * @return streetAddress
  **/
  @ApiModelProperty(value = "List of localized street addresses.")
  public List<VmOpenApiLanguageItem> getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(List<VmOpenApiLanguageItem> streetAddress) {
    this.streetAddress = streetAddress;
  }

  public V5VmOpenApiAddressWithCoordinates streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Street number for street address.
   * @return streetNumber
  **/
  @ApiModelProperty(value = "Street number for street address.")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public V5VmOpenApiAddressWithCoordinates municipality(VmOpenApiMunicipality municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Municipality including municipality code and a localized list of municipality names.
   * @return municipality
  **/
  @ApiModelProperty(value = "Municipality including municipality code and a localized list of municipality names.")
  public VmOpenApiMunicipality getMunicipality() {
    return municipality;
  }

  public void setMunicipality(VmOpenApiMunicipality municipality) {
    this.municipality = municipality;
  }

  public V5VmOpenApiAddressWithCoordinates country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country code (ISO 3166-1 alpha-2), for example FI.
   * @return country
  **/
  @ApiModelProperty(value = "Country code (ISO 3166-1 alpha-2), for example FI.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public V5VmOpenApiAddressWithCoordinates additionalInformations(List<VmOpenApiLanguageItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public V5VmOpenApiAddressWithCoordinates addAdditionalInformationsItem(VmOpenApiLanguageItem additionalInformationsItem) {
    if (this.additionalInformations == null) {
      this.additionalInformations = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.additionalInformations.add(additionalInformationsItem);
    return this;
  }

   /**
   * Localized list of additional information about the address.
   * @return additionalInformations
  **/
  @ApiModelProperty(value = "Localized list of additional information about the address.")
  public List<VmOpenApiLanguageItem> getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(List<VmOpenApiLanguageItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V5VmOpenApiAddressWithCoordinates v5VmOpenApiAddressWithCoordinates = (V5VmOpenApiAddressWithCoordinates) o;
    return Objects.equals(this.latitude, v5VmOpenApiAddressWithCoordinates.latitude) &&
        Objects.equals(this.longitude, v5VmOpenApiAddressWithCoordinates.longitude) &&
        Objects.equals(this.coordinateState, v5VmOpenApiAddressWithCoordinates.coordinateState) &&
        Objects.equals(this.postOfficeBox, v5VmOpenApiAddressWithCoordinates.postOfficeBox) &&
        Objects.equals(this.postalCode, v5VmOpenApiAddressWithCoordinates.postalCode) &&
        Objects.equals(this.postOffice, v5VmOpenApiAddressWithCoordinates.postOffice) &&
        Objects.equals(this.streetAddress, v5VmOpenApiAddressWithCoordinates.streetAddress) &&
        Objects.equals(this.streetNumber, v5VmOpenApiAddressWithCoordinates.streetNumber) &&
        Objects.equals(this.municipality, v5VmOpenApiAddressWithCoordinates.municipality) &&
        Objects.equals(this.country, v5VmOpenApiAddressWithCoordinates.country) &&
        Objects.equals(this.additionalInformations, v5VmOpenApiAddressWithCoordinates.additionalInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, coordinateState, postOfficeBox, postalCode, postOffice, streetAddress, streetNumber, municipality, country, additionalInformations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V5VmOpenApiAddressWithCoordinates {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    coordinateState: ").append(toIndentedString(coordinateState)).append("\n");
    sb.append("    postOfficeBox: ").append(toIndentedString(postOfficeBox)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOffice: ").append(toIndentedString(postOffice)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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

