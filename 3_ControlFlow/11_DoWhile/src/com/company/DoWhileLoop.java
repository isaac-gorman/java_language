package com.company;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        String input = "";
        Scanner keyboard = new Scanner(System.in);

	    do {
            System.out.print("Input: ");
            input = keyboard.next();
            System.out.println(input);
        } while(!input.equals("quit"));
    }
}
