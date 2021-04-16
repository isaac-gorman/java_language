package com.company;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("3 FizzBuzz Number Evaluations");
	    for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i+1) + " entry: ");
            number = keyboard.nextInt();

            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println("Fizz");
            } else if (number % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }


        }
    }
}
