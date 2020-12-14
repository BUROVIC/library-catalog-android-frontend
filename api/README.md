# org.openapitools.client - Kotlin client library for LibraryCatalog

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorsApi* | [**authorsGet**](docs/AuthorsApi.md#authorsget) | **GET** /Authors | 
*AuthorsApi* | [**authorsIdDelete**](docs/AuthorsApi.md#authorsiddelete) | **DELETE** /Authors/{id} | 
*AuthorsApi* | [**authorsIdGet**](docs/AuthorsApi.md#authorsidget) | **GET** /Authors/{id} | 
*AuthorsApi* | [**authorsIdPut**](docs/AuthorsApi.md#authorsidput) | **PUT** /Authors/{id} | 
*AuthorsApi* | [**authorsPost**](docs/AuthorsApi.md#authorspost) | **POST** /Authors | 
*PublicationsApi* | [**publicationsGet**](docs/PublicationsApi.md#publicationsget) | **GET** /Publications | 
*PublicationsApi* | [**publicationsIdDelete**](docs/PublicationsApi.md#publicationsiddelete) | **DELETE** /Publications/{id} | 
*PublicationsApi* | [**publicationsIdGet**](docs/PublicationsApi.md#publicationsidget) | **GET** /Publications/{id} | 
*PublicationsApi* | [**publicationsIdPut**](docs/PublicationsApi.md#publicationsidput) | **PUT** /Publications/{id} | 
*PublicationsApi* | [**publicationsPost**](docs/PublicationsApi.md#publicationspost) | **POST** /Publications | 
*PublishersApi* | [**publishersGet**](docs/PublishersApi.md#publishersget) | **GET** /Publishers | 
*PublishersApi* | [**publishersIdDelete**](docs/PublishersApi.md#publishersiddelete) | **DELETE** /Publishers/{id} | 
*PublishersApi* | [**publishersIdGet**](docs/PublishersApi.md#publishersidget) | **GET** /Publishers/{id} | 
*PublishersApi* | [**publishersIdPut**](docs/PublishersApi.md#publishersidput) | **PUT** /Publishers/{id} | 
*PublishersApi* | [**publishersPost**](docs/PublishersApi.md#publisherspost) | **POST** /Publishers | 
*ReviewsApi* | [**reviewsGet**](docs/ReviewsApi.md#reviewsget) | **GET** /Reviews | 
*ReviewsApi* | [**reviewsIdDelete**](docs/ReviewsApi.md#reviewsiddelete) | **DELETE** /Reviews/{id} | 
*ReviewsApi* | [**reviewsIdGet**](docs/ReviewsApi.md#reviewsidget) | **GET** /Reviews/{id} | 
*ReviewsApi* | [**reviewsIdPut**](docs/ReviewsApi.md#reviewsidput) | **PUT** /Reviews/{id} | 
*ReviewsApi* | [**reviewsPost**](docs/ReviewsApi.md#reviewspost) | **POST** /Reviews | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AuthorBriefDto](docs/AuthorBriefDto.md)
 - [org.openapitools.client.models.AuthorDto](docs/AuthorDto.md)
 - [org.openapitools.client.models.PublicationBriefDto](docs/PublicationBriefDto.md)
 - [org.openapitools.client.models.PublicationDto](docs/PublicationDto.md)
 - [org.openapitools.client.models.PublisherBriefDto](docs/PublisherBriefDto.md)
 - [org.openapitools.client.models.PublisherDto](docs/PublisherDto.md)
 - [org.openapitools.client.models.ReviewBriefDto](docs/ReviewBriefDto.md)
 - [org.openapitools.client.models.ReviewDto](docs/ReviewDto.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
