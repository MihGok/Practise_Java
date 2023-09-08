package Practise_Java.Practice12;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.Color.*;

public class Main extends JComponent implements KeyListener, ActionListener {
    private int xPos = 120, yPos = 120, width = 40, height = 40;
    Rectangle rect = new Rectangle(xPos, yPos, width, height);
    Timer t = new Timer(5, this);
    static Color[] colors = {YELLOW, PINK, RED, GREEN, GRAY, BLUE};

    public static void main(String[] args) {
        Main main = new Main();
        JFrame f = new JFrame("Title animation");
        f.setSize(600, 600);
        f.setVisible(true);
        f.setLocation(550, 50);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.add(main);
        f.addKeyListener(main);
        Random rand = new Random();
        f.getContentPane().setBackground(colors[rand.nextInt(6)]);
    }

    public void paint(Graphics g) {
        Graphics2D g1 = (Graphics2D) g;
        g1.fill(rect);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("x  " + rect.x + "     y  " + rect.y);
        if (rect.x + 10 + rect.width < 600 & rect.x > 0 & rect.y + 30 + rect.height < 600 & rect.y > 0) {
            if (e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
                rect.setLocation(rect.x + 10, rect.y);
            }
            if (e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
                rect.setLocation(rect.x - 10, rect.y);
            }
            if (e.getExtendedKeyCode() == KeyEvent.VK_UP) {
                rect.setLocation(rect.x, rect.y - 10);
            }
            if (e.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
                rect.setLocation(rect.x, rect.y + 10);
            }
        } else {
            rect.setLocation(150, 150);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
