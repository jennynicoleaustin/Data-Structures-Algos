package org.example.MonthPrepKit;

import java.util.Comparator;
import java.util.List;

public class WeekOne {

    // 1. Calculate the ratios of the elements in an array of ints (positive, negative, zero)
    //    2. Print each on a new line to the 6th decimal place
    public static void plusMinus(List<Integer> arr) {
        int numOfInts = arr.size();
        int pos = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < numOfInts; i++) {
            if (arr.get(i) < 0) {
                neg++;
            } else if (arr.get(i) > 0) {
                pos++;
            } else {
                zero++;
            }
        }
        double posRatio = (double) pos / numOfInts;
        double zeroRatio = (double) zero / numOfInts;
        double negRatio = (double) neg / numOfInts;

        System.out.printf("%.6f%n", posRatio);
        System.out.printf("%.6f%n", negRatio);
        System.out.printf("%.6f%n", zeroRatio);
    } // plusMinus

    // MiniMaxSum
    //    1. Find the min and max calculated values possible from adding 4 numbers from a list of 5.
    public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        // -> Sort the list
        arr.sort(Comparator.naturalOrder());
        // -> sum of the first 4 nums = min value
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }
        // -> sum of the last five nums = max value
        for (int j = 1; j <= 4; j++) {
            maxSum += arr.get(j);
        }
//        -> print on single line seperated by a space
        System.out.println(minSum + " " + maxSum);
    }

//    Matching Strings
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

    }

} // Week One
