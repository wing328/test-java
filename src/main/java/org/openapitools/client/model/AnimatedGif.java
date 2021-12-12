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
import org.openapitools.client.model.AnimatedGifAllOf;
import org.openapitools.client.model.Media;
import org.openapitools.client.model.Photo;
import org.openapitools.client.model.Video;

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
 * AnimatedGif
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AnimatedGif extends Media {
  public static final String SERIALIZED_NAME_PREVIEW_IMAGE_URL = "preview_image_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_IMAGE_URL)
  private URI previewImageUrl;

  public AnimatedGif() { 
    this.type = this.getClass().getSimpleName();
  }

  public AnimatedGif previewImageUrl(URI previewImageUrl) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnimatedGif animatedGif = (AnimatedGif) o;
    return Objects.equals(this.previewImageUrl, animatedGif.previewImageUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewImageUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimatedGif {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    previewImageUrl: ").append(toIndentedString(previewImageUrl)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnimatedGif
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AnimatedGif.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnimatedGif is not found in the empty JSON string", AnimatedGif.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnimatedGif.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnimatedGif` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnimatedGif.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnimatedGif.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnimatedGif' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnimatedGif> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnimatedGif.class));

       return (TypeAdapter<T>) new TypeAdapter<AnimatedGif>() {
           @Override
           public void write(JsonWriter out, AnimatedGif value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnimatedGif read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

