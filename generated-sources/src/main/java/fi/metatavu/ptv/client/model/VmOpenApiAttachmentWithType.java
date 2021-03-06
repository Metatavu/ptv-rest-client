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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OPEN API - View Model of Attachment with type
 */
@ApiModel(description = "OPEN API - View Model of Attachment with type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class VmOpenApiAttachmentWithType {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("language")
  private String language = null;

  public VmOpenApiAttachmentWithType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the attachment. Valid values are: Form or Attachment.
   * @return type
  **/
  @ApiModelProperty(value = "Type of the attachment. Valid values are: Form or Attachment.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiAttachmentWithType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the attachment.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the attachment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VmOpenApiAttachmentWithType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the attachment.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the attachment.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VmOpenApiAttachmentWithType url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url to the attachment.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Url to the attachment.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public VmOpenApiAttachmentWithType language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language of this object. Valid values are: fi, sv or en.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "Language of this object. Valid values are: fi, sv or en.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiAttachmentWithType vmOpenApiAttachmentWithType = (VmOpenApiAttachmentWithType) o;
    return Objects.equals(this.type, vmOpenApiAttachmentWithType.type) &&
        Objects.equals(this.name, vmOpenApiAttachmentWithType.name) &&
        Objects.equals(this.description, vmOpenApiAttachmentWithType.description) &&
        Objects.equals(this.url, vmOpenApiAttachmentWithType.url) &&
        Objects.equals(this.language, vmOpenApiAttachmentWithType.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, description, url, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiAttachmentWithType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

