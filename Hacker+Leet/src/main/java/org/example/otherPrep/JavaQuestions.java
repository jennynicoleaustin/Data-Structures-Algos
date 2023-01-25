package org.example.otherPrep;

import java.util.List;

public class JavaQuestions {

    //
    public static void fizzBuzz(List<Integer> array) {
        for (int integer : array) {
            if (integer %3 == 0 && integer %5 == 0) {
                System.out.println("FizzBuzz");
            } else if (integer %3 == 0) {
                System.out.println("Fizz");
            } else if (integer %5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(integer);
            }
        }
    }

//    maximum index
//    array of int 0-> infinity
//    pointer can move either...
//      i+j or stay at i
//    i = 0 at initial
//    j = 1 at initial and ++ each step
//    there is one known index that must be avoided
//    determine the highest index that can be reached in a given number of steps
//    Given int steps: number of steps to take
//    and int bad index: number to avoid
//    return max index that can be reacher from index 0

//    start at i -> j --- i = (j+i)
//    or i and stay

    public static int maxIndex(int steps, int badIndex) {
        int maxIndex = 0;

        for (int i = 1; i <= steps; i++) {
            maxIndex += i;
        }
        // set a temp variable to maxindex
        int index = maxIndex;

        while (true) {
            while (index > 0 && steps > 0) {                index -= steps;
                if(index == badIndex) {
                    index+= steps;
                }
                steps --;
            }
            if(index <= 0) {
                return maxIndex;
            } else {
                index = maxIndex -1;
                maxIndex --;
                if(index == badIndex) {
                    index = maxIndex -1;
                    maxIndex --;
                }
            }
        }
    }
// professor name + associated course for all courses outside of their department

// SELECT NAME as 'professor.name' FROM PROFESSOR ,
//    NAME as 'course.name' FROM COURSE

} // JavaQuestions
