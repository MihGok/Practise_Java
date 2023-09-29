package Practise_Java.Practice14;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class DateCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String DATE_FORMAT = "dd/MM/yyyy";
        System.out.println("Enter your date in format of dd/MM/uuuu");
        String cur = input.nextLine();
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(cur);
            System.out.println("Your date is correct");
        } catch (Exception e) {
            System.out.println("Your date is not correct");;
        }
}
}
