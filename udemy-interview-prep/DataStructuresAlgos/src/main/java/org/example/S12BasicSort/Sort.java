package org.example.S12BasicSort;

public class Sort {

// Sorts the original array in place withOUT making a copy of it.
    public static void bubbleSort (int[] array) {
        for (int i = (array.length - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) { // if the item on the left is greater than the item on the right then...
                    int temp = array[j]; // grab the bigger value and assign it to a temp variable
                    array[j] = array[j+1]; // set the value of the array at that index to be the smaller (right) value
                    array[j+1] = temp; // set the value on the left to the value that used to be on the right.
                }
            }
        }
    }

} // Sort
