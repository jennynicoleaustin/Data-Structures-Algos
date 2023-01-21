package org.example;

import java.util.Collections;
import java.util.List;

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
        //    if itemA == itemB -> remove itemA and remove itemB

    return a.get(0);
    }

}
