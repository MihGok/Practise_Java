package Practise_Java.Practice13;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Adress {
    public static void sorted(String str) {
        StringTokenizer res = new StringTokenizer(str, ",.;");
        while (res.hasMoreTokens())
            System.out.print(res.nextToken() + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string with this information (Country,Region,Town,Street,House,Flat) use on of the next parsers (,.;)");
        String information = input.nextLine();
        sorted(information);
    }
}
