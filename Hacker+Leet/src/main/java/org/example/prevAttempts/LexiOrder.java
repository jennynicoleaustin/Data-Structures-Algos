package org.example.prevAttempts;

import java.util.ArrayList;
import java.util.Comparator;

public class LexiOrder {


        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            ArrayList<String> kLengthSubstring = new ArrayList<String>();

            for (int i = 0; i< s.length(); i++ ) {
                String substring = s.substring(i, i+k);
                kLengthSubstring.add(substring);
            }
            int size = kLengthSubstring.size();
            kLengthSubstring.sort(Comparator.naturalOrder());

            smallest = kLengthSubstring.get(0);
            largest = kLengthSubstring.get((size-1));

            return smallest + "\n" + largest;
        }
}
