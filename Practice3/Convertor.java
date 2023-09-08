package Practise_Java.Practice3;

import java.util.Scanner;
import java.util.Formatter;
public class Convertor {
    public static void main(String[] args){
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ammount of money ");
        float amount = input.nextFloat();
        System.out.println("Enter the first currency enhance rate in comparison with dollar");
        float coef1 = input.nextFloat();
        System.out.println("Enter the second currency enhance rate in comparison with dollar");
        float coef2 = input.nextFloat();
        float amount1 = amount*coef1/coef2;
        double x = 11.635;
        System.out.printf("Amount of money in new currency is %.5f", amount1);
    }catch (Exception e){
            System.out.println("You are too rich ");
        }
    }
}
