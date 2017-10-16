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
import fi.metatavu.ptv.client.model.V6VmOpenApiServiceChannels;
import fi.metatavu.ptv.client.model.V6VmOpenApiElectronicChannel;
import fi.metatavu.ptv.client.model.V6VmOpenApiElectronicChannelInBase;
import fi.metatavu.ptv.client.model.V6VmOpenApiElectronicChannelIn;
import java.time.OffsetDateTime;
import fi.metatavu.ptv.client.model.V3VmOpenApiGuidPage;
import fi.metatavu.ptv.client.model.V6VmOpenApiPhoneChannelInBase;
import fi.metatavu.ptv.client.model.V6VmOpenApiPhoneChannel;
import fi.metatavu.ptv.client.model.V6VmOpenApiPhoneChannelIn;
import fi.metatavu.ptv.client.model.V6VmOpenApiPrintableFormChannel;
import fi.metatavu.ptv.client.model.V6VmOpenApiPrintableFormChannelInBase;
import fi.metatavu.ptv.client.model.V6VmOpenApiPrintableFormChannelIn;
import fi.metatavu.ptv.client.model.V6VmOpenApiServiceLocationChannelInBase;
import fi.metatavu.ptv.client.model.V6VmOpenApiServiceLocationChannel;
import fi.metatavu.ptv.client.model.V6VmOpenApiServiceLocationChannelIn;
import fi.metatavu.ptv.client.model.V6VmOpenApiWebPageChannelInBase;
import fi.metatavu.ptv.client.model.V6VmOpenApiWebPageChannel;
import fi.metatavu.ptv.client.model.V6VmOpenApiWebPageChannelIn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-16T08:07:52.212+03:00")
public class ServiceChannelApi {

