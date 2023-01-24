package org.example.MonthPrepKit;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> int1 = Arrays.asList(11, 2, 4);
        List<Integer> int2 = Arrays.asList(4, 5, 6);
        List<Integer> int3 = Arrays.asList(10, 8, -12);
        List<List<Integer>> matrix = Arrays.asList(int1, int2, int3);
        //        WeekOne.plusMinus(integerList);
        //        WeekOne.miniMaxSum(integerList);
        //        WeekOne.lonelyInteger(integerList);
        //        WeekOne.flippingBits(2147);
        WeekOne.diagonalDifference(matrix);

    } // Main method
} // Main Class
