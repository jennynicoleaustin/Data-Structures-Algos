package org.example;

import java.util.Scanner;

import static org.example.LexiOrder.getSmallestAndLargest;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));    }
}