package org.example;

import java.util.Scanner;

public class FileTypeChecker {

    public static void main(String[] args){

        // 5. File Type Checker
        //
        //Create a program that checks if a filename ends with .txt.
        //If yes, print "Text file detected".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a filename? ");
        String filename = scanner.nextLine();

        if(filename.endsWith(".txt")){
            System.out.printf("Filename: %s\n", filename);
            System.out.println("Text file detected");
        }
        else {
            System.out.println("Please provide a filename that ends with .txt");
        }
    }
}
