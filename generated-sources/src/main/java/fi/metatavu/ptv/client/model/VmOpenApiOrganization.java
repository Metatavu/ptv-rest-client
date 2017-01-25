/**
 * PTV Open Api
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v1
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
import fi.metatavu.ptv.client.model.VmOpenApiAddressWithType;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiOrganizationEmail;
import fi.metatavu.ptv.client.model.VmOpenApiOrganizationPhone;
import fi.metatavu.ptv.client.model.VmOpenApiOrganizationService;
import fi.metatavu.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiOrganization
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T15:52:10.525+02:00")
public class VmOpenApiOrganization   {
  @JsonProperty("municipality")
  private String municipality = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("oid")
  private String oid = null;

  @JsonProperty("streetAddressAsPostalAddress")
  private Boolean streetAddressAsPostalAddress = null;

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
  private List<VmOpenApiLocalizedListItem> organizationDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("emailAddresses")
  private List<VmOpenApiOrganizationEmail> emailAddresses = new ArrayList<VmOpenApiOrganizationEmail>();

  @JsonProperty("phoneNumbers")
  private List<VmOpenApiOrganizationPhone> phoneNumbers = new ArrayList<VmOpenApiOrganizationPhone>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("addresses")
  private List<VmOpenApiAddressWithType> addresses = new ArrayList<VmOpenApiAddressWithType>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("parentOrganization")
  private String parentOrganization = null;

  @JsonProperty("services")
  private List<VmOpenApiOrganizationService> services = new ArrayList<VmOpenApiOrganizationService>();

  public VmOpenApiOrganization municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Municipality name (like Mikkeli or Helsinki).
   * @return municipality
  **/
  @ApiModelProperty(example = "null", value = "Municipality name (like Mikkeli or Helsinki).")
  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public VmOpenApiOrganization id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entity identifier.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Entity identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VmOpenApiOrganization oid(String oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Organization OID.
   * @return oid
  **/
  @ApiModelProperty(example = "null", value = "Organization OID.")
  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public VmOpenApiOrganization streetAddressAsPostalAddress(Boolean streetAddressAsPostalAddress) {
    this.streetAddressAsPostalAddress = streetAddressAsPostalAddress;
    return this;
  }

   /**
   * This property is not used in the API anymore.
   * @return streetAddressAsPostalAddress
  **/
  @ApiModelProperty(example = "null", value = "This property is not used in the API anymore.")
  public Boolean getStreetAddressAsPostalAddress() {
    return streetAddressAsPostalAddress;
  }

  public void setStreetAddressAsPostalAddress(Boolean streetAddressAsPostalAddress) {
    this.streetAddressAsPostalAddress = streetAddressAsPostalAddress;
  }

  public VmOpenApiOrganization organizationType(String organizationType) {
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

  public VmOpenApiOrganization businessCode(String businessCode) {
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

  public VmOpenApiOrganization businessName(String businessName) {
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

  public VmOpenApiOrganization organizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
    return this;
  }

  public VmOpenApiOrganization addOrganizationNamesItem(VmOpenApiLocalizedListItem organizationNamesItem) {
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

  public VmOpenApiOrganization displayNameType(String displayNameType) {
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

  public VmOpenApiOrganization organizationDescriptions(List<VmOpenApiLocalizedListItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
    return this;
  }

  public VmOpenApiOrganization addOrganizationDescriptionsItem(VmOpenApiLocalizedListItem organizationDescriptionsItem) {
    this.organizationDescriptions.add(organizationDescriptionsItem);
    return this;
  }

   /**
   * List of organizations descriptions.
   * @return organizationDescriptions
  **/
  @ApiModelProperty(example = "null", value = "List of organizations descriptions.")
  public List<VmOpenApiLocalizedListItem> getOrganizationDescriptions() {
    return organizationDescriptions;
  }

  public void setOrganizationDescriptions(List<VmOpenApiLocalizedListItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
  }

  public VmOpenApiOrganization emailAddresses(List<VmOpenApiOrganizationEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public VmOpenApiOrganization addEmailAddressesItem(VmOpenApiOrganizationEmail emailAddressesItem) {
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * List of organizations email addresses.
   * @return emailAddresses
  **/
  @ApiModelProperty(example = "null", value = "List of organizations email addresses.")
  public List<VmOpenApiOrganizationEmail> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<VmOpenApiOrganizationEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public VmOpenApiOrganization phoneNumbers(List<VmOpenApiOrganizationPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public VmOpenApiOrganization addPhoneNumbersItem(VmOpenApiOrganizationPhone phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of organizations phone numbers.
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "List of organizations phone numbers.")
  public List<VmOpenApiOrganizationPhone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<VmOpenApiOrganizationPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public VmOpenApiOrganization webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiOrganization addWebPagesItem(VmOpenApiWebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of organizations web pages.
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "List of organizations web pages.")
  public List<VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }

  public VmOpenApiOrganization addresses(List<VmOpenApiAddressWithType> addresses) {
    this.addresses = addresses;
    return this;
  }

  public VmOpenApiOrganization addAddressesItem(VmOpenApiAddressWithType addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of organizations addresses.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "List of organizations addresses.")
  public List<VmOpenApiAddressWithType> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<VmOpenApiAddressWithType> addresses) {
    this.addresses = addresses;
  }

  public VmOpenApiOrganization publishingStatus(String publishingStatus) {
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

  public VmOpenApiOrganization parentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
    return this;
  }

   /**
   * Organizations parent organization identifier if exists.
   * @return parentOrganization
  **/
  @ApiModelProperty(example = "null", value = "Organizations parent organization identifier if exists.")
  public String getParentOrganization() {
    return parentOrganization;
  }

  public void setParentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
  }

  public VmOpenApiOrganization services(List<VmOpenApiOrganizationService> services) {
    this.services = services;
    return this;
  }

  public VmOpenApiOrganization addServicesItem(VmOpenApiOrganizationService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * List of organizations services.
   * @return services
  **/
  @ApiModelProperty(example = "null", value = "List of organizations services.")
  public List<VmOpenApiOrganizationService> getServices() {
    return services;
  }

  public void setServices(List<VmOpenApiOrganizationService> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiOrganization vmOpenApiOrganization = (VmOpenApiOrganization) o;
    return Objects.equals(this.municipality, vmOpenApiOrganization.municipality) &&
        Objects.equals(this.id, vmOpenApiOrganization.id) &&
        Objects.equals(this.oid, vmOpenApiOrganization.oid) &&
        Objects.equals(this.streetAddressAsPostalAddress, vmOpenApiOrganization.streetAddressAsPostalAddress) &&
        Objects.equals(this.organizationType, vmOpenApiOrganization.organizationType) &&
        Objects.equals(this.businessCode, vmOpenApiOrganization.businessCode) &&
        Objects.equals(this.businessName, vmOpenApiOrganization.businessName) &&
        Objects.equals(this.organizationNames, vmOpenApiOrganization.organizationNames) &&
        Objects.equals(this.displayNameType, vmOpenApiOrganization.displayNameType) &&
        Objects.equals(this.organizationDescriptions, vmOpenApiOrganization.organizationDescriptions) &&
        Objects.equals(this.emailAddresses, vmOpenApiOrganization.emailAddresses) &&
        Objects.equals(this.phoneNumbers, vmOpenApiOrganization.phoneNumbers) &&
        Objects.equals(this.webPages, vmOpenApiOrganization.webPages) &&
        Objects.equals(this.addresses, vmOpenApiOrganization.addresses) &&
        Objects.equals(this.publishingStatus, vmOpenApiOrganization.publishingStatus) &&
        Objects.equals(this.parentOrganization, vmOpenApiOrganization.parentOrganization) &&
        Objects.equals(this.services, vmOpenApiOrganization.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(municipality, id, oid, streetAddressAsPostalAddress, organizationType, businessCode, businessName, organizationNames, displayNameType, organizationDescriptions, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, parentOrganization, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiOrganization {\n");
    
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    streetAddressAsPostalAddress: ").append(toIndentedString(streetAddressAsPostalAddress)).append("\n");
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
    sb.append("    parentOrganization: ").append(toIndentedString(parentOrganization)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
