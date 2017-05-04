/**
 * PTV Open Api version 5
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * OPEN API V4 - View Model of phone
 */
@ApiModel(description = "OPEN API V4 - View Model of phone")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T15:53:23.977+03:00")
public class V4VmOpenApiPhone   {
  @JsonProperty("additionalInformation")
  private String additionalInformation = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("chargeDescription")
  private String chargeDescription = null;

  @JsonProperty("prefixNumber")
  private String prefixNumber = null;

  @JsonProperty("isFinnishServiceNumber")
  private Boolean isFinnishServiceNumber = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("language")
  private String language = null;

  public V4VmOpenApiPhone additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Additional information. (Max.Length: 150).
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "Additional information. (Max.Length: 150).")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public V4VmOpenApiPhone serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Charged, Free or Other.
   * @return serviceChargeType
  **/
  @ApiModelProperty(example = "null", value = "Service charge type. Possible values are: Charged, Free or Other.")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public V4VmOpenApiPhone chargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
    return this;
  }

   /**
   * Charge description. (Max.Length: 150).
   * @return chargeDescription
  **/
  @ApiModelProperty(example = "null", value = "Charge description. (Max.Length: 150).")
  public String getChargeDescription() {
    return chargeDescription;
  }

  public void setChargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }

  public V4VmOpenApiPhone prefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

   /**
   * Prefix for the phone number.
   * @return prefixNumber
  **/
  @ApiModelProperty(example = "null", value = "Prefix for the phone number.")
  public String getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public V4VmOpenApiPhone isFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
    return this;
  }

   /**
   * Defines if number is Finnish service number. If true prefix number can be left empty.
   * @return isFinnishServiceNumber
  **/
  @ApiModelProperty(example = "null", value = "Defines if number is Finnish service number. If true prefix number can be left empty.")
  public Boolean getIsFinnishServiceNumber() {
    return isFinnishServiceNumber;
  }

  public void setIsFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
  }

  public V4VmOpenApiPhone number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Phone number.
   * @return number
  **/
  @ApiModelProperty(example = "null", required = true, value = "Phone number.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public V4VmOpenApiPhone language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language of this object. Valid values are: fi, sv or en.
   * @return language
  **/
  @ApiModelProperty(example = "null", required = true, value = "Language of this object. Valid values are: fi, sv or en.")
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
    V4VmOpenApiPhone v4VmOpenApiPhone = (V4VmOpenApiPhone) o;
    return Objects.equals(this.additionalInformation, v4VmOpenApiPhone.additionalInformation) &&
        Objects.equals(this.serviceChargeType, v4VmOpenApiPhone.serviceChargeType) &&
        Objects.equals(this.chargeDescription, v4VmOpenApiPhone.chargeDescription) &&
        Objects.equals(this.prefixNumber, v4VmOpenApiPhone.prefixNumber) &&
        Objects.equals(this.isFinnishServiceNumber, v4VmOpenApiPhone.isFinnishServiceNumber) &&
        Objects.equals(this.number, v4VmOpenApiPhone.number) &&
        Objects.equals(this.language, v4VmOpenApiPhone.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, serviceChargeType, chargeDescription, prefixNumber, isFinnishServiceNumber, number, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiPhone {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    chargeDescription: ").append(toIndentedString(chargeDescription)).append("\n");
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

