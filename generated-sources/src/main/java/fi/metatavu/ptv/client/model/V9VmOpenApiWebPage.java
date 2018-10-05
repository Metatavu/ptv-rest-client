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

/**
 * Open API web page model.
 */
@ApiModel(description = "Open API web page model.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:38:50.296+03:00")
public class V9VmOpenApiWebPage {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("language")
  private String language = null;

  public V9VmOpenApiWebPage url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Web page url. (Max.Length: 500).
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Web page url. (Max.Length: 500).")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public V9VmOpenApiWebPage value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Name of the web page. (Max.Length: 100).
   * @return value
  **/
  @ApiModelProperty(value = "Name of the web page. (Max.Length: 100).")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public V9VmOpenApiWebPage language(String language) {
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
    V9VmOpenApiWebPage v9VmOpenApiWebPage = (V9VmOpenApiWebPage) o;
    return Objects.equals(this.url, v9VmOpenApiWebPage.url) &&
        Objects.equals(this.value, v9VmOpenApiWebPage.value) &&
        Objects.equals(this.language, v9VmOpenApiWebPage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, value, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V9VmOpenApiWebPage {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

