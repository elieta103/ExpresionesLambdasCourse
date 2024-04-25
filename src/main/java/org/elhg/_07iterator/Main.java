package org.elhg._07iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = List.of("Fernando", "Ana", "Diana", "Jorge");

        for(int i=0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }

        int counter = 0;
        while(true){
            if(counter == nombres.size() -1){
                break;
            }
            System.out.println(nombres.get(counter));
            counter++;
        }

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        CollectionInventada<String> collectionInventada = new CollectionInventada();
        collectionInventada.add("Eliel");
        collectionInventada.add("July");


        for (String elemento : collectionInventada){
            System.out.println(elemento);
        }

    }
}
