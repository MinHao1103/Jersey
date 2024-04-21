//package com.example.service.http.utils.log;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Log {
//
//    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    private static String getNow() {
//        return dateFormat.format(new Date());
//    }
//
//    public static void d(String tag, String message) {
//        System.out.println("[" + getNow() + "] [" + tag + "] " + message);
//    }
//
//    public static void e(String tag, String message) {
//        System.err.println("[" + getNow() + "] [" + tag + "] " + message);
//    }
//
//}