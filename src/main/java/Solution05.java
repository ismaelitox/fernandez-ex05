/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;
// class containing solution 05 code
public class Solution05 {
    // static scanner declared once to parse inputs
    static Scanner in = new Scanner(System.in);
    // main driver methods
    public static void main(String[] args){
        // initialize ints for math
        // find way to convert string to int value
        // avoid doing math in print statements
        //
        int numOne, numTwo;


        // print statements asking for user input
        // receiving user input for int values
        System.out.print("What is the first number?  ");
        numOne = in.nextInt();

        System.out.print("What is your second number?  ");
        numTwo = in.nextInt();

        // giant print statement with concat for output
        // could not find way to do without math in output
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo) + "\n"
               + numOne + " - " + numTwo + " = " + (numOne - numTwo) + "\n"
                + numOne + " * " + numTwo + " = " + (numOne * numTwo) + "\n" +
                + numOne + " / " + numTwo + " = " + (numOne / numTwo) );



    }

}

