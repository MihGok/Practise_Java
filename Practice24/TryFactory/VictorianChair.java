package Practise_Java.Practice24.TryFactory;

import java.util.Random;

public class VictorianChair implements Chair {
    public String doSomething(){
        Random rand = new Random();
        Integer sum = rand.nextInt();
        return "This chair age is " + Integer.toString(sum);
    }
}
