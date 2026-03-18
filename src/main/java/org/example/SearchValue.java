package org.example;

public class SearchValue {

    //11. Search Element
    //
    //Check if a specific number exists in an array.
    //If found, print "Found", otherwise "Not found".
    static  String search(int[] numbers, int target){
        int start = 0;
        for (int num: numbers){
            if(num == target){
                return "Found at pos: " + start ;
            }
            start++;
        }
        return "Not Found";

    }
    public static void main(String[] args){

        int[] numbers= {21,43, 65,765};

        System.out.println(search(numbers, 65));

    }
}
