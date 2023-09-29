package Practise_Java.Practice14;
import java.util.Scanner;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string ");
        String example = "abcdefghijklmnopqrstuv18340";
        String toCheck = input.nextLine();
        System.out.println(toCheck.matches(example));
        System.out.println(toCheck.lines().findAny());
    }
}