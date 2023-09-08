package Practise_Java.Practice2;

import java.util.Scanner;

public class testball {
    public static void main(String[] args) {
        try {
            float x = 0.54f;
            float y = 0.6f;
            Scanner input = new Scanner(System.in);
            ball ball1 = new ball(x, y);
            System.out.println(ball1.toString());
            System.out.println("Enter new x coordinate");
            x = input.nextFloat();
            System.out.println("Enter new y coordinate");
            y = input.nextFloat();
            ball1.setXkord(x);
            System.out.println(ball1.toString());
            ball1.setXY(x, y);
            System.out.println(ball1.toString());
        } catch (Exception e) {
            System.out.println("Your number is too big, re input it");
        }
    }
}
