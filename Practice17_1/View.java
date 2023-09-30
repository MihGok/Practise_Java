package Practise_Java.Practice17_1;

import javax.swing.*;
import java.awt.*;

public class View {
    private JTextField buttonCenter = new JTextField("");
    private JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton ButtonZero = new JButton("0");
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
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
        textField.setForeground(Color.DARK_GRAY);
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        textField.setText("0");
        label.setEnabled(true);
        label.setForeground(Color.GREEN);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        label.setText("Enter your number");
    }

    public void addComponents() {
        label.setText("Enter your number");
        label.setBounds(350, 160, 300, 50);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.GREEN);
        frame.add(label);
        textField.setBounds(166, 220, 470, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);
        onRadioButton.setBounds(100, 200, 60, 30);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setForeground(Color.GREEN);
        frame.add(onRadioButton);
        offRadioButton.setBounds(100, 250, 60, 30);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setForeground(Color.RED);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);
        buttonZero.setBounds(650, 490, 60, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);
        buttonCenter.setForeground(Color.BLACK);
        buttonCenter.setBackground(new Color(238, 238, 238));
        buttonCenter.setBounds(350, 300, 150, 40);
        buttonCenter.setEditable(false);
        buttonCenter.setBorder((javax.swing.BorderFactory.createEmptyBorder()));
        frame.add(buttonCenter);
        buttonSeven.setBounds(210, 370, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(370, 370, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(530, 370, 60, 40);

        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(210, 430, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);
        buttonFive.setBounds(370, 430, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(530, 430, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);
        buttonOne.setBounds(210, 490, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(370, 490, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(530, 490, 60, 40);

        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);
        buttonEqual.setBounds(0, 550, 800, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonEqual);
        buttonDelete.setBounds(580, 300, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setForeground(Color.BLUE);
        frame.add(buttonDelete);

        buttonClear.setBounds(160, 300, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setForeground(Color.BLUE);
        frame.add(buttonClear);
        textField.setText("0");
    }

    public void disable() {
        offRadioButton.setSelected(true);
        buttonCenter.setVisible(false);
        onRadioButton.setEnabled(true);
        onRadioButton.setForeground(Color.GREEN);
        offRadioButton.setEnabled(false);
        textField.setText("Game is turned off");
        textField.setForeground(Color.RED);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);

    }
}
