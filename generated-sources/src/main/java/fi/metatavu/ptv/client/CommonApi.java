/*
 * PTV Open Api version 9
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v9
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
import fi.metatavu.ptv.client.model.VmOpenApiTranslationItemsPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:38:50.296+03:00")
public class CommonApi {
  
  private ApiClient client;
  private String accessToken;

  public CommonApi(ApiClient client, String accessToken) {
    this.client = client;
    this.accessToken = accessToken;
  }
  
  /**
   * Gets a list of published services and service channels by organization.  Services/channels created/modified after certain date can be fetched by adding date as query string parameter.  Services/channels created/modified before certain date can be fetched by adding dateBefore as query string parameter.
   * 
   * @param organizationId Guid (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param dateBefore Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional, default to 1)
   */
  public ApiResponse<VmOpenApiEntityGuidPage> apiV9CommonEntitiesByOrganizationByOrganizationIdGet(String organizationId, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime dateBefore, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (dateBefore != null)
    queryParams.put("dateBefore", dateBefore);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v9/Common/EntitiesByOrganization/{organizationId}"
      .replaceAll("\\{" + "organizationId" + "\\}", organizationId);
      
    ResultType<VmOpenApiEntityGuidPage> resultType = new ResultType<VmOpenApiEntityGuidPage>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
  /**
   * Gets information of translation processes within PTV.  Translation items created/modified after certain date can be fetched by adding date as query string parameter.  Translation items created/modified before certain date can be fetched by adding dateBefore as query string parameter.
   * 
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param dateBefore Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (UTC). (optional)
   * @param page The page number to be fetched. (optional, default to 1)
   */
  public ApiResponse<VmOpenApiTranslationItemsPage> apiV9CommonTranslationGet(@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime date, @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = fi.metatavu.ptv.client.OffsetDateTimeDeserializer.class) java.time.OffsetDateTime dateBefore, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (dateBefore != null)
    queryParams.put("dateBefore", dateBefore);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/v9/Common/Translation";
      
    ResultType<VmOpenApiTranslationItemsPage> resultType = new ResultType<VmOpenApiTranslationItemsPage>() {};
    return client.doGETRequest(this.accessToken, path, resultType, queryParams, formParams);
  }
}
