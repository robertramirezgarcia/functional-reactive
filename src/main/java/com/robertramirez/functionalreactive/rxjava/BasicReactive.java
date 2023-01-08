//package com.robertramirez.functionalreactive.rxjava;
//
//import rx.Observable;
//import rx.functions.Func1;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class BasicReactive {
//    public static void main(String[] args) {
//        //observableBasic();
//        observableWithLambda();
//    }
//
//    public static void observableBasic() {
//        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
//        Observable.from(input)
//                .filter(new Func1<Integer, Boolean>() {
//                    @Override
//                    public Boolean call(Integer x) {
//                        return x % 2 == 0;
//                    }
//                })
//                .subscribe(System.out::println);
//    }
//
//    public static void observableWithLambda() {
//        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
//        Observable.from(input)
//                .filter(x -> x % 2 == 0)
//                .subscribe(System.out::println);
//    }
//
//}
