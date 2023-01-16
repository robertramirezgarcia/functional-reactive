package com.robertramirez.functionalreactive.functional;

import java.util.Arrays;
import java.util.List;

public class FunctionalUsingMinAndMax {
    public static void main(String[] args) {
        final List<PersonFunctional> people =
                Arrays.asList(
                        new PersonFunctional("John", 20),
                        new PersonFunctional("Sara", 21),
                        new PersonFunctional("Jane", 21),
                        new PersonFunctional("Greg", 35)
                );

        people.stream()
                .min(PersonFunctional::ageDifference)
                .ifPresent(youngest -> System.out.println("Youngest: " + youngest));

        people.stream()
                .max(PersonFunctional::ageDifference)
                .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
    }
}
