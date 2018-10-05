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
import fi.metatavu.ptv.client.model.VmOpenApiCodeListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API - View Model of code list page
 */
@ApiModel(description = "OPEN API - View Model of code list page")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class VmOpenApiCodeListPage {
  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("pageCount")
  private Integer pageCount = null;

  @JsonProperty("itemList")
  private List<VmOpenApiCodeListItem> itemList = null;

  public VmOpenApiCodeListPage pageNumber(Integer pageNumber) {
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

  public VmOpenApiCodeListPage pageSize(Integer pageSize) {
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

  public VmOpenApiCodeListPage pageCount(Integer pageCount) {
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

  public VmOpenApiCodeListPage itemList(List<VmOpenApiCodeListItem> itemList) {
    this.itemList = itemList;
    return this;
  }

  public VmOpenApiCodeListPage addItemListItem(VmOpenApiCodeListItem itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<VmOpenApiCodeListItem>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * List of code list items.
   * @return itemList
  **/
  @ApiModelProperty(value = "List of code list items.")
  public List<VmOpenApiCodeListItem> getItemList() {
    return itemList;
  }

  public void setItemList(List<VmOpenApiCodeListItem> itemList) {
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
    VmOpenApiCodeListPage vmOpenApiCodeListPage = (VmOpenApiCodeListPage) o;
    return Objects.equals(this.pageNumber, vmOpenApiCodeListPage.pageNumber) &&
        Objects.equals(this.pageSize, vmOpenApiCodeListPage.pageSize) &&
        Objects.equals(this.pageCount, vmOpenApiCodeListPage.pageCount) &&
        Objects.equals(this.itemList, vmOpenApiCodeListPage.itemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, pageCount, itemList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiCodeListPage {\n");
    
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

