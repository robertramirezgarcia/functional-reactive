package com.robertramirez.functionalreactive.stream;

import java.util.Observable;
import java.util.Observer;

/*Observer is responsible for observing Subject and consuming every item that Subject produces*/
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        //doSomethingWith(item)
        System.out.println("execute update");
    }
}
