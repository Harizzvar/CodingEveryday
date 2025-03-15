class PrefixSum {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            if (prefixSum[i] < min){
                min = prefixSum[i];
            }
        }
        if (min <= 0){
            return 1 - min;
        }
        return 1;
    }
}