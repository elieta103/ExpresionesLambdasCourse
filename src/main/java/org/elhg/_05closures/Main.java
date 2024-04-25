package org.elhg._05closures;

import org.elhg._02swing.ButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        System.out.println("Closures : Funciones que pueden acceder a variables no locales (externas a la función), " +
                "\npero que son útiles a la función." +
                "\nNo pueden ser reasignadas en el método(Expresion lambda).");
        String cadena = "hello";
        Persona persona = new Persona("Eliel", 18);

        JFrame ventana = new JFrame();
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));



        JButton b1 = new JButton("Click 1!");
        b1.addActionListener( e-> {
            System.out.println(cadena);
            persona.setEdad(persona.getEdad()+1);
            System.out.println(persona.getEdad());
        });

        ventana.add(b1);
        ventana.setVisible(true);
    }
}
