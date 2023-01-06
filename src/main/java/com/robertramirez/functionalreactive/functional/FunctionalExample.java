package com.robertramirez.functionalreactive.functional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalExample {
    public static void main(String[] args) {
        /* Example 1*/
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal(10),
                new BigDecimal(20),
                new BigDecimal(30),
                new BigDecimal(40)
        );

        //apply functional programming
        final BigDecimal totalOfDiscountPrices =
                prices.stream()
                        .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                        .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
        // print result
        System.out.println("total: " + totalOfDiscountPrices);

        /* Example 2*/
        final List<String> friends =
                Arrays.asList("Jhon", "Neat", "Neal", "Becky");
        //print each name
        friends.forEach(name -> System.out.println(name));

        //print each name better
        friends.forEach(System.out::println);

        //convert names to uppercase without lambda expression
        final List<String> uppercaseNames = new ArrayList<>();
        friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
        uppercaseNames.forEach(System.out::println);

        // convert names to uppercase with lambda expression
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

    }
}
