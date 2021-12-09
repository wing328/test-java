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
 * UsersBlockingMutationResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsersBlockingMutationResponseData {
  public static final String SERIALIZED_NAME_BLOCKING = "blocking";
  @SerializedName(SERIALIZED_NAME_BLOCKING)
  private Boolean blocking;

  public UsersBlockingMutationResponseData() { 
  }

  public UsersBlockingMutationResponseData blocking(Boolean blocking) {
    
    this.blocking = blocking;
    return this;
  }

   /**
   * Get blocking
   * @return blocking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBlocking() {
    return blocking;
  }


  public void setBlocking(Boolean blocking) {
    this.blocking = blocking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersBlockingMutationResponseData usersBlockingMutationResponseData = (UsersBlockingMutationResponseData) o;
    return Objects.equals(this.blocking, usersBlockingMutationResponseData.blocking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blocking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersBlockingMutationResponseData {\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
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
    openapiFields.add("blocking");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersBlockingMutationResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UsersBlockingMutationResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) `%s` is not found in the empty JSON string", UsersBlockingMutationResponseData.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UsersBlockingMutationResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UsersBlockingMutationResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersBlockingMutationResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersBlockingMutationResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersBlockingMutationResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersBlockingMutationResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersBlockingMutationResponseData>() {
           @Override
           public void write(JsonWriter out, UsersBlockingMutationResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UsersBlockingMutationResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject().deepCopy();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

