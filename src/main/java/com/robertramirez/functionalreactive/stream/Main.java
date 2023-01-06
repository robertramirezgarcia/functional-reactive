package com.robertramirez.functionalreactive.stream;

public class Main {
    public static void main(String[] args) {
        MyObserver myObserver = new MyObserver();
        Subject subject = new Subject();
        subject.addObserver(myObserver);
        subject.doWorkAndNotify();
    }
}
