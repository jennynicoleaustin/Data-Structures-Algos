package org.example.MonthPrepKit;

import java.util.*;

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

    //    Diagonal Difference
    //    1. Given a square matrix, calculate the absolute difference between the diagonals.
    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int lastDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
        }
        int lastIndex = arr.size() - 1;
        for (int j = 0; j < arr.size(); j++) {
            lastDiagonal += arr.get(j).get(lastIndex);
            lastIndex--;
        }
        int beforeAbs = (firstDiagonal - lastDiagonal);
        int result = Math.abs(beforeAbs);
        return result;
    }


    //    Counting Sort
    //    Given a list of integers count and return(as an arraylist) the number of times each value appears
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        // Give the array list a value of 0 at every index and a total size of 100.
        for (int i = 1; i <= 100; i++) {
            result.add(0);
        }
        for (int num : arr) {
            result.set(num, (result.get(num) + 1));
        }
        return result;
    }


    //    Pangrams
    //    Determine if a string is a pangram or not; return pangram or not pangram
    public static String pangrams(String s) {
        String lowerS = s.toLowerCase();
        if (lowerS.chars()
                .filter(i -> i >= 'a' && i <= 'z')
                .distinct().count() == 26) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

    //    Permuting Two Arrays
    // Given two arrays of integers, permute them so, A[i] + B[i] >= k is true for all i where 0<= i < n;
    //    return YES is a permutation for the elements exists.
    //    k = the number to compare the sum of A+B to
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B,Collections.reverseOrder());
        int n = A.size();
        ArrayList<Integer> sumAL = new ArrayList<>();

        for(int i=0;i<n;i++){
            sumAL.add(A.get(i)+B.get(i));
        }

        for(int element: sumAL){
            if(element<k){
                return "NO";
            }
        }
        return "YES";
    }

// Find number of ways the bar can be divided if l = m and sum of l # of ints = d.
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
//        m = the number of ints (length)
//        d = sum of those ints


        return count;
    }


} // Week One
