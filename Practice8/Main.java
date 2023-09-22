package Practise_Java.Practice8;
public class Main {
    private int result = 0;
    static private int num1 = 2;
    static private int i =2;
    public int SummaDigits(int number){
        if (number>=9){
            result+=number%10;
            number = number/=10;
            SummaDigits(number);
            return 0;
        }
        result+=number;
        return 0;
    }
    public void getRes(){
        System.out.println(result);
    }
    public static int Recursion(int len, int sum, int curLen, int curSum) {
        if (len == curLen) {
            if (sum == curSum) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += Recursion(len + 1, sum + i, curLen,curSum);
        }
        return res;
    }
    public static boolean Recursion1(int n){
        if (n<2){return false;}
        if (n==2){return true;}
        if (n%i == 0){return false;}
        if (i*2<n){
            i+=1;
            return Recursion1(n);
        }
        return true;
    }
    public static void Recurs(int numb) {
        if (num1 > numb / 2) {
            System.out.println(numb);
            return;
        }
        if (numb % num1 == 0) {
            System.out.print(num1 + "*");
            Recurs(numb / num1);
        }
        else {
            ++num1;
            Recurs(numb);
        }
    }
    public static void main(String[] args) {
        Main test5 = new Main();
        test5.SummaDigits(957);
        System.out.print("Summ of 157 is " );
        test5.getRes();
        System.out.print("Amount of numbers with 3 digits and summ 15 is ");
        System.out.println(test5.Recursion(0,0,3,15));
        System.out.print("Definition that 14 is prime is ");
        System.out.println(test5.Recursion1(14));
        System.out.print("You may say that 1574 is equal to ");
        test5.Recurs(1574);
    }
}