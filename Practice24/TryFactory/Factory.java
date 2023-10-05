package Practise_Java.Practice24.TryFactory;

public class Factory {
    public static void main(String[] args){
        Factory fac = new Factory();
        MagicanChair mag = new MagicanChair();
        System.out.println(fac.sit(mag));
    }
    public String sit(Chair chair){
       return chair.doSomething();
    }
}
