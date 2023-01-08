package com.robertramirez.functionalreactive.rxjava;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscription;

import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Observables {

    public static void main(String[] args) {
        //createObservableBasic();
        //emitValueCalculated();
        //emitValueCalculatedWithDefer();
        //coldObservable();
        hotObservable();
    }

    public static void createObservableBasic() {
        /* Si ya se tiene el valor puede utilizar just directamente */
        Observable.just("Hello word!")
                .subscribe(System.out::println);
    }

    public static void emitValueCalculated() {
        /* Recomendable para aquellos casos donde los valores deben ser calculados, y este cálculo tarda más de lo esperado */
        Observable.fromCallable(() -> longComputation())
                .subscribe(System.out::println);
    }

    public static Long longComputation(){
        return Long.MAX_VALUE;
    }

    public static void emitValueCalculatedWithDefer() {
        /* Recomendable cuando se desea emitir un valor calculado */
        Observable.defer(() -> {
                    try {
                        return Observable.just(longComputation());
                    } catch (Exception e) {
                        return Observable.error(e);
                    }
                }
        ).subscribe(System.out::println);
    }

    public static void coldObservable() {
        //Emits a long every 500 ms
        Observable<Long> cold = Observable.interval(200, TimeUnit.MILLISECONDS);
        //Subscriber 1
        cold.subscribe(l -> log.info("sub 1: " + l));
        //Interval between the two subscribes
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        //Subscriber 2
        cold.subscribe(l -> log.info("sub 2: " + l));
    }

    public static void hotObservable() {
        //Publish converts cold to hot
        //Returns ConnectableObservable that add functionality for connect and unconnect
        ConnectableObservable<Long> hot = Observable.interval(500, TimeUnit.MILLISECONDS)
                .publish();
        //Connect to subscribe
        hot.connect();
        hot.subscribe(l -> System.out.println("sub1: " + l));
        //Interval between the two subscribes
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        hot.subscribe(l -> System.out.println("sub2: " + l));
    }

}
