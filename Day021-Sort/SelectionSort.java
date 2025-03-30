import java.util.Arrays;

public class SelectionSort {
    
    public static int[] selectionSort(int[] arr) {
    
        for (int i = 0; i < arr.length - 1; i++){
            int minind = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minind]) {
                    minind = j;
                }
            }
            int temp = arr[i] + arr[minind];
            arr[minind] = temp - arr[minind];
            arr[i] = temp - arr[i];
        }

        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,11,9,1,2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
