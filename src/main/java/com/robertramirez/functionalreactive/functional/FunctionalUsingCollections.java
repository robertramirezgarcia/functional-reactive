package com.robertramirez.functionalreactive.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalUsingCollections {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara");

        // the second format, implementing a function with predicate return
        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) -> {
                    Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
                    return checkStarts;
                };

        // the third format, reducing the filter
        final Function<String, Predicate<String>> startsWithLetterSecond =
                letter -> name -> name.startsWith(letter);

        //filter by startWith
        final List<String> startsWithN =
                friends.stream()
                        .filter(startsWithLetterSecond.apply("N"))
                        .collect(Collectors.toList());
        startsWithN.forEach(System.out::println);

        //using map
        System.out.println("Total number of characters in all names: " +
        friends.stream()
                .mapToInt(name -> name.length())
                .sum());

        //Joining names
        System.out.println(
                "Joining elements: " +
                friends.stream().map(String::toUpperCase)
                        .collect(Collectors.joining(","))
        );

    }

    // the first format with static method
    public static Predicate<String> checkIfStartsWith(final String letter){
        return name -> name.startsWith(letter);
    }
}
