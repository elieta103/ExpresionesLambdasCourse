package org.elhg._04FunctionalInterfaceFirmas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lambdas...");
        ejecutorLambdaTipo1(() -> System.out.println("Sin parametros "));
        ejecutorLambdaTipo2(a -> System.out.println("Con un parametro : " + a), 7);
        ejecutorLambdaTipo3((a, b) -> System.out.println("Con dos parametro : " + a + ", " + b), 7, 8);
        ejecutorLambdaTipo4(() -> Integer.MAX_VALUE);
        ejecutorLambdaTipo5((a, b) -> Integer.MIN_VALUE, 5, 6);
    }

    public static void ejecutorLambdaTipo1(IFunctional_1 f) {
        f.metodo1();
    }

    public static void ejecutorLambdaTipo2(IFunctional_2 f, int a) {
        f.metodo2(a);
    }

    public static void ejecutorLambdaTipo3(IFunctional_3 f, int a, int b) {
        f.metodo3(a, b);
    }

    public static void ejecutorLambdaTipo4(IFunctional_4 f) {
        int res = f.metodo4();
        System.out.println("Devuelve un valor, sin parametros : " + res);

    }

    public static void ejecutorLambdaTipo5(IFunctional_5 f, int a, int b) {
        int res = f.metodo5(a, b);

        System.out.println("Con dos parametro : " + a + ", " + b + " Devuelve un valor, con parametros : " + res);
    }
}
