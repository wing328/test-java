# TwitterApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrDeleteRules**](TwitterApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
[**createBatchComplianceJob**](TwitterApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job
[**createTweet**](TwitterApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
[**deleteTweetById**](TwitterApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
[**findMyUser**](TwitterApi.md#findMyUser) | **GET** /2/users/me | User lookup me
[**findSpaceById**](TwitterApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID
[**findSpacesByCreatorIds**](TwitterApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
[**findSpacesByIds**](TwitterApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs
[**findTweetById**](TwitterApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
[**findTweetsById**](TwitterApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs
[**findUserById**](TwitterApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID
[**findUserByUsername**](TwitterApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username
[**findUsersById**](TwitterApi.md#findUsersById) | **GET** /2/users | User lookup by IDs
[**findUsersByUsername**](TwitterApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames
[**getBatchComplianceJob**](TwitterApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get compliance job
[**getOpenApiSpec**](TwitterApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the open api spec document.
[**getRules**](TwitterApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
[**getUserListMemberships**](TwitterApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships
[**hideReplyById**](TwitterApi.md#hideReplyById) | **PUT** /2/tweets/{id}/hidden | Hide replies
[**listAddMember**](TwitterApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member
[**listBatchComplianceJobs**](TwitterApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List compliance jobs
[**listGetFollowers**](TwitterApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns user objects that follow a List by the provided List ID
[**listGetMembers**](TwitterApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns user objects that are members of a List by the provided List ID
[**listIdCreate**](TwitterApi.md#listIdCreate) | **POST** /2/lists | Create List
[**listIdDelete**](TwitterApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List
[**listIdGet**](TwitterApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID
[**listIdUpdate**](TwitterApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List
[**listRemoveMember**](TwitterApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
[**listUserFollow**](TwitterApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List
[**listUserOwnedLists**](TwitterApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists
[**listUserPin**](TwitterApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List
[**listUserPinnedLists**](TwitterApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
[**listUserUnfollow**](TwitterApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
[**listUserUnpin**](TwitterApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
[**listsIdTweets**](TwitterApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID
[**sampleStream**](TwitterApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream
[**searchSpaces**](TwitterApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces
[**searchStream**](TwitterApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream
[**spaceBuyers**](TwitterApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
[**spaceTweets**](TwitterApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
[**tweetCountsFullArchiveSearch**](TwitterApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts
[**tweetCountsRecentSearch**](TwitterApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts
[**tweetsFullarchiveSearch**](TwitterApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search
[**tweetsIdLikingUsers**](TwitterApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns user objects that have liked the provided Tweet ID
[**tweetsIdRetweetingUsers**](TwitterApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns user objects that have retweeted the provided Tweet ID
[**tweetsRecentSearch**](TwitterApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search
[**userFollowedLists**](TwitterApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists
[**usernameFollowers**](TwitterApi.md#usernameFollowers) | **GET** /2/users/by/username/{username}/followers | Returns user objects that follow the provided username
[**usernameFollowing**](TwitterApi.md#usernameFollowing) | **GET** /2/users/by/username/{username}/following | Following by username
[**usersByUsernameMentions**](TwitterApi.md#usersByUsernameMentions) | **GET** /2/users/by/username/{username}/mentions | User mention timeline by username
[**usersByUsernameTweets**](TwitterApi.md#usersByUsernameTweets) | **GET** /2/users/by/username/{username}/tweets | User Tweets timeline by username
[**usersIdBlock**](TwitterApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID
[**usersIdBlocking**](TwitterApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns user objects that are blocked by provided user ID
[**usersIdFollow**](TwitterApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User
[**usersIdFollowers**](TwitterApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Returns user objects that follow the provided user ID
[**usersIdFollowing**](TwitterApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID
[**usersIdLike**](TwitterApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the user (in the path) to like the specified tweet
[**usersIdLikedTweets**](TwitterApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
[**usersIdMentions**](TwitterApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
[**usersIdMute**](TwitterApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID
[**usersIdMuting**](TwitterApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns user objects that are muted by the provided user ID
[**usersIdRetweets**](TwitterApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the user (in the path) to retweet the specified tweet
[**usersIdTweets**](TwitterApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
[**usersIdUnblock**](TwitterApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
[**usersIdUnfollow**](TwitterApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
[**usersIdUnlike**](TwitterApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the user (in the path) to unlike the specified tweet
[**usersIdUnmute**](TwitterApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID
[**usersIdUnretweets**](TwitterApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the user (in the path) to unretweet the specified tweet


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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    AddOrDeleteRulesRequest addOrDeleteRulesRequest = new AddOrDeleteRulesRequest(); // AddOrDeleteRulesRequest | 
    Boolean dryRun = true; // Boolean | Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes.
    try {
      AddOrDeleteRulesResponse result = apiInstance.addOrDeleteRules(addOrDeleteRulesRequest, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

<a name="createBatchComplianceJob"></a>
# **createBatchComplianceJob**
> SingleComplianceJobResponse createBatchComplianceJob(createBatchComplianceJobRequest)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    CreateBatchComplianceJobRequest createBatchComplianceJobRequest = new CreateBatchComplianceJobRequest(); // CreateBatchComplianceJobRequest | 
    try {
      SingleComplianceJobResponse result = apiInstance.createBatchComplianceJob(createBatchComplianceJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBatchComplianceJobRequest** | [**CreateBatchComplianceJobRequest**](CreateBatchComplianceJobRequest.md)|  |

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

<a name="createTweet"></a>
# **createTweet**
> TweetCreateResponse createTweet(createTweetRequest)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    CreateTweetRequest createTweetRequest = new CreateTweetRequest(); // CreateTweetRequest | 
    try {
      TweetCreateResponse result = apiInstance.createTweet(createTweetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTweetRequest** | [**CreateTweetRequest**](CreateTweetRequest.md)|  | [optional]

### Return type

[**TweetCreateResponse**](TweetCreateResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the Tweet to be deleted.
    try {
      TweetDeleteResponse result = apiInstance.deleteTweetById(id);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      SingleUserLookupResponse result = apiInstance.findMyUser(expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findSpaceById"></a>
# **findSpaceById**
> SingleSpaceLookupResponse findSpaceById(id, spaceFields, expansions)

Space lookup by Space ID

Returns a variety of information about the Space specified by the requested ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The space id to be retrieved
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    try {
      SingleSpaceLookupResponse result = apiInstance.findSpaceById(id, spaceFields, expansions);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The space id to be retrieved |
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**SingleSpaceLookupResponse**](SingleSpaceLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findSpacesByCreatorIds"></a>
# **findSpacesByCreatorIds**
> MultiSpaceLookupResponse findSpacesByCreatorIds(userIds, spaceFields, expansions)

Space lookup by their creators

Returns a variety of information about the Spaces created by the provided User IDs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    List<String> userIds = Arrays.asList(); // List<String> | The users to search through
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    try {
      MultiSpaceLookupResponse result = apiInstance.findSpacesByCreatorIds(userIds, spaceFields, expansions);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIds** | [**List&lt;String&gt;**](String.md)| The users to search through |
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findSpacesByIds"></a>
# **findSpacesByIds**
> MultiSpaceLookupResponse findSpacesByIds(ids, spaceFields, expansions)

Space lookup up Space IDs

Returns a variety of information about the Spaces specified by the requested IDs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | A list of space ids
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    try {
      MultiSpaceLookupResponse result = apiInstance.findSpacesByIds(ids, spaceFields, expansions);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| A list of space ids |
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "2244994945"; // String | Required. A User ID.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      SingleUserLookupResponse result = apiInstance.findUserById(id, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String username = "TwitterDev"; // String | Required. A username.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      SingleUserLookupResponse result = apiInstance.findUserByUsername(username, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | Required. A list of User IDs, comma-separated. You can specify up to 100 IDs.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiUserLookupResponse result = apiInstance.findUsersById(ids, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    List<String> usernames = Arrays.asList(); // List<String> | Required . A list of usernames, comma-separated. You can specify up to 100 usernames.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiUserLookupResponse result = apiInstance.findUsersByUsername(usernames, expansions, tweetFields, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | ID of the compliance job to retrieve.
    try {
      SingleComplianceJobResponse result = apiInstance.getBatchComplianceJob(id);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    try {
      Object result = apiInstance.getOpenApiSpec();
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

<a name="getRules"></a>
# **getRules**
> GetRulesResponse getRules(ids, maxResults, paginationToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | A comma-separated list of Rule IDs.
    Integer maxResults = 1000; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' returned in a request to paginate through results.
    try {
      GetRulesResponse result = apiInstance.getRules(ids, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[**GetRulesResponse**](GetRulesResponse.md)

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

<a name="getUserListMemberships"></a>
# **getUserListMemberships**
> MultiListResponse getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields)

Get a User&#39;s List Memberships

Get a User&#39;s List Memberships.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = Arrays.asList(); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiListResponse result = apiInstance.getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponse**](MultiListResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
> HideReplyByIdResponse hideReplyById(id, hideReplyByIdRequest)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the reply that you want to hide or unhide.
    HideReplyByIdRequest hideReplyByIdRequest = new HideReplyByIdRequest(); // HideReplyByIdRequest | 
    try {
      HideReplyByIdResponse result = apiInstance.hideReplyById(id, hideReplyByIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the reply that you want to hide or unhide. |
 **hideReplyByIdRequest** | [**HideReplyByIdRequest**](HideReplyByIdRequest.md)|  | [optional]

### Return type

[**HideReplyByIdResponse**](HideReplyByIdResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. The reply has been hidden or unhidden. |  -  |
**0** | The request has failed. |  -  |

<a name="listAddMember"></a>
# **listAddMember**
> ListMemberResponse listAddMember(id, listAddMemberRequest)

Add a List member

Causes a user to become a member of a List.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the List to add a member
    ListAddMemberRequest listAddMemberRequest = new ListAddMemberRequest(); // ListAddMemberRequest | 
    try {
      ListMemberResponse result = apiInstance.listAddMember(id, listAddMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to add a member |
 **listAddMemberRequest** | [**ListAddMemberRequest**](ListAddMemberRequest.md)|  | [optional]

### Return type

[**ListMemberResponse**](ListMemberResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    ComplianceJobType type = ComplianceJobType.fromValue("tweets"); // ComplianceJobType | Type of compliance job to list.
    ComplianceJobStatus status = ComplianceJobStatus.fromValue("created"); // ComplianceJobStatus | Status of compliance job to list.
    try {
      MultiComplianceJobResponse result = apiInstance.listBatchComplianceJobs(type, status);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listIdCreate"></a>
# **listIdCreate**
> ListCreateResponse listIdCreate(listCreateRequest)

Create List

Creates a new List.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    ListCreateRequest listCreateRequest = new ListCreateRequest(); // ListCreateRequest | 
    try {
      ListCreateResponse result = apiInstance.listIdCreate(listCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listCreateRequest** | [**ListCreateRequest**](ListCreateRequest.md)|  | [optional]

### Return type

[**ListCreateResponse**](ListCreateResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listIdDelete"></a>
# **listIdDelete**
> ListDeleteResponse listIdDelete(id)

Delete List

Delete a List that you own.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the List to delete
    try {
      ListDeleteResponse result = apiInstance.listIdDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to delete |

### Return type

[**ListDeleteResponse**](ListDeleteResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listIdGet"></a>
# **listIdGet**
> SingleListLookupResponse listIdGet(id, listFields, expansions, userFields)

List lookup by List ID

Returns a List

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the List to get
    Set<String> listFields = Arrays.asList(); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      SingleListLookupResponse result = apiInstance.listIdGet(id, listFields, expansions, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to get |
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleListLookupResponse**](SingleListLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listIdUpdate"></a>
# **listIdUpdate**
> ListUpdateResponse listIdUpdate(id, listUpdateRequest)

Update List

Update a List that you own.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the List to modify
    ListUpdateRequest listUpdateRequest = new ListUpdateRequest(); // ListUpdateRequest | 
    try {
      ListUpdateResponse result = apiInstance.listIdUpdate(id, listUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to modify |
 **listUpdateRequest** | [**ListUpdateRequest**](ListUpdateRequest.md)|  | [optional]

### Return type

[**ListUpdateResponse**](ListUpdateResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listRemoveMember"></a>
# **listRemoveMember**
> ListMemberResponse listRemoveMember(id, userId)

Remove a List member

Causes a user to be removed from the members of a List.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the List to remove a member
    String userId = "userId_example"; // String | The ID of user that will be removed from the List
    try {
      ListMemberResponse result = apiInstance.listRemoveMember(id, userId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to remove a member |
 **userId** | **String**| The ID of user that will be removed from the List |

### Return type

[**ListMemberResponse**](ListMemberResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listUserFollow"></a>
# **listUserFollow**
> ListFollowedResponse listUserFollow(id, listFollowRequest)

Follow a List

Causes a user to follow a List.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the authenticated source user that will follow the List
    ListFollowRequest listFollowRequest = new ListFollowRequest(); // ListFollowRequest | 
    try {
      ListFollowedResponse result = apiInstance.listUserFollow(id, listFollowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the authenticated source user that will follow the List |
 **listFollowRequest** | [**ListFollowRequest**](ListFollowRequest.md)|  | [optional]

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listUserOwnedLists"></a>
# **listUserOwnedLists**
> MultiListResponse listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields)

Get a User&#39;s Owned Lists

Get a User&#39;s Owned Lists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = Arrays.asList(); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiListResponse result = apiInstance.listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponse**](MultiListResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listUserPin"></a>
# **listUserPin**
> ListPinnedResponse listUserPin(id, listPinRequest)

Pin a List

Causes a user to pin a List.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the authenticated source user that will pin the List
    ListPinRequest listPinRequest = new ListPinRequest(); // ListPinRequest | 
    try {
      ListPinnedResponse result = apiInstance.listUserPin(id, listPinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the authenticated source user that will pin the List |
 **listPinRequest** | [**ListPinRequest**](ListPinRequest.md)|  | [optional]

### Return type

[**ListPinnedResponse**](ListPinnedResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listUserPinnedLists"></a>
# **listUserPinnedLists**
> MultiListNoPaginationResponse listUserPinnedLists(id, listFields, expansions, userFields)

Get a User&#39;s Pinned Lists

Get a User&#39;s Pinned Lists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Set<String> listFields = Arrays.asList(); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiListNoPaginationResponse result = apiInstance.listUserPinnedLists(id, listFields, expansions, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListNoPaginationResponse**](MultiListNoPaginationResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listUserUnfollow"></a>
# **listUserUnfollow**
> ListFollowedResponse listUserUnfollow(id, listId)

Unfollow a List

Causes a user to unfollow a List.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the authenticated source user that will unfollow the List
    String listId = "listId_example"; // String | The ID of the List to unfollow
    try {
      ListFollowedResponse result = apiInstance.listUserUnfollow(id, listId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the authenticated source user that will unfollow the List |
 **listId** | **String**| The ID of the List to unfollow |

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listUserUnpin"></a>
# **listUserUnpin**
> ListPinnedResponse listUserUnpin(id, listId)

Unpin a List

Causes a user to remove a pinned List.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the authenticated source user that will remove the pinned List
    String listId = "listId_example"; // String | The ID of the List to unpin
    try {
      ListPinnedResponse result = apiInstance.listUserUnpin(id, listId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the authenticated source user that will remove the pinned List |
 **listId** | **String**| The ID of the List to unpin |

### Return type

[**ListPinnedResponse**](ListPinnedResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="listsIdTweets"></a>
# **listsIdTweets**
> ListsIdTweetsResponse listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      ListsIdTweetsResponse result = apiInstance.listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[**ListsIdTweetsResponse**](ListsIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

<a name="searchSpaces"></a>
# **searchSpaces**
> MultiSpaceLookupResponse searchSpaces(query, state, maxResults, spaceFields, expansions)

Search for Spaces

Returns Spaces that match the provided query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String query = "crypto"; // String | The search query
    String state = "live"; // String | The state of spaces to search for
    Integer maxResults = 56; // Integer | The number of results to return. The maximum for this value is 100.
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    try {
      MultiSpaceLookupResponse result = apiInstance.searchSpaces(query, state, maxResults, spaceFields, expansions);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| The search query |
 **state** | **String**| The state of spaces to search for | [optional] [default to all] [enum: live, scheduled, all]
 **maxResults** | **Integer**| The number of results to return. The maximum for this value is 100. | [optional]
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "1YqKDqWqdPLsV"; // String | The space id from which tweets will be retrieved
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiUserLookupResponse result = apiInstance.spaceBuyers(id, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "1YqKDqWqdPLsV"; // String | The space id from which tweets will be retrieved
    Integer maxResults = 56; // Integer | The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    try {
      MultiTweetLookupResponse result = apiInstance.spaceTweets(id, maxResults, tweetFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

<a name="tweetsIdLikingUsers"></a>
# **tweetsIdLikingUsers**
> GenericMultipleUsersLookupResponse tweetsIdLikingUsers(id, maxResults, paginationToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the Tweet for which to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.tweetsIdLikingUsers(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Tweet for which to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
> GenericMultipleUsersLookupResponse tweetsIdRetweetingUsers(id, maxResults, paginationToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the Tweet for which to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.tweetsIdRetweetingUsers(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Tweet for which to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tweets recent search response |  -  |
**0** | The request has failed. |  -  |

<a name="userFollowedLists"></a>
# **userFollowedLists**
> MultiListResponse userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields)

Get User&#39;s Followed Lists

Returns a user&#39;s followed Lists.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = Arrays.asList(); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    try {
      MultiListResponse result = apiInstance.userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponse**](MultiListResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usernameFollowers"></a>
# **usernameFollowers**
> GenericMultipleUsersLookupResponse usernameFollowers(username, maxResults, paginationToken)

Returns user objects that follow the provided username

Returns a list of users that follow the provided username

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String username = "username_example"; // String | The username of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.usernameFollowers(username, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponse**](GenericMultipleUsersLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usernameFollowing"></a>
# **usernameFollowing**
> UsersFollowingLookupResponse usernameFollowing(username, maxResults, paginationToken)

Following by username

Returns a list of users that being followed by the provided username

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String username = "username_example"; // String | The username of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      UsersFollowingLookupResponse result = apiInstance.usernameFollowing(username, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**UsersFollowingLookupResponse**](UsersFollowingLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersByUsernameMentions"></a>
# **usersByUsernameMentions**
> GenericTweetsTimelineResponse usersByUsernameMentions(username, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

User mention timeline by username

Returns Tweet objects that mention the provided username

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String username = "username_example"; // String | The username of the User to list mentions of
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
      GenericTweetsTimelineResponse result = apiInstance.usersByUsernameMentions(username, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username of the User to list mentions of |
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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersByUsernameTweets"></a>
# **usersByUsernameTweets**
> GenericTweetsTimelineResponse usersByUsernameTweets(username, sinceId, untilId, maxResults, paginationToken, startTime, endTime, exclude, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

User Tweets timeline by username

Returns a list of Tweets authored by the provided username

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String username = "username_example"; // String | The username of the User to list Tweets of
    String sinceId = "791775337160081409"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> exclude = Arrays.asList(); // Set<String> | The set of entities to exclude (e.g. 'replies' or 'retweets')
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    try {
      GenericTweetsTimelineResponse result = apiInstance.usersByUsernameTweets(username, sinceId, untilId, maxResults, paginationToken, startTime, endTime, exclude, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username of the User to list Tweets of |
 **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional]
 **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional]
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional]
 **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;) | [optional] [enum: replies, retweets]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
> UsersBlockingMutationResponse usersIdBlock(id, usersIdBlockRequest)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to block the target user
    UsersIdBlockRequest usersIdBlockRequest = new UsersIdBlockRequest(); // UsersIdBlockRequest | 
    try {
      UsersBlockingMutationResponse result = apiInstance.usersIdBlock(id, usersIdBlockRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to block the target user |
 **usersIdBlockRequest** | [**UsersIdBlockRequest**](UsersIdBlockRequest.md)|  | [optional]

### Return type

[**UsersBlockingMutationResponse**](UsersBlockingMutationResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.usersIdBlocking(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
> UsersFollowingCreateResponse usersIdFollow(id, usersIdFollowRequest)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to follow the target user
    UsersIdFollowRequest usersIdFollowRequest = new UsersIdFollowRequest(); // UsersIdFollowRequest | 
    try {
      UsersFollowingCreateResponse result = apiInstance.usersIdFollow(id, usersIdFollowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to follow the target user |
 **usersIdFollowRequest** | [**UsersIdFollowRequest**](UsersIdFollowRequest.md)|  | [optional]

### Return type

[**UsersFollowingCreateResponse**](UsersFollowingCreateResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.usersIdFollowers(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
    try {
      UsersFollowingLookupResponse result = apiInstance.usersIdFollowing(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to like the tweet
    UsersLikesCreateRequest usersLikesCreateRequest = new UsersLikesCreateRequest(); // UsersLikesCreateRequest | 
    try {
      UsersLikesCreateResponse result = apiInstance.usersIdLike(id, usersLikesCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
> UsersIdLikedTweetsResponse usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      UsersIdLikedTweetsResponse result = apiInstance.usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[**UsersIdLikedTweetsResponse**](UsersIdLikedTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
> UsersMutingMutationResponse usersIdMute(id, usersIdMuteRequest)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to mute the target user
    UsersIdMuteRequest usersIdMuteRequest = new UsersIdMuteRequest(); // UsersIdMuteRequest | 
    try {
      UsersMutingMutationResponse result = apiInstance.usersIdMute(id, usersIdMuteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to mute the target user |
 **usersIdMuteRequest** | [**UsersIdMuteRequest**](UsersIdMuteRequest.md)|  | [optional]

### Return type

[**UsersMutingMutationResponse**](UsersMutingMutationResponse.md)

### Authorization

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 100; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    try {
      GenericMultipleUsersLookupResponse result = apiInstance.usersIdMuting(id, maxResults, paginationToken);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to retweet the tweet
    UsersRetweetsCreateRequest usersRetweetsCreateRequest = new UsersRetweetsCreateRequest(); // UsersRetweetsCreateRequest | 
    try {
      UsersRetweetsCreateResponse result = apiInstance.usersIdRetweets(id, usersRetweetsCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");


    TwitterApi apiInstance = new TwitterApi(defaultClient);
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
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[BearerToken](../README.md#BearerToken), [UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String sourceUserId = "sourceUserId_example"; // String | The ID of the user that is requesting to unblock the target user
    String targetUserId = "targetUserId_example"; // String | The ID of the user that the source user is requesting to unblock
    try {
      UsersBlockingMutationResponse result = apiInstance.usersIdUnblock(sourceUserId, targetUserId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String sourceUserId = "sourceUserId_example"; // String | The ID of the user that is requesting to unfollow the target user
    String targetUserId = "targetUserId_example"; // String | The ID of the user that the source user is requesting to unfollow
    try {
      UsersFollowingDeleteResponse result = apiInstance.usersIdUnfollow(sourceUserId, targetUserId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to unlike the tweet
    String tweetId = "tweetId_example"; // String | The ID of the tweet that the user is requesting to unlike
    try {
      UsersLikesDeleteResponse result = apiInstance.usersIdUnlike(id, tweetId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String sourceUserId = "sourceUserId_example"; // String | The ID of the user that is requesting to unmute the target user
    String targetUserId = "targetUserId_example"; // String | The ID of the user that the source user is requesting to unmute
    try {
      UsersMutingMutationResponse result = apiInstance.usersIdUnmute(sourceUserId, targetUserId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

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
import org.openapitools.client.api.TwitterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    

    TwitterApi apiInstance = new TwitterApi(defaultClient);
    String id = "id_example"; // String | The ID of the user that is requesting to unretweet the tweet
    String sourceTweetId = "sourceTweetId_example"; // String | The ID of the tweet that the user is requesting to unretweet
    try {
      UsersRetweetsDeleteResponse result = apiInstance.usersIdUnretweets(id, sourceTweetId);
      System.out.println(result);
    } catch (ApiException e) {
      if (e.getErrorObject() instanceof InvalidRequestProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof ResourceNotFoundProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof FieldUnauthorizedProblem) {
        // do something here
      } else if (e.getErrorObject() instanceof Problem) {
        // do something here
      } else {
        // something else happened
        System.err.println("Exception when calling {{{classname}}}#{{{operationId}}}");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
      }

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

[UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

