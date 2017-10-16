/**
 * PTV Open Api version 6
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v6
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
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * OPEN API - View Model of Service service channel - with external source
 */
@ApiModel(description = "OPEN API - View Model of Service service channel - with external source")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-16T08:07:52.212+03:00")
public class VmOpenApiServiceServiceChannelBySource   {
  @JsonProperty("serviceSourceId")
  private String serviceSourceId = null;

  @JsonProperty("serviceChannelSourceId")
  private String serviceChannelSourceId = null;

  @JsonProperty("description")
  private List<VmOpenApiLocalizedListItem> description = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  public VmOpenApiServiceServiceChannelBySource serviceSourceId(String serviceSourceId) {
    this.serviceSourceId = serviceSourceId;
    return this;
  }

   /**
   * The external source id for service.
   * @return serviceSourceId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The external source id for service.")
  public String getServiceSourceId() {
    return serviceSourceId;
  }

  public void setServiceSourceId(String serviceSourceId) {
    this.serviceSourceId = serviceSourceId;
  }

  public VmOpenApiServiceServiceChannelBySource serviceChannelSourceId(String serviceChannelSourceId) {
    this.serviceChannelSourceId = serviceChannelSourceId;
    return this;
  }

   /**
   * The external source id for service channel.
   * @return serviceChannelSourceId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The external source id for service channel.")
  public String getServiceChannelSourceId() {
    return serviceChannelSourceId;
  }

  public void setServiceChannelSourceId(String serviceChannelSourceId) {
    this.serviceChannelSourceId = serviceChannelSourceId;
  }

  public VmOpenApiServiceServiceChannelBySource description(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
    return this;
  }

  public VmOpenApiServiceServiceChannelBySource addDescriptionItem(VmOpenApiLocalizedListItem descriptionItem) {
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * List of localized service channel relationship descriptions.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "List of localized service channel relationship descriptions.")
  public List<VmOpenApiLocalizedListItem> getDescription() {
    return description;
  }

  public void setDescription(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
  }

  public VmOpenApiServiceServiceChannelBySource serviceChargeType(String serviceChargeType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiServiceServiceChannelBySource vmOpenApiServiceServiceChannelBySource = (VmOpenApiServiceServiceChannelBySource) o;
    return Objects.equals(this.serviceSourceId, vmOpenApiServiceServiceChannelBySource.serviceSourceId) &&
        Objects.equals(this.serviceChannelSourceId, vmOpenApiServiceServiceChannelBySource.serviceChannelSourceId) &&
        Objects.equals(this.description, vmOpenApiServiceServiceChannelBySource.description) &&
        Objects.equals(this.serviceChargeType, vmOpenApiServiceServiceChannelBySource.serviceChargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceSourceId, serviceChannelSourceId, description, serviceChargeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiServiceServiceChannelBySource {\n");
    
    sb.append("    serviceSourceId: ").append(toIndentedString(serviceSourceId)).append("\n");
    sb.append("    serviceChannelSourceId: ").append(toIndentedString(serviceChannelSourceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
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

