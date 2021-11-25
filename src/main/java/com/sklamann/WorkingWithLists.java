package com.sklamann;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main (String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {

        }

        //List extends Collection
        //Memory is not a

        List <String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );
        colorsUnmodifiable.add("pink");
    }
}
