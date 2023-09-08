package Practise_Java.Practice3;

public class Nu2 {
    public static void main(String args[]) {
        Double c = Double.valueOf("5");
        System.out.println("It is " + c);
        String l = "805";
        System.out.println("Double of 805 is " + Double.parseDouble(l));
        double forWhat = 15.75;
        int forWhat1 = (int)forWhat;
        byte forWhat2 = (byte)forWhat;
        float forWhat3 = (float)forWhat;
        short forWhat4 = (short)forWhat;
        char forWhat5 = (char)forWhat;
        long forWhat6 = (long)forWhat;
        System.out.println("It was" + forWhat);
        System.out.println("In float it is " + forWhat3);
        System.out.println("In long it is " + forWhat6);
        System.out.println("In int it is "+ forWhat1);
        System.out.println("In char it is " + forWhat5);
        System.out.println("In short it is " + forWhat4);
        System.out.println("In byte it is " + forWhat2);
        String d =Double.toString(3.14);
        System.out.println(d);
    }
}
