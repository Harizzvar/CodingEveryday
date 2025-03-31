import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void bubbleSort(int[] arr, int i) {

        if (i == 0) return; // base case
        int didSwap = 0;
        for (int j = 0; j < i; j++) { // j = 0 to j = i - 1
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }
        if (didSwap == 0) return;
        bubbleSort(arr, i - 1);
    }
    
    
    
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,11,9,1,2};
        bubbleSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
