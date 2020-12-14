# AuthorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorsGet**](AuthorsApi.md#authorsGet) | **GET** /Authors | 
[**authorsIdDelete**](AuthorsApi.md#authorsIdDelete) | **DELETE** /Authors/{id} | 
[**authorsIdGet**](AuthorsApi.md#authorsIdGet) | **GET** /Authors/{id} | 
[**authorsIdPut**](AuthorsApi.md#authorsIdPut) | **PUT** /Authors/{id} | 
[**authorsPost**](AuthorsApi.md#authorsPost) | **POST** /Authors | 


<a name="authorsGet"></a>
# **authorsGet**
> kotlin.Array&lt;AuthorBriefDto&gt; authorsGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthorsApi()
try {
    val result : kotlin.Array<AuthorBriefDto> = apiInstance.authorsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthorsApi#authorsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorsApi#authorsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;AuthorBriefDto&gt;**](AuthorBriefDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="authorsIdDelete"></a>
# **authorsIdDelete**
> authorsIdDelete(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthorsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.authorsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling AuthorsApi#authorsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorsApi#authorsIdDelete")
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

<a name="authorsIdGet"></a>
# **authorsIdGet**
> AuthorDto authorsIdGet(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthorsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : AuthorDto = apiInstance.authorsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthorsApi#authorsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorsApi#authorsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

[**AuthorDto**](AuthorDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="authorsIdPut"></a>
# **authorsIdPut**
> authorsIdPut(id, authorDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthorsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val authorDto : AuthorDto =  // AuthorDto | 
try {
    apiInstance.authorsIdPut(id, authorDto)
} catch (e: ClientException) {
    println("4xx response calling AuthorsApi#authorsIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorsApi#authorsIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **authorDto** | [**AuthorDto**](AuthorDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

<a name="authorsPost"></a>
# **authorsPost**
> authorsPost(authorDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthorsApi()
val authorDto : AuthorDto =  // AuthorDto | 
try {
    apiInstance.authorsPost(authorDto)
} catch (e: ClientException) {
    println("4xx response calling AuthorsApi#authorsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthorsApi#authorsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorDto** | [**AuthorDto**](AuthorDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: Not defined

