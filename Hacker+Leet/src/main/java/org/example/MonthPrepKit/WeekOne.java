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
    public static int lonelyInteger(List<Integer> a) {
        int lonelyInteger = -1;
        //Count the number of times each item occurs in the array
        //        if the count = 1; then lonely int = that item.
        for (int number : a) {
            int count = 0;
            for (int i = 0; i < a.size(); i++) {
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

    //    Flipping Bits
    //    Given a long n; flip all its big 0->1 and 1->0 and return the result as an long
    public static long flippingBits(long n) {
        //        1. convert n to bit
        String bitN = Long.toBinaryString(n);
        //        Making sure its 32 bits
        String longEnough = String.format("%32s", bitN).replace(" ", "0");
        //        2. exchange 0s for 1s and 1s for 0s
        String aFor0 = longEnough.replace('0', 'a');
        String bfor1 = aFor0.replace('1', 'b'); // here a=0 and b=1
        String zerosFirst = bfor1.replace('a', '1'); // switch all the a(0) to 1
        String finalResult = zerosFirst.replace('b', '0'); // switch all the b(1) to 0
        //        3. convert result back to int
        long result = Long.parseLong(finalResult, 2);

        return result;
    }


} // Week One
