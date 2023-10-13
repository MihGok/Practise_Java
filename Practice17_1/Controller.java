package Practise_Java.Practice17_1;

import javax.swing.*;
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
        view.buttonEqual.addActionListener(this);
        createNumber();
    }
    public void createNumber(){
        model.setGuess(rand.nextInt(0,20));
        System.out.println(model.getGuess());
    }
    public String Check(int curX, int curY) {
        if(curY<55|curX<407|curY>810|curX>1190){return "outside";}
        if (curY > 600) {
            return "Юг";
        } else {
            if (curY > 180 & curY < 600 & curX > 400 & curX < 615) {
                return "Запад";
            } else {
                if (curX > 995 & curX < 1195 & curY < 600 & curX > 180) {
                    return "Восток";
                } else {
                    if (curY < 180) {
                        return "Север";
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

        } else if (source == view.buttonEqual) {
            if (model.getAmount() == 3) {
                view.label.setText("You are not worthy");
                view.textField.setText("Become better and return");
                view.disable();
            }
            String txt = JOptionPane.showInputDialog(null, "Insert your number");
            Integer cur = 0;
            try{
                cur =  Integer.parseInt(txt);
                System.out.println(cur);}
            catch (Exception y ){
                view.textField.setText("You entered not a number");
            }
            if (cur == model.getGuess()) {
                view.label.setText("Victory");
                view.disable();
            }
            if (cur > model.getGuess()) {
                view.label.setText("Decrease your number");
            }
            if (cur < model.getGuess()) {
                view.label.setText("Increase your number");
            }
            view.textField.setText("0");
            model.setAmount(model.getAmount()+1);
        }
    }
}
