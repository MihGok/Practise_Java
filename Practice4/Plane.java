package Practise_Java.Practice4;

public class Plane extends Cars{
    private float priceOfMile = 15.8f;
    private int maxWeight = 25000;
    private int speed = 650;
    private float weight = 15500;

    @Override
    public Boolean WhetherAvailable(float distance) {
        return true;
    }


    @Override
    public Boolean whetherToMuch(float weight) {
        if (weight<maxWeight){
            return true;
        }
        else{
            return false;
        }
    }


    public void calculatePrice(float distance,float weight){
        float price = priceOfMile*distance;
        if (whetherToMuch(distance)){
                price*=(weight/maxWeight);
                System.out.println("It is available. Your price will be " + price);
        }
        else{
            System.out.println("Your weight is too much. It will be decreased until level of maximum weight. It is "+maxWeight);
        }
        System.out.println("You will achieve location in " +(distance/speed));
    };
}
