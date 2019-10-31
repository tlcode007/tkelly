package com.edgetechHomeWork;

import dOW.substring;

import java.sql.SQLOutput;

public class daysOFWeek {
    private static Object String;

    public static void main(String[] args) {
        //String dOW = "new String[]{\"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\"};";
        //String[] dString = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        //Monday,mon.,MON
        //String ndOW = dOW.substring(0, 3).toLowerCase();
        //turn on the switch for the value
       // Switch(ndOW)
  //Let me try this again

String daysOfWeek = "MON";

        switch (daysOfWeek.toLowerCase().substring(0,3)){
    case "sun":
        System.out.println("Yes, today is Sunday");
        break;
    case  "mon":
        System.out.println("Yes, today is Monday");
        break;
    case "tue":
        System.out.println("Yes, today is Tuesday");
        break;
    case "wed":
        System.out.println("Yes, today is Wednesday");
        break;
    case "thu":
        System.out.println("Yes, today is Thursday");
        break;
    case "fri":
        System.out.println("Yes, today is Friday");
        break;
    case "sat":
        System.out.println("Yes, today is Saturday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}

    }


}
