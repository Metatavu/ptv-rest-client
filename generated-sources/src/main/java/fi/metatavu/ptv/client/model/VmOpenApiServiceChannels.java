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
import fi.metatavu.ptv.client.model.VmOpenApiElectronicChannel;
import fi.metatavu.ptv.client.model.VmOpenApiPhoneChannel;
import fi.metatavu.ptv.client.model.VmOpenApiPrintableFormChannel;
import fi.metatavu.ptv.client.model.VmOpenApiServiceLocationChannel;
import fi.metatavu.ptv.client.model.VmOpenApiWebPageChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * VmOpenApiServiceChannels
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T20:15:02.299+02:00")
public class VmOpenApiServiceChannels   {
  @JsonProperty("electronicChannel")
  private VmOpenApiElectronicChannel electronicChannel = null;

  @JsonProperty("phoneChannel")
  private VmOpenApiPhoneChannel phoneChannel = null;

  @JsonProperty("printableFormChannel")
  private VmOpenApiPrintableFormChannel printableFormChannel = null;

  @JsonProperty("locationChannel")
  private VmOpenApiServiceLocationChannel locationChannel = null;

  @JsonProperty("webPageChannel")
  private VmOpenApiWebPageChannel webPageChannel = null;

  public VmOpenApiServiceChannels electronicChannel(VmOpenApiElectronicChannel electronicChannel) {
    this.electronicChannel = electronicChannel;
    return this;
  }

   /**
   * Electronic channel.
   * @return electronicChannel
  **/
  @ApiModelProperty(example = "null", value = "Electronic channel.")
  public VmOpenApiElectronicChannel getElectronicChannel() {
    return electronicChannel;
  }

  public void setElectronicChannel(VmOpenApiElectronicChannel electronicChannel) {
    this.electronicChannel = electronicChannel;
  }

  public VmOpenApiServiceChannels phoneChannel(VmOpenApiPhoneChannel phoneChannel) {
    this.phoneChannel = phoneChannel;
    return this;
  }

   /**
   * Phone channel.
   * @return phoneChannel
  **/
  @ApiModelProperty(example = "null", value = "Phone channel.")
  public VmOpenApiPhoneChannel getPhoneChannel() {
    return phoneChannel;
  }

  public void setPhoneChannel(VmOpenApiPhoneChannel phoneChannel) {
    this.phoneChannel = phoneChannel;
  }

  public VmOpenApiServiceChannels printableFormChannel(VmOpenApiPrintableFormChannel printableFormChannel) {
    this.printableFormChannel = printableFormChannel;
    return this;
  }

   /**
   * Printable form channel.
   * @return printableFormChannel
  **/
  @ApiModelProperty(example = "null", value = "Printable form channel.")
  public VmOpenApiPrintableFormChannel getPrintableFormChannel() {
    return printableFormChannel;
  }

  public void setPrintableFormChannel(VmOpenApiPrintableFormChannel printableFormChannel) {
    this.printableFormChannel = printableFormChannel;
  }

  public VmOpenApiServiceChannels locationChannel(VmOpenApiServiceLocationChannel locationChannel) {
    this.locationChannel = locationChannel;
    return this;
  }

   /**
   * Location channel.
   * @return locationChannel
  **/
  @ApiModelProperty(example = "null", value = "Location channel.")
  public VmOpenApiServiceLocationChannel getLocationChannel() {
    return locationChannel;
  }

  public void setLocationChannel(VmOpenApiServiceLocationChannel locationChannel) {
    this.locationChannel = locationChannel;
  }

  public VmOpenApiServiceChannels webPageChannel(VmOpenApiWebPageChannel webPageChannel) {
    this.webPageChannel = webPageChannel;
    return this;
  }

   /**
   * Web page channel.
   * @return webPageChannel
  **/
  @ApiModelProperty(example = "null", value = "Web page channel.")
  public VmOpenApiWebPageChannel getWebPageChannel() {
    return webPageChannel;
  }

  public void setWebPageChannel(VmOpenApiWebPageChannel webPageChannel) {
    this.webPageChannel = webPageChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiServiceChannels vmOpenApiServiceChannels = (VmOpenApiServiceChannels) o;
    return Objects.equals(this.electronicChannel, vmOpenApiServiceChannels.electronicChannel) &&
        Objects.equals(this.phoneChannel, vmOpenApiServiceChannels.phoneChannel) &&
        Objects.equals(this.printableFormChannel, vmOpenApiServiceChannels.printableFormChannel) &&
        Objects.equals(this.locationChannel, vmOpenApiServiceChannels.locationChannel) &&
        Objects.equals(this.webPageChannel, vmOpenApiServiceChannels.webPageChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electronicChannel, phoneChannel, printableFormChannel, locationChannel, webPageChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiServiceChannels {\n");
    
    sb.append("    electronicChannel: ").append(toIndentedString(electronicChannel)).append("\n");
    sb.append("    phoneChannel: ").append(toIndentedString(phoneChannel)).append("\n");
    sb.append("    printableFormChannel: ").append(toIndentedString(printableFormChannel)).append("\n");
    sb.append("    locationChannel: ").append(toIndentedString(locationChannel)).append("\n");
    sb.append("    webPageChannel: ").append(toIndentedString(webPageChannel)).append("\n");
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

