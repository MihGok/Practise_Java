package Practise_Java.Practice4;

public abstract class Cars {
    private int speed;
    private float weight;
    private float maxDistance;
    private float maxExtraWeight;
    public abstract  Boolean WhetherAvailable(float distance);
    public abstract void calculatePrice(float distance,float weight);
    public abstract Boolean whetherToMuch(float weight);
}
