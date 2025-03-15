import java.util.*;
public class SieveOfEratosthenes {
    public static ArrayList<Integer> SieveOfEratosthenes(int n){ //returns an arraylist containing primes upto n
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.fill(isPrime, true);
        isPrime[1] = isPrime[0] = false;
        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if (isPrime[i]) res.add(i); 
        }
        return res; 
    }
}
