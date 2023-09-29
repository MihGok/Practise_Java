package Practise_Java.Practice16;

import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Game implements ActionListener {
    double number, answer;
    int amount = 1;
    boolean isTimerRunning = false;
    JFrame frame;
    int guess;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton ButtonZero = new JButton("0");
    JTextField buttonCenter = new JTextField("Welcome to ");
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

    Game() {
        createNumber();
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public String CheckPos() {
        int curX = MouseInfo.getPointerInfo().getLocation().x;
        int curY = MouseInfo.getPointerInfo().getLocation().y;
        if (curY > 600) {
            return "Север";
        } else {
            if (curY > 180 & curY < 600 & curX > 400 & curX < 615) {
                return "Запад";
            } else {
                if (curX > 995 & curX < 1195 & curY < 600 & curX > 180) {
                    return "Восток";
                } else {
                    if (curY < 180) {
                        return "Юг";
                    } else {
                        return "Центр";
                    }
                }


            }
        }
    }

    public void createNumber() {
        Random rand = new Random();
        guess = rand.nextInt(1, 21);
        System.out.println(guess);
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setBackground(Color.WHITE);
        frame.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                buttonCenter.setText("Welcome to "  +CheckPos());
            }
        });
        frame.setTitle("Calculator");
        frame.setSize(800, 800);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocation(400, 20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        buttonZero.setBounds(650,490,60,40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);
        buttonCenter.setForeground(Color.BLACK);
        buttonCenter.setBackground(new Color(238,238,238));
        buttonCenter.setBounds(350, 300, 150, 40);
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

    public void addActionEvent() {
        //Registering ActionListener to buttons
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {

            enable();
        } else if (source == offRadioButton) {

            disable();
        } else if (source == buttonClear) {
            label.setText("Enter your number");
            textField.setText("0");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 1) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("0")) {
                label.setText("Enter your number");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "1");
                    } else {
                        textField.setText("1");
                    }
                } else {
                    textField.setText(textField.getText() + "1");
                }
            } else {
                textField.setText(textField.getText() + "1");
            }
        } else if (source == buttonTwo) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "2");
                    } else {
                        textField.setText("2");
                    }
                } else {
                    textField.setText(textField.getText() + "2");
                }
            } else {
                textField.setText(textField.getText() + "2");
            }
        } else if (source == buttonThree) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "3");
                    } else {
                        textField.setText("3");
                    }
                } else {
                    textField.setText(textField.getText() + "3");
                }
            } else {
                textField.setText(textField.getText() + "3");
            }
        } else if (source == buttonFour) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "4");
                    } else {
                        textField.setText("4");
                    }
                } else {
                    textField.setText(textField.getText() + "4");
                }
            } else {
                textField.setText(textField.getText() + "4");
            }
        } else if (source == buttonFive) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "5");
                    } else {
                        textField.setText("5");
                    }
                } else {
                    textField.setText(textField.getText() + "5");
                }
            } else {
                textField.setText(textField.getText() + "5");
            }
        } else if (source == buttonSix) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "6");
                    } else {
                        textField.setText("6");
                    }
                } else {
                    textField.setText(textField.getText() + "6");
                }
            } else {
                textField.setText(textField.getText() + "6");
            }
        } else if (source == buttonSeven) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "7");
                    } else {
                        textField.setText("7");
                    }
                } else {
                    textField.setText(textField.getText() + "7");
                }
            } else {
                textField.setText(textField.getText() + "7");
            }
        } else if (source == buttonEight) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "8");
                    } else {
                        textField.setText("8");
                    }
                } else {
                    textField.setText(textField.getText() + "8");
                }
            } else {
                textField.setText(textField.getText() + "8");
            }
        } else if (source == buttonNine) {
            if (textField.getText().length() == 1) {
                if (textField.getText().contains("0")) {
                    if (textField.getText().contains(".")) {
                        textField.setText(textField.getText() + "9");
                    } else {
                        textField.setText("9");
                    }
                } else {
                    textField.setText(textField.getText() + "9");
                }
            } else {
                textField.setText(textField.getText() + "9");
            }
        } else if (source == buttonEqual) {
            if (amount == 3) {
                label.setText("You have lost");
                disable();
            }
            int cur = Integer.parseInt(textField.getText());
            if (cur == guess) {
                label.setText("Congratulations, you have won");
                disable();
            }
            if (cur > guess) {
                label.setText("Decrease your number");
            }
            if (cur < guess) {
                label.setText("Encrease your number");
            }
            textField.setText("0");
            amount++;
        }


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
        createNumber();
        amount = 0;
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