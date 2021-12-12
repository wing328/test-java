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
import java.net.URI;
import org.openapitools.client.model.AnimatedGif;
import org.openapitools.client.model.Media;
import org.openapitools.client.model.Photo;
import org.openapitools.client.model.Video;
import org.openapitools.client.model.VideoAllOf;
import org.openapitools.client.model.VideoAllOfNonPublicMetrics;
import org.openapitools.client.model.VideoAllOfOrganicMetrics;
import org.openapitools.client.model.VideoAllOfPromotedMetrics;
import org.openapitools.client.model.VideoAllOfPublicMetrics;

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
 * Video
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Video extends Media {
  public static final String SERIALIZED_NAME_PREVIEW_IMAGE_URL = "preview_image_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_IMAGE_URL)
  private URI previewImageUrl;

  public static final String SERIALIZED_NAME_DURATION_MS = "duration_ms";
  @SerializedName(SERIALIZED_NAME_DURATION_MS)
  private Integer durationMs;

  public static final String SERIALIZED_NAME_PUBLIC_METRICS = "public_metrics";
  @SerializedName(SERIALIZED_NAME_PUBLIC_METRICS)
  private VideoAllOfPublicMetrics publicMetrics;

  public static final String SERIALIZED_NAME_NON_PUBLIC_METRICS = "non_public_metrics";
  @SerializedName(SERIALIZED_NAME_NON_PUBLIC_METRICS)
  private VideoAllOfNonPublicMetrics nonPublicMetrics;

  public static final String SERIALIZED_NAME_ORGANIC_METRICS = "organic_metrics";
  @SerializedName(SERIALIZED_NAME_ORGANIC_METRICS)
  private VideoAllOfOrganicMetrics organicMetrics;

  public static final String SERIALIZED_NAME_PROMOTED_METRICS = "promoted_metrics";
  @SerializedName(SERIALIZED_NAME_PROMOTED_METRICS)
  private VideoAllOfPromotedMetrics promotedMetrics;

  public Video() { 
    this.type = this.getClass().getSimpleName();
  }

  public Video previewImageUrl(URI previewImageUrl) {
    
    this.previewImageUrl = previewImageUrl;
    return this;
  }

   /**
   * Get previewImageUrl
   * @return previewImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getPreviewImageUrl() {
    return previewImageUrl;
  }


  public void setPreviewImageUrl(URI previewImageUrl) {
    this.previewImageUrl = previewImageUrl;
  }


  public Video durationMs(Integer durationMs) {
    
    this.durationMs = durationMs;
    return this;
  }

   /**
   * Get durationMs
   * @return durationMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationMs() {
    return durationMs;
  }


  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }


  public Video publicMetrics(VideoAllOfPublicMetrics publicMetrics) {
    
    this.publicMetrics = publicMetrics;
    return this;
  }

   /**
   * Get publicMetrics
   * @return publicMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoAllOfPublicMetrics getPublicMetrics() {
    return publicMetrics;
  }


  public void setPublicMetrics(VideoAllOfPublicMetrics publicMetrics) {
    this.publicMetrics = publicMetrics;
  }


  public Video nonPublicMetrics(VideoAllOfNonPublicMetrics nonPublicMetrics) {
    
    this.nonPublicMetrics = nonPublicMetrics;
    return this;
  }

   /**
   * Get nonPublicMetrics
   * @return nonPublicMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoAllOfNonPublicMetrics getNonPublicMetrics() {
    return nonPublicMetrics;
  }


  public void setNonPublicMetrics(VideoAllOfNonPublicMetrics nonPublicMetrics) {
    this.nonPublicMetrics = nonPublicMetrics;
  }


  public Video organicMetrics(VideoAllOfOrganicMetrics organicMetrics) {
    
    this.organicMetrics = organicMetrics;
    return this;
  }

   /**
   * Get organicMetrics
   * @return organicMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoAllOfOrganicMetrics getOrganicMetrics() {
    return organicMetrics;
  }


  public void setOrganicMetrics(VideoAllOfOrganicMetrics organicMetrics) {
    this.organicMetrics = organicMetrics;
  }


  public Video promotedMetrics(VideoAllOfPromotedMetrics promotedMetrics) {
    
    this.promotedMetrics = promotedMetrics;
    return this;
  }

   /**
   * Get promotedMetrics
   * @return promotedMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VideoAllOfPromotedMetrics getPromotedMetrics() {
    return promotedMetrics;
  }


  public void setPromotedMetrics(VideoAllOfPromotedMetrics promotedMetrics) {
    this.promotedMetrics = promotedMetrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.previewImageUrl, video.previewImageUrl) &&
        Objects.equals(this.durationMs, video.durationMs) &&
        Objects.equals(this.publicMetrics, video.publicMetrics) &&
        Objects.equals(this.nonPublicMetrics, video.nonPublicMetrics) &&
        Objects.equals(this.organicMetrics, video.organicMetrics) &&
        Objects.equals(this.promotedMetrics, video.promotedMetrics) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewImageUrl, durationMs, publicMetrics, nonPublicMetrics, organicMetrics, promotedMetrics, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    previewImageUrl: ").append(toIndentedString(previewImageUrl)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    publicMetrics: ").append(toIndentedString(publicMetrics)).append("\n");
    sb.append("    nonPublicMetrics: ").append(toIndentedString(nonPublicMetrics)).append("\n");
    sb.append("    organicMetrics: ").append(toIndentedString(organicMetrics)).append("\n");
    sb.append("    promotedMetrics: ").append(toIndentedString(promotedMetrics)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("media_key");
    openapiFields.add("height");
    openapiFields.add("width");
    openapiFields.add("preview_image_url");
    openapiFields.add("duration_ms");
    openapiFields.add("public_metrics");
    openapiFields.add("non_public_metrics");
    openapiFields.add("organic_metrics");
    openapiFields.add("promoted_metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Video
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Video.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Video is not found in the empty JSON string", Video.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Video.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Video` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Video.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Video.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Video' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Video> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Video.class));

       return (TypeAdapter<T>) new TypeAdapter<Video>() {
           @Override
           public void write(JsonWriter out, Video value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Video read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

