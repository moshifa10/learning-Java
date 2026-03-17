package org.example;

public class SubstringDetection {

    public static void main(String[] args){

        //9. Substring Detection
        //
        //Write a program that checks if a sentence contains the word "Java".
        //If it does, print "Programming language mentioned".

        String sentence = "Njabs";
        String check = sentence.contains("java")? "Programming language mentioned": "It doesn't contain any programming language";
        System.out.println(check);
    }
}

