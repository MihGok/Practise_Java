package Practise_Java.Practice7;

public class Numer implements Numerable,Priceable{
    @Override
    public void getName() {
        System.out.println("Numer");
    }
    public static void main(String[] args){
        Numer num = new Numer();
        num.getName();
        System.out.println("Price is " + num.getprice());
    }

    @Override
    public int getprice() {
        return 85;
    }
}
