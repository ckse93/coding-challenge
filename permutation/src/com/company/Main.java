package com.company;


import java.lang.reflect.Array;

// permutation of n element = n! time
// permutation of n element of m length = n! / (n-m)!
//      eg : 5 people seat in 3 chairs
//           5! / (5-3)!
public class Main {

    public static void printArray(Object[] arr){
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print('\n');
    }
    public static void permutation (Object[] arr, int size, int n) {
        if (size ==1) {
            printArray(arr);
        }
        for (int i = 0 ; i < size ; i++){
            permutation(arr, size-1, n);

            // if size is odd, swap first and last elem
            if (size % 2 == 1){
                Object tmp = arr[0];
                arr[0] = arr[size-1];
                arr[size-1] = tmp;
            }
            // if size is even, then swap ith and the last element
            else {
                Object tmp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here

        Integer[] arr = new Integer[] {1,2,3,4,5};
        permutation(arr, arr.length, arr.length);
        String[] arr2 = new String[] {"A","B","C"};
        permutation(arr2,arr2.length,arr2.length);
    }
}
