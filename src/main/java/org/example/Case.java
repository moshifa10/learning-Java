package org.example;

public class Case {

    public static void main(String[] args){

        // Case

        String day = "sdsa";
        day = day.toLowerCase();

        switch (day){
            // or use thi case "monday", "tuesday" ->
            case "monday" -> System.out.println("Its Monday");
            case  "tuesday" -> System.out.println("its Tuesday");
            case  "wednesday" -> System.out.println("its Wednesday");
            case "thursday" -> System.out.println("Thursday");
            case  "friday" -> System.out.println("Friday");
            default -> System.out.println(day + " It's not a day");
        }
    }
}
