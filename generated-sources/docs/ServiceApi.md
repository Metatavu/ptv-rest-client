# ServiceApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiServiceByIdGet**](ServiceApi.md#apiServiceByIdGet) | **GET** /api/Service/{id} | Fetches all the information related to a single service.
[**apiServiceGet**](ServiceApi.md#apiServiceGet) | **GET** /api/Service | Gets all the published services within PTV as a list of service ids.              Services created after certain date can be fetched by adding date as query string parameter.
[**apiServicePost**](ServiceApi.md#apiServicePost) | **POST** /api/Service | Creates a new service with the data provided as input.
[**apiServiceServiceChannelByServiceChannelIdGet**](ServiceApi.md#apiServiceServiceChannelByServiceChannelIdGet) | **GET** /api/Service/serviceChannel/{serviceChannelId} | Gets a list of published services for defined service channel.              Services joined to service channel after certain date can be fetched by adding date as query string parameter.


<a name="apiServiceByIdGet"></a>
# **apiServiceByIdGet**
> IVmOpenApiService apiServiceByIdGet(id)

Fetches all the information related to a single service.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String id = "id_example"; // String | 
try {
    IVmOpenApiService result = apiInstance.apiServiceByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#apiServiceByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**IVmOpenApiService**](IVmOpenApiService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiServiceGet"></a>
# **apiServiceGet**
> VmOpenApiGuidPage apiServiceGet(date, page)

Gets all the published services within PTV as a list of service ids.              Services created after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
Integer page = 56; // Integer | The page number to be fetched.
try {
    VmOpenApiGuidPage result = apiInstance.apiServiceGet(date, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#apiServiceGet");
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

<a name="apiServicePost"></a>
# **apiServicePost**
> VmOpenApiServiceIn apiServicePost(request)

Creates a new service with the data provided as input.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
VmOpenApiServiceIn request = new VmOpenApiServiceIn(); // VmOpenApiServiceIn | The service data.
try {
    VmOpenApiServiceIn result = apiInstance.apiServicePost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#apiServicePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VmOpenApiServiceIn**](VmOpenApiServiceIn.md)| The service data. | [optional]

### Return type

[**VmOpenApiServiceIn**](VmOpenApiServiceIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiServiceServiceChannelByServiceChannelIdGet"></a>
# **apiServiceServiceChannelByServiceChannelIdGet**
> List&lt;IVmOpenApiService&gt; apiServiceServiceChannelByServiceChannelIdGet(serviceChannelId, date)

Gets a list of published services for defined service channel.              Services joined to service channel after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceApi;


ServiceApi apiInstance = new ServiceApi();
String serviceChannelId = "serviceChannelId_example"; // String | Guid
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
try {
    List<IVmOpenApiService> result = apiInstance.apiServiceServiceChannelByServiceChannelIdGet(serviceChannelId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceApi#apiServiceServiceChannelByServiceChannelIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceChannelId** | **String**| Guid |
 **date** | **OffsetDateTime**| Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; | [optional]

### Return type

[**List&lt;IVmOpenApiService&gt;**](IVmOpenApiService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

