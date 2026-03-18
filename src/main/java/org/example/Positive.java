package org.example;

public class Positive{

    public static int sum(int[] arr){
//     return 0;
        int save = 0;
        for (int i=0 ; i<arr.length; i++){

            if (arr[i]> -1){
                save += arr[i];
            }

        }
        return save;
    }

//    public static void main(String[] args){
//
//
//    }

}