package Practise_Java.Practice20;
public class TestGenericBox {
    public static void main(String[] args) {
        Animal animal = new Animal();
        GenericBox<String,Integer,Animal> box1 = new GenericBox<String, Integer, Animal >("Hello",animal,2);
        String str = box1.getContent(); // явного понижающего преобразования (downcasting) не требуется
        System.out.println(box1);
        GenericBox<String,Integer,Animal> box2 = new GenericBox<String,Integer,Animal>("123",animal,5);
//автоупаковка типа int в тип Integer
        String i = box2.getContent(); // (downcast) понижающее   преобр. к типу Integer, автоупаковка в тип int
        System.out.println(box2);
        GenericBox<Double,Double,Animal> box3 = new GenericBox<Double,Double,Animal>(55.66,animal,5.0);
////автоупаковка типа double в тип Double
        double d = box3.getContent(); // (downcast) понижающее   преобр. к типу Double,
//автоупаковка в тип double
                System.out.println(box3);
    }
}