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
import org.openapitools.client.model.AddRulesResponse;
import org.openapitools.client.model.DeleteRulesResponse;
import org.openapitools.client.model.Rule;
import org.openapitools.client.model.RulesResponseMetadata;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddOrDeleteRulesResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AddOrDeleteRulesResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AddOrDeleteRulesResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AddOrDeleteRulesResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddRulesResponse> adapterAddRulesResponse = gson.getDelegateAdapter(this, TypeToken.get(AddRulesResponse.class));
            final TypeAdapter<DeleteRulesResponse> adapterDeleteRulesResponse = gson.getDelegateAdapter(this, TypeToken.get(DeleteRulesResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<AddOrDeleteRulesResponse>() {
                @Override
                public void write(JsonWriter out, AddOrDeleteRulesResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AddRulesResponse`
                    if (value.getActualInstance() instanceof AddRulesResponse) {
                        JsonObject obj = adapterAddRulesResponse.toJsonTree((AddRulesResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `DeleteRulesResponse`
                    if (value.getActualInstance() instanceof DeleteRulesResponse) {
                        JsonObject obj = adapterDeleteRulesResponse.toJsonTree((DeleteRulesResponse)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AddRulesResponse, DeleteRulesResponse");
                }

                @Override
                public AddOrDeleteRulesResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AddRulesResponse
                    try {
                        // validate the JSON object to see if any excpetion is thrown
                        AddRulesResponse.validateJsonObject(jsonObject);
                        actualAdapter = adapterAddRulesResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AddRulesResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'AddRulesResponse'", e);
                    }

                    // deserialize DeleteRulesResponse
                    try {
                        // validate the JSON object to see if any excpetion is thrown
                        DeleteRulesResponse.validateJsonObject(jsonObject);
                        actualAdapter = adapterDeleteRulesResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DeleteRulesResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'DeleteRulesResponse'", e);
                    }

                    if (match == 1) {
                        AddOrDeleteRulesResponse ret = new AddOrDeleteRulesResponse();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AddOrDeleteRulesResponse: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AddOrDeleteRulesResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public AddOrDeleteRulesResponse(AddRulesResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AddOrDeleteRulesResponse(DeleteRulesResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddRulesResponse", new GenericType<AddRulesResponse>() {
        });
        schemas.put("DeleteRulesResponse", new GenericType<DeleteRulesResponse>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AddOrDeleteRulesResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddRulesResponse, DeleteRulesResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AddRulesResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DeleteRulesResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddRulesResponse, DeleteRulesResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddRulesResponse, DeleteRulesResponse
     *
     * @return The actual instance (AddRulesResponse, DeleteRulesResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddRulesResponse`. If the actual instance is not `AddRulesResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddRulesResponse`
     * @throws ClassCastException if the instance is not `AddRulesResponse`
     */
    public AddRulesResponse getAddRulesResponse() throws ClassCastException {
        return (AddRulesResponse)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeleteRulesResponse`. If the actual instance is not `DeleteRulesResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeleteRulesResponse`
     * @throws ClassCastException if the instance is not `DeleteRulesResponse`
     */
    public DeleteRulesResponse getDeleteRulesResponse() throws ClassCastException {
        return (DeleteRulesResponse)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddOrDeleteRulesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with AddRulesResponse
    try {
      AddRulesResponse.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with DeleteRulesResponse
    try {
      DeleteRulesResponse.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AddOrDeleteRulesResponse with oneOf schemas: AddRulesResponse, DeleteRulesResponse. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of AddOrDeleteRulesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddOrDeleteRulesResponse
  * @throws IOException if the JSON string is invalid with respect to AddOrDeleteRulesResponse
  */
  public static AddOrDeleteRulesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddOrDeleteRulesResponse.class);
  }
}

