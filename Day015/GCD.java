public class GCD {
    public static int gcd(int a, int b) {
        while (a > 0 && b > 0){
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if ( a == 0){
            return b;
        }
        return a;
    }
    public static int gcdrec(int a, int b){
        if ( b == 0) {
            return a;
        }
        return gcdrec(b, a % b); //gcd(a,b) = gcd(b,r) 
        //replace with "return b == 0 ? a : gcdrec(b, a % b);"
    }
    public static int[] lcmAndGcd(int a, int b) {
        int hcf = gcd(a,b);
        int lcm = a * b / hcf;
        return new int[]{lcm, hcf};
    }
}
