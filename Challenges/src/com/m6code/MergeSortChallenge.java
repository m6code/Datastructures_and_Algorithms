package com.m6code;

public class MergeSortChallenge {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Array Before Sorting...");
        for (int val : intArray) {
            System.out.print(val + " ");
        }

        mergeSort(intArray, 0, intArray.length);

        System.out.println("\nArray After Sorting ... Desc");
        for (int val : intArray) {
            System.out.print(val + " ");
        }
    }


    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid-1] >= arr[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = arr[i] >= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }
}
