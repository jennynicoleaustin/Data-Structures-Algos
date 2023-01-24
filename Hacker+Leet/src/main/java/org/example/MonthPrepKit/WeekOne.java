package org.example.MonthPrepKit;

import java.util.ArrayList;
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
    //    -> For each query string determine how many times it occurs in the list of input strings. return an array with the results.
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        //        Array list for results
        List<Integer> results = new ArrayList<>();
        //      for each query we will check to see it matches the value at each index of the list of strings; if it does increment the count; then when the loop is done add the count to the results array.
        for (String query : queries) {
            int count = 0; // initialize the count variable
            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).equals(query)) {
                    count++;
                }
            }
            results.add(count);
        }
        return results;
    }

    //    Lonely Integer
    //    1. Find the element (in an array of integers) that only occurs once.
    public static int lonelyinteger(List<Integer> a) {
        int lonelyInteger = -1;
        //Count the number of times each item occurs in the array
        //        if the count = 1; then lonely int = that item.
        for (int number : a) {
            int count = 0;
            for(int i = 0; i < a.size(); i++) {
                if (a.get(i) == number) {
                    count++;
                }
            }
            if (count == 1) {
                lonelyInteger = number;
            }
        }
        return lonelyInteger;
    }


} // Week One
