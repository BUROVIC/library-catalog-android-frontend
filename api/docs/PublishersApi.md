# PublishersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publishersGet**](PublishersApi.md#publishersGet) | **GET** /Publishers | 
[**publishersIdDelete**](PublishersApi.md#publishersIdDelete) | **DELETE** /Publishers/{id} | 
[**publishersIdGet**](PublishersApi.md#publishersIdGet) | **GET** /Publishers/{id} | 
[**publishersIdPut**](PublishersApi.md#publishersIdPut) | **PUT** /Publishers/{id} | 
[**publishersPost**](PublishersApi.md#publishersPost) | **POST** /Publishers | 


<a name="publishersGet"></a>
# **publishersGet**
> kotlin.Array&lt;PublisherBriefDto&gt; publishersGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublishersApi()
try {
    val result : kotlin.Array<PublisherBriefDto> = apiInstance.publishersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublishersApi#publishersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublishersApi#publishersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;PublisherBriefDto&gt;**](PublisherBriefDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="publishersIdDelete"></a>
# **publishersIdDelete**
> publishersIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublishersApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.publishersIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling PublishersApi#publishersIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublishersApi#publishersIdDelete")
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

<a name="publishersIdGet"></a>
# **publishersIdGet**
> PublisherDto publishersIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublishersApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PublisherDto = apiInstance.publishersIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublishersApi#publishersIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublishersApi#publishersIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**PublisherDto**](PublisherDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="publishersIdPut"></a>
# **publishersIdPut**
> publishersIdPut(id, publisherDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublishersApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val publisherDto : PublisherDto =  // PublisherDto | 
try {
    apiInstance.publishersIdPut(id, publisherDto)
} catch (e: ClientException) {
    println("4xx response calling PublishersApi#publishersIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublishersApi#publishersIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **publisherDto** | [**PublisherDto**](PublisherDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="publishersPost"></a>
# **publishersPost**
> publishersPost(publisherDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PublishersApi()
val publisherDto : PublisherDto =  // PublisherDto | 
try {
    apiInstance.publishersPost(publisherDto)
} catch (e: ClientException) {
    println("4xx response calling PublishersApi#publishersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublishersApi#publishersPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **publisherDto** | [**PublisherDto**](PublisherDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

