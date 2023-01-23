package org.example.InterviewQuestions;

import java.util.HashMap;

public class ItemsInCommon {
// Video 66: Hash Table Interview Questions

    //    Given two arrays determine if the two arrays have any items in common

// inefficient solution = nested for loop O(n^2)
    public static boolean itemInCommon (int[] array1, int[] array2) {
        for (int i : array1) { // for each integer in array1... where i = the value at each index
            for (int j: array2) { // loop through each integer value in the second array
                if (i == j) return true; // compare the two values to determine if they are equal, if so return true.
            }
        }
        return false;
    }

// Hash Table = more efficient O(n) -> because we only loop through each array 1x
//    1. loop through the first array and add the value of each item in an array as the key in a new hash map & the value for that key set to true
//    2. separate loop to go through the second array
//      -> Check to see if the value at index[i] of array2 is present inside the hashmap
//          -> if so have it return true.
    public static boolean betterItemInCommon (int[] array1, int[] array2) {
        HashMap<Integer, Boolean> array1HashMap = new HashMap<Integer, Boolean>();
        for (int i : array1) {
            array1HashMap.put(i, true); // value from array1 = key, true = value
        }
        for (int j : array2) {
            if(array1HashMap.get(j) != null) return true; // if not null then that means the value is present inside the hashmap we created.
        }
        return false; // if we loop through the whole array2 and do not find a match then return false (means there are no items in common_
    }

} // ItemsInCommon
