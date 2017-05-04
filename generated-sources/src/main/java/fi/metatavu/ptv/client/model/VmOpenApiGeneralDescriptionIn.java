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
import fi.metatavu.ptv.client.model.V4VmOpenApiLaw;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * OPEN API - View Model of general description for IN api (POST)
 */
@ApiModel(description = "OPEN API - View Model of general description for IN api (POST)")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T15:53:23.977+03:00")
public class VmOpenApiGeneralDescriptionIn   {
  @JsonProperty("names")
  private List<VmOpenApiLocalizedListItem> names = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("descriptions")
  private List<VmOpenApiLocalizedListItem> descriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("serviceClasses")
  private List<String> serviceClasses = new ArrayList<String>();

  @JsonProperty("ontologyTerms")
  private List<String> ontologyTerms = new ArrayList<String>();

  @JsonProperty("targetGroups")
  private List<String> targetGroups = new ArrayList<String>();

  @JsonProperty("lifeEvents")
  private List<String> lifeEvents = new ArrayList<String>();

  @JsonProperty("industrialClasses")
  private List<String> industrialClasses = new ArrayList<String>();

  @JsonProperty("requirements")
  private List<VmOpenApiLanguageItem> requirements = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("legislation")
  private List<V4VmOpenApiLaw> legislation = new ArrayList<V4VmOpenApiLaw>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiGeneralDescriptionIn names(List<VmOpenApiLocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addNamesItem(VmOpenApiLocalizedListItem namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * List of name entities. Value of \"type\" has to be always \"Name\".   Sample single JSON object: {\"language\": \"fi\", \"value\": \"Perhepäivähoito esiopetusikäisille\", \"type\": \"Name\"}. (Max.Length: 100).
   * @return names
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of name entities. Value of \"type\" has to be always \"Name\".   Sample single JSON object: {\"language\": \"fi\", \"value\": \"Perhepäivähoito esiopetusikäisille\", \"type\": \"Name\"}. (Max.Length: 100).")
  public List<VmOpenApiLocalizedListItem> getNames() {
    return names;
  }

  public void setNames(List<VmOpenApiLocalizedListItem> names) {
    this.names = names;
  }

  public VmOpenApiGeneralDescriptionIn descriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addDescriptionsItem(VmOpenApiLocalizedListItem descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * List of description entities. Requires two entities where ones type is \"Description\" and the other ones type is \"ShortDescription\".  Sample single JSON object: {\"language\": \"fi\", \"value\": \"Lyhyen kuvauksen kuvaus esimerkki teksti.\", \"type\": \"ShortDescription\"}.  Other optional description types are ServiceUserInstruction, ChargeTypeAdditionalInfo, DeadLineAdditionalInfo, ProcessingTimeAdditionalInfo, ValidityTimeAdditionalInfo. (Max.Length: 150 ShortDescription). (Max.Length: 4000 Description). (Max.Length: 4000 ServiceUserInstruction).
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of description entities. Requires two entities where ones type is \"Description\" and the other ones type is \"ShortDescription\".  Sample single JSON object: {\"language\": \"fi\", \"value\": \"Lyhyen kuvauksen kuvaus esimerkki teksti.\", \"type\": \"ShortDescription\"}.  Other optional description types are ServiceUserInstruction, ChargeTypeAdditionalInfo, DeadLineAdditionalInfo, ProcessingTimeAdditionalInfo, ValidityTimeAdditionalInfo. (Max.Length: 150 ShortDescription). (Max.Length: 4000 Description). (Max.Length: 4000 ServiceUserInstruction).")
  public List<VmOpenApiLocalizedListItem> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  public VmOpenApiGeneralDescriptionIn languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of language codes.
   * @return languages
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of language codes.")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public VmOpenApiGeneralDescriptionIn serviceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addServiceClassesItem(String serviceClassesItem) {
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:P6.5
   * @return serviceClasses
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of service class urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:P6.5")
  public List<String> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<String> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public VmOpenApiGeneralDescriptionIn ontologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addOntologyTermsItem(String ontologyTermsItem) {
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435
   * @return ontologyTerms
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of ontology term urls. Sample url: http://www.yso.fi/onto/koko/p2435")
  public List<String> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<String> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public VmOpenApiGeneralDescriptionIn targetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addTargetGroupsItem(String targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KR1.3
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of target group urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KR1.3")
  public List<String> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<String> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public VmOpenApiGeneralDescriptionIn lifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addLifeEventsItem(String lifeEventsItem) {
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KE7
   * @return lifeEvents
  **/
  @ApiModelProperty(example = "null", value = "List of life event urls. Sample url: http://urn.fi/URN:NBN:fi:au:ptvl:KE7")
  public List<String> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<String> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public VmOpenApiGeneralDescriptionIn industrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addIndustrialClassesItem(String industrialClassesItem) {
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).
   * @return industrialClasses
  **/
  @ApiModelProperty(example = "null", value = "List of industrial class codes (see http://tilastokeskus.fi/meta/luokitukset/toimiala/001-2008/tekstitiedosto_en.txt).")
  public List<String> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<String> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public VmOpenApiGeneralDescriptionIn requirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addRequirementsItem(VmOpenApiLanguageItem requirementsItem) {
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Localized service usage requirements (description of requirement). (Max.Length: 4000).
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "Localized service usage requirements (description of requirement). (Max.Length: 4000).")
  public List<VmOpenApiLanguageItem> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<VmOpenApiLanguageItem> requirements) {
    this.requirements = requirements;
  }

  public VmOpenApiGeneralDescriptionIn type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Service type. Possible values are: Service, Notice, Registration or Permission.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Service type. Possible values are: Service, Notice, Registration or Permission.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiGeneralDescriptionIn serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Charged, Free or Other
   * @return serviceChargeType
  **/
  @ApiModelProperty(example = "null", value = "Service charge type. Possible values are: Charged, Free or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public VmOpenApiGeneralDescriptionIn legislation(List<V4VmOpenApiLaw> legislation) {
    this.legislation = legislation;
    return this;
  }

  public VmOpenApiGeneralDescriptionIn addLegislationItem(V4VmOpenApiLaw legislationItem) {
    this.legislation.add(legislationItem);
    return this;
  }

   /**
   * Laws that a general description is based on.
   * @return legislation
  **/
  @ApiModelProperty(example = "null", value = "Laws that a general description is based on.")
  public List<V4VmOpenApiLaw> getLegislation() {
    return legislation;
  }

  public void setLegislation(List<V4VmOpenApiLaw> legislation) {
    this.legislation = legislation;
  }

  public VmOpenApiGeneralDescriptionIn publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status. Possible values are: Draft or Published.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "Publishing status. Possible values are: Draft or Published.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiGeneralDescriptionIn vmOpenApiGeneralDescriptionIn = (VmOpenApiGeneralDescriptionIn) o;
    return Objects.equals(this.names, vmOpenApiGeneralDescriptionIn.names) &&
        Objects.equals(this.descriptions, vmOpenApiGeneralDescriptionIn.descriptions) &&
        Objects.equals(this.languages, vmOpenApiGeneralDescriptionIn.languages) &&
        Objects.equals(this.serviceClasses, vmOpenApiGeneralDescriptionIn.serviceClasses) &&
        Objects.equals(this.ontologyTerms, vmOpenApiGeneralDescriptionIn.ontologyTerms) &&
        Objects.equals(this.targetGroups, vmOpenApiGeneralDescriptionIn.targetGroups) &&
        Objects.equals(this.lifeEvents, vmOpenApiGeneralDescriptionIn.lifeEvents) &&
        Objects.equals(this.industrialClasses, vmOpenApiGeneralDescriptionIn.industrialClasses) &&
        Objects.equals(this.requirements, vmOpenApiGeneralDescriptionIn.requirements) &&
        Objects.equals(this.type, vmOpenApiGeneralDescriptionIn.type) &&
        Objects.equals(this.serviceChargeType, vmOpenApiGeneralDescriptionIn.serviceChargeType) &&
        Objects.equals(this.legislation, vmOpenApiGeneralDescriptionIn.legislation) &&
        Objects.equals(this.publishingStatus, vmOpenApiGeneralDescriptionIn.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, descriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, requirements, type, serviceChargeType, legislation, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiGeneralDescriptionIn {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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

