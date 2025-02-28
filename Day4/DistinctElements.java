import java.util.*;
public class DistinctElements {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int k = sc.nextInt();
        if(k > n){
            System.out.println();
            return;
        }
        Set<String> set = new HashSet<>();
        int[] out = new int[n - k + 1];
        int index = 0;
        for(int i = 0; i <= n - k; i++ ){
            String[] subarr = Arrays.copyOfRange(arr, i, i + k);
            for( String s: subarr){
                set.add(s);
            }
            out[index++] = set.size();
            set.clear();
        }
        for(int i : out){
            System.out.print(i + " ");
        }
    }
}

