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
import org.openapitools.client.model.ClientDisconnectedProblem;
import org.openapitools.client.model.ClientForbiddenProblem;
import org.openapitools.client.model.ConflictProblem;
import org.openapitools.client.model.ConnectionExceptionProblem;
import org.openapitools.client.model.DisallowedResourceProblem;
import org.openapitools.client.model.DuplicateRuleProblem;
import org.openapitools.client.model.FieldUnauthorizedProblem;
import org.openapitools.client.model.GenericProblem;
import org.openapitools.client.model.InvalidRequestProblem;
import org.openapitools.client.model.InvalidRuleProblem;
import org.openapitools.client.model.NonCompliantRulesProblem;
import org.openapitools.client.model.OperationalDisconnectProblem;
import org.openapitools.client.model.Problem;
import org.openapitools.client.model.ResourceNotFoundProblem;
import org.openapitools.client.model.ResourceUnauthorizedProblem;
import org.openapitools.client.model.ResourceUnavailableProblem;
import org.openapitools.client.model.RulesCapProblem;
import org.openapitools.client.model.UnsupportedAuthenticationProblem;
import org.openapitools.client.model.UsageCapExceededProblem;

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
 * A problem that indicates the user&#39;s rule set is not compliant.
 */
@ApiModel(description = "A problem that indicates the user's rule set is not compliant.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NonCompliantRulesProblem extends Problem {
  public NonCompliantRulesProblem() { 
    this.type = this.getClass().getSimpleName();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonCompliantRulesProblem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NonCompliantRulesProblem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NonCompliantRulesProblem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NonCompliantRulesProblem is not found in the empty JSON string", NonCompliantRulesProblem.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NonCompliantRulesProblem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NonCompliantRulesProblem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NonCompliantRulesProblem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NonCompliantRulesProblem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NonCompliantRulesProblem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NonCompliantRulesProblem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NonCompliantRulesProblem.class));

       return (TypeAdapter<T>) new TypeAdapter<NonCompliantRulesProblem>() {
           @Override
           public void write(JsonWriter out, NonCompliantRulesProblem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NonCompliantRulesProblem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NonCompliantRulesProblem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NonCompliantRulesProblem
  * @throws IOException if the JSON string is invalid with respect to NonCompliantRulesProblem
  */
  public static NonCompliantRulesProblem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NonCompliantRulesProblem.class);
  }

 /**
  * Convert an instance of NonCompliantRulesProblem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

