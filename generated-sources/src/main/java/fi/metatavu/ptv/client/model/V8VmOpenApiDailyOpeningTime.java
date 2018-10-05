/*
 * PTV Open Api version 9
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v9
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
 * OPEN API V8 - View Model of Daily opening hours
 */
@ApiModel(description = "OPEN API V8 - View Model of Daily opening hours")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class V8VmOpenApiDailyOpeningTime {
  @JsonProperty("dayFrom")
  private String dayFrom = null;

  @JsonProperty("dayTo")
  private String dayTo = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  public V8VmOpenApiDailyOpeningTime dayFrom(String dayFrom) {
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

  public V8VmOpenApiDailyOpeningTime dayTo(String dayTo) {
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

  public V8VmOpenApiDailyOpeningTime from(String from) {
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

  public V8VmOpenApiDailyOpeningTime to(String to) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V8VmOpenApiDailyOpeningTime v8VmOpenApiDailyOpeningTime = (V8VmOpenApiDailyOpeningTime) o;
    return Objects.equals(this.dayFrom, v8VmOpenApiDailyOpeningTime.dayFrom) &&
        Objects.equals(this.dayTo, v8VmOpenApiDailyOpeningTime.dayTo) &&
        Objects.equals(this.from, v8VmOpenApiDailyOpeningTime.from) &&
        Objects.equals(this.to, v8VmOpenApiDailyOpeningTime.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayFrom, dayTo, from, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V8VmOpenApiDailyOpeningTime {\n");
    
    sb.append("    dayFrom: ").append(toIndentedString(dayFrom)).append("\n");
    sb.append("    dayTo: ").append(toIndentedString(dayTo)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

