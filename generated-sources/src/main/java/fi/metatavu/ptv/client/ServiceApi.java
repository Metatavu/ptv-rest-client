/**
 * PTV Open Api version 5
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v5
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

package fi.metatavu.ptv.client;

import fi.metatavu.ptv.client.model.*;

import fi.metatavu.ptv.client.model.IVmError;
import fi.metatavu.ptv.client.model.V5VmOpenApiService;
import fi.metatavu.ptv.client.model.V5VmOpenApiServiceInBase;
import java.time.OffsetDateTime;
import fi.metatavu.ptv.client.model.V3VmOpenApiGuidPage;
import fi.metatavu.ptv.client.model.V5VmOpenApiServiceIn;
import fi.metatavu.ptv.client.model.V5VmOpenApiServiceAndChannelRelationInBase;
import fi.metatavu.ptv.client.model.V2VmOpenApiServiceAndChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T15:53:23.977+03:00")
public class ServiceApi {

  public ServiceApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single service.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;id\&quot;: [                      \&quot;Guid should contain 32 digits with 4 dashes (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx).\&quot;                  ]              }              &lt;/code&gt;
   * @param id Guid (required)
   */
  public ApiResponse<V5VmOpenApiService> apiV5ServiceByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v5/Service/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V5VmOpenApiService> resultType = new ResultType<V5VmOpenApiService>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates the defined service with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceNames[0].Type\&quot;: [                      \&quot;The Type field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id Service identifier (required)
   * @param request The service data (optional)
   */
  public ApiResponse<V5VmOpenApiService> apiV5ServiceByIdPut(String id, V5VmOpenApiServiceInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v5/Service/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V5VmOpenApiService> resultType = new ResultType<V5VmOpenApiService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all the published services within PTV as a list of service ids and names.  Services created after certain date can be fetched by adding date as query string parameter.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;date\&quot;: [                      \&quot;The value &#39;rfsd&#39; is not valid for Nullable&#x60;1.\&quot;,                      \&quot;The date parameter is invalid.\&quot;                  ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   * @param page The page number to be fetched. (optional)
   */
  public ApiResponse<V3VmOpenApiGuidPage> apiV5ServiceGet(OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v5/Service";
      
    ResultType<V3VmOpenApiGuidPage> resultType = new ResultType<V3VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new service with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceNames\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param request The service data. (optional)
   */
  public ApiResponse<V5VmOpenApiService> apiV5ServicePost(V5VmOpenApiServiceIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v5/Service";
      
    ResultType<V5VmOpenApiService> resultType = new ResultType<V5VmOpenApiService>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates relationships between services and service channels with extra data.   Request includes service channels for one certain service so service channels missing from request are removed.  To delete all service channel relations for a service set &#39;deleteAllChannelRelations&#39; property to true.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Service with id &#39;00000000-0000-0000-0000-00000000&#39; not found!\&quot;              }              &lt;/code&gt;
   * @param serviceId Service identifier (required)
   * @param request A list of service channels. (optional)
   */
  public ApiResponse<V5VmOpenApiService> apiV5ServiceServiceAndChannelByServiceIdPut(String serviceId, V5VmOpenApiServiceAndChannelRelationInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v5/Service/ServiceAndChannel/{serviceId}"
      .replaceAll("\\{" + "serviceId" + "\\}", serviceId);
      
    ResultType<V5VmOpenApiService> resultType = new ResultType<V5VmOpenApiService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a relationships between services and service channels with extra data.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Service with id &#39;00000000-0000-0000-0000-00000000&#39; not found!\&quot;              }              &lt;/code&gt;
   * @param request A list of services and service channels. (optional)
   */
  public ApiResponse<List<String>> apiV5ServiceServiceAndChannelPost(List<V2VmOpenApiServiceAndChannel> request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v5/Service/ServiceAndChannel";
      
    ResultType<List<String>> resultType = new ResultType<List<String>>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of published services for defined service channel.  Services joined to service channel after certain date can be fetched by adding date as query string parameter.
   * 
   * @param serviceChannelId Guid (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   */
  public ApiResponse<List<V5VmOpenApiService>> apiV5ServiceServiceChannelByServiceChannelIdGet(String serviceChannelId, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/v5/Service/serviceChannel/{serviceChannelId}"
      .replaceAll("\\{" + "serviceChannelId" + "\\}", serviceChannelId);
      
    ResultType<List<V5VmOpenApiService>> resultType = new ResultType<List<V5VmOpenApiService>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates the defined service with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceNames[0].Type\&quot;: [                      \&quot;The Type field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId External source identifier (required)
   * @param request The service data (optional)
   */
  public ApiResponse<V5VmOpenApiService> apiV5ServiceSourceIdBySourceIdPut(String sourceId, V5VmOpenApiServiceInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v5/Service/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V5VmOpenApiService> resultType = new ResultType<V5VmOpenApiService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}
