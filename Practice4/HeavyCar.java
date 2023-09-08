package Practise_Java.Practice4;
import java.util.Random;

public class HeavyCar extends Cars{
    private int speed = 40;
    private float weight = 5500;
    private float maxDistance = 800f;
    private float priceOfMile = 5.8f;
    private int maxWeight = 8500;
    @Override
    public Boolean WhetherAvailable(float distance) {
        if (distance<=maxDistance){
           return true;
        }else{
            return false;
        }

    }
    public Boolean whetherToMuch(float weight){
        if (weight<maxWeight){
            return true;
        }
        else{
            return false;
        }
    };

    public void calculatePrice(float distance,float weight){
        Random extra = new Random();
        float coef = extra.nextFloat();
        if (WhetherAvailable(distance)){
            if (whetherToMuch(weight)){
                float price = (coef + 1)*weight*distance*priceOfMile;
                System.out.println("Location is achivable and weight is appropriate");
                System.out.println("Your price is " + price);
                System.out.println("Yuu will achive it in " + distance/speed);
            }
        }else{
            System.out.println("Location is unachivable or weight is too much");
        }
    }
}


