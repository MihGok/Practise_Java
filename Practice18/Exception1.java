package Practise_Java.Practice18;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try{
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }catch (Exception e){
            System.out.println("Error occured");
        }
        finally {
            System.out.println("Occured error");
        }
    }
}

