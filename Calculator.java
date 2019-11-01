package com.edgetechHomeWork;

import java.util.Scanner;
//add the util scanner
public class Calculator {
    public static void main(String[] args) {
       //create  two integers
        int calNum =0;
        int calNum2=0;
        //declare an operator using char
        char operator;
        //Tyra, remember to create a double to output your answer.
        double answer = 0.0;
        //This is from the scanner import
        //just because...scanObject is a string so remember to add new on the other side
        Scanner scanObject =new Scanner (System.in);
        //System.out.println( "Please enter first number:");
        calNum =scanObject.nextInt();
       // System.out.println("Please enter second number");
        calNum2 =scanObject.nextInt();
        //System.out.println("What operation?");
        operator = scanObject.next().charAt(0);

        switch (operator) {
            case '+': answer = calNum + calNum2;
            break;
            case '-': answer= calNum - calNum2;
            break;
            case '*': answer = calNum * calNum2;
            break;
            case '/': answer = calNum/calNum2;
            break;
          }
        System.out.println(calNum+" "+operator+" "+calNum2+" =" +answer);
        }
    }

