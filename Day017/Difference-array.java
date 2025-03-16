class Difference-array {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] difarr = new int[n + 1];
        int sum = 0;
        int k = 0; //query count
        for(int i = 0; i < n; i++){
            while (sum + difarr[i] < nums[i]){
                k++;
                if (k > queries.length) return -1;
                int l = queries[k - 1][0];
                int r = queries[k - 1][1];
                int val = queries[k - 1][2];
                if (r >= i) {
                    difarr[Math.max(l, i)] += val;
                    if (r + 1 < n + 1) difarr[r + 1] -= val;
                }
            }
            sum += difarr[i];
        }
        return k;
    }
}