package Practise_Java.Practice11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Date;
public class test {
    public static void main(String[] args){
        ArrayList<Long> testSubject1 = new ArrayList<>();
        LinkedList<Long> testSubject2 = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (long i = 0;i<50000;i++){
            testSubject1.add(i);
        }
        testSubject1.contains(27);
        testSubject1.remove(42);
        testSubject1.clear();
        long endTime1 = System.currentTimeMillis();
        for (long i = 0;i<50000;i++){
            testSubject2.add(i);
        }
        testSubject2.contains(27);
        testSubject2.remove(42);
        testSubject2.clear();
        long finTime = System.currentTimeMillis();
        long time1 = endTime1-startTime;
        long time2 = finTime-endTime1;
        System.out.println("It takes ");
        System.out.println(time1+" for the first and");
        System.out.println(time2 + " for the second");
    }

}
