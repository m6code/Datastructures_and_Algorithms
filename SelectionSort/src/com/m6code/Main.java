package com.m6code;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 25, -15, 7, 55, 1, -22};


        System.out.println("Array Before Sorting ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }


        // Implement SelectionSort Logic Here
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        System.out.println("\nArray After Sorting ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (j == i) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
