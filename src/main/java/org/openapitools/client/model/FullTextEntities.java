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
import org.openapitools.client.model.CashtagEntity;
import org.openapitools.client.model.EntityIndicesInclusiveInclusive;
import org.openapitools.client.model.HashtagEntity;
import org.openapitools.client.model.MentionEntity;
import org.openapitools.client.model.UrlEntity;

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
 * FullTextEntities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FullTextEntities {
  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<UrlEntity> urls = null;

  public static final String SERIALIZED_NAME_HASHTAGS = "hashtags";
  @SerializedName(SERIALIZED_NAME_HASHTAGS)
  private List<HashtagEntity> hashtags = null;

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  private List<MentionEntity> mentions = null;

  public static final String SERIALIZED_NAME_CASHTAGS = "cashtags";
  @SerializedName(SERIALIZED_NAME_CASHTAGS)
  private List<CashtagEntity> cashtags = null;

  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private List<EntityIndicesInclusiveInclusive> annotations = null;

  public FullTextEntities() { 
  }

  public FullTextEntities urls(List<UrlEntity> urls) {
    
    this.urls = urls;
    return this;
  }

  public FullTextEntities addUrlsItem(UrlEntity urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<UrlEntity>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UrlEntity> getUrls() {
    return urls;
  }


  public void setUrls(List<UrlEntity> urls) {
    this.urls = urls;
  }


  public FullTextEntities hashtags(List<HashtagEntity> hashtags) {
    
    this.hashtags = hashtags;
    return this;
  }

  public FullTextEntities addHashtagsItem(HashtagEntity hashtagsItem) {
    if (this.hashtags == null) {
      this.hashtags = new ArrayList<HashtagEntity>();
    }
    this.hashtags.add(hashtagsItem);
    return this;
  }

   /**
   * Get hashtags
   * @return hashtags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HashtagEntity> getHashtags() {
    return hashtags;
  }


  public void setHashtags(List<HashtagEntity> hashtags) {
    this.hashtags = hashtags;
  }


  public FullTextEntities mentions(List<MentionEntity> mentions) {
    
    this.mentions = mentions;
    return this;
  }

  public FullTextEntities addMentionsItem(MentionEntity mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<MentionEntity>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

   /**
   * Get mentions
   * @return mentions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MentionEntity> getMentions() {
    return mentions;
  }


  public void setMentions(List<MentionEntity> mentions) {
    this.mentions = mentions;
  }


  public FullTextEntities cashtags(List<CashtagEntity> cashtags) {
    
    this.cashtags = cashtags;
    return this;
  }

  public FullTextEntities addCashtagsItem(CashtagEntity cashtagsItem) {
    if (this.cashtags == null) {
      this.cashtags = new ArrayList<CashtagEntity>();
    }
    this.cashtags.add(cashtagsItem);
    return this;
  }

   /**
   * Get cashtags
   * @return cashtags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CashtagEntity> getCashtags() {
    return cashtags;
  }


  public void setCashtags(List<CashtagEntity> cashtags) {
    this.cashtags = cashtags;
  }


  public FullTextEntities annotations(List<EntityIndicesInclusiveInclusive> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public FullTextEntities addAnnotationsItem(EntityIndicesInclusiveInclusive annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<EntityIndicesInclusiveInclusive>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EntityIndicesInclusiveInclusive> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(List<EntityIndicesInclusiveInclusive> annotations) {
    this.annotations = annotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullTextEntities fullTextEntities = (FullTextEntities) o;
    return Objects.equals(this.urls, fullTextEntities.urls) &&
        Objects.equals(this.hashtags, fullTextEntities.hashtags) &&
        Objects.equals(this.mentions, fullTextEntities.mentions) &&
        Objects.equals(this.cashtags, fullTextEntities.cashtags) &&
        Objects.equals(this.annotations, fullTextEntities.annotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urls, hashtags, mentions, cashtags, annotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullTextEntities {\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    cashtags: ").append(toIndentedString(cashtags)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
    openapiFields.add("urls");
    openapiFields.add("hashtags");
    openapiFields.add("mentions");
    openapiFields.add("cashtags");
    openapiFields.add("annotations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FullTextEntities
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FullTextEntities.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FullTextEntities is not found in the empty JSON string", FullTextEntities.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FullTextEntities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FullTextEntities` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayurls = jsonObj.getAsJsonArray("urls");
      // validate the optional field `urls` (array)
      if (jsonArrayurls != null) {
        for (int i = 0; i < jsonArrayurls.size(); i++) {
          UrlEntity.validateJsonObject(jsonArrayurls.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayhashtags = jsonObj.getAsJsonArray("hashtags");
      // validate the optional field `hashtags` (array)
      if (jsonArrayhashtags != null) {
        for (int i = 0; i < jsonArrayhashtags.size(); i++) {
          HashtagEntity.validateJsonObject(jsonArrayhashtags.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraymentions = jsonObj.getAsJsonArray("mentions");
      // validate the optional field `mentions` (array)
      if (jsonArraymentions != null) {
        for (int i = 0; i < jsonArraymentions.size(); i++) {
          MentionEntity.validateJsonObject(jsonArraymentions.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraycashtags = jsonObj.getAsJsonArray("cashtags");
      // validate the optional field `cashtags` (array)
      if (jsonArraycashtags != null) {
        for (int i = 0; i < jsonArraycashtags.size(); i++) {
          CashtagEntity.validateJsonObject(jsonArraycashtags.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayannotations = jsonObj.getAsJsonArray("annotations");
      // validate the optional field `annotations` (array)
      if (jsonArrayannotations != null) {
        for (int i = 0; i < jsonArrayannotations.size(); i++) {
          EntityIndicesInclusiveInclusive.validateJsonObject(jsonArrayannotations.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FullTextEntities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FullTextEntities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FullTextEntities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FullTextEntities.class));

       return (TypeAdapter<T>) new TypeAdapter<FullTextEntities>() {
           @Override
           public void write(JsonWriter out, FullTextEntities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FullTextEntities read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

