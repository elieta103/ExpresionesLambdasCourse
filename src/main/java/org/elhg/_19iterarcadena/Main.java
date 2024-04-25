package org.elhg._19iterarcadena;


public class Main {
    public static void main(String[] args) {
        String cadena = "hola mundo";
        cadena.chars()
                .filter( c -> c != 'a')
                .forEach(Main::printChar);
    }

    private static void printChar(int character) {
        System.out.print((char) character);
    }
}
