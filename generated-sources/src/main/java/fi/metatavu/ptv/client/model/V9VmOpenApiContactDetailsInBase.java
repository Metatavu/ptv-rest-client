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
 * OPEN API - View Model of contact details (PUT) - base version
 */
@ApiModel(description = "OPEN API - View Model of contact details (PUT) - base version")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:38:50.296+03:00")
public class V9VmOpenApiContactDetailsInBase {
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

  @JsonProperty("deleteAllEmails")
  private Boolean deleteAllEmails = null;

  @JsonProperty("deleteAllPhones")
  private Boolean deleteAllPhones = null;

  @JsonProperty("deleteAllFaxNumbers")
  private Boolean deleteAllFaxNumbers = null;

  @JsonProperty("deleteAllWebPages")
  private Boolean deleteAllWebPages = null;

  @JsonProperty("deleteAllAddresses")
  private Boolean deleteAllAddresses = null;

  public V9VmOpenApiContactDetailsInBase emails(List<VmOpenApiLanguageItem> emails) {
    this.emails = emails;
    return this;
  }

  public V9VmOpenApiContactDetailsInBase addEmailsItem(VmOpenApiLanguageItem emailsItem) {
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

  public V9VmOpenApiContactDetailsInBase phoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V9VmOpenApiContactDetailsInBase addPhoneNumbersItem(V4VmOpenApiPhone phoneNumbersItem) {
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

  public V9VmOpenApiContactDetailsInBase faxNumbers(List<V4VmOpenApiPhoneSimple> faxNumbers) {
    this.faxNumbers = faxNumbers;
    return this;
  }

  public V9VmOpenApiContactDetailsInBase addFaxNumbersItem(V4VmOpenApiPhoneSimple faxNumbersItem) {
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

  public V9VmOpenApiContactDetailsInBase webPages(List<V9VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V9VmOpenApiContactDetailsInBase addWebPagesItem(V9VmOpenApiWebPage webPagesItem) {
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

  public V9VmOpenApiContactDetailsInBase addresses(List<V7VmOpenApiAddressContactIn> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V9VmOpenApiContactDetailsInBase addAddressesItem(V7VmOpenApiAddressContactIn addressesItem) {
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

  public V9VmOpenApiContactDetailsInBase deleteAllEmails(Boolean deleteAllEmails) {
    this.deleteAllEmails = deleteAllEmails;
    return this;
  }

   /**
   * Gets or sets a value indicating whether all emails should be delted.
   * @return deleteAllEmails
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether all emails should be delted.")
  public Boolean getDeleteAllEmails() {
    return deleteAllEmails;
  }

  public void setDeleteAllEmails(Boolean deleteAllEmails) {
    this.deleteAllEmails = deleteAllEmails;
  }

  public V9VmOpenApiContactDetailsInBase deleteAllPhones(Boolean deleteAllPhones) {
    this.deleteAllPhones = deleteAllPhones;
    return this;
  }

   /**
   * Gets or sets a value indicating whether all phones should be delted.
   * @return deleteAllPhones
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether all phones should be delted.")
  public Boolean getDeleteAllPhones() {
    return deleteAllPhones;
  }

  public void setDeleteAllPhones(Boolean deleteAllPhones) {
    this.deleteAllPhones = deleteAllPhones;
  }

  public V9VmOpenApiContactDetailsInBase deleteAllFaxNumbers(Boolean deleteAllFaxNumbers) {
    this.deleteAllFaxNumbers = deleteAllFaxNumbers;
    return this;
  }

   /**
   * Gets or sets a value indicating whether all fax numbers should be delted.
   * @return deleteAllFaxNumbers
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether all fax numbers should be delted.")
  public Boolean getDeleteAllFaxNumbers() {
    return deleteAllFaxNumbers;
  }

  public void setDeleteAllFaxNumbers(Boolean deleteAllFaxNumbers) {
    this.deleteAllFaxNumbers = deleteAllFaxNumbers;
  }

  public V9VmOpenApiContactDetailsInBase deleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
    return this;
  }

   /**
   * Gets or sets a value indicating whether all web pages should be delted.
   * @return deleteAllWebPages
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether all web pages should be delted.")
  public Boolean getDeleteAllWebPages() {
    return deleteAllWebPages;
  }

  public void setDeleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
  }

  public V9VmOpenApiContactDetailsInBase deleteAllAddresses(Boolean deleteAllAddresses) {
    this.deleteAllAddresses = deleteAllAddresses;
    return this;
  }

   /**
   * Gets or sets a value indicating whether all addresses should be delted.
   * @return deleteAllAddresses
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether all addresses should be delted.")
  public Boolean getDeleteAllAddresses() {
    return deleteAllAddresses;
  }

  public void setDeleteAllAddresses(Boolean deleteAllAddresses) {
    this.deleteAllAddresses = deleteAllAddresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V9VmOpenApiContactDetailsInBase v9VmOpenApiContactDetailsInBase = (V9VmOpenApiContactDetailsInBase) o;
    return Objects.equals(this.emails, v9VmOpenApiContactDetailsInBase.emails) &&
        Objects.equals(this.phoneNumbers, v9VmOpenApiContactDetailsInBase.phoneNumbers) &&
        Objects.equals(this.faxNumbers, v9VmOpenApiContactDetailsInBase.faxNumbers) &&
        Objects.equals(this.webPages, v9VmOpenApiContactDetailsInBase.webPages) &&
        Objects.equals(this.addresses, v9VmOpenApiContactDetailsInBase.addresses) &&
        Objects.equals(this.deleteAllEmails, v9VmOpenApiContactDetailsInBase.deleteAllEmails) &&
        Objects.equals(this.deleteAllPhones, v9VmOpenApiContactDetailsInBase.deleteAllPhones) &&
        Objects.equals(this.deleteAllFaxNumbers, v9VmOpenApiContactDetailsInBase.deleteAllFaxNumbers) &&
        Objects.equals(this.deleteAllWebPages, v9VmOpenApiContactDetailsInBase.deleteAllWebPages) &&
        Objects.equals(this.deleteAllAddresses, v9VmOpenApiContactDetailsInBase.deleteAllAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, phoneNumbers, faxNumbers, webPages, addresses, deleteAllEmails, deleteAllPhones, deleteAllFaxNumbers, deleteAllWebPages, deleteAllAddresses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiContactDetailsInBase {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    faxNumbers: ").append(toIndentedString(faxNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    deleteAllEmails: ").append(toIndentedString(deleteAllEmails)).append("\n");
    sb.append("    deleteAllPhones: ").append(toIndentedString(deleteAllPhones)).append("\n");
    sb.append("    deleteAllFaxNumbers: ").append(toIndentedString(deleteAllFaxNumbers)).append("\n");
    sb.append("    deleteAllWebPages: ").append(toIndentedString(deleteAllWebPages)).append("\n");
    sb.append("    deleteAllAddresses: ").append(toIndentedString(deleteAllAddresses)).append("\n");
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