  public ServiceChannelApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single service channel.
   * &lt;para&gt;Notice! The returned object is one of the following: &lt;i&gt;V6VmOpenApiElectronicChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiPhoneChannel&lt;/i&gt; or               &lt;i&gt;V6VmOpenApiPrintableFormChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiServiceLocationChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiWebPageChannel&lt;/i&gt;&lt;/para&gt;  &lt;para&gt;The returned object depends on the type of the channel. For example if the channel is phone channel then V6VmOpenApiPhoneChannel object is returned.&lt;/para&gt;  &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;id\&quot;: [                     \&quot;Guid should contain 32 digits with 4 dashes (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx).\&quot;                 ]              }              &lt;/code&gt;
   * @param id Guid (required)
   */
  public ApiResponse<V6VmOpenApiServiceChannels> apiV6ServiceChannelByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiServiceChannels> resultType = new ResultType<V6VmOpenApiServiceChannels>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates a new electronic channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id electronic channel id (required)
   * @param request electronic channel data (optional)
   */
  public ApiResponse<V6VmOpenApiElectronicChannel> apiV6ServiceChannelEChannelByIdPut(String id, V6VmOpenApiElectronicChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/EChannel/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiElectronicChannel> resultType = new ResultType<V6VmOpenApiElectronicChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new electronic channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param request The electronic channel data. (optional)
   */
  public ApiResponse<V6VmOpenApiElectronicChannel> apiV6ServiceChannelEChannelPost(V6VmOpenApiElectronicChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/EChannel";
      
    ResultType<V6VmOpenApiElectronicChannel> resultType = new ResultType<V6VmOpenApiElectronicChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates a new electronic channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId electronic channel external source id (required)
   * @param request electronic channel data (optional)
   */
  public ApiResponse<V6VmOpenApiElectronicChannel> apiV6ServiceChannelEChannelSourceIdBySourceIdPut(String sourceId, V6VmOpenApiElectronicChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/EChannel/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V6VmOpenApiElectronicChannel> resultType = new ResultType<V6VmOpenApiElectronicChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all published service channels within PTV as a list of service channel ids and names.  Service channels created/modified after certain date can be fetched by adding date as query string parameter.  Archived items can be fetched by setting parameter archived to true.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;date\&quot;: [                   \&quot;The value &#39;-5&#39; is not valid for Nullable&#x60;1.\&quot;,                   \&quot;The date parameter is invalid.\&quot;                 ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page to be fetched. (optional)
   * @param archived Get archived items by setting archived to true. (optional)
   */
  public ApiResponse<V3VmOpenApiGuidPage> apiV6ServiceChannelGet(OffsetDateTime date, Integer page, Boolean archived) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
if (archived != null)
    queryParams.put("archived", archived);
    
        
    String path = "/api/v6/ServiceChannel";
      
    ResultType<V3VmOpenApiGuidPage> resultType = new ResultType<V3VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of published service channels for defined organization.   Service channels created/modified after certain date can be fetched by adding date as query string parameter.
   * &lt;para&gt;Notice! The returned object is one of the following: &lt;i&gt;V6VmOpenApiElectronicChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiPhoneChannel&lt;/i&gt; or               &lt;i&gt;V6VmOpenApiPrintableFormChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiServiceLocationChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiWebPageChannel&lt;/i&gt;&lt;/para&gt;  &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;date\&quot;: [                     \&quot;The value &#39;-2&#39; is not valid for Nullable&#x60;1.\&quot;,                     \&quot;The date parameter is invalid.\&quot;                 ]              }              &lt;/code&gt;
   * @param organizationId Guid (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   */
  public ApiResponse<List<V6VmOpenApiServiceChannels>> apiV6ServiceChannelOrganizationByOrganizationIdGet(String organizationId, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/v6/ServiceChannel/organization/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", organizationId);
      
    ResultType<List<V6VmOpenApiServiceChannels>> resultType = new ResultType<List<V6VmOpenApiServiceChannels>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of certain type of published service channels for defined organization.  Service channels created/modified after certain date can be fetched by adding date as query string parameter.
   * &lt;para&gt;Notice! The returned object is one of the following: &lt;i&gt;V6VmOpenApiElectronicChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiPhoneChannel&lt;/i&gt; or               &lt;i&gt;V6VmOpenApiPrintableFormChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiServiceLocationChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiWebPageChannel&lt;/i&gt;&lt;/para&gt;  &lt;para&gt;The returned object depends on the type parameter. For example if the request type was &#39;Phone&#39; then V6VmOpenApiPhoneChannel objects are returned.&lt;/para&gt;  &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;type\&quot;: [                     \&quot;The field is invalid. Please use one of these: &#39;EChannel, WebPage, PrintableForm, Phone, ServiceLocation&#39;.\&quot;                 ]              }              &lt;/code&gt;
   * @param organizationId Guid (required)
   * @param type Service channel type (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   */
  public ApiResponse<List<V6VmOpenApiServiceChannels>> apiV6ServiceChannelOrganizationByOrganizationIdTypeByTypeGet(String organizationId, String type, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/v6/ServiceChannel/organization/{organizationId}/type/{type}"
      .replaceAll("\\{" + "organizationId" + "\\}", organizationId)
      .replaceAll("\\{" + "type" + "\\}", type);
      
    ResultType<List<V6VmOpenApiServiceChannels>> resultType = new ResultType<List<V6VmOpenApiServiceChannels>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates phone channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id phone channel id (required)
   * @param request phone channel data (optional)
   */
  public ApiResponse<V6VmOpenApiPhoneChannel> apiV6ServiceChannelPhoneByIdPut(String id, V6VmOpenApiPhoneChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/Phone/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiPhoneChannel> resultType = new ResultType<V6VmOpenApiPhoneChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new phone channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param request The phone channel data. (optional)
   */
  public ApiResponse<V6VmOpenApiPhoneChannel> apiV6ServiceChannelPhonePost(V6VmOpenApiPhoneChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/Phone";
      
    ResultType<V6VmOpenApiPhoneChannel> resultType = new ResultType<V6VmOpenApiPhoneChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates phone channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId phone channel external id (required)
   * @param request phone channel data (optional)
   */
  public ApiResponse<V6VmOpenApiPhoneChannel> apiV6ServiceChannelPhoneSourceIdBySourceIdPut(String sourceId, V6VmOpenApiPhoneChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/Phone/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V6VmOpenApiPhoneChannel> resultType = new ResultType<V6VmOpenApiPhoneChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates printable form channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id printable form channel id (required)
   * @param request printable form channel data (optional)
   */
  public ApiResponse<V6VmOpenApiPrintableFormChannel> apiV6ServiceChannelPrintableFormByIdPut(String id, V6VmOpenApiPrintableFormChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/PrintableForm/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiPrintableFormChannel> resultType = new ResultType<V6VmOpenApiPrintableFormChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new printable form channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param request The printable form channel data. (optional)
   */
  public ApiResponse<V6VmOpenApiPrintableFormChannel> apiV6ServiceChannelPrintableFormPost(V6VmOpenApiPrintableFormChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/PrintableForm";
      
    ResultType<V6VmOpenApiPrintableFormChannel> resultType = new ResultType<V6VmOpenApiPrintableFormChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates printable form channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId printable form channel external source id (required)
   * @param request printable form channel data (optional)
   */
  public ApiResponse<V6VmOpenApiPrintableFormChannel> apiV6ServiceChannelPrintableFormSourceIdBySourceIdPut(String sourceId, V6VmOpenApiPrintableFormChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/PrintableForm/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V6VmOpenApiPrintableFormChannel> resultType = new ResultType<V6VmOpenApiPrintableFormChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates a new service location channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id service location channel id (required)
   * @param request service location channel data. (optional)
   */
  public ApiResponse<V6VmOpenApiServiceLocationChannel> apiV6ServiceChannelServiceLocationByIdPut(String id, V6VmOpenApiServiceLocationChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/ServiceLocation/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiServiceLocationChannel> resultType = new ResultType<V6VmOpenApiServiceLocationChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new service location channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param request The service location channel data. (optional)
   */
  public ApiResponse<V6VmOpenApiServiceLocationChannel> apiV6ServiceChannelServiceLocationPost(V6VmOpenApiServiceLocationChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/ServiceLocation";
      
    ResultType<V6VmOpenApiServiceLocationChannel> resultType = new ResultType<V6VmOpenApiServiceLocationChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates a new service location channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId service location channel external source id (required)
   * @param request service location channel data (optional)
   */
  public ApiResponse<V6VmOpenApiServiceLocationChannel> apiV6ServiceChannelServiceLocationSourceIdBySourceIdPut(String sourceId, V6VmOpenApiServiceLocationChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/ServiceLocation/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V6VmOpenApiServiceLocationChannel> resultType = new ResultType<V6VmOpenApiServiceLocationChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of certain type of published service channels.  Service channels created/modified after certain date can be fetched by adding date as query string parameter.
   * &lt;para&gt;Notice! The returned object is one of the following: &lt;i&gt;V6VmOpenApiElectronicChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiPhoneChannel&lt;/i&gt; or               &lt;i&gt;V6VmOpenApiPrintableFormChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiServiceLocationChannel&lt;/i&gt; or &lt;i&gt;V6VmOpenApiWebPageChannel&lt;/i&gt;&lt;/para&gt;  &lt;para&gt;The returned object depends on the type parameter. For example if the request type was &#39;Phone&#39; then V6VmOpenApiPhoneChannel objects are returned.&lt;/para&gt;  &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                 \&quot;type\&quot;: [                     \&quot;The field is invalid. Please use one of these: &#39;EChannel, WebPage, PrintableForm, Phone, ServiceLocation&#39;.\&quot;                 ]              }              &lt;/code&gt;
   * @param type Service channel type (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   */
  public ApiResponse<List<V6VmOpenApiServiceChannels>> apiV6ServiceChannelTypeByTypeGet(String type, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/v6/ServiceChannel/type/{type}"
      .replaceAll("\\{" + "type" + "\\}", type);
      
    ResultType<List<V6VmOpenApiServiceChannels>> resultType = new ResultType<List<V6VmOpenApiServiceChannels>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates webpage channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param id web page channel id (required)
   * @param request web page channel data (optional)
   */
  public ApiResponse<V6VmOpenApiWebPageChannel> apiV6ServiceChannelWebPageByIdPut(String id, V6VmOpenApiWebPageChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/WebPage/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<V6VmOpenApiWebPageChannel> resultType = new ResultType<V6VmOpenApiWebPageChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new web page channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param request The web page channel data. (optional)
   */
  public ApiResponse<V6VmOpenApiWebPageChannel> apiV6ServiceChannelWebPagePost(V6VmOpenApiWebPageChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/WebPage";
      
    ResultType<V6VmOpenApiWebPageChannel> resultType = new ResultType<V6VmOpenApiWebPageChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates webpage channel with the data provided as input.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;ServiceChannelNames\&quot;:[                      \&quot;The ServiceChannelNames field is required.\&quot;                  ]              }              &lt;/code&gt;
   * @param sourceId web page channel external source id (required)
   * @param request web page channel data (optional)
   */
  public ApiResponse<V6VmOpenApiWebPageChannel> apiV6ServiceChannelWebPageSourceIdBySourceIdPut(String sourceId, V6VmOpenApiWebPageChannelInBase request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/v6/ServiceChannel/WebPage/sourceId/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", sourceId);
      
    ResultType<V6VmOpenApiWebPageChannel> resultType = new ResultType<V6VmOpenApiWebPageChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}
