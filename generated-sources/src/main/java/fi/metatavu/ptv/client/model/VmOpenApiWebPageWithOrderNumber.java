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
 * OPEN API - View Model of web page with order number
 */
@ApiModel(description = "OPEN API - View Model of web page with order number")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T09:05:02.286+03:00")
public class VmOpenApiWebPageWithOrderNumber {
  @JsonProperty("orderNumber")
  private String orderNumber = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("language")
  private String language = null;

  public VmOpenApiWebPageWithOrderNumber orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * The order of web pages.
   * @return orderNumber
  **/
  @ApiModelProperty(required = true, value = "The order of web pages.")
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public VmOpenApiWebPageWithOrderNumber value(String value) {
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

  public VmOpenApiWebPageWithOrderNumber url(String url) {
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

  public VmOpenApiWebPageWithOrderNumber language(String language) {
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
    VmOpenApiWebPageWithOrderNumber vmOpenApiWebPageWithOrderNumber = (VmOpenApiWebPageWithOrderNumber) o;
    return Objects.equals(this.orderNumber, vmOpenApiWebPageWithOrderNumber.orderNumber) &&
        Objects.equals(this.value, vmOpenApiWebPageWithOrderNumber.value) &&
        Objects.equals(this.url, vmOpenApiWebPageWithOrderNumber.url) &&
        Objects.equals(this.language, vmOpenApiWebPageWithOrderNumber.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber, value, url, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiWebPageWithOrderNumber {\n");
    
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
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

