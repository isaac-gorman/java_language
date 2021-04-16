package com.company;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
	    int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number: ");
        number = keyboard.nextInt();

        // Input number
       if (number % 5 == 0 && number % 3 == 0) {
           System.out.println("FizzBuzz");
       } else if (number % 5 == 0) {
           System.out.println("Fizz");
       } else if (number % 3 == 0) {
           System.out.println("Buzz");
       } else {
           System.out.println(number);
       }
        // if number is divisible by 5 -> "Fizz"
        // if number is divisible by 3 -> "Buzz"
        // if number is divisible by 3 and 5 -> "FizzBuzz"
        // if number is not divisible by 3 or 5 -> number inputted
    }
}
