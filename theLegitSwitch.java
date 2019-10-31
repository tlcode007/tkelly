package com.edgetechHomeWork;

public class theLegitSwitch {
    //declaration
        //public function
    //static can call separate from class
    //float is the return type:type of data that is returned-below is the type (float)

    public static float shipping(float orderValue,
                                boolean saturdayDelivery,
                                String destination) {
        //ends the declaration

        //below begins to do the functions
        //I don't know why I need a float here? What is this statement saying?
        float deliveryCost;
        switch (destination) {

            case "US":
                deliveryCost = 20.0f;
                if (orderValue > 100.0f) {
                    deliveryCost -= 5.0f;
                    if (saturdayDelivery)
                        deliveryCost += 10.0f;
                }
                break;
            case "Mexico":
                deliveryCost = 32.0f;
                if (orderValue > 100.0f) {
                    deliveryCost -= 7.0f;
                    if (saturdayDelivery) ;
                    deliveryCost += 20.0f;
                }
                break;
            case "Canada":
                deliveryCost = 25.0f;
                if (orderValue > 100.0f) {
                    deliveryCost -= 7.0f;
                    if (saturdayDelivery) {
                        deliveryCost += 12.0f;
                    }
                }
                break;
            default:
                deliveryCost = 25.0f;
                if (orderValue > 100.0f) {
                    deliveryCost = 7.0f;
                    if (saturdayDelivery)
                        deliveryCost += 12.0f;
                }
        }

        return deliveryCost;
    }
    //function only returns one thing or a collection of things but it cannot be void
    public static void main(String[] args){
        //float orderValue, boolean saturdayDelivery, String destination)
        System.out.println(shipping (200.0f,true,"Canada"));
        System.out.println(shipping(100.0f, false, "Mexico"));
        System.out.println(shipping(50.0f, true, "US"));
        System.out.println(shipping (600.0f,false, "US"));
        System.out.println(shipping (100.0f,false, "Canada"));
//two functions: Shipping and the main
        //main is the starting point
        //within main you main you make call other functions.
        //functions can be public, static
        //(is the parameters of what you want it to do)
        //{return the value type}
      }
}