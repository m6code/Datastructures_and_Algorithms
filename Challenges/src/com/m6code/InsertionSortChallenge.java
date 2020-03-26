package com.m6code;

public class InsertionSortChallenge {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1 - 22};
        System.out.println("Array Before Sorting...");
        for (int val : intArray) {
            System.out.print(val + " ");
        }
        insertionSort(intArray,intArray.length);
        System.out.println("\n\nArray After Sorting...");
        for (int val : intArray) {
            System.out.print(val + " ");
        }
    }

    public static void insertionSort(int[] array, int noItems) {
        if (noItems < 2) {
            return;
        }

        insertionSort(array, noItems - 1);
        int newElement = array[noItems-1];
        int i;
        for (i = noItems - 1; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }
        array[i] = newElement;

        System.out.println("\nResult of call when number of Items = " + noItems);
        for (int value : array){
            System.out.print(value + " ");
        }
        System.out.print("\n-------------------------------------");


    }
}
