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
 * ListCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListCreateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRIVATE = "private";
  @SerializedName(SERIALIZED_NAME_PRIVATE)
  private Boolean _private;

  public ListCreateRequest() { 
  }

  public ListCreateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ListCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ListCreateRequest _private(Boolean _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrivate() {
    return _private;
  }


  public void setPrivate(Boolean _private) {
    this._private = _private;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCreateRequest listCreateRequest = (ListCreateRequest) o;
    return Objects.equals(this.name, listCreateRequest.name) &&
        Objects.equals(this.description, listCreateRequest.description) &&
        Objects.equals(this._private, listCreateRequest._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("private");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCreateRequest>() {
           @Override
           public void write(JsonWriter out, ListCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject().deepCopy();
             Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry : entries) {
               if (!ListCreateRequest.openapiFields.contains(entry.getKey())) {
                 throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : ListCreateRequest.openapiRequiredFields) {
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

