package org.example.S14QuickSort;

public class QuickSort {

    // Pivot Helper function
    //    1. pivot -> the variable that you are checking (item you are sorting)
    //    2. i = the iterator that moves to the item you are comparing to pivot
    //    3. swap = the variable you use to swap i from the iterator to the swap place
    //    -> anytime there is a variable less than pivot variable; move swap up one and use it to swap with i
    //    4. return swap variable

    // Additional helper function to swap the variables based on the index
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    // Pivot
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex; // the swap index is initially set to the pivot index (starting point)
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) { // if the value at the i (iterator) is less than the value at the pivot index then...
                swapIndex++; // move the swap index up to the next open spot
                swap(array, swapIndex, i); // swap the i into the swap index
            }
        }
        swap(array, pivotIndex, swapIndex); // once you have iterated through the whole array then swap the pivot Index into the swap index spot and then all values to the left are less than pivot, all values to the right are greater than pivot index
        return swapIndex;
    }

    // Quick Sort.
    //      Sorted in place (no copy)
    public static void quickSortHelper(int[] array, int left, int right) {
        if (left < right){
            int pivotIndex = pivot(array, left, right); // rearranges the array to have the first index(pivot index) be in its sorted place, and returns the sorted Index, which is the new place the pivot index it now at
            quickSortHelper(array, left, pivotIndex-1); // quickSort the array items to the left of the sorted index
            quickSortHelper(array, pivotIndex+1, right); // quickSort the array items to the right of the sorted index
        }
    }

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }


} // QuickSort
