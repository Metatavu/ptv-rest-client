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
import fi.metatavu.ptv.client.model.VmOpenApiServiceServiceChannelBySourceBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V6 - View Model of service and channel relation IN by source (PUT).
 */
@ApiModel(description = "OPEN API V6 - View Model of service and channel relation IN by source (PUT).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T11:41:22.679+03:00")
public class V6VmOpenApiServiceAndChannelRelationBySourceInBase {
  @JsonProperty("deleteAllChannelRelations")
  private Boolean deleteAllChannelRelations = null;

  @JsonProperty("channelRelations")
  private List<VmOpenApiServiceServiceChannelBySourceBase> channelRelations = null;

  public V6VmOpenApiServiceAndChannelRelationBySourceInBase deleteAllChannelRelations(Boolean deleteAllChannelRelations) {
    this.deleteAllChannelRelations = deleteAllChannelRelations;
    return this;
  }

   /**
   * Set to true to delete all existing relations between defined service and service channels (the ChannelRelations collection for this object should be empty collection when this option is used).
   * @return deleteAllChannelRelations
  **/
  @ApiModelProperty(value = "Set to true to delete all existing relations between defined service and service channels (the ChannelRelations collection for this object should be empty collection when this option is used).")
  public Boolean getDeleteAllChannelRelations() {
    return deleteAllChannelRelations;
  }

  public void setDeleteAllChannelRelations(Boolean deleteAllChannelRelations) {
    this.deleteAllChannelRelations = deleteAllChannelRelations;
  }

  public V6VmOpenApiServiceAndChannelRelationBySourceInBase channelRelations(List<VmOpenApiServiceServiceChannelBySourceBase> channelRelations) {
    this.channelRelations = channelRelations;
    return this;
  }

  public V6VmOpenApiServiceAndChannelRelationBySourceInBase addChannelRelationsItem(VmOpenApiServiceServiceChannelBySourceBase channelRelationsItem) {
    if (this.channelRelations == null) {
      this.channelRelations = new ArrayList<VmOpenApiServiceServiceChannelBySourceBase>();
    }
    this.channelRelations.add(channelRelationsItem);
    return this;
  }

   /**
   * Gets or sets the channel relations.
   * @return channelRelations
  **/
  @ApiModelProperty(value = "Gets or sets the channel relations.")
  public List<VmOpenApiServiceServiceChannelBySourceBase> getChannelRelations() {
    return channelRelations;
  }

  public void setChannelRelations(List<VmOpenApiServiceServiceChannelBySourceBase> channelRelations) {
    this.channelRelations = channelRelations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V6VmOpenApiServiceAndChannelRelationBySourceInBase v6VmOpenApiServiceAndChannelRelationBySourceInBase = (V6VmOpenApiServiceAndChannelRelationBySourceInBase) o;
    return Objects.equals(this.deleteAllChannelRelations, v6VmOpenApiServiceAndChannelRelationBySourceInBase.deleteAllChannelRelations) &&
        Objects.equals(this.channelRelations, v6VmOpenApiServiceAndChannelRelationBySourceInBase.channelRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteAllChannelRelations, channelRelations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V6VmOpenApiServiceAndChannelRelationBySourceInBase {\n");
    
    sb.append("    deleteAllChannelRelations: ").append(toIndentedString(deleteAllChannelRelations)).append("\n");
    sb.append("    channelRelations: ").append(toIndentedString(channelRelations)).append("\n");
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

