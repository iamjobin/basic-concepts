package com.oop.generics.lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaExpression {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        for (int i=1; i<6; i++) {
            data.add(i*2);
        }

        Consumer<Integer> integerConsumer = (Integer a) -> System.out.println(a);

        data.forEach(integerConsumer);

        Operation sum  = (Long a, Long b) -> {
            Long s = a + b;
            return s;
        };
        Operation diff = (Long a, Long b) -> (a - b);
        Operation prod = (Long a, Long b) -> (a * b);

        LamdaExpression calc = new LamdaExpression();
        System.out.println(calc.operate(5L, 3L, sum));
    }

    private Long operate(Long a, Long b, Operation op){
        return op.operate(a, b);
    }

}


@FunctionalInterface
interface Operation {
    Long operate(Long a, Long b);
}
