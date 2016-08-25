/**
 * PTV Open Api
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v1
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

package fi.otavanopisto.ptv.client;

import fi.otavanopisto.ptv.client.model.*;

import fi.otavanopisto.ptv.client.model.IVmError;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceChannels;
import fi.otavanopisto.ptv.client.model.VmOpenApiElectronicChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiGuidPage;
import java.time.OffsetDateTime;
import fi.otavanopisto.ptv.client.model.VmOpenApiPhoneChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiPrintableFormChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceLocationChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPageChannelIn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-25T10:00:15.767+03:00")
public class ServiceChannelApi {

  public ServiceChannelApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single service channel.
   * 
   * @param id Guid (required)
   */
  public ApiResponse<VmOpenApiServiceChannels> apiServiceChannelByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/ServiceChannel/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<VmOpenApiServiceChannels> resultType = new ResultType<VmOpenApiServiceChannels>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new electronic channel with the data provided as input.
   * 
   * @param request The electronic channel data. (optional)
   */
  public ApiResponse<VmOpenApiElectronicChannelIn> apiServiceChannelEChannelPost(VmOpenApiElectronicChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/ServiceChannel/EChannel";
      
    ResultType<VmOpenApiElectronicChannelIn> resultType = new ResultType<VmOpenApiElectronicChannelIn>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all published service channels within PTV as a list of service channel ids.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
   * 
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   * @param page The page to be fetched. (optional)
   */
  public ApiResponse<VmOpenApiGuidPage> apiServiceChannelGet(OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/ServiceChannel";
      
    ResultType<VmOpenApiGuidPage> resultType = new ResultType<VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
   * 
   * @param organizationId Guid (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   */
  public ApiResponse<List<VmOpenApiServiceChannels>> apiServiceChannelOrganizationByOrganizationIdGet(String organizationId, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/ServiceChannel/organization/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", organizationId);
      
    ResultType<List<VmOpenApiServiceChannels>> resultType = new ResultType<List<VmOpenApiServiceChannels>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of certain type of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
   * 
   * @param organizationId Guid (required)
   * @param type  (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   */
  public ApiResponse<List<VmOpenApiServiceChannels>> apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet(String organizationId, String type, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/ServiceChannel/organization/{organizationId}/type/{type}"
      .replaceAll("\\{" + "organizationId" + "\\}", organizationId)
      .replaceAll("\\{" + "type" + "\\}", type);
      
    ResultType<List<VmOpenApiServiceChannels>> resultType = new ResultType<List<VmOpenApiServiceChannels>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new phone channel with the data provided as input.
   * 
   * @param request The phone channel data. (optional)
   */
  public ApiResponse<VmOpenApiPhoneChannelIn> apiServiceChannelPhonePost(VmOpenApiPhoneChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/ServiceChannel/Phone";
      
    ResultType<VmOpenApiPhoneChannelIn> resultType = new ResultType<VmOpenApiPhoneChannelIn>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new printable form channel with the data provided as input.
   * 
   * @param request The printable form channel data. (optional)
   */
  public ApiResponse<VmOpenApiPrintableFormChannelIn> apiServiceChannelPrintableFormPost(VmOpenApiPrintableFormChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/ServiceChannel/PrintableForm";
      
    ResultType<VmOpenApiPrintableFormChannelIn> resultType = new ResultType<VmOpenApiPrintableFormChannelIn>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new service location channel with the data provided as input.
   * 
   * @param request The service location channel data. (optional)
   */
  public ApiResponse<VmOpenApiServiceLocationChannelIn> apiServiceChannelServiceLocationPost(VmOpenApiServiceLocationChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/ServiceChannel/ServiceLocation";
      
    ResultType<VmOpenApiServiceLocationChannelIn> resultType = new ResultType<VmOpenApiServiceLocationChannelIn>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of certain type of published service channels.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
   * 
   * @param type Service channel type (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   */
  public ApiResponse<List<VmOpenApiServiceChannels>> apiServiceChannelTypeByTypeGet(String type, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/ServiceChannel/type/{type}"
      .replaceAll("\\{" + "type" + "\\}", type);
      
    ResultType<List<VmOpenApiServiceChannels>> resultType = new ResultType<List<VmOpenApiServiceChannels>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new web page channel with the data provided as input.
   * 
   * @param request The web page channel data. (optional)
   */
  public ApiResponse<VmOpenApiWebPageChannelIn> apiServiceChannelWebPagePost(VmOpenApiWebPageChannelIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/ServiceChannel/WebPage";
      
    ResultType<VmOpenApiWebPageChannelIn> resultType = new ResultType<VmOpenApiWebPageChannelIn>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}
