import java.util.Arrays;

public class RecursiveInsertionSort {
    
    public static  void insertionSort(int[] arr,int i) {
        if (i == arr.length) return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }
        insertionSort(arr,i + 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,11,9,1,2};
        insertionSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
