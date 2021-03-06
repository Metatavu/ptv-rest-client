/*
 * PTV Open Api version 10
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v10
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
import fi.metatavu.ptv.client.model.VmOpenApiItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API V3 - View Model of guid page
 */
@ApiModel(description = "OPEN API V3 - View Model of guid page")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class V3VmOpenApiGuidPage {
  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("itemList")
  private List<VmOpenApiItem> itemList = null;

  public V3VmOpenApiGuidPage pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Resultset page number (resultset paging). Page numbering starts from one.
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Resultset page number (resultset paging). Page numbering starts from one.")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public V3VmOpenApiGuidPage pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * How many results per page are returned (resultset paging).
   * @return pageSize
  **/
  @ApiModelProperty(value = "How many results per page are returned (resultset paging).")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public V3VmOpenApiGuidPage pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Total count of pages the resultset has (resultset paging).
   * @return pageCount
  **/
  @ApiModelProperty(value = "Total count of pages the resultset has (resultset paging).")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public V3VmOpenApiGuidPage itemList(List<VmOpenApiItem> itemList) {
    this.itemList = itemList;
    return this;
  }

  public V3VmOpenApiGuidPage addItemListItem(VmOpenApiItem itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<VmOpenApiItem>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * List of entity Guids.
   * @return itemList
  **/
  @ApiModelProperty(value = "List of entity Guids.")
  public List<VmOpenApiItem> getItemList() {
    return itemList;
  }

  public void setItemList(List<VmOpenApiItem> itemList) {
    this.itemList = itemList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3VmOpenApiGuidPage v3VmOpenApiGuidPage = (V3VmOpenApiGuidPage) o;
    return Objects.equals(this.pageNumber, v3VmOpenApiGuidPage.pageNumber) &&
        Objects.equals(this.pageSize, v3VmOpenApiGuidPage.pageSize) &&
        Objects.equals(this.pageCount, v3VmOpenApiGuidPage.pageCount) &&
        Objects.equals(this.itemList, v3VmOpenApiGuidPage.itemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, pageCount, itemList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3VmOpenApiGuidPage {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
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

