package org.example;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
//         return 0;
        int smallest = args[0];
        for (int i=0 ; i< args.length; i++){
            if (args[i] < smallest){
                smallest = args[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args){

        System.out.println(findSmallestInt(new int[]{2147483647, 2147483647}));
    }
}
