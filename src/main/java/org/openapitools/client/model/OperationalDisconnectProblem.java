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
import org.openapitools.client.model.OperationalDisconnectProblemAllOf;
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
 * You have been disconnected for operational reasons.
 */
@ApiModel(description = "You have been disconnected for operational reasons.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OperationalDisconnectProblem extends Problem {
  /**
   * Gets or Sets disconnectType
   */
  @JsonAdapter(DisconnectTypeEnum.Adapter.class)
  public enum DisconnectTypeEnum {
    OPERATIONALDISCONNECT("OperationalDisconnect"),
    
    UPSTREAMOPERATIONALDISCONNECT("UpstreamOperationalDisconnect"),
    
    FORCEDISCONNECT("ForceDisconnect"),
    
    UPSTREAMUNCLEANDISCONNECT("UpstreamUncleanDisconnect"),
    
    SLOWREADER("SlowReader"),
    
    INTERNALERROR("InternalError"),
    
    CLIENTAPPLICATIONSTATEDEGRADED("ClientApplicationStateDegraded"),
    
    INVALIDRULES("InvalidRules");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisconnectTypeEnum fromValue(String value) {
      for (DisconnectTypeEnum b : DisconnectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DisconnectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisconnectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisconnectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisconnectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISCONNECT_TYPE = "disconnect_type";
  @SerializedName(SERIALIZED_NAME_DISCONNECT_TYPE)
  private DisconnectTypeEnum disconnectType;

  public OperationalDisconnectProblem() { 
    this.type = this.getClass().getSimpleName();
  }

  public OperationalDisconnectProblem disconnectType(DisconnectTypeEnum disconnectType) {
    
    this.disconnectType = disconnectType;
    return this;
  }

   /**
   * Get disconnectType
   * @return disconnectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }


  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationalDisconnectProblem operationalDisconnectProblem = (OperationalDisconnectProblem) o;
    return Objects.equals(this.disconnectType, operationalDisconnectProblem.disconnectType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disconnectType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationalDisconnectProblem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
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
    openapiFields.add("disconnect_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OperationalDisconnectProblem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OperationalDisconnectProblem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationalDisconnectProblem is not found in the empty JSON string", OperationalDisconnectProblem.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OperationalDisconnectProblem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OperationalDisconnectProblem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OperationalDisconnectProblem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationalDisconnectProblem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationalDisconnectProblem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationalDisconnectProblem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationalDisconnectProblem.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationalDisconnectProblem>() {
           @Override
           public void write(JsonWriter out, OperationalDisconnectProblem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OperationalDisconnectProblem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OperationalDisconnectProblem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperationalDisconnectProblem
  * @throws IOException if the JSON string is invalid with respect to OperationalDisconnectProblem
  */
  public static OperationalDisconnectProblem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationalDisconnectProblem.class);
  }

 /**
  * Convert an instance of OperationalDisconnectProblem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

