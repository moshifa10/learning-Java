package org.example;
import java.util.Scanner;

public class PasswordLengthValidator {

    public static void main(String[] args){

        /*
        2. Password Length Validator
            Create a program that checks if a password is at least 8 characters long.
            If it is, print "Valid password length", otherwise print "Password too short".
         */

        // Password length Validator
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String userPassword = scanner.nextLine();

        if (userPassword.length() >= 8){
            System.out.println("Valid password length");
        }
        else {
            System.out.println("Password too short");
        }
    }
}
