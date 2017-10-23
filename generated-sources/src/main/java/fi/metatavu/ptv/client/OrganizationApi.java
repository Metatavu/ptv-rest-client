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

package fi.metatavu.ptv.client;

import fi.metatavu.ptv.client.model.*;

import fi.metatavu.ptv.client.model.IVmError;
import fi.metatavu.ptv.client.model.V7VmOpenApiOrganization;
import fi.metatavu.ptv.client.model.V7VmOpenApiOrganizationIn;
import fi.metatavu.ptv.client.model.V7VmOpenApiOrganizationInBase;
import fi.metatavu.ptv.client.model.VmOpenApiOrganizationGuidPage;
import fi.metatavu.ptv.client.model.VmOpenApiOrganizationSaha;
import fi.metatavu.ptv.client.model.VmOpenApiOrganizationSahaGuidPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class OrganizationApi {
  
  private ApiClient client;
  private String accessToken;

  public OrganizationApi(ApiClient client, String accessToken) {
    this.client = client;
    this.accessToken = accessToken;
  }
  
  /**
   * Fetches all the information related to organizations with defined business identity code.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;code\&quot;: [                   \&quot;The field code must match the regular expression &#39;^[0-9]{7}-[0-9]{1}$&#39;.\&quot;                 ]              }              &lt;/code&gt;
   * @param code Finnish business identity code (Y-tunnus). (required)
   */
  public ApiResponse<List<V7VmOpenApiOrganization>> apiV7OrganizationBusinesscodeByCodeGet(String code) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/Organization/businesscode/{code}"
      .replaceAll("\\{" + "code" + "\\}", code);
      
    ResultType<List<V7VmOpenApiOrganization>> resultType = new ResultType<List<V7VmOpenApiOrganization>>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Fetches all the information related to a single organization.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;id\&quot;: [                   \&quot;Guid should contain 32 digits with 4 dashes (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx).\&quot;                 ]              }              &lt;/code&gt;
   * @param id Guid (required)
   */
  public ApiResponse<V7VmOpenApiOrganization> apiV7OrganizationByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/Organization/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V7VmOpenApiOrganization> resultType = new ResultType<V7VmOpenApiOrganization>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Updates organization.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;propertyname\&quot;: [                   \&quot;The field propertyname has invalid characters.\&quot;                 ]              }              &lt;/code&gt;
   * @param id organization entity id (required)
   * @param request organization values (optional)
   */
  public ApiResponse<V7VmOpenApiOrganization> apiV7OrganizationByIdPut(String id, V7VmOpenApiOrganizationInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/Organization/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V7VmOpenApiOrganization> resultType = new ResultType<V7VmOpenApiOrganization>() {};
    return client.doPUTRequest(this.accessToken, path, resultType, queryParams, formParams,request);
  }
  /**
   * Gets all the published organizations within PTV as a list of organization ids and names.  Organizations created/modified after certain date can be fetched by adding date as query string parameter.  Archived items can be fetched by setting parameter archived to true.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;date\&quot;: [                   \&quot;The value &#39;-2&#39; is not valid for Nullable&#x60;1.\&quot;,                   \&quot;The date parameter is invalid.\&quot;                 ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional)
   * @param archived Get archived items by setting archived to true. (optional)
   */
  public ApiResponse<VmOpenApiOrganizationGuidPage> apiV7OrganizationGet(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, Integer page, Boolean archived) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
if (archived != null)
    queryParams.put("archived", archived);
    
        
    String path = "/api/v7/Organization";
      
    ResultType<VmOpenApiOrganizationGuidPage> resultType = new ResultType<VmOpenApiOrganizationGuidPage>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of published organizations related to defined municipality.  Services created after certain date can be fetched by adding date as query string parameter.
   * 
   * @param code Municipality code (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional)
   */
  public ApiResponse<VmOpenApiOrganizationGuidPage> apiV7OrganizationMunicipalityByCodeGet(String code, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v7/Organization/municipality/{code}"
      .replaceAll("\\{" + "code" + "\\}", code);
      
    ResultType<VmOpenApiOrganizationGuidPage> resultType = new ResultType<VmOpenApiOrganizationGuidPage>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Fetches all the information related to a single organization with defined Oid.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;oid\&quot;: [                   \&quot;The field oid must match the regular expression &#39;^[A-Za-z0-9.-]*$&#39;.\&quot;                 ]              }              &lt;/code&gt;
   * @param oid Oid identifier (required)
   */
  public ApiResponse<V7VmOpenApiOrganization> apiV7OrganizationOidByOidGet(String oid) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/Organization/oid/{oid}"
      .replaceAll("\\{" + "oid" + "\\}", oid);
      
    ResultType<V7VmOpenApiOrganization> resultType = new ResultType<V7VmOpenApiOrganization>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new organization with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Addresses[1].StreetAddress\&quot;: [                      \&quot;The StreetAddress field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param request The organization data. (optional)
   */
  public ApiResponse<V7VmOpenApiOrganization> apiV7OrganizationPost(V7VmOpenApiOrganizationIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/Organization";
      
    ResultType<V7VmOpenApiOrganization> resultType = new ResultType<V7VmOpenApiOrganization>() {};
    return client.doPOSTRequest(this.accessToken, path, resultType, queryParams, formParams,request);
  }
  /**
   * Fetches Saha related information of a single organization.  NOTE! This is a restricted endpoint.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;id\&quot;: [                   \&quot;Guid should contain 32 digits with 4 dashes (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx).\&quot;                 ]              }              &lt;/code&gt;
   * @param id Guid (required)
   */
  public ApiResponse<VmOpenApiOrganizationSaha> apiV7OrganizationSahaByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/Organization/saha/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<VmOpenApiOrganizationSaha> resultType = new ResultType<VmOpenApiOrganizationSaha>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Gets main organizations and two sub levels of organizations. Returns both published and archived organizations.  NOTE! This is a restricted endpoint.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;date\&quot;: [                   \&quot;The value &#39;-2&#39; is not valid for Nullable&#x60;1.\&quot;,                   \&quot;The date parameter is invalid.\&quot;                 ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional)
   */
  public ApiResponse<VmOpenApiOrganizationSahaGuidPage> apiV7OrganizationSahaGet(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v7/Organization/saha";
      
    ResultType<VmOpenApiOrganizationSahaGuidPage> resultType = new ResultType<VmOpenApiOrganizationSahaGuidPage>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Updates organization.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;propertyname\&quot;: [                   \&quot;The field propertyname has invalid characters.\&quot;                 ]              }              &lt;/code&gt;
   * @param sourceId organization external id (required)
   * @param request organization values (optional)
   */
  public ApiResponse<V7VmOpenApiOrganization> apiV7OrganizationSourceIdBySourceIdPut(String sourceId, V7VmOpenApiOrganizationInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/Organization/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V7VmOpenApiOrganization> resultType = new ResultType<V7VmOpenApiOrganization>() {};
    return client.doPUTRequest(this.accessToken, path, resultType, queryParams, formParams,request);
  }
}
