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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
 * Indicates withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country).
 */
@ApiModel(description = "Indicates withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetWithheld {
  public static final String SERIALIZED_NAME_COPYRIGHT = "copyright";
  @SerializedName(SERIALIZED_NAME_COPYRIGHT)
  private Boolean copyright;

  public static final String SERIALIZED_NAME_COUNTRY_CODES = "country_codes";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODES)
  private Set<String> countryCodes = new LinkedHashSet<String>();

  /**
   * Indicates whether the content being withheld is the &#x60;tweet&#x60; or a &#x60;user&#x60;.
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    TWEET("tweet"),
    
    USER("user");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  public TweetWithheld() { 
  }

  public TweetWithheld copyright(Boolean copyright) {
    
    this.copyright = copyright;
    return this;
  }

   /**
   * Indicates if the content is being withheld for on the basis of copyright infringement.
   * @return copyright
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates if the content is being withheld for on the basis of copyright infringement.")

  public Boolean getCopyright() {
    return copyright;
  }


  public void setCopyright(Boolean copyright) {
    this.copyright = copyright;
  }


  public TweetWithheld countryCodes(Set<String> countryCodes) {
    
    this.countryCodes = countryCodes;
    return this;
  }

  public TweetWithheld addCountryCodesItem(String countryCodesItem) {
    this.countryCodes.add(countryCodesItem);
    return this;
  }

   /**
   * Provides a list of countries where this content is not available.
   * @return countryCodes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Provides a list of countries where this content is not available.")

  public Set<String> getCountryCodes() {
    return countryCodes;
  }


  public void setCountryCodes(Set<String> countryCodes) {
    this.countryCodes = countryCodes;
  }


  public TweetWithheld scope(ScopeEnum scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Indicates whether the content being withheld is the &#x60;tweet&#x60; or a &#x60;user&#x60;.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the content being withheld is the `tweet` or a `user`.")

  public ScopeEnum getScope() {
    return scope;
  }


  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetWithheld tweetWithheld = (TweetWithheld) o;
    return Objects.equals(this.copyright, tweetWithheld.copyright) &&
        Objects.equals(this.countryCodes, tweetWithheld.countryCodes) &&
        Objects.equals(this.scope, tweetWithheld.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyright, countryCodes, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetWithheld {\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("copyright");
    openapiFields.add("country_codes");
    openapiFields.add("scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("copyright");
    openapiRequiredFields.add("country_codes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetWithheld
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TweetWithheld.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetWithheld is not found in the empty JSON string", TweetWithheld.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetWithheld.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetWithheld` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TweetWithheld.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetWithheld.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetWithheld' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetWithheld> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetWithheld.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetWithheld>() {
           @Override
           public void write(JsonWriter out, TweetWithheld value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetWithheld read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetWithheld given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetWithheld
  * @throws IOException if the JSON string is invalid with respect to TweetWithheld
  */
  public static TweetWithheld fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetWithheld.class);
  }

 /**
  * Convert an instance of TweetWithheld to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

