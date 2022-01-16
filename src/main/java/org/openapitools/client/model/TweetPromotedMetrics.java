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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Promoted nonpublic engagement metrics for the Tweet at the time of the request.
 */
@ApiModel(description = "Promoted nonpublic engagement metrics for the Tweet at the time of the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetPromotedMetrics {
  public static final String SERIALIZED_NAME_IMPRESSION_COUNT = "impression_count";
  @SerializedName(SERIALIZED_NAME_IMPRESSION_COUNT)
  private Integer impressionCount;

  public static final String SERIALIZED_NAME_LIKE_COUNT = "like_count";
  @SerializedName(SERIALIZED_NAME_LIKE_COUNT)
  private Integer likeCount;

  public static final String SERIALIZED_NAME_REPLY_COUNT = "reply_count";
  @SerializedName(SERIALIZED_NAME_REPLY_COUNT)
  private Integer replyCount;

  public static final String SERIALIZED_NAME_RETWEET_COUNT = "retweet_count";
  @SerializedName(SERIALIZED_NAME_RETWEET_COUNT)
  private Integer retweetCount;

  public TweetPromotedMetrics() { 
  }

  public TweetPromotedMetrics impressionCount(Integer impressionCount) {
    
    this.impressionCount = impressionCount;
    return this;
  }

   /**
   * Number of times this Tweet has been viewed.
   * @return impressionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times this Tweet has been viewed.")

  public Integer getImpressionCount() {
    return impressionCount;
  }


  public void setImpressionCount(Integer impressionCount) {
    this.impressionCount = impressionCount;
  }


  public TweetPromotedMetrics likeCount(Integer likeCount) {
    
    this.likeCount = likeCount;
    return this;
  }

   /**
   * Number of times this Tweet has been liked.
   * @return likeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times this Tweet has been liked.")

  public Integer getLikeCount() {
    return likeCount;
  }


  public void setLikeCount(Integer likeCount) {
    this.likeCount = likeCount;
  }


  public TweetPromotedMetrics replyCount(Integer replyCount) {
    
    this.replyCount = replyCount;
    return this;
  }

   /**
   * Number of times this Tweet has been replied to.
   * @return replyCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times this Tweet has been replied to.")

  public Integer getReplyCount() {
    return replyCount;
  }


  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }


  public TweetPromotedMetrics retweetCount(Integer retweetCount) {
    
    this.retweetCount = retweetCount;
    return this;
  }

   /**
   * Number of times this Tweet has been Retweeted.
   * @return retweetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of times this Tweet has been Retweeted.")

  public Integer getRetweetCount() {
    return retweetCount;
  }


  public void setRetweetCount(Integer retweetCount) {
    this.retweetCount = retweetCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetPromotedMetrics tweetPromotedMetrics = (TweetPromotedMetrics) o;
    return Objects.equals(this.impressionCount, tweetPromotedMetrics.impressionCount) &&
        Objects.equals(this.likeCount, tweetPromotedMetrics.likeCount) &&
        Objects.equals(this.replyCount, tweetPromotedMetrics.replyCount) &&
        Objects.equals(this.retweetCount, tweetPromotedMetrics.retweetCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impressionCount, likeCount, replyCount, retweetCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetPromotedMetrics {\n");
    sb.append("    impressionCount: ").append(toIndentedString(impressionCount)).append("\n");
    sb.append("    likeCount: ").append(toIndentedString(likeCount)).append("\n");
    sb.append("    replyCount: ").append(toIndentedString(replyCount)).append("\n");
    sb.append("    retweetCount: ").append(toIndentedString(retweetCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("impression_count");
    openapiFields.add("like_count");
    openapiFields.add("reply_count");
    openapiFields.add("retweet_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetPromotedMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TweetPromotedMetrics.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetPromotedMetrics is not found in the empty JSON string", TweetPromotedMetrics.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetPromotedMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetPromotedMetrics` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetPromotedMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetPromotedMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetPromotedMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetPromotedMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetPromotedMetrics>() {
           @Override
           public void write(JsonWriter out, TweetPromotedMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetPromotedMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetPromotedMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetPromotedMetrics
  * @throws IOException if the JSON string is invalid with respect to TweetPromotedMetrics
  */
  public static TweetPromotedMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetPromotedMetrics.class);
  }

 /**
  * Convert an instance of TweetPromotedMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

