package org.example.S13MergeSort;

import java.util.Arrays;

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

// Merge Sort
//    Recursively break the array apart into smaller arrays
//    1. Break arrays in half
//    2. Base case: when array.length is 1
//    3. Uses merge() to put arrays together.

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int midIndex = array.length/2; // If it is an odd number we would get a decimal, but because we use int -> everything to the right of the decimal place is dropped and we get a whole number.
//        calling mergeSort on each copy we make will continue to break the array until length = 1
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex)); // make a copy of all the items to the left of the midIndex (exclusive of midIndex)
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length)); // make copy of the right side of the array - including midIndex.
        return merge(left, right); // This combines these two arrays in a sorted way.
    }


} // merge sort
