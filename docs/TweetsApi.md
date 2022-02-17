# TweetsApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrDeleteRules**](TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
[**createTweet**](TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
[**deleteTweetById**](TweetsApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
[**findTweetById**](TweetsApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
[**findTweetsById**](TweetsApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs
[**getRules**](TweetsApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
[**hideReplyById**](TweetsApi.md#hideReplyById) | **PUT** /2/tweets/{id}/hidden | Hide replies
[**listsIdTweets**](TweetsApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID
[**sampleStream**](TweetsApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream
[**searchStream**](TweetsApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream
[**spaceBuyers**](TweetsApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
[**spaceTweets**](TweetsApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
[**tweetCountsFullArchiveSearch**](TweetsApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts
[**tweetCountsRecentSearch**](TweetsApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts
[**tweetsFullarchiveSearch**](TweetsApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search
[**tweetsRecentSearch**](TweetsApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search
[**usersIdLike**](TweetsApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the user (in the path) to like the specified tweet
[**usersIdLikedTweets**](TweetsApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
[**usersIdMentions**](TweetsApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
[**usersIdRetweets**](TweetsApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the user (in the path) to retweet the specified tweet
[**usersIdTweets**](TweetsApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
[**usersIdUnlike**](TweetsApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the user (in the path) to unlike the specified tweet
[**usersIdUnretweets**](TweetsApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the user (in the path) to unretweet the specified tweet


<a name="addOrDeleteRules"></a>
# **addOrDeleteRules**
> AddOrDeleteRulesResponse addOrDeleteRules(addOrDeleteRulesRequest, dryRun)

Add/Delete rules

Add or delete rules from a user&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    AddOrDeleteRulesRequest addOrDeleteRulesRequest = new AddOrDeleteRulesRequest(); // AddOrDeleteRulesRequest | 
    Boolean dryRun = true; // Boolean | Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes.
    try {
      AddOrDeleteRulesResponse result = apiInstance.addOrDeleteRules(addOrDeleteRulesRequest, dryRun);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addOrDeleteRulesRequest** | [**AddOrDeleteRulesRequest**](AddOrDeleteRulesRequest.md)|  |
 **dryRun** | **Boolean**| Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes. | [optional]

### Return type

[**AddOrDeleteRulesResponse**](AddOrDeleteRulesResponse.md)

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

<a name="createTweet"></a>
# **createTweet**
> TweetCreateResponse createTweet(inlineObject3)

Creation of a Tweet

Causes the user to create a tweet under the authorized account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      TweetCreateResponse result = apiInstance.createTweet(inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**TweetCreateResponse**](TweetCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="deleteTweetById"></a>
# **deleteTweetById**
> TweetDeleteResponse deleteTweetById(id)

Tweet delete by Tweet ID

Delete specified Tweet (in the path) by ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the Tweet to be deleted.
    try {
      TweetDeleteResponse result = apiInstance.deleteTweetById(id);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Tweet to be deleted. |

### Return type

[**TweetDeleteResponse**](TweetDeleteResponse.md)

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

<a name="findTweetById"></a>
# **findTweetById**
> SingleTweetLookupResponse findTweetById(id, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Tweet lookup by Tweet ID

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | A single Tweet ID.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      SingleTweetLookupResponse result = apiInstance.findTweetById(id, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| A single Tweet ID. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**SingleTweetLookupResponse**](SingleTweetLookupResponse.md)

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

<a name="findTweetsById"></a>
# **findTweetsById**
> MultiTweetLookupResponse findTweetsById(ids, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Tweet lookup by Tweet IDs

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | A comma separated list of Tweet IDs. Up to 100 are allowed in a single request.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      MultiTweetLookupResponse result = apiInstance.findTweetsById(ids, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| A comma separated list of Tweet IDs. Up to 100 are allowed in a single request. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**MultiTweetLookupResponse**](MultiTweetLookupResponse.md)

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

<a name="getRules"></a>
# **getRules**
> InlineResponse2001 getRules(ids, maxResults, paginationToken)

Rules lookup

Returns rules from a user&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | A comma-separated list of Rule IDs.
    Integer maxResults = 1000; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' returned in a request to paginate through results.
    try {
      InlineResponse2001 result = apiInstance.getRules(ids, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| A comma-separated list of Rule IDs. | [optional]
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 1000]
 **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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

<a name="hideReplyById"></a>
# **hideReplyById**
> InlineResponse200 hideReplyById(id, inlineObject4)

Hide replies

Hides or unhides a reply to an owned conversation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the reply that you want to hide or unhide.
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      InlineResponse200 result = apiInstance.hideReplyById(id, inlineObject4);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the reply that you want to hide or unhide. |
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. The reply has been hidden or unhidden. |  -  |
**0** | The request has failed. |  -  |

<a name="listsIdTweets"></a>
# **listsIdTweets**
> InlineResponse2002 listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

List Tweets timeline by List ID

Returns a list of Tweets associated with the provided List ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the List to list Tweets of
    Integer maxResults = 100; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      InlineResponse2002 result = apiInstance.listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to list Tweets of |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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

<a name="sampleStream"></a>
# **sampleStream**
> StreamingTweet sampleStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes)

Sample stream

Streams a deterministic 1% of public Tweets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested
    try {
      StreamingTweet result = apiInstance.sampleStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]
 **backfillMinutes** | **Integer**| The number of minutes of backfill requested | [optional]

### Return type

[**StreamingTweet**](StreamingTweet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful. Successful responses will return a stream of individual JSON Tweet payloads. |  -  |
**0** | The request has failed. |  -  |

<a name="searchStream"></a>
# **searchStream**
> FilteredStreamingTweet searchStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes)

Filtered stream

Streams Tweets matching the stream&#39;s active rule set.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested
    try {
      FilteredStreamingTweet result = apiInstance.searchStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]
 **backfillMinutes** | **Integer**| The number of minutes of backfill requested | [optional]

### Return type

[**FilteredStreamingTweet**](FilteredStreamingTweet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful. Successful responses will return a stream of individual JSON Tweet payloads. |  -  |
**0** | The request has failed. |  -  |

<a name="spaceBuyers"></a>
# **spaceBuyers**
> MultiUserLookupResponse spaceBuyers(id, userFields)

Retrieve the list of users who purchased a ticket to the given space

Retrieves the list of users who purchased a ticket to the given space

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "1YqKDqWqdPLsV"; // String | The space id from which tweets will be retrieved
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiUserLookupResponse result = apiInstance.spaceBuyers(id, userFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The space id from which tweets will be retrieved |
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

<a name="spaceTweets"></a>
# **spaceTweets**
> MultiTweetLookupResponse spaceTweets(id, maxResults, tweetFields)

Retrieve tweets from a Space

Retrieves tweets shared in the specified space

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "1YqKDqWqdPLsV"; // String | The space id from which tweets will be retrieved
    Integer maxResults = 56; // Integer | The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    try {
      MultiTweetLookupResponse result = apiInstance.spaceTweets(id, maxResults, tweetFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The space id from which tweets will be retrieved |
 **maxResults** | **Integer**| The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100 | [optional]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]

### Return type

[**MultiTweetLookupResponse**](MultiTweetLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="tweetCountsFullArchiveSearch"></a>
# **tweetCountsFullArchiveSearch**
> TweetCountsResponse tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, granularity)

Full archive search counts

Returns Tweet Counts that match a search query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Up to 2048 characters.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Granularity granularity = Granularity.fromValue("minute"); // Granularity | The granularity for the search counts results.
    try {
      TweetCountsResponse result = apiInstance.tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, granularity);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Up to 2048 characters. |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **granularity** | [**Granularity**](.md)| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day]

### Return type

[**TweetCountsResponse**](TweetCountsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tweet counts response |  -  |
**0** | The request has failed. |  -  |

<a name="tweetCountsRecentSearch"></a>
# **tweetCountsRecentSearch**
> TweetCountsResponse tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, granularity)

Recent search counts

Returns Tweet Counts from the last 7 days that match a search query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Up to 2048 characters.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Granularity granularity = Granularity.fromValue("minute"); // Granularity | The granularity for the search counts results.
    try {
      TweetCountsResponse result = apiInstance.tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, granularity);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Up to 2048 characters. |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **granularity** | [**Granularity**](.md)| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day]

### Return type

[**TweetCountsResponse**](TweetCountsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Recent tweet counts response |  -  |
**0** | The request has failed. |  -  |

<a name="tweetsFullarchiveSearch"></a>
# **tweetsFullarchiveSearch**
> TweetSearchResponse tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Full-archive search

Returns Tweets that match a search query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Up to 1024 characters.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // Integer | The maximum number of search results to be returned by a request.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      TweetSearchResponse result = apiInstance.tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Up to 1024 characters. |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**TweetSearchResponse**](TweetSearchResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tweets full archive search response |  -  |
**0** | The request has failed. |  -  |

<a name="tweetsRecentSearch"></a>
# **tweetsRecentSearch**
> TweetSearchResponse tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Recent search

Returns Tweets from the last 7 days that match a search query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Up to 512 characters.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // Integer | The maximum number of search results to be returned by a request.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      TweetSearchResponse result = apiInstance.tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Up to 512 characters. |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**TweetSearchResponse**](TweetSearchResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tweets recent search response |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdLike"></a>
# **usersIdLike**
> UsersLikesCreateResponse usersIdLike(id, usersLikesCreateRequest)

Causes the user (in the path) to like the specified tweet

Causes the user (in the path) to like the specified tweet. The user in the path must match the user context authorizing the request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to like the tweet
    UsersLikesCreateRequest usersLikesCreateRequest = new UsersLikesCreateRequest(); // UsersLikesCreateRequest | 
    try {
      UsersLikesCreateResponse result = apiInstance.usersIdLike(id, usersLikesCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to like the tweet |
 **usersLikesCreateRequest** | [**UsersLikesCreateRequest**](UsersLikesCreateRequest.md)|  | [optional]

### Return type

[**UsersLikesCreateResponse**](UsersLikesCreateResponse.md)

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

<a name="usersIdLikedTweets"></a>
# **usersIdLikedTweets**
> InlineResponse2002 usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Returns Tweet objects liked by the provided User ID

Returns a list of Tweets liked by the provided User ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the User to list the liked Tweets of
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      InlineResponse2002 result = apiInstance.usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the User to list the liked Tweets of |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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

<a name="usersIdMentions"></a>
# **usersIdMentions**
> GenericTweetsTimelineResponse usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

User mention timeline by User ID

Returns Tweet objects that mention username associated to the provided User ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the User to list mentions of
    String sinceId = "791775337160081409"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      GenericTweetsTimelineResponse result = apiInstance.usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the User to list mentions of |
 **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional]
 **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional]
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

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

<a name="usersIdRetweets"></a>
# **usersIdRetweets**
> UsersRetweetsCreateResponse usersIdRetweets(id, usersRetweetsCreateRequest)

Causes the user (in the path) to retweet the specified tweet

Causes the user (in the path) to retweet the specified tweet. The user in the path must match the user context authorizing the request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to retweet the tweet
    UsersRetweetsCreateRequest usersRetweetsCreateRequest = new UsersRetweetsCreateRequest(); // UsersRetweetsCreateRequest | 
    try {
      UsersRetweetsCreateResponse result = apiInstance.usersIdRetweets(id, usersRetweetsCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to retweet the tweet |
 **usersRetweetsCreateRequest** | [**UsersRetweetsCreateRequest**](UsersRetweetsCreateRequest.md)|  | [optional]

### Return type

[**UsersRetweetsCreateResponse**](UsersRetweetsCreateResponse.md)

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

<a name="usersIdTweets"></a>
# **usersIdTweets**
> GenericTweetsTimelineResponse usersIdTweets(id, sinceId, untilId, maxResults, exclude, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

User Tweets timeline by User ID

Returns a list of Tweets authored by the provided User ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

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


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the User to list Tweets of
    String sinceId = "791775337160081409"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results
    Set<String> exclude = Arrays.asList(); // Set<String> | The set of entities to exclude (e.g. 'replies' or 'retweets')
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      GenericTweetsTimelineResponse result = apiInstance.usersIdTweets(id, sinceId, untilId, maxResults, exclude, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the User to list Tweets of |
 **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional]
 **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional]
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;) | [optional] [enum: replies, retweets]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

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

<a name="usersIdUnlike"></a>
# **usersIdUnlike**
> UsersLikesDeleteResponse usersIdUnlike(id, tweetId)

Causes the user (in the path) to unlike the specified tweet

Causes the user (in the path) to unlike the specified tweet. The user must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to unlike the tweet
    String tweetId = "tweetId_example"; // String | The ID of the tweet that the user is requesting to unlike
    try {
      UsersLikesDeleteResponse result = apiInstance.usersIdUnlike(id, tweetId);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to unlike the tweet |
 **tweetId** | **String**| The ID of the tweet that the user is requesting to unlike |

### Return type

[**UsersLikesDeleteResponse**](UsersLikesDeleteResponse.md)

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

<a name="usersIdUnretweets"></a>
# **usersIdUnretweets**
> UsersRetweetsDeleteResponse usersIdUnretweets(id, sourceTweetId)

Causes the user (in the path) to unretweet the specified tweet

Causes the user (in the path) to unretweet the specified tweet. The user must match the user context authorizing the request

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TweetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");


    TweetsApi apiInstance = new TweetsApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to unretweet the tweet
    String sourceTweetId = "sourceTweetId_example"; // String | The ID of the tweet that the user is requesting to unretweet
    try {
      UsersRetweetsDeleteResponse result = apiInstance.usersIdUnretweets(id, sourceTweetId);
      System.out.println(result);
    } catch (ApiException e) {

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to unretweet the tweet |
 **sourceTweetId** | **String**| The ID of the tweet that the user is requesting to unretweet |

### Return type

[**UsersRetweetsDeleteResponse**](UsersRetweetsDeleteResponse.md)

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

