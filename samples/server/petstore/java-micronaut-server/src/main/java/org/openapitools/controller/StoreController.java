/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.Order;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Controller("${context-path}")
public class StoreController {
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     */
    @ApiOperation(
        value = "Delete purchase order by ID",
        nickname = "deleteOrder",
        notes = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors",
        authorizations = {},
        tags={})
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found")})
    @Delete(uri="/store/order/{orderId}")
    @Produces(value = {})
    public Mono<Object> deleteOrder(
        @PathVariable(value="orderId") @NotNull String orderId
    ) {
        // TODO implement deleteOrder() body;
        Mono<Object> result = Mono.empty();
        return result;
    }

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * @return Map&lt;String, Integer&gt;
     */
    @ApiOperation(
        value = "Returns pet inventories by status",
        nickname = "getInventory",
        notes = "Returns a map of status codes to quantities",
        response = Integer.class,
        responseContainer = "map",
        authorizations = {
            @Authorization(value = "api_key")
        },
        tags={})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "map")})
    @Get(uri="/store/inventory")
    @Produces(value = {"application/json"})
    public Mono<Map<String, Integer>> getInventory() {
        // TODO implement getInventory() body;
        Mono<Map<String, Integer>> result = Mono.empty();
        return result;
    }

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return Order
     */
    @ApiOperation(
        value = "Find purchase order by ID",
        nickname = "getOrderById",
        notes = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions",
        response = Order.class,
        authorizations = {},
        tags={})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found")})
    @Get(uri="/store/order/{orderId}")
    @Produces(value = {"application/xml", "application/json"})
    public Mono<Order> getOrderById(
        @PathVariable(value="orderId") @NotNull @Min(1L) @Max(5L) Long orderId
    ) {
        // TODO implement getOrderById() body;
        Mono<Order> result = Mono.empty();
        return result;
    }

    /**
     * Place an order for a pet
     *
     * @param order order placed for purchasing the pet (required)
     * @return Order
     */
    @ApiOperation(
        value = "Place an order for a pet",
        nickname = "placeOrder",
        response = Order.class,
        authorizations = {},
        tags={})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid Order")})
    @Post(uri="/store/order")
    @Produces(value = {"application/xml", "application/json"})
    @Consumes(value = {"application/json"})
    public Mono<Order> placeOrder(
        @Body @NotNull @Valid Order order
    ) {
        // TODO implement placeOrder() body;
        Mono<Order> result = Mono.empty();
        return result;
    }
}
