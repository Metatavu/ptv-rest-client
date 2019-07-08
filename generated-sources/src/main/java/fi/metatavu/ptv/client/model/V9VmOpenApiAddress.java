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
import fi.metatavu.ptv.client.model.VmOpenApiAddressOther;
import fi.metatavu.ptv.client.model.VmOpenApiAddressPostOfficeBox;
import fi.metatavu.ptv.client.model.VmOpenApiAddressStreetWithCoordinates;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V9 - View Model of address
 */
@ApiModel(description = "OPEN API V9 - View Model of address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class V9VmOpenApiAddress {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("subType")
  private String subType = null;

  @JsonProperty("postOfficeBoxAddress")
  private VmOpenApiAddressPostOfficeBox postOfficeBoxAddress = null;

  @JsonProperty("streetAddress")
  private VmOpenApiAddressStreetWithCoordinates streetAddress = null;

  @JsonProperty("otherAddress")
  private VmOpenApiAddressOther otherAddress = null;

  @JsonProperty("foreignAddress")
  private List<VmOpenApiLanguageItem> foreignAddress = null;

  @JsonProperty("country")
  private String country = null;

  public V9VmOpenApiAddress type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Address type, Visiting or Postal.
   * @return type
  **/
  @ApiModelProperty(value = "Address type, Visiting or Postal.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V9VmOpenApiAddress subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Address sub type, Street, PostOfficeBox, Foreign or Other.
   * @return subType
  **/
  @ApiModelProperty(value = "Address sub type, Street, PostOfficeBox, Foreign or Other.")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public V9VmOpenApiAddress postOfficeBoxAddress(VmOpenApiAddressPostOfficeBox postOfficeBoxAddress) {
    this.postOfficeBoxAddress = postOfficeBoxAddress;
    return this;
  }

   /**
   * Post office box address
   * @return postOfficeBoxAddress
  **/
  @ApiModelProperty(value = "Post office box address")
  public VmOpenApiAddressPostOfficeBox getPostOfficeBoxAddress() {
    return postOfficeBoxAddress;
  }

  public void setPostOfficeBoxAddress(VmOpenApiAddressPostOfficeBox postOfficeBoxAddress) {
    this.postOfficeBoxAddress = postOfficeBoxAddress;
  }

  public V9VmOpenApiAddress streetAddress(VmOpenApiAddressStreetWithCoordinates streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address.
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street address.")
  public VmOpenApiAddressStreetWithCoordinates getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(VmOpenApiAddressStreetWithCoordinates streetAddress) {
    this.streetAddress = streetAddress;
  }

  public V9VmOpenApiAddress otherAddress(VmOpenApiAddressOther otherAddress) {
    this.otherAddress = otherAddress;
    return this;
  }

   /**
   * Address coordinates with additional information.
   * @return otherAddress
  **/
  @ApiModelProperty(value = "Address coordinates with additional information.")
  public VmOpenApiAddressOther getOtherAddress() {
    return otherAddress;
  }

  public void setOtherAddress(VmOpenApiAddressOther otherAddress) {
    this.otherAddress = otherAddress;
  }

  public V9VmOpenApiAddress foreignAddress(List<VmOpenApiLanguageItem> foreignAddress) {
    this.foreignAddress = foreignAddress;
    return this;
  }

  public V9VmOpenApiAddress addForeignAddressItem(VmOpenApiLanguageItem foreignAddressItem) {
    if (this.foreignAddress == null) {
      this.foreignAddress = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.foreignAddress.add(foreignAddressItem);
    return this;
  }

   /**
   * Localized list of foreign address information.
   * @return foreignAddress
  **/
  @ApiModelProperty(value = "Localized list of foreign address information.")
  public List<VmOpenApiLanguageItem> getForeignAddress() {
    return foreignAddress;
  }

  public void setForeignAddress(List<VmOpenApiLanguageItem> foreignAddress) {
    this.foreignAddress = foreignAddress;
  }

  public V9VmOpenApiAddress country(String country) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V9VmOpenApiAddress v9VmOpenApiAddress = (V9VmOpenApiAddress) o;
    return Objects.equals(this.type, v9VmOpenApiAddress.type) &&
        Objects.equals(this.subType, v9VmOpenApiAddress.subType) &&
        Objects.equals(this.postOfficeBoxAddress, v9VmOpenApiAddress.postOfficeBoxAddress) &&
        Objects.equals(this.streetAddress, v9VmOpenApiAddress.streetAddress) &&
        Objects.equals(this.otherAddress, v9VmOpenApiAddress.otherAddress) &&
        Objects.equals(this.foreignAddress, v9VmOpenApiAddress.foreignAddress) &&
        Objects.equals(this.country, v9VmOpenApiAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subType, postOfficeBoxAddress, streetAddress, otherAddress, foreignAddress, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiAddress {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    postOfficeBoxAddress: ").append(toIndentedString(postOfficeBoxAddress)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    otherAddress: ").append(toIndentedString(otherAddress)).append("\n");
    sb.append("    foreignAddress: ").append(toIndentedString(foreignAddress)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

