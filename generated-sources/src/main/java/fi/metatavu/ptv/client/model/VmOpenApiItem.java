/*
 * PTV Open Api version 7
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v7
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
 * OPEN API - View Model of item
 */
@ApiModel(description = "OPEN API - View Model of item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class VmOpenApiItem {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  public VmOpenApiItem id(UUID id) {
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

  public VmOpenApiItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the item.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the item.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiItem vmOpenApiItem = (VmOpenApiItem) o;
    return Objects.equals(this.id, vmOpenApiItem.id) &&
        Objects.equals(this.name, vmOpenApiItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

