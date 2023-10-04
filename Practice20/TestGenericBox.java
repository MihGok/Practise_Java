package Practise_Java.Practice20;
public class TestGenericBox {
    public static void main(String[] args) {
        GenericBox<String,Integer,Double> box1 = new GenericBox<String, Integer, Double>("Hello",2.0,5);
        String str = box1.getContent(); // явного понижающего преобразования (downcasting) не требуется
        System.out.println(box1);
        GenericBox<Integer,Integer,Integer> box2 = new GenericBox<Integer,Integer,Integer>(123,5,4);
//автоупаковка типа int в тип Integer
        int i = box2.getContent(); // (downcast) понижающее   преобр. к типу Integer, автоупаковка в тип int
        System.out.println(box2);
        GenericBox<Double,Double,Double> box3 = new GenericBox<Double,Double,Double>(55.66,68.0,0.4);
////автоупаковка типа double в тип Double
        double d = box3.getContent(); // (downcast) понижающее   преобр. к типу Double,
//автоупаковка в тип double
                System.out.println(box3);
    }
}