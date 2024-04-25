package org.elhg._02swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    public Ventana(String title) throws HeadlessException {
        super(title);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));

        JButton b1 = new JButton("Click 1!");
        b1.addActionListener(new ButtonListener());
        add(b1);

        JButton b2 = new JButton("Click 2!");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola desde el button Listener 2");
            }
        });
        add(b2);

        JButton b3 = new JButton("Click 3!");
        b3.addActionListener( event -> System.out.println("Hola desde el button Listener 3 "));
        add(b3);

        setVisible(true);
    }
}
