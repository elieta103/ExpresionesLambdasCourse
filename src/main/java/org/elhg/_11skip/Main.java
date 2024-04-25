package org.elhg._11skip;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Venta> ventas =
                Arrays.stream(Month.values())
                        .map(month -> new Venta(month, generarDoubleAleatorio()))
                        .toList();
        System.out.println(ventas);

        // Trimestrales, Q1, Q2
        List<Venta> ventasPeriodo = ventas.stream()
                .skip(6)
                .toList();
        System.out.println(ventasPeriodo);
    }


    public  static  Double generarDoubleAleatorio(){
        return new Random().nextDouble(2000);
    }
}
