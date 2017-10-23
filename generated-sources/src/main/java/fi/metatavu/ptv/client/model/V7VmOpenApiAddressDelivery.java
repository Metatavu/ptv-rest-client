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
import fi.metatavu.ptv.client.model.VmOpenApiAddressPostOfficeBox;
import fi.metatavu.ptv.client.model.VmOpenApiAddressStreet;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V7 - View Model of delivery address
 */
@ApiModel(description = "OPEN API V7 - View Model of delivery address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class V7VmOpenApiAddressDelivery {
  @JsonProperty("subType")
  private String subType = null;

  @JsonProperty("postOfficeBoxAddress")
  private VmOpenApiAddressPostOfficeBox postOfficeBoxAddress = null;

  @JsonProperty("streetAddress")
  private VmOpenApiAddressStreet streetAddress = null;

  @JsonProperty("deliveryAddressInText")
  private List<VmOpenApiLanguageItem> deliveryAddressInText = null;

  public V7VmOpenApiAddressDelivery subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Address sub type, Street, PostOfficeBox or NoAddress.
   * @return subType
  **/
  @ApiModelProperty(value = "Address sub type, Street, PostOfficeBox or NoAddress.")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public V7VmOpenApiAddressDelivery postOfficeBoxAddress(VmOpenApiAddressPostOfficeBox postOfficeBoxAddress) {
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

  public V7VmOpenApiAddressDelivery streetAddress(VmOpenApiAddressStreet streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address.
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street address.")
  public VmOpenApiAddressStreet getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(VmOpenApiAddressStreet streetAddress) {
    this.streetAddress = streetAddress;
  }

  public V7VmOpenApiAddressDelivery deliveryAddressInText(List<VmOpenApiLanguageItem> deliveryAddressInText) {
    this.deliveryAddressInText = deliveryAddressInText;
    return this;
  }

  public V7VmOpenApiAddressDelivery addDeliveryAddressInTextItem(VmOpenApiLanguageItem deliveryAddressInTextItem) {
    if (this.deliveryAddressInText == null) {
      this.deliveryAddressInText = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.deliveryAddressInText.add(deliveryAddressInTextItem);
    return this;
  }

   /**
   * Localized list of delivery address information.
   * @return deliveryAddressInText
  **/
  @ApiModelProperty(value = "Localized list of delivery address information.")
  public List<VmOpenApiLanguageItem> getDeliveryAddressInText() {
    return deliveryAddressInText;
  }

  public void setDeliveryAddressInText(List<VmOpenApiLanguageItem> deliveryAddressInText) {
    this.deliveryAddressInText = deliveryAddressInText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V7VmOpenApiAddressDelivery v7VmOpenApiAddressDelivery = (V7VmOpenApiAddressDelivery) o;
    return Objects.equals(this.subType, v7VmOpenApiAddressDelivery.subType) &&
        Objects.equals(this.postOfficeBoxAddress, v7VmOpenApiAddressDelivery.postOfficeBoxAddress) &&
        Objects.equals(this.streetAddress, v7VmOpenApiAddressDelivery.streetAddress) &&
        Objects.equals(this.deliveryAddressInText, v7VmOpenApiAddressDelivery.deliveryAddressInText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subType, postOfficeBoxAddress, streetAddress, deliveryAddressInText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V7VmOpenApiAddressDelivery {\n");
    
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    postOfficeBoxAddress: ").append(toIndentedString(postOfficeBoxAddress)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    deliveryAddressInText: ").append(toIndentedString(deliveryAddressInText)).append("\n");
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

