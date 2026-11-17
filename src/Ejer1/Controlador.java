package Ejer1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Controlador extends JFrame implements WindowFocusListener{

    private Controlador ventana1;
    private Controlador ventana2;

    public static void main(String[] args){
        Controlador miVentana = new Controlador();
        miVentana.iniciar();
    }

    public void iniciar() {
        ventana1 = new Controlador();
        ventana2 = new Controlador();
        ventana1.setTitle("Ventana1");
        ventana2.setTitle("Ventana2");
        ventana1.setBounds(50, 100, 600, 350);
        ventana2.setBounds(700, 100, 600, 350);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana1.setVisible(true);
        ventana2.setVisible(true);

        ventana1.addWindowFocusListener(this);
        ventana2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if (e.getSource() == ventana1) {
            ventana1.getContentPane().setBackground(Color.GREEN);
            ventana1.setTitle("Ventana 1 (Focus)");
        } else {
            ventana2.getContentPane().setBackground(Color.GREEN);
            ventana2.setTitle("Ventana 2 (Focus)");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource() == ventana1) {
            ventana1.getContentPane().setBackground(Color.RED);
            ventana1.setTitle("Ventana 1 (No Focus)");
        } else {
            ventana2.getContentPane().setBackground(Color.RED);
            ventana2.setTitle("Ventana 2 (No Focus)");
        }
    }
}
