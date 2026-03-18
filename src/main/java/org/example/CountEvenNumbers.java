package org.example;

public class CountEvenNumbers {

    public static void main(String[] args){

        //8. Count Even Numbers
        //
        //Count how many even numbers are in an array.

        int[] numbers = {2,1,65,90,100,4,43};

        int count = 0;

        for (int num: numbers){
            if (num%2==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
