package Practise_Java.Practice17_1;

import javax.swing.*;
import java.awt.*;

public class View {
    private JTextField buttonCenter = new JTextField("");
    private JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonEqual = new JButton("Check");

    View() {
        PrepareGUI();
        addComponents();
    }

    public JFrame getFrame() {
        return frame;
    }

    public void PrepareGUI() {
        frame = new JFrame();
        frame.setBackground(Color.WHITE);
        frame.setTitle("Calculator");
        frame.setSize(800, 800);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocation(400, 20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void updateGUI(String toUpdate) {
        buttonCenter.setText(toUpdate);
    }

    public JRadioButton getOnButton() {
        return onRadioButton;
    }

    public void enable() {
        buttonCenter.setVisible(true);
        offRadioButton.setForeground(Color.RED);
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        textField.setText("0");
        label.setEnabled(true);
        label.setForeground(Color.GREEN);
        buttonEqual.setEnabled(true);
        label.setText("Enter your number");
    }

    public void addComponents() {
        label.setText("Enter your number");
        label.setBounds(330, 230, 300, 50);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.GREEN);
        frame.add(label);
        onRadioButton.setBounds(100, 360, 60, 30);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setForeground(Color.GREEN);
        frame.add(onRadioButton);
        offRadioButton.setBounds(100, 300, 60, 30);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setForeground(Color.RED);
        frame.add(offRadioButton);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        buttonCenter.setForeground(Color.BLACK);
        buttonCenter.setBackground(new Color(238, 238, 238));
        buttonCenter.setBounds(330, 300, 170, 40);
        buttonCenter.setEditable(false);
        buttonCenter.setBorder((javax.swing.BorderFactory.createEmptyBorder()));
        frame.add(buttonCenter);
        buttonEqual.setBounds(350, 350, 100, 60);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonEqual);
    }

    public void disable() {
        offRadioButton.setSelected(true);
        buttonCenter.setVisible(false);
        onRadioButton.setEnabled(true);
        onRadioButton.setForeground(Color.GREEN);
        offRadioButton.setEnabled(false);
        textField.setForeground(Color.RED);
        buttonEqual.setEnabled(false);
    }
}
