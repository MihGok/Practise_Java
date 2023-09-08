package Practise_Java.Practice11;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
public class Time {
    public static void main(String[] args){
        try{
        Scanner input = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd MMMM yyyy");
        System.out.println("Enter current year");
        int userYear = input.nextInt();
        System.out.println("Enter number of current month");
        int userMonth = input.nextInt()-1;
        System.out.println("Enter current day");
        int userDay = input.nextInt();
        System.out.println("Enter current hour");
        int userHour = input.nextInt();
        System.out.println("Enter current minutes");
        int minutes = input.nextInt();
        cal.set(Calendar.YEAR,userYear);
        cal.set(Calendar.MONTH,userMonth);
        cal.set(Calendar.DATE,userDay-1);
        cal.set(Calendar.HOUR,userHour);
        cal.set(Calendar.MINUTE,minutes);
        System.out.println("Your date is "+ sdf.format(cal.getTime()));
    }catch (Exception e){
            System.out.println("Check your input date ");
        }
    }
}
