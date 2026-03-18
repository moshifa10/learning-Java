package org.example;

import java.util.Scanner;

public class matrices {

    public static void main(String[] args){

        int rows ;
        int column;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter number of columns: ");
        column = scanner.nextInt();
        for (int i=0; i<=rows; i++){
            for (int j=0; j<=column; j++){
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
