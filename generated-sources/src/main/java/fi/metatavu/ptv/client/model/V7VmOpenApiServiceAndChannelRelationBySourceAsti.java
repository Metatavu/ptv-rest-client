/*
 * PTV Open Api version 7
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v7
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
import fi.metatavu.ptv.client.model.V7VmOpenApiServiceServiceChannelBySourceAsti;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V7 - View Model of service and channel relation IN by source (PUT).
 */
@ApiModel(description = "OPEN API V7 - View Model of service and channel relation IN by source (PUT).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class V7VmOpenApiServiceAndChannelRelationBySourceAsti {
  @JsonProperty("deleteAllChannelRelations")
  private Boolean deleteAllChannelRelations = null;

  @JsonProperty("channelRelations")
  private List<V7VmOpenApiServiceServiceChannelBySourceAsti> channelRelations = null;

  public V7VmOpenApiServiceAndChannelRelationBySourceAsti deleteAllChannelRelations(Boolean deleteAllChannelRelations) {
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

  public V7VmOpenApiServiceAndChannelRelationBySourceAsti channelRelations(List<V7VmOpenApiServiceServiceChannelBySourceAsti> channelRelations) {
    this.channelRelations = channelRelations;
    return this;
  }

  public V7VmOpenApiServiceAndChannelRelationBySourceAsti addChannelRelationsItem(V7VmOpenApiServiceServiceChannelBySourceAsti channelRelationsItem) {
    if (this.channelRelations == null) {
      this.channelRelations = new ArrayList<V7VmOpenApiServiceServiceChannelBySourceAsti>();
    }
    this.channelRelations.add(channelRelationsItem);
    return this;
  }

   /**
   * Gets or sets the channel relations.
   * @return channelRelations
  **/
  @ApiModelProperty(value = "Gets or sets the channel relations.")
  public List<V7VmOpenApiServiceServiceChannelBySourceAsti> getChannelRelations() {
    return channelRelations;
  }

  public void setChannelRelations(List<V7VmOpenApiServiceServiceChannelBySourceAsti> channelRelations) {
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
    V7VmOpenApiServiceAndChannelRelationBySourceAsti v7VmOpenApiServiceAndChannelRelationBySourceAsti = (V7VmOpenApiServiceAndChannelRelationBySourceAsti) o;
    return Objects.equals(this.deleteAllChannelRelations, v7VmOpenApiServiceAndChannelRelationBySourceAsti.deleteAllChannelRelations) &&
        Objects.equals(this.channelRelations, v7VmOpenApiServiceAndChannelRelationBySourceAsti.channelRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteAllChannelRelations, channelRelations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V7VmOpenApiServiceAndChannelRelationBySourceAsti {\n");
    
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
