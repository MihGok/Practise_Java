package Practise_Java.Practice21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class All {
    public static <T> List<T> convertToList(T array[]) {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;

    }
    public static <T> void toOut(int index,T array[]){
        System.out.println(array[index]);
    }

    public static void main(String[] args) {
        Integer[] number = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list1 = convertToList(number);

        String[] string = new String[]{"Death", "Zero", "Lock"};
        List<String> list2 = convertToList(string);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        All all1 = new All();
        all1.toOut(2,number);
    }
}
