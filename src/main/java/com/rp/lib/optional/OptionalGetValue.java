package com.rp.lib.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalGetValue {
    //key: use .orElse to handle null
    public static void main(String[] args) {
        Optional<String> firstEven = Stream.of("five", "even", "length", "string","values")
                .filter(s -> s.length() %2 == 0)
                .findFirst();
        System.out.println(firstEven);

        Optional<String> firstOdd = Stream.of("five", "even", "length", "string","values")
                .filter(s -> s.length() %2 != 0)
                .findFirst();
        System.out.println(firstOdd.orElse("No odd length string"));
    }
}
