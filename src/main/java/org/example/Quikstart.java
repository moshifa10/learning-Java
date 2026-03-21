package org.example;

import java.util.Arrays;

public class Quikstart {

    //Write a program called QuickStats that takes a few numbers as command line arguments and outputs the following:
    //  the numbers input to the program
    //  how many numbers are in the list
    //  the sum of the numbers
    //  the average of the numbers.
    //Here is a sample output for input arguments 3 15 2 10 6 24.
    //[3, 15, 2, 10, 6, 24]
    //Count: 6
    //Total: 60
    //Average: 10

    public static void main(String[] args){
        int total = 0;
        if (args.length == 0){
            System.out.println("No parameters were detected please provide");
            return;
        }
        for (int i=0; i<args.length; i++){
            try{
                total += Integer.parseInt(args[i]);
            }catch (NumberFormatException e){
                System.out.println("Please provide real numbers");
                return;
            }
        }

        System.out.println("Count: "+ args.length);
        System.out.println("Total: " + total);
        int average = total / args.length;
        System.out.println("Average: " + average);

    }
}
