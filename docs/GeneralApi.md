# GeneralApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOpenApiSpec**](GeneralApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the open api spec document.


<a name="getOpenApiSpec"></a>
# **getOpenApiSpec**
> Object getOpenApiSpec()

Returns the open api spec document.

Full open api spec in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    try {
      Object result = apiInstance.getOpenApiSpec();
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |

