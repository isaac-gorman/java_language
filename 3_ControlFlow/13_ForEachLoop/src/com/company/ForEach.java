package com.company;

public class ForEach {

    public static void main(String[] args) {
	    String[] desserts = {"Chocolate Cake", "Ice Cream", "Cookies"};

	    for (int i = 0; i < desserts.length; i++) {
            System.out.println(desserts[i]);
        }

	    for (String dessert: desserts) {
            System.out.println(dessert);
        }
    }
}
