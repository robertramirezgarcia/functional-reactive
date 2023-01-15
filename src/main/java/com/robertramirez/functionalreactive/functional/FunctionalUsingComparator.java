package com.robertramirez.functionalreactive.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class FunctionalUsingComparator {
    public static void main(String[] args) {

        final List<PersonFunctional> people =
                Arrays.asList(
                  new PersonFunctional("John", 20),
                        new PersonFunctional("Sara", 21),
                        new PersonFunctional("Jane", 21),
                        new PersonFunctional("Greg", 35)
                );

        Comparator<PersonFunctional> compareAscending = getCompareAscending();
        Comparator<PersonFunctional> compareDescending = compareAscending.reversed();

        printPeople ( "Sorted in ascending order by age: ",
                people.stream()
                        .sorted(compareAscending)
                        .collect(toList()));

        printPeople ( "Sorted in descending order by age: ",
                people.stream()
                        .sorted(compareDescending)
                        .collect(toList()));
    }

    private static Comparator<PersonFunctional> getCompareAscending() {
        return (person1, person2) -> person1.ageDifference(person2);
    }

    public static void printPeople(final String message, final List<PersonFunctional> people){
        System.out.println(message);
        people.forEach(System.out::println);
    }
}
