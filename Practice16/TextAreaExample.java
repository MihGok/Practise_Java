package Practise_Java.Practice16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseL implements MouseListener {
    JTextField textField = new JTextField();

    public void mouseClicked(MouseEvent event) {
        if
        (textField.getText().equals("Иван"))
            JOptionPane.showMessageDialog(null, "Вход выполнен");
        else
            JOptionPane.showMessageDialog(null, "Вход НЕ   выполнен");
    }

    public void mouseEntered(MouseEvent event) {
    }

    public void mouseExited(MouseEvent event) {
    }

    public void mousePressed(MouseEvent event) {
    }

    public void mouseReleased(MouseEvent event) {
    }
}
