/**
 * PTV Open Api version 4
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.metatavu.ptv.client.model.V4VmOpenApiAddressWithTypeIn;
import fi.metatavu.ptv.client.model.V4VmOpenApiEmail;
import fi.metatavu.ptv.client.model.V4VmOpenApiPhone;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiWebPageWithOrderNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * OPEN API V4 - View Model of organization for IN api - base
 */
@ApiModel(description = "OPEN API V4 - View Model of organization for IN api - base")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T07:12:40.139+03:00")
public class V4VmOpenApiOrganizationInBase   {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("oid")
  private String oid = null;

  @JsonProperty("municipality")
  private String municipality = null;

  @JsonProperty("organizationType")
  private String organizationType = null;

  @JsonProperty("businessCode")
  private String businessCode = null;

  @JsonProperty("businessName")
  private String businessName = null;

  @JsonProperty("organizationNames")
  private List<VmOpenApiLocalizedListItem> organizationNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("displayNameType")
  private String displayNameType = null;

  @JsonProperty("organizationDescriptions")
  private List<VmOpenApiLanguageItem> organizationDescriptions = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("emailAddresses")
  private List<V4VmOpenApiEmail> emailAddresses = new ArrayList<V4VmOpenApiEmail>();

  @JsonProperty("phoneNumbers")
  private List<V4VmOpenApiPhone> phoneNumbers = new ArrayList<V4VmOpenApiPhone>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPageWithOrderNumber> webPages = new ArrayList<VmOpenApiWebPageWithOrderNumber>();

  @JsonProperty("addresses")
  private List<V4VmOpenApiAddressWithTypeIn> addresses = new ArrayList<V4VmOpenApiAddressWithTypeIn>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("parentOrganizationId")
  private String parentOrganizationId = null;

  @JsonProperty("deleteAllEmails")
  private Boolean deleteAllEmails = null;

  @JsonProperty("deleteAllPhones")
  private Boolean deleteAllPhones = null;

  @JsonProperty("deleteAllWebPages")
  private Boolean deleteAllWebPages = null;

  @JsonProperty("deleteAllAddresses")
  private Boolean deleteAllAddresses = null;

  public V4VmOpenApiOrganizationInBase sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Organization external system identifier.
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "Organization external system identifier.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public V4VmOpenApiOrganizationInBase oid(String oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Organization OID. - must match the regex @\"^[A-Za-z0-9.-]*$\"
   * @return oid
  **/
  @ApiModelProperty(example = "null", value = "Organization OID. - must match the regex @\"^[A-Za-z0-9.-]*$\"")
  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public V4VmOpenApiOrganizationInBase municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Municipality code (like 491 or 091).
   * @return municipality
  **/
  @ApiModelProperty(example = "null", value = "Municipality code (like 491 or 091).")
  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public V4VmOpenApiOrganizationInBase organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Organization type (State, Municipality, RegionalOrganization, Organization, Company).
   * @return organizationType
  **/
  @ApiModelProperty(example = "null", value = "Organization type (State, Municipality, RegionalOrganization, Organization, Company).")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public V4VmOpenApiOrganizationInBase businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

