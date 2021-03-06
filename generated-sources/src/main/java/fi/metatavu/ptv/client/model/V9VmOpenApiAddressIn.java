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
import fi.metatavu.ptv.client.model.VmOpenApiAddressOtherIn;
import fi.metatavu.ptv.client.model.VmOpenApiAddressPostOfficeBoxIn;
import fi.metatavu.ptv.client.model.VmOpenApiAddressStreetWithCoordinatesIn;
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
public class V9VmOpenApiAddressIn {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("subType")
  private String subType = null;

  @JsonProperty("postOfficeBoxAddress")
  private VmOpenApiAddressPostOfficeBoxIn postOfficeBoxAddress = null;

  @JsonProperty("streetAddress")
  private VmOpenApiAddressStreetWithCoordinatesIn streetAddress = null;

  @JsonProperty("otherAddress")
  private VmOpenApiAddressOtherIn otherAddress = null;

  @JsonProperty("foreignAddress")
  private List<VmOpenApiLanguageItem> foreignAddress = null;

  @JsonProperty("country")
  private String country = null;

  public V9VmOpenApiAddressIn type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Address type, Visiting or Postal.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Address type, Visiting or Postal.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V9VmOpenApiAddressIn subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Address sub type, Street, PostOfficeBox, Foreign or Other.
   * @return subType
  **/
  @ApiModelProperty(required = true, value = "Address sub type, Street, PostOfficeBox, Foreign or Other.")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public V9VmOpenApiAddressIn postOfficeBoxAddress(VmOpenApiAddressPostOfficeBoxIn postOfficeBoxAddress) {
    this.postOfficeBoxAddress = postOfficeBoxAddress;
    return this;
  }

   /**
   * Post office box address
   * @return postOfficeBoxAddress
  **/
  @ApiModelProperty(value = "Post office box address")
  public VmOpenApiAddressPostOfficeBoxIn getPostOfficeBoxAddress() {
    return postOfficeBoxAddress;
  }

  public void setPostOfficeBoxAddress(VmOpenApiAddressPostOfficeBoxIn postOfficeBoxAddress) {
    this.postOfficeBoxAddress = postOfficeBoxAddress;
  }

  public V9VmOpenApiAddressIn streetAddress(VmOpenApiAddressStreetWithCoordinatesIn streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address.
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street address.")
  public VmOpenApiAddressStreetWithCoordinatesIn getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(VmOpenApiAddressStreetWithCoordinatesIn streetAddress) {
    this.streetAddress = streetAddress;
  }

  public V9VmOpenApiAddressIn otherAddress(VmOpenApiAddressOtherIn otherAddress) {
    this.otherAddress = otherAddress;
    return this;
  }

   /**
   * Address coordinates with additional information.
   * @return otherAddress
  **/
  @ApiModelProperty(value = "Address coordinates with additional information.")
  public VmOpenApiAddressOtherIn getOtherAddress() {
    return otherAddress;
  }

  public void setOtherAddress(VmOpenApiAddressOtherIn otherAddress) {
    this.otherAddress = otherAddress;
  }

  public V9VmOpenApiAddressIn foreignAddress(List<VmOpenApiLanguageItem> foreignAddress) {
    this.foreignAddress = foreignAddress;
    return this;
  }

  public V9VmOpenApiAddressIn addForeignAddressItem(VmOpenApiLanguageItem foreignAddressItem) {
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

  public V9VmOpenApiAddressIn country(String country) {
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
    V9VmOpenApiAddressIn v9VmOpenApiAddressIn = (V9VmOpenApiAddressIn) o;
    return Objects.equals(this.type, v9VmOpenApiAddressIn.type) &&
        Objects.equals(this.subType, v9VmOpenApiAddressIn.subType) &&
        Objects.equals(this.postOfficeBoxAddress, v9VmOpenApiAddressIn.postOfficeBoxAddress) &&
        Objects.equals(this.streetAddress, v9VmOpenApiAddressIn.streetAddress) &&
        Objects.equals(this.otherAddress, v9VmOpenApiAddressIn.otherAddress) &&
        Objects.equals(this.foreignAddress, v9VmOpenApiAddressIn.foreignAddress) &&
        Objects.equals(this.country, v9VmOpenApiAddressIn.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subType, postOfficeBoxAddress, streetAddress, otherAddress, foreignAddress, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiAddressIn {\n");
    
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

