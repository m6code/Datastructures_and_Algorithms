package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArrray = new int[7];
        intArrray[0] = 20;
        intArrray[1] = 35;
        intArrray[2] = -15;
        intArrray[3] = 7;
        intArrray[4] = 55;
        intArrray[5] = 1;
        intArrray[6] = -22;

//        for (int i = 0; i < intArrray.length; i++) {
//            System.out.println(intArrray[i]);
//        }


        // Search for a number in the array and return the index where it is found
        // or return -1 if not found.
        int index = -1;
        int searchVal = 55;
        for (int i = 0; i < intArrray.length; i++) {
            if (intArrray[i] == searchVal) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.printf("Found %d at index %d ", searchVal, index);
        } else
            System.out.printf("%d was not found in the array", searchVal);

    }
}