   /**
   * Organization business code (Y-tunnus).
   * @return businessCode
  **/
  @ApiModelProperty(example = "null", value = "Organization business code (Y-tunnus).")
  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public V4VmOpenApiOrganizationInBase businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Organization business name (name used for business code).
   * @return businessName
  **/
  @ApiModelProperty(example = "null", value = "Organization business name (name used for business code).")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public V4VmOpenApiOrganizationInBase organizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
    return this;
  }

  public V4VmOpenApiOrganizationInBase addOrganizationNamesItem(VmOpenApiLocalizedListItem organizationNamesItem) {
    this.organizationNames.add(organizationNamesItem);
    return this;
  }

   /**
   * List of organization names.
   * @return organizationNames
  **/
  @ApiModelProperty(example = "null", value = "List of organization names.")
  public List<VmOpenApiLocalizedListItem> getOrganizationNames() {
    return organizationNames;
  }

  public void setOrganizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
  }

  public V4VmOpenApiOrganizationInBase displayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

   /**
   * Display name type (Name or AlternateName). Which name type should be used as the display name for the organization (OrganizationNames list).
   * @return displayNameType
  **/
  @ApiModelProperty(example = "null", value = "Display name type (Name or AlternateName). Which name type should be used as the display name for the organization (OrganizationNames list).")
  public String getDisplayNameType() {
    return displayNameType;
  }

  public void setDisplayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
  }

  public V4VmOpenApiOrganizationInBase organizationDescriptions(List<VmOpenApiLanguageItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
    return this;
  }

  public V4VmOpenApiOrganizationInBase addOrganizationDescriptionsItem(VmOpenApiLanguageItem organizationDescriptionsItem) {
    this.organizationDescriptions.add(organizationDescriptionsItem);
    return this;
  }

   /**
   * Localized list of organization descriptions.
   * @return organizationDescriptions
  **/
  @ApiModelProperty(example = "null", value = "Localized list of organization descriptions.")
  public List<VmOpenApiLanguageItem> getOrganizationDescriptions() {
    return organizationDescriptions;
  }

  public void setOrganizationDescriptions(List<VmOpenApiLanguageItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
  }

  public V4VmOpenApiOrganizationInBase emailAddresses(List<V4VmOpenApiEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public V4VmOpenApiOrganizationInBase addEmailAddressesItem(V4VmOpenApiEmail emailAddressesItem) {
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * List of email addresses.
   * @return emailAddresses
  **/
  @ApiModelProperty(example = "null", value = "List of email addresses.")
  public List<V4VmOpenApiEmail> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<V4VmOpenApiEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public V4VmOpenApiOrganizationInBase phoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V4VmOpenApiOrganizationInBase addPhoneNumbersItem(V4VmOpenApiPhone phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of organizations phone numbers.
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "List of organizations phone numbers.")
  public List<V4VmOpenApiPhone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public V4VmOpenApiOrganizationInBase webPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V4VmOpenApiOrganizationInBase addWebPagesItem(VmOpenApiWebPageWithOrderNumber webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of organizations web pages.
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "List of organizations web pages.")
  public List<VmOpenApiWebPageWithOrderNumber> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
  }

  public V4VmOpenApiOrganizationInBase addresses(List<V4VmOpenApiAddressWithTypeIn> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V4VmOpenApiOrganizationInBase addAddressesItem(V4VmOpenApiAddressWithTypeIn addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of addresses.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "List of addresses.")
  public List<V4VmOpenApiAddressWithTypeIn> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V4VmOpenApiAddressWithTypeIn> addresses) {
    this.addresses = addresses;
  }

  public V4VmOpenApiOrganizationInBase publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status (Draft, Published, Deleted, Modified and OldPublished).
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "Publishing status (Draft, Published, Deleted, Modified and OldPublished).")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V4VmOpenApiOrganizationInBase parentOrganizationId(String parentOrganizationId) {
    this.parentOrganizationId = parentOrganizationId;
    return this;
  }

   /**
   * Parent organization identifier if exists.
   * @return parentOrganizationId
  **/
  @ApiModelProperty(example = "null", value = "Parent organization identifier if exists.")
  public String getParentOrganizationId() {
    return parentOrganizationId;
  }

  public void setParentOrganizationId(String parentOrganizationId) {
    this.parentOrganizationId = parentOrganizationId;
  }

  public V4VmOpenApiOrganizationInBase deleteAllEmails(Boolean deleteAllEmails) {
    this.deleteAllEmails = deleteAllEmails;
    return this;
  }

   /**
   * Set to true to delete all existing emails (the EmailAddresses collection for this object should be empty collection when this option is used).
   * @return deleteAllEmails
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing emails (the EmailAddresses collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllEmails() {
    return deleteAllEmails;
  }

  public void setDeleteAllEmails(Boolean deleteAllEmails) {
    this.deleteAllEmails = deleteAllEmails;
  }

  public V4VmOpenApiOrganizationInBase deleteAllPhones(Boolean deleteAllPhones) {
    this.deleteAllPhones = deleteAllPhones;
    return this;
  }

   /**
   * Set to true to delete all existing phone numbers (the PhoneNumbers collection for this object should be empty collection when this option is used).
   * @return deleteAllPhones
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing phone numbers (the PhoneNumbers collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllPhones() {
    return deleteAllPhones;
  }

  public void setDeleteAllPhones(Boolean deleteAllPhones) {
    this.deleteAllPhones = deleteAllPhones;
  }

  public V4VmOpenApiOrganizationInBase deleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
    return this;
  }

   /**
   * Set to true to delete all existing web pages (the WebPages collection for this object should be empty collection when this option is used).
   * @return deleteAllWebPages
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing web pages (the WebPages collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllWebPages() {
    return deleteAllWebPages;
  }

  public void setDeleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
  }

  public V4VmOpenApiOrganizationInBase deleteAllAddresses(Boolean deleteAllAddresses) {
    this.deleteAllAddresses = deleteAllAddresses;
    return this;
  }

   /**
   * Set to true to delete all existing addresses (the Addresses collection for this object should be empty collection when this option is used).
   * @return deleteAllAddresses
  **/
  @ApiModelProperty(example = "null", value = "Set to true to delete all existing addresses (the Addresses collection for this object should be empty collection when this option is used).")
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
    V4VmOpenApiOrganizationInBase v4VmOpenApiOrganizationInBase = (V4VmOpenApiOrganizationInBase) o;
    return Objects.equals(this.sourceId, v4VmOpenApiOrganizationInBase.sourceId) &&
        Objects.equals(this.oid, v4VmOpenApiOrganizationInBase.oid) &&
        Objects.equals(this.municipality, v4VmOpenApiOrganizationInBase.municipality) &&
        Objects.equals(this.organizationType, v4VmOpenApiOrganizationInBase.organizationType) &&
        Objects.equals(this.businessCode, v4VmOpenApiOrganizationInBase.businessCode) &&
        Objects.equals(this.businessName, v4VmOpenApiOrganizationInBase.businessName) &&
        Objects.equals(this.organizationNames, v4VmOpenApiOrganizationInBase.organizationNames) &&
        Objects.equals(this.displayNameType, v4VmOpenApiOrganizationInBase.displayNameType) &&
        Objects.equals(this.organizationDescriptions, v4VmOpenApiOrganizationInBase.organizationDescriptions) &&
        Objects.equals(this.emailAddresses, v4VmOpenApiOrganizationInBase.emailAddresses) &&
        Objects.equals(this.phoneNumbers, v4VmOpenApiOrganizationInBase.phoneNumbers) &&
        Objects.equals(this.webPages, v4VmOpenApiOrganizationInBase.webPages) &&
        Objects.equals(this.addresses, v4VmOpenApiOrganizationInBase.addresses) &&
        Objects.equals(this.publishingStatus, v4VmOpenApiOrganizationInBase.publishingStatus) &&
        Objects.equals(this.parentOrganizationId, v4VmOpenApiOrganizationInBase.parentOrganizationId) &&
        Objects.equals(this.deleteAllEmails, v4VmOpenApiOrganizationInBase.deleteAllEmails) &&
        Objects.equals(this.deleteAllPhones, v4VmOpenApiOrganizationInBase.deleteAllPhones) &&
        Objects.equals(this.deleteAllWebPages, v4VmOpenApiOrganizationInBase.deleteAllWebPages) &&
        Objects.equals(this.deleteAllAddresses, v4VmOpenApiOrganizationInBase.deleteAllAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, oid, municipality, organizationType, businessCode, businessName, organizationNames, displayNameType, organizationDescriptions, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, parentOrganizationId, deleteAllEmails, deleteAllPhones, deleteAllWebPages, deleteAllAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiOrganizationInBase {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    organizationNames: ").append(toIndentedString(organizationNames)).append("\n");
    sb.append("    displayNameType: ").append(toIndentedString(displayNameType)).append("\n");
    sb.append("    organizationDescriptions: ").append(toIndentedString(organizationDescriptions)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    parentOrganizationId: ").append(toIndentedString(parentOrganizationId)).append("\n");
    sb.append("    deleteAllEmails: ").append(toIndentedString(deleteAllEmails)).append("\n");
    sb.append("    deleteAllPhones: ").append(toIndentedString(deleteAllPhones)).append("\n");
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

