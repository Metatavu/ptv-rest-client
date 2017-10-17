/*
 * PTV Open Api version 6
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v6
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
import fi.metatavu.ptv.client.model.V4VmOpenApiEmail;
import fi.metatavu.ptv.client.model.V4VmOpenApiPhone;
import fi.metatavu.ptv.client.model.V5VmOpenApiAddressWithTypeIn;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiNameTypeByLanguage;
import fi.metatavu.ptv.client.model.VmOpenApiWebPageWithOrderNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V5 - View Model of organization for IN api
 */
@ApiModel(description = "OPEN API V5 - View Model of organization for IN api")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T11:41:22.679+03:00")
public class V5VmOpenApiOrganizationIn {
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
  private List<VmOpenApiNameTypeByLanguage> displayNameType = new ArrayList<VmOpenApiNameTypeByLanguage>();

  @JsonProperty("organizationDescriptions")
  private List<VmOpenApiLanguageItem> organizationDescriptions = null;

  @JsonProperty("areaType")
  private String areaType = null;

  @JsonProperty("subAreaType")
  private String subAreaType = null;

  @JsonProperty("areas")
  private List<String> areas = null;

  @JsonProperty("emailAddresses")
  private List<V4VmOpenApiEmail> emailAddresses = null;

  @JsonProperty("phoneNumbers")
  private List<V4VmOpenApiPhone> phoneNumbers = null;

  @JsonProperty("webPages")
  private List<VmOpenApiWebPageWithOrderNumber> webPages = null;

  @JsonProperty("addresses")
  private List<V5VmOpenApiAddressWithTypeIn> addresses = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("parentOrganizationId")
  private String parentOrganizationId = null;

  public V5VmOpenApiOrganizationIn sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Organization external system identifier.
   * @return sourceId
  **/
  @ApiModelProperty(value = "Organization external system identifier.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public V5VmOpenApiOrganizationIn oid(String oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Organization OID. - must match the regex @\&quot;^[A-Za-z0-9.-]*$\&quot; (Max.Length: 100).
   * @return oid
  **/
  @ApiModelProperty(value = "Organization OID. - must match the regex @\"^[A-Za-z0-9.-]*$\" (Max.Length: 100).")
  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public V5VmOpenApiOrganizationIn municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Municipality code (like 491 or 091).
   * @return municipality
  **/
  @ApiModelProperty(value = "Municipality code (like 491 or 091).")
  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public V5VmOpenApiOrganizationIn organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Organization type (State, Municipality, RegionalOrganization, Organization, Company).
   * @return organizationType
  **/
  @ApiModelProperty(required = true, value = "Organization type (State, Municipality, RegionalOrganization, Organization, Company).")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public V5VmOpenApiOrganizationIn businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

   /**
   * Organization business code (Y-tunnus).
   * @return businessCode
  **/
  @ApiModelProperty(value = "Organization business code (Y-tunnus).")
  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public V5VmOpenApiOrganizationIn businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Organization business name (name used for business code).
   * @return businessName
  **/
  @ApiModelProperty(value = "Organization business name (name used for business code).")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public V5VmOpenApiOrganizationIn organizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
    return this;
  }

  public V5VmOpenApiOrganizationIn addOrganizationNamesItem(VmOpenApiLocalizedListItem organizationNamesItem) {
    this.organizationNames.add(organizationNamesItem);
    return this;
  }

   /**
   * List of organization names. (Max.Length: 100).
   * @return organizationNames
  **/
  @ApiModelProperty(required = true, value = "List of organization names. (Max.Length: 100).")
  public List<VmOpenApiLocalizedListItem> getOrganizationNames() {
    return organizationNames;
  }

