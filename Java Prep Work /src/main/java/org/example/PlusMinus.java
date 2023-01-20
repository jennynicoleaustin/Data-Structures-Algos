package org.example;

import java.util.List;

public class PlusMinus {
// Given an array of int, calculate the ratios of its elements that are +, -, & 0
//    print each on a new line to 6 places after the decimal


    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        int numNeg =0;
        int numZero =0;
        int numPos =0;
        System.out.println(size);

        for (int number: arr ) {
            if (number < 0) {
                numNeg = numNeg +1;
                System.out.println(numNeg);
            } else if (number == 0 ) {
                numZero = numZero +1;
            } else {
                numPos = numPos +1;
            }
        }
        double posRatio = (double)numPos/size;
        double negRatio = (double)numNeg/size;
        double zeroRatio = (double)numZero/size;

        System.out.printf("%.6f%n", negRatio);
        System.out.printf("%.6f%n", zeroRatio);
        System.out.printf("%.6f%n", posRatio);

    } // plus minus


}
