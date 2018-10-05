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
import fi.metatavu.ptv.client.model.VmOpenApiAddressPostOfficeBoxIn;
import fi.metatavu.ptv.client.model.VmOpenApiAddressStreetIn;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V8 - View Model of delivery address
 */
@ApiModel(description = "OPEN API V8 - View Model of delivery address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class V8VmOpenApiAddressDeliveryIn {
  @JsonProperty("subType")
  private String subType = null;

  @JsonProperty("postOfficeBoxAddress")
  private VmOpenApiAddressPostOfficeBoxIn postOfficeBoxAddress = null;

  @JsonProperty("streetAddress")
  private VmOpenApiAddressStreetIn streetAddress = null;

  @JsonProperty("deliveryAddressInText")
  private List<VmOpenApiLanguageItem> deliveryAddressInText = null;

  @JsonProperty("formReceiver")
  private List<VmOpenApiLanguageItem> formReceiver = null;

  public V8VmOpenApiAddressDeliveryIn subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Address sub type, Street, PostOfficeBox or NoAddress.
   * @return subType
  **/
  @ApiModelProperty(required = true, value = "Address sub type, Street, PostOfficeBox or NoAddress.")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public V8VmOpenApiAddressDeliveryIn postOfficeBoxAddress(VmOpenApiAddressPostOfficeBoxIn postOfficeBoxAddress) {
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

  public V8VmOpenApiAddressDeliveryIn streetAddress(VmOpenApiAddressStreetIn streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address.
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Street address.")
  public VmOpenApiAddressStreetIn getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(VmOpenApiAddressStreetIn streetAddress) {
    this.streetAddress = streetAddress;
  }

  public V8VmOpenApiAddressDeliveryIn deliveryAddressInText(List<VmOpenApiLanguageItem> deliveryAddressInText) {
    this.deliveryAddressInText = deliveryAddressInText;
    return this;
  }

  public V8VmOpenApiAddressDeliveryIn addDeliveryAddressInTextItem(VmOpenApiLanguageItem deliveryAddressInTextItem) {
    if (this.deliveryAddressInText == null) {
      this.deliveryAddressInText = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.deliveryAddressInText.add(deliveryAddressInTextItem);
    return this;
  }

   /**
   * Localized list of foreign address information. (Max.Length: 150).
   * @return deliveryAddressInText
  **/
  @ApiModelProperty(value = "Localized list of foreign address information. (Max.Length: 150).")
  public List<VmOpenApiLanguageItem> getDeliveryAddressInText() {
    return deliveryAddressInText;
  }

  public void setDeliveryAddressInText(List<VmOpenApiLanguageItem> deliveryAddressInText) {
    this.deliveryAddressInText = deliveryAddressInText;
  }

  public V8VmOpenApiAddressDeliveryIn formReceiver(List<VmOpenApiLanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

  public V8VmOpenApiAddressDeliveryIn addFormReceiverItem(VmOpenApiLanguageItem formReceiverItem) {
    if (this.formReceiver == null) {
      this.formReceiver = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.formReceiver.add(formReceiverItem);
    return this;
  }

   /**
   * List of localized form receivers. One per language. (Max.Length: 100).
   * @return formReceiver
  **/
  @ApiModelProperty(value = "List of localized form receivers. One per language. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getFormReceiver() {
    return formReceiver;
  }

  public void setFormReceiver(List<VmOpenApiLanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V8VmOpenApiAddressDeliveryIn v8VmOpenApiAddressDeliveryIn = (V8VmOpenApiAddressDeliveryIn) o;
    return Objects.equals(this.subType, v8VmOpenApiAddressDeliveryIn.subType) &&
        Objects.equals(this.postOfficeBoxAddress, v8VmOpenApiAddressDeliveryIn.postOfficeBoxAddress) &&
        Objects.equals(this.streetAddress, v8VmOpenApiAddressDeliveryIn.streetAddress) &&
        Objects.equals(this.deliveryAddressInText, v8VmOpenApiAddressDeliveryIn.deliveryAddressInText) &&
        Objects.equals(this.formReceiver, v8VmOpenApiAddressDeliveryIn.formReceiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subType, postOfficeBoxAddress, streetAddress, deliveryAddressInText, formReceiver);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V8VmOpenApiAddressDeliveryIn {\n");
    
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    postOfficeBoxAddress: ").append(toIndentedString(postOfficeBoxAddress)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    deliveryAddressInText: ").append(toIndentedString(deliveryAddressInText)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
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

