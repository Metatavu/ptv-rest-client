/*
 * PTV Open Api version 8
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v8
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
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API - View Model of Saha organization
 */
@ApiModel(description = "OPEN API - View Model of Saha organization")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T13:25:17.639+03:00")
public class VmOpenApiOrganizationSaha {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("parentOrganizationId")
  private UUID parentOrganizationId = null;

  @JsonProperty("sahaId")
  private String sahaId = null;

  @JsonProperty("organizationNames")
  private List<VmOpenApiLocalizedListItem> organizationNames = null;

  @JsonProperty("modified")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified = null;

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiOrganizationSaha id(UUID id) {
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

  public VmOpenApiOrganizationSaha parentOrganizationId(UUID parentOrganizationId) {
    this.parentOrganizationId = parentOrganizationId;
    return this;
  }

   /**
   * Organizations parent organization identifier if exists.
   * @return parentOrganizationId
  **/
  @ApiModelProperty(value = "Organizations parent organization identifier if exists.")
  public UUID getParentOrganizationId() {
    return parentOrganizationId;
  }

  public void setParentOrganizationId(UUID parentOrganizationId) {
    this.parentOrganizationId = parentOrganizationId;
  }

  public VmOpenApiOrganizationSaha sahaId(String sahaId) {
    this.sahaId = sahaId;
    return this;
  }

   /**
   * Organizations Saha identifier if exists.
   * @return sahaId
  **/
  @ApiModelProperty(value = "Organizations Saha identifier if exists.")
  public String getSahaId() {
    return sahaId;
  }

  public void setSahaId(String sahaId) {
    this.sahaId = sahaId;
  }

  public VmOpenApiOrganizationSaha organizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
    return this;
  }

  public VmOpenApiOrganizationSaha addOrganizationNamesItem(VmOpenApiLocalizedListItem organizationNamesItem) {
    if (this.organizationNames == null) {
      this.organizationNames = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.organizationNames.add(organizationNamesItem);
    return this;
  }

   /**
   * List of organization names.
   * @return organizationNames
  **/
  @ApiModelProperty(value = "List of organization names.")
  public List<VmOpenApiLocalizedListItem> getOrganizationNames() {
    return organizationNames;
  }

  public void setOrganizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
  }

  public VmOpenApiOrganizationSaha modified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
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

  public VmOpenApiOrganizationSaha publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status (Published or Deleted).
   * @return publishingStatus
  **/
  @ApiModelProperty(value = "Publishing status (Published or Deleted).")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiOrganizationSaha vmOpenApiOrganizationSaha = (VmOpenApiOrganizationSaha) o;
    return Objects.equals(this.id, vmOpenApiOrganizationSaha.id) &&
        Objects.equals(this.parentOrganizationId, vmOpenApiOrganizationSaha.parentOrganizationId) &&
        Objects.equals(this.sahaId, vmOpenApiOrganizationSaha.sahaId) &&
        Objects.equals(this.organizationNames, vmOpenApiOrganizationSaha.organizationNames) &&
        Objects.equals(this.modified, vmOpenApiOrganizationSaha.modified) &&
        Objects.equals(this.publishingStatus, vmOpenApiOrganizationSaha.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentOrganizationId, sahaId, organizationNames, modified, publishingStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiOrganizationSaha {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentOrganizationId: ").append(toIndentedString(parentOrganizationId)).append("\n");
    sb.append("    sahaId: ").append(toIndentedString(sahaId)).append("\n");
    sb.append("    organizationNames: ").append(toIndentedString(organizationNames)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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

