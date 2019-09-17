package com.rp.lib.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {
        // Conventional way of printing arraylist
        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();

        // https://www.codenuclear.com/print-arraylist-using-lambda-expression-in-java-8/
        // Lambda Expression to print arraylist - Way 1
        numbers.forEach((Integer value) -> System.out.print(value));
        System.out.println();

        // Lambda Expression to print arraylist - Way 2
        numbers.forEach(value -> System.out.print(value));
        System.out.println();

        // Lambda Expression (method reference) to print arraylist - Way 3
        numbers.forEach(System.out::print);
        System.out.println();
    }
}
