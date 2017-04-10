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
 * OPEN API V4 - View Model of organization for IN api
 */
@ApiModel(description = "OPEN API V4 - View Model of organization for IN api")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T07:12:40.139+03:00")
public class V4VmOpenApiOrganizationIn   {
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

  public V4VmOpenApiOrganizationIn sourceId(String sourceId) {
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

  public V4VmOpenApiOrganizationIn oid(String oid) {
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

  public V4VmOpenApiOrganizationIn municipality(String municipality) {
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

  public V4VmOpenApiOrganizationIn organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Organization type (State, Municipality, RegionalOrganization, Organization, Company).
   * @return organizationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Organization type (State, Municipality, RegionalOrganization, Organization, Company).")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public V4VmOpenApiOrganizationIn businessCode(String businessCode) {
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

  public V4VmOpenApiOrganizationIn businessName(String businessName) {
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

  public V4VmOpenApiOrganizationIn organizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
    return this;
  }

  public V4VmOpenApiOrganizationIn addOrganizationNamesItem(VmOpenApiLocalizedListItem organizationNamesItem) {
    this.organizationNames.add(organizationNamesItem);
    return this;
  }

   /**
   * List of organization names.
   * @return organizationNames
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of organization names.")
  public List<VmOpenApiLocalizedListItem> getOrganizationNames() {
    return organizationNames;
  }

  public void setOrganizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
  }

  public V4VmOpenApiOrganizationIn displayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

   /**
   * Display name type (Name or AlternateName). Which name type should be used as the display name for the organization (OrganizationNames list).
   * @return displayNameType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Display name type (Name or AlternateName). Which name type should be used as the display name for the organization (OrganizationNames list).")
  public String getDisplayNameType() {
    return displayNameType;
  }

  public void setDisplayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
  }

  public V4VmOpenApiOrganizationIn organizationDescriptions(List<VmOpenApiLanguageItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
    return this;
  }

  public V4VmOpenApiOrganizationIn addOrganizationDescriptionsItem(VmOpenApiLanguageItem organizationDescriptionsItem) {
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

  public V4VmOpenApiOrganizationIn emailAddresses(List<V4VmOpenApiEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public V4VmOpenApiOrganizationIn addEmailAddressesItem(V4VmOpenApiEmail emailAddressesItem) {
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

  public V4VmOpenApiOrganizationIn phoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V4VmOpenApiOrganizationIn addPhoneNumbersItem(V4VmOpenApiPhone phoneNumbersItem) {
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

  public V4VmOpenApiOrganizationIn webPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V4VmOpenApiOrganizationIn addWebPagesItem(VmOpenApiWebPageWithOrderNumber webPagesItem) {
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

  public V4VmOpenApiOrganizationIn addresses(List<V4VmOpenApiAddressWithTypeIn> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V4VmOpenApiOrganizationIn addAddressesItem(V4VmOpenApiAddressWithTypeIn addressesItem) {
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

  public V4VmOpenApiOrganizationIn publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status (Draft or Published).
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "Publishing status (Draft or Published).")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V4VmOpenApiOrganizationIn parentOrganizationId(String parentOrganizationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V4VmOpenApiOrganizationIn v4VmOpenApiOrganizationIn = (V4VmOpenApiOrganizationIn) o;
    return Objects.equals(this.sourceId, v4VmOpenApiOrganizationIn.sourceId) &&
        Objects.equals(this.oid, v4VmOpenApiOrganizationIn.oid) &&
        Objects.equals(this.municipality, v4VmOpenApiOrganizationIn.municipality) &&
        Objects.equals(this.organizationType, v4VmOpenApiOrganizationIn.organizationType) &&
        Objects.equals(this.businessCode, v4VmOpenApiOrganizationIn.businessCode) &&
        Objects.equals(this.businessName, v4VmOpenApiOrganizationIn.businessName) &&
        Objects.equals(this.organizationNames, v4VmOpenApiOrganizationIn.organizationNames) &&
        Objects.equals(this.displayNameType, v4VmOpenApiOrganizationIn.displayNameType) &&
        Objects.equals(this.organizationDescriptions, v4VmOpenApiOrganizationIn.organizationDescriptions) &&
        Objects.equals(this.emailAddresses, v4VmOpenApiOrganizationIn.emailAddresses) &&
        Objects.equals(this.phoneNumbers, v4VmOpenApiOrganizationIn.phoneNumbers) &&
        Objects.equals(this.webPages, v4VmOpenApiOrganizationIn.webPages) &&
        Objects.equals(this.addresses, v4VmOpenApiOrganizationIn.addresses) &&
        Objects.equals(this.publishingStatus, v4VmOpenApiOrganizationIn.publishingStatus) &&
        Objects.equals(this.parentOrganizationId, v4VmOpenApiOrganizationIn.parentOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, oid, municipality, organizationType, businessCode, businessName, organizationNames, displayNameType, organizationDescriptions, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, parentOrganizationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiOrganizationIn {\n");
    
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

