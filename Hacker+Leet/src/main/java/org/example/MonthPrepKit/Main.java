package org.example.MonthPrepKit;

import org.example.otherPrep.JavaQuestions;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> int1 = Arrays.asList(11, 2, 4);
        List<Integer> int2 = Arrays.asList(4, 5, 6);
        List<Integer> int3 = Arrays.asList(10, 8, -12);
        List<Integer> ints = Arrays.asList(1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);

        List<List<Integer>> matrix = Arrays.asList(int1, int2, int3);
        //        WeekOne.plusMinus(integerList);
        //        WeekOne.miniMaxSum(integerList);
        //        WeekOne.lonelyInteger(integerList);
        //        WeekOne.flippingBits(2147);
        //        WeekOne.diagonalDifference(matrix);
//        WeekOne.countingSort(int1);
//        WeekOne.pangrams("The quick brown foxx jumps over the lazy dog");
//        JavaQuestions.fizzBuzz(ints);
        JavaQuestions.maxIndex(4, 5);


    } // Main method
} // Main Class
