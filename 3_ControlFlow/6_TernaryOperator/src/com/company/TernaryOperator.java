package com.company;

public class TernaryOperator {

    public static void main(String[] args) {
	    int income = 120_000;
	    String className = income > 100_000 ? "First" : "Economy";
	    if(income > 100_000) {
	        className = "First";
        }
    }
}
