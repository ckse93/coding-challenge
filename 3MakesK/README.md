# 3MakesK
given an int array, and an integer K, is there a combination of 3 elements of array that makes K? 

## flow 
there is a function does3makesA(), which calls max(), which returns max element of an array, runs in O(n). does3MakesA check if K is larger than max*3, if so, return false for there exist no combination in the array that makes K.
if max is smaller than or equal to K, does3makesA runs 3 nested for loop for calculation to check if 3 elements makes K.
