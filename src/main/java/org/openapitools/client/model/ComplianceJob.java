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
import java.net.URI;
import org.openapitools.client.model.ComplianceJobStatus;
import org.openapitools.client.model.ComplianceJobType;
import org.threeten.bp.OffsetDateTime;

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
 * ComplianceJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComplianceJob {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ComplianceJobType type;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "upload_url";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private URI uploadUrl;

  public static final String SERIALIZED_NAME_UPLOAD_EXPIRES_AT = "upload_expires_at";
  @SerializedName(SERIALIZED_NAME_UPLOAD_EXPIRES_AT)
  private OffsetDateTime uploadExpiresAt;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private URI downloadUrl;

  public static final String SERIALIZED_NAME_DOWNLOAD_EXPIRES_AT = "download_expires_at";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_EXPIRES_AT)
  private OffsetDateTime downloadExpiresAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ComplianceJobStatus status;

  public ComplianceJob() { 
  }

  public ComplianceJob id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Compliance Job ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1372966999991541762", required = true, value = "Compliance Job ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ComplianceJob type(ComplianceJobType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ComplianceJobType getType() {
    return type;
  }


  public void setType(ComplianceJobType type) {
    this.type = type;
  }


  public ComplianceJob createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation time of the compliance job.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-01-06T18:40:40Z", required = true, value = "Creation time of the compliance job.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ComplianceJob uploadUrl(URI uploadUrl) {
    
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * URL to which the user will upload their tweet or user IDs
   * @return uploadUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL to which the user will upload their tweet or user IDs")

  public URI getUploadUrl() {
    return uploadUrl;
  }


  public void setUploadUrl(URI uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  public ComplianceJob uploadExpiresAt(OffsetDateTime uploadExpiresAt) {
    
    this.uploadExpiresAt = uploadExpiresAt;
    return this;
  }

   /**
   * Expiration time of the upload URL
   * @return uploadExpiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-01-06T18:40:40Z", required = true, value = "Expiration time of the upload URL")

  public OffsetDateTime getUploadExpiresAt() {
    return uploadExpiresAt;
  }


  public void setUploadExpiresAt(OffsetDateTime uploadExpiresAt) {
    this.uploadExpiresAt = uploadExpiresAt;
  }


  public ComplianceJob downloadUrl(URI downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * URL from which the user will retrieve their compliance results
   * @return downloadUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "URL from which the user will retrieve their compliance results")

  public URI getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(URI downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ComplianceJob downloadExpiresAt(OffsetDateTime downloadExpiresAt) {
    
    this.downloadExpiresAt = downloadExpiresAt;
    return this;
  }

   /**
   * Expiration time of the download URL
   * @return downloadExpiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-01-06T18:40:40Z", required = true, value = "Expiration time of the download URL")

  public OffsetDateTime getDownloadExpiresAt() {
    return downloadExpiresAt;
  }


  public void setDownloadExpiresAt(OffsetDateTime downloadExpiresAt) {
    this.downloadExpiresAt = downloadExpiresAt;
  }


  public ComplianceJob name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * User-provided name for a compliance job
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my-job", value = "User-provided name for a compliance job")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ComplianceJob status(ComplianceJobStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ComplianceJobStatus getStatus() {
    return status;
  }


  public void setStatus(ComplianceJobStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplianceJob complianceJob = (ComplianceJob) o;
    return Objects.equals(this.id, complianceJob.id) &&
        Objects.equals(this.type, complianceJob.type) &&
        Objects.equals(this.createdAt, complianceJob.createdAt) &&
        Objects.equals(this.uploadUrl, complianceJob.uploadUrl) &&
        Objects.equals(this.uploadExpiresAt, complianceJob.uploadExpiresAt) &&
        Objects.equals(this.downloadUrl, complianceJob.downloadUrl) &&
        Objects.equals(this.downloadExpiresAt, complianceJob.downloadExpiresAt) &&
        Objects.equals(this.name, complianceJob.name) &&
        Objects.equals(this.status, complianceJob.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdAt, uploadUrl, uploadExpiresAt, downloadUrl, downloadExpiresAt, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplianceJob {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    uploadExpiresAt: ").append(toIndentedString(uploadExpiresAt)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadExpiresAt: ").append(toIndentedString(downloadExpiresAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("created_at");
    openapiFields.add("upload_url");
    openapiFields.add("upload_expires_at");
    openapiFields.add("download_url");
    openapiFields.add("download_expires_at");
    openapiFields.add("name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("upload_url");
    openapiRequiredFields.add("upload_expires_at");
    openapiRequiredFields.add("download_url");
    openapiRequiredFields.add("download_expires_at");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ComplianceJob
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ComplianceJob.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplianceJob is not found in the empty JSON string", ComplianceJob.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ComplianceJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComplianceJob` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ComplianceJob.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplianceJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplianceJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplianceJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplianceJob.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplianceJob>() {
           @Override
           public void write(JsonWriter out, ComplianceJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplianceJob read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComplianceJob given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComplianceJob
  * @throws IOException if the JSON string is invalid with respect to ComplianceJob
  */
  public static ComplianceJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplianceJob.class);
  }

 /**
  * Convert an instance of ComplianceJob to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

