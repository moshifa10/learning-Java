package org.example;

public class CaseChecker {
    public static boolean check(String name){
        // In this function I will be checking for every char and check if they are upper

        for (int i = 0; i < name.length(); i++){
            char check = name.charAt(i);
            if (!Character.isUpperCase(check)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        //6. Case Checker
        //
        //Write a program that checks if a string is completely uppercase.
        //If it is, print "All letters are uppercase".

        String name = "NJABS";


        if (check(name)){
            System.out.println("All letters are uppercase");
        }
        else {
            System.out.println("They are not all uppercase");
        }
    }
}
