package org.example;

public class FindMax {

    public static void main(String[] args){

        //🟡 Intermediate Level
        //7. Find Maximum
        //
        //Given an array of integers, find and print the largest number.

        int[] numbers = {20,1000,43,3,324, 9999};
        int start = numbers[0];

        for (int num: numbers){
            if (start< num){
                start = num;
            }
        }
        System.out.println("Max value is " + start);
    }
}
