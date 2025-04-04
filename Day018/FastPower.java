class FastPower {
    public double myPow(double x, int n) {
        if (x == 0 || x == 1){
            return x;
        }
        if (n == 0){
            return 1;
        }
        if ( n < 0){
            x = 1/x;
            n = -(n + 1);
            return x * myPow(x, n);
        }
        double half = myPow(x, n/2);
        if (n % 2 == 0){
            return half * half;
        }
        else {
            return x * half * half;
        }
    }
}
