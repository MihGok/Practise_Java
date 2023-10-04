package Practise_Java.Practice15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    double number, answer;
    int calculation;

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
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
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");

    ;

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        label.setText("on");
        frame.setTitle("Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocation(550, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(220, 0, 80, 50);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.GREEN);
        frame.add(label);
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 30);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setForeground(Color.GREEN);
        frame.add(onRadioButton);
        offRadioButton.setBounds(10, 130, 60, 30);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setForeground(Color.RED);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);

        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);

        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);

        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);

        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);

        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);

        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 105, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150, 105, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setForeground(Color.BLUE);
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 105, 60, 40);
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
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        int len = label.getText().length();
        String res = label.getText();
        String fin = res.substring(0, len - 1);
        String oper = res.substring(len - 1, len);
        if (textField.getText().length() > 5) {
            label.setFont(new Font("Arial", Font.BOLD, 8));
            label.setBounds(150, 0, 150, 50);
        } else {
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setBounds(220, 0, 80, 50);
        }
        if (source == onRadioButton) {

            enable();
        } else if (source == offRadioButton) {

            disable();
        } else if (source == buttonClear) {
            label.setText("on");
            textField.setText("0");
        }
        if (textField.getText().equals("Infinity") | textField.getText().equals("NaN")) {
        } else {
            if (source == buttonDelete) {
                int length = textField.getText().length();
                int number = length - 1;
                if (length > 1) {
                    StringBuilder back = new StringBuilder(textField.getText());
                    back.deleteCharAt(number);
                    textField.setText(back.toString());
                }
                if (textField.getText().endsWith("0")) {
                    label.setText("on");
                }
            } else if (source == buttonZero) {
                if (textField.getText().equals("0")) {
                    return;
                } else {
                    textField.setText(textField.getText() + "0");
                }
            }
            if (textField.getText().length() > 22) {
            } else {
                if (source == buttonOne) {
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
                    System.out.println(textField.getText().length());
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
                }
            }
            if (source == buttonDot) {
                if (textField.getText().contains(".")) {
                    return;
                } else {
                    textField.setText(textField.getText() + ".");
                }

            } else if (source == buttonPlus) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "+");

            } else if (source == buttonMinus) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "-");
            } else if (source == buttonMul) {
                System.out.println("Operation " + oper + "  " + res);
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "X");

            } else if (source == buttonDiv) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str + "/");
            } else if (source == buttonSqrt) {
                number = Double.parseDouble(textField.getText());
                Double sqrt = Math.sqrt(number);
                textField.setText(Double.toString(sqrt));

            } else if (source == buttonSquare) {
                String str = textField.getText();
                number = Double.parseDouble(textField.getText());
                double square = Math.pow(number, 2);
                String string = Double.toString(square);
                if (string.endsWith(".0")) {
                    textField.setText(string.replace(".0", ""));
                } else {
                    textField.setText(string);
                }
                label.setText("(sqr)" + str);
            } else if (source == buttonReciprocal) {
                number = Double.parseDouble(textField.getText());
                double reciprocal = 1 / number;
                String string = Double.toString(reciprocal);
                if (string.endsWith(".0")) {
                    textField.setText(string.replace(".0", ""));
                } else {
                    textField.setText(string);
                }
            } else if (source == buttonEqual) {
                if (oper.equals("+")) {
                    calculation = 1;
                } else if (oper.equals("-")) {
                    calculation = 2;
                } else if (oper.equals("X")) {
                    calculation = 3;
                } else {
                    calculation = 4;
                }
                //Setting functionality for equal(=) button
                switch (calculation) {
                    case 1:
                        if (textField.getText().length() == 0) {
                            System.out.println("Nice");
                            answer = number * 2;
                        } else {
                            answer = number + Double.parseDouble(textField.getText());
                        }
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("on");
                        break;
                    case 2:
                        if (textField.getText().length() == 0) {
                            answer = 0;
                        } else {
                            answer = number - Double.parseDouble(textField.getText());
                        }
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("on");
                        break;
                    case 3:
                        if (textField.getText().length() == 0) {
                            answer = number * number;
                        } else {
                            answer = number * Double.parseDouble(textField.getText());
                        }
                        if (Double.toString(answer).endsWith(".0")) {
                            textField.setText(Double.toString(answer).replace(".0", ""));
                        } else {
                            textField.setText(Double.toString(answer));
                        }
                        label.setText("on");
                        break;
                    case 4:
                        if (textField.getText().length() == 0) {
                            if (Double.parseDouble(fin) == 0) {
                                textField.setText("Infinity");
                                label.setText("on");
                            } else {
                                answer = 1;
                                textField.setText(Double.toString(answer).replaceAll(".0", ""));
                                label.setText("on");
                            }
                        } else {
                            answer = number / Double.parseDouble(textField.getText());
                            if (Double.toString(answer).endsWith(".0")) {
                                textField.setText(Double.toString(answer).replace(".0", ""));
                            } else {
                                textField.setText(Double.toString(answer));
                            }
                            label.setText("on");
                            break;
                        }
                }
            }
        }
    }

    public void enable() {
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
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
        label.setText("on");
        label.setBounds(220,0,80,50);
        label.setFont(new Font("Arial",Font.BOLD,14));
    }

    public void disable() {
        onRadioButton.setEnabled(true);
        onRadioButton.setForeground(Color.GREEN);
        offRadioButton.setEnabled(false);
        textField.setText("Calculator is turned off");
        textField.setForeground(Color.RED);
        label.setText("off");
        label.setForeground(Color.RED);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
        label.setBounds(220,0,80,50);
        label.setFont(new Font("Arial",Font.BOLD,14));
    }
}