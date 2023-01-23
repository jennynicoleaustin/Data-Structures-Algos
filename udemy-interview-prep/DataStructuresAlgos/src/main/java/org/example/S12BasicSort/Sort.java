package org.example.S12BasicSort;

public class Sort {

    // Sorts the original array in place withOUT making a copy of it.
    public static void bubbleSort(int[] array) {
        for (int i = (array.length - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) { // if the item on the left is greater than the item on the right then...
                    int temp = array[j]; // grab the bigger value and assign it to a temp variable
                    array[j] = array[j + 1]; // set the value of the array at that index to be the smaller (right) value
                    array[j + 1] = temp; // set the value on the left to the value that used to be on the right.
                }
            }
        }
    }


    // Selection Sort

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) { // start at the first index of the array, continue looping until you complete on the last index of the array.
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) { // start at i+1; continue till you get to the end of the array
                if (array[j] < array[minIndex]) { // if item at j is less than the item at minIndex, replace minIndex with the index of the smaller value
                    minIndex = j;
                }
            } // Below is the code to swap the items
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { // start with the second item in the array
            int temp = array[i]; // temp = the value you are starting with the value you are checking against values to the right of it.
            int j = i - 1;
            while (j > -1 && temp < array[j]) { // first check to make sure j is at least 0 then continue until you get to the end of the array
                array[j+1] = array[j]; // moves the value previously to the right onto the other side of the value we are checking.
                array[j] = temp;
                j--;
            }
        }
    }


} // Sort
