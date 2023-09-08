package Practise_Java.Practice9;
import java.util.ArrayList;
public class Student {
    public static void insertionSort(Integer ... arr) {
        for (int cur =0;cur<arr.length;cur++){
            int val = arr[cur];
            int i = cur-1;
            for (;i>=0;i--){
                if (val<arr[i]){
                    arr[i+1] = arr[i];
                }else{
                    break;
                }
            }
            arr[i+1] = val;
        }
        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j] + "  ");
        }
    }
}
