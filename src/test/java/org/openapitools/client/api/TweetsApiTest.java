/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.34
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AddOrDeleteRulesRequest;
import org.openapitools.client.model.AddOrDeleteRulesResponse;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.FilteredStreamingTweet;
import org.openapitools.client.model.GenericTweetsTimelineResponse;
import org.openapitools.client.model.Granularity;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineObject4;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;
import org.openapitools.client.model.InlineResponse2002;
import org.openapitools.client.model.MultiTweetLookupResponse;
import org.openapitools.client.model.MultiUserLookupResponse;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.Problem;
import java.util.Set;
import org.openapitools.client.model.SingleTweetLookupResponse;
import org.openapitools.client.model.StreamingTweet;
import org.openapitools.client.model.TweetCountsResponse;
import org.openapitools.client.model.TweetCreateResponse;
import org.openapitools.client.model.TweetDeleteResponse;
import org.openapitools.client.model.TweetSearchResponse;
import org.openapitools.client.model.UsersLikesCreateRequest;
import org.openapitools.client.model.UsersLikesCreateResponse;
import org.openapitools.client.model.UsersLikesDeleteResponse;
import org.openapitools.client.model.UsersRetweetsCreateRequest;
import org.openapitools.client.model.UsersRetweetsCreateResponse;
import org.openapitools.client.model.UsersRetweetsDeleteResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TweetsApi
 */
@Ignore
public class TweetsApiTest {

