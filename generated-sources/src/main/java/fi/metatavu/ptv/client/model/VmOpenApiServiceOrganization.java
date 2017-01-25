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
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiServiceOrganization
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T18:16:20.101+02:00")
public class VmOpenApiServiceOrganization   {
  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("roleType")
  private String roleType = null;

  @JsonProperty("provisionType")
  private String provisionType = null;

  @JsonProperty("additionalInformation")
  private List<VmOpenApiLanguageItem> additionalInformation = new ArrayList<VmOpenApiLanguageItem>();

  public VmOpenApiServiceOrganization webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiServiceOrganization addWebPagesItem(VmOpenApiWebPage webPagesItem) {
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

  public VmOpenApiServiceOrganization organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * PTV organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "PTV organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiServiceOrganization roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

   /**
   * Role type, valid values Responsible or Producer.
   * @return roleType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Role type, valid values Responsible or Producer.")
  public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public VmOpenApiServiceOrganization provisionType(String provisionType) {
    this.provisionType = provisionType;
    return this;
  }

   /**
   * Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer.
   * @return provisionType
  **/
  @ApiModelProperty(example = "null", value = "Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer.")
  public String getProvisionType() {
    return provisionType;
  }

  public void setProvisionType(String provisionType) {
    this.provisionType = provisionType;
  }

  public VmOpenApiServiceOrganization additionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public VmOpenApiServiceOrganization addAdditionalInformationItem(VmOpenApiLanguageItem additionalInformationItem) {
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Localized list of additional information.
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "Localized list of additional information.")
  public List<VmOpenApiLanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiServiceOrganization vmOpenApiServiceOrganization = (VmOpenApiServiceOrganization) o;
    return Objects.equals(this.webPages, vmOpenApiServiceOrganization.webPages) &&
        Objects.equals(this.organizationId, vmOpenApiServiceOrganization.organizationId) &&
        Objects.equals(this.roleType, vmOpenApiServiceOrganization.roleType) &&
        Objects.equals(this.provisionType, vmOpenApiServiceOrganization.provisionType) &&
        Objects.equals(this.additionalInformation, vmOpenApiServiceOrganization.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webPages, organizationId, roleType, provisionType, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiServiceOrganization {\n");
    
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    provisionType: ").append(toIndentedString(provisionType)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

