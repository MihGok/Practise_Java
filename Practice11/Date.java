package Practise_Java.Practice11;
import java.util.Scanner;
import java.util.Calendar;
public class Date {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("Enter current year");
        int userYear = input.nextInt();
        System.out.println("Enter number of current month");
        int userMonth = input.nextInt()-1;
        System.out.println("Enter current day");
        int userDay = input.nextInt();
        System.out.println("Enter current hour");
        int userHour = input.nextInt();
        if (year==userYear){
            if(month == userMonth){
                if (day == userDay){
                    if (hour == userHour){
                        System.out.println("Congratulations, everything is correct");
                    }else{
                        System.out.println("Hour is incorrect");
                    }
                }
                System.out.println("Day is incorrect");
            }else{
                System.out.println("Month is incorrect");
            }
        }else{
            System.out.println("Year is incorrect");
        }
        System.out.println("User entered: " + userHour +" " + userDay +" "+ userMonth+" " + userYear);
        System.out.println("System is: " + hour +" " + day +" "+ month+" " + year);
    }
}
