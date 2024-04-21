package com.example.service.http.servlet;

import com.example.service.http.utils.httpResult.CommonHttpResult;
import com.example.service.http.utils.log.Log;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1")
public class Calculator {

    private static final String TAG = "Calculator";

    @GET
    @Path("/APlusB")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CommonHttpResult<Integer> aPlusB(@QueryParam("a") int a, @QueryParam("b") int b) {
        Log.d(TAG, String.format("Parameter a: %s, Parameter b: %s", a, b));
        int result = a + b;
        return new CommonHttpResult<Integer>(0, result);
    }

    @GET
    @Path("/AMinusB")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CommonHttpResult<Integer> aMinusB(@QueryParam("a") int a, @QueryParam("b") int b) {
        Log.d(TAG, String.format("Parameter a: %s, Parameter b: %s", a, b));
        int result = a - b;
        return new CommonHttpResult<Integer>(0, result);
    }
}
