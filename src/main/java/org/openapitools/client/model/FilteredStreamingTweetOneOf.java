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
import org.openapitools.client.model.Expansions;
import org.openapitools.client.model.FilteredStreamingTweetOneOfMatchingRules;
import org.openapitools.client.model.Tweet;

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
 * The values returned with a successful streamed tweet. Includes the user provided rules that the tweet matched.
 */
@ApiModel(description = "The values returned with a successful streamed tweet. Includes the user provided rules that the tweet matched.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilteredStreamingTweetOneOf {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Tweet data;

  public static final String SERIALIZED_NAME_MATCHING_RULES = "matching_rules";
  @SerializedName(SERIALIZED_NAME_MATCHING_RULES)
  private List<FilteredStreamingTweetOneOfMatchingRules> matchingRules = new ArrayList<FilteredStreamingTweetOneOfMatchingRules>();

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private Expansions includes;

  public FilteredStreamingTweetOneOf() { 
  }

  public FilteredStreamingTweetOneOf data(Tweet data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Tweet getData() {
    return data;
  }


  public void setData(Tweet data) {
    this.data = data;
  }


  public FilteredStreamingTweetOneOf matchingRules(List<FilteredStreamingTweetOneOfMatchingRules> matchingRules) {
    
    this.matchingRules = matchingRules;
    return this;
  }

  public FilteredStreamingTweetOneOf addMatchingRulesItem(FilteredStreamingTweetOneOfMatchingRules matchingRulesItem) {
    this.matchingRules.add(matchingRulesItem);
    return this;
  }

   /**
   * The list of rules which matched the tweet
   * @return matchingRules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of rules which matched the tweet")

  public List<FilteredStreamingTweetOneOfMatchingRules> getMatchingRules() {
    return matchingRules;
  }


  public void setMatchingRules(List<FilteredStreamingTweetOneOfMatchingRules> matchingRules) {
    this.matchingRules = matchingRules;
  }


  public FilteredStreamingTweetOneOf includes(Expansions includes) {
    
    this.includes = includes;
    return this;
  }

   /**
   * Get includes
   * @return includes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Expansions getIncludes() {
    return includes;
  }


  public void setIncludes(Expansions includes) {
    this.includes = includes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteredStreamingTweetOneOf filteredStreamingTweetOneOf = (FilteredStreamingTweetOneOf) o;
    return Objects.equals(this.data, filteredStreamingTweetOneOf.data) &&
        Objects.equals(this.matchingRules, filteredStreamingTweetOneOf.matchingRules) &&
        Objects.equals(this.includes, filteredStreamingTweetOneOf.includes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, matchingRules, includes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteredStreamingTweetOneOf {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    matchingRules: ").append(toIndentedString(matchingRules)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("matching_rules");
    openapiFields.add("includes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("matching_rules");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilteredStreamingTweetOneOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FilteredStreamingTweetOneOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FilteredStreamingTweetOneOf is not found in the empty JSON string", FilteredStreamingTweetOneOf.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FilteredStreamingTweetOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FilteredStreamingTweetOneOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilteredStreamingTweetOneOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        Tweet.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      JsonArray jsonArraymatchingRules = jsonObj.getAsJsonArray("matching_rules");
      // validate the optional field `matching_rules` (array)
      if (jsonArraymatchingRules != null) {
        for (int i = 0; i < jsonArraymatchingRules.size(); i++) {
          FilteredStreamingTweetOneOfMatchingRules.validateJsonObject(jsonArraymatchingRules.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `includes`
      if (jsonObj.getAsJsonObject("includes") != null) {
        Expansions.validateJsonObject(jsonObj.getAsJsonObject("includes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilteredStreamingTweetOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilteredStreamingTweetOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilteredStreamingTweetOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilteredStreamingTweetOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FilteredStreamingTweetOneOf>() {
           @Override
           public void write(JsonWriter out, FilteredStreamingTweetOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilteredStreamingTweetOneOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilteredStreamingTweetOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilteredStreamingTweetOneOf
  * @throws IOException if the JSON string is invalid with respect to FilteredStreamingTweetOneOf
  */
  public static FilteredStreamingTweetOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilteredStreamingTweetOneOf.class);
  }

 /**
  * Convert an instance of FilteredStreamingTweetOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

