package com.m6code;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("\nArray Before Sorting...");
        for(int value: intArray){
            System.out.print(value + " ");
        }

        quickSort(intArray,0, intArray.length);

        System.out.println("\nArray After Sorting...");
        for (int value: intArray){
            System.out.print(value + " ");
        }
    }

    public static void quickSort(int[] array, int start, int end){
        if (end - start < 2){
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        // This uses the first element as the pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        while(i < j){
            // Empty loop body
            while (i <j && array[--j] >= pivot);
            if (i < j){
                array[i] = array[j];
            }

            // Empty loop body
            while( i < j && array[++i] <= pivot);
            if (i < j){
                array[j] = array[i];
            }

        }

        array[j] = pivot;
        return j;
    }
}
