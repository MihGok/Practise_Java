package Practise_Java.Practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: it must be >0 and <30");
        int summary = 0;
        float av = 0f;
        int maxim = Integer.MIN_VALUE;
        int minim = Integer.MAX_VALUE;
        int size = input.nextInt();
        while (size < 1 | size > 30) {
            System.out.println("Re input array length, please ");
            size = input.nextInt();
        }
        int[] array = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            summary += array[i];
        }
        av = summary / size;
        System.out.println("Your summ is " + summary);
        System.out.println("Your average is " + av);
        System.out.println("Enter array1 length: ");
        int size1 = input.nextInt();
        while (size1 < 1 | size > 30) {
            System.out.println("Re input array length, please ");
            size1 = input.nextInt();
        }
        int[] array1 = new int[size1];
        System.out.println("Insert array elements:");
        int a = 0;
        int summa1 = 0;
        while (a < size1) {
            int cur = input.nextInt();
            array1[a] = cur;
            summa1 += cur;
            if (maxim < cur) {
                maxim = cur;
            }

            if (minim > cur) {
                minim = cur;
            }

            a += 1;
        }

        System.out.println("Your maximum is " + maxim);
        System.out.println("Your minimum is " + minim);
        System.out.println("Your summ is " + summa1);
    }
}

