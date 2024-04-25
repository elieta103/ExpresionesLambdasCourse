package org.elhg._03FunctionalInterface;

public class MainFunctional {

    public static void main(String[] args) {
        System.out.println(ejecutarOp(3,4, (a, b) -> a + b));
        System.out.println(ejecutarOp(3,4, (a, b) -> a - b));
    }

    public static double ejecutarOp(double a, double b, CalculableFunctional c){
        return c.operation(a,b);
    }

}
