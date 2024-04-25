package org.elhg._17reduce;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        OptionalInt optionalIntSuma = Arrays.stream(array)
                .reduce((acumulador,item)->acumulador+item);
        System.out.println(optionalIntSuma.orElseThrow());

        int suma = Arrays.stream(array)
                .reduce(0, (acumulador,item)->acumulador+item);
        System.out.println(suma);

        OptionalInt optionalIntFactorial = Arrays.stream(array)
                .reduce((acumulador,item)->acumulador*item);
        System.out.println(optionalIntFactorial.orElseThrow());

        OptionalInt optionalIntFactorialNo = IntStream.range(1, 6).reduce((a,b)-> a*b);
        System.out.println(optionalIntFactorialNo.orElseThrow());

        Optional<String> str = Arrays.stream(array)
                .mapToObj(item -> Integer.toString(item))
                .reduce((str1, str2)-> str1+" _ "+str2);
        System.out.println(str.orElseThrow());

    }
}
