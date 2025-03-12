class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int neg = nums.length, pos = nums.length; // neg for count of negative ints, pos for index of first positive int
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] >= 0) { //to find index of first non-negative integer
                neg = mid; //update neg to number of negative integers
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        left = 0; right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] > 0) { //to find index of first positive integer
                pos = mid; //update pos to index of first positive int (count of neg + zero)
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return Math.max(neg, nums.length - pos);
    }
}
