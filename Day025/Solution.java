import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] nums, int n) {
        int temp = nums[0];
        for(int i = 0; i < nums.length - 1; i++){
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }
}
