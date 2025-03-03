class SumZero {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        int i = 0, j = n - 1;
        while ( i < j){
            nums[i] = i + 1;
            nums[j] = - nums[i];
            i++;
            j--;
        }
        return nums;
    }  
}