# GeneralDescriptionApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiGeneralDescriptionByIdGet**](GeneralDescriptionApi.md#apiGeneralDescriptionByIdGet) | **GET** /api/GeneralDescription/{id} | Fetches all the information related to a single statutory service general description.
[**apiGeneralDescriptionGet**](GeneralDescriptionApi.md#apiGeneralDescriptionGet) | **GET** /api/GeneralDescription | Gets all the statutory service general descriptions within PTV as a list of ids.              Descriptions created/modified after certain date can be fetched by adding date as query string parameter.


<a name="apiGeneralDescriptionByIdGet"></a>
# **apiGeneralDescriptionByIdGet**
> VmOpenApiGeneralDescription apiGeneralDescriptionByIdGet(id)

Fetches all the information related to a single statutory service general description.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.GeneralDescriptionApi;


GeneralDescriptionApi apiInstance = new GeneralDescriptionApi();
String id = "id_example"; // String | Guid
try {
    VmOpenApiGeneralDescription result = apiInstance.apiGeneralDescriptionByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralDescriptionApi#apiGeneralDescriptionByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Guid |

### Return type

[**VmOpenApiGeneralDescription**](VmOpenApiGeneralDescription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiGeneralDescriptionGet"></a>
# **apiGeneralDescriptionGet**
> VmOpenApiGuidPage apiGeneralDescriptionGet(date, page)

Gets all the statutory service general descriptions within PTV as a list of ids.              Descriptions created/modified after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.GeneralDescriptionApi;


GeneralDescriptionApi apiInstance = new GeneralDescriptionApi();
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
Integer page = 56; // Integer | The page to be fetched.
try {
    VmOpenApiGuidPage result = apiInstance.apiGeneralDescriptionGet(date, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralDescriptionApi#apiGeneralDescriptionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **OffsetDateTime**| Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; | [optional]
 **page** | **Integer**| The page to be fetched. | [optional]

### Return type

[**VmOpenApiGuidPage**](VmOpenApiGuidPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

