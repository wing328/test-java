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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets Granularity
 */
@JsonAdapter(Granularity.Adapter.class)
public enum Granularity {
  
  MINUTE("minute"),
  
  HOUR("hour"),
  
  DAY("day");

  private String value;

  Granularity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Granularity fromValue(String value) {
    for (Granularity b : Granularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Granularity> {
    @Override
    public void write(final JsonWriter jsonWriter, final Granularity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Granularity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Granularity.fromValue(value);
    }
  }
}

