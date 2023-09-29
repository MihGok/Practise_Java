package Practise_Java.Practice14;
import java.util.Scanner;
public class GetPrices {
    public static void main(String[] args){
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string with prices ");
        String cur = input.nextLine();
        String[] arr = cur.split(",");
        for (int i =0;i<cur.length();i++){
            if (arr[i].contains("EU")){
                System.out.println(arr[i]);
            }if(arr[i].contains("RUB")){
                System.out.println(arr[i]);
            }if (arr[i].contains("USD")){
                System.out.println(arr[i]);
            }
        }
    }catch (Exception e){}}
}
