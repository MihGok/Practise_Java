package Practise_Java.Practice4;

import java.util.Random;
public class Phone {
    public int number;
    public String model;
    public float weight;

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("You are called by " +name);

    }
    public void sendMessage(String message,Integer ... numbers){
        System.out.println("Messege: "+ message + " Will be sent to");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number: " + numbers[i]);
        }
    }
    public Phone(int number, String model, float weight) {
        this(number,model);
        this.weight = weight;
     }
    public void receiveCall(String name,int number1){
        System.out.println("You are called by " +name + " his number is " + number1);
    }
    public Phone() {
        System.out.println("Congratulations you have bought an unknown phone with no sim card and physical embodiment");
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public static void main(String[] args){
        Random rand = new Random();

        Phone phone1 = new Phone(rand.nextInt(5000),"Android",194.5f);
        Phone phone2 = new Phone(rand.nextInt(5000), "Iphone",544);
        Phone phone3 = new Phone(rand.nextInt(5000), "Windows",4);
        Phone[] phones = {phone1,phone2,phone3};
        for (Phone cur:phones){
            int curNum = rand.nextInt(5000);
            System.out.println("Current number is " + cur.getNumber());
            cur.receiveCall("Vitya");
            System.out.println("More information about incoming call: ");
            cur.receiveCall("Vitya", curNum);
            cur.sendMessage("I will recall you later.",curNum,5987,5964);
            System.out.println(" ");
        }
    }
}
