/**
 * PTV Open Api
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v1
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
 * VmOpenApiLanguageItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T20:15:02.299+02:00")
public class VmOpenApiLanguageItem   {
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
  @ApiModelProperty(example = "null", required = true, value = "Localized value corresponding to the Language property value.")
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
  @ApiModelProperty(example = "null", required = true, value = "Language code.")
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

