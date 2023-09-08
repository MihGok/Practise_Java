package Practise_Java.Practice1;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        try {
            int cur = 1;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter phactorial number");
            int max = input.nextInt();
            while (max<0){
                System.out.println("Your number is less then 0, re input it");
                max = input.nextInt();
            }
            for (int i = 2; i <= max; i++) {
                cur *= i;
            }
            System.out.println("Your phactor is " + cur);
        }catch (Exception e){
            System.out.println("Your number is too big, re input it");
        }

    }
}