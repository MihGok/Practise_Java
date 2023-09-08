package Practise_Java.Practice4;

public class Ship extends Cars{
    private int speed = 20;
    private float maxDistance = 8000f;
    private float priceOfMile = 2.8f;
    public Boolean WhetherAvailable(float distance) {
        if (distance<=maxDistance){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public void calculatePrice(float distance,float weight){
        float price = priceOfMile*distance;
        if (WhetherAvailable(weight)){
                price*=(distance/maxDistance);
                System.out.println("It is available. Your price will be " + price);
            }
        else{
            System.out.println("Your distance is too much. It will be decreased until level of maximum distance. It is "+maxDistance);
        }
        System.out.println("You will achieve location in " +(distance/speed));
    };

    public Boolean whetherToMuch(float distance) {
        return true;
    }
}
