package Practise_Java.Practice13;

public class Person {
    public static String create(String full){
        String[] data = full.split(" ");
        String res = "";
        res = new StringBuffer().append(data[0]).toString();
        if (data.length==2){
            res = new StringBuffer().append(data[0]).append(". ").append(data[1]).toString();
        }
        if (data.length==3)
            res = new StringBuffer().append(data[0]).append(". ").append(data[1]).append(". ").append(data[2]).toString();
        return res;
    }
    public static void main(String[] args){
        System.out.println(create("Голиков Сергеевич"));
    }
}
