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

//    Drop Non-Dominants O (n^2 + n) n = non dominant term, as n gets larger the n because less relevant, and thus we drop the n
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

    public static class BigOofOne {
//        AKA Constant time - graphically = flat line on the bottom.
//        Most efficient
//        As n increases the number of operations does not change.

        public static int addItems (int n) {
            return n + n;
        }
    }

    public static class OofLogN {
// requires a sorted array
//       ex 2^3 = 8 -> log2 8 = 3
// Power of this method is when you are working with very large numbers.
//        graph = a very mild slope (very close to a flat line)
    }

//    O(nlog n) -> used in quick sort

// Different Terms for Inputs
//    Video 12 -> 0 (a + b)
//    if there are 2 parameters then it can not be simplified.

// Array Lists
//     differ from Arrays because they are dynamic and allow us to add new items.
    public static class arrayListsBigO {
// ADD OR REMOVE
//   add and remove to the end of a list are simple (time complex) a single operation -> O(1)
//    add or remove at a particular index is more complex -> You must change each item after the index in which you change. n = numberOfArrayListItems you had to change to perform action.

// FIND
//        searching for a particular number in an array of ints -> You must touch every item in the array until you find the item you're looking for -> O(n)
//          When searching by index -> you go directly to the index and so O(1)
    }

} //BigO
