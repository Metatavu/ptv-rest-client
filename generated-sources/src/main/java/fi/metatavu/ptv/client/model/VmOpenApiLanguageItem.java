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
 * OPEN API - View Model of language item
 */
@ApiModel(description = "OPEN API - View Model of language item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T09:05:02.286+03:00")
public class VmOpenApiLanguageItem {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("language")
  private String language = null;

  public VmOpenApiLanguageItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Localized value corresponding to the Language property value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Localized value corresponding to the Language property value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public VmOpenApiLanguageItem language(String language) {
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
    VmOpenApiLanguageItem vmOpenApiLanguageItem = (VmOpenApiLanguageItem) o;
    return Objects.equals(this.value, vmOpenApiLanguageItem.value) &&
        Objects.equals(this.language, vmOpenApiLanguageItem.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiLanguageItem {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

