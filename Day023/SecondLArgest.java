class Solution {
    public int getSecondLargest(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < max && arr[i] > max2) max2 = arr[i];
        }
        return max2 != Integer.MIN_VALUE ? max2 : -1;
    }
}