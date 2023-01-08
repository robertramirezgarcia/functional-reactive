package com.robertramirez.functionalreactive.rxjava;

import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RxJavaBasic {

    public static void main(String[] args) {
        useAndThen();
    }

    public static void useAndThen() {
        Completable first = Completable.fromSingle(Single.just(1));
        Completable second = Completable
                .fromRunnable(() -> {});
        Throwable throwable = new RuntimeException();
        Completable error = Single.error(throwable)
                .ignoreElement();

        first.andThen(second)
                .test()
                .assertError(RuntimeException.class);

        Single s = Single.just("value1");
        Single s2 = Single.just("value2");
    }
}
