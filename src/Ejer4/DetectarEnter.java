package Ejer4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetectarEnter extends JFrame implements ActionListener {

    private JTextField campoTexto;
    private JPasswordField campoPassword;

    public DetectarEnter() {

        this.setTitle("Detectar Enter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 10, 500, 400);
        this.setLayout(null);

        campoTexto = new JTextField();
        campoPassword = new JPasswordField();

        campoTexto.setBounds(100, 100, 250, 30);
        campoPassword.setBounds(100, 180, 250, 30);

        campoTexto.addActionListener(this);
        campoPassword.addActionListener(this);

        this.add(campoTexto);
        this.add(campoPassword);
    }

    private static DetectarEnter ventana;

    public static void main(String[] args) {
        ventana = new DetectarEnter();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Cuadro1: " + campoTexto.getText() +
                        "\nCuadro2: " + new String(campoPassword.getPassword()));
    }

}