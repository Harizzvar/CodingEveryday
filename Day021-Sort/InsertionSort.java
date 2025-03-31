import java.util.Arrays;

public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length ; i++) { //range(0, 1) is sorted, so start fom i = 1, ie range (0, 2)
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) { //swap as long as j greater than zero and arr[j - 1] is greater than arr[j]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,11,9,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
