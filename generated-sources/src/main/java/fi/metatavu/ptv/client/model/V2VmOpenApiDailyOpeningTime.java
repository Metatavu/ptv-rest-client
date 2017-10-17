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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OPEN API V2 - View Model of Daily opening hours
 */
@ApiModel(description = "OPEN API V2 - View Model of Daily opening hours")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T11:41:22.679+03:00")
public class V2VmOpenApiDailyOpeningTime {
  @JsonProperty("dayFrom")
  private String dayFrom = null;

  @JsonProperty("dayTo")
  private String dayTo = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("isExtra")
  private Boolean isExtra = null;

  public V2VmOpenApiDailyOpeningTime dayFrom(String dayFrom) {
    this.dayFrom = dayFrom;
    return this;
  }

   /**
   * Starts from weekday (e.g. Monday).
   * @return dayFrom
  **/
  @ApiModelProperty(value = "Starts from weekday (e.g. Monday).")
  public String getDayFrom() {
    return dayFrom;
  }

  public void setDayFrom(String dayFrom) {
    this.dayFrom = dayFrom;
  }

  public V2VmOpenApiDailyOpeningTime dayTo(String dayTo) {
    this.dayTo = dayTo;
    return this;
  }

   /**
   * Ends to weekday (e.g. Monday).
   * @return dayTo
  **/
  @ApiModelProperty(value = "Ends to weekday (e.g. Monday).")
  public String getDayTo() {
    return dayTo;
  }

  public void setDayTo(String dayTo) {
    this.dayTo = dayTo;
  }

  public V2VmOpenApiDailyOpeningTime from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Start time for example 10:00.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "Start time for example 10:00.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public V2VmOpenApiDailyOpeningTime to(String to) {
    this.to = to;
    return this;
  }

   /**
   * End time for example 20:00.
   * @return to
  **/
  @ApiModelProperty(required = true, value = "End time for example 20:00.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public V2VmOpenApiDailyOpeningTime isExtra(Boolean isExtra) {
    this.isExtra = isExtra;
    return this;
  }

   /**
   * Set to true to have extra time for a day. Enables to have open times like 10:00-14:00 and also on the same day 16:00-20:00. So the latter time is extra time.
   * @return isExtra
  **/
  @ApiModelProperty(value = "Set to true to have extra time for a day. Enables to have open times like 10:00-14:00 and also on the same day 16:00-20:00. So the latter time is extra time.")
  public Boolean getIsExtra() {
    return isExtra;
  }

  public void setIsExtra(Boolean isExtra) {
    this.isExtra = isExtra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2VmOpenApiDailyOpeningTime v2VmOpenApiDailyOpeningTime = (V2VmOpenApiDailyOpeningTime) o;
    return Objects.equals(this.dayFrom, v2VmOpenApiDailyOpeningTime.dayFrom) &&
        Objects.equals(this.dayTo, v2VmOpenApiDailyOpeningTime.dayTo) &&
        Objects.equals(this.from, v2VmOpenApiDailyOpeningTime.from) &&
        Objects.equals(this.to, v2VmOpenApiDailyOpeningTime.to) &&
        Objects.equals(this.isExtra, v2VmOpenApiDailyOpeningTime.isExtra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayFrom, dayTo, from, to, isExtra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2VmOpenApiDailyOpeningTime {\n");
    
    sb.append("    dayFrom: ").append(toIndentedString(dayFrom)).append("\n");
    sb.append("    dayTo: ").append(toIndentedString(dayTo)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    isExtra: ").append(toIndentedString(isExtra)).append("\n");
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

