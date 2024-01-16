package com.cbfacademy.strings;
import java.util.Date;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
       String concat = word1 + word2 + word3;
       System.out.println(concat);
       
       
       //return concat;


    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
        boolean areEqual = word1.equals(word2);

        System.out.println(areEqual);

        //return areEqual;

    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
       String items = format ("item", 1 , 250.00 );

       System.out.println(items);
   // return items;    

    }
}
