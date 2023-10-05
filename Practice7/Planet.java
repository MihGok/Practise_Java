package Practise_Java.Practice7;

public class Planet implements Numerable, Priceable{
    @Override
    public void getName() {
        System.out.println("Planet");
    }
    public static void main(String[] args){
        Planet planet = new Planet();
        planet.getName();
        System.out.println("Price is " + planet.getprice());
    }

    @Override
    public int getprice() {
        return 7145216;
    }
}
