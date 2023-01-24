package org.example.prevAttempts;

import java.util.Collections;
import java.util.List;

//Given 5 + ints
//    find min and max values that be calculated by summing 4 of the 5 ints
public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
//       Need to find sum of all variations of 4 of the numbers.
//      then determine the smallest sum and the largest sum

//        Find the 4 smallest numbers in the set and sum them.
        Collections.sort(arr);
        long smallest = 0;
        long largest = 0;

        for (int i = 0; i < 4; i++) {
            smallest = smallest + arr.get(i);
        }
        for (int i = 4; i >= 1; i--) {
            largest = largest + arr.get(i);
        }
        System.out.println(smallest + " " + largest);


    }


}
