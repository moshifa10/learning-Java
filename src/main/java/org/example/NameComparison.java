package org.example;

import java.util.Scanner;

public class NameComparison {

    public static void main(String[] args){

        // 4. Name Comparison
        //
        // Write a program that checks if a name entered by the user equals "Njabulo".
        // If it matches, print "Welcome Njabulo!", otherwise print "Access denied".
        String myName = "Njabs";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name? ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase(myName)){
            System.out.println("Welcome " + name);
        }

        else {
            System.out.println("Access denied");
        }
    }
}
