class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int min_index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]){
                min_index = i + 1;
                break;
            }
        }
        for (int i = min_index; i < min_index + nums.length - 1; i++){
            if (nums[(i + 1) % nums.length] < nums[i % nums.length]) return false;
        }
        return true;
    }
}
