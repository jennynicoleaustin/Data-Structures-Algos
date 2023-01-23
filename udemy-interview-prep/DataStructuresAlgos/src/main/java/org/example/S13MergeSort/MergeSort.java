package org.example.S13MergeSort;

public class MergeSort {

    // Helper function to combine two arrays
    //    requires two sorted arrays as parameters
    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int combinedIndex = 0; // index of combined array
        int arr1Index = 0;
        int arr2Index = 0;

        while (arr1Index < array1.length && arr2Index < array2.length) {
            if (array1[arr1Index] < array2[arr2Index]) {
                combined[combinedIndex] = array1[arr1Index]; // place the item from array 1 into the combined index
                combinedIndex++; // move index of combined to the right 1
                arr1Index++;  // move index of array1 to the right 1
            } else {
                combined[combinedIndex] = array2[arr2Index]; // place the item from array 2 into the index
                combinedIndex++;
                arr2Index++;
            }
        }
        while (arr1Index < array1.length) { // empty array1 if there are items left inside after combining.
            combined[combinedIndex] = array1[arr1Index];
            combinedIndex++;
            arr1Index++;
        }
        while (arr2Index < array2.length) { // empty array2 if there are items left inside after combining.
            combined[combinedIndex] = array2[arr2Index];
            combinedIndex++;
            arr2Index++;
        }
        return combined;
    }


} // merge sort
