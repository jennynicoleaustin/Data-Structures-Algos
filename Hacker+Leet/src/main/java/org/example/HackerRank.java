package org.example;

import java.util.*;

public class HackerRank {

    //    s = time in 12 hour format '12:01:00PM'
    //    convert s to 24 hour format '12:01:00'
    public static String timeConversion(String s) {
        //        if s ends with PM  & not 12 -> add 12 hours
        //        if s ends with AM & not 12 -> report as is, if 12 -> 00:00

        String hourTime = s.substring(0, 2);
        String restTime = s.substring(2, 8);
        String aOrP = s.substring(8, 10);
        String time = "";

        if (hourTime.equals("12") && aOrP.equals("AM")) {
            hourTime = "00";
            time = hourTime + restTime;
            return time;
        } else if (aOrP.equals("PM") && !hourTime.equals("12")) {
            int newHour = Integer.parseInt(hourTime) + 12;
            hourTime = String.valueOf(newHour);
            time = hourTime + restTime;
        } else if (aOrP.equals("AM")) {
            time = hourTime + restTime;
        } else if (aOrP.equals("PM") && hourTime.equals("12")) {
            time = hourTime + restTime;
        }
        System.out.println(time);
        return time;
    }

    //Given a list of numbers with an odd number find the median.
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        int halfNoRemainder = size / 2;
        Collections.sort(arr);
        int median = arr.get(halfNoRemainder);
        System.out.println(median);
        return median;
    }

    //    Give an array of integers where all elements except one occur 2x -> isolate the element that only occurs once.
    public static int lonelyinteger(List<Integer> a) {
        // iterate through the array to count the number of times an element occurs
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(a.get(i))) {
                map.remove(a.get(i));
            } else {
                map.put(a.get(i), i);
            }
        }
        System.out.println(map);
        Set<Integer> ind = map.keySet();
        List<Integer> l = new ArrayList<Integer>(ind);

        return a.get(map.get(l.get(0)));
    }

    //  Given a square matrix calculate the absolute difference between the sums of its diagonals
    public static int diagonalDifference(List<List<Integer>> arr) {
        int result = 0;
//        List of lists...
        int numColumnsAndRows = arr.get(0).size();
//

        return result;
    }

} //Hacker Rank Close
