package com.company;

/*
* Objective
* Given an integer k and an array of ints, find the kth largest element of the array
* */

public class Main {

    private static int partition (int left, int right, int arr[]){
        int pivot = arr[(left + right)/2];
        System.out.println("pivot : " + pivot);
        while(left<right){
            while ((arr[left] < pivot) && (left < right)){
                left++;
            }
            while ((arr[right] > pivot) && (left < right)){
                right--;
            }
            if (left < right) { // swap function.
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        return left;
    }

    public static void quickSort(int l, int r, int[] arr){
        if (l < r) {
            int newPivot = partition(l,r,arr);
            quickSort(l,newPivot-1,arr);
            quickSort(newPivot+1,r, arr);
        }
    }

    public static void printIthBig(int[] arr, int i) {
        System.out.print("\n");
        try {
            System.out.println(i + "th biggest element is " + arr[i-1]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,4,2,6,342,1223,5,322,431,82,12455,0};
        quickSort(0,array.length-1, array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        printIthBig(array, 2);  // 2nd biggest element print
    }
}
