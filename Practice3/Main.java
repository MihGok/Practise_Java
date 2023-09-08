package Practise_Java.Practice3;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter integer number between 5 and 25");
            int number = input.nextInt();
            while (number < 5 | number > 25) {
                System.out.println("Please reinput your integer number");
                number = input.nextInt();
            }
            ;
            ArrayList<Integer> ms1 = new ArrayList<Integer>();
            Random rand = new Random();
            int[] ms = new int[number];
            for (int i = 0; i < number; i++) {
                int cur = rand.nextInt(number);
                ms[i] = cur;
                if (cur % 2 == 0) {
                    ms1.add(cur);
                    System.out.println("lwdoalda" + ms1.get(i) + "\n");

                }
                ;
            }
            for (int i = 0; i < number; i++) {
                System.out.println(ms[i]);
            }
            System.out.println("End of massive with all numbers \n");
            for (int i = 0; i < ms1.size(); i++) {
                System.out.println(ms1.get(i));
            }
        }
    }
