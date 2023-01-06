package com.robertramirez.functionalreactive.stream;

import java.util.Observable;

/*Subject is responsible for producing an object and notifying the observers as soon as the item has been produced*/
public class Subject extends Observable {
    public void doWorkAndNotify() {
        //Object result = doWork();
        notifyObservers();
        System.out.println("doWorkAndNotify");
    }
}