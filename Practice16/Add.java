package Practise_Java.Practice16;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

class Add extends JFrame implements MouseListener,MouseMotionListener{
    Integer number;
    int count = 0;
    int cur;
    JFrame frame;
    String curr;
    boolean res = false;
    JTextArea jta1 = new JTextArea(20, 45);
    public MouseMotionListener mouseMotionListeners;
    JButton button = new JButton("Add some Text");
    int curX;
    int curY;
    public Add() {
        jta1.setEditable(false);
        jta1.setBounds(50,0,60,500);
        Random rand = new Random();
        button.setBounds(300,650,100,50);
        number = rand.nextInt(0, 20);
        setSize(800, 800);
        setLayout(new FlowLayout());
        add(button);
        add(jta1);
        jta1.append("Hello it is guess game. Enter your digit between 0 and 20");
        Game();
    }
    public void Update() {
        if (cur == number) {
            jta1.append("\nCongratulations, you have won");
            res = true;
        }
        if (cur < number) {
            jta1.append("\nYour number is less");
        }
        if (cur > number) {
            jta1.append("\nYour number is bigger");
        }
    }
    public void Game() {
        System.out.println(number);
        button.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (!res & count<3) {
                            String txt = JOptionPane.showInputDialog(null, "Insert your number");
                            cur = Integer.parseInt(txt);
                            count++;
                            Update();
                            if (count==3 & !res){
                                jta1.append("\nSorry, you have lost");
                            }
                        }else{
                            System.exit(1);
                        }
                    }
                });

    }

    public static void main(String[] args) {
        new Add().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        curX = MouseInfo.getPointerInfo().getLocation().x;
        curY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(curX+" " + curY);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        curX = MouseInfo.getPointerInfo().getLocation().x;
        curY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(curX+" " + curY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        curX = MouseInfo.getPointerInfo().getLocation().x;
        curY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(curX+" " + curY);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        curX = MouseInfo.getPointerInfo().getLocation().x;
        curY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(curX+" " + curY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        curX = MouseInfo.getPointerInfo().getLocation().x;
        curY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(curX+" " + curY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        curX = MouseInfo.getPointerInfo().getLocation().x;
        curY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(curX+" " + curY);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        curX = MouseInfo.getPointerInfo().getLocation().x;
        curY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println(curX+" " + curY);
    }
}