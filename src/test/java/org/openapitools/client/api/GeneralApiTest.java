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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralApi
 */
@Ignore
public class GeneralApiTest {

    private final GeneralApi api = new GeneralApi();

    
    /**
     * Returns the open api spec document.
     *
     * Full open api spec in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpenApiSpecTest() throws ApiException {
                Object response = api.getOpenApiSpec();
        // TODO: test validations
    }
    
}
