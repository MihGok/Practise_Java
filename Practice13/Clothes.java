package Practise_Java.Practice13;

public class Clothes {
    public static void toString(String str) {
        str.split(",");
    }

    public static void main(String[] args) {
        String[] shirts = {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L", "S003,Blue Polo Shirt,Blue,XL", "S004,Blue Polo Shirt,Blue,M", "S005,Tan Polo Shirt,Tan,XL", "S006,Black T-Shirt,Black,XL", "S007,White T-Shirt,White,XL", "S008,White T-Shirt,White,L", "S009,Green T-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Purple,S"};
        Shirt shirt1 = new Shirt();
        for (String cur : shirts) {
            cur.split(",");
            shirt1.shirt(cur.split(","));
        }
    }
}
