package com.company;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        boolean quit = false;

        Scanner keyboard = new Scanner(System.in);
        while(quit == false) {
            System.out.print("Please enter your first name: ");
            String firstName = keyboard.next();
            System.out.print("Please enter your last name: ");
            String lastName = keyboard.next();

            System.out.println(firstName + " " + lastName);

            System.out.print("Would you like to continue (yes/no): ");
            String answer = keyboard.next().toLowerCase();


            if(answer.equals("no")) {
                quit = true;
                System.out.println("Goodbye!\nThank you for using this program!");
            }
        }
    }
}
