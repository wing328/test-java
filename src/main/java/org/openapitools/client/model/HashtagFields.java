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
 * Represent the portion of text recognized as a Hashtag, and its start and end position within the text.
 */
@ApiModel(description = "Represent the portion of text recognized as a Hashtag, and its start and end position within the text.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HashtagFields {
  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public HashtagFields() { 
  }

  public HashtagFields tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * The text of the Hashtag
   * @return tag
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MondayMotivation", required = true, value = "The text of the Hashtag")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HashtagFields hashtagFields = (HashtagFields) o;
    return Objects.equals(this.tag, hashtagFields.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HashtagFields {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tag");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HashtagFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HashtagFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HashtagFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HashtagFields.class));

       return (TypeAdapter<T>) new TypeAdapter<HashtagFields>() {
           @Override
           public void write(JsonWriter out, HashtagFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HashtagFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject().deepCopy();
             Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry : entries) {
               if (!HashtagFields.openapiFields.contains(entry.getKey())) {
                 throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HashtagFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : HashtagFields.openapiRequiredFields) {
               if (jsonObj.get(requiredField) == null) {
                 throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
               }
             }

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

