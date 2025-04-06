
public class RightRotate-k-times {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) return;
        
        int[] temp = new int[k];
        for(int i = nums.length - k; i < nums.length; i++) {
            temp[i - nums.length + k] = nums[i];
        }
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
