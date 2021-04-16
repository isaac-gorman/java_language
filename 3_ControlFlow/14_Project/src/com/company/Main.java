package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1 - Define all the calculator variables
        int principalAmount, periodInYears;
        double interestRate;
        final byte MONTHS_PER_YEAR = 12;
        final byte PERCENTAGE = 100;
        String mortgageEstimate;

        // 2 - Declare the scanner class
        Scanner calculatorInput = new Scanner(System.in);

        // 3 - Prompt the user to enter in their mortgage variables
            System.out.print("Principal ($1K - $1M): ");
            principalAmount = calculatorInput.nextInt();
            while (principalAmount < 1_000 || principalAmount > 1_000_000) {
                System.out.print("Enter a number between 1,000 to 1,000,000");
                System.out.print("\nPrincipal ($1K - $1M): ");
                principalAmount = calculatorInput.nextInt();
            }


            System.out.print("Annual Interest Rate: ");
            interestRate = calculatorInput.nextDouble();
            System.out.println(interestRate);
            while(interestRate <= 0 || interestRate >= 30) {
                System.out.print("Please enter a number between 1 and 30");
                System.out.print("\nAnnual Interest Rate: ");
                interestRate = calculatorInput.nextDouble();
            }


        System.out.print("Period (Years): ");
        periodInYears = calculatorInput.nextInt();
        while(periodInYears <= 0 || periodInYears >= 30) {
            System.out.print("Please enter years between 1 and 30");
            System.out.print("\nPeriod (Years): ");
            periodInYears = calculatorInput.nextInt();
        }


        // 4 - Create the algorithm to be conducted on the inputs
        double interestRatePerYear = (interestRate / PERCENTAGE)/ MONTHS_PER_YEAR;
//        System.out.println("interestRatePerYear: " + interestRatePerYear);
        double baseToExponent = Math.pow((1 + (interestRatePerYear) ), MONTHS_PER_YEAR * periodInYears);
//        System.out.println("baseToExponent: " + baseToExponent);
        double result = (principalAmount * interestRatePerYear * baseToExponent) / (baseToExponent - 1);


        // 5 - Format result to currency to display to to user their mortgageEstimate
        mortgageEstimate = NumberFormat.getCurrencyInstance().format(result);

        // 6 - Print out to the user their mortgageEstimate
        System.out.println("Your estimated mortgage will be " + mortgageEstimate);


    }
}
