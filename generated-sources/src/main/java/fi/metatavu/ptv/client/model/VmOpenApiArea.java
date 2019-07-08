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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class VmOpenApiArea {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private List<VmOpenApiLanguageItem> name = null;

  @JsonProperty("municipalities")
  private List<VmOpenApiMunicipality> municipalities = null;

  public VmOpenApiArea type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the area. Possible values are: Municipality, Region, BusinessSubRegion, HospitalDistrict.  In version 7 and older: Municipality, Province, BusinessRegions, HospitalRegions.
   * @return type
  **/
  @ApiModelProperty(value = "Type of the area. Possible values are: Municipality, Region, BusinessSubRegion, HospitalDistrict.  In version 7 and older: Municipality, Province, BusinessRegions, HospitalRegions.")
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
  @ApiModelProperty(value = "Code of the area.")
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
    if (this.name == null) {
      this.name = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * Localized list of names for the area
   * @return name
  **/
  @ApiModelProperty(value = "Localized list of names for the area")
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
    if (this.municipalities == null) {
      this.municipalities = new ArrayList<VmOpenApiMunicipality>();
    }
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * List of municipalities including municipality code and a localized list of municipality names.
   * @return municipalities
  **/
  @ApiModelProperty(value = "List of municipalities including municipality code and a localized list of municipality names.")
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

