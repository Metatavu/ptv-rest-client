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
import fi.metatavu.ptv.client.model.VmOpenApiFintoItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Open Api general description view model.
 */
@ApiModel(description = "Open Api general description view model.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T18:16:20.101+02:00")
public class VmOpenApiGeneralDescription   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("names")
  private List<VmOpenApiLocalizedListItem> names = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("descriptions")
  private List<VmOpenApiLocalizedListItem> descriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("serviceClasses")
  private List<VmOpenApiFintoItem> serviceClasses = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("ontologyTerms")
  private List<VmOpenApiFintoItem> ontologyTerms = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("targetGroups")
  private List<VmOpenApiFintoItem> targetGroups = new ArrayList<VmOpenApiFintoItem>();

  @JsonProperty("lifeEvents")
  private List<VmOpenApiFintoItem> lifeEvents = new ArrayList<VmOpenApiFintoItem>();

  public VmOpenApiGeneralDescription id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entity Guid identifier.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Entity Guid identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VmOpenApiGeneralDescription names(List<VmOpenApiLocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public VmOpenApiGeneralDescription addNamesItem(VmOpenApiLocalizedListItem namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * List of localized names.
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "List of localized names.")
  public List<VmOpenApiLocalizedListItem> getNames() {
    return names;
  }

  public void setNames(List<VmOpenApiLocalizedListItem> names) {
    this.names = names;
  }

  public VmOpenApiGeneralDescription descriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public VmOpenApiGeneralDescription addDescriptionsItem(VmOpenApiLocalizedListItem descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * List of localized descriptions.
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "List of localized descriptions.")
  public List<VmOpenApiLocalizedListItem> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  public VmOpenApiGeneralDescription languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiGeneralDescription addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of statutory service general description languages.
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "List of statutory service general description languages.")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public VmOpenApiGeneralDescription serviceClasses(List<VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public VmOpenApiGeneralDescription addServiceClassesItem(VmOpenApiFintoItem serviceClassesItem) {
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * List of service classes.
   * @return serviceClasses
  **/
  @ApiModelProperty(example = "null", value = "List of service classes.")
  public List<VmOpenApiFintoItem> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<VmOpenApiFintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public VmOpenApiGeneralDescription ontologyTerms(List<VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public VmOpenApiGeneralDescription addOntologyTermsItem(VmOpenApiFintoItem ontologyTermsItem) {
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * List of ontology terms.
   * @return ontologyTerms
  **/
  @ApiModelProperty(example = "null", value = "List of ontology terms.")
  public List<VmOpenApiFintoItem> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<VmOpenApiFintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public VmOpenApiGeneralDescription targetGroups(List<VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public VmOpenApiGeneralDescription addTargetGroupsItem(VmOpenApiFintoItem targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * List of target groups.
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", value = "List of target groups.")
  public List<VmOpenApiFintoItem> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<VmOpenApiFintoItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public VmOpenApiGeneralDescription lifeEvents(List<VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public VmOpenApiGeneralDescription addLifeEventsItem(VmOpenApiFintoItem lifeEventsItem) {
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * List of life events.
   * @return lifeEvents
  **/
  @ApiModelProperty(example = "null", value = "List of life events.")
  public List<VmOpenApiFintoItem> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<VmOpenApiFintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiGeneralDescription vmOpenApiGeneralDescription = (VmOpenApiGeneralDescription) o;
    return Objects.equals(this.id, vmOpenApiGeneralDescription.id) &&
        Objects.equals(this.names, vmOpenApiGeneralDescription.names) &&
        Objects.equals(this.descriptions, vmOpenApiGeneralDescription.descriptions) &&
        Objects.equals(this.languages, vmOpenApiGeneralDescription.languages) &&
        Objects.equals(this.serviceClasses, vmOpenApiGeneralDescription.serviceClasses) &&
        Objects.equals(this.ontologyTerms, vmOpenApiGeneralDescription.ontologyTerms) &&
        Objects.equals(this.targetGroups, vmOpenApiGeneralDescription.targetGroups) &&
        Objects.equals(this.lifeEvents, vmOpenApiGeneralDescription.lifeEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, names, descriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiGeneralDescription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
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

