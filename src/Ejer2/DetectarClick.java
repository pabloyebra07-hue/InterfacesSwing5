package Ejer2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DetectarClick extends JFrame implements MouseListener {
    public DetectarClick(){
        this.setTitle("Click IZQ o DRCH");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,10,500,400);
        this.addMouseListener(this);
    }
    private static DetectarClick ventana;

    static void main(String[] args) {
        ventana = new DetectarClick();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){
            JOptionPane.showMessageDialog(null,"Has presionado el botón IZQ");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            JOptionPane.showMessageDialog(null, "Has presionado el botón DRCH");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
