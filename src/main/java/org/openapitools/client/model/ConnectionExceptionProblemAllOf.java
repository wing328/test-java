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
 * ConnectionExceptionProblemAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionExceptionProblemAllOf {
  /**
   * Gets or Sets connectionIssue
   */
  @JsonAdapter(ConnectionIssueEnum.Adapter.class)
  public enum ConnectionIssueEnum {
    TOOMANYCONNECTIONS("TooManyConnections"),
    
    PROVISIONINGSUBSCRIPTION("ProvisioningSubscription"),
    
    RULECONFIGURATIONISSUE("RuleConfigurationIssue"),
    
    RULESINVALIDISSUE("RulesInvalidIssue");

    private String value;

    ConnectionIssueEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConnectionIssueEnum fromValue(String value) {
      for (ConnectionIssueEnum b : ConnectionIssueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConnectionIssueEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectionIssueEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConnectionIssueEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConnectionIssueEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONNECTION_ISSUE = "connection_issue";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ISSUE)
  private ConnectionIssueEnum connectionIssue;

  public ConnectionExceptionProblemAllOf() { 
  }

  public ConnectionExceptionProblemAllOf connectionIssue(ConnectionIssueEnum connectionIssue) {
    
    this.connectionIssue = connectionIssue;
    return this;
  }

   /**
   * Get connectionIssue
   * @return connectionIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionIssueEnum getConnectionIssue() {
    return connectionIssue;
  }


  public void setConnectionIssue(ConnectionIssueEnum connectionIssue) {
    this.connectionIssue = connectionIssue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionExceptionProblemAllOf connectionExceptionProblemAllOf = (ConnectionExceptionProblemAllOf) o;
    return Objects.equals(this.connectionIssue, connectionExceptionProblemAllOf.connectionIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionIssue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionExceptionProblemAllOf {\n");
    sb.append("    connectionIssue: ").append(toIndentedString(connectionIssue)).append("\n");
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
    openapiFields.add("connection_issue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionExceptionProblemAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConnectionExceptionProblemAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionExceptionProblemAllOf is not found in the empty JSON string", ConnectionExceptionProblemAllOf.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConnectionExceptionProblemAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectionExceptionProblemAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionExceptionProblemAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionExceptionProblemAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionExceptionProblemAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionExceptionProblemAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionExceptionProblemAllOf>() {
           @Override
           public void write(JsonWriter out, ConnectionExceptionProblemAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectionExceptionProblemAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectionExceptionProblemAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionExceptionProblemAllOf
  * @throws IOException if the JSON string is invalid with respect to ConnectionExceptionProblemAllOf
  */
  public static ConnectionExceptionProblemAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionExceptionProblemAllOf.class);
  }

 /**
  * Convert an instance of ConnectionExceptionProblemAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

