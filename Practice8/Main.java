package Practise_Java.Practice8;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private int otvet1 = 0;
    private int k =0 ;
    private int d = 0;
    static private int z = 2;
    static private int i =2;
    public int summaCifr(int number){
        if (number>=9){
            otvet1+=number%10;
            number = number/=10;
            summaCifr(number);
            return 0;
        }
        otvet1+=number;
        return 0;
    }
    public void getRes(){
        System.out.println(otvet1);
    }
    public static int Recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += Recursion(len + 1, sum + i, k, s);
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
    public static void Recurs(int n) {
        if (z > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % z == 0) {
            System.out.print(z + "*");
            Recurs(n / z);
        }
        else {
            ++z;
            Recurs(n);
        }
    }
    public static void main(String[] args) {
        Main test5 = new Main();
        test5.summaCifr(957);
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