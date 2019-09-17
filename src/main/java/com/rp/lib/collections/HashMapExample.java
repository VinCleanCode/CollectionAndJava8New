package com.rp.lib.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapExample{
    public static void main(String[] args) {
        Map map = new HashMap<String, Integer>();
        map.put("matt", 70);
        map.put("john", 80);
        map.put("gary", 90);

        // 使用Java 8 forEach()
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k + ":" + v);
            }
        });

        // 使用Java 8 forEach() 搭配 Lambda語法
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
