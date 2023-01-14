package com.robertramirez.functionalreactive.rxjava;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;

public class FlowableExample {

    public static void main(String[] args) {
        //No suele crearse un flowable de datos estaticos
        Flowable<Integer> integerFlowable = Flowable.just(1, 2, 3, 4);

        //Se puede obtener un Flowable a partir de un Observable
        Observable<Integer> integerObservable = Observable.just(1, 2, 3);
        Flowable<Integer> integerFlow = integerObservable.toFlowable(BackpressureStrategy.BUFFER);

        //RxJava2 describe la interfaz funcional FlowableOnSubscribe
        //Es un flowable que comienza a emitir eventos en cuanto el consumidor se suscribe
        FlowableOnSubscribe<Integer> flowableOnSubscribe = flowable -> flowable.onNext(1);
        Flowable<Integer> flowable = Flowable.create(flowableOnSubscribe, BackpressureStrategy.BUFFER);



    }

}
