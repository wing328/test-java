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
import java.util.ArrayList;
import java.util.List;

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
 * Specifies the type of attachments (if any) present in this Tweet.
 */
@ApiModel(description = "Specifies the type of attachments (if any) present in this Tweet.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetAttachments {
  public static final String SERIALIZED_NAME_MEDIA_KEYS = "media_keys";
  @SerializedName(SERIALIZED_NAME_MEDIA_KEYS)
  private List<String> mediaKeys = null;

  public static final String SERIALIZED_NAME_POLL_IDS = "poll_ids";
  @SerializedName(SERIALIZED_NAME_POLL_IDS)
  private List<String> pollIds = null;

  public TweetAttachments() { 
  }

  public TweetAttachments mediaKeys(List<String> mediaKeys) {
    
    this.mediaKeys = mediaKeys;
    return this;
  }

  public TweetAttachments addMediaKeysItem(String mediaKeysItem) {
    if (this.mediaKeys == null) {
      this.mediaKeys = new ArrayList<String>();
    }
    this.mediaKeys.add(mediaKeysItem);
    return this;
  }

   /**
   * A list of Media Keys for each one of the media attachments (if media are attached).
   * @return mediaKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Media Keys for each one of the media attachments (if media are attached).")

  public List<String> getMediaKeys() {
    return mediaKeys;
  }


  public void setMediaKeys(List<String> mediaKeys) {
    this.mediaKeys = mediaKeys;
  }


  public TweetAttachments pollIds(List<String> pollIds) {
    
    this.pollIds = pollIds;
    return this;
  }

  public TweetAttachments addPollIdsItem(String pollIdsItem) {
    if (this.pollIds == null) {
      this.pollIds = new ArrayList<String>();
    }
    this.pollIds.add(pollIdsItem);
    return this;
  }

   /**
   * A list of poll IDs (if polls are attached).
   * @return pollIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of poll IDs (if polls are attached).")

  public List<String> getPollIds() {
    return pollIds;
  }


  public void setPollIds(List<String> pollIds) {
    this.pollIds = pollIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetAttachments tweetAttachments = (TweetAttachments) o;
    return Objects.equals(this.mediaKeys, tweetAttachments.mediaKeys) &&
        Objects.equals(this.pollIds, tweetAttachments.pollIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaKeys, pollIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetAttachments {\n");
    sb.append("    mediaKeys: ").append(toIndentedString(mediaKeys)).append("\n");
    sb.append("    pollIds: ").append(toIndentedString(pollIds)).append("\n");
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
    openapiFields.add("media_keys");
    openapiFields.add("poll_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetAttachments
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TweetAttachments.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetAttachments is not found in the empty JSON string", TweetAttachments.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetAttachments.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetAttachments` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetAttachments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetAttachments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetAttachments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetAttachments.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetAttachments>() {
           @Override
           public void write(JsonWriter out, TweetAttachments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetAttachments read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

