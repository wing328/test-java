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

import org.openapitools.client.JSON;

/**
 * ListPinnedResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListPinnedResponseData {
  public static final String SERIALIZED_NAME_PINNED = "pinned";
  @SerializedName(SERIALIZED_NAME_PINNED)
  private Boolean pinned;

  public ListPinnedResponseData() { 
  }

  public ListPinnedResponseData pinned(Boolean pinned) {
    
    this.pinned = pinned;
    return this;
  }

   /**
   * Get pinned
   * @return pinned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPinned() {
    return pinned;
  }


  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPinnedResponseData listPinnedResponseData = (ListPinnedResponseData) o;
    return Objects.equals(this.pinned, listPinnedResponseData.pinned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPinnedResponseData {\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
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
    openapiFields.add("pinned");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListPinnedResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListPinnedResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPinnedResponseData is not found in the empty JSON string", ListPinnedResponseData.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListPinnedResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPinnedResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPinnedResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPinnedResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPinnedResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPinnedResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPinnedResponseData>() {
           @Override
           public void write(JsonWriter out, ListPinnedResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPinnedResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPinnedResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPinnedResponseData
  * @throws IOException if the JSON string is invalid with respect to ListPinnedResponseData
  */
  public static ListPinnedResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPinnedResponseData.class);
  }

 /**
  * Convert an instance of ListPinnedResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

