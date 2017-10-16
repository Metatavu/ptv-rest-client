/**
 * PTV Open Api version 6
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v6
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
import fi.metatavu.ptv.client.model.V6VmOpenApiService;
import fi.metatavu.ptv.client.model.V6VmOpenApiServiceInBase;
import java.time.OffsetDateTime;
import fi.metatavu.ptv.client.model.V3VmOpenApiGuidPage;
import fi.metatavu.ptv.client.model.V6VmOpenApiServiceIn;
import fi.metatavu.ptv.client.model.V5VmOpenApiServiceAndChannelRelationInBase;
import fi.metatavu.ptv.client.model.V6VmOpenApiServiceAndChannelRelationBySourceInBase;
import fi.metatavu.ptv.client.model.VmOpenApiServiceServiceChannelBySource;
import fi.metatavu.ptv.client.model.V2VmOpenApiServiceAndChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-16T08:07:52.212+03:00")
public class ServiceApi {

  public ServiceApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single service.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;id\&quot;: [                      \&quot;Guid should contain 32 digits with 4 dashes (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx).\&quot;                  ]              }              &lt;/code&gt;
   * @param id Guid (required)
   */
  public ApiResponse<V6VmOpenApiService> apiV6ServiceByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiService> resultType = new ResultType<V6VmOpenApiService>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates the defined service with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceNames[0].Type\&quot;: [                      \&quot;The Type field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id Service identifier (required)
   * @param request The service data (optional)
   */
  public ApiResponse<V6VmOpenApiService> apiV6ServiceByIdPut(String id, V6VmOpenApiServiceInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiService> resultType = new ResultType<V6VmOpenApiService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all the published services within PTV as a list of service ids and names.  Services created after certain date can be fetched by adding date as query string parameter.  Archived items can be fetched by setting parameter archived to true.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;date\&quot;: [                      \&quot;The value &#39;rfsd&#39; is not valid for Nullable&#x60;1.\&quot;,                      \&quot;The date parameter is invalid.\&quot;                  ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional)
   * @param archived Get archived items by setting archived to true. (optional)
   */
  public ApiResponse<V3VmOpenApiGuidPage> apiV6ServiceGet(OffsetDateTime date, Integer page, Boolean archived) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
if (archived != null)
    queryParams.put("archived", archived);
    
        
    String path = "/api/v6/Service";
      
    ResultType<V3VmOpenApiGuidPage> resultType = new ResultType<V3VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new service with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceNames\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param request The service data. (optional)
   */
  public ApiResponse<V6VmOpenApiService> apiV6ServicePost(V6VmOpenApiServiceIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service";
      
    ResultType<V6VmOpenApiService> resultType = new ResultType<V6VmOpenApiService>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates relationships between a service and service channels with extra data.   Request includes service channels for one certain service so service channels missing from request are removed.  To delete all service channel relations for a service set &#39;deleteAllChannelRelations&#39; property to true.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Service with id &#39;00000000-0000-0000-0000-00000000&#39; not found!\&quot;              }              &lt;/code&gt;
   * @param serviceId Service identifier (required)
   * @param request A list of service channels. (optional)
   */
  public ApiResponse<V6VmOpenApiService> apiV6ServiceServiceAndChannelByServiceIdPut(String serviceId, V5VmOpenApiServiceAndChannelRelationInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service/ServiceAndChannel/{serviceId}"
      .replaceAll("\\{" + "serviceId" + "\\}", serviceId);
      
    ResultType<V6VmOpenApiService> resultType = new ResultType<V6VmOpenApiService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates relationships between a service and service channels with extra data. External source ids are used.  Request includes service channels for one certain service so service channels missing from request are removed.  To delete all service channel relations for a service set &#39;deleteAllChannelRelations&#39; property to true.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Service with id &#39;00000000-0000-0000-0000-00000000&#39; not found!\&quot;              }              &lt;/code&gt;
   * @param serviceSourceId External source identifier for service (required)
   * @param request A list of service channels. (optional)
   */
  public ApiResponse<V6VmOpenApiService> apiV6ServiceServiceAndChannelBySourceByServiceSourceIdPut(String serviceSourceId, V6VmOpenApiServiceAndChannelRelationBySourceInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service/ServiceAndChannelBySource/{serviceSourceId}"
      .replaceAll("\\{" + "serviceSourceId" + "\\}", serviceSourceId);
      
    ResultType<V6VmOpenApiService> resultType = new ResultType<V6VmOpenApiService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a relationships between services and service channels with extra data. External source ids are used.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Service with id &#39;00000000-0000-0000-0000-00000000&#39; not found!\&quot;              }              &lt;/code&gt;
   * @param request A list of services and service channels. (optional)
   */
  public ApiResponse<List<String>> apiV6ServiceServiceAndChannelBySourcePost(List<VmOpenApiServiceServiceChannelBySource> request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service/ServiceAndChannelBySource";
      
    ResultType<List<String>> resultType = new ResultType<List<String>>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a relationships between services and service channels with extra data.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Service with id &#39;00000000-0000-0000-0000-00000000&#39; not found!\&quot;              }              &lt;/code&gt;
   * @param request A list of services and service channels. (optional)
   */
  public ApiResponse<List<String>> apiV6ServiceServiceAndChannelPost(List<V2VmOpenApiServiceAndChannel> request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service/ServiceAndChannel";
      
    ResultType<List<String>> resultType = new ResultType<List<String>>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of published services for defined service channel.  Services joined to service channel after certain date can be fetched by adding date as query string parameter.
   * 
   * @param serviceChannelId Guid (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   */
  public ApiResponse<List<V6VmOpenApiService>> apiV6ServiceServiceChannelByServiceChannelIdGet(String serviceChannelId, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/v6/Service/serviceChannel/{serviceChannelId}"
      .replaceAll("\\{" + "serviceChannelId" + "\\}", serviceChannelId);
      
    ResultType<List<V6VmOpenApiService>> resultType = new ResultType<List<V6VmOpenApiService>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of published services for defined service class.  Services created after certain date can be fetched by adding date as query string parameter.
   * 
   * @param uri Service class uri, e.g. http://urn.fi/URN:NBN:fi:au:ptvl:P18 (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional)
   */
  public ApiResponse<V3VmOpenApiGuidPage> apiV6ServiceServiceClassByUriGet(String uri, OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v6/Service/serviceClass/{uri}"
      .replaceAll("\\{" + "uri" + "\\}", uri);
      
    ResultType<V3VmOpenApiGuidPage> resultType = new ResultType<V3VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates the defined service with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceNames[0].Type\&quot;: [                      \&quot;The Type field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId External source identifier (required)
   * @param request The service data (optional)
   */
  public ApiResponse<V6VmOpenApiService> apiV6ServiceSourceIdBySourceIdPut(String sourceId, V6VmOpenApiServiceInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/Service/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V6VmOpenApiService> resultType = new ResultType<V6VmOpenApiService>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}
