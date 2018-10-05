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
import java.util.UUID;

/**
 * OPEN API - View Model of translation item
 */
@ApiModel(description = "OPEN API - View Model of translation item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class VmOpenApiTranslationItem {
  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("organizationName")
  private String organizationName = null;

  @JsonProperty("businessCode")
  private String businessCode = null;

  @JsonProperty("orderer")
  private String orderer = null;

  @JsonProperty("orderId")
  private Long orderId = null;

  @JsonProperty("orderState")
  private String orderState = null;

  @JsonProperty("orderDate")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime orderDate = null;

  @JsonProperty("orderResolvedDate")
  private @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime orderResolvedDate = null;

  @JsonProperty("sourceLanguage")
  private String sourceLanguage = null;

  @JsonProperty("sourceLanguageCharAmount")
  private Long sourceLanguageCharAmount = null;

  @JsonProperty("targetLanguage")
  private String targetLanguage = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("itemId")
  private UUID itemId = null;

  @JsonProperty("itemName")
  private String itemName = null;

  public VmOpenApiTranslationItem organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Id of the organization.
   * @return organizationId
  **/
  @ApiModelProperty(value = "Id of the organization.")
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiTranslationItem organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Name of the organization.
   * @return organizationName
  **/
  @ApiModelProperty(value = "Name of the organization.")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public VmOpenApiTranslationItem businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

   /**
   * Name of the organization.
   * @return businessCode
  **/
  @ApiModelProperty(value = "Name of the organization.")
  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public VmOpenApiTranslationItem orderer(String orderer) {
    this.orderer = orderer;
    return this;
  }

   /**
   * Order made by (email).
   * @return orderer
  **/
  @ApiModelProperty(value = "Order made by (email).")
  public String getOrderer() {
    return orderer;
  }

  public void setOrderer(String orderer) {
    this.orderer = orderer;
  }

  public VmOpenApiTranslationItem orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order identifier.
   * @return orderId
  **/
  @ApiModelProperty(value = "Order identifier.")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public VmOpenApiTranslationItem orderState(String orderState) {
    this.orderState = orderState;
    return this;
  }

   /**
   * Order state.
   * @return orderState
  **/
  @ApiModelProperty(value = "Order state.")
  public String getOrderState() {
    return orderState;
  }

  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }

  public VmOpenApiTranslationItem orderDate(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Order date.
   * @return orderDate
  **/
  @ApiModelProperty(value = "Order date.")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public VmOpenApiTranslationItem orderResolvedDate(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime orderResolvedDate) {
    this.orderResolvedDate = orderResolvedDate;
    return this;
  }

   /**
   * Order resolved and delivered date.
   * @return orderResolvedDate
  **/
  @ApiModelProperty(value = "Order resolved and delivered date.")
  public @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime getOrderResolvedDate() {
    return orderResolvedDate;
  }

  public void setOrderResolvedDate(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime orderResolvedDate) {
    this.orderResolvedDate = orderResolvedDate;
  }

  public VmOpenApiTranslationItem sourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Source language.
   * @return sourceLanguage
  **/
  @ApiModelProperty(value = "Source language.")
  public String getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }

  public VmOpenApiTranslationItem sourceLanguageCharAmount(Long sourceLanguageCharAmount) {
    this.sourceLanguageCharAmount = sourceLanguageCharAmount;
    return this;
  }

   /**
   * Amount of chars in source text.
   * @return sourceLanguageCharAmount
  **/
  @ApiModelProperty(value = "Amount of chars in source text.")
  public Long getSourceLanguageCharAmount() {
    return sourceLanguageCharAmount;
  }

  public void setSourceLanguageCharAmount(Long sourceLanguageCharAmount) {
    this.sourceLanguageCharAmount = sourceLanguageCharAmount;
  }

  public VmOpenApiTranslationItem targetLanguage(String targetLanguage) {
    this.targetLanguage = targetLanguage;
    return this;
  }

   /**
   * Target language.
   * @return targetLanguage
  **/
  @ApiModelProperty(value = "Target language.")
  public String getTargetLanguage() {
    return targetLanguage;
  }

  public void setTargetLanguage(String targetLanguage) {
    this.targetLanguage = targetLanguage;
  }

  public VmOpenApiTranslationItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the item, either Service or Channel.
   * @return type
  **/
  @ApiModelProperty(value = "Type of the item, either Service or Channel.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiTranslationItem itemId(UUID itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Id of the item.
   * @return itemId
  **/
  @ApiModelProperty(value = "Id of the item.")
  public UUID getItemId() {
    return itemId;
  }

  public void setItemId(UUID itemId) {
    this.itemId = itemId;
  }

  public VmOpenApiTranslationItem itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Name of the item.
   * @return itemName
  **/
  @ApiModelProperty(value = "Name of the item.")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiTranslationItem vmOpenApiTranslationItem = (VmOpenApiTranslationItem) o;
    return Objects.equals(this.organizationId, vmOpenApiTranslationItem.organizationId) &&
        Objects.equals(this.organizationName, vmOpenApiTranslationItem.organizationName) &&
        Objects.equals(this.businessCode, vmOpenApiTranslationItem.businessCode) &&
        Objects.equals(this.orderer, vmOpenApiTranslationItem.orderer) &&
        Objects.equals(this.orderId, vmOpenApiTranslationItem.orderId) &&
        Objects.equals(this.orderState, vmOpenApiTranslationItem.orderState) &&
        Objects.equals(this.orderDate, vmOpenApiTranslationItem.orderDate) &&
        Objects.equals(this.orderResolvedDate, vmOpenApiTranslationItem.orderResolvedDate) &&
        Objects.equals(this.sourceLanguage, vmOpenApiTranslationItem.sourceLanguage) &&
        Objects.equals(this.sourceLanguageCharAmount, vmOpenApiTranslationItem.sourceLanguageCharAmount) &&
        Objects.equals(this.targetLanguage, vmOpenApiTranslationItem.targetLanguage) &&
        Objects.equals(this.type, vmOpenApiTranslationItem.type) &&
        Objects.equals(this.itemId, vmOpenApiTranslationItem.itemId) &&
        Objects.equals(this.itemName, vmOpenApiTranslationItem.itemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, organizationName, businessCode, orderer, orderId, orderState, orderDate, orderResolvedDate, sourceLanguage, sourceLanguageCharAmount, targetLanguage, type, itemId, itemName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiTranslationItem {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    orderer: ").append(toIndentedString(orderer)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderState: ").append(toIndentedString(orderState)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderResolvedDate: ").append(toIndentedString(orderResolvedDate)).append("\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    sourceLanguageCharAmount: ").append(toIndentedString(sourceLanguageCharAmount)).append("\n");
    sb.append("    targetLanguage: ").append(toIndentedString(targetLanguage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
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
