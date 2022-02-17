# UsersApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findMyUser**](UsersApi.md#findMyUser) | **GET** /2/users/me | User lookup me
[**findUserById**](UsersApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID
[**findUserByUsername**](UsersApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username
[**findUsersById**](UsersApi.md#findUsersById) | **GET** /2/users | User lookup by IDs
[**findUsersByUsername**](UsersApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames
[**listGetFollowers**](UsersApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns user objects that follow a List by the provided List ID
[**listGetMembers**](UsersApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns user objects that are members of a List by the provided List ID
[**tweetsIdLikingUsers**](UsersApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns user objects that have liked the provided Tweet ID
[**tweetsIdRetweetingUsers**](UsersApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns user objects that have retweeted the provided Tweet ID
[**usersIdBlock**](UsersApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID
[**usersIdBlocking**](UsersApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns user objects that are blocked by provided user ID
[**usersIdFollow**](UsersApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User
[**usersIdFollowers**](UsersApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Returns user objects that follow the provided user ID
[**usersIdFollowing**](UsersApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID
[**usersIdMute**](UsersApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID
[**usersIdMuting**](UsersApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns user objects that are muted by the provided user ID
[**usersIdUnblock**](UsersApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
[**usersIdUnfollow**](UsersApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
[**usersIdUnmute**](UsersApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID


<a name="findMyUser"></a>
# **findMyUser**
> SingleUserLookupResponse findMyUser(expansions, tweetFields, userFields)

User lookup me

This endpoint returns information about the requesting user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      SingleUserLookupResponse result = apiInstance.findMyUser(expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleUserLookupResponse**](SingleUserLookupResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findUserById"></a>
# **findUserById**
> SingleUserLookupResponse findUserById(id, expansions, tweetFields, userFields)

User lookup by ID

This endpoint returns information about a user. Specify user by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "2244994945"; // String | Required. A User ID.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      SingleUserLookupResponse result = apiInstance.findUserById(id, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Required. A User ID. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleUserLookupResponse**](SingleUserLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findUserByUsername"></a>
# **findUserByUsername**
> SingleUserLookupResponse findUserByUsername(username, expansions, tweetFields, userFields)

User lookup by username

This endpoint returns information about a user. Specify user by username.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String username = "TwitterDev"; // String | Required. A username.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      SingleUserLookupResponse result = apiInstance.findUserByUsername(username, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Required. A username. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleUserLookupResponse**](SingleUserLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findUsersById"></a>
# **findUsersById**
> MultiUserLookupResponse findUsersById(ids, expansions, tweetFields, userFields)

User lookup by IDs

This endpoint returns information about users. Specify users by their ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | Required. A list of User IDs, comma-separated. You can specify up to 100 IDs.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiUserLookupResponse result = apiInstance.findUsersById(ids, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| Required. A list of User IDs, comma-separated. You can specify up to 100 IDs. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiUserLookupResponse**](MultiUserLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findUsersByUsername"></a>
# **findUsersByUsername**
> MultiUserLookupResponse findUsersByUsername(usernames, expansions, tweetFields, userFields)

User lookup by usernames

This endpoint returns information about users. Specify users by their username.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    List<String> usernames = Arrays.asList(); // List<String> | Required . A list of usernames, comma-separated. You can specify up to 100 usernames.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiUserLookupResponse result = apiInstance.findUsersByUsername(usernames, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernames** | [**List&lt;String&gt;**](String.md)| Required . A list of usernames, comma-separated. You can specify up to 100 usernames. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiUserLookupResponse**](MultiUserLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listGetFollowers"></a>
# **listGetFollowers**
> ListLookupMultipleUsersLookupResponse listGetFollowers(id, maxResults, paginationToken, expansions, tweetFields, userFields)

Returns user objects that follow a List by the provided List ID

Returns a list of users that follow a List by the provided List ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the List for which to return followers
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      ListLookupMultipleUsersLookupResponse result = apiInstance.listGetFollowers(id, maxResults, paginationToken, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List for which to return followers |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**ListLookupMultipleUsersLookupResponse**](ListLookupMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listGetMembers"></a>
# **listGetMembers**
> ListLookupMultipleUsersLookupResponse listGetMembers(id, maxResults, paginationToken, expansions, tweetFields, userFields)

Returns user objects that are members of a List by the provided List ID

Returns a list of users that are members of a List by the provided List ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the List for which to return members
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      ListLookupMultipleUsersLookupResponse result = apiInstance.listGetMembers(id, maxResults, paginationToken, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List for which to return members |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**ListLookupMultipleUsersLookupResponse**](ListLookupMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="tweetsIdLikingUsers"></a>
# **tweetsIdLikingUsers**
> GenericMultipleUsersLookupResponse tweetsIdLikingUsers(id)

Returns user objects that have liked the provided Tweet ID

Returns a list of users that have liked the provided Tweet ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the Tweet for which to return results
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.tweetsIdLikingUsers(id);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Tweet for which to return results |

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="tweetsIdRetweetingUsers"></a>
# **tweetsIdRetweetingUsers**
> GenericMultipleUsersLookupResponse tweetsIdRetweetingUsers(id)

Returns user objects that have retweeted the provided Tweet ID

Returns a list of users that have retweeted the provided Tweet ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the Tweet for which to return results
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.tweetsIdRetweetingUsers(id);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Tweet for which to return results |

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdBlock"></a>
# **usersIdBlock**
> UsersBlockingMutationResponse usersIdBlock(id, inlineObject)

Block User by User ID

Causes the user (in the path) to block the target user. The user (in the path) must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to block the target user
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      UsersBlockingMutationResponse result = apiInstance.usersIdBlock(id, inlineObject);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to block the target user |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**UsersBlockingMutationResponse**](UsersBlockingMutationResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdBlocking"></a>
# **usersIdBlocking**
> GenericMultipleUsersLookupResponse usersIdBlocking(id, maxResults, paginationToken)

Returns user objects that are blocked by provided user ID

Returns a list of users that are blocked by the provided user ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.usersIdBlocking(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdFollow"></a>
# **usersIdFollow**
> UsersFollowingCreateResponse usersIdFollow(id, inlineObject2)

Follow User

Causes the user(in the path) to follow, or “request to follow” for protected users, the target user. The user(in the path) must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to follow the target user
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      UsersFollowingCreateResponse result = apiInstance.usersIdFollow(id, inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to follow the target user |
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**UsersFollowingCreateResponse**](UsersFollowingCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdFollowers"></a>
# **usersIdFollowers**
> GenericMultipleUsersLookupResponse usersIdFollowers(id, maxResults, paginationToken)

Returns user objects that follow the provided user ID

Returns a list of users that follow the provided user ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.usersIdFollowers(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdFollowing"></a>
# **usersIdFollowing**
> UsersFollowingLookupResponse usersIdFollowing(id, maxResults, paginationToken)

Following by User ID

Returns a list of users that are being followed by the provided user ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      UsersFollowingLookupResponse result = apiInstance.usersIdFollowing(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**UsersFollowingLookupResponse**](UsersFollowingLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdMute"></a>
# **usersIdMute**
> UsersMutingMutationResponse usersIdMute(id, inlineObject1)

Mute User by User ID

Causes the user (in the path) to mute the target user. The user (in the path) must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to mute the target user
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      UsersMutingMutationResponse result = apiInstance.usersIdMute(id, inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to mute the target user |
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**UsersMutingMutationResponse**](UsersMutingMutationResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdMuting"></a>
# **usersIdMuting**
> GenericMultipleUsersLookupResponse usersIdMuting(id, maxResults, paginationToken)

Returns user objects that are muted by the provided user ID

Returns a list of users that are muted by the provided user ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 100; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.usersIdMuting(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdUnblock"></a>
# **usersIdUnblock**
> UsersBlockingMutationResponse usersIdUnblock(sourceUserId, targetUserId)

Unblock User by User ID

Causes the source user to unblock the target user. The source user must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String sourceUserId = "sourceUserId_example"; // String | The ID of the user that is requesting to unblock the target user
    String targetUserId = "targetUserId_example"; // String | The ID of the user that the source user is requesting to unblock
    try {
      UsersBlockingMutationResponse result = apiInstance.usersIdUnblock(sourceUserId, targetUserId);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceUserId** | **String**| The ID of the user that is requesting to unblock the target user |
 **targetUserId** | **String**| The ID of the user that the source user is requesting to unblock |

### Return type

[**UsersBlockingMutationResponse**](UsersBlockingMutationResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdUnfollow"></a>
# **usersIdUnfollow**
> UsersFollowingDeleteResponse usersIdUnfollow(sourceUserId, targetUserId)

Unfollow User

Causes the source user to unfollow the target user. The source user must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String sourceUserId = "sourceUserId_example"; // String | The ID of the user that is requesting to unfollow the target user
    String targetUserId = "targetUserId_example"; // String | The ID of the user that the source user is requesting to unfollow
    try {
      UsersFollowingDeleteResponse result = apiInstance.usersIdUnfollow(sourceUserId, targetUserId);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceUserId** | **String**| The ID of the user that is requesting to unfollow the target user |
 **targetUserId** | **String**| The ID of the user that the source user is requesting to unfollow |

### Return type

[**UsersFollowingDeleteResponse**](UsersFollowingDeleteResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdUnmute"></a>
# **usersIdUnmute**
> UsersMutingMutationResponse usersIdUnmute(sourceUserId, targetUserId)

Unmute User by User ID

Causes the source user to unmute the target user. The source user must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String sourceUserId = "sourceUserId_example"; // String | The ID of the user that is requesting to unmute the target user
    String targetUserId = "targetUserId_example"; // String | The ID of the user that the source user is requesting to unmute
    try {
      UsersMutingMutationResponse result = apiInstance.usersIdUnmute(sourceUserId, targetUserId);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceUserId** | **String**| The ID of the user that is requesting to unmute the target user |
 **targetUserId** | **String**| The ID of the user that the source user is requesting to unmute |

### Return type

[**UsersMutingMutationResponse**](UsersMutingMutationResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

