package org.example;

import java.util.Scanner;

public class temperature {

    public static void main(String[] args){

        // convert temperature to Celsius or Fanfare

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature? ");
        double temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert  to Celsius or Fahrenheit? (C or F): ");
        String convert = scanner.next();

        double convention = (convert.equalsIgnoreCase("c"))? (temp - 32) * 5/9 :(temp * 5/9) + 32;

        System.out.printf("%.1fC\n", convention);

        scanner.close();
    }
}
