package org.example;

public class BigO {

    public static class On {
        // O(n)
        // - always a proportional on a graph
        public static void printItems(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
        }
        // For this example -- There are 10 ints, and we perform 10 operations.
        //    Thus, this is the worst case scenario 10 numbers and 10 operations
        public static void main(String [] args) {
            printItems(10);
        }
    } // O(n)

    public static class DropConstants {
// ways to simplify Big O
//        Both for loops will run n times

//  In this case n=10 but 20 operations are performed
        public static void printItems(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }

            for (int j = 0; j < n; j++) {
                System.out.println(j);
            }

        } // printItems

        public static void main(String [] args) {
            printItems(10);
        }

    }// Drop Constants

    public static class OnSquared {
//Nested loops are less efficient from a time complexity standpoint. On a graph the growth is much faster (exponential) rather than linear
// One for loop is inside the other for loop.
//        loops ran n * n (n^2)
//        with n = 10; we output 100 lines of code
        public static void printItems(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(i + " " + j);
                }
            }
        } // printItems
        public static void main(String [] args) {
            printItems(10);
        }
//    Each time you nest a for loop you are running the code n * #ofNesting.
//        No matter how many times you nest the loops it is still simplified to O(n^2)
    } // O(n^2)

//    Each time you nest a for loop you are running the code n * #ofNesting.

//    Drop Non-Dominants
public static class nonDominants {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int k = 0 ; k < n; k++) {
            System.out.println(k);
        }

    } // printItems
    public static void main(String [] args) {
        printItems(10);
    }

}// Non-dominants

} //BigO
