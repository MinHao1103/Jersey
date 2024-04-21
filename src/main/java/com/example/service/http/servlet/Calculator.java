package com.example.service.http.servlet;

import com.example.service.http.utils.httpResult.CommonHttpResult;
import com.example.service.http.utils.log.Log;

import javax.ws.rs.*;

@Path("/v1")
public class Calculator {

    private static final String TAG = "Calculator";

    @GET
    @Path("/AMultiplyB")
    @Produces({"application/json"})
    @Consumes({"application/json"})
    public CommonHttpResult<Integer> aMultiplyB(@QueryParam("a") int a, @QueryParam("b") int b) {
        int result = a * b;
        Log.d(TAG, String.format("a: %s, b: %s, result: %s * %s = %s", a, b, a, b, result));
        return new CommonHttpResult(0, result);
    }

    @GET
    @Path("/ADivideB")
    @Produces({"application/json"})
    @Consumes({"application/json"})
    public CommonHttpResult<Float> aDivideB(@QueryParam("a") float a, @QueryParam("b") float b) {
        if (b == 0) {
            return new CommonHttpResult(1, "Cannot divide by zero");
        }
        float result = a / b;
        Log.d(TAG, String.format("a: %s, b: %s, result: %s / %s = %s", a, b, a, b, result));
        return new CommonHttpResult(0, result);
    }

}
