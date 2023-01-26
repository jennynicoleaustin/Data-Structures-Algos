package org.example.otherPrep;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> int1 = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> int2 = Arrays.asList(1, 1, 1, 0, 0);
        List<Integer> int3 = Arrays.asList(1, 1, 1, 0, 0);
        List<Integer> int4 = Arrays.asList(1, 1, 1, 0, 0);
        List<Integer> int5 = Arrays.asList(1, 1, 1, 1, 1);

        List<List<Integer>> matrix = Arrays.asList(int1, int2, int3, int4, int5);

        ProductDefects.largestArea(matrix);

    }
}
