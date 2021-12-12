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
import org.openapitools.client.model.AddRulesRequest;
import org.openapitools.client.model.DeleteRulesRequest;
import org.openapitools.client.model.DeleteRulesRequestDelete;
import org.openapitools.client.model.RuleNoId;

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
public class AddOrDeleteRulesRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AddOrDeleteRulesRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AddOrDeleteRulesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AddOrDeleteRulesRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddRulesRequest> adapterAddRulesRequest = gson.getDelegateAdapter(this, TypeToken.get(AddRulesRequest.class));
            final TypeAdapter<DeleteRulesRequest> adapterDeleteRulesRequest = gson.getDelegateAdapter(this, TypeToken.get(DeleteRulesRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<AddOrDeleteRulesRequest>() {
                @Override
                public void write(JsonWriter out, AddOrDeleteRulesRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AddRulesRequest`
                    if (value.getActualInstance() instanceof AddRulesRequest) {
                        JsonObject obj = adapterAddRulesRequest.toJsonTree((AddRulesRequest)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `DeleteRulesRequest`
                    if (value.getActualInstance() instanceof DeleteRulesRequest) {
                        JsonObject obj = adapterDeleteRulesRequest.toJsonTree((DeleteRulesRequest)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AddRulesRequest, DeleteRulesRequest");
                }

                @Override
                public AddOrDeleteRulesRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AddRulesRequest
                    try {
                        // validate the JSON object to see if any excpetion is thrown
                        AddRulesRequest.validateJsonObject(jsonObject);
                        actualAdapter = adapterAddRulesRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AddRulesRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'AddRulesRequest'", e);
                    }

                    // deserialize DeleteRulesRequest
                    try {
                        // validate the JSON object to see if any excpetion is thrown
                        DeleteRulesRequest.validateJsonObject(jsonObject);
                        actualAdapter = adapterDeleteRulesRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'DeleteRulesRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'DeleteRulesRequest'", e);
                    }

                    if (match == 1) {
                        AddOrDeleteRulesRequest ret = new AddOrDeleteRulesRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AddOrDeleteRulesRequest: %d classes match result, expected 1. JSON: %s", match, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AddOrDeleteRulesRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public AddOrDeleteRulesRequest(AddRulesRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AddOrDeleteRulesRequest(DeleteRulesRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddRulesRequest", new GenericType<AddRulesRequest>() {
        });
        schemas.put("DeleteRulesRequest", new GenericType<DeleteRulesRequest>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AddOrDeleteRulesRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddRulesRequest, DeleteRulesRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AddRulesRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DeleteRulesRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddRulesRequest, DeleteRulesRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddRulesRequest, DeleteRulesRequest
     *
     * @return The actual instance (AddRulesRequest, DeleteRulesRequest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddRulesRequest`. If the actual instance is not `AddRulesRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddRulesRequest`
     * @throws ClassCastException if the instance is not `AddRulesRequest`
     */
    public AddRulesRequest getAddRulesRequest() throws ClassCastException {
        return (AddRulesRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `DeleteRulesRequest`. If the actual instance is not `DeleteRulesRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DeleteRulesRequest`
     * @throws ClassCastException if the instance is not `DeleteRulesRequest`
     */
    public DeleteRulesRequest getDeleteRulesRequest() throws ClassCastException {
        return (DeleteRulesRequest)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddOrDeleteRulesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    // validate the json string with AddRulesRequest
    try {
      AddRulesRequest.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with DeleteRulesRequest
    try {
      DeleteRulesRequest.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AddOrDeleteRulesRequest with oneOf schemas: AddRulesRequest, DeleteRulesRequest. %d class(es) match the result, expected 1. JSON: %s", validCount, jsonObj.toString()));
    }
  }
}

