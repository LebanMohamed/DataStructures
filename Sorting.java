import java.util.*;

public class Sorting {
 
    //Best case O(n): array already sorted because there's no swaps
    //Worse/Average case O(n^2): array is in reverse order
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { // -i improves the sort
                System.out.println(arr[j] + " " + arr[j + 1]);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Worse/Average/Best case O(n^2): same number of comparisons no matter what the pattern of data
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimumNumber = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minimumNumber] > arr[j]) {
                    minimumNumber = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minimumNumber];
            arr[minimumNumber] = temp;
        }
    }

    //Best case O(n): array already sorted because there's no swaps
    //Worse/Average case O(n^2): array is in reverse order
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int insert = arr[i];

            while ((j > 0) && (arr[j - 1] > insert)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = insert;
        }

    }
    
    static void bubbleSortRec(int[] arr, int i) {
        if (i == arr.length - 1)
            return;
        
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        bubbleSortRec(arr, i + 1);
    }
}



