package org.elhg._03FunctionalInterface;

public class MainGenerics {

    public static void main(String[] args) {
        System.out.println(ejecutarOp(3L,4L, (a, b) -> a + b));
        System.out.println(ejecutarOp(3.0D,4.0D, (a, b) -> a - b));
        System.out.println(ejecutarOp(3.0F,4.0F, (a, b) -> a * b));
        //System.out.println(ejecutarOp("1","2", (a, b) -> a + b));
    }

    // Recibe <T> un generico
    // Devuelve T un generico
    // Solo numbers
    public static <T extends Number> T ejecutarOp(T a, T b, CalculableGenerics<T> c){
        return c.operation(a,b);
    }

}
