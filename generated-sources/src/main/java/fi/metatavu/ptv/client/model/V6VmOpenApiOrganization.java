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
import fi.metatavu.ptv.client.model.V5VmOpenApiAddressWithTypeAndCoordinates;
import fi.metatavu.ptv.client.model.V5VmOpenApiOrganizationService;
import fi.metatavu.ptv.client.model.VmOpenApiArea;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.metatavu.ptv.client.model.VmOpenApiMunicipality;
import fi.metatavu.ptv.client.model.VmOpenApiNameTypeByLanguage;
import fi.metatavu.ptv.client.model.VmOpenApiWebPageWithOrderNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API V6 - View Model of organization
 */
@ApiModel(description = "OPEN API V6 - View Model of organization")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-19T16:10:06.613+03:00")
public class V6VmOpenApiOrganization {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("oid")
  private String oid = null;

  @JsonProperty("parentOrganization")
  private UUID parentOrganization = null;

  @JsonProperty("organizationType")
  private String organizationType = null;

  @JsonProperty("municipality")
  private VmOpenApiMunicipality municipality = null;

  @JsonProperty("businessCode")
  private String businessCode = null;

  @JsonProperty("businessName")
  private String businessName = null;

  @JsonProperty("organizationNames")
  private List<VmOpenApiLocalizedListItem> organizationNames = null;

  @JsonProperty("displayNameType")
  private List<VmOpenApiNameTypeByLanguage> displayNameType = null;

  @JsonProperty("areaType")
  private String areaType = null;

  @JsonProperty("areas")
  private List<VmOpenApiArea> areas = null;

  @JsonProperty("organizationDescriptions")
  private List<VmOpenApiLocalizedListItem> organizationDescriptions = null;

  @JsonProperty("emailAddresses")
  private List<V4VmOpenApiEmail> emailAddresses = null;

  @JsonProperty("phoneNumbers")
  private List<V4VmOpenApiPhone> phoneNumbers = null;

  @JsonProperty("webPages")
  private List<VmOpenApiWebPageWithOrderNumber> webPages = null;

  @JsonProperty("addresses")
  private List<V5VmOpenApiAddressWithTypeAndCoordinates> addresses = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("services")
  private List<V5VmOpenApiOrganizationService> services = null;

  @JsonProperty("modified")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified = null;

