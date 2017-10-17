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
 * Open API web page model.
 */
@ApiModel(description = "Open API web page model.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T11:41:22.679+03:00")
public class V4VmOpenApiWebPage {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("language")
  private String language = null;

  public V4VmOpenApiWebPage value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Name of the web page. (Max.Length: 110).
   * @return value
  **/
  @ApiModelProperty(value = "Name of the web page. (Max.Length: 110).")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public V4VmOpenApiWebPage url(String url) {
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

  public V4VmOpenApiWebPage language(String language) {
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
    V4VmOpenApiWebPage v4VmOpenApiWebPage = (V4VmOpenApiWebPage) o;
    return Objects.equals(this.value, v4VmOpenApiWebPage.value) &&
        Objects.equals(this.url, v4VmOpenApiWebPage.url) &&
        Objects.equals(this.language, v4VmOpenApiWebPage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, url, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiWebPage {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

