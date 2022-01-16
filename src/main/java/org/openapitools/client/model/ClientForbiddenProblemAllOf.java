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
import java.net.URI;

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
 * ClientForbiddenProblemAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClientForbiddenProblemAllOf {
  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    OFFICIAL_CLIENT_FORBIDDEN("official-client-forbidden"),
    
    CLIENT_NOT_ENROLLED("client-not-enrolled");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_REGISTRATION_URL = "registration_url";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_URL)
  private URI registrationUrl;

  public ClientForbiddenProblemAllOf() { 
  }

  public ClientForbiddenProblemAllOf reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public ClientForbiddenProblemAllOf registrationUrl(URI registrationUrl) {
    
    this.registrationUrl = registrationUrl;
    return this;
  }

   /**
   * Get registrationUrl
   * @return registrationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getRegistrationUrl() {
    return registrationUrl;
  }


  public void setRegistrationUrl(URI registrationUrl) {
    this.registrationUrl = registrationUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientForbiddenProblemAllOf clientForbiddenProblemAllOf = (ClientForbiddenProblemAllOf) o;
    return Objects.equals(this.reason, clientForbiddenProblemAllOf.reason) &&
        Objects.equals(this.registrationUrl, clientForbiddenProblemAllOf.registrationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, registrationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientForbiddenProblemAllOf {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    registrationUrl: ").append(toIndentedString(registrationUrl)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("registration_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientForbiddenProblemAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ClientForbiddenProblemAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientForbiddenProblemAllOf is not found in the empty JSON string", ClientForbiddenProblemAllOf.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ClientForbiddenProblemAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientForbiddenProblemAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientForbiddenProblemAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientForbiddenProblemAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientForbiddenProblemAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientForbiddenProblemAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientForbiddenProblemAllOf>() {
           @Override
           public void write(JsonWriter out, ClientForbiddenProblemAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientForbiddenProblemAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientForbiddenProblemAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientForbiddenProblemAllOf
  * @throws IOException if the JSON string is invalid with respect to ClientForbiddenProblemAllOf
  */
  public static ClientForbiddenProblemAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientForbiddenProblemAllOf.class);
  }

 /**
  * Convert an instance of ClientForbiddenProblemAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

