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
    String curr;
    boolean res = false;
    JTextArea jta1 = new JTextArea(20, 45);
    public MouseMotionListener mouseMotionListeners;
    JButton button = new JButton("Add some Text");
    int curX;
    int curY;
    public Add() {
        super("Example");
        Random rand = new Random();
        number = rand.nextInt(0, 20);
        setSize(800, 800);
        JButton buttonNAO = new JButton("САО");
        JButton buttonZAO = new JButton("ЗАО");
        JButton buttonEAO = new JButton("ЮАО");
        JButton buttonWAO = new JButton("ВАО");
        JButton buttonCENTER = new JButton("ЦАО");

        buttonNAO.setBounds(800, 430, 60, 40);
        buttonNAO.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNAO.setForeground(Color.RED);
        buttonZAO.setBounds(100, 430, 60, 40);
        buttonZAO.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZAO.setForeground(Color.RED);
        buttonEAO.setBounds(300, 430, 60, 40);
        buttonEAO.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEAO.setForeground(Color.RED);
        buttonWAO.setBounds(500, 430, 60, 40);
        buttonWAO.setFont(new Font("Arial", Font.BOLD, 20));
        buttonWAO.setForeground(Color.RED);
        buttonCENTER.setBounds(400, 430, 60, 40);
        buttonCENTER.setFont(new Font("Arial", Font.BOLD, 20));
        buttonCENTER.setForeground(Color.RED);
        setLayout(new FlowLayout());
        add(buttonNAO);
        add(buttonEAO);
        add(buttonCENTER);
        add(buttonWAO);
        add(buttonZAO);
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