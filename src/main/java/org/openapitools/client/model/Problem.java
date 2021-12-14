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
 * An HTTP Problem Details object, as defined in IETF RFC 7807 (https://tools.ietf.org/html/rfc7807).
 */
@ApiModel(description = "An HTTP Problem Details object, as defined in IETF RFC 7807 (https://tools.ietf.org/html/rfc7807).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Problem {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public Problem() { 
    this.type = this.getClass().getSimpleName();
  }

  public Problem type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Problem title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Problem detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.detail, problem.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
    openapiRequiredFields.add("detail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Problem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Problem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Problem is not found in the empty JSON string", Problem.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "ClientDisconnectedProblem":
          ClientDisconnectedProblem.validateJsonObject(jsonObj);
          break;
        case "ClientForbiddenProblem":
          ClientForbiddenProblem.validateJsonObject(jsonObj);
          break;
        case "ConflictProblem":
          ConflictProblem.validateJsonObject(jsonObj);
          break;
        case "ConnectionExceptionProblem":
          ConnectionExceptionProblem.validateJsonObject(jsonObj);
          break;
        case "DisallowedResourceProblem":
          DisallowedResourceProblem.validateJsonObject(jsonObj);
          break;
        case "DuplicateRuleProblem":
          DuplicateRuleProblem.validateJsonObject(jsonObj);
          break;
        case "FieldUnauthorizedProblem":
          FieldUnauthorizedProblem.validateJsonObject(jsonObj);
          break;
        case "GenericProblem":
          GenericProblem.validateJsonObject(jsonObj);
          break;
        case "InvalidRequestProblem":
          InvalidRequestProblem.validateJsonObject(jsonObj);
          break;
        case "InvalidRuleProblem":
          InvalidRuleProblem.validateJsonObject(jsonObj);
          break;
        case "NonCompliantRulesProblem":
          NonCompliantRulesProblem.validateJsonObject(jsonObj);
          break;
        case "OperationalDisconnectProblem":
          OperationalDisconnectProblem.validateJsonObject(jsonObj);
          break;
        case "ResourceNotFoundProblem":
          ResourceNotFoundProblem.validateJsonObject(jsonObj);
          break;
        case "ResourceUnauthorizedProblem":
          ResourceUnauthorizedProblem.validateJsonObject(jsonObj);
          break;
        case "ResourceUnavailableProblem":
          ResourceUnavailableProblem.validateJsonObject(jsonObj);
          break;
        case "RulesCapProblem":
          RulesCapProblem.validateJsonObject(jsonObj);
          break;
        case "UnsupportedAuthenticationProblem":
          UnsupportedAuthenticationProblem.validateJsonObject(jsonObj);
          break;
        case "UsageCapExceededProblem":
          UsageCapExceededProblem.validateJsonObject(jsonObj);
          break;
        case "about:blank":
          GenericProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/client-disconnected":
          ClientDisconnectedProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/client-forbidden":
          ClientForbiddenProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/conflict":
          ConflictProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/disallowed-resource":
          DisallowedResourceProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/duplicate-rules":
          DuplicateRuleProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/invalid-request":
          InvalidRequestProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/invalid-rules":
          InvalidRuleProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/noncompliant-rules":
          NonCompliantRulesProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/not-authorized-for-field":
          FieldUnauthorizedProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/not-authorized-for-resource":
          ResourceUnauthorizedProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/operational-disconnect":
          OperationalDisconnectProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/resource-not-found":
          ResourceNotFoundProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/resource-unavailable":
          ResourceUnavailableProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/rule-cap":
          RulesCapProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/streaming-connection":
          ConnectionExceptionProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/unsupported-authentication":
          UnsupportedAuthenticationProblem.validateJsonObject(jsonObj);
          break;
        case "https://api.twitter.com/2/problems/usage-capped":
          UsageCapExceededProblem.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of Problem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Problem
  * @throws IOException if the JSON string is invalid with respect to Problem
  */
  public static Problem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Problem.class);
  }

 /**
  * Convert an instance of Problem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

