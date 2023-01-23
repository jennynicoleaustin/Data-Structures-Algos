package org.example.S10Recursion;

public class Factorial {

// Problem gets smaller
//    Base case (1!)

    public static int factorial(int n) { // n = the num you want the factorial of
        if (n == 1) return 1; // base case and an opportunity to break out
        return n * factorial(n - 1); // recursive call to the factorial method when n is now = to the original n -1 (the next number in the factorial
    }
}
