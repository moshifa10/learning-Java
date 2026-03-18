package org.example;

import java.util.Scanner;

public class EmailDetector {

    public static void main(String[] args){

        //3. Email Detector
        //
        //Write a program that checks whether a string contains the character @.
        //If it does, print "Looks like an email", otherwise print "Invalid email format".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (email.contains("@")){
            System.out.println("Looks like an email");
        }
        else {
            System.out.println("Invalid email format");
        }
    }
}
