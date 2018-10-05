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
import fi.metatavu.ptv.client.model.V8VmOpenApiDailyOpeningTime;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V8 - View Model of service hour
 */
@ApiModel(description = "OPEN API V8 - View Model of service hour")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class V8VmOpenApiServiceHour {
  @JsonProperty("serviceHourType")
  private String serviceHourType = null;

  @JsonProperty("validFrom")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo = null;

  @JsonProperty("isClosed")
  private Boolean isClosed = null;

  @JsonProperty("validForNow")
  private Boolean validForNow = null;

  @JsonProperty("additionalInformation")
  private List<VmOpenApiLanguageItem> additionalInformation = null;

  @JsonProperty("openingHour")
  private List<V8VmOpenApiDailyOpeningTime> openingHour = null;

  public V8VmOpenApiServiceHour serviceHourType(String serviceHourType) {
    this.serviceHourType = serviceHourType;
    return this;
  }

   /**
   * Type of service hour. Valid values are: DaysOfTheWeek, Exceptional or OverMidnight.  In version 7 and older: Standard, Exception or Special.
   * @return serviceHourType
  **/
  @ApiModelProperty(required = true, value = "Type of service hour. Valid values are: DaysOfTheWeek, Exceptional or OverMidnight.  In version 7 and older: Standard, Exception or Special.")
  public String getServiceHourType() {
    return serviceHourType;
  }

  public void setServiceHourType(String serviceHourType) {
    this.serviceHourType = serviceHourType;
  }

  public V8VmOpenApiServiceHour validFrom(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Date time where from this entry is valid.
   * @return validFrom
  **/
  @ApiModelProperty(value = "Date time where from this entry is valid.")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public V8VmOpenApiServiceHour validTo(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Date time to this entry is valid.
   * @return validTo
  **/
  @ApiModelProperty(value = "Date time to this entry is valid.")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public V8VmOpenApiServiceHour isClosed(Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

   /**
   * Set to true to present a time between the valid from and to times as closed.
   * @return isClosed
  **/
  @ApiModelProperty(value = "Set to true to present a time between the valid from and to times as closed.")
  public Boolean getIsClosed() {
    return isClosed;
  }

  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  public V8VmOpenApiServiceHour validForNow(Boolean validForNow) {
    this.validForNow = validForNow;
    return this;
  }

   /**
   * Set to true to present that this entry is valid for now.
   * @return validForNow
  **/
  @ApiModelProperty(value = "Set to true to present that this entry is valid for now.")
  public Boolean getValidForNow() {
    return validForNow;
  }

  public void setValidForNow(Boolean validForNow) {
    this.validForNow = validForNow;
  }

  public V8VmOpenApiServiceHour additionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public V8VmOpenApiServiceHour addAdditionalInformationItem(VmOpenApiLanguageItem additionalInformationItem) {
    if (this.additionalInformation == null) {
      this.additionalInformation = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Localized list of additional information. (Max.Length: 100).
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "Localized list of additional information. (Max.Length: 100).")
  public List<VmOpenApiLanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public V8VmOpenApiServiceHour openingHour(List<V8VmOpenApiDailyOpeningTime> openingHour) {
    this.openingHour = openingHour;
    return this;
  }

  public V8VmOpenApiServiceHour addOpeningHourItem(V8VmOpenApiDailyOpeningTime openingHourItem) {
    if (this.openingHour == null) {
      this.openingHour = new ArrayList<V8VmOpenApiDailyOpeningTime>();
    }
    this.openingHour.add(openingHourItem);
    return this;
  }

   /**
   * Gets or sets the opening hour.
   * @return openingHour
  **/
  @ApiModelProperty(value = "Gets or sets the opening hour.")
  public List<V8VmOpenApiDailyOpeningTime> getOpeningHour() {
    return openingHour;
  }

  public void setOpeningHour(List<V8VmOpenApiDailyOpeningTime> openingHour) {
    this.openingHour = openingHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V8VmOpenApiServiceHour v8VmOpenApiServiceHour = (V8VmOpenApiServiceHour) o;
    return Objects.equals(this.serviceHourType, v8VmOpenApiServiceHour.serviceHourType) &&
        Objects.equals(this.validFrom, v8VmOpenApiServiceHour.validFrom) &&
        Objects.equals(this.validTo, v8VmOpenApiServiceHour.validTo) &&
        Objects.equals(this.isClosed, v8VmOpenApiServiceHour.isClosed) &&
        Objects.equals(this.validForNow, v8VmOpenApiServiceHour.validForNow) &&
        Objects.equals(this.additionalInformation, v8VmOpenApiServiceHour.additionalInformation) &&
        Objects.equals(this.openingHour, v8VmOpenApiServiceHour.openingHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceHourType, validFrom, validTo, isClosed, validForNow, additionalInformation, openingHour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V8VmOpenApiServiceHour {\n");
    
    sb.append("    serviceHourType: ").append(toIndentedString(serviceHourType)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    validForNow: ").append(toIndentedString(validForNow)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    openingHour: ").append(toIndentedString(openingHour)).append("\n");
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

