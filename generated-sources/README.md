# ptv-rest-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>fi.otavanopisto.ptv.rest-client</groupId>
    <artifactId>ptv-rest-client</artifactId>
    <version>0.0.6</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "fi.otavanopisto.ptv.rest-client:ptv-rest-client:0.0.6"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/ptv-rest-client-0.0.6.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import fi.otavanopisto.ptv.*;
import fi.otavanopisto.ptv.auth.*;
import fi.otavanopisto.ptv.model.*;
import fi.otavanopisto.ptv.client.GeneralDescriptionApi;

import java.io.File;
import java.util.*;

public class GeneralDescriptionApiExample {

    public static void main(String[] args) {
        
        GeneralDescriptionApi apiInstance = new GeneralDescriptionApi();
        String id = "id_example"; // String | Guid
        try {
            VmOpenApiGeneralDescription result = apiInstance.apiGeneralDescriptionByIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralDescriptionApi#apiGeneralDescriptionByIdGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GeneralDescriptionApi* | [**apiGeneralDescriptionByIdGet**](docs/GeneralDescriptionApi.md#apiGeneralDescriptionByIdGet) | **GET** /api/GeneralDescription/{id} | Fetches all the information related to a single statutory service general description.
*GeneralDescriptionApi* | [**apiGeneralDescriptionGet**](docs/GeneralDescriptionApi.md#apiGeneralDescriptionGet) | **GET** /api/GeneralDescription | Gets all the statutory service general descriptions within PTV as a list of ids.              Descriptions created/modified after certain date can be fetched by adding date as query string parameter.
*OrganizationApi* | [**apiOrganizationByIdGet**](docs/OrganizationApi.md#apiOrganizationByIdGet) | **GET** /api/Organization/{id} | Fetches all the information related to a single organization.
*OrganizationApi* | [**apiOrganizationGet**](docs/OrganizationApi.md#apiOrganizationGet) | **GET** /api/Organization | Gets all the published organizations within PTV as a list of organization ids.              Organizations created/modified after certain date can be fetched by adding date as query string parameter.
*OrganizationApi* | [**apiOrganizationPost**](docs/OrganizationApi.md#apiOrganizationPost) | **POST** /api/Organization | Creates a new organization with the data provided as input.
*ServiceApi* | [**apiServiceByIdGet**](docs/ServiceApi.md#apiServiceByIdGet) | **GET** /api/Service/{id} | Fetches all the information related to a single service.
*ServiceApi* | [**apiServiceGet**](docs/ServiceApi.md#apiServiceGet) | **GET** /api/Service | Gets all the published services within PTV as a list of service ids.              Services created after certain date can be fetched by adding date as query string parameter.
*ServiceApi* | [**apiServicePost**](docs/ServiceApi.md#apiServicePost) | **POST** /api/Service | Creates a new service with the data provided as input.
*ServiceApi* | [**apiServiceServiceChannelByServiceChannelIdGet**](docs/ServiceApi.md#apiServiceServiceChannelByServiceChannelIdGet) | **GET** /api/Service/serviceChannel/{serviceChannelId} | Gets a list of published services for defined service channel.              Services joined to service channel after certain date can be fetched by adding date as query string parameter.
*ServiceChannelApi* | [**apiServiceChannelByIdGet**](docs/ServiceChannelApi.md#apiServiceChannelByIdGet) | **GET** /api/ServiceChannel/{id} | Fetches all the information related to a single service channel.
*ServiceChannelApi* | [**apiServiceChannelEChannelPost**](docs/ServiceChannelApi.md#apiServiceChannelEChannelPost) | **POST** /api/ServiceChannel/EChannel | Creates a new electronic channel with the data provided as input.
*ServiceChannelApi* | [**apiServiceChannelGet**](docs/ServiceChannelApi.md#apiServiceChannelGet) | **GET** /api/ServiceChannel | Gets all published service channels within PTV as a list of service channel ids.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
*ServiceChannelApi* | [**apiServiceChannelOrganizationByOrganizationIdGet**](docs/ServiceChannelApi.md#apiServiceChannelOrganizationByOrganizationIdGet) | **GET** /api/ServiceChannel/organization/{organizationId} | Gets a list of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
*ServiceChannelApi* | [**apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet**](docs/ServiceChannelApi.md#apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet) | **GET** /api/ServiceChannel/organization/{organizationId}/type/{type} | Gets a list of certain type of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
*ServiceChannelApi* | [**apiServiceChannelPhonePost**](docs/ServiceChannelApi.md#apiServiceChannelPhonePost) | **POST** /api/ServiceChannel/Phone | Creates a new phone channel with the data provided as input.
*ServiceChannelApi* | [**apiServiceChannelPrintableFormPost**](docs/ServiceChannelApi.md#apiServiceChannelPrintableFormPost) | **POST** /api/ServiceChannel/PrintableForm | Creates a new printable form channel with the data provided as input.
*ServiceChannelApi* | [**apiServiceChannelServiceLocationPost**](docs/ServiceChannelApi.md#apiServiceChannelServiceLocationPost) | **POST** /api/ServiceChannel/ServiceLocation | Creates a new service location channel with the data provided as input.
*ServiceChannelApi* | [**apiServiceChannelTypeByTypeGet**](docs/ServiceChannelApi.md#apiServiceChannelTypeByTypeGet) | **GET** /api/ServiceChannel/type/{type} | Gets a list of certain type of published service channels.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
*ServiceChannelApi* | [**apiServiceChannelWebPagePost**](docs/ServiceChannelApi.md#apiServiceChannelWebPagePost) | **POST** /api/ServiceChannel/WebPage | Creates a new web page channel with the data provided as input.


## Documentation for Models

 - [IVmError](docs/IVmError.md)
 - [IVmOpenApiLocalizedListItem](docs/IVmOpenApiLocalizedListItem.md)
 - [IVmOpenApiService](docs/IVmOpenApiService.md)
 - [VmOpenApiAddress](docs/VmOpenApiAddress.md)
 - [VmOpenApiAddressWithType](docs/VmOpenApiAddressWithType.md)
 - [VmOpenApiAttachment](docs/VmOpenApiAttachment.md)
 - [VmOpenApiAttachmentWithType](docs/VmOpenApiAttachmentWithType.md)
 - [VmOpenApiElectronicChannel](docs/VmOpenApiElectronicChannel.md)
 - [VmOpenApiElectronicChannelIn](docs/VmOpenApiElectronicChannelIn.md)
 - [VmOpenApiFintoItem](docs/VmOpenApiFintoItem.md)
 - [VmOpenApiGeneralDescription](docs/VmOpenApiGeneralDescription.md)
 - [VmOpenApiGuidPage](docs/VmOpenApiGuidPage.md)
 - [VmOpenApiLanguageItem](docs/VmOpenApiLanguageItem.md)
 - [VmOpenApiListItem](docs/VmOpenApiListItem.md)
 - [VmOpenApiLocalizedListItem](docs/VmOpenApiLocalizedListItem.md)
 - [VmOpenApiOrganization](docs/VmOpenApiOrganization.md)
 - [VmOpenApiOrganizationIn](docs/VmOpenApiOrganizationIn.md)
 - [VmOpenApiOrganizationService](docs/VmOpenApiOrganizationService.md)
 - [VmOpenApiPhoneChannel](docs/VmOpenApiPhoneChannel.md)
 - [VmOpenApiPhoneChannelIn](docs/VmOpenApiPhoneChannelIn.md)
 - [VmOpenApiPrintableFormChannel](docs/VmOpenApiPrintableFormChannel.md)
 - [VmOpenApiPrintableFormChannelIn](docs/VmOpenApiPrintableFormChannelIn.md)
 - [VmOpenApiServiceChannels](docs/VmOpenApiServiceChannels.md)
 - [VmOpenApiServiceHour](docs/VmOpenApiServiceHour.md)
 - [VmOpenApiServiceIn](docs/VmOpenApiServiceIn.md)
 - [VmOpenApiServiceLocationChannel](docs/VmOpenApiServiceLocationChannel.md)
 - [VmOpenApiServiceLocationChannelIn](docs/VmOpenApiServiceLocationChannelIn.md)
 - [VmOpenApiServiceOrganization](docs/VmOpenApiServiceOrganization.md)
 - [VmOpenApiSupport](docs/VmOpenApiSupport.md)
 - [VmOpenApiWebPage](docs/VmOpenApiWebPage.md)
 - [VmOpenApiWebPageChannel](docs/VmOpenApiWebPageChannel.md)
 - [VmOpenApiWebPageChannelIn](docs/VmOpenApiWebPageChannelIn.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



