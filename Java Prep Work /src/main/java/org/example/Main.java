package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.PlusMinus.plusMinus;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(-1, 0, 0, 1, 2);

        plusMinus(integerList);
    }
}