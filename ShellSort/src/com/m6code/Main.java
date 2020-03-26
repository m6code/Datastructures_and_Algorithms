package com.m6code;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1 -22};

        System.out.println("Array Before Sorting...");
        for (int value : intArray) {
            System.out.print(value + " ");
        }

        for(int gap = intArray.length/2; gap > 0; gap /= 2){
         for(int i = gap; i < intArray.length; i++){
             int newElement = intArray[i];

             int j = i;

             while (j >= gap && intArray[j - gap] > newElement){
                 intArray[j] = intArray[j-gap];
                 j -= gap;
             }

             intArray[j] = newElement;
         }
        }

        System.out.println("\nArray After Sorting...");
//        for (int i = 0; i <intArray.length ; i++) {
//            System.out.print(intArray[i] + " ");
//        }
        // Using Enhanced for loops
        for (int value : intArray) {
            System.out.print(value + " ");
        }
    }
}
