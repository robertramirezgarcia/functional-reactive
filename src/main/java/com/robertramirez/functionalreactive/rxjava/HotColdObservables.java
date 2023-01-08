//package com.robertramirez.functionalreactive.rxjava;
//
//import rx.Observable;
//import rx.Subscriber;
//
//public class HotColdObservables {
//
//    public static void main(String[] args) {
//        //methodFrom();
//        methodStartWith();
//    }
//
//    public static void methodFrom() {
//        Observable<Integer> observable = Observable.from(new Integer[]{1, 2, 3, 4, 5});
//        observable.subscribe(new Subscriber<Integer>() {
//            @Override
//            public void onCompleted() {
//                System.out.println("Sequence completed!");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                System.err.println("Exception: " + e.getMessage());
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//                System.out.println("next item is: " + integer);
//            }
//        });
//    }
//
//    public static void methodJust() {
//        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
//        observable.subscribe(new Subscriber<Integer>() {
//            @Override
//            public void onCompleted() {
//                System.out.println("Sequence completed!");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                System.err.println("Exception: " + e.getMessage());
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//                System.out.println("next item is: " + integer);
//            }
//        });
//    }
//
//    public static void methodStartWith() {
//        Observable.just("first", "second", "third")
//                .startWith("zero")
//                .subscribe(new Subscriber<String>() {
//                    @Override
//                    public void onCompleted() {
//                        System.out.println("sequence completed!");
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//
//                    }
//
//                    @Override
//                    public void onNext(String s) {
//                        System.out.println("next item is: " + s);
//                    }
//                });
//    }
//
//}
