package Practise_Java.Practice24.TryFactory;
import java.util.Random;
public class FunctionalChair implements Chair{
    public String doSomething(){
        Random rand = new Random();
        Integer sum = rand.nextInt() + rand.nextInt();
        return "This chair costs" + Integer.toString(sum);
    }
}
