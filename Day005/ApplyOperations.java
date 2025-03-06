class ApplyOperations {
    public int[] applyOperations(int[] nums) {
        for( int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int index = 0;
        int[] out = new int[nums.length];
        for(int i : nums){
            if (i != 0){
                out[index++] = i;
            }
        }
        return out;
    }
}