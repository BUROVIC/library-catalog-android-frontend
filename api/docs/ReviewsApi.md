# ReviewsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reviewsGet**](ReviewsApi.md#reviewsGet) | **GET** /Reviews | 
[**reviewsIdDelete**](ReviewsApi.md#reviewsIdDelete) | **DELETE** /Reviews/{id} | 
[**reviewsIdGet**](ReviewsApi.md#reviewsIdGet) | **GET** /Reviews/{id} | 
[**reviewsIdPut**](ReviewsApi.md#reviewsIdPut) | **PUT** /Reviews/{id} | 
[**reviewsPost**](ReviewsApi.md#reviewsPost) | **POST** /Reviews | 


<a name="reviewsGet"></a>
# **reviewsGet**
> kotlin.Array&lt;ReviewBriefDto&gt; reviewsGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReviewsApi()
try {
    val result : kotlin.Array<ReviewBriefDto> = apiInstance.reviewsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewsApi#reviewsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewsApi#reviewsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;ReviewBriefDto&gt;**](ReviewBriefDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="reviewsIdDelete"></a>
# **reviewsIdDelete**
> reviewsIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReviewsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.reviewsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ReviewsApi#reviewsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewsApi#reviewsIdDelete")
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

<a name="reviewsIdGet"></a>
# **reviewsIdGet**
> ReviewDto reviewsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReviewsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ReviewDto = apiInstance.reviewsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReviewsApi#reviewsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewsApi#reviewsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**ReviewDto**](ReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="reviewsIdPut"></a>
# **reviewsIdPut**
> reviewsIdPut(id, reviewDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReviewsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val reviewDto : ReviewDto =  // ReviewDto | 
try {
    apiInstance.reviewsIdPut(id, reviewDto)
} catch (e: ClientException) {
    println("4xx response calling ReviewsApi#reviewsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewsApi#reviewsIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **reviewDto** | [**ReviewDto**](ReviewDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="reviewsPost"></a>
# **reviewsPost**
> reviewsPost(reviewDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReviewsApi()
val reviewDto : ReviewDto =  // ReviewDto | 
try {
    apiInstance.reviewsPost(reviewDto)
} catch (e: ClientException) {
    println("4xx response calling ReviewsApi#reviewsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReviewsApi#reviewsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewDto** | [**ReviewDto**](ReviewDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

