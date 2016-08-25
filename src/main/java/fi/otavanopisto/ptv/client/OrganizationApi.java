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

import fi.otavanopisto.ptv.client.model.VmOpenApiOrganization;
import fi.otavanopisto.ptv.client.model.IVmError;
import fi.otavanopisto.ptv.client.model.VmOpenApiGuidPage;
import java.time.OffsetDateTime;
import fi.otavanopisto.ptv.client.model.VmOpenApiOrganizationIn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-25T10:00:15.767+03:00")
public class OrganizationApi {

  public OrganizationApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single organization.
   * 
   * @param id Guid (required)
   */
  public ApiResponse<VmOpenApiOrganization> apiOrganizationByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/Organization/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<VmOpenApiOrganization> resultType = new ResultType<VmOpenApiOrganization>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all the published organizations within PTV as a list of organization ids.              Organizations created/modified after certain date can be fetched by adding date as query string parameter.
   * 
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   * @param page The page number to be fetched. (optional)
   */
  public ApiResponse<VmOpenApiGuidPage> apiOrganizationGet(OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/Organization";
      
    ResultType<VmOpenApiGuidPage> resultType = new ResultType<VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new organization with the data provided as input.
   * 
   * @param request The organization data. (optional)
   */
  public ApiResponse<VmOpenApiOrganizationIn> apiOrganizationPost(VmOpenApiOrganizationIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/Organization";
      
    ResultType<VmOpenApiOrganizationIn> resultType = new ResultType<VmOpenApiOrganizationIn>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}
