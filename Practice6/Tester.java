package Practise_Java.Practice6;

public class Tester {
    public static void main(String [] args){
        MovableCircle circle1 = new MovableCircle(50,50,10,10,25);
        MovablePoint point1 = new MovablePoint(90,35,26,34);
        circle1.moveDown();
        point1.moveUp();
        System.out.println(circle1);
        System.out.println(point1);
    }
}
