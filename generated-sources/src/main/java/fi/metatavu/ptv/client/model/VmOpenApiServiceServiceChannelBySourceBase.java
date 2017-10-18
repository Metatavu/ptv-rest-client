/*
 * PTV Open Api version 6
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v6
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
import fi.metatavu.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API - View Model of Service service channel - with external source
 */
@ApiModel(description = "OPEN API - View Model of Service service channel - with external source")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-18T13:10:37.869+03:00")
public class VmOpenApiServiceServiceChannelBySourceBase {
  @JsonProperty("serviceChannelSourceId")
  private String serviceChannelSourceId = null;

  @JsonProperty("description")
  private List<VmOpenApiLocalizedListItem> description = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  public VmOpenApiServiceServiceChannelBySourceBase serviceChannelSourceId(String serviceChannelSourceId) {
    this.serviceChannelSourceId = serviceChannelSourceId;
    return this;
  }

   /**
   * The external source id for service channel.
   * @return serviceChannelSourceId
  **/
  @ApiModelProperty(required = true, value = "The external source id for service channel.")
  public String getServiceChannelSourceId() {
    return serviceChannelSourceId;
  }

  public void setServiceChannelSourceId(String serviceChannelSourceId) {
    this.serviceChannelSourceId = serviceChannelSourceId;
  }

  public VmOpenApiServiceServiceChannelBySourceBase description(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
    return this;
  }

  public VmOpenApiServiceServiceChannelBySourceBase addDescriptionItem(VmOpenApiLocalizedListItem descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<VmOpenApiLocalizedListItem>();
    }
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * List of localized service channel relationship descriptions.
   * @return description
  **/
  @ApiModelProperty(value = "List of localized service channel relationship descriptions.")
  public List<VmOpenApiLocalizedListItem> getDescription() {
    return description;
  }

  public void setDescription(List<VmOpenApiLocalizedListItem> description) {
    this.description = description;
  }

  public VmOpenApiServiceServiceChannelBySourceBase serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Charged, Free or Other
   * @return serviceChargeType
  **/
  @ApiModelProperty(value = "Service charge type. Possible values are: Charged, Free or Other")
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
    VmOpenApiServiceServiceChannelBySourceBase vmOpenApiServiceServiceChannelBySourceBase = (VmOpenApiServiceServiceChannelBySourceBase) o;
    return Objects.equals(this.serviceChannelSourceId, vmOpenApiServiceServiceChannelBySourceBase.serviceChannelSourceId) &&
        Objects.equals(this.description, vmOpenApiServiceServiceChannelBySourceBase.description) &&
        Objects.equals(this.serviceChargeType, vmOpenApiServiceServiceChannelBySourceBase.serviceChargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceChannelSourceId, description, serviceChargeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiServiceServiceChannelBySourceBase {\n");
    
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

