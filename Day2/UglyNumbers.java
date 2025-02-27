import java.util.Scanner;
public class UglyNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            System.out.println(isUgly(sc.nextInt()));
        }
    }
    public static String isUgly(int n){
        if (n <= 0){
            return "not ugly";
        }
        if (n == 1){
            return "ugly";
        }
        return (n % 2 == 0) ? isUgly(n/2) :
               (n % 3 == 0) ? isUgly(n/3) :
               (n % 5 == 0) ? isUgly(n/5) :
               "not ugly";
    }
}