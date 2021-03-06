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
import fi.metatavu.ptv.client.model.VmOpenApiMunicipality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API - View Model of street address
 */
@ApiModel(description = "OPEN API - View Model of street address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class VmOpenApiAddressStreet {
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

  public VmOpenApiAddressStreet street(List<VmOpenApiLanguageItem> street) {
    this.street = street;
    return this;
  }

  public VmOpenApiAddressStreet addStreetItem(VmOpenApiLanguageItem streetItem) {
    if (this.street == null) {
      this.street = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.street.add(streetItem);
    return this;
  }

   /**
   * List of localized street addresses.
   * @return street
  **/
  @ApiModelProperty(value = "List of localized street addresses.")
  public List<VmOpenApiLanguageItem> getStreet() {
    return street;
  }

  public void setStreet(List<VmOpenApiLanguageItem> street) {
    this.street = street;
  }

  public VmOpenApiAddressStreet streetNumber(String streetNumber) {
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

  public VmOpenApiAddressStreet postalCode(String postalCode) {
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

  public VmOpenApiAddressStreet postOffice(List<VmOpenApiLanguageItem> postOffice) {
    this.postOffice = postOffice;
    return this;
  }

  public VmOpenApiAddressStreet addPostOfficeItem(VmOpenApiLanguageItem postOfficeItem) {
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

  public VmOpenApiAddressStreet municipality(VmOpenApiMunicipality municipality) {
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

  public VmOpenApiAddressStreet additionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public VmOpenApiAddressStreet addAdditionalInformationItem(VmOpenApiLanguageItem additionalInformationItem) {
    if (this.additionalInformation == null) {
      this.additionalInformation = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Localized list of additional information about the address.
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "Localized list of additional information about the address.")
  public List<VmOpenApiLanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiAddressStreet vmOpenApiAddressStreet = (VmOpenApiAddressStreet) o;
    return Objects.equals(this.street, vmOpenApiAddressStreet.street) &&
        Objects.equals(this.streetNumber, vmOpenApiAddressStreet.streetNumber) &&
        Objects.equals(this.postalCode, vmOpenApiAddressStreet.postalCode) &&
        Objects.equals(this.postOffice, vmOpenApiAddressStreet.postOffice) &&
        Objects.equals(this.municipality, vmOpenApiAddressStreet.municipality) &&
        Objects.equals(this.additionalInformation, vmOpenApiAddressStreet.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, streetNumber, postalCode, postOffice, municipality, additionalInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiAddressStreet {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOffice: ").append(toIndentedString(postOffice)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

