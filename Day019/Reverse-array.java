class Solution {
    public void reverseArray(int arr[]) {
        helper(arr,0,arr.length - 1);
    }
    public void helper(int[] arr, int left, int right){
        if(left >= right) {
            return;
        }
        arr[left] = arr[left] + arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];
        helper(arr,left + 1, right - 1);
    }
}  
