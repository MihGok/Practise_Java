package Practise_Java.Practice22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        addActionEvent();
    }

    public void addActionEvent() {
        //Registering ActionListener to buttons
        view.onRadioButton.addActionListener(this);
        view.offRadioButton.addActionListener(this);
        view.buttonClear.addActionListener(this);
        view.buttonDelete.addActionListener(this);
        view.buttonDiv.addActionListener(this);
        view.buttonSqrt.addActionListener(this);
        view.buttonSquare.addActionListener(this);
        view.buttonReciprocal.addActionListener(this);
        view.buttonMinus.addActionListener(this);
        view.buttonSeven.addActionListener(this);
        view.buttonEight.addActionListener(this);
        view.buttonNine.addActionListener(this);
        view.buttonMul.addActionListener(this);
        view.buttonFour.addActionListener(this);
        view.buttonFive.addActionListener(this);
        view.buttonSix.addActionListener(this);
        view.buttonPlus.addActionListener(this);
        view.buttonOne.addActionListener(this);
        view.buttonTwo.addActionListener(this);
        view.buttonThree.addActionListener(this);
        view.buttonEqual.addActionListener(this);
        view.buttonZero.addActionListener(this);
        view.buttonDot.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        System.out.println(view.textField.getText());
        if (source == view.onRadioButton) {
            view.enable();
        } else if (source == view.offRadioButton) {
            view.disable();
        } else if (source == view.buttonClear) {
            view.label.setText("on");
            view.textField.setText("0");
        }
        if (view.textField.getText().equals("Infinity") | view.textField.getText().equals("NaN")) {
        } else if (source == view.buttonDelete) {
            int length = view.textField.getText().length();
            int number = length - 1;
            if (length > 1) {
                StringBuilder back = new StringBuilder(view.textField.getText());
                back.deleteCharAt(number);
                view.textField.setText(back.toString());
            }
            if (view.textField.getText().endsWith("0")) {
                view.label.setText("on");
            }
        }
        else if (source == view.buttonZero) {
            if (model.isChangeable()) {
                view.textField.setText("0");
                model.setChangeable(false);
            } else if (view.textField.getText().equals("0")) {
                return;
            } else {
                view.textField.setText(view.textField.getText() + "0");
            }
        } else if (source == view.buttonOne) {
            if (model.isChangeable()) {
                view.textField.setText("1");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("2");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("3");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("4");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("5");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("6");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("7");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("8");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
            if (model.isChangeable()) {
                view.textField.setText("9");
                model.setChangeable(false);
            } else if (view.textField.getText().length() == 1) {
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
        } else if (source == view.buttonDot) {
            if (view.textField.getText().contains(".")) {
                return;
            } else {
                view.textField.setText(view.textField.getText() + ".");
            }

        } else if (source == view.buttonPlus) {
            String str = view.textField.getText();
            model.setNumber(Double.parseDouble(view.textField.getText()));
            view.textField.setText(Double.toString(model.getNumber()).replaceAll(".0", ""));
            model.setChangeable(true);
            view.label.setText(str + "+");
            model.setCalculation(1);

        } else if (source == view.buttonMinus) {
            String str = view.textField.getText();
            model.setNumber(Double.parseDouble(view.textField.getText()));
            view.textField.setText(Double.toString(model.getNumber()).replaceAll("0.", ""));
            model.setChangeable(true);
            view.label.setText(str + "-");
            model.setCalculation(2);
        } else if (source == view.buttonMul) {
            String str = view.textField.getText();
            model.setNumber(Double.parseDouble(view.textField.getText()));
            view.textField.setText(Double.toString(model.getNumber()).replaceAll("0.", ""));
            model.setChangeable(true);
            view.label.setText(str + "x");
            model.setCalculation(3);
        } else if (source == view.buttonDiv) {
            String str = view.textField.getText();
            model.setNumber(Double.parseDouble(view.textField.getText()));
            view.textField.setText(Double.toString(model.getNumber()).replaceAll("0.", ""));
            model.setChangeable(true);
            view.label.setText(str + "/");
            model.setCalculation(4);
        } else if (source == view.buttonSqrt) {
            model.setNumber(Double.parseDouble(view.textField.getText()));
            Double sqrt = Math.sqrt(model.getNumber());
            view.textField.setText(Double.toString(sqrt));
            view.label.setText(Double.toString(model.getNumber()) + "**0.5");
        } else if (source == view.buttonSquare) {
            String str = view.textField.getText();
            model.setNumber(Double.parseDouble(view.textField.getText()));
            double square = Math.pow(model.getNumber(), 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                view.textField.setText(string.replace(".0", ""));
            } else {
                view.textField.setText(string);
            }
            view.label.setText(str + "**2");
        } else if (source == view.buttonReciprocal) {
            model.setNumber(Double.parseDouble(view.textField.getText()));
            double reciprocal = 1 / model.getNumber();
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                view.textField.setText(string.replace(".0", ""));
            } else {
                view.textField.setText(string);
            }
            view.label.setText("1/" + Double.toString(model.getNumber()));
        } else if (source == view.buttonEqual) {
            //Setting functionality for equal(=) button
            switch (model.getCalculation()) {
                case 1:
                    model.setAnswer(model.getNumber() + Double.parseDouble(view.textField.getText()));
                    if (Double.toString(model.getAnswer()).endsWith(".0")) {
                        view.textField.setText(Double.toString(model.getAnswer()).replace(".0", ""));
                    } else {
                        view.textField.setText(Double.toString(model.getAnswer()));
                    }
                    view.label.setText("on");
                    break;
                case 2:
                    model.setAnswer(model.getNumber() - Double.parseDouble(view.textField.getText()));
                    if (Double.toString(model.getAnswer()).endsWith(".0")) {
                        view.textField.setText(Double.toString(model.getAnswer()).replace(".0", ""));
                    } else {
                        view.textField.setText(Double.toString(model.getAnswer()));
                    }
                    view.label.setText("on");
                    break;
                case 3:
                    model.setAnswer(model.getNumber() * Double.parseDouble(view.textField.getText()));
                    if (Double.toString(model.getAnswer()).endsWith(".0")) {
                        view.textField.setText(Double.toString(model.getAnswer()).replace(".0", ""));
                    } else {
                        view.textField.setText(Double.toString(model.getAnswer()));
                    }
                    view.label.setText("on");
                    break;
                case 4:
                    model.setAnswer(model.getNumber() / Double.parseDouble(view.textField.getText()));
                    if (Double.toString(model.getAnswer()).endsWith(".0")) {
                        view.textField.setText(Double.toString(model.getAnswer()).replace(".0", ""));
                    } else {
                        view.textField.setText(Double.toString(model.getAnswer()));
                    }
                    view.label.setText("on");
                    break;

            }
        }
    }
}

