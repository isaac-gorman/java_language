package com.company;

import java.util.Scanner;

public class BreakAndContinue {


    public static void main(String[] args) {
        String input = "";
        Scanner keyboard = new Scanner(System.in);

        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = keyboard.next();
            if(input.equals("pass")){
                continue;
            }
            if(input.equals("quit")){
                System.out.print("End of loop");
                break;
            }
            System.out.println(input);
        }
    }
}
