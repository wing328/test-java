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
 * UsersLikesCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsersLikesCreateRequest {
  public static final String SERIALIZED_NAME_TWEET_ID = "tweet_id";
  @SerializedName(SERIALIZED_NAME_TWEET_ID)
  private String tweetId;

  public UsersLikesCreateRequest() { 
  }

  public UsersLikesCreateRequest tweetId(String tweetId) {
    
    this.tweetId = tweetId;
    return this;
  }

   /**
   * Get tweetId
   * @return tweetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTweetId() {
    return tweetId;
  }


  public void setTweetId(String tweetId) {
    this.tweetId = tweetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersLikesCreateRequest usersLikesCreateRequest = (UsersLikesCreateRequest) o;
    return Objects.equals(this.tweetId, usersLikesCreateRequest.tweetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tweetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersLikesCreateRequest {\n");
    sb.append("    tweetId: ").append(toIndentedString(tweetId)).append("\n");
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
    openapiFields.add("tweet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tweet_id");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersLikesCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersLikesCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersLikesCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersLikesCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersLikesCreateRequest>() {
           @Override
           public void write(JsonWriter out, UsersLikesCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersLikesCreateRequest read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!UsersLikesCreateRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `UsersLikesCreateRequest` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : UsersLikesCreateRequest.openapiRequiredFields) {
               if (obj.get(requiredField) == null) {
                 throw new IllegalArgumentException("The required field `" + requiredField + "` is not found in the JSON string");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
}
