package com.edgetechHomeWork;

public class assignmentEight {
    public static void main(String[] args) {
       // int x, y, z;
       // x = 10; y = 0; z = 5;
       // z -= --x - y--;
       // System.out.printf ("X = %d Y = %d  Z = %d%n",   x, y,     z);
        //System.out.printf ("X = %d Y = %d  Z = %d%n", --x, y++, --z);
        //System.out.printf ("X = %d Y = %d  Z = %d%n",   x, y,     z);

        int i = 10;
        int n = ++i%5;
        System.out.println("i " + i + " n " + n);

//invert a boolean by using "!"

        //Below is a simple statement using the 'ternary' operator (Links to an external site.).
        // Come up with 2 examples of your own using the 'elvis' operator

        class PrePostDemo {
            public static void main(String[] args){
                int i = 3;
                i++;
                System.out.println(i);         // "4"
                ++i;
                System.out.println(i);         // "5"
                System.out.println(++i);       // "6"
                System.out.println(i++);       // "6"
                System.out.println(i);         // "7"
            }
        }
    }
}
