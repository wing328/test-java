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
import java.util.ArrayList;
import java.util.List;

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
 * Media information being attached to created Tweet. This is mutually exclusive from Quote Tweet Id and Poll.
 */
@ApiModel(description = "Media information being attached to created Tweet. This is mutually exclusive from Quote Tweet Id and Poll.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Model2TweetsMedia {
  public static final String SERIALIZED_NAME_MEDIA_IDS = "media_ids";
  @SerializedName(SERIALIZED_NAME_MEDIA_IDS)
  private List<String> mediaIds = null;

  public static final String SERIALIZED_NAME_TAGGED_USER_IDS = "tagged_user_ids";
  @SerializedName(SERIALIZED_NAME_TAGGED_USER_IDS)
  private List<String> taggedUserIds = null;

  public Model2TweetsMedia() { 
  }

  public Model2TweetsMedia mediaIds(List<String> mediaIds) {
    
    this.mediaIds = mediaIds;
    return this;
  }

  public Model2TweetsMedia addMediaIdsItem(String mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<String>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

   /**
   * A list of Media Ids to be attached to a created Tweet.
   * @return mediaIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Media Ids to be attached to a created Tweet.")

  public List<String> getMediaIds() {
    return mediaIds;
  }


  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }


  public Model2TweetsMedia taggedUserIds(List<String> taggedUserIds) {
    
    this.taggedUserIds = taggedUserIds;
    return this;
  }

  public Model2TweetsMedia addTaggedUserIdsItem(String taggedUserIdsItem) {
    if (this.taggedUserIds == null) {
      this.taggedUserIds = new ArrayList<String>();
    }
    this.taggedUserIds.add(taggedUserIdsItem);
    return this;
  }

   /**
   * A list of User Ids to be tagged in the media for created Tweet.
   * @return taggedUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of User Ids to be tagged in the media for created Tweet.")

  public List<String> getTaggedUserIds() {
    return taggedUserIds;
  }


  public void setTaggedUserIds(List<String> taggedUserIds) {
    this.taggedUserIds = taggedUserIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model2TweetsMedia _2tweetsMedia = (Model2TweetsMedia) o;
    return Objects.equals(this.mediaIds, _2tweetsMedia.mediaIds) &&
        Objects.equals(this.taggedUserIds, _2tweetsMedia.taggedUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaIds, taggedUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model2TweetsMedia {\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    taggedUserIds: ").append(toIndentedString(taggedUserIds)).append("\n");
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
    openapiFields.add("media_ids");
    openapiFields.add("tagged_user_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Model2TweetsMedia
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Model2TweetsMedia.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Model2TweetsMedia is not found in the empty JSON string", Model2TweetsMedia.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Model2TweetsMedia.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Model2TweetsMedia` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Model2TweetsMedia.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Model2TweetsMedia' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Model2TweetsMedia> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Model2TweetsMedia.class));

       return (TypeAdapter<T>) new TypeAdapter<Model2TweetsMedia>() {
           @Override
           public void write(JsonWriter out, Model2TweetsMedia value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Model2TweetsMedia read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Model2TweetsMedia given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Model2TweetsMedia
  * @throws IOException if the JSON string is invalid with respect to Model2TweetsMedia
  */
  public static Model2TweetsMedia fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Model2TweetsMedia.class);
  }

 /**
  * Convert an instance of Model2TweetsMedia to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

