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
 * Nonpublic engagement metrics for the Media at the time of the request.
 */
@ApiModel(description = "Nonpublic engagement metrics for the Media at the time of the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoAllOfNonPublicMetrics {
  public static final String SERIALIZED_NAME_PLAYBACK0_COUNT = "playback_0_count";
  @SerializedName(SERIALIZED_NAME_PLAYBACK0_COUNT)
  private Integer playback0Count;

  public static final String SERIALIZED_NAME_PLAYBACK25_COUNT = "playback_25_count";
  @SerializedName(SERIALIZED_NAME_PLAYBACK25_COUNT)
  private Integer playback25Count;

  public static final String SERIALIZED_NAME_PLAYBACK50_COUNT = "playback_50_count";
  @SerializedName(SERIALIZED_NAME_PLAYBACK50_COUNT)
  private Integer playback50Count;

  public static final String SERIALIZED_NAME_PLAYBACK75_COUNT = "playback_75_count";
  @SerializedName(SERIALIZED_NAME_PLAYBACK75_COUNT)
  private Integer playback75Count;

  public static final String SERIALIZED_NAME_PLAYBACK100_COUNT = "playback_100_count";
  @SerializedName(SERIALIZED_NAME_PLAYBACK100_COUNT)
  private Integer playback100Count;

  public VideoAllOfNonPublicMetrics() { 
  }

  public VideoAllOfNonPublicMetrics playback0Count(Integer playback0Count) {
    
    this.playback0Count = playback0Count;
    return this;
  }

   /**
   * Number of users who made it through 0% of the video.
   * @return playback0Count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of users who made it through 0% of the video.")

  public Integer getPlayback0Count() {
    return playback0Count;
  }


  public void setPlayback0Count(Integer playback0Count) {
    this.playback0Count = playback0Count;
  }


  public VideoAllOfNonPublicMetrics playback25Count(Integer playback25Count) {
    
    this.playback25Count = playback25Count;
    return this;
  }

   /**
   * Number of users who made it through 25% of the video.
   * @return playback25Count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of users who made it through 25% of the video.")

  public Integer getPlayback25Count() {
    return playback25Count;
  }


  public void setPlayback25Count(Integer playback25Count) {
    this.playback25Count = playback25Count;
  }


  public VideoAllOfNonPublicMetrics playback50Count(Integer playback50Count) {
    
    this.playback50Count = playback50Count;
    return this;
  }

   /**
   * Number of users who made it through 50% of the video.
   * @return playback50Count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of users who made it through 50% of the video.")

  public Integer getPlayback50Count() {
    return playback50Count;
  }


  public void setPlayback50Count(Integer playback50Count) {
    this.playback50Count = playback50Count;
  }


  public VideoAllOfNonPublicMetrics playback75Count(Integer playback75Count) {
    
    this.playback75Count = playback75Count;
    return this;
  }

   /**
   * Number of users who made it through 75% of the video.
   * @return playback75Count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of users who made it through 75% of the video.")

  public Integer getPlayback75Count() {
    return playback75Count;
  }


  public void setPlayback75Count(Integer playback75Count) {
    this.playback75Count = playback75Count;
  }


  public VideoAllOfNonPublicMetrics playback100Count(Integer playback100Count) {
    
    this.playback100Count = playback100Count;
    return this;
  }

   /**
   * Number of users who made it through 100% of the video.
   * @return playback100Count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of users who made it through 100% of the video.")

  public Integer getPlayback100Count() {
    return playback100Count;
  }


  public void setPlayback100Count(Integer playback100Count) {
    this.playback100Count = playback100Count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAllOfNonPublicMetrics videoAllOfNonPublicMetrics = (VideoAllOfNonPublicMetrics) o;
    return Objects.equals(this.playback0Count, videoAllOfNonPublicMetrics.playback0Count) &&
        Objects.equals(this.playback25Count, videoAllOfNonPublicMetrics.playback25Count) &&
        Objects.equals(this.playback50Count, videoAllOfNonPublicMetrics.playback50Count) &&
        Objects.equals(this.playback75Count, videoAllOfNonPublicMetrics.playback75Count) &&
        Objects.equals(this.playback100Count, videoAllOfNonPublicMetrics.playback100Count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playback0Count, playback25Count, playback50Count, playback75Count, playback100Count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAllOfNonPublicMetrics {\n");
    sb.append("    playback0Count: ").append(toIndentedString(playback0Count)).append("\n");
    sb.append("    playback25Count: ").append(toIndentedString(playback25Count)).append("\n");
    sb.append("    playback50Count: ").append(toIndentedString(playback50Count)).append("\n");
    sb.append("    playback75Count: ").append(toIndentedString(playback75Count)).append("\n");
    sb.append("    playback100Count: ").append(toIndentedString(playback100Count)).append("\n");
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
    openapiFields.add("playback_0_count");
    openapiFields.add("playback_25_count");
    openapiFields.add("playback_50_count");
    openapiFields.add("playback_75_count");
    openapiFields.add("playback_100_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoAllOfNonPublicMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VideoAllOfNonPublicMetrics.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoAllOfNonPublicMetrics is not found in the empty JSON string", VideoAllOfNonPublicMetrics.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VideoAllOfNonPublicMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VideoAllOfNonPublicMetrics` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoAllOfNonPublicMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoAllOfNonPublicMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoAllOfNonPublicMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoAllOfNonPublicMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoAllOfNonPublicMetrics>() {
           @Override
           public void write(JsonWriter out, VideoAllOfNonPublicMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideoAllOfNonPublicMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

