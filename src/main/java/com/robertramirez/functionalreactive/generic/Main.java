package com.robertramirez.functionalreactive.generic;

public class Main {
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(5);
        Chocolatina firstCholocatina = Chocolatina.builder()
                .marca("Milka")
                .build();
        bolsa.add(firstCholocatina);
        bolsa.forEach(System.out::println);
    }
}
