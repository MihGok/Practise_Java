package Practise_Java.Practice14;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.*;

public class PasswordCheck {
    public static boolean Check(String password){
        int[] array = new int[10];
        boolean haveInt = false;
        for (int i =0;i<10;i++){array[i]=i;}
        if (password.length()<8){return false;}
        if (password.toLowerCase().equals(password)){return false;}
        if (password.toUpperCase().equals(password)){return false;}
        for (int i =0;i<10;i++){
            if (password.contains(Integer.toString(i))) {haveInt = true;}}
        if (haveInt == false){return false;}
        if (!password.equals(password.replaceAll("[^a-zA-Z]", "0"))){return false;}
        if (!password.equals(password.replaceAll("_", "0"))){return false;}
        return true;
    }
    public static void main(String[]args){
        System.out.println("Enter your password");
        Scanner input = new Scanner(System.in);
        String passsword = input.nextLine();
        System.out.println(Check(passsword));
    }
}
