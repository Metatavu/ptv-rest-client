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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OPEN API - View Model of type by language
 */
@ApiModel(description = "OPEN API - View Model of type by language")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-18T13:10:37.869+03:00")
public class VmOpenApiNameTypeByLanguage {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("language")
  private String language = null;

  public VmOpenApiNameTypeByLanguage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * DisplayNameType preferred by language code (Name or AlternateName).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "DisplayNameType preferred by language code (Name or AlternateName).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiNameTypeByLanguage language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language code.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "Language code.")
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
    VmOpenApiNameTypeByLanguage vmOpenApiNameTypeByLanguage = (VmOpenApiNameTypeByLanguage) o;
    return Objects.equals(this.type, vmOpenApiNameTypeByLanguage.type) &&
        Objects.equals(this.language, vmOpenApiNameTypeByLanguage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiNameTypeByLanguage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

