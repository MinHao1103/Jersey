//package com.example.service.http.servlet.calculator.impl;
//
//import com.example.service.http.servlet.calculator.CalculatorPlugin;
//import com.example.service.http.utils.httpResult.CommonHttpResult;
//import com.example.service.http.utils.log.Log;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//
//public class DivisionPlugin implements CalculatorPlugin {
//
//    private static final String TAG = "DivisionPlugin";
//
//    @Override
//    public int calculate(int a, int b) {
//        if (b == 0) {
//            throw new ArithmeticException("Division by zero.");
//        }
//        return a / b;
//    }
//
//    @GET
//    @Path("/DivisionPlugin")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public CommonHttpResult<Integer> divisionPlugin(@QueryParam("a") int a, @QueryParam("b") int b) {
//        int result = calculate(a, b);
//        Log.d(TAG, String.format("a: %s, b: %s, result: %s / %s = %s", a, b, a, b, result));
//        return new CommonHttpResult<Integer>(0, result);
//    }
//
//}