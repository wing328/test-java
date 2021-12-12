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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.URLImage;

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
 * Represent the portion of text recognized as a URL.
 */
@ApiModel(description = "Represent the portion of text recognized as a URL.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class URLFields {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_EXPANDED_URL = "expanded_url";
  @SerializedName(SERIALIZED_NAME_EXPANDED_URL)
  private URI expandedUrl;

  public static final String SERIALIZED_NAME_DISPLAY_URL = "display_url";
  @SerializedName(SERIALIZED_NAME_DISPLAY_URL)
  private String displayUrl;

  public static final String SERIALIZED_NAME_UNWOUND_URL = "unwound_url";
  @SerializedName(SERIALIZED_NAME_UNWOUND_URL)
  private URI unwoundUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<URLImage> images = null;

  public URLFields() { 
  }

  public URLFields url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * A validly formatted URL.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://developer.twitter.com/en/docs/twitter-api", required = true, value = "A validly formatted URL.")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public URLFields expandedUrl(URI expandedUrl) {
    
    this.expandedUrl = expandedUrl;
    return this;
  }

   /**
   * A validly formatted URL.
   * @return expandedUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://developer.twitter.com/en/docs/twitter-api", value = "A validly formatted URL.")

  public URI getExpandedUrl() {
    return expandedUrl;
  }


  public void setExpandedUrl(URI expandedUrl) {
    this.expandedUrl = expandedUrl;
  }


  public URLFields displayUrl(String displayUrl) {
    
    this.displayUrl = displayUrl;
    return this;
  }

   /**
   * The URL as displayed in the Twitter client.
   * @return displayUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "twittercommunity.com/t/introducing-…", value = "The URL as displayed in the Twitter client.")

  public String getDisplayUrl() {
    return displayUrl;
  }


  public void setDisplayUrl(String displayUrl) {
    this.displayUrl = displayUrl;
  }


  public URLFields unwoundUrl(URI unwoundUrl) {
    
    this.unwoundUrl = unwoundUrl;
    return this;
  }

   /**
   * Fully resolved url
   * @return unwoundUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://twittercommunity.com/t/introducing-the-v2-follow-lookup-endpoints/147118", value = "Fully resolved url")

  public URI getUnwoundUrl() {
    return unwoundUrl;
  }


  public void setUnwoundUrl(URI unwoundUrl) {
    this.unwoundUrl = unwoundUrl;
  }


  public URLFields status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * HTTP Status Code.
   * minimum: 100
   * maximum: 599
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP Status Code.")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public URLFields title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the page the URL points to.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Introducing the v2 follow lookup endpoints", value = "Title of the page the URL points to.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public URLFields description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the URL landing page.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a description of the website.", value = "Description of the URL landing page.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public URLFields images(List<URLImage> images) {
    
    this.images = images;
    return this;
  }

  public URLFields addImagesItem(URLImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<URLImage>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<URLImage> getImages() {
    return images;
  }


  public void setImages(List<URLImage> images) {
    this.images = images;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URLFields urLFields = (URLFields) o;
    return Objects.equals(this.url, urLFields.url) &&
        Objects.equals(this.expandedUrl, urLFields.expandedUrl) &&
        Objects.equals(this.displayUrl, urLFields.displayUrl) &&
        Objects.equals(this.unwoundUrl, urLFields.unwoundUrl) &&
        Objects.equals(this.status, urLFields.status) &&
        Objects.equals(this.title, urLFields.title) &&
        Objects.equals(this.description, urLFields.description) &&
        Objects.equals(this.images, urLFields.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, expandedUrl, displayUrl, unwoundUrl, status, title, description, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URLFields {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    expandedUrl: ").append(toIndentedString(expandedUrl)).append("\n");
    sb.append("    displayUrl: ").append(toIndentedString(displayUrl)).append("\n");
    sb.append("    unwoundUrl: ").append(toIndentedString(unwoundUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("expanded_url");
    openapiFields.add("display_url");
    openapiFields.add("unwound_url");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("images");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to URLFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (URLFields.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in URLFields is not found in the empty JSON string", URLFields.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!URLFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `URLFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : URLFields.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!URLFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'URLFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<URLFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(URLFields.class));

       return (TypeAdapter<T>) new TypeAdapter<URLFields>() {
           @Override
           public void write(JsonWriter out, URLFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public URLFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

