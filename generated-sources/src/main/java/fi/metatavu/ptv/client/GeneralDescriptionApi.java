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

package fi.metatavu.ptv.client;

import fi.metatavu.ptv.client.model.*;

import fi.metatavu.ptv.client.model.VmOpenApiGeneralDescription;
import fi.metatavu.ptv.client.model.IVmError;
import fi.metatavu.ptv.client.model.VmOpenApiGuidPage;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T20:15:02.299+02:00")
public class GeneralDescriptionApi {

  public GeneralDescriptionApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single statutory service general description.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Names\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param id Statutory service general description guid (id of the entity) to fetch. (required)
   */
  public ApiResponse<VmOpenApiGeneralDescription> apiGeneralDescriptionByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/GeneralDescription/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<VmOpenApiGeneralDescription> resultType = new ResultType<VmOpenApiGeneralDescription>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all the statutory service general descriptions within PTV as a list of ids.              Descriptions created/modified after certain date can be fetched by adding date as query string parameter.
   * &lt;para&gt;HTTP status code 400 response model is a dictionary where key is property name and value is a list of error messages. Below sample response.&lt;/para&gt;  &lt;code&gt;              {                  \&quot;Names\&quot;: [                      \&quot;Type - Required value &#39;Name&#39; was not found!\&quot;                  ]              }              &lt;/code&gt;
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   * @param page The page to be fetched. Page numbering starts from one. (optional)
   */
  public ApiResponse<VmOpenApiGuidPage> apiGeneralDescriptionGet(OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/GeneralDescription";
      
    ResultType<VmOpenApiGuidPage> resultType = new ResultType<VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}
