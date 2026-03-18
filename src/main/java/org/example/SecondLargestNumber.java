package org.example;

public class SecondLargestNumber {

    // 🔴 Hard Level
    //13. Second Largest Number
    //
    //Find the second largest number in an array.

    static int findSecondLargestNumber(int[] numbers){
        int largest = numbers[0];

        for (int num: numbers){
            if (largest< num){
                largest = num;
            }
        }
        int secondLargest = numbers[0];

        for (int num: numbers){
            if (secondLargest < num && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){

        System.out.println(findSecondLargestNumber( new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
