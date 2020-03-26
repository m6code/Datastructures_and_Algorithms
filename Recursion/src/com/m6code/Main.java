package com.m6code;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(iterativeFactorial(10));
        System.out.println(recursiveFactorial(10));
    }

    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }

        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }

        return fact;
    }

    public static int recursiveFactorial(int num){
        if (num == 0){
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }
}
