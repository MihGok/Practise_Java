package Practise_Java.Practice11;
import java.util.Scanner;
public class Developer {
    public String name;
    public int num;
    public int coef = 15;
    public void getTime(String name){
        try{
        long startTime = System.currentTimeMillis();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Integer number ");
        int number = input.nextInt();
        System.out.println("Enter result of multiplying of your number on 15");
        int result = input.nextInt();
        while (result!= number*coef){
            System.out.println("Think some more ");
            result = input.nextInt();
        }
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Developer " + name + " spent " + endTime/1000 + " seconds " + endTime%1000 + " milliseconds");
    }catch (Exception e){
            System.out.println("Number that you input is inappropriate ");
        }
    }
}
