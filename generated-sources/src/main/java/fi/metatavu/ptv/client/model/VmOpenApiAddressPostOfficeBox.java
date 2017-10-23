/*
 * PTV Open Api version 7
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v7
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
 * OPEN API V7 - View Model of post office box address.
 */
@ApiModel(description = "OPEN API V7 - View Model of post office box address.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class VmOpenApiAddressPostOfficeBox {
  @JsonProperty("postOfficeBox")
  private List<VmOpenApiLanguageItem> postOfficeBox = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("postOffice")
  private List<VmOpenApiLanguageItem> postOffice = null;

  @JsonProperty("municipality")
  private VmOpenApiMunicipality municipality = null;

  @JsonProperty("additionalInformation")
  private List<VmOpenApiLanguageItem> additionalInformation = null;

  public VmOpenApiAddressPostOfficeBox postOfficeBox(List<VmOpenApiLanguageItem> postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

  public VmOpenApiAddressPostOfficeBox addPostOfficeBoxItem(VmOpenApiLanguageItem postOfficeBoxItem) {
    this.postOfficeBox.add(postOfficeBoxItem);
    return this;
  }

   /**
   * Post office box like PL 310 (Max.Length: 100).
   * @return postOfficeBox
  **/
  @ApiModelProperty(required = true, value = "Post office box like PL 310 (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getPostOfficeBox() {
    return postOfficeBox;
  }

  public void setPostOfficeBox(List<VmOpenApiLanguageItem> postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }

  public VmOpenApiAddressPostOfficeBox postalCode(String postalCode) {
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

  public VmOpenApiAddressPostOfficeBox postOffice(List<VmOpenApiLanguageItem> postOffice) {
    this.postOffice = postOffice;
    return this;
  }

  public VmOpenApiAddressPostOfficeBox addPostOfficeItem(VmOpenApiLanguageItem postOfficeItem) {
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

  public VmOpenApiAddressPostOfficeBox municipality(VmOpenApiMunicipality municipality) {
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

  public VmOpenApiAddressPostOfficeBox additionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public VmOpenApiAddressPostOfficeBox addAdditionalInformationItem(VmOpenApiLanguageItem additionalInformationItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiAddressPostOfficeBox vmOpenApiAddressPostOfficeBox = (VmOpenApiAddressPostOfficeBox) o;
    return Objects.equals(this.postOfficeBox, vmOpenApiAddressPostOfficeBox.postOfficeBox) &&
        Objects.equals(this.postalCode, vmOpenApiAddressPostOfficeBox.postalCode) &&
        Objects.equals(this.postOffice, vmOpenApiAddressPostOfficeBox.postOffice) &&
        Objects.equals(this.municipality, vmOpenApiAddressPostOfficeBox.municipality) &&
        Objects.equals(this.additionalInformation, vmOpenApiAddressPostOfficeBox.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postOfficeBox, postalCode, postOffice, municipality, additionalInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiAddressPostOfficeBox {\n");
    
    sb.append("    postOfficeBox: ").append(toIndentedString(postOfficeBox)).append("\n");
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

