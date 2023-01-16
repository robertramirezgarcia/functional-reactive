package com.robertramirez.functionalreactive.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OlderThan20 {
    public static void main(String[] args) {
        older();
    }

    public static void older() {

        final List<PersonFunctional> people =
                Arrays.asList(
                        new PersonFunctional("John", 20),
                        new PersonFunctional("Sara", 21),
                        new PersonFunctional("Jane", 21),
                        new PersonFunctional("Greg", 35)
                );

        List<PersonFunctional> olderThan20 = new ArrayList<>();

        people.stream()
                .filter(person -> person.getAge() > 20) //filter older than 20 years
                .forEach(person -> olderThan20.add(person)); //add the person to array
        System.out.println("People older than 20: " + olderThan20);
    }
}
