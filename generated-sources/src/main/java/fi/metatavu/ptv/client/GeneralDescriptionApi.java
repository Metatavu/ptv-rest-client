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

package fi.metatavu.ptv.client;

import fi.metatavu.ptv.client.model.*;

import fi.metatavu.ptv.client.model.IVmError;
import fi.metatavu.ptv.client.model.V3VmOpenApiGuidPage;
import fi.metatavu.ptv.client.model.V6VmOpenApiGeneralDescription;
import fi.metatavu.ptv.client.model.V6VmOpenApiGeneralDescriptionIn;
import fi.metatavu.ptv.client.model.V6VmOpenApiGeneralDescriptionInBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-17T09:06:52.024+03:00")
public class GeneralDescriptionApi {

  public GeneralDescriptionApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single statutory service general description.
   * 
   * @param id Statutory service general description guid (id of the entity) to fetch. (required)
   */
  public ApiResponse<V6VmOpenApiGeneralDescription> apiV6GeneralDescriptionByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/GeneralDescription/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiGeneralDescription> resultType = new ResultType<V6VmOpenApiGeneralDescription>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates the defined general description with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Names\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param id Statutory service general description identifier (required)
   * @param request The general description data. (optional)
   */
  public ApiResponse<V6VmOpenApiGeneralDescription> apiV6GeneralDescriptionByIdPut(String id, V6VmOpenApiGeneralDescriptionInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/GeneralDescription/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiGeneralDescription> resultType = new ResultType<V6VmOpenApiGeneralDescription>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all the statutory service general descriptions within PTV as a list of ids and names.  Descriptions created/modified after certain date can be fetched by adding date as query string parameter.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Names\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page to be fetched. Page numbering starts from one. (optional)
   */
  public ApiResponse<V3VmOpenApiGuidPage> apiV6GeneralDescriptionGet(@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using =  fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v6/GeneralDescription";
      
    ResultType<V3VmOpenApiGuidPage> resultType = new ResultType<V3VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new general description with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Names\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param request The general description data. (optional)
   */
  public ApiResponse<V6VmOpenApiGeneralDescription> apiV6GeneralDescriptionPost(V6VmOpenApiGeneralDescriptionIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/GeneralDescription";
      
    ResultType<V6VmOpenApiGeneralDescription> resultType = new ResultType<V6VmOpenApiGeneralDescription>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}
