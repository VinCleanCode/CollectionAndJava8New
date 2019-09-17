package com.rp.lib.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String result = optionalFilter(null);
        System.out.println(result);
    }

    static String optionalFilter(String value){
        String result = Optional.ofNullable(value)
                .filter(e -> e.equals("18") || e.equals("19"))
                .map(v -> "Y")
                .orElse("N");
        return result;
    }
}
