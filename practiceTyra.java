package com.edgetechHomeWork;

import java.util.Arrays;
import java.util.List;

public class practiceTyra {
    public static void main(String[] args) {


        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 9;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        List<String> tnames = List.of("Zeke Yolla", "\nXerces Wally", "\nViola Urkel", "\nTerance ");
        System.out.println(tnames);

        List<String> tnumbers = List.of("234.12", "\n45", "\n66.45", "\n92.84", "\n54.92", "\n.4");
        System.out.println(tnumbers);

        double randomnumbers = Math.random();
        System.out.println(randomnumbers);
    }
}
