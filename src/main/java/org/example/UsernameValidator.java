package org.example;

public class UsernameValidator {

    public static void main(String[] args){

        //8. Username Validator
        //
        //Create a program that checks if a username contains spaces.
        //If it does, print "Invalid username".

        String username = "Njabulo ";
        String check = (username.contains(" "))? "Valid username" : "Invalid username";

        System.out.println(check);
    }
}
