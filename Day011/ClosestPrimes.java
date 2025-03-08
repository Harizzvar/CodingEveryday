import java.util.*;
class ClosestPrimes {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = primes(left,right);
        int[] ans = {-1, -1};
        if (arr.size() < 2){
            return ans;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size() - 1; i++){
            int dif = arr.get(i + 1) - arr.get(i);
            if(dif < min){
                min = dif;
                ans[0] = arr.get(i);
                ans[1] = arr.get(i + 1);
            }
        }
        return ans;
    }
    public ArrayList<Integer>  primes (int m, int  n){
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = m; i <= n; i++){
            if(isPrime[i])
            arr.add(i);
        }
        return arr;
    }
}