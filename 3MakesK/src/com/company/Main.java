package com.company;

public class Main {
    private static int max(int[] arr) {
        int max = arr[0];
        try {
            for (int i : arr) {
                if (i > max)
                    max = i;
            }
        }
        catch (Exception e){
            System.out.print("error");
        }
        return max;
    }

    private static boolean does3makesA(int[] arr, int A) { // best case O(n), worst case O(n)+O(n^3)
        int maxelem = max(arr);
        if (maxelem*3 < A){  // first filter. O(n)
            return false;
        }
        int arrlen = arr.length;
        int first,second,third;
        for (int i = 0; i<arrlen; i++){
            first = arr[i];
            for (int j = 0; j<arrlen; j++){
                second = arr[j];
                for (int k = 0 ; k<arrlen; k++){
                    third = arr[k];
                    int tot = first+second+third;
                    if (tot == A) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9,10,2,4,3};
	System.out.println(max(arr));

	if (does3makesA(arr, 16)){
	    System.out.print("yes");
    }
	else {
	    System.out.print("Nah man");
    }
    }
}
