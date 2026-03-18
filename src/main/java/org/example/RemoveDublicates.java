package org.example;

import java.util.Arrays;

//14. Remove Duplicates (Conceptually)
//
//Given an array, print elements without duplicates.
public class RemoveDublicates {
    static int[] removeDublicates(int[] numbers){
        int[] noDublicates = new int[numbers.length];
        int check = numbers[0];
        noDublicates[0] = check;
        for (int i=0; i<numbers.length; i++){
            if (check != numbers[i]){
                check = numbers[i];
                noDublicates[i]= numbers[i];
            }
        }
        return  noDublicates;
    }
    public static void main(String[] args){

        System.out.println(Arrays.toString(removeDublicates(new int[]{1,1, 2, 3, 4, 5, 6, 7, 1})));
    }
}
