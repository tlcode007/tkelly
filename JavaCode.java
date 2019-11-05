package com.edgetechHomeWork;

import java.sql.SQLOutput;

import static java.lang.System.*;

public class JavaCode {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            System.out.println(x);
                if (x % 2 == 0)
                    System.out.print("Fizz");
                else {
                    if (x % 4 == 0)
                        System.out.print("Buzz");

                }

            }
        }
    }

