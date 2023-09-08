package Practise_Java.Practice4;

import java.util.Random;

public class Train extends Cars{
    public int speed = 140;
    public float weight = 25500;
    public float maxDistance = 40800f;
    public float priceOfMile = 10.8f;
    public int maxWeight = 85000;
    @Override
    public Boolean WhetherAvailable(float distance) {
        if (distance<=maxDistance){
            return true;
        }else{
            return false;
        }

    }
    public Boolean whetherToMuch(float weight1){
        if (weight+weight1<maxWeight){
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
                System.out.println("You will achive it in " + distance/speed + " hours");
            }
        }else{
            System.out.println("Location is unachivable or weight is too much. Everything will be downgrated to maximum values");
            float price = maxDistance*maxWeight*priceOfMile*2;

    }
}
    public static void main(String[] args){
        Train train1 =new Train();
        train1.calculatePrice(39500f,50000f);
    }
}