  public V6VmOpenApiOrganization id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Entity identifier.
   * @return id
  **/
  @ApiModelProperty(value = "Entity identifier.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public V6VmOpenApiOrganization oid(String oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Organization OID. - must match the regex @\&quot;^[A-Za-z0-9.-]*$\&quot;
   * @return oid
  **/
  @ApiModelProperty(value = "Organization OID. - must match the regex @\"^[A-Za-z0-9.-]*$\"")
  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public V6VmOpenApiOrganization parentOrganization(UUID parentOrganization) {
    this.parentOrganization = parentOrganization;
    return this;
  }

   /**
   * Organizations parent organization identifier if exists.
   * @return parentOrganization
  **/
  @ApiModelProperty(value = "Organizations parent organization identifier if exists.")
  public UUID getParentOrganization() {
    return parentOrganization;
  }

  public void setParentOrganization(UUID parentOrganization) {
    this.parentOrganization = parentOrganization;
  }

  public V6VmOpenApiOrganization organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Organization type (State, Municipality, RegionalOrganization, Organization, Company).
   * @return organizationType
  **/
  @ApiModelProperty(value = "Organization type (State, Municipality, RegionalOrganization, Organization, Company).")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public V6VmOpenApiOrganization municipality(VmOpenApiMunicipality municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Municipality including municipality code and a localized list of municipality names.
   * @return municipality
  **/
  @ApiModelProperty(value = "Municipality including municipality code and a localized list of municipality names.")
  public VmOpenApiMunicipality getMunicipality() {
    return municipality;
  }

  public void setMunicipality(VmOpenApiMunicipality municipality) {
    this.municipality = municipality;
  }

  public V6VmOpenApiOrganization businessCode(String businessCode) {
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

  public V6VmOpenApiOrganization businessName(String businessName) {
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

  public V6VmOpenApiOrganization organizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
    return this;
  }

  public V6VmOpenApiOrganization addOrganizationNamesItem(VmOpenApiLocalizedListItem organizationNamesItem) {
    if (this.organizationNames == null) {
      this.organizationNames = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.organizationNames.add(organizationNamesItem);
    return this;
  }

   /**
   * List of organization names. (Max.Length: 100).
   * @return organizationNames
  **/
  @ApiModelProperty(value = "List of organization names. (Max.Length: 100).")
  public List<VmOpenApiLocalizedListItem> getOrganizationNames() {
    return organizationNames;
  }

  public void setOrganizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
  }

  public V6VmOpenApiOrganization displayNameType(List<VmOpenApiNameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

  public V6VmOpenApiOrganization addDisplayNameTypeItem(VmOpenApiNameTypeByLanguage displayNameTypeItem) {
    if (this.displayNameType == null) {
      this.displayNameType = new ArrayList<VmOpenApiNameTypeByLanguage>();
    }
    this.displayNameType.add(displayNameTypeItem);
    return this;
  }

   /**
   * List of Display name types (Name or AlternateName) for each language version of OrganizationNames.
   * @return displayNameType
  **/
  @ApiModelProperty(value = "List of Display name types (Name or AlternateName) for each language version of OrganizationNames.")
  public List<VmOpenApiNameTypeByLanguage> getDisplayNameType() {
    return displayNameType;
  }

  public void setDisplayNameType(List<VmOpenApiNameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
  }

  public V6VmOpenApiOrganization areaType(String areaType) {
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

  public V6VmOpenApiOrganization areas(List<VmOpenApiArea> areas) {
    this.areas = areas;
    return this;
  }

  public V6VmOpenApiOrganization addAreasItem(VmOpenApiArea areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<VmOpenApiArea>();
    }
    this.areas.add(areasItem);
    return this;
  }

   /**
   * List of organization areas.
   * @return areas
  **/
  @ApiModelProperty(value = "List of organization areas.")
  public List<VmOpenApiArea> getAreas() {
    return areas;
  }

  public void setAreas(List<VmOpenApiArea> areas) {
    this.areas = areas;
  }

  public V6VmOpenApiOrganization organizationDescriptions(List<VmOpenApiLocalizedListItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
    return this;
  }

  public V6VmOpenApiOrganization addOrganizationDescriptionsItem(VmOpenApiLocalizedListItem organizationDescriptionsItem) {
    if (this.organizationDescriptions == null) {
      this.organizationDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.organizationDescriptions.add(organizationDescriptionsItem);
    return this;
  }

   /**
   * Localized list of organization descriptions. (Max.Length: 2500 Description). (Max.Length: 150 ShortDescription).
   * @return organizationDescriptions
  **/
  @ApiModelProperty(value = "Localized list of organization descriptions. (Max.Length: 2500 Description). (Max.Length: 150 ShortDescription).")
  public List<VmOpenApiLocalizedListItem> getOrganizationDescriptions() {
    return organizationDescriptions;
  }

  public void setOrganizationDescriptions(List<VmOpenApiLocalizedListItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
  }

  public V6VmOpenApiOrganization emailAddresses(List<V4VmOpenApiEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public V6VmOpenApiOrganization addEmailAddressesItem(V4VmOpenApiEmail emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<V4VmOpenApiEmail>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * List of organizations email addresses.
   * @return emailAddresses
  **/
  @ApiModelProperty(value = "List of organizations email addresses.")
  public List<V4VmOpenApiEmail> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<V4VmOpenApiEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public V6VmOpenApiOrganization phoneNumbers(List<V4VmOpenApiPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public V6VmOpenApiOrganization addPhoneNumbersItem(V4VmOpenApiPhone phoneNumbersItem) {
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

  public V6VmOpenApiOrganization webPages(List<VmOpenApiWebPageWithOrderNumber> webPages) {
    this.webPages = webPages;
    return this;
  }

  public V6VmOpenApiOrganization addWebPagesItem(VmOpenApiWebPageWithOrderNumber webPagesItem) {
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

  public V6VmOpenApiOrganization addresses(List<V5VmOpenApiAddressWithTypeAndCoordinates> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V6VmOpenApiOrganization addAddressesItem(V5VmOpenApiAddressWithTypeAndCoordinates addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<V5VmOpenApiAddressWithTypeAndCoordinates>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of organizations addresses.
   * @return addresses
  **/
  @ApiModelProperty(value = "List of organizations addresses.")
  public List<V5VmOpenApiAddressWithTypeAndCoordinates> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V5VmOpenApiAddressWithTypeAndCoordinates> addresses) {
    this.addresses = addresses;
  }

  public V6VmOpenApiOrganization publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status (Draft, Published, Deleted or Modified).
   * @return publishingStatus
  **/
  @ApiModelProperty(value = "Publishing status (Draft, Published, Deleted or Modified).")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public V6VmOpenApiOrganization services(List<V5VmOpenApiOrganizationService> services) {
    this.services = services;
    return this;
  }

  public V6VmOpenApiOrganization addServicesItem(V5VmOpenApiOrganizationService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<V5VmOpenApiOrganizationService>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * List of organizations services.
   * @return services
  **/
  @ApiModelProperty(value = "List of organizations services.")
  public List<V5VmOpenApiOrganizationService> getServices() {
    return services;
  }

  public void setServices(List<V5VmOpenApiOrganizationService> services) {
    this.services = services;
  }

  public V6VmOpenApiOrganization modified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Date when item was modified/created (UTC).
   * @return modified
  **/
  @ApiModelProperty(value = "Date when item was modified/created (UTC).")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V6VmOpenApiOrganization v6VmOpenApiOrganization = (V6VmOpenApiOrganization) o;
    return Objects.equals(this.id, v6VmOpenApiOrganization.id) &&
        Objects.equals(this.oid, v6VmOpenApiOrganization.oid) &&
        Objects.equals(this.parentOrganization, v6VmOpenApiOrganization.parentOrganization) &&
        Objects.equals(this.organizationType, v6VmOpenApiOrganization.organizationType) &&
        Objects.equals(this.municipality, v6VmOpenApiOrganization.municipality) &&
        Objects.equals(this.businessCode, v6VmOpenApiOrganization.businessCode) &&
        Objects.equals(this.businessName, v6VmOpenApiOrganization.businessName) &&
        Objects.equals(this.organizationNames, v6VmOpenApiOrganization.organizationNames) &&
        Objects.equals(this.displayNameType, v6VmOpenApiOrganization.displayNameType) &&
        Objects.equals(this.areaType, v6VmOpenApiOrganization.areaType) &&
        Objects.equals(this.areas, v6VmOpenApiOrganization.areas) &&
        Objects.equals(this.organizationDescriptions, v6VmOpenApiOrganization.organizationDescriptions) &&
        Objects.equals(this.emailAddresses, v6VmOpenApiOrganization.emailAddresses) &&
        Objects.equals(this.phoneNumbers, v6VmOpenApiOrganization.phoneNumbers) &&
        Objects.equals(this.webPages, v6VmOpenApiOrganization.webPages) &&
        Objects.equals(this.addresses, v6VmOpenApiOrganization.addresses) &&
        Objects.equals(this.publishingStatus, v6VmOpenApiOrganization.publishingStatus) &&
        Objects.equals(this.services, v6VmOpenApiOrganization.services) &&
        Objects.equals(this.modified, v6VmOpenApiOrganization.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, oid, parentOrganization, organizationType, municipality, businessCode, businessName, organizationNames, displayNameType, areaType, areas, organizationDescriptions, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, services, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    parentOrganization: ").append(toIndentedString(parentOrganization)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    organizationNames: ").append(toIndentedString(organizationNames)).append("\n");
    sb.append("    displayNameType: ").append(toIndentedString(displayNameType)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    organizationDescriptions: ").append(toIndentedString(organizationDescriptions)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

