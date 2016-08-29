# ServiceChannelApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiServiceChannelByIdGet**](ServiceChannelApi.md#apiServiceChannelByIdGet) | **GET** /api/ServiceChannel/{id} | Fetches all the information related to a single service channel.
[**apiServiceChannelEChannelPost**](ServiceChannelApi.md#apiServiceChannelEChannelPost) | **POST** /api/ServiceChannel/EChannel | Creates a new electronic channel with the data provided as input.
[**apiServiceChannelGet**](ServiceChannelApi.md#apiServiceChannelGet) | **GET** /api/ServiceChannel | Gets all published service channels within PTV as a list of service channel ids.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
[**apiServiceChannelOrganizationByOrganizationIdGet**](ServiceChannelApi.md#apiServiceChannelOrganizationByOrganizationIdGet) | **GET** /api/ServiceChannel/organization/{organizationId} | Gets a list of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
[**apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet**](ServiceChannelApi.md#apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet) | **GET** /api/ServiceChannel/organization/{organizationId}/type/{type} | Gets a list of certain type of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
[**apiServiceChannelPhonePost**](ServiceChannelApi.md#apiServiceChannelPhonePost) | **POST** /api/ServiceChannel/Phone | Creates a new phone channel with the data provided as input.
[**apiServiceChannelPrintableFormPost**](ServiceChannelApi.md#apiServiceChannelPrintableFormPost) | **POST** /api/ServiceChannel/PrintableForm | Creates a new printable form channel with the data provided as input.
[**apiServiceChannelServiceLocationPost**](ServiceChannelApi.md#apiServiceChannelServiceLocationPost) | **POST** /api/ServiceChannel/ServiceLocation | Creates a new service location channel with the data provided as input.
[**apiServiceChannelTypeByTypeGet**](ServiceChannelApi.md#apiServiceChannelTypeByTypeGet) | **GET** /api/ServiceChannel/type/{type} | Gets a list of certain type of published service channels.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
[**apiServiceChannelWebPagePost**](ServiceChannelApi.md#apiServiceChannelWebPagePost) | **POST** /api/ServiceChannel/WebPage | Creates a new web page channel with the data provided as input.


<a name="apiServiceChannelByIdGet"></a>
# **apiServiceChannelByIdGet**
> VmOpenApiServiceChannels apiServiceChannelByIdGet(id)

Fetches all the information related to a single service channel.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
String id = "id_example"; // String | Guid
try {
    VmOpenApiServiceChannels result = apiInstance.apiServiceChannelByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Guid |

### Return type

[**VmOpenApiServiceChannels**](VmOpenApiServiceChannels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiServiceChannelEChannelPost"></a>
# **apiServiceChannelEChannelPost**
> VmOpenApiElectronicChannelIn apiServiceChannelEChannelPost(request)

Creates a new electronic channel with the data provided as input.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
VmOpenApiElectronicChannelIn request = new VmOpenApiElectronicChannelIn(); // VmOpenApiElectronicChannelIn | The electronic channel data.
try {
    VmOpenApiElectronicChannelIn result = apiInstance.apiServiceChannelEChannelPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelEChannelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VmOpenApiElectronicChannelIn**](VmOpenApiElectronicChannelIn.md)| The electronic channel data. | [optional]

### Return type

[**VmOpenApiElectronicChannelIn**](VmOpenApiElectronicChannelIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiServiceChannelGet"></a>
# **apiServiceChannelGet**
> VmOpenApiGuidPage apiServiceChannelGet(date, page)

Gets all published service channels within PTV as a list of service channel ids.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
Integer page = 56; // Integer | The page to be fetched.
try {
    VmOpenApiGuidPage result = apiInstance.apiServiceChannelGet(date, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelGet");
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

<a name="apiServiceChannelOrganizationByOrganizationIdGet"></a>
# **apiServiceChannelOrganizationByOrganizationIdGet**
> List&lt;VmOpenApiServiceChannels&gt; apiServiceChannelOrganizationByOrganizationIdGet(organizationId, date)

Gets a list of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
String organizationId = "organizationId_example"; // String | Guid
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
try {
    List<VmOpenApiServiceChannels> result = apiInstance.apiServiceChannelOrganizationByOrganizationIdGet(organizationId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelOrganizationByOrganizationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Guid |
 **date** | **OffsetDateTime**| Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; | [optional]

### Return type

[**List&lt;VmOpenApiServiceChannels&gt;**](VmOpenApiServiceChannels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet"></a>
# **apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet**
> List&lt;VmOpenApiServiceChannels&gt; apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet(organizationId, type, date)

Gets a list of certain type of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
String organizationId = "organizationId_example"; // String | Guid
String type = "type_example"; // String | 
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
try {
    List<VmOpenApiServiceChannels> result = apiInstance.apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet(organizationId, type, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Guid |
 **type** | **String**|  |
 **date** | **OffsetDateTime**| Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; | [optional]

### Return type

[**List&lt;VmOpenApiServiceChannels&gt;**](VmOpenApiServiceChannels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiServiceChannelPhonePost"></a>
# **apiServiceChannelPhonePost**
> VmOpenApiPhoneChannelIn apiServiceChannelPhonePost(request)

Creates a new phone channel with the data provided as input.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
VmOpenApiPhoneChannelIn request = new VmOpenApiPhoneChannelIn(); // VmOpenApiPhoneChannelIn | The phone channel data.
try {
    VmOpenApiPhoneChannelIn result = apiInstance.apiServiceChannelPhonePost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelPhonePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VmOpenApiPhoneChannelIn**](VmOpenApiPhoneChannelIn.md)| The phone channel data. | [optional]

### Return type

[**VmOpenApiPhoneChannelIn**](VmOpenApiPhoneChannelIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiServiceChannelPrintableFormPost"></a>
# **apiServiceChannelPrintableFormPost**
> VmOpenApiPrintableFormChannelIn apiServiceChannelPrintableFormPost(request)

Creates a new printable form channel with the data provided as input.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
VmOpenApiPrintableFormChannelIn request = new VmOpenApiPrintableFormChannelIn(); // VmOpenApiPrintableFormChannelIn | The printable form channel data.
try {
    VmOpenApiPrintableFormChannelIn result = apiInstance.apiServiceChannelPrintableFormPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelPrintableFormPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VmOpenApiPrintableFormChannelIn**](VmOpenApiPrintableFormChannelIn.md)| The printable form channel data. | [optional]

### Return type

[**VmOpenApiPrintableFormChannelIn**](VmOpenApiPrintableFormChannelIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiServiceChannelServiceLocationPost"></a>
# **apiServiceChannelServiceLocationPost**
> VmOpenApiServiceLocationChannelIn apiServiceChannelServiceLocationPost(request)

Creates a new service location channel with the data provided as input.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
VmOpenApiServiceLocationChannelIn request = new VmOpenApiServiceLocationChannelIn(); // VmOpenApiServiceLocationChannelIn | The service location channel data.
try {
    VmOpenApiServiceLocationChannelIn result = apiInstance.apiServiceChannelServiceLocationPost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelServiceLocationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VmOpenApiServiceLocationChannelIn**](VmOpenApiServiceLocationChannelIn.md)| The service location channel data. | [optional]

### Return type

[**VmOpenApiServiceLocationChannelIn**](VmOpenApiServiceLocationChannelIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiServiceChannelTypeByTypeGet"></a>
# **apiServiceChannelTypeByTypeGet**
> List&lt;VmOpenApiServiceChannels&gt; apiServiceChannelTypeByTypeGet(type, date)

Gets a list of certain type of published service channels.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
String type = "type_example"; // String | Service channel type
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Supports only format \"yyyy-MM-ddTHH:mm:ss\"
try {
    List<VmOpenApiServiceChannels> result = apiInstance.apiServiceChannelTypeByTypeGet(type, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelTypeByTypeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Service channel type |
 **date** | **OffsetDateTime**| Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; | [optional]

### Return type

[**List&lt;VmOpenApiServiceChannels&gt;**](VmOpenApiServiceChannels.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiServiceChannelWebPagePost"></a>
# **apiServiceChannelWebPagePost**
> VmOpenApiWebPageChannelIn apiServiceChannelWebPagePost(request)

Creates a new web page channel with the data provided as input.

### Example
```java
// Import classes:
//import fi.otavanopisto.ptv.ApiException;
//import fi.otavanopisto.ptv.client.ServiceChannelApi;


ServiceChannelApi apiInstance = new ServiceChannelApi();
VmOpenApiWebPageChannelIn request = new VmOpenApiWebPageChannelIn(); // VmOpenApiWebPageChannelIn | The web page channel data.
try {
    VmOpenApiWebPageChannelIn result = apiInstance.apiServiceChannelWebPagePost(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelApi#apiServiceChannelWebPagePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VmOpenApiWebPageChannelIn**](VmOpenApiWebPageChannelIn.md)| The web page channel data. | [optional]

### Return type

[**VmOpenApiWebPageChannelIn**](VmOpenApiWebPageChannelIn.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

