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
import org.openapitools.client.model.Expansions;
import org.openapitools.client.model.ListLookupMultipleUsersLookupResponseMeta;
import org.openapitools.client.model.Problem;
import org.openapitools.client.model.User;

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
 * ListLookupMultipleUsersLookupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListLookupMultipleUsersLookupResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<User> data = null;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private Expansions includes;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ListLookupMultipleUsersLookupResponseMeta meta;

  public ListLookupMultipleUsersLookupResponse() { 
  }

  public ListLookupMultipleUsersLookupResponse data(List<User> data) {
    
    this.data = data;
    return this;
  }

  public ListLookupMultipleUsersLookupResponse addDataItem(User dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<User>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<User> getData() {
    return data;
  }


  public void setData(List<User> data) {
    this.data = data;
  }


  public ListLookupMultipleUsersLookupResponse includes(Expansions includes) {
    
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


  public ListLookupMultipleUsersLookupResponse errors(List<Problem> errors) {
    
    this.errors = errors;
    return this;
  }

  public ListLookupMultipleUsersLookupResponse addErrorsItem(Problem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Problem>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Problem> getErrors() {
    return errors;
  }


  public void setErrors(List<Problem> errors) {
    this.errors = errors;
  }


  public ListLookupMultipleUsersLookupResponse meta(ListLookupMultipleUsersLookupResponseMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListLookupMultipleUsersLookupResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(ListLookupMultipleUsersLookupResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLookupMultipleUsersLookupResponse listLookupMultipleUsersLookupResponse = (ListLookupMultipleUsersLookupResponse) o;
    return Objects.equals(this.data, listLookupMultipleUsersLookupResponse.data) &&
        Objects.equals(this.includes, listLookupMultipleUsersLookupResponse.includes) &&
        Objects.equals(this.errors, listLookupMultipleUsersLookupResponse.errors) &&
        Objects.equals(this.meta, listLookupMultipleUsersLookupResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, includes, errors, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLookupMultipleUsersLookupResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("includes");
    openapiFields.add("errors");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListLookupMultipleUsersLookupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListLookupMultipleUsersLookupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListLookupMultipleUsersLookupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListLookupMultipleUsersLookupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListLookupMultipleUsersLookupResponse>() {
           @Override
           public void write(JsonWriter out, ListLookupMultipleUsersLookupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListLookupMultipleUsersLookupResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject().deepCopy();
             Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry : entries) {
               if (!ListLookupMultipleUsersLookupResponse.openapiFields.contains(entry.getKey())) {
                 throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListLookupMultipleUsersLookupResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
               }
             }

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }
}

