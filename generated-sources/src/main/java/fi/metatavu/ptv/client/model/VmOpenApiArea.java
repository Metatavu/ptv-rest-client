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
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiMunicipality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * OPEN API - View Model of Area
 */
@ApiModel(description = "OPEN API - View Model of Area")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T15:53:23.977+03:00")
public class VmOpenApiArea   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private List<VmOpenApiLanguageItem> name = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("municipalities")
  private List<VmOpenApiMunicipality> municipalities = new ArrayList<VmOpenApiMunicipality>();

  public VmOpenApiArea type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the area (Municipality, Province, BusinessRegions, HospitalRegions).
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of the area (Municipality, Province, BusinessRegions, HospitalRegions).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiArea code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of the area.
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Code of the area.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VmOpenApiArea name(List<VmOpenApiLanguageItem> name) {
    this.name = name;
    return this;
  }

  public VmOpenApiArea addNameItem(VmOpenApiLanguageItem nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * Localized list of names for the area
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Localized list of names for the area")
  public List<VmOpenApiLanguageItem> getName() {
    return name;
  }

  public void setName(List<VmOpenApiLanguageItem> name) {
    this.name = name;
  }

  public VmOpenApiArea municipalities(List<VmOpenApiMunicipality> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  public VmOpenApiArea addMunicipalitiesItem(VmOpenApiMunicipality municipalitiesItem) {
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * List of municipalities including municipality code and a localized list of municipality names.
   * @return municipalities
  **/
  @ApiModelProperty(example = "null", value = "List of municipalities including municipality code and a localized list of municipality names.")
  public List<VmOpenApiMunicipality> getMunicipalities() {
    return municipalities;
  }

  public void setMunicipalities(List<VmOpenApiMunicipality> municipalities) {
    this.municipalities = municipalities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiArea vmOpenApiArea = (VmOpenApiArea) o;
    return Objects.equals(this.type, vmOpenApiArea.type) &&
        Objects.equals(this.code, vmOpenApiArea.code) &&
        Objects.equals(this.name, vmOpenApiArea.name) &&
        Objects.equals(this.municipalities, vmOpenApiArea.municipalities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, name, municipalities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiArea {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
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

