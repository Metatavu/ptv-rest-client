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
import fi.metatavu.ptv.client.model.VmOpenApiEntityGuidPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T08:36:23.831+03:00")
public class CommonApi {
  
  private ApiClient client;
  private String accessToken;

  public CommonApi(ApiClient client, String accessToken) {
    this.client = client;
    this.accessToken = accessToken;
  }
  
  /**
   * Gets a list of published services and service channels by organization.  Services/channels created/modified after certain date can be fetched by adding date as query string parameter.
   * 
   * @param organizationId Guid (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional)
   */
  public ApiResponse<VmOpenApiEntityGuidPage> apiV7CommonEntitiesByOrganizationByOrganizationIdGet(String organizationId, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v7/Common/EntitiesByOrganization/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", organizationId);
      
    ResultType<VmOpenApiEntityGuidPage> resultType = new ResultType<VmOpenApiEntityGuidPage>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
}