package com.zc.helloworld;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 周超
 * @since 2020/11/22 16:45
 */
public class Demo {
    public static void main(String[] args) {
        Map<String,String> a = new HashMap<>();
        a.put("1", "hello");
        a.put("1", "world");
    }
}
