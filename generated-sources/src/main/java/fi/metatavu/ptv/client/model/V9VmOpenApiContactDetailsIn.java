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
import fi.metatavu.ptv.client.model.V4VmOpenApiPhone;
import fi.metatavu.ptv.client.model.V4VmOpenApiPhoneSimple;
import fi.metatavu.ptv.client.model.V7VmOpenApiAddressContactIn;
import fi.metatavu.ptv.client.model.V9VmOpenApiWebPage;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V9 - View Model of contact details (POST).
 */
@ApiModel(description = "OPEN API V9 - View Model of contact details (POST).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class V9VmOpenApiContactDetailsIn {
  @JsonProperty("emails")
  private List<VmOpenApiLanguageItem> emails = null;

  @JsonProperty("phoneNumbers")
  private List<V4VmOpenApiPhone> phoneNumbers = null;

  @JsonProperty("faxNumbers")
  private List<V4VmOpenApiPhoneSimple> faxNumbers = null;

  @JsonProperty("webPages")
  private List<V9VmOpenApiWebPage> webPages = null;

  @JsonProperty("addresses")
  private List<V7VmOpenApiAddressContactIn> addresses = null;

  public V9VmOpenApiContactDetailsIn emails(List<VmOpenApiLanguageItem> emails) {
    this.emails = emails;
    return this;
  }

  public V9VmOpenApiContactDetailsIn addEmailsItem(VmOpenApiLanguageItem emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * List of connection related email addresses.
   * @return emails
  **/
  @ApiModelProperty(value = "List of connection related email addresses.")
  public List<VmOpenApiLanguageItem> getEmails() {
    return emails;
  }

  public void setEmails(List<VmOpenApiLanguageItem> emails) {
    this.emails = emails;
  }

  public V9VmOpenApiContactDetailsIn phoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V9VmOpenApiContactDetailsIn addPhoneNumbersItem(V4VmOpenApiPhone phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<V4VmOpenApiPhone>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of connection related phone numbers.
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "List of connection related phone numbers.")
  public List<V4VmOpenApiPhone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public V9VmOpenApiContactDetailsIn faxNumbers(List<V4VmOpenApiPhoneSimple> faxNumbers) {
    this.faxNumbers = faxNumbers;
    return this;
  }

  public V9VmOpenApiContactDetailsIn addFaxNumbersItem(V4VmOpenApiPhoneSimple faxNumbersItem) {
    if (this.faxNumbers == null) {
      this.faxNumbers = new ArrayList<V4VmOpenApiPhoneSimple>();
    }
    this.faxNumbers.add(faxNumbersItem);
    return this;
  }

   /**
   * List of connection related fax numbers numbers.
   * @return faxNumbers
  **/
  @ApiModelProperty(value = "List of connection related fax numbers numbers.")
  public List<V4VmOpenApiPhoneSimple> getFaxNumbers() {
    return faxNumbers;
  }

  public void setFaxNumbers(List<V4VmOpenApiPhoneSimple> faxNumbers) {
    this.faxNumbers = faxNumbers;
  }

  public V9VmOpenApiContactDetailsIn webPages(List<V9VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V9VmOpenApiContactDetailsIn addWebPagesItem(V9VmOpenApiWebPage webPagesItem) {
    if (this.webPages == null) {
      this.webPages = new ArrayList<V9VmOpenApiWebPage>();
    }
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of connection related web pages.
   * @return webPages
  **/
  @ApiModelProperty(value = "List of connection related web pages.")
  public List<V9VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<V9VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }

  public V9VmOpenApiContactDetailsIn addresses(List<V7VmOpenApiAddressContactIn> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V9VmOpenApiContactDetailsIn addAddressesItem(V7VmOpenApiAddressContactIn addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<V7VmOpenApiAddressContactIn>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of service location addresses.
   * @return addresses
  **/
  @ApiModelProperty(value = "List of service location addresses.")
  public List<V7VmOpenApiAddressContactIn> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V7VmOpenApiAddressContactIn> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V9VmOpenApiContactDetailsIn v9VmOpenApiContactDetailsIn = (V9VmOpenApiContactDetailsIn) o;
    return Objects.equals(this.emails, v9VmOpenApiContactDetailsIn.emails) &&
        Objects.equals(this.phoneNumbers, v9VmOpenApiContactDetailsIn.phoneNumbers) &&
        Objects.equals(this.faxNumbers, v9VmOpenApiContactDetailsIn.faxNumbers) &&
        Objects.equals(this.webPages, v9VmOpenApiContactDetailsIn.webPages) &&
        Objects.equals(this.addresses, v9VmOpenApiContactDetailsIn.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, phoneNumbers, faxNumbers, webPages, addresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiContactDetailsIn {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    faxNumbers: ").append(toIndentedString(faxNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