    private final TweetsApi api = new TweetsApi();

    
    /**
     * Add/Delete rules
     *
     * Add or delete rules from a user&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrDeleteRulesTest() throws ApiException {
        AddOrDeleteRulesRequest addOrDeleteRulesRequest = null;
        Boolean dryRun = null;
                AddOrDeleteRulesResponse response = api.addOrDeleteRules(addOrDeleteRulesRequest, dryRun);
        // TODO: test validations
    }
    
    /**
     * Creation of a Tweet
     *
     * Causes the user to create a tweet under the authorized account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTweetTest() throws ApiException {
        InlineObject3 inlineObject3 = null;
                TweetCreateResponse response = api.createTweet(inlineObject3);
        // TODO: test validations
    }
    
    /**
     * Tweet delete by Tweet ID
     *
     * Delete specified Tweet (in the path) by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTweetByIdTest() throws ApiException {
        String id = null;
                TweetDeleteResponse response = api.deleteTweetById(id);
        // TODO: test validations
    }
    
    /**
     * Tweet lookup by Tweet ID
     *
     * Returns a variety of information about the Tweet specified by the requested ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTweetByIdTest() throws ApiException {
        String id = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                SingleTweetLookupResponse response = api.findTweetById(id, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * Tweet lookup by Tweet IDs
     *
     * Returns a variety of information about the Tweet specified by the requested ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTweetsByIdTest() throws ApiException {
        List<String> ids = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                MultiTweetLookupResponse response = api.findTweetsById(ids, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * Rules lookup
     *
     * Returns rules from a user&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRulesTest() throws ApiException {
        List<String> ids = null;
        Integer maxResults = null;
        String paginationToken = null;
                InlineResponse2001 response = api.getRules(ids, maxResults, paginationToken);
        // TODO: test validations
    }
    
    /**
     * Hide replies
     *
     * Hides or unhides a reply to an owned conversation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hideReplyByIdTest() throws ApiException {
        String id = null;
        InlineObject4 inlineObject4 = null;
                InlineResponse200 response = api.hideReplyById(id, inlineObject4);
        // TODO: test validations
    }
    
    /**
     * List Tweets timeline by List ID
     *
     * Returns a list of Tweets associated with the provided List ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listsIdTweetsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                InlineResponse2002 response = api.listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * Sample stream
     *
     * Streams a deterministic 1% of public Tweets.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sampleStreamTest() throws ApiException {
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
        Integer backfillMinutes = null;
                StreamingTweet response = api.sampleStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes);
        // TODO: test validations
    }
    
    /**
     * Filtered stream
     *
     * Streams Tweets matching the stream&#39;s active rule set.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchStreamTest() throws ApiException {
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
        Integer backfillMinutes = null;
                FilteredStreamingTweet response = api.searchStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes);
        // TODO: test validations
    }
    
    /**
     * Retrieve the list of users who purchased a ticket to the given space
     *
     * Retrieves the list of users who purchased a ticket to the given space
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spaceBuyersTest() throws ApiException {
        String id = null;
        Set<String> userFields = null;
                MultiUserLookupResponse response = api.spaceBuyers(id, userFields);
        // TODO: test validations
    }
    
    /**
     * Retrieve tweets from a Space
     *
     * Retrieves tweets shared in the specified space
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void spaceTweetsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        Set<String> tweetFields = null;
                MultiTweetLookupResponse response = api.spaceTweets(id, maxResults, tweetFields);
        // TODO: test validations
    }
    
    /**
     * Full archive search counts
     *
     * Returns Tweet Counts that match a search query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tweetCountsFullArchiveSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        String nextToken = null;
        Granularity granularity = null;
                TweetCountsResponse response = api.tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, granularity);
        // TODO: test validations
    }
    
    /**
     * Recent search counts
     *
     * Returns Tweet Counts from the last 7 days that match a search query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tweetCountsRecentSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        String nextToken = null;
        Granularity granularity = null;
                TweetCountsResponse response = api.tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, granularity);
        // TODO: test validations
    }
    
    /**
     * Full-archive search
     *
     * Returns Tweets that match a search query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tweetsFullarchiveSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String nextToken = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                TweetSearchResponse response = api.tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * Recent search
     *
     * Returns Tweets from the last 7 days that match a search query.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tweetsRecentSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String nextToken = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                TweetSearchResponse response = api.tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * Causes the user (in the path) to like the specified tweet
     *
     * Causes the user (in the path) to like the specified tweet. The user in the path must match the user context authorizing the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdLikeTest() throws ApiException {
        String id = null;
        UsersLikesCreateRequest usersLikesCreateRequest = null;
                UsersLikesCreateResponse response = api.usersIdLike(id, usersLikesCreateRequest);
        // TODO: test validations
    }
    
    /**
     * Returns Tweet objects liked by the provided User ID
     *
     * Returns a list of Tweets liked by the provided User ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdLikedTweetsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                InlineResponse2002 response = api.usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * User mention timeline by User ID
     *
     * Returns Tweet objects that mention username associated to the provided User ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdMentionsTest() throws ApiException {
        String id = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String paginationToken = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                GenericTweetsTimelineResponse response = api.usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * Causes the user (in the path) to retweet the specified tweet
     *
     * Causes the user (in the path) to retweet the specified tweet. The user in the path must match the user context authorizing the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdRetweetsTest() throws ApiException {
        String id = null;
        UsersRetweetsCreateRequest usersRetweetsCreateRequest = null;
                UsersRetweetsCreateResponse response = api.usersIdRetweets(id, usersRetweetsCreateRequest);
        // TODO: test validations
    }
    
    /**
     * User Tweets timeline by User ID
     *
     * Returns a list of Tweets authored by the provided User ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdTweetsTest() throws ApiException {
        String id = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        Set<String> exclude = null;
        String paginationToken = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Set<String> userFields = null;
        Set<String> mediaFields = null;
        Set<String> placeFields = null;
        Set<String> pollFields = null;
                GenericTweetsTimelineResponse response = api.usersIdTweets(id, sinceId, untilId, maxResults, exclude, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
        // TODO: test validations
    }
    
    /**
     * Causes the user (in the path) to unlike the specified tweet
     *
     * Causes the user (in the path) to unlike the specified tweet. The user must match the user context authorizing the request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdUnlikeTest() throws ApiException {
        String id = null;
        String tweetId = null;
                UsersLikesDeleteResponse response = api.usersIdUnlike(id, tweetId);
        // TODO: test validations
    }
    
    /**
     * Causes the user (in the path) to unretweet the specified tweet
     *
     * Causes the user (in the path) to unretweet the specified tweet. The user must match the user context authorizing the request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersIdUnretweetsTest() throws ApiException {
        String id = null;
        String sourceTweetId = null;
                UsersRetweetsDeleteResponse response = api.usersIdUnretweets(id, sourceTweetId);
        // TODO: test validations
    }
    
}
