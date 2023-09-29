package Practise_Java.Practice14;
import java.util.Scanner;
public class CheckPlus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Boolean res = false;
        System.out.println("Enter your definition");
        String cur = input.nextLine();
        String[] array = cur.split("[+]");
        if (array.length<2){
            res = false;
        }

        int i =0;
        while (i<array.length/2*2){
            int max = array[i].length()-2;
            if (array[i].charAt(max) == '1'|| array[i].charAt(max) == '2' || array[i].charAt(max) == '3'|| array[i].charAt(max) == '4' || array[i].charAt(max) == '5' || array[i].charAt(max) == '6' || array[i].charAt(max) == '7'|| array[i].charAt(max) == '8'|| array[i].charAt(max) == '9'|| array[i].charAt(max) == '0'){
                res = true;
            }
            if (array[i].charAt(max) == '1'|| array[i].charAt(max) == '2' || array[i].charAt(max) == '3'|| array[i].charAt(max) == '4' || array[i].charAt(max) == '5' || array[i].charAt(max) == '6' || array[i].charAt(max) == '7'|| array[i].charAt(max) == '8'|| array[i].charAt(max) == '9'|| array[i].charAt(max) == '0'){
                    res = true;

            }
            i+=2;
        }
        if (res){
            System.out.println("There are some");
        }else{
            System.out.println("There is no one of them");
        }
    }
}
