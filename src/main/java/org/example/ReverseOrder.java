package org.example;

public class ReverseOrder {

    //9. Reverse Array Print
    //
    //Print the elements of an array in reverse order.

    public static void main(String[] args){

        String[] names=  {"Njabs", "Busang", "Sthandwa"};
        String[] reverse = new String[names.length];
        int holder = 0;
        for(int i= names.length-1; i>-1; i--){
            reverse[holder] = names[i];
            holder++;
        }

        System.out.println(reverse[2]);
    }
}
