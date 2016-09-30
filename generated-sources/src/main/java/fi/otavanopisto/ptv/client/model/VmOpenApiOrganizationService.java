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


package fi.otavanopisto.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiOrganizationService
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-30T08:33:13.270+03:00")
public class VmOpenApiOrganizationService   {
  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("roleType")
  private String roleType = null;

  @JsonProperty("provisionType")
  private String provisionType = null;

  @JsonProperty("additionalInformation")
  private List<VmOpenApiLanguageItem> additionalInformation = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  public VmOpenApiOrganizationService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public VmOpenApiOrganizationService organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiOrganizationService roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

   /**
   * Get roleType
   * @return roleType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public VmOpenApiOrganizationService provisionType(String provisionType) {
    this.provisionType = provisionType;
    return this;
  }

   /**
   * Get provisionType
   * @return provisionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProvisionType() {
    return provisionType;
  }

  public void setProvisionType(String provisionType) {
    this.provisionType = provisionType;
  }

  public VmOpenApiOrganizationService additionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public VmOpenApiOrganizationService addAdditionalInformationItem(VmOpenApiLanguageItem additionalInformationItem) {
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public VmOpenApiOrganizationService webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiOrganizationService addWebPagesItem(VmOpenApiWebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * Get webPages
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiOrganizationService vmOpenApiOrganizationService = (VmOpenApiOrganizationService) o;
    return Objects.equals(this.serviceId, vmOpenApiOrganizationService.serviceId) &&
        Objects.equals(this.organizationId, vmOpenApiOrganizationService.organizationId) &&
        Objects.equals(this.roleType, vmOpenApiOrganizationService.roleType) &&
        Objects.equals(this.provisionType, vmOpenApiOrganizationService.provisionType) &&
        Objects.equals(this.additionalInformation, vmOpenApiOrganizationService.additionalInformation) &&
        Objects.equals(this.webPages, vmOpenApiOrganizationService.webPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, organizationId, roleType, provisionType, additionalInformation, webPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiOrganizationService {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    provisionType: ").append(toIndentedString(provisionType)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
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

