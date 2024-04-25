package org.elhg._06highorderfunctions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Callback .- Función que es pasada como parametro.");
        System.out.println("High Order Función .- Función que regresa o recibe funciones.");

        int numero = 2;

        Function<Integer, Integer> square = (t) -> t * t;
        Function<Integer, Integer> cube = (t) -> t * t * t;

        System.out.println(applyFunction(square, numero));
        System.out.println(applyFunction(cube, numero));

        Function<Integer, Integer> func  = functionFour();
        System.out.println(functionFour().apply(numero));
    }

    public static Integer applyFunction(Function<Integer, Integer> function, Integer t){
        return function.apply(t);
    }

    public static Function<Integer, Integer> functionFour(){
        return t -> t * t * t * t;
    }
}
