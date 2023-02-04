package com.robertramirez.functionalreactive.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa <T> implements Iterable <T>{

    private ArrayList <T> lista;
    private int tope;

    public Bolsa(int tope) {
        super();
        this.tope = tope;
        lista = new ArrayList<>();
    }

    public void add(T objeto) {
        if(this.tope > lista.size()) {
            lista.add(objeto);
        } else {
            throw new RuntimeException("No hay mas espacio");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}