  public void setOrganizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
  }

  public V5VmOpenApiOrganizationIn displayNameType(List<VmOpenApiNameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

  public V5VmOpenApiOrganizationIn addDisplayNameTypeItem(VmOpenApiNameTypeByLanguage displayNameTypeItem) {
    this.displayNameType.add(displayNameTypeItem);
    return this;
  }

   /**
   * List of Display name types (Name or AlternateName) for each language version of OrganizationNames.
   * @return displayNameType
  **/
  @ApiModelProperty(required = true, value = "List of Display name types (Name or AlternateName) for each language version of OrganizationNames.")
  public List<VmOpenApiNameTypeByLanguage> getDisplayNameType() {
    return displayNameType;
  }

  public void setDisplayNameType(List<VmOpenApiNameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
  }

  public V5VmOpenApiOrganizationIn organizationDescriptions(List<VmOpenApiLanguageItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
    return this;
  }

  public V5VmOpenApiOrganizationIn addOrganizationDescriptionsItem(VmOpenApiLanguageItem organizationDescriptionsItem) {
    if (this.organizationDescriptions == null) {
      this.organizationDescriptions = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.organizationDescriptions.add(organizationDescriptionsItem);
    return this;
  }

   /**
   * Localized list of organization descriptions. (Max.Length: 2500).
   * @return organizationDescriptions
  **/
  @ApiModelProperty(value = "Localized list of organization descriptions. (Max.Length: 2500).")
  public List<VmOpenApiLanguageItem> getOrganizationDescriptions() {
    return organizationDescriptions;
  }

  public void setOrganizationDescriptions(List<VmOpenApiLanguageItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
  }

  public V5VmOpenApiOrganizationIn areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).
   * @return areaType
  **/
  @ApiModelProperty(value = "Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public V5VmOpenApiOrganizationIn subAreaType(String subAreaType) {
    this.subAreaType = subAreaType;
    return this;
  }

   /**
   * Sub area type (Municipality, Province, BusinessRegions, HospitalRegions).
   * @return subAreaType
  **/
  @ApiModelProperty(value = "Sub area type (Municipality, Province, BusinessRegions, HospitalRegions).")
  public String getSubAreaType() {
    return subAreaType;
  }

  public void setSubAreaType(String subAreaType) {
    this.subAreaType = subAreaType;
  }

  public V5VmOpenApiOrganizationIn areas(List<String> areas) {
    this.areas = areas;
    return this;
  }

  public V5VmOpenApiOrganizationIn addAreasItem(String areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<String>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * Area codes related to sub area type. For example if SubAreaType &#x3D; Municipality, Areas-list need to include municipality codes like 491 or 091.
   * @return areas
  **/
  @ApiModelProperty(value = "Area codes related to sub area type. For example if SubAreaType = Municipality, Areas-list need to include municipality codes like 491 or 091.")
  public List<String> getAreas() {
    return areas;
  }

  public void setAreas(List<String> areas) {
    this.areas = areas;
  }

  public V5VmOpenApiOrganizationIn emailAddresses(List<V4VmOpenApiEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public V5VmOpenApiOrganizationIn addEmailAddressesItem(V4VmOpenApiEmail emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<V4VmOpenApiEmail>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * List of email addresses.
   * @return emailAddresses
  **/
  @ApiModelProperty(value = "List of email addresses.")
  public List<V4VmOpenApiEmail> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<V4VmOpenApiEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public V5VmOpenApiOrganizationIn phoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V5VmOpenApiOrganizationIn addPhoneNumbersItem(V4VmOpenApiPhone phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<V4VmOpenApiPhone>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of organizations phone numbers.
   * @return phoneNumbers
  **/
  @ApiModelProperty(value = "List of organizations phone numbers.")
  public List<V4VmOpenApiPhone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public V5VmOpenApiOrganizationIn webPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V5VmOpenApiOrganizationIn addWebPagesItem(VmOpenApiWebPageWithOrderNumber webPagesItem) {
    if (this.webPages == null) {
      this.webPages = new ArrayList<VmOpenApiWebPageWithOrderNumber>();
    }
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of organizations web pages.
   * @return webPages
  **/
  @ApiModelProperty(value = "List of organizations web pages.")
  public List<VmOpenApiWebPageWithOrderNumber> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
  }

  public V5VmOpenApiOrganizationIn addresses(List<V5VmOpenApiAddressWithTypeIn> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V5VmOpenApiOrganizationIn addAddressesItem(V5VmOpenApiAddressWithTypeIn addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<V5VmOpenApiAddressWithTypeIn>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of addresses.
   * @return addresses
  **/
  @ApiModelProperty(value = "List of addresses.")
  public List<V5VmOpenApiAddressWithTypeIn> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V5VmOpenApiAddressWithTypeIn> addresses) {
    this.addresses = addresses;
  }

  public V5VmOpenApiOrganizationIn publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status (Draft or Published).
   * @return publishingStatus
  **/
  @ApiModelProperty(required = true, value = "Publishing status (Draft or Published).")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V5VmOpenApiOrganizationIn parentOrganizationId(String parentOrganizationId) {
    this.parentOrganizationId = parentOrganizationId;
    return this;
  }

   /**
   * Parent organization identifier if exists.
   * @return parentOrganizationId
  **/
  @ApiModelProperty(value = "Parent organization identifier if exists.")
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
    V5VmOpenApiOrganizationIn v5VmOpenApiOrganizationIn = (V5VmOpenApiOrganizationIn) o;
    return Objects.equals(this.sourceId, v5VmOpenApiOrganizationIn.sourceId) &&
        Objects.equals(this.oid, v5VmOpenApiOrganizationIn.oid) &&
        Objects.equals(this.municipality, v5VmOpenApiOrganizationIn.municipality) &&
        Objects.equals(this.organizationType, v5VmOpenApiOrganizationIn.organizationType) &&
        Objects.equals(this.businessCode, v5VmOpenApiOrganizationIn.businessCode) &&
        Objects.equals(this.businessName, v5VmOpenApiOrganizationIn.businessName) &&
        Objects.equals(this.organizationNames, v5VmOpenApiOrganizationIn.organizationNames) &&
        Objects.equals(this.displayNameType, v5VmOpenApiOrganizationIn.displayNameType) &&
        Objects.equals(this.organizationDescriptions, v5VmOpenApiOrganizationIn.organizationDescriptions) &&
        Objects.equals(this.areaType, v5VmOpenApiOrganizationIn.areaType) &&
        Objects.equals(this.subAreaType, v5VmOpenApiOrganizationIn.subAreaType) &&
        Objects.equals(this.areas, v5VmOpenApiOrganizationIn.areas) &&
        Objects.equals(this.emailAddresses, v5VmOpenApiOrganizationIn.emailAddresses) &&
        Objects.equals(this.phoneNumbers, v5VmOpenApiOrganizationIn.phoneNumbers) &&
        Objects.equals(this.webPages, v5VmOpenApiOrganizationIn.webPages) &&
        Objects.equals(this.addresses, v5VmOpenApiOrganizationIn.addresses) &&
        Objects.equals(this.publishingStatus, v5VmOpenApiOrganizationIn.publishingStatus) &&
        Objects.equals(this.parentOrganizationId, v5VmOpenApiOrganizationIn.parentOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, oid, municipality, organizationType, businessCode, businessName, organizationNames, displayNameType, organizationDescriptions, areaType, subAreaType, areas, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, parentOrganizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V5VmOpenApiOrganizationIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    organizationNames: ").append(toIndentedString(organizationNames)).append("\n");
    sb.append("    displayNameType: ").append(toIndentedString(displayNameType)).append("\n");
    sb.append("    organizationDescriptions: ").append(toIndentedString(organizationDescriptions)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    subAreaType: ").append(toIndentedString(subAreaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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

