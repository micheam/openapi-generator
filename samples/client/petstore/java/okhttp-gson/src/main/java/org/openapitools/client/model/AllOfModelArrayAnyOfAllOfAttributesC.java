/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.Order;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.Tag;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class AllOfModelArrayAnyOfAllOfAttributesC extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AllOfModelArrayAnyOfAllOfAttributesC.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AllOfModelArrayAnyOfAllOfAttributesC.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AllOfModelArrayAnyOfAllOfAttributesC' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Pet> adapterPet = gson.getDelegateAdapter(this, TypeToken.get(Pet.class));
            final TypeAdapter<Order> adapterOrder = gson.getDelegateAdapter(this, TypeToken.get(Order.class));

            return (TypeAdapter<T>) new TypeAdapter<AllOfModelArrayAnyOfAllOfAttributesC>() {
                @Override
                public void write(JsonWriter out, AllOfModelArrayAnyOfAllOfAttributesC value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Pet`
                    if (value.getActualInstance() instanceof Pet) {
                        JsonElement element = adapterPet.toJsonTree((Pet)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Order`
                    if (value.getActualInstance() instanceof Order) {
                        JsonElement element = adapterOrder.toJsonTree((Order)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Order, Pet");
                }

                @Override
                public AllOfModelArrayAnyOfAllOfAttributesC read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Pet
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Pet.validateJsonElement(jsonElement);
                        actualAdapter = adapterPet;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Pet'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Pet failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Pet'", e);
                    }
                    // deserialize Order
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Order.validateJsonElement(jsonElement);
                        actualAdapter = adapterOrder;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Order'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Order failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Order'", e);
                    }

                    if (match == 1) {
                        AllOfModelArrayAnyOfAllOfAttributesC ret = new AllOfModelArrayAnyOfAllOfAttributesC();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AllOfModelArrayAnyOfAllOfAttributesC: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AllOfModelArrayAnyOfAllOfAttributesC() {
        super("oneOf", Boolean.FALSE);
    }

    public AllOfModelArrayAnyOfAllOfAttributesC(Order o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AllOfModelArrayAnyOfAllOfAttributesC(Pet o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Pet", Pet.class);
        schemas.put("Order", Order.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AllOfModelArrayAnyOfAllOfAttributesC.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Order, Pet
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Pet) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Order) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Order, Pet");
    }

    /**
     * Get the actual instance, which can be the following:
     * Order, Pet
     *
     * @return The actual instance (Order, Pet)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Pet`. If the actual instance is not `Pet`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Pet`
     * @throws ClassCastException if the instance is not `Pet`
     */
    public Pet getPet() throws ClassCastException {
        return (Pet)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Order`. If the actual instance is not `Order`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Order`
     * @throws ClassCastException if the instance is not `Order`
     */
    public Order getOrder() throws ClassCastException {
        return (Order)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AllOfModelArrayAnyOfAllOfAttributesC
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Pet
        try {
            Pet.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Pet failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Order
        try {
            Order.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Order failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for AllOfModelArrayAnyOfAllOfAttributesC with oneOf schemas: Order, Pet. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of AllOfModelArrayAnyOfAllOfAttributesC given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AllOfModelArrayAnyOfAllOfAttributesC
     * @throws IOException if the JSON string is invalid with respect to AllOfModelArrayAnyOfAllOfAttributesC
     */
    public static AllOfModelArrayAnyOfAllOfAttributesC fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AllOfModelArrayAnyOfAllOfAttributesC.class);
    }

    /**
     * Convert an instance of AllOfModelArrayAnyOfAllOfAttributesC to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
