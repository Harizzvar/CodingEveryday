import java.util.*;
class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length * grid.length;
        int sum = 0;
        int[] ans = new int[2];
        for(int[] row : grid){
            for(int i : row){
                if (!set.add(i)){
                    ans[0] = i;
                }
                sum += i;
            }
        }
        ans[1] = n*(n + 1)/2 - sum + ans[0];
        return ans;
    }
}