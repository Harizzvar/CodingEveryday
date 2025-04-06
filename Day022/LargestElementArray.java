class Solution {
    
    public static int[] mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return new int[] {arr[left]};
        }
        
        int mid = left + (right - left)/2;
        int[] sub1 = mergeSort(arr, left, mid);
        int[] sub2 = mergeSort(arr, mid + 1, right);
        int[] out = new int[sub1.length + sub2.length];
        int i = 0, j = 0;
        for(int k = 0; k < out.length; k++) {
            if (i < sub1.length && (j >= sub2.length || sub1[i] < sub2[j])) {
                out[k] = sub1[i++];
            }
            else {
                out[k] = sub2[j++];
            }
        }
        return out;
    }
    
    
    public static int largest(int[] arr) {
        arr = mergeSort(arr,0,arr.length-1);
        return arr[arr.length - 1];
    }
}
