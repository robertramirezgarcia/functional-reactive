package com.robertramirez.functionalreactive.functional;

public class PersonFunctional {
    private final String name;
    private final int age;

    public PersonFunctional(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int ageDifference(final PersonFunctional other){
        return age - other.age;
    }

    public String toString() {
        return String.format("%s - %d ", name, age);
    }
}
