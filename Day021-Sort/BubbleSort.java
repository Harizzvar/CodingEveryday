import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr)  { //pass by value, but a copy of the reference is passed, so modifying original array itself and returning void
            for (int i = arr.length - 1; i > 0; i--) { // i = n - 1 to i = 1 
                
                int didSwap = 0; // to check if swaps did in current iteration, reset to zero in a new iteration
                
                for (int j = 0; j < i; j++) {// j = 0 to j = i - 1
                    if (arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        didSwap = 1;
                    }
                }
                if (didSwap == 0) {
                    return; //optimizes runtime in best case
                }
            }
    }



    public static void main(String[] args) {
        int[] arr = {5,4,3,8,11,9,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
