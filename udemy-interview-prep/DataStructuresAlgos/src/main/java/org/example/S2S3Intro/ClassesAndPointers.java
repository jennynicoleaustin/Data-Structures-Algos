package org.example.S2S3Intro;

import java.util.HashMap;

public class ClassesAndPointers {


    public class Cookie {
        private String color;

        public Cookie(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
    }

// Two instances of the cookie class
    Cookie cookieOne = new Cookie("green");
    Cookie cookieTwo = new Cookie("blue");


// Pointers

    int num1 = 11;
//    The case when NOT using a pointer
    int num2 = num1; // This is only at initializations -> we set num2 to the current value of num2, but if we change the value of num1 later num2 value will not change

    public static void main(String[] args) {
        // When using a pointer
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map2 = map1;

//        for MAPS both map1 and map2 POINT to the SAME hashmaps

    }
} // Classes & Pointers

