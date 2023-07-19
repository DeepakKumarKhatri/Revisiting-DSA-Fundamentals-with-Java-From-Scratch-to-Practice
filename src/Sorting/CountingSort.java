package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        countingSort(arr);
    }

    private static void countingSort(int[] arr) {

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            maximum = Math.max(maximum,arr[i]);
        }

        int[] count = new int[maximum+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

    }
}
