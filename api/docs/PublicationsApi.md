# PublicationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicationsGet**](PublicationsApi.md#publicationsGet) | **GET** /Publications | 
[**publicationsIdDelete**](PublicationsApi.md#publicationsIdDelete) | **DELETE** /Publications/{id} | 
[**publicationsIdGet**](PublicationsApi.md#publicationsIdGet) | **GET** /Publications/{id} | 
[**publicationsIdPut**](PublicationsApi.md#publicationsIdPut) | **PUT** /Publications/{id} | 
[**publicationsPost**](PublicationsApi.md#publicationsPost) | **POST** /Publications | 


<a name="publicationsGet"></a>
# **publicationsGet**
> kotlin.Array&lt;PublicationBriefDto&gt; publicationsGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublicationsApi()
try {
    val result : kotlin.Array<PublicationBriefDto> = apiInstance.publicationsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicationsApi#publicationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicationsApi#publicationsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;PublicationBriefDto&gt;**](PublicationBriefDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="publicationsIdDelete"></a>
# **publicationsIdDelete**
> publicationsIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublicationsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.publicationsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling PublicationsApi#publicationsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicationsApi#publicationsIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="publicationsIdGet"></a>
# **publicationsIdGet**
> PublicationDto publicationsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublicationsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PublicationDto = apiInstance.publicationsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicationsApi#publicationsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicationsApi#publicationsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**PublicationDto**](PublicationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="publicationsIdPut"></a>
# **publicationsIdPut**
> publicationsIdPut(id, publicationDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublicationsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val publicationDto : PublicationDto =  // PublicationDto | 
try {
    apiInstance.publicationsIdPut(id, publicationDto)
} catch (e: ClientException) {
    println("4xx response calling PublicationsApi#publicationsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicationsApi#publicationsIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **publicationDto** | [**PublicationDto**](PublicationDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="publicationsPost"></a>
# **publicationsPost**
> publicationsPost(publicationDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublicationsApi()
val publicationDto : PublicationDto =  // PublicationDto | 
try {
    apiInstance.publicationsPost(publicationDto)
} catch (e: ClientException) {
    println("4xx response calling PublicationsApi#publicationsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicationsApi#publicationsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publicationDto** | [**PublicationDto**](PublicationDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

