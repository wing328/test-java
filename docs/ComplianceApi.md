# ComplianceApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job
[**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get compliance job
[**listBatchComplianceJobs**](ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List compliance jobs


<a name="createBatchComplianceJob"></a>
# **createBatchComplianceJob**
> SingleComplianceJobResponse createBatchComplianceJob(inlineObject5)

Create compliance job

Creates a compliance for the given job type

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    InlineObject5 inlineObject5 = new InlineObject5(); // InlineObject5 | 
    try {
      SingleComplianceJobResponse result = apiInstance.createBatchComplianceJob(inlineObject5);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  |

### Return type

[**SingleComplianceJobResponse**](SingleComplianceJobResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="getBatchComplianceJob"></a>
# **getBatchComplianceJob**
> SingleComplianceJobResponse getBatchComplianceJob(id)

Get compliance job

Returns a single compliance job by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    String id = "id_example"; // String | ID of the compliance job to retrieve.
    try {
      SingleComplianceJobResponse result = apiInstance.getBatchComplianceJob(id);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the compliance job to retrieve. |

### Return type

[**SingleComplianceJobResponse**](SingleComplianceJobResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listBatchComplianceJobs"></a>
# **listBatchComplianceJobs**
> MultiComplianceJobResponse listBatchComplianceJobs(type, status)

List compliance jobs

Returns recent compliance jobs for a given job type and optional job status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComplianceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    ComplianceApi apiInstance = new ComplianceApi(defaultClient);
    ComplianceJobType type = ComplianceJobType.fromValue("tweets"); // ComplianceJobType | Type of compliance job to list.
    ComplianceJobStatus status = ComplianceJobStatus.fromValue("created"); // ComplianceJobStatus | Status of compliance job to list.
    try {
      MultiComplianceJobResponse result = apiInstance.listBatchComplianceJobs(type, status);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**ComplianceJobType**](.md)| Type of compliance job to list. | [enum: tweets, users]
 **status** | [**ComplianceJobStatus**](.md)| Status of compliance job to list. | [optional] [enum: created, in_progress, failed, complete]

### Return type

[**MultiComplianceJobResponse**](MultiComplianceJobResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List compliance jobs response |  -  |
**0** | The request has failed. |  -  |

