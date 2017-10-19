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
 * OPEN API - View Model of phone. Version 4
 */
@ApiModel(description = "OPEN API - View Model of phone. Version 4")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-19T16:10:06.613+03:00")
public class V4VmOpenApiPhoneSimple {
  @JsonProperty("prefixNumber")
  private String prefixNumber = null;

  @JsonProperty("isFinnishServiceNumber")
  private Boolean isFinnishServiceNumber = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("language")
  private String language = null;

  public V4VmOpenApiPhoneSimple prefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

   /**
   * Prefix for the phone number.
   * @return prefixNumber
  **/
  @ApiModelProperty(value = "Prefix for the phone number.")
  public String getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public V4VmOpenApiPhoneSimple isFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
    return this;
  }

   /**
   * Defines if number is Finnish service number. If true prefix number can be left empty.
   * @return isFinnishServiceNumber
  **/
  @ApiModelProperty(value = "Defines if number is Finnish service number. If true prefix number can be left empty.")
  public Boolean getIsFinnishServiceNumber() {
    return isFinnishServiceNumber;
  }

  public void setIsFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
  }

  public V4VmOpenApiPhoneSimple number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Phone number.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Phone number.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public V4VmOpenApiPhoneSimple language(String language) {
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
    V4VmOpenApiPhoneSimple v4VmOpenApiPhoneSimple = (V4VmOpenApiPhoneSimple) o;
    return Objects.equals(this.prefixNumber, v4VmOpenApiPhoneSimple.prefixNumber) &&
        Objects.equals(this.isFinnishServiceNumber, v4VmOpenApiPhoneSimple.isFinnishServiceNumber) &&
        Objects.equals(this.number, v4VmOpenApiPhoneSimple.number) &&
        Objects.equals(this.language, v4VmOpenApiPhoneSimple.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixNumber, isFinnishServiceNumber, number, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiPhoneSimple {\n");
    
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    isFinnishServiceNumber: ").append(toIndentedString(isFinnishServiceNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

