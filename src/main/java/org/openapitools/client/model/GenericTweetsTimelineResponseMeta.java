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
 * GenericTweetsTimelineResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GenericTweetsTimelineResponseMeta {
  public static final String SERIALIZED_NAME_NEWEST_ID = "newest_id";
  @SerializedName(SERIALIZED_NAME_NEWEST_ID)
  private String newestId;

  public static final String SERIALIZED_NAME_OLDEST_ID = "oldest_id";
  @SerializedName(SERIALIZED_NAME_OLDEST_ID)
  private String oldestId;

  public static final String SERIALIZED_NAME_PREVIOUS_TOKEN = "previous_token";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_TOKEN)
  private String previousToken;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "next_token";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken;

  public static final String SERIALIZED_NAME_RESULT_COUNT = "result_count";
  @SerializedName(SERIALIZED_NAME_RESULT_COUNT)
  private Integer resultCount;

  public GenericTweetsTimelineResponseMeta() { 
  }

  public GenericTweetsTimelineResponseMeta newestId(String newestId) {
    
    this.newestId = newestId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return newestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1346889436626259968", value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getNewestId() {
    return newestId;
  }


  public void setNewestId(String newestId) {
    this.newestId = newestId;
  }


  public GenericTweetsTimelineResponseMeta oldestId(String oldestId) {
    
    this.oldestId = oldestId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return oldestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1346889436626259968", value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getOldestId() {
    return oldestId;
  }


  public void setOldestId(String oldestId) {
    this.oldestId = oldestId;
  }


  public GenericTweetsTimelineResponseMeta previousToken(String previousToken) {
    
    this.previousToken = previousToken;
    return this;
  }

   /**
   * The previous token
   * @return previousToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The previous token")

  public String getPreviousToken() {
    return previousToken;
  }


  public void setPreviousToken(String previousToken) {
    this.previousToken = previousToken;
  }


  public GenericTweetsTimelineResponseMeta nextToken(String nextToken) {
    
    this.nextToken = nextToken;
    return this;
  }

   /**
   * The next token
   * @return nextToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The next token")

  public String getNextToken() {
    return nextToken;
  }


  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }


  public GenericTweetsTimelineResponseMeta resultCount(Integer resultCount) {
    
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Number of Tweets in result set
   * @return resultCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of Tweets in result set")

  public Integer getResultCount() {
    return resultCount;
  }


  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericTweetsTimelineResponseMeta genericTweetsTimelineResponseMeta = (GenericTweetsTimelineResponseMeta) o;
    return Objects.equals(this.newestId, genericTweetsTimelineResponseMeta.newestId) &&
        Objects.equals(this.oldestId, genericTweetsTimelineResponseMeta.oldestId) &&
        Objects.equals(this.previousToken, genericTweetsTimelineResponseMeta.previousToken) &&
        Objects.equals(this.nextToken, genericTweetsTimelineResponseMeta.nextToken) &&
        Objects.equals(this.resultCount, genericTweetsTimelineResponseMeta.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newestId, oldestId, previousToken, nextToken, resultCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericTweetsTimelineResponseMeta {\n");
    sb.append("    newestId: ").append(toIndentedString(newestId)).append("\n");
    sb.append("    oldestId: ").append(toIndentedString(oldestId)).append("\n");
    sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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
    openapiFields.add("newest_id");
    openapiFields.add("oldest_id");
    openapiFields.add("previous_token");
    openapiFields.add("next_token");
    openapiFields.add("result_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenericTweetsTimelineResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GenericTweetsTimelineResponseMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenericTweetsTimelineResponseMeta is not found in the empty JSON string", GenericTweetsTimelineResponseMeta.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenericTweetsTimelineResponseMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenericTweetsTimelineResponseMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericTweetsTimelineResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericTweetsTimelineResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericTweetsTimelineResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericTweetsTimelineResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericTweetsTimelineResponseMeta>() {
           @Override
           public void write(JsonWriter out, GenericTweetsTimelineResponseMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericTweetsTimelineResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

