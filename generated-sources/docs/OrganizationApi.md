# OrganizationApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiOrganizationByIdGet**](OrganizationApi.md#apiOrganizationByIdGet) | **GET** /api/Organization/{id} | Fetches all the information related to a single organization.
[**apiOrganizationGet**](OrganizationApi.md#apiOrganizationGet) | **GET** /api/Organization | Gets all the published organizations within PTV as a list of organization ids.              Organizations created/modified after certain date can be fetched by adding date as query string parameter.
[**apiOrganizationPost**](OrganizationApi.md#apiOrganizationPost) | **POST** /api/Organization | Creates a new organization with the data provided as input.


<a name="apiOrganizationByIdGet"></a>
# **apiOrganizationByIdGet**
> VmOpenApiOrganization apiOrganizationByIdGet(id)

Fetches all the information related to a single organization.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
String id = "id_example"; // String | Guid
try {
    VmOpenApiOrganization result = apiInstance.apiOrganizationByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#apiOrganizationByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Guid |

### Return type

[**VmOpenApiOrganization**](VmOpenApiOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiOrganizationGet"></a>
# **apiOrganizationGet**
> VmOpenApiGuidPage apiOrganizationGet(date, page)

Gets all the published organizations within PTV as a list of organization ids.              Organizations created/modified after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
Integer page = 56; // Integer | The page number to be fetched.
try {
    VmOpenApiGuidPage result = apiInstance.apiOrganizationGet(date, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#apiOrganizationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **OffsetDateTime**| Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; | [optional]
 **page** | **Integer**| The page number to be fetched. | [optional]

### Return type

[**VmOpenApiGuidPage**](VmOpenApiGuidPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiOrganizationPost"></a>
# **apiOrganizationPost**
> VmOpenApiOrganizationIn apiOrganizationPost(request)

Creates a new organization with the data provided as input.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.OrganizationApi;


OrganizationApi apiInstance = new OrganizationApi();
VmOpenApiOrganizationIn request = new VmOpenApiOrganizationIn(); // VmOpenApiOrganizationIn | The organization data.
try {
    VmOpenApiOrganizationIn result = apiInstance.apiOrganizationPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationApi#apiOrganizationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VmOpenApiOrganizationIn**](VmOpenApiOrganizationIn.md)| The organization data. | [optional]

### Return type

[**VmOpenApiOrganizationIn**](VmOpenApiOrganizationIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

