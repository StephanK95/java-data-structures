package com.sklamann;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors.toString());
        System.out.println(colors[0]);

        int[] numbers = {100, 200};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(i);
        }


        for (String color : colors) {
            System.out.println(colors);
        }

        Arrays.stream(colors).forEach(System.out::println);


    }
}
