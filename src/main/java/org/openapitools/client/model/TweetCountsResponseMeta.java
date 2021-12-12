/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: latest
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

/**
 * TweetCountsResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetCountsResponseMeta {
  public static final String SERIALIZED_NAME_NEXT_TOKEN = "next_token";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_TOTAL_TWEET_COUNT = "total_tweet_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_TWEET_COUNT)
  private Integer totalTweetCount;

  public TweetCountsResponseMeta() { 
  }

  public TweetCountsResponseMeta nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * This value is used to get the next &#39;page&#39; of results by providing it to the next_token parameter.
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This value is used to get the next 'page' of results by providing it to the next_token parameter.")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public TweetCountsResponseMeta totalTweetCount(Integer totalTweetCount) {
    
    this.totalTweetCount = totalTweetCount;
    return this;
  }

   /**
   * Sum of search query count results
   * @return totalTweetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of search query count results")

  public Integer getTotalTweetCount() {
    return totalTweetCount;
  }


  public void setTotalTweetCount(Integer totalTweetCount) {
    this.totalTweetCount = totalTweetCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetCountsResponseMeta tweetCountsResponseMeta = (TweetCountsResponseMeta) o;
    return Objects.equals(this.nextToken, tweetCountsResponseMeta.nextToken) &&
        Objects.equals(this.totalTweetCount, tweetCountsResponseMeta.totalTweetCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, totalTweetCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetCountsResponseMeta {\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    totalTweetCount: ").append(toIndentedString(totalTweetCount)).append("\n");
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
    openapiFields.add("next_token");
    openapiFields.add("total_tweet_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetCountsResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TweetCountsResponseMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetCountsResponseMeta is not found in the empty JSON string", TweetCountsResponseMeta.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetCountsResponseMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetCountsResponseMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetCountsResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetCountsResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetCountsResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetCountsResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetCountsResponseMeta>() {
           @Override
           public void write(JsonWriter out, TweetCountsResponseMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetCountsResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

