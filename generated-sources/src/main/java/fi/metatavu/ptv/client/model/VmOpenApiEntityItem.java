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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

/**
 * OPEN API - View Model of entity item
 */
@ApiModel(description = "OPEN API - View Model of entity item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class VmOpenApiEntityItem {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("modified")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified = null;

  public VmOpenApiEntityItem id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Id of the item.
   * @return id
  **/
  @ApiModelProperty(value = "Id of the item.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public VmOpenApiEntityItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the item.
   * @return type
  **/
  @ApiModelProperty(value = "Type of the item.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiEntityItem modified(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime modified) {
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
    VmOpenApiEntityItem vmOpenApiEntityItem = (VmOpenApiEntityItem) o;
    return Objects.equals(this.id, vmOpenApiEntityItem.id) &&
        Objects.equals(this.type, vmOpenApiEntityItem.type) &&
        Objects.equals(this.modified, vmOpenApiEntityItem.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiEntityItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

