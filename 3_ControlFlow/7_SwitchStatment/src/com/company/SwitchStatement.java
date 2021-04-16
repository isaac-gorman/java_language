package com.company;

public class SwitchStatement {

    public static void main(String[] args) {
	    String role = "admin";
	    switch (role) {
            case "admin":
                System.out.println("You're a Admin");
                break;
            case "moderator":
                System.out.println("You're a Moderator");
                break;

            default:
                System.out.println("You are a guest");
        }
    }
}
