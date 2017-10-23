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
import fi.metatavu.ptv.client.model.V3VmOpenApiGuidPage;
import fi.metatavu.ptv.client.model.V7VmOpenApiServiceCollection;
import fi.metatavu.ptv.client.model.V7VmOpenApiServiceCollectionIn;
import fi.metatavu.ptv.client.model.V7VmOpenApiServiceCollectionInBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class ServiceCollectionApi {
  
  private ApiClient client;
  private String accessToken;

  public ServiceCollectionApi(ApiClient client, String accessToken) {
    this.client = client;
    this.accessToken = accessToken;
  }
  
  /**
   * Fetches all the information related to a single service collection.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;id\&quot;: [                      \&quot;Guid should contain 32 digits with 4 dashes (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx).\&quot;                  ]              }              &lt;/code&gt;
   * @param id Guid (required)
   */
  public ApiResponse<V7VmOpenApiServiceCollection> apiV7ServiceCollectionByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/ServiceCollection/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V7VmOpenApiServiceCollection> resultType = new ResultType<V7VmOpenApiServiceCollection>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Updates the defined service collection with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceCollectionNames[0].Type\&quot;: [                      \&quot;The Type field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id Service collection identifier (required)
   * @param request The service collection data (optional)
   */
  public ApiResponse<V7VmOpenApiServiceCollection> apiV7ServiceCollectionByIdPut(String id, V7VmOpenApiServiceCollectionInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/ServiceCollection/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V7VmOpenApiServiceCollection> resultType = new ResultType<V7VmOpenApiServiceCollection>() {};
    return client.doPUTRequest(this.accessToken, path, resultType, queryParams, formParams,request);
  }
  /**
   * Gets all the published service collections within PTV as a list of service collection ids and names.  Service collections created after certain date can be fetched by adding date as query string parameter.  Archived items can be fetched by setting parameter archived to true.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;date\&quot;: [                      \&quot;The value &#39;rfsd&#39; is not valid for Nullable&#x60;1.\&quot;,                      \&quot;The date parameter is invalid.\&quot;                  ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional)
   * @param archived Get archived items by setting archived to true. (optional)
   */
  public ApiResponse<V3VmOpenApiGuidPage> apiV7ServiceCollectionGet(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, Integer page, Boolean archived) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
if (archived != null)
    queryParams.put("archived", archived);
    
        
    String path = "/api/v7/ServiceCollection";
      
    ResultType<V3VmOpenApiGuidPage> resultType = new ResultType<V3VmOpenApiGuidPage>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new service collection with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceCollectionNames\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param request The service collection data. (optional)
   */
  public ApiResponse<V7VmOpenApiServiceCollection> apiV7ServiceCollectionPost(V7VmOpenApiServiceCollectionIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/ServiceCollection";
      
    ResultType<V7VmOpenApiServiceCollection> resultType = new ResultType<V7VmOpenApiServiceCollection>() {};
    return client.doPOSTRequest(this.accessToken, path, resultType, queryParams, formParams,request);
  }
  /**
   * Updates the defined service collection with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceCollectionNames[0].Type\&quot;: [                      \&quot;The Type field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId External source identifier (required)
   * @param request The service collection data (optional)
   */
  public ApiResponse<V7VmOpenApiServiceCollection> apiV7ServiceCollectionSourceIdBySourceIdPut(String sourceId, V7VmOpenApiServiceCollectionInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v7/ServiceCollection/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V7VmOpenApiServiceCollection> resultType = new ResultType<V7VmOpenApiServiceCollection>() {};
    return client.doPUTRequest(this.accessToken, path, resultType, queryParams, formParams,request);
  }
}
