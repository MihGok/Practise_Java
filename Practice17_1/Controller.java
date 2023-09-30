package Practise_Java.Practice17_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;
public class Controller implements MouseMotionListener, ActionListener {
    Model model;
    View view;
    Random rand = new Random();
    Controller(Model model, View view){
        this.model = model;
        this.view = view;
        view.getFrame().addMouseMotionListener(this);
        view.onRadioButton.addActionListener(this);
        view.offRadioButton.addActionListener(this);
        view.buttonClear.addActionListener(this);
        view.buttonDelete.addActionListener(this);
        view.buttonSeven.addActionListener(this);
        view.buttonEight.addActionListener(this);
        view.buttonNine.addActionListener(this);
        view.buttonFour.addActionListener(this);
        view.buttonFive.addActionListener(this);
        view.buttonSix.addActionListener(this);
        view.buttonOne.addActionListener(this);
        view.buttonTwo.addActionListener(this);
        view.buttonThree.addActionListener(this);
        view.buttonEqual.addActionListener(this);
        view.buttonZero.addActionListener(this);
        createNumber();
    }
    public void createNumber(){
        model.setGuess(rand.nextInt(0,20));
        System.out.println(model.getGuess());
    }
    public String Check(int curX, int curY) {
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

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String cur = model.getToOut() + Check(MouseInfo.getPointerInfo().getLocation().x, MouseInfo.getPointerInfo().getLocation().y);
        view.updateGUI(cur);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == view.onRadioButton) {
            model.setAmount(0);
            createNumber();
            view.enable();
        } else if (source == view.offRadioButton) {
            view.disable();
        } else if (source == view.buttonClear) {
            view.textField.setText("0");
        } else if (source == view.buttonDelete) {
            int length = view.textField.getText().length();
            int number = length - 1;
            if (length > 1) {
                StringBuilder back = new StringBuilder(view.textField.getText());
                back.deleteCharAt(number);
                view.textField.setText(back.toString());
            }
            if (view.textField.getText().endsWith("0")) {
                view.label.setText("Enter your number");
            }
        } else if (source == view.buttonZero) {
            if (view.textField.getText().equals("0")) {
                return;
            } else {
                view.textField.setText(view.textField.getText() + "0");
            }
        } else if (source == view.buttonOne) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "1");
                    } else {
                        view.textField.setText("1");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "1");
                }
            } else {
                view.textField.setText(view.textField.getText() + "1");
            }
        } else if (source == view.buttonTwo) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "2");
                    } else {
                        view.textField.setText("2");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "2");
                }
            } else {
                view.textField.setText(view.textField.getText() + "2");
            }
        } else if (source == view.buttonThree) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "3");
                    } else {
                        view.textField.setText("3");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "3");
                }
            } else {
                view.textField.setText(view.textField.getText() + "3");
            }
        } else if (source == view.buttonFour) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "4");
                    } else {
                        view.textField.setText("4");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "4");
                }
            } else {
                view.textField.setText(view.textField.getText() + "4");
            }
        } else if (source == view.buttonFive) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "5");
                    } else {
                        view.textField.setText("5");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "5");
                }
            } else {
                view.textField.setText(view.textField.getText() + "5");
            }
        } else if (source == view.buttonSix) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "6");
                    } else {
                        view.textField.setText("6");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "6");
                }
            } else {
                view.textField.setText(view.textField.getText() + "6");
            }
        } else if (source == view.buttonSeven) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "7");
                    } else {
                        view.textField.setText("7");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "7");
                }
            } else {
                view.textField.setText(view.textField.getText() + "7");
            }
        } else if (source == view.buttonEight) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "8");
                    } else {
                        view.textField.setText("8");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "8");
                }
            } else {
                view.textField.setText(view.textField.getText() + "8");
            }
        } else if (source == view.buttonNine) {
            if (view.textField.getText().length() == 1) {
                if (view.textField.getText().contains("0")) {
                    if (view.textField.getText().contains(".")) {
                        view.textField.setText(view.textField.getText() + "9");
                    } else {
                        view.textField.setText("9");
                    }
                } else {
                    view.textField.setText(view.textField.getText() + "9");
                }
            } else {
                view.textField.setText(view.textField.getText() + "9");
            }
        } else if (source == view.buttonEqual) {
            if (model.getAmount() == 3) {
                view.disable();
            }
            int cur = Integer.parseInt(view.textField.getText());
            if (cur == model.getGuess()) {
                view.label.setText("Wictory");
                view.disable();
            }
            if (cur > model.getGuess()) {
                view.label.setText("Decrease your number");
            }
            if (cur < model.getGuess()) {
                view.label.setText("Encrease your number");
            }
            view.textField.setText("0");
            model.setAmount(model.getAmount()+1);
        }
    }
}
