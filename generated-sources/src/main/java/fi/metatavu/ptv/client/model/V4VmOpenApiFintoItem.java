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
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OPEN API V4 - View Model of finto item
 */
@ApiModel(description = "OPEN API V4 - View Model of finto item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:38:50.296+03:00")
public class V4VmOpenApiFintoItem {
  @JsonProperty("name")
  private List<VmOpenApiLanguageItem> name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("ontologyType")
  private String ontologyType = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("parentId")
  private UUID parentId = null;

  @JsonProperty("parentUri")
  private String parentUri = null;

  public V4VmOpenApiFintoItem name(List<VmOpenApiLanguageItem> name) {
    this.name = name;
    return this;
  }

  public V4VmOpenApiFintoItem addNameItem(VmOpenApiLanguageItem nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * List of localized entity names.
   * @return name
  **/
  @ApiModelProperty(value = "List of localized entity names.")
  public List<VmOpenApiLanguageItem> getName() {
    return name;
  }

  public void setName(List<VmOpenApiLanguageItem> name) {
    this.name = name;
  }

  public V4VmOpenApiFintoItem code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Entity code.
   * @return code
  **/
  @ApiModelProperty(value = "Entity code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public V4VmOpenApiFintoItem ontologyType(String ontologyType) {
    this.ontologyType = ontologyType;
    return this;
  }

   /**
   * Ontology term type.
   * @return ontologyType
  **/
  @ApiModelProperty(value = "Ontology term type.")
  public String getOntologyType() {
    return ontologyType;
  }

  public void setOntologyType(String ontologyType) {
    this.ontologyType = ontologyType;
  }

  public V4VmOpenApiFintoItem uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Entity uri.
   * @return uri
  **/
  @ApiModelProperty(value = "Entity uri.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public V4VmOpenApiFintoItem parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Entity parent identifier.
   * @return parentId
  **/
  @ApiModelProperty(value = "Entity parent identifier.")
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  public V4VmOpenApiFintoItem parentUri(String parentUri) {
    this.parentUri = parentUri;
    return this;
  }

   /**
   * Entity parent uri.
   * @return parentUri
  **/
  @ApiModelProperty(value = "Entity parent uri.")
  public String getParentUri() {
    return parentUri;
  }

  public void setParentUri(String parentUri) {
    this.parentUri = parentUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V4VmOpenApiFintoItem v4VmOpenApiFintoItem = (V4VmOpenApiFintoItem) o;
    return Objects.equals(this.name, v4VmOpenApiFintoItem.name) &&
        Objects.equals(this.code, v4VmOpenApiFintoItem.code) &&
        Objects.equals(this.ontologyType, v4VmOpenApiFintoItem.ontologyType) &&
        Objects.equals(this.uri, v4VmOpenApiFintoItem.uri) &&
        Objects.equals(this.parentId, v4VmOpenApiFintoItem.parentId) &&
        Objects.equals(this.parentUri, v4VmOpenApiFintoItem.parentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, ontologyType, uri, parentId, parentUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V4VmOpenApiFintoItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ontologyType: ").append(toIndentedString(ontologyType)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
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

