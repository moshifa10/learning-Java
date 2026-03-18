package org.example;

// 2. Even Numbers
//
//Print all even numbers between 1 and 20.

//5. Do-While Test
//
//Write a program that prints "Hello" at least once, even if the condition is false.
public class EvenNumbers {

    public static void main(String[] args){

        int i = 0;
        while (i<21){
            System.out.println(i);
            i+=2;
        }

        do {
            System.out.println("Hello");
        }while (i==0);


    }

}
