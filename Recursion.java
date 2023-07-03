package Algorithms;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {

//        System.out.println(factorialIterarion(6));
//        System.out.println(factorialRecursive(6));
//        int[]fibonacci = fibonacciIteration(10);
//        System.out.println(Arrays.toString(fibonacci));
        System.out.println("Число Фибоначчи = " +  fibonacciRecursive(10));


    }

//    static int factorialIterarion(int n){
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result = result * i;
//
//        }
//        return result;
//    }
//
//    static int factorialRecursive(int n) {
//        if (n == 1){
//            return 1;
//        }
//        return n * factorialRecursive(n-1);
//    }


    private static long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-2) + fibonacciRecursive(n - 1);
    }



//    static int [] fibonacciIteration(int n){
//        int[] result = new int[n];
//        if (n > 1){
//            result[0] = 0;
//        }
//        if (n > 2){
//            result[1] = 1;
//        }
//            for (int i = 2; i < n; i++) {
//                result[i] = result [i - 1 ] + result[i - 2];
//            }
//            return result;
//        }
    }

