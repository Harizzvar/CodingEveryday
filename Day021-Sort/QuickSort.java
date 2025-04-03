import java.util.Arrays;

public class QuickSort {
    
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = partition(arr, left, right);
        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right );
    }
    
    public static int partition(int[] arr, int pivot, int right) { //first or leftmost element is taken as pivot
        int i = pivot + 1;
        int j = right;
        while (i <= j) {
            if (arr[i] < arr[pivot]) {
                i++;
                continue;
            }
            if (arr[j] > arr[pivot]) {
                j--;
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,8,11,9,1,2,15};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
