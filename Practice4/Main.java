package Practise_Java.Practice4;

public class Main {
    public static String getDescription() {
        return "Холодное время года";
    }
    public static String getDescription(int i) {
        return "Теплое время года";
    }
    public static void main(String[] args) {
        Level time = Level.Winter;
        Level time1 = Level.Spring;
        Level time2 = Level.Summer;
        Level time3 = Level.Autumn;
        int p = 4;
        Level[] arr = {time1,time2,time3,time};
        for (Level cur:arr){
            switch (cur) {
                case Summer:
                    System.out.println("Current time is Summer");
                    System.out.println("Favourite time of year");
                    System.out.println(getDescription(p));
                    System.out.println("Temperature is "+cur.getAvTemperature());
                    System.out.println(" ");
                    break;
                case Winter:
                    System.out.println("Current time is Winter");
                    System.out.println("After Autumn");
                    System.out.println(getDescription());
                    System.out.println("Temperature is "+cur.getAvTemperature());
                    System.out.println(" ");
                    break;
                case Spring:
                    System.out.println("Current time is Spring");
                    System.out.println("It is before summer");
                    System.out.println(getDescription());
                    System.out.println("Temperature is " + cur.getAvTemperature());
                    System.out.println(" ");
                    break;
                case Autumn:
                    System.out.println("Current time is Autumn");
                    System.out.println("It is after summer");
                    System.out.println(getDescription());
                    System.out.println("Temperature is " + cur.getAvTemperature());
                    System.out.println(" ");
                    break;
            }
        }
    }
}