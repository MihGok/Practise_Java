package Practise_Java.Practice9;
import java.util.ArrayList;
public class Student {
    public static void insertionSort(Integer ... arr) {
        for (int cur =0;cur<arr.length;cur++){
            int val = arr[cur];
            int index = cur-1;
            for (;index>=0;index--){
                if (val<arr[index]){
                    arr[index+1] = arr[index];
                }else{
                    break;
                }
            }
            arr[index+1] = val;
        }
        for (int curStScore = 0;curStScore<arr.length;curStScore++){
            System.out.print(arr[curStScore] + "  ");
        }
    }
}
