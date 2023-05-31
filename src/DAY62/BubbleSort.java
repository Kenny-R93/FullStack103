package DAY62;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int arr[]={4,1,3,9,7};
        int n=arr.length;
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int arr2Length = arr.length;


        bubbleSort(arr, arr.length);
        System.out.println("Sorted arr: " + Arrays.toString(arr)); // convert arrays to string to display on console

        bubbleSort(arr2, arr2.length);
        System.out.println("Sorted arr2: " + Arrays.toString(arr2)); // convert arrays to string to display on console
    }


    public static void bubbleSort(int[] arr, int n){

        int i, j, temp;

        for (i = 0; i < n - 1; i++) { // Iterate over the array
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
