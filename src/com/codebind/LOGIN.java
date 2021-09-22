package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN extends JFrame {
    private JPanel panel1;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JLabel Password;
    private JLabel Usuario;
    private JButton ingresarButton;
    private JButton salirButton;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;

    public LOGIN() {
        super("Ejemplo de Java Swing con IDEA");

        setContentPane(panel1);
        menuBar = new JMenuBar();
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        menuBar.add(archivo);
        archivo.add(salir);
        setJMenuBar(menuBar);
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bienvenido a Swing");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}
