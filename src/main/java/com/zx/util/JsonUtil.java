package com.zx.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author zhangxin
 * @date 2021/8/1 21:31
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
