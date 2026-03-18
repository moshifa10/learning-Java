package org.example;
import java.util.Scanner;

public class GreetingChecker {
    public static void main(String[] args){

        // Write a program that checks if a sentence starts with the word "Hello".
        // If it does, print "Greeting detected", otherwise print "No greeting".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a sentence? ");
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();

        if(sentence.startsWith("hello")){
            System.out.println("Greeting detected");
        }
        else {
            System.out.println("No greeting");
        }
    }
}
