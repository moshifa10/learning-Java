package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
        // Length
        String name = "     Njabulo Moshifa";
        int length = name.length();
//        System.out.println(length);
        // CharAt
        char letter = name.charAt(0);
//        System.out.println(letter);

        // index
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");
        // System.out.println(lastIndex);

        // trim
        name = name.trim();
//        System.out.println(name);

        // Substring
        String email = "moshifanjabulo@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println(username);
        System.out.println(domain);
    }

}